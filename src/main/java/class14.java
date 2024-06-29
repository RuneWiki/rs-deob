import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class14 extends class97 {

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field285 = 0;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Lea;")
    private static class38 field294 = class9.method46((byte) 109, "Error connecting to server)3");

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lea;")
    public static class38 field283 = field294;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "Lea;")
    private static class38 field300 = class9.method46((byte) 109, "World");

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lea;")
    public static class38 field290 = field300;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "Lea;")
    public static class38 field297 = field300;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "Lpg;")
    public static class141 field298 = new class141();

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Lm;")
    public static class107 field289;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "Lob;")
    public static class127 field303;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Lbd;")
    public class14 field292;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Lbd;")
    public class14 field293;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)I")
    public static final int method78(int arg0, byte arg1, int arg2) {
        field286++;
        int var3 = class165.method1179(arg0 - 1, arg2 - 1, (byte) 120) + class165.method1179(arg0 - 1, arg2 - -1, (byte) 122) + class165.method1179(arg0 + 1, arg2 + -1, (byte) 121) + class165.method1179(arg0 + 1, arg2 + 1, (byte) 125);
        int var4 = 6 % ((arg1 + 81) / 33);
        int var5 = class165.method1179(arg0, arg2 - 1, (byte) 122) + class165.method1179(arg0, arg2 + 1, (byte) 118) + class165.method1179(arg0 - 1, arg2, (byte) 120) + class165.method1179(arg0 + 1, arg2, (byte) 116);
        int var6 = class165.method1179(arg0, arg2, (byte) 116);
        return var3 / 16 + var5 / 8 + var6 / 4;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static final void method79(int arg0) {
        class120.field2598.method1083(3056);
        if (arg0 == -1) {
            class198.field3908.method1083(3056);
            field296++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Ln;")
    public static final class116 method80(byte arg0) {
        if (arg0 < 46) {
            field290 = null;
        }
        field284++;
        try {
            return (class116) Class.forName("mc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIZIIIIIII)Z")
    public static final boolean method81(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field288++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class75.field1821[var12][var36] = 0;
                class163.field3386[var12][var36] = 99999999;
            }
        }
        class75.field1821[arg3][arg0] = 99;
        class163.field3386[arg3][arg0] = arg10;
        int var13 = arg3;
        int var14 = arg0;
        int var15 = 0;
        byte var16 = 0;
        class144.field3013[var16] = arg3;
        int var37 = var16 + 1;
        class194.field3815[var16] = arg0;
        int var17 = class144.field3013.length;
        boolean var18 = false;
        int[][] var19 = class160.field3337[class10.field224].field1389;
        while (var15 != var37) {
            var13 = class144.field3013[var15];
            var14 = class194.field3815[var15];
            var15 = (var15 + 1) % var17;
            if (arg2 == var13 && arg9 == var14) {
                var18 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class160.field3337[class10.field224].method404(arg9, var13, arg2, var14, -3, arg6 - 1, arg8)) {
                    var18 = true;
                    break;
                }
                if (arg6 < 10 && class160.field3337[class10.field224].method402(arg8, var14, (byte) -57, arg2, arg9, arg6 - 1, var13)) {
                    var18 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg7 != 0 && class160.field3337[class10.field224].method396(arg7, arg1, arg11, false, var13, var14, arg9, arg2)) {
                var18 = true;
                break;
            }
            int var35 = class163.field3386[var13][var14] + 1;
            if (var13 > 0 && class75.field1821[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class144.field3013[var37] = var13 - 1;
                class194.field3815[var37] = var14;
                class75.field1821[var13 - 1][var14] = 2;
                class163.field3386[var13 - 1][var14] = var35;
                var37 = (var37 + 1) % var17;
            }
            if (var13 < 103 && class75.field1821[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class144.field3013[var37] = var13 + 1;
                class194.field3815[var37] = var14;
                var37 = (var37 + 1) % var17;
                class75.field1821[var13 + 1][var14] = 8;
                class163.field3386[var13 + 1][var14] = var35;
            }
            if (var14 > 0 && class75.field1821[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class144.field3013[var37] = var13;
                class194.field3815[var37] = var14 - 1;
                class75.field1821[var13][var14 - 1] = 1;
                var37 = (var37 + 1) % var17;
                class163.field3386[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class75.field1821[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class144.field3013[var37] = var13;
                class194.field3815[var37] = var14 + 1;
                var37 = (var37 + 1) % var17;
                class75.field1821[var13][var14 + 1] = 4;
                class163.field3386[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class75.field1821[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class144.field3013[var37] = var13 - 1;
                class194.field3815[var37] = var14 - 1;
                var37 = (var37 + 1) % var17;
                class75.field1821[var13 - 1][var14 - 1] = 3;
                class163.field3386[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class75.field1821[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class144.field3013[var37] = var13 + 1;
                class194.field3815[var37] = var14 - 1;
                class75.field1821[var13 + 1][var14 - 1] = 9;
                var37 = (var37 + 1) % var17;
                class163.field3386[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class75.field1821[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class144.field3013[var37] = var13 - 1;
                class194.field3815[var37] = var14 + 1;
                class75.field1821[var13 - 1][var14 + 1] = 6;
                var37 = (var37 + 1) % var17;
                class163.field3386[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class75.field1821[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class144.field3013[var37] = var13 + 1;
                class194.field3815[var37] = var14 + 1;
                class75.field1821[var13 + 1][var14 + 1] = 12;
                class163.field3386[var13 + 1][var14 + 1] = var35;
                var37 = (var37 + 1) % var17;
            }
        }
        class56.field1424 = 0;
        if (!var18) {
            if (!arg4) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg2 - var22; var23 <= arg2 + var22; var23++) {
                for (int var24 = arg9 - var22; var24 <= arg9 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class163.field3386[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg9 > var24) {
                            var26 = arg9 - var24;
                        } else if (var24 > arg7 + arg9 - 1) {
                            var26 = var24 + 1 - arg7 - arg9;
                        }
                        if (arg2 > var23) {
                            var25 = arg2 - var23;
                        } else if (var23 > arg2 + arg11 - 1) {
                            var25 = var23 + 1 - arg2 - arg11;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class163.field3386[var23][var24] < var21) {
                            var13 = var23;
                            var14 = var24;
                            var20 = var27;
                            var21 = class163.field3386[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg3 == var13 && arg0 == var14) {
                return false;
            }
            class56.field1424 = 1;
        }
        byte var28 = 0;
        class144.field3013[var28] = var13;
        int var38 = var28 + 1;
        class194.field3815[var28] = var14;
        int var29;
        int var30 = var29 = class75.field1821[var13][var14];
        while (arg3 != var13 || arg0 != var14) {
            if (var29 != var30) {
                class144.field3013[var38] = var13;
                class194.field3815[var38++] = var14;
                var29 = var30;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class75.field1821[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class144.field3013[var38];
            int var33 = class194.field3815[var38];
            if (arg5 == 0) {
                class111.field2483.method169(-1494101117, 46);
                class111.field2483.method495(102, var31 + var31 + 3);
                class51.field1307++;
            }
            if (arg5 == 1) {
                class111.field2483.method169(-1494101117, 11);
                class126.field2703++;
                class111.field2483.method495(arg10 ^ 0x6E, var31 + var31 + 17);
            }
            if (arg5 == 2) {
                class62.field1493++;
                class111.field2483.method169(-1494101117, 59);
                class111.field2483.method495(99, var31 + var31 + 3);
            }
            class185.field3674 = class144.field3013[0];
            class191.field3763 = class194.field3815[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class111.field2483.method495(97, class144.field3013[var38] - var32);
                class111.field2483.method477((byte) -85, class194.field3815[var38] - var33);
            }
            class111.field2483.method476(19058, class135.field2845 + var32);
            class111.field2483.method493(class127.field2712 + var33, false);
            class111.field2483.method495(arg10 + 126, class50.field1244[82] ? 1 : 0);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public static void method82(int arg0) {
        field294 = null;
        field283 = null;
        if (arg0 != 8) {
            field300 = null;
        }
        field290 = null;
        field303 = null;
        field298 = null;
        field297 = null;
        field300 = null;
        field289 = null;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public static final void method83(int arg0) {
        field299++;
        if (!class23.field489) {
            return;
        }
        class43 var1 = class193.method1283(class86.field2002, (byte) -39, class57.field1433);
        if (var1 != null && var1.field969 != null) {
            class48 var2 = new class48();
            var2.field1153 = var1;
            var2.field1166 = var1.field969;
            class113.method894(var2, (byte) 124);
        }
        class23.field489 = false;
        if (arg0 != 1) {
            field297 = null;
        }
        class172.method1209(var1, -1);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)V")
    public static final void method84(int arg0, boolean arg1) {
        if (arg0 != 151) {
            return;
        }
        field291++;
        if (class113.field2515 == null) {
            return;
        }
        try {
            class66 var2 = new class66(4);
            var2.method495(100, arg1 ? 2 : 3);
            var2.method461(0, -110);
            class113.field2515.method361(0, (byte) 126, var2.field1627, 4);
        } catch (IOException var4) {
            try {
                class113.field2515.method366((byte) -128);
            } catch (Exception var3) {
            }
            class113.field2515 = null;
            class140.field2943++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V")
    public final void method85(boolean arg0) {
        field287++;
        if (this.field293 == null) {
            return;
        }
        this.field293.field292 = this.field292;
        this.field292.field293 = this.field293;
        this.field293 = null;
        this.field292 = null;
        if (arg0) {
            field298 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILdd;)V")
    public static final void method86(int arg0, class32 arg1) {
        field302++;
        int var2 = -36 / ((-arg0 - 37) / 53);
        class130.field2781 = arg1;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public static final void method87(int arg0) {
        class175.field3542 = new int[151];
        field295++;
        class3.field110 = new int[33];
        class103.field2321 = new int[151];
        class163.field3381 = new int[33];
        for (int var1 = 0; var1 < 33; var1++) {
            int var6 = 0;
            int var7 = 999;
            for (int var8 = 0; var8 < 34; var8++) {
                if (class80.field1893.field1142[var8 + class80.field1893.field1147 * var1] == 0) {
                    if (var7 == 999) {
                        var7 = var8;
                    }
                } else if (var7 != 999) {
                    var6 = var8;
                    break;
                }
            }
            class3.field110[var1] = var7;
            class163.field3381[var1] = var6 - var7;
        }
        if (arg0 != -7274) {
            method80((byte) 16);
        }
        for (int var2 = 5; var2 < 156; var2++) {
            int var3 = 999;
            int var4 = 0;
            for (int var5 = 25; var5 < 172; var5++) {
                if (class80.field1893.field1142[var5 + class80.field1893.field1147 * var2] == 0 && (var5 > 34 || var2 > 34)) {
                    if (var3 == 999) {
                        var3 = var5;
                    }
                } else if (var3 != 999) {
                    var4 = var5;
                    break;
                }
            }
            class103.field2321[var2 - 5] = var3 - 25;
            class175.field3542[var2 - 5] = var4 - var3;
        }
    }
}
