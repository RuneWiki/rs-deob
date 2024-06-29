import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 {

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field1377 = 0;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lfc;")
    private static class39 field1378 = class90.method774("Sorry invited players only)3", -112);

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Lfc;")
    public static class39 field1380 = class90.method774("l", -123);

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field1371 = -1;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Lfc;")
    public static class39 field1384 = field1378;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lfc;")
    private static class39 field1381 = class90.method774("Loaded wordpack", -119);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lfc;")
    public static class39 field1369 = field1381;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public static int field1392 = -1;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "[I")
    public static int[] field1390 = new int[200];

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static volatile int field1385 = 0;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Lb;")
    public static class8 field1388;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Z")
    public static boolean field1386;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII[Lob;IIIILob;)Lob;", line = 12)
    public static final class99 method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class99[] arg6, int arg7, int arg8, int arg9, int arg10, class99 arg11) {
        field1387++;
        if (arg0 < arg8 || arg10 < arg3 || arg0 >= arg5 || arg10 >= arg1) {
            return null;
        }
        for (int var12 = arg7; var12 < arg6.length; var12++) {
            class99 var13 = arg6[var12];
            if (var13 != null && var13.field2348 == arg9 && !class44.method515(var13, (byte) -119) && arg11 != var13) {
                int var14 = var13.field2450 + arg8 - arg2;
                int var15 = var13.field2368 + arg3 - arg4;
                if (var13.field2452 == 0) {
                    class99 var16 = method571(arg0, var13.field2381 + var15, var13.field2429, var15, var13.field2447, var13.field2357 + var14, arg6, 0, var14, var13.field2406, arg10, arg11);
                    if (var16 != null) {
                        return var16;
                    }
                    if (var13.field2416 != null) {
                        class99 var17 = method571(arg0, var13.field2381 + var15, var13.field2429, var15, var13.field2447, var13.field2357 + var14, var13.field2416, 0, var14, var13.field2406, arg10, arg11);
                        if (var17 != null) {
                            return var17;
                        }
                    }
                }
                if (class38.method429(class89.method768(var13, 101), 0) && arg0 >= var14 && arg10 >= var15 && arg0 < var14 + var13.field2357 && arg10 < var15 + var13.field2381) {
                    return var13;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILoc;)V", line = 73)
    public static final void method572(int arg0, class100 arg1) {
        field1370++;
        if (arg0 == -28) {
            class14.field369 = arg1;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLoc;Lfc;Lfc;)Lb;", line = 91)
    public static final class8 method573(byte arg0, class100 arg1, class39 arg2, class39 arg3) {
        field1375++;
        int var4 = arg1.method848(arg2, (byte) -72);
        int var5 = arg1.method834(arg3, false, var4);
        int var6 = 28 % ((66 - arg0) / 53);
        return class42.method498(arg1, (byte) -108, var5, var4);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 106)
    public static void method574(byte arg0) {
        field1369 = null;
        field1381 = null;
        field1384 = null;
        int var1 = 45 % ((arg0 - 28) / 55);
        field1390 = null;
        field1388 = null;
        field1380 = null;
        field1378 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)[Lb;", line = 122)
    public static final class8[] method575(byte arg0) {
        field1374++;
        class8[] var1 = new class8[class70.field1650];
        for (int var2 = 0; var2 < class70.field1650; var2++) {
            class8 var4 = var1[var2] = new class8();
            var4.field243 = class44.field1189;
            var4.field241 = class1.field3;
            var4.field242 = class131.field3287[var2];
            var4.field244 = class72.field1686[var2];
            var4.field245 = class101.field2515[var2];
            var4.field239 = class115.field3026[var2];
            int var5 = var4.field245 * var4.field239;
            byte[] var6 = class15.field395[var2];
            var4.field240 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var4.field240[var7] = class1.field27[class87.method747(var6[var7], 255)];
            }
        }
        int var3 = 76 % ((38 - arg0) / 55);
        class114.method994(-89);
        return var1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 193)
    public static final void method576(int arg0, int arg1) {
        if (arg0 != 23292) {
            method574((byte) 91);
        }
        field1376++;
        if (arg1 == -3) {
            class134.method1088(class87.field2007, class65.field1561, class54.field1364, 0);
        } else if (arg1 == -2) {
            class134.method1088(class87.field1965, class87.field1983, class120.field3136, arg0 ^ 0x5AFC);
        } else if (arg1 == -1) {
            class134.method1088(class87.field1990, class10.field292, class54.field1360, 0);
        } else if (arg1 == 3) {
            class134.method1088(class87.field1984, class87.field2003, class70.field1642, 0);
        } else if (arg1 == 4) {
            class134.method1088(class87.field2002, class77.field1760, class114.field2989, 0);
        } else if (arg1 == 5) {
            class134.method1088(class87.field1994, class27.field766, class97.field2305, 0);
        } else if (arg1 == 6) {
            class134.method1088(class87.field1961, class9.field273, class70.field1644, arg0 ^ 0x5AFC);
        } else if (arg1 == 7) {
            class134.method1088(class87.field1999, class67.field1607, class39.field1101, arg0 ^ 0x5AFC);
        } else if (arg1 == 8) {
            class134.method1088(class87.field1977, class140.field3526, class5.field181, 0);
        } else if (arg1 == 9) {
            class134.method1088(class87.field2018, class90.field2143, class54.field1345, 0);
        } else if (arg1 == 10) {
            class134.method1088(class87.field1998, class140.field3535, class17.field491, 0);
        } else if (arg1 == 11) {
            class134.method1088(class87.field1970, class13.field348, class1.field14, 0);
        } else if (arg1 == 12) {
            class134.method1088(class87.field2000, class42.field1142, class50.field1269, 0);
        } else if (arg1 == 13) {
            class134.method1088(class87.field1958, class72.field1695, class54.field1348, 0);
        } else if (arg1 == 14) {
            class134.method1088(class87.field1960, class71.field1676, class74.field1702, 0);
        } else if (arg1 == 16) {
            class134.method1088(class87.field2005, class10.field280, class124.field3183, arg0 ^ 0x5AFC);
        } else if (arg1 == 17) {
            class134.method1088(class87.field1987, class71.field1659, class67.field1608, 0);
        } else if (arg1 == 18) {
            class134.method1088(class87.field2020, class121.field3159, class6.field189, arg0 - 23292);
        } else if (arg1 == 19) {
            class134.method1088(class39.field1106, class39.field1072, field1384, 0);
        } else if (arg1 == 20) {
            class134.method1088(class87.field1964, class112.field2958, class54.field1356, 0);
        } else if (arg1 == 22) {
            class134.method1088(class87.field1969, class42.field1149, class17.field488, 0);
        } else if (arg1 == 23) {
            class134.method1088(class87.field1963, class108.field2714, class74.field1706, 0);
        } else if (arg1 == 24) {
            class134.method1088(class87.field2012, class86.field1934, class58.field1440, 0);
        } else if (arg1 == 25) {
            class134.method1088(class87.field1966, class117.field3080, class54.field1353, 0);
        } else if (arg1 == 26) {
            class134.method1088(class87.field1997, class78.field1775, class29.field821, arg0 - 23292);
        } else if (arg1 == 27) {
            class134.method1088(class87.field1986, class87.field1978, class50.field1256, 0);
        } else {
            class134.method1088(class87.field2013, class110.field2852, class54.field1350, 0);
        }
        class114.method990((byte) -119, 10);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V", line = 319)
    public static final void method577(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1379++;
        class1 var5 = (class1) class78.field1773.method995(false, (long) arg1);
        if (var5 == null) {
            var5 = new class1();
            class78.field1773.method998(var5, (long) arg1, (byte) -118);
        }
        if (var5.field25.length <= arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field25.length; var8++) {
                var6[var8] = var5.field25[var8];
                var7[var8] = var5.field29[var8];
            }
            for (int var9 = var5.field25.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field29 = var7;
            var5.field25 = var6;
        }
        var5.field25[arg3] = arg4;
        if (arg2 == -1403) {
            var5.field29[arg3] = arg0;
        }
    }
}
