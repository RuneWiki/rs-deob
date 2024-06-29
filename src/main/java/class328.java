import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class328 {

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    private int field5594;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    private int field5611;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    private int field5616;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "[[I")
    public int[][] field5605;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    private int field5614;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Lsf;")
    public static class108 field5597 = class140.method973(255, "Lade)3)3)3");

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "[[B")
    public static byte[][] field5599 = new byte[250][];

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "Lsf;")
    private static class108 field5606 = class140.method973(255, "M");

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field5604 = -1;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field5609 = 0;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Lsf;")
    public static class108 field5610 = field5606;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Lsf;")
    public static class108 field5603 = field5606;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIZZ)V", line = 10)
    public final void method2233(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = 256;
        if (arg2 == 1 || arg2 == 3) {
            int var9 = arg4;
            arg4 = arg1;
            arg1 = var9;
        }
        int var10 = arg3 - this.field5611;
        field5607++;
        if (arg5) {
            var8 += 131072;
        }
        int var11 = arg0 - this.field5614;
        for (int var12 = var10; var12 < arg4 + var10; var12++) {
            if (var12 >= 0 && var12 < this.field5616) {
                for (int var13 = var11; var13 < (arg1 + var11); var13++) {
                    if (var13 >= 0 && var13 < this.field5594) {
                        this.method2250((byte) -82, var8, var13, var12);
                    }
                }
            }
        }
        if (!arg6) {
            this.method2238(75, 26, 37, 30, 96);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V", line = 62)
    private final void method2234(int arg0, int arg1, int arg2, int arg3) {
        this.field5605[arg2][arg0] = class242.method1674(this.field5605[arg2][arg0], arg1);
        field5613++;
        if (arg3 < 108) {
            this.method2242(false, false, 4, 119, 61, 8);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIBIIIII)Z", line = 74)
    private final boolean method2235(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5595++;
        if (arg1 < (arg2 + arg8) && arg2 < arg1 + arg7) {
            if (arg3 < 59) {
                this.method2240(true, -108, -67, -110, 52, -12);
            }
            return (arg4 + arg5) > arg6 && arg0 + arg6 > arg5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIII)Z", line = 92)
    public final boolean method2236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5591++;
        if (arg6 == 1) {
            if (arg0 == arg7 && arg1 == arg5) {
                return true;
            }
        } else if (arg0 >= arg7 && arg6 + arg7 - 1 >= arg0 && arg1 <= arg1 && (arg1 + arg6 - 1) >= arg1) {
            return true;
        }
        int var9 = arg1 - this.field5614;
        int var10 = arg7 - this.field5611;
        int var11 = arg0 - this.field5611;
        int var12 = arg5 - this.field5614;
        if (arg6 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var11 + 1 == var10 && var9 == var12 && (this.field5605[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field5605[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field5605[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field5605[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field5605[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field5605[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 + 1 == var10 && var9 == var12 && (this.field5605[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field5605[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var10 == var11 && var9 + 1 == var12 && (this.field5605[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var9 - 1) == var12 && (this.field5605[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field5605[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 == var12 && (this.field5605[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 - (1 - arg6);
            int var14 = var12 + arg6 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var11 + 1) == var10 && var12 <= var9 && var14 >= var9 && (this.field5605[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var9 - arg6) == var12 && (this.field5605[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - arg6 == var10 && var9 >= var12 && var9 <= var14 && (this.field5605[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var9 - arg6 == var12 && (this.field5605[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 - arg6) == var10 && var9 >= var12 && var14 >= var9 && (this.field5605[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var9 + 1) == var12 && (this.field5605[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 + 1 == var10 && var9 >= var12 && var14 >= var9 && (this.field5605[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 + 1) == var12 && (this.field5605[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var11 >= var10 && var11 <= var13 && (var9 + 1) == var12 && (this.field5605[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var11 && var11 <= var13 && (var9 - arg6) == var12 && (this.field5605[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg6) == var10 && var12 <= var9 && var14 >= var9 && (this.field5605[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var12 <= var9 && var14 >= var9 && (this.field5605[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return arg3 != -1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIBII)Z", line = 281)
    public final boolean method2237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (arg6 >= -97) {
            return false;
        }
        field5592++;
        if (arg7 > 1) {
            return this.method2235(arg7, arg1, arg3, (byte) 123, arg2, arg8, arg5, arg7, arg0) ? true : this.method2247(arg5, arg3, arg4, 118, arg2, arg7, arg7, arg1, arg8, arg0);
        }
        int var10 = arg3 + arg0 - 1;
        int var11 = arg2 + arg8 - 1;
        if (arg3 <= arg1 && var10 >= arg1 && arg5 >= arg8 && arg5 <= var11) {
            return true;
        } else if (arg3 - 1 == arg1 && arg8 <= arg5 && var11 >= arg5 && (this.field5605[arg1 - this.field5611][arg5 - this.field5614] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg1 && arg5 >= arg8 && var11 >= arg5 && (this.field5605[arg1 - this.field5611][arg5 - this.field5614] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg8 - 1 == arg5 && arg1 >= arg3 && var10 >= arg1 && (this.field5605[arg1 - this.field5611][arg5 - this.field5614] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg5 && arg3 <= arg1 && var10 >= arg1 && (this.field5605[arg1 - this.field5611][arg5 - this.field5614] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)Z", line = 322)
    public final boolean method2238(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5615++;
        if (arg1 == arg3 && arg0 == arg2) {
            return true;
        }
        int var6 = arg1 - this.field5611;
        int var7 = arg2 - this.field5614;
        if (var6 < 0 || var6 >= this.field5616 || var7 < 0 || this.field5594 <= var7) {
            return false;
        }
        int var8 = arg0 - this.field5614;
        int var9 = arg3 - this.field5611;
        int var10;
        if (var7 > var8) {
            var10 = var7 - var8;
        } else {
            var10 = var8 - var7;
        }
        int var11;
        if (var6 > var9) {
            var11 = var6 - var9;
        } else {
            var11 = var9 - var6;
        }
        if (var10 >= var11) {
            int var12 = var11 * 65536 / var10;
            int var13 = 32768;
            while (var7 != var8) {
                if (var8 < var7) {
                    if ((this.field5605[var9][var8] & 0x12C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var7 < var8) {
                    if ((this.field5605[var9][var8] & 0x12C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 > var9) {
                        if ((this.field5605[var9][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var6) {
                        if ((this.field5605[var9][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var6 != var9) {
                if (var6 > var9) {
                    if ((this.field5605[var9][var8] & 0x12C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var6 < var9) {
                    if ((this.field5605[var9][var8] & 0x12C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 > var8) {
                        if ((this.field5605[var9][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var7 < var8) {
                        if ((this.field5605[var9][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field5605[var6][var7] & 0x1240100) == arg4;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIB)V", line = 479)
    public final void method2239(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field5614;
        int var5 = arg1 - this.field5611;
        if (arg2 >= -72) {
            this.method2237(-89, 61, -87, -22, 7, -25, (byte) 34, -12, 106);
        }
        this.field5605[var5][var4] = class162.method1118(this.field5605[var5][var4], -262145);
        field5593++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZIIIII)V", line = 493)
    public final void method2240(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field5611;
        int var8 = 107 / ((arg5 - 31) / 53);
        field5602++;
        int var9 = arg2 - this.field5614;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method2234(var9, 128, var7, 110);
                this.method2234(var9, 8, var7 - 1, 109);
            }
            if (arg1 == 1) {
                this.method2234(var9, 2, var7, 119);
                this.method2234(var9 + 1, 32, var7, 118);
            }
            if (arg1 == 2) {
                this.method2234(var9, 8, var7, 112);
                this.method2234(var9, 128, var7 + 1, 109);
            }
            if (arg1 == 3) {
                this.method2234(var9, 32, var7, 126);
                this.method2234(var9 - 1, 2, var7, 115);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method2234(var9, 1, var7, 122);
                this.method2234(var9 + 1, 16, var7 - 1, 118);
            }
            if (arg1 == 1) {
                this.method2234(var9, 4, var7, 118);
                this.method2234(var9 + 1, 64, var7 + 1, 110);
            }
            if (arg1 == 2) {
                this.method2234(var9, 16, var7, 127);
                this.method2234(var9 - 1, 1, var7 + 1, 118);
            }
            if (arg1 == 3) {
                this.method2234(var9, 64, var7, 119);
                this.method2234(var9 - 1, 4, var7 - 1, 122);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method2234(var9, 130, var7, 121);
                this.method2234(var9, 8, var7 - 1, 127);
                this.method2234(var9 + 1, 32, var7, 127);
            }
            if (arg1 == 1) {
                this.method2234(var9, 10, var7, 125);
                this.method2234(var9 + 1, 32, var7, 122);
                this.method2234(var9, 128, var7 + 1, 120);
            }
            if (arg1 == 2) {
                this.method2234(var9, 40, var7, 114);
                this.method2234(var9, 128, var7 + 1, 116);
                this.method2234(var9 - 1, 2, var7, 126);
            }
            if (arg1 == 3) {
                this.method2234(var9, 160, var7, 114);
                this.method2234(var9 - 1, 2, var7, 112);
                this.method2234(var9, 8, var7 - 1, 111);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method2234(var9, 65536, var7, 114);
                this.method2234(var9, 4096, var7 - 1, 124);
            }
            if (arg1 == 1) {
                this.method2234(var9, 1024, var7, 123);
                this.method2234(var9 + 1, 16384, var7, 114);
            }
            if (arg1 == 2) {
                this.method2234(var9, 4096, var7, 111);
                this.method2234(var9, 65536, var7 + 1, 112);
            }
            if (arg1 == 3) {
                this.method2234(var9, 16384, var7, 125);
                this.method2234(var9 - 1, 1024, var7, 122);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method2234(var9, 512, var7, 111);
                this.method2234(var9 + 1, 8192, var7 - 1, 119);
            }
            if (arg1 == 1) {
                this.method2234(var9, 2048, var7, 126);
                this.method2234(var9 + 1, 32768, var7 + 1, 122);
            }
            if (arg1 == 2) {
                this.method2234(var9, 8192, var7, 124);
                this.method2234(var9 - 1, 512, var7 + 1, 118);
            }
            if (arg1 == 3) {
                this.method2234(var9, 32768, var7, 116);
                this.method2234(var9 - 1, 2048, var7 - 1, 122);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method2234(var9, 66560, var7, 119);
            this.method2234(var9, 4096, var7 - 1, 126);
            this.method2234(var9 + 1, 16384, var7, 119);
        }
        if (arg1 == 1) {
            this.method2234(var9, 5120, var7, 123);
            this.method2234(var9 + 1, 16384, var7, 118);
            this.method2234(var9, 65536, var7 + 1, 113);
        }
        if (arg1 == 2) {
            this.method2234(var9, 20480, var7, 122);
            this.method2234(var9, 65536, var7 + 1, 117);
            this.method2234(var9 - 1, 1024, var7, 122);
        }
        if (arg1 == 3) {
            this.method2234(var9, 81920, var7, 109);
            this.method2234(var9 - 1, 1024, var7, 126);
            this.method2234(var9, 4096, var7 - 1, 113);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)V", line = 704)
    public final void method2241(byte arg0, int arg1, int arg2) {
        if (arg0 > -7) {
            this.field5614 = 114;
        }
        field5596++;
        int var4 = arg1 - this.field5611;
        int var5 = arg2 - this.field5614;
        this.field5605[var4][var5] = class242.method1674(this.field5605[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZZIIII)V", line = 718)
    public final void method2242(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field5608++;
        int var7 = arg3 - this.field5614;
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        if (arg1) {
            this.field5614 = -3;
        }
        int var9 = arg2 - this.field5611;
        for (int var10 = var9; var10 < arg5 + var9; var10++) {
            if (var10 >= 0 && var10 < this.field5616) {
                for (int var11 = var7; var11 < var7 + arg4; var11++) {
                    if (var11 >= 0 && this.field5594 > var11) {
                        this.method2234(var11, var8, var10, 126);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 761)
    public static final void method2243(int arg0) {
        if (arg0 != -4) {
            field5603 = (class108) null;
        }
        field5587++;
        class141.field2483.method644((byte) 121);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 776)
    public static void method2244(byte arg0) {
        field5597 = null;
        field5599 = (byte[][]) null;
        field5606 = null;
        field5610 = null;
        field5603 = null;
        if (arg0 < 22) {
            method2245(-86, -101, -17, 107, false, -79, -71, -92, (byte) -80, 123, 118, 40);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIZIIIBIII)Z", line = 798)
    public static final boolean method2245(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        field5600++;
        if (class95.field1513.method363((byte) 66) == 2) {
            return class308.method2159(arg4, arg5, arg7, arg3, (byte) 48, arg1, arg0, arg2, arg11, arg6, arg10, arg9);
        } else if (class95.field1513.method363((byte) -68) > 2) {
            return class75.method495(arg3, arg1, arg6, arg7, (byte) 66, arg10, class95.field1513.method363((byte) 108), arg11, arg9, arg4, arg2, arg0, arg5);
        } else {
            if (arg8 != -101) {
                method2245(-23, 16, 80, 24, false, -39, 41, 48, (byte) -13, 114, 68, -52);
            }
            return class105.method721(arg11, arg1, arg2, arg3, arg6, arg0, arg10, arg4, arg8 + 100, arg9, arg7, arg5);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIZII)V", line = 821)
    public final void method2246(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field5614;
        field5601++;
        int var8 = arg0 - this.field5611;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method2250((byte) -57, 128, var7, var8);
                this.method2250((byte) -69, 8, var7, var8 - 1);
            }
            if (arg4 == 1) {
                this.method2250((byte) -116, 2, var7, var8);
                this.method2250((byte) -122, 32, var7 + 1, var8);
            }
            if (arg4 == 2) {
                this.method2250((byte) -100, 8, var7, var8);
                this.method2250((byte) -128, 128, var7, var8 + 1);
            }
            if (arg4 == 3) {
                this.method2250((byte) -91, 32, var7, var8);
                this.method2250((byte) -101, 2, var7 - 1, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method2250((byte) -67, 1, var7, var8);
                this.method2250((byte) -101, 16, var7 + 1, var8 + -1);
            }
            if (arg4 == 1) {
                this.method2250((byte) -58, 4, var7, var8);
                this.method2250((byte) -101, 64, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method2250((byte) -115, 16, var7, var8);
                this.method2250((byte) -125, 1, var7 - 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method2250((byte) -88, 64, var7, var8);
                this.method2250((byte) -74, 4, var7 - 1, var8 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method2250((byte) -72, 130, var7, var8);
                this.method2250((byte) -96, 8, var7, var8 - 1);
                this.method2250((byte) -95, 32, var7 + 1, var8);
            }
            if (arg4 == 1) {
                this.method2250((byte) -109, 10, var7, var8);
                this.method2250((byte) -70, 32, var7 + 1, var8);
                this.method2250((byte) -66, 128, var7, var8 + 1);
            }
            if (arg4 == 2) {
                this.method2250((byte) -79, 40, var7, var8);
                this.method2250((byte) -104, 128, var7, var8 + 1);
                this.method2250((byte) -104, 2, var7 - 1, var8);
            }
            if (arg4 == 3) {
                this.method2250((byte) -80, 160, var7, var8);
                this.method2250((byte) -78, 2, var7 - 1, var8);
                this.method2250((byte) -107, 8, var7, var8 - 1);
            }
        }
        if (arg5 != 4 || !arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method2250((byte) -65, 65536, var7, var8);
                this.method2250((byte) -65, 4096, var7, var8 - 1);
            }
            if (arg4 == 1) {
                this.method2250((byte) -61, 1024, var7, var8);
                this.method2250((byte) -127, 16384, var7 + 1, var8);
            }
            if (arg4 == 2) {
                this.method2250((byte) -90, 4096, var7, var8);
                this.method2250((byte) -113, 65536, var7, var8 + 1);
            }
            if (arg4 == 3) {
                this.method2250((byte) -85, 16384, var7, var8);
                this.method2250((byte) -94, 1024, var7 - 1, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method2250((byte) -99, 512, var7, var8);
                this.method2250((byte) -114, 8192, var7 + 1, var8 + -1);
            }
            if (arg4 == 1) {
                this.method2250((byte) -83, 2048, var7, var8);
                this.method2250((byte) -107, 32768, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method2250((byte) -62, 8192, var7, var8);
                this.method2250((byte) -100, 512, var7 - 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method2250((byte) -64, 32768, var7, var8);
                this.method2250((byte) -63, 2048, var7 - 1, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method2250((byte) -73, 66560, var7, var8);
            this.method2250((byte) -128, 4096, var7, var8 - 1);
            this.method2250((byte) -125, 16384, var7 + 1, var8);
        }
        if (arg4 == 1) {
            this.method2250((byte) -124, 5120, var7, var8);
            this.method2250((byte) -123, 16384, var7 + 1, var8);
            this.method2250((byte) -104, 65536, var7, var8 + 1);
        }
        if (arg4 == 2) {
            this.method2250((byte) -85, 20480, var7, var8);
            this.method2250((byte) -125, 65536, var7, var8 + 1);
            this.method2250((byte) -65, 1024, var7 - 1, var8);
        }
        if (arg4 == 3) {
            this.method2250((byte) -90, 81920, var7, var8);
            this.method2250((byte) -116, 1024, var7 - 1, var8);
            this.method2250((byte) -94, 4096, var7, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1029)
    private final boolean method2247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5588++;
        int var11 = arg7 + arg5;
        int var12 = arg0 + arg6;
        int var13 = arg1 + arg9;
        if (arg3 <= 57) {
            this.method2235(-29, -32, 8, (byte) -8, 19, -126, -43, 29, 118);
        }
        int var14 = arg4 + arg8;
        if (arg1 <= arg7 && var13 > arg7) {
            if (arg8 == var12 && (arg2 & 0x4) == 0) {
                int var15 = arg7;
                int var16 = var13 >= var11 ? var11 : var13;
                while (var16 > var15) {
                    if ((this.field5605[var15 - this.field5611][var12 - this.field5614 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg0 == var14 && (arg2 & 0x1) == 0) {
                int var17 = var11 > var13 ? var13 : var11;
                for (int var18 = arg7; var18 < var17; var18++) {
                    if ((this.field5605[var18 - this.field5611][arg0 - this.field5614] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (var11 > arg1 && var13 >= var11) {
            if (arg8 == var12 && (arg2 & 0x4) == 0) {
                for (int var19 = arg1; var19 < var11; var19++) {
                    if ((this.field5605[var19 - this.field5611][var12 - this.field5614 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var14 && (arg2 & 0x1) == 0) {
                for (int var20 = arg1; var20 < var11; var20++) {
                    if ((this.field5605[var20 - this.field5611][arg0 - this.field5614] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg8 <= arg0 && arg0 < var14) {
            if (arg1 == var11 && (arg2 & 0x8) == 0) {
                int var21 = var12 <= var14 ? var12 : var14;
                for (int var22 = arg0; var22 < var21; var22++) {
                    if ((this.field5605[var11 - this.field5611 - 1][var22 - this.field5614] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var13 && (arg2 & 0x2) == 0) {
                int var23 = arg0;
                int var24 = var12 <= var14 ? var12 : var14;
                while (var23 < var24) {
                    if ((this.field5605[arg7 - this.field5611][var23 - this.field5614] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg8 < var12 && var14 >= var12) {
            if (arg1 == var11 && (arg2 & 0x8) == 0) {
                for (int var25 = arg8; var25 < var12; var25++) {
                    if ((this.field5605[var11 - this.field5611 - 1][var25 - this.field5614] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var13 && (arg2 & 0x2) == 0) {
                for (int var26 = arg8; var26 < var12; var26++) {
                    if ((this.field5605[arg7 - this.field5611][var26 - this.field5614] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 1207)
    public final void method2248(int arg0) {
        field5612++;
        if (arg0 != 4256) {
            this.method2249(-126, 8, 6, 10, 58, -67, 56, 10);
        }
        for (int var2 = 0; var2 < this.field5616; var2++) {
            for (int var3 = 0; var3 < this.field5594; var3++) {
                if (var2 == 0 || var3 == 0 || this.field5616 - 5 <= var2 || var3 >= this.field5594 - 5) {
                    this.field5605[var2][var3] = 16777215;
                } else {
                    this.field5605[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IIIIIIII)Z", line = 1239)
    public final boolean method2249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5598++;
        if (arg1 == arg5) {
            if (arg2 == arg6 && arg0 == arg4) {
                return true;
            }
        } else if (arg2 >= arg6 && (arg1 + arg6 - 1) >= arg2 && arg0 >= arg0 && arg0 <= (arg0 + arg1 - 1)) {
            return true;
        }
        int var9 = arg6 - this.field5611;
        int var10 = arg4 - this.field5614;
        int var11 = arg2 - this.field5611;
        int var12 = arg0 - this.field5614;
        if (arg1 == 1) {
            if (arg7 == 0) {
                if (arg3 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field5605[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field5605[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field5605[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field5605[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field5605[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field5605[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field5605[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field5605[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg3 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field5605[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field5605[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field5605[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field5605[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field5605[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field5605[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field5605[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field5605[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field5605[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field5605[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field5605[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field5605[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg1 - 1;
            int var14 = arg1 + var10 - 1;
            if (arg7 == 0) {
                if (arg3 == 0) {
                    if (var11 - arg1 == var9 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10 && (this.field5605[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 - arg1 == var10 && (this.field5605[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 - arg1 == var9 && var12 >= var10 && var14 >= var12 && (this.field5605[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12 && (this.field5605[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 + 1) == var10 && (this.field5605[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 - arg1 == var10 && (this.field5605[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 >= var9 && var13 >= var11 && var12 - arg1 == var10) {
                        return true;
                    }
                    if ((var11 - arg1) == var9 && var12 >= var10 && var12 <= var14 && (this.field5605[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 >= var10 && var14 >= var12 && (this.field5605[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg3 == 0) {
                    if ((var11 - arg1) == var9 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12 && (this.field5605[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 - arg1) == var10 && (this.field5605[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var11 - arg1) == var9 && var10 <= var12 && var12 <= var14 && (this.field5605[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var12 - arg1 == var10 && (this.field5605[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 - arg1 == var9 && var12 >= var10 && var12 <= var14 && (this.field5605[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 + 1) == var10 && (this.field5605[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 - arg1) == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 - arg1 == var9 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10 && (this.field5605[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field5605[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 - arg1 == var10) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field5605[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 <= var11 && var11 <= var13 && var12 - arg1 == var10 && (this.field5605[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var11 - arg1) == var9 && var12 >= var10 && var14 >= var12 && (this.field5605[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field5605[var9][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIII)V", line = 1625)
    private final void method2250(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -56) {
            this.method2240(true, -22, 102, -121, -27, 122);
        }
        this.field5605[arg3][arg2] = class162.method1118(this.field5605[arg3][arg2], ~arg1);
        field5589++;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IIB)V", line = 1636)
    public final void method2251(int arg0, int arg1, byte arg2) {
        if (arg2 != 70) {
            this.method2250((byte) 34, 127, -52, -122);
        }
        int var4 = arg1 - this.field5614;
        int var5 = arg0 - this.field5611;
        field5590++;
        this.field5605[var5][var4] = class242.method1674(this.field5605[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(II)V", line = 1664)
    public class328(int arg0, int arg1) {
        this.field5594 = arg1;
        this.field5611 = 0;
        this.field5616 = arg0;
        this.field5605 = new int[this.field5616][this.field5594];
        this.field5614 = 0;
        this.method2248(4256);
    }
}
