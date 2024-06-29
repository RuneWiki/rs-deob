import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class55 extends class264 {

    @OriginalMember(owner = "client!pj", name = "mb", descriptor = "I")
    private int field861 = 4;

    @OriginalMember(owner = "client!pj", name = "nb", descriptor = "I")
    private int field862 = 4;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "Lma;")
    public static class5 field854 = class12.method119("http:)4)4", (byte) 74);

    @OriginalMember(owner = "client!pj", name = "hb", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!pj", name = "ib", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!pj", name = "kb", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!pj", name = "lb", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!pj", name = "ob", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!pj", name = "pb", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "[Lrj;")
    public static class237[] field855;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(BI)V", line = 6)
    public static final void method419(byte arg0, int arg1) {
        class14.field269 = arg1;
        int var2 = -17 / ((-arg0 - 82) / 34);
        class171.field2634 = -1;
        field860++;
        class171.field2634 = -1;
        class113.method747((byte) -57);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILii;)V", line = 28)
    public final void method4(int arg0, int arg1, class221 arg2) {
        field859++;
        if (arg1 > -27) {
            return;
        }
        if (arg0 == 0) {
            this.field861 = arg2.method1509(true);
        } else if (arg0 == 1) {
            this.field862 = arg2.method1509(true);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(BI)[[I", line = 76)
    public final int[][] method138(byte arg0, int arg1) {
        int var3 = -39 % ((arg0 + 43) / 55);
        field858++;
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506) {
            int var5 = class119.field1807 / this.field862;
            int var6 = class226.field3716 / this.field861;
            int[][] var7;
            if (var5 <= 0) {
                var7 = this.method1817(-93, 0, 0);
            } else {
                int var8 = arg1 % var5;
                var7 = this.method1817(-113, 0, class119.field1807 * var8 / var5);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[2];
            int[] var14 = var4[1];
            for (int var15 = 0; var15 < class226.field3716; var15++) {
                int var17;
                if (var6 > 0) {
                    int var16 = var15 % var6;
                    var17 = class226.field3716 * var16 / var6;
                } else {
                    var17 = 0;
                }
                var12[var15] = var9[var17];
                var14[var15] = var10[var17];
                var13[var15] = var11[var17];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lnl;IIIIIIZ)V", line = 143)
    public static final void method420(class220 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3559.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field3559[var9] - class211.field3365;
            int var11 = arg0.field3575[var9] - class67.field1038;
            int var12 = arg0.field3571[var9] - class57.field898;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field3570 != null) {
                class220.field3558[var9] = var13;
                class220.field3557[var9] = var16;
                class220.field3572[var9] = var17;
            }
            class220.field3573[var9] = (var13 << 9) / var17 + class229.field3792;
            class220.field3576[var9] = (var16 << 9) / var17 + class229.field3803;
        }
        class229.field3799 = 0;
        int var19 = arg0.field3563.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field3563[var20];
            int var22 = arg0.field3566[var20];
            int var23 = arg0.field3574[var20];
            int var24 = class220.field3573[var21];
            int var25 = class220.field3573[var22];
            int var26 = class220.field3573[var23];
            int var27 = class220.field3576[var21];
            int var28 = class220.field3576[var22];
            int var29 = class220.field3576[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0 && class101.field1516 && class239.method1687(class229.field3792 + class201.field3188, class241.field4020 + class229.field3803, var27, var28, var29, var24, var25, var26)) {
                class242.field4026 = arg5;
                class182.field2772 = arg6;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 247)
    public class55() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V", line = 234)
    public static final void method421(byte arg0) {
        if (arg0 != 59) {
            method420((class220) null, -82, 21, 119, 39, -6, 125, true);
        }
        field863++;
        class99.field1478.method522(97);
        class166.field2528.method522(99);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)[I", line = 258)
    public final int[] method5(int arg0, int arg1) {
        int[] var3 = this.field4501.method1176(arg1, 125);
        field857++;
        if (arg0 > -58) {
            this.field861 = 67;
        }
        if (this.field4501.field2741) {
            int var4 = class226.field3716 / this.field861;
            int var5 = class119.field1807 / this.field862;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1815(0, 0, 53);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1815(0, class119.field1807 * var7 / var5, -92);
            }
            for (int var8 = 0; var8 < class226.field3716; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class226.field3716 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V", line = 307)
    public static void method422(int arg0) {
        field854 = null;
        field855 = null;
        if (arg0 != 0) {
            method420((class220) null, 75, 77, -101, 21, -11, 95, true);
        }
    }
}
