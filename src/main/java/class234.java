import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class234 {

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3533 = new String[] { method2001(method2000("\u0017\u0013yFo")), method2001(method2000("\u0017\u0013y@o")), method2001(method2000("\u0002Iy*:")), method2001(method2000("\u0017\u0012;h")), method2001(method2000("\u0017\u0013yEo")), method2001(method2000("\u0017\u0013yGo")) };

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "Lvea;")
    public static class288 field3524 = new class288();

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "Z")
    public static boolean field3526 = false;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public int field3523;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public int field3525;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public int field3529;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "Lla;")
    public static class476 field3531;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "Llq;")
    public static class578 field3530;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILec;)V")
    public static final void method1996(int arg0, class247 arg1) {
        try {
            int var2 = -7 % ((arg0 - 70) / 56);
            if (arg1.field3796 != -1) {
                class344 var3 = class272.field4122.method2242(arg1.field3796, 100);
                if (var3 == null || var3.field5366 == null) {
                    arg1.field3796 = -1;
                    arg1.field3849 = false;
                } else {
                    label375: {
                        arg1.field3790++;
                        if (arg1.field3762 < var3.field5366.length && var3.field5361[arg1.field3762] < arg1.field3790) {
                            arg1.field3847++;
                            arg1.field3790 = 1;
                            arg1.field3762++;
                            if (!arg1.field3800) {
                                class418.method3242(-256, var3, arg1, arg1.field3762);
                            }
                        }
                        if (var3.field5366.length <= arg1.field3762) {
                            arg1.field3790 = 0;
                            arg1.field3762 = 0;
                            if (arg1.field3849) {
                                arg1.field3796 = arg1.method2099(106).method1220(-1);
                                if (arg1.field3796 == -1) {
                                    arg1.field3849 = false;
                                    break label375;
                                }
                                var3 = class272.field4122.method2242(arg1.field3796, 100);
                            }
                            if (!arg1.field3800) {
                                class418.method3242(-256, var3, arg1, arg1.field3762);
                            }
                        }
                        arg1.field3847 = arg1.field3762 + 1;
                        if (var3.field5366 == null) {
                            arg1.field3849 = false;
                            arg1.field3796 = -1;
                        } else if (arg1.field3847 >= var3.field5366.length) {
                            arg1.field3847 = 0;
                        }
                    }
                }
            }
            field3527++;
            for (int var4 = 0; var4 < arg1.field3775.length; var4++) {
                if (arg1.field3775[var4].field563 != -1 && class375.field5711 >= arg1.field3775[var4].field562) {
                    class217 var5 = class771.field11208.method2509(-107, arg1.field3775[var4].field563);
                    int var6 = var5.field3313;
                    if (var6 == -1) {
                        arg1.field3775[var4].field563 = -1;
                    } else {
                        class344 var7 = class272.field4122.method2242(var6, 100);
                        if (var5.field3306) {
                            if (var7.field5368 == 3) {
                                if (arg1.field3858 > 0 && class375.field5711 >= arg1.field3827 && arg1.field3833 < class375.field5711) {
                                    arg1.field3775[var4].field563 = -1;
                                    continue;
                                }
                            } else if (var7.field5368 == 1 && arg1.field3858 > 0 && arg1.field3827 <= class375.field5711 && class375.field5711 > arg1.field3833) {
                                arg1.field3775[var4].field562 = class375.field5711 + 1;
                                continue;
                            }
                        }
                        if (var7 == null || var7.field5366 == null) {
                            arg1.field3775[var4].field563 = -1;
                        } else {
                            if (arg1.field3775[var4].field558 < 0) {
                                arg1.field3775[var4].field558 = 0;
                                if (!arg1.field3800) {
                                    class418.method3242(-256, var7, arg1, 0);
                                }
                            }
                            arg1.field3775[var4].field554++;
                            if (var7.field5366.length > arg1.field3775[var4].field558 && var7.field5361[arg1.field3775[var4].field558] < arg1.field3775[var4].field554) {
                                arg1.field3775[var4].field554 = 1;
                                arg1.field3775[var4].field558++;
                                if (!arg1.field3800) {
                                    class418.method3242(-256, var7, arg1, arg1.field3775[var4].field558);
                                }
                            }
                            if (arg1.field3775[var4].field558 >= var7.field5366.length) {
                                if (var5.field3306) {
                                    arg1.field3775[var4].field558 -= var7.field5345;
                                    arg1.field3775[var4].field560++;
                                    if (var7.field5355 <= arg1.field3775[var4].field560) {
                                        arg1.field3775[var4].field563 = -1;
                                    } else if (arg1.field3775[var4].field558 < 0 || arg1.field3775[var4].field558 >= var7.field5366.length) {
                                        arg1.field3775[var4].field563 = -1;
                                    } else if (!arg1.field3800) {
                                        class418.method3242(-256, var7, arg1, arg1.field3775[var4].field558);
                                    }
                                } else {
                                    arg1.field3775[var4].field563 = -1;
                                }
                            }
                            arg1.field3775[var4].field561 = arg1.field3775[var4].field558 + 1;
                            if (arg1.field3775[var4].field561 >= var7.field5366.length) {
                                if (var5.field3306) {
                                    arg1.field3775[var4].field561 -= var7.field5345;
                                    if (var7.field5355 <= (arg1.field3775[var4].field560 + 1)) {
                                        arg1.field3775[var4].field561 = -1;
                                    } else if (arg1.field3775[var4].field561 < 0 || var7.field5366.length <= arg1.field3775[var4].field561) {
                                        arg1.field3775[var4].field561 = -1;
                                    }
                                } else {
                                    arg1.field3775[var4].field561 = -1;
                                }
                            }
                        }
                    }
                }
            }
            if (arg1.field3814 != -1 && arg1.field3850 <= 1) {
                class344 var8 = class272.field4122.method2242(arg1.field3814, 100);
                if (var8.field5368 == 3) {
                    if (arg1.field3858 > 0 && arg1.field3827 <= class375.field5711 && class375.field5711 > arg1.field3833) {
                        arg1.field3841 = null;
                        arg1.field3814 = -1;
                    }
                } else if (var8.field5368 == 1 && arg1.field3858 > 0 && class375.field5711 >= arg1.field3827 && arg1.field3833 < class375.field5711) {
                    arg1.field3850 = 2;
                }
            }
            if (arg1.field3814 != -1 && arg1.field3850 == 0) {
                class344 var9 = class272.field4122.method2242(arg1.field3814, 100);
                if (var9 == null || var9.field5366 == null) {
                    arg1.field3841 = null;
                    arg1.field3814 = -1;
                } else {
                    arg1.field3794++;
                    if (arg1.field3821 < var9.field5366.length && arg1.field3794 > var9.field5361[arg1.field3821]) {
                        arg1.field3794 = 1;
                        arg1.field3821++;
                        if (!arg1.field3800) {
                            class418.method3242(-256, var9, arg1, arg1.field3821);
                        }
                    }
                    if (var9.field5366.length <= arg1.field3821) {
                        arg1.field3821 -= var9.field5345;
                        arg1.field3851++;
                        if (var9.field5355 <= arg1.field3851) {
                            arg1.field3814 = -1;
                            arg1.field3841 = null;
                        } else if (arg1.field3821 < 0 || arg1.field3821 >= var9.field5366.length) {
                            arg1.field3814 = -1;
                            arg1.field3841 = null;
                        } else if (!arg1.field3800) {
                            class418.method3242(-256, var9, arg1, arg1.field3821);
                        }
                    }
                    arg1.field3763 = arg1.field3821 + 1;
                    if (var9.field5366.length <= arg1.field3763) {
                        arg1.field3763 -= var9.field5345;
                        if (var9.field5355 <= arg1.field3851 + 1) {
                            arg1.field3763 = -1;
                        } else if (arg1.field3763 < 0 || var9.field5366.length <= arg1.field3763) {
                            arg1.field3763 = -1;
                        }
                    }
                }
            }
            if (arg1.field3850 > 0) {
                arg1.field3850--;
            }
            for (int var10 = 0; var10 < arg1.field3813.length; var10++) {
                class694 var11 = arg1.field3813[var10];
                if (var11 != null) {
                    if (var11.field10137 > 0) {
                        var11.field10137--;
                    } else {
                        class344 var12 = class272.field4122.method2242(var11.field10138, 100);
                        if (var12 == null || var12.field5366 == null) {
                            arg1.field3813[var10] = null;
                        } else {
                            var11.field10130++;
                            if (var11.field10136 < var12.field5366.length && var11.field10130 > var12.field5361[var11.field10136]) {
                                var11.field10130 = 1;
                                var11.field10136++;
                                if (!arg1.field3800) {
                                    class418.method3242(-256, var12, arg1, var11.field10136);
                                }
                            }
                            if (var11.field10136 >= var12.field5366.length) {
                                var11.field10132++;
                                var11.field10136 -= var12.field5345;
                                if (var11.field10132 >= var12.field5355) {
                                    arg1.field3813[var10] = null;
                                } else if (var11.field10136 < 0 || var11.field10136 >= var12.field5366.length) {
                                    arg1.field3813[var10] = null;
                                } else if (!arg1.field3800) {
                                    class418.method3242(-256, var12, arg1, var11.field10136);
                                }
                            }
                            var11.field10134 = var11.field10136 + 1;
                            if (var12.field5366.length <= var11.field10134) {
                                var11.field10134 -= var12.field5345;
                                if ((var11.field10132 + 1) >= var12.field5355) {
                                    var11.field10134 = -1;
                                } else if (var11.field10134 < 0 || var12.field5366.length <= var11.field10134) {
                                    var11.field10134 = -1;
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field3533[1] + arg0 + ',' + (arg1 == null ? field3533[3] : field3533[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZIIZI)V")
    public static final void method1997(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        try {
            if (arg0 < arg4) {
                int var7 = (arg0 + arg4) / 2;
                int var8 = arg0;
                class604 var9 = class192.field2592[var7];
                class192.field2592[var7] = class192.field2592[arg4];
                class192.field2592[arg4] = var9;
                for (int var10 = arg0; var10 < arg4; var10++) {
                    if (class186.method1619(arg6, var9, arg2, arg3, 0, arg5, class192.field2592[var10]) <= 0) {
                        class604 var11 = class192.field2592[var10];
                        class192.field2592[var10] = class192.field2592[var8];
                        class192.field2592[var8++] = var11;
                    }
                }
                class192.field2592[arg4] = class192.field2592[var8];
                class192.field2592[var8] = var9;
                method1997(arg0, -1, arg2, arg3, var8 - 1, arg5, arg6);
                method1997(var8 + 1, -1, arg2, arg3, arg4, arg5, arg6);
            }
            field3522++;
            if (arg1 != -1) {
                method1997(47, 124, true, -75, -15, true, -127);
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field3533[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method1998(int arg0) {
        try {
            field3524 = null;
            if (arg0 != 16750) {
                field3526 = false;
            }
            field3531 = null;
            field3530 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3533[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lib;I)V")
    public static final void method1999(class163 arg0, int arg1) {
        try {
            int var2 = 0;
            if (arg1 == -65536) {
                while (var2 < class748.field10895) {
                    int var3 = arg0.method1425(119);
                    int var4 = arg0.method1445((byte) 124);
                    if (var4 == 65535) {
                        var4 = -1;
                    }
                    if (class612.field8928[var3] != null) {
                        class612.field8928[var3].field2526 = var4;
                    }
                    var2++;
                }
                field3528++;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3533[5] + (arg0 == null ? field3533[3] : field3533[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2000(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x47);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2001(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 121;
                    break;
                case 1:
                    var10005 = 103;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 71;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
