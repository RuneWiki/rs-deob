import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class184 extends class54 {

    @OriginalMember(owner = "client!hga", name = "y", descriptor = "Z")
    public boolean field2538 = false;

    @OriginalMember(owner = "client!hga", name = "u", descriptor = "Z")
    private boolean field2535 = true;

    @OriginalMember(owner = "client!hga", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field2554 = new String[] { method1614(method1613("'=dFmg")), method1614(method1613("'=dFfg")), method1614(method1613("'=dFdg")), method1614(method1613("'=dFcg")), method1614(method1613("'=dFlg")), method1614(method1613("'=dFng")), method1614(method1613("%;b\f]")), method1614(method1613("'=dFgg")), method1614(method1613("'=dFag")), method1614(method1613("'=dF`g")), method1614(method1613("'=dFhg")), method1614(method1613("'=dFbg")), method1614(method1613("!/i\u0004")), method1614(method1613("'=dFig")), method1614(method1613("4t+FX")), method1614(method1613("'=dFog")) };

    @OriginalMember(owner = "client!hga", name = "E", descriptor = "I")
    public static int field2540 = 1;

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "I")
    public static int field2547 = 0;

    @OriginalMember(owner = "client!hga", name = "A", descriptor = "[I")
    public static int[] field2552 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!hga", name = "w", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!hga", name = "r", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!hga", name = "C", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!hga", name = "t", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!hga", name = "s", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!hga", name = "B", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!hga", name = "x", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!hga", name = "F", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!hga", name = "v", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "[Ls;")
    public static class294[] field2541;

    @OriginalMember(owner = "client!hga", name = "D", descriptor = "[[[B")
    public static byte[][][] field2545;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B[[[Liia;)V", line = 3)
    public static final void method1604(byte arg0, class96[][][] arg1) {
        try {
            int var2 = 0;
            if (arg0 > 72) {
                while (arg1.length > var2) {
                    class96[][] var3 = arg1[var2];
                    for (int var4 = 0; var3.length > var4; ++var4) {
                        for (int var5 = 0; var5 < var3[var4].length; ++var5) {
                            class96 var6 = var3[var4][var5];
                            if (var6 != null) {
                                if (var6.field1081 instanceof class583) {
                                    ((class583) var6.field1081).method1085(-2939);
                                }
                                if (var6.field1080 instanceof class583) {
                                    ((class583) var6.field1080).method1085(-2939);
                                }
                                if (var6.field1090 instanceof class583) {
                                    ((class583) var6.field1090).method1085(-2939);
                                }
                                if (var6.field1082 instanceof class583) {
                                    ((class583) var6.field1082).method1085(-2939);
                                }
                                if (var6.field1079 instanceof class583) {
                                    ((class583) var6.field1079).method1085(-2939);
                                }
                                for (class681 var7 = var6.field1085; var7 != null; var7 = var7.field9865) {
                                    class343 var8 = var7.field9867;
                                    if (var8 instanceof class583) {
                                        ((class583) var8).method1085(-2939);
                                    }
                                }
                            }
                        }
                    }
                    ++var2;
                }
                ++field2536;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field2554[13] + arg0 + ',' + (arg1 != null ? field2554[14] : field2554[12]) + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIIIIIB)V", line = 76)
    public static final void method1605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        try {
            int var9 = -70 / ((1 - arg8) / 48);
            ++field2543;
            if (~arg2 <= -2 && ~arg5 <= -2 && ~arg2 >= ~(class648.field9378 + -2) && class659.field9506 + -2 >= arg5) {
                int var10 = arg3;
                if (arg3 < 3 && class231.method1980(1, arg5, arg2)) {
                    var10 = arg3 + 1;
                }
                if (class289.field4305.field825.method717(false) == 0 && !class256.method2171(2, var10, arg5, class419.field6182, arg2)) {
                    return;
                }
                if (class734.field10683 == null) {
                    return;
                }
                class531.field7799.method757(arg3, 1, class429.field6298[arg3], class610.field8913, arg2, arg0, arg5);
                if (arg7 >= 0) {
                    int var11 = class289.field4305.field845.method4770(false);
                    class289.field4305.method655(17, 1, class289.field4305.field845);
                    class531.field7799.method758(class610.field8913, class429.field6298[arg3], arg4, arg5, arg1, arg2, 57, var10, arg6, arg7, arg3);
                    class289.field4305.method655(17, var11, class289.field4305.field845);
                    return;
                }
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field2554[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)V", line = 122)
    public final void method113(int arg0, int arg1) {
        try {
            if (arg0 == 0) {
                super.field593 = arg1;
                ++field2537;
                this.field2538 = false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2554[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(Z)I", line = 137)
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                this.method115(false);
            }
            this.field2538 = true;
            ++field2539;
            return !super.field589.method662(82).method2135((byte) -64) ? 0 : 2;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2554[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(ILhia;)V", line = 257)
    public class184(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lhia;)V", line = 331)
    public class184(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IBILev;I)V", line = 160)
    public static final void method1606(int arg0, byte arg1, int arg2, class719 arg3, int arg4) {
        try {
            ++field2534;
            long var5 = (long) (arg4 | arg0 << 28 | arg2 << 14);
            int var7 = -97 / ((27 - arg1) / 57);
            class672 var8 = (class672) class29.field357.method977(var5, 1);
            if (var8 == null) {
                class672 var9 = new class672();
                class29.field357.method968((byte) -111, var5, var9);
                var9.field9756.method3868(122, arg3);
            } else {
                class530 var10 = class540.field7920.method5000(arg3.field10410, (byte) 70);
                int var11 = var10.field7733;
                if (var10.field7744 == 1) {
                    var11 = (arg3.field10412 + 1) * var11;
                }
                for (class719 var12 = (class719) var8.field9756.method3863((byte) 64); var12 != null; var12 = (class719) var8.field9756.method3862(-353)) {
                    class530 var13 = class540.field7920.method5000(var12.field10410, (byte) 121);
                    int var14 = var13.field7733;
                    if (var13.field7744 == 1) {
                        var14 = (var12.field10412 + 1) * var14;
                    }
                    if (var14 < var11) {
                        class717.method5224(125, var12, arg3);
                        return;
                    }
                }
                var8.field9756.method3868(74, arg3);
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field2554[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2554[14] : field2554[12]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "(I)Z", line = 215)
    public final boolean method1607(int arg0) {
        try {
            ++field2542;
            if (!super.field589.method662(-49).method2135((byte) -80)) {
                return false;
            } else {
                return arg0 == -10243;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2554[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)V", line = 231)
    public final void method115(boolean arg0) {
        try {
            if (!super.field589.method662(107).method2135((byte) -58)) {
                super.field593 = 0;
            }
            if (!arg0) {
                this.method109(-117, (byte) 26);
            }
            ++field2553;
            if (super.field593 < 0 || super.field593 > 5) {
                super.field593 = this.method111(false);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2554[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(IB)I", line = 263)
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 >= -106) {
                return 49;
            } else {
                ++field2544;
                if (!super.field589.method662(37).method2135((byte) -127)) {
                    return 3;
                } else {
                    return arg0 == 3 && !class101.method831(field2554[6], (byte) 56) ? 3 : 2;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2554[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZ)V", line = 280)
    public final void method1608(int arg0, boolean arg1) {
        try {
            if (arg0 != 1692039310) {
                field2541 = null;
            }
            this.field2535 = arg1;
            ++field2546;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2554[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "(I)V", line = 291)
    public static final void method1609(int arg0) {
        try {
            class451.field6615 = null;
            class110.field1283 = null;
            class744.field10821 = null;
            class774.field11246 = null;
            class604.field8852 = null;
            class242.field3681 = null;
            class71.field781 = null;
            class783.field11415 = null;
            ++field2551;
            class562.field8349 = null;
            class269.field4100 = null;
            class309.field4911 = null;
            class208.field3193 = null;
            if (arg0 != -1) {
                method1606(25, (byte) 16, -57, (class719) null, 100);
            }
            class50.field575 = null;
            class715.field10345 = null;
            class125.field1469 = null;
            class770.field11183 = null;
            class91.field1039 = null;
            class704.field10229 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2554[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "(Z)I", line = 320)
    public final int method1610(boolean arg0) {
        try {
            ++field2550;
            if (arg0) {
                this.method1612(false);
            }
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2554[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "(I)V", line = 338)
    public static void method1611(int arg0) {
        try {
            field2552 = null;
            field2541 = null;
            field2545 = null;
            if (arg0 != 3) {
                method1604((byte) 73, (class96[][][]) null);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2554[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "(Z)Z", line = 350)
    public final boolean method1612(boolean arg0) {
        try {
            if (arg0) {
                this.field2538 = true;
            }
            ++field2548;
            return this.field2535;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2554[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1613(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1614(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
