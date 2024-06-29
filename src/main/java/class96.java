import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class96 extends class113 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "J")
    private long field1555 = 0L;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "J")
    private long field1556 = 0L;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    private int field1558 = 1;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "J")
    private long field1557 = 0L;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    private int field1559 = 0;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[J")
    private long[] field1560 = new long[10];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIB)I")
    public final int method63(int arg0, int arg1, byte arg2) {
        long var4 = (long) arg0 * 1000000L;
        if (arg2 < 77) {
            this.method752(true);
        }
        class122.method922((long) arg1, (byte) -98);
        this.field1555 += this.method752(true);
        if (this.field1555 < this.field1556) {
            class122.method922((this.field1556 - this.field1555) / 1000000L, (byte) -97);
            this.field1557 += this.field1556 - this.field1555;
            this.field1555 += this.field1556 - this.field1555;
            this.field1556 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field1556 += var4;
        } while (var6 < 10 && this.field1556 < this.field1555);
        if (this.field1556 < this.field1555) {
            this.field1556 = this.field1555;
        }
        return var6;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)J")
    private final long method752(boolean arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1557;
        this.field1557 = var2;
        long var6 = 0L;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1560[this.field1559] = var4;
            if (this.field1558 < 1) {
                this.field1558++;
            }
            this.field1559 = (this.field1559 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field1558; var8++) {
            var6 += this.field1560[(this.field1559 + 10 - var8) % 10];
        }
        if (!arg0) {
            this.method62((byte) -12);
        }
        return var6 / (long) this.field1558;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)J")
    public final long method62(byte arg0) {
        if (arg0 < 99) {
            this.method62((byte) 0);
        }
        return this.field1555;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        if (!arg0) {
            if (this.field1555 < this.field1556) {
                this.field1555 += this.field1556 - this.field1555;
            }
            this.field1557 = 0L;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class96() {
        this.field1555 = System.nanoTime();
        this.field1556 = System.nanoTime();
    }
}
