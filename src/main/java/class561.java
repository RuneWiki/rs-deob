import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class561 extends class335 {

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
    private int field7667 = 1;

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
    private int field7671 = 1;

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field4537 = ~arg1.method930(255) == -2;
                }
            } else {
                this.field7667 = arg1.method930(255);
            }
        } else {
            this.field7671 = arg1.method930(arg2 + 321);
        }
        ++field7669;
        if (arg2 != -66) {
            this.method3(false, 39);
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
    public class561() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILr;I)Laga;")
    public static final class658 method3115(int arg0, class562 arg1, int arg2) {
        ++field7670;
        if (arg2 != 7713) {
            return null;
        } else {
            class633 var3 = class468.method2607(arg0, 10735, true, arg1);
            return var3 == null ? null : var3.field8761;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        ++field7665;
        if (arg1) {
            return null;
        } else {
            int[][] var3 = super.field4527.method669(arg0, (byte) 2);
            if (super.field4527.field1468) {
                int var4 = this.field7667 + 1 + this.field7667;
                int var5 = 65536 / var4;
                int var6 = this.field7671 + 1 + this.field7671;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field7667 + arg0; ~(arg0 - -this.field7667) <= ~var9; ++var9) {
                    int[][] var19 = this.method1968(class326.field4386 & var9, 3, 0);
                    int[][] var20 = new int[3][class649.field8968];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field7671; var27 <= this.field7671; ++var27) {
                        int var37 = class29.field413 & var27;
                        var23 += var26[var37];
                        var22 += var25[var37];
                        var21 += var24[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (~var31 > ~class649.field8968) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class29.field413 & var31 - this.field7671;
                        int var33 = var21 - var24[var32];
                        ++var31;
                        int var34 = var22 - var25[var32];
                        int var35 = var23 - var26[var32];
                        int var36 = this.field7671 + var31 & class29.field413;
                        var22 = var25[var36] + var34;
                        var21 = var24[var36] + var33;
                        var23 = var26[var36] + var35;
                    }
                    var8[-arg0 + var9 + this.field7667] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; var13 < class649.field8968; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var17 < var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var16 += var18[2][var13];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILio;)Ljava/lang/String;")
    public static final String method3116(int arg0, int arg1, class157 arg2) {
        ++field7666;
        try {
            int var3 = arg2.method964(arg1 ^ 122);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field2219 += class267.field3489.method3307(arg1, var4, var3, arg2.field2199, arg2.field2219, (byte) 93);
            return class651.method3648(var4, var3, 0, (byte) -115);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        if (!arg0) {
            method3115(75, (class562) null, 97);
        }
        ++field7668;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int var4 = this.field7667 + this.field7667 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field7671 + 1 + this.field7671;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field7667 + arg1; ~(this.field7667 + arg1) <= ~var9; ++var9) {
                int[] var13 = this.method1969(0, class326.field4386 & var9, -47);
                int[] var14 = new int[class649.field8968];
                int var15 = 0;
                for (int var16 = -this.field7671; var16 <= this.field7671; ++var16) {
                    var15 += var13[class29.field413 & var16];
                }
                int var17 = 0;
                while (var17 < class649.field8968) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field7671 + var17 & class29.field413];
                    ++var17;
                    var15 = var13[this.field7671 + var17 & class29.field413] + var18;
                }
                var8[this.field7667 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; var10 < class649.field8968; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }
}
