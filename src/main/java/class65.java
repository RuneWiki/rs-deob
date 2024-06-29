import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class65 extends class113 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "J")
    private long field1023 = 0L;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "J")
    private long field1024 = 0L;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "J")
    private long field1025 = 0L;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    private int field1027 = 0;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[J")
    private long[] field1026 = new long[10];

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    private int field1028 = 1;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)J")
    public final long method62(byte arg0) {
        if (arg0 <= 99) {
            this.field1023 = 49L;
        }
        return this.field1024;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)I")
    public final int method63(int arg0, int arg1, byte arg2) {
        if (arg2 <= 77) {
            return 47;
        }
        long var4 = (long) arg0 * 1000000L;
        class122.method922((long) arg1, (byte) -105);
        this.field1024 += this.method513(10);
        if (this.field1024 < this.field1023) {
            class122.method922((this.field1023 - this.field1024) / 1000000L, (byte) -114);
            this.field1025 += this.field1023 - this.field1024;
            this.field1024 += this.field1023 - this.field1024;
            this.field1023 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field1023 += var4;
            var6++;
        } while (var6 < 10 && this.field1023 < this.field1024);
        if (this.field1024 > this.field1023) {
            this.field1023 = this.field1024;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)J")
    private final long method513(int arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 != 10) {
            return -101L;
        }
        long var4 = var2 - this.field1025;
        this.field1025 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1026[this.field1027] = var4;
            this.field1027 = (this.field1027 + 1) % 10;
            if (this.field1028 < 1) {
                this.field1028++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1028; var8++) {
            var6 += this.field1026[(this.field1027 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1028;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        if (arg0) {
            this.method62((byte) -76);
        }
        this.field1025 = 0L;
        if (this.field1023 > this.field1024) {
            this.field1024 += this.field1023 - this.field1024;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class65() {
        this.field1023 = this.field1024 = jagmisc.nanoTime();
        if (this.field1024 == 0L) {
            throw new RuntimeException();
        }
    }
}
