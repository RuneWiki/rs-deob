import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 extends class152 {

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    private int field4 = 0;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    private int field3 = 1;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    private int field13 = 0;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field8 = 0;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "Lce;")
    public static class126 field7 = class206.method1445(-7923, "Cabbage");

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "[[[B")
    public static byte[][][] field10;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V", line = 5)
    public static void method1(int arg0) {
        field10 = (byte[][][]) null;
        field7 = null;
        if (arg0 != -4528) {
            method1(61);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 21)
    public class1() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V", line = 30)
    public final void method2(byte arg0) {
        field2++;
        int var2 = 53 / ((2 - arg0) / 37);
        class158.method1159(-121);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZIIIIIIZIIII)Z", line = 66)
    public static final boolean method3(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        field11++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class53.field811[var13][var14] = 0;
                class244.field4127[var13][var14] = 99999999;
            }
        }
        class53.field811[arg9][arg12] = 99;
        class244.field4127[arg9][arg12] = 0;
        int var15 = arg9;
        int var16 = arg12;
        int var17 = 0;
        byte var18 = 0;
        boolean var19 = arg1;
        class205.field3520[var18] = arg9;
        int var41 = var18 + 1;
        class140.field2564[var18] = arg12;
        int[][] var20 = class94.field1475[class131.field2250].field460;
        label400: while (var17 != var41) {
            var15 = class205.field3520[var17];
            var16 = class140.field2564[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg11 == var15 && arg3 == var16) {
                var19 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class94.field1475[class131.field2250].method155(-123, arg7, arg11, arg3, arg10, arg5 - 1, var15, var16)) {
                    var19 = true;
                    break;
                }
                if (arg5 < 10 && class94.field1475[class131.field2250].method166(arg10, 0, arg7, var16, arg3, arg5 - 1, var15, arg11)) {
                    var19 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg2 != 0 && class94.field1475[class131.field2250].method170(arg2, (byte) -98, arg10, arg6, var16, arg3, arg0, arg11, var15)) {
                var19 = true;
                break;
            }
            int var21 = class244.field4127[var15][var16] + 1;
            if (var15 > 0 && class53.field811[var15 - 1][var16] == 0 && (var20[var15 - 1][var16] & 0x12C010E) == 0 && (var20[var15 - 1][var16 - (1 - arg10)] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= arg10 - 1) {
                        class205.field3520[var41] = var15 - 1;
                        class140.field2564[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class53.field811[var15 - 1][var16] = 2;
                        class244.field4127[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class53.field811[var15 + 1][var16] == 0 && (var20[var15 + arg10][var16] & 0x12C0183) == 0 && (var20[arg10 + var15][arg10 + var16 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (arg10 - 1 <= var23) {
                        class205.field3520[var41] = var15 + 1;
                        class140.field2564[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class53.field811[var15 + 1][var16] = 8;
                        class244.field4127[var15 + 1][var16] = var21;
                        break;
                    }
                    if ((var20[arg10 + var15][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class53.field811[var15][var16 - 1] == 0 && (var20[var15][var16 - 1] & 0x12C010E) == 0 && (var20[arg10 + var15 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if ((arg10 - 1) <= var24) {
                        class205.field3520[var41] = var15;
                        class140.field2564[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class53.field811[var15][var16 - 1] = 1;
                        class244.field4127[var15][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class53.field811[var15][var16 + 1] == 0 && (var20[var15][arg10 + var16] & 0x12C0138) == 0 && (var20[arg10 + var15 - 1][var16 + arg10] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if ((arg10 - 1) <= var25) {
                        class205.field3520[var41] = var15;
                        class140.field2564[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class53.field811[var15][var16 + 1] = 4;
                        class244.field4127[var15][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][var16 + arg10] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class53.field811[var15 - 1][var16 - 1] == 0 && (var20[var15 - 1][arg10 + var16 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg10 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if ((arg10 - 1) <= var26) {
                        class205.field3520[var41] = var15 - 1;
                        class140.field2564[var41] = var16 - 1;
                        class53.field811[var15 - 1][var16 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class244.field4127[var15 - 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var26 - 1] & 0x12C013E) != 0 || (var20[var15 + var26 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class53.field811[var15 + 1][var16 - 1] == 0 && (var20[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var20[arg10 + var15][var16 - 1] & 0x12C0183) == 0 && (var20[arg10 + var15][arg10 + (var16 - 1) - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= arg10 - 1) {
                        class205.field3520[var41] = var15 + 1;
                        class140.field2564[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class53.field811[var15 + 1][var16 - 1] = 9;
                        class244.field4127[var15 + 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[arg10 + var15][var16 + var27 - 1] & 0x12C01E3) != 0 || (var20[var27 + var15 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class53.field811[var15 - 1][var16 + 1] == 0 && (var20[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][arg10 + var16] & 0x12C0138) == 0 && (var20[var15][arg10 + var16] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if ((arg10 - 1) <= var28) {
                        class205.field3520[var41] = var15 - 1;
                        class140.field2564[var41] = var16 + 1;
                        class53.field811[var15 - 1][var16 + 1] = 6;
                        class244.field4127[var15 - 1][var16 + 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var28 + 1] & 0x12C013E) != 0 || (var20[var28 + var15 - 1][arg10 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class53.field811[var15 + 1][var16 + 1] == 0 && (var20[var15 + 1][arg10 + var16] & 0x12C0138) == 0 && (var20[arg10 + var15][arg10 + var16] & 0x12C01E0) == 0 && (var20[arg10 + var15][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < (arg10 - 1); var29++) {
                    if ((var20[var15 + var29 + 1][arg10 + var16] & 0x12C01F8) != 0 || (var20[arg10 + var15][var16 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label400;
                    }
                }
                class205.field3520[var41] = var15 + 1;
                class140.field2564[var41] = var16 + 1;
                class53.field811[var15 + 1][var16 + 1] = 12;
                var41 = var41 + 1 & 0xFFF;
                class244.field4127[var15 + 1][var16 + 1] = var21;
            }
        }
        class195.field3354 = 0;
        if (!var19) {
            if (!arg8) {
                return false;
            }
            int var30 = 1000;
            byte var31 = 10;
            int var32 = 100;
            for (int var33 = arg11 - var31; var33 <= arg11 + var31; var33++) {
                for (int var34 = arg3 - var31; var34 <= (arg3 + var31); var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class244.field4127[var33][var34] < 100) {
                        int var35 = 0;
                        if (arg3 > var34) {
                            var35 = arg3 - var34;
                        } else if (arg3 + arg2 - 1 < var34) {
                            var35 = var34 + 1 - arg2 - arg3;
                        }
                        int var36 = 0;
                        if (arg11 > var33) {
                            var36 = arg11 - var33;
                        } else if (var33 > arg0 + arg11 - 1) {
                            var36 = var33 + 1 - (arg0 + arg11);
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var37 < var30 || var30 == var37 && var32 > class244.field4127[var33][var34]) {
                            var16 = var34;
                            var30 = var37;
                            var32 = class244.field4127[var33][var34];
                            var15 = var33;
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg9 == var15 && arg12 == var16) {
                return false;
            }
            class195.field3354 = 1;
        }
        byte var38 = 0;
        class205.field3520[var38] = var15;
        int var42 = var38 + 1;
        class140.field2564[var38] = var16;
        int var39;
        int var40 = var39 = class53.field811[var15][var16];
        while (arg9 != var15 || arg12 != var16) {
            if (var39 != var40) {
                var39 = var40;
                class205.field3520[var42] = var15;
                class140.field2564[var42++] = var16;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            var40 = class53.field811[var15][var16];
        }
        if (var42 > 0) {
            class97.method660((byte) 35, var42, arg4);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V", line = 563)
    public static final void method4(int arg0) {
        class75.field1208.method1185(1);
        field9++;
        if (arg0 != 3) {
            field6 = 111;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILbb;)V", line = 589)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field1++;
        if (arg1 == 0) {
            this.field13 = arg2.method948(-128);
        } else if (arg1 == 1) {
            this.field4 = arg2.method948(-124);
        } else if (arg1 == 3) {
            this.field3 = arg2.method948(-123);
        }
        if (arg0 != 8) {
            field8 = 1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[I", line = 633)
    public final int[] method6(boolean arg0, int arg1) {
        field5++;
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int var4 = class122.field2038[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class244.field4133; var6++) {
                int var7 = class29.field406[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field13 == 0) {
                    var9 = (var7 - var4) * this.field3;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field4 == 0) {
                    var12 = class24.field344[(var12 & 0xFF6) >> 4] + 4096 >> 1;
                } else if (this.field4 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
