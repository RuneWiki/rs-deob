import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class39 {

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "Ljava/lang/String;")
    public static String field411 = "Loading defaults - ";

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "[J")
    public static long[] field415 = new long[100];

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Lfi;")
    public static class331 field403 = new class331(64);

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "Z")
    public static boolean field417 = false;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "[[I")
    public int[][] field394;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 6)
    public static void method233(int arg0) {
        field403 = null;
        if (arg0 != -1) {
            field417 = true;
        }
        field415 = null;
        field411 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V", line = 18)
    public final void method234(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field413;
        field397++;
        int var5 = arg2 - this.field398;
        this.field394[var4][var5] = class40.method253(this.field394[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZZII)V", line = 31)
    public final void method235(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field413;
        field400++;
        int var9 = arg5 - this.field398;
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method242(1, 128, var8, var9);
                this.method242(1, 8, var8 - 1, var9);
            }
            if (arg6 == 1) {
                this.method242(1, 2, var8, var9);
                this.method242(1, 32, var8, var9 + 1);
            }
            if (arg6 == 2) {
                this.method242(1, 8, var8, var9);
                this.method242(1, 128, var8 + 1, var9);
            }
            if (arg6 == 3) {
                this.method242(arg1 ^ 0x4E6, 32, var8, var9);
                this.method242(1, 2, var8, var9 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method242(1, 1, var8, var9);
                this.method242(arg1 - 1254, 16, var8 - 1, var9 + 1);
            }
            if (arg6 == 1) {
                this.method242(arg1 ^ 0x4E6, 4, var8, var9);
                this.method242(1, 64, var8 + 1, var9 - -1);
            }
            if (arg6 == 2) {
                this.method242(1, 16, var8, var9);
                this.method242(1, 1, var8 + 1, var9 - 1);
            }
            if (arg6 == 3) {
                this.method242(1, 64, var8, var9);
                this.method242(1, 4, var8 - 1, var9 + -1);
            }
        }
        if (arg1 != 1255) {
            return;
        }
        if (arg2 == 2) {
            if (arg6 == 0) {
                this.method242(1, 130, var8, var9);
                this.method242(1, 8, var8 - 1, var9);
                this.method242(arg1 ^ 0x4E6, 32, var8, var9 + 1);
            }
            if (arg6 == 1) {
                this.method242(1, 10, var8, var9);
                this.method242(1, 32, var8, var9 + 1);
                this.method242(1, 128, var8 + 1, var9);
            }
            if (arg6 == 2) {
                this.method242(arg1 ^ 0x4E6, 40, var8, var9);
                this.method242(1, 128, var8 + 1, var9);
                this.method242(1, 2, var8, var9 - 1);
            }
            if (arg6 == 3) {
                this.method242(1, 160, var8, var9);
                this.method242(1, 2, var8, var9 - 1);
                this.method242(1, 8, var8 - 1, var9);
            }
        }
        if (arg3) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    this.method242(1, 65536, var8, var9);
                    this.method242(arg1 - 1254, 4096, var8 - 1, var9);
                }
                if (arg6 == 1) {
                    this.method242(1, 1024, var8, var9);
                    this.method242(1, 16384, var8, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method242(1, 4096, var8, var9);
                    this.method242(1, 65536, var8 + 1, var9);
                }
                if (arg6 == 3) {
                    this.method242(1, 16384, var8, var9);
                    this.method242(arg1 ^ 0x4E6, 1024, var8, var9 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg6 == 0) {
                    this.method242(1, 512, var8, var9);
                    this.method242(arg1 ^ 0x4E6, 8192, var8 - 1, var9 - -1);
                }
                if (arg6 == 1) {
                    this.method242(arg1 - 1254, 2048, var8, var9);
                    this.method242(arg1 ^ 0x4E6, 32768, var8 + 1, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method242(1, 8192, var8, var9);
                    this.method242(1, 512, var8 + 1, var9 + -1);
                }
                if (arg6 == 3) {
                    this.method242(arg1 - 1254, 32768, var8, var9);
                    this.method242(1, 2048, var8 - 1, var9 + -1);
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    this.method242(1, 66560, var8, var9);
                    this.method242(arg1 ^ 0x4E6, 4096, var8 - 1, var9);
                    this.method242(1, 16384, var8, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method242(1, 5120, var8, var9);
                    this.method242(arg1 - 1254, 16384, var8, var9 + 1);
                    this.method242(arg1 - 1254, 65536, var8 + 1, var9);
                }
                if (arg6 == 2) {
                    this.method242(1, 20480, var8, var9);
                    this.method242(1, 65536, var8 + 1, var9);
                    this.method242(1, 1024, var8, var9 - 1);
                }
                if (arg6 == 3) {
                    this.method242(arg1 ^ 0x4E6, 81920, var8, var9);
                    this.method242(1, 1024, var8, var9 - 1);
                    this.method242(1, 4096, var8 - 1, var9);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method242(1, 536870912, var8, var9);
                this.method242(1, 33554432, var8 - 1, var9);
            }
            if (arg6 == 1) {
                this.method242(1, 8388608, var8, var9);
                this.method242(1, 134217728, var8, var9 + 1);
            }
            if (arg6 == 2) {
                this.method242(arg1 ^ 0x4E6, 33554432, var8, var9);
                this.method242(1, 536870912, var8 + 1, var9);
            }
            if (arg6 == 3) {
                this.method242(arg1 ^ 0x4E6, 134217728, var8, var9);
                this.method242(1, 8388608, var8, var9 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method242(1, 4194304, var8, var9);
                this.method242(arg1 ^ 0x4E6, 67108864, var8 - 1, var9 + 1);
            }
            if (arg6 == 1) {
                this.method242(1, 16777216, var8, var9);
                this.method242(1, 268435456, var8 + 1, var9 + 1);
            }
            if (arg6 == 2) {
                this.method242(1, 67108864, var8, var9);
                this.method242(1, 4194304, var8 + 1, var9 + -1);
            }
            if (arg6 == 3) {
                this.method242(1, 268435456, var8, var9);
                this.method242(1, 16777216, var8 - 1, var9 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method242(1, 545259520, var8, var9);
            this.method242(arg1 - 1254, 33554432, var8 - 1, var9);
            this.method242(arg1 ^ 0x4E6, 134217728, var8, var9 + 1);
        }
        if (arg6 == 1) {
            this.method242(arg1 - 1254, 41943040, var8, var9);
            this.method242(arg1 - 1254, 134217728, var8, var9 + 1);
            this.method242(1, 536870912, var8 + 1, var9);
        }
        if (arg6 == 2) {
            this.method242(1, 167772160, var8, var9);
            this.method242(arg1 ^ 0x4E6, 536870912, var8 + 1, var9);
            this.method242(1, 8388608, var8, var9 - 1);
        }
        if (arg6 == 3) {
            this.method242(1, 671088640, var8, var9);
            this.method242(arg1 ^ 0x4E6, 8388608, var8, var9 - 1);
            this.method242(arg1 - 1254, 33554432, var8 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(III)V", line = 344)
    public final void method236(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field398;
        field395++;
        int var5 = -27 % ((-arg1 - 57) / 43);
        int var6 = arg0 - this.field413;
        this.field394[var6][var4] = class164.method1059(this.field394[var6][var4], 262144);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIIIIII)Z", line = 359)
    public final boolean method237(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field414++;
        if (!arg0) {
            this.method247(-43, -112, -60, true, -69, -25, -81, -122, 88, -34);
        }
        if (arg7 == 1) {
            if (arg3 == arg5 && arg1 == arg2) {
                return true;
            }
        } else if (arg3 <= arg5 && (arg3 + arg7 - 1) >= arg5 && arg2 <= arg2 && arg2 <= (arg7 + arg2 - 1)) {
            return true;
        }
        int var9 = arg3 - this.field413;
        int var10 = arg5 - this.field413;
        int var11 = arg2 - this.field398;
        int var12 = arg1 - this.field398;
        if (arg7 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field394[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field394[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field394[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field394[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field394[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field394[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field394[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field394[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 == var10 && var11 + 1 == var12 && (this.field394[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var11 - 1) == var12 && (this.field394[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var11 == var12 && (this.field394[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var12 && (this.field394[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var9 - 1;
            int var14 = var12 + arg7 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var10 + 1) == var9 && var12 <= var11 && var11 <= var14 && (this.field394[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var11 - arg7 == var12 && (this.field394[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var10 - arg7) == var9 && var12 <= var11 && var11 <= var14 && (this.field394[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var11 - arg7) == var12 && (this.field394[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 - arg7) == var9 && var11 >= var12 && var11 <= var14 && (this.field394[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var11 + 1 == var12 && (this.field394[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 + 1 == var9 && var11 >= var12 && var14 >= var11 && (this.field394[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var11 + 1) == var12 && (this.field394[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var10 >= var9 && var10 <= var13 && var11 + 1 == var12 && (this.field394[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var10 && var13 >= var10 && (var11 - arg7) == var12 && (this.field394[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg7 == var9 && var12 <= var11 && var14 >= var11 && (this.field394[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var12 <= var11 && var14 >= var11 && (this.field394[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBIIZIZ)V", line = 553)
    public final void method238(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field398;
        field401++;
        int var9 = arg5 - this.field413;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method244((byte) -38, var9, 128, var8);
                this.method244((byte) 122, var9 - 1, 8, var8);
            }
            if (arg3 == 1) {
                this.method244((byte) -71, var9, 2, var8);
                this.method244((byte) -29, var9, 32, var8 + 1);
            }
            if (arg3 == 2) {
                this.method244((byte) 68, var9, 8, var8);
                this.method244((byte) 85, var9 + 1, 128, var8);
            }
            if (arg3 == 3) {
                this.method244((byte) -44, var9, 32, var8);
                this.method244((byte) 77, var9, 2, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method244((byte) 61, var9, 1, var8);
                this.method244((byte) -60, var9 - 1, 16, var8 + 1);
            }
            if (arg3 == 1) {
                this.method244((byte) 102, var9, 4, var8);
                this.method244((byte) 94, var9 + 1, 64, var8 + 1);
            }
            if (arg3 == 2) {
                this.method244((byte) 76, var9, 16, var8);
                this.method244((byte) 112, var9 + 1, 1, var8 - 1);
            }
            if (arg3 == 3) {
                this.method244((byte) -103, var9, 64, var8);
                this.method244((byte) -43, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method244((byte) 93, var9, 130, var8);
                this.method244((byte) 65, var9 - 1, 8, var8);
                this.method244((byte) -44, var9, 32, var8 + 1);
            }
            if (arg3 == 1) {
                this.method244((byte) -77, var9, 10, var8);
                this.method244((byte) -127, var9, 32, var8 + 1);
                this.method244((byte) 62, var9 + 1, 128, var8);
            }
            if (arg3 == 2) {
                this.method244((byte) -77, var9, 40, var8);
                this.method244((byte) -119, var9 + 1, 128, var8);
                this.method244((byte) 98, var9, 2, var8 - 1);
            }
            if (arg3 == 3) {
                this.method244((byte) 98, var9, 160, var8);
                this.method244((byte) -99, var9, 2, var8 - 1);
                this.method244((byte) 120, var9 - 1, 8, var8);
            }
        }
        if (arg1 > -99) {
            return;
        }
        if (arg4) {
            if (arg0 == 0) {
                if (arg3 == 0) {
                    this.method244((byte) 93, var9, 65536, var8);
                    this.method244((byte) 83, var9 - 1, 4096, var8);
                }
                if (arg3 == 1) {
                    this.method244((byte) 106, var9, 1024, var8);
                    this.method244((byte) -50, var9, 16384, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method244((byte) 69, var9, 4096, var8);
                    this.method244((byte) 125, var9 + 1, 65536, var8);
                }
                if (arg3 == 3) {
                    this.method244((byte) 68, var9, 16384, var8);
                    this.method244((byte) 68, var9, 1024, var8 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg3 == 0) {
                    this.method244((byte) 120, var9, 512, var8);
                    this.method244((byte) 81, var9 - 1, 8192, var8 + 1);
                }
                if (arg3 == 1) {
                    this.method244((byte) -35, var9, 2048, var8);
                    this.method244((byte) 82, var9 + 1, 32768, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method244((byte) 63, var9, 8192, var8);
                    this.method244((byte) -62, var9 + 1, 512, var8 - 1);
                }
                if (arg3 == 3) {
                    this.method244((byte) 85, var9, 32768, var8);
                    this.method244((byte) 79, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    this.method244((byte) 96, var9, 66560, var8);
                    this.method244((byte) 97, var9 - 1, 4096, var8);
                    this.method244((byte) -66, var9, 16384, var8 + 1);
                }
                if (arg3 == 1) {
                    this.method244((byte) -52, var9, 5120, var8);
                    this.method244((byte) 89, var9, 16384, var8 + 1);
                    this.method244((byte) 110, var9 + 1, 65536, var8);
                }
                if (arg3 == 2) {
                    this.method244((byte) 95, var9, 20480, var8);
                    this.method244((byte) -108, var9 + 1, 65536, var8);
                    this.method244((byte) -88, var9, 1024, var8 - 1);
                }
                if (arg3 == 3) {
                    this.method244((byte) -36, var9, 81920, var8);
                    this.method244((byte) 88, var9, 1024, var8 - 1);
                    this.method244((byte) 119, var9 - 1, 4096, var8);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method244((byte) -54, var9, 536870912, var8);
                this.method244((byte) -76, var9 - 1, 33554432, var8);
            }
            if (arg3 == 1) {
                this.method244((byte) -44, var9, 8388608, var8);
                this.method244((byte) 112, var9, 134217728, var8 + 1);
            }
            if (arg3 == 2) {
                this.method244((byte) 106, var9, 33554432, var8);
                this.method244((byte) 65, var9 + 1, 536870912, var8);
            }
            if (arg3 == 3) {
                this.method244((byte) 69, var9, 134217728, var8);
                this.method244((byte) 78, var9, 8388608, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method244((byte) 73, var9, 4194304, var8);
                this.method244((byte) 71, var9 - 1, 67108864, var8 + 1);
            }
            if (arg3 == 1) {
                this.method244((byte) -89, var9, 16777216, var8);
                this.method244((byte) -90, var9 + 1, 268435456, var8 + 1);
            }
            if (arg3 == 2) {
                this.method244((byte) 73, var9, 67108864, var8);
                this.method244((byte) -40, var9 + 1, 4194304, var8 - 1);
            }
            if (arg3 == 3) {
                this.method244((byte) -88, var9, 268435456, var8);
                this.method244((byte) 89, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method244((byte) -53, var9, 545259520, var8);
            this.method244((byte) -106, var9 - 1, 33554432, var8);
            this.method244((byte) 65, var9, 134217728, var8 + 1);
        }
        if (arg3 == 1) {
            this.method244((byte) -57, var9, 41943040, var8);
            this.method244((byte) 102, var9, 134217728, var8 + 1);
            this.method244((byte) 81, var9 + 1, 536870912, var8);
        }
        if (arg3 == 2) {
            this.method244((byte) -125, var9, 167772160, var8);
            this.method244((byte) -115, var9 + 1, 536870912, var8);
            this.method244((byte) 114, var9, 8388608, var8 - 1);
        }
        if (arg3 == 3) {
            this.method244((byte) -80, var9, 671088640, var8);
            this.method244((byte) -43, var9, 8388608, var8 - 1);
            this.method244((byte) -64, var9 - 1, 33554432, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIZIBII)V", line = 867)
    public final void method239(boolean arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
        field412++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        int var9 = arg1 - this.field413;
        if (arg2) {
            var8 |= 0x40000000;
        }
        int var10 = arg3 - this.field398;
        for (int var11 = var9; var11 < (arg5 + var9); var11++) {
            if (var11 >= 0 && this.field407 > var11) {
                for (int var12 = var10; var12 < (var10 + arg6); var12++) {
                    if (var12 >= 0 && this.field402 > var12) {
                        this.method244((byte) -82, var11, var8, var12);
                    }
                }
            }
        }
        if (arg4 != -9) {
            this.method236(-1, -45, -108);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 912)
    public final void method240(byte arg0) {
        field416++;
        if (arg0 != -103) {
            return;
        }
        for (int var2 = 0; var2 < this.field407; var2++) {
            for (int var3 = 0; var3 < this.field402; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field407 - 5 || var3 >= this.field402 - 5) {
                    this.field394[var2][var3] = -1;
                } else {
                    this.field394[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIB)V", line = 943)
    public final void method241(int arg0, int arg1, byte arg2) {
        if (arg2 <= 18) {
            field415 = null;
        }
        int var4 = arg0 - this.field413;
        int var5 = arg1 - this.field398;
        field405++;
        this.field394[var4][var5] = class164.method1059(this.field394[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIII)V", line = 958)
    private final void method242(int arg0, int arg1, int arg2, int arg3) {
        field409++;
        if (arg0 != 1) {
            field403 = null;
        }
        this.field394[arg2][arg3] = class40.method253(this.field394[arg2][arg3], ~arg1);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIII)Z", line = 977)
    public final boolean method243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field399++;
        if (arg0 == 1) {
            if (arg2 == arg3 && arg1 == arg4) {
                return true;
            }
        } else if (arg2 >= arg3 && arg2 <= arg3 + arg0 - 1 && arg1 >= arg1 && arg1 <= (arg1 - (1 - arg0))) {
            return true;
        }
        int var9 = arg1 - this.field398;
        int var10 = arg4 - this.field398;
        int var11 = arg2 - this.field413;
        int var12 = arg3 - this.field413;
        if (arg0 == 1) {
            if (arg7 == 0) {
                if (arg5 == 0) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field394[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field394[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var11 - 1 == var12 && var9 == var10 && (this.field394[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field394[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field394[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field394[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field394[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field394[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg5 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field394[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field394[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field394[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field394[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field394[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field394[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field394[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field394[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field394[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field394[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field394[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field394[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg0 - 1;
            int var14 = var10 + arg0 - 1;
            if (arg7 == 0) {
                if (arg5 == 0) {
                    if (var11 - arg0 == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 + 1 == var10 && (this.field394[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 - arg0 == var10 && (this.field394[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var11 - arg0 == var12 && var9 >= var10 && var9 <= var14 && (this.field394[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9 && (this.field394[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10 && (this.field394[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 - arg0 == var10 && (this.field394[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg0) == var10) {
                        return true;
                    }
                    if (var11 - arg0 == var12 && var10 <= var9 && var9 <= var14 && (this.field394[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var14 >= var9 && (this.field394[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg5 == 0) {
                    if ((var11 - arg0) == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var14 && (this.field394[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var9 - arg0 == var10 && (this.field394[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var11 - arg0) == var12 && var10 <= var9 && var14 >= var9 && (this.field394[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg0) == var10 && (this.field394[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 - arg0 == var12 && var10 <= var9 && var14 >= var9 && (this.field394[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var9 + 1 == var10 && (this.field394[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 - arg0 == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 - arg0) == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10 && (this.field394[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14 && (this.field394[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 - arg0) == var10) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var12 <= var11 && var11 <= var13 && (var9 + 1) == var10 && (this.field394[var11][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 >= var12 && var11 <= var13 && (var9 - arg0) == var10 && (this.field394[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var11 - arg0 == var12 && var9 >= var10 && var9 <= var14 && (this.field394[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var10 <= var9 && var9 <= var14 && (this.field394[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return arg6 == 16384 ? false : false;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BIII)V", line = 1351)
    private final void method244(byte arg0, int arg1, int arg2, int arg3) {
        this.field394[arg1][arg3] = class164.method1059(this.field394[arg1][arg3], arg2);
        int var5 = 53 / ((17 - arg0) / 43);
        field396++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZIIZI)V", line = 1362)
    public final void method245(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field406++;
        int var9 = 256;
        if (arg6) {
            var9 |= 0x20000;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg4;
            arg4 = arg1;
            arg1 = var10;
        }
        int var11 = arg7 - this.field398;
        if (arg5 != -6563) {
            this.field402 = 32;
        }
        if (arg3) {
            var9 |= 0x40000000;
        }
        int var12 = arg0 - this.field413;
        for (int var13 = var12; var13 < arg4 + var12; var13++) {
            if (var13 >= 0 && this.field407 > var13) {
                for (int var14 = var11; var14 < (var11 + arg1); var14++) {
                    if (var14 >= 0 && var14 < this.field402) {
                        this.method242(1, var9, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIBII)Z", line = 1428)
    public final boolean method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field404++;
        if (arg7 > 1) {
            return class150.method898(arg7, arg5, arg4, arg2, arg8, arg1, 21212, arg0, arg7) ? true : this.method247(arg7, arg4, arg8, false, arg5, arg1, arg0, arg3, arg7, arg2);
        }
        int var10 = arg2 + arg8 - 1;
        if (arg6 != -7) {
            this.method247(-13, -66, -27, false, -24, -23, 16, -29, -76, -9);
        }
        int var11 = arg5 + arg0 - 1;
        if (arg2 <= arg1 && var10 >= arg1 && arg0 <= arg4 && var11 >= arg4) {
            return true;
        } else if ((arg2 - 1) == arg1 && arg4 >= arg0 && arg4 <= var11 && (this.field394[arg1 - this.field413][arg4 - this.field398] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg1 && arg0 <= arg4 && arg4 <= var11 && (this.field394[arg1 - this.field413][arg4 - this.field398] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if ((arg0 - 1) == arg4 && arg2 <= arg1 && var10 >= arg1 && (this.field394[arg1 - this.field413][arg4 - this.field398] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg4 && arg2 <= arg1 && arg1 <= var10 && (this.field394[arg1 - this.field413][arg4 - this.field398] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZIIIIII)Z", line = 1479)
    public final boolean method247(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field408++;
        int var11 = arg0 + arg5;
        int var12 = arg1 + arg8;
        int var13 = arg2 + arg9;
        if (arg3) {
            return false;
        }
        int var14 = arg4 + arg6;
        if (arg5 == var13 && (arg7 & 0x2) == 0) {
            int var15 = arg6 < arg1 ? arg1 : arg6;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field394[var13 - this.field413 - 1][var15 - this.field398] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg9 == var11 && (arg7 & 0x8) == 0) {
            int var17 = arg1 > arg6 ? arg1 : arg6;
            int var18 = var14 > var12 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field394[arg9 - this.field413][var17 - this.field398] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg1 == var14 && (arg7 & 0x1) == 0) {
            int var19 = arg5 <= arg9 ? arg9 : arg5;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field394[var19 - this.field413][var14 - this.field398 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg6 == var12 && (arg7 & 0x4) == 0) {
            int var21 = arg9 < arg5 ? arg5 : arg9;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field394[var21 - this.field413][arg6 - this.field398] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZI)V", line = 1571)
    public final void method248(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            int var4 = arg0 - this.field413;
            field410++;
            int var5 = arg2 - this.field398;
            this.field394[var4][var5] = class40.method253(this.field394[var4][var5], -262145);
        }
    }
}
