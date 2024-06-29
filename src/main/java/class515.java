import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class515 extends class184 {

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    private int field7467 = 1;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    private int field7472 = 1;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "[Lmb;")
    public static class173[] field7462 = new class173[4];

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "Ljk;")
    public static class449 field7469 = new class449(4);

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "Lcq;")
    public static class328 field7470 = new class328("", 11);

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public static final void method3074(int arg0) {
        ++field7463;
        if (arg0 <= -127) {
            class390.field5231.method2642(0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public static void method3075(byte arg0) {
        field7469 = null;
        int var1 = -88 / ((53 - arg0) / 57);
        field7470 = null;
        field7462 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[[I")
    public final int[][] method13(int arg0, int arg1) {
        ++field7468;
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (super.field2416.field7271) {
            int var4 = this.field7467 - (-this.field7467 - 1);
            int var5 = 65536 / var4;
            int var6 = this.field7472 - -1 + this.field7472;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field7467 + arg0; this.field7467 + arg0 >= var9; ++var9) {
                int[][] var19 = this.method1163(1, var9 & class501.field7240, 0);
                int[][] var20 = new int[3][class245.field3167];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field7472; ~var27 >= ~this.field7472; ++var27) {
                    int var37 = class421.field5961 & var27;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class245.field3167) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class421.field5961 & -this.field7472 + var31;
                    int var33 = var22 - var25[var32];
                    ++var31;
                    int var34 = var23 - var26[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = this.field7472 + var31 & class421.field5961;
                    var21 = var24[var36] + var35;
                    var22 = var25[var36] + var33;
                    var23 = var26[var36] + var34;
                }
                var8[this.field7467 + var9 + -arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class245.field3167 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
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
        if (arg1 != 1) {
            field7470 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class515() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field7471;
        int var4 = -52 % ((-13 - arg0) / 51);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field2406 = arg2.method2737(false) == 1;
                }
            } else {
                this.field7467 = arg2.method2737(false);
            }
        } else {
            this.field7472 = arg2.method2737(false);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field7464;
        if (arg1 != 578) {
            this.field7467 = -79;
        }
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (super.field2409.field436) {
            int var4 = this.field7467 + this.field7467 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field7472 + this.field7472 - -1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field7467 + arg0; ~var9 >= ~(this.field7467 + arg0); ++var9) {
                int[] var13 = this.method1159(96, var9 & class501.field7240, 0);
                int[] var14 = new int[class245.field3167];
                int var15 = 0;
                for (int var16 = -this.field7472; var16 <= this.field7472; ++var16) {
                    var15 += var13[class421.field5961 & var16];
                }
                int var17 = 0;
                while (~class245.field3167 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field7472 + var17 & class421.field5961];
                    ++var17;
                    var15 = var13[this.field7472 + var17 & class421.field5961] + var18;
                }
                var8[-arg0 + var9 - -this.field7467] = var14;
            }
            for (int var10 = 0; var10 < class245.field3167; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IBI)V")
    public static final void method3076(String arg0, String arg1, String arg2, int arg3, String arg4, int arg5, byte arg6, int arg7) {
        for (int var8 = 99; var8 > 0; --var8) {
            class410.field5855[var8] = class410.field5855[var8 + -1];
            class26.field381[var8] = class26.field381[var8 - 1];
            class111.field1501[var8] = class111.field1501[var8 + -1];
            class391.field5253[var8] = class391.field5253[var8 + -1];
            class374.field4839[var8] = class374.field4839[var8 + -1];
            class256.field3264[var8] = class256.field3264[var8 - 1];
            class117.field1581[var8] = class117.field1581[var8 + -1];
        }
        if (arg6 >= -33) {
            method3076((String) null, (String) null, (String) null, -45, (String) null, 48, (byte) -128, 46);
        }
        ++field7465;
        class410.field5855[0] = arg7;
        class26.field381[0] = arg5;
        class111.field1501[0] = arg1;
        class391.field5253[0] = arg2;
        class374.field4839[0] = arg4;
        class256.field3264[0] = arg0;
        class117.field1581[0] = arg3;
        ++class428.field6074;
        class218.field2785 = class160.field2037;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public static final void method3077(byte arg0) {
        ++field7466;
        if (arg0 == -53) {
            class155.field1965.method2686((byte) 123);
            class176.field2324 = 1;
            class534.field7859 = null;
        }
    }
}
