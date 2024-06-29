import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class251 {

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "[I")
    private int[] field4224;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "[I")
    private int[] field4210;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lil;")
    private class53 field4216;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lil;")
    private class53 field4212;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "[Lil;")
    private class53[] field4223;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lwa;")
    public static class75 field4211 = class66.method560(" weitere Optionen", false);

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lwa;")
    private static class75 field4219 = class66.method560("Starting 3d library", false);

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lwa;")
    public static class75 field4213 = field4219;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I", line = 5)
    public static final int method1803(int arg0, int arg1) {
        field4218++;
        return arg1 < 51 ? -49 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method1804(boolean arg0) {
        field4221++;
        if (arg0) {
            method1804(true);
        }
        int var1 = class176.field2954.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class176.field2954[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class103.field1741; var4++) {
                    if (class288.field4952[var2] == class155.field2655[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class155.field2655[class103.field1741] = class288.field4952[var2];
                    var3 = class103.field1741++;
                }
                class60 var5 = new class60(class176.field2954[var2]);
                int var6 = 0;
                while (class176.field2954[var2].length > var5.field1012 && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method485((byte) -2);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 14;
                    int var11 = (class288.field4952[var2] & 0xFF) * 64 + var9 - class175.field2939;
                    int var12 = (var8 & 0x1F96) >> 7;
                    int var13 = (class288.field4952[var2] >> 8) * 64 + var12 - class275.field4737;
                    class229 var14 = class182.method1343(var5.method485((byte) -2), (byte) 62);
                    if (class35.field521[var7] == null && (var14.field3853 & 0x1) > 0 && class76.field1319 == var10 && var13 >= 0 && var14.field3854 + var13 < 104 && var11 >= 0 && var14.field3854 + var11 < 104) {
                        class35.field521[var7] = new class295();
                        class295 var15 = class35.field521[var7];
                        class132.field2281[class121.field2031++] = var7;
                        var15.field3271 = class143.field2463;
                        var15.field5070 = var14;
                        var15.method1454(var15.field5070.field3854, (byte) -123);
                        var15.field3209 = var15.field5070.field3850;
                        var15.field3219 = var15.field5070.field3840;
                        var15.field3269 = var15.field5070.field3849;
                        var15.field3257 = var15.field5070.field3895;
                        var15.field3229 = var15.field5070.field3885;
                        var15.field3227 = var15.field5070.field3884;
                        var15.field3232 = var15.field5070.field3882;
                        var15.field3228 = var15.field5070.field3846;
                        if (var15.field3219 == 0) {
                            var15.field3274 = 0;
                        }
                        var15.method1457(var15.method739(0), var11, -94, var13, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIIZLc;ZDLcb;)[I", line = 116)
    public final int[] method1805(boolean arg0, int arg1, int arg2, boolean arg3, class289 arg4, boolean arg5, double arg6, class267 arg7) {
        class60.method496(-40, arg6);
        field4215++;
        class206.field3487 = arg7;
        int[] var10 = new int[arg1 * arg2];
        class133.field2300 = arg4;
        class145.method1113(-127, arg1, arg2);
        if (!arg0) {
            this.field4216 = (class53) null;
        }
        for (int var11 = 0; var11 < this.field4223.length; var11++) {
            this.field4223[var11].method385(arg2, 105, arg1);
        }
        int var12 = 0;
        byte var13;
        int var14;
        int var15;
        if (arg5) {
            var13 = -1;
            var15 = -1;
            var14 = arg2 - 1;
        } else {
            var13 = 1;
            var14 = 0;
            var15 = arg2;
        }
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg3) {
                var12 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field4216.field880) {
                int[] var17 = this.field4216.method59(-15196, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field4216.method66(var16, 127);
                var19 = var21[1];
                var18 = var21[0];
                var20 = var21[2];
            }
            for (int var22 = var14; var22 != var15; var22 += var13) {
                int var23 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var19[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = var20[var22] >> 4;
                int var26 = class157.field2696[var23];
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class157.field2696[var24];
                int var28 = class157.field2696[var25];
                var10[var12++] = (var26 << 16) + (var27 << 8) + var28;
                if (arg3) {
                    var12 += arg2 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field4223.length; var29++) {
            this.field4223[var29].method305(3);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILc;Lcb;)Z", line = 254)
    public final boolean method1806(int arg0, class289 arg1, class267 arg2) {
        field4214++;
        for (int var4 = 0; var4 < this.field4224.length; var4++) {
            if (!arg2.method1908(this.field4224[var4], (byte) -18)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field4210.length; var5++) {
            if (!arg1.method1068(this.field4210[var5], 0)) {
                return false;
            }
        }
        if (arg0 != 5251) {
            method1810(false, (class267) null, (class267) null, (class267) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lcb;Lcb;Lcb;Lcb;I)V", line = 295)
    public static final void method1807(class267 arg0, class267 arg1, class267 arg2, class267 arg3, int arg4) {
        field4222++;
        class198.field3331 = arg0;
        class116.field1969 = arg2;
        class130.field2248 = arg1;
        class223.field3793 = arg3;
        class249.field4198 = new class262[class198.field3331.method1912((byte) 87)][];
        int var5 = -75 / ((50 - arg4) / 44);
        class218.field3721 = new boolean[class198.field3331.method1912((byte) 87)];
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 327)
    public static void method1808(int arg0) {
        field4213 = null;
        int var1 = 10 / ((arg0 - 26) / 51);
        field4211 = null;
        field4219 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lcb;DBZILc;I)[B", line = 345)
    public final byte[] method1809(class267 arg0, double arg1, byte arg2, boolean arg3, int arg4, class289 arg5, int arg6) {
        if (arg2 != -29) {
            field4219 = (class75) null;
        }
        field4220++;
        class60.method496(arg2 ^ 0x5A, arg1);
        class206.field3487 = arg0;
        class133.field2300 = arg5;
        class145.method1113(-127, arg4, arg6);
        byte[] var9 = new byte[arg4 * arg6 * 4];
        for (int var10 = 0; var10 < this.field4223.length; var10++) {
            this.field4223[var10].method385(arg6, 121, arg4);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            if (arg3) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field4216.field880) {
                int[] var17 = this.field4216.method59(-15196, var12);
                var16 = var17;
                var15 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field4216.method66(var12, arg2 - 29);
                var14 = var13[1];
                var15 = var13[0];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field4212.field880) {
                var18 = this.field4212.method59(arg2 - 15167, var12);
            } else {
                var18 = this.field4212.method66(var12, -101)[0];
            }
            for (int var19 = arg6 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                int var21 = var14[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var16[var19] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var23 = class157.field2696[var20];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class157.field2696[var22];
                int var25 = class157.field2696[var21];
                int var26;
                if (var23 == 0 && var25 == 0 && var24 == 0) {
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
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var26;
                if (arg3) {
                    var11 += (arg6 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field4223.length; var27++) {
            this.field4223[var27].method305(3);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLcb;Lcb;Lcb;)V", line = 487)
    public static final void method1810(boolean arg0, class267 arg1, class267 arg2, class267 arg3) {
        field4217++;
        class233.field3949 = arg2;
        class185.field3071 = arg3;
        class282.field4865 = arg1;
        if (arg0) {
            method1807((class267) null, (class267) null, (class267) null, (class267) null, 3);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 514)
    public class251() {
        this.field4224 = new int[0];
        this.field4210 = new int[0];
        this.field4216 = new class269();
        this.field4216.field886 = 1;
        this.field4212 = new class269();
        this.field4223 = new class53[] { this.field4216, this.field4212 };
        this.field4212.field886 = 1;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lja;)V", line = 527)
    public class251(class60 arg0) {
        int var2 = arg0.method501(0);
        this.field4223 = new class53[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class53 var7 = class164.method1229(0, arg0);
            if (var7.method304(-19606) >= 0) {
                var3++;
            }
            if (var7.method387(-1) >= 0) {
                var4++;
            }
            int var8 = var7.field876.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method501(0);
            }
            this.field4223[var6] = var7;
        }
        this.field4210 = new int[var4];
        int var10 = 0;
        this.field4224 = new int[var3];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class53 var13 = this.field4223[var12];
            int var14 = var13.field876.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field876[var15] = this.field4223[var5[var12][var15]];
            }
            int var16 = var13.method304(-19606);
            int var17 = var13.method387(-1);
            if (var16 > 0) {
                this.field4224[var11++] = var16;
            }
            if (var17 > 0) {
                this.field4210[var10++] = var17;
            }
            var5[var12] = null;
        }
        this.field4216 = this.field4223[arg0.method501(0)];
        this.field4212 = this.field4223[arg0.method501(0)];
        int[][] var18 = (int[][]) null;
    }
}
