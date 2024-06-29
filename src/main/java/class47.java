import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class47 {

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    private int field772 = 0;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    private int field766;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    private int field754;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[[I")
    public int[][] field757;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Lli;")
    public static class185 field759 = class245.method1649("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 127);

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Z")
    public static boolean field760 = false;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "J")
    public static long field764 = 0L;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field779 = 0;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "[Ljd;")
    public static class118[] field778 = new class118[2048];

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Lhi;")
    public static class250 field769;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Lhi;")
    public static class250 field771;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Lhi;")
    public static class250 field776;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIBI)Z")
    public final boolean method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field770++;
        if (arg6 < 40) {
            this.field772 = -50;
        }
        if (arg0 == 1) {
            if (arg2 == arg7 && arg1 == arg3) {
                return true;
            }
        } else if (arg7 <= arg2 && arg7 + arg0 - 1 >= arg2 && arg3 <= arg3 && arg3 <= arg3 + arg0 - 1) {
            return true;
        }
        int var9 = arg7 - this.field774;
        int var10 = arg1 - this.field772;
        int var11 = arg3 - this.field772;
        int var12 = arg2 - this.field774;
        if (arg0 == 1) {
            if (arg4 == 0) {
                if (arg5 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field757[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field757[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field757[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field757[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field757[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field757[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field757[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field757[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field757[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field757[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field757[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field757[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field757[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field757[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field757[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field757[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field757[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field757[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field757[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field757[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg0 - 1;
            int var14 = var9 + arg0 - 1;
            if (arg4 == 0) {
                if (arg5 == 0) {
                    if ((var12 - arg0) == var9 && var11 >= var10 && var11 <= var13) {
                        return true;
                    }
                    if (var9 <= var12 && var14 >= var12 && (var11 + 1) == var10 && (this.field757[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var14 >= var12 && (var11 - arg0) == var10 && (this.field757[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 >= var9 && var14 >= var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var12 - arg0 == var9 && var10 <= var11 && var13 >= var11 && (this.field757[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 <= var11 && var11 <= var13 && (this.field757[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 + 1) == var9 && var10 <= var11 && var11 <= var13) {
                        return true;
                    }
                    if (var12 >= var9 && var14 >= var12 && var11 + 1 == var10 && (this.field757[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var14 && var11 - arg0 == var10 && (this.field757[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 <= var12 && var12 <= var14 && var11 - arg0 == var10) {
                        return true;
                    }
                    if (var12 - arg0 == var9 && var11 >= var10 && var11 <= var13 && (this.field757[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 >= var10 && var13 >= var11 && (this.field757[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    if (var12 - arg0 == var9 && var10 <= var11 && var13 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var11 <= var13 && (this.field757[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var14 && var11 - arg0 == var10 && (this.field757[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var12 - arg0) == var9 && var10 <= var11 && var13 >= var11 && (this.field757[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var14 >= var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var11 <= var13) {
                        return true;
                    }
                    if (var9 <= var12 && var14 >= var12 && var11 - arg0 == var10 && (this.field757[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 - arg0) == var9 && var10 <= var11 && var13 >= var11 && (this.field757[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var14 >= var12 && (var11 + 1) == var10 && (this.field757[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var13 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && var11 - arg0 == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var12 - arg0) == var9 && var11 >= var10 && var11 <= var13) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var14 && var11 + 1 == var10 && (this.field757[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var11 <= var13 && (this.field757[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var14 && (var11 - arg0) == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 <= var12 && var12 <= var14 && (var11 + 1) == var10 && (this.field757[var12][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 <= var12 && var14 >= var12 && var11 - arg0 == var10 && (this.field757[var12][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if (var12 - arg0 == var9 && var11 >= var10 && var13 >= var11 && (this.field757[var14][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 >= var10 && var11 <= var13 && (this.field757[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIII)V")
    private final void method289(boolean arg0, int arg1, int arg2, int arg3) {
        this.field757[arg2][arg1] = class21.method150(this.field757[arg2][arg1], arg3);
        field763++;
        if (arg0) {
            field778 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIBII)Z")
    public final boolean method290(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field780++;
        if (arg2 == 1) {
            if (arg4 == arg6 && arg1 == arg7) {
                return true;
            }
        } else if (arg6 >= arg4 && arg4 + arg2 - 1 >= arg6 && arg7 <= arg7 && arg7 + arg2 - 1 >= arg7) {
            return true;
        }
        if (arg5 != 47) {
            this.field766 = 4;
        }
        int var9 = arg6 - this.field774;
        int var10 = arg7 - this.field772;
        int var11 = arg1 - this.field772;
        int var12 = arg4 - this.field774;
        if (arg2 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field757[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field757[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field757[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field757[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field757[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field757[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field757[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field757[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var9 == var12 && (var10 + 1) == var11 && (this.field757[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var10 - 1) == var11 && (this.field757[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var12 && var10 == var11 && (this.field757[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field757[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var12 - 1;
            int var14 = var11 + arg2 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var9 + 1 == var12 && var11 <= var10 && var14 >= var10 && (this.field757[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var10 - arg2) == var11 && (this.field757[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - arg2 == var12 && var11 <= var10 && var14 >= var10 && (this.field757[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var10 - arg2 == var11 && (this.field757[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - arg2) == var12 && var11 <= var10 && var10 <= var14 && (this.field757[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var10 + 1) == var11 && (this.field757[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 + 1 == var12 && var10 >= var11 && var10 <= var14 && (this.field757[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 + 1 == var11 && (this.field757[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var9 >= var12 && var9 <= var13 && var10 + 1 == var11 && (this.field757[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var9 && var9 <= var13 && (var10 - arg2) == var11 && (this.field757[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg2 == var12 && var10 >= var11 && var10 <= var14 && (this.field757[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 >= var11 && var10 <= var14 && (this.field757[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIB)V")
    public final void method291(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field772;
        int var5 = arg1 - this.field774;
        field755++;
        this.field757[var5][var4] = class220.method1526(this.field757[var5][var4], -262145);
        if (arg2 > -78) {
            this.method298(-14, -67, -95, true, true, 115);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method292(byte arg0) {
        field759 = null;
        field769 = null;
        if (arg0 > -7) {
            method292((byte) -123);
        }
        field776 = null;
        field771 = null;
        field778 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIIBI)Z")
    private final boolean method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field762++;
        if (arg7 <= 67) {
            this.method302(108, 78, 18, 2, 36, 97, -91, -12, 52);
        }
        if (arg4 < arg6 + arg1 && (arg4 + arg8) > arg6) {
            return arg3 < arg2 + arg5 && arg2 < arg0 + arg3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field765++;
        int var11 = arg8 + arg1;
        int var12 = arg7 + arg0;
        int var13 = arg3 + arg9;
        if (arg4 != -1) {
            this.method291(-55, -86, (byte) -71);
        }
        int var14 = arg2 + arg5;
        if (arg3 <= arg8 && var13 > arg8) {
            if (arg5 == var12 && (arg6 & 0x4) == 0) {
                int var15 = arg8;
                int var16 = var11 > var13 ? var13 : var11;
                while (var15 < var16) {
                    if ((this.field757[var15 - this.field774][var12 - this.field772 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg7 == var14 && (arg6 & 0x1) == 0) {
                int var17 = arg8;
                int var18 = var13 >= var11 ? var11 : var13;
                while (var17 < var18) {
                    if ((this.field757[var17 - this.field774][arg7 - this.field772] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg3 && var13 >= var11) {
            if (arg5 == var12 && (arg6 & 0x4) == 0) {
                for (int var19 = arg3; var19 < var11; var19++) {
                    if ((this.field757[var19 - this.field774][var12 - this.field772 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var14 && (arg6 & 0x1) == 0) {
                for (int var20 = arg3; var20 < var11; var20++) {
                    if ((this.field757[var20 - this.field774][arg7 - this.field772] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg7 >= arg5 && var14 > arg7) {
            if (arg3 == var11 && (arg6 & 0x8) == 0) {
                int var21 = var14 < var12 ? var14 : var12;
                for (int var22 = arg7; var22 < var21; var22++) {
                    if ((this.field757[var11 - this.field774 - 1][var22 - this.field772] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var13 && (arg6 & 0x2) == 0) {
                int var23 = var14 < var12 ? var14 : var12;
                for (int var24 = arg7; var24 < var23; var24++) {
                    if ((this.field757[arg8 - this.field774][var24 - this.field772] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg5 < var12 && var12 <= var14) {
            if (arg3 == var11 && (arg6 & 0x8) == 0) {
                for (int var25 = arg5; var25 < var12; var25++) {
                    if ((this.field757[var11 - this.field774 - 1][var25 - this.field772] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var13 && (arg6 & 0x2) == 0) {
                for (int var26 = arg5; var26 < var12; var26++) {
                    if ((this.field757[arg8 - this.field774][var26 - this.field772] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public final void method295(int arg0) {
        if (arg0 != 5) {
            this.method301(-1, -107, false, -127, 61, 72);
        }
        for (int var2 = 0; var2 < this.field766; var2++) {
            for (int var3 = 0; var3 < this.field754; var3++) {
                if (var2 == 0 || var3 == 0 || this.field766 - 5 <= var2 || var3 >= (this.field754 - 5)) {
                    this.field757[var2][var3] = 16777215;
                } else {
                    this.field757[var2][var3] = 16777216;
                }
            }
        }
        field761++;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(ZIII)V")
    private final void method296(boolean arg0, int arg1, int arg2, int arg3) {
        this.field757[arg1][arg2] = class220.method1526(this.field757[arg1][arg2], ~arg3);
        field775++;
        if (arg0) {
            this.method294(-78, 19, 40, -110, -98, -120, 34, 76, 110, 99);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZIIZI)V")
    public final void method297(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg6 - this.field772;
        int var9 = arg3 - this.field774;
        field777++;
        int var10 = 256;
        if (arg5) {
            var10 += 131072;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg0;
            arg0 = arg4;
            arg4 = var11;
        }
        if (!arg2) {
            this.method296(true, -11, 34, -109);
        }
        for (int var12 = var9; var12 < (arg0 + var9); var12++) {
            if (var12 >= 0 && var12 < this.field766) {
                for (int var13 = var8; var13 < arg4 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field754) {
                        this.method296(false, var12, var13, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIZZI)V")
    public final void method298(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field758++;
        int var7 = arg5 - this.field772;
        if (!arg3) {
            return;
        }
        int var8 = arg2 - this.field774;
        int var9 = 256;
        if (arg4) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < (arg0 + var8); var10++) {
            if (var10 >= 0 && var10 < this.field766) {
                for (int var11 = var7; var11 < (var7 + arg1); var11++) {
                    if (var11 >= 0 && var11 < this.field754) {
                        this.method289(false, var11, var10, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
    public final void method299(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field772;
        field781++;
        int var5 = arg0 - this.field774;
        if (arg2 != -15402) {
            field771 = null;
        }
        this.field757[var5][var4] = class21.method150(this.field757[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)V")
    public final void method300(int arg0, int arg1, int arg2) {
        field768++;
        int var4 = arg0 - this.field774;
        int var5 = arg2 - this.field772;
        this.field757[var4][var5] = class21.method150(this.field757[var4][var5], 2097152);
        int var6 = 20 % ((arg1 + 22) / 53);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(II)V")
    public class47(int arg0, int arg1) {
        this.field766 = arg0;
        this.field754 = arg1;
        this.field757 = new int[this.field766][this.field754];
        this.field774 = 0;
        this.method295(5);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZIII)V")
    public final void method301(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field767++;
        int var7 = arg4 - this.field774;
        int var8 = arg0 - this.field772;
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method296(false, var7, var8, 128);
                this.method296(false, var7 - 1, var8, 8);
            }
            if (arg3 == 1) {
                this.method296(false, var7, var8, 2);
                this.method296(false, var7, var8 + 1, 32);
            }
            if (arg3 == 2) {
                this.method296(false, var7, var8, 8);
                this.method296(false, var7 + 1, var8, 128);
            }
            if (arg3 == 3) {
                this.method296(false, var7, var8, 32);
                this.method296(false, var7, var8 - 1, 2);
            }
        }
        if (arg5 != 1024) {
            return;
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method296(false, var7, var8, 1);
                this.method296(false, var7 - 1, var8 + 1, 16);
            }
            if (arg3 == 1) {
                this.method296(false, var7, var8, 4);
                this.method296(false, var7 + 1, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method296(false, var7, var8, 16);
                this.method296(false, var7 + 1, var8 + -1, 1);
            }
            if (arg3 == 3) {
                this.method296(false, var7, var8, 64);
                this.method296(false, var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg3 == 0) {
                this.method296(false, var7, var8, 130);
                this.method296(false, var7 - 1, var8, 8);
                this.method296(false, var7, var8 + 1, 32);
            }
            if (arg3 == 1) {
                this.method296(false, var7, var8, 10);
                this.method296(false, var7, var8 + 1, 32);
                this.method296(false, var7 + 1, var8, 128);
            }
            if (arg3 == 2) {
                this.method296(false, var7, var8, 40);
                this.method296(false, var7 + 1, var8, 128);
                this.method296(false, var7, var8 - 1, 2);
            }
            if (arg3 == 3) {
                this.method296(false, var7, var8, 160);
                this.method296(false, var7, var8 - 1, 2);
                this.method296(false, var7 - 1, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method296(false, var7, var8, 65536);
                this.method296(false, var7 - 1, var8, 4096);
            }
            if (arg3 == 1) {
                this.method296(false, var7, var8, 1024);
                this.method296(false, var7, var8 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method296(false, var7, var8, 4096);
                this.method296(false, var7 + 1, var8, 65536);
            }
            if (arg3 == 3) {
                this.method296(false, var7, var8, 16384);
                this.method296(false, var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method296(false, var7, var8, 512);
                this.method296(false, var7 - 1, var8 - -1, 8192);
            }
            if (arg3 == 1) {
                this.method296(false, var7, var8, 2048);
                this.method296(false, var7 + 1, var8 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method296(false, var7, var8, 8192);
                this.method296(false, var7 + 1, var8 + -1, 512);
            }
            if (arg3 == 3) {
                this.method296(false, var7, var8, 32768);
                this.method296(false, var7 - 1, var8 + -1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method296(false, var7, var8, 66560);
            this.method296(false, var7 - 1, var8, 4096);
            this.method296(false, var7, var8 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method296(false, var7, var8, 5120);
            this.method296(false, var7, var8 + 1, 16384);
            this.method296(false, var7 + 1, var8, 65536);
        }
        if (arg3 == 2) {
            this.method296(false, var7, var8, 20480);
            this.method296(false, var7 + 1, var8, 65536);
            this.method296(false, var7, var8 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method296(false, var7, var8, 81920);
            this.method296(false, var7, var8 - 1, 1024);
            this.method296(false, var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field773++;
        if (arg5 > 1) {
            return this.method293(arg5, arg1, arg0, arg4, arg2, arg7, arg6, (byte) 91, arg5) ? true : this.method294(arg5, arg5, arg7, arg6, -1, arg0, arg3, arg4, arg2, arg1);
        }
        int var10 = arg1 + arg6 - 1;
        int var11 = arg0 + arg7 - 1;
        if (arg2 >= arg6 && arg2 <= var10 && arg4 >= arg0 && arg4 <= var11) {
            return true;
        } else if ((arg6 - 1) == arg2 && arg4 >= arg0 && arg4 <= var11 && (this.field757[arg2 - this.field774][arg4 - this.field772] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg2 && arg4 >= arg0 && arg4 <= var11 && (this.field757[arg2 - this.field774][arg4 - this.field772] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if ((arg0 - 1) == arg4 && arg6 <= arg2 && var10 >= arg2 && (this.field757[arg2 - this.field774][arg4 - this.field772] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return arg8 + var11 == arg4 && arg6 <= arg2 && var10 >= arg2 && (this.field757[arg2 - this.field774][arg4 - this.field772] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZIIIB)V")
    public final void method303(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        field756++;
        int var7 = arg0 - this.field772;
        int var8 = arg4 - this.field774;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method289(false, var7, var8, 128);
                this.method289(false, var7, var8 - 1, 8);
            }
            if (arg3 == 1) {
                this.method289(false, var7, var8, 2);
                this.method289(false, var7 + 1, var8, 32);
            }
            if (arg3 == 2) {
                this.method289(false, var7, var8, 8);
                this.method289(false, var7, var8 + 1, 128);
            }
            if (arg3 == 3) {
                this.method289(false, var7, var8, 32);
                this.method289(false, var7 - 1, var8, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method289(false, var7, var8, 1);
                this.method289(false, var7 + 1, var8 - 1, 16);
            }
            if (arg3 == 1) {
                this.method289(false, var7, var8, 4);
                this.method289(false, var7 + 1, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method289(false, var7, var8, 16);
                this.method289(false, var7 - 1, var8 + 1, 1);
            }
            if (arg3 == 3) {
                this.method289(false, var7, var8, 64);
                this.method289(false, var7 - 1, var8 + -1, 4);
            }
        }
        if (arg5 != 38) {
            return;
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method289(false, var7, var8, 130);
                this.method289(false, var7, var8 - 1, 8);
                this.method289(false, var7 + 1, var8, 32);
            }
            if (arg3 == 1) {
                this.method289(false, var7, var8, 10);
                this.method289(false, var7 + 1, var8, 32);
                this.method289(false, var7, var8 + 1, 128);
            }
            if (arg3 == 2) {
                this.method289(false, var7, var8, 40);
                this.method289(false, var7, var8 + 1, 128);
                this.method289(false, var7 - 1, var8, 2);
            }
            if (arg3 == 3) {
                this.method289(false, var7, var8, 160);
                this.method289(false, var7 - 1, var8, 2);
                this.method289(false, var7, var8 - 1, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method289(false, var7, var8, 65536);
                this.method289(false, var7, var8 - 1, 4096);
            }
            if (arg3 == 1) {
                this.method289(false, var7, var8, 1024);
                this.method289(false, var7 + 1, var8, 16384);
            }
            if (arg3 == 2) {
                this.method289(false, var7, var8, 4096);
                this.method289(false, var7, var8 + 1, 65536);
            }
            if (arg3 == 3) {
                this.method289(false, var7, var8, 16384);
                this.method289(false, var7 - 1, var8, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method289(false, var7, var8, 512);
                this.method289(false, var7 + 1, var8 + -1, 8192);
            }
            if (arg3 == 1) {
                this.method289(false, var7, var8, 2048);
                this.method289(false, var7 + 1, var8 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method289(false, var7, var8, 8192);
                this.method289(false, var7 - 1, var8 + 1, 512);
            }
            if (arg3 == 3) {
                this.method289(false, var7, var8, 32768);
                this.method289(false, var7 - 1, var8 + -1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method289(false, var7, var8, 66560);
            this.method289(false, var7, var8 - 1, 4096);
            this.method289(false, var7 + 1, var8, 16384);
        }
        if (arg3 == 1) {
            this.method289(false, var7, var8, 5120);
            this.method289(false, var7 + 1, var8, 16384);
            this.method289(false, var7, var8 + 1, 65536);
        }
        if (arg3 == 2) {
            this.method289(false, var7, var8, 20480);
            this.method289(false, var7, var8 + 1, 65536);
            this.method289(false, var7 - 1, var8, 1024);
        }
        if (arg3 == 3) {
            this.method289(false, var7, var8, 81920);
            this.method289(false, var7 - 1, var8, 1024);
            this.method289(false, var7, var8 - 1, 4096);
            return;
        }
    }
}
