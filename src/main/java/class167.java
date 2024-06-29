import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class167 extends class386 {

    @OriginalMember(owner = "client!qga", name = "C", descriptor = "Z")
    private boolean field2042 = true;

    @OriginalMember(owner = "client!qga", name = "I", descriptor = "I")
    private int field2048 = 4096;

    @OriginalMember(owner = "client!qga", name = "D", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!qga", name = "E", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!qga", name = "F", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!qga", name = "H", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!qga", name = "G", descriptor = "[I")
    public static int[] field2046;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "(B)V")
    public static void method1056(byte arg0) {
        int var1 = 6 % ((39 - arg0) / 48);
        field2046 = null;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2044;
        if (class62.method607((byte) -106, arg7)) {
            if (class362.field4821[arg7] != null) {
                class160.method1017(arg2, arg5, 15, arg0, arg1, class362.field4821[arg7], arg8, arg3, -1, arg4);
            } else {
                class160.method1017(arg2, arg5, 15, arg0, arg1, class516.field7555[arg7], arg8, arg3, -1, arg4);
            }
            if (arg6 >= -125) {
                field2046 = null;
            }
        } else if (arg0 != -1) {
            class89.field1253[arg0] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class89.field1253[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field2043;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field2042 = ~arg2.method2229(255) == -2;
            }
        } else {
            this.field2048 = arg2.method2260(-37);
        }
        if (arg1 < 111) {
            this.field2048 = 14;
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "()V")
    public class167() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)[[I")
    public final int[][] method645(int arg0, int arg1) {
        ++field2047;
        int[][] var3 = super.field5148.method1054(arg0, arg1 ^ 16258);
        if (super.field5148.field2041) {
            int[] var4 = this.method2212((byte) -115, arg0 + -1 & class206.field2474, 0);
            int[] var5 = this.method2212((byte) -83, arg0, 0);
            int[] var6 = this.method2212((byte) -17, class206.field2474 & arg0 + 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class599.field8643; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2048;
                int var12 = (var5[var10 + 1 & class276.field3782] + -var5[var10 + -1 & class276.field3782]) * this.field2048;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = 16777216 / var17;
                    var18 = var12 / var17;
                    var20 = var11 / var17;
                }
                if (this.field2042) {
                    var20 = 2048 - -(var20 >> 1);
                    var18 = 2048 - -(var18 >> 1);
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return arg1 != 3 ? null : var3;
    }
}
