import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class126 extends class89 {

    @OriginalMember(owner = "client!op", name = "B", descriptor = "[I")
    private int[] field1682;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "[I")
    private int[] field1672;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "Lmm;")
    private class184 field1683;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "Lmm;")
    private class184 field1679;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "Lmm;")
    private class184 field1685;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "[Lmm;")
    private class184[] field1671;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "Lcq;")
    public static class328 field1675 = new class328("", 17);

    @OriginalMember(owner = "client!op", name = "D", descriptor = "Lkg;")
    public static class179 field1684 = new class179(4, 2);

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!op", name = "G", descriptor = "Lqn;")
    public static class47 field1687;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "[I")
    public static int[] field1686;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lga;IIDZBZLqn;)[I")
    public final int[] method882(class278 arg0, int arg1, int arg2, double arg3, boolean arg4, byte arg5, boolean arg6, class47 arg7) {
        class317.field4044 = arg0;
        field1680++;
        class505.field7280 = arg7;
        for (int var10 = 0; var10 < this.field1671.length; var10++) {
            this.field1671[var10].method816(arg2, arg1, -119);
        }
        if (arg5 < 68) {
            method888(-19, null, -72, 21, true, -12);
        }
        class371.method2113(-25529, arg3);
        class172.method1098(arg1, arg2, 108);
        int[] var11 = new int[arg1 * arg2];
        int var12;
        byte var13;
        int var14;
        if (arg6) {
            var12 = -1;
            var13 = -1;
            var14 = arg2 - 1;
        } else {
            var12 = arg2;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1679.field2406) {
                int[] var18 = this.field1679.method6(var16, 578);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1679.method13(var16, 1);
                var21 = var22[2];
                var20 = var22[1];
                var19 = var22[0];
            }
            if (arg4) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class79.field1022[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class79.field1022[var24];
                int var29 = class79.field1022[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg4) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1671.length; var17++) {
            this.field1671[var17].method549(-1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lqn;BLga;)Z")
    public final boolean method883(class47 arg0, byte arg1, class278 arg2) {
        field1677++;
        if (class533.field7843 < 0) {
            for (int var4 = 0; var4 < this.field1682.length; var4++) {
                if (!arg0.method486(false, this.field1682[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1682.length; var5++) {
                if (!arg0.method471(class533.field7843, (byte) -89, this.field1682[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1672.length; var6++) {
            if (!arg2.method1638(-24, this.field1672[var6])) {
                return false;
            }
        }
        int var7 = 118 % ((48 - arg1) / 59);
        return true;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILya;)V")
    public static final void method884(int arg0, class38 arg1) {
        field1678++;
        if (!(class2.field24 >= 2 || class211.field2717) || class233.field2985 != null) {
            return;
        }
        int var2 = -9 % ((arg0 - 41) / 45);
        String var3;
        if (class211.field2717 && class2.field24 < 2) {
            var3 = class516.field7480 + class340.field4271.method1936(-26539, class11.field177) + class446.field6389 + " ->";
        } else if (class56.field744 && class343.field4392.method834(false, 81) && class2.field24 > 2) {
            var3 = class216.method1331((class520) class201.field2616.field268.field5047.field5047, -19);
        } else {
            class520 var4 = (class520) class201.field2616.field268.field5047;
            var3 = class216.method1331(var4, -52);
            int[] var5 = null;
            if (class409.method2429(-122, var4.field7508)) {
                var5 = class376.field4949.method624((byte) -115, (int) var4.field7517).field104;
            } else if (var4.field7515 != -1) {
                var5 = class376.field4949.method624((byte) -127, var4.field7515).field104;
            } else if (class189.method1181(var4.field7508, 10916)) {
                class295 var6 = class187.field2446[(int) var4.field7517];
                if (var6 != null) {
                    class477 var7 = var6.field3773;
                    if (var7.field6922 != null) {
                        var7 = var7.method2903(-1, class491.field7160);
                    }
                    if (var7 != null) {
                        var5 = var7.field6923;
                    }
                }
            } else if (class490.method2973((byte) 0, var4.field7508)) {
                Object var8 = null;
                class102 var9;
                if (var4.field7508 == 1004) {
                    var9 = class315.field4017.method1958(-10091, (int) var4.field7517);
                } else {
                    var9 = class315.field4017.method1958(-10091, (int) (var4.field7517 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field1291 != null) {
                    var9 = var9.method761(97, class491.field7160);
                }
                if (var9 != null) {
                    var5 = var9.field1271;
                }
            }
            if (var5 != null) {
                var3 = var3 + class219.method1344((byte) 63, var5);
            }
        }
        if (class2.field24 > 2) {
            var3 = var3 + "<col=ffffff> / " + (class2.field24 - 2) + class428.field6076.method1936(-26539, class11.field177);
        }
        if (class168.field2162 != null) {
            class316 var11 = class168.field2162.method3115(arg1, -123);
            if (var11 == null) {
                var11 = class91.field1116;
            }
            var11.method1855(class347.field4459, class348.field4489, true, class168.field2162.field7637, class236.field3005, class101.field1219, class87.field1081, var3, class168.field2162.field7576, class451.field6518, class168.field2162.field7574, class466.field6719, class168.field2162.field7692, class168.field2162.field7699, class168.field2162.field7617);
            class501.method3018((byte) -122, class236.field3005[3], class236.field3005[0], class236.field3005[1], class236.field3005[2]);
        } else if (class344.field4404 != null && class530.field7803 == class123.field1653) {
            int var10 = class91.field1116.method1862(class347.field4459, 0, class87.field1081, class451.field6518, 16777215, class288.field3679 + 16, var3, class101.field1219, 0, class480.field7023 + 4);
            class501.method3018((byte) -121, 16, class480.field7023 + 4, class288.field3679, class274.field3437.method1757((byte) -128, var3) + var10);
            return;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZILqn;ILga;)[F")
    public final float[] method885(int arg0, boolean arg1, int arg2, class47 arg3, int arg4, class278 arg5) {
        field1673++;
        class317.field4044 = arg5;
        class505.field7280 = arg3;
        for (int var7 = 0; var7 < this.field1671.length; var7++) {
            this.field1671[var7].method816(arg4, arg0, arg2 - 767816334);
        }
        class172.method1098(arg0, arg4, arg2 - 767816310);
        float[] var8 = new float[arg0 * 4 * arg4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1679.field2406) {
                int[] var12 = this.field1679.method6(var10, 578);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field1679.method13(var10, arg2 ^ 0x2DC3F2E3);
                var13 = var16[0];
                var14 = var16[2];
                var15 = var16[1];
            }
            int[] var17;
            if (this.field1685.field2406) {
                var17 = this.field1685.method6(var10, 578);
            } else {
                var17 = this.field1685.method13(var10, 1)[0];
            }
            int[] var18;
            if (this.field1683.field2406) {
                var18 = this.field1683.method6(var10, 578);
            } else {
                var18 = this.field1683.method13(var10, 1)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        if (arg2 != 767816418) {
            this.method883(null, (byte) 64, null);
        }
        for (int var11 = 0; var11 < this.field1671.length; var11++) {
            this.field1671[var11].method549(-1);
        }
        return var8;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static void method886(int arg0) {
        field1675 = null;
        field1687 = null;
        field1686 = null;
        field1684 = null;
        if (arg0 != -1900) {
            method888(39, null, -108, -34, true, -80);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILga;IDLqn;ZI)[I")
    public final int[] method887(int arg0, class278 arg1, int arg2, double arg3, class47 arg4, boolean arg5, int arg6) {
        class505.field7280 = arg4;
        field1674++;
        class317.field4044 = arg1;
        for (int var9 = 0; var9 < this.field1671.length; var9++) {
            this.field1671[var9].method816(arg2, arg6, 56);
        }
        class371.method2113(-25529, arg3);
        class172.method1098(arg6, arg2, 102);
        int[] var10 = new int[arg2 * 4 * arg6];
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1679.field2406) {
                int[] var18 = this.field1679.method6(var12, 578);
                var16 = var18;
                var15 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field1679.method13(var12, 1);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            int[] var19;
            if (this.field1685.field2406) {
                var19 = this.field1685.method6(var12, 578);
            } else {
                var19 = this.field1685.method13(var12, 1)[0];
            }
            if (arg5) {
                var11 = var12;
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class79.field1022[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class79.field1022[var22];
                int var26 = class79.field1022[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var27 << 24) + (var24 << 16) - (-(var25 << 8) + -var26);
                if (arg5) {
                    var11 += arg2 - 1;
                }
            }
        }
        if (arg0 <= 121) {
            return null;
        } else {
            for (int var13 = 0; var13 < this.field1671.length; var13++) {
                this.field1671[var13].method549(-1);
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I[Lhd;IIZI)V")
    public static final void method888(int arg0, class523[] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1681++;
        for (int var6 = arg3; var6 < arg1.length; var6++) {
            class523 var7 = arg1[var6];
            if (var7 != null && var7.field7673 == arg5) {
                class92.method718(arg2, -102, var7, arg4, arg0);
                class161.method1037(arg0, var7, 441050190, arg2);
                if ((var7.field7644 - var7.field7617) < var7.field7636) {
                    var7.field7636 = var7.field7644 - var7.field7617;
                }
                if (var7.field7659 > var7.field7585 - var7.field7574) {
                    var7.field7659 = var7.field7585 - var7.field7574;
                }
                if (var7.field7636 < 0) {
                    var7.field7636 = 0;
                }
                if (var7.field7659 < 0) {
                    var7.field7659 = 0;
                }
                if (var7.field7632 == 0) {
                    class319.method1881(var7, arg3 ^ 0x6A, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
    public class126() {
        this.field1682 = new int[0];
        this.field1672 = new int[0];
        this.field1683 = new class157(0);
        this.field1683.field2408 = 1;
        this.field1679 = new class157();
        this.field1679.field2408 = 1;
        this.field1685 = new class157();
        this.field1685.field2408 = 1;
        this.field1671 = new class184[] { this.field1679, this.field1685, this.field1683 };
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lfh;)V")
    public class126(class463 arg0) {
        int var2 = arg0.method2737(false);
        int var3 = 0;
        int var4 = 0;
        this.field1671 = new class184[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class184 var16 = class357.method2047(0, arg0);
            if (var16.method548((byte) -102) >= 0) {
                var3++;
            }
            if (var16.method814(true) >= 0) {
                var4++;
            }
            int var17 = var16.field2407.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2737(false);
            }
            this.field1671[var6] = var16;
        }
        this.field1682 = new int[var3];
        int var7 = 0;
        this.field1672 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class184 var11 = this.field1671[var9];
            int var12 = var11.field2407.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2407[var13] = this.field1671[var5[var9][var13]];
            }
            int var14 = var11.method548((byte) -69);
            int var15 = var11.method814(true);
            if (var14 > 0) {
                this.field1682[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1672[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1679 = this.field1671[arg0.method2737(false)];
        this.field1685 = this.field1671[arg0.method2737(false)];
        Object var10 = null;
        this.field1683 = this.field1671[arg0.method2737(false)];
    }
}
