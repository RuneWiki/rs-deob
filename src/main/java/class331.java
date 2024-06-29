import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class331 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field5106 = 0;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "[Z")
    public static boolean[] field5117 = new boolean[100];

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5105 = "Allocated memory";

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "F")
    public static float field5115;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Ljd;")
    public static class95 field5112;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "[I")
    public static int[] field5116;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 10)
    public static final void method2307(byte arg0) {
        field5118++;
        while (class204.field3136.method1135(class241.field3679, (byte) 42) >= 11) {
            int var1 = class204.field3136.method1132(11, 126);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class201.field3096[var1] == null) {
                var2 = true;
                class201.field3096[var1] = new class270();
                if (class210.field3219[var1] != null) {
                    class201.field3096[var1].method1890((byte) 103, class210.field3219[var1]);
                }
            }
            class291.field4475[class234.field3563++] = var1;
            class270 var3 = class201.field3096[var1];
            var3.field4711 = class233.field3542;
            int var4 = class204.field3136.method1132(5, 114);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class204.field3136.method1132(1, 114);
            if (var5 == 1) {
                class219.field3351[class67.field970++] = var1;
            }
            int var6 = class204.field3136.method1132(5, 127);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class324.field5000[class204.field3136.method1132(3, 118)];
            if (var2) {
                var3.field4674 = var3.field4682 = var7;
            }
            int var8 = class204.field3136.method1132(1, 112);
            var3.method1893(var8 == 1, class39.field575.field4744[0] + var6, (byte) -46, class39.field575.field4676[0] + var4);
        }
        class204.field3136.method1133(8);
        if (arg0 <= 86) {
            method2309((String) null, true);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Lmn;", line = 79)
    public static final class161 method2308(byte arg0, int arg1) {
        int var2 = -31 / ((arg0 + 80) / 40);
        field5107++;
        int var3 = arg1 & 0xFFFF;
        int var4 = arg1 >> 16;
        if (class8.field128[var4] == null || class8.field128[var4][var3] == null) {
            boolean var5 = class154.method1161(var4, 97);
            if (!var5) {
                return null;
            }
        }
        return class8.field128[var4][var3];
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 102)
    public static final byte[] method2309(String arg0, boolean arg1) {
        field5114++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (!arg1) {
            method2313(true);
        }
        while (var2 > var4) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIBI)V", line = 248)
    public static final void method2310(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field5111++;
        if (arg4 != -125) {
            method2308((byte) -86, -35);
        }
        int var8 = arg1 + 1;
        class7.method72(arg0, -7, arg3, class79.field1178[arg1], arg5);
        int var9 = arg2 - 1;
        class7.method72(arg0, -7, arg3, class79.field1178[arg2], arg5);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class79.field1178[var6];
            var7[arg3] = var7[arg0] = arg5;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V", line = 277)
    public static final void method2311(int arg0, boolean arg1) {
        field5110++;
        if (class106.field1540 == 0) {
            class216.field3310.method459(arg0, -3);
        } else {
            class23.field260 = arg0;
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZB)V", line = 294)
    public static final void method2312(boolean arg0, byte arg1) {
        field5109++;
        class76.field1113 = arg0;
        if (arg1 != 61) {
            return;
        }
        if (!class76.field1113) {
            int var2 = (class241.field3679 - class204.field3136.field3866) / 16;
            class187.field2946 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    class187.field2946[var3][var4] = class204.field3136.method1727(arg1 + 6155);
                }
            }
            boolean var5 = class48.method369((byte) -119, class204.field3136.method1746((byte) -65));
            boolean var6 = false;
            int var7 = class204.field3136.method1760(arg1 - 62);
            int var8 = class204.field3136.method1728((byte) 50);
            int var9 = class204.field3136.method1755(false);
            int var10 = class204.field3136.method1770(-1909516320);
            int var11 = class204.field3136.method1728((byte) 50);
            class322.field4963 = new byte[var2][];
            class51.field683 = new int[var2];
            class238.field3623 = (byte[][]) null;
            class299.field4605 = new byte[var2][];
            field5116 = new int[var2];
            if (((var9 / 8) == 48 || (var9 / 8) == 49) && (var11 / 8) == 48) {
                var6 = true;
            }
            if (var9 / 8 == 48 && var11 / 8 == 148) {
                var6 = true;
            }
            class110.field1653 = null;
            class137.field2069 = new byte[var2][];
            class63.field854 = new int[var2];
            class139.field2087 = new int[var2];
            class226.field3459 = new int[var2];
            class5.field67 = new byte[var2][];
            int var12 = 0;
            for (int var13 = (var9 - 6) / 8; var13 <= ((var9 + 6) / 8); var13++) {
                for (int var14 = (var11 - 6) / 8; var14 <= ((var11 + 6) / 8); var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var6 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class139.field2087[var12] = var15;
                        class63.field854[var12] = -1;
                        class51.field683[var12] = -1;
                        field5116[var12] = -1;
                        class226.field3459[var12] = -1;
                    } else {
                        class139.field2087[var12] = var15;
                        class63.field854[var12] = class153.field2329.method690((byte) -115, "m" + var13 + "_" + var14);
                        class51.field683[var12] = class153.field2329.method690((byte) -119, "l" + var13 + "_" + var14);
                        field5116[var12] = class153.field2329.method690((byte) -109, "um" + var13 + "_" + var14);
                        class226.field3459[var12] = class153.field2329.method690((byte) -126, "ul" + var13 + "_" + var14);
                    }
                    var12++;
                }
            }
            class214.method1534(false, var7, var11, var5, (byte) -103, var8, var9, var10);
            return;
        }
        boolean var16 = class48.method369((byte) 86, class204.field3136.method1746((byte) -117));
        int var17 = class204.field3136.method1749((byte) 74);
        int var18 = class204.field3136.method1728((byte) 50);
        int var19 = class204.field3136.method1774((byte) 75);
        class204.field3136.method1136(arg1 - 127);
        for (int var20 = 0; var20 < 4; var20++) {
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    int var23 = class204.field3136.method1132(1, arg1 + 52);
                    if (var23 == 1) {
                        class262.field4040[var20][var21][var22] = class204.field3136.method1132(26, class181.method1355(arg1, 79));
                    } else {
                        class262.field4040[var20][var21][var22] = -1;
                    }
                }
            }
        }
        class204.field3136.method1133(8);
        int var24 = (class241.field3679 - class204.field3136.field3866) / 16;
        class187.field2946 = new int[var24][4];
        for (int var25 = 0; var25 < var24; var25++) {
            for (int var26 = 0; var26 < 4; var26++) {
                class187.field2946[var25][var26] = class204.field3136.method1741(-32769);
            }
        }
        int var27 = class204.field3136.method1755(false);
        int var28 = class204.field3136.method1749((byte) 52);
        class51.field683 = new int[var24];
        class137.field2069 = new byte[var24][];
        class299.field4605 = new byte[var24][];
        class238.field3623 = (byte[][]) null;
        class139.field2087 = new int[var24];
        class322.field4963 = new byte[var24][];
        field5116 = new int[var24];
        class110.field1653 = null;
        class5.field67 = new byte[var24][];
        class226.field3459 = new int[var24];
        class63.field854 = new int[var24];
        int var29 = 0;
        for (int var30 = 0; var30 < 4; var30++) {
            for (int var31 = 0; var31 < 13; var31++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class262.field4040[var30][var31][var32];
                    if (var33 != -1) {
                        int var34 = (var33 & 0xFFFF4C) >> 14;
                        int var35 = var33 >> 3 & 0x7FF;
                        int var36 = (var34 / 8 << 8) + var35 / 8;
                        for (int var37 = 0; var37 < var29; var37++) {
                            if (class139.field2087[var37] == var36) {
                                var36 = -1;
                                break;
                            }
                        }
                        if (var36 != -1) {
                            class139.field2087[var29] = var36;
                            int var38 = (var36 & 0xFF81) >> 8;
                            int var39 = var36 & 0xFF;
                            class63.field854[var29] = class153.field2329.method690((byte) -126, "m" + var38 + "_" + var39);
                            class51.field683[var29] = class153.field2329.method690((byte) -124, "l" + var38 + "_" + var39);
                            field5116[var29] = class153.field2329.method690((byte) -120, "um" + var38 + "_" + var39);
                            class226.field3459[var29] = class153.field2329.method690((byte) -118, "ul" + var38 + "_" + var39);
                            var29++;
                        }
                    }
                }
            }
        }
        class214.method1534(false, var19, var28, var16, (byte) -60, var18, var17, var27);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 553)
    public static void method2313(boolean arg0) {
        field5117 = null;
        field5112 = null;
        if (arg0) {
            method2312(true, (byte) 40);
        }
        field5116 = null;
        field5105 = null;
    }
}
