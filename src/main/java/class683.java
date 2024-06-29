import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class683 extends class325 {

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    private int field9614 = 2048;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    private int field9616 = 3072;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    private int field9617 = 1024;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Lmt;")
    public static class419 field9612 = new class419(7, 0, 1, 1);

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field9619 = 0;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 4)
    public static void method3801(int arg0) {
        field9612 = null;
        if (arg0 != -11451) {
            method3801(-92);
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 16)
    public class683() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 19)
    public final void method101(boolean arg0) {
        this.field9614 = -this.field9617 + this.field9616;
        if (!arg0) {
            this.method95((class376) null, -112, (byte) -64);
        }
        ++field9620;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(JJ)J", line = 32)
    public static long method3802(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)[[I", line = 50)
    public final int[][] method360(int arg0, byte arg1) {
        if (arg1 != -9) {
            return null;
        } else {
            ++field9622;
            int[][] var3 = super.field4733.method1251((byte) 117, arg0);
            if (super.field4733.field2369) {
                int[][] var4 = this.method2063(0, arg1 ^ -10, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class261.field3874; ++var11) {
                    var8[var11] = (var5[var11] * this.field9614 >> 12) + this.field9617;
                    var9[var11] = (var6[var11] * this.field9614 >> 12) + this.field9617;
                    var10[var11] = (var7[var11] * this.field9614 >> 12) + this.field9617;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljp;IB)V", line = 97)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        ++field9618;
        if (arg2 < -41) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        super.field4738 = ~arg0.method2398(-1372747256) == -2;
                    }
                } else {
                    this.field9616 = arg0.method2359(-1);
                }
            } else {
                this.field9617 = arg0.method2359(-1);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)[I", line = 142)
    public final int[] method100(byte arg0, int arg1) {
        ++field9623;
        if (arg0 < 21) {
            return null;
        } else {
            int[] var3 = super.field4727.method2603(arg1, -13476);
            if (super.field4727.field6067) {
                int[] var4 = this.method2062(arg1, 0, (byte) 33);
                for (int var5 = 0; var5 < class261.field3874; ++var5) {
                    var3[var5] = this.field9617 - -(var4[var5] * this.field9614 >> 12);
                }
            }
            return var3;
        }
    }
}
