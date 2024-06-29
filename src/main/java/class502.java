import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class502 {

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
    public int field6935;

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
    public int field6941;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "I")
    public int field6948;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!oga", name = "t", descriptor = "I")
    public int field6954;

    @OriginalMember(owner = "client!oga", name = "u", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!oga", name = "v", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!oga", name = "x", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!oga", name = "w", descriptor = "[[I")
    public int[][] field6957;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)V", line = 4)
    public final void method2904(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field6941;
        field6958++;
        int var5 = arg0 - this.field6935;
        this.field6957[var4][var5] = class213.method1409(this.field6957[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(III)V", line = 17)
    public final void method2905(int arg0, int arg1, int arg2) {
        field6945++;
        int var4 = arg0 - this.field6935;
        int var5 = arg2 - this.field6941;
        this.field6957[var5][var4] = class213.method1409(this.field6957[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIIIIII)Z", line = 30)
    public final boolean method2906(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6940++;
        int var11 = arg1 + arg7;
        int var12 = arg6 + arg2;
        if (arg4 != -1) {
            method2916(null, -93);
        }
        int var13 = arg0 + arg3;
        int var14 = arg5 + arg9;
        if (arg1 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg5 >= arg6 ? arg5 : arg6;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field6957[var13 - this.field6941 - 1][var15 - this.field6935] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg0 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg5 >= arg6 ? arg5 : arg6;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field6957[arg0 - this.field6941][var17 - this.field6935] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg0 >= arg1 ? arg0 : arg1;
            int var20 = var11 < var13 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field6957[var19 - this.field6941][var14 - this.field6935 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg5 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg1 <= arg0 ? arg0 : arg1;
            int var22 = var11 < var13 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field6957[var21 - this.field6941][arg5 - this.field6935] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIBIIIII)Z", line = 122)
    public final boolean method2907(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6950++;
        if (arg5 == 1) {
            if (arg4 == arg7 && arg1 == arg3) {
                return true;
            }
        } else if (arg7 <= arg4 && (arg7 + arg5 - 1) >= arg4 && arg1 <= arg1 && (arg5 + arg1 - 1) >= arg1) {
            return true;
        }
        int var9 = arg7 - this.field6941;
        int var10 = arg4 - this.field6941;
        int var11 = arg1 - this.field6935;
        int var12 = arg3 - this.field6935;
        int var13 = 61 % ((77 - arg2) / 44);
        if (arg5 == 1) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field6957[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field6957[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 == var10 && (var11 + 1) == var12) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field6957[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field6957[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field6957[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field6957[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 == var10 && var11 - 1 == var12) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field6957[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field6957[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field6957[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field6957[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field6957[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field6957[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field6957[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field6957[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field6957[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field6957[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 == var10 && var11 + 1 == var12 && (this.field6957[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var12 && (this.field6957[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field6957[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var12 && (this.field6957[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg5 + var9 - 1;
            int var15 = arg5 + var12 - 1;
            if (arg0 == 0) {
                if (arg6 == 0) {
                    if (var10 - arg5 == var9 && var11 >= var12 && var15 >= var11) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var14 && var11 + 1 == var12 && (this.field6957[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var14 && (var11 - arg5) == var12 && (this.field6957[var10][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 <= var10 && var14 >= var10 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var10 - arg5) == var9 && var12 <= var11 && var11 <= var15 && (this.field6957[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 <= var11 && var15 >= var11 && (this.field6957[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 + 1 == var9 && var12 <= var11 && var15 >= var11) {
                        return true;
                    }
                    if (var10 >= var9 && var14 >= var10 && (var11 + 1) == var12 && (this.field6957[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var14 && var11 - arg5 == var12 && (this.field6957[var10][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 <= var10 && var14 >= var10 && var11 - arg5 == var12) {
                        return true;
                    }
                    if ((var10 - arg5) == var9 && var11 >= var12 && var15 >= var11 && (this.field6957[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 >= var12 && var15 >= var11 && (this.field6957[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    if ((var10 - arg5) == var9 && var12 <= var11 && var15 >= var11) {
                        return true;
                    }
                    if (var10 >= var9 && var14 >= var10 && var11 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 >= var12 && var11 <= var15 && (this.field6957[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var14 >= var10 && (var11 - arg5) == var12 && (this.field6957[var10][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var10 - arg5) == var9 && var11 >= var12 && var11 <= var15 && (this.field6957[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var14 >= var10 && (var11 + 1) == var12) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 >= var12 && var11 <= var15) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var14 && var11 - arg5 == var12 && (this.field6957[var10][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 - arg5) == var9 && var11 >= var12 && var11 <= var15 && (this.field6957[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var14 && (var11 + 1) == var12 && (this.field6957[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 >= var12 && var11 <= var15) {
                        return true;
                    }
                    if (var9 <= var10 && var14 >= var10 && var11 - arg5 == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 - arg5 == var9 && var11 >= var12 && var11 <= var15) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var14 && (var11 + 1) == var12 && (this.field6957[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 >= var12 && var15 >= var11 && (this.field6957[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var14 >= var10 && var11 - arg5 == var12) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 <= var10 && var14 >= var10 && var11 + 1 == var12 && (this.field6957[var10][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var10 && var10 <= var14 && (var11 - arg5) == var12 && (this.field6957[var10][var15] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg5) == var9 && var11 >= var12 && var15 >= var11 && (this.field6957[var14][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 >= var12 && var11 <= var15 && (this.field6957[var9][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IZIIZII)V", line = 491)
    public final void method2908(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field6955++;
        if (arg3 != -15874) {
            field6936 = 52;
        }
        int var8 = arg0 - this.field6935;
        int var9 = arg6 - this.field6941;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method2914(arg3 ^ 0xFFFFC1F6, 128, var9, var8);
                this.method2914(8, 8, var9 - 1, var8);
            }
            if (arg5 == 1) {
                this.method2914(arg3 ^ 0xFFFFC1F6, 2, var9, var8);
                this.method2914(arg3 + 15882, 32, var9, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2914(8, 8, var9, var8);
                this.method2914(8, 128, var9 + 1, var8);
            }
            if (arg5 == 3) {
                this.method2914(8, 32, var9, var8);
                this.method2914(8, 2, var9, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method2914(8, 1, var9, var8);
                this.method2914(8, 16, var9 - 1, var8 + 1);
            }
            if (arg5 == 1) {
                this.method2914(8, 4, var9, var8);
                this.method2914(8, 64, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2914(8, 16, var9, var8);
                this.method2914(8, 1, var9 + 1, var8 + -1);
            }
            if (arg5 == 3) {
                this.method2914(8, 64, var9, var8);
                this.method2914(8, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method2914(8, 130, var9, var8);
                this.method2914(arg3 + 15882, 8, var9 - 1, var8);
                this.method2914(8, 32, var9, var8 + 1);
            }
            if (arg5 == 1) {
                this.method2914(8, 10, var9, var8);
                this.method2914(8, 32, var9, var8 + 1);
                this.method2914(8, 128, var9 + 1, var8);
            }
            if (arg5 == 2) {
                this.method2914(8, 40, var9, var8);
                this.method2914(8, 128, var9 + 1, var8);
                this.method2914(8, 2, var9, var8 - 1);
            }
            if (arg5 == 3) {
                this.method2914(8, 160, var9, var8);
                this.method2914(8, 2, var9, var8 - 1);
                this.method2914(8, 8, var9 - 1, var8);
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method2914(8, 65536, var9, var8);
                    this.method2914(8, 4096, var9 - 1, var8);
                }
                if (arg5 == 1) {
                    this.method2914(8, 1024, var9, var8);
                    this.method2914(8, 16384, var9, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2914(8, 4096, var9, var8);
                    this.method2914(8, 65536, var9 + 1, var8);
                }
                if (arg5 == 3) {
                    this.method2914(8, 16384, var9, var8);
                    this.method2914(8, 1024, var9, var8 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method2914(8, 512, var9, var8);
                    this.method2914(arg3 + 15882, 8192, var9 - 1, var8 - -1);
                }
                if (arg5 == 1) {
                    this.method2914(8, 2048, var9, var8);
                    this.method2914(8, 32768, var9 + 1, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2914(8, 8192, var9, var8);
                    this.method2914(8, 512, var9 + 1, var8 + -1);
                }
                if (arg5 == 3) {
                    this.method2914(arg3 + 15882, 32768, var9, var8);
                    this.method2914(8, 2048, var9 - 1, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method2914(arg3 + 15882, 66560, var9, var8);
                    this.method2914(8, 4096, var9 - 1, var8);
                    this.method2914(arg3 ^ 0xFFFFC1F6, 16384, var9, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method2914(arg3 ^ 0xFFFFC1F6, 5120, var9, var8);
                    this.method2914(8, 16384, var9, var8 + 1);
                    this.method2914(arg3 + 15882, 65536, var9 + 1, var8);
                }
                if (arg5 == 2) {
                    this.method2914(8, 20480, var9, var8);
                    this.method2914(8, 65536, var9 + 1, var8);
                    this.method2914(arg3 + 15882, 1024, var9, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method2914(8, 81920, var9, var8);
                    this.method2914(8, 1024, var9, var8 - 1);
                    this.method2914(8, 4096, var9 - 1, var8);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method2914(8, 536870912, var9, var8);
                this.method2914(arg3 + 15882, 33554432, var9 - 1, var8);
            }
            if (arg5 == 1) {
                this.method2914(8, 8388608, var9, var8);
                this.method2914(8, 134217728, var9, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2914(8, 33554432, var9, var8);
                this.method2914(8, 536870912, var9 + 1, var8);
            }
            if (arg5 == 3) {
                this.method2914(8, 134217728, var9, var8);
                this.method2914(8, 8388608, var9, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method2914(8, 4194304, var9, var8);
                this.method2914(8, 67108864, var9 - 1, var8 - -1);
            }
            if (arg5 == 1) {
                this.method2914(8, 16777216, var9, var8);
                this.method2914(8, 268435456, var9 + 1, var8 - -1);
            }
            if (arg5 == 2) {
                this.method2914(8, 67108864, var9, var8);
                this.method2914(8, 4194304, var9 + 1, var8 + -1);
            }
            if (arg5 == 3) {
                this.method2914(arg3 + 15882, 268435456, var9, var8);
                this.method2914(8, 16777216, var9 - 1, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2914(8, 545259520, var9, var8);
            this.method2914(8, 33554432, var9 - 1, var8);
            this.method2914(8, 134217728, var9, var8 + 1);
        }
        if (arg5 == 1) {
            this.method2914(8, 41943040, var9, var8);
            this.method2914(arg3 ^ 0xFFFFC1F6, 134217728, var9, var8 + 1);
            this.method2914(arg3 ^ 0xFFFFC1F6, 536870912, var9 + 1, var8);
        }
        if (arg5 == 2) {
            this.method2914(8, 167772160, var9, var8);
            this.method2914(8, 536870912, var9 + 1, var8);
            this.method2914(8, 8388608, var9, var8 - 1);
        }
        if (arg5 == 3) {
            this.method2914(arg3 ^ 0xFFFFC1F6, 671088640, var9, var8);
            this.method2914(8, 8388608, var9, var8 - 1);
            this.method2914(8, 33554432, var9 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIB)V", line = 800)
    public final void method2909(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field6935;
        int var5 = arg0 - this.field6941;
        if (arg2 <= -30) {
            field6942++;
            this.field6957[var5][var4] = class440.method2643(this.field6957[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZIIIIZI)V", line = 826)
    public final void method2910(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field6939++;
        int var8 = 256;
        if (arg6 != -1) {
            this.field6941 = 0;
        }
        if (arg5) {
            var8 |= 0x20000;
        }
        int var9 = arg3 - this.field6941;
        if (arg0) {
            var8 |= 0x40000000;
        }
        int var10 = arg1 - this.field6935;
        for (int var11 = var9; var11 < (arg4 + var9); var11++) {
            if (var11 >= 0 && var11 < this.field6954) {
                for (int var12 = var10; var12 < (arg2 + var10); var12++) {
                    if (var12 >= 0 && this.field6948 > var12) {
                        this.method2914(8, var8, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BIIIZIZI)V", line = 870)
    public final void method2911(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        field6956++;
        int var9 = 256;
        if (arg6) {
            var9 |= 0x20000;
        }
        int var10 = arg7 - this.field6941;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg1;
            arg1 = arg2;
            arg2 = var11;
        }
        if (arg4) {
            var9 |= 0x40000000;
        }
        if (arg0 <= 105) {
            this.field6954 = -35;
        }
        int var12 = arg3 - this.field6935;
        for (int var13 = var10; var13 < (arg1 + var10); var13++) {
            if (var13 >= 0 && this.field6954 > var13) {
                for (int var14 = var12; var14 < (var12 + arg2); var14++) {
                    if (var14 >= 0 && var14 < this.field6948) {
                        this.method2918(var13, 126, var14, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIIIII)Z", line = 926)
    public final boolean method2912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 > -9) {
            this.method2904(-67, -89, 39);
        }
        field6953++;
        if (arg8 > 1) {
            return class374.method2322(arg1, arg7, arg4, -1, arg2, arg5, arg8, arg8, arg0) ? true : this.method2906(arg4, arg5, arg8, arg1, -1, arg7, arg0, arg8, arg3, arg2);
        }
        int var10 = arg1 + arg4 - 1;
        int var11 = arg7 + arg2 - 1;
        if (arg5 >= arg4 && var10 >= arg5 && arg7 <= arg0 && arg0 <= var11) {
            return true;
        } else if (arg4 - 1 == arg5 && arg7 <= arg0 && var11 >= arg0 && (this.field6957[arg5 - this.field6941][arg0 - this.field6935] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg5 && arg0 >= arg7 && var11 >= arg0 && (this.field6957[arg5 - this.field6941][arg0 - this.field6935] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg0 && arg4 <= arg5 && arg5 <= var10 && (this.field6957[arg5 - this.field6941][arg0 - this.field6935] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg0 && arg5 >= arg4 && arg5 <= var10 && (this.field6957[arg5 - this.field6941][arg0 - this.field6935] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V", line = 966)
    public final void method2913(int arg0) {
        field6951++;
        if (arg0 != 2097152) {
            return;
        }
        for (int var2 = 0; var2 < this.field6954; var2++) {
            for (int var3 = 0; var3 < this.field6948; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field6954 - 5) <= var2 || var3 >= (this.field6948 - 5)) {
                    this.field6957[var2][var3] = -1;
                } else {
                    this.field6957[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIII)V", line = 997)
    private final void method2914(int arg0, int arg1, int arg2, int arg3) {
        field6944++;
        if (arg0 != 8) {
            this.field6941 = -57;
        }
        this.field6957[arg2][arg3] = class213.method1409(this.field6957[arg2][arg3], arg1);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIIIB)Z", line = 1011)
    public final boolean method2915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field6952++;
        if (arg6 == 1) {
            if (arg1 == arg2 && arg4 == arg5) {
                return true;
            }
        } else if (arg1 >= arg2 && arg2 + arg6 - 1 >= arg1 && arg5 <= arg5 && arg5 <= arg5 + arg6 - 1) {
            return true;
        }
        int var9 = arg5 - this.field6935;
        int var10 = arg1 - this.field6941;
        if (arg7 > -52) {
            this.method2905(54, 21, -118);
        }
        int var11 = arg2 - this.field6941;
        int var12 = arg4 - this.field6935;
        if (arg6 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var10 + 1 == var11 && var9 == var12 && (this.field6957[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field6957[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field6957[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field6957[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field6957[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field6957[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 + 1 == var11 && var9 == var12 && (this.field6957[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field6957[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 == var11 && var9 + 1 == var12 && (this.field6957[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field6957[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field6957[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field6957[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg6 - 1;
            int var14 = arg6 + var12 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var10 + 1) == var11 && var12 <= var9 && var14 >= var9 && (this.field6957[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 - arg6) == var12 && (this.field6957[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - arg6 == var11 && var9 >= var12 && var9 <= var14 && (this.field6957[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var9 - arg6 == var12 && (this.field6957[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - arg6) == var11 && var12 <= var9 && var14 >= var9 && (this.field6957[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 + 1) == var12 && (this.field6957[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 + 1 == var11 && var9 >= var12 && var9 <= var14 && (this.field6957[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12 && (this.field6957[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 >= var11 && var10 <= var13 && var9 + 1 == var12 && (this.field6957[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var10 && var10 <= var13 && var9 - arg6 == var12 && (this.field6957[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg6) == var11 && var9 >= var12 && var14 >= var9 && (this.field6957[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var12 <= var9 && var9 <= var14 && (this.field6957[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "([BI)Z", line = 1201)
    public static final boolean method2916(byte[] arg0, int arg1) {
        field6943++;
        class376 var2 = new class376(arg0);
        int var3 = var2.method2398(-1372747256);
        if (~var3 != arg1) {
            return false;
        }
        boolean var4 = var2.method2398(arg1 ^ 0x51D275F5) == 1;
        if (var4) {
            class574.method3213(0, var2);
        }
        class230.method1507(var2, 65535);
        return true;
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(III)V", line = 1225)
    public final void method2917(int arg0, int arg1, int arg2) {
        field6947++;
        int var4 = arg2 - this.field6941;
        if (arg1 <= 14) {
            this.method2919(95, 127, -82, (byte) 125, false, 84, true);
        }
        int var5 = arg0 - this.field6935;
        this.field6957[var4][var5] = class440.method2643(this.field6957[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(IIII)V", line = 1241)
    private final void method2918(int arg0, int arg1, int arg2, int arg3) {
        field6937++;
        if (arg1 <= 107) {
            this.method2906(-118, -23, -3, 23, -2, 6, 59, -38, 66, 13);
        }
        this.field6957[arg0][arg2] = class440.method2643(this.field6957[arg0][arg2], ~arg3);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIBZIZ)V", line = 1255)
    public final void method2919(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field6941;
        int var9 = arg5 - this.field6935;
        field6946++;
        if (arg3 != -84) {
            this.field6948 = 106;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method2918(var8, 127, var9, 128);
                this.method2918(var8 - 1, 112, var9, 8);
            }
            if (arg0 == 1) {
                this.method2918(var8, 123, var9, 2);
                this.method2918(var8, 123, var9 + 1, 32);
            }
            if (arg0 == 2) {
                this.method2918(var8, arg3 ^ 0xFFFFFFD6, var9, 8);
                this.method2918(var8 + 1, 121, var9, 128);
            }
            if (arg0 == 3) {
                this.method2918(var8, arg3 ^ 0xFFFFFFD4, var9, 32);
                this.method2918(var8, 118, var9 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method2918(var8, 110, var9, 1);
                this.method2918(var8 - 1, 121, var9 + 1, 16);
            }
            if (arg0 == 1) {
                this.method2918(var8, 123, var9, 4);
                this.method2918(var8 + 1, 126, var9 + 1, 64);
            }
            if (arg0 == 2) {
                this.method2918(var8, 119, var9, 16);
                this.method2918(var8 + 1, 110, var9 - 1, 1);
            }
            if (arg0 == 3) {
                this.method2918(var8, 123, var9, 64);
                this.method2918(var8 - 1, 120, var9 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method2918(var8, 118, var9, 130);
                this.method2918(var8 - 1, 124, var9, 8);
                this.method2918(var8, 113, var9 + 1, 32);
            }
            if (arg0 == 1) {
                this.method2918(var8, 119, var9, 10);
                this.method2918(var8, 114, var9 + 1, 32);
                this.method2918(var8 + 1, 125, var9, 128);
            }
            if (arg0 == 2) {
                this.method2918(var8, 110, var9, 40);
                this.method2918(var8 + 1, arg3 + 207, var9, 128);
                this.method2918(var8, 121, var9 - 1, 2);
            }
            if (arg0 == 3) {
                this.method2918(var8, 120, var9, 160);
                this.method2918(var8, 108, var9 - 1, 2);
                this.method2918(var8 - 1, arg3 ^ 0xFFFFFFC1, var9, 8);
            }
        }
        if (arg6) {
            if (arg1 == 0) {
                if (arg0 == 0) {
                    this.method2918(var8, arg3 ^ 0xFFFFFFC3, var9, 65536);
                    this.method2918(var8 - 1, arg3 ^ 0xFFFFFFD7, var9, 4096);
                }
                if (arg0 == 1) {
                    this.method2918(var8, 122, var9, 1024);
                    this.method2918(var8, 120, var9 + 1, 16384);
                }
                if (arg0 == 2) {
                    this.method2918(var8, arg3 + 193, var9, 4096);
                    this.method2918(var8 + 1, 125, var9, 65536);
                }
                if (arg0 == 3) {
                    this.method2918(var8, 118, var9, 16384);
                    this.method2918(var8, 119, var9 - 1, 1024);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg0 == 0) {
                    this.method2918(var8, 117, var9, 512);
                    this.method2918(var8 - 1, 123, var9 + 1, 8192);
                }
                if (arg0 == 1) {
                    this.method2918(var8, arg3 ^ 0xFFFFFFDE, var9, 2048);
                    this.method2918(var8 + 1, 121, var9 + 1, 32768);
                }
                if (arg0 == 2) {
                    this.method2918(var8, arg3 + 207, var9, 8192);
                    this.method2918(var8 + 1, 110, var9 - 1, 512);
                }
                if (arg0 == 3) {
                    this.method2918(var8, 122, var9, 32768);
                    this.method2918(var8 - 1, 112, var9 - 1, 2048);
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    this.method2918(var8, 120, var9, 66560);
                    this.method2918(var8 - 1, arg3 + 192, var9, 4096);
                    this.method2918(var8, 123, var9 + 1, 16384);
                }
                if (arg0 == 1) {
                    this.method2918(var8, 118, var9, 5120);
                    this.method2918(var8, arg3 ^ 0xFFFFFFDC, var9 + 1, 16384);
                    this.method2918(var8 + 1, arg3 ^ 0xFFFFFFDA, var9, 65536);
                }
                if (arg0 == 2) {
                    this.method2918(var8, 121, var9, 20480);
                    this.method2918(var8 + 1, 125, var9, 65536);
                    this.method2918(var8, 108, var9 - 1, 1024);
                }
                if (arg0 == 3) {
                    this.method2918(var8, 121, var9, 81920);
                    this.method2918(var8, arg3 + 207, var9 + -1, 1024);
                    this.method2918(var8 - 1, 112, var9, 4096);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method2918(var8, 124, var9, 536870912);
                this.method2918(var8 - 1, 108, var9, 33554432);
            }
            if (arg0 == 1) {
                this.method2918(var8, 120, var9, 8388608);
                this.method2918(var8, arg3 + 209, var9 + 1, 134217728);
            }
            if (arg0 == 2) {
                this.method2918(var8, 111, var9, 33554432);
                this.method2918(var8 + 1, 117, var9, 536870912);
            }
            if (arg0 == 3) {
                this.method2918(var8, 124, var9, 134217728);
                this.method2918(var8, arg3 ^ 0xFFFFFFDF, var9 - 1, 8388608);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method2918(var8, 127, var9, 4194304);
                this.method2918(var8 - 1, arg3 + 197, var9 + 1, 67108864);
            }
            if (arg0 == 1) {
                this.method2918(var8, 109, var9, 16777216);
                this.method2918(var8 + 1, 115, var9 + 1, 268435456);
            }
            if (arg0 == 2) {
                this.method2918(var8, 115, var9, 67108864);
                this.method2918(var8 + 1, 122, var9 - 1, 4194304);
            }
            if (arg0 == 3) {
                this.method2918(var8, 123, var9, 268435456);
                this.method2918(var8 - 1, 115, var9 - 1, 16777216);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2918(var8, 114, var9, 545259520);
            this.method2918(var8 - 1, 122, var9, 33554432);
            this.method2918(var8, 115, var9 + 1, 134217728);
        }
        if (arg0 == 1) {
            this.method2918(var8, 118, var9, 41943040);
            this.method2918(var8, 108, var9 + 1, 134217728);
            this.method2918(var8 + 1, arg3 + 203, var9, 536870912);
        }
        if (arg0 == 2) {
            this.method2918(var8, 127, var9, 167772160);
            this.method2918(var8 + 1, 122, var9, 536870912);
            this.method2918(var8, arg3 ^ 0xFFFFFFDA, var9 - 1, 8388608);
        }
        if (arg0 == 3) {
            this.method2918(var8, arg3 ^ 0xFFFFFFD1, var9, 671088640);
            this.method2918(var8, 115, var9 - 1, 8388608);
            this.method2918(var8 - 1, arg3 + 192, var9, 33554432);
            return;
        }
    }
}
