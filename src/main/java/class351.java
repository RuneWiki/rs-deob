import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class351 {

    @OriginalMember(owner = "client!fia", name = "l", descriptor = "Ldp;")
    private class514 field5095 = new class514();

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
    private int field5092;

    @OriginalMember(owner = "client!fia", name = "q", descriptor = "I")
    private int field5094;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "Ldfa;")
    private class477 field5079;

    @OriginalMember(owner = "client!fia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5097 = new String[] { method2813(method2812("+2b/")), method2813(method2812(">i m\r")), method2813(method2812("#.om6m")), method2813(method2812("#.om4m")), method2813(method2812("#.om3m")), method2813(method2812("#.om;m")), method2813(method2812("#.om7m")), method2813(method2812("#.om5m")), method2813(method2812("6ym0")), method2813(method2812("#.om2m")), method2813(method2812("#.om=m")), method2813(method2812("#.om9m")), method2813(method2812("#.omL,)g7Nm")), method2813(method2812("#.om8m")), method2813(method2812("#.om:m")), method2813(method2812("#.om<m")), method2813(method2812("#.om1m")) };

    @OriginalMember(owner = "client!fia", name = "p", descriptor = "I")
    public static int field5087 = -1;

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "Z")
    public static boolean field5091 = false;

    @OriginalMember(owner = "client!fia", name = "m", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!fia", name = "o", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!fia", name = "n", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!fia", name = "k", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!fia", name = "s", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!fia", name = "r", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!fia", name = "j", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "Lqda;")
    public static class678 field5086;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)V", line = 3)
    public static void method2799(int arg0) {
        try {
            field5086 = null;
            int var1 = -107 / ((-arg0 - 43) / 56);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5097[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lrc;Ljava/lang/Object;B)V", line = 12)
    public final void method2800(class131 arg0, Object arg1, byte arg2) {
        try {
            this.method2808(arg2 ^ 0x1C, 1, arg0, arg1);
            if (arg2 == 28) {
                field5088++;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5097[4] + (arg0 == null ? field5097[0] : field5097[1]) + ',' + (arg1 == null ? field5097[0] : field5097[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IB)V", line = 24)
    public final void method2801(int arg0, byte arg1) {
        try {
            if (arg1 < 61) {
                this.method2808(-110, -86, null, null);
            }
            if (class58.field817 != null) {
                for (class276 var3 = (class276) this.field5095.method3932((byte) -88); var3 != null; var3 = (class276) this.field5095.method3939((byte) -75)) {
                    if (var3.method2254((byte) 86)) {
                        if (var3.method2253((byte) -71) == null) {
                            var3.method4294(0);
                            var3.method4911(119);
                            this.field5094 += var3.field3896;
                        }
                    } else if (++var3.field9630 > (long) arg0) {
                        class276 var4 = class58.field817.method541(var3, (byte) 72);
                        this.field5079.method3691(var4, var3.field8378, -1);
                        class603.method4461(115, var4, var3);
                        var3.method4294(0);
                        var3.method4911(122);
                    }
                }
            }
            field5081++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5097[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(BLg;)V", line = 73)
    private final void method2802(byte arg0, class276 arg1) {
        try {
            field5093++;
            if (arg1 != null) {
                arg1.method4294(0);
                arg1.method4911(125);
                this.field5094 += arg1.field3896;
            }
            if (arg0 >= -40) {
                method2807(-97, -14, -2, 34, -99, 123, 103, -120, 104, 114, null);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5097[9] + arg0 + ',' + (arg1 == null ? field5097[0] : field5097[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIB)I", line = 92)
    public static final int method2803(int arg0, int arg1, byte arg2) {
        try {
            field5096++;
            if (arg2 == -78) {
                int var3 = class570.method4249(arg1 - 1, arg0 + -1, (byte) 123) + class570.method4249(arg1 - 1, arg0 + 1, (byte) 124) + class570.method4249(arg1 - -1, arg0 + -1, (byte) 69) + class570.method4249(arg1 + 1, arg0 + 1, (byte) 52);
                int var4 = class570.method4249(arg1, arg0 - 1, (byte) 120) + class570.method4249(arg1, arg0 + 1, (byte) -65) + (class570.method4249(arg1 + -1, arg0, (byte) -113) - -class570.method4249(arg1 + 1, arg0, (byte) -68));
                int var5 = class570.method4249(arg1, arg0, (byte) 84);
                return var3 / 16 + var4 / 8 + var5 / 4;
            } else {
                return -5;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5097[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lrc;I)V", line = 113)
    private final void method2804(class131 arg0, int arg1) {
        try {
            field5082++;
            long var3 = arg0.method1149(-28201);
            if (arg1 != -1) {
                this.field5094 = -3;
            }
            for (class276 var5 = (class276) this.field5079.method3693(false, var3); var5 != null; var5 = (class276) this.field5079.method3699(-1)) {
                if (var5.field3895.method1148(8110, arg0)) {
                    this.method2802((byte) -101, var5);
                    return;
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5097[2] + (arg0 == null ? field5097[0] : field5097[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V", line = 146)
    public final void method2805(int arg0) {
        try {
            if (arg0 != 9) {
                field5091 = false;
            }
            for (class276 var2 = (class276) this.field5095.method3932((byte) -47); var2 != null; var2 = (class276) this.field5095.method3939((byte) -75)) {
                if (var2.method2254((byte) 98)) {
                    var2.method4294(0);
                    var2.method4911(117);
                    this.field5094 += var2.field3896;
                }
            }
            field5080++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5097[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)V", line = 172)
    public final void method2806(byte arg0) {
        try {
            field5083++;
            this.field5095.method3936((byte) -88);
            this.field5079.method3690((byte) 106);
            this.field5094 = this.field5092;
            if (arg0 <= 7) {
                field5087 = -113;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5097[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIIIIIIIIILuda;)Z", line = 185)
    public static final boolean method2807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class302 arg10) {
        try {
            field5085++;
            int var11 = arg0;
            int var12 = arg6;
            if (arg8 != 1) {
                method2807(54, 126, -88, -115, 108, -32, -87, 72, -54, 57, null);
            }
            byte var13 = 64;
            byte var14 = 64;
            int var15 = arg0 - var13;
            class393.field5717[var13][var14] = 99;
            int var16 = arg6 - var14;
            class481.field7084[var13][var14] = 0;
            byte var17 = 0;
            class796.field11576[var17] = arg0;
            int var18 = 0;
            byte var10001 = var17;
            int var28 = var17 + 1;
            class356.field5171[var10001] = arg6;
            int[][] var19 = arg10.field4202;
            while (var28 != var18) {
                var11 = class796.field11576[var18];
                var12 = class356.field5171[var18];
                int var20 = var12 - var16;
                int var21 = var11 - arg10.field4214;
                int var22 = var12 - arg10.field4196;
                var18 = var18 + 1 & 0xFFF;
                int var23 = var11 - var15;
                if (arg2 == -4) {
                    if (arg3 == var11 && arg7 == var12) {
                        class654.field9282 = var12;
                        class263.field3716 = var11;
                        return true;
                    }
                } else if (arg2 == -3) {
                    if (class801.method5778(1, var11, var12, 1, arg3, arg9, arg7, (byte) 127, arg1)) {
                        class654.field9282 = var12;
                        class263.field3716 = var11;
                        return true;
                    }
                } else if (arg2 == -2) {
                    if (arg10.method2416(arg7, (byte) -69, arg4, arg1, arg3, var11, 1, 1, arg9, var12)) {
                        class654.field9282 = var12;
                        class263.field3716 = var11;
                        return true;
                    }
                } else if (arg2 == -1) {
                    if (arg10.method2422(arg7, var12, arg1, var11, 1, arg3, arg4, false, arg9)) {
                        class263.field3716 = var11;
                        class654.field9282 = var12;
                        return true;
                    }
                } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                    if (arg10.method2424(var12, arg5, arg3, 0, var11, arg7, arg2, 1)) {
                        class263.field3716 = var11;
                        class654.field9282 = var12;
                        return true;
                    }
                } else if (arg10.method2430(false, var11, arg5, var12, arg2, arg3, 1, arg7)) {
                    class263.field3716 = var11;
                    class654.field9282 = var12;
                    return true;
                }
                int var25 = class481.field7084[var23][var20] + 1;
                if (var23 > 0 && class393.field5717[var23 - 1][var20] == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0) {
                    class796.field11576[var28] = var11 - 1;
                    class356.field5171[var28] = var12;
                    var28 = var28 + 1 & 0xFFF;
                    class393.field5717[var23 - 1][var20] = 2;
                    class481.field7084[var23 - 1][var20] = var25;
                }
                if (var23 < 127 && class393.field5717[var23 + 1][var20] == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0) {
                    class796.field11576[var28] = var11 + 1;
                    class356.field5171[var28] = var12;
                    var28 = var28 + 1 & 0xFFF;
                    class393.field5717[var23 + 1][var20] = 8;
                    class481.field7084[var23 + 1][var20] = var25;
                }
                if (var20 > 0 && class393.field5717[var23][var20 - 1] == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                    class796.field11576[var28] = var11;
                    class356.field5171[var28] = var12 - 1;
                    var28 = var28 + 1 & 0xFFF;
                    class393.field5717[var23][var20 - 1] = 1;
                    class481.field7084[var23][var20 - 1] = var25;
                }
                if (var20 < 127 && class393.field5717[var23][var20 + 1] == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                    class796.field11576[var28] = var11;
                    class356.field5171[var28] = var12 + 1;
                    class393.field5717[var23][var20 + 1] = 4;
                    var28 = var28 + 1 & 0xFFF;
                    class481.field7084[var23][var20 + 1] = var25;
                }
                if (var23 > 0 && var20 > 0 && class393.field5717[var23 - 1][var20 - 1] == 0 && (var19[var21 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                    class796.field11576[var28] = var11 - 1;
                    class356.field5171[var28] = var12 - 1;
                    var28 = var28 + 1 & 0xFFF;
                    class393.field5717[var23 - 1][var20 - 1] = 3;
                    class481.field7084[var23 - 1][var20 - 1] = var25;
                }
                if (var23 < 127 && var20 > 0 && class393.field5717[var23 + 1][var20 - 1] == 0 && (var19[var21 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                    class796.field11576[var28] = var11 + 1;
                    class356.field5171[var28] = var12 - 1;
                    class393.field5717[var23 + 1][var20 - 1] = 9;
                    var28 = var28 + 1 & 0xFFF;
                    class481.field7084[var23 + 1][var20 - 1] = var25;
                }
                if (var23 > 0 && var20 < 127 && class393.field5717[var23 - 1][var20 + 1] == 0 && (var19[var21 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                    class796.field11576[var28] = var11 - 1;
                    class356.field5171[var28] = var12 + 1;
                    class393.field5717[var23 - 1][var20 + 1] = 6;
                    var28 = var28 + 1 & 0xFFF;
                    class481.field7084[var23 - 1][var20 + 1] = var25;
                }
                if (var23 < 127 && var20 < 127 && class393.field5717[var23 + 1][var20 + 1] == 0 && (var19[var21 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                    class796.field11576[var28] = var11 + 1;
                    class356.field5171[var28] = var12 + 1;
                    class393.field5717[var23 + 1][var20 + 1] = 12;
                    var28 = var28 + 1 & 0xFFF;
                    class481.field7084[var23 + 1][var20 + 1] = var25;
                }
            }
            class654.field9282 = var12;
            class263.field3716 = var11;
            return false;
        } catch (RuntimeException var27) {
            throw class665.method4799(var27, field5097[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field5097[0] : field5097[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IILrc;Ljava/lang/Object;)V", line = 440)
    private final void method2808(int arg0, int arg1, class131 arg2, Object arg3) {
        try {
            field5084++;
            if (this.field5092 < arg1) {
                throw new IllegalStateException(field5097[8]);
            }
            this.method2804(arg2, -1);
            this.field5094 -= arg1;
            while (this.field5094 < 0) {
                class276 var5 = (class276) this.field5095.method3938((byte) -91);
                this.method2802((byte) -94, var5);
            }
            class372 var6 = new class372(arg2, arg3, arg1);
            this.field5079.method3691(var6, arg2.method1149(arg0 - 28201), -1);
            this.field5095.method3937(true, var6);
            var6.field9630 = arg0;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5097[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5097[0] : field5097[1]) + ',' + (arg3 == null ? field5097[0] : field5097[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)I", line = 467)
    public final int method2809(int arg0) {
        try {
            field5089++;
            return arg0 >= -120 ? -63 : this.field5094;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5097[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(BLrc;)Ljava/lang/Object;", line = 478)
    public final Object method2810(byte arg0, class131 arg1) {
        try {
            field5090++;
            long var3 = arg1.method1149(-28201);
            class276 var5 = (class276) this.field5079.method3693(false, var3);
            if (arg0 != 11) {
                this.field5079 = null;
            }
            while (var5 != null) {
                if (var5.field3895.method1148(8110, arg1)) {
                    Object var6 = var5.method2253((byte) -71);
                    if (var6 != null) {
                        if (var5.method2254((byte) -78)) {
                            class372 var7 = new class372(arg1, var6, var5.field3896);
                            this.field5079.method3691(var7, var5.field8378, arg0 - 12);
                            this.field5095.method3937(true, var7);
                            var7.field9630 = 0L;
                            var5.method4294(0);
                            var5.method4911(121);
                        } else {
                            this.field5095.method3937(true, var5);
                            var5.field9630 = 0L;
                        }
                        return var6;
                    }
                    var5.method4294(0);
                    var5.method4911(127);
                    this.field5094 += var5.field3896;
                }
                var5 = (class276) this.field5079.method3699(-1);
            }
            return null;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5097[6] + arg0 + ',' + (arg1 == null ? field5097[0] : field5097[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(I)V", line = 542)
    public class351(int arg0) {
        try {
            this.field5092 = arg0;
            this.field5094 = arg0;
            int var2;
            for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
            }
            this.field5079 = new class477(var2);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5097[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "(I)I", line = 533)
    public final int method2811(int arg0) {
        try {
            field5078++;
            int var2 = 11 / ((arg0 + 60) / 54);
            return this.field5092;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5097[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2812(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2813(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 14;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
