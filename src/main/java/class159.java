import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class159 {

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Ldh;")
    public static class216 field2439 = new class216(11, 7);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Lun;")
    public static class298 field2443;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "[[I")
    public int[][] field2427;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V", line = 3)
    public final void method1109(int arg0, int arg1, int arg2) {
        if (arg2 < 103) {
            this.method1117(true, -73, 61, 40, true, 125, 29);
        }
        field2425++;
        int var4 = arg1 - this.field2437;
        int var5 = arg0 - this.field2440;
        this.field2427[var5][var4] = class168.method1203(this.field2427[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIIZIBI)V", line = 16)
    public final void method1110(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        field2432++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        int var9 = arg2 - this.field2440;
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var10 = arg6 - this.field2437;
        if (arg5 >= -98) {
            return;
        }
        for (int var11 = var9; var11 < (var9 + arg1); var11++) {
            if (var11 >= 0 && var11 < this.field2438) {
                for (int var12 = var10; var12 < (arg4 + var10); var12++) {
                    if (var12 >= 0 && this.field2441 > var12) {
                        this.method1127(var11, (byte) 19, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIIIIIIIII)Z", line = 63)
    public final boolean method1111(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2436++;
        int var11 = arg4 + arg2;
        int var12 = arg6 + arg8;
        if (arg0 != -60) {
            return false;
        }
        int var13 = arg1 + arg7;
        int var14 = arg3 + arg5;
        if (arg4 == var13 && (arg9 & 0x2) == 0) {
            int var15 = arg8 > arg3 ? arg8 : arg3;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field2427[var13 - (this.field2440 + 1)][var15 - this.field2437] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg1 == var11 && (arg9 & 0x8) == 0) {
            int var17 = arg3 >= arg8 ? arg3 : arg8;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field2427[arg1 - this.field2440][var17 - this.field2437] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg8 == var14 && (arg9 & 0x1) == 0) {
            int var19 = arg1 >= arg4 ? arg1 : arg4;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field2427[var19 - this.field2440][var14 - this.field2437 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg9 & 0x4) == 0) {
            int var21 = arg4 <= arg1 ? arg1 : arg4;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field2427[var21 - this.field2440][arg3 - this.field2437] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V", line = 157)
    public final void method1112(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2437;
        field2435++;
        int var5 = arg0 - this.field2440;
        this.field2427[var5][var4] = class442.method2600(this.field2427[var5][var4], 2097152);
        int var6 = -124 / ((arg2 + 35) / 35);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIB)Z", line = 177)
    public static final boolean method1113(int arg0, int arg1, byte arg2) {
        if (arg2 != 109) {
            method1128((byte) 24);
        }
        field2431++;
        return class227.method1523(16, arg1, arg0) | (arg1 & 0x60000) != 0 || class437.method2573(arg0, (byte) -120, arg1) || class344.method2180(arg0, (byte) -126, arg1);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([BI)Z", line = 188)
    public static final boolean method1114(byte[] arg0, int arg1) {
        field2447++;
        class519 var2 = new class519(arg0);
        int var3 = var2.method3072((byte) -128);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method3072((byte) -124) == 1;
        if (var4) {
            class63.method516((byte) 112, var2);
        }
        if (arg1 == 21687) {
            class83.method614(var2, 5307);
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lci;III)Lgg;", line = 214)
    public static final class119 method1115(class320 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -4) {
            field2443 = null;
        }
        field2423++;
        byte[] var4 = arg0.method2037(arg1, (byte) 110, arg3);
        return var4 == null ? null : new class119(var4);
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(III)Z", line = 231)
    public static final boolean method1116(int arg0, int arg1, int arg2) {
        field2444++;
        if (arg1 != 1408) {
            field2443 = null;
        }
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIIIZII)V", line = 245)
    public final void method1117(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg1 - this.field2440;
        field2445++;
        int var9 = arg3 - this.field2437;
        if (arg6 != 2883848) {
            method1115(null, -104, 123, 68);
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method1127(var8, (byte) 19, var9, 128);
                this.method1127(var8 - 1, (byte) 19, var9, 8);
            }
            if (arg5 == 1) {
                this.method1127(var8, (byte) 19, var9, 2);
                this.method1127(var8, (byte) 19, var9 + 1, 32);
            }
            if (arg5 == 2) {
                this.method1127(var8, (byte) 19, var9, 8);
                this.method1127(var8 + 1, (byte) 19, var9, 128);
            }
            if (arg5 == 3) {
                this.method1127(var8, (byte) 19, var9, 32);
                this.method1127(var8, (byte) 19, var9 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method1127(var8, (byte) 19, var9, 1);
                this.method1127(var8 - 1, (byte) 19, var9 + 1, 16);
            }
            if (arg5 == 1) {
                this.method1127(var8, (byte) 19, var9, 4);
                this.method1127(var8 + 1, (byte) 19, var9 + 1, 64);
            }
            if (arg5 == 2) {
                this.method1127(var8, (byte) 19, var9, 16);
                this.method1127(var8 + 1, (byte) 19, var9 - 1, 1);
            }
            if (arg5 == 3) {
                this.method1127(var8, (byte) 19, var9, 64);
                this.method1127(var8 - 1, (byte) 19, var9 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method1127(var8, (byte) 19, var9, 130);
                this.method1127(var8 - 1, (byte) 19, var9, 8);
                this.method1127(var8, (byte) 19, var9 + 1, 32);
            }
            if (arg5 == 1) {
                this.method1127(var8, (byte) 19, var9, 10);
                this.method1127(var8, (byte) 19, var9 + 1, 32);
                this.method1127(var8 + 1, (byte) 19, var9, 128);
            }
            if (arg5 == 2) {
                this.method1127(var8, (byte) 19, var9, 40);
                this.method1127(var8 + 1, (byte) 19, var9, 128);
                this.method1127(var8, (byte) 19, var9 - 1, 2);
            }
            if (arg5 == 3) {
                this.method1127(var8, (byte) 19, var9, 160);
                this.method1127(var8, (byte) 19, var9 - 1, 2);
                this.method1127(var8 - 1, (byte) 19, var9, 8);
            }
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method1127(var8, (byte) 19, var9, 65536);
                    this.method1127(var8 - 1, (byte) 19, var9, 4096);
                }
                if (arg5 == 1) {
                    this.method1127(var8, (byte) 19, var9, 1024);
                    this.method1127(var8, (byte) 19, var9 + 1, 16384);
                }
                if (arg5 == 2) {
                    this.method1127(var8, (byte) 19, var9, 4096);
                    this.method1127(var8 + 1, (byte) 19, var9, 65536);
                }
                if (arg5 == 3) {
                    this.method1127(var8, (byte) 19, var9, 16384);
                    this.method1127(var8, (byte) 19, var9 - 1, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method1127(var8, (byte) 19, var9, 512);
                    this.method1127(var8 - 1, (byte) 19, var9 + 1, 8192);
                }
                if (arg5 == 1) {
                    this.method1127(var8, (byte) 19, var9, 2048);
                    this.method1127(var8 + 1, (byte) 19, var9 + 1, 32768);
                }
                if (arg5 == 2) {
                    this.method1127(var8, (byte) 19, var9, 8192);
                    this.method1127(var8 + 1, (byte) 19, var9 - 1, 512);
                }
                if (arg5 == 3) {
                    this.method1127(var8, (byte) 19, var9, 32768);
                    this.method1127(var8 - 1, (byte) 19, var9 - 1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method1127(var8, (byte) 19, var9, 66560);
                    this.method1127(var8 - 1, (byte) 19, var9, 4096);
                    this.method1127(var8, (byte) 19, var9 + 1, 16384);
                }
                if (arg5 == 1) {
                    this.method1127(var8, (byte) 19, var9, 5120);
                    this.method1127(var8, (byte) 19, var9 + 1, 16384);
                    this.method1127(var8 + 1, (byte) 19, var9, 65536);
                }
                if (arg5 == 2) {
                    this.method1127(var8, (byte) 19, var9, 20480);
                    this.method1127(var8 + 1, (byte) 19, var9, 65536);
                    this.method1127(var8, (byte) 19, var9 - 1, 1024);
                }
                if (arg5 == 3) {
                    this.method1127(var8, (byte) 19, var9, 81920);
                    this.method1127(var8, (byte) 19, var9 - 1, 1024);
                    this.method1127(var8 - 1, (byte) 19, var9, 4096);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method1127(var8, (byte) 19, var9, 536870912);
                this.method1127(var8 - 1, (byte) 19, var9, 33554432);
            }
            if (arg5 == 1) {
                this.method1127(var8, (byte) 19, var9, 8388608);
                this.method1127(var8, (byte) 19, var9 + 1, 134217728);
            }
            if (arg5 == 2) {
                this.method1127(var8, (byte) 19, var9, 33554432);
                this.method1127(var8 + 1, (byte) 19, var9, 536870912);
            }
            if (arg5 == 3) {
                this.method1127(var8, (byte) 19, var9, 134217728);
                this.method1127(var8, (byte) 19, var9 - 1, 8388608);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method1127(var8, (byte) 19, var9, 4194304);
                this.method1127(var8 - 1, (byte) 19, var9 + 1, 67108864);
            }
            if (arg5 == 1) {
                this.method1127(var8, (byte) 19, var9, 16777216);
                this.method1127(var8 + 1, (byte) 19, var9 + 1, 268435456);
            }
            if (arg5 == 2) {
                this.method1127(var8, (byte) 19, var9, 67108864);
                this.method1127(var8 + 1, (byte) 19, var9 - 1, 4194304);
            }
            if (arg5 == 3) {
                this.method1127(var8, (byte) 19, var9, 268435456);
                this.method1127(var8 - 1, (byte) 19, var9 - 1, 16777216);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1127(var8, (byte) 19, var9, 545259520);
            this.method1127(var8 - 1, (byte) 19, var9, 33554432);
            this.method1127(var8, (byte) 19, var9 + 1, 134217728);
        }
        if (arg5 == 1) {
            this.method1127(var8, (byte) 19, var9, 41943040);
            this.method1127(var8, (byte) 19, var9 + 1, 134217728);
            this.method1127(var8 + 1, (byte) 19, var9, 536870912);
        }
        if (arg5 == 2) {
            this.method1127(var8, (byte) 19, var9, 167772160);
            this.method1127(var8 + 1, (byte) 19, var9, 536870912);
            this.method1127(var8, (byte) 19, var9 - 1, 8388608);
        }
        if (arg5 == 3) {
            this.method1127(var8, (byte) 19, var9, 671088640);
            this.method1127(var8, (byte) 19, var9 - 1, 8388608);
            this.method1127(var8 - 1, (byte) 19, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIBIII)Z", line = 552)
    public final boolean method1118(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field2433++;
        if (arg5 < 71) {
            this.method1120(true, -125, -57, -47, -34, -86, false, false);
        }
        if (arg2 > 1) {
            return class167.method1192(arg7, arg3, arg4, arg8, arg6, arg2, arg0, arg2, 1) ? true : this.method1111((byte) -60, arg4, arg2, arg0, arg6, arg3, arg2, arg7, arg8, arg1);
        }
        int var10 = arg4 + arg7 - 1;
        int var11 = arg0 + arg3 - 1;
        if (arg4 <= arg6 && arg6 <= var10 && arg8 >= arg0 && var11 >= arg8) {
            return true;
        } else if ((arg4 - 1) == arg6 && arg8 >= arg0 && arg8 <= var11 && (this.field2427[arg6 - this.field2440][arg8 - this.field2437] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg6 && arg8 >= arg0 && var11 >= arg8 && (this.field2427[arg6 - this.field2440][arg8 - this.field2437] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if ((arg0 - 1) == arg8 && arg6 >= arg4 && var10 >= arg6 && (this.field2427[arg6 - this.field2440][arg8 - this.field2437] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg8 && arg6 >= arg4 && arg6 <= var10 && (this.field2427[arg6 - this.field2440][arg8 - this.field2437] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIII)Z", line = 596)
    public final boolean method1119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2442++;
        if (arg5 == 1) {
            if (arg0 == arg6 && arg1 == arg3) {
                return true;
            }
        } else if (arg6 <= arg0 && arg0 <= (arg6 + arg5 - 1) && arg1 <= arg1 && (arg1 + arg5 - 1) >= arg1) {
            return true;
        }
        int var9 = arg3 - this.field2437;
        int var10 = arg1 - this.field2437;
        int var11 = arg0 - this.field2440;
        int var12 = arg6 - this.field2440;
        if (arg4 != 3) {
            this.field2440 = 70;
        }
        if (arg5 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field2427[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field2427[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2427[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field2427[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2427[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field2427[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field2427[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field2427[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field2427[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field2427[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field2427[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 == var10 && (this.field2427[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg5 - 1;
            int var14 = arg5 + var9 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var11 + 1) == var12 && var10 >= var9 && var10 <= var14 && (this.field2427[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 - arg5) == var9 && (this.field2427[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - arg5 == var12 && var10 >= var9 && var14 >= var10 && (this.field2427[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var10 - arg5) == var9 && (this.field2427[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 - arg5) == var12 && var9 <= var10 && var10 <= var14 && (this.field2427[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9 && (this.field2427[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var11 + 1) == var12 && var9 <= var10 && var10 <= var14 && (this.field2427[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9 && (this.field2427[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var11 >= var12 && var13 >= var11 && (var10 + 1) == var9 && (this.field2427[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var11 && var13 >= var11 && (var10 - arg5) == var9 && (this.field2427[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg5) == var12 && var9 <= var10 && var14 >= var10 && (this.field2427[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var10 >= var9 && var10 <= var14 && (this.field2427[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIIIIIZZ)V", line = 784)
    public final void method1120(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field2429++;
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        int var10 = arg3 - this.field2437;
        int var11 = arg2 - this.field2440;
        if (arg0) {
            var9 |= 0x40000000;
        }
        if (arg6) {
            method1114(null, -31);
        }
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg4;
            arg4 = arg1;
            arg1 = var12;
        }
        for (int var13 = var11; var13 < arg4 + var11; var13++) {
            if (var13 >= 0 && var13 < this.field2438) {
                for (int var14 = var10; var14 < var10 + arg1; var14++) {
                    if (var14 >= 0 && var14 < this.field2441) {
                        this.method1125(var14, (byte) 109, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZII)V", line = 841)
    public final void method1121(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2440;
        if (arg0) {
            field2430++;
            int var5 = arg1 - this.field2437;
            this.field2427[var4][var5] = class168.method1203(this.field2427[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIBII)Z", line = 854)
    public final boolean method1122(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 <= 7) {
            this.field2437 = -70;
        }
        field2434++;
        if (arg6 == 1) {
            if (arg1 == arg3 && arg2 == arg4) {
                return true;
            }
        } else if (arg3 <= arg1 && arg1 <= (arg3 + arg6 - 1) && arg2 <= arg2 && arg2 <= arg2 + arg6 - 1) {
            return true;
        }
        int var9 = arg4 - this.field2437;
        int var10 = arg2 - this.field2437;
        int var11 = arg3 - this.field2440;
        int var12 = arg1 - this.field2440;
        if (arg6 == 1) {
            if (arg0 == 0) {
                if (arg7 == 0) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field2427[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field2427[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var12 - 1 == var11 && var9 == var10 && (this.field2427[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field2427[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field2427[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field2427[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                    if (var12 - 1 == var11 && var9 == var10 && (this.field2427[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field2427[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg7 == 0) {
                    if (var12 - 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field2427[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field2427[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field2427[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field2427[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field2427[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field2427[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field2427[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field2427[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field2427[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field2427[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field2427[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field2427[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var11 - 1;
            int var14 = arg6 + var9 - 1;
            if (arg0 == 0) {
                if (arg7 == 0) {
                    if (var12 - arg6 == var11 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 + 1 == var9 && (this.field2427[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var10 - arg6) == var9 && (this.field2427[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var12 >= var11 && var13 >= var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var12 - arg6 == var11 && var9 <= var10 && var14 >= var10 && (this.field2427[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var10 >= var9 && var14 >= var10 && (this.field2427[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var12 + 1) == var11 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var10 + 1) == var9 && (this.field2427[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var10 - arg6 == var9 && (this.field2427[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var12 >= var11 && var13 >= var12 && var10 - arg6 == var9) {
                        return true;
                    }
                    if (var12 - arg6 == var11 && var10 >= var9 && var14 >= var10 && (this.field2427[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 <= var10 && var10 <= var14 && (this.field2427[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg7 == 0) {
                    if ((var12 - arg6) == var11 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var10 >= var9 && var14 >= var10 && (this.field2427[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 - arg6 == var9 && (this.field2427[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var12 - arg6) == var11 && var10 >= var9 && var10 <= var14 && (this.field2427[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var10 - arg6) == var9 && (this.field2427[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var12 - arg6) == var11 && var10 >= var9 && var10 <= var14 && (this.field2427[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 + 1 == var9 && (this.field2427[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var10 - arg6 == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var12 - arg6) == var11 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 + 1 == var9 && (this.field2427[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 <= var10 && var10 <= var14 && (this.field2427[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var10 - arg6 == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var11 <= var12 && var13 >= var12 && (var10 + 1) == var9 && (this.field2427[var12][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var12 && var12 <= var13 && var10 - arg6 == var9 && (this.field2427[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg6 == var11 && var10 >= var9 && var10 <= var14 && (this.field2427[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var10 >= var9 && var10 <= var14 && (this.field2427[var11][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZIZI)V", line = 1227)
    public final void method1123(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg6 - this.field2440;
        field2424++;
        if (arg1 != -1) {
            this.field2441 = 44;
        }
        int var9 = arg2 - this.field2437;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1125(var9, (byte) 118, 128, var8);
                this.method1125(var9, (byte) 127, 8, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1125(var9, (byte) 111, 2, var8);
                this.method1125(var9 + 1, (byte) 120, 32, var8);
            }
            if (arg0 == 2) {
                this.method1125(var9, (byte) 122, 8, var8);
                this.method1125(var9, (byte) 123, 128, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1125(var9, (byte) 115, 32, var8);
                this.method1125(var9 - 1, (byte) 105, 2, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1125(var9, (byte) 105, 1, var8);
                this.method1125(var9 + 1, (byte) 106, 16, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1125(var9, (byte) 118, 4, var8);
                this.method1125(var9 + 1, (byte) 116, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1125(var9, (byte) 125, 16, var8);
                this.method1125(var9 - 1, (byte) 108, 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1125(var9, (byte) 109, 64, var8);
                this.method1125(var9 - 1, (byte) 127, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method1125(var9, (byte) 120, 130, var8);
                this.method1125(var9, (byte) 113, 8, var8 - 1);
                this.method1125(var9 + 1, (byte) 111, 32, var8);
            }
            if (arg0 == 1) {
                this.method1125(var9, (byte) 115, 10, var8);
                this.method1125(var9 + 1, (byte) 124, 32, var8);
                this.method1125(var9, (byte) 112, 128, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1125(var9, (byte) 108, 40, var8);
                this.method1125(var9, (byte) 113, 128, var8 + 1);
                this.method1125(var9 - 1, (byte) 124, 2, var8);
            }
            if (arg0 == 3) {
                this.method1125(var9, (byte) 120, 160, var8);
                this.method1125(var9 - 1, (byte) 119, 2, var8);
                this.method1125(var9, (byte) 124, 8, var8 - 1);
            }
        }
        if (arg5) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method1125(var9, (byte) 123, 65536, var8);
                    this.method1125(var9, (byte) 126, 4096, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method1125(var9, (byte) 119, 1024, var8);
                    this.method1125(var9 + 1, (byte) 104, 16384, var8);
                }
                if (arg0 == 2) {
                    this.method1125(var9, (byte) 114, 4096, var8);
                    this.method1125(var9, (byte) 105, 65536, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1125(var9, (byte) 113, 16384, var8);
                    this.method1125(var9 - 1, (byte) 114, 1024, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method1125(var9, (byte) 118, 512, var8);
                    this.method1125(var9 + 1, (byte) 107, 8192, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method1125(var9, (byte) 105, 2048, var8);
                    this.method1125(var9 + 1, (byte) 104, 32768, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1125(var9, (byte) 105, 8192, var8);
                    this.method1125(var9 - 1, (byte) 114, 512, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1125(var9, (byte) 113, 32768, var8);
                    this.method1125(var9 - 1, (byte) 123, 2048, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method1125(var9, (byte) 104, 66560, var8);
                    this.method1125(var9, (byte) 110, 4096, var8 - 1);
                    this.method1125(var9 + 1, (byte) 121, 16384, var8);
                }
                if (arg0 == 1) {
                    this.method1125(var9, (byte) 115, 5120, var8);
                    this.method1125(var9 + 1, (byte) 125, 16384, var8);
                    this.method1125(var9, (byte) 116, 65536, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1125(var9, (byte) 112, 20480, var8);
                    this.method1125(var9, (byte) 122, 65536, var8 + 1);
                    this.method1125(var9 - 1, (byte) 127, 1024, var8);
                }
                if (arg0 == 3) {
                    this.method1125(var9, (byte) 123, 81920, var8);
                    this.method1125(var9 - 1, (byte) 106, 1024, var8);
                    this.method1125(var9, (byte) 116, 4096, var8 - 1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1125(var9, (byte) 119, 536870912, var8);
                this.method1125(var9, (byte) 117, 33554432, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1125(var9, (byte) 107, 8388608, var8);
                this.method1125(var9 + 1, (byte) 118, 134217728, var8);
            }
            if (arg0 == 2) {
                this.method1125(var9, (byte) 109, 33554432, var8);
                this.method1125(var9, (byte) 121, 536870912, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1125(var9, (byte) 108, 134217728, var8);
                this.method1125(var9 - 1, (byte) 125, 8388608, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1125(var9, (byte) 108, 4194304, var8);
                this.method1125(var9 + 1, (byte) 119, 67108864, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1125(var9, (byte) 116, 16777216, var8);
                this.method1125(var9 + 1, (byte) 105, 268435456, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1125(var9, (byte) 105, 67108864, var8);
                this.method1125(var9 - 1, (byte) 108, 4194304, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1125(var9, (byte) 121, 268435456, var8);
                this.method1125(var9 - 1, (byte) 121, 16777216, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1125(var9, (byte) 113, 545259520, var8);
            this.method1125(var9, (byte) 111, 33554432, var8 - 1);
            this.method1125(var9 + 1, (byte) 111, 134217728, var8);
        }
        if (arg0 == 1) {
            this.method1125(var9, (byte) 121, 41943040, var8);
            this.method1125(var9 + 1, (byte) 116, 134217728, var8);
            this.method1125(var9, (byte) 115, 536870912, var8 + 1);
        }
        if (arg0 == 2) {
            this.method1125(var9, (byte) 121, 167772160, var8);
            this.method1125(var9, (byte) 106, 536870912, var8 + 1);
            this.method1125(var9 - 1, (byte) 109, 8388608, var8);
        }
        if (arg0 == 3) {
            this.method1125(var9, (byte) 119, 671088640, var8);
            this.method1125(var9 - 1, (byte) 118, 8388608, var8);
            this.method1125(var9, (byte) 122, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(III)V", line = 1535)
    public final void method1124(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2437;
        int var5 = arg0 - this.field2440;
        field2448++;
        int var6 = -24 / ((arg1 + 10) / 39);
        this.field2427[var5][var4] = class442.method2600(this.field2427[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBII)V", line = 1552)
    private final void method1125(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > 103) {
            this.field2427[arg3][arg0] = class168.method1203(this.field2427[arg3][arg0], ~arg2);
            field2426++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(III)I", line = 1563)
    public static final int method1126(int arg0, int arg1, int arg2) {
        if (arg1 != 7851) {
            method1128((byte) -67);
        }
        field2428++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IBII)V", line = 1611)
    private final void method1127(int arg0, byte arg1, int arg2, int arg3) {
        field2446++;
        if (arg1 == 19) {
            this.field2427[arg0][arg2] = class442.method2600(this.field2427[arg0][arg2], arg3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 1622)
    public static void method1128(byte arg0) {
        field2443 = null;
        int var1 = 54 % ((39 - arg0) / 55);
        field2439 = null;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V", line = 1633)
    public final void method1129(byte arg0) {
        for (int var2 = 0; var2 < this.field2438; var2++) {
            for (int var3 = 0; var3 < this.field2441; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field2438 - 5) <= var2 || var3 >= this.field2441 - 5) {
                    this.field2427[var2][var3] = -1;
                } else {
                    this.field2427[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != -43) {
            this.method1109(14, 99, 74);
        }
        field2422++;
    }
}
