import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class55 {

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    private int field806;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "[[I")
    public int[][] field811;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field797 = 0;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field812 = 0;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Z")
    public static boolean field813 = false;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Lgi;")
    public static class164 field815;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Lkc;")
    public static class301 field819;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "[[[I")
    public static int[][][] field798;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method341(int arg0) {
        class164.field2729++;
        if (arg0 != -4) {
            method350(72, -97);
        }
        class311.field5027.method2081(false, 126);
        field794++;
        class311.field5027.method1840((byte) 47, 0L);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
    private final void method342(int arg0, int arg1, int arg2, int arg3) {
        field809++;
        this.field811[arg0][arg3] = class76.method555(this.field811[arg0][arg3], arg2);
        if (arg1 != -27355) {
            field798 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIII)V")
    private final void method343(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 26 / ((-arg1 - 22) / 41);
        this.field811[arg0][arg2] = class233.method1609(this.field811[arg0][arg2], ~arg3);
        field820++;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method344(int arg0) {
        field815 = null;
        if (arg0 != 8) {
            field797 = 77;
        }
        field798 = null;
        field819 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZIIZZI)V")
    public final void method345(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field803++;
        int var8 = arg2 - this.field793;
        int var9 = arg6 - this.field802;
        if (!arg1) {
            field815 = null;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method343(var8, 108, var9, 128);
                this.method343(var8 - 1, 75, var9, 8);
            }
            if (arg3 == 1) {
                this.method343(var8, -106, var9, 2);
                this.method343(var8, -104, var9 + 1, 32);
            }
            if (arg3 == 2) {
                this.method343(var8, 115, var9, 8);
                this.method343(var8 + 1, 51, var9, 128);
            }
            if (arg3 == 3) {
                this.method343(var8, -120, var9, 32);
                this.method343(var8, 26, var9 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method343(var8, -92, var9, 1);
                this.method343(var8 - 1, 27, var9 + 1, 16);
            }
            if (arg3 == 1) {
                this.method343(var8, -94, var9, 4);
                this.method343(var8 + 1, 76, var9 + 1, 64);
            }
            if (arg3 == 2) {
                this.method343(var8, 104, var9, 16);
                this.method343(var8 + 1, 89, var9 - 1, 1);
            }
            if (arg3 == 3) {
                this.method343(var8, 67, var9, 64);
                this.method343(var8 - 1, -83, var9 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method343(var8, -80, var9, 130);
                this.method343(var8 - 1, -89, var9, 8);
                this.method343(var8, -101, var9 + 1, 32);
            }
            if (arg3 == 1) {
                this.method343(var8, -64, var9, 10);
                this.method343(var8, 112, var9 + 1, 32);
                this.method343(var8 + 1, -85, var9, 128);
            }
            if (arg3 == 2) {
                this.method343(var8, -89, var9, 40);
                this.method343(var8 + 1, -118, var9, 128);
                this.method343(var8, 115, var9 - 1, 2);
            }
            if (arg3 == 3) {
                this.method343(var8, 122, var9, 160);
                this.method343(var8, 106, var9 - 1, 2);
                this.method343(var8 - 1, 111, var9, 8);
            }
        }
        if (arg4) {
            if (arg0 == 0) {
                if (arg3 == 0) {
                    this.method343(var8, 123, var9, 65536);
                    this.method343(var8 - 1, 29, var9, 4096);
                }
                if (arg3 == 1) {
                    this.method343(var8, -84, var9, 1024);
                    this.method343(var8, -98, var9 + 1, 16384);
                }
                if (arg3 == 2) {
                    this.method343(var8, -109, var9, 4096);
                    this.method343(var8 + 1, -103, var9, 65536);
                }
                if (arg3 == 3) {
                    this.method343(var8, 108, var9, 16384);
                    this.method343(var8, -109, var9 - 1, 1024);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg3 == 0) {
                    this.method343(var8, -93, var9, 512);
                    this.method343(var8 - 1, 127, var9 + 1, 8192);
                }
                if (arg3 == 1) {
                    this.method343(var8, 23, var9, 2048);
                    this.method343(var8 + 1, 65, var9 + 1, 32768);
                }
                if (arg3 == 2) {
                    this.method343(var8, -99, var9, 8192);
                    this.method343(var8 + 1, 97, var9 - 1, 512);
                }
                if (arg3 == 3) {
                    this.method343(var8, -115, var9, 32768);
                    this.method343(var8 - 1, -128, var9 - 1, 2048);
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    this.method343(var8, 48, var9, 66560);
                    this.method343(var8 - 1, 45, var9, 4096);
                    this.method343(var8, 84, var9 + 1, 16384);
                }
                if (arg3 == 1) {
                    this.method343(var8, -101, var9, 5120);
                    this.method343(var8, 55, var9 + 1, 16384);
                    this.method343(var8 + 1, 71, var9, 65536);
                }
                if (arg3 == 2) {
                    this.method343(var8, 46, var9, 20480);
                    this.method343(var8 + 1, 104, var9, 65536);
                    this.method343(var8, -86, var9 - 1, 1024);
                }
                if (arg3 == 3) {
                    this.method343(var8, 44, var9, 81920);
                    this.method343(var8, 30, var9 - 1, 1024);
                    this.method343(var8 - 1, 117, var9, 4096);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method343(var8, 108, var9, 536870912);
                this.method343(var8 - 1, 24, var9, 33554432);
            }
            if (arg3 == 1) {
                this.method343(var8, 93, var9, 8388608);
                this.method343(var8, 93, var9 + 1, 134217728);
            }
            if (arg3 == 2) {
                this.method343(var8, -96, var9, 33554432);
                this.method343(var8 + 1, -87, var9, 536870912);
            }
            if (arg3 == 3) {
                this.method343(var8, -69, var9, 134217728);
                this.method343(var8, 117, var9 - 1, 8388608);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method343(var8, 59, var9, 4194304);
                this.method343(var8 - 1, -106, var9 + 1, 67108864);
            }
            if (arg3 == 1) {
                this.method343(var8, 121, var9, 16777216);
                this.method343(var8 + 1, -123, var9 + 1, 268435456);
            }
            if (arg3 == 2) {
                this.method343(var8, 101, var9, 67108864);
                this.method343(var8 + 1, 93, var9 - 1, 4194304);
            }
            if (arg3 == 3) {
                this.method343(var8, -68, var9, 268435456);
                this.method343(var8 - 1, 69, var9 - 1, 16777216);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method343(var8, -79, var9, 545259520);
            this.method343(var8 - 1, 78, var9, 33554432);
            this.method343(var8, -105, var9 + 1, 134217728);
        }
        if (arg3 == 1) {
            this.method343(var8, 85, var9, 41943040);
            this.method343(var8, 107, var9 + 1, 134217728);
            this.method343(var8 + 1, -80, var9, 536870912);
        }
        if (arg3 == 2) {
            this.method343(var8, -86, var9, 167772160);
            this.method343(var8 + 1, 77, var9, 536870912);
            this.method343(var8, -82, var9 - 1, 8388608);
        }
        if (arg3 == 3) {
            this.method343(var8, 74, var9, 671088640);
            this.method343(var8, 34, var9 - 1, 8388608);
            this.method343(var8 - 1, -112, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZII)V")
    public final void method346(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field802;
        field805++;
        if (arg0) {
            this.method358(true, true, 66, -118, -117, 49, 31);
        }
        int var5 = arg1 - this.field793;
        this.field811[var5][var4] = class233.method1609(this.field811[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIZIII)Z")
    private static final boolean method347(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field799++;
        if (arg5) {
            field797 = 42;
        }
        if (arg0 < (arg1 + arg4) && arg0 + arg3 > arg1) {
            return arg2 < arg6 + arg8 && (arg2 + arg7) > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method348(byte arg0) {
        field807++;
        if (class247.field3884) {
            return;
        }
        class247.field3884 = true;
        int var1 = 58 % ((arg0 + 59) / 44);
        if (class184.field3053) {
            class226.field3554 = (float) ((int) class226.field3554 - 17 & 0xFFFFFFF0);
        } else {
            class266.field4323 += (-class266.field4323 - 12.0F) / 2.0F;
        }
        class8.field181 = true;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field800++;
        if (arg0 == 1) {
            if (arg3 == arg5 && arg2 == arg4) {
                return true;
            }
        } else if (arg3 <= arg5 && arg5 <= (arg3 + arg0 - 1) && arg4 >= arg4 && arg4 <= arg4 + arg0 - 1) {
            return true;
        }
        int var9 = arg2 - this.field802;
        int var10 = arg4 - this.field802;
        int var11 = arg3 - this.field793;
        if (arg1 != 32) {
            field797 = 19;
        }
        int var12 = arg5 - this.field793;
        if (arg0 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field811[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field811[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field811[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field811[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field811[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field811[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field811[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field811[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field811[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field811[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field811[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field811[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var11 - 1;
            int var14 = arg0 + var9 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var12 + 1 == var11 && var9 <= var10 && var10 <= var14 && (this.field811[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var10 - arg0 == var9 && (this.field811[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var12 - arg0 == var11 && var9 <= var10 && var14 >= var10 && (this.field811[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var10 - arg0 == var9 && (this.field811[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var12 - arg0) == var11 && var10 >= var9 && var14 >= var10 && (this.field811[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var10 + 1 == var9 && (this.field811[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var12 + 1 == var11 && var9 <= var10 && var14 >= var10 && (this.field811[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var10 + 1) == var9 && (this.field811[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var12 >= var11 && var13 >= var12 && var10 + 1 == var9 && (this.field811[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var11 && var12 <= var13 && var10 - arg0 == var9 && (this.field811[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg0 == var11 && var10 >= var9 && var14 >= var10 && (this.field811[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var9 <= var10 && var14 >= var10 && (this.field811[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
    public static final void method350(int arg0, int arg1) {
        class88.field1373.method1880(-71, arg1);
        int var2 = -118 % ((-arg0 - 10) / 34);
        class158.field2570.method1880(-122, arg1);
        field816++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
    public final void method351(int arg0, int arg1, int arg2) {
        int var4 = -116 / ((arg0 + 57) / 50);
        int var5 = arg1 - this.field802;
        field814++;
        int var6 = arg2 - this.field793;
        this.field811[var6][var5] = class76.method555(this.field811[var6][var5], 262144);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field796++;
        if (arg5 == 1) {
            if (arg3 == arg6 && arg1 == arg4) {
                return true;
            }
        } else if (arg6 >= arg3 && arg5 + arg3 - 1 >= arg6 && arg4 >= arg4 && (arg4 + arg5 - 1) >= arg4) {
            return true;
        }
        if (arg7 != 1) {
            this.method353(109);
        }
        int var9 = arg4 - this.field802;
        int var10 = arg1 - this.field802;
        int var11 = arg6 - this.field793;
        int var12 = arg3 - this.field793;
        if (arg5 == 1) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field811[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field811[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field811[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field811[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field811[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field811[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                    if (var11 - 1 == var12 && var9 == var10 && (this.field811[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field811[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field811[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field811[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field811[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field811[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field811[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field811[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field811[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field811[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 == var12 && (var9 + 1) == var10 && (this.field811[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field811[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var12 && var9 == var10 && (this.field811[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 == var10 && (this.field811[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 - (1 - arg5);
            int var14 = arg5 + var10 - 1;
            if (arg2 == 0) {
                if (arg0 == 0) {
                    if ((var11 - arg5) == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 + 1 == var10 && (this.field811[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg5) == var10 && (this.field811[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var12 <= var11 && var11 <= var13 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 - arg5) == var12 && var10 <= var9 && var14 >= var9 && (this.field811[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var14 >= var9 && (this.field811[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 + 1) == var10 && (this.field811[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg5) == var10 && (this.field811[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 >= var12 && var13 >= var11 && var9 - arg5 == var10) {
                        return true;
                    }
                    if ((var11 - arg5) == var12 && var9 >= var10 && var14 >= var9 && (this.field811[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 <= var9 && var14 >= var9 && (this.field811[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    if ((var11 - arg5) == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9 && (this.field811[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 - arg5 == var10 && (this.field811[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - arg5 == var12 && var9 >= var10 && var9 <= var14 && (this.field811[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 - arg5 == var10 && (this.field811[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 - arg5 == var12 && var9 >= var10 && var14 >= var9 && (this.field811[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 + 1) == var10 && (this.field811[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var9 - arg5 == var10) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 - arg5 == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var9 + 1 == var10 && (this.field811[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 <= var9 && var9 <= var14 && (this.field811[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 - arg5 == var10) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var12 <= var11 && var13 >= var11 && var9 + 1 == var10 && (this.field811[var11][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 <= var11 && var11 <= var13 && (var9 - arg5) == var10 && (this.field811[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg5) == var12 && var9 >= var10 && var14 >= var9 && (this.field811[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var10 <= var9 && var9 <= var14 && (this.field811[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public final void method353(int arg0) {
        for (int var2 = 0; var2 < this.field806; var2++) {
            for (int var3 = 0; var3 < this.field818; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field806 - 5) || var3 >= this.field818 - 5) {
                    this.field811[var2][var3] = 16777215;
                } else {
                    this.field811[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 >= -109) {
            this.field802 = -77;
        }
        field804++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZBIIZI)V")
    public final void method354(int arg0, boolean arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field802;
        field801++;
        int var9 = arg0 - this.field793;
        int var10 = 256;
        if (arg1) {
            var10 |= 0x20000;
        }
        if (arg5) {
            var10 |= 0x40000000;
        }
        int var11 = -69 % ((arg2 + 9) / 63);
        for (int var12 = var9; var12 < (arg3 + var9); var12++) {
            if (var12 >= 0 && this.field806 > var12) {
                for (int var13 = var8; var13 < (arg6 + var8); var13++) {
                    if (var13 >= 0 && this.field818 > var13) {
                        this.method342(var12, -27355, var10, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZZZIII)V")
    public final void method355(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7) {
        int var9 = arg6 - this.field793;
        field817++;
        if (arg4) {
            this.method351(-99, -126, 75);
        }
        int var10 = 256;
        int var11 = arg7 - this.field802;
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg0;
            arg0 = arg1;
            arg1 = var12;
        }
        if (arg3) {
            var10 |= 0x20000;
        }
        if (arg2) {
            var10 |= 0x40000000;
        }
        for (int var13 = var9; var13 < (arg0 + var9); var13++) {
            if (var13 >= 0 && this.field806 > var13) {
                for (int var14 = var11; var14 < arg1 + var11; var14++) {
                    if (var14 >= 0 && this.field818 > var14) {
                        this.method343(var13, 27, var14, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != 182) {
            this.field806 = 30;
        }
        field792++;
        int var11 = arg0 + arg9;
        int var12 = arg6 + arg7;
        int var13 = arg3 + arg5;
        int var14 = arg4 + arg8;
        if (arg9 >= arg6 && var12 > arg9) {
            if (arg8 == var13 && (arg1 & 0x4) == 0) {
                int var15 = arg9;
                int var16 = var12 >= var11 ? var11 : var12;
                while (var15 < var16) {
                    if ((this.field811[var15 - this.field793][var13 - this.field802 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg5 == var14 && (arg1 & 0x1) == 0) {
                int var17 = arg9;
                int var18 = var11 > var12 ? var12 : var11;
                while (var18 > var17) {
                    if ((this.field811[var17 - this.field793][arg5 - this.field802] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg6 && var12 >= var11) {
            if (arg8 == var13 && (arg1 & 0x4) == 0) {
                int var19 = arg6;
                int var20 = var12 < var11 ? var12 : var11;
                while (var20 > var19) {
                    if ((this.field811[var19 - this.field793][var13 - this.field802 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var19++;
                }
            } else if (arg5 == var14 && (arg1 & 0x1) == 0) {
                int var21 = arg6;
                int var22 = var11 > var12 ? var12 : var11;
                while (var21 < var22) {
                    if ((this.field811[var21 - this.field793][arg5 - this.field802] & 0x20) == 0) {
                        return true;
                    }
                    var21++;
                }
            }
        } else if (arg8 <= arg5 && arg5 < var14) {
            if (arg6 == var11 && (arg1 & 0x8) == 0) {
                int var23 = arg5;
                int var24 = var14 >= var13 ? var13 : var14;
                while (var24 > var23) {
                    if ((this.field811[var11 - this.field793 - 1][var23 - this.field802] & 0x8) == 0) {
                        return true;
                    }
                    var23++;
                }
            } else if (arg9 == var12 && (arg1 & 0x2) == 0) {
                int var25 = arg5;
                int var26 = var13 <= var14 ? var13 : var14;
                while (var26 > var25) {
                    if ((this.field811[arg9 - this.field793][var25 - this.field802] & 0x80) == 0) {
                        return true;
                    }
                    var25++;
                }
            }
        } else if (arg8 < var13 && var14 >= var13) {
            if (arg6 == var11 && (arg1 & 0x8) == 0) {
                int var27 = arg8;
                int var28 = var14 >= var13 ? var13 : var14;
                while (var28 > var27) {
                    if ((this.field811[var11 - this.field793 - 1][var27 - this.field802] & 0x8) == 0) {
                        return true;
                    }
                    var27++;
                }
            } else if (arg9 == var12 && (arg1 & 0x2) == 0) {
                int var29 = arg8;
                int var30 = var13 <= var14 ? var13 : var14;
                while (var30 > var29) {
                    if ((this.field811[arg9 - this.field793][var29 - this.field802] & 0x80) == 0) {
                        return true;
                    }
                    var29++;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIIIIIIII)Z")
    public final boolean method357(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field795++;
        if (arg5 > 1) {
            return method347(arg7, arg1, arg2, arg5, arg3, false, arg6, arg5, arg4) ? true : this.method356(arg5, arg8, 182, arg5, arg6, arg2, arg1, arg3, arg4, arg7);
        } else if (arg0 < 7) {
            return true;
        } else {
            int var10 = arg1 + arg3 - 1;
            int var11 = arg4 + arg6 - 1;
            if (arg7 >= arg1 && var10 >= arg7 && arg4 <= arg2 && var11 >= arg2) {
                return true;
            } else if ((arg1 - 1) == arg7 && arg4 <= arg2 && arg2 <= var11 && (this.field811[arg7 - this.field793][arg2 - this.field802] & 0x8) == 0 && (arg8 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg7 && arg4 <= arg2 && var11 >= arg2 && (this.field811[arg7 - this.field793][arg2 - this.field802] & 0x80) == 0 && (arg8 & 0x2) == 0) {
                return true;
            } else if (arg4 - 1 == arg2 && arg7 >= arg1 && arg7 <= var10 && (this.field811[arg7 - this.field793][arg2 - this.field802] & 0x2) == 0 && (arg8 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg2 && arg7 >= arg1 && arg7 <= var10 && (this.field811[arg7 - this.field793][arg2 - this.field802] & 0x20) == 0 && (arg8 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZZIIIII)V")
    public final void method358(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field793;
        int var9 = arg2 - this.field802;
        field808++;
        if (arg6 == 0) {
            if (arg4 == 0) {
                this.method342(var8, -27355, 128, var9);
                this.method342(var8 - 1, -27355, 8, var9);
            }
            if (arg4 == 1) {
                this.method342(var8, arg3 - 2911203, 2, var9);
                this.method342(var8, -27355, 32, var9 + 1);
            }
            if (arg4 == 2) {
                this.method342(var8, -27355, 8, var9);
                this.method342(var8 + 1, -27355, 128, var9);
            }
            if (arg4 == 3) {
                this.method342(var8, -27355, 32, var9);
                this.method342(var8, -27355, 2, var9 - 1);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg4 == 0) {
                this.method342(var8, -27355, 1, var9);
                this.method342(var8 - 1, -27355, 16, var9 + 1);
            }
            if (arg4 == 1) {
                this.method342(var8, -27355, 4, var9);
                this.method342(var8 + 1, arg3 + -2911203, 64, var9 + 1);
            }
            if (arg4 == 2) {
                this.method342(var8, -27355, 16, var9);
                this.method342(var8 + 1, -27355, 1, var9 - 1);
            }
            if (arg4 == 3) {
                this.method342(var8, -27355, 64, var9);
                this.method342(var8 - 1, -27355, 4, var9 - 1);
            }
        }
        if (arg3 != 2883848) {
            return;
        }
        if (arg6 == 2) {
            if (arg4 == 0) {
                this.method342(var8, -27355, 130, var9);
                this.method342(var8 - 1, -27355, 8, var9);
                this.method342(var8, arg3 ^ 0xFFD3942D, 32, var9 + 1);
            }
            if (arg4 == 1) {
                this.method342(var8, -27355, 10, var9);
                this.method342(var8, -27355, 32, var9 + 1);
                this.method342(var8 + 1, -27355, 128, var9);
            }
            if (arg4 == 2) {
                this.method342(var8, -27355, 40, var9);
                this.method342(var8 + 1, -27355, 128, var9);
                this.method342(var8, -27355, 2, var9 - 1);
            }
            if (arg4 == 3) {
                this.method342(var8, -27355, 160, var9);
                this.method342(var8, -27355, 2, var9 - 1);
                this.method342(var8 - 1, arg3 + -2911203, 8, var9);
            }
        }
        if (arg0) {
            if (arg6 == 0) {
                if (arg4 == 0) {
                    this.method342(var8, arg3 ^ 0xFFD3942D, 65536, var9);
                    this.method342(var8 - 1, -27355, 4096, var9);
                }
                if (arg4 == 1) {
                    this.method342(var8, -27355, 1024, var9);
                    this.method342(var8, -27355, 16384, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method342(var8, arg3 - 2911203, 4096, var9);
                    this.method342(var8 + 1, -27355, 65536, var9);
                }
                if (arg4 == 3) {
                    this.method342(var8, -27355, 16384, var9);
                    this.method342(var8, -27355, 1024, var9 - 1);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg4 == 0) {
                    this.method342(var8, arg3 ^ 0xFFD3942D, 512, var9);
                    this.method342(var8 - 1, -27355, 8192, var9 + 1);
                }
                if (arg4 == 1) {
                    this.method342(var8, arg3 - 2911203, 2048, var9);
                    this.method342(var8 + 1, -27355, 32768, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method342(var8, -27355, 8192, var9);
                    this.method342(var8 + 1, -27355, 512, var9 - 1);
                }
                if (arg4 == 3) {
                    this.method342(var8, arg3 - 2911203, 32768, var9);
                    this.method342(var8 - 1, -27355, 2048, var9 - 1);
                }
            }
            if (arg6 == 2) {
                if (arg4 == 0) {
                    this.method342(var8, arg3 - 2911203, 66560, var9);
                    this.method342(var8 - 1, -27355, 4096, var9);
                    this.method342(var8, arg3 ^ 0xFFD3942D, 16384, var9 + 1);
                }
                if (arg4 == 1) {
                    this.method342(var8, -27355, 5120, var9);
                    this.method342(var8, -27355, 16384, var9 + 1);
                    this.method342(var8 + 1, -27355, 65536, var9);
                }
                if (arg4 == 2) {
                    this.method342(var8, -27355, 20480, var9);
                    this.method342(var8 + 1, -27355, 65536, var9);
                    this.method342(var8, -27355, 1024, var9 - 1);
                }
                if (arg4 == 3) {
                    this.method342(var8, -27355, 81920, var9);
                    this.method342(var8, arg3 - 2911203, 1024, var9 - 1);
                    this.method342(var8 - 1, -27355, 4096, var9);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg6 == 0) {
            if (arg4 == 0) {
                this.method342(var8, -27355, 536870912, var9);
                this.method342(var8 - 1, -27355, 33554432, var9);
            }
            if (arg4 == 1) {
                this.method342(var8, -27355, 8388608, var9);
                this.method342(var8, -27355, 134217728, var9 + 1);
            }
            if (arg4 == 2) {
                this.method342(var8, -27355, 33554432, var9);
                this.method342(var8 + 1, -27355, 536870912, var9);
            }
            if (arg4 == 3) {
                this.method342(var8, -27355, 134217728, var9);
                this.method342(var8, -27355, 8388608, var9 - 1);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg4 == 0) {
                this.method342(var8, -27355, 4194304, var9);
                this.method342(var8 - 1, -27355, 67108864, var9 + 1);
            }
            if (arg4 == 1) {
                this.method342(var8, -27355, 16777216, var9);
                this.method342(var8 + 1, arg3 ^ 0xFFD3942D, 268435456, var9 + 1);
            }
            if (arg4 == 2) {
                this.method342(var8, arg3 ^ 0xFFD3942D, 67108864, var9);
                this.method342(var8 + 1, -27355, 4194304, var9 - 1);
            }
            if (arg4 == 3) {
                this.method342(var8, arg3 ^ 0xFFD3942D, 268435456, var9);
                this.method342(var8 - 1, -27355, 16777216, var9 - 1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method342(var8, arg3 ^ 0xFFD3942D, 545259520, var9);
            this.method342(var8 - 1, -27355, 33554432, var9);
            this.method342(var8, -27355, 134217728, var9 + 1);
        }
        if (arg4 == 1) {
            this.method342(var8, arg3 - 2911203, 41943040, var9);
            this.method342(var8, -27355, 134217728, var9 + 1);
            this.method342(var8 + 1, -27355, 536870912, var9);
        }
        if (arg4 == 2) {
            this.method342(var8, -27355, 167772160, var9);
            this.method342(var8 + 1, -27355, 536870912, var9);
            this.method342(var8, -27355, 8388608, var9 - 1);
        }
        if (arg4 == 3) {
            this.method342(var8, -27355, 671088640, var9);
            this.method342(var8, -27355, 8388608, var9 - 1);
            this.method342(var8 - 1, arg3 ^ 0xFFD3942D, 33554432, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(II)V")
    public class55(int arg0, int arg1) {
        this.field818 = arg1;
        this.field806 = arg0;
        this.field811 = new int[this.field806][this.field818];
        this.field793 = 0;
        this.field802 = 0;
        this.method353(-127);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZ)V")
    public final void method359(int arg0, int arg1, boolean arg2) {
        field810++;
        int var4 = arg0 - this.field802;
        int var5 = arg1 - this.field793;
        this.field811[var5][var4] = class76.method555(this.field811[var5][var4], 2097152);
        if (!arg2) {
            this.method354(-109, false, (byte) -123, 36, 6, false, -85);
        }
    }
}
