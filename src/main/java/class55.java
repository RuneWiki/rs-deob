import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class55 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lqk;")
    public static class207 field1038 = class24.method212(255, "<br>(X");

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field1039 = 0;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lqk;")
    private static class207 field1025 = class24.method212(255, " has logged out)3");

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1021 = 0;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lqk;")
    public static class207 field1029 = field1025;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Z")
    public static boolean field1026 = false;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lqk;")
    public static class207 field1037 = class24.method212(255, "Impossible de trouver ");

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Z")
    public static boolean field1024;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Lsh;")
    public static final class212 method411(int arg0) {
        if (arg0 != -19536) {
            field1037 = null;
        }
        field1028++;
        try {
            return (class212) Class.forName("vk").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class201();
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqk;ZI)V")
    public static final void method412(class207 arg0, boolean arg1, int arg2) {
        short[] var3 = new short[16];
        field1031++;
        int var4 = arg1 ? 32768 : 0;
        class207 var5 = arg0.method1444((byte) -76);
        int var6 = 0;
        int var7 = var4 + (arg1 ? class141.field2441 : class100.field1809);
        if (arg2 != 2) {
            return;
        }
        for (int var8 = var4; var8 < var7; var8++) {
            class214 var11 = class83.method621(var8, -102);
            if (var11.field3786 && var11.method1533(32640).method1444((byte) -76).method1467(-1, var5) != -1) {
                if (var6 >= 50) {
                    class74.field1366 = -1;
                    class163.field2883 = null;
                    return;
                }
                if (var6 >= var3.length) {
                    short[] var12 = new short[var3.length * 2];
                    for (int var13 = 0; var13 < var6; var13++) {
                        var12[var13] = var3[var13];
                    }
                    var3 = var12;
                }
                var3[var6++] = (short) var8;
            }
        }
        class1.field14 = 0;
        class163.field2883 = var3;
        class74.field1366 = var6;
        class207[] var9 = new class207[class74.field1366];
        for (int var10 = 0; var10 < class74.field1366; var10++) {
            var9[var10] = class83.method621(var3[var10], 0).method1533(class280.method1901(arg2, 32642));
        }
        class90.method652(class163.field2883, var9, false);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Llh;B)V")
    public static final void method413(class286 arg0, byte arg1) {
        if (class160.field2844 == arg0.field5086 || arg0.field5052 == -1 || arg0.field5103 != 0 || (arg0.field5047 + 1) > class16.method101((byte) 71, arg0.field5052).field1150[arg0.field5069]) {
            int var2 = arg0.field5086 - arg0.field5038;
            int var3 = class160.field2844 - arg0.field5038;
            int var4 = arg0.field5027 * 128 + arg0.method83(true) * 64;
            int var5 = arg0.field5067 * 128 + (arg0.method83(true) * 64);
            int var6 = arg0.field5014 * 128 + arg0.method83(true) * 64;
            int var7 = arg0.field5055 * 128 + (arg0.method83(true) * 64);
            arg0.field5104 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg0.field5072 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
        }
        field1033++;
        if (arg1 != 100) {
            field1029 = null;
        }
        if (arg0.field5054 == 0) {
            arg0.field5098 = 1024;
        }
        arg0.field5015 = 0;
        if (arg0.field5054 == 1) {
            arg0.field5098 = 1536;
        }
        if (arg0.field5054 == 2) {
            arg0.field5098 = 0;
        }
        if (arg0.field5054 == 3) {
            arg0.field5098 = 512;
        }
        arg0.field5062 = arg0.field5098;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static final void method414(int arg0) {
        class141.field2445.method1390((byte) 119);
        field1027++;
        class249.field4511.method1390((byte) 123);
        if (arg0 == 3966) {
            class22.field352.method1390((byte) 108);
            class282.field4956.method1390((byte) 116);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method415(Component arg0, boolean arg1) {
        arg0.removeKeyListener(class70.field1244);
        field1035++;
        arg0.removeFocusListener(class70.field1244);
        class219.field3863 = -1;
        if (!arg1) {
            method411(99);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)V")
    public static final void method416(boolean arg0, int arg1) {
        if (arg0) {
            method411(42);
        }
        field1023++;
        class90 var2 = class221.method1575(4, arg1, 1651481952);
        var2.method651(-27655);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIZIIIIIII)Z")
    public static final boolean method417(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class276.field4839[var13][var40] = 0;
                class25.field528[var13][var40] = 99999999;
            }
        }
        class276.field4839[arg2][arg9] = 99;
        int var14 = arg2;
        field1036++;
        class25.field528[arg2][arg9] = 0;
        int var15 = arg9;
        int var16 = 0;
        boolean var17 = false;
        byte var18 = 0;
        class19.field315[var18] = arg2;
        int var41 = var18 + 1;
        class62.field1129[var18] = arg9;
        int[][] var19 = class133.field2303[class93.field1645].field2721;
        label372: while (var16 != var41) {
            var14 = class19.field315[var16];
            var15 = class62.field1129[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg1 == var14 && arg6 == var15) {
                var17 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class133.field2303[class93.field1645].method1133(arg10 - 1, var15, arg3, arg1, arg4, arg6, false, var14)) {
                    var17 = true;
                    break;
                }
                if (arg10 < 10 && class133.field2303[class93.field1645].method1130(var15, arg4, -55, arg6, var14, arg1, arg10 - 1, arg3)) {
                    var17 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg8 != 0 && class133.field2303[class93.field1645].method1126(arg8, arg6, var15, false, arg0, arg4, var14, arg7, arg1)) {
                var17 = true;
                break;
            }
            int var31 = class25.field528[var14][var15] + 1;
            if (var14 > 0 && class276.field4839[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][arg4 + var15 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if ((arg4 - 1) <= var32) {
                        class19.field315[var41] = var14 - 1;
                        class62.field1129[var41] = var15;
                        class276.field4839[var14 - 1][var15] = 2;
                        class25.field528[var14 - 1][var15] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class276.field4839[var14 + 1][var15] == 0 && (var19[arg4 + var14][var15] & 0x12C0183) == 0 && (var19[arg4 + var14][arg4 + var15 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if ((arg4 - 1) <= var33) {
                        class19.field315[var41] = var14 + 1;
                        class62.field1129[var41] = var15;
                        class276.field4839[var14 + 1][var15] = 8;
                        var41 = var41 + 1 & 0xFFF;
                        class25.field528[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[arg4 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class276.field4839[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg4 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= (arg4 - 1)) {
                        class19.field315[var41] = var14;
                        class62.field1129[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class276.field4839[var14][var15 - 1] = 1;
                        class25.field528[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class276.field4839[var14][var15 + 1] == 0 && (var19[var14][arg4 + var15] & 0x12C0138) == 0 && (var19[arg4 + var14 - 1][var15 + arg4] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (arg4 - 1 <= var35) {
                        class19.field315[var41] = var14;
                        class62.field1129[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class276.field4839[var14][var15 + 1] = 4;
                        class25.field528[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg4 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class276.field4839[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][arg4 + var15 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg4 + var14 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (arg4 - 1 <= var36) {
                        class19.field315[var41] = var14 - 1;
                        class62.field1129[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class276.field4839[var14 - 1][var15 - 1] = 3;
                        class25.field528[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var36 + var15 - 1] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class276.field4839[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg4][var15 - 1] & 0x12C0183) == 0 && (var19[arg4 + var14][var15 + arg4 - 2] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (var37 >= (arg4 - 1)) {
                        class19.field315[var41] = var14 + 1;
                        class62.field1129[var41] = var15 - 1;
                        class276.field4839[var14 + 1][var15 - 1] = 9;
                        var41 = var41 + 1 & 0xFFF;
                        class25.field528[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + arg4][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class276.field4839[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg4 + var15] & 0x12C0138) == 0 && (var19[var14][var15 + arg4] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg4 - 1) {
                        class19.field315[var41] = var14 - 1;
                        class62.field1129[var41] = var15 + 1;
                        class276.field4839[var14 - 1][var15 + 1] = 6;
                        var41 = var41 + 1 & 0xFFF;
                        class25.field528[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var38 + var15 + 1] & 0x12C013E) != 0 || (var19[var38 + var14 - 1][arg4 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class276.field4839[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg4 + var15] & 0x12C0138) == 0 && (var19[arg4 + var14][var15 + arg4] & 0x12C01E0) == 0 && (var19[arg4 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < (arg4 - 1); var39++) {
                    if ((var19[var14 + var39 + 1][arg4 + var15] & 0x12C01F8) != 0 || (var19[arg4 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class19.field315[var41] = var14 + 1;
                class62.field1129[var41] = var15 + 1;
                class276.field4839[var14 + 1][var15 + 1] = 12;
                class25.field528[var14 + 1][var15 + 1] = var31;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class140.field2423 = 0;
        if (!var17) {
            if (!arg5) {
                return false;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg1 - var22; var23 <= arg1 + var22; var23++) {
                for (int var24 = arg6 - var22; var24 <= arg6 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class25.field528[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg1 > var23) {
                            var25 = arg1 - var23;
                        } else if (var23 > arg0 + arg1 - 1) {
                            var25 = var23 - (arg0 + arg1 - 1);
                        }
                        int var26 = 0;
                        if (var24 < arg6) {
                            var26 = arg6 - var24;
                        } else if (arg6 + arg8 - 1 < var24) {
                            var26 = var24 + 1 - arg6 - arg8;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var21 || var21 == var27 && var20 > class25.field528[var23][var24]) {
                            var14 = var23;
                            var15 = var24;
                            var21 = var27;
                            var20 = class25.field528[var23][var24];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg2 == var14 && arg9 == var15) {
                return false;
            }
            class140.field2423 = 1;
        }
        byte var28 = 0;
        class19.field315[var28] = var14;
        int var42 = var28 + 1;
        class62.field1129[var28] = var15;
        int var29;
        int var30 = var29 = class276.field4839[var14][var15];
        while (arg2 != var14 || arg9 != var15) {
            if (var29 != var30) {
                class19.field315[var42] = var14;
                var29 = var30;
                class62.field1129[var42++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class276.field4839[var14][var15];
        }
        if (var42 > 0) {
            class248.method1744(var42, (byte) -65, arg11);
            return true;
        }
        if (arg12 != 19661304) {
            field1022 = 33;
        }
        if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILv;)Lsg;")
    public static final class162 method418(int arg0, class149 arg1) {
        field1032++;
        if (arg0 >= -117) {
            field1026 = true;
        }
        return new class162(arg1.method1075(65536), arg1.method1075(65536), arg1.method1075(65536), arg1.method1075(65536), arg1.method1065((byte) 38), arg1.method1065((byte) 64), arg1.method1045((byte) -125));
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
    public static void method419(int arg0) {
        field1029 = null;
        field1038 = null;
        int var1 = -6 / ((arg0 + 39) / 53);
        field1037 = null;
        field1025 = null;
    }
}
