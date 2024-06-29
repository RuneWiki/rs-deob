import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class415 {

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "[Lgb;")
    public static class228[] field5422 = new class228[50];

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "Llja;")
    public static class744 field5431 = new class744(67, 12);

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Lml;")
    public static class408 field5433 = new class408();

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public static int field5436 = 0;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public int field5415;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public int field5424;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public int field5425;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public int field5435;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "Lnh;")
    public static class778 field5434;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "[[I")
    public int[][] field5428;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V", line = 3)
    public final void method2470(int arg0, int arg1, byte arg2) {
        if (arg2 != 108) {
            this.field5428 = null;
        }
        field5420++;
        int var4 = arg1 - this.field5415;
        int var5 = arg0 - this.field5435;
        this.field5428[var5][var4] = class296.method1733(this.field5428[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZIIZBII)V", line = 19)
    public final void method2471(boolean arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        if (arg4 >= -27) {
            return;
        }
        int var8 = arg6 - this.field5415;
        field5423++;
        int var9 = arg2 - this.field5435;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method2472(74, 128, var8, var9);
                this.method2472(92, 8, var8, var9 - 1);
            }
            if (arg1 == 1) {
                this.method2472(120, 2, var8, var9);
                this.method2472(98, 32, var8 + 1, var9);
            }
            if (arg1 == 2) {
                this.method2472(82, 8, var8, var9);
                this.method2472(95, 128, var8, var9 + 1);
            }
            if (arg1 == 3) {
                this.method2472(113, 32, var8, var9);
                this.method2472(83, 2, var8 - 1, var9);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method2472(102, 1, var8, var9);
                this.method2472(78, 16, var8 + 1, var9 + -1);
            }
            if (arg1 == 1) {
                this.method2472(88, 4, var8, var9);
                this.method2472(93, 64, var8 + 1, var9 + 1);
            }
            if (arg1 == 2) {
                this.method2472(115, 16, var8, var9);
                this.method2472(114, 1, var8 - 1, var9 + 1);
            }
            if (arg1 == 3) {
                this.method2472(78, 64, var8, var9);
                this.method2472(79, 4, var8 - 1, var9 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method2472(102, 130, var8, var9);
                this.method2472(114, 8, var8, var9 - 1);
                this.method2472(74, 32, var8 + 1, var9);
            }
            if (arg1 == 1) {
                this.method2472(115, 10, var8, var9);
                this.method2472(76, 32, var8 + 1, var9);
                this.method2472(82, 128, var8, var9 + 1);
            }
            if (arg1 == 2) {
                this.method2472(90, 40, var8, var9);
                this.method2472(118, 128, var8, var9 + 1);
                this.method2472(114, 2, var8 - 1, var9);
            }
            if (arg1 == 3) {
                this.method2472(79, 160, var8, var9);
                this.method2472(118, 2, var8 - 1, var9);
                this.method2472(75, 8, var8, var9 - 1);
            }
        }
        if (arg0) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    this.method2472(96, 65536, var8, var9);
                    this.method2472(91, 4096, var8, var9 - 1);
                }
                if (arg1 == 1) {
                    this.method2472(105, 1024, var8, var9);
                    this.method2472(110, 16384, var8 + 1, var9);
                }
                if (arg1 == 2) {
                    this.method2472(107, 4096, var8, var9);
                    this.method2472(104, 65536, var8, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method2472(109, 16384, var8, var9);
                    this.method2472(120, 1024, var8 - 1, var9);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg1 == 0) {
                    this.method2472(106, 512, var8, var9);
                    this.method2472(112, 8192, var8 + 1, var9 + -1);
                }
                if (arg1 == 1) {
                    this.method2472(88, 2048, var8, var9);
                    this.method2472(96, 32768, var8 + 1, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method2472(125, 8192, var8, var9);
                    this.method2472(89, 512, var8 - 1, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method2472(118, 32768, var8, var9);
                    this.method2472(94, 2048, var8 - 1, var9 + -1);
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    this.method2472(89, 66560, var8, var9);
                    this.method2472(77, 4096, var8, var9 - 1);
                    this.method2472(103, 16384, var8 + 1, var9);
                }
                if (arg1 == 1) {
                    this.method2472(103, 5120, var8, var9);
                    this.method2472(124, 16384, var8 + 1, var9);
                    this.method2472(103, 65536, var8, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method2472(94, 20480, var8, var9);
                    this.method2472(86, 65536, var8, var9 + 1);
                    this.method2472(110, 1024, var8 - 1, var9);
                }
                if (arg1 == 3) {
                    this.method2472(94, 81920, var8, var9);
                    this.method2472(87, 1024, var8 - 1, var9);
                    this.method2472(125, 4096, var8, var9 - 1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method2472(82, 536870912, var8, var9);
                this.method2472(124, 33554432, var8, var9 - 1);
            }
            if (arg1 == 1) {
                this.method2472(79, 8388608, var8, var9);
                this.method2472(83, 134217728, var8 + 1, var9);
            }
            if (arg1 == 2) {
                this.method2472(94, 33554432, var8, var9);
                this.method2472(85, 536870912, var8, var9 + 1);
            }
            if (arg1 == 3) {
                this.method2472(105, 134217728, var8, var9);
                this.method2472(104, 8388608, var8 - 1, var9);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method2472(110, 4194304, var8, var9);
                this.method2472(111, 67108864, var8 + 1, var9 + -1);
            }
            if (arg1 == 1) {
                this.method2472(85, 16777216, var8, var9);
                this.method2472(74, 268435456, var8 + 1, var9 - -1);
            }
            if (arg1 == 2) {
                this.method2472(81, 67108864, var8, var9);
                this.method2472(106, 4194304, var8 - 1, var9 + 1);
            }
            if (arg1 == 3) {
                this.method2472(82, 268435456, var8, var9);
                this.method2472(100, 16777216, var8 - 1, var9 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method2472(96, 545259520, var8, var9);
            this.method2472(117, 33554432, var8, var9 - 1);
            this.method2472(115, 134217728, var8 + 1, var9);
        }
        if (arg1 == 1) {
            this.method2472(102, 41943040, var8, var9);
            this.method2472(117, 134217728, var8 + 1, var9);
            this.method2472(86, 536870912, var8, var9 + 1);
        }
        if (arg1 == 2) {
            this.method2472(109, 167772160, var8, var9);
            this.method2472(109, 536870912, var8, var9 + 1);
            this.method2472(110, 8388608, var8 - 1, var9);
        }
        if (arg1 == 3) {
            this.method2472(119, 671088640, var8, var9);
            this.method2472(77, 8388608, var8 - 1, var9);
            this.method2472(83, 33554432, var8, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)V", line = 331)
    private final void method2472(int arg0, int arg1, int arg2, int arg3) {
        this.field5428[arg3][arg2] = class5.method105(this.field5428[arg3][arg2], arg1);
        if (arg0 <= 72) {
            this.method2488(96, false, (byte) 81, -50, -91, 27, true);
        }
        field5429++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)Lwk;", line = 345)
    public static final class154 method2473(boolean arg0) {
        field5421++;
        class154 var1 = (class154) field5433.method2440(-55);
        if (var1 == null) {
            if (!arg0) {
                method2473(false);
            }
            return new class154();
        } else {
            class349.field4358--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIII)Z", line = 365)
    public final boolean method2474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5416++;
        if (arg0 >= -123) {
            this.method2477(98, false, 85, 70, false, false, -117, 114);
        }
        if (arg7 == 1) {
            if (arg1 == arg6 && arg2 == arg3) {
                return true;
            }
        } else if (arg1 >= arg6 && (arg7 + arg6 - 1) >= arg1 && arg3 <= arg3 && arg3 <= (arg3 - (1 - arg7))) {
            return true;
        }
        int var9 = arg3 - this.field5415;
        int var10 = arg1 - this.field5435;
        int var11 = arg6 - this.field5435;
        int var12 = arg2 - this.field5415;
        if (arg7 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field5428[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field5428[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field5428[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field5428[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field5428[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field5428[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 + 1 == var11 && var9 == var12 && (this.field5428[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field5428[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var10 == var11 && var9 + 1 == var12 && (this.field5428[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field5428[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field5428[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field5428[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var11 - 1;
            int var14 = var12 + arg7 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var10 + 1) == var11 && var12 <= var9 && var14 >= var9 && (this.field5428[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 - arg7 == var12 && (this.field5428[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - arg7 == var11 && var12 <= var9 && var9 <= var14 && (this.field5428[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var9 - arg7 == var12 && (this.field5428[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 - arg7) == var11 && var9 >= var12 && var14 >= var9 && (this.field5428[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 + 1) == var12 && (this.field5428[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 + 1 == var11 && var12 <= var9 && var14 >= var9 && (this.field5428[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var9 + 1 == var12 && (this.field5428[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var11 <= var10 && var13 >= var10 && (var9 + 1) == var12 && (this.field5428[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var10 && var13 >= var10 && (var9 - arg7) == var12 && (this.field5428[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg7 == var11 && var12 <= var9 && var14 >= var9 && (this.field5428[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var14 && (this.field5428[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIB)V", line = 558)
    public final void method2475(int arg0, int arg1, byte arg2) {
        field5430++;
        if (arg2 != -109) {
            field5433 = null;
        }
        int var4 = arg1 - this.field5435;
        int var5 = arg0 - this.field5415;
        this.field5428[var4][var5] = class5.method105(this.field5428[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBZ)Lrk;", line = 571)
    public static final class35 method2476(int arg0, byte arg1, boolean arg2) {
        int var3 = 11 / ((arg1 - 39) / 58);
        field5410++;
        class408[] var4 = class731.field10237;
        synchronized (class731.field10237) {
            class35 var5;
            if (arg0 >= class731.field10237.length || class731.field10237[arg0].method2445((byte) 74)) {
                var5 = new class35();
                var5.field537 = new class265[arg0];
                for (int var6 = 0; var6 < arg0; var6++) {
                    var5.field537[var6] = new class265();
                }
            } else {
                var5 = (class35) class731.field10237[arg0].method2446((byte) 94);
                var5.method892(50560);
                int var10002 = class772.field10618[arg0]--;
            }
            var5.field534 = arg2;
            return var5;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZIIZZII)V", line = 616)
    public final void method2477(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        field5413++;
        int var9 = 256;
        if (arg4) {
            var9 |= 0x20000;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg3;
            arg3 = arg6;
            arg6 = var10;
        }
        int var11 = arg7 - this.field5415;
        if (arg1) {
            var9 |= 0x40000000;
        }
        int var12 = arg2 - this.field5435;
        if (arg5) {
            return;
        }
        for (int var13 = var12; var13 < arg3 + var12; var13++) {
            if (var13 >= 0 && var13 < this.field5425) {
                for (int var14 = var11; var14 < (arg6 + var11); var14++) {
                    if (var14 >= 0 && var14 < this.field5424) {
                        this.method2486(var14, var13, 2, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBIIIIII)Z", line = 670)
    public final boolean method2478(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5418++;
        if (arg1 > 1) {
            return class631.method3566(arg7, arg1, arg0, arg4, arg1, arg6, arg3, (byte) -10, arg5) ? true : this.method2482(arg2 + 34, arg0, arg6, arg1, arg1, arg7, arg3, arg5, arg8, arg4);
        }
        int var10 = arg4 + arg6 - 1;
        int var11 = arg3 + arg0 - 1;
        if (arg5 >= arg4 && var10 >= arg5 && arg7 >= arg3 && arg7 <= var11) {
            return true;
        }
        if (arg2 != 37) {
            field5422 = null;
        }
        if ((arg4 - 1) == arg5 && arg7 >= arg3 && arg7 <= var11 && (this.field5428[arg5 - this.field5435][arg7 - this.field5415] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg5 && arg7 >= arg3 && arg7 <= var11 && (this.field5428[arg5 - this.field5435][arg7 - this.field5415] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if ((arg3 - 1) == arg7 && arg5 >= arg4 && arg5 <= var10 && (this.field5428[arg5 - this.field5435][arg7 - this.field5415] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg7 && arg5 >= arg4 && var10 >= arg5 && (this.field5428[arg5 - this.field5435][arg7 - this.field5415] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIIIIIII)Z", line = 713)
    public final boolean method2479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5426++;
        if (arg7 == 1) {
            if (arg4 == arg5 && arg1 == arg3) {
                return true;
            }
        } else if (arg5 <= arg4 && arg7 + arg5 - 1 >= arg4 && arg1 <= arg1 && arg1 <= (arg1 + arg7 - 1)) {
            return true;
        }
        int var9 = arg4 - this.field5435;
        int var10 = arg1 - this.field5415;
        int var11 = arg3 - this.field5415;
        if (arg0 != -1) {
            method2481(91);
        }
        int var12 = arg5 - this.field5435;
        if (arg7 == 1) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field5428[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field5428[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var9 - 1 == var12 && var10 == var11 && (this.field5428[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field5428[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field5428[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field5428[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field5428[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field5428[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field5428[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field5428[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field5428[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field5428[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field5428[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field5428[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field5428[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field5428[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var12 && (var10 + 1) == var11 && (this.field5428[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var10 - 1) == var11 && (this.field5428[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var12 && var10 == var11 && (this.field5428[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field5428[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg7 - 1;
            int var14 = arg7 + var11 - 1;
            if (arg2 == 0) {
                if (arg6 == 0) {
                    if ((var9 - arg7) == var12 && var10 >= var11 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 + 1 == var11 && (this.field5428[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 - arg7) == var11 && (this.field5428[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 <= var9 && var9 <= var13 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 - arg7 == var12 && var11 <= var10 && var10 <= var14 && (this.field5428[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 >= var11 && var10 <= var14 && (this.field5428[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 + 1 == var12 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var10 + 1) == var11 && (this.field5428[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 - arg7 == var11 && (this.field5428[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 >= var12 && var9 <= var13 && (var10 - arg7) == var11) {
                        return true;
                    }
                    if ((var9 - arg7) == var12 && var11 <= var10 && var10 <= var14 && (this.field5428[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 >= var11 && var14 >= var10 && (this.field5428[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    if (var9 - arg7 == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 <= var10 && var10 <= var14 && (this.field5428[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var10 - arg7) == var11 && (this.field5428[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 - arg7 == var12 && var11 <= var10 && var14 >= var10 && (this.field5428[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 - arg7 == var11 && (this.field5428[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 - arg7 == var12 && var11 <= var10 && var14 >= var10 && (this.field5428[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 + 1 == var11 && (this.field5428[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var10 - arg7 == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var9 - arg7) == var12 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var10 + 1 == var11 && (this.field5428[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 >= var11 && var10 <= var14 && (this.field5428[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 - arg7 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var12 <= var9 && var13 >= var9 && var10 + 1 == var11 && (this.field5428[var9][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 >= var12 && var9 <= var13 && (var10 - arg7) == var11 && (this.field5428[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg7 == var12 && var11 <= var10 && var14 >= var10 && (this.field5428[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 >= var11 && var10 <= var14 && (this.field5428[var12][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZIIIII)V", line = 1087)
    public final void method2480(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5432++;
        int var8 = arg5 - this.field5415;
        int var9 = arg6 - this.field5435;
        if (arg4 <= 64) {
            this.method2480(true, false, -62, -13, -37, -26, -13);
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method2486(var8, var9, 2, 128);
                this.method2486(var8, var9 - 1, 2, 8);
            }
            if (arg2 == 1) {
                this.method2486(var8, var9, 2, 2);
                this.method2486(var8 + 1, var9, 2, 32);
            }
            if (arg2 == 2) {
                this.method2486(var8, var9, 2, 8);
                this.method2486(var8, var9 + 1, 2, 128);
            }
            if (arg2 == 3) {
                this.method2486(var8, var9, 2, 32);
                this.method2486(var8 - 1, var9, 2, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method2486(var8, var9, 2, 1);
                this.method2486(var8 + 1, var9 + -1, 2, 16);
            }
            if (arg2 == 1) {
                this.method2486(var8, var9, 2, 4);
                this.method2486(var8 + 1, var9 + 1, 2, 64);
            }
            if (arg2 == 2) {
                this.method2486(var8, var9, 2, 16);
                this.method2486(var8 - 1, var9 + 1, 2, 1);
            }
            if (arg2 == 3) {
                this.method2486(var8, var9, 2, 64);
                this.method2486(var8 - 1, var9 + -1, 2, 4);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method2486(var8, var9, 2, 130);
                this.method2486(var8, var9 - 1, 2, 8);
                this.method2486(var8 + 1, var9, 2, 32);
            }
            if (arg2 == 1) {
                this.method2486(var8, var9, 2, 10);
                this.method2486(var8 + 1, var9, 2, 32);
                this.method2486(var8, var9 + 1, 2, 128);
            }
            if (arg2 == 2) {
                this.method2486(var8, var9, 2, 40);
                this.method2486(var8, var9 + 1, 2, 128);
                this.method2486(var8 - 1, var9, 2, 2);
            }
            if (arg2 == 3) {
                this.method2486(var8, var9, 2, 160);
                this.method2486(var8 - 1, var9, 2, 2);
                this.method2486(var8, var9 - 1, 2, 8);
            }
        }
        if (arg1) {
            if (arg3 == 0) {
                if (arg2 == 0) {
                    this.method2486(var8, var9, 2, 65536);
                    this.method2486(var8, var9 - 1, 2, 4096);
                }
                if (arg2 == 1) {
                    this.method2486(var8, var9, 2, 1024);
                    this.method2486(var8 + 1, var9, 2, 16384);
                }
                if (arg2 == 2) {
                    this.method2486(var8, var9, 2, 4096);
                    this.method2486(var8, var9 + 1, 2, 65536);
                }
                if (arg2 == 3) {
                    this.method2486(var8, var9, 2, 16384);
                    this.method2486(var8 - 1, var9, 2, 1024);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg2 == 0) {
                    this.method2486(var8, var9, 2, 512);
                    this.method2486(var8 + 1, var9 + -1, 2, 8192);
                }
                if (arg2 == 1) {
                    this.method2486(var8, var9, 2, 2048);
                    this.method2486(var8 + 1, var9 - -1, 2, 32768);
                }
                if (arg2 == 2) {
                    this.method2486(var8, var9, 2, 8192);
                    this.method2486(var8 - 1, var9 + 1, 2, 512);
                }
                if (arg2 == 3) {
                    this.method2486(var8, var9, 2, 32768);
                    this.method2486(var8 - 1, var9 - 1, 2, 2048);
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    this.method2486(var8, var9, 2, 66560);
                    this.method2486(var8, var9 - 1, 2, 4096);
                    this.method2486(var8 + 1, var9, 2, 16384);
                }
                if (arg2 == 1) {
                    this.method2486(var8, var9, 2, 5120);
                    this.method2486(var8 + 1, var9, 2, 16384);
                    this.method2486(var8, var9 + 1, 2, 65536);
                }
                if (arg2 == 2) {
                    this.method2486(var8, var9, 2, 20480);
                    this.method2486(var8, var9 + 1, 2, 65536);
                    this.method2486(var8 - 1, var9, 2, 1024);
                }
                if (arg2 == 3) {
                    this.method2486(var8, var9, 2, 81920);
                    this.method2486(var8 - 1, var9, 2, 1024);
                    this.method2486(var8, var9 - 1, 2, 4096);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method2486(var8, var9, 2, 536870912);
                this.method2486(var8, var9 - 1, 2, 33554432);
            }
            if (arg2 == 1) {
                this.method2486(var8, var9, 2, 8388608);
                this.method2486(var8 + 1, var9, 2, 134217728);
            }
            if (arg2 == 2) {
                this.method2486(var8, var9, 2, 33554432);
                this.method2486(var8, var9 + 1, 2, 536870912);
            }
            if (arg2 == 3) {
                this.method2486(var8, var9, 2, 134217728);
                this.method2486(var8 - 1, var9, 2, 8388608);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method2486(var8, var9, 2, 4194304);
                this.method2486(var8 + 1, var9 + -1, 2, 67108864);
            }
            if (arg2 == 1) {
                this.method2486(var8, var9, 2, 16777216);
                this.method2486(var8 + 1, var9 + 1, 2, 268435456);
            }
            if (arg2 == 2) {
                this.method2486(var8, var9, 2, 67108864);
                this.method2486(var8 - 1, var9 + 1, 2, 4194304);
            }
            if (arg2 == 3) {
                this.method2486(var8, var9, 2, 268435456);
                this.method2486(var8 - 1, var9 + -1, 2, 16777216);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method2486(var8, var9, 2, 545259520);
            this.method2486(var8, var9 - 1, 2, 33554432);
            this.method2486(var8 + 1, var9, 2, 134217728);
        }
        if (arg2 == 1) {
            this.method2486(var8, var9, 2, 41943040);
            this.method2486(var8 + 1, var9, 2, 134217728);
            this.method2486(var8, var9 + 1, 2, 536870912);
        }
        if (arg2 == 2) {
            this.method2486(var8, var9, 2, 167772160);
            this.method2486(var8, var9 + 1, 2, 536870912);
            this.method2486(var8 - 1, var9, 2, 8388608);
        }
        if (arg2 == 3) {
            this.method2486(var8, var9, 2, 671088640);
            this.method2486(var8 - 1, var9, 2, 8388608);
            this.method2486(var8, var9 - 1, 2, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 1393)
    public static final void method2481(int arg0) {
        if (arg0 != 29116) {
            method2473(false);
        }
        field5417++;
        if (class289.field3493 == 7) {
            class268.method1590(12, false);
        } else {
            class13.field223 = class436.field5748;
            class436.field5748 = null;
            class48.method454(13, -1);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1419)
    public final boolean method2482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5414++;
        int var11 = arg3 + arg7;
        int var12 = arg4 + arg5;
        int var13 = -49 / ((-arg0 - 48) / 37);
        int var14 = arg9 + arg2;
        int var15 = arg1 + arg6;
        if (arg7 == var14 && (arg8 & 0x2) == 0) {
            int var16 = arg6 < arg5 ? arg5 : arg6;
            int var17 = var12 < var15 ? var12 : var15;
            while (var16 < var17) {
                if ((this.field5428[var14 - this.field5435 - 1][var16 - this.field5415] & 0x8) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg9 == var11 && (arg8 & 0x8) == 0) {
            int var18 = arg5 <= arg6 ? arg6 : arg5;
            int var19 = var12 < var15 ? var12 : var15;
            while (var19 > var18) {
                if ((this.field5428[arg9 - this.field5435][var18 - this.field5415] & 0x80) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg5 == var15 && (arg8 & 0x1) == 0) {
            int var20 = arg9 >= arg7 ? arg9 : arg7;
            int var21 = var14 <= var11 ? var14 : var11;
            while (var20 < var21) {
                if ((this.field5428[var20 - this.field5435][var15 - this.field5415 - 1] & 0x2) == 0) {
                    return true;
                }
                var20++;
            }
        } else if (arg6 == var12 && (arg8 & 0x4) == 0) {
            int var22 = arg7 <= arg9 ? arg9 : arg7;
            int var23 = var11 < var14 ? var11 : var14;
            while (var23 > var22) {
                if ((this.field5428[var22 - this.field5435][arg6 - this.field5415] & 0x20) == 0) {
                    return true;
                }
                var22++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V", line = 1510)
    public static void method2483(int arg0) {
        field5433 = null;
        if (arg0 != 1) {
            field5433 = null;
        }
        field5434 = null;
        field5431 = null;
        field5422 = null;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(IIB)V", line = 1524)
    public final void method2484(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field5415;
        if (arg2 <= -37) {
            int var5 = arg1 - this.field5435;
            field5411++;
            this.field5428[var5][var4] = class296.method1733(this.field5428[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZII)V", line = 1545)
    public final void method2485(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field5436 = 0;
        }
        field5427++;
        int var4 = arg2 - this.field5435;
        int var5 = arg1 - this.field5415;
        this.field5428[var4][var5] = class5.method105(this.field5428[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIII)V", line = 1568)
    private final void method2486(int arg0, int arg1, int arg2, int arg3) {
        this.field5428[arg1][arg0] = class296.method1733(this.field5428[arg1][arg0], ~arg3);
        if (arg2 != 2) {
            this.field5428 = null;
        }
        field5412++;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 1581)
    public final void method2487(int arg0) {
        for (int var2 = 0; var2 < this.field5425; var2++) {
            for (int var3 = 0; var3 < this.field5424; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field5425 - 5) || this.field5424 - 5 <= var3) {
                    this.field5428[var2][var3] = -1;
                } else {
                    this.field5428[var2][var3] = 2097152;
                }
            }
        }
        field5419++;
        if (arg0 != 19666) {
            this.method2482(-7, 69, -122, 99, 19, -19, 105, -22, -2, -37);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZBIIIZ)V", line = 1614)
    public final void method2488(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5409++;
        int var8 = 35 % ((arg2 + 2) / 47);
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        int var10 = arg0 - this.field5435;
        if (arg6) {
            var9 |= 0x40000000;
        }
        int var11 = arg3 - this.field5415;
        for (int var12 = var10; var12 < (arg4 + var10); var12++) {
            if (var12 >= 0 && this.field5425 > var12) {
                for (int var13 = var11; var13 < (arg5 + var11); var13++) {
                    if (var13 >= 0 && this.field5424 > var13) {
                        this.method2472(73, var9, var13, var12);
                    }
                }
            }
        }
    }
}
