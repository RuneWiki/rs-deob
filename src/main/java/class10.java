import java.awt.Component;
import java.awt.Graphics;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[I")
    private int[] field279;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field278 = -1;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lfc;")
    public static class39 field283 = class90.method774("k", -106);

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field291 = 0;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lfc;")
    private static class39 field284 = class90.method774("No response from server)3", -109);

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Lfc;")
    private static class39 field288 = class90.method774("Too many incorrect logins from your address)3", -84);

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lfc;")
    private static class39 field281 = class90.method774("Enter amount:", -121);

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "[I")
    public static int[] field289 = new int[1000];

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lfc;")
    public static class39 field280 = field288;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lfc;")
    public static class39 field292 = field284;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lfc;")
    public static class39 field287 = field281;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "[Lb;")
    public static class8[] field296 = new class8[1000];

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 4)
    public static void method135(int arg0) {
        field288 = null;
        field287 = null;
        field296 = null;
        field283 = null;
        field280 = null;
        field289 = null;
        field281 = null;
        if (arg0 > -76) {
            method139(91, -82, (byte) -83);
        }
        field284 = null;
        field292 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILtc;Ldc;)V", line = 29)
    public static final void method136(int arg0, int arg1, class133 arg2, class25 arg3) {
        field282++;
        class44 var4 = new class44();
        var4.field1216 = arg3.method322((byte) -50);
        var4.field1208 = arg3.method313((byte) -110);
        var4.field1191 = new int[var4.field1216];
        var4.field1196 = new int[var4.field1216];
        var4.field1209 = new class81[var4.field1216];
        var4.field1192 = new int[var4.field1216];
        var4.field1193 = new class81[var4.field1216];
        if (arg0 > -105) {
            method139(-34, -62, (byte) -33);
        }
        var4.field1190 = new byte[var4.field1216][][];
        for (int var5 = 0; var5 < var4.field1216; var5++) {
            try {
                int var6 = arg3.method322((byte) -50);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg3.method304(-127).method477(23242));
                    String var8 = new String(arg3.method304(-126).method477(23242));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method313((byte) -94);
                    }
                    var4.field1196[var5] = var6;
                    var4.field1192[var5] = var9;
                    var4.field1209[var5] = arg2.method1079(class116.method1006(var7, 86), 124, var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg3.method304(-128).method477(23242));
                    String var11 = new String(arg3.method304(-128).method477(23242));
                    int var12 = arg3.method322((byte) -50);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg3.method304(-128).method477(23242));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method313((byte) -86);
                            var15[var16] = new byte[var17];
                            arg3.method305(0, (byte) 59, var15[var16], var17);
                        }
                    }
                    var4.field1196[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class116.method1006(var13[var19], 119);
                    }
                    var4.field1193[var5] = arg2.method1084(class116.method1006(var10, 68), 0, var18, var11);
                    var4.field1190[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1191[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1191[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1191[var5] = -3;
            } catch (Exception var23) {
                var4.field1191[var5] = -4;
            } catch (Throwable var24) {
                var4.field1191[var5] = -5;
            }
        }
        class28.field791.method19(var4, 7);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 142)
    public static final void method137(int arg0, Component arg1) {
        field295++;
        Method var2 = class133.field3349;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class13.field331);
        arg1.addFocusListener(class13.field331);
        if (arg0 != -2) {
            field281 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 164)
    public static final void method138(int arg0) {
        try {
            Graphics var1 = class140.field3523.getGraphics();
            class42.field1145.method129(var1, 4, 4, (byte) -124);
        } catch (Exception var2) {
            class140.field3523.repaint();
        }
        field293++;
        if (arg0 != -1) {
            method138(41);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIB)I", line = 185)
    public static final int method139(int arg0, int arg1, byte arg2) {
        if (arg2 >= -55) {
            field288 = null;
        }
        field286++;
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 214)
    public static final void method140(boolean arg0) {
        class56.field1396++;
        if (!arg0) {
            method142(null, null, -83);
        }
        field290++;
        class79.field1794.method393((byte) -14, 13);
        if (class37.field1018 != -1) {
            class116.method1012(class37.field1018, (byte) 60);
            class142.field3564 = true;
            class104.field2638 = true;
            class37.field1018 = -1;
            class37.field1010 = -1;
        }
        if (class37.field1008 != -1) {
            class116.method1012(class37.field1008, (byte) 96);
            class37.field1008 = -1;
            class128.field3242 = true;
            class37.field1010 = -1;
        }
        if (class78.field1777 != -1) {
            class116.method1012(class78.field1777, (byte) 111);
            class78.field1777 = -1;
            class114.method990((byte) -113, 30);
        }
        if (class108.field2708 != -1) {
            class116.method1012(class108.field2708, (byte) 62);
            class108.field2708 = -1;
        }
        if (class126.field3198 != -1) {
            class116.method1012(class126.field3198, (byte) 118);
            class126.field3198 = -1;
            class37.field1010 = -1;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([I)V", line = 268)
    public class10(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field279 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field279[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field279[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field279[var5 + var5] = arg0[var4];
            this.field279[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)I", line = 304)
    public final int method141(byte arg0, int arg1) {
        field285++;
        int var3 = 3 / ((-arg0 - 3) / 46);
        int var4 = this.field279.length - 2;
        int var5 = var4 & arg1 << 1;
        while (true) {
            int var6 = this.field279[var5];
            if (arg1 == var6) {
                return this.field279[var5 + 1];
            }
            if (var6 == -1) {
                return -1;
            }
            var5 = var5 + 2 & var4;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([Lod;Lac;I)V", line = 360)
    public static final void method142(class101[] arg0, class4 arg1, int arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class137.field3424[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class137.field3424[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method873(var111, 65536, var110);
                        }
                    }
                }
            }
        }
        class112.field2956 += (int) (Math.random() * 5.0D) - 2;
        if (class112.field2956 < -16) {
            class112.field2956 = -16;
        }
        if (class112.field2956 > 16) {
            class112.field2956 = 16;
        }
        class12.field325 += (int) (Math.random() * 5.0D) - 2;
        field294++;
        if (class12.field325 < -8) {
            class12.field325 = -8;
        }
        if (class12.field325 > 8) {
            class12.field325 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class31.field870[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class7.field219[var4][var101 + 1][var50] - class7.field219[var4][var101 - 1][var50];
                    int var103 = class7.field219[var4][var101][var50 + 1] - class7.field219[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = (var47[var101 - 1][var50] >> 2) + (var47[var101 + 1][var50] >> 3) + (var47[var101][var50 + -1] >> 2) + (var47[var101][var50 + 1] >> 3) + (var47[var101][var50] >> 1);
                    int var107 = 65536 / var104;
                    int var108 = (var102 << 8) / var104;
                    int var109 = (var107 * -10 + var108 * -50 + var105 * -50) / var49 + 96;
                    class42.field1152[var101][var50] = var109 - var106;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class112.field2947[var51] = 0;
                class16.field461[var51] = 0;
                class25.field724[var51] = 0;
                class83.field1846[var51] = 0;
                class142.field3566[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class98.field2331[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class18 var97 = class134.method1090(var96 - 1, (byte) 102);
                            class112.field2947[var55] += var97.field517;
                            class16.field461[var55] += var97.field511;
                            class25.field724[var55] += var97.field500;
                            class83.field1846[var55] += var97.field499;
                            var10002 = class142.field3566[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class98.field2331[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class18 var100 = class134.method1090(var99 - 1, (byte) 77);
                            class112.field2947[var55] -= var100.field517;
                            class16.field461[var55] -= var100.field511;
                            class25.field724[var55] -= var100.field500;
                            class83.field1846[var55] -= var100.field499;
                            var10002 = class142.field3566[var55]--;
                        }
                    }
                }
                if (var52 >= 1 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; var61++) {
                        int var62 = var61 + 5;
                        if (var62 >= 0 && var62 < 104) {
                            var59 += class25.field724[var62];
                            var56 += class112.field2947[var62];
                            var60 += class83.field1846[var62];
                            var57 += class16.field461[var62];
                            var58 += class142.field3566[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var57 -= class16.field461[var63];
                            var59 -= class25.field724[var63];
                            var60 -= class83.field1846[var63];
                            var56 -= class112.field2947[var63];
                            var58 -= class142.field3566[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class74.field1705 || (class137.field3424[0][var52][var61] & 0x2) != 0 || (class137.field3424[var4][var52][var61] & 0x10) == 0 && class71.method657(var52, arg2 + 11526, var61, var4) == class94.field2207)) {
                            if (class143.field3595 > var4) {
                                class143.field3595 = var4;
                            }
                            int var64 = class98.field2331[var4][var52][var61] & 0xFF;
                            int var65 = class43.field1171[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class7.field219[var4][var52][var61];
                                int var67 = class7.field219[var4][var52 + 1][var61];
                                int var68 = class7.field219[var4][var52 + 1][var61 + 1];
                                int var69 = class42.field1152[var52][var61];
                                int var70 = class7.field219[var4][var52][var61 + 1];
                                int var71 = class42.field1152[var52 + 1][var61];
                                int var72 = class42.field1152[var52][var61 + 1];
                                int var73 = class42.field1152[var52 + 1][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var60;
                                    int var77 = var59 / var58;
                                    int var78 = var57 / var58;
                                    var74 = class77.method678(var77, arg2 - 5194, var78, var76);
                                    int var79 = class12.field325 + var76 & 0xFF;
                                    int var80 = class112.field2956 + var77;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var75 = class77.method678(var80, -103, var78, var79);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class44.field1199[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class110.method971(var65 - 1, (byte) 95).field220) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var70) {
                                        class112.field2934[var4][var52][var61] = class126.method1050(class112.field2934[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class40.field1120[class60.method603(var75, 96, false)];
                                }
                                if (var65 == 0) {
                                    arg1.method78(var4, var52, var61, 0, 0, -1, var66, var67, var68, var70, class60.method603(var74, var69, false), class60.method603(var74, var71, false), class60.method603(var74, var73, false), class60.method603(var74, var72, false), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class44.field1199[var4][var52][var61] + 1;
                                    byte var84 = class29.field836[var4][var52][var61];
                                    class7 var85 = class110.method971(var65 - 1, (byte) 76);
                                    int var86 = var85.field228;
                                    int var87;
                                    int var90;
                                    if (var86 >= 0) {
                                        var90 = class40.field1110.method738(true, var86);
                                        var87 = -1;
                                    } else if (var85.field230 == 16711935) {
                                        var87 = -2;
                                        var90 = -2;
                                        var86 = -1;
                                    } else {
                                        var87 = class77.method678(var85.field218, -123, var85.field209, var85.field211);
                                        int var88 = class12.field325 + var85.field211 & 0xFF;
                                        int var89 = class112.field2956 + var85.field218;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var90 = class77.method678(var89, -119, var85.field209, var88);
                                    }
                                    int var91 = 0;
                                    if (var90 != -2) {
                                        var91 = class40.field1120[class75.method670(96, 0, var90)];
                                    }
                                    if (var85.field224 != -1) {
                                        int var92 = class12.field325 + var85.field215 & 0xFF;
                                        int var93 = var85.field210 + class112.field2956;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class77.method678(var93, -119, var85.field223, var92);
                                        var91 = class40.field1120[class75.method670(96, 0, var94)];
                                    }
                                    arg1.method78(var4, var52, var61, var83, var84, var86, var66, var67, var68, var70, class60.method603(var74, var69, false), class60.method603(var74, var71, false), class60.method603(var74, var73, false), class60.method603(var74, var72, false), class75.method670(var69, arg2 ^ 0x13EC, var87), class75.method670(var71, 0, var87), class75.method670(var73, 0, var87), class75.method670(var72, 0, var87), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg1.method54(var4, var54, var53, class71.method657(var54, 16626, var53, var4));
                }
            }
            class98.field2331[var4] = null;
            class43.field1171[var4] = null;
            class44.field1199[var4] = null;
            class29.field836[var4] = null;
            class31.field870[var4] = null;
        }
        arg1.method47(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class137.field3424[1][var5][var46] & 0x2) == 2) {
                    arg1.method56(var5, var46);
                }
            }
        }
        if (arg2 != 5100) {
            method139(-51, 29, (byte) -61);
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var6 <<= 0x3;
                var8 <<= 0x3;
                var7 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class112.field2934[var10][var12][var11] & var6) != 0) {
                            int var13 = var11;
                            int var14 = var11;
                            while (var13 < 104 && (var6 & class112.field2934[var10][var12][var13 + 1]) != 0) {
                                var13++;
                            }
                            int var15 = var10;
                            int var16 = var10;
                            while (var14 > 0 && (class112.field2934[var10][var12][var14 - 1] & var6) != 0) {
                                var14--;
                            }
                            label356: while (var15 > 0) {
                                for (int var17 = var14; var17 <= var13; var17++) {
                                    if ((var6 & class112.field2934[var15 - 1][var12][var17]) == 0) {
                                        break label356;
                                    }
                                }
                                var15--;
                            }
                            label345: while (var16 < var9) {
                                for (int var18 = var14; var18 <= var13; var18++) {
                                    if ((class112.field2934[var16 + 1][var12][var18] & var6) == 0) {
                                        break label345;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var16 + 1 - var15) * (var13 + 1 - var14);
                            if (var19 >= 8) {
                                int var20 = class7.field219[var15][var12][var14];
                                short var21 = 240;
                                int var22 = class7.field219[var16][var12][var14] - var21;
                                class4.method60(var9, 1, var12 * 128, var12 * 128, var14 * 128, var13 * 128 + 128, var22, var20);
                                for (int var23 = var15; var23 <= var16; var23++) {
                                    for (int var24 = var14; var24 <= var13; var24++) {
                                        class112.field2934[var23][var12][var24] = class87.method747(class112.field2934[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class112.field2934[var10][var12][var11] & var7) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (var7 & class112.field2934[var10][var25 - 1][var11]) != 0; var25--) {
                            }
                            int var26;
                            for (var26 = var12; var26 < 104 && (var7 & class112.field2934[var10][var26 + 1][var11]) != 0; var26++) {
                            }
                            int var27;
                            label411: for (var27 = var10; var27 > 0; var27--) {
                                for (int var28 = var25; var28 <= var26; var28++) {
                                    if ((var7 & class112.field2934[var27 - 1][var28][var11]) == 0) {
                                        break label411;
                                    }
                                }
                            }
                            int var29;
                            label399: for (var29 = var10; var29 < var9; var29++) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((var7 & class112.field2934[var29 + 1][var30][var11]) == 0) {
                                        break label399;
                                    }
                                }
                            }
                            int var31 = (var29 + 1 - var27) * (var26 + 1 - var25);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class7.field219[var29][var25][var11] - var32;
                                int var34 = class7.field219[var27][var25][var11];
                                class4.method60(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var29; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class112.field2934[var35][var36][var11] = class87.method747(class112.field2934[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class112.field2934[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39 = var11;
                            int var40;
                            for (var40 = var11; var40 < 104 && (var8 & class112.field2934[var10][var12][var40 + 1]) != 0; var40++) {
                            }
                            while (var39 > 0 && (class112.field2934[var10][var12][var39 - 1] & var8) != 0) {
                                var39--;
                            }
                            label466: while (var37 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((class112.field2934[var10][var37 - 1][var41] & var8) == 0) {
                                        break label466;
                                    }
                                }
                                var37--;
                            }
                            label455: while (var38 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((var8 & class112.field2934[var10][var38 + 1][var42]) == 0) {
                                        break label455;
                                    }
                                }
                                var38++;
                            }
                            if ((var40 + 1 - var39) * (-var37 + 1 + var38) >= 4) {
                                int var43 = class7.field219[var10][var37][var39];
                                class4.method60(var9, 4, var37 * 128, var38 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var38; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class112.field2934[var10][var44][var45] = class87.method747(class112.field2934[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
