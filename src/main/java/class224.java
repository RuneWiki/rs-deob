import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class224 {

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public int field2896;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public int field2911;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "Lsea;")
    public static class724 field2905;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "[[I")
    public int[][] field2908;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZIIZ)V", line = 9)
    public final void method1421(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        field2898++;
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        int var10 = arg5 - this.field2896;
        if (arg4) {
            var9 |= 0x40000000;
        }
        if (arg1 != 512) {
            this.field2896 = 106;
        }
        int var11 = arg2 - this.field2912;
        if (arg6 == 1 || arg6 == 3) {
            int var12 = arg3;
            arg3 = arg0;
            arg0 = var12;
        }
        for (int var13 = var10; var13 < var10 + arg3; var13++) {
            if (var13 >= 0 && var13 < this.field2903) {
                for (int var14 = var11; var14 < (arg0 + var11); var14++) {
                    if (var14 >= 0 && var14 < this.field2911) {
                        this.method1426(var9, var14, -122, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BIII)V", line = 64)
    private final void method1422(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = 103 % ((arg0 + 19) / 56);
        field2895++;
        this.field2908[arg3][arg2] = class670.method3699(this.field2908[arg3][arg2], arg1);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIBIIIII)Z", line = 77)
    public final boolean method1423(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 59) {
            return true;
        }
        field2909++;
        if (arg3 == 1) {
            if (arg1 == arg4 && arg0 == arg5) {
                return true;
            }
        } else if (arg1 <= arg4 && arg1 + arg3 - 1 >= arg4 && arg5 >= arg5 && arg5 <= (arg5 + arg3 - 1)) {
            return true;
        }
        int var9 = arg5 - this.field2912;
        int var10 = arg0 - this.field2912;
        int var11 = arg4 - this.field2896;
        int var12 = arg1 - this.field2896;
        if (arg3 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var11 + 1 == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field2908[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field2908[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field2908[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field2908[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field2908[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field2908[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg3 + var12 - 1;
            int var14 = arg3 + var10 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14 && (this.field2908[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg3) == var10 && (this.field2908[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - arg3 == var12 && var10 <= var9 && var14 >= var9 && (this.field2908[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 - arg3 == var10 && (this.field2908[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - arg3) == var12 && var10 <= var9 && var9 <= var14 && (this.field2908[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10 && (this.field2908[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var14 && (this.field2908[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 + 1 == var10 && (this.field2908[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field2908[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var11 && var11 <= var13 && var9 - arg3 == var10 && (this.field2908[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg3) == var12 && var9 >= var10 && var14 >= var9 && (this.field2908[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var10 <= var9 && var9 <= var14 && (this.field2908[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IBI)V", line = 267)
    public final void method1424(int arg0, byte arg1, int arg2) {
        field2910++;
        int var4 = arg0 - this.field2912;
        if (arg1 != 17) {
            this.method1425(-117);
        }
        int var5 = arg2 - this.field2896;
        this.field2908[var5][var4] = class670.method3699(this.field2908[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V", line = 281)
    public final void method1425(int arg0) {
        if (arg0 != -1) {
            this.method1436(28, -64, 64);
        }
        for (int var2 = 0; var2 < this.field2903; var2++) {
            for (int var3 = 0; var3 < this.field2911; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field2903 - 5 || (this.field2911 - 5) <= var3) {
                    this.field2908[var2][var3] = -1;
                } else {
                    this.field2908[var2][var3] = 2097152;
                }
            }
        }
        field2902++;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIII)V", line = 315)
    private final void method1426(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -103) {
            this.field2912 = 71;
        }
        this.field2908[arg3][arg1] = class519.method3018(this.field2908[arg3][arg1], ~arg0);
        field2907++;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V", line = 332)
    public static void method1427(int arg0) {
        if (arg0 != -1) {
            method1427(15);
        }
        field2905 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZIIIZ)V", line = 346)
    public final void method1428(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2904++;
        int var8 = arg4 - this.field2896;
        int var9 = arg0 - this.field2912;
        int var10 = -24 / ((arg1 + 64) / 53);
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method1422((byte) 62, 128, var9, var8);
                this.method1422((byte) -128, 8, var9, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1422((byte) -77, 2, var9, var8);
                this.method1422((byte) -92, 32, var9 + 1, var8);
            }
            if (arg5 == 2) {
                this.method1422((byte) -124, 8, var9, var8);
                this.method1422((byte) -79, 128, var9, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1422((byte) -121, 32, var9, var8);
                this.method1422((byte) 105, 2, var9 - 1, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method1422((byte) 99, 1, var9, var8);
                this.method1422((byte) -94, 16, var9 + 1, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1422((byte) 45, 4, var9, var8);
                this.method1422((byte) 37, 64, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1422((byte) 113, 16, var9, var8);
                this.method1422((byte) -105, 1, var9 - 1, var8 - -1);
            }
            if (arg5 == 3) {
                this.method1422((byte) 64, 64, var9, var8);
                this.method1422((byte) -111, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method1422((byte) 52, 130, var9, var8);
                this.method1422((byte) 40, 8, var9, var8 - 1);
                this.method1422((byte) -106, 32, var9 + 1, var8);
            }
            if (arg5 == 1) {
                this.method1422((byte) -124, 10, var9, var8);
                this.method1422((byte) 40, 32, var9 + 1, var8);
                this.method1422((byte) 40, 128, var9, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1422((byte) 76, 40, var9, var8);
                this.method1422((byte) -98, 128, var9, var8 + 1);
                this.method1422((byte) 71, 2, var9 - 1, var8);
            }
            if (arg5 == 3) {
                this.method1422((byte) 122, 160, var9, var8);
                this.method1422((byte) 61, 2, var9 - 1, var8);
                this.method1422((byte) -118, 8, var9, var8 - 1);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method1422((byte) 99, 65536, var9, var8);
                    this.method1422((byte) 62, 4096, var9, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method1422((byte) 82, 1024, var9, var8);
                    this.method1422((byte) -103, 16384, var9 + 1, var8);
                }
                if (arg5 == 2) {
                    this.method1422((byte) 113, 4096, var9, var8);
                    this.method1422((byte) -122, 65536, var9, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method1422((byte) -102, 16384, var9, var8);
                    this.method1422((byte) 76, 1024, var9 - 1, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method1422((byte) -97, 512, var9, var8);
                    this.method1422((byte) 68, 8192, var9 + 1, var8 + -1);
                }
                if (arg5 == 1) {
                    this.method1422((byte) -119, 2048, var9, var8);
                    this.method1422((byte) -89, 32768, var9 + 1, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1422((byte) -125, 8192, var9, var8);
                    this.method1422((byte) -116, 512, var9 - 1, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method1422((byte) -122, 32768, var9, var8);
                    this.method1422((byte) -87, 2048, var9 - 1, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method1422((byte) 112, 66560, var9, var8);
                    this.method1422((byte) -89, 4096, var9, var8 - 1);
                    this.method1422((byte) -120, 16384, var9 + 1, var8);
                }
                if (arg5 == 1) {
                    this.method1422((byte) -102, 5120, var9, var8);
                    this.method1422((byte) 111, 16384, var9 + 1, var8);
                    this.method1422((byte) -125, 65536, var9, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1422((byte) 80, 20480, var9, var8);
                    this.method1422((byte) 54, 65536, var9, var8 + 1);
                    this.method1422((byte) 39, 1024, var9 - 1, var8);
                }
                if (arg5 == 3) {
                    this.method1422((byte) 79, 81920, var9, var8);
                    this.method1422((byte) 126, 1024, var9 - 1, var8);
                    this.method1422((byte) 118, 4096, var9, var8 - 1);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method1422((byte) -112, 536870912, var9, var8);
                this.method1422((byte) -125, 33554432, var9, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1422((byte) 83, 8388608, var9, var8);
                this.method1422((byte) -94, 134217728, var9 + 1, var8);
            }
            if (arg5 == 2) {
                this.method1422((byte) -113, 33554432, var9, var8);
                this.method1422((byte) 44, 536870912, var9, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1422((byte) -108, 134217728, var9, var8);
                this.method1422((byte) -100, 8388608, var9 - 1, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method1422((byte) -95, 4194304, var9, var8);
                this.method1422((byte) -101, 67108864, var9 + 1, var8 + -1);
            }
            if (arg5 == 1) {
                this.method1422((byte) -87, 16777216, var9, var8);
                this.method1422((byte) -126, 268435456, var9 + 1, var8 - -1);
            }
            if (arg5 == 2) {
                this.method1422((byte) -81, 67108864, var9, var8);
                this.method1422((byte) 114, 4194304, var9 - 1, var8 - -1);
            }
            if (arg5 == 3) {
                this.method1422((byte) 88, 268435456, var9, var8);
                this.method1422((byte) 61, 16777216, var9 - 1, var8 + -1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1422((byte) -128, 545259520, var9, var8);
            this.method1422((byte) -96, 33554432, var9, var8 - 1);
            this.method1422((byte) -123, 134217728, var9 + 1, var8);
        }
        if (arg5 == 1) {
            this.method1422((byte) 113, 41943040, var9, var8);
            this.method1422((byte) -84, 134217728, var9 + 1, var8);
            this.method1422((byte) -114, 536870912, var9, var8 + 1);
        }
        if (arg5 == 2) {
            this.method1422((byte) 83, 167772160, var9, var8);
            this.method1422((byte) 109, 536870912, var9, var8 + 1);
            this.method1422((byte) 95, 8388608, var9 - 1, var8);
        }
        if (arg5 == 3) {
            this.method1422((byte) -76, 671088640, var9, var8);
            this.method1422((byte) 56, 8388608, var9 - 1, var8);
            this.method1422((byte) -95, 33554432, var9, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V", line = 651)
    public final void method1429(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.method1433(1, 58, (byte) -26, false, true, -6, 38);
        }
        int var4 = arg2 - this.field2912;
        int var5 = arg0 - this.field2896;
        field2913++;
        this.field2908[var5][var4] = class519.method3018(this.field2908[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZIII)Z", line = 668)
    public final boolean method1430(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field2915++;
        if (arg2 == 1) {
            if (arg1 == arg6 && arg3 == arg7) {
                return true;
            }
        } else if (arg6 <= arg1 && arg2 + arg6 - 1 >= arg1 && arg3 >= arg3 && arg3 <= (arg3 + arg2 - 1)) {
            return true;
        }
        if (!arg4) {
            return true;
        }
        int var9 = arg3 - this.field2912;
        int var10 = arg7 - this.field2912;
        int var11 = arg1 - this.field2896;
        int var12 = arg6 - this.field2896;
        if (arg2 == 1) {
            if (arg0 == 0) {
                if (arg5 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field2908[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field2908[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field2908[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field2908[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                    if (var11 - 1 == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg5 == 0) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field2908[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field2908[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field2908[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field2908[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field2908[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field2908[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field2908[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var12 - 1;
            int var14 = arg2 + var10 - 1;
            if (arg0 == 0) {
                if (arg5 == 0) {
                    if (var11 - arg2 == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 + 1 == var10 && (this.field2908[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg2) == var10 && (this.field2908[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 >= var12 && var11 <= var13 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var11 - arg2 == var12 && var9 >= var10 && var14 >= var9 && (this.field2908[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var14 >= var9 && (this.field2908[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 + 1) == var12 && var9 >= var10 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 + 1 == var10 && (this.field2908[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 - arg2 == var10 && (this.field2908[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 >= var12 && var11 <= var13 && var9 - arg2 == var10) {
                        return true;
                    }
                    if (var11 - arg2 == var12 && var9 >= var10 && var14 >= var9 && (this.field2908[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14 && (this.field2908[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg5 == 0) {
                    if (var11 - arg2 == var12 && var9 >= var10 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 <= var9 && var9 <= var14 && (this.field2908[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 - arg2 == var10 && (this.field2908[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 - arg2 == var12 && var10 <= var9 && var14 >= var9 && (this.field2908[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 - arg2 == var10 && (this.field2908[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 - arg2) == var12 && var10 <= var9 && var9 <= var14 && (this.field2908[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field2908[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var9 - arg2 == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 - arg2 == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10 && (this.field2908[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 <= var9 && var14 >= var9 && (this.field2908[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg2) == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var12 <= var11 && var13 >= var11 && var9 + 1 == var10 && (this.field2908[var11][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 >= var12 && var11 <= var13 && var9 - arg2 == var10 && (this.field2908[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var11 - arg2 == var12 && var9 >= var10 && var9 <= var14 && (this.field2908[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14 && (this.field2908[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZZIIIZ)V", line = 1037)
    public final void method1431(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2916++;
        int var8 = 256;
        if (arg2) {
            var8 |= 0x20000;
        }
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var9 = arg3 - this.field2912;
        int var10 = arg0 - this.field2896;
        if (!arg6) {
            return;
        }
        for (int var11 = var10; var11 < arg5 + var10; var11++) {
            if (var11 >= 0 && this.field2903 > var11) {
                for (int var12 = var9; var12 < arg4 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2911) {
                        this.method1422((byte) 66, var8, var12, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)V", line = 1087)
    public final void method1432(int arg0, int arg1, int arg2) {
        field2899++;
        int var4 = arg0 - this.field2912;
        int var5 = arg2 - this.field2896;
        if (arg1 == -1537) {
            this.field2908[var5][var4] = class670.method3699(this.field2908[var5][var4], 262144);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIBZZII)V", line = 1100)
    public final void method1433(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field2896;
        int var9 = 59 / ((-arg2 - 79) / 39);
        int var10 = arg1 - this.field2912;
        field2900++;
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method1426(128, var10, -115, var8);
                this.method1426(8, var10, -125, var8 - 1);
            }
            if (arg6 == 1) {
                this.method1426(2, var10, -111, var8);
                this.method1426(32, var10 + 1, -128, var8);
            }
            if (arg6 == 2) {
                this.method1426(8, var10, -104, var8);
                this.method1426(128, var10, -115, var8 + 1);
            }
            if (arg6 == 3) {
                this.method1426(32, var10, -109, var8);
                this.method1426(2, var10 - 1, -115, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method1426(1, var10, -120, var8);
                this.method1426(16, var10 + 1, -116, var8 - 1);
            }
            if (arg6 == 1) {
                this.method1426(4, var10, -126, var8);
                this.method1426(64, var10 + 1, -108, var8 + 1);
            }
            if (arg6 == 2) {
                this.method1426(16, var10, -110, var8);
                this.method1426(1, var10 - 1, -116, var8 + 1);
            }
            if (arg6 == 3) {
                this.method1426(64, var10, -122, var8);
                this.method1426(4, var10 - 1, -114, var8 + -1);
            }
        }
        if (arg5 == 2) {
            if (arg6 == 0) {
                this.method1426(130, var10, -128, var8);
                this.method1426(8, var10, -124, var8 - 1);
                this.method1426(32, var10 + 1, -107, var8);
            }
            if (arg6 == 1) {
                this.method1426(10, var10, -128, var8);
                this.method1426(32, var10 + 1, -112, var8);
                this.method1426(128, var10, -109, var8 + 1);
            }
            if (arg6 == 2) {
                this.method1426(40, var10, -122, var8);
                this.method1426(128, var10, -117, var8 + 1);
                this.method1426(2, var10 - 1, -119, var8);
            }
            if (arg6 == 3) {
                this.method1426(160, var10, -119, var8);
                this.method1426(2, var10 - 1, -127, var8);
                this.method1426(8, var10, -108, var8 - 1);
            }
        }
        if (arg4) {
            if (arg5 == 0) {
                if (arg6 == 0) {
                    this.method1426(65536, var10, -105, var8);
                    this.method1426(4096, var10, -127, var8 - 1);
                }
                if (arg6 == 1) {
                    this.method1426(1024, var10, -124, var8);
                    this.method1426(16384, var10 + 1, -118, var8);
                }
                if (arg6 == 2) {
                    this.method1426(4096, var10, -120, var8);
                    this.method1426(65536, var10, -126, var8 + 1);
                }
                if (arg6 == 3) {
                    this.method1426(16384, var10, -121, var8);
                    this.method1426(1024, var10 - 1, -128, var8);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg6 == 0) {
                    this.method1426(512, var10, -119, var8);
                    this.method1426(8192, var10 + 1, -112, var8 + -1);
                }
                if (arg6 == 1) {
                    this.method1426(2048, var10, -113, var8);
                    this.method1426(32768, var10 + 1, -104, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method1426(8192, var10, -117, var8);
                    this.method1426(512, var10 - 1, -117, var8 + 1);
                }
                if (arg6 == 3) {
                    this.method1426(32768, var10, -115, var8);
                    this.method1426(2048, var10 - 1, -116, var8 + -1);
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    this.method1426(66560, var10, -121, var8);
                    this.method1426(4096, var10, -112, var8 - 1);
                    this.method1426(16384, var10 + 1, -121, var8);
                }
                if (arg6 == 1) {
                    this.method1426(5120, var10, -108, var8);
                    this.method1426(16384, var10 + 1, -112, var8);
                    this.method1426(65536, var10, -127, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method1426(20480, var10, -107, var8);
                    this.method1426(65536, var10, -111, var8 + 1);
                    this.method1426(1024, var10 - 1, -123, var8);
                }
                if (arg6 == 3) {
                    this.method1426(81920, var10, -123, var8);
                    this.method1426(1024, var10 - 1, -124, var8);
                    this.method1426(4096, var10, -111, var8 - 1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method1426(536870912, var10, -124, var8);
                this.method1426(33554432, var10, -121, var8 - 1);
            }
            if (arg6 == 1) {
                this.method1426(8388608, var10, -112, var8);
                this.method1426(134217728, var10 + 1, -112, var8);
            }
            if (arg6 == 2) {
                this.method1426(33554432, var10, -122, var8);
                this.method1426(536870912, var10, -110, var8 + 1);
            }
            if (arg6 == 3) {
                this.method1426(134217728, var10, -104, var8);
                this.method1426(8388608, var10 - 1, -117, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method1426(4194304, var10, -111, var8);
                this.method1426(67108864, var10 + 1, -127, var8 - 1);
            }
            if (arg6 == 1) {
                this.method1426(16777216, var10, -122, var8);
                this.method1426(268435456, var10 + 1, -128, var8 + 1);
            }
            if (arg6 == 2) {
                this.method1426(67108864, var10, -128, var8);
                this.method1426(4194304, var10 - 1, -118, var8 + 1);
            }
            if (arg6 == 3) {
                this.method1426(268435456, var10, -104, var8);
                this.method1426(16777216, var10 - 1, -113, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method1426(545259520, var10, -109, var8);
            this.method1426(33554432, var10, -113, var8 - 1);
            this.method1426(134217728, var10 + 1, -112, var8);
        }
        if (arg6 == 1) {
            this.method1426(41943040, var10, -123, var8);
            this.method1426(134217728, var10 + 1, -124, var8);
            this.method1426(536870912, var10, -118, var8 + 1);
        }
        if (arg6 == 2) {
            this.method1426(167772160, var10, -127, var8);
            this.method1426(536870912, var10, -113, var8 + 1);
            this.method1426(8388608, var10 - 1, -118, var8);
        }
        if (arg6 == 3) {
            this.method1426(671088640, var10, -111, var8);
            this.method1426(8388608, var10 - 1, -126, var8);
            this.method1426(33554432, var10, -115, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIII)Z", line = 1411)
    public final boolean method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2894++;
        if (arg1 > 1) {
            return class452.method2688(arg2, arg8, arg1, -65535, arg5, arg0, arg1, arg3, arg6) ? true : this.method1435(32, arg0, arg3, arg1, arg4, arg1, arg5, arg2, arg6, arg8);
        }
        int var10 = arg2 + arg0 - 1;
        int var11 = arg5 + arg3 - 1;
        if (arg7 != 256) {
            this.field2912 = -69;
        }
        if (arg2 <= arg8 && var10 >= arg8 && arg5 <= arg6 && arg6 <= var11) {
            return true;
        } else if ((arg2 - 1) == arg8 && arg6 >= arg5 && arg6 <= var11 && (this.field2908[arg8 - this.field2896][arg6 - this.field2912] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg8 && arg6 >= arg5 && arg6 <= var11 && (this.field2908[arg8 - this.field2896][arg6 - this.field2912] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg6 && arg2 <= arg8 && arg8 <= var10 && (this.field2908[arg8 - this.field2896][arg6 - this.field2912] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg6 && arg2 <= arg8 && arg8 <= var10 && (this.field2908[arg8 - this.field2896][arg6 - this.field2912] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1454)
    public final boolean method1435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2906++;
        int var11 = arg5 + arg9;
        if (arg0 != 32) {
            return false;
        }
        int var12 = arg3 + arg8;
        int var13 = arg1 + arg7;
        int var14 = arg6 + arg2;
        if (arg9 == var13 && (arg4 & 0x2) == 0) {
            int var15 = arg6 < arg8 ? arg8 : arg6;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field2908[var13 - this.field2896 - 1][var15 - this.field2912] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg7 == var11 && (arg4 & 0x8) == 0) {
            int var17 = arg6 < arg8 ? arg8 : arg6;
            int var18 = var14 > var12 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field2908[arg7 - this.field2896][var17 - this.field2912] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg8 == var14 && (arg4 & 0x1) == 0) {
            int var19 = arg7 < arg9 ? arg9 : arg7;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field2908[var19 - this.field2896][var14 - this.field2912 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg6 == var12 && (arg4 & 0x4) == 0) {
            int var21 = arg7 >= arg9 ? arg7 : arg9;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field2908[var21 - this.field2896][arg6 - this.field2912] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(III)V", line = 1550)
    public final void method1436(int arg0, int arg1, int arg2) {
        field2901++;
        if (arg2 == -17953) {
            int var4 = arg1 - this.field2896;
            int var5 = arg0 - this.field2912;
            this.field2908[var4][var5] = class519.method3018(this.field2908[var4][var5], -262145);
        }
    }
}
