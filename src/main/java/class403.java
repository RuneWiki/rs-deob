import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class403 extends class440 {

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    private int field5913 = 4096;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    private int field5916 = 4096;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    private int field5911 = 4096;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[[I")
    public final int[][] method763(int arg0, int arg1) {
        ++field5914;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (arg0 != -5766) {
            return null;
        } else {
            if (super.field6417.field9606) {
                int[][] var4 = this.method2606(arg1, 0, -1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class549.field7715 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (var12 == var13 && ~var13 == ~var14) {
                        var8[var11] = this.field5913 * var12 >> 12;
                        var9[var11] = this.field5911 * var13 >> 12;
                        var10[var11] = this.field5916 * var14 >> 12;
                    } else {
                        var8[var11] = this.field5913;
                        var9[var11] = this.field5911;
                        var10[var11] = this.field5916;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILr;IBII)V")
    public static final void method2455(int arg0, class166 arg1, int arg2, byte arg3, int arg4, int arg5) {
        arg1.method168(arg4, arg5, arg4 - -arg0, arg2 + arg5);
        ++field5912;
        arg1.method1150(arg0, arg5, arg4, -1, -16777216, arg2);
        if (~class658.field9235 <= -101) {
            float var6 = (float) class25.field360 / (float) class25.field359;
            int var7 = arg0;
            int var8 = arg2;
            if (!(var6 < 1.0F)) {
                var7 = (int) ((float) arg2 / var6);
            } else {
                var8 = (int) ((float) arg0 * var6);
            }
            int var9 = (-var8 + arg2) / 2 + arg5;
            int var10 = (-var7 + arg0) / 2 + arg4;
            if (class425.field6167 == null || ~arg0 != ~class425.field6167.method927() || arg2 != class425.field6167.method939()) {
                class25.method302(class25.field365, class25.field366 + class25.field360, class25.field365 - -class25.field359, class25.field366, var10, var9, var7 + var10, var9 - -var8);
                class25.method307(arg1);
                class425.field6167 = arg1.method136(var10, var9, var7, var8, false);
            }
            class425.field6167.method3916(var10, var9);
            int var11 = class540.field7557 * var7 / class25.field359;
            int var12 = class47.field728 * var8 / class25.field360;
            int var13 = class232.field3616 * var7 / class25.field359 + var10;
            int var14 = -(class199.field2820 * var8 / class25.field360) + var9 - var12 + var8;
            if (arg3 != -92) {
                method2455(64, (class166) null, 5, (byte) -92, -88, -32);
            }
            int var15 = -1996554240;
            if (class673.field9519 == class586.field8208) {
                var15 = -1996488705;
            }
            arg1.method114(var13, var14, var11, var12, var15, 1);
            arg1.method219(var13, var14, var11, var12, var15, 0);
            if (class14.field132 > 0) {
                int var16;
                if (~class394.field5835 < -51) {
                    var16 = (-class394.field5835 + 100) * 5;
                } else {
                    var16 = class394.field5835 * 5;
                }
                for (class627 var17 = (class627) class25.field346.method472((byte) -126); var17 != null; var17 = (class627) class25.field346.method482(-50)) {
                    class588 var18 = class25.field339.method812((byte) -81, var17.field8781);
                    if (class103.method829(20, var18)) {
                        if (class511.field7190 == var17.field8781) {
                            int var19 = var17.field8782 * var7 / class25.field359 + var10;
                            int var20 = var9 - -((-var17.field8777 + class25.field360) * var8 / class25.field360);
                            arg1.method1150(4, var20 + -2, var19 + -2, -1, 16776960 | var16 << 24, 4);
                        } else if (~class444.field6469 != 0 && class444.field6469 == var18.field8246) {
                            int var21 = var17.field8782 * var7 / class25.field359 + var10;
                            int var22 = var9 - -((class25.field360 - var17.field8777) * var8 / class25.field360);
                            arg1.method1150(4, var22 - 2, var21 + -2, arg3 + 91, var16 << 24 | 16776960, 4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field5916 = arg1.method3847((byte) 118);
                }
            } else {
                this.field5911 = arg1.method3847((byte) 118);
            }
        } else {
            this.field5913 = arg1.method3847((byte) 118);
        }
        if (arg0 != 5) {
            method2455(-28, (class166) null, 33, (byte) 95, -16, 1);
        }
        ++field5915;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class403() {
        super(1, false);
    }
}
