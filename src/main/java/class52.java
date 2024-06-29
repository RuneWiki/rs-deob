import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class52 {

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    private int field717;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    private int field707;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    private int field727;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "[[I")
    public int[][] field731;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lqe;")
    public static class168 field719 = class66.method448("Lade Konfiguration )2 ", 14);

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Z")
    public static boolean field721 = false;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lgj;")
    public static class239 field711;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIIB)Z")
    private final boolean method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        if (arg9 <= 62) {
            return true;
        }
        field722++;
        int var11 = arg7 + arg8;
        int var12 = arg1 + arg5;
        int var13 = arg0 + arg6;
        int var14 = arg2 + arg3;
        if (arg8 >= arg6 && var13 > arg8) {
            if (arg5 == var14 && (arg4 & 0x4) == 0) {
                int var15 = arg8;
                int var16 = var11 > var13 ? var13 : var11;
                while (var16 > var15) {
                    if ((this.field731[var15 - this.field727][var14 - this.field713 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg2 == var12 && (arg4 & 0x1) == 0) {
                int var17 = arg8;
                int var18 = var11 <= var13 ? var11 : var13;
                while (var17 < var18) {
                    if ((this.field731[var17 - this.field727][arg2 - this.field713] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg6 && var13 >= var11) {
            if (arg5 == var14 && (arg4 & 0x4) == 0) {
                for (int var19 = arg6; var19 < var11; var19++) {
                    if ((this.field731[var19 - this.field727][var14 - this.field713 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var12 && (arg4 & 0x1) == 0) {
                for (int var20 = arg6; var20 < var11; var20++) {
                    if ((this.field731[var20 - this.field727][arg2 - this.field713] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg2 >= arg5 && arg2 < var12) {
            if (arg6 == var11 && (arg4 & 0x8) == 0) {
                int var21 = arg2;
                int var22 = var14 <= var12 ? var14 : var12;
                while (var21 < var22) {
                    if ((this.field731[var11 - this.field727 - 1][var21 - this.field713] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg8 == var13 && (arg4 & 0x2) == 0) {
                int var23 = var12 < var14 ? var12 : var14;
                for (int var24 = arg2; var24 < var23; var24++) {
                    if ((this.field731[arg8 - this.field727][var24 - this.field713] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (var14 > arg5 && var12 >= var14) {
            if (arg6 == var11 && (arg4 & 0x8) == 0) {
                for (int var25 = arg5; var25 < var14; var25++) {
                    if ((this.field731[var11 - this.field727 - 1][var25 - this.field713] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var13 && (arg4 & 0x2) == 0) {
                for (int var26 = arg5; var26 < var14; var26++) {
                    if ((this.field731[arg8 - this.field727][var26 - this.field713] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZIII)V")
    public final void method360(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field713;
        int var8 = arg3 - this.field727;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method372(var8, var7, 128, (byte) -114);
                this.method372(var8 - 1, var7, 8, (byte) -65);
            }
            if (arg1 == 1) {
                this.method372(var8, var7, 2, (byte) -57);
                this.method372(var8, var7 + 1, 32, (byte) -76);
            }
            if (arg1 == 2) {
                this.method372(var8, var7, 8, (byte) -71);
                this.method372(var8 + 1, var7, 128, (byte) -91);
            }
            if (arg1 == 3) {
                this.method372(var8, var7, 32, (byte) -124);
                this.method372(var8, var7 - 1, 2, (byte) -120);
            }
        }
        if (arg0 >= -107) {
            this.field731 = null;
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method372(var8, var7, 1, (byte) -103);
                this.method372(var8 - 1, var7 - -1, 16, (byte) -68);
            }
            if (arg1 == 1) {
                this.method372(var8, var7, 4, (byte) -94);
                this.method372(var8 + 1, var7 + 1, 64, (byte) -73);
            }
            if (arg1 == 2) {
                this.method372(var8, var7, 16, (byte) -65);
                this.method372(var8 + 1, var7 + -1, 1, (byte) -64);
            }
            if (arg1 == 3) {
                this.method372(var8, var7, 64, (byte) -128);
                this.method372(var8 - 1, var7 + -1, 4, (byte) -82);
            }
        }
        field723++;
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method372(var8, var7, 130, (byte) -71);
                this.method372(var8 - 1, var7, 8, (byte) -58);
                this.method372(var8, var7 + 1, 32, (byte) -64);
            }
            if (arg1 == 1) {
                this.method372(var8, var7, 10, (byte) -65);
                this.method372(var8, var7 + 1, 32, (byte) -85);
                this.method372(var8 + 1, var7, 128, (byte) -111);
            }
            if (arg1 == 2) {
                this.method372(var8, var7, 40, (byte) -122);
                this.method372(var8 + 1, var7, 128, (byte) -97);
                this.method372(var8, var7 - 1, 2, (byte) -117);
            }
            if (arg1 == 3) {
                this.method372(var8, var7, 160, (byte) -66);
                this.method372(var8, var7 - 1, 2, (byte) -122);
                this.method372(var8 - 1, var7, 8, (byte) -105);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method372(var8, var7, 65536, (byte) -97);
                this.method372(var8 - 1, var7, 4096, (byte) -83);
            }
            if (arg1 == 1) {
                this.method372(var8, var7, 1024, (byte) -93);
                this.method372(var8, var7 + 1, 16384, (byte) -75);
            }
            if (arg1 == 2) {
                this.method372(var8, var7, 4096, (byte) -87);
                this.method372(var8 + 1, var7, 65536, (byte) -95);
            }
            if (arg1 == 3) {
                this.method372(var8, var7, 16384, (byte) -55);
                this.method372(var8, var7 - 1, 1024, (byte) -66);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method372(var8, var7, 512, (byte) -95);
                this.method372(var8 - 1, var7 + 1, 8192, (byte) -91);
            }
            if (arg1 == 1) {
                this.method372(var8, var7, 2048, (byte) -68);
                this.method372(var8 + 1, var7 + 1, 32768, (byte) -106);
            }
            if (arg1 == 2) {
                this.method372(var8, var7, 8192, (byte) -126);
                this.method372(var8 + 1, var7 + -1, 512, (byte) -109);
            }
            if (arg1 == 3) {
                this.method372(var8, var7, 32768, (byte) -95);
                this.method372(var8 - 1, var7 + -1, 2048, (byte) -121);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method372(var8, var7, 66560, (byte) -71);
            this.method372(var8 - 1, var7, 4096, (byte) -68);
            this.method372(var8, var7 + 1, 16384, (byte) -66);
        }
        if (arg1 == 1) {
            this.method372(var8, var7, 5120, (byte) -63);
            this.method372(var8, var7 + 1, 16384, (byte) -64);
            this.method372(var8 + 1, var7, 65536, (byte) -101);
        }
        if (arg1 == 2) {
            this.method372(var8, var7, 20480, (byte) -72);
            this.method372(var8 + 1, var7, 65536, (byte) -81);
            this.method372(var8, var7 - 1, 1024, (byte) -78);
        }
        if (arg1 == 3) {
            this.method372(var8, var7, 81920, (byte) -104);
            this.method372(var8, var7 - 1, 1024, (byte) -71);
            this.method372(var8 - 1, var7, 4096, (byte) -95);
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBIIIIII)Z")
    private final boolean method361(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field730++;
        if (arg7 >= arg1 + arg5 || arg5 >= arg3 + arg7) {
            return false;
        } else if (arg0 + arg4 > arg8 && arg4 < arg6 + arg8) {
            return arg2 == -123 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZIIZII)V")
    public final void method362(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field713;
        int var9 = arg3 - this.field727;
        field710++;
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg6;
            arg6 = arg0;
            arg0 = var10;
        }
        int var11 = 256;
        if (arg1) {
            var11 += 131072;
        }
        int var12 = var9;
        if (!arg4) {
            return;
        }
        while (var12 < var9 + arg6) {
            if (var12 >= 0 && var12 < this.field707) {
                for (int var13 = var8; var13 < arg0 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field717) {
                        this.method372(var12, var13, var11, (byte) -91);
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field726++;
        if (arg7 == 1) {
            if (arg0 == arg6 && arg1 == arg4) {
                return true;
            }
        } else if (arg0 <= arg6 && arg6 <= arg7 + arg0 - 1 && arg1 >= arg1 && arg1 + arg7 - 1 >= arg1) {
            return true;
        }
        int var9 = arg0 - this.field727;
        int var10 = arg1 - this.field713;
        int var11 = arg4 - this.field713;
        int var12 = arg6 - this.field727;
        if (arg7 == 1) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field731[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field731[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field731[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field731[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field731[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field731[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field731[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field731[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field731[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field731[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field731[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field731[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field731[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field731[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field731[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field731[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var12 && var10 + 1 == var11 && (this.field731[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field731[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field731[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field731[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var9 - 1;
            int var14 = arg7 + var11 - 1;
            if (arg2 == 0) {
                if (arg5 == 0) {
                    if (var12 - arg7 == var9 && var10 >= var11 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 + 1 == var11 && (this.field731[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 - arg7 == var11 && (this.field731[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 >= var9 && var13 >= var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var12 - arg7 == var9 && var11 <= var10 && var14 >= var10 && (this.field731[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 <= var10 && var10 <= var14 && (this.field731[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 + 1 == var9 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var10 + 1 == var11 && (this.field731[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 - arg7 == var11 && (this.field731[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 >= var9 && var12 <= var13 && var10 - arg7 == var11) {
                        return true;
                    }
                    if (var12 - arg7 == var9 && var10 >= var11 && var14 >= var10 && (this.field731[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 <= var10 && var10 <= var14 && (this.field731[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    if (var12 - arg7 == var9 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10 && (this.field731[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var10 - arg7 == var11 && (this.field731[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 - arg7 == var9 && var11 <= var10 && var14 >= var10 && (this.field731[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 - arg7 == var11 && (this.field731[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 - arg7 == var9 && var11 <= var10 && var10 <= var14 && (this.field731[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && var10 + 1 == var11 && (this.field731[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var10 - arg7 == var11) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 - arg7 == var9 && var10 >= var11 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var10 + 1 == var11 && (this.field731[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var10 <= var14 && (this.field731[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 - arg7 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 <= var12 && var12 <= var13 && var10 + 1 == var11 && (this.field731[var12][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 >= var9 && var13 >= var12 && var10 - arg7 == var11 && (this.field731[var12][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var12 - arg7 == var9 && var10 >= var11 && var10 <= var14 && (this.field731[var13][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 <= var10 && var14 >= var10 && (this.field731[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 <= 74) {
            this.field707 = 108;
        }
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static final void method364(int arg0) {
        field714++;
        if (arg0 != 1) {
            return;
        }
        if (class169.field2953 != null) {
            class169.field2953.method1653(-89);
            class169.field2953 = null;
        }
        class18.method93(true);
        class66.method446();
        for (int var1 = 0; var1 < 4; var1++) {
            class169.field2951[var1].method374(52);
        }
        class166.method1064((byte) 127);
        System.gc();
        class31.method202(2, true);
        class147.field2574 = false;
        class230.field3908 = -1;
        class8.method32((byte) 88, true);
        class204.field3538 = false;
        class246.field4261 = 0;
        class125.field2060 = 0;
        for (int var2 = 0; var2 < class44.field579.length; var2++) {
            class44.field579[var2] = null;
        }
        class132.field2322 = 0;
        class82.field1244 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class104.field1677[var3] = null;
            class229.field3902[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class229.field3898[var4] = null;
        }
        class84.method555(5, 8);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static void method365(int arg0) {
        if (arg0 == 2) {
            field719 = null;
            field711 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZI)V")
    public final void method366(int arg0, boolean arg1, int arg2) {
        field708++;
        int var4 = arg0 - this.field727;
        int var5 = arg2 - this.field713;
        this.field731[var4][var5] = class86.method571(this.field731[var4][var5], -262145);
        if (!arg1) {
            method365(12);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIZIII)V")
    public final void method367(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field727;
        field724++;
        int var8 = arg1 - this.field713;
        int var9 = 256;
        if (arg2) {
            var9 += 131072;
        }
        int var10 = var7;
        int var11 = -30 / ((-arg5 - 63) / 50);
        while (arg4 + var7 > var10) {
            if (var10 >= 0 && var10 < this.field707) {
                for (int var12 = var8; var12 < arg3 + var8; var12++) {
                    if (var12 >= 0 && this.field717 > var12) {
                        this.method376(var10, var12, 1, var9);
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V")
    public final void method368(int arg0, int arg1, byte arg2) {
        field715++;
        int var4 = arg1 - this.field713;
        if (arg2 <= -92) {
            int var5 = arg0 - this.field727;
            this.field731[var5][var4] = class102.method675(this.field731[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
    public final void method369(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field727;
        int var5 = arg0 - this.field713;
        int var6 = -33 / ((41 - arg1) / 39);
        this.field731[var4][var5] = class102.method675(this.field731[var4][var5], 262144);
        field706++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIBIIII)Z")
    public final boolean method370(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field712++;
        if (arg1 == 1) {
            if (arg0 == arg2 && arg4 == arg7) {
                return true;
            }
        } else if (arg0 <= arg2 && arg2 <= arg0 + arg1 - 1 && arg4 <= arg4 && arg1 + arg4 - 1 >= arg4) {
            return true;
        }
        int var9 = arg4 - this.field713;
        int var10 = arg2 - this.field727;
        int var11 = arg7 - this.field713;
        int var12 = arg0 - this.field727;
        int var13 = -69 % ((7 - arg3) / 44);
        if (arg1 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field731[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field731[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field731[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field731[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field731[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field731[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field731[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field731[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field731[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field731[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field731[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field731[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var12 + arg1 - 1;
            int var15 = arg1 + var11 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var10 + 1 == var12 && var11 <= var9 && var9 <= var15 && (this.field731[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var14 >= var10 && var9 - arg1 == var11 && (this.field731[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - arg1 == var12 && var9 >= var11 && var15 >= var9 && (this.field731[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var14 && var9 - arg1 == var11 && (this.field731[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - arg1 == var12 && var9 >= var11 && var15 >= var9 && (this.field731[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var14 >= var10 && var9 + 1 == var11 && (this.field731[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 + 1 == var12 && var9 >= var11 && var9 <= var15 && (this.field731[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var14 && var9 + 1 == var11 && (this.field731[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var12 <= var10 && var10 <= var14 && var9 + 1 == var11 && (this.field731[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var10 && var10 <= var14 && var9 - arg1 == var11 && (this.field731[var10][var15] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg1 == var12 && var11 <= var9 && var9 <= var15 && (this.field731[var14][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 >= var11 && var9 <= var15 && (this.field731[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public static final void method371(int arg0) {
        int var1 = -38 / ((-arg0 - 45) / 48);
        class55.field755.method14(false);
        field720++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIB)V")
    private final void method372(int arg0, int arg1, int arg2, byte arg3) {
        field728++;
        this.field731[arg0][arg1] = class86.method571(this.field731[arg0][arg1], ~arg2);
        if (arg3 >= -49) {
            method375(null, 36, false, true, 55);
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
    public static final void method373(int arg0) {
        field729++;
        class112.field1815.method661(-3);
        if (arg0 <= 22) {
            field721 = true;
        }
        int var1 = class112.field1815.method671(1, 7);
        if (var1 == 0) {
            return;
        }
        int var2 = class112.field1815.method671(2, 7);
        if (var2 == 0) {
            class38.field521[class84.field1278++] = 2047;
        } else if (var2 == 1) {
            int var3 = class112.field1815.method671(3, 7);
            class7.field85.method90(var3, true, false);
            int var4 = class112.field1815.method671(1, 7);
            if (var4 == 1) {
                class38.field521[class84.field1278++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class112.field1815.method671(3, 7);
            class7.field85.method90(var5, true, true);
            int var6 = class112.field1815.method671(3, 7);
            class7.field85.method90(var6, true, true);
            int var7 = class112.field1815.method671(1, 7);
            if (var7 == 1) {
                class38.field521[class84.field1278++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class112.field1815.method671(7, 7);
            int var9 = class112.field1815.method671(1, 7);
            int var10 = class112.field1815.method671(7, 7);
            int var11 = class112.field1815.method671(1, 7);
            if (var11 == 1) {
                class38.field521[class84.field1278++] = 2047;
            }
            class196.field3401 = class112.field1815.method671(2, 7);
            class7.field85.method91(var8, -105, var10, var9 == 1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
    public final void method374(int arg0) {
        field716++;
        for (int var2 = 0; var2 < this.field707; var2++) {
            for (int var3 = 0; var3 < this.field717; var3++) {
                if (var2 == 0 || var3 == 0 || this.field707 - 5 <= var2 || var3 >= this.field717 - 5) {
                    this.field731[var2][var3] = 16777215;
                } else {
                    this.field731[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 < 38) {
            this.method372(51, 61, 56, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lmj;IZZI)V")
    public static final void method375(class129 arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        int var5 = arg0.field2175;
        if (arg0.field2182 == 0) {
            arg0.field2175 = arg0.field2166;
        } else if (arg0.field2182 == 1) {
            arg0.field2175 = arg4 - arg0.field2166;
        } else if (arg0.field2182 == 2) {
            arg0.field2175 = arg0.field2166 * arg4 >> 14;
        } else if (arg0.field2182 == 3) {
            if (arg0.field2230 == 2) {
                arg0.field2175 = (arg0.field2166 - 1) * arg0.field2179 + arg0.field2166 * 32;
            } else if (arg0.field2230 == 7) {
                arg0.field2175 = (arg0.field2166 - 1) * arg0.field2179 + arg0.field2166 * 115;
            }
        }
        int var6 = arg0.field2210;
        field718++;
        if (arg0.field2264 == 0) {
            arg0.field2210 = arg0.field2253;
        } else if (arg0.field2264 == 1) {
            arg0.field2210 = arg1 - arg0.field2253;
        } else if (arg0.field2264 == 2) {
            arg0.field2210 = arg0.field2253 * arg1 >> 14;
        } else if (arg0.field2264 == 3) {
            if (arg0.field2230 == 2) {
                arg0.field2210 = (arg0.field2253 - 1) * arg0.field2199 + arg0.field2253 * 32;
            } else if (arg0.field2230 == 7) {
                arg0.field2210 = arg0.field2253 * 12 + (arg0.field2253 - 1) * arg0.field2199;
            }
        }
        if (arg2) {
            method365(61);
        }
        if (arg0.field2182 == 4) {
            arg0.field2175 = arg0.field2237 * arg0.field2210 / arg0.field2268;
        }
        if (arg0.field2264 == 4) {
            arg0.field2210 = arg0.field2268 * arg0.field2175 / arg0.field2237;
        }
        if (class125.field2051 && (client.method266(arg0) != 0 || arg0.field2230 == 0)) {
            if (arg0.field2210 < 5 && arg0.field2175 < 5) {
                arg0.field2175 = 5;
                arg0.field2210 = 5;
            } else {
                if (arg0.field2175 <= 0) {
                    arg0.field2175 = 5;
                }
                if (arg0.field2210 <= 0) {
                    arg0.field2210 = 5;
                }
            }
        }
        if (arg0.field2136 == 1337) {
            class254.field4385 = arg0;
        }
        if (arg3 && arg0.field2138 != null && (arg0.field2175 != var5 || arg0.field2210 != var6)) {
            class147 var7 = new class147();
            var7.field2566 = arg0.field2138;
            var7.field2552 = arg0;
            class54.field744.method311((byte) 16, var7);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
    private final void method376(int arg0, int arg1, int arg2, int arg3) {
        this.field731[arg0][arg1] = class102.method675(this.field731[arg0][arg1], arg3);
        if (arg2 != 1) {
            this.field731 = null;
        }
        field732++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field709++;
        if (arg7 > 1) {
            return this.method361(arg0, arg3, (byte) -123, arg7, arg2, arg5, arg7, arg4, arg1) ? true : this.method359(arg3, arg0, arg1, arg7, arg6, arg2, arg5, arg7, arg4, (byte) 63);
        }
        int var10 = arg5 + arg3 - 1;
        int var11 = arg0 + arg2 - 1;
        if (arg4 >= arg5 && var10 >= arg4 && arg2 <= arg1 && var11 >= arg1) {
            return true;
        } else if (arg5 - 1 == arg4 && arg2 <= arg1 && var11 >= arg1 && (this.field731[arg4 - this.field727][arg1 - this.field713] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg2 <= arg1 && var11 >= arg1 && (this.field731[arg4 - this.field727][arg1 - this.field713] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else {
            if (arg8 < 36) {
                this.method372(-64, 53, -102, (byte) -119);
            }
            if (arg2 - 1 == arg1 && arg5 <= arg4 && arg4 <= var10 && (this.field731[arg4 - this.field727][arg1 - this.field713] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg1 && arg5 <= arg4 && var10 >= arg4 && (this.field731[arg4 - this.field727][arg1 - this.field713] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIZBI)V")
    public final void method378(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        field725++;
        int var7 = arg5 - this.field727;
        int var8 = arg0 - this.field713;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method376(var7, var8, arg4 ^ 0x51, 128);
                this.method376(var7 - 1, var8, arg4 ^ 0x51, 8);
            }
            if (arg1 == 1) {
                this.method376(var7, var8, arg4 - 79, 2);
                this.method376(var7, var8 + 1, arg4 ^ 0x51, 32);
            }
            if (arg1 == 2) {
                this.method376(var7, var8, 1, 8);
                this.method376(var7 + 1, var8, 1, 128);
            }
            if (arg1 == 3) {
                this.method376(var7, var8, 1, 32);
                this.method376(var7, var8 - 1, arg4 + -79, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method376(var7, var8, arg4 - 79, 1);
                this.method376(var7 - 1, var8 + 1, 1, 16);
            }
            if (arg1 == 1) {
                this.method376(var7, var8, 1, 4);
                this.method376(var7 + 1, var8 - -1, 1, 64);
            }
            if (arg1 == 2) {
                this.method376(var7, var8, 1, 16);
                this.method376(var7 + 1, var8 + -1, 1, 1);
            }
            if (arg1 == 3) {
                this.method376(var7, var8, 1, 64);
                this.method376(var7 - 1, var8 + -1, 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method376(var7, var8, 1, 130);
                this.method376(var7 - 1, var8, 1, 8);
                this.method376(var7, var8 + 1, arg4 ^ 0x51, 32);
            }
            if (arg1 == 1) {
                this.method376(var7, var8, 1, 10);
                this.method376(var7, var8 + 1, 1, 32);
                this.method376(var7 + 1, var8, 1, 128);
            }
            if (arg1 == 2) {
                this.method376(var7, var8, 1, 40);
                this.method376(var7 + 1, var8, 1, 128);
                this.method376(var7, var8 - 1, 1, 2);
            }
            if (arg1 == 3) {
                this.method376(var7, var8, 1, 160);
                this.method376(var7, var8 - 1, 1, 2);
                this.method376(var7 - 1, var8, 1, 8);
            }
        }
        if (arg3) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    this.method376(var7, var8, 1, 65536);
                    this.method376(var7 - 1, var8, 1, 4096);
                }
                if (arg1 == 1) {
                    this.method376(var7, var8, 1, 1024);
                    this.method376(var7, var8 + 1, arg4 ^ 0x51, 16384);
                }
                if (arg1 == 2) {
                    this.method376(var7, var8, 1, 4096);
                    this.method376(var7 + 1, var8, 1, 65536);
                }
                if (arg1 == 3) {
                    this.method376(var7, var8, 1, 16384);
                    this.method376(var7, var8 - 1, arg4 ^ 0x51, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg1 == 0) {
                    this.method376(var7, var8, 1, 512);
                    this.method376(var7 - 1, var8 + 1, 1, 8192);
                }
                if (arg1 == 1) {
                    this.method376(var7, var8, arg4 ^ 0x51, 2048);
                    this.method376(var7 + 1, var8 + 1, 1, 32768);
                }
                if (arg1 == 2) {
                    this.method376(var7, var8, 1, 8192);
                    this.method376(var7 + 1, var8 + -1, arg4 - 79, 512);
                }
                if (arg1 == 3) {
                    this.method376(var7, var8, 1, 32768);
                    this.method376(var7 - 1, var8 + -1, 1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    this.method376(var7, var8, 1, 66560);
                    this.method376(var7 - 1, var8, 1, 4096);
                    this.method376(var7, var8 + 1, 1, 16384);
                }
                if (arg1 == 1) {
                    this.method376(var7, var8, arg4 ^ 0x51, 5120);
                    this.method376(var7, var8 + 1, arg4 ^ 0x51, 16384);
                    this.method376(var7 + 1, var8, arg4 ^ 0x51, 65536);
                }
                if (arg1 == 2) {
                    this.method376(var7, var8, 1, 20480);
                    this.method376(var7 + 1, var8, 1, 65536);
                    this.method376(var7, var8 - 1, 1, 1024);
                }
                if (arg1 == 3) {
                    this.method376(var7, var8, 1, 81920);
                    this.method376(var7, var8 - 1, 1, 1024);
                    this.method376(var7 - 1, var8, 1, 4096);
                }
            }
        }
        if (arg4 != 80) {
            this.method370(-4, 87, 88, (byte) 91, -89, -30, 103, 122);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(II)V")
    public class52(int arg0, int arg1) {
        this.field717 = arg1;
        this.field713 = 0;
        this.field707 = arg0;
        this.field727 = 0;
        this.field731 = new int[this.field707][this.field717];
        this.method374(46);
    }
}
