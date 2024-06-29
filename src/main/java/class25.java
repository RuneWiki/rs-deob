import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 {

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    private int field450 = 0;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "[[I")
    public int[][] field470;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Lpj;")
    public static class237 field452 = null;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lpj;")
    public static class237 field445 = class33.method353("scrollbar", 56);

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "[S")
    public static short[] field468 = new short[256];

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[[[B")
    public static byte[][][] field446;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method220(int arg0) {
        if (arg0 < 91) {
            method230((class239) null, 112, (class237) null);
        }
        field446 = null;
        field452 = null;
        field468 = null;
        field445 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBII)V")
    private final void method221(int arg0, byte arg1, int arg2, int arg3) {
        this.field470[arg0][arg2] = class34.method362(this.field470[arg0][arg2], arg3);
        field444++;
        if (arg1 <= 82) {
            this.field469 = 31;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZBII)V")
    public final void method222(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field469;
        field443++;
        int var8 = arg0 - this.field450;
        int var9 = 256;
        if (arg2) {
            var9 += 131072;
        }
        if (arg3 > -95) {
            return;
        }
        for (int var10 = var7; var10 < (arg4 + var7); var10++) {
            if (var10 >= 0 && this.field462 > var10) {
                for (int var11 = var8; var11 < arg5 + var8; var11++) {
                    if (var11 >= 0 && this.field456 > var11) {
                        this.method221(var10, (byte) 89, var11, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
    public final void method223(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field469;
        int var5 = arg2 - this.field450;
        field461++;
        this.field470[var4][var5] = class34.method362(this.field470[var4][var5], 262144);
        if (arg0 != 0) {
            field468 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIBIIII)Z")
    public final boolean method224(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field465++;
        if (arg5 == 1) {
            if (arg0 == arg4 && arg6 == arg7) {
                return true;
            }
        } else if (arg4 >= arg0 && (arg0 + arg5 - 1) >= arg4 && arg7 <= arg7 && arg5 + arg7 - 1 >= arg7) {
            return true;
        }
        int var9 = arg4 - this.field469;
        int var10 = arg0 - this.field469;
        int var11 = arg6 - this.field450;
        int var12 = arg7 - this.field450;
        if (arg5 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var9 + 1 == var10 && var11 == var12 && (this.field470[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field470[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field470[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field470[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field470[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field470[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 + 1 == var10 && var11 == var12 && (this.field470[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field470[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 == var10 && var12 + 1 == var11 && (this.field470[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field470[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var10 && var11 == var12 && (this.field470[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field470[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg5 - 1;
            int var14 = arg5 + var10 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var9 + 1) == var10 && var12 >= var11 && var12 <= var13 && (this.field470[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var14 && (var12 - arg5) == var11 && (this.field470[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - arg5 == var10 && var11 <= var12 && var12 <= var13 && (this.field470[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && var12 - arg5 == var11 && (this.field470[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - arg5) == var10 && var12 >= var11 && var12 <= var13 && (this.field470[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var14 >= var9 && var12 + 1 == var11 && (this.field470[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var13 && (this.field470[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var14 && var12 + 1 == var11 && (this.field470[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 <= var9 && var14 >= var9 && (var12 + 1) == var11 && (this.field470[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var10 && var14 >= var9 && var12 - arg5 == var11 && (this.field470[var9][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg5) == var10 && var11 <= var12 && var13 >= var12 && (this.field470[var14][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var12 >= var11 && var13 >= var12 && (this.field470[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        if (arg3 != 12) {
            field460 = 74;
        }
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(IBII)V")
    private final void method225(int arg0, byte arg1, int arg2, int arg3) {
        this.field470[arg3][arg0] = class272.method1817(this.field470[arg3][arg0], ~arg2);
        if (arg1 < -51) {
            field451++;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBIIIIII)Z")
    public final boolean method226(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field448++;
        if (arg2 == 1) {
            if (arg4 == arg7 && arg0 == arg6) {
                return true;
            }
        } else if (arg4 <= arg7 && arg7 <= arg2 + arg4 - 1 && arg0 <= arg0 && arg0 - (1 - arg2) >= arg0) {
            return true;
        }
        int var9 = arg4 - this.field469;
        int var10 = arg6 - this.field450;
        int var11 = arg0 - this.field450;
        int var12 = arg7 - this.field469;
        if (arg1 != -44) {
            field452 = null;
        }
        if (arg2 == 1) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field470[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field470[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field470[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field470[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field470[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field470[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field470[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field470[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field470[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field470[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field470[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field470[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field470[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field470[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field470[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field470[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var12 && (var11 + 1) == var10 && (this.field470[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field470[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field470[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field470[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg2 - 1;
            int var14 = arg2 + var9 - 1;
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if ((var12 - arg2) == var9 && var11 >= var10 && var11 <= var13) {
                        return true;
                    }
                    if (var12 >= var9 && var14 >= var12 && var11 + 1 == var10 && (this.field470[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var14 && var11 - arg2 == var10 && (this.field470[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 <= var12 && var12 <= var14 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 - arg2) == var9 && var11 >= var10 && var11 <= var13 && (this.field470[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 <= var11 && var11 <= var13 && (this.field470[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var12 + 1) == var9 && var11 >= var10 && var13 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && (var11 + 1) == var10 && (this.field470[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var14 >= var12 && (var11 - arg2) == var10 && (this.field470[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 <= var12 && var14 >= var12 && var11 - arg2 == var10) {
                        return true;
                    }
                    if (var12 - arg2 == var9 && var10 <= var11 && var11 <= var13 && (this.field470[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var11 <= var13 && (this.field470[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if ((var12 - arg2) == var9 && var10 <= var11 && var13 >= var11) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var14 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var13 >= var11 && (this.field470[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var14 && (var11 - arg2) == var10 && (this.field470[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - arg2) == var9 && var10 <= var11 && var13 >= var11 && (this.field470[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var14 >= var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var13 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var14 >= var12 && (var11 - arg2) == var10 && (this.field470[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var12 - arg2) == var9 && var11 >= var10 && var13 >= var11 && (this.field470[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var14 >= var12 && var11 + 1 == var10 && (this.field470[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 <= var11 && var13 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && var11 - arg2 == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var12 - arg2 == var9 && var10 <= var11 && var13 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && var11 + 1 == var10 && (this.field470[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 >= var10 && var13 >= var11 && (this.field470[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var14 >= var12 && var11 - arg2 == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 <= var12 && var14 >= var12 && (var11 + 1) == var10 && (this.field470[var12][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 >= var9 && var14 >= var12 && var11 - arg2 == var10 && (this.field470[var12][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var12 - arg2) == var9 && var11 >= var10 && var11 <= var13 && (this.field470[var14][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var11 >= var10 && var11 <= var13 && (this.field470[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field457++;
        if (arg0 >= (arg6 + arg7) || arg6 >= (arg0 + arg5)) {
            return false;
        } else if (arg1 == 21509) {
            return arg8 < (arg3 + arg4) && arg3 < arg2 + arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIIIIZ)V")
    public final void method228(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field449++;
        if (arg5) {
            this.field450 = -117;
        }
        int var7 = arg2 - this.field469;
        int var8 = arg1 - this.field450;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method225(var8, (byte) -52, 128, var7);
                this.method225(var8, (byte) -60, 8, var7 - 1);
            }
            if (arg3 == 1) {
                this.method225(var8, (byte) -114, 2, var7);
                this.method225(var8 + 1, (byte) -53, 32, var7);
            }
            if (arg3 == 2) {
                this.method225(var8, (byte) -104, 8, var7);
                this.method225(var8, (byte) -88, 128, var7 + 1);
            }
            if (arg3 == 3) {
                this.method225(var8, (byte) -103, 32, var7);
                this.method225(var8 - 1, (byte) -105, 2, var7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method225(var8, (byte) -58, 1, var7);
                this.method225(var8 + 1, (byte) -56, 16, var7 - 1);
            }
            if (arg3 == 1) {
                this.method225(var8, (byte) -80, 4, var7);
                this.method225(var8 + 1, (byte) -54, 64, var7 + 1);
            }
            if (arg3 == 2) {
                this.method225(var8, (byte) -124, 16, var7);
                this.method225(var8 - 1, (byte) -105, 1, var7 + 1);
            }
            if (arg3 == 3) {
                this.method225(var8, (byte) -64, 64, var7);
                this.method225(var8 - 1, (byte) -78, 4, var7 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method225(var8, (byte) -105, 130, var7);
                this.method225(var8, (byte) -76, 8, var7 - 1);
                this.method225(var8 + 1, (byte) -127, 32, var7);
            }
            if (arg3 == 1) {
                this.method225(var8, (byte) -60, 10, var7);
                this.method225(var8 + 1, (byte) -71, 32, var7);
                this.method225(var8, (byte) -88, 128, var7 + 1);
            }
            if (arg3 == 2) {
                this.method225(var8, (byte) -75, 40, var7);
                this.method225(var8, (byte) -113, 128, var7 + 1);
                this.method225(var8 - 1, (byte) -64, 2, var7);
            }
            if (arg3 == 3) {
                this.method225(var8, (byte) -106, 160, var7);
                this.method225(var8 - 1, (byte) -62, 2, var7);
                this.method225(var8, (byte) -123, 8, var7 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method225(var8, (byte) -104, 65536, var7);
                this.method225(var8, (byte) -85, 4096, var7 - 1);
            }
            if (arg3 == 1) {
                this.method225(var8, (byte) -105, 1024, var7);
                this.method225(var8 + 1, (byte) -120, 16384, var7);
            }
            if (arg3 == 2) {
                this.method225(var8, (byte) -98, 4096, var7);
                this.method225(var8, (byte) -93, 65536, var7 + 1);
            }
            if (arg3 == 3) {
                this.method225(var8, (byte) -114, 16384, var7);
                this.method225(var8 - 1, (byte) -123, 1024, var7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method225(var8, (byte) -108, 512, var7);
                this.method225(var8 + 1, (byte) -89, 8192, var7 - 1);
            }
            if (arg3 == 1) {
                this.method225(var8, (byte) -112, 2048, var7);
                this.method225(var8 + 1, (byte) -74, 32768, var7 + 1);
            }
            if (arg3 == 2) {
                this.method225(var8, (byte) -122, 8192, var7);
                this.method225(var8 - 1, (byte) -66, 512, var7 + 1);
            }
            if (arg3 == 3) {
                this.method225(var8, (byte) -52, 32768, var7);
                this.method225(var8 - 1, (byte) -66, 2048, var7 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method225(var8, (byte) -103, 66560, var7);
            this.method225(var8, (byte) -91, 4096, var7 - 1);
            this.method225(var8 + 1, (byte) -108, 16384, var7);
        }
        if (arg3 == 1) {
            this.method225(var8, (byte) -125, 5120, var7);
            this.method225(var8 + 1, (byte) -108, 16384, var7);
            this.method225(var8, (byte) -121, 65536, var7 + 1);
        }
        if (arg3 == 2) {
            this.method225(var8, (byte) -107, 20480, var7);
            this.method225(var8, (byte) -55, 65536, var7 + 1);
            this.method225(var8 - 1, (byte) -111, 1024, var7);
        }
        if (arg3 == 3) {
            this.method225(var8, (byte) -68, 81920, var7);
            this.method225(var8 - 1, (byte) -113, 1024, var7);
            this.method225(var8, (byte) -69, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)V")
    public final void method229(int arg0, int arg1, int arg2) {
        field459++;
        int var4 = arg1 - this.field450;
        int var5 = arg0 - this.field469;
        this.field470[var5][var4] = class34.method362(this.field470[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lfa;ILpj;)Laj;")
    public static final class46 method230(class239 arg0, int arg1, class237 arg2) {
        field442++;
        int var3 = arg0.method1643(arg2, (byte) 121);
        if (var3 == -1) {
            return new class46(0);
        }
        int[] var4 = arg0.method1636(var3, (byte) -34);
        if (arg1 <= 36) {
            return null;
        }
        class46 var5 = new class46(var4.length);
        for (int var6 = 0; var6 < var5.field1000; var6++) {
            class32 var7 = new class32(arg0.method1645(true, var4[var6], var3));
            var5.field1002[var6] = var7.method324(1);
            var5.field1008[var6] = var7.method325(-126);
            var5.field1007[var6] = (short) var7.method339(-16777216);
            var5.field987[var6] = (short) var7.method339(-16777216);
            var5.field1001[var6] = var7.method319((byte) -18);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)V")
    public final void method231(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field469;
        field467++;
        int var5 = arg1 - this.field450;
        this.field470[var4][var5] = class272.method1817(this.field470[var4][var5], -262145);
        if (arg2 != -22166) {
            method220(52);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public final void method232(int arg0) {
        field455++;
        if (arg0 != -1) {
            field445 = null;
        }
        for (int var2 = 0; var2 < this.field462; var2++) {
            for (int var3 = 0; var3 < this.field456; var3++) {
                if (var2 == 0 || var3 == 0 || this.field462 - 5 <= var2 || this.field456 - 5 <= var3) {
                    this.field470[var2][var3] = 16777215;
                } else {
                    this.field470[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZIBI)V")
    public final void method233(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg0 - this.field469;
        field464++;
        int var8 = arg3 - this.field450;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method221(var7, (byte) 113, var8, 128);
                this.method221(var7 - 1, (byte) 95, var8, 8);
            }
            if (arg1 == 1) {
                this.method221(var7, (byte) 95, var8, 2);
                this.method221(var7, (byte) 100, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method221(var7, (byte) 104, var8, 8);
                this.method221(var7 + 1, (byte) 91, var8, 128);
            }
            if (arg1 == 3) {
                this.method221(var7, (byte) 101, var8, 32);
                this.method221(var7, (byte) 98, var8 - 1, 2);
            }
        }
        if (arg4 >= -62) {
            this.method228(true, 127, -114, -94, 105, false);
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method221(var7, (byte) 89, var8, 1);
                this.method221(var7 - 1, (byte) 96, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method221(var7, (byte) 123, var8, 4);
                this.method221(var7 + 1, (byte) 95, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method221(var7, (byte) 118, var8, 16);
                this.method221(var7 + 1, (byte) 85, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method221(var7, (byte) 122, var8, 64);
                this.method221(var7 - 1, (byte) 101, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method221(var7, (byte) 90, var8, 130);
                this.method221(var7 - 1, (byte) 102, var8, 8);
                this.method221(var7, (byte) 97, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method221(var7, (byte) 127, var8, 10);
                this.method221(var7, (byte) 86, var8 + 1, 32);
                this.method221(var7 + 1, (byte) 114, var8, 128);
            }
            if (arg1 == 2) {
                this.method221(var7, (byte) 105, var8, 40);
                this.method221(var7 + 1, (byte) 118, var8, 128);
                this.method221(var7, (byte) 110, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method221(var7, (byte) 111, var8, 160);
                this.method221(var7, (byte) 86, var8 - 1, 2);
                this.method221(var7 - 1, (byte) 103, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method221(var7, (byte) 102, var8, 65536);
                this.method221(var7 - 1, (byte) 88, var8, 4096);
            }
            if (arg1 == 1) {
                this.method221(var7, (byte) 113, var8, 1024);
                this.method221(var7, (byte) 89, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method221(var7, (byte) 101, var8, 4096);
                this.method221(var7 + 1, (byte) 121, var8, 65536);
            }
            if (arg1 == 3) {
                this.method221(var7, (byte) 108, var8, 16384);
                this.method221(var7, (byte) 96, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method221(var7, (byte) 91, var8, 512);
                this.method221(var7 - 1, (byte) 125, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method221(var7, (byte) 84, var8, 2048);
                this.method221(var7 + 1, (byte) 102, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method221(var7, (byte) 118, var8, 8192);
                this.method221(var7 + 1, (byte) 112, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method221(var7, (byte) 122, var8, 32768);
                this.method221(var7 - 1, (byte) 103, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method221(var7, (byte) 83, var8, 66560);
            this.method221(var7 - 1, (byte) 111, var8, 4096);
            this.method221(var7, (byte) 98, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method221(var7, (byte) 95, var8, 5120);
            this.method221(var7, (byte) 97, var8 + 1, 16384);
            this.method221(var7 + 1, (byte) 89, var8, 65536);
        }
        if (arg1 == 2) {
            this.method221(var7, (byte) 120, var8, 20480);
            this.method221(var7 + 1, (byte) 97, var8, 65536);
            this.method221(var7, (byte) 99, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method221(var7, (byte) 127, var8, 81920);
            this.method221(var7, (byte) 91, var8 - 1, 1024);
            this.method221(var7 - 1, (byte) 126, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIZI)V")
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg2 == 1 || arg2 == 3) {
            int var8 = arg6;
            arg6 = arg4;
            arg4 = var8;
        }
        if (arg0 != -1) {
            this.field456 = -118;
        }
        field454++;
        int var9 = arg1 - this.field450;
        int var10 = arg3 - this.field469;
        int var11 = 256;
        if (arg5) {
            var11 += 131072;
        }
        for (int var12 = var10; var12 < arg6 + var10; var12++) {
            if (var12 >= 0 && var12 < this.field462) {
                for (int var13 = var9; var13 < arg4 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field456) {
                        this.method225(var13, (byte) -94, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(IIIIIIIII)Z")
    public final boolean method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field458++;
        if (arg1 > 1) {
            return this.method227(arg3, 21509, arg1, arg5, arg0, arg1, arg2, arg6, arg8) ? true : this.method236(arg2, arg3, arg0, arg6, arg8, arg5, arg4, -120, arg1, arg1);
        }
        if (arg7 != 8507) {
            this.method229(-6, 1, 97);
        }
        int var10 = arg2 + arg6 - 1;
        int var11 = arg5 + arg0 - 1;
        if (arg3 >= arg2 && var10 >= arg3 && arg8 >= arg5 && var11 >= arg8) {
            return true;
        } else if (arg2 - 1 == arg3 && arg8 >= arg5 && var11 >= arg8 && (this.field470[arg3 - this.field469][arg8 - this.field450] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg3 && arg8 >= arg5 && arg8 <= var11 && (this.field470[arg3 - this.field469][arg8 - this.field450] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg8 && arg3 >= arg2 && arg3 <= var10 && (this.field470[arg3 - this.field469][arg8 - this.field450] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg8 && arg3 >= arg2 && arg3 <= var10 && (this.field470[arg3 - this.field469][arg8 - this.field450] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg1 + arg8;
        field447++;
        if (arg7 > -116) {
            field460 = -78;
        }
        int var12 = arg4 + arg9;
        int var13 = arg2 + arg5;
        int var14 = arg0 + arg3;
        if (arg0 <= arg1 && arg1 < var14) {
            if (arg5 == var12 && (arg6 & 0x4) == 0) {
                int var15 = arg1;
                int var16 = var14 < var11 ? var14 : var11;
                while (var15 < var16) {
                    if ((this.field470[var15 - this.field469][var12 - this.field450 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg4 == var13 && (arg6 & 0x1) == 0) {
                int var17 = arg1;
                int var18 = var14 < var11 ? var14 : var11;
                while (var17 < var18) {
                    if ((this.field470[var17 - this.field469][arg4 - this.field450] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg0 && var11 <= var14) {
            if (arg5 == var12 && (arg6 & 0x4) == 0) {
                for (int var19 = arg0; var19 < var11; var19++) {
                    if ((this.field470[var19 - this.field469][var12 - this.field450 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg4 == var13 && (arg6 & 0x1) == 0) {
                for (int var20 = arg0; var20 < var11; var20++) {
                    if ((this.field470[var20 - this.field469][arg4 - this.field450] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg4 >= arg5 && arg4 < var13) {
            if (arg0 == var11 && (arg6 & 0x8) == 0) {
                int var21 = arg4;
                int var22 = var12 <= var13 ? var12 : var13;
                while (var21 < var22) {
                    if ((this.field470[var11 - this.field469 - 1][var21 - this.field450] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg1 == var14 && (arg6 & 0x2) == 0) {
                int var23 = arg4;
                int var24 = var12 > var13 ? var13 : var12;
                while (var24 > var23) {
                    if ((this.field470[arg1 - this.field469][var23 - this.field450] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg5 < var12 && var13 >= var12) {
            if (arg0 == var11 && (arg6 & 0x8) == 0) {
                for (int var25 = arg5; var25 < var12; var25++) {
                    if ((this.field470[var11 - this.field469 - 1][var25 - this.field450] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var14 && (arg6 & 0x2) == 0) {
                for (int var26 = arg5; var26 < var12; var26++) {
                    if ((this.field470[arg1 - this.field469][var26 - this.field450] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(II)V")
    public class25(int arg0, int arg1) {
        this.field456 = arg1;
        this.field469 = 0;
        this.field462 = arg0;
        this.field470 = new int[this.field462][this.field456];
        this.method232(-1);
    }
}
