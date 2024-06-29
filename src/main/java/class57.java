import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class57 {

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Lad;")
    private class342 field834 = new class342();

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    private int field828;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Ls;")
    private class196 field836;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Lth;")
    public static class57 field840 = new class57(64);

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field844 = 0;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field843 = 0;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Lth;")
    public static class57 field845 = new class57(260);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "Ldl;")
    public static class33 field841;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "[I")
    public static int[] field842;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "[[I")
    public static int[][] field830;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I", line = 5)
    public final int method456(int arg0) {
        int var2 = arg0;
        field846++;
        for (class247 var3 = (class247) this.field834.method2386((byte) -125); var3 != null; var3 = (class247) this.field834.method2388((byte) -92)) {
            if (!var3.method715((byte) -29)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBIIIII)V", line = 31)
    public static final void method457(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field827++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg7 - arg3;
        int var12 = arg4 - arg3;
        int var13 = arg7 * arg7;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var15 << 1;
        int var17 = var14 << 1;
        int var18 = var12 * var12;
        int var19 = var12 << 1;
        int var20 = var18 << 1;
        int var21 = var13 << 1;
        int var22 = arg4 << 1;
        int var23 = var14 - ((var22 - 1) * var21);
        int var24 = (1 - var19) * var15 + var20;
        int var25 = (1 - var22) * var13 + var17;
        int var26 = 124 % ((arg2 + 60) / 63);
        int var27 = var18 - (var19 - 1) * var16;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var18 << 2;
        int var32 = var17 * 3;
        int var33 = (var22 - 3) * var21;
        int var34 = (var19 - 3) * var16;
        int var35 = var20 * 3;
        int var36 = var29;
        int var37 = var31;
        int var38 = (var12 - 1) * var30;
        if (class326.field4901 <= arg1 && arg1 <= class261.field3911) {
            int[] var39 = class274.field4158[arg1];
            int var40 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg6 - arg7);
            int var41 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg6 + arg7);
            int var42 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg6 - var11);
            int var43 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg6 + var11);
            class329.method2285(var40, var39, (byte) -114, var42, arg5);
            class329.method2285(var42, var39, (byte) 90, var43, arg0);
            class329.method2285(var43, var39, (byte) 110, var41, arg5);
        }
        int var44 = (arg4 - 1) * var28;
        while (var9 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var8++;
                    var25 += var32;
                    var32 += var29;
                    var23 += var36;
                    var36 += var29;
                }
            }
            if (var23 < 0) {
                var25 += var32;
                var8++;
                var23 += var36;
                var36 += var29;
                var32 += var29;
            }
            var25 += -var44;
            var44 -= var28;
            var23 += -var33;
            boolean var45 = var9 <= var12;
            if (var45) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var24 += var35;
                        var35 += var31;
                        var27 += var37;
                        var37 += var31;
                        var10++;
                    }
                }
                if (var27 < 0) {
                    var27 += var37;
                    var24 += var35;
                    var10++;
                    var35 += var31;
                    var37 += var31;
                }
                var24 += -var38;
                var27 += -var34;
                var38 -= var30;
                var34 -= var30;
            }
            var9--;
            int var46 = arg1 + var9;
            var33 -= var28;
            int var47 = arg1 - var9;
            if (class326.field4901 <= var46 && var47 <= class261.field3911) {
                int var48 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg6 + var8);
                int var49 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg6 - var8);
                if (var45) {
                    int var50 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg6 + var10);
                    int var51 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg6 - var10);
                    if (var47 >= class326.field4901) {
                        int[] var52 = class274.field4158[var47];
                        class329.method2285(var49, var52, (byte) -78, var51, arg5);
                        class329.method2285(var51, var52, (byte) -59, var50, arg0);
                        class329.method2285(var50, var52, (byte) -48, var48, arg5);
                    }
                    if (var46 <= class261.field3911) {
                        int[] var53 = class274.field4158[var46];
                        class329.method2285(var49, var53, (byte) 101, var51, arg5);
                        class329.method2285(var51, var53, (byte) 104, var50, arg0);
                        class329.method2285(var50, var53, (byte) -71, var48, arg5);
                    }
                } else {
                    if (var47 >= class326.field4901) {
                        class329.method2285(var49, class274.field4158[var47], (byte) -56, var48, arg5);
                    }
                    if (class261.field3911 >= var46) {
                        class329.method2285(var49, class274.field4158[var46], (byte) -101, var48, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 235)
    public final void method458(byte arg0) {
        for (class247 var2 = (class247) this.field834.method2386((byte) -66); var2 != null; var2 = (class247) this.field834.method2388((byte) -92)) {
            if (var2.method715((byte) -29)) {
                var2.method876(8);
                var2.method627(0);
                this.field828++;
            }
        }
        field829++;
        int var3 = -98 / ((15 - arg0) / 60);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(JB)V", line = 264)
    public final void method459(long arg0, byte arg1) {
        int var4 = 55 % ((46 - arg1) / 48);
        field833++;
        class247 var5 = (class247) this.field836.method1405(arg0, false);
        if (var5 != null) {
            var5.method876(8);
            var5.method627(0);
            this.field828++;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/Object;IJ)V", line = 283)
    public final void method460(Object arg0, int arg1, long arg2) {
        field838++;
        this.method459(arg2, (byte) -84);
        if (this.field828 == 0) {
            class247 var5 = (class247) this.field834.method2390((byte) 112);
            var5.method876(arg1 ^ 0xFFFF9A1F);
            var5.method627(0);
        } else {
            this.field828--;
        }
        class285 var6 = new class285(arg0);
        this.field836.method1400(arg2, 126, var6);
        this.field834.method2385(var6, arg1 + 26103);
        var6.field1122 = 0L;
        if (arg1 != -26089) {
            this.field839 = 81;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 312)
    public final Object method461(byte arg0, long arg1) {
        field837++;
        class247 var4 = (class247) this.field836.method1405(arg1, false);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method716(-25180);
        if (var5 == null) {
            var4.method876(arg0 ^ 0x70);
            var4.method627(0);
            this.field828++;
            return null;
        }
        if (var4.method715((byte) -29)) {
            class285 var6 = new class285(var5);
            this.field836.method1400(var4.field1656, 114, var6);
            this.field834.method2385(var6, 14);
            var6.field1122 = 0L;
            var4.method876(8);
            var4.method627(0);
        } else {
            this.field834.method2385(var4, 14);
            var4.field1122 = 0L;
        }
        if (arg0 != 120) {
            this.method458((byte) -53);
        }
        return var5;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 354)
    public final void method462(int arg0) {
        if (arg0 != 24) {
            this.method464(85, 109);
        }
        field835++;
        this.field834.method2392((byte) -49);
        this.field836.method1410(arg0 ^ 0xFFFFFF9B);
        this.field828 = this.field839;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 371)
    public static void method463(byte arg0) {
        field840 = null;
        field842 = null;
        if (arg0 != -127) {
            method465(-54, 51);
        }
        field841 = null;
        field830 = (int[][]) null;
        field845 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 386)
    public final void method464(int arg0, int arg1) {
        if (arg0 != 3398) {
            this.field836 = (class196) null;
        }
        if (class225.field3391 != null) {
            for (class247 var3 = (class247) this.field834.method2386((byte) -120); var3 != null; var3 = (class247) this.field834.method2388((byte) -92)) {
                if (var3.method715((byte) -29)) {
                    if (var3.method716(-25180) == null) {
                        var3.method876(8);
                        var3.method627(0);
                        this.field828++;
                    }
                } else if ((++var3.field1122) > ((long) arg1)) {
                    class247 var4 = class225.field3391.method974(-125, var3);
                    this.field836.method1400(var3.field1656, 113, var4);
                    class189.method1305((byte) -100, var4, var3);
                    var3.method876(arg0 ^ 0xD4E);
                    var3.method627(0);
                }
            }
        }
        field831++;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)I", line = 435)
    public static final int method465(int arg0, int arg1) {
        if (arg1 != 0) {
            method457(-9, 71, (byte) 9, 9, 94, 86, -109, -84);
        }
        field832++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(I)V", line = 461)
    public class57(int arg0) {
        this.field828 = arg0;
        this.field839 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field836 = new class196(var2);
    }
}
