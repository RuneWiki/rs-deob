import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class408 {

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public int field6047;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "[I")
    public int[] field6050;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "[I")
    public int[] field6049;

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6052 = new String[] { method3192(method3191("\u0011WI;\\R")), method3192(method3191("\u0014FDy")), method3192(method3191("FPGy\"\u0019PKv|\u0019\r")), method3192(method3191("Z\u001b")), method3192(method3191("Z\u001e\u00165#\u0019\\D(y\u001cUNsyD")), method3192(method3191("\u0001\u001d\u0006;b")), method3192(method3191("FPGy\"\u001cUNsy\u001c\r")), method3192(method3191("\u0011WI;]R")), method3192(method3191("\u0011WI;^R")), method3192(method3191("\u0011WI;#\u0013]Aa!R")) };

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "[C")
    public static char[] field6046 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "Z")
    public static boolean field6048 = false;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "F")
    public static float field6044;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILic;Z)V", line = 8)
    public static final void method3188(int arg0, class726 arg1, boolean arg2) {
        try {
            if (arg0 != 18944) {
                field6048 = true;
            }
            field6051++;
            if (class593.field8707 < 400) {
                if (class225.field3446 != arg1) {
                    String var7;
                    if (arg1.field10528 == 0) {
                        boolean var3 = true;
                        if (class225.field3446.field10499 != -1 && arg1.field10499 != -1) {
                            int var4 = class225.field3446.field10499 >= arg1.field10499 ? arg1.field10499 : class225.field3446.field10499;
                            int var5 = class225.field3446.field10509 - arg1.field10509;
                            if (var5 < 0) {
                                var5 = -var5;
                            }
                            if (var4 < var5) {
                                var3 = false;
                            }
                        }
                        String var6 = class447.field6576 == class239.field3624 ? class309.field4877.method2616(false, class167.field2300) : class309.field4875.method2616(false, class167.field2300);
                        if (arg1.field10483 <= arg1.field10509) {
                            var7 = arg1.method5289(-2068, true) + (var3 ? class733.method5345(arg1.field10509, class225.field3446.field10509, arg0 ^ 0x1B93) : field6052[6]) + field6052[3] + var6 + arg1.field10509 + ")";
                        } else {
                            var7 = arg1.method5289(-2068, true) + (var3 ? class733.method5345(arg1.field10509, class225.field3446.field10509, 20883) : field6052[6]) + field6052[3] + var6 + arg1.field10509 + "+" + (arg1.field10483 - arg1.field10509) + ")";
                        }
                    } else if (arg1.field10528 == -1) {
                        var7 = arg1.method5289(-2068, true);
                    } else {
                        var7 = arg1.method5289(-2068, true) + field6052[3] + class309.field4876.method2616(false, class167.field2300) + arg1.field10528 + ")";
                    }
                    if (class728.field10555 && !arg2 && (class517.field7484 & 0x8) != 0) {
                        class719.method5244(0, (long) arg1.field3780, false, (long) arg1.field3780, class10.field116, 0, false, class740.field10757 + field6052[4] + var7, class586.field8637, (byte) 124, 13, true, -1);
                        class738.field10737++;
                    }
                    if (arg2) {
                        class719.method5244(0, (long) arg1.field3780, true, 0L, field6052[2] + var7, 0, false, "", -1, (byte) -125, -1, false, 0);
                    } else {
                        for (int var8 = 7; var8 >= 0; var8--) {
                            if (class172.field2384[var8] != null) {
                                short var9 = 0;
                                if (class447.field6576 == class243.field3725 && class172.field2384[var8].equalsIgnoreCase(class309.field4870.method2616(false, class167.field2300))) {
                                    if (class647.field9363 && class225.field3446.field10509 < arg1.field10509) {
                                        var9 = 2000;
                                    }
                                    if (class225.field3446.field10533 == 0 || arg1.field10533 == 0) {
                                        if (arg1.field10494) {
                                            var9 = 2000;
                                        }
                                    } else if (class225.field3446.field10533 == arg1.field10533) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                } else if (class196.field2631[var8]) {
                                    var9 = 2000;
                                }
                                short var10 = (short) (class762.field11038[var8] + var9);
                                int var11 = class151.field1869[var8] == -1 ? class330.field5190 : class151.field1869[var8];
                                class719.method5244(0, (long) arg1.field3780, false, (long) arg1.field3780, class172.field2384[var8], 0, false, field6052[6] + var7, var11, (byte) -92, var10, true, -1);
                                class184.field2549++;
                            }
                        }
                    }
                    if (!arg2) {
                        for (class417 var12 = (class417) class728.field10549.method3863((byte) 64); var12 != null; var12 = (class417) class728.field10549.method3862(-353)) {
                            if (var12.field6146 == 12) {
                                var12.field6152 = field6052[6] + var7;
                                return;
                            }
                        }
                    }
                } else if (class728.field10555 && (class517.field7484 & 0x10) != 0) {
                    class719.method5244(0, (long) arg1.field3780, false, 0L, class10.field116, 0, false, class740.field10757 + field6052[4] + class309.field4884.method2616(false, class167.field2300), class586.field8637, (byte) 127, 9, true, -1);
                    class205.field3170++;
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field6052[0] + arg0 + ',' + (arg1 == null ? field6052[1] : field6052[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V", line = 165)
    public static void method3189(int arg0) {
        try {
            field6046 = null;
            if (arg0 != -23866) {
                field6048 = true;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6052[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(I)V", line = 182)
    public class408(int arg0) {
        try {
            this.field6047 = arg0;
            this.field6050 = new int[this.field6047];
            this.field6049 = new int[this.field6047];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6052[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIILla;)Lija;", line = 193)
    public static final class363 method3190(int arg0, int arg1, int arg2, class476 arg3) {
        try {
            if (arg2 != 5068) {
                method3188(-39, null, true);
            }
            field6045++;
            class163 var4 = new class163(arg3.method3632(arg1, arg0, 9));
            class363 var5 = new class363(arg0, var4.method1423(80), var4.method1423(101), var4.method1453((byte) 115), var4.method1453((byte) 100), var4.method1455((byte) 62) == 1, var4.method1455((byte) 62), var4.method1455((byte) 62));
            int var6 = var4.method1455((byte) 62);
            for (int var7 = 0; var7 < var6; var7++) {
                var5.field5563.method3868(arg2 ^ 0xFFFFEC1C, new class448(var4.method1455((byte) 62), var4.method1445((byte) 125), var4.method1445((byte) 112), var4.method1445((byte) 127), var4.method1445((byte) 118), var4.method1445((byte) 112), var4.method1445((byte) 123), var4.method1445((byte) 103), var4.method1445((byte) 112)));
            }
            var5.method2944(-112);
            return var5;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field6052[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6052[1] : field6052[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3191(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3192(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 40;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 31;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
