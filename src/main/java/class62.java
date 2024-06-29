import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class62 {

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field909 = new String[1000];

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lbo;")
    public static class16 field905 = new class16();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lto;")
    public static class109 field901;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field907;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 5)
    public static void method502(int arg0) {
        field907 = null;
        field905 = null;
        field909 = null;
        field901 = null;
        if (arg0 != 0) {
            field905 = (class16) null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)J", line = 18)
    public static final long method503(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        return var3 == null || var3.field2387 == null ? 0L : var3.field2387.field172;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 29)
    public static final void method504(int arg0) {
        int var1 = 0;
        if (arg0 != -3588) {
            return;
        }
        while (class95.field1336 > var1) {
            int var2 = class5.field125[var1];
            class181 var3 = class300.field4495[var2];
            int var4 = class83.field1194.method1319(255);
            if ((var4 & 0x40) != 0) {
                var4 += class83.field1194.method1319(arg0 ^ 0xFFFFF103) << 8;
            }
            if ((var4 & 0x10) != 0) {
                int var5 = class83.field1194.method1350(0);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class83.field1194.method1370(-31156);
                class112.method853(arg0 ^ 0xFFFFF603, var3, var5, var6);
            }
            if ((var4 & 0x20) != 0) {
                int var7 = class83.field1194.method1338((byte) -54);
                if (var7 == 65535) {
                    var7 = -1;
                }
                boolean var8 = true;
                int var9 = class83.field1194.method1359((byte) -95);
                if (var7 != -1 && var3.field5090 != -1 && class119.method893(class81.method669(32, var7).field1540, (byte) -41).field3666 < class119.method893(class81.method669(arg0 ^ 0xFFFFF1DC, var3.field5090).field1540, (byte) -41).field3666) {
                    var8 = false;
                }
                if (var8) {
                    var3.field5131 = 0;
                    var3.field5159 = 0;
                    var3.field5100 = var9 >> 16;
                    var3.field5107 = class304.field4560 + (var9 & 0xFFFF);
                    if (class304.field4560 < var3.field5107) {
                        var3.field5159 = -1;
                    }
                    var3.field5090 = var7;
                    var3.field5144 = 1;
                    if (var3.field5090 != -1 && class304.field4560 == var3.field5107) {
                        int var10 = class81.method669(32, var3.field5090).field1540;
                        if (var10 != -1) {
                            class248 var11 = class119.method893(var10, (byte) -41);
                            if (var11 != null && var11.field3667 != null) {
                                class361.method2512(arg0 ^ 0x7D53, var3.field5137, false, 0, var11, var3.field5165);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field2609.method1544(-18)) {
                    class249.method1834((byte) 112, var3);
                }
                var3.method1259(class343.method2393((byte) -27, class83.field1194.method1317((byte) 64)), (byte) 7);
                var3.method2351(var3.field2609.field3083, -19464);
                var3.field5149 = var3.field2609.field3081;
                var3.field5195 = var3.field2609.field3144;
                if (var3.field2609.method1544(-109)) {
                    class277.method2029(var3.field5186[0], var3, class321.field4835, (byte) 77, var3.field5162[0], 0, (class261) null, 0, (class228) null);
                }
            }
            if ((var4 & 0x100) != 0) {
                var3.field5157 = class83.field1194.method1317((byte) 47);
                var3.field5167 = class83.field1194.method1350(0);
            }
            if ((var4 & 0x2) != 0) {
                var3.field5138 = class83.field1194.method1329((byte) 59);
                var3.field5181 = 100;
            }
            if ((var4 & 0x4) != 0) {
                var3.field5183 = class83.field1194.method1317((byte) 16);
                if (var3.field5183 == 65535) {
                    var3.field5183 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                int var12 = class83.field1194.method1351(14794);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class83.field1194.method1317((byte) 18);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var13[var16] = var17;
                    var14[var16] = class83.field1194.method1351(arg0 + 18382);
                    var15[var16] = class83.field1194.method1317((byte) 45);
                }
                class55.method452(var3, var13, var15, (byte) -72, var14);
            }
            if ((var4 & 0x8) != 0) {
                int var18 = class83.field1194.method1319(255);
                int var19 = class83.field1194.method1319(255);
                var3.method2345(class304.field4560, var19, var18, 0);
                var3.field5129 = class304.field4560 + 300;
                var3.field5197 = class83.field1194.method1320((byte) 101);
            }
            if ((var4 & 0x80) != 0) {
                int var20 = class83.field1194.method1320((byte) 42);
                int var21 = class83.field1194.method1320((byte) 75);
                var3.method2345(class304.field4560, var21, var20, arg0 + 3588);
            }
            var1++;
        }
        field906++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIZII)V", line = 212)
    public static final void method505(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class340.field5255 = arg6;
        class38.field563 = arg5;
        field900++;
        class272.field4121 = arg2;
        class154.field2203 = arg3;
        class323.field4861 = arg0;
        if (arg4 && class272.field4121 >= 100) {
            class137.field1991 = class340.field5255 * 128 + 64;
            class166.field2385 = class323.field4861 * 128 + 64;
            class129.field1871 = class71.method584(class321.field4835, class137.field1991, 82, class166.field2385) - class154.field2203;
        }
        class86.field1208 = 2;
        if (arg1 != -26453) {
            method502(123);
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)I", line = 238)
    public static final int method506(int arg0) {
        if (arg0 == 1) {
            field910++;
            return ((class207.field3035 == 0 ? 0 : 1) << 22) + ((class38.field565 == 0 ? 0 : 1) << 20) + ((class177.field2547 ? 1 : 0) << 19) + (class93.field1299 << 17) + ((class173.field2497 & 0x3) << 11) + ((class221.field3304 ? 1 : 0) << 10) + ((class291.field4410 ? 1 : 0) << 9) + ((class86.field1219 ? 1 : 0) << 7) + ((class299.field4475 ? 1 : 0) << 6) + ((class229.field3472 ? 1 : 0) << 5) + ((class11.field176 ? 1 : 0) << 3) + (class257.field3849 & 0x7) + (((class197.field2863 ? 1 : 0) << 4) - (-((class324.field4888 ? 1 : 0) << 8) - ((class98.field1379 ? 1 : 0) << 13))) + (((class267.field4078 ? 1 : 0) << 15) - -((class128.field1862 ? 1 : 0) << 16)) - (-((class267.field4077 == 0 ? 0 : 1) << 21) + -(class155.method1114() << 23));
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", line = 250)
    public static final void method507(int arg0, String arg1, String arg2, int arg3) {
        class32.field458 = arg2;
        field902++;
        class20.field311 = arg3;
        class190.field2766 = arg1;
        if (class32.field458.equals("") || class190.field2766.equals("")) {
            class158.field2278 = 3;
        } else if (class15.field227 == -1) {
            class158.field2278 = -3;
            class192.field2803 = 0;
            class2.field76 = 0;
            class56.field819 = 1;
            if (arg0 != 10866) {
                field907 = (String[]) null;
            }
            class190 var4 = new class190(128);
            var4.method1355((byte) -115, 10);
            var4.method1354((int) (Math.random() * 9.9999999E7D), (byte) 118);
            var4.method1327(class248.method1827(false, class32.field458), (byte) 7);
            var4.method1354((int) (Math.random() * 9.9999999E7D), (byte) -125);
            var4.method1343(class190.field2766, 0);
            var4.method1354((int) (Math.random() * 9.9999999E7D), (byte) -79);
            var4.method1324(-126, class167.field2388, class343.field5308);
            class107.field1533.field2776 = 0;
            class107.field1533.method1355((byte) -110, 24);
            class107.field1533.method1355((byte) -109, var4.field2776 + 2);
            class107.field1533.method1361(552, (byte) 125);
            class107.field1533.method1349(0, 3009, var4.field2776, var4.field2718);
        } else {
            class303.method2139(-1490424168);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILph;)Z", line = 296)
    public static final boolean method508(int arg0, int arg1, int arg2, class361 arg3) {
        if (arg0 != 0) {
            method504(24);
        }
        byte[] var4 = arg3.method2520(arg1, arg2, (byte) -25);
        field904++;
        if (var4 == null) {
            return false;
        } else {
            class314.method2192(var4, (byte) 80);
            return true;
        }
    }
}
