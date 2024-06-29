import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class106 extends class333 {

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "J")
    private long field1435 = 0L;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "J")
    private long field1436 = 0L;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "[J")
    private long[] field1437 = new long[10];

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    private int field1438 = 0;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    private int field1439 = 1;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "J")
    private long field1440 = 0L;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)J", line = 5)
    private final long method702(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1440;
        this.field1440 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1437[this.field1438] = var4;
            this.field1438 = (this.field1438 + 1) % 10;
            if (this.field1439 < 1) {
                this.field1439++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1439; var8++) {
            var6 += this.field1437[(this.field1438 + 10 - var8) % 10];
        }
        int var9 = -92 % ((arg0 + 57) / 39);
        return var6 / (long) this.field1439;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V", line = 37)
    public final void method300(int arg0) {
        if (arg0 == 10240) {
            this.field1440 = 0L;
            if (this.field1436 > this.field1435) {
                this.field1435 += this.field1436 - this.field1435;
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)J", line = 51)
    public final long method301(int arg0) {
        return arg0 == -1 ? this.field1435 : 113L;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZ)I", line = 62)
    public final int method299(int arg0, boolean arg1) {
        this.field1435 += this.method702((byte) 114);
        if (!arg1) {
            return -58;
        }
        long var3 = (long) arg0 * 1000000L;
        if (this.field1436 > this.field1435) {
            class463.method2773((this.field1436 - this.field1435) / 1000000L, 103);
            this.field1440 += this.field1436 - this.field1435;
            this.field1435 += this.field1436 - this.field1435;
            this.field1436 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field1436 += var3;
            var5++;
        } while (var5 < 10 && this.field1435 > this.field1436);
        if (this.field1436 < this.field1435) {
            this.field1436 = this.field1435;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V", line = 102)
    public class106() {
        this.field1435 = System.nanoTime();
        this.field1436 = System.nanoTime();
    }
}
