import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class72 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    private int field1190;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    private int field1185;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[[I")
    public int[][] field1175;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Lwa;")
    public static class219 field1179 = new class219(32);

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field1193 = 0;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "[Z")
    public static boolean[] field1196 = new boolean[100];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Ljava/awt/Frame;")
    public static Frame field1195;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "[I")
    public static int[] field1191;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBI)V")
    public static final void method497(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class192.field3354 = -1;
        class211.field3612 = class140.field2488 * arg2 / arg4;
        field1169++;
        class211.field3613 = class148.field2743 * arg0 / arg1;
        class70.field1121 = -1;
        if (arg3 != -31) {
            method506(69, (byte) -67);
        }
        class225.method1553(112);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIIIZI)V")
    public final void method498(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 != 73) {
            return;
        }
        field1168++;
        int var7 = arg3 - this.field1184;
        int var8 = arg1 - this.field1185;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method503(128, true, var8, var7);
                this.method503(8, true, var8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method503(2, true, var8, var7);
                this.method503(32, true, var8 + 1, var7);
            }
            if (arg5 == 2) {
                this.method503(8, true, var8, var7);
                this.method503(128, true, var8, var7 + 1);
            }
            if (arg5 == 3) {
                this.method503(32, true, var8, var7);
                this.method503(2, true, var8 - 1, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method503(1, true, var8, var7);
                this.method503(16, true, var8 + 1, var7 + -1);
            }
            if (arg5 == 1) {
                this.method503(4, true, var8, var7);
                this.method503(64, true, var8 + 1, var7 + 1);
            }
            if (arg5 == 2) {
                this.method503(16, true, var8, var7);
                this.method503(1, true, var8 - 1, var7 + 1);
            }
            if (arg5 == 3) {
                this.method503(64, true, var8, var7);
                this.method503(4, true, var8 - 1, var7 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method503(130, true, var8, var7);
                this.method503(8, true, var8, var7 - 1);
                this.method503(32, true, var8 + 1, var7);
            }
            if (arg5 == 1) {
                this.method503(10, true, var8, var7);
                this.method503(32, true, var8 + 1, var7);
                this.method503(128, true, var8, var7 + 1);
            }
            if (arg5 == 2) {
                this.method503(40, true, var8, var7);
                this.method503(128, true, var8, var7 + 1);
                this.method503(2, true, var8 - 1, var7);
            }
            if (arg5 == 3) {
                this.method503(160, true, var8, var7);
                this.method503(2, true, var8 - 1, var7);
                this.method503(8, true, var8, var7 - 1);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method503(65536, true, var8, var7);
                this.method503(4096, true, var8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method503(1024, true, var8, var7);
                this.method503(16384, true, var8 + 1, var7);
            }
            if (arg5 == 2) {
                this.method503(4096, true, var8, var7);
                this.method503(65536, true, var8, var7 + 1);
            }
            if (arg5 == 3) {
                this.method503(16384, true, var8, var7);
                this.method503(1024, true, var8 - 1, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method503(512, true, var8, var7);
                this.method503(8192, true, var8 + 1, var7 + -1);
            }
            if (arg5 == 1) {
                this.method503(2048, true, var8, var7);
                this.method503(32768, true, var8 + 1, var7 - -1);
            }
            if (arg5 == 2) {
                this.method503(8192, true, var8, var7);
                this.method503(512, true, var8 - 1, var7 + 1);
            }
            if (arg5 == 3) {
                this.method503(32768, true, var8, var7);
                this.method503(2048, true, var8 - 1, var7 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method503(66560, true, var8, var7);
            this.method503(4096, true, var8, var7 - 1);
            this.method503(16384, true, var8 + 1, var7);
        }
        if (arg5 == 1) {
            this.method503(5120, true, var8, var7);
            this.method503(16384, true, var8 + 1, var7);
            this.method503(65536, true, var8, var7 + 1);
        }
        if (arg5 == 2) {
            this.method503(20480, true, var8, var7);
            this.method503(65536, true, var8, var7 + 1);
            this.method503(1024, true, var8 - 1, var7);
        }
        if (arg5 == 3) {
            this.method503(81920, true, var8, var7);
            this.method503(1024, true, var8 - 1, var7);
            this.method503(4096, true, var8, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZII)V")
    public final void method499(boolean arg0, int arg1, int arg2) {
        field1178++;
        if (arg0) {
            int var4 = arg2 - this.field1185;
            int var5 = arg1 - this.field1184;
            this.field1175[var5][var4] = class67.method471(this.field1175[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1186++;
        if (arg5 > 1) {
            return this.method509(arg0, arg8, arg1, arg2, -110, arg7, arg5, arg3, arg5) ? true : this.method505(arg8, arg4 - 5, arg2, arg7, arg0, arg5, arg3, arg5, arg6, arg1);
        }
        if (arg4 != 8) {
            this.field1167 = 11;
        }
        int var10 = arg0 + arg8 - 1;
        int var11 = arg2 + arg3 - 1;
        if (arg3 <= arg1 && arg1 <= var11 && arg7 >= arg0 && arg7 <= var10) {
            return true;
        } else if (arg3 - 1 == arg1 && arg0 <= arg7 && arg7 <= var10 && (this.field1175[arg1 - this.field1184][arg7 - this.field1185] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if ((var11 + 1) == arg1 && arg7 >= arg0 && var10 >= arg7 && (this.field1175[arg1 - this.field1184][arg7 - this.field1185] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if ((arg0 - 1) == arg7 && arg3 <= arg1 && arg1 <= var11 && (this.field1175[arg1 - this.field1184][arg7 - this.field1185] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg1 >= arg3 && arg1 <= var11 && (this.field1175[arg1 - this.field1184][arg7 - this.field1185] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lsb;IZ)V")
    public static final void method501(class98 arg0, int arg1, boolean arg2) {
        if (arg2) {
            try {
                class245.field4263.getAppletContext().showDocument(arg0.method722(true, class245.field4263.getCodeBase()), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class245.field4263.getAppletContext().showDocument(arg0.method722(true, class245.field4263.getCodeBase()), "_top");
            } catch (Exception var3) {
            }
        }
        if (arg1 == 1) {
            field1182++;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIB)V")
    public final void method502(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field1185;
        int var5 = arg1 - this.field1184;
        this.field1175[var5][var4] = class67.method471(this.field1175[var5][var4], 262144);
        if (arg2 > -72) {
            this.field1167 = 115;
        }
        field1164++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZII)V")
    private final void method503(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field1192++;
            this.field1175[arg3][arg2] = class67.method471(this.field1175[arg3][arg2], arg0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZZII)V")
    public final void method504(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        field1174++;
        int var7 = arg4 - this.field1184;
        int var8 = arg1 - this.field1185;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method507(var8, var7, 128, -6507);
                this.method507(var8, var7 - 1, 8, -6507);
            }
            if (arg5 == 1) {
                this.method507(var8, var7, 2, -6507);
                this.method507(var8 + 1, var7, 32, -6507);
            }
            if (arg5 == 2) {
                this.method507(var8, var7, 8, -6507);
                this.method507(var8, var7 + 1, 128, -6507);
            }
            if (arg5 == 3) {
                this.method507(var8, var7, 32, -6507);
                this.method507(var8 - 1, var7, 2, -6507);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method507(var8, var7, 1, -6507);
                this.method507(var8 + 1, var7 + -1, 16, -6507);
            }
            if (arg5 == 1) {
                this.method507(var8, var7, 4, -6507);
                this.method507(var8 + 1, var7 + 1, 64, -6507);
            }
            if (arg5 == 2) {
                this.method507(var8, var7, 16, -6507);
                this.method507(var8 - 1, var7 + 1, 1, -6507);
            }
            if (arg5 == 3) {
                this.method507(var8, var7, 64, -6507);
                this.method507(var8 - 1, var7 + -1, 4, -6507);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method507(var8, var7, 130, -6507);
                this.method507(var8, var7 - 1, 8, -6507);
                this.method507(var8 + 1, var7, 32, -6507);
            }
            if (arg5 == 1) {
                this.method507(var8, var7, 10, -6507);
                this.method507(var8 + 1, var7, 32, -6507);
                this.method507(var8, var7 + 1, 128, -6507);
            }
            if (arg5 == 2) {
                this.method507(var8, var7, 40, -6507);
                this.method507(var8, var7 + 1, 128, -6507);
                this.method507(var8 - 1, var7, 2, -6507);
            }
            if (arg5 == 3) {
                this.method507(var8, var7, 160, -6507);
                this.method507(var8 - 1, var7, 2, -6507);
                this.method507(var8, var7 - 1, 8, -6507);
            }
        }
        if (!arg3 || !arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method507(var8, var7, 65536, -6507);
                this.method507(var8, var7 - 1, 4096, -6507);
            }
            if (arg5 == 1) {
                this.method507(var8, var7, 1024, -6507);
                this.method507(var8 + 1, var7, 16384, -6507);
            }
            if (arg5 == 2) {
                this.method507(var8, var7, 4096, -6507);
                this.method507(var8, var7 + 1, 65536, -6507);
            }
            if (arg5 == 3) {
                this.method507(var8, var7, 16384, -6507);
                this.method507(var8 - 1, var7, 1024, -6507);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method507(var8, var7, 512, -6507);
                this.method507(var8 + 1, var7 - 1, 8192, -6507);
            }
            if (arg5 == 1) {
                this.method507(var8, var7, 2048, -6507);
                this.method507(var8 + 1, var7 + 1, 32768, -6507);
            }
            if (arg5 == 2) {
                this.method507(var8, var7, 8192, -6507);
                this.method507(var8 - 1, var7 + 1, 512, -6507);
            }
            if (arg5 == 3) {
                this.method507(var8, var7, 32768, -6507);
                this.method507(var8 - 1, var7 + -1, 2048, -6507);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method507(var8, var7, 66560, -6507);
            this.method507(var8, var7 - 1, 4096, -6507);
            this.method507(var8 + 1, var7, 16384, -6507);
        }
        if (arg5 == 1) {
            this.method507(var8, var7, 5120, -6507);
            this.method507(var8 + 1, var7, 16384, -6507);
            this.method507(var8, var7 + 1, 65536, -6507);
        }
        if (arg5 == 2) {
            this.method507(var8, var7, 20480, -6507);
            this.method507(var8, var7 + 1, 65536, -6507);
            this.method507(var8 - 1, var7, 1024, -6507);
        }
        if (arg5 == 3) {
            this.method507(var8, var7, 81920, -6507);
            this.method507(var8 - 1, var7, 1024, -6507);
            this.method507(var8, var7 - 1, 4096, -6507);
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != 3) {
            return true;
        }
        int var11 = arg3 + arg7;
        field1166++;
        int var12 = arg5 + arg9;
        int var13 = arg6 + arg2;
        int var14 = arg4 + arg0;
        if (arg9 >= arg6 && var13 > arg9) {
            if (arg4 == var11 && (arg8 & 0x4) == 0) {
                int var15 = arg9;
                int var16 = var12 <= var13 ? var12 : var13;
                while (var15 < var16) {
                    if ((this.field1175[var15 - this.field1184][var11 - this.field1185 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg3 == var14 && (arg8 & 0x1) == 0) {
                int var17 = var12 <= var13 ? var12 : var13;
                for (int var18 = arg9; var18 < var17; var18++) {
                    if ((this.field1175[var18 - this.field1184][arg3 - this.field1185] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (var12 > arg6 && var13 >= var12) {
            if (arg4 == var11 && (arg8 & 0x4) == 0) {
                for (int var19 = arg6; var19 < var12; var19++) {
                    if ((this.field1175[var19 - this.field1184][var11 - this.field1185 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg3 == var14 && (arg8 & 0x1) == 0) {
                for (int var20 = arg6; var20 < var12; var20++) {
                    if ((this.field1175[var20 - this.field1184][arg3 - this.field1185] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg3 >= arg4 && var14 > arg3) {
            if (arg6 == var12 && (arg8 & 0x8) == 0) {
                int var21 = arg3;
                int var22 = var14 < var11 ? var14 : var11;
                while (var21 < var22) {
                    if ((this.field1175[var12 - this.field1184 - 1][var21 - this.field1185] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg9 == var13 && (arg8 & 0x2) == 0) {
                int var23 = arg3;
                int var24 = var14 >= var11 ? var11 : var14;
                while (var23 < var24) {
                    if ((this.field1175[arg9 - this.field1184][var23 - this.field1185] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var11 > arg4 && var14 >= var11) {
            if (arg6 == var12 && (arg8 & 0x8) == 0) {
                for (int var25 = arg4; var25 < var11; var25++) {
                    if ((this.field1175[var12 - this.field1184 - 1][var25 - this.field1185] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var13 && (arg8 & 0x2) == 0) {
                for (int var26 = arg4; var26 < var11; var26++) {
                    if ((this.field1175[arg9 - this.field1184][var26 - this.field1185] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V")
    public static final void method506(int arg0, byte arg1) {
        field1181++;
        if (arg1 != -51) {
            return;
        }
        if (class216.field3685 == 0) {
            class131.field2330.method68(0, arg0);
        } else {
            class242.field4189 = arg0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
    private final void method507(int arg0, int arg1, int arg2, int arg3) {
        field1165++;
        this.field1175[arg1][arg0] = class214.method1427(this.field1175[arg1][arg0], ~arg2);
        if (arg3 != -6507) {
            this.field1185 = 40;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static final void method508(byte arg0) {
        class91.field1606.method1565(-1);
        class16.field315.method1565(-1);
        int var1 = 112 % ((51 - arg0) / 57);
        field1180++;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIIIIIIII)Z")
    private final boolean method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1171++;
        if (arg2 >= (arg3 + arg7) || arg2 + arg6 <= arg7) {
            return false;
        } else if (arg5 < arg0 + arg1 && arg5 + arg8 > arg0) {
            int var10 = -27 / ((arg4 + 8) / 39);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIIIIIII)Z")
    public final boolean method510(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1170++;
        if (arg6 == 1) {
            if (arg1 == arg4 && arg2 == arg5) {
                return true;
            }
        } else if (arg4 >= arg1 && arg4 <= (arg6 + arg1 - 1) && arg2 >= arg2 && arg2 + arg6 - 1 >= arg2) {
            return true;
        }
        int var9 = arg4 - this.field1184;
        int var10 = arg2 - this.field1185;
        int var11 = arg5 - this.field1185;
        int var12 = arg1 - this.field1184;
        int var13 = 88 / ((34 - arg0) / 56);
        if (arg6 == 1) {
            if (arg7 == 0) {
                if (arg3 == 0) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field1175[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field1175[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var9 - 1 == var12 && var10 == var11 && (this.field1175[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field1175[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field1175[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field1175[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                    if (var9 - 1 == var12 && var10 == var11 && (this.field1175[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field1175[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg3 == 0) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field1175[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field1175[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field1175[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field1175[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field1175[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field1175[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field1175[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field1175[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 == var12 && (var10 + 1) == var11 && (this.field1175[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field1175[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var12 && var10 == var11 && (this.field1175[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field1175[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg6 + var11 - 1;
            int var15 = arg6 + var12 - 1;
            if (arg7 == 0) {
                if (arg3 == 0) {
                    if ((var9 - arg6) == var12 && var10 >= var11 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var15 && (var10 + 1) == var11 && (this.field1175[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var15 && (var10 - arg6) == var11 && (this.field1175[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 >= var12 && var9 <= var15 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var9 - arg6 == var12 && var11 <= var10 && var10 <= var14 && (this.field1175[var15][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 <= var10 && var14 >= var10 && (this.field1175[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 + 1 == var12 && var10 >= var11 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var15 >= var9 && var10 + 1 == var11 && (this.field1175[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var15 && (var10 - arg6) == var11 && (this.field1175[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var12 <= var9 && var15 >= var9 && (var10 - arg6) == var11) {
                        return true;
                    }
                    if (var9 - arg6 == var12 && var11 <= var10 && var10 <= var14 && (this.field1175[var15][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 >= var11 && var14 >= var10 && (this.field1175[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg3 == 0) {
                    if ((var9 - arg6) == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var15 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 <= var10 && var10 <= var14 && (this.field1175[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var15 && (var10 - arg6) == var11 && (this.field1175[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - arg6 == var12 && var10 >= var11 && var14 >= var10 && (this.field1175[var15][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var15 >= var9 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var15 >= var9 && (var10 - arg6) == var11 && (this.field1175[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - arg6 == var12 && var11 <= var10 && var14 >= var10 && (this.field1175[var15][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var15 >= var9 && (var10 + 1) == var11 && (this.field1175[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var15 >= var9 && (var10 - arg6) == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 - arg6 == var12 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var15 && (var10 + 1) == var11 && (this.field1175[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 >= var11 && var14 >= var10 && (this.field1175[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var15 && (var10 - arg6) == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 >= var12 && var9 <= var15 && var10 + 1 == var11 && (this.field1175[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 <= var9 && var9 <= var15 && (var10 - arg6) == var11 && (this.field1175[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var9 - arg6) == var12 && var10 >= var11 && var10 <= var14 && (this.field1175[var15][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var11 <= var10 && var10 <= var14 && (this.field1175[var12][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method511(int arg0) {
        field1196 = null;
        field1179 = null;
        if (arg0 != 65536) {
            field1195 = null;
        }
        field1195 = null;
        field1191 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lq;I)V")
    public static final void method512(class148 arg0, int arg1) {
        field1187++;
        if (arg1 != 2) {
            field1196 = null;
        }
        if (class139.field2467 == arg0.field2621) {
            class208.field3563[arg0.field2683] = true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)V")
    public final void method513(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1184;
        int var5 = arg2 - this.field1185;
        if (arg0 == -72) {
            field1173++;
            this.field1175[var4][var5] = class214.method1427(this.field1175[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIIII)V")
    public final void method514(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1188++;
        int var7 = arg3 - this.field1184;
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field1185;
        if (arg1 != 16924672) {
            this.field1167 = -48;
        }
        for (int var10 = var7; var10 < (arg5 + var7); var10++) {
            if (var10 >= 0 && this.field1190 > var10) {
                for (int var11 = var9; var11 < var9 + arg4; var11++) {
                    if (var11 >= 0 && var11 < this.field1167) {
                        this.method503(var8, true, var11, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIZIII)V")
    public final void method515(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -1) {
            method501((class98) null, -57, true);
        }
        int var8 = arg4 - this.field1184;
        field1176++;
        int var9 = arg1 - this.field1185;
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg2;
            arg2 = arg6;
            arg6 = var10;
        }
        int var11 = 256;
        if (arg3) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < (arg2 + var8); var12++) {
            if (var12 >= 0 && this.field1190 > var12) {
                for (int var13 = var9; var13 < arg6 + var9; var13++) {
                    if (var13 >= 0 && this.field1167 > var13) {
                        this.method507(var13, var12, var11, -6507);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIZIII)Z")
    public final boolean method516(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1189++;
        if (arg4) {
            this.method513((byte) 94, -110, 4);
        }
        if (arg7 == 1) {
            if (arg1 == arg5 && arg2 == arg6) {
                return true;
            }
        } else if (arg1 <= arg5 && arg1 + arg7 - 1 >= arg5 && arg6 >= arg6 && arg6 <= (arg6 - (1 - arg7))) {
            return true;
        }
        int var9 = arg6 - this.field1185;
        int var10 = arg2 - this.field1185;
        int var11 = arg1 - this.field1184;
        int var12 = arg5 - this.field1184;
        if (arg7 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field1175[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field1175[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field1175[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field1175[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field1175[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field1175[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field1175[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field1175[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 == var12 && (var9 + 1) == var10 && (this.field1175[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field1175[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field1175[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field1175[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var11 - 1;
            int var14 = var10 + arg7 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var12 + 1) == var11 && var9 >= var10 && var14 >= var9 && (this.field1175[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var9 - arg7) == var10 && (this.field1175[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - arg7) == var11 && var9 >= var10 && var9 <= var14 && (this.field1175[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 - arg7 == var10 && (this.field1175[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var12 - arg7) == var11 && var10 <= var9 && var14 >= var9 && (this.field1175[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 + 1 == var10 && (this.field1175[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var12 + 1 == var11 && var9 >= var10 && var14 >= var9 && (this.field1175[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var9 + 1) == var10 && (this.field1175[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 <= var12 && var13 >= var12 && (var9 + 1) == var10 && (this.field1175[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var12 && var13 >= var12 && var9 - arg7 == var10 && (this.field1175[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg7) == var11 && var10 <= var9 && var14 >= var9 && (this.field1175[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var10 <= var9 && var14 >= var9 && (this.field1175[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIII)Ljj;")
    public static final class34 method517(int arg0, int arg1, int arg2, int arg3) {
        field1177++;
        class34 var4 = new class34();
        int var5 = 67 % ((arg3 - 21) / 56);
        var4.field590 = arg1;
        var4.field596 = arg0;
        class243.field4209.method1513((long) arg2, var4, -1);
        class36.method300((byte) -42, arg0);
        class148 var6 = class62.method455(-854073200, arg2);
        if (var6 != null) {
            method512(var6, 2);
        }
        if (class188.field3244 != null) {
            method512(class188.field3244, 2);
            class188.field3244 = null;
        }
        class226.field3894 = 0;
        class97.field1672 = false;
        class92.method681(-115, class88.field1553, class81.field1434, class41.field670, class14.field258);
        if (var6 != null) {
            class120.method902(var6, false, (byte) 59);
        }
        class60.method437(arg0, (byte) 127);
        if (class232.field3992 != -1) {
            class235.method1610(class232.field3992, 24148, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public final void method518(byte arg0) {
        field1183++;
        for (int var2 = 0; var2 < this.field1190; var2++) {
            for (int var3 = 0; var3 < this.field1167; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1190 - 5 || this.field1167 - 5 <= var3) {
                    this.field1175[var2][var3] = 16777215;
                } else {
                    this.field1175[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 < 52) {
            field1191 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V")
    public class72(int arg0, int arg1) {
        this.field1167 = arg1;
        this.field1184 = 0;
        this.field1190 = arg0;
        this.field1185 = 0;
        this.field1175 = new int[this.field1190][this.field1167];
        this.method518((byte) 72);
    }
}
