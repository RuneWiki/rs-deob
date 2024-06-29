import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class34 extends class144 {

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
    public static int[] field753 = new int[32];

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field754 = 0;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field759 = 0;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
    public static int[] field761 = new int[2048];

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
    public static boolean field756 = false;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "Ll;")
    public static class328 field758 = new class328(8);

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field762 = 1;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "Ljava/lang/String;")
    public static String field763 = null;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLg;IIIII)V", line = 8)
    public static final void method244(boolean arg0, class181 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class1 var7 = class125.method901(arg5, (byte) -69);
        field755++;
        if (!arg0) {
            method245((byte) -123, (String) null);
        }
        if (var7 == null || !var7.field29 || !var7.method6((byte) -100)) {
            return;
        }
        if (var7.field2 != null) {
            int[] var8 = new int[var7.field2.length];
            for (int var9 = 0; var9 < (var8.length / 2); var9++) {
                int var10;
                if (class69.field1280 == 4) {
                    var10 = (int) class354.field5652 & 0x7FF;
                } else {
                    var10 = (int) class354.field5652 + class192.field3253 & 0x7FF;
                }
                int var11 = class305.field4959[var10];
                int var12 = class305.field4957[var10];
                if (class69.field1280 != 4) {
                    var12 = var12 * 256 / (class292.field4726 + 256);
                    var11 = var11 * 256 / (class292.field4726 + 256);
                }
                var8[var9 * 2] = arg1.field3024 / 2 + ((arg2 + (var7.field2[var9 * 2 + 1] * 4)) * var11 + (var7.field2[var9 * 2] * 4 + arg4) * var12 >> 16) + arg6;
                var8[var9 * 2 + 1] = arg1.field2972 / 2 + arg3 - ((var7.field2[var9 * 2 + 1] * 4 + arg2) * var12 + -((arg4 - -(var7.field2[var9 * 2] * 4)) * var11) >> 16);
            }
            if (class241.field4016) {
                class93.method708(var8, var7.field27, var7.field27 >>> 24, arg1.field3015, arg1.field2973);
            } else {
                class43.method364(var8, var7.field27, var7.field27 >>> 24, arg1.field3015, arg1.field2973);
            }
            for (int var13 = 0; var13 < var8.length / 2 - 1; var13++) {
                if (class241.field4016) {
                    class337.method2382(var8[var13 * 2], var8[var13 * 2 + 1], var8[var13 * 2 + 2], var8[var13 * 2 + 3], var7.field18, var7.field18 >>> 24, (class265) arg1.method1266(119, false));
                } else {
                    class270.method1898(var8[var13 * 2], var8[var13 * 2 + 1], var8[var13 * 2 + 2], var8[(var13 + 1) * 2 + 1], var7.field18, var7.field18 >>> 24, arg1.field3015, arg1.field2973);
                }
            }
            if (class241.field4016) {
                class337.method2382(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field18, var7.field18 >>> 24, (class265) arg1.method1266(31, false));
            } else {
                class270.method1898(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field18, var7.field18 >>> 24, arg1.field3015, arg1.field2973);
            }
        }
        class323 var14 = null;
        if (var7.field16 != -1) {
            var14 = var7.method4(0, false, false);
            if (var14 != null) {
                class176.method1250(arg1, arg3, arg6, arg4, var14, -123, arg2);
            }
        }
        if (var7.field15 == null) {
            return;
        }
        class84 var15 = class173.field2877;
        int var16 = 0;
        if (var14 != null) {
            var16 = var14.field5236;
        }
        if (var7.field35 == 1) {
            var15 = class14.field416;
        }
        if (var7.field35 == 2) {
            var15 = class332.field5297;
        }
        class260.method1829(var7.field1, arg6, arg2, var7.field15, var15, arg3, arg1, arg4, true, var16);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLjava/lang/String;)V", line = 115)
    public static final void method245(byte arg0, String arg1) {
        field752++;
        if (arg1 == null) {
            return;
        }
        String var2 = class310.method2259(arg1, -62);
        if (var2 == null) {
            return;
        }
        if (arg0 != -67) {
            field763 = (String) null;
        }
        for (int var3 = 0; var3 < class151.field2550; var3++) {
            String var4 = class310.method2259(class91.field1610[var3], -94);
            if (var4 != null && var4.equals(var2)) {
                class151.field2550--;
                for (int var5 = var3; var5 < class151.field2550; var5++) {
                    class91.field1610[var5] = class91.field1610[var5 + 1];
                    class18.field499[var5] = class18.field499[var5 + 1];
                    class336.field5345[var5] = class336.field5345[var5 + 1];
                    class224.field3699[var5] = class224.field3699[var5 + 1];
                    class125.field2202[var5] = class125.field2202[var5 + 1];
                    class293.field4742[var5] = class293.field4742[var5 + 1];
                }
                class70.field1286 = class83.field1436;
                class335.field5338++;
                class51.field1038.method291((byte) -81, 184);
                class51.field1038.method1027(class148.method1066(arg1, (byte) 57), -20374);
                class51.field1038.method1012(arg1, (byte) 51);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIZIIIII)V", line = 170)
    public static final void method246(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field760++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                class92.field1638[var11][var12] = 0;
                class311.field5066[var11][var12] = 99999999;
            }
        }
        int var13 = arg6;
        class92.field1638[arg6][arg3] = 99;
        class311.field5066[arg6][arg3] = 0;
        int var14 = arg3;
        int var15 = 0;
        byte var16 = 0;
        class145.field2433[var16] = arg6;
        boolean var17 = false;
        int var28 = var16 + 1;
        class316.field5135[var16] = arg3;
        int[][] var18 = class23.field576[class276.field4506].field4451;
        while (var15 != var28) {
            var13 = class145.field2433[var15];
            var14 = class316.field5135[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg0 == var13 && arg2 == var14) {
                var17 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class23.field576[class276.field4506].method1927(arg2, arg1, arg0, var14, var13, arg8 - 1, 1, (byte) 118)) {
                    var17 = true;
                    break;
                }
                if (arg8 < 10 && class23.field576[class276.field4506].method1945(arg0, arg1, var14, 16777216, arg8 - 1, arg2, var13, 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg9 != 0 && class23.field576[class276.field4506].method1931(var13, arg7, var14, arg10, arg2, 1, arg9, arg0, -1)) {
                var17 = true;
                break;
            }
            int var19 = class311.field5066[var13][var14] + 1;
            if (var13 > 0 && class92.field1638[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x2C0108) == 0) {
                class145.field2433[var28] = var13 - 1;
                class316.field5135[var28] = var14;
                class92.field1638[var13 - 1][var14] = 2;
                class311.field5066[var13 - 1][var14] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var13 < 103 && class92.field1638[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x2C0180) == 0) {
                class145.field2433[var28] = var13 + 1;
                class316.field5135[var28] = var14;
                class92.field1638[var13 + 1][var14] = 8;
                var28 = var28 + 1 & 0xFFF;
                class311.field5066[var13 + 1][var14] = var19;
            }
            if (var14 > 0 && class92.field1638[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x2C0102) == 0) {
                class145.field2433[var28] = var13;
                class316.field5135[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class92.field1638[var13][var14 - 1] = 1;
                class311.field5066[var13][var14 - 1] = var19;
            }
            if (var14 < 103 && class92.field1638[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x2C0120) == 0) {
                class145.field2433[var28] = var13;
                class316.field5135[var28] = var14 + 1;
                class92.field1638[var13][var14 + 1] = 4;
                var28 = var28 + 1 & 0xFFF;
                class311.field5066[var13][var14 + 1] = var19;
            }
            if (var13 > 0 && var14 > 0 && class92.field1638[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x2C010E) == 0 && (var18[var13 - 1][var14] & 0x2C0108) == 0 && (var18[var13][var14 - 1] & 0x2C0102) == 0) {
                class145.field2433[var28] = var13 - 1;
                class316.field5135[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class92.field1638[var13 - 1][var14 - 1] = 3;
                class311.field5066[var13 - 1][var14 - 1] = var19;
            }
            if (var13 < 103 && var14 > 0 && class92.field1638[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x2C0183) == 0 && (var18[var13 + 1][var14] & 0x2C0180) == 0 && (var18[var13][var14 - 1] & 0x2C0102) == 0) {
                class145.field2433[var28] = var13 + 1;
                class316.field5135[var28] = var14 - 1;
                class92.field1638[var13 + 1][var14 - 1] = 9;
                var28 = var28 + 1 & 0xFFF;
                class311.field5066[var13 + 1][var14 - 1] = var19;
            }
            if (var13 > 0 && var14 < 103 && class92.field1638[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x2C0138) == 0 && (var18[var13 - 1][var14] & 0x2C0108) == 0 && (var18[var13][var14 + 1] & 0x2C0120) == 0) {
                class145.field2433[var28] = var13 - 1;
                class316.field5135[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class92.field1638[var13 - 1][var14 + 1] = 6;
                class311.field5066[var13 - 1][var14 + 1] = var19;
            }
            if (var13 < 103 && var14 < 103 && class92.field1638[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x2C01E0) == 0 && (var18[var13 + 1][var14] & 0x2C0180) == 0 && (var18[var13][var14 + 1] & 0x2C0120) == 0) {
                class145.field2433[var28] = var13 + 1;
                class316.field5135[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class92.field1638[var13 + 1][var14 + 1] = 12;
                class311.field5066[var13 + 1][var14 + 1] = var19;
            }
        }
        if (!var17) {
            if (!arg5) {
                return;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg0 - var22; var23 <= arg0 + var22; var23++) {
                for (int var24 = arg2 - var22; var24 <= arg2 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class311.field5066[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg2) {
                            var25 = arg2 - var24;
                        } else if (var24 > arg2 + arg9 - 1) {
                            var25 = var24 - arg9 - (arg2 - 1);
                        }
                        if (var23 < arg0) {
                            var26 = arg0 - var23;
                        } else if (var23 > arg0 + arg7 - 1) {
                            var26 = var23 + 1 - (arg0 + arg7);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class311.field5066[var23][var24] < var21) {
                            var14 = var24;
                            var13 = var23;
                            var21 = class311.field5066[var23][var24];
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return;
            }
            if (arg6 == var13 && arg3 == var14) {
                return;
            }
        }
        class284.field4641 = var14;
        class275.field4492 = false;
        class92.field1637 = var13;
        if (arg4 <= 10) {
            method247(47);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 414)
    public static void method247(int arg0) {
        field753 = null;
        if (arg0 != -18569) {
            method245((byte) 99, (String) null);
        }
        field758 = null;
        field763 = null;
        field761 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V", line = 462)
    public static final void method248(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field757++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class114.method842(class190.field3224, (byte) -73, arg0 + arg4, class289.field4704);
        if (arg2 <= 81) {
            return;
        }
        int var10 = class114.method842(class190.field3224, (byte) -115, arg0 - arg4, class289.field4704);
        class344.method2417(class232.field3799[arg3], var10, var9, arg1, (byte) -123);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                int var11 = arg3 - var6;
                var7 -= var6 << 1;
                int var12 = arg3 + var6;
                if (var12 >= class87.field1520 && class177.field2930 >= var11) {
                    int var13 = class114.method842(class190.field3224, (byte) -41, arg0 + var5, class289.field4704);
                    int var14 = class114.method842(class190.field3224, (byte) -101, arg0 - var5, class289.field4704);
                    if (var12 <= class177.field2930) {
                        class344.method2417(class232.field3799[var12], var14, var13, arg1, (byte) -125);
                    }
                    if (var11 >= class87.field1520) {
                        class344.method2417(class232.field3799[var11], var14, var13, arg1, (byte) -128);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (var16 >= class87.field1520 && var15 <= class177.field2930) {
                int var17 = class114.method842(class190.field3224, (byte) -112, arg0 + var6, class289.field4704);
                int var18 = class114.method842(class190.field3224, (byte) -54, arg0 - var6, class289.field4704);
                if (var16 <= class177.field2930) {
                    class344.method2417(class232.field3799[var16], var18, var17, arg1, (byte) -119);
                }
                if (var15 >= class87.field1520) {
                    class344.method2417(class232.field3799[var15], var18, var17, arg1, (byte) -125);
                }
            }
        }
    }
}
