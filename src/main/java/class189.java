import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class189 {

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    private int field3164;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    private int field3161;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    private int field3169;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[[I")
    public int[][] field3159;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    private int field3171;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Lhi;")
    public static class82 field3165 = class95.method664((byte) -102, "niveau ");

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lhi;")
    public static class82 field3160 = class95.method664((byte) -55, "Hidden)2");

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lhn;")
    public static class317 field3166 = new class317(100);

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "[Luh;")
    public static class67[] field3187 = new class67[0];

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIIII)Z", line = 4)
    private final boolean method1298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3185++;
        if (arg5 >= (arg1 + arg7) || (arg4 + arg5) <= arg1) {
            return false;
        } else if (arg0 + arg2 > arg8 && arg3 + arg8 > arg2) {
            if (arg6 != -1) {
                this.method1305(-17);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1299(int arg0) {
        field3182++;
        class68.field1056.method2168(0);
        class232.field3993.method2168(arg0 + 1);
        if (arg0 != -1) {
            method1307(111);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIB)V", line = 35)
    public final void method1300(int arg0, int arg1, byte arg2) {
        field3177++;
        int var4 = arg0 - this.field3171;
        int var5 = arg1 - this.field3161;
        this.field3159[var4][var5] = class98.method674(this.field3159[var4][var5], 262144);
        if (arg2 != -81) {
            this.field3159 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BIIZII)V", line = 50)
    public final void method1301(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field3171;
        int var8 = arg2 - this.field3161;
        field3173++;
        int var9 = 256;
        if (arg3) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < arg4 + var7; var10++) {
            if (var10 >= 0 && this.field3169 > var10) {
                for (int var11 = var8; var11 < (arg5 + var8); var11++) {
                    if (var11 >= 0 && var11 < this.field3164) {
                        this.method1314(var11, 0, var10, var9);
                    }
                }
            }
        }
        if (arg0 != 98) {
            this.field3164 = 33;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIIIIIIII)Z", line = 94)
    public final boolean method1302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3162++;
        if (arg7 <= 1) {
            if (arg1 != 0) {
                this.method1317(-13, -45, -124, -101, (byte) -20);
            }
            int var10 = arg2 + arg5 - 1;
            int var11 = arg0 + arg6 - 1;
            if (arg3 >= arg2 && var10 >= arg3 && arg4 >= arg6 && arg4 <= var11) {
                return true;
            } else if ((arg2 - 1) == arg3 && arg6 <= arg4 && arg4 <= var11 && (this.field3159[arg3 - this.field3171][arg4 - this.field3161] & 0x8) == 0 && (arg8 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg3 && arg4 >= arg6 && var11 >= arg4 && (this.field3159[arg3 - this.field3171][arg4 - this.field3161] & 0x80) == 0 && (arg8 & 0x2) == 0) {
                return true;
            } else if (arg6 - 1 == arg4 && arg3 >= arg2 && var10 >= arg3 && (this.field3159[arg3 - this.field3171][arg4 - this.field3161] & 0x2) == 0 && (arg8 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg4 && arg2 <= arg3 && var10 >= arg3 && (this.field3159[arg3 - this.field3171][arg4 - this.field3161] & 0x20) == 0 && (arg8 & 0x1) == 0;
            }
        } else if (this.method1298(arg0, arg2, arg6, arg7, arg7, arg3, -1, arg5, arg4)) {
            return true;
        } else {
            return this.method1303(arg3, arg4, arg7, arg0, arg2, arg5, arg7, (byte) 4, arg6, arg8);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIIBII)Z", line = 139)
    private final boolean method1303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field3175++;
        int var11 = arg0 + arg2;
        int var12 = arg1 + arg6;
        int var13 = -98 / ((arg7 - 69) / 41);
        int var14 = arg4 + arg5;
        int var15 = arg3 + arg8;
        if (arg0 >= arg4 && arg0 < var14) {
            if (arg8 == var12 && (arg9 & 0x4) == 0) {
                int var16 = arg0;
                int var17 = var11 <= var14 ? var11 : var14;
                while (var17 > var16) {
                    if ((this.field3159[var16 - this.field3171][var12 - this.field3161 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var16++;
                }
            } else if (arg1 == var15 && (arg9 & 0x1) == 0) {
                int var18 = var11 <= var14 ? var11 : var14;
                for (int var19 = arg0; var19 < var18; var19++) {
                    if ((this.field3159[var19 - this.field3171][arg1 - this.field3161] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg4 < var11 && var11 <= var14) {
            if (arg8 == var12 && (arg9 & 0x4) == 0) {
                for (int var20 = arg4; var20 < var11; var20++) {
                    if ((this.field3159[var20 - this.field3171][var12 - this.field3161 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var15 && (arg9 & 0x1) == 0) {
                for (int var21 = arg4; var21 < var11; var21++) {
                    if ((this.field3159[var21 - this.field3171][arg1 - this.field3161] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg8 <= arg1 && var15 > arg1) {
            if (arg4 == var11 && (arg9 & 0x8) == 0) {
                int var22 = arg1;
                int var23 = var15 < var12 ? var15 : var12;
                while (var23 > var22) {
                    if ((this.field3159[var11 - this.field3171 - 1][var22 - this.field3161] & 0x8) == 0) {
                        return true;
                    }
                    var22++;
                }
            } else if (arg0 == var14 && (arg9 & 0x2) == 0) {
                int var24 = arg1;
                int var25 = var15 < var12 ? var15 : var12;
                while (var25 > var24) {
                    if ((this.field3159[arg0 - this.field3171][var24 - this.field3161] & 0x80) == 0) {
                        return true;
                    }
                    var24++;
                }
            }
        } else if (var12 > arg8 && var15 >= var12) {
            if (arg4 == var11 && (arg9 & 0x8) == 0) {
                for (int var26 = arg8; var26 < var12; var26++) {
                    if ((this.field3159[var11 - this.field3171 - 1][var26 - this.field3161] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var14 && (arg9 & 0x2) == 0) {
                for (int var27 = arg8; var27 < var12; var27++) {
                    if ((this.field3159[arg0 - this.field3171][var27 - this.field3161] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Z", line = 304)
    public static final boolean method1304(byte arg0, int arg1) {
        if (arg0 != -24) {
            field3187 = (class67[]) null;
        }
        field3186++;
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 315)
    public final void method1305(int arg0) {
        field3183++;
        if (arg0 != -1) {
            return;
        }
        for (int var2 = 0; var2 < this.field3169; var2++) {
            for (int var3 = 0; var3 < this.field3164; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field3169 - 5) <= var2 || (this.field3164 - 5) <= var3) {
                    this.field3159[var2][var3] = 16777215;
                } else {
                    this.field3159[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIIIII)V", line = 356)
    public final void method1306(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3157++;
        int var7 = arg1 - this.field3161;
        int var8 = arg3 - this.field3171;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method1314(var7, 0, var8, 128);
                this.method1314(var7, arg2 - 1, var8 + -1, 8);
            }
            if (arg5 == 1) {
                this.method1314(var7, 0, var8, 2);
                this.method1314(var7 + 1, 0, var8, 32);
            }
            if (arg5 == 2) {
                this.method1314(var7, 0, var8, 8);
                this.method1314(var7, 0, var8 + 1, 128);
            }
            if (arg5 == 3) {
                this.method1314(var7, 0, var8, 32);
                this.method1314(var7 - 1, 0, var8, 2);
            }
        }
        if (arg2 == arg4 || arg4 == 3) {
            if (arg5 == 0) {
                this.method1314(var7, 0, var8, 1);
                this.method1314(var7 + 1, 0, var8 - 1, 16);
            }
            if (arg5 == 1) {
                this.method1314(var7, 0, var8, 4);
                this.method1314(var7 + 1, 0, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method1314(var7, 0, var8, 16);
                this.method1314(var7 - 1, 0, var8 + 1, 1);
            }
            if (arg5 == 3) {
                this.method1314(var7, arg2 - 1, var8, 64);
                this.method1314(var7 - 1, 0, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method1314(var7, 0, var8, 130);
                this.method1314(var7, arg2 - 1, var8 + -1, 8);
                this.method1314(var7 + 1, 0, var8, 32);
            }
            if (arg5 == 1) {
                this.method1314(var7, 0, var8, 10);
                this.method1314(var7 + 1, 0, var8, 32);
                this.method1314(var7, 0, var8 + 1, 128);
            }
            if (arg5 == 2) {
                this.method1314(var7, 0, var8, 40);
                this.method1314(var7, 0, var8 + 1, 128);
                this.method1314(var7 - 1, 0, var8, 2);
            }
            if (arg5 == 3) {
                this.method1314(var7, 0, var8, 160);
                this.method1314(var7 - 1, 0, var8, 2);
                this.method1314(var7, 0, var8 - 1, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method1314(var7, arg2 ^ 0x1, var8, 65536);
                this.method1314(var7, 0, var8 - 1, 4096);
            }
            if (arg5 == 1) {
                this.method1314(var7, arg2 - 1, var8, 1024);
                this.method1314(var7 + 1, 0, var8, 16384);
            }
            if (arg5 == 2) {
                this.method1314(var7, 0, var8, 4096);
                this.method1314(var7, 0, var8 + 1, 65536);
            }
            if (arg5 == 3) {
                this.method1314(var7, 0, var8, 16384);
                this.method1314(var7 - 1, arg2 ^ 0x1, var8, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method1314(var7, 0, var8, 512);
                this.method1314(var7 + 1, arg2 ^ 0x1, var8 - 1, 8192);
            }
            if (arg5 == 1) {
                this.method1314(var7, 0, var8, 2048);
                this.method1314(var7 + 1, 0, var8 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method1314(var7, 0, var8, 8192);
                this.method1314(var7 - 1, arg2 ^ 0x1, var8 + 1, 512);
            }
            if (arg5 == 3) {
                this.method1314(var7, 0, var8, 32768);
                this.method1314(var7 - 1, arg2 ^ 0x1, var8 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1314(var7, 0, var8, 66560);
            this.method1314(var7, 0, var8 - 1, 4096);
            this.method1314(var7 + 1, 0, var8, 16384);
        }
        if (arg5 == 1) {
            this.method1314(var7, 0, var8, 5120);
            this.method1314(var7 + 1, 0, var8, 16384);
            this.method1314(var7, arg2 ^ 0x1, var8 + 1, 65536);
        }
        if (arg5 == 2) {
            this.method1314(var7, 0, var8, 20480);
            this.method1314(var7, arg2 ^ 0x1, var8 + 1, 65536);
            this.method1314(var7 - 1, 0, var8, 1024);
        }
        if (arg5 == 3) {
            this.method1314(var7, 0, var8, 81920);
            this.method1314(var7 - 1, 0, var8, 1024);
            this.method1314(var7, 0, var8 - 1, 4096);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V", line = 566)
    public static void method1307(int arg0) {
        if (arg0 <= 38) {
            method1299(22);
        }
        field3187 = null;
        field3166 = null;
        field3160 = null;
        field3165 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZIIIB)V", line = 579)
    public final void method1308(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var8 = arg1 - this.field3171;
        int var9 = 256;
        int var10 = arg4 - this.field3161;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg0;
            arg0 = arg3;
            arg3 = var11;
        }
        field3174++;
        if (arg2) {
            var9 += 131072;
        }
        for (int var12 = var8; var12 < (arg0 + var8); var12++) {
            if (var12 >= 0 && this.field3169 > var12) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && this.field3164 > var13) {
                        this.method1318(var9, var12, -262145, var13);
                    }
                }
            }
        }
        if (arg6 != -64) {
            field3187 = (class67[]) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lkc;ILkc;)V", line = 634)
    public static final void method1309(class51 arg0, int arg1, class51 arg2) {
        if (arg2.field831 != null) {
            arg2.method358((byte) 52);
        }
        arg2.field831 = arg0;
        if (arg1 == 14437) {
            field3180++;
            arg2.field836 = arg0.field836;
            arg2.field831.field836 = arg2;
            arg2.field836.field831 = arg2;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lum;I)V", line = 652)
    public static final void method1310(class222 arg0, int arg1) {
        if (arg1 > -118) {
            field3160 = (class82) null;
        }
        class312.field5365 = arg0;
        field3168++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIBI)Z", line = 664)
    public final boolean method1311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3167++;
        if (arg4 == 1) {
            if (arg2 == arg5 && arg1 == arg7) {
                return true;
            }
        } else if (arg2 >= arg5 && arg2 <= arg4 + arg5 - 1 && arg7 >= arg7 && arg7 <= (arg7 + arg4 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field3161;
        if (arg6 != 28) {
            field3166 = (class317) null;
        }
        int var10 = arg5 - this.field3171;
        int var11 = arg7 - this.field3161;
        int var12 = arg2 - this.field3171;
        if (arg4 == 1) {
            if (arg0 == 0) {
                if (arg3 == 0) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field3159[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field3159[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field3159[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field3159[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field3159[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field3159[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field3159[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field3159[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field3159[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field3159[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field3159[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field3159[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field3159[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field3159[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field3159[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field3159[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 == var12 && (var11 + 1) == var9 && (this.field3159[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 - 1 == var9 && (this.field3159[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field3159[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field3159[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var10 - 1;
            int var14 = arg4 + var9 - 1;
            if (arg0 == 0) {
                if (arg3 == 0) {
                    if (var12 - arg4 == var10 && var11 >= var9 && var14 >= var11) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var11 + 1 == var9 && (this.field3159[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && (var11 - arg4) == var9 && (this.field3159[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 <= var12 && var13 >= var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if ((var12 - arg4) == var10 && var11 >= var9 && var11 <= var14 && (this.field3159[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 >= var9 && var14 >= var11 && (this.field3159[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 + 1 == var10 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && (var11 + 1) == var9 && (this.field3159[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && (var11 - arg4) == var9 && (this.field3159[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 <= var12 && var12 <= var13 && var11 - arg4 == var9) {
                        return true;
                    }
                    if ((var12 - arg4) == var10 && var9 <= var11 && var14 >= var11 && (this.field3159[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 >= var9 && var11 <= var14 && (this.field3159[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    if ((var12 - arg4) == var10 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 >= var9 && var11 <= var14 && (this.field3159[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var11 - arg4 == var9 && (this.field3159[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - arg4) == var10 && var9 <= var11 && var14 >= var11 && (this.field3159[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var11 - arg4 == var9 && (this.field3159[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 - arg4 == var10 && var11 >= var9 && var14 >= var11 && (this.field3159[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var11 + 1) == var9 && (this.field3159[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var11 - arg4 == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var12 - arg4) == var10 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var11 + 1 == var9 && (this.field3159[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 <= var11 && var14 >= var11 && (this.field3159[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var11 - arg4) == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 <= var12 && var12 <= var13 && (var11 + 1) == var9 && (this.field3159[var12][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 >= var10 && var13 >= var12 && var11 - arg4 == var9 && (this.field3159[var12][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var12 - arg4) == var10 && var11 >= var9 && var11 <= var14 && (this.field3159[var13][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 <= var11 && var14 >= var11 && (this.field3159[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIZ)V", line = 1039)
    public final void method1312(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg3 - this.field3161;
        int var8 = arg2 - this.field3171;
        if (arg4 != -1) {
            field3187 = (class67[]) null;
        }
        field3170++;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method1318(128, var8, -262145, var7);
                this.method1318(8, var8 - 1, -262145, var7);
            }
            if (arg1 == 1) {
                this.method1318(2, var8, -262145, var7);
                this.method1318(32, var8, arg4 - 262144, var7 - -1);
            }
            if (arg1 == 2) {
                this.method1318(8, var8, -262145, var7);
                this.method1318(128, var8 + 1, -262145, var7);
            }
            if (arg1 == 3) {
                this.method1318(32, var8, -262145, var7);
                this.method1318(2, var8, -262145, var7 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method1318(1, var8, arg4 ^ 0x40000, var7);
                this.method1318(16, var8 - 1, -262145, var7 - -1);
            }
            if (arg1 == 1) {
                this.method1318(4, var8, arg4 - 262144, var7);
                this.method1318(64, var8 + 1, -262145, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1318(16, var8, arg4 - 262144, var7);
                this.method1318(1, var8 + 1, -262145, var7 + -1);
            }
            if (arg1 == 3) {
                this.method1318(64, var8, -262145, var7);
                this.method1318(4, var8 - 1, arg4 ^ 0x40000, var7 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method1318(130, var8, -262145, var7);
                this.method1318(8, var8 - 1, -262145, var7);
                this.method1318(32, var8, arg4 ^ 0x40000, var7 + 1);
            }
            if (arg1 == 1) {
                this.method1318(10, var8, -262145, var7);
                this.method1318(32, var8, -262145, var7 + 1);
                this.method1318(128, var8 + 1, -262145, var7);
            }
            if (arg1 == 2) {
                this.method1318(40, var8, -262145, var7);
                this.method1318(128, var8 + 1, -262145, var7);
                this.method1318(2, var8, -262145, var7 - 1);
            }
            if (arg1 == 3) {
                this.method1318(160, var8, -262145, var7);
                this.method1318(2, var8, -262145, var7 - 1);
                this.method1318(8, var8 - 1, arg4 + -262144, var7);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method1318(65536, var8, -262145, var7);
                this.method1318(4096, var8 - 1, arg4 ^ 0x40000, var7);
            }
            if (arg1 == 1) {
                this.method1318(1024, var8, -262145, var7);
                this.method1318(16384, var8, -262145, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1318(4096, var8, -262145, var7);
                this.method1318(65536, var8 + 1, arg4 + -262144, var7);
            }
            if (arg1 == 3) {
                this.method1318(16384, var8, arg4 - 262144, var7);
                this.method1318(1024, var8, -262145, var7 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method1318(512, var8, -262145, var7);
                this.method1318(8192, var8 - 1, -262145, var7 + 1);
            }
            if (arg1 == 1) {
                this.method1318(2048, var8, -262145, var7);
                this.method1318(32768, var8 + 1, -262145, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1318(8192, var8, -262145, var7);
                this.method1318(512, var8 + 1, -262145, var7 - 1);
            }
            if (arg1 == 3) {
                this.method1318(32768, var8, -262145, var7);
                this.method1318(2048, var8 - 1, -262145, var7 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1318(66560, var8, -262145, var7);
            this.method1318(4096, var8 - 1, -262145, var7);
            this.method1318(16384, var8, arg4 ^ 0x40000, var7 + 1);
        }
        if (arg1 == 1) {
            this.method1318(5120, var8, -262145, var7);
            this.method1318(16384, var8, arg4 - 262144, var7 + 1);
            this.method1318(65536, var8 + 1, -262145, var7);
        }
        if (arg1 == 2) {
            this.method1318(20480, var8, arg4 ^ 0x40000, var7);
            this.method1318(65536, var8 + 1, arg4 + -262144, var7);
            this.method1318(1024, var8, -262145, var7 - 1);
        }
        if (arg1 == 3) {
            this.method1318(81920, var8, -262145, var7);
            this.method1318(1024, var8, -262145, var7 - 1);
            this.method1318(4096, var8 - 1, -262145, var7);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V", line = 1249)
    public final void method1313(int arg0, int arg1, int arg2) {
        if (arg0 != -20193) {
            this.field3164 = -11;
        }
        int var4 = arg1 - this.field3171;
        int var5 = arg2 - this.field3161;
        field3163++;
        this.field3159[var4][var5] = class98.method674(this.field3159[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)V", line = 1263)
    private final void method1314(int arg0, int arg1, int arg2, int arg3) {
        field3178++;
        this.field3159[arg2][arg0] = class98.method674(this.field3159[arg2][arg0], arg3);
        if (arg1 != 0) {
            method1309((class51) null, -125, (class51) null);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)V", line = 1276)
    public final void method1315(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3171;
        field3179++;
        int var5 = arg0 - this.field3161;
        this.field3159[var4][var5] = class277.method1935(this.field3159[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIII)Z", line = 1287)
    public final boolean method1316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3181++;
        if (arg0 == 1) {
            if (arg1 == arg4 && arg2 == arg7) {
                return true;
            }
        } else if (arg4 >= arg1 && arg4 <= (arg0 + arg1 - 1) && arg7 >= arg7 && arg7 <= (arg0 + arg7 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field3171;
        int var10 = arg7 - this.field3161;
        int var11 = arg2 - this.field3161;
        int var12 = arg4 - this.field3171;
        if (arg6 != -1) {
            field3166 = (class317) null;
        }
        if (arg0 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field3159[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field3159[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field3159[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field3159[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field3159[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field3159[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field3159[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field3159[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var12 && var10 + 1 == var11 && (this.field3159[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field3159[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field3159[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field3159[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var11 - 1;
            int var14 = arg0 + var9 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var12 + 1) == var9 && var11 <= var10 && var10 <= var13 && (this.field3159[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && (var10 - arg0) == var11 && (this.field3159[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var12 - arg0) == var9 && var10 >= var11 && var10 <= var13 && (this.field3159[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var14 >= var12 && (var10 - arg0) == var11 && (this.field3159[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 - arg0 == var9 && var11 <= var10 && var10 <= var13 && (this.field3159[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && var10 + 1 == var11 && (this.field3159[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var12 + 1) == var9 && var10 >= var11 && var10 <= var13 && (this.field3159[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var14 && (var10 + 1) == var11 && (this.field3159[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 <= var12 && var12 <= var14 && var10 + 1 == var11 && (this.field3159[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var12 && var12 <= var14 && var10 - arg0 == var11 && (this.field3159[var12][var13] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg0 == var9 && var11 <= var10 && var10 <= var13 && (this.field3159[var14][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 <= var10 && var13 >= var10 && (this.field3159[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(II)V", line = 1483)
    public class189(int arg0, int arg1) {
        this.field3164 = arg1;
        this.field3161 = 0;
        this.field3169 = arg0;
        this.field3159 = new int[this.field3169][this.field3164];
        this.field3171 = 0;
        this.method1305(-1);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIB)Z", line = 1497)
    public final boolean method1317(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3184++;
        if (arg2 == arg3 && arg0 == arg1) {
            return true;
        }
        int var6 = arg3 - this.field3171;
        int var7 = arg0 - this.field3161;
        if (var6 < 0 || var6 >= this.field3169 || var7 < 0 || var7 >= this.field3164) {
            return false;
        }
        int var8 = arg1 - this.field3161;
        if (arg4 != -77) {
            this.field3161 = -120;
        }
        int var9 = arg2 - this.field3171;
        int var10;
        if (var9 < var6) {
            var10 = var6 - var9;
        } else {
            var10 = var9 - var6;
        }
        int var11;
        if (var7 <= var8) {
            var11 = var8 - var7;
        } else {
            var11 = var7 - var8;
        }
        if (var10 <= var11) {
            int var12 = 32768;
            int var13 = var10 * 65536 / var11;
            while (var7 != var8) {
                if (var8 < var7) {
                    if ((this.field3159[var9][var8] & 0x12C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var7 < var8) {
                    if ((this.field3159[var9][var8] & 0x12C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var6 > var9) {
                        if ((this.field3159[var9][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var6) {
                        if ((this.field3159[var9][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var9) {
                if (var6 > var9) {
                    if ((this.field3159[var9][var8] & 0x12C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var6 < var9) {
                    if ((this.field3159[var9][var8] & 0x12C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var8 < var7) {
                        if ((this.field3159[var9][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var7 < var8) {
                        if ((this.field3159[var9][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field3159[var6][var7] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIII)V", line = 1660)
    private final void method1318(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -262145) {
            field3176++;
            this.field3159[arg1][arg3] = class277.method1935(this.field3159[arg1][arg3], ~arg0);
        }
    }
}
