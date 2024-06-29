import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class248 {

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
    public static int field3474 = 0;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "[I")
    public static int[] field3476 = new int[5];

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "J")
    public static long field3473;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1654(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3477++;
        if (arg1 != 2) {
            field3473 = -35L;
        }
        for (class235 var5 = (class235) class152.field2292.method1522(true); var5 != null; var5 = (class235) class152.field2292.method1527((byte) 48)) {
            method1655(arg0, arg3, arg2, -10108, var5, arg4);
        }
        for (class235 var6 = (class235) class240.field3372.method1522(true); var6 != null; var6 = (class235) class240.field3372.method1527((byte) 57)) {
            byte var12 = 1;
            class500 var13 = var6.field3328.method464((byte) 4);
            if (var6.field3328.field939 == -1 || var6.field3328.field886) {
                var12 = 0;
            } else if (var6.field3328.field939 == var13.field7116 || var6.field3328.field939 == var13.field7155 || var6.field3328.field939 == var13.field7142 || var6.field3328.field939 == var13.field7108) {
                var12 = 2;
            } else if (var6.field3328.field939 == var13.field7136 || var6.field3328.field939 == var13.field7157 || var6.field3328.field939 == var13.field7139 || var6.field3328.field939 == var13.field7149) {
                var12 = 3;
            }
            if (var6.field3315 != var12) {
                int var14 = class475.method2868(var6.field3328, arg1 ^ 0x3B);
                class488 var15 = var6.field3328.field1523;
                if (var15.field6923 != null) {
                    var15 = var15.method2926(8730, class742.field10408);
                }
                if (var15 == null || var14 == -1) {
                    var6.field3325 = false;
                    var6.field3329 = -1;
                    var6.field3315 = var12;
                } else if (var6.field3329 == var14 && var6.field3325 == var15.field6975) {
                    var6.field3330 = var15.field6952;
                    var6.field3315 = var12;
                } else {
                    boolean var16 = false;
                    if (var6.field3338 == null) {
                        var16 = true;
                    } else {
                        var6.field3330 -= 512;
                        if (var6.field3330 <= 0) {
                            class484.field6848.method4051(var6.field3338);
                            var6.field3338 = null;
                            var16 = true;
                        }
                    }
                    if (var16) {
                        var6.field3336 = null;
                        var6.field3329 = var14;
                        var6.field3330 = var15.field6952;
                        var6.field3325 = var15.field6975;
                        var6.field3315 = var12;
                        var6.field3335 = null;
                    }
                }
            }
            var6.field3323 = var6.field3328.field644;
            var6.field3313 = var6.field3328.field644 + (var6.field3328.method482(false) << 8);
            var6.field3326 = var6.field3328.field648;
            var6.field3322 = var6.field3328.field648 + (var6.field3328.method482(false) << 8);
            method1655(arg0, arg3, arg2, -10108, var6, arg4);
        }
        for (class235 var7 = (class235) class720.field10084.method4209(false); var7 != null; var7 = (class235) class720.field10084.method4207(9356)) {
            byte var8 = 1;
            class500 var9 = var7.field3333.method464((byte) 127);
            if (var7.field3333.field939 == -1 || var7.field3333.field886) {
                var8 = 0;
            } else if (var7.field3333.field939 == var9.field7116 || var7.field3333.field939 == var9.field7155 || var7.field3333.field939 == var9.field7142 || var7.field3333.field939 == var9.field7108) {
                var8 = 2;
            } else if (var7.field3333.field939 == var9.field7136 || var7.field3333.field939 == var9.field7157 || var7.field3333.field939 == var9.field7139 || var7.field3333.field939 == var9.field7149) {
                var8 = 3;
            }
            if (var7.field3315 != var8) {
                int var10 = class700.method3937(var7.field3333, 0);
                if (var7.field3329 == var10 && var7.field3333.field4902 == var7.field3325) {
                    var7.field3330 = var7.field3333.field4935;
                    var7.field3315 = var8;
                } else {
                    boolean var11 = false;
                    if (var7.field3338 == null) {
                        var11 = true;
                    } else {
                        var7.field3330 -= 512;
                        if (var7.field3330 <= 0) {
                            class484.field6848.method4051(var7.field3338);
                            var11 = true;
                            var7.field3338 = null;
                        }
                    }
                    if (var11) {
                        var7.field3335 = null;
                        var7.field3329 = var10;
                        var7.field3315 = var8;
                        var7.field3325 = var7.field3333.field4902;
                        var7.field3336 = null;
                        var7.field3330 = var7.field3333.field4935;
                    }
                }
            }
            var7.field3323 = var7.field3333.field644;
            var7.field3313 = var7.field3333.field644 + (var7.field3333.method482(false) << 8);
            var7.field3326 = var7.field3333.field648;
            var7.field3322 = var7.field3333.field648 + (var7.field3333.method482(false) << 8);
            method1655(arg0, arg3, arg2, -10108, var7, arg4);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIILlf;I)V", line = 186)
    private static final void method1655(int arg0, int arg1, int arg2, int arg3, class235 arg4, int arg5) {
        field3475++;
        if (arg4.field3329 == -1 && arg4.field3331 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg4.field3330 * class471.field6781.field6685.method3134(arg3 ^ 0xFFFFB491) >> 8;
        if (arg0 > arg4.field3313) {
            var6 += arg0 - arg4.field3313;
        } else if (arg0 < arg4.field3323) {
            var6 += arg4.field3323 - arg0;
        }
        if (arg1 > arg4.field3322) {
            var6 += arg1 - arg4.field3322;
        } else if (arg1 < arg4.field3326) {
            var6 += arg4.field3326 - arg1;
        }
        if (arg3 != -10108) {
            return;
        }
        if (arg4.field3312 == 0 || (var6 - 256) > arg4.field3312 || class471.field6781.field6685.method3134(27669) == 0 || arg4.field3324 != arg2) {
            if (arg4.field3338 != null) {
                class484.field6848.method4051(arg4.field3338);
                arg4.field3338 = null;
                arg4.field3336 = null;
                arg4.field3335 = null;
            }
            if (arg4.field3319 != null) {
                class484.field6848.method4051(arg4.field3319);
                arg4.field3319 = null;
                arg4.field3327 = null;
                arg4.field3311 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field3312 - var6) * var7 / arg4.field3312;
        class468.field6748.method482(false);
        int var9 = 8192;
        int var10 = (arg4.field3323 + arg4.field3313) / 2 - arg0;
        int var11 = (arg4.field3326 + arg4.field3322) / 2 - arg1;
        if (var10 != 0 || var11 != 0) {
            int var12 = -class239.field3371 - ((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var12 > 8192) {
                var12 = 16384 - var12;
            }
            int var13;
            if (var6 <= 0) {
                var13 = 8192;
            } else if (var6 >= 4096) {
                var13 = 16384;
            } else {
                var13 = var6 * 8192 / 4096 + 8192;
            }
            var9 = (16384 - var13 >> 1) + var12 * var13 / 8192;
        }
        if (arg4.field3338 != null) {
            arg4.field3338.method1904(var8);
            arg4.field3338.method1898(var9);
        } else if (arg4.field3329 >= 0) {
            int var14 = arg4.field3320 == 256 && arg4.field3314 == 256 ? 256 : class612.method3522(26, arg4.field3320, arg4.field3314);
            if (arg4.field3325) {
                if (arg4.field3335 == null) {
                    arg4.field3335 = class5.method32(class710.field9930, arg4.field3329);
                }
                if (arg4.field3335 != null) {
                    if (arg4.field3336 == null) {
                        arg4.field3336 = arg4.field3335.method27(new int[] { 22050 });
                    }
                    if (arg4.field3336 != null) {
                        class294 var18 = class294.method1896(arg4.field3336, var14, var8 << 6, var9);
                        var18.method1888(-1);
                        class484.field6848.method4053(var18);
                        arg4.field3338 = var18;
                    }
                }
            } else {
                class88 var15 = class88.method829(class662.field9317, arg4.field3329, 0);
                if (var15 != null) {
                    class690 var16 = var15.method831().method3873(class67.field1219);
                    class294 var17 = class294.method1896(var16, var14, var8 << 6, var9);
                    var17.method1888(-1);
                    class484.field6848.method4053(var17);
                    arg4.field3338 = var17;
                }
            }
        }
        if (arg4.field3319 != null) {
            arg4.field3319.method1904(var8);
            arg4.field3319.method1898(var9);
            if (!arg4.field3319.method3618(-124)) {
                arg4.field3327 = null;
                arg4.field3319 = null;
                arg4.field3311 = null;
            }
        } else if (arg4.field3331 != null && (arg4.field3318 -= arg5) <= 0) {
            int var19 = arg4.field3320 == 256 && arg4.field3314 == 256 ? 256 : (int) ((double) (arg4.field3320 - arg4.field3314) * Math.random()) + arg4.field3314;
            if (!arg4.field3332) {
                int var20 = (int) ((double) arg4.field3331.length * Math.random());
                class88 var21 = class88.method829(class662.field9317, arg4.field3331[var20], 0);
                if (var21 != null) {
                    class690 var22 = var21.method831().method3873(class67.field1219);
                    class294 var23 = class294.method1896(var22, var19, var8 << 6, var9);
                    var23.method1888(0);
                    class484.field6848.method4053(var23);
                    arg4.field3319 = var23;
                    arg4.field3318 = arg4.field3317 + ((int) (Math.random() * (double) (arg4.field3321 - arg4.field3317)));
                    return;
                }
                return;
            }
            if (arg4.field3311 == null) {
                int var24 = (int) ((double) arg4.field3331.length * Math.random());
                arg4.field3311 = class5.method32(class710.field9930, arg4.field3331[var24]);
            }
            if (arg4.field3311 != null) {
                if (arg4.field3327 == null) {
                    arg4.field3327 = arg4.field3311.method27(new int[] { 22050 });
                }
                if (arg4.field3327 != null) {
                    class294 var25 = class294.method1896(arg4.field3327, var19, var8 << 6, var9);
                    var25.method1888(0);
                    class484.field6848.method4053(var25);
                    arg4.field3318 = arg4.field3317 + ((int) ((double) (arg4.field3321 - arg4.field3317) * Math.random()));
                    arg4.field3319 = var25;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V", line = 453)
    public static void method1656(int arg0) {
        field3476 = null;
        if (arg0 != 21750) {
            field3473 = 104L;
        }
    }
}
