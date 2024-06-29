import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class269 extends class325 {

    @OriginalMember(owner = "client!fga", name = "C", descriptor = "I")
    private int field3959 = 1;

    @OriginalMember(owner = "client!fga", name = "P", descriptor = "I")
    private int field3970 = 1;

    @OriginalMember(owner = "client!fga", name = "D", descriptor = "[Z")
    public static boolean[] field3960 = new boolean[8];

    @OriginalMember(owner = "client!fga", name = "O", descriptor = "Z")
    public static volatile boolean field3969 = true;

    @OriginalMember(owner = "client!fga", name = "E", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!fga", name = "F", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!fga", name = "G", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!fga", name = "I", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!fga", name = "J", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!fga", name = "L", descriptor = "Lw;")
    public static class317 field3966;

    @OriginalMember(owner = "client!fga", name = "N", descriptor = "Lvv;")
    public static class345 field3968;

    @OriginalMember(owner = "client!fga", name = "M", descriptor = "Z")
    public static boolean field3967;

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
    public static void method1752(int arg0) {
        field3960 = null;
        field3966 = null;
        if (arg0 != 5680) {
            method1753(60, -1, -116, (class280) null, (class280) null);
        }
        field3968 = null;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        ++field3963;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            int var4 = this.field3970 + 1 + this.field3970;
            int var5 = 65536 / var4;
            int var6 = this.field3959 + 1 + this.field3959;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field3970; this.field3970 + arg1 >= var9; ++var9) {
                int[] var13 = this.method2062(class566.field7574 & var9, 0, (byte) 33);
                int[] var14 = new int[class261.field3874];
                int var15 = 0;
                for (int var16 = -this.field3959; ~this.field3959 <= ~var16; ++var16) {
                    var15 += var13[var16 & class625.field8423];
                }
                int var17 = 0;
                while (var17 < class261.field3874) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class625.field8423 & var17 - this.field3959];
                    ++var17;
                    var15 = var13[class625.field8423 & var17 - -this.field3959] + var18;
                }
                var8[-arg1 + this.field3970 + var9] = var14;
            }
            for (int var10 = 0; ~var10 > ~class261.field3874; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return arg0 <= 21 ? null : var3;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IB)[[I")
    public final int[][] method360(int arg0, byte arg1) {
        if (arg1 != -9) {
            this.method100((byte) 114, 36);
        }
        ++field3965;
        int[][] var3 = super.field4733.method1251((byte) 74, arg0);
        if (super.field4733.field2369) {
            int var4 = this.field3970 + this.field3970 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field3959 + this.field3959 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field3970 + arg0; ~var9 >= ~(this.field3970 + arg0); ++var9) {
                int[][] var19 = this.method2063(0, arg1 + 10, class566.field7574 & var9);
                int[][] var20 = new int[3][class261.field3874];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field3959; ~var27 >= ~this.field3959; ++var27) {
                    int var37 = class625.field8423 & var27;
                    var21 += var24[var37];
                    var22 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class261.field3874) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class625.field8423 & var31 - this.field3959;
                    ++var31;
                    int var33 = var23 - var26[var32];
                    int var34 = var21 - var24[var32];
                    int var35 = var22 - var25[var32];
                    int var36 = class625.field8423 & this.field3959 + var31;
                    var21 = var24[var36] + var34;
                    var22 = var25[var36] + var35;
                    var23 = var26[var36] + var33;
                }
                var8[this.field3970 + var9 - arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class261.field3874; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljp;IB)V")
    public final void method95(class376 arg0, int arg1, byte arg2) {
        ++field3964;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field4738 = arg0.method2398(-1372747256) == 1;
                }
            } else {
                this.field3970 = arg0.method2398(-1372747256);
            }
        } else {
            this.field3959 = arg0.method2398(-1372747256);
        }
        if (arg2 > -41) {
            this.method95((class376) null, -45, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIILcl;Lcl;)V")
    public static final void method1753(int arg0, int arg1, int arg2, class280 arg3, class280 arg4) {
        class243 var5 = class501.method2895(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field3277 = arg3;
            var5.field3274 = arg4;
            int var6 = class538.field7317 == class528.field7227 ? 1 : 0;
            if (arg3.method19(-105)) {
                if (arg3.method21(0)) {
                    arg3.field2252 = class563.field7549[var6];
                    class563.field7549[var6] = arg3;
                } else {
                    arg3.field2252 = class308.field4450[var6];
                    class308.field4450[var6] = arg3;
                    class768.field10591 = true;
                }
            } else {
                arg3.field2252 = class503.field6961[var6];
                class503.field6961[var6] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method19(-122)) {
                    if (arg4.method21(0)) {
                        arg4.field2252 = class563.field7549[var6];
                        class563.field7549[var6] = arg4;
                        return;
                    }
                    arg4.field2252 = class308.field4450[var6];
                    class308.field4450[var6] = arg4;
                    class768.field10591 = true;
                    return;
                }
                arg4.field2252 = class503.field6961[var6];
                class503.field6961[var6] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)V")
    public static final void method1754(int arg0, int arg1) {
        ++field3961;
        class16 var2 = class94.method753(14, 13175, (long) arg0);
        var2.method118(585134072);
        if (arg1 != 12691) {
            field3960 = null;
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V")
    public class269() {
        super(1, false);
    }
}
