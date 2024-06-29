import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class599 extends class543 {

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    private int field8112 = 0;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "J")
    private long field8110 = 0L;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    private int field8113 = 1;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "J")
    private long field8111 = 0L;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "J")
    private long field8115 = 0L;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "[J")
    private long[] field8114 = new long[10];

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public final void method2448(int arg0) {
        this.field8115 = 0L;
        if (this.field8111 < this.field8110) {
            this.field8111 += this.field8110 - this.field8111;
        }
        if (arg0 <= 66) {
            this.field8112 = 59;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)J")
    public final long method2445(boolean arg0) {
        this.field8111 += this.method3424(119);
        if (arg0) {
            return this.field8110 > this.field8111 ? (this.field8110 - this.field8111) / 1000000L : 0L;
        } else {
            return -48L;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IJ)I")
    public final int method2446(int arg0, long arg1) {
        if (arg0 != 23122) {
            this.field8111 = 5L;
        }
        if (this.field8110 > this.field8111) {
            this.field8115 += this.field8110 - this.field8111;
            this.field8111 += this.field8110 - this.field8111;
            this.field8110 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field8110 += arg1;
            var4++;
        } while (var4 < 10 && this.field8110 < this.field8111);
        if (this.field8110 < this.field8111) {
            this.field8110 = this.field8111;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)J")
    public final long method2444(int arg0) {
        if (arg0 >= -45) {
            this.field8112 = -124;
        }
        return this.field8111;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)J")
    private final long method3424(int arg0) {
        long var2 = class97.method664((byte) -50) * 1000000L;
        long var4 = var2 - this.field8115;
        int var6 = 14 % ((39 - arg0) / 61);
        this.field8115 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field8114[this.field8112] = var4;
            if (this.field8113 < 10) {
                this.field8113++;
            }
            this.field8112 = (this.field8112 + 1) % 10;
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field8113; var9++) {
            var7 += this.field8114[(this.field8112 + 10 - var9) % 10];
        }
        return var7 / (long) this.field8113;
    }
}
