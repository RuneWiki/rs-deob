import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class277 {

    @OriginalMember(owner = "client!le", name = "e", descriptor = "F")
    public static float field3491 = 1.0F;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3499 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field3513 = 1;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public int field3489;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public int field3504;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lrd;")
    public static class305 field3494;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "[I")
    public static int[] field3512;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[[I")
    public int[][] field3493;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZIIZI)V")
    public final void method1566(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg0 - this.field3507;
        int var9 = arg3 - this.field3489;
        field3503++;
        if (arg6 == 0) {
            if (arg1 == 0) {
                this.method1582((byte) -81, var8, var9, 128);
                this.method1582((byte) -81, var8 - 1, var9, 8);
            }
            if (arg1 == 1) {
                this.method1582((byte) -81, var8, var9, 2);
                this.method1582((byte) -81, var8, var9 + 1, 32);
            }
            if (arg1 == 2) {
                this.method1582((byte) -81, var8, var9, 8);
                this.method1582((byte) -81, var8 + 1, var9, 128);
            }
            if (arg1 == 3) {
                this.method1582((byte) -81, var8, var9, 32);
                this.method1582((byte) -81, var8, var9 - 1, 2);
            }
        }
        if (arg4 >= -94) {
            field3494 = null;
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg1 == 0) {
                this.method1582((byte) -81, var8, var9, 1);
                this.method1582((byte) -81, var8 - 1, var9 + 1, 16);
            }
            if (arg1 == 1) {
                this.method1582((byte) -81, var8, var9, 4);
                this.method1582((byte) -81, var8 + 1, var9 + 1, 64);
            }
            if (arg1 == 2) {
                this.method1582((byte) -81, var8, var9, 16);
                this.method1582((byte) -81, var8 + 1, var9 - 1, 1);
            }
            if (arg1 == 3) {
                this.method1582((byte) -81, var8, var9, 64);
                this.method1582((byte) -81, var8 - 1, var9 + -1, 4);
            }
        }
        if (arg6 == 2) {
            if (arg1 == 0) {
                this.method1582((byte) -81, var8, var9, 130);
                this.method1582((byte) -81, var8 - 1, var9, 8);
                this.method1582((byte) -81, var8, var9 + 1, 32);
            }
            if (arg1 == 1) {
                this.method1582((byte) -81, var8, var9, 10);
                this.method1582((byte) -81, var8, var9 + 1, 32);
                this.method1582((byte) -81, var8 + 1, var9, 128);
            }
            if (arg1 == 2) {
                this.method1582((byte) -81, var8, var9, 40);
                this.method1582((byte) -81, var8 + 1, var9, 128);
                this.method1582((byte) -81, var8, var9 - 1, 2);
            }
            if (arg1 == 3) {
                this.method1582((byte) -81, var8, var9, 160);
                this.method1582((byte) -81, var8, var9 - 1, 2);
                this.method1582((byte) -81, var8 - 1, var9, 8);
            }
        }
        if (arg5) {
            if (arg6 == 0) {
                if (arg1 == 0) {
                    this.method1582((byte) -81, var8, var9, 65536);
                    this.method1582((byte) -81, var8 - 1, var9, 4096);
                }
                if (arg1 == 1) {
                    this.method1582((byte) -81, var8, var9, 1024);
                    this.method1582((byte) -81, var8, var9 + 1, 16384);
                }
                if (arg1 == 2) {
                    this.method1582((byte) -81, var8, var9, 4096);
                    this.method1582((byte) -81, var8 + 1, var9, 65536);
                }
                if (arg1 == 3) {
                    this.method1582((byte) -81, var8, var9, 16384);
                    this.method1582((byte) -81, var8, var9 - 1, 1024);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg1 == 0) {
                    this.method1582((byte) -81, var8, var9, 512);
                    this.method1582((byte) -81, var8 - 1, var9 + 1, 8192);
                }
                if (arg1 == 1) {
                    this.method1582((byte) -81, var8, var9, 2048);
                    this.method1582((byte) -81, var8 + 1, var9 + 1, 32768);
                }
                if (arg1 == 2) {
                    this.method1582((byte) -81, var8, var9, 8192);
                    this.method1582((byte) -81, var8 + 1, var9 + -1, 512);
                }
                if (arg1 == 3) {
                    this.method1582((byte) -81, var8, var9, 32768);
                    this.method1582((byte) -81, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg6 == 2) {
                if (arg1 == 0) {
                    this.method1582((byte) -81, var8, var9, 66560);
                    this.method1582((byte) -81, var8 - 1, var9, 4096);
                    this.method1582((byte) -81, var8, var9 + 1, 16384);
                }
                if (arg1 == 1) {
                    this.method1582((byte) -81, var8, var9, 5120);
                    this.method1582((byte) -81, var8, var9 + 1, 16384);
                    this.method1582((byte) -81, var8 + 1, var9, 65536);
                }
                if (arg1 == 2) {
                    this.method1582((byte) -81, var8, var9, 20480);
                    this.method1582((byte) -81, var8 + 1, var9, 65536);
                    this.method1582((byte) -81, var8, var9 - 1, 1024);
                }
                if (arg1 == 3) {
                    this.method1582((byte) -81, var8, var9, 81920);
                    this.method1582((byte) -81, var8, var9 - 1, 1024);
                    this.method1582((byte) -81, var8 - 1, var9, 4096);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg6 == 0) {
            if (arg1 == 0) {
                this.method1582((byte) -81, var8, var9, 536870912);
                this.method1582((byte) -81, var8 - 1, var9, 33554432);
            }
            if (arg1 == 1) {
                this.method1582((byte) -81, var8, var9, 8388608);
                this.method1582((byte) -81, var8, var9 + 1, 134217728);
            }
            if (arg1 == 2) {
                this.method1582((byte) -81, var8, var9, 33554432);
                this.method1582((byte) -81, var8 + 1, var9, 536870912);
            }
            if (arg1 == 3) {
                this.method1582((byte) -81, var8, var9, 134217728);
                this.method1582((byte) -81, var8, var9 - 1, 8388608);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg1 == 0) {
                this.method1582((byte) -81, var8, var9, 4194304);
                this.method1582((byte) -81, var8 - 1, var9 - -1, 67108864);
            }
            if (arg1 == 1) {
                this.method1582((byte) -81, var8, var9, 16777216);
                this.method1582((byte) -81, var8 + 1, var9 + 1, 268435456);
            }
            if (arg1 == 2) {
                this.method1582((byte) -81, var8, var9, 67108864);
                this.method1582((byte) -81, var8 + 1, var9 + -1, 4194304);
            }
            if (arg1 == 3) {
                this.method1582((byte) -81, var8, var9, 268435456);
                this.method1582((byte) -81, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1582((byte) -81, var8, var9, 545259520);
            this.method1582((byte) -81, var8 - 1, var9, 33554432);
            this.method1582((byte) -81, var8, var9 + 1, 134217728);
        }
        if (arg1 == 1) {
            this.method1582((byte) -81, var8, var9, 41943040);
            this.method1582((byte) -81, var8, var9 + 1, 134217728);
            this.method1582((byte) -81, var8 + 1, var9, 536870912);
        }
        if (arg1 == 2) {
            this.method1582((byte) -81, var8, var9, 167772160);
            this.method1582((byte) -81, var8 + 1, var9, 536870912);
            this.method1582((byte) -81, var8, var9 - 1, 8388608);
        }
        if (arg1 == 3) {
            this.method1582((byte) -81, var8, var9, 671088640);
            this.method1582((byte) -81, var8, var9 - 1, 8388608);
            this.method1582((byte) -81, var8 - 1, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method1567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3508++;
        if (arg5 <= 11) {
            return true;
        }
        int var11 = arg0 + arg4;
        int var12 = arg8 + arg9;
        int var13 = arg2 + arg6;
        int var14 = arg3 + arg7;
        if (arg4 == var13 && (arg1 & 0x2) == 0) {
            int var15 = arg8 <= arg7 ? arg7 : arg8;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field3493[var13 - this.field3507 - 1][var15 - this.field3489] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg2 == var11 && (arg1 & 0x8) == 0) {
            int var17 = arg8 <= arg7 ? arg7 : arg8;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field3493[arg2 - this.field3507][var17 - this.field3489] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg8 == var14 && (arg1 & 0x1) == 0) {
            int var19 = arg2 >= arg4 ? arg2 : arg4;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field3493[var19 - this.field3507][var14 - this.field3489 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg1 & 0x4) == 0) {
            int var21 = arg4 <= arg2 ? arg2 : arg4;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field3493[var21 - this.field3507][arg7 - this.field3489] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3490++;
        if (arg1 == 1) {
            if (arg4 == arg7 && arg0 == arg6) {
                return true;
            }
        } else if (arg4 <= arg7 && arg7 <= (arg4 + arg1 - 1) && arg0 >= arg0 && (arg0 + arg1 - 1) >= arg0) {
            return true;
        }
        int var9 = arg0 - this.field3489;
        int var10 = arg7 - this.field3507;
        if (arg2 != 2) {
            method1572(-8, (byte) -76, 65);
        }
        int var11 = arg4 - this.field3507;
        int var12 = arg6 - this.field3489;
        if (arg1 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field3493[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field3493[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field3493[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field3493[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field3493[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field3493[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 + 1 == var11 && var9 == var12 && (this.field3493[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field3493[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field3493[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field3493[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field3493[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field3493[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var11 - 1;
            int var14 = var12 + arg1 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var10 + 1 == var11 && var9 >= var12 && var9 <= var14 && (this.field3493[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 - arg1 == var12 && (this.field3493[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var10 - arg1) == var11 && var12 <= var9 && var9 <= var14 && (this.field3493[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var9 - arg1 == var12 && (this.field3493[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - arg1 == var11 && var9 >= var12 && var9 <= var14 && (this.field3493[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var9 + 1 == var12 && (this.field3493[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var14 && (this.field3493[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12 && (this.field3493[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var11 <= var10 && var10 <= var13 && var9 + 1 == var12 && (this.field3493[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var10 && var13 >= var10 && var9 - arg1 == var12 && (this.field3493[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg1 == var11 && var9 >= var12 && var14 >= var9 && (this.field3493[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 >= var12 && var14 >= var9 && (this.field3493[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZIIZ)V")
    public final void method1569(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 42 / ((arg1 - 36) / 59);
        int var9 = arg2 - this.field3489;
        field3506++;
        int var10 = arg4 - this.field3507;
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method1574(-123, var9, var10, 128);
                this.method1574(-128, var9, var10 - 1, 8);
            }
            if (arg0 == 1) {
                this.method1574(-125, var9, var10, 2);
                this.method1574(-128, var9 + 1, var10, 32);
            }
            if (arg0 == 2) {
                this.method1574(-126, var9, var10, 8);
                this.method1574(-119, var9, var10 + 1, 128);
            }
            if (arg0 == 3) {
                this.method1574(-121, var9, var10, 32);
                this.method1574(-115, var9 - 1, var10, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method1574(-118, var9, var10, 1);
                this.method1574(-121, var9 + 1, var10 + -1, 16);
            }
            if (arg0 == 1) {
                this.method1574(-124, var9, var10, 4);
                this.method1574(-110, var9 + 1, var10 - -1, 64);
            }
            if (arg0 == 2) {
                this.method1574(-119, var9, var10, 16);
                this.method1574(-119, var9 - 1, var10 + 1, 1);
            }
            if (arg0 == 3) {
                this.method1574(-127, var9, var10, 64);
                this.method1574(-115, var9 - 1, var10 + -1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method1574(-116, var9, var10, 130);
                this.method1574(-121, var9, var10 - 1, 8);
                this.method1574(-125, var9 + 1, var10, 32);
            }
            if (arg0 == 1) {
                this.method1574(-110, var9, var10, 10);
                this.method1574(-128, var9 + 1, var10, 32);
                this.method1574(-115, var9, var10 + 1, 128);
            }
            if (arg0 == 2) {
                this.method1574(-121, var9, var10, 40);
                this.method1574(-118, var9, var10 + 1, 128);
                this.method1574(-112, var9 - 1, var10, 2);
            }
            if (arg0 == 3) {
                this.method1574(-111, var9, var10, 160);
                this.method1574(-128, var9 - 1, var10, 2);
                this.method1574(-112, var9, var10 - 1, 8);
            }
        }
        if (arg3) {
            if (arg5 == 0) {
                if (arg0 == 0) {
                    this.method1574(-126, var9, var10, 65536);
                    this.method1574(-122, var9, var10 - 1, 4096);
                }
                if (arg0 == 1) {
                    this.method1574(-127, var9, var10, 1024);
                    this.method1574(-111, var9 + 1, var10, 16384);
                }
                if (arg0 == 2) {
                    this.method1574(-121, var9, var10, 4096);
                    this.method1574(-117, var9, var10 + 1, 65536);
                }
                if (arg0 == 3) {
                    this.method1574(-125, var9, var10, 16384);
                    this.method1574(-124, var9 - 1, var10, 1024);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg0 == 0) {
                    this.method1574(-113, var9, var10, 512);
                    this.method1574(-111, var9 + 1, var10 - 1, 8192);
                }
                if (arg0 == 1) {
                    this.method1574(-110, var9, var10, 2048);
                    this.method1574(-123, var9 + 1, var10 + 1, 32768);
                }
                if (arg0 == 2) {
                    this.method1574(-116, var9, var10, 8192);
                    this.method1574(-119, var9 - 1, var10 - -1, 512);
                }
                if (arg0 == 3) {
                    this.method1574(-121, var9, var10, 32768);
                    this.method1574(-126, var9 - 1, var10 + -1, 2048);
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    this.method1574(-127, var9, var10, 66560);
                    this.method1574(-125, var9, var10 - 1, 4096);
                    this.method1574(-124, var9 + 1, var10, 16384);
                }
                if (arg0 == 1) {
                    this.method1574(-126, var9, var10, 5120);
                    this.method1574(-126, var9 + 1, var10, 16384);
                    this.method1574(-117, var9, var10 + 1, 65536);
                }
                if (arg0 == 2) {
                    this.method1574(-118, var9, var10, 20480);
                    this.method1574(-110, var9, var10 + 1, 65536);
                    this.method1574(-126, var9 - 1, var10, 1024);
                }
                if (arg0 == 3) {
                    this.method1574(-127, var9, var10, 81920);
                    this.method1574(-126, var9 - 1, var10, 1024);
                    this.method1574(-128, var9, var10 - 1, 4096);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method1574(-113, var9, var10, 536870912);
                this.method1574(-120, var9, var10 - 1, 33554432);
            }
            if (arg0 == 1) {
                this.method1574(-124, var9, var10, 8388608);
                this.method1574(-125, var9 + 1, var10, 134217728);
            }
            if (arg0 == 2) {
                this.method1574(-113, var9, var10, 33554432);
                this.method1574(-110, var9, var10 + 1, 536870912);
            }
            if (arg0 == 3) {
                this.method1574(-119, var9, var10, 134217728);
                this.method1574(-117, var9 - 1, var10, 8388608);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method1574(-117, var9, var10, 4194304);
                this.method1574(-121, var9 + 1, var10 + -1, 67108864);
            }
            if (arg0 == 1) {
                this.method1574(-114, var9, var10, 16777216);
                this.method1574(-110, var9 + 1, var10 - -1, 268435456);
            }
            if (arg0 == 2) {
                this.method1574(-122, var9, var10, 67108864);
                this.method1574(-120, var9 - 1, var10 - -1, 4194304);
            }
            if (arg0 == 3) {
                this.method1574(-116, var9, var10, 268435456);
                this.method1574(-119, var9 - 1, var10 + -1, 16777216);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1574(-112, var9, var10, 545259520);
            this.method1574(-111, var9, var10 - 1, 33554432);
            this.method1574(-116, var9 + 1, var10, 134217728);
        }
        if (arg0 == 1) {
            this.method1574(-128, var9, var10, 41943040);
            this.method1574(-119, var9 + 1, var10, 134217728);
            this.method1574(-113, var9, var10 + 1, 536870912);
        }
        if (arg0 == 2) {
            this.method1574(-114, var9, var10, 167772160);
            this.method1574(-113, var9, var10 + 1, 536870912);
            this.method1574(-128, var9 - 1, var10, 8388608);
        }
        if (arg0 == 3) {
            this.method1574(-117, var9, var10, 671088640);
            this.method1574(-117, var9 - 1, var10, 8388608);
            this.method1574(-116, var9, var10 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
    public final void method1570(int arg0, int arg1, int arg2) {
        field3500++;
        int var4 = arg0 - this.field3489;
        int var5 = arg2 - this.field3507;
        this.field3493[var5][var4] = class139.method776(this.field3493[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZII)V")
    public final void method1571(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3507;
        field3501++;
        int var5 = arg1 - this.field3489;
        this.field3493[var4][var5] = class139.method776(this.field3493[var4][var5], 2097152);
        if (!arg0) {
            this.method1579(99, 18, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1572(int arg0, byte arg1, int arg2) {
        if (arg1 < 18) {
            return true;
        } else {
            field3498++;
            return (arg0 & 0x8000) != 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
    public static final int method1573(int arg0) {
        if (arg0 != 1) {
            field3513 = -43;
        }
        field3511++;
        class653 var1 = class84.field896;
        synchronized (class84.field896) {
            return class84.field896.method3693(true);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V")
    private final void method1574(int arg0, int arg1, int arg2, int arg3) {
        this.field3493[arg2][arg1] = class203.method1246(this.field3493[arg2][arg1], ~arg3);
        field3495++;
        if (arg0 >= -109) {
            this.method1576(124, 104, 7, -26, -41, -115, 60, -78, 76);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3496++;
        if (arg5 != -1) {
            return true;
        }
        if (arg3 == 1) {
            if (arg0 == arg2 && arg1 == arg6) {
                return true;
            }
        } else if (arg0 >= arg2 && arg0 <= (arg3 + arg2 - 1) && arg1 <= arg1 && arg1 + arg3 - 1 >= arg1) {
            return true;
        }
        int var9 = arg0 - this.field3507;
        int var10 = arg6 - this.field3489;
        int var11 = arg1 - this.field3489;
        int var12 = arg2 - this.field3507;
        if (arg3 == 1) {
            if (arg4 == 0) {
                if (arg7 == 0) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field3493[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field3493[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field3493[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field3493[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field3493[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field3493[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field3493[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field3493[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg7 == 0) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field3493[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field3493[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field3493[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field3493[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field3493[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field3493[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field3493[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field3493[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field3493[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var11 - 1) == var10 && (this.field3493[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var12 && var10 == var11 && (this.field3493[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 == var11 && (this.field3493[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg3 + var12 - 1;
            int var14 = var10 + arg3 - 1;
            if (arg4 == 0) {
                if (arg7 == 0) {
                    if ((var9 - arg3) == var12 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var11 + 1) == var10 && (this.field3493[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 - arg3 == var10 && (this.field3493[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 >= var12 && var13 >= var9 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var9 - arg3 == var12 && var11 >= var10 && var11 <= var14 && (this.field3493[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 <= var11 && var11 <= var14 && (this.field3493[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var9 + 1 == var12 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var11 + 1) == var10 && (this.field3493[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var11 - arg3 == var10 && (this.field3493[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 >= var12 && var13 >= var9 && (var11 - arg3) == var10) {
                        return true;
                    }
                    if ((var9 - arg3) == var12 && var11 >= var10 && var14 >= var11 && (this.field3493[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 <= var11 && var11 <= var14 && (this.field3493[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg7 == 0) {
                    if (var9 - arg3 == var12 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 <= var11 && var14 >= var11 && (this.field3493[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 - arg3 == var10 && (this.field3493[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 - arg3 == var12 && var11 >= var10 && var14 >= var11 && (this.field3493[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var11 - arg3 == var10 && (this.field3493[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var9 - arg3 == var12 && var10 <= var11 && var14 >= var11 && (this.field3493[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 + 1 == var10 && (this.field3493[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var11 - arg3) == var10) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var9 - arg3) == var12 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var11 + 1) == var10 && (this.field3493[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 >= var10 && var11 <= var14 && (this.field3493[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var11 - arg3 == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 >= var12 && var9 <= var13 && var11 + 1 == var10 && (this.field3493[var9][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 >= var12 && var9 <= var13 && (var11 - arg3) == var10 && (this.field3493[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var9 - arg3) == var12 && var10 <= var11 && var11 <= var14 && (this.field3493[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 <= var11 && var11 <= var14 && (this.field3493[var12][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3510++;
        if (arg3 > 1) {
            return class513.method2935(arg3, arg1, arg7, 2, arg6, arg8, arg3, arg2, arg5) ? true : this.method1567(arg3, arg0, arg8, arg5, arg6, 115, arg7, arg1, arg2, arg3);
        }
        int var10 = arg7 + arg8 - 1;
        int var11 = arg5 + arg1 - 1;
        if (arg6 >= arg8 && arg6 <= var10 && arg2 >= arg1 && arg2 <= var11) {
            return true;
        } else if ((arg8 - 1) == arg6 && arg2 >= arg1 && arg2 <= var11 && (this.field3493[arg6 - this.field3507][arg2 - this.field3489] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg6 && arg2 >= arg1 && var11 >= arg2 && (this.field3493[arg6 - this.field3507][arg2 - this.field3489] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if ((arg1 - 1) == arg2 && arg6 >= arg8 && arg6 <= var10 && (this.field3493[arg6 - this.field3507][arg2 - this.field3489] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else if (arg4 == 6300) {
            return var11 + 1 == arg2 && arg6 >= arg8 && arg6 <= var10 && (this.field3493[arg6 - this.field3507][arg2 - this.field3489] & 0x20) == 0 && (arg0 & 0x1) == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIIZIIII)V")
    public final void method1577(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field3509++;
        int var9 = 256;
        if (arg3) {
            var9 |= 0x20000;
        }
        int var10 = arg5 - this.field3489;
        int var11 = arg2 - this.field3507;
        if (arg1 == arg6 || arg1 == 3) {
            int var12 = arg7;
            arg7 = arg4;
            arg4 = var12;
        }
        if (arg0) {
            var9 |= 0x40000000;
        }
        for (int var13 = var11; var13 < (arg7 + var11); var13++) {
            if (var13 >= 0 && this.field3492 > var13) {
                for (int var14 = var10; var14 < (arg4 + var10); var14++) {
                    if (var14 >= 0 && var14 < this.field3504) {
                        this.method1574(-123, var14, var13, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIIIZIZ)V")
    public final void method1578(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field3487++;
        if (!arg4) {
            return;
        }
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg6) {
            var8 |= 0x40000000;
        }
        int var9 = arg1 - this.field3507;
        int var10 = arg3 - this.field3489;
        for (int var11 = var9; var11 < (var9 + arg2); var11++) {
            if (var11 >= 0 && var11 < this.field3492) {
                for (int var12 = var10; var12 < arg5 + var10; var12++) {
                    if (var12 >= 0 && this.field3504 > var12) {
                        this.method1582((byte) -81, var11, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)V")
    public final void method1579(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field3489;
        if (arg2 != -57) {
            this.method1566(-15, 43, false, 47, -47, true, -39);
        }
        int var5 = arg0 - this.field3507;
        field3488++;
        this.field3493[var5][var4] = class203.method1246(this.field3493[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public final void method1580(int arg0) {
        for (int var2 = 0; var2 < this.field3492; var2++) {
            for (int var3 = 0; var3 < this.field3504; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field3492 - 5) <= var2 || this.field3504 - 5 <= var3) {
                    this.field3493[var2][var3] = -1;
                } else {
                    this.field3493[var2][var3] = 2097152;
                }
            }
        }
        field3502++;
        if (arg0 >= -90) {
            this.method1581(110, -101, -61);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)V")
    public final void method1581(int arg0, int arg1, int arg2) {
        field3497++;
        if (arg0 != -32251) {
            this.field3504 = 85;
        }
        int var4 = arg2 - this.field3507;
        int var5 = arg1 - this.field3489;
        this.field3493[var4][var5] = class203.method1246(this.field3493[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BIII)V")
    private final void method1582(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == -81) {
            field3505++;
            this.field3493[arg1][arg2] = class139.method776(this.field3493[arg1][arg2], arg3);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public static void method1583(int arg0) {
        field3512 = null;
        field3499 = null;
        field3494 = null;
        if (arg0 != 0) {
            field3499 = null;
        }
    }
}
