import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class99 {

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    private int field2354 = 0;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    private int field2357;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    private int field2350;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "[[I")
    public int[][] field2367;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lgd;")
    public static class40 field2346 = class14.method90(false, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Lgd;")
    private static class40 field2360 = class14.method90(false, "Loading config )2 ");

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Lgd;")
    public static class40 field2363 = field2360;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "Lgd;")
    public static class40 field2362 = class14.method90(false, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field2358 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lrb;")
    public static class103 field2349;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "Lrb;")
    public static class103 field2364;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "Loc;")
    public static class86 field2365;

    // $FF: synthetic field
    @OriginalMember(owner = "client!q", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field2369;

    // $FF: synthetic method
    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method702(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 10)
    public static void method687(int arg0) {
        field2363 = null;
        field2360 = null;
        field2349 = null;
        if (arg0 != -1) {
            field2349 = null;
        }
        field2346 = null;
        field2365 = null;
        field2364 = null;
        field2362 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIII)Z", line = 34)
    public final boolean method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2338++;
        int var9 = arg4 + arg7 - 1;
        if (arg6 != 40) {
            field2362 = null;
        }
        int var10 = arg0 + arg2 - 1;
        if (arg5 >= arg0 && var10 >= arg5 && arg4 <= arg1 && arg1 <= var9) {
            return true;
        } else if (arg0 - 1 == arg5 && arg1 >= arg4 && var9 >= arg1 && (this.field2367[arg5 - this.field2337][arg1 - this.field2354] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg5 && arg4 <= arg1 && var9 >= arg1 && (this.field2367[arg5 - this.field2337][arg1 - this.field2354] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg1 && arg5 >= arg0 && var10 >= arg5 && (this.field2367[arg5 - this.field2337][arg1 - this.field2354] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg1 && arg0 <= arg5 && arg5 <= var10 && (this.field2367[arg5 - this.field2337][arg1 - this.field2354] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZIIII)Z", line = 67)
    public final boolean method689(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field2348++;
        if (arg3 == arg5 && arg1 == arg4) {
            return true;
        }
        int var8 = arg3 - this.field2337;
        int var9 = arg1 - this.field2354;
        int var10 = arg4 - this.field2354;
        int var11 = arg5 - this.field2337;
        if (arg6 == 0) {
            if (arg0 == 0) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field2367[var11][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field2367[var11][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var11 && var9 + 1 == var10) {
                    return true;
                }
                if (var8 - 1 == var11 && var9 == var10 && (this.field2367[var11][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2367[var11][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field2367[var11][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field2367[var11][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var11 && var9 - 1 == var10) {
                    return true;
                }
                if (var8 - 1 == var11 && var9 == var10 && (this.field2367[var11][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2367[var11][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg0 == 0) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2367[var11][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field2367[var11][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 - 1 == var11 && var9 == var10 && (this.field2367[var11][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field2367[var11][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var8 - 1 == var11 && var9 == var10 && (this.field2367[var11][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field2367[var11][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field2367[var11][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2367[var11][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var11 && var9 + 1 == var10 && (this.field2367[var11][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var9 - 1 == var10 && (this.field2367[var11][var10] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var11 && var9 == var10 && (this.field2367[var11][var10] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var11 && var9 == var10 && (this.field2367[var11][var10] & 0x80) == 0) {
                return true;
            }
        }
        return arg2 ? false : false;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)V", line = 265)
    private final void method690(int arg0, int arg1, int arg2, int arg3) {
        this.field2367[arg2][arg0] = class43.method294(this.field2367[arg2][arg0], arg1);
        field2366++;
        if (arg3 > -49) {
            this.field2367 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZZIIII)V", line = 277)
    public final void method691(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field2337;
        if (arg0 == 1 || arg0 == 3) {
            int var9 = arg3;
            arg3 = arg5;
            arg5 = var9;
        }
        int var10 = 256;
        field2342++;
        if (arg2) {
            method695(71, -79, true, false, true);
        }
        if (arg1) {
            var10 += 131072;
        }
        int var11 = arg4 - this.field2354;
        for (int var12 = var8; var12 < var8 + arg3; var12++) {
            if (var12 >= 0 && var12 < this.field2357) {
                for (int var13 = var11; var13 < arg5 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field2350) {
                        this.method690(var13, var10, var12, -123);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIBZI)V", line = 339)
    public final void method692(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field2337;
        field2341++;
        int var8 = arg1 - this.field2354;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method690(var8, 128, var7, -56);
                this.method690(var8, 8, var7 - 1, -75);
            }
            if (arg2 == 1) {
                this.method690(var8, 2, var7, -103);
                this.method690(var8 + 1, 32, var7, -69);
            }
            if (arg2 == 2) {
                this.method690(var8, 8, var7, -76);
                this.method690(var8, 128, var7 + 1, -54);
            }
            if (arg2 == 3) {
                this.method690(var8, 32, var7, -53);
                this.method690(var8 - 1, 2, var7, -81);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method690(var8, 1, var7, -105);
                this.method690(var8 + 1, 16, var7 - 1, -52);
            }
            if (arg2 == 1) {
                this.method690(var8, 4, var7, -120);
                this.method690(var8 + 1, 64, var7 + 1, -97);
            }
            if (arg2 == 2) {
                this.method690(var8, 16, var7, -106);
                this.method690(var8 - 1, 1, var7 + 1, -114);
            }
            if (arg2 == 3) {
                this.method690(var8, 64, var7, -91);
                this.method690(var8 - 1, 4, var7 - 1, -89);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method690(var8, 130, var7, -98);
                this.method690(var8, 8, var7 - 1, -70);
                this.method690(var8 + 1, 32, var7, -95);
            }
            if (arg2 == 1) {
                this.method690(var8, 10, var7, -93);
                this.method690(var8 + 1, 32, var7, -54);
                this.method690(var8, 128, var7 + 1, -97);
            }
            if (arg2 == 2) {
                this.method690(var8, 40, var7, -56);
                this.method690(var8, 128, var7 + 1, -62);
                this.method690(var8 - 1, 2, var7, -72);
            }
            if (arg2 == 3) {
                this.method690(var8, 160, var7, -100);
                this.method690(var8 - 1, 2, var7, -95);
                this.method690(var8, 8, var7 - 1, -99);
            }
        }
        if (arg4) {
            if (arg5 == 0) {
                if (arg2 == 0) {
                    this.method690(var8, 65536, var7, -101);
                    this.method690(var8, 4096, var7 - 1, -127);
                }
                if (arg2 == 1) {
                    this.method690(var8, 1024, var7, -95);
                    this.method690(var8 + 1, 16384, var7, -93);
                }
                if (arg2 == 2) {
                    this.method690(var8, 4096, var7, -120);
                    this.method690(var8, 65536, var7 + 1, -53);
                }
                if (arg2 == 3) {
                    this.method690(var8, 16384, var7, -110);
                    this.method690(var8 - 1, 1024, var7, -100);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg2 == 0) {
                    this.method690(var8, 512, var7, -61);
                    this.method690(var8 + 1, 8192, var7 - 1, -54);
                }
                if (arg2 == 1) {
                    this.method690(var8, 2048, var7, -82);
                    this.method690(var8 + 1, 32768, var7 + 1, -80);
                }
                if (arg2 == 2) {
                    this.method690(var8, 8192, var7, -75);
                    this.method690(var8 - 1, 512, var7 + 1, -120);
                }
                if (arg2 == 3) {
                    this.method690(var8, 32768, var7, -66);
                    this.method690(var8 - 1, 2048, var7 - 1, -79);
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    this.method690(var8, 66560, var7, -116);
                    this.method690(var8, 4096, var7 - 1, -96);
                    this.method690(var8 + 1, 16384, var7, -94);
                }
                if (arg2 == 1) {
                    this.method690(var8, 5120, var7, -56);
                    this.method690(var8 + 1, 16384, var7, -127);
                    this.method690(var8, 65536, var7 + 1, -74);
                }
                if (arg2 == 2) {
                    this.method690(var8, 20480, var7, -75);
                    this.method690(var8, 65536, var7 + 1, -110);
                    this.method690(var8 - 1, 1024, var7, -109);
                }
                if (arg2 == 3) {
                    this.method690(var8, 81920, var7, -57);
                    this.method690(var8 - 1, 1024, var7, -62);
                    this.method690(var8, 4096, var7 - 1, -75);
                }
            }
        }
        if (arg3 < 13) {
            this.method699(-110, true, -77, 75, -52, -66, 96);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIII)Z", line = 554)
    public final boolean method693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2353++;
        if (arg2 == arg4 && arg5 == arg6) {
            return true;
        }
        int var8 = -105 / ((-arg1 - 4) / 37);
        int var9 = arg6 - this.field2354;
        int var10 = arg4 - this.field2337;
        int var11 = arg5 - this.field2354;
        int var12 = arg2 - this.field2337;
        if (arg3 == 6 || arg3 == 7) {
            if (arg3 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var12 + 1 == var10 && var9 == var11 && (this.field2367[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 - 1 == var9 && (this.field2367[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var12 - 1 == var10 && var9 == var11 && (this.field2367[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 - 1 == var9 && (this.field2367[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var12 - 1 == var10 && var9 == var11 && (this.field2367[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 + 1 == var9 && (this.field2367[var10][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var12 + 1 == var10 && var9 == var11 && (this.field2367[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 + 1 == var9 && (this.field2367[var10][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 8) {
            if (var10 == var12 && var11 + 1 == var9 && (this.field2367[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var12 && var11 - 1 == var9 && (this.field2367[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var12 - 1 == var10 && var9 == var11 && (this.field2367[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var12 + 1 == var10 && var9 == var11 && (this.field2367[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 648)
    public final void method694(int arg0) {
        field2340++;
        int var2 = 0;
        if (arg0 != 16777215) {
            return;
        }
        while (this.field2357 > var2) {
            for (int var3 = 0; var3 < this.field2350; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2357 - 1 == var2 || this.field2350 - 1 == var3) {
                    this.field2367[var2][var3] = 16777215;
                } else {
                    this.field2367[var2][var3] = 16777216;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZZZ)Lw;", line = 684)
    public static final class135 method695(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        if (arg1 != 1000000) {
            field2355 = -5;
        }
        class82 var5 = null;
        field2359++;
        if (class4.field145 != null) {
            var5 = new class82(arg0, class4.field145, class96.field2227[arg0], 1000000);
        }
        return new class135(var5, class65.field1588, arg0, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBI)V", line = 705)
    public final void method696(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field2337;
        int var5 = 27 % ((arg1 - 35) / 40);
        int var6 = arg2 - this.field2354;
        field2368++;
        this.field2367[var4][var6] = class101.method709(this.field2367[var4][var6], 14680063);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IBI)V", line = 718)
    public final void method697(int arg0, byte arg1, int arg2) {
        field2347++;
        int var4 = arg0 - this.field2354;
        int var5 = arg2 - this.field2337;
        if (arg1 == 127) {
            this.field2367[var5][var4] = class43.method294(this.field2367[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZZIIII)V", line = 742)
    public final void method698(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field2354;
        if (!arg0) {
            field2365 = null;
        }
        field2343++;
        int var8 = arg3 - this.field2337;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method700(var7, 120, var8, 128);
                this.method700(var7, 124, var8 - 1, 8);
            }
            if (arg4 == 1) {
                this.method700(var7, 120, var8, 2);
                this.method700(var7 + 1, 124, var8, 32);
            }
            if (arg4 == 2) {
                this.method700(var7, 127, var8, 8);
                this.method700(var7, 122, var8 + 1, 128);
            }
            if (arg4 == 3) {
                this.method700(var7, 121, var8, 32);
                this.method700(var7 - 1, 122, var8, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method700(var7, 125, var8, 1);
                this.method700(var7 + 1, 126, var8 - 1, 16);
            }
            if (arg4 == 1) {
                this.method700(var7, 122, var8, 4);
                this.method700(var7 + 1, 127, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method700(var7, 126, var8, 16);
                this.method700(var7 - 1, 122, var8 + 1, 1);
            }
            if (arg4 == 3) {
                this.method700(var7, 126, var8, 64);
                this.method700(var7 - 1, 120, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method700(var7, 126, var8, 130);
                this.method700(var7, 120, var8 - 1, 8);
                this.method700(var7 + 1, 121, var8, 32);
            }
            if (arg4 == 1) {
                this.method700(var7, 124, var8, 10);
                this.method700(var7 + 1, 120, var8, 32);
                this.method700(var7, 124, var8 + 1, 128);
            }
            if (arg4 == 2) {
                this.method700(var7, 120, var8, 40);
                this.method700(var7, 120, var8 + 1, 128);
                this.method700(var7 - 1, 120, var8, 2);
            }
            if (arg4 == 3) {
                this.method700(var7, 126, var8, 160);
                this.method700(var7 - 1, 123, var8, 2);
                this.method700(var7, 124, var8 - 1, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method700(var7, 127, var8, 65536);
                this.method700(var7, 127, var8 - 1, 4096);
            }
            if (arg4 == 1) {
                this.method700(var7, 120, var8, 1024);
                this.method700(var7 + 1, 126, var8, 16384);
            }
            if (arg4 == 2) {
                this.method700(var7, 126, var8, 4096);
                this.method700(var7, 122, var8 + 1, 65536);
            }
            if (arg4 == 3) {
                this.method700(var7, 122, var8, 16384);
                this.method700(var7 - 1, 126, var8, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method700(var7, 125, var8, 512);
                this.method700(var7 + 1, 126, var8 - 1, 8192);
            }
            if (arg4 == 1) {
                this.method700(var7, 123, var8, 2048);
                this.method700(var7 + 1, 122, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method700(var7, 124, var8, 8192);
                this.method700(var7 - 1, 122, var8 + 1, 512);
            }
            if (arg4 == 3) {
                this.method700(var7, 126, var8, 32768);
                this.method700(var7 - 1, 124, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method700(var7, 121, var8, 66560);
            this.method700(var7, 120, var8 - 1, 4096);
            this.method700(var7 + 1, 120, var8, 16384);
        }
        if (arg4 == 1) {
            this.method700(var7, 121, var8, 5120);
            this.method700(var7 + 1, 124, var8, 16384);
            this.method700(var7, 126, var8 + 1, 65536);
        }
        if (arg4 == 2) {
            this.method700(var7, 121, var8, 20480);
            this.method700(var7, 124, var8 + 1, 65536);
            this.method700(var7 - 1, 121, var8, 1024);
        }
        if (arg4 == 3) {
            this.method700(var7, 121, var8, 81920);
            this.method700(var7 - 1, 125, var8, 1024);
            this.method700(var7, 123, var8 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZIIIII)V", line = 956)
    public final void method699(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2339++;
        if (arg3 == 1 || arg3 == 3) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        int var9 = arg2 - this.field2354;
        int var10 = arg4 - this.field2337;
        if (arg0 < 44) {
            this.method697(4, (byte) 121, 14);
        }
        int var11 = 256;
        if (arg1) {
            var11 += 131072;
        }
        for (int var12 = var10; var12 < arg6 + var10; var12++) {
            if (var12 >= 0 && var12 < this.field2357) {
                for (int var13 = var9; var13 < arg5 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field2350) {
                        this.method700(var13, 125, var12, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IIII)V", line = 1006)
    private final void method700(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 119) {
            field2352++;
            this.field2367[arg2][arg0] = class101.method709(this.field2367[arg2][arg0], 16777215 - arg3);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 1018)
    public static final void method701(int arg0) {
        if (arg0 != 14002) {
            method695(-122, -21, false, true, true);
        }
        field2345++;
        if (class7.field179 == null) {
            return;
        }
        long var1 = class98.method683(arg0 ^ 0x36B2);
        if (var1 <= class5.field155) {
            return;
        }
        class7.field179.method72(var1);
        int var3 = (int) (var1 - class5.field155);
        class5.field155 = var1;
        synchronized (field2369 == null ? (field2369 = method702("be")) : field2369) {
            class55.field1421 += class131.field3171 * var3;
            int var5 = (class55.field1421 - class131.field3171 * 2000) / 1000;
            if (var5 > 0) {
                if (class59.field1491 != null) {
                    class59.field1491.method176(var5);
                }
                class55.field1421 -= var5 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V", line = 1059)
    public class99(int arg0, int arg1) {
        this.field2357 = arg0;
        this.field2337 = 0;
        this.field2350 = arg1;
        this.field2367 = new int[this.field2357][this.field2350];
        this.method694(16777215);
    }
}
