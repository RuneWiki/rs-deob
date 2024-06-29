import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class134 {

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    private int field2337 = 0;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    private int field2340;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    private int field2317;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "[[I")
    public int[][] field2338;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "Lqb;")
    public static class11 field2341 = new class11();

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "Z")
    public static boolean field2345 = false;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lrc;")
    public static class66 field2333;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)[Lgb;")
    public static final class46[] method817(int arg0) {
        class46[] var1 = new class46[class168.field2810];
        if (arg0 != -19043) {
            method821(false, false);
        }
        for (int var2 = 0; var2 < class168.field2810; var2++) {
            var1[var2] = new class209(class161.field2727, class241.field4197, class58.field1068[var2], class176.field2934[var2], class177.field2982[var2], class214.field3613[var2], class26.field427[var2], class63.field1153);
        }
        class57.method350((byte) -119);
        field2322++;
        return var1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIB)Z")
    public final boolean method818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2325++;
        if (arg3 == 1) {
            if (arg0 == arg1 && arg4 == arg6) {
                return true;
            }
        } else if (arg1 >= arg0 && arg0 + arg3 - 1 >= arg1 && arg6 >= arg6 && (arg6 + arg3 - 1) >= arg6) {
            return true;
        }
        if (arg7 > -47) {
            return true;
        }
        int var9 = arg0 - this.field2337;
        int var10 = arg1 - this.field2337;
        int var11 = arg6 - this.field2335;
        int var12 = arg4 - this.field2335;
        if (arg3 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field2338[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field2338[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field2338[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field2338[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field2338[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field2338[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field2338[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field2338[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 == var10 && var11 + 1 == var12 && (this.field2338[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var12 && (this.field2338[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field2338[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var12 && (this.field2338[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg3 - 1;
            int var14 = arg3 + var9 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var10 + 1 == var9 && var12 <= var11 && var13 >= var11 && (this.field2338[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var14 >= var10 && var11 - arg3 == var12 && (this.field2338[var10][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var10 - arg3) == var9 && var11 >= var12 && var13 >= var11 && (this.field2338[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var14 && (var11 - arg3) == var12 && (this.field2338[var10][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 - arg3) == var9 && var11 >= var12 && var11 <= var13 && (this.field2338[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var14 && (var11 + 1) == var12 && (this.field2338[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var10 + 1) == var9 && var12 <= var11 && var13 >= var11 && (this.field2338[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var14 >= var10 && (var11 + 1) == var12 && (this.field2338[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 <= var10 && var14 >= var10 && var11 + 1 == var12 && (this.field2338[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var9 && var10 <= var14 && (var11 - arg3) == var12 && (this.field2338[var10][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg3) == var9 && var12 <= var11 && var11 <= var13 && (this.field2338[var14][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var12 <= var11 && var13 >= var11 && (this.field2338[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIZB)V")
    public final void method819(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        int var7 = arg3 - this.field2335;
        field2330++;
        int var8 = arg2 - this.field2337;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method820(128, -1, var7, var8);
                this.method820(8, -1, var7, var8 - 1);
            }
            if (arg1 == 1) {
                this.method820(2, -1, var7, var8);
                this.method820(32, -1, var7 + 1, var8);
            }
            if (arg1 == 2) {
                this.method820(8, arg5 ^ 0x33, var7, var8);
                this.method820(128, -1, var7, var8 + 1);
            }
            if (arg1 == 3) {
                this.method820(32, -1, var7, var8);
                this.method820(2, arg5 + 51, var7 - 1, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method820(1, -1, var7, var8);
                this.method820(16, -1, var7 + 1, var8 + -1);
            }
            if (arg1 == 1) {
                this.method820(4, arg5 ^ 0x33, var7, var8);
                this.method820(64, -1, var7 + 1, var8 + 1);
            }
            if (arg1 == 2) {
                this.method820(16, -1, var7, var8);
                this.method820(1, arg5 ^ 0x33, var7 - 1, var8 + 1);
            }
            if (arg1 == 3) {
                this.method820(64, -1, var7, var8);
                this.method820(4, arg5 + 51, var7 + -1, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method820(130, -1, var7, var8);
                this.method820(8, arg5 + 51, var7, var8 - 1);
                this.method820(32, -1, var7 + 1, var8);
            }
            if (arg1 == 1) {
                this.method820(10, -1, var7, var8);
                this.method820(32, -1, var7 + 1, var8);
                this.method820(128, arg5 + 51, var7, var8 + 1);
            }
            if (arg1 == 2) {
                this.method820(40, -1, var7, var8);
                this.method820(128, -1, var7, var8 + 1);
                this.method820(2, -1, var7 - 1, var8);
            }
            if (arg1 == 3) {
                this.method820(160, arg5 + 51, var7, var8);
                this.method820(2, -1, var7 - 1, var8);
                this.method820(8, -1, var7, var8 - 1);
            }
        }
        if (arg4) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method820(65536, -1, var7, var8);
                    this.method820(4096, -1, var7, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method820(1024, arg5 + 51, var7, var8);
                    this.method820(16384, arg5 ^ 0x33, var7 + 1, var8);
                }
                if (arg1 == 2) {
                    this.method820(4096, -1, var7, var8);
                    this.method820(65536, -1, var7, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method820(16384, -1, var7, var8);
                    this.method820(1024, -1, var7 - 1, var8);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method820(512, arg5 ^ 0x33, var7, var8);
                    this.method820(8192, -1, var7 + 1, var8 + -1);
                }
                if (arg1 == 1) {
                    this.method820(2048, -1, var7, var8);
                    this.method820(32768, -1, var7 + 1, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method820(8192, -1, var7, var8);
                    this.method820(512, -1, var7 - 1, var8 - -1);
                }
                if (arg1 == 3) {
                    this.method820(32768, -1, var7, var8);
                    this.method820(2048, -1, var7 - 1, var8 + -1);
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    this.method820(66560, arg5 ^ 0x33, var7, var8);
                    this.method820(4096, -1, var7, var8 - 1);
                    this.method820(16384, -1, var7 + 1, var8);
                }
                if (arg1 == 1) {
                    this.method820(5120, -1, var7, var8);
                    this.method820(16384, -1, var7 + 1, var8);
                    this.method820(65536, -1, var7, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method820(20480, -1, var7, var8);
                    this.method820(65536, -1, var7, var8 + 1);
                    this.method820(1024, -1, var7 - 1, var8);
                }
                if (arg1 == 3) {
                    this.method820(81920, -1, var7, var8);
                    this.method820(1024, -1, var7 - 1, var8);
                    this.method820(4096, -1, var7, var8 - 1);
                }
            }
        }
        if (arg5 != -52) {
            field2318 = 13;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)V")
    private final void method820(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            method827((byte) -102);
        }
        field2321++;
        this.field2338[arg3][arg2] = class76.method446(this.field2338[arg3][arg2], ~arg0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZZ)V")
    public static final void method821(boolean arg0, boolean arg1) {
        if (arg0) {
            method827((byte) 87);
        }
        byte[][] var2 = class251.field4343;
        field2344++;
        int var3 = class38.field638.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class177.field2976[var4] >> 8) * 64 - class192.field3267;
                int var7 = (class177.field2976[var4] & 0xFF) * 64 - class78.field1367;
                class114.method725((byte) -80);
                class220.method1395(var7, var6, class78.field1370, (byte) -82, arg1, var5);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIZ)V")
    public final void method822(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1 - this.field2337;
        field2343++;
        int var8 = arg0 - this.field2335;
        if (arg4 != 12628) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method830(var8, var7, 0, 128);
                this.method830(var8, var7 - 1, 0, 8);
            }
            if (arg2 == 1) {
                this.method830(var8, var7, 0, 2);
                this.method830(var8 + 1, var7, 0, 32);
            }
            if (arg2 == 2) {
                this.method830(var8, var7, arg4 ^ 0x3154, 8);
                this.method830(var8, var7 + 1, 0, 128);
            }
            if (arg2 == 3) {
                this.method830(var8, var7, arg4 - 12628, 32);
                this.method830(var8 - 1, var7, arg4 ^ 0x3154, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method830(var8, var7, arg4 ^ 0x3154, 1);
                this.method830(var8 + 1, var7 + -1, 0, 16);
            }
            if (arg2 == 1) {
                this.method830(var8, var7, 0, 4);
                this.method830(var8 + 1, var7 + 1, 0, 64);
            }
            if (arg2 == 2) {
                this.method830(var8, var7, 0, 16);
                this.method830(var8 - 1, var7 + 1, 0, 1);
            }
            if (arg2 == 3) {
                this.method830(var8, var7, 0, 64);
                this.method830(var8 - 1, var7 + -1, arg4 ^ 0x3154, 4);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method830(var8, var7, 0, 130);
                this.method830(var8, var7 - 1, 0, 8);
                this.method830(var8 + 1, var7, arg4 ^ 0x3154, 32);
            }
            if (arg2 == 1) {
                this.method830(var8, var7, 0, 10);
                this.method830(var8 + 1, var7, 0, 32);
                this.method830(var8, var7 + 1, 0, 128);
            }
            if (arg2 == 2) {
                this.method830(var8, var7, arg4 ^ 0x3154, 40);
                this.method830(var8, var7 + 1, 0, 128);
                this.method830(var8 - 1, var7, arg4 - 12628, 2);
            }
            if (arg2 == 3) {
                this.method830(var8, var7, 0, 160);
                this.method830(var8 - 1, var7, arg4 ^ 0x3154, 2);
                this.method830(var8, var7 - 1, arg4 + -12628, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method830(var8, var7, 0, 65536);
                this.method830(var8, var7 - 1, arg4 + -12628, 4096);
            }
            if (arg2 == 1) {
                this.method830(var8, var7, arg4 - 12628, 1024);
                this.method830(var8 + 1, var7, 0, 16384);
            }
            if (arg2 == 2) {
                this.method830(var8, var7, 0, 4096);
                this.method830(var8, var7 + 1, 0, 65536);
            }
            if (arg2 == 3) {
                this.method830(var8, var7, 0, 16384);
                this.method830(var8 - 1, var7, 0, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method830(var8, var7, arg4 - 12628, 512);
                this.method830(var8 + 1, var7 - 1, arg4 ^ 0x3154, 8192);
            }
            if (arg2 == 1) {
                this.method830(var8, var7, 0, 2048);
                this.method830(var8 + 1, var7 + 1, arg4 - 12628, 32768);
            }
            if (arg2 == 2) {
                this.method830(var8, var7, 0, 8192);
                this.method830(var8 - 1, var7 + 1, 0, 512);
            }
            if (arg2 == 3) {
                this.method830(var8, var7, arg4 - 12628, 32768);
                this.method830(var8 - 1, var7 + -1, 0, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method830(var8, var7, 0, 66560);
            this.method830(var8, var7 - 1, arg4 + -12628, 4096);
            this.method830(var8 + 1, var7, 0, 16384);
        }
        if (arg2 == 1) {
            this.method830(var8, var7, 0, 5120);
            this.method830(var8 + 1, var7, 0, 16384);
            this.method830(var8, var7 + 1, 0, 65536);
        }
        if (arg2 == 2) {
            this.method830(var8, var7, 0, 20480);
            this.method830(var8, var7 + 1, 0, 65536);
            this.method830(var8 - 1, var7, 0, 1024);
        }
        if (arg2 == 3) {
            this.method830(var8, var7, 0, 81920);
            this.method830(var8 - 1, var7, 0, 1024);
            this.method830(var8, var7 - 1, 0, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
    public final void method823(int arg0, int arg1, int arg2) {
        if (arg0 > -104) {
            this.method818(112, -85, 49, -128, -115, 85, -77, (byte) 73);
        }
        int var4 = arg1 - this.field2335;
        field2319++;
        int var5 = arg2 - this.field2337;
        this.field2338[var5][var4] = class246.method1640(this.field2338[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIB)V")
    public final void method824(int arg0, int arg1, byte arg2) {
        field2339++;
        int var4 = arg0 - this.field2337;
        int var5 = arg1 - this.field2335;
        if (arg2 == -22) {
            this.field2338[var4][var5] = class246.method1640(this.field2338[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2346++;
        if (arg7 > 1) {
            return this.method836(arg6, arg7, arg7, arg1, arg2, (byte) -93, arg8, arg3, arg5) ? true : this.method832(arg8, arg6, arg2, arg5, arg3, arg0, arg1, arg7, (byte) 107, arg7);
        } else if (arg4 == 0) {
            int var10 = arg3 + arg6 - 1;
            int var11 = arg5 + arg8 - 1;
            if (arg1 >= arg3 && var10 >= arg1 && arg2 >= arg5 && arg2 <= var11) {
                return true;
            } else if (arg3 - 1 == arg1 && arg5 <= arg2 && var11 >= arg2 && (this.field2338[arg1 - this.field2337][arg2 - this.field2335] & 0x8) == 0 && (arg0 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg1 && arg2 >= arg5 && var11 >= arg2 && (this.field2338[arg1 - this.field2337][arg2 - this.field2335] & 0x80) == 0 && (arg0 & 0x2) == 0) {
                return true;
            } else if (arg5 - 1 == arg2 && arg1 >= arg3 && arg1 <= var10 && (this.field2338[arg1 - this.field2337][arg2 - this.field2335] & 0x2) == 0 && (arg0 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg2 && arg3 <= arg1 && var10 >= arg1 && (this.field2338[arg1 - this.field2337][arg2 - this.field2335] & 0x20) == 0 && (arg0 & 0x1) == 0;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIB)I")
    public static final int method826(int arg0, int arg1, int arg2, byte arg3) {
        field2320++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            if (arg3 < 50) {
                method817(-29);
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method827(byte arg0) {
        field2333 = null;
        field2341 = null;
        if (arg0 != 124) {
            field2333 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIB)V")
    public final void method828(int arg0, int arg1, byte arg2) {
        if (arg2 == -35) {
            int var4 = arg1 - this.field2335;
            field2329++;
            int var5 = arg0 - this.field2337;
            this.field2338[var5][var4] = class76.method446(this.field2338[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ln;IZILn;)Lqc;")
    public static final class241 method829(class138 arg0, int arg1, boolean arg2, int arg3, class138 arg4) {
        int[] var5 = arg4.method881(arg1, -47);
        field2324++;
        boolean var6 = true;
        int var7 = 0;
        if (arg3 != 12319) {
            method826(47, -78, -88, (byte) 100);
        }
        while (var5.length > var7) {
            byte[] var8 = arg4.method865(var5[var7], arg1, (byte) 44);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg0.method865(var9, 0, (byte) 44);
                } else {
                    var10 = arg0.method865(0, var9, (byte) 44);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
            var7++;
        }
        if (!var6) {
            return null;
        }
        try {
            return new class241(arg4, arg0, arg1, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIII)V")
    private final void method830(int arg0, int arg1, int arg2, int arg3) {
        field2331++;
        if (arg2 != 0) {
            this.field2337 = 24;
        }
        this.field2338[arg1][arg0] = class246.method1640(this.field2338[arg1][arg0], arg3);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2334++;
        if (arg4 == 1) {
            if (arg2 == arg5 && arg3 == arg6) {
                return true;
            }
        } else if (arg2 >= arg5 && arg2 <= arg4 + arg5 - 1 && arg3 <= arg3 && (arg3 + arg4 - 1) >= arg3) {
            return true;
        }
        int var9 = 126 / ((arg1 + 61) / 57);
        int var10 = arg3 - this.field2335;
        int var11 = arg5 - this.field2337;
        int var12 = arg6 - this.field2335;
        int var13 = arg2 - this.field2337;
        if (arg4 == 1) {
            if (arg7 == 0) {
                if (arg0 == 0) {
                    if (var13 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && var10 + 1 == var12 && (this.field2338[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var10 - 1) == var12 && (this.field2338[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 == var13 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var13 - 1 == var11 && var10 == var12 && (this.field2338[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var10 == var12 && (this.field2338[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var13 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && (var10 + 1) == var12 && (this.field2338[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var10 - 1) == var12 && (this.field2338[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 == var13 && (var10 - 1) == var12) {
                        return true;
                    }
                    if ((var13 - 1) == var11 && var10 == var12 && (this.field2338[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var10 == var12 && (this.field2338[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg0 == 0) {
                    if (var13 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var10 == var12 && (this.field2338[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var13 && var10 - 1 == var12 && (this.field2338[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var13 - 1) == var11 && var10 == var12 && (this.field2338[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var13 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && (var10 - 1) == var12 && (this.field2338[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var13 - 1 == var11 && var10 == var12 && (this.field2338[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var10 + 1) == var12 && (this.field2338[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && var10 - 1 == var12) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var13 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && (var10 + 1) == var12 && (this.field2338[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var10 == var12 && (this.field2338[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var10 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var11 == var13 && var10 + 1 == var12 && (this.field2338[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var13 && (var10 - 1) == var12 && (this.field2338[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var13 - 1) == var11 && var10 == var12 && (this.field2338[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var13 + 1) == var11 && var10 == var12 && (this.field2338[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var11 + arg4 - 1;
            int var15 = arg4 + var12 - 1;
            if (arg7 == 0) {
                if (arg0 == 0) {
                    if (var13 - arg4 == var11 && var10 >= var12 && var10 <= var15) {
                        return true;
                    }
                    if (var13 >= var11 && var14 >= var13 && var10 + 1 == var12 && (this.field2338[var13][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var13 <= var14 && var10 - arg4 == var12 && (this.field2338[var13][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var13 >= var11 && var14 >= var13 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var13 - arg4) == var11 && var10 >= var12 && var10 <= var15 && (this.field2338[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var10 >= var12 && var10 <= var15 && (this.field2338[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var13 + 1) == var11 && var12 <= var10 && var10 <= var15) {
                        return true;
                    }
                    if (var13 >= var11 && var13 <= var14 && var10 + 1 == var12 && (this.field2338[var13][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var13 >= var11 && var14 >= var13 && (var10 - arg4) == var12 && (this.field2338[var13][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 <= var13 && var13 <= var14 && (var10 - arg4) == var12) {
                        return true;
                    }
                    if ((var13 - arg4) == var11 && var10 >= var12 && var15 >= var10 && (this.field2338[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var12 <= var10 && var10 <= var15 && (this.field2338[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg0 == 0) {
                    if ((var13 - arg4) == var11 && var12 <= var10 && var10 <= var15) {
                        return true;
                    }
                    if (var13 >= var11 && var13 <= var14 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var10 >= var12 && var10 <= var15 && (this.field2338[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var13 >= var11 && var14 >= var13 && var10 - arg4 == var12 && (this.field2338[var13][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var13 - arg4 == var11 && var10 >= var12 && var15 >= var10 && (this.field2338[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var13 >= var11 && var13 <= var14 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var10 >= var12 && var15 >= var10) {
                        return true;
                    }
                    if (var11 <= var13 && var13 <= var14 && (var10 - arg4) == var12 && (this.field2338[var13][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var13 - arg4) == var11 && var10 >= var12 && var15 >= var10 && (this.field2338[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var14 >= var13 && var10 + 1 == var12 && (this.field2338[var13][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var12 <= var10 && var10 <= var15) {
                        return true;
                    }
                    if (var13 >= var11 && var13 <= var14 && (var10 - arg4) == var12) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var13 - arg4) == var11 && var10 >= var12 && var10 <= var15) {
                        return true;
                    }
                    if (var11 <= var13 && var13 <= var14 && var10 + 1 == var12 && (this.field2338[var13][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var12 <= var10 && var10 <= var15 && (this.field2338[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var13 <= var14 && (var10 - arg4) == var12) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var13 >= var11 && var13 <= var14 && (var10 + 1) == var12 && (this.field2338[var13][var12] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 <= var13 && var13 <= var14 && (var10 - arg4) == var12 && (this.field2338[var13][var15] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var13 - arg4) == var11 && var12 <= var10 && var15 >= var10 && (this.field2338[var14][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var13 + 1) == var11 && var12 <= var10 && var10 <= var15 && (this.field2338[var11][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIBI)Z")
    private final boolean method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field2323++;
        int var11 = arg6 + arg9;
        int var12 = arg2 + arg7;
        int var13 = arg1 + arg4;
        if (arg8 <= 81) {
            this.method823(-36, -4, -111);
        }
        int var14 = arg0 + arg3;
        if (arg6 >= arg4 && var13 > arg6) {
            if (arg3 == var12 && (arg5 & 0x4) == 0) {
                int var15 = arg6;
                int var16 = var13 >= var11 ? var11 : var13;
                while (var16 > var15) {
                    if ((this.field2338[var15 - this.field2337][var12 - this.field2335 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg2 == var14 && (arg5 & 0x1) == 0) {
                int var17 = arg6;
                int var18 = var13 < var11 ? var13 : var11;
                while (var17 < var18) {
                    if ((this.field2338[var17 - this.field2337][arg2 - this.field2335] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg4 && var13 >= var11) {
            if (arg3 == var12 && (arg5 & 0x4) == 0) {
                for (int var19 = arg4; var19 < var11; var19++) {
                    if ((this.field2338[var19 - this.field2337][var12 - this.field2335 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var14 && (arg5 & 0x1) == 0) {
                for (int var20 = arg4; var20 < var11; var20++) {
                    if ((this.field2338[var20 - this.field2337][arg2 - this.field2335] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg3 <= arg2 && arg2 < var14) {
            if (arg4 == var11 && (arg5 & 0x8) == 0) {
                int var21 = arg2;
                int var22 = var12 > var14 ? var14 : var12;
                while (var22 > var21) {
                    if ((this.field2338[var11 - this.field2337 - 1][var21 - this.field2335] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg6 == var13 && (arg5 & 0x2) == 0) {
                int var23 = arg2;
                int var24 = var12 > var14 ? var14 : var12;
                while (var23 < var24) {
                    if ((this.field2338[arg6 - this.field2337][var23 - this.field2335] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var12 > arg3 && var14 >= var12) {
            if (arg4 == var11 && (arg5 & 0x8) == 0) {
                for (int var25 = arg3; var25 < var12; var25++) {
                    if ((this.field2338[var11 - this.field2337 - 1][var25 - this.field2335] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var13 && (arg5 & 0x2) == 0) {
                for (int var26 = arg3; var26 < var12; var26++) {
                    if ((this.field2338[arg6 - this.field2337][var26 - this.field2335] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIZBII)V")
    public final void method833(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        if (arg4 >= -123) {
            field2342 = -46;
        }
        int var8 = arg5 - this.field2335;
        field2328++;
        int var9 = arg2 - this.field2337;
        if (arg6 == 1 || arg6 == 3) {
            int var10 = arg1;
            arg1 = arg0;
            arg0 = var10;
        }
        int var11 = 256;
        if (arg3) {
            var11 += 131072;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && this.field2317 > var12) {
                for (int var13 = var8; var13 < arg0 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field2340) {
                        this.method820(var11, -1, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIIIIZ)V")
    public final void method834(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2327++;
        int var7 = arg0 - this.field2337;
        int var8 = arg2 - this.field2335;
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        if (arg1 != 17436672) {
            this.field2335 = -3;
        }
        for (int var10 = var7; var10 < arg4 + var7; var10++) {
            if (var10 >= 0 && this.field2317 > var10) {
                for (int var11 = var8; var11 < arg3 + var8; var11++) {
                    if (var11 >= 0 && var11 < this.field2340) {
                        this.method830(var11, var10, 0, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public final void method835(int arg0) {
        int var2 = -1 / ((-arg0 - 92) / 34);
        for (int var3 = 0; var3 < this.field2317; var3++) {
            for (int var4 = 0; var4 < this.field2340; var4++) {
                if (var3 == 0 || var4 == 0 || var3 >= (this.field2317 - 5) || var4 >= this.field2340 - 5) {
                    this.field2338[var3][var4] = 16777215;
                } else {
                    this.field2338[var3][var4] = 16777216;
                }
            }
        }
        field2336++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIBIII)Z")
    private final boolean method836(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field2332++;
        if (arg3 >= arg0 + arg7 || arg7 >= arg2 + arg3) {
            return false;
        } else if ((arg6 + arg8) > arg4 && (arg1 + arg4) > arg8) {
            return arg5 > -44 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(II)V")
    public class134(int arg0, int arg1) {
        this.field2340 = arg1;
        this.field2317 = arg0;
        this.field2338 = new int[this.field2317][this.field2340];
        this.field2335 = 0;
        this.method835(-126);
    }
}
