import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class92 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    private int field2322;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    private int field2321;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[[I")
    public int[][] field2338;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2317 = 0;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "Lhb;")
    public static class44 field2337 = class102.method810(":", -28606);

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "J")
    public static volatile long field2319 = 0L;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lhb;")
    private static class44 field2330 = class102.method810("Remove", -28606);

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Lhb;")
    public static class44 field2336 = field2330;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lhb;")
    public static class44 field2328 = class102.method810("m-Ochte mit Ihnen handeln)3", -28606);

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lob;")
    public static class86 field2333 = new class86(5000);

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "Lhb;")
    public static class44 field2346 = class102.method810("blinken3:", -28606);

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "Lhb;")
    private static class44 field2347 = class102.method810("RuneScape has been updated(Q", -28606);

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "Lhb;")
    private static class44 field2349 = class102.method810("slide:", -28606);

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "Lhb;")
    public static class44 field2348 = field2347;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "Lhb;")
    public static class44 field2351 = field2349;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Lqd;")
    public static class100 field2345;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "Lhc;")
    public static class45 field2350;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBIIIII)Z", line = 3)
    public final boolean method733(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2343++;
        if (arg2 == arg3 && arg4 == arg6) {
            return true;
        }
        int var8 = arg3 - this.field2322;
        int var9 = arg2 - this.field2322;
        int var10 = arg4 - this.field2335;
        int var11 = arg6 - this.field2335;
        if (arg1 != -9) {
            field2348 = null;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2338[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2338[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2338[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2338[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2338[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2338[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2338[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2338[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var9 && var11 + 1 == var10 && (this.field2338[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var11 - 1 == var10 && (this.field2338[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V", line = 197)
    private final void method734(int arg0, int arg1, int arg2, int arg3) {
        field2324++;
        this.field2338[arg3][arg1] = class118.method914(this.field2338[arg3][arg1], 16777215 - arg2);
        if (arg0 <= 104) {
            method738((byte) -10);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIZI)Z", line = 209)
    public final boolean method735(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2327++;
        if (arg0 == arg2 && arg1 == arg3) {
            return true;
        } else if (arg5) {
            int var8 = arg2 - this.field2322;
            int var9 = arg0 - this.field2322;
            int var10 = arg1 - this.field2335;
            int var11 = arg3 - this.field2335;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var9 + 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var9 && var11 - 1 == var10 && (this.field2338[var8][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var9 && var11 - 1 == var10 && (this.field2338[var8][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var9 && var11 + 1 == var10 && (this.field2338[var8][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 + 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var9 && var11 + 1 == var10 && (this.field2338[var8][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var8 == var9 && var11 + 1 == var10 && (this.field2338[var8][var10] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2338[var8][var10] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2338[var8][var10] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V", line = 303)
    public final void method736(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2335;
        field2331++;
        int var5 = arg0 - this.field2322;
        int var6 = -76 / ((-arg1 - 64) / 44);
        this.field2338[var5][var4] = class40.method350(this.field2338[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZIII)V", line = 324)
    private final void method737(boolean arg0, int arg1, int arg2, int arg3) {
        this.field2338[arg2][arg3] = class40.method350(this.field2338[arg2][arg3], arg1);
        field2332++;
        if (arg0) {
            field2350 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 355)
    public static void method738(byte arg0) {
        field2330 = null;
        if (arg0 <= 28) {
            return;
        }
        field2346 = null;
        field2337 = null;
        field2336 = null;
        field2347 = null;
        field2351 = null;
        field2333 = null;
        field2345 = null;
        field2350 = null;
        field2349 = null;
        field2348 = null;
        field2328 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)Z", line = 380)
    public final boolean method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2329++;
        int var9 = arg0 + arg1 - 1;
        int var10 = arg6 + arg5 - 1;
        if (arg0 <= arg4 && arg4 <= var9 && arg6 <= arg3 && var10 >= arg3) {
            return true;
        } else if (arg0 - 1 == arg4 && arg6 <= arg3 && var10 >= arg3 && (this.field2338[arg4 - this.field2322][arg3 - this.field2335] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg6 <= arg3 && var10 >= arg3 && (this.field2338[arg4 - this.field2322][arg3 - this.field2335] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg3 && arg4 >= arg0 && arg4 <= var9 && (this.field2338[arg4 - this.field2322][arg3 - this.field2335] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else if (arg2 <= 103) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg4 >= arg0 && var9 >= arg4 && (this.field2338[arg4 - this.field2322][arg3 - this.field2335] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 412)
    public final void method740(int arg0) {
        for (int var2 = 0; var2 < this.field2321; var2++) {
            for (int var3 = 0; var3 < this.field2318; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2321 - 1 == var2 || this.field2318 - 1 == var3) {
                    this.field2338[var2][var3] = 16777215;
                } else {
                    this.field2338[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 >= -99) {
            this.method733(-128, (byte) 90, -14, -96, -3, -88, -44);
        }
        field2339++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)V", line = 443)
    public final void method741(int arg0, int arg1, byte arg2) {
        field2326++;
        int var4 = arg0 - this.field2322;
        if (arg2 == 112) {
            int var5 = arg1 - this.field2335;
            this.field2338[var4][var5] = class118.method914(this.field2338[var4][var5], 14680063);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZIIIII)V", line = 465)
    public final void method742(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2325++;
        int var7 = arg1 - this.field2322;
        int var8 = arg3 - this.field2335;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method737(false, 128, var7, var8);
                this.method737(false, 8, var7 - 1, var8);
            }
            if (arg4 == 1) {
                this.method737(false, 2, var7, var8);
                this.method737(false, 32, var7, var8 + 1);
            }
            if (arg4 == 2) {
                this.method737(false, 8, var7, var8);
                this.method737(false, 128, var7 + 1, var8);
            }
            if (arg4 == 3) {
                this.method737(false, 32, var7, var8);
                this.method737(false, 2, var7, var8 - 1);
            }
        }
        if (arg2 == arg5 || arg2 == 3) {
            if (arg4 == 0) {
                this.method737(false, 1, var7, var8);
                this.method737(false, 16, var7 - 1, var8 + 1);
            }
            if (arg4 == 1) {
                this.method737(false, 4, var7, var8);
                this.method737(false, 64, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method737(false, 16, var7, var8);
                this.method737(false, 1, var7 + 1, var8 + -1);
            }
            if (arg4 == 3) {
                this.method737(false, 64, var7, var8);
                this.method737(false, 4, var7 - 1, var8 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method737(false, 130, var7, var8);
                this.method737(false, 8, var7 - 1, var8);
                this.method737(false, 32, var7, var8 + 1);
            }
            if (arg4 == 1) {
                this.method737(false, 10, var7, var8);
                this.method737(false, 32, var7, var8 + 1);
                this.method737(false, 128, var7 + 1, var8);
            }
            if (arg4 == 2) {
                this.method737(false, 40, var7, var8);
                this.method737(false, 128, var7 + 1, var8);
                this.method737(false, 2, var7, var8 - 1);
            }
            if (arg4 == 3) {
                this.method737(false, 160, var7, var8);
                this.method737(false, 2, var7, var8 - 1);
                this.method737(false, 8, var7 - 1, var8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method737(false, 65536, var7, var8);
                this.method737(false, 4096, var7 - 1, var8);
            }
            if (arg4 == 1) {
                this.method737(false, 1024, var7, var8);
                this.method737(false, 16384, var7, var8 + 1);
            }
            if (arg4 == 2) {
                this.method737(false, 4096, var7, var8);
                this.method737(false, 65536, var7 + 1, var8);
            }
            if (arg4 == 3) {
                this.method737(false, 16384, var7, var8);
                this.method737(false, 1024, var7, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method737(false, 512, var7, var8);
                this.method737(false, 8192, var7 - 1, var8 + 1);
            }
            if (arg4 == 1) {
                this.method737(false, 2048, var7, var8);
                this.method737(false, 32768, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method737(false, 8192, var7, var8);
                this.method737(false, 512, var7 + 1, var8 + -1);
            }
            if (arg4 == 3) {
                this.method737(false, 32768, var7, var8);
                this.method737(false, 2048, var7 - 1, var8 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method737(false, 66560, var7, var8);
            this.method737(false, 4096, var7 - 1, var8);
            this.method737(false, 16384, var7, var8 + 1);
        }
        if (arg4 == 1) {
            this.method737(false, 5120, var7, var8);
            this.method737(false, 16384, var7, var8 + 1);
            this.method737(false, 65536, var7 + 1, var8);
        }
        if (arg4 == 2) {
            this.method737(false, 20480, var7, var8);
            this.method737(false, 65536, var7 + 1, var8);
            this.method737(false, 1024, var7, var8 - 1);
        }
        if (arg4 == 3) {
            this.method737(false, 81920, var7, var8);
            this.method737(false, 1024, var7, var8 - 1);
            this.method737(false, 4096, var7 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZIIIII)V", line = 692)
    public final void method743(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field2335;
        if (arg3 < 85) {
            return;
        }
        field2344++;
        int var9 = arg2 - this.field2322;
        int var10 = 256;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg4;
            arg4 = arg6;
            arg6 = var11;
        }
        if (arg1) {
            var10 += 131072;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field2321) {
                for (int var13 = var8; var13 < arg6 + var8; var13++) {
                    if (var13 >= 0 && this.field2318 > var13) {
                        this.method734(124, var13, var10, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZIIII)V", line = 742)
    public final void method744(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2320++;
        int var7 = arg0 - this.field2322;
        int var8 = arg4 - this.field2335;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method734(111, var8, 128, var7);
                this.method734(115, var8, 8, var7 - 1);
            }
            if (arg3 == 1) {
                this.method734(arg2 ^ 0xF9, var8, 2, var7);
                this.method734(110, var8 + 1, 32, var7);
            }
            if (arg3 == 2) {
                this.method734(arg2 - 22, var8, 8, var7);
                this.method734(127, var8, 128, var7 + 1);
            }
            if (arg3 == 3) {
                this.method734(117, var8, 32, var7);
                this.method734(125, var8 - 1, 2, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method734(109, var8, 1, var7);
                this.method734(114, var8 + 1, 16, var7 - 1);
            }
            if (arg3 == 1) {
                this.method734(121, var8, 4, var7);
                this.method734(126, var8 + 1, 64, var7 + 1);
            }
            if (arg3 == 2) {
                this.method734(119, var8, 16, var7);
                this.method734(arg2 - 22, var8 - 1, 1, var7 + 1);
            }
            if (arg3 == 3) {
                this.method734(114, var8, 64, var7);
                this.method734(111, var8 - 1, 4, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method734(118, var8, 130, var7);
                this.method734(109, var8, 8, var7 - 1);
                this.method734(124, var8 + 1, 32, var7);
            }
            if (arg3 == 1) {
                this.method734(arg2 ^ 0xF5, var8, 10, var7);
                this.method734(arg2 - 22, var8 + 1, 32, var7);
                this.method734(115, var8, 128, var7 + 1);
            }
            if (arg3 == 2) {
                this.method734(116, var8, 40, var7);
                this.method734(124, var8, 128, var7 + 1);
                this.method734(arg2 ^ 0xF4, var8 - 1, 2, var7);
            }
            if (arg3 == 3) {
                this.method734(121, var8, 160, var7);
                this.method734(126, var8 - 1, 2, var7);
                this.method734(arg2 ^ 0xEA, var8, 8, var7 - 1);
            }
        }
        if (arg2 != 128) {
            field2347 = null;
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method734(108, var8, 65536, var7);
                this.method734(123, var8, 4096, var7 - 1);
            }
            if (arg3 == 1) {
                this.method734(arg2 - 23, var8, 1024, var7);
                this.method734(114, var8 + 1, 16384, var7);
            }
            if (arg3 == 2) {
                this.method734(arg2 ^ 0xF3, var8, 4096, var7);
                this.method734(112, var8, 65536, var7 + 1);
            }
            if (arg3 == 3) {
                this.method734(122, var8, 16384, var7);
                this.method734(arg2 - 8, var8 + -1, 1024, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method734(127, var8, 512, var7);
                this.method734(119, var8 + 1, 8192, var7 - 1);
            }
            if (arg3 == 1) {
                this.method734(127, var8, 2048, var7);
                this.method734(arg2 ^ 0xF3, var8 + 1, 32768, var7 + 1);
            }
            if (arg3 == 2) {
                this.method734(arg2 - 2, var8, 8192, var7);
                this.method734(arg2 ^ 0xF6, var8 - 1, 512, var7 + 1);
            }
            if (arg3 == 3) {
                this.method734(arg2 - 17, var8, 32768, var7);
                this.method734(107, var8 - 1, 2048, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method734(112, var8, 66560, var7);
            this.method734(118, var8, 4096, var7 - 1);
            this.method734(107, var8 + 1, 16384, var7);
        }
        if (arg3 == 1) {
            this.method734(119, var8, 5120, var7);
            this.method734(arg2 - 10, var8 + 1, 16384, var7);
            this.method734(111, var8, 65536, var7 + 1);
        }
        if (arg3 == 2) {
            this.method734(127, var8, 20480, var7);
            this.method734(arg2 ^ 0xF8, var8, 65536, var7 + 1);
            this.method734(115, var8 - 1, 1024, var7);
        }
        if (arg3 == 3) {
            this.method734(108, var8, 81920, var7);
            this.method734(111, var8 - 1, 1024, var7);
            this.method734(116, var8, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIZIII)V", line = 955)
    public final void method745(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2334++;
        int var8 = arg0 - this.field2322;
        if (arg4 == 1 || arg4 == 3) {
            int var9 = arg5;
            arg5 = arg6;
            arg6 = var9;
        }
        int var10 = 256;
        int var11 = arg1 - this.field2335;
        if (arg3) {
            var10 += 131072;
        }
        int var12 = var8;
        if (arg2 > -106) {
            return;
        }
        while (arg5 + var8 > var12) {
            if (var12 >= 0 && var12 < this.field2321) {
                for (int var13 = var11; var13 < arg6 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field2318) {
                        this.method737(false, var10, var12, var13);
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(II)V", line = 1009)
    public class92(int arg0, int arg1) {
        this.field2318 = arg1;
        this.field2335 = 0;
        this.field2322 = 0;
        this.field2321 = arg0;
        this.field2338 = new int[this.field2321][this.field2318];
        this.method740(-110);
    }
}
