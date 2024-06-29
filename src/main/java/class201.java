import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class201 extends InputStream {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3412 = 0;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3413 = 0;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3415 = 0;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[S")
    public static short[] field3414 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[[[B")
    public static byte[][][] field3421;

    @OriginalMember(owner = "client!we", name = "read", descriptor = "()I", line = 14)
    public final int read() {
        class177.method1342(30000L, 1);
        field3419++;
        return -1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 38)
    public static void method1501(byte arg0) {
        field3421 = (byte[][][]) null;
        field3414 = null;
        if (arg0 != -70) {
            field3416 = 106;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([SI)[S", line = 57)
    public static final short[] method1502(short[] arg0, int arg1) {
        field3422++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class161.method1233(arg0, 0, var2, arg1, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IJZI)Lbd;", line = 74)
    public static final class162 method1503(int arg0, long arg1, boolean arg2, int arg3) {
        field3417++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var5 = 1;
        long var6 = arg1 / (long) arg0;
        while (var6 != 0L) {
            var6 /= (long) arg0;
            var5++;
        }
        int var8 = var5;
        if (arg1 < 0L || arg2) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg1 < 0L) {
            var9[0] = 45;
        } else if (arg2) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg1 % (long) arg0);
            arg1 /= (long) arg0;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class162 var12 = new class162();
        var12.field2865 = var8;
        int var13 = -88 % ((9 - arg3) / 49);
        var12.field2817 = var9;
        return var12;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIZIIIIIII)Z", line = 146)
    public static final boolean method1504(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = arg7; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class206.field3484[var13][var14] = 0;
                class72.field1150[var13][var14] = 99999999;
            }
        }
        class206.field3484[arg3][arg8] = 99;
        field3420++;
        int var15 = arg3;
        class72.field1150[arg3][arg8] = 0;
        int var16 = arg8;
        int var17 = 0;
        byte var18 = 0;
        class112.field2033[var18] = arg3;
        boolean var19 = false;
        int var41 = var18 + 1;
        class250.field4180[var18] = arg8;
        int[][] var20 = class267.field4473[class157.field2765].field3061;
        label393: while (var17 != var41) {
            var16 = class250.field4180[var17];
            var15 = class112.field2033[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg11 == var15 && arg4 == var16) {
                var19 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class267.field4473[class157.field2765].method1352(arg9, arg11, arg6, arg2 - 1, arg4, var16, 1, var15)) {
                    var19 = true;
                    break;
                }
                if (arg2 < 10 && class267.field4473[class157.field2765].method1354(arg2 - 1, arg11, arg4, var15, var16, 128, arg6, arg9)) {
                    var19 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg10 != 0 && class267.field4473[class157.field2765].method1366(arg10, arg1, arg6, var16, arg12, arg4, (byte) -121, var15, arg11)) {
                var19 = true;
                break;
            }
            int var21 = class72.field1150[var15][var16] + 1;
            if (var15 > 0 && class206.field3484[var15 - 1][var16] == 0 && (var20[var15 - 1][var16] & 0x12C010E) == 0 && (var20[var15 - 1][arg6 + var16 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if ((arg6 - 1) <= var22) {
                        class112.field2033[var41] = var15 - 1;
                        class250.field4180[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class206.field3484[var15 - 1][var16] = 2;
                        class72.field1150[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class206.field3484[var15 + 1][var16] == 0 && (var20[arg6 + var15][var16] & 0x12C0183) == 0 && (var20[arg6 + var15][var16 + arg6 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if ((arg6 - 1) <= var23) {
                        class112.field2033[var41] = var15 + 1;
                        class250.field4180[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class206.field3484[var15 + 1][var16] = 8;
                        class72.field1150[var15 + 1][var16] = var21;
                        break;
                    }
                    if ((var20[arg6 + var15][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class206.field3484[var15][var16 - 1] == 0 && (var20[var15][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg6 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (arg6 - 1 <= var24) {
                        class112.field2033[var41] = var15;
                        class250.field4180[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class206.field3484[var15][var16 - 1] = 1;
                        class72.field1150[var15][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class206.field3484[var15][var16 + 1] == 0 && (var20[var15][var16 + arg6] & 0x12C0138) == 0 && (var20[var15 + arg6 - 1][arg6 + var16] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if ((arg6 - 1) <= var25) {
                        class112.field2033[var41] = var15;
                        class250.field4180[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class206.field3484[var15][var16 + 1] = 4;
                        class72.field1150[var15][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][arg6 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class206.field3484[var15 - 1][var16 - 1] == 0 && (var20[var15 - 1][arg6 + var16 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var20[arg6 + var15 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (var26 >= arg6 - 1) {
                        class112.field2033[var41] = var15 - 1;
                        class250.field4180[var41] = var16 - 1;
                        class206.field3484[var15 - 1][var16 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class72.field1150[var15 - 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var26 - 1] & 0x12C013E) != 0 || (var20[var15 + var26 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class206.field3484[var15 + 1][var16 - 1] == 0 && (var20[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var20[arg6 + var15][var16 - 1] & 0x12C0183) == 0 && (var20[arg6 + var15][var16 + arg6 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= (arg6 - 1)) {
                        class112.field2033[var41] = var15 + 1;
                        class250.field4180[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class206.field3484[var15 + 1][var16 - 1] = 9;
                        class72.field1150[var15 + 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[arg6 + var15][var16 - (1 - var27)] & 0x12C01E3) != 0 || (var20[var27 + var15 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class206.field3484[var15 - 1][var16 + 1] == 0 && (var20[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][var16 + arg6] & 0x12C0138) == 0 && (var20[var15][arg6 + var16] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (var28 >= (arg6 - 1)) {
                        class112.field2033[var41] = var15 - 1;
                        class250.field4180[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class206.field3484[var15 - 1][var16 + 1] = 6;
                        class72.field1150[var15 - 1][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 + var28 - 1][arg6 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class206.field3484[var15 + 1][var16 + 1] == 0 && (var20[var15 + 1][arg6 + var16] & 0x12C0138) == 0 && (var20[arg6 + var15][var16 + arg6] & 0x12C01E0) == 0 && (var20[arg6 + var15][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < arg6 - 1; var29++) {
                    if ((var20[var15 + var29 + 1][arg6 + var16] & 0x12C01F8) != 0 || (var20[arg6 + var15][var16 - (-var29 - 1)] & 0x12C01E3) != 0) {
                        continue label393;
                    }
                }
                class112.field2033[var41] = var15 + 1;
                class250.field4180[var41] = var16 + 1;
                class206.field3484[var15 + 1][var16 + 1] = 12;
                class72.field1150[var15 + 1][var16 + 1] = var21;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class92.field1629 = 0;
        if (!var19) {
            if (!arg5) {
                return false;
            }
            int var30 = 100;
            int var31 = 1000;
            byte var32 = 10;
            for (int var33 = arg11 - var32; var33 <= (arg11 + var32); var33++) {
                for (int var34 = arg4 - var32; var34 <= arg4 + var32; var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class72.field1150[var33][var34] < 100) {
                        int var35 = 0;
                        if (var34 < arg4) {
                            var35 = arg4 - var34;
                        } else if (arg10 + arg4 - 1 < var34) {
                            var35 = var34 - (arg4 - 1) - arg10;
                        }
                        int var36 = 0;
                        if (var33 < arg11) {
                            var36 = arg11 - var33;
                        } else if (var33 > (arg1 + arg11 - 1)) {
                            var36 = var33 + 1 - arg1 - arg11;
                        }
                        int var37 = var36 * var36 + (var35 * var35);
                        if (var37 < var31 || var31 == var37 && var30 > class72.field1150[var33][var34]) {
                            var30 = class72.field1150[var33][var34];
                            var31 = var37;
                            var16 = var34;
                            var15 = var33;
                        }
                    }
                }
            }
            if (var31 == 1000) {
                return false;
            }
            if (arg3 == var15 && arg8 == var16) {
                return false;
            }
            class92.field1629 = 1;
        }
        byte var38 = 0;
        class112.field2033[var38] = var15;
        int var42 = var38 + 1;
        class250.field4180[var38] = var16;
        int var39;
        int var40 = var39 = class206.field3484[var15][var16];
        while (arg3 != var15 || arg8 != var16) {
            if (var39 != var40) {
                var39 = var40;
                class112.field2033[var42] = var15;
                class250.field4180[var42++] = var16;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            var40 = class206.field3484[var15][var16];
        }
        if (var42 > 0) {
            class50.method365(98, var42, arg0);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
