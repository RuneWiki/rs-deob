import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class123 {

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    private int field2218 = 0;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    private int field2221;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    private int field2226;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "[[I")
    public int[][] field2215;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Z")
    public static boolean field2214 = false;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "J")
    public static long field2224 = 0L;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field2230 = -1;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Lud;")
    public static class279 field2232 = class130.method1024("Chargement des polices )2 ", 255);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBII)V", line = 15)
    private final void method966(int arg0, byte arg1, int arg2, int arg3) {
        this.field2215[arg3][arg2] = class301.method2139(this.field2215[arg3][arg2], arg0);
        if (arg1 == 57) {
            field2238++;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 28)
    public static void method967(int arg0) {
        if (arg0 != -1) {
            method985((class279[]) null, -72);
        }
        field2232 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIII)Z", line = 38)
    public final boolean method968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2234++;
        if (arg7 == 1) {
            if (arg4 == arg5 && arg1 == arg2) {
                return true;
            }
        } else if (arg4 >= arg5 && arg4 <= (arg7 + arg5 - 1) && arg2 >= arg2 && (arg2 + arg7 - 1) >= arg2) {
            return true;
        }
        int var9 = arg1 - this.field2218;
        int var10 = arg5 - this.field2221;
        int var11 = arg2 - this.field2218;
        int var12 = arg4 - this.field2221;
        if (arg3 != -1) {
            this.method976(-122, 76, 104, false, 38, -8);
        }
        if (arg7 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field2215[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field2215[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field2215[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field2215[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field2215[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field2215[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field2215[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field2215[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var10 == var12 && (var11 + 1) == var9 && (this.field2215[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var11 - 1) == var9 && (this.field2215[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var10 && var9 == var11 && (this.field2215[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field2215[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var9 - 1;
            int var14 = var10 + arg7 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var12 + 1 == var10 && var11 >= var9 && var11 <= var13 && (this.field2215[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var14 >= var12 && (var11 - arg7) == var9 && (this.field2215[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var12 - arg7) == var10 && var11 >= var9 && var13 >= var11 && (this.field2215[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var14 && var11 - arg7 == var9 && (this.field2215[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var12 - arg7) == var10 && var9 <= var11 && var13 >= var11 && (this.field2215[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var14 && (var11 + 1) == var9 && (this.field2215[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var12 + 1) == var10 && var11 >= var9 && var13 >= var11 && (this.field2215[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var14 && (var11 + 1) == var9 && (this.field2215[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var10 <= var12 && var12 <= var14 && var11 + 1 == var9 && (this.field2215[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var10 && var12 <= var14 && (var11 - arg7) == var9 && (this.field2215[var12][var13] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg7 == var10 && var11 >= var9 && var13 >= var11 && (this.field2215[var14][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var10 && var11 >= var9 && var11 <= var13 && (this.field2215[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)J", line = 226)
    public static final long method969(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        return var3 == null || var3.field3454 == null ? 0L : var3.field3454.field4095;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIB)Z", line = 248)
    public final boolean method970(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = -120 / ((89 - arg4) / 37);
        field2237++;
        if (arg0 == arg1 && arg2 == arg3) {
            return true;
        }
        int var7 = arg1 - this.field2221;
        int var8 = arg2 - this.field2218;
        if (var7 < 0 || this.field2226 <= var7 || var8 < 0 || var8 >= this.field2217) {
            return false;
        }
        int var9 = arg3 - this.field2218;
        int var10;
        if (var8 <= var9) {
            var10 = var9 - var8;
        } else {
            var10 = var8 - var9;
        }
        int var11 = arg0 - this.field2221;
        int var12;
        if (var7 <= var11) {
            var12 = var11 - var7;
        } else {
            var12 = var7 - var11;
        }
        if (var12 <= var10) {
            int var13 = var12 * 65536 / var10;
            int var14 = 32768;
            while (var8 != var9) {
                if (var8 > var9) {
                    if ((this.field2215[var11][var9] & 0x12C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var9 > var8) {
                    if ((this.field2215[var11][var9] & 0x12C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var7 > var11) {
                        if ((this.field2215[var11][var9] & 0x12C0108) != 0) {
                            return false;
                        }
                        var11++;
                    } else if (var7 < var11) {
                        if ((this.field2215[var11][var9] & 0x12C0180) != 0) {
                            return false;
                        }
                        var11--;
                    }
                }
            }
        } else {
            int var15 = 32768;
            int var16 = var10 * 65536 / var12;
            while (var7 != var11) {
                if (var11 < var7) {
                    if ((this.field2215[var11][var9] & 0x12C0108) != 0) {
                        return false;
                    }
                    var11++;
                } else if (var7 < var11) {
                    if ((this.field2215[var11][var9] & 0x12C0180) != 0) {
                        return false;
                    }
                    var11--;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var8 > var9) {
                        if ((this.field2215[var11][var9] & 0x12C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var8 < var9) {
                        if ((this.field2215[var11][var9] & 0x12C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field2215[var7][var8] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)V", line = 395)
    public final void method971(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2221;
        field2235++;
        if (arg1 >= -102) {
            method974((byte) 80, (class149) null);
        }
        int var5 = arg0 - this.field2218;
        this.field2215[var4][var5] = class301.method2139(this.field2215[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIB)V", line = 412)
    private final void method972(int arg0, int arg1, int arg2, byte arg3) {
        field2233++;
        this.field2215[arg1][arg2] = class52.method442(this.field2215[arg1][arg2], ~arg0);
        if (arg3 != 85) {
            this.method975(65, true, 54, -99, 96, false);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIB)V", line = 425)
    public final void method973(int arg0, int arg1, byte arg2) {
        if (arg2 != 4) {
            this.method976(53, 58, -95, true, -16, -34);
        }
        int var4 = arg1 - this.field2221;
        field2225++;
        int var5 = arg0 - this.field2218;
        this.field2215[var4][var5] = class301.method2139(this.field2215[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLok;)V", line = 439)
    public static final void method974(byte arg0, class149 arg1) {
        if (arg0 != 39) {
            field2224 = 95L;
        }
        field2212++;
        class310.field5499 = arg1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZIIIZ)V", line = 456)
    public final void method975(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2227++;
        int var7 = arg0 - this.field2218;
        int var8 = arg3 - this.field2221;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method972(128, var8, var7, (byte) 85);
                this.method972(8, var8 - 1, var7, (byte) 85);
            }
            if (arg4 == 1) {
                this.method972(2, var8, var7, (byte) 85);
                this.method972(32, var8, var7 + 1, (byte) 85);
            }
            if (arg4 == 2) {
                this.method972(8, var8, var7, (byte) 85);
                this.method972(128, var8 + 1, var7, (byte) 85);
            }
            if (arg4 == 3) {
                this.method972(32, var8, var7, (byte) 85);
                this.method972(2, var8, var7 - 1, (byte) 85);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method972(1, var8, var7, (byte) 85);
                this.method972(16, var8 - 1, var7 + 1, (byte) 85);
            }
            if (arg4 == 1) {
                this.method972(4, var8, var7, (byte) 85);
                this.method972(64, var8 + 1, var7 - -1, (byte) 85);
            }
            if (arg4 == 2) {
                this.method972(16, var8, var7, (byte) 85);
                this.method972(1, var8 + 1, var7 + -1, (byte) 85);
            }
            if (arg4 == 3) {
                this.method972(64, var8, var7, (byte) 85);
                this.method972(4, var8 - 1, var7 + -1, (byte) 85);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method972(130, var8, var7, (byte) 85);
                this.method972(8, var8 - 1, var7, (byte) 85);
                this.method972(32, var8, var7 + 1, (byte) 85);
            }
            if (arg4 == 1) {
                this.method972(10, var8, var7, (byte) 85);
                this.method972(32, var8, var7 + 1, (byte) 85);
                this.method972(128, var8 + 1, var7, (byte) 85);
            }
            if (arg4 == 2) {
                this.method972(40, var8, var7, (byte) 85);
                this.method972(128, var8 + 1, var7, (byte) 85);
                this.method972(2, var8, var7 - 1, (byte) 85);
            }
            if (arg4 == 3) {
                this.method972(160, var8, var7, (byte) 85);
                this.method972(2, var8, var7 - 1, (byte) 85);
                this.method972(8, var8 - 1, var7, (byte) 85);
            }
        }
        if (arg5) {
            if (arg2 == 0) {
                if (arg4 == 0) {
                    this.method972(65536, var8, var7, (byte) 85);
                    this.method972(4096, var8 - 1, var7, (byte) 85);
                }
                if (arg4 == 1) {
                    this.method972(1024, var8, var7, (byte) 85);
                    this.method972(16384, var8, var7 + 1, (byte) 85);
                }
                if (arg4 == 2) {
                    this.method972(4096, var8, var7, (byte) 85);
                    this.method972(65536, var8 + 1, var7, (byte) 85);
                }
                if (arg4 == 3) {
                    this.method972(16384, var8, var7, (byte) 85);
                    this.method972(1024, var8, var7 - 1, (byte) 85);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg4 == 0) {
                    this.method972(512, var8, var7, (byte) 85);
                    this.method972(8192, var8 - 1, var7 + 1, (byte) 85);
                }
                if (arg4 == 1) {
                    this.method972(2048, var8, var7, (byte) 85);
                    this.method972(32768, var8 + 1, var7 + 1, (byte) 85);
                }
                if (arg4 == 2) {
                    this.method972(8192, var8, var7, (byte) 85);
                    this.method972(512, var8 + 1, var7 - 1, (byte) 85);
                }
                if (arg4 == 3) {
                    this.method972(32768, var8, var7, (byte) 85);
                    this.method972(2048, var8 - 1, var7 + -1, (byte) 85);
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    this.method972(66560, var8, var7, (byte) 85);
                    this.method972(4096, var8 - 1, var7, (byte) 85);
                    this.method972(16384, var8, var7 + 1, (byte) 85);
                }
                if (arg4 == 1) {
                    this.method972(5120, var8, var7, (byte) 85);
                    this.method972(16384, var8, var7 + 1, (byte) 85);
                    this.method972(65536, var8 + 1, var7, (byte) 85);
                }
                if (arg4 == 2) {
                    this.method972(20480, var8, var7, (byte) 85);
                    this.method972(65536, var8 + 1, var7, (byte) 85);
                    this.method972(1024, var8, var7 - 1, (byte) 85);
                }
                if (arg4 == 3) {
                    this.method972(81920, var8, var7, (byte) 85);
                    this.method972(1024, var8, var7 - 1, (byte) 85);
                    this.method972(4096, var8 - 1, var7, (byte) 85);
                }
            }
        }
        if (arg1) {
            this.method970(104, -39, -126, -52, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIZII)V", line = 662)
    public final void method976(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 > -120) {
            return;
        }
        int var7 = arg4 - this.field2218;
        field2219++;
        int var8 = arg5 - this.field2221;
        int var9 = 256;
        if (arg3) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < (arg0 + var8); var10++) {
            if (var10 >= 0 && var10 < this.field2226) {
                for (int var11 = var7; var11 < var7 + arg2; var11++) {
                    if (var11 >= 0 && var11 < this.field2217) {
                        this.method966(var9, (byte) 57, var11, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZI)V", line = 705)
    public final void method977(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field2218;
        if (!arg1) {
            this.method973(18, 122, (byte) 90);
        }
        int var5 = arg0 - this.field2221;
        field2229++;
        this.field2215[var5][var4] = class52.method442(this.field2215[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIIIIII)Z", line = 724)
    public final boolean method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2228++;
        if (arg7 >= -92) {
            field2224 = 112L;
        }
        if (arg2 == 1) {
            if (arg0 == arg3 && arg1 == arg5) {
                return true;
            }
        } else if (arg3 >= arg0 && arg3 <= arg0 + arg2 - 1 && arg1 <= arg1 && (arg1 + arg2 - 1) >= arg1) {
            return true;
        }
        int var9 = arg3 - this.field2221;
        int var10 = arg0 - this.field2221;
        int var11 = arg5 - this.field2218;
        int var12 = arg1 - this.field2218;
        if (arg2 == 1) {
            if (arg4 == 0) {
                if (arg6 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field2215[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field2215[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field2215[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field2215[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field2215[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field2215[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                    if (var9 - 1 == var10 && var11 == var12 && (this.field2215[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field2215[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field2215[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field2215[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field2215[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field2215[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field2215[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field2215[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field2215[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field2215[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field2215[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field2215[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var10 && var11 == var12 && (this.field2215[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field2215[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var11 - 1;
            int var14 = arg2 + var10 - 1;
            if (arg4 == 0) {
                if (arg6 == 0) {
                    if ((var9 - arg2) == var10 && var11 <= var12 && var12 <= var13) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && (var12 + 1) == var11 && (this.field2215[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var14 && var12 - arg2 == var11 && (this.field2215[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 >= var10 && var14 >= var9 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 - arg2) == var10 && var12 >= var11 && var12 <= var13 && (this.field2215[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 <= var12 && var12 <= var13 && (this.field2215[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 + 1 == var10 && var11 <= var12 && var13 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && var12 + 1 == var11 && (this.field2215[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && var12 - arg2 == var11 && (this.field2215[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 <= var9 && var9 <= var14 && (var12 - arg2) == var11) {
                        return true;
                    }
                    if ((var9 - arg2) == var10 && var12 >= var11 && var13 >= var12 && (this.field2215[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 <= var12 && var12 <= var13 && (this.field2215[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    if (var9 - arg2 == var10 && var12 >= var11 && var13 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var13 && (this.field2215[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var14 && var12 - arg2 == var11 && (this.field2215[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 - arg2 == var10 && var11 <= var12 && var12 <= var13 && (this.field2215[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var14 >= var9 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 <= var12 && var12 <= var13) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && var12 - arg2 == var11 && (this.field2215[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 - arg2) == var10 && var11 <= var12 && var12 <= var13 && (this.field2215[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var14 >= var9 && var12 + 1 == var11 && (this.field2215[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var13) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var14 && (var12 - arg2) == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var9 - arg2) == var10 && var11 <= var12 && var12 <= var13) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && var12 + 1 == var11 && (this.field2215[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 <= var12 && var12 <= var13 && (this.field2215[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && var12 - arg2 == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var10 <= var9 && var14 >= var9 && (var12 + 1) == var11 && (this.field2215[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 >= var10 && var9 <= var14 && (var12 - arg2) == var11 && (this.field2215[var9][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if (var9 - arg2 == var10 && var11 <= var12 && var13 >= var12 && (this.field2215[var14][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var12 >= var11 && var12 <= var13 && (this.field2215[var10][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIIB)Z", line = 1093)
    private final boolean method979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field2231++;
        if ((arg2 + arg3) <= arg5 || arg5 + arg6 <= arg3) {
            return false;
        } else if (arg8 < 63) {
            return true;
        } else {
            return arg1 < arg4 + arg7 && arg4 < arg0 + arg1;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZZIII)V", line = 1115)
    public final void method980(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2211++;
        int var8 = arg6 - this.field2221;
        int var9 = 256;
        int var10 = arg0 - this.field2218;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg5;
            arg5 = arg4;
            arg4 = var11;
        }
        if (arg2) {
            var9 += 131072;
        }
        if (!arg3) {
            return;
        }
        for (int var12 = var8; var12 < arg5 + var8; var12++) {
            if (var12 >= 0 && this.field2226 > var12) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && this.field2217 > var13) {
                        this.method972(var9, var12, var13, (byte) 85);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 1167)
    public final void method981(int arg0) {
        field2220++;
        for (int var2 = 0; var2 < this.field2226; var2++) {
            for (int var3 = 0; var3 < this.field2217; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field2226 - 5) <= var2 || var3 >= (this.field2217 - 5)) {
                    this.field2215[var2][var3] = 16777215;
                } else {
                    this.field2215[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 != 5) {
            this.method966(113, (byte) -32, 117, 3);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZIII)V", line = 1198)
    public final void method982(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field2218;
        int var8 = arg0 - this.field2221;
        field2213++;
        if (arg1 != 128) {
            field2214 = true;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method966(128, (byte) 57, var7, var8);
                this.method966(8, (byte) 57, var7, var8 - 1);
            }
            if (arg5 == 1) {
                this.method966(2, (byte) 57, var7, var8);
                this.method966(32, (byte) 57, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method966(8, (byte) 57, var7, var8);
                this.method966(128, (byte) 57, var7, var8 + 1);
            }
            if (arg5 == 3) {
                this.method966(32, (byte) 57, var7, var8);
                this.method966(2, (byte) 57, var7 - 1, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method966(1, (byte) 57, var7, var8);
                this.method966(16, (byte) 57, var7 + 1, var8 - 1);
            }
            if (arg5 == 1) {
                this.method966(4, (byte) 57, var7, var8);
                this.method966(64, (byte) 57, var7 + 1, var8 - -1);
            }
            if (arg5 == 2) {
                this.method966(16, (byte) 57, var7, var8);
                this.method966(1, (byte) 57, var7 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method966(64, (byte) 57, var7, var8);
                this.method966(4, (byte) 57, var7 - 1, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method966(130, (byte) 57, var7, var8);
                this.method966(8, (byte) 57, var7, var8 - 1);
                this.method966(32, (byte) 57, var7 + 1, var8);
            }
            if (arg5 == 1) {
                this.method966(10, (byte) 57, var7, var8);
                this.method966(32, (byte) 57, var7 + 1, var8);
                this.method966(128, (byte) 57, var7, var8 + 1);
            }
            if (arg5 == 2) {
                this.method966(40, (byte) 57, var7, var8);
                this.method966(128, (byte) 57, var7, var8 + 1);
                this.method966(2, (byte) 57, var7 - 1, var8);
            }
            if (arg5 == 3) {
                this.method966(160, (byte) 57, var7, var8);
                this.method966(2, (byte) 57, var7 - 1, var8);
                this.method966(8, (byte) 57, var7, var8 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method966(65536, (byte) 57, var7, var8);
                this.method966(4096, (byte) 57, var7, var8 - 1);
            }
            if (arg5 == 1) {
                this.method966(1024, (byte) 57, var7, var8);
                this.method966(16384, (byte) 57, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method966(4096, (byte) 57, var7, var8);
                this.method966(65536, (byte) 57, var7, var8 + 1);
            }
            if (arg5 == 3) {
                this.method966(16384, (byte) 57, var7, var8);
                this.method966(1024, (byte) 57, var7 - 1, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method966(512, (byte) 57, var7, var8);
                this.method966(8192, (byte) 57, var7 + 1, var8 + -1);
            }
            if (arg5 == 1) {
                this.method966(2048, (byte) 57, var7, var8);
                this.method966(32768, (byte) 57, var7 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method966(8192, (byte) 57, var7, var8);
                this.method966(512, (byte) 57, var7 - 1, var8 - -1);
            }
            if (arg5 == 3) {
                this.method966(32768, (byte) 57, var7, var8);
                this.method966(2048, (byte) 57, var7 - 1, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method966(66560, (byte) 57, var7, var8);
            this.method966(4096, (byte) 57, var7, var8 - 1);
            this.method966(16384, (byte) 57, var7 + 1, var8);
        }
        if (arg5 == 1) {
            this.method966(5120, (byte) 57, var7, var8);
            this.method966(16384, (byte) 57, var7 + 1, var8);
            this.method966(65536, (byte) 57, var7, var8 + 1);
        }
        if (arg5 == 2) {
            this.method966(20480, (byte) 57, var7, var8);
            this.method966(65536, (byte) 57, var7, var8 + 1);
            this.method966(1024, (byte) 57, var7 - 1, var8);
        }
        if (arg5 == 3) {
            this.method966(81920, (byte) 57, var7, var8);
            this.method966(1024, (byte) 57, var7 - 1, var8);
            this.method966(4096, (byte) 57, var7, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIII)Z", line = 1406)
    public final boolean method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2222++;
        if (arg2 <= 1) {
            int var10 = arg3 + arg6 - 1;
            int var11 = arg0 + arg5 + arg1;
            if (arg4 >= arg6 && var10 >= arg4 && arg0 <= arg8 && arg8 <= var11) {
                return true;
            } else if (arg6 - 1 == arg4 && arg0 <= arg8 && var11 >= arg8 && (this.field2215[arg4 - this.field2221][arg8 - this.field2218] & 0x8) == 0 && (arg7 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg4 && arg0 <= arg8 && arg8 <= var11 && (this.field2215[arg4 - this.field2221][arg8 - this.field2218] & 0x80) == 0 && (arg7 & 0x2) == 0) {
                return true;
            } else if ((arg0 - 1) == arg8 && arg4 >= arg6 && arg4 <= var10 && (this.field2215[arg4 - this.field2221][arg8 - this.field2218] & 0x2) == 0 && (arg7 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg8 && arg6 <= arg4 && var10 >= arg4 && (this.field2215[arg4 - this.field2221][arg8 - this.field2218] & 0x20) == 0 && (arg7 & 0x1) == 0;
            }
        } else if (this.method979(arg2, arg8, arg3, arg6, arg0, arg4, arg2, arg1, (byte) 101)) {
            return true;
        } else {
            return this.method984(arg3, arg1, (byte) 93, arg0, arg2, arg4, arg7, arg6, arg2, arg8);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBIIIIIII)Z", line = 1447)
    private final boolean method984(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 < 51) {
            this.method975(100, false, 73, 95, 105, true);
        }
        field2223++;
        int var11 = arg4 + arg5;
        int var12 = arg8 + arg9;
        int var13 = arg1 + arg3;
        int var14 = arg0 + arg7;
        if (arg7 <= arg5 && arg5 < var14) {
            if (arg3 == var12 && (arg6 & 0x4) == 0) {
                int var15 = arg5;
                int var16 = var14 >= var11 ? var11 : var14;
                while (var16 > var15) {
                    if ((this.field2215[var15 - this.field2221][var12 - this.field2218 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg9 == var13 && (arg6 & 0x1) == 0) {
                int var17 = arg5;
                int var18 = var14 < var11 ? var14 : var11;
                while (var18 > var17) {
                    if ((this.field2215[var17 - this.field2221][arg9 - this.field2218] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg7 < var11 && var14 >= var11) {
            if (arg3 == var12 && (arg6 & 0x4) == 0) {
                for (int var19 = arg7; var19 < var11; var19++) {
                    if ((this.field2215[var19 - this.field2221][var12 - this.field2218 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var13 && (arg6 & 0x1) == 0) {
                for (int var20 = arg7; var20 < var11; var20++) {
                    if ((this.field2215[var20 - this.field2221][arg9 - this.field2218] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg3 <= arg9 && var13 > arg9) {
            if (arg7 == var11 && (arg6 & 0x8) == 0) {
                int var21 = arg9;
                int var22 = var13 >= var12 ? var12 : var13;
                while (var21 < var22) {
                    if ((this.field2215[var11 - this.field2221 - 1][var21 - this.field2218] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg5 == var14 && (arg6 & 0x2) == 0) {
                int var23 = arg9;
                int var24 = var12 <= var13 ? var12 : var13;
                while (var23 < var24) {
                    if ((this.field2215[arg5 - this.field2221][var23 - this.field2218] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var12 > arg3 && var13 >= var12) {
            if (arg7 == var11 && (arg6 & 0x8) == 0) {
                for (int var25 = arg3; var25 < var12; var25++) {
                    if ((this.field2215[var11 - this.field2221 - 1][var25 - this.field2218] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var14 && (arg6 & 0x2) == 0) {
                for (int var26 = arg3; var26 < var12; var26++) {
                    if ((this.field2215[arg5 - this.field2221][var26 - this.field2218] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(II)V", line = 1611)
    public class123(int arg0, int arg1) {
        this.field2217 = arg1;
        this.field2221 = 0;
        this.field2226 = arg0;
        this.field2215 = new int[this.field2226][this.field2217];
        this.method981(5);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lud;I)[Lud;", line = 1639)
    public static final class279[] method985(class279[] arg0, int arg1) {
        field2216++;
        class279[] var2 = new class279[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class115.method929(new class279[] { class191.method1447(arg1 + 10, var3), class115.field2098 }, (byte) 60);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class115.method929(new class279[] { var2[var3], arg0[var3] }, (byte) 60);
            }
        }
        if (arg1 != -5) {
            field2224 = 79L;
        }
        return var2;
    }
}
