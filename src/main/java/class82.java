import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class82 {

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1364 = "Starting 3d Library";

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[S")
    public static short[] field1355 = new short[256];

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field1367 = -1;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
    public static int[] field1365 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lsb;Z)V")
    public static final void method656(class124 arg0, boolean arg1) {
        class127.field2104 = arg0;
        if (!arg1) {
            method665(32, -121, -117, -48, -61, 87);
        }
        field1369++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)Lpi;")
    public static final class193 method657(int arg0, byte arg1) {
        field1358++;
        class193 var2 = (class193) class286.field4551.method1518((long) arg0, -45);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class234.field3712.method900(arg0, 0, false);
        if (var3 == null) {
            return null;
        }
        class193 var4 = new class193();
        class136 var5 = new class136(var3);
        int var6 = -91 / ((arg1 - 68) / 44);
        var5.field2231 = var5.field2263.length - 2;
        int var7 = var5.method996(65280);
        int var8 = var5.field2263.length - var7 - 2 - 12;
        var5.field2231 = var8;
        int var9 = var5.method1022(-126);
        var4.field3157 = var5.method996(65280);
        var4.field3167 = var5.method996(65280);
        var4.field3151 = var5.method996(65280);
        var4.field3169 = var5.method996(65280);
        int var10 = var5.method1012(4);
        if (var10 > 0) {
            var4.field3163 = new class144[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var5.method996(65280);
                class144 var13 = new class144(class14.method101(var12, -18851));
                var4.field3163[var11] = var13;
                while (var12-- > 0) {
                    int var14 = var5.method1022(108);
                    int var15 = var5.method1022(-109);
                    var13.method1064(new class186(var15), (long) var14, (byte) -122);
                }
            }
        }
        var5.field2231 = 0;
        int var16 = 0;
        var4.field3165 = var5.method972(0);
        var4.field3160 = new String[var9];
        var4.field3166 = new int[var9];
        var4.field3158 = new int[var9];
        while (var5.field2231 < var8) {
            int var17 = var5.method996(65280);
            if (var17 == 3) {
                var4.field3160[var16] = var5.method1010(-100).intern();
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field3166[var16] = var5.method1012(4);
            } else {
                var4.field3166[var16] = var5.method1022(89);
            }
            var4.field3158[var16++] = var17;
        }
        class286.field4551.method1514(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method658(boolean arg0, int arg1, int arg2) {
        field1366++;
        if (arg2 >= -5) {
            field1356 = -95;
        }
        return arg0 && arg1 >= 0 ? class172.method1237(arg0, 10, arg1, 117) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method659(int arg0) {
        field1364 = null;
        field1365 = null;
        field1355 = null;
        if (arg0 != 0) {
            method662((String) null, 45, true);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB)I")
    public static final int method660(int arg0, int arg1, byte arg2) {
        field1362++;
        if (arg2 <= 111) {
            field1367 = 0;
        }
        int var3 = arg0 >> 31 & arg1 - 1;
        return (arg0 + (arg0 >>> 31)) % arg1 + var3;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IB)V")
    public static final void method661(int arg0, byte arg1) {
        if (arg1 != 44) {
            field1365 = null;
        }
        field1359++;
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class263.field4172 += arg0 * 128;
        if (class206.field3322.length < class263.field4172) {
            class263.field4172 -= class206.field3322.length;
            int var3 = (int) (Math.random() * 12.0D);
            class245.method1627((byte) -128, class145.field2393[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class81.field1351[var4 + var5] - class206.field3322[class263.field4172 + var4 & class206.field3322.length + -1] * arg0 / 6;
            if (var26 < 0) {
                var26 = 0;
            }
            class81.field1351[var4++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class81.field1351[var24 + var23] = 255;
                } else {
                    class81.field1351[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var2 - arg0); var9++) {
            class10.field130[var9] = class10.field130[var9 + arg0];
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class10.field130[var10] = (int) (Math.sin((double) class152.field2486 / 14.0D) * 16.0D + Math.sin((double) class152.field2486 / 15.0D) * 14.0D + Math.sin((double) class152.field2486 / 16.0D) * 12.0D);
            class152.field2486++;
        }
        int var11 = ((class207.field3336 & 0x1) + arg0) / 2;
        class258.field4115 += arg0;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class258.field4115; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class81.field1351[(var22 << 7) + var21] = 192;
        }
        class258.field4115 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var11 + var20 < 128) {
                    var18 += class81.field1351[var19 + var20 + var11];
                }
                if (var20 - var11 - 1 >= 0) {
                    var18 -= class81.field1351[var20 + var19 - var11 - 1];
                }
                if (var20 >= 0) {
                    class259.field4116[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var16 + var11 < var2) {
                    var15 += class259.field4116[var11 * 128 + var14 + var17];
                }
                if ((var16 - var11 - 1) >= 0) {
                    var15 -= class259.field4116[var14 + var17 - var11 * 128 - 128];
                }
                if (var16 >= 0) {
                    class81.field1351[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method662(String arg0, int arg1, boolean arg2) {
        field1361++;
        String var3 = arg0.toLowerCase();
        if (arg1 != 250) {
            return;
        }
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class240.field3780; var6++) {
            class67 var9 = class190.method1314(var6, (byte) 68);
            if ((!arg2 || var9.field1096) && var9.field1108 == -1 && var9.field1156 == -1 && var9.field1103 == 0 && var9.field1155.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class208.field3346 = null;
                    class1.field3 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class1.field3 = var5;
        String[] var7 = new String[class1.field3];
        class208.field3346 = var4;
        class274.field4387 = 0;
        for (int var8 = 0; var8 < class1.field3; var8++) {
            var7[var8] = class190.method1314(var4[var8], (byte) 68).field1155;
        }
        class276.method1862(var7, true, class208.field3346);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method663(boolean arg0, int arg1) {
        String var2 = Integer.toString(arg1);
        if (arg0) {
            method664(-93, (class136) null);
        }
        field1363++;
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class71.field1185 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class250.field3983 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILig;)V")
    public static final void method664(int arg0, class136 arg1) {
        field1357++;
        if (arg1.field2263.length - arg1.field2231 < 1) {
            return;
        }
        int var2 = arg1.method1012(4);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (arg0 == var2) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field2263.length - arg1.field2231 < var3) {
            return;
        }
        class220.field3520 = arg1.method1012(4);
        if (class220.field3520 < 1) {
            class220.field3520 = 1;
        } else if (class220.field3520 > 4) {
            class220.field3520 = 4;
        }
        class80.method643(arg1.method1012(4) == 1, (byte) -124);
        class230.field3660 = arg1.method1012(4) == 1;
        class151.field2470 = arg1.method1012(4) == 1;
        class112.field1731 = arg1.method1012(arg0 ^ 0xF) == 1;
        class104.field1595 = arg1.method1012(arg0 - 7) == 1;
        class153.field2495 = arg1.method1012(4) == 1;
        class150.field2463 = arg1.method1012(4) == 1;
        class153.field2496 = arg1.method1012(arg0 ^ 0xF) == 1;
        class112.field1735 = arg1.method1012(4);
        if (class112.field1735 > 2) {
            class112.field1735 = 2;
        }
        if (var2 < 2) {
            class80.field1324 = arg1.method1012(4) == 1;
            arg1.method1012(4);
        } else {
            class80.field1324 = arg1.method1012(arg0 - 7) == 1;
        }
        class89.field1425 = arg1.method1012(4) == 1;
        class132.field2209 = arg1.method1012(4) == 1;
        class255.field4071 = arg1.method1012(4);
        if (class255.field4071 > 2) {
            class255.field4071 = 2;
        }
        class163.field2643 = class255.field4071;
        class179.field2991 = arg1.method1012(4) == 1;
        class77.field1287 = arg1.method1012(4);
        if (class77.field1287 > 127) {
            class77.field1287 = 127;
        }
        class274.field4382 = arg1.method1012(4);
        class111.field1719 = arg1.method1012(arg0 ^ 0xF);
        if (class111.field1719 > 127) {
            class111.field1719 = 127;
        }
        if (var2 >= 1) {
            class134.field2221 = arg1.method996(65280);
            class37.field626 = arg1.method996(arg0 + 65269);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1012(4);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1012(arg0 - 7);
            if (class269.field4324 < 96) {
                var4 = 0;
            }
            class98.method742(var4);
        }
        if (var2 >= 5) {
            class14.field198 = arg1.method1022(-89);
        }
        if (var2 >= 6) {
            class179.field2990 = arg1.method1012(arg0 - 7);
        }
        if (var2 >= 7) {
            class234.field3710 = arg1.method1012(4) == 1;
        }
        if (var2 >= 8) {
            class256.field4075 = arg1.method1012(4) == 1;
        }
        if (var2 >= 9) {
            class282.field4476 = arg1.method1012(4);
        }
        if (var2 >= 10) {
            class171.field2825 = arg1.method1012(4) != 0;
        }
        if (var2 >= 11) {
            class137.field2308 = arg1.method1012(4) != 0;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
    public static final void method665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class260.field4131 = arg2;
        class186.field3053 = arg3;
        class141.field2345 = arg5;
        field1360++;
        class108.field1651 = arg1;
        if (arg4 != 12844) {
            field1368 = -107;
        }
        class76.field1240 = arg0;
        if (class108.field1651 >= 100) {
            int var6 = class76.field1240 * 128 + 64;
            int var7 = class141.field2345 * 128 + 64;
            int var8 = class218.method1450(var7, var6, true, class92.field1448) - class186.field3053;
            int var9 = var6 - class31.field527;
            int var10 = var8 - class150.field2457;
            int var11 = var7 - class148.field2434;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class146.field2408 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class212.field3400 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class146.field2408 < 128) {
                class146.field2408 = 128;
            }
            if (class146.field2408 > 383) {
                class146.field2408 = 383;
            }
        }
        class184.field3033 = 2;
    }
}
