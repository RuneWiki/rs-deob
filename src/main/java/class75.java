import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class75 extends class17 {

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "I")
    private int field1149 = 0;

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
    private int field1151 = 1;

    @OriginalMember(owner = "client!kg", name = "kb", descriptor = "I")
    private int field1157 = 0;

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "[J")
    public static long[] field1153 = new long[100];

    @OriginalMember(owner = "client!kg", name = "ob", descriptor = "I")
    public static int field1161 = 2301979;

    @OriginalMember(owner = "client!kg", name = "mb", descriptor = "Lsf;")
    private static class108 field1159 = class140.method973(255, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "Lsf;")
    public static class108 field1148 = field1159;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!kg", name = "hb", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!kg", name = "ib", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!kg", name = "jb", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!kg", name = "lb", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!kg", name = "nb", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!kg", name = "pb", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!kg", name = "qb", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "(I)I", line = 4)
    public static final int method491(int arg0) {
        field1162++;
        if (arg0 != -1) {
            field1161 = -106;
        }
        return class114.field1984;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(II)[I", line = 22)
    public final int[] method120(int arg0, int arg1) {
        field1147++;
        if (arg0 > -95) {
            method492(122, (KeyEvent) null);
        }
        int[] var3 = this.field217.method1698(-126, arg1);
        if (this.field217.field4295) {
            int var4 = class36.field504[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class116.field2008; var6++) {
                int var7 = class61.field979[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field1149 == 0) {
                    var11 = (var7 - var4) * this.field1151;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1151 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field1157 == 0) {
                    var12 = class246.field4264[(var12 & 0xFF0) >> 4] + 4096 >> 1;
                } else if (this.field1157 == 2) {
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

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)V", line = 92)
    public final void method116(boolean arg0) {
        class271.method1959(1);
        field1160++;
        if (!arg0) {
            method495(-27, 63, 120, 34, (byte) -10, 113, -85, -6, -111, true, -66, 100, 67);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 109)
    public static final int method492(int arg0, KeyEvent arg1) {
        field1163++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (arg0 != 104) {
            method493((byte) -106, -6);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 712)
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V", line = 136)
    public static final void method493(byte arg0, int arg1) {
        if (arg0 != 98) {
            field1161 = -48;
        }
        field1150++;
        if (arg1 >= 0 && arg1 < class194.field3486.length) {
            class194.field3486[arg1] = !class194.field3486[arg1];
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLrm;I)V", line = 153)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field1152++;
        if (arg2 == 0) {
            this.field1149 = arg1.method1731(true);
        } else if (arg2 == 1) {
            this.field1157 = arg1.method1731(true);
        } else if (arg2 == 3) {
            this.field1151 = arg1.method1731(true);
        }
        if (arg0 != -114) {
            field1159 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "(I)V", line = 198)
    public static void method494(int arg0) {
        field1159 = null;
        field1148 = null;
        field1153 = null;
        if (arg0 != 1) {
            method492(60, (KeyEvent) null);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIBIIIIZIII)Z", line = 214)
    public static final boolean method495(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12) {
        int var13 = 15 % ((arg4 + 25) / 57);
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                class83.field1280[var14][var15] = 0;
                class324.field5523[var14][var15] = 99999999;
            }
        }
        class83.field1280[arg2][arg1] = 99;
        class324.field5523[arg2][arg1] = 0;
        field1154++;
        int var16 = arg1;
        int var17 = arg2;
        byte var18 = 0;
        int var19 = 0;
        class5.field66[var18] = arg2;
        int var42 = var18 + 1;
        class26.field405[var18] = arg1;
        boolean var20 = false;
        int[][] var21 = class330.field5644[class295.field5159].field5605;
        label396: while (var42 != var19) {
            var16 = class26.field405[var19];
            var17 = class5.field66[var19];
            var19 = var19 + 1 & 0xFFF;
            if (arg5 == var17 && arg11 == var16) {
                var20 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class330.field5644[class295.field5159].method2249(arg11, arg6, arg5, arg8, var16, 1, var17, arg10 - 1)) {
                    var20 = true;
                    break;
                }
                if (arg10 < 10 && class330.field5644[class295.field5159].method2236(arg5, arg11, arg10 - 1, -1, arg8, var16, arg6, var17)) {
                    var20 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg12 != 0 && class330.field5644[class295.field5159].method2237(arg7, var17, arg12, arg5, arg3, var16, (byte) -123, arg6, arg11)) {
                var20 = true;
                break;
            }
            int var22 = class324.field5523[var17][var16] + 1;
            if (var17 > 0 && class83.field1280[var17 - 1][var16] == 0 && (var21[var17 - 1][var16] & 0x12C010E) == 0 && (var21[var17 - 1][var16 - (1 - arg6)] & 0x12C0138) == 0) {
                int var23 = 1;
                while (true) {
                    if (arg6 - 1 <= var23) {
                        class5.field66[var42] = var17 - 1;
                        class26.field405[var42] = var16;
                        class83.field1280[var17 - 1][var16] = 2;
                        var42 = var42 + 1 & 0xFFF;
                        class324.field5523[var17 - 1][var16] = var22;
                        break;
                    }
                    if ((var21[var17 - 1][var16 + var23] & 0x12C013E) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var17 < 102 && class83.field1280[var17 + 1][var16] == 0 && (var21[arg6 + var17][var16] & 0x12C0183) == 0 && (var21[arg6 + var17][var16 + arg6 - 1] & 0x12C01E0) == 0) {
                int var24 = 1;
                while (true) {
                    if (arg6 - 1 <= var24) {
                        class5.field66[var42] = var17 + 1;
                        class26.field405[var42] = var16;
                        var42 = var42 + 1 & 0xFFF;
                        class83.field1280[var17 + 1][var16] = 8;
                        class324.field5523[var17 + 1][var16] = var22;
                        break;
                    }
                    if ((var21[arg6 + var17][var16 + var24] & 0x12C01E3) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 > 0 && class83.field1280[var17][var16 - 1] == 0 && (var21[var17][var16 - 1] & 0x12C010E) == 0 && (var21[var17 + arg6 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg6 - 1 <= var25) {
                        class5.field66[var42] = var17;
                        class26.field405[var42] = var16 - 1;
                        var42 = var42 + 1 & 0xFFF;
                        class83.field1280[var17][var16 - 1] = 1;
                        class324.field5523[var17][var16 - 1] = var22;
                        break;
                    }
                    if ((var21[var17 + var25][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var16 < 102 && class83.field1280[var17][var16 + 1] == 0 && (var21[var17][arg6 + var16] & 0x12C0138) == 0 && (var21[var17 + arg6 - 1][arg6 + var16] & 0x12C01E0) == 0) {
                int var26 = 1;
                while (true) {
                    if (var26 >= arg6 - 1) {
                        class5.field66[var42] = var17;
                        class26.field405[var42] = var16 + 1;
                        var42 = var42 + 1 & 0xFFF;
                        class83.field1280[var17][var16 + 1] = 4;
                        class324.field5523[var17][var16 + 1] = var22;
                        break;
                    }
                    if ((var21[var17 + var26][arg6 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var17 > 0 && var16 > 0 && class83.field1280[var17 - 1][var16 - 1] == 0 && (var21[var17 - 1][arg6 + var16 - 1 - 1] & 0x12C0138) == 0 && (var21[var17 - 1][var16 - 1] & 0x12C010E) == 0 && (var21[arg6 + var17 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= (arg6 - 1)) {
                        class5.field66[var42] = var17 - 1;
                        class26.field405[var42] = var16 - 1;
                        class83.field1280[var17 - 1][var16 - 1] = 3;
                        class324.field5523[var17 - 1][var16 - 1] = var22;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var21[var17 - 1][var16 + var27 - 1] & 0x12C013E) != 0 || (var21[var17 + var27 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var17 < 102 && var16 > 0 && class83.field1280[var17 + 1][var16 - 1] == 0 && (var21[var17 + 1][var16 - 1] & 0x12C010E) == 0 && (var21[arg6 + var17][var16 - 1] & 0x12C0183) == 0 && (var21[arg6 + var17][arg6 + var16 - 1 - 1] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if ((arg6 - 1) <= var28) {
                        class5.field66[var42] = var17 + 1;
                        class26.field405[var42] = var16 - 1;
                        class83.field1280[var17 + 1][var16 - 1] = 9;
                        var42 = var42 + 1 & 0xFFF;
                        class324.field5523[var17 + 1][var16 - 1] = var22;
                        break;
                    }
                    if ((var21[var17 + arg6][var28 + var16 - 1] & 0x12C01E3) != 0 || (var21[var17 + var28 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var17 > 0 && var16 < 102 && class83.field1280[var17 - 1][var16 + 1] == 0 && (var21[var17 - 1][var16 + 1] & 0x12C010E) == 0 && (var21[var17 - 1][arg6 + var16] & 0x12C0138) == 0 && (var21[var17][arg6 + var16] & 0x12C01E0) == 0) {
                int var29 = 1;
                while (true) {
                    if (arg6 - 1 <= var29) {
                        class5.field66[var42] = var17 - 1;
                        class26.field405[var42] = var16 + 1;
                        var42 = var42 + 1 & 0xFFF;
                        class83.field1280[var17 - 1][var16 + 1] = 6;
                        class324.field5523[var17 - 1][var16 + 1] = var22;
                        break;
                    }
                    if ((var21[var17 - 1][var16 + var29 + 1] & 0x12C013E) != 0 || (var21[var17 + var29 - 1][var16 + arg6] & 0x12C01F8) != 0) {
                        break;
                    }
                    var29++;
                }
            }
            if (var17 < 102 && var16 < 102 && class83.field1280[var17 + 1][var16 + 1] == 0 && (var21[var17 + 1][var16 + arg6] & 0x12C0138) == 0 && (var21[arg6 + var17][arg6 + var16] & 0x12C01E0) == 0 && (var21[arg6 + var17][var16 + 1] & 0x12C0183) == 0) {
                for (int var30 = 1; var30 < arg6 - 1; var30++) {
                    if ((var21[var17 + var30 + 1][var16 + arg6] & 0x12C01F8) != 0 || (var21[arg6 + var17][var16 + var30 + 1] & 0x12C01E3) != 0) {
                        continue label396;
                    }
                }
                class5.field66[var42] = var17 + 1;
                class26.field405[var42] = var16 + 1;
                class83.field1280[var17 + 1][var16 + 1] = 12;
                var42 = var42 + 1 & 0xFFF;
                class324.field5523[var17 + 1][var16 + 1] = var22;
            }
        }
        class84.field1328 = 0;
        if (!var20) {
            if (!arg9) {
                return false;
            }
            int var31 = 100;
            int var32 = 1000;
            byte var33 = 10;
            for (int var34 = arg5 - var33; var34 <= arg5 + var33; var34++) {
                for (int var35 = arg11 - var33; var35 <= (arg11 + var33); var35++) {
                    if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && class324.field5523[var34][var35] < 100) {
                        int var36 = 0;
                        if (arg5 > var34) {
                            var36 = arg5 - var34;
                        } else if (arg7 + arg5 - 1 < var34) {
                            var36 = var34 + 1 - arg5 - arg7;
                        }
                        int var37 = 0;
                        if (var35 < arg11) {
                            var37 = arg11 - var35;
                        } else if (var35 > arg11 + arg12 - 1) {
                            var37 = var35 + 1 - arg11 - arg12;
                        }
                        int var38 = var36 * var36 + (var37 * var37);
                        if (var38 < var32 || var32 == var38 && var31 > class324.field5523[var34][var35]) {
                            var31 = class324.field5523[var34][var35];
                            var17 = var34;
                            var16 = var35;
                            var32 = var38;
                        }
                    }
                }
            }
            if (var32 == 1000) {
                return false;
            }
            if (arg2 == var17 && arg1 == var16) {
                return false;
            }
            class84.field1328 = 1;
        }
        byte var39 = 0;
        class5.field66[var39] = var17;
        int var43 = var39 + 1;
        class26.field405[var39] = var16;
        int var40;
        int var41 = var40 = class83.field1280[var17][var16];
        while (arg2 != var17 || arg1 != var16) {
            if (var40 != var41) {
                class5.field66[var43] = var17;
                class26.field405[var43++] = var16;
                var40 = var41;
            }
            if ((var41 & 0x2) != 0) {
                var17++;
            } else if ((var41 & 0x8) != 0) {
                var17--;
            }
            if ((var41 & 0x1) != 0) {
                var16++;
            } else if ((var41 & 0x4) != 0) {
                var16--;
            }
            var41 = class83.field1280[var17][var16];
        }
        if (var43 > 0) {
            class255.method1798(var43, (byte) 124, arg0);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILik;IB)[Lse;", line = 716)
    public static final class12[] method496(int arg0, class262 arg1, int arg2, byte arg3) {
        if (arg3 != 9) {
            field1159 = (class108) null;
        }
        field1156++;
        return class167.method1166(arg1, arg2, (byte) -88, arg0) ? class293.method2094(true) : null;
    }
}
