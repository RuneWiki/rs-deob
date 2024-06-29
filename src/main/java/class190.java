import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class190 implements class314 {

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3012 = new String[] { method1773(method1772("()Qkm")), method1773(method1772("()Qom")), method1773(method1772("()Qjm")), method1773(method1772("%+\u0013@")), method1773(method1772("()Qhm")), method1773(method1772("0pQ\u00028")), method1773(method1772("()Qnm")), method1773(method1772("()Qim")), method1773(method1772("()Qmm")), method1773(method1772("()Qdm")) };

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "Lvn;")
    public static class330 field2995 = new class330(62, 5);

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "Lat;")
    public static class398 field3010 = new class398();

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "[I")
    public static int[] field3011 = new int[500];

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public int field2996;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public int field3006;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "Z")
    public boolean field3000;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)V")
    public static final void method1764(int arg0) {
        try {
            field2997++;
            class623.field8996.method3244(22733, class623.field8996.field6397, 1);
            class623.field8996.method3244(22733, class623.field8996.field6356, 1);
            class623.field8996.method3244(22733, class623.field8996.field6362, 2);
            class623.field8996.method3244(22733, class623.field8996.field6384, 2);
            class623.field8996.method3244(22733, class623.field8996.field6371, 1);
            class623.field8996.method3244(22733, class623.field8996.field6357, 1);
            if (arg0 != -2137) {
                field2995 = null;
            }
            class623.field8996.method3244(arg0 + 24870, class623.field8996.field6365, 1);
            class623.field8996.method3244(22733, class623.field8996.field6373, 1);
            class623.field8996.method3244(22733, class623.field8996.field6394, 1);
            class623.field8996.method3244(arg0 ^ 0xFFFFAF6A, class623.field8996.field6363, 1);
            class623.field8996.method3244(22733, class623.field8996.field6381, 1);
            class623.field8996.method3244(22733, class623.field8996.field6400, 1);
            class623.field8996.method3244(22733, class623.field8996.field6374, 0);
            class623.field8996.method3244(22733, class623.field8996.field6375, 1);
            class623.field8996.method3244(22733, class623.field8996.field6364, 0);
            class623.field8996.method3244(arg0 ^ 0xFFFFAF6A, class623.field8996.field6352, 0);
            class623.field8996.method3244(22733, class623.field8996.field6385, 1);
            class623.field8996.method3244(22733, class623.field8996.field6404, 0);
            class623.field8996.method3244(arg0 ^ 0xFFFFAF6A, class623.field8996.field6351, 0);
            class214.method1925(2);
            class623.field8996.method3244(22733, class623.field8996.field6383, 1);
            class623.field8996.method3244(22733, class623.field8996.field6388, 3);
            class181.method1710((byte) 116);
            class262.method2282(true);
            class550.field8069 = true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3012[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)J")
    public final long method1765(int arg0) {
        try {
            field3005++;
            long[] var2 = class53.field658;
            if (arg0 < 17) {
                return 2L;
            }
            long var3 = -1L;
            long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field2996) & 0xFFL)];
            long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field3004 >> 8) ^ var5) & 0xFFL)];
            long var9 = var2[(int) (((long) this.field3004 ^ var7) & 0xFFL)] ^ var7 >>> 8;
            long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field3007 >> 24) ^ var9) & 0xFFL)];
            long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field3007 >> 16)) & 0xFFL)];
            long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field3007 >> 8) ^ var13) & 0xFFL)];
            long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field3007) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field2998) & 0xFFL)];
            long var21 = var2[(int) (((long) (this.field2999 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            long var23 = var2[(int) ((var21 ^ (long) (this.field2999 >> 16)) & 0xFFL)] ^ var21 >>> 8;
            long var25 = var2[(int) ((var23 ^ (long) (this.field2999 >> 8)) & 0xFFL)] ^ var23 >>> 8;
            long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field2999 ^ var25) & 0xFFL)];
            long var29 = var2[(int) (((long) this.field3006 ^ var27) & 0xFFL)] ^ var27 >>> 8;
            return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field3000 ? 1 : 0)) & 0xFFL)];
        } catch (RuntimeException var34) {
            throw class590.method4333(var34, field3012[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)[Lpf;")
    public static final class609[] method1766(int arg0) {
        try {
            field3002++;
            if (class333.field5443 == null) {
                class609[] var1 = class624.method4553(class393.field6256, -256);
                class609[] var2 = new class609[var1.length];
                int var3 = 0;
                int var4 = class623.field8996.field6383.method1248(true);
                label93: for (int var5 = 0; var5 < var1.length; var5++) {
                    class609 var6 = var1[var5];
                    if ((var6.field8769 <= 0 || var6.field8769 >= 24) && var6.field8774 >= 800 && var6.field8767 >= 600 && (var4 != 2 || var6.field8774 <= 800 && var6.field8767 <= 600) && (var4 != 1 || var6.field8774 <= 1024 && var6.field8767 <= 768)) {
                        for (int var7 = 0; var7 < var3; var7++) {
                            class609 var8 = var2[var7];
                            if (var6.field8774 == var8.field8774 && var6.field8767 == var8.field8767) {
                                if (var8.field8769 < var6.field8769) {
                                    var2[var7] = var6;
                                }
                                continue label93;
                            }
                        }
                        var2[var3] = var6;
                        var3++;
                    }
                }
                class333.field5443 = new class609[var3];
                class405.method3255(var2, 0, class333.field5443, 0, var3);
                int[] var9 = new int[class333.field5443.length];
                for (int var10 = 0; var10 < class333.field5443.length; var10++) {
                    class609 var11 = class333.field5443[var10];
                    var9[var10] = var11.field8774 * var11.field8767;
                }
                class505.method3807(var9, -1, class333.field5443);
            }
            if (arg0 >= -22) {
                method1768((byte) -51, null);
            }
            return class333.field5443;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field3012[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
    public static void method1767(byte arg0) {
        try {
            field2995 = null;
            field3011 = null;
            field3010 = null;
            int var1 = -49 / ((16 - arg0) / 58);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3012[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B[B)Lkca;")
    public static final class88 method1768(byte arg0, byte[] arg1) {
        try {
            field3009++;
            class88 var2 = new class88();
            class176 var3 = new class176(arg1);
            var3.field2799 = var3.field2805.length - 2;
            int var4 = var3.method1687((byte) -79);
            int var5 = var3.field2805.length - var4 - 18;
            var3.field2799 = var5;
            int var6 = var3.method1622(-18712);
            var2.field1314 = var3.method1687((byte) -39);
            var2.field1318 = var3.method1687((byte) -40);
            var2.field1315 = var3.method1687((byte) -73);
            var2.field1306 = var3.method1687((byte) -53);
            var2.field1309 = var3.method1687((byte) -43);
            var2.field1313 = var3.method1687((byte) -124);
            if (arg0 <= 13) {
                field3011 = null;
            }
            int var7 = var3.method1645((byte) -100);
            if (var7 > 0) {
                var2.field1305 = new class69[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    int var9 = var3.method1687((byte) -116);
                    class69 var10 = new class69(class90.method883((byte) 42, var9));
                    var2.field1305[var8] = var10;
                    while ((var9--) > 0) {
                        int var11 = var3.method1622(-18712);
                        int var12 = var3.method1622(-18712);
                        var10.method738(new class272(var12), (long) var11, -12002);
                    }
                }
            }
            var3.field2799 = 0;
            var2.field1317 = var3.method1666(-97);
            var2.field1308 = new int[var6];
            int var13 = 0;
            while (var5 > var3.field2799) {
                int var14 = var3.method1687((byte) -127);
                if (var14 == 3) {
                    if (var2.field1307 == null) {
                        var2.field1307 = new String[var6];
                    }
                    var2.field1307[var13] = var3.method1635((byte) 83).intern();
                } else if (var14 == 54) {
                    if (var2.field1316 == null) {
                        var2.field1316 = new long[var6];
                    }
                    var2.field1316[var13] = var3.method1658(-24862);
                } else {
                    if (var2.field1312 == null) {
                        var2.field1312 = new int[var6];
                    }
                    if (var14 >= 150 || var14 == 21 || var14 == 38 || var14 == 39) {
                        var2.field1312[var13] = var3.method1645((byte) -125);
                    } else {
                        var2.field1312[var13] = var3.method1622(-18712);
                    }
                }
                var2.field1308[var13++] = var14;
            }
            return var2;
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field3012[7] + arg0 + ',' + (arg1 == null ? field3012[3] : field3012[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILrv;IILip;)V")
    public static final void method1769(int arg0, class117 arg1, int arg2, int arg3, class738 arg4) {
        try {
            field3001++;
            if ((arg0 & 0x20) != 0) {
                int var5 = arg1.method1634((byte) -82);
                if (var5 > 0) {
                    for (int var6 = 0; var6 < var5; var6++) {
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = arg1.method1660(false);
                        if (var10 == 32767) {
                            var10 = arg1.method1660(false);
                            var8 = arg1.method1660(false);
                            var7 = arg1.method1660(false);
                            var9 = arg1.method1660(false);
                        } else if (var10 == 32766) {
                            var10 = -1;
                        } else {
                            var8 = arg1.method1660(false);
                        }
                        int var11 = arg1.method1660(false);
                        int var12 = arg1.method1644((byte) 16);
                        arg4.method812((byte) -37, var11, var10, var12, class431.field6776, var7, var9, var8);
                    }
                }
            }
            byte var13 = -1;
            if ((arg0 & 0x40) != 0) {
                int var14 = arg1.method1687((byte) -49);
                int var15 = arg1.method1628(117);
                if (var14 == 65535) {
                    var14 = -1;
                }
                int var16 = arg1.method1645((byte) -89);
                int var17 = var16 & 0x7;
                int var18 = var16 >> 3 & 0xF;
                if (var18 == 15) {
                    var18 = -1;
                }
                arg4.method795(var17, 0, var15, (byte) 100, var18, var14);
            }
            if ((arg0 & 0x1) != 0) {
                class284.field4605[arg2] = arg1.method1626(110);
            }
            if ((arg0 & 0x200) != 0) {
                int var19 = arg1.method1645((byte) -75);
                int[] var20 = new int[var19];
                int[] var21 = new int[var19];
                int[] var22 = new int[var19];
                for (int var23 = 0; var23 < var19; var23++) {
                    int var24 = arg1.method1654(-118);
                    if (var24 == 65535) {
                        var24 = -1;
                    }
                    var20[var23] = var24;
                    var21[var23] = arg1.method1645((byte) -81);
                    var22[var23] = arg1.method1687((byte) -39);
                }
                class211.method1907(var22, var20, var21, arg4, arg3 + 950);
            }
            if (arg3 != -1076) {
                method1769(126, null, -105, -4, null);
            }
            if ((arg0 & 0x1000) != 0) {
                arg4.field1173 = arg1.method1635((byte) 76);
                if (arg4.field1173.charAt(0) == '~') {
                    arg4.field1173 = arg4.field1173.substring(1);
                    class585.method4297(arg4.method5354(false, 0), arg4.field10813, (byte) 111, 2, arg4.method5361(true, arg3 ^ 0x16AA1D05), arg4.field1173, 0);
                } else if (class438.field6846 == arg4) {
                    class585.method4297(arg4.method5354(false, 0), arg4.field10813, (byte) 86, 2, arg4.method5361(true, -380246327), arg4.field1173, 0);
                }
                arg4.field1133 = 0;
                arg4.field1152 = 0;
                arg4.field1168 = 150;
            }
            if ((arg0 & 0x10) != 0) {
                arg4.field10837 = arg1.method1636(arg3 ^ 0x1945);
                if (arg4.field1205 == 0) {
                    arg4.method800(arg4.field10837, -73);
                    arg4.field10837 = -1;
                }
            }
            if ((arg0 & 0x40000) != 0) {
                arg4.field10853 = arg1.method1645((byte) -101) == 1;
            }
            if ((arg0 & 0x8) != 0) {
                int var25 = arg1.method1634((byte) -34);
                byte[] var26 = new byte[var25];
                class176 var27 = new class176(var26);
                arg1.method1625(var25, var26, 19907, 0);
                class762.field11186[arg2] = var27;
                arg4.method5368(var27, false);
            }
            if ((arg0 & 0x800) != 0) {
                arg4.field10849 = arg1.method1684(true) == 1;
            }
            if ((arg0 & 0x100) != 0) {
                int var28 = arg1.method1670((byte) -114);
                arg4.field1180 = arg1.method1645((byte) -104);
                arg4.field1183 = arg1.method1645((byte) -126);
                arg4.field1134 = var28 & 0x7FFF;
                arg4.field1181 = (var28 & 0x8000) != 0;
                arg4.field1162 = class431.field6776 + arg4.field1134 + arg4.field1180;
            }
            if ((arg0 & 0x2) != 0) {
                int[] var29 = new int[4];
                for (int var30 = 0; var30 < 4; var30++) {
                    var29[var30] = arg1.method1687((byte) -102);
                    if (var29[var30] == 65535) {
                        var29[var30] = -1;
                    }
                }
                int var31 = arg1.method1644((byte) 38);
                class292.method2487(var29, arg4, (byte) 17, var31);
            }
            if ((arg0 & 0x400) != 0) {
                int var32 = arg1.method1654(-122);
                if (var32 == 65535) {
                    var32 = -1;
                }
                int var33 = arg1.method1628(arg3 ^ 0xFFFFFBFD);
                int var34 = arg1.method1684(true);
                int var35 = var34 & 0x7;
                int var36 = (var34 & 0x78) >> 3;
                if (var36 == 15) {
                    var36 = -1;
                }
                arg4.method795(var35, 1, var33, (byte) 110, var36, var32);
            }
            if ((arg0 & 0x4000) != 0) {
                var13 = arg1.method1672(-59);
            }
            if ((arg0 & 0x80) != 0) {
                int var37 = arg1.method1670((byte) -122);
                if (var37 == 65535) {
                    var37 = -1;
                }
                arg4.field1155 = var37;
            }
            if ((arg0 & 0x10000) != 0) {
                arg4.field1111 = arg1.method1656(128);
                arg4.field1159 = arg1.method1626(-43);
                arg4.field1184 = arg1.method1656(128);
                arg4.field1123 = (byte) arg1.method1645((byte) -114);
                arg4.field1146 = class431.field6776 + arg1.method1654(-117);
                arg4.field1112 = class431.field6776 + arg1.method1654(-121);
            }
            if ((arg0 & 0x20000) != 0) {
                int var38 = arg1.method1670((byte) -122);
                int var39 = arg1.method1646((byte) 89);
                if (var38 == 65535) {
                    var38 = -1;
                }
                int var40 = arg1.method1644((byte) 90);
                int var41 = var40 & 0x7;
                int var42 = var40 >> 3 & 0xF;
                if (var42 == 15) {
                    var42 = -1;
                }
                arg4.method795(var41, 2, var39, (byte) 71, var42, var38);
            }
            if ((arg0 & 0x80000) != 0) {
                int var43 = arg1.method1645((byte) -124);
                int[] var44 = new int[var43];
                int[] var45 = new int[var43];
                for (int var46 = 0; var46 < var43; var46++) {
                    int var47 = arg1.method1687((byte) -60);
                    if ((var47 & 0xC000) == 49152) {
                        int var48 = arg1.method1636(-7543);
                        var44[var46] = class553.method4099(var47 << 16, var48);
                    } else {
                        var44[var46] = var47;
                    }
                    var45[var46] = arg1.method1670((byte) -111);
                }
                arg4.method797(false, var44, var45);
            }
            if ((arg0 & 0x2000) != 0) {
                arg4.field1187 = arg1.method1656(128);
                arg4.field1107 = arg1.method1672(arg3 + 1026);
                arg4.field1153 = arg1.method1626(83);
                arg4.field1136 = arg1.method1626(93);
                arg4.field1195 = arg1.method1654(-119) + class431.field6776;
                arg4.field1115 = arg1.method1636(-7543) + class431.field6776;
                arg4.field1170 = arg1.method1684(true);
                if (arg4.field10833) {
                    arg4.field1153 += arg4.field10810;
                    arg4.field1107 += arg4.field10825;
                    arg4.field1205 = 0;
                    arg4.field1187 += arg4.field10810;
                    arg4.field1136 += arg4.field10825;
                } else {
                    arg4.field1205 = 1;
                    arg4.field1107 += arg4.field1200[0];
                    arg4.field1153 += arg4.field1201[0];
                    arg4.field1136 += arg4.field1200[0];
                    arg4.field1187 += arg4.field1201[0];
                }
                arg4.field1208 = 0;
            }
            if (arg4.field10833) {
                if (var13 == 127) {
                    arg4.method5362(arg4.field10810, arg4.field10825, (byte) -59);
                } else {
                    byte var49;
                    if (var13 == -1) {
                        var49 = class284.field4605[arg2];
                    } else {
                        var49 = var13;
                    }
                    class305.method2620(arg3 + 953, var49, arg4);
                    arg4.method5363(var49, arg4.field10810, arg4.field10825, (byte) -99);
                }
            }
        } catch (RuntimeException var51) {
            throw class590.method4333(var51, field3012[4] + arg0 + ',' + (arg1 == null ? field3012[3] : field3012[5]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field3012[3] : field3012[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)I")
    public static final int method1770(int arg0, int arg1, int arg2) {
        try {
            field3003++;
            arg2 = (arg0 & 0x7F) * arg2 >> 7;
            if (arg1 != 1) {
                return -41;
            }
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return (arg0 & 0xFF80) + arg2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3012[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lnba;Z)Z")
    public final boolean method1771(class314 arg0, boolean arg1) {
        try {
            field3008++;
            if (!(arg0 instanceof class190)) {
                return false;
            }
            if (!arg1) {
                this.method1771(null, false);
            }
            class190 var3 = (class190) arg0;
            if (this.field2996 != var3.field2996) {
                return false;
            } else if (this.field3004 != var3.field3004) {
                return false;
            } else if (this.field3007 != var3.field3007) {
                return false;
            } else if (this.field2998 != var3.field2998) {
                return false;
            } else if (this.field2999 != var3.field2999) {
                return false;
            } else if (this.field3006 == var3.field3006) {
                return this.field3000 == var3.field3000;
            } else {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3012[8] + (arg0 == null ? field3012[3] : field3012[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1772(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1773(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 94;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
