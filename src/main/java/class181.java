import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class181 {

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Lla;")
    public static class319 field2441 = new class319(11, 8);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public int field2433;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public int field2434;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public int field2435;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public int field2449;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Laa;")
    public static class341 field2446;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "[[I")
    public int[][] field2451;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIB)V")
    public final void method1212(int arg0, int arg1, byte arg2) {
        field2432++;
        int var4 = arg0 - this.field2433;
        int var5 = arg1 - this.field2434;
        this.field2451[var4][var5] = class311.method1956(this.field2451[var4][var5], 262144);
        if (arg2 < 21) {
            this.method1228(-113, 61, -21, 39, 20, -47, true, 46);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public final void method1213(byte arg0) {
        if (arg0 >= -74) {
            this.method1225(-85, 12, 30, 91, 81, 117, 32, 117, -116);
        }
        field2454++;
        for (int var2 = 0; var2 < this.field2435; var2++) {
            for (int var3 = 0; var3 < this.field2449; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field2435 - 5 || (this.field2449 - 5) <= var3) {
                    this.field2451[var2][var3] = -1;
                } else {
                    this.field2451[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BII)V")
    public static final void method1214(byte arg0, int arg1, int arg2) {
        field2436++;
        class177 var3 = class344.method2229(15, 0, (byte) 88);
        int var4 = 99 % ((70 - arg0) / 52);
        var3.method1191(-111);
        var3.field2369 = arg2;
        var3.field2372 = arg1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIZIIBZ)V")
    public final void method1215(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        int var8 = arg1 - this.field2434;
        int var9 = arg3 - this.field2433;
        field2444++;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1224(var8, (byte) 127, var9, 128);
                this.method1224(var8, (byte) 127, var9 - 1, 8);
            }
            if (arg0 == 1) {
                this.method1224(var8, (byte) 127, var9, 2);
                this.method1224(var8 + 1, (byte) 127, var9, 32);
            }
            if (arg0 == 2) {
                this.method1224(var8, (byte) 127, var9, 8);
                this.method1224(var8, (byte) 127, var9 + 1, 128);
            }
            if (arg0 == 3) {
                this.method1224(var8, (byte) 127, var9, 32);
                this.method1224(var8 - 1, (byte) 127, var9, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1224(var8, (byte) 127, var9, 1);
                this.method1224(var8 + 1, (byte) 127, var9 - 1, 16);
            }
            if (arg0 == 1) {
                this.method1224(var8, (byte) 127, var9, 4);
                this.method1224(var8 + 1, (byte) 127, var9 + 1, 64);
            }
            if (arg0 == 2) {
                this.method1224(var8, (byte) 127, var9, 16);
                this.method1224(var8 - 1, (byte) 127, var9 + 1, 1);
            }
            if (arg0 == 3) {
                this.method1224(var8, (byte) 127, var9, 64);
                this.method1224(var8 - 1, (byte) 127, var9 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method1224(var8, (byte) 127, var9, 130);
                this.method1224(var8, (byte) 127, var9 - 1, 8);
                this.method1224(var8 + 1, (byte) 127, var9, 32);
            }
            if (arg0 == 1) {
                this.method1224(var8, (byte) 127, var9, 10);
                this.method1224(var8 + 1, (byte) 127, var9, 32);
                this.method1224(var8, (byte) 127, var9 + 1, 128);
            }
            if (arg0 == 2) {
                this.method1224(var8, (byte) 127, var9, 40);
                this.method1224(var8, (byte) 127, var9 + 1, 128);
                this.method1224(var8 - 1, (byte) 127, var9, 2);
            }
            if (arg0 == 3) {
                this.method1224(var8, (byte) 127, var9, 160);
                this.method1224(var8 - 1, (byte) 127, var9, 2);
                this.method1224(var8, (byte) 127, var9 - 1, 8);
            }
        }
        if (arg5 != 120) {
            field2441 = null;
        }
        if (arg2) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method1224(var8, (byte) 127, var9, 65536);
                    this.method1224(var8, (byte) 127, var9 - 1, 4096);
                }
                if (arg0 == 1) {
                    this.method1224(var8, (byte) 127, var9, 1024);
                    this.method1224(var8 + 1, (byte) 127, var9, 16384);
                }
                if (arg0 == 2) {
                    this.method1224(var8, (byte) 127, var9, 4096);
                    this.method1224(var8, (byte) 127, var9 + 1, 65536);
                }
                if (arg0 == 3) {
                    this.method1224(var8, (byte) 127, var9, 16384);
                    this.method1224(var8 - 1, (byte) 127, var9, 1024);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method1224(var8, (byte) 127, var9, 512);
                    this.method1224(var8 + 1, (byte) 127, var9 - 1, 8192);
                }
                if (arg0 == 1) {
                    this.method1224(var8, (byte) 127, var9, 2048);
                    this.method1224(var8 + 1, (byte) 127, var9 + 1, 32768);
                }
                if (arg0 == 2) {
                    this.method1224(var8, (byte) 127, var9, 8192);
                    this.method1224(var8 - 1, (byte) 127, var9 + 1, 512);
                }
                if (arg0 == 3) {
                    this.method1224(var8, (byte) 127, var9, 32768);
                    this.method1224(var8 - 1, (byte) 127, var9 - 1, 2048);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method1224(var8, (byte) 127, var9, 66560);
                    this.method1224(var8, (byte) 127, var9 - 1, 4096);
                    this.method1224(var8 + 1, (byte) 127, var9, 16384);
                }
                if (arg0 == 1) {
                    this.method1224(var8, (byte) 127, var9, 5120);
                    this.method1224(var8 + 1, (byte) 127, var9, 16384);
                    this.method1224(var8, (byte) 127, var9 + 1, 65536);
                }
                if (arg0 == 2) {
                    this.method1224(var8, (byte) 127, var9, 20480);
                    this.method1224(var8, (byte) 127, var9 + 1, 65536);
                    this.method1224(var8 - 1, (byte) 127, var9, 1024);
                }
                if (arg0 == 3) {
                    this.method1224(var8, (byte) 127, var9, 81920);
                    this.method1224(var8 - 1, (byte) 127, var9, 1024);
                    this.method1224(var8, (byte) 127, var9 - 1, 4096);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1224(var8, (byte) 127, var9, 536870912);
                this.method1224(var8, (byte) 127, var9 - 1, 33554432);
            }
            if (arg0 == 1) {
                this.method1224(var8, (byte) 127, var9, 8388608);
                this.method1224(var8 + 1, (byte) 127, var9, 134217728);
            }
            if (arg0 == 2) {
                this.method1224(var8, (byte) 127, var9, 33554432);
                this.method1224(var8, (byte) 127, var9 + 1, 536870912);
            }
            if (arg0 == 3) {
                this.method1224(var8, (byte) 127, var9, 134217728);
                this.method1224(var8 - 1, (byte) 127, var9, 8388608);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1224(var8, (byte) 127, var9, 4194304);
                this.method1224(var8 + 1, (byte) 127, var9 - 1, 67108864);
            }
            if (arg0 == 1) {
                this.method1224(var8, (byte) 127, var9, 16777216);
                this.method1224(var8 + 1, (byte) 127, var9 + 1, 268435456);
            }
            if (arg0 == 2) {
                this.method1224(var8, (byte) 127, var9, 67108864);
                this.method1224(var8 - 1, (byte) 127, var9 + 1, 4194304);
            }
            if (arg0 == 3) {
                this.method1224(var8, (byte) 127, var9, 268435456);
                this.method1224(var8 - 1, (byte) 127, var9 - 1, 16777216);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1224(var8, (byte) 127, var9, 545259520);
            this.method1224(var8, (byte) 127, var9 - 1, 33554432);
            this.method1224(var8 + 1, (byte) 127, var9, 134217728);
        }
        if (arg0 == 1) {
            this.method1224(var8, (byte) 127, var9, 41943040);
            this.method1224(var8 + 1, (byte) 127, var9, 134217728);
            this.method1224(var8, (byte) 127, var9 + 1, 536870912);
        }
        if (arg0 == 2) {
            this.method1224(var8, (byte) 127, var9, 167772160);
            this.method1224(var8, (byte) 127, var9 + 1, 536870912);
            this.method1224(var8 - 1, (byte) 127, var9, 8388608);
        }
        if (arg0 == 3) {
            this.method1224(var8, (byte) 127, var9, 671088640);
            this.method1224(var8 - 1, (byte) 127, var9, 8388608);
            this.method1224(var8, (byte) 127, var9 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
    public final void method1216(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2434;
        if (arg2 != 0) {
            this.field2451 = null;
        }
        int var5 = arg1 - this.field2433;
        field2448++;
        this.field2451[var5][var4] = class519.method3092(this.field2451[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZZIBIIII)V")
    public final void method1217(boolean arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field2447++;
        int var9 = 256;
        if (arg0) {
            var9 |= 0x20000;
        }
        int var10 = arg7 - this.field2434;
        if (arg1) {
            var9 |= 0x40000000;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg6;
            arg6 = arg5;
            arg5 = var11;
        }
        int var12 = arg2 - this.field2433;
        int var13 = var12;
        if (arg3 != 86) {
            return;
        }
        while (var13 < (var12 + arg6)) {
            if (var13 >= 0 && var13 < this.field2435) {
                for (int var14 = var10; var14 < (arg5 + var10); var14++) {
                    if (var14 >= 0 && var14 < this.field2449) {
                        this.method1227(var14, var13, 125, var9);
                    }
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
    public static void method1218(byte arg0) {
        field2441 = null;
        field2446 = null;
        if (arg0 != -62) {
            method1218((byte) 66);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLwk;)V")
    public static final void method1219(boolean arg0, class96 arg1) {
        if (arg0) {
            return;
        }
        field2440++;
        class179 var2 = (class179) class424.field6459.method1747((long) arg1.field3882, arg0);
        if (var2 == null) {
            class165.method1124(0, arg1.field3915[0], -2, null, arg1.field1866, null, arg1.field3917[0], arg1);
        } else {
            var2.method1201(-1);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)V")
    public final void method1220(int arg0, int arg1, int arg2) {
        if (arg0 != 27414) {
            this.field2449 = 47;
        }
        int var4 = arg2 - this.field2434;
        int var5 = arg1 - this.field2433;
        field2443++;
        this.field2451[var5][var4] = class311.method1956(this.field2451[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)V")
    public final void method1221(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2433;
        int var5 = arg2 - this.field2434;
        if (arg0 == -13419) {
            field2452++;
            this.field2451[var4][var5] = class519.method3092(this.field2451[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2453++;
        if (arg4 != 2) {
            return false;
        }
        if (arg5 == 1) {
            if (arg2 == arg7 && arg0 == arg3) {
                return true;
            }
        } else if (arg2 <= arg7 && arg7 <= (arg2 + arg5 - 1) && arg3 >= arg3 && arg3 + arg5 - 1 >= arg3) {
            return true;
        }
        int var9 = arg2 - this.field2433;
        int var10 = arg0 - this.field2434;
        int var11 = arg3 - this.field2434;
        int var12 = arg7 - this.field2433;
        if (arg5 == 1) {
            if (arg6 == 0) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field2451[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field2451[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field2451[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field2451[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field2451[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field2451[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field2451[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field2451[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field2451[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field2451[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field2451[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field2451[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field2451[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field2451[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field2451[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field2451[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var9 == var12 && (var11 + 1) == var10 && (this.field2451[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var11 - 1) == var10 && (this.field2451[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field2451[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field2451[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg5 - 1;
            int var14 = arg5 + var10 - 1;
            if (arg6 == 0) {
                if (arg1 == 0) {
                    if (var12 - arg5 == var9 && var10 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var11 + 1 == var10 && (this.field2451[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var11 - arg5 == var10 && (this.field2451[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var12 - arg5 == var9 && var10 <= var11 && var14 >= var11 && (this.field2451[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var11 <= var14 && (this.field2451[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 + 1) == var9 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 + 1 == var10 && (this.field2451[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var11 - arg5) == var10 && (this.field2451[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 >= var9 && var12 <= var13 && (var11 - arg5) == var10) {
                        return true;
                    }
                    if ((var12 - arg5) == var9 && var10 <= var11 && var11 <= var14 && (this.field2451[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var14 >= var11 && (this.field2451[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg1 == 0) {
                    if (var12 - arg5 == var9 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var14 >= var11 && (this.field2451[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var11 - arg5 == var10 && (this.field2451[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - arg5 == var9 && var10 <= var11 && var14 >= var11 && (this.field2451[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var11 - arg5) == var10 && (this.field2451[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 - arg5) == var9 && var10 <= var11 && var11 <= var14 && (this.field2451[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var11 + 1) == var10 && (this.field2451[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var11 - arg5) == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 - arg5 == var9 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10 && (this.field2451[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 <= var11 && var14 >= var11 && (this.field2451[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 - arg5) == var10) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var9 <= var12 && var13 >= var12 && (var11 + 1) == var10 && (this.field2451[var12][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var12 && var13 >= var12 && var11 - arg5 == var10 && (this.field2451[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg5 == var9 && var11 >= var10 && var11 <= var14 && (this.field2451[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 <= var11 && var14 >= var11 && (this.field2451[var9][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method1223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2439++;
        int var11 = arg3 + arg8;
        int var12 = arg0 + arg7;
        if (arg5 != 0) {
            return true;
        }
        int var13 = arg2 + arg4;
        int var14 = arg6 + arg9;
        if (arg8 == var13 && (arg1 & 0x2) == 0) {
            int var15 = arg6 >= arg0 ? arg6 : arg0;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field2451[var13 - this.field2433 - 1][var15 - this.field2434] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg2 == var11 && (arg1 & 0x8) == 0) {
            int var17 = arg6 < arg0 ? arg0 : arg6;
            int var18 = var14 > var12 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field2451[arg2 - this.field2433][var17 - this.field2434] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg0 == var14 && (arg1 & 0x1) == 0) {
            int var19 = arg2 >= arg8 ? arg2 : arg8;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field2451[var19 - this.field2433][var14 - this.field2434 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg6 == var12 && (arg1 & 0x4) == 0) {
            int var21 = arg8 > arg2 ? arg8 : arg2;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field2451[var21 - this.field2433][arg6 - this.field2434] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBII)V")
    private final void method1224(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 126) {
            this.field2434 = 124;
        }
        field2450++;
        this.field2451[arg2][arg0] = class311.method1956(this.field2451[arg2][arg0], arg3);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2437++;
        if (arg3 > 1) {
            return class36.method314(arg5, arg3, arg7, arg2, arg6, (byte) 124, arg3, arg4, arg1) ? true : this.method1223(arg6, arg0, arg2, arg3, arg1, arg8 - 20198, arg4, arg3, arg5, arg7);
        }
        int var10 = arg1 + arg2 - 1;
        int var11 = arg4 + arg7 - 1;
        if (arg2 <= arg5 && arg5 <= var10 && arg6 >= arg4 && var11 >= arg6) {
            return true;
        } else if (arg2 - 1 == arg5 && arg6 >= arg4 && arg6 <= var11 && (this.field2451[arg5 - this.field2433][arg6 - this.field2434] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (arg8 != 20198) {
            return true;
        } else if ((var10 + 1) == arg5 && arg4 <= arg6 && var11 >= arg6 && (this.field2451[arg5 - this.field2433][arg6 - this.field2434] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg6 && arg2 <= arg5 && arg5 <= var10 && (this.field2451[arg5 - this.field2433][arg6 - this.field2434] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg6 && arg2 <= arg5 && arg5 <= var10 && (this.field2451[arg5 - this.field2433][arg6 - this.field2434] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIZZII)V")
    public final void method1226(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field2433;
        field2442++;
        int var9 = arg0 - this.field2434;
        if (arg6 == 0) {
            if (arg1 == 0) {
                this.method1227(var9, var8, 121, 128);
                this.method1227(var9, var8 - 1, 124, 8);
            }
            if (arg1 == 1) {
                this.method1227(var9, var8, 121, 2);
                this.method1227(var9 + 1, var8, 126, 32);
            }
            if (arg1 == 2) {
                this.method1227(var9, var8, 124, 8);
                this.method1227(var9, var8 + 1, 125, 128);
            }
            if (arg1 == 3) {
                this.method1227(var9, var8, 123, 32);
                this.method1227(var9 - 1, var8, 125, 2);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg1 == 0) {
                this.method1227(var9, var8, 127, 1);
                this.method1227(var9 + 1, var8 + -1, 124, 16);
            }
            if (arg1 == 1) {
                this.method1227(var9, var8, 121, 4);
                this.method1227(var9 + 1, var8 + 1, 122, 64);
            }
            if (arg1 == 2) {
                this.method1227(var9, var8, 122, 16);
                this.method1227(var9 - 1, var8 + 1, 121, 1);
            }
            if (arg1 == 3) {
                this.method1227(var9, var8, 124, 64);
                this.method1227(var9 - 1, var8 + -1, 123, 4);
            }
        }
        if (arg6 == 2) {
            if (arg1 == 0) {
                this.method1227(var9, var8, 125, 130);
                this.method1227(var9, var8 - 1, 121, 8);
                this.method1227(var9 + 1, var8, 121, 32);
            }
            if (arg1 == 1) {
                this.method1227(var9, var8, 123, 10);
                this.method1227(var9 + 1, var8, 127, 32);
                this.method1227(var9, var8 + 1, 122, 128);
            }
            if (arg1 == 2) {
                this.method1227(var9, var8, 123, 40);
                this.method1227(var9, var8 + 1, 126, 128);
                this.method1227(var9 - 1, var8, 124, 2);
            }
            if (arg1 == 3) {
                this.method1227(var9, var8, 126, 160);
                this.method1227(var9 - 1, var8, 121, 2);
                this.method1227(var9, var8 - 1, 127, 8);
            }
        }
        if (arg4) {
            if (arg6 == 0) {
                if (arg1 == 0) {
                    this.method1227(var9, var8, 121, 65536);
                    this.method1227(var9, var8 - 1, 127, 4096);
                }
                if (arg1 == 1) {
                    this.method1227(var9, var8, 123, 1024);
                    this.method1227(var9 + 1, var8, 124, 16384);
                }
                if (arg1 == 2) {
                    this.method1227(var9, var8, 127, 4096);
                    this.method1227(var9, var8 + 1, 124, 65536);
                }
                if (arg1 == 3) {
                    this.method1227(var9, var8, 121, 16384);
                    this.method1227(var9 - 1, var8, 125, 1024);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg1 == 0) {
                    this.method1227(var9, var8, 127, 512);
                    this.method1227(var9 + 1, var8 + -1, 126, 8192);
                }
                if (arg1 == 1) {
                    this.method1227(var9, var8, 124, 2048);
                    this.method1227(var9 + 1, var8 + 1, 125, 32768);
                }
                if (arg1 == 2) {
                    this.method1227(var9, var8, 122, 8192);
                    this.method1227(var9 - 1, var8 - -1, 123, 512);
                }
                if (arg1 == 3) {
                    this.method1227(var9, var8, 121, 32768);
                    this.method1227(var9 - 1, var8 + -1, 121, 2048);
                }
            }
            if (arg6 == 2) {
                if (arg1 == 0) {
                    this.method1227(var9, var8, 126, 66560);
                    this.method1227(var9, var8 - 1, 122, 4096);
                    this.method1227(var9 + 1, var8, 127, 16384);
                }
                if (arg1 == 1) {
                    this.method1227(var9, var8, 125, 5120);
                    this.method1227(var9 + 1, var8, 124, 16384);
                    this.method1227(var9, var8 + 1, 124, 65536);
                }
                if (arg1 == 2) {
                    this.method1227(var9, var8, 124, 20480);
                    this.method1227(var9, var8 + 1, 127, 65536);
                    this.method1227(var9 - 1, var8, 125, 1024);
                }
                if (arg1 == 3) {
                    this.method1227(var9, var8, 123, 81920);
                    this.method1227(var9 - 1, var8, 124, 1024);
                    this.method1227(var9, var8 - 1, 126, 4096);
                }
            }
        }
        if (arg5 > -8) {
            this.method1225(107, 103, -113, -51, 107, 93, -27, 101, -128);
        }
        if (!arg3) {
            return;
        }
        if (arg6 == 0) {
            if (arg1 == 0) {
                this.method1227(var9, var8, 122, 536870912);
                this.method1227(var9, var8 - 1, 121, 33554432);
            }
            if (arg1 == 1) {
                this.method1227(var9, var8, 126, 8388608);
                this.method1227(var9 + 1, var8, 125, 134217728);
            }
            if (arg1 == 2) {
                this.method1227(var9, var8, 127, 33554432);
                this.method1227(var9, var8 + 1, 127, 536870912);
            }
            if (arg1 == 3) {
                this.method1227(var9, var8, 125, 134217728);
                this.method1227(var9 - 1, var8, 126, 8388608);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg1 == 0) {
                this.method1227(var9, var8, 125, 4194304);
                this.method1227(var9 + 1, var8 + -1, 126, 67108864);
            }
            if (arg1 == 1) {
                this.method1227(var9, var8, 126, 16777216);
                this.method1227(var9 + 1, var8 + 1, 125, 268435456);
            }
            if (arg1 == 2) {
                this.method1227(var9, var8, 121, 67108864);
                this.method1227(var9 - 1, var8 - -1, 127, 4194304);
            }
            if (arg1 == 3) {
                this.method1227(var9, var8, 125, 268435456);
                this.method1227(var9 - 1, var8 + -1, 124, 16777216);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1227(var9, var8, 123, 545259520);
            this.method1227(var9, var8 - 1, 126, 33554432);
            this.method1227(var9 + 1, var8, 124, 134217728);
        }
        if (arg1 == 1) {
            this.method1227(var9, var8, 124, 41943040);
            this.method1227(var9 + 1, var8, 125, 134217728);
            this.method1227(var9, var8 + 1, 127, 536870912);
        }
        if (arg1 == 2) {
            this.method1227(var9, var8, 126, 167772160);
            this.method1227(var9, var8 + 1, 124, 536870912);
            this.method1227(var9 - 1, var8, 123, 8388608);
        }
        if (arg1 == 3) {
            this.method1227(var9, var8, 124, 671088640);
            this.method1227(var9 - 1, var8, 122, 8388608);
            this.method1227(var9, var8 - 1, 127, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)V")
    private final void method1227(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 120) {
            field2438++;
            this.field2451[arg1][arg0] = class519.method3092(this.field2451[arg1][arg0], ~arg3);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIZI)Z")
    public final boolean method1228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field2445++;
        if (arg2 == 1) {
            if (arg5 == arg7 && arg1 == arg3) {
                return true;
            }
        } else if (arg7 >= arg5 && (arg5 + arg2 - 1) >= arg7 && arg3 >= arg3 && arg3 <= (arg2 + arg3 - 1)) {
            return true;
        }
        if (arg6) {
            this.method1224(-3, (byte) -65, -83, 125);
        }
        int var9 = arg7 - this.field2433;
        int var10 = arg1 - this.field2434;
        int var11 = arg5 - this.field2433;
        int var12 = arg3 - this.field2434;
        if (arg2 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field2451[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field2451[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field2451[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field2451[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field2451[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field2451[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field2451[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2451[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field2451[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field2451[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field2451[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field2451[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg2 - 1;
            int var14 = arg2 + var10 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var9 + 1) == var11 && var12 >= var10 && var12 <= var14 && (this.field2451[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var12 - arg2) == var10 && (this.field2451[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var9 - arg2) == var11 && var10 <= var12 && var12 <= var14 && (this.field2451[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var12 - arg2 == var10 && (this.field2451[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - arg2 == var11 && var12 >= var10 && var14 >= var12 && (this.field2451[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 + 1) == var10 && (this.field2451[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 + 1 == var11 && var10 <= var12 && var12 <= var14 && (this.field2451[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var12 + 1 == var10 && (this.field2451[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var9 >= var11 && var13 >= var9 && var12 + 1 == var10 && (this.field2451[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var11 && var13 >= var9 && var12 - arg2 == var10 && (this.field2451[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg2) == var11 && var12 >= var10 && var12 <= var14 && (this.field2451[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 <= var12 && var12 <= var14 && (this.field2451[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIIIIZI)V")
    public final void method1229(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2431++;
        int var8 = 256;
        if (arg4 >= -114) {
            this.field2433 = 53;
        }
        if (arg5) {
            var8 |= 0x20000;
        }
        int var9 = arg3 - this.field2433;
        if (arg0) {
            var8 |= 0x40000000;
        }
        int var10 = arg6 - this.field2434;
        for (int var11 = var9; var11 < arg1 + var9; var11++) {
            if (var11 >= 0 && var11 < this.field2435) {
                for (int var12 = var10; var12 < arg2 + var10; var12++) {
                    if (var12 >= 0 && this.field2449 > var12) {
                        this.method1224(var12, (byte) 127, var11, var8);
                    }
                }
            }
        }
    }
}
