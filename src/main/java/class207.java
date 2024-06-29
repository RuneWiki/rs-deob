import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class207 extends class134 {

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field3244 = new String[] { method1878(method1877("\u000eV!uy")), method1878(method1877("\u0005\u0013!\u0010,")), method1878(method1877("\u000eV!vy")), method1878(method1877("\u0010HcR")), method1878(method1877("\u000eV!wy")), method1878(method1877("\u000eV!zy")), method1878(method1877("\u000eV!ty")), method1878(method1877("\u000eV!}y")), method1878(method1877("\u000eV!ry")), method1878(method1877("\u000eV!|y")), method1878(method1877("\u000eV!\u007fy")), method1878(method1877("\u000eV!yy")) };

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "Lfg;")
    public static class136 field3238 = new class136();

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "Leh;")
    public static class380 field3239 = new class380();

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    private int field3236;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "Ljava/lang/String;")
    private String field3232;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lmk;B)Ljava/lang/String;", line = 5)
    public static final String method1869(class59 arg0, byte arg1) {
        try {
            field3233++;
            if (arg1 != -112) {
                method1870(-56, 10, -23);
            }
            if (arg0.field758 == null || arg0.field758.length() == 0) {
                return arg0.field760 == null || arg0.field760.length() <= 0 ? arg0.field764 : arg0.field764 + class709.field10234.method5154(class795.field11624, (byte) 65) + arg0.field760;
            } else if (arg0.field760 == null || arg0.field760.length() <= 0) {
                return arg0.field764 + class709.field10234.method5154(class795.field11624, (byte) 65) + arg0.field758;
            } else {
                return arg0.field764 + class709.field10234.method5154(class795.field11624, (byte) 65) + arg0.field760 + class709.field10234.method5154(class795.field11624, (byte) 65) + arg0.field758;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3244[2] + (arg0 == null ? field3244[3] : field3244[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)I", line = 32)
    public static final int method1870(int arg0, int arg1, int arg2) {
        try {
            field3235++;
            int var3 = arg0 - 1 & arg2 >> 31;
            if (arg1 < 8) {
                field3238 = null;
            }
            return ((arg2 >>> 31) + arg2) % arg0 + var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3244[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lsca;I)V", line = 45)
    public final void method100(class47 arg0, int arg1) {
        try {
            field3234++;
            arg0.method494(this.field3236, this.field3232, false);
            if (arg1 >= -81) {
                method1873(111, 7, 39, 12);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3244[7] + (arg0 == null ? field3244[3] : field3244[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;Z)V", line = 59)
    public static final void method1871(File arg0, String arg1, boolean arg2) {
        try {
            class134.field1901.put(arg1, arg0);
            if (!arg2) {
                field3237++;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3244[11] + (arg0 == null ? field3244[3] : field3244[1]) + ',' + (arg1 == null ? field3244[3] : field3244[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILwq;)V", line = 73)
    public final void method102(int arg0, class176 arg1) {
        try {
            field3231++;
            this.field3236 = arg1.method1622(-18712);
            int var3 = -9 % ((83 - arg0) / 34);
            this.field3232 = arg1.method1635((byte) 116);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3244[5] + arg0 + ',' + (arg1 == null ? field3244[3] : field3244[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 84)
    public static void method1872(int arg0) {
        try {
            field3238 = null;
            field3239 = null;
            if (arg0 != 0) {
                method1875((byte) -124);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3244[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)I", line = 97)
    public static final int method1873(int arg0, int arg1, int arg2, int arg3) {
        try {
            field3242++;
            if (class740.field10902 == null) {
                return 0;
            }
            int var4 = arg0 >> 9;
            int var5 = arg3 >> 9;
            if (var4 < 0 || var5 < 0 || class126.field1823 - 1 < var4 || var5 > class169.field2725 - 1) {
                return 0;
            } else if (arg1 == -10) {
                int var6 = arg2;
                if (arg2 < 3 && (class224.field3519[1][var4][var5] & 0x2) != 0) {
                    var6 = arg2 + 1;
                }
                return class740.field10902[var6].method2497((byte) -91, arg0, arg3);
            } else {
                return 34;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3244[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V", line = 128)
    public static final void method1874(int arg0) {
        try {
            for (int var1 = 0; var1 < class490.field7395; var1++) {
                class746 var2 = class771.field11308[var1];
                boolean var3 = false;
                if (var2.field10998 == null) {
                    var2.field10985--;
                    if (var2.field10985 < (var2.method5423(122) ? -1500 : -10)) {
                        var3 = true;
                    } else {
                        if (var2.field10988 == 1 && var2.field10981 == null) {
                            var2.field10981 = class602.method4411(class551.field8080, var2.field10983, 0);
                            if (var2.field10981 == null) {
                                continue;
                            }
                            var2.field10985 += var2.field10981.method4412();
                        } else if (var2.method5423(80) && (var2.field10986 == null || var2.field10984 == null)) {
                            if (var2.field10986 == null) {
                                var2.field10986 = class306.method2633(class289.field4651, var2.field10983);
                            }
                            if (var2.field10986 == null) {
                                continue;
                            }
                            if (var2.field10984 == null) {
                                var2.field10984 = var2.field10986.method2631(new int[] { 22050 });
                                if (var2.field10984 == null) {
                                    continue;
                                }
                            }
                        }
                        if (var2.field10985 < 0) {
                            int var4 = 8192;
                            int var6;
                            if (var2.field10990 == 0) {
                                var6 = var2.field10982 * (var2.field10988 == 3 ? class623.field8996.field6354.method4796(true) : class623.field8996.field6358.method4796(true)) >> 2;
                            } else {
                                int var5 = (var2.field10990 & 0x3DA6209) >> 24;
                                if (class438.field6846.field9975 == var5) {
                                    int var7 = var2.field10990 & 0xFF << 9;
                                    int var8 = class438.field6846.method804(true) << 8;
                                    int var9 = var2.field10990 >> 16 & 0xFF;
                                    int var10 = (var9 << 9) + 256 - (class438.field6846.field9985 - var8);
                                    int var11 = var2.field10990 >> 8 & 0xFF;
                                    int var12 = (var11 << 9) + var8 + 256 - class438.field6846.field9983;
                                    int var13 = (Math.abs(var10) + Math.abs(var12)) - 512;
                                    if (var13 > var7) {
                                        var2.field10985 = -99999;
                                        continue;
                                    }
                                    if (var13 < 0) {
                                        var13 = 0;
                                    }
                                    var6 = (var7 - var13) * class623.field8996.field6367.method4796(true) * var2.field10982 / var7 >> 2;
                                    if (var2.field10989 != null && var2.field10989 instanceof class185) {
                                        class185 var14 = (class185) var2.field10989;
                                        short var15 = var14.field2946;
                                        short var16 = var14.field2945;
                                    }
                                    if (var10 != 0 || var12 != 0) {
                                        int var17 = (-class728.field10661 - (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                        if (var17 > 8192) {
                                            var17 = 16384 - var17;
                                        }
                                        int var18;
                                        if (var13 <= 0) {
                                            var18 = 8192;
                                        } else if (var13 >= 4096) {
                                            var18 = 16384;
                                        } else {
                                            var18 = ((8192 - var13) / 4096) + 8192;
                                        }
                                        var4 = (16384 - var18 >> 1) + var17 * var18 / 8192;
                                    }
                                } else {
                                    var6 = 0;
                                }
                            }
                            if (var6 > 0) {
                                class357 var19 = null;
                                if (var2.field10988 == 1) {
                                    var19 = var2.field10981.method4410().method2957(class275.field4407);
                                } else if (var2.method5423(102)) {
                                    var19 = var2.field10984;
                                }
                                class675 var20 = var2.field10998 = class675.method4913(var19, var2.field10994, var6, var4);
                                var20.method4909(var2.field10995 - 1);
                                class476.field7253.method2596(var20);
                            }
                        }
                    }
                } else if (!var2.field10998.method4170(arg0 - 23772)) {
                    var3 = true;
                }
                if (var3) {
                    class490.field7395--;
                    for (int var21 = var1; var21 < class490.field7395; var21++) {
                        class771.field11308[var21] = class771.field11308[var21 + 1];
                    }
                    var1--;
                }
            }
            field3241++;
            if (arg0 != 23659) {
                method1873(81, 33, 109, -96);
            }
            if (class127.field1835 && !class453.method3515(arg0 ^ 0xFFFFA394)) {
                if (class623.field8996.field6395.method4796(true) != 0 && class588.field8526 != -1) {
                    if (class391.field6242 == null) {
                        class347.method2901(false, class747.field11028, (byte) -22, class588.field8526, 0, class623.field8996.field6395.method4796(true));
                    } else {
                        class66.method696(0, false, class391.field6242, class623.field8996.field6395.method4796(true), class588.field8526, (byte) 78, class747.field11028);
                    }
                }
                class127.field1835 = false;
                class391.field6242 = null;
            } else if (class623.field8996.field6395.method4796(true) != 0 && class588.field8526 != -1 && !class453.method3515(-1)) {
                class188.field2987++;
                class487 var22 = class618.method4519(64, class760.field11175, class185.field2948.field2659);
                var22.field7362.method1641((byte) -108, class588.field8526);
                class185.field2948.method1546(var22, 1);
                class588.field8526 = -1;
            }
        } catch (RuntimeException var24) {
            throw class590.method4333(var24, field3244[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 348)
    public static final void method1875(byte arg0) {
        try {
            class452.field6991.method863(5, -125);
            field3243++;
            class295.field4813.method5244(5, -25588);
            class6.field55.method960(5, (byte) -72);
            class370.field5999.method3996(30, 5);
            class395.field6267.method3140(true, 5);
            class229.field3563.method525(false, 5);
            class397.field6293.method2056(-1, 5);
            class779.field11366.method1865(false, 5);
            class581.field8375.method722(0, 5);
            class531.field7801.method2077(5, (byte) -81);
            class519.field7687.method3203(5, 9288);
            class46.field518.method3010(-16095, 5);
            class78.field1216.method3184(-16865, 5);
            class362.field5915.method2321((byte) 125, 5);
            class179.field2874.method3727(5, 28886);
            class289.field4655.method95(0, 5);
            class161.field2548.method4539((byte) 120, 5);
            class716.field10360.method4312(5, (byte) -114);
            class653.field9349.method1282(5, 862629443);
            class199.field3154.method5689(113, 5);
            class100.field1465.method1845(false, 5);
            class539.field7911.method1357(5, 44);
            class723.field10619.method873(5, (byte) 66);
            class563.method4131(true, 5);
            class244.method2104(2763, 50);
            class106.method991(4, 50);
            class597.method4370(5, 30013);
            class234.method2034(-42, 5);
            class82.field1252.method294(5, -630);
            if (arg0 >= -1) {
                field3238 = null;
            }
            class738.field10844.method294(5, -630);
            class320.field5210.method294(5, -630);
            class607.field8753.method294(5, -630);
            class598.field8667.method294(5, -630);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3244[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)I", line = 398)
    public static final int method1876(byte arg0, int arg1, int arg2) {
        try {
            field3240++;
            if (arg0 >= -89) {
                method1869(null, (byte) -22);
            }
            int var3 = arg2 >>> 31;
            return (arg2 + var3) / arg1 - var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3244[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1877(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1878(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 126;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 62;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
