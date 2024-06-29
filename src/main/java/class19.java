import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 {

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field269 = 0;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "[S")
    public static short[] field276 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "[[I")
    public int[][] field275;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIBI)Z")
    public final boolean method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field260++;
        if (arg0 > 1) {
            return class222.method1373(arg2, arg3, arg1, arg4, 0, arg0, arg8, arg5, arg0) ? true : this.method136(true, arg8, arg2, arg5, arg0, arg6, arg4, arg1, arg3, arg0);
        }
        int var10 = arg1 + arg2 - 1;
        int var11 = arg3 + arg5 - 1;
        if (arg1 <= arg8 && arg8 <= var10 && arg3 <= arg4 && arg4 <= var11) {
            return true;
        }
        if (arg7 >= -68) {
            this.method140(-34, 50, 10, false, false, 23, -12, 113);
        }
        if ((arg1 - 1) == arg8 && arg3 <= arg4 && arg4 <= var11 && (this.field275[arg8 - this.field259][arg4 - this.field258] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg8 && arg4 >= arg3 && arg4 <= var11 && (this.field275[arg8 - this.field259][arg4 - this.field258] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if ((arg3 - 1) == arg4 && arg8 >= arg1 && var10 >= arg8 && (this.field275[arg8 - this.field259][arg4 - this.field258] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg4 && arg8 >= arg1 && var10 >= arg8 && (this.field275[arg8 - this.field259][arg4 - this.field258] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIB)Z")
    public final boolean method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field266++;
        if (arg2 == 1) {
            if (arg0 == arg4 && arg5 == arg6) {
                return true;
            }
        } else if (arg0 <= arg4 && arg4 <= arg0 + arg2 - 1 && arg5 <= arg5 && arg5 <= (arg5 + arg2 - 1)) {
            return true;
        }
        int var9 = arg0 - this.field259;
        int var10 = arg5 - this.field258;
        int var11 = arg4 - this.field259;
        if (arg7 != -66) {
            return true;
        }
        int var12 = arg6 - this.field258;
        if (arg2 == 1) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field275[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field275[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var11 - 1 == var9 && var10 == var12 && (this.field275[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field275[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field275[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field275[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field275[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field275[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field275[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field275[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field275[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field275[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field275[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field275[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field275[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field275[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field275[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field275[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field275[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field275[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg2 - 1;
            int var14 = var12 + arg2 - 1;
            if (arg3 == 0) {
                if (arg1 == 0) {
                    if ((var11 - arg2) == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12 && (this.field275[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 - arg2 == var12 && (this.field275[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 <= var11 && var11 <= var13 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var11 - arg2 == var9 && var10 >= var12 && var14 >= var10 && (this.field275[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 <= var10 && var14 >= var10 && (this.field275[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 + 1) == var9 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 + 1 == var12 && (this.field275[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 - arg2) == var12 && (this.field275[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 <= var11 && var11 <= var13 && (var10 - arg2) == var12) {
                        return true;
                    }
                    if ((var11 - arg2) == var9 && var12 <= var10 && var14 >= var10 && (this.field275[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 >= var12 && var14 >= var10 && (this.field275[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    if ((var11 - arg2) == var9 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var14 >= var10 && (this.field275[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var10 - arg2 == var12 && (this.field275[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 - arg2 == var9 && var10 >= var12 && var10 <= var14 && (this.field275[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var10 - arg2) == var12 && (this.field275[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 - arg2 == var9 && var12 <= var10 && var14 >= var10 && (this.field275[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var10 + 1 == var12 && (this.field275[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 - arg2) == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 - arg2 == var9 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 + 1 == var12 && (this.field275[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14 && (this.field275[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 - arg2 == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var11 >= var9 && var11 <= var13 && var10 + 1 == var12 && (this.field275[var11][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 >= var9 && var13 >= var11 && var10 - arg2 == var12 && (this.field275[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var11 - arg2 == var9 && var12 <= var10 && var14 >= var10 && (this.field275[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 >= var12 && var10 <= var14 && (this.field275[var9][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIZI)V")
    public static final void method130(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            field276 = null;
        }
        if (arg2 <= arg0) {
            for (int var5 = arg2; var5 < arg0; var5++) {
                class41.field629[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg2; var6++) {
                class41.field629[var6][arg1] = arg4;
            }
        }
        field278++;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
    public final void method131(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field258;
        int var5 = -59 % ((arg1 + 38) / 38);
        field261++;
        int var6 = arg2 - this.field259;
        this.field275[var6][var4] = class500.method3013(this.field275[var6][var4], -262145);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZ)V")
    public final void method132(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field258;
        if (arg2) {
            this.method139(true);
        }
        field262++;
        int var5 = arg1 - this.field259;
        this.field275[var5][var4] = class51.method379(this.field275[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(III)V")
    public final void method133(int arg0, int arg1, int arg2) {
        field255++;
        int var4 = arg1 - this.field258;
        int var5 = arg0 - this.field259;
        if (arg2 >= 39) {
            this.field275[var5][var4] = class500.method3013(this.field275[var5][var4], -2097153);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)V")
    private final void method134(int arg0, int arg1, int arg2, int arg3) {
        this.field275[arg1][arg2] = class51.method379(this.field275[arg1][arg2], arg3);
        field263++;
        if (arg0 >= -121) {
            field269 = -72;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZZIII)V")
    public final void method135(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field271++;
        int var8 = arg4 - this.field259;
        int var9 = arg6 - this.field258;
        if (~arg5 == arg0) {
            if (arg1 == 0) {
                this.method143(var8, var9, 128, arg0 - 104);
                this.method143(var8 - 1, var9, 8, -47);
            }
            if (arg1 == 1) {
                this.method143(var8, var9, 2, -102);
                this.method143(var8, var9 + 1, 32, -50);
            }
            if (arg1 == 2) {
                this.method143(var8, var9, 8, -55);
                this.method143(var8 + 1, var9, 128, -114);
            }
            if (arg1 == 3) {
                this.method143(var8, var9, 32, -42);
                this.method143(var8, var9 - 1, 2, arg0 - 127);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method143(var8, var9, 1, -126);
                this.method143(var8 - 1, var9 + 1, 16, -76);
            }
            if (arg1 == 1) {
                this.method143(var8, var9, 4, arg0 - 112);
                this.method143(var8 + 1, var9 - -1, 64, arg0 ^ 0x33);
            }
            if (arg1 == 2) {
                this.method143(var8, var9, 16, -77);
                this.method143(var8 + 1, var9 + -1, 1, -75);
            }
            if (arg1 == 3) {
                this.method143(var8, var9, 64, -99);
                this.method143(var8 - 1, var9 + -1, 4, -85);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method143(var8, var9, 130, -112);
                this.method143(var8 - 1, var9, 8, -40);
                this.method143(var8, var9 + 1, 32, arg0 - 56);
            }
            if (arg1 == 1) {
                this.method143(var8, var9, 10, -90);
                this.method143(var8, var9 + 1, 32, -114);
                this.method143(var8 + 1, var9, 128, arg0 ^ 0x29);
            }
            if (arg1 == 2) {
                this.method143(var8, var9, 40, -61);
                this.method143(var8 + 1, var9, 128, arg0 - 73);
                this.method143(var8, var9 - 1, 2, -67);
            }
            if (arg1 == 3) {
                this.method143(var8, var9, 160, -56);
                this.method143(var8, var9 - 1, 2, arg0 - 39);
                this.method143(var8 - 1, var9, 8, -97);
            }
        }
        if (arg3) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    this.method143(var8, var9, 65536, -35);
                    this.method143(var8 - 1, var9, 4096, -98);
                }
                if (arg1 == 1) {
                    this.method143(var8, var9, 1024, -42);
                    this.method143(var8, var9 + 1, 16384, -80);
                }
                if (arg1 == 2) {
                    this.method143(var8, var9, 4096, -93);
                    this.method143(var8 + 1, var9, 65536, -111);
                }
                if (arg1 == 3) {
                    this.method143(var8, var9, 16384, -114);
                    this.method143(var8, var9 - 1, 1024, -109);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg1 == 0) {
                    this.method143(var8, var9, 512, -115);
                    this.method143(var8 - 1, var9 + 1, 8192, -124);
                }
                if (arg1 == 1) {
                    this.method143(var8, var9, 2048, -64);
                    this.method143(var8 + 1, var9 + 1, 32768, arg0 - 47);
                }
                if (arg1 == 2) {
                    this.method143(var8, var9, 8192, -110);
                    this.method143(var8 + 1, var9 + -1, 512, -52);
                }
                if (arg1 == 3) {
                    this.method143(var8, var9, 32768, arg0 - 42);
                    this.method143(var8 - 1, var9 + -1, 2048, arg0 - 124);
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    this.method143(var8, var9, 66560, arg0 - 51);
                    this.method143(var8 - 1, var9, 4096, -69);
                    this.method143(var8, var9 + 1, 16384, -113);
                }
                if (arg1 == 1) {
                    this.method143(var8, var9, 5120, -70);
                    this.method143(var8, var9 + 1, 16384, arg0 - 95);
                    this.method143(var8 + 1, var9, 65536, -74);
                }
                if (arg1 == 2) {
                    this.method143(var8, var9, 20480, -50);
                    this.method143(var8 + 1, var9, 65536, -73);
                    this.method143(var8, var9 - 1, 1024, arg0 ^ 0x66);
                }
                if (arg1 == 3) {
                    this.method143(var8, var9, 81920, -37);
                    this.method143(var8, var9 - 1, 1024, arg0 ^ 0x6F);
                    this.method143(var8 - 1, var9, 4096, -96);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method143(var8, var9, 536870912, arg0 - 56);
                this.method143(var8 - 1, var9, 33554432, -68);
            }
            if (arg1 == 1) {
                this.method143(var8, var9, 8388608, -40);
                this.method143(var8, var9 + 1, 134217728, -105);
            }
            if (arg1 == 2) {
                this.method143(var8, var9, 33554432, arg0 - 47);
                this.method143(var8 + 1, var9, 536870912, -55);
            }
            if (arg1 == 3) {
                this.method143(var8, var9, 134217728, -111);
                this.method143(var8, var9 - 1, 8388608, arg0 ^ 0x67);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method143(var8, var9, 4194304, -36);
                this.method143(var8 - 1, var9 + 1, 67108864, -70);
            }
            if (arg1 == 1) {
                this.method143(var8, var9, 16777216, -100);
                this.method143(var8 + 1, var9 - -1, 268435456, -117);
            }
            if (arg1 == 2) {
                this.method143(var8, var9, 67108864, -51);
                this.method143(var8 + 1, var9 - 1, 4194304, -73);
            }
            if (arg1 == 3) {
                this.method143(var8, var9, 268435456, -42);
                this.method143(var8 - 1, var9 + -1, 16777216, -49);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method143(var8, var9, 545259520, -30);
            this.method143(var8 - 1, var9, 33554432, arg0 ^ 0x20);
            this.method143(var8, var9 + 1, 134217728, -48);
        }
        if (arg1 == 1) {
            this.method143(var8, var9, 41943040, -94);
            this.method143(var8, var9 + 1, 134217728, -101);
            this.method143(var8 + 1, var9, 536870912, arg0 - 41);
        }
        if (arg1 == 2) {
            this.method143(var8, var9, 167772160, -31);
            this.method143(var8 + 1, var9, 536870912, -34);
            this.method143(var8, var9 - 1, 8388608, -122);
        }
        if (arg1 == 3) {
            this.method143(var8, var9, 671088640, -48);
            this.method143(var8, var9 - 1, 8388608, -96);
            this.method143(var8 - 1, var9, 33554432, -42);
            return;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIIIIIIIII)Z")
    public final boolean method136(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field274++;
        if (!arg0) {
            this.field275 = null;
        }
        int var11 = arg1 + arg4;
        int var12 = arg6 + arg9;
        int var13 = arg2 + arg7;
        int var14 = arg3 + arg8;
        if (arg1 == var13 && (arg5 & 0x2) == 0) {
            int var15 = arg6 > arg8 ? arg6 : arg8;
            int var16 = var12 < var14 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field275[var13 - this.field259 - 1][var15 - this.field258] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg7 == var11 && (arg5 & 0x8) == 0) {
            int var17 = arg8 >= arg6 ? arg8 : arg6;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field275[arg7 - this.field259][var17 - this.field258] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg5 & 0x1) == 0) {
            int var19 = arg7 < arg1 ? arg1 : arg7;
            int var20 = var11 < var13 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field275[var19 - this.field259][var14 - this.field258 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg8 == var12 && (arg5 & 0x4) == 0) {
            int var21 = arg1 <= arg7 ? arg7 : arg1;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field275[var21 - this.field259][arg8 - this.field258] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BIIIIIII)Z")
    public final boolean method137(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -105) {
            this.method131(-92, 91, -20);
        }
        field277++;
        if (arg2 == 1) {
            if (arg3 == arg7 && arg5 == arg6) {
                return true;
            }
        } else if (arg3 >= arg7 && (arg7 + arg2 - 1) >= arg3 && arg5 >= arg5 && (arg5 + arg2 - 1) >= arg5) {
            return true;
        }
        int var9 = arg7 - this.field259;
        int var10 = arg3 - this.field259;
        int var11 = arg5 - this.field258;
        int var12 = arg6 - this.field258;
        if (arg2 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field275[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field275[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field275[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field275[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field275[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field275[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field275[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field275[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 == var10 && (var11 + 1) == var12 && (this.field275[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var11 - 1) == var12 && (this.field275[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field275[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var12 && (this.field275[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg2 - 1;
            int var14 = var12 + arg2 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var10 + 1 == var9 && var12 <= var11 && var14 >= var11 && (this.field275[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var11 - arg2 == var12 && (this.field275[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 - arg2 == var9 && var12 <= var11 && var14 >= var11 && (this.field275[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var11 - arg2 == var12 && (this.field275[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 - arg2) == var9 && var12 <= var11 && var14 >= var11 && (this.field275[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var11 + 1 == var12 && (this.field275[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 + 1 == var9 && var11 >= var12 && var11 <= var14 && (this.field275[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var11 + 1) == var12 && (this.field275[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 <= var10 && var10 <= var13 && var11 + 1 == var12 && (this.field275[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var9 && var13 >= var10 && var11 - arg2 == var12 && (this.field275[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg2 == var9 && var11 >= var12 && var11 <= var14 && (this.field275[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 >= var12 && var14 >= var11 && (this.field275[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BIIZIZI)V")
    public final void method138(byte arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field268++;
        int var8 = 256;
        if (arg3) {
            var8 |= 0x20000;
        }
        if (arg0 >= -124) {
            return;
        }
        if (arg5) {
            var8 |= 0x40000000;
        }
        int var9 = arg4 - this.field259;
        int var10 = arg6 - this.field258;
        for (int var11 = var9; var11 < arg1 + var9; var11++) {
            if (var11 >= 0 && var11 < this.field270) {
                for (int var12 = var10; var12 < arg2 + var10; var12++) {
                    if (var12 >= 0 && this.field272 > var12) {
                        this.method134(-126, var11, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
    public final void method139(boolean arg0) {
        field273++;
        for (int var2 = 0; var2 < this.field270; var2++) {
            for (int var3 = 0; var3 < this.field272; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field270 - 5 || var3 >= (this.field272 - 5)) {
                    this.field275[var2][var3] = -1;
                } else {
                    this.field275[var2][var3] = 2097152;
                }
            }
        }
        if (!arg0) {
            this.method129(-29, -111, -72, 117, -8, -92, 13, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIZZIII)V")
    public final void method140(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field265++;
        int var9 = 256;
        if (arg1 != 3) {
            return;
        }
        if (arg4) {
            var9 |= 0x20000;
        }
        int var10 = arg7 - this.field258;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg0;
            arg0 = arg5;
            arg5 = var11;
        }
        int var12 = arg6 - this.field259;
        if (arg3) {
            var9 |= 0x40000000;
        }
        for (int var13 = var12; var13 < var12 + arg0; var13++) {
            if (var13 >= 0 && var13 < this.field270) {
                for (int var14 = var10; var14 < arg5 + var10; var14++) {
                    if (var14 >= 0 && this.field272 > var14) {
                        this.method143(var13, var14, var9, -105);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIZIIZ)V")
    public final void method141(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 != -4) {
            return;
        }
        field256++;
        int var8 = arg4 - this.field258;
        int var9 = arg2 - this.field259;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method134(-122, var9, var8, 128);
                this.method134(-128, var9 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method134(-126, var9, var8, 2);
                this.method134(-123, var9, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method134(-122, var9, var8, 8);
                this.method134(arg5 - 119, var9 - -1, var8, 128);
            }
            if (arg1 == 3) {
                this.method134(-125, var9, var8, 32);
                this.method134(-125, var9, var8 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method134(-123, var9, var8, 1);
                this.method134(-123, var9 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method134(-126, var9, var8, 4);
                this.method134(-122, var9 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method134(-122, var9, var8, 16);
                this.method134(arg5 - 122, var9 + 1, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method134(-124, var9, var8, 64);
                this.method134(arg5 ^ 0x7D, var9 - 1, var8 + -1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method134(arg5 - 123, var9, var8, 130);
                this.method134(-125, var9 - 1, var8, 8);
                this.method134(-124, var9, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method134(-127, var9, var8, 10);
                this.method134(-126, var9, var8 + 1, 32);
                this.method134(-127, var9 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method134(-127, var9, var8, 40);
                this.method134(arg5 - 121, var9 + 1, var8, 128);
                this.method134(arg5 ^ 0x7A, var9, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method134(-124, var9, var8, 160);
                this.method134(-128, var9, var8 - 1, 2);
                this.method134(-128, var9 - 1, var8, 8);
            }
        }
        if (arg6) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method134(arg5 ^ 0x7E, var9, var8, 65536);
                    this.method134(arg5 - 123, var9 - 1, var8, 4096);
                }
                if (arg1 == 1) {
                    this.method134(-122, var9, var8, 1024);
                    this.method134(-126, var9, var8 + 1, 16384);
                }
                if (arg1 == 2) {
                    this.method134(-127, var9, var8, 4096);
                    this.method134(-123, var9 + 1, var8, 65536);
                }
                if (arg1 == 3) {
                    this.method134(arg5 - 121, var9, var8, 16384);
                    this.method134(-125, var9, var8 - 1, 1024);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method134(-126, var9, var8, 512);
                    this.method134(arg5 ^ 0x7D, var9 - 1, var8 + 1, 8192);
                }
                if (arg1 == 1) {
                    this.method134(-124, var9, var8, 2048);
                    this.method134(-125, var9 + 1, var8 - -1, 32768);
                }
                if (arg1 == 2) {
                    this.method134(-126, var9, var8, 8192);
                    this.method134(-122, var9 + 1, var8 + -1, 512);
                }
                if (arg1 == 3) {
                    this.method134(arg5 - 122, var9, var8, 32768);
                    this.method134(-128, var9 - 1, var8 + -1, 2048);
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    this.method134(-127, var9, var8, 66560);
                    this.method134(-123, var9 - 1, var8, 4096);
                    this.method134(arg5 ^ 0x79, var9, var8 + 1, 16384);
                }
                if (arg1 == 1) {
                    this.method134(-123, var9, var8, 5120);
                    this.method134(-122, var9, var8 + 1, 16384);
                    this.method134(arg5 ^ 0x7D, var9 + 1, var8, 65536);
                }
                if (arg1 == 2) {
                    this.method134(arg5 - 118, var9, var8, 20480);
                    this.method134(-126, var9 + 1, var8, 65536);
                    this.method134(arg5 ^ 0x7C, var9, var8 - 1, 1024);
                }
                if (arg1 == 3) {
                    this.method134(-123, var9, var8, 81920);
                    this.method134(arg5 - 120, var9, var8 - 1, 1024);
                    this.method134(-127, var9 - 1, var8, 4096);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method134(-123, var9, var8, 536870912);
                this.method134(-128, var9 - 1, var8, 33554432);
            }
            if (arg1 == 1) {
                this.method134(arg5 ^ 0x7A, var9, var8, 8388608);
                this.method134(-123, var9, var8 + 1, 134217728);
            }
            if (arg1 == 2) {
                this.method134(-123, var9, var8, 33554432);
                this.method134(-122, var9 + 1, var8, 536870912);
            }
            if (arg1 == 3) {
                this.method134(arg5 - 120, var9, var8, 134217728);
                this.method134(-123, var9, var8 - 1, 8388608);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method134(-123, var9, var8, 4194304);
                this.method134(-122, var9 - 1, var8 + 1, 67108864);
            }
            if (arg1 == 1) {
                this.method134(-123, var9, var8, 16777216);
                this.method134(arg5 ^ 0x7E, var9 + 1, var8 - -1, 268435456);
            }
            if (arg1 == 2) {
                this.method134(-122, var9, var8, 67108864);
                this.method134(-124, var9 + 1, var8 + -1, 4194304);
            }
            if (arg1 == 3) {
                this.method134(-124, var9, var8, 268435456);
                this.method134(-122, var9 - 1, var8 - 1, 16777216);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method134(-126, var9, var8, 545259520);
            this.method134(-127, var9 - 1, var8, 33554432);
            this.method134(-123, var9, var8 + 1, 134217728);
        }
        if (arg1 == 1) {
            this.method134(-126, var9, var8, 41943040);
            this.method134(-124, var9, var8 + 1, 134217728);
            this.method134(-126, var9 + 1, var8, 536870912);
        }
        if (arg1 == 2) {
            this.method134(-122, var9, var8, 167772160);
            this.method134(arg5 ^ 0x79, var9 + 1, var8, 536870912);
            this.method134(-125, var9, var8 - 1, 8388608);
        }
        if (arg1 == 3) {
            this.method134(-127, var9, var8, 671088640);
            this.method134(-123, var9, var8 - 1, 8388608);
            this.method134(-127, var9 - 1, var8, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(III)V")
    public final void method142(int arg0, int arg1, int arg2) {
        if (arg2 != 11677) {
            this.method137((byte) 93, -106, -26, 105, 69, 68, -58, -3);
        }
        field264++;
        int var4 = arg1 - this.field259;
        int var5 = arg0 - this.field258;
        this.field275[var4][var5] = class51.method379(this.field275[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIII)V")
    private final void method143(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -29) {
            this.field272 = -87;
        }
        this.field275[arg0][arg1] = class500.method3013(this.field275[arg0][arg1], ~arg2);
        field257++;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static void method144(byte arg0) {
        field276 = null;
        if (arg0 != 68) {
            field269 = 72;
        }
    }
}
