import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class287 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[I")
    private int[] field4764;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "[I")
    private int[] field4774;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lpa;")
    private class152 field4775;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lpa;")
    private class152 field4763;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[Lpa;")
    private class152[] field4767;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lce;")
    public static class126 field4765 = class206.method1445(-7923, "classement ");

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lce;")
    public static class126 field4766 = class206.method1445(-7923, "leuchten2:");

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field4776 = 3;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "[I")
    public static int[] field4777 = new int[99];

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field4773 = -2;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIILte;III)V", line = 20)
    public static final void method1908(int arg0, int arg1, int arg2, int arg3, int arg4, class265 arg5, int arg6, int arg7, int arg8) {
        field4778++;
        int var9 = arg1 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg5.field4474;
            var11 = arg5.field4452;
        } else {
            var10 = arg5.field4452;
            var11 = arg5.field4474;
        }
        int var12;
        int var13;
        if ((arg6 + var11) <= 104) {
            var12 = (var11 >> 1) + arg6;
            var13 = (var11 + 1 >> 1) + arg6;
        } else {
            var12 = arg6;
            var13 = arg6 + 1;
        }
        int var14;
        int var15;
        if (arg2 + var10 > 104) {
            var14 = arg2 + 1;
            var15 = arg2;
        } else {
            var14 = (var10 + 1 >> 1) + arg2;
            var15 = (var10 >> 1) + arg2;
        }
        int var16 = (arg6 << 7) + (var11 << 6);
        int var17 = (arg2 << 7) + (var10 << 6);
        int[][] var18 = class264.field4396[arg8];
        int var19 = var18[var12][var15] + var18[var13][var14] - (-var18[var12][var14] - var18[var13][var15]) >> 2;
        int var20 = 0;
        if (arg8 != 0) {
            int[][] var21 = class264.field4396[0];
            var20 = var19 - (var21[var12][var14] + var21[var13][var14] + var21[var12][var15] + var21[var13][var15] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg8 < arg4) {
            var22 = class264.field4396[arg8 + 1];
        }
        class21 var23 = arg5.method1785(arg1, var19, false, var16, 103, var18, arg7, var22, var17, true, (class2) null);
        class66.method491(var23.field279, var16 - arg3, var20, var17 - arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 94)
    public static final void method1909(boolean arg0) {
        class24.field351 = null;
        if (!arg0) {
            class149.method1116();
            field4772++;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V", line = 108)
    public static final void method1910(int arg0, int arg1, int arg2) {
        if (arg1 != -9554) {
            return;
        }
        field4770++;
        class138.field2462[arg0] = arg2;
        class44 var3 = (class44) class265.field4471.method1631(false, (long) arg0);
        if (var3 == null) {
            class44 var4 = new class44(class261.method1765(16299) + 500L);
            class265.field4471.method1636(11311, var4, (long) arg0);
        } else {
            var3.field688 = class261.method1765(16299) + 500L;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4777[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 145)
    public static void method1911(int arg0) {
        field4777 = null;
        field4765 = null;
        field4766 = null;
        if (arg0 != 7922) {
            method1911(-75);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZDLhm;Lcc;IB)[B", line = 168)
    public final byte[] method1912(int arg0, boolean arg1, double arg2, class86 arg3, class313 arg4, int arg5, byte arg6) {
        class4.method27(125, arg2);
        field4768++;
        class47.field721 = arg3;
        byte[] var9 = new byte[arg0 * arg5 * 4];
        class220.field3709 = arg4;
        class320.method2228(arg0, arg5, -61);
        for (int var10 = 0; var10 < this.field4767.length; var10++) {
            this.field4767[var10].method1135((byte) -56, arg0, arg5);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field4775.field2781) {
                int[] var13 = this.field4775.method6(true, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field4775.method26(0, var12);
                var15 = var17[2];
                var16 = var17[1];
                var14 = var17[0];
            }
            int[] var18;
            if (this.field4763.field2781) {
                var18 = this.field4763.method6(true, var12);
            } else {
                var18 = this.field4763.method26(0, var12)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var16[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = class238.field4017[var21];
                int var23 = class238.field4017[var20];
                int var24 = var15[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class238.field4017[var24];
                int var26;
                if (var23 == 0 && var22 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var22;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var26;
                if (arg1) {
                    var11 += (arg5 << 2) - 4;
                }
            }
        }
        if (arg6 != 78) {
            field4777 = (int[]) null;
        }
        for (int var27 = 0; var27 < this.field4767.length; var27++) {
            this.field4767[var27].method544(0);
        }
        return var9;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lcc;Lhm;Z)Z", line = 301)
    public final boolean method1913(class313 arg0, class86 arg1, boolean arg2) {
        field4771++;
        if (class289.field4799 <= 0) {
            for (int var4 = 0; var4 < this.field4774.length; var4++) {
                if (!arg0.method2166(-28257, this.field4774[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4774.length; var5++) {
                if (!arg0.method2175(class289.field4799, -103, this.field4774[var5])) {
                    return false;
                }
            }
        }
        if (arg2) {
            return true;
        }
        for (int var6 = 0; var6 < this.field4764.length; var6++) {
            if (!arg1.method607(this.field4764[var6], (byte) -69)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 354)
    public class287() {
        this.field4764 = new int[0];
        this.field4774 = new int[0];
        this.field4775 = new class226();
        this.field4775.field2771 = 1;
        this.field4763 = new class226();
        this.field4763.field2771 = 1;
        this.field4767 = new class152[] { this.field4775, this.field4763 };
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(DZZLcc;IIILhm;)[I", line = 374)
    public final int[] method1914(double arg0, boolean arg1, boolean arg2, class313 arg3, int arg4, int arg5, int arg6, class86 arg7) {
        field4769++;
        class4.method27(126, arg0);
        class220.field3709 = arg3;
        class47.field721 = arg7;
        if (arg5 >= -68) {
            this.field4767 = (class152[]) null;
        }
        class320.method2228(arg4, arg6, -120);
        for (int var10 = 0; var10 < this.field4767.length; var10++) {
            this.field4767[var10].method1135((byte) -56, arg4, arg6);
        }
        int[] var11 = new int[arg4 * arg6];
        byte var12;
        int var13;
        int var14;
        if (arg1) {
            var12 = -1;
            var13 = arg6 - 1;
            var14 = -1;
        } else {
            var12 = 1;
            var14 = arg6;
            var13 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field4775.field2781) {
                int[] var21 = this.field4775.method6(true, var16);
                var20 = var21;
                var18 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field4775.method26(0, var16);
                var18 = var17[1];
                var19 = var17[2];
                var20 = var17[0];
            }
            for (int var22 = var13; var22 != var14; var22 += var12) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class238.field4017[var23];
                int var25 = var19[var22] >> 4;
                int var26 = var18[var22] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class238.field4017[var26];
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class238.field4017[var25];
                var11[var15++] = (var24 << 16) + (var27 << 8) + var28;
                if (arg2) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field4767.length; var29++) {
            this.field4767[var29].method544(0);
        }
        return var11;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lbb;)V", line = 529)
    public class287(class134 arg0) {
        int var2 = arg0.method948(-128);
        int var3 = 0;
        int var4 = 0;
        this.field4767 = new class152[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class152 var7 = class193.method1368(false, arg0);
            if (var7.method1127(-1) >= 0) {
                var3++;
            }
            if (var7.method547(87) >= 0) {
                var4++;
            }
            int var8 = var7.field2791.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method948(-128);
            }
            this.field4767[var6] = var7;
        }
        this.field4774 = new int[var3];
        this.field4764 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class152 var13 = this.field4767[var12];
            int var14 = var13.field2791.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field2791[var15] = this.field4767[var5[var12][var15]];
            }
            int var16 = var13.method1127(-1);
            int var17 = var13.method547(75);
            if (var16 > 0) {
                this.field4774[var10++] = var16;
            }
            if (var17 > 0) {
                this.field4764[var11++] = var17;
            }
            var5[var12] = null;
        }
        this.field4775 = this.field4767[arg0.method948(-124)];
        int[][] var18 = (int[][]) null;
        this.field4763 = this.field4767[arg0.method948(-128)];
    }
}
