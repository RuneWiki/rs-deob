import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 extends class118 {

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field2146 = 0;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field2152 = 0;

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "[I")
    public static int[] field2160 = new int[5];

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!nb", name = "db", descriptor = "Lp;")
    public static class104 field2163 = new class104(64);

    @OriginalMember(owner = "client!nb", name = "eb", descriptor = "I")
    public static int field2164 = 0;

    @OriginalMember(owner = "client!nb", name = "fb", descriptor = "I")
    public static int field2165 = 0;

    @OriginalMember(owner = "client!nb", name = "ib", descriptor = "Lfc;")
    private static class39 field2168 = class90.method774("You have only just left another world)3", -118);

    @OriginalMember(owner = "client!nb", name = "gb", descriptor = "Lfc;")
    public static class39 field2166 = field2168;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "B")
    public byte field2147;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    public int field2154;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "Lmf;")
    public class89 field2159;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "[I")
    public static int[] field2151;

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "[I")
    public static int[] field2161;

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "[I")
    public static int[] field2162;

    @OriginalMember(owner = "client!nb", name = "hb", descriptor = "[Lue;")
    public static class141[] field2167;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V", line = 14)
    public static void method785(int arg0) {
        field2166 = null;
        int var1 = -67 / ((arg0 - 46) / 49);
        field2167 = null;
        field2168 = null;
        field2160 = null;
        field2162 = null;
        field2151 = null;
        field2163 = null;
        field2161 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIILfc;Lfc;)V", line = 52)
    public static final void method786(int arg0, int arg1, int arg2, int arg3, int arg4, class39 arg5, class39 arg6) {
        if (class126.field3207 < 500) {
            if (arg5.method437(-84) > 0) {
                class97.field2315[class126.field3207] = class137.method1111(new class39[] { arg6, class38.field1030, arg5 }, (byte) -85);
            } else {
                class97.field2315[class126.field3207] = arg6;
            }
            class109.field2805[class126.field3207] = arg1;
            class117.field3076[class126.field3207] = arg2;
            class99.field2439[class126.field3207] = arg0;
            class54.field1340[class126.field3207] = arg4;
            class126.field3207++;
        }
        if (arg3 > 1) {
            field2150++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[Lod;IZ[BIIII)V", line = 82)
    public static final void method787(int arg0, int arg1, class101[] arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field2157++;
        if (!arg4) {
            method788(null, -36);
        }
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg1 + var15 > 0 && arg1 + var15 < 103) {
                    arg2[arg9].field2526[arg3 + var10][arg1 + var15] = class87.method747(arg2[arg9].field2526[arg3 + var10][arg1 + var15], -16777217);
                }
            }
        }
        class25 var11 = new class25(arg5);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg6 == var12 && var13 >= arg8 && arg8 + 8 > var13 && arg0 <= var14 && arg0 + 8 > var14) {
                        class43.method505(arg9, 0, var11, (byte) 10, 0, arg7, arg3 + class50.method549(var14 & 0x7, var13 & 0x7, (byte) 74, arg7), class98.method821(11873, arg7, var14 & 0x7, var13 & 0x7) + arg1);
                    } else {
                        class43.method505(0, 0, var11, (byte) 10, 0, 0, -1, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([BI)[B", line = 150)
    public static final byte[] method788(byte[] arg0, int arg1) {
        class25 var2 = new class25(arg0);
        field2148++;
        if (arg1 < 28) {
            return null;
        }
        int var3 = var2.method322((byte) -50);
        int var4 = var2.method313((byte) 100);
        if (var4 < 0 || class34.field904 != 0 && var4 > class34.field904) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method305(0, (byte) -124, var5, var4);
            return var5;
        } else {
            int var6 = var2.method313((byte) 76);
            if (var6 < 0 || class34.field904 != 0 && class34.field904 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class22.method251(var7, var6, arg0, var4, 9);
            } else {
                class9.field275.method822(var2, var7, 21995);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V", line = 213)
    public static final void method789(byte arg0) {
        if (class70.field1655) {
            class121.method1036((byte) 61);
            class70.field1655 = false;
            class89.method770(true);
            class142.field3564 = true;
            class104.field2638 = true;
            client.field561 = true;
            class128.field3242 = true;
        }
        field2158++;
        class120.method1028(-13968);
        if (class94.field2206 && class50.field1258 == 1) {
            class104.field2638 = true;
        }
        if (class37.field1018 != -1) {
            boolean var1 = class27.method341(0, class37.field1018);
            if (var1) {
                class104.field2638 = true;
            }
        }
        if (arg0 != -28) {
            field2152 = -59;
        }
        if (class28.field810 == 2) {
            class104.field2638 = true;
        }
        if (class60.field1477 == 2) {
            class104.field2638 = true;
        }
        if (class104.field2638) {
            class104.field2638 = false;
            class62.method612(arg0 ^ 0xFFFFFFF4);
        }
        if (class37.field1008 == -1) {
            class98.field2320.field2447 = class67.field1595 - class7.field229 - 77;
            if (class12.field314 > 17 && class12.field314 < 560 && class131.field3322 > 332) {
                class43.method512(class131.field3322 - 357, 463, true, class98.field2320, class12.field314 - 17, 0, class67.field1595, 77, -1);
            }
            int var2 = class67.field1595 - class98.field2320.field2447 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class67.field1595 - 77) {
                var2 = class67.field1595 - 77;
            }
            if (class7.field229 != var2) {
                class128.field3242 = true;
                class7.field229 = var2;
            }
        }
        if (class37.field1008 == -1 && class119.field3107 == 3) {
            class98.field2320.field2447 = class37.field1015;
            int var3 = class80.field1809 * 14 + 7;
            if (class12.field314 > 17 && class12.field314 < 560 && class131.field3322 > 332) {
                class43.method512(class131.field3322 - 357, 463, true, class98.field2320, class12.field314 - 17, 0, var3, 77, -1);
            }
            int var4 = class98.field2320.field2447;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 - 77 < var4) {
                var4 = var3 - 77;
            }
            if (class37.field1015 != var4) {
                class128.field3242 = true;
                class37.field1015 = var4;
            }
        }
        if (class37.field1008 != -1) {
            boolean var5 = class27.method341(arg0 ^ 0xFFFFFFE4, class37.field1008);
            if (var5) {
                class128.field3242 = true;
            }
        }
        if (class28.field810 == 3) {
            class128.field3242 = true;
        }
        if (class60.field1477 == 3) {
            class128.field3242 = true;
        }
        if (class61.field1496 != null) {
            class128.field3242 = true;
        }
        if (class94.field2206 && class50.field1258 == 2) {
            class128.field3242 = true;
        }
        if (class128.field3242) {
            class128.field3242 = false;
            class107.method944(arg0 ^ 0x1D);
        }
        class60.method602(true);
        if (class56.field1410 != -1) {
            class142.field3564 = true;
        }
        if (class142.field3564) {
            if (class56.field1410 != -1 && class56.field1410 == class104.field2633) {
                class56.field1410 = -1;
                class79.field1794.method393((byte) -14, 75);
                class79.field1794.method326(class104.field2633, (byte) -107);
                class37.field1004++;
            }
            class63.field1548 = true;
            class142.field3564 = false;
            class25.method328(class70.field1654 % 20 < 10 ? -1 : class56.field1410, (byte) -107, class37.field1018 == -1, class104.field2633, class25.field740);
        }
        if (client.field561) {
            class63.field1548 = true;
            client.field561 = false;
            class16.method199(class13.field349, class50.field1255, arg0 ^ 0x21B0DD44, field2164, class94.field2203);
        }
        class24.method279(class24.field661, class94.field2197.field2916, class94.field2197.field2909, (byte) -117, client.field547);
        client.field547 = 0;
    }
}
