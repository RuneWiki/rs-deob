import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class78 {

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
    public int[] field1233 = new int[6];

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[I")
    public int[] field1229 = new int[257];

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "[[I")
    public int[][] field1242 = new int[6][258];

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "[[I")
    public int[][] field1247 = new int[6][258];

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[[B")
    public byte[][] field1237 = new byte[6][258];

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public int field1246 = 0;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "[I")
    public int[] field1259 = new int[256];

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "[B")
    public byte[] field1254 = new byte[18002];

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "[B")
    public byte[] field1235 = new byte[256];

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "[I")
    public int[] field1260 = new int[16];

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public int field1272 = 0;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "[B")
    public byte[] field1269 = new byte[18002];

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "[Z")
    public boolean[] field1267 = new boolean[16];

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "[B")
    public byte[] field1270 = new byte[4096];

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "[Z")
    public boolean[] field1262 = new boolean[256];

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "[[I")
    public int[][] field1255 = new int[6][258];

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "B")
    public byte field1252;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public int field1238;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Llc;")
    public static class270 field1239;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "Llc;")
    public static class270 field1266;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[B")
    public byte[] field1232;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "[B")
    public byte[] field1241;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static void method577(boolean arg0) {
        if (arg0) {
            field1239 = null;
        }
        field1239 = null;
        field1266 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)Z")
    public static final boolean method578(int arg0, int arg1, int arg2, int arg3) {
        if (!class152.method1125(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class103.field1792[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class159.field2479) {
                    if (!class49.method302(var4, var6, var5)) {
                        return false;
                    }
                    if (!class49.method302(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class49.method302(var4, var7, var5)) {
                        return false;
                    }
                    if (!class49.method302(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class49.method302(var4, var8, var5)) {
                    return false;
                }
                if (!class49.method302(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class141.field2281) {
                    if (!class49.method302(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class49.method302(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class49.method302(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class49.method302(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class49.method302(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class49.method302(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class159.field2479) {
                    if (!class49.method302(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class49.method302(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class49.method302(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class49.method302(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class49.method302(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class49.method302(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class141.field2281) {
                    if (!class49.method302(var4, var6, var5)) {
                        return false;
                    }
                    if (!class49.method302(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class49.method302(var4, var7, var5)) {
                        return false;
                    }
                    if (!class49.method302(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class49.method302(var4, var8, var5)) {
                    return false;
                }
                if (!class49.method302(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class49.method302(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class49.method302(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class49.method302(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class49.method302(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class49.method302(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method579(int arg0, byte arg1) {
        field1265++;
        String var2 = Integer.toString(arg0);
        if (arg1 != -123) {
            return null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class140.field2270 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class280.field4519 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLlc;)V")
    public static final void method580(boolean arg0, class270 arg1) {
        class112.field1863 = arg1;
        if (!arg0) {
            field1263++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method581(int arg0, String arg1) {
        if (arg0 < 122) {
            method579(-77, (byte) -72);
        }
        field1234++;
        String var2 = class38.method240(class143.method1064((byte) -74, arg1), true);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method582(int arg0, String arg1) {
        int var2 = arg1.length();
        if (arg0 >= -31) {
            return null;
        }
        byte[] var3 = new byte[var2];
        field1240++;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
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
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static final void method583(byte arg0) {
        if (arg0 != -11) {
            field1239 = null;
        }
        class141.field2274.method1422((byte) -67);
        field1268++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public static final void method584(int arg0, int arg1) {
        class253.field3821.method1416(arg1, arg0 - 1023);
        field1250++;
        if (arg0 != 1023) {
            field1239 = null;
        }
        class186.field2771.method1416(arg1, 0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static final void method585(int arg0) {
        class308.field4956 = -1;
        int var1 = -111 / ((45 - arg0) / 33);
        class110.field1849 = 0;
        class222.field3260 = 0;
        class113.field1878 = 0;
        field1244++;
        class126.field2127 = 1;
        class194.field2858 = false;
        class256.field3878 = -3;
    }
}
