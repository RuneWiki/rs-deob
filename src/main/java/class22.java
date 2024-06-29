import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class22 {

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    private int field377 = 0;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "[[I")
    public int[][] field384;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "[I")
    public static int[] field373 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "[Lse;")
    public static class12[] field380 = new class12[2048];

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "Lwm;")
    private static class152 field385 = class157.method1048(" from your friend list first)3", 95);

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Lwm;")
    public static class152 field370 = field385;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[Lbg;")
    public static class203[] field360;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)V", line = 4)
    private final void method166(int arg0, int arg1, int arg2, int arg3) {
        this.field384[arg0][arg2] = class72.method493(this.field384[arg0][arg2], arg1);
        if (arg3 != 19661064) {
            field370 = (class152) null;
        }
        field368++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 15)
    public final void method167(int arg0) {
        field369++;
        if (arg0 > -52) {
            this.field379 = 105;
        }
        for (int var2 = 0; var2 < this.field355; var2++) {
            for (int var3 = 0; var3 < this.field379; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field355 - 5) <= var2 || this.field379 - 5 <= var3) {
                    this.field384[var2][var3] = 16777215;
                } else {
                    this.field384[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZIIII)V", line = 48)
    public final void method168(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field363;
        field386++;
        int var8 = arg3 - this.field377;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method184(83, var7, 128, var8);
                this.method184(57, var7, 8, var8 - 1);
            }
            if (arg4 == 1) {
                this.method184(66, var7, 2, var8);
                this.method184(88, var7 + 1, 32, var8);
            }
            if (arg4 == 2) {
                this.method184(110, var7, 8, var8);
                this.method184(45, var7, 128, var8 + 1);
            }
            if (arg4 == 3) {
                this.method184(83, var7, 32, var8);
                this.method184(112, var7 - 1, 2, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method184(91, var7, 1, var8);
                this.method184(51, var7 + 1, 16, var8 - 1);
            }
            if (arg4 == 1) {
                this.method184(78, var7, 4, var8);
                this.method184(85, var7 + 1, 64, var8 + 1);
            }
            if (arg4 == 2) {
                this.method184(127, var7, 16, var8);
                this.method184(39, var7 - 1, 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method184(42, var7, 64, var8);
                this.method184(63, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg0 <= 34) {
            this.method187(false, 114, -5, 6, false, -8);
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method184(115, var7, 130, var8);
                this.method184(48, var7, 8, var8 - 1);
                this.method184(72, var7 + 1, 32, var8);
            }
            if (arg4 == 1) {
                this.method184(68, var7, 10, var8);
                this.method184(93, var7 + 1, 32, var8);
                this.method184(97, var7, 128, var8 + 1);
            }
            if (arg4 == 2) {
                this.method184(54, var7, 40, var8);
                this.method184(124, var7, 128, var8 + 1);
                this.method184(92, var7 - 1, 2, var8);
            }
            if (arg4 == 3) {
                this.method184(47, var7, 160, var8);
                this.method184(114, var7 - 1, 2, var8);
                this.method184(101, var7, 8, var8 - 1);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method184(99, var7, 65536, var8);
                this.method184(105, var7, 4096, var8 - 1);
            }
            if (arg4 == 1) {
                this.method184(101, var7, 1024, var8);
                this.method184(96, var7 + 1, 16384, var8);
            }
            if (arg4 == 2) {
                this.method184(38, var7, 4096, var8);
                this.method184(75, var7, 65536, var8 + 1);
            }
            if (arg4 == 3) {
                this.method184(73, var7, 16384, var8);
                this.method184(39, var7 - 1, 1024, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method184(53, var7, 512, var8);
                this.method184(104, var7 + 1, 8192, var8 - 1);
            }
            if (arg4 == 1) {
                this.method184(86, var7, 2048, var8);
                this.method184(107, var7 + 1, 32768, var8 + 1);
            }
            if (arg4 == 2) {
                this.method184(58, var7, 8192, var8);
                this.method184(122, var7 - 1, 512, var8 + 1);
            }
            if (arg4 == 3) {
                this.method184(95, var7, 32768, var8);
                this.method184(104, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method184(66, var7, 66560, var8);
            this.method184(51, var7, 4096, var8 - 1);
            this.method184(75, var7 + 1, 16384, var8);
        }
        if (arg4 == 1) {
            this.method184(44, var7, 5120, var8);
            this.method184(72, var7 + 1, 16384, var8);
            this.method184(41, var7, 65536, var8 + 1);
        }
        if (arg4 == 2) {
            this.method184(54, var7, 20480, var8);
            this.method184(99, var7, 65536, var8 + 1);
            this.method184(84, var7 - 1, 1024, var8);
        }
        if (arg4 == 3) {
            this.method184(122, var7, 81920, var8);
            this.method184(97, var7 - 1, 1024, var8);
            this.method184(123, var7, 4096, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIZII)V", line = 261)
    public final void method169(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field377;
        field378++;
        if (arg4 != -26945) {
            return;
        }
        int var8 = arg5 - this.field363;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method166(var7, 128, var8, 19661064);
                this.method166(var7 - 1, 8, var8, 19661064);
            }
            if (arg0 == 1) {
                this.method166(var7, 2, var8, 19661064);
                this.method166(var7, 32, var8 + 1, arg4 ^ 0xFED397B7);
            }
            if (arg0 == 2) {
                this.method166(var7, 8, var8, 19661064);
                this.method166(var7 + 1, 128, var8, 19661064);
            }
            if (arg0 == 3) {
                this.method166(var7, 32, var8, 19661064);
                this.method166(var7, 2, var8 - 1, 19661064);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method166(var7, 1, var8, 19661064);
                this.method166(var7 - 1, 16, var8 + 1, arg4 ^ 0xFED397B7);
            }
            if (arg0 == 1) {
                this.method166(var7, 4, var8, arg4 ^ 0xFED397B7);
                this.method166(var7 + 1, 64, var8 + 1, 19661064);
            }
            if (arg0 == 2) {
                this.method166(var7, 16, var8, 19661064);
                this.method166(var7 + 1, 1, var8 - 1, 19661064);
            }
            if (arg0 == 3) {
                this.method166(var7, 64, var8, 19661064);
                this.method166(var7 - 1, 4, var8 - 1, 19661064);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method166(var7, 130, var8, 19661064);
                this.method166(var7 - 1, 8, var8, 19661064);
                this.method166(var7, 32, var8 + 1, 19661064);
            }
            if (arg0 == 1) {
                this.method166(var7, 10, var8, 19661064);
                this.method166(var7, 32, var8 + 1, 19661064);
                this.method166(var7 + 1, 128, var8, 19661064);
            }
            if (arg0 == 2) {
                this.method166(var7, 40, var8, 19661064);
                this.method166(var7 + 1, 128, var8, arg4 ^ 0xFED397B7);
                this.method166(var7, 2, var8 - 1, 19661064);
            }
            if (arg0 == 3) {
                this.method166(var7, 160, var8, 19661064);
                this.method166(var7, 2, var8 - 1, 19661064);
                this.method166(var7 - 1, 8, var8, arg4 + 19688009);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method166(var7, 65536, var8, 19661064);
                this.method166(var7 - 1, 4096, var8, 19661064);
            }
            if (arg0 == 1) {
                this.method166(var7, 1024, var8, arg4 + 19688009);
                this.method166(var7, 16384, var8 + 1, 19661064);
            }
            if (arg0 == 2) {
                this.method166(var7, 4096, var8, 19661064);
                this.method166(var7 + 1, 65536, var8, 19661064);
            }
            if (arg0 == 3) {
                this.method166(var7, 16384, var8, 19661064);
                this.method166(var7, 1024, var8 - 1, 19661064);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method166(var7, 512, var8, arg4 ^ 0xFED397B7);
                this.method166(var7 - 1, 8192, var8 + 1, 19661064);
            }
            if (arg0 == 1) {
                this.method166(var7, 2048, var8, 19661064);
                this.method166(var7 + 1, 32768, var8 + 1, 19661064);
            }
            if (arg0 == 2) {
                this.method166(var7, 8192, var8, 19661064);
                this.method166(var7 + 1, 512, var8 - 1, 19661064);
            }
            if (arg0 == 3) {
                this.method166(var7, 32768, var8, arg4 ^ 0xFED397B7);
                this.method166(var7 - 1, 2048, var8 - 1, arg4 ^ 0xFED397B7);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method166(var7, 66560, var8, 19661064);
            this.method166(var7 - 1, 4096, var8, 19661064);
            this.method166(var7, 16384, var8 + 1, arg4 ^ 0xFED397B7);
        }
        if (arg0 == 1) {
            this.method166(var7, 5120, var8, arg4 + 19688009);
            this.method166(var7, 16384, var8 + 1, arg4 + 19688009);
            this.method166(var7 + 1, 65536, var8, arg4 + 19688009);
        }
        if (arg0 == 2) {
            this.method166(var7, 20480, var8, 19661064);
            this.method166(var7 + 1, 65536, var8, 19661064);
            this.method166(var7, 1024, var8 - 1, 19661064);
        }
        if (arg0 == 3) {
            this.method166(var7, 81920, var8, arg4 ^ 0xFED397B7);
            this.method166(var7, 1024, var8 - 1, 19661064);
            this.method166(var7 - 1, 4096, var8, 19661064);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIIII)Z", line = 469)
    private final boolean method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field364++;
        if (arg4 < arg5 + arg6 && arg5 < arg4 + arg0) {
            if (arg1 <= 93) {
                this.method176(12, -4, -110, 31, (byte) -87, 101, 62, 58, -109);
            }
            return arg7 < (arg2 + arg8) && (arg3 + arg7) > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V", line = 488)
    public final void method171(int arg0, int arg1, int arg2) {
        field371++;
        if (arg2 != 19661184) {
            this.field377 = 0;
        }
        int var4 = arg0 - this.field363;
        int var5 = arg1 - this.field377;
        this.field384[var5][var4] = class72.method493(this.field384[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIBIZI)V", line = 502)
    public final void method172(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field377;
        int var9 = arg0 - this.field363;
        int var10 = 256;
        if (arg3 != 75) {
            this.method180(false, -62, 73);
        }
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg1;
            arg1 = arg2;
            arg2 = var11;
        }
        if (arg5) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < arg1 + var8; var12++) {
            if (var12 >= 0 && this.field355 > var12) {
                for (int var13 = var9; var13 < arg2 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field379) {
                        this.method184(71, var13, var10, var12);
                    }
                }
            }
        }
        field358++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 556)
    public static final void method173(byte arg0) {
        class253 var1 = class236.field3866;
        synchronized (class236.field3866) {
            client.field4352 = class146.field2245;
            class183.field2915++;
            if (class216.field3510 >= 0) {
                while (class303.field5214 != class216.field3510) {
                    int var3 = class268.field4519[class303.field5214];
                    class303.field5214 = class303.field5214 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class216.field3515[var3] = true;
                    } else {
                        class216.field3515[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class216.field3515[var2] = false;
                }
                class216.field3510 = class303.field5214;
            }
            if (arg0 < 83) {
                return;
            }
            class146.field2245 = class59.field906;
        }
        field359++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIII)Z", line = 599)
    public final boolean method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != -1) {
            field380 = (class12[]) null;
        }
        field372++;
        if (arg0 == 1) {
            if (arg1 == arg3 && arg2 == arg6) {
                return true;
            }
        } else if (arg1 >= arg3 && arg3 - (1 - arg0) >= arg1 && arg2 >= arg2 && arg2 <= arg2 + arg0 - 1) {
            return true;
        }
        int var9 = arg6 - this.field363;
        int var10 = arg3 - this.field377;
        int var11 = arg1 - this.field377;
        int var12 = arg2 - this.field363;
        if (arg0 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field384[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field384[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field384[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field384[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field384[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field384[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field384[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field384[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field384[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var12 - 1) == var9 && (this.field384[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field384[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field384[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var10 - 1;
            int var14 = arg0 + var9 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var11 + 1 == var10 && var12 >= var9 && var14 >= var12 && (this.field384[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 - arg0 == var9 && (this.field384[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - arg0) == var10 && var9 <= var12 && var14 >= var12 && (this.field384[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 - arg0) == var9 && (this.field384[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - arg0) == var10 && var9 <= var12 && var12 <= var14 && (this.field384[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 + 1 == var9 && (this.field384[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 + 1) == var10 && var12 >= var9 && var14 >= var12 && (this.field384[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 + 1) == var9 && (this.field384[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var11 >= var10 && var11 <= var13 && var12 + 1 == var9 && (this.field384[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var10 && var11 <= var13 && (var12 - arg0) == var9 && (this.field384[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg0) == var10 && var9 <= var12 && var12 <= var14 && (this.field384[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 <= var12 && var12 <= var14 && (this.field384[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)[Ldc;", line = 804)
    public static final class109[] method175(int arg0) {
        class109[] var1 = new class109[class52.field807];
        field366++;
        for (int var2 = 0; var2 < class52.field807; var2++) {
            int var3 = class8.field106[var2] * class253.field4383[var2];
            byte[] var4 = class23.field403[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class134.field2070[class34.method251(255, var4[var6])];
            }
            var1[var2] = new class109(class186.field2975, class193.field3068, class180.field2865[var2], class179.field2856[var2], class253.field4383[var2], class8.field106[var2], var5);
        }
        class132.method841((byte) -115);
        if (arg0 != -32621) {
            method177(-35, -46);
        }
        return var1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIBIIII)Z", line = 842)
    public final boolean method176(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field365++;
        if (arg3 <= 1) {
            int var10 = arg2 + arg6 - 1;
            int var11 = arg0 + arg8 - 1;
            if (arg1 >= arg2 && arg1 <= var10 && arg0 <= arg5 && var11 >= arg5) {
                return true;
            } else if (arg2 - 1 == arg1 && arg5 >= arg0 && arg5 <= var11 && (this.field384[arg1 - this.field377][arg5 - this.field363] & 0x8) == 0 && (arg7 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg1 && arg0 <= arg5 && arg5 <= var11 && (this.field384[arg1 - this.field377][arg5 - this.field363] & 0x80) == 0 && (arg7 & 0x2) == 0) {
                return true;
            } else {
                int var12 = 99 / ((arg4 - 53) / 33);
                if ((arg0 - 1) == arg5 && arg1 >= arg2 && arg1 <= var10 && (this.field384[arg1 - this.field377][arg5 - this.field363] & 0x2) == 0 && (arg7 & 0x4) == 0) {
                    return true;
                } else {
                    return (var11 + 1) == arg5 && arg2 <= arg1 && arg1 <= var10 && (this.field384[arg1 - this.field377][arg5 - this.field363] & 0x20) == 0 && (arg7 & 0x1) == 0;
                }
            }
        } else if (this.method170(arg3, 99, arg8, arg3, arg1, arg2, arg6, arg5, arg0)) {
            return true;
        } else {
            return this.method186(arg5, arg0, arg6, arg8, arg3, arg2, arg3, arg1, (byte) -72, arg7);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Lsm;", line = 886)
    public static final class157 method177(int arg0, int arg1) {
        if (arg0 != 1) {
            return (class157) null;
        }
        class157 var2 = (class157) class62.field933.method1663((long) arg1, (byte) 98);
        field381++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class18.field260.method1381(1, arg1, 0);
        } else {
            var3 = class234.field3838.method1381(1, arg1 & 0x7FFF, arg0 ^ 0x1);
        }
        class157 var4 = new class157();
        if (var3 != null) {
            var4.method1050((byte) -107, new class291(var3));
        }
        if (arg1 >= 32768) {
            var4.method1046(-33);
        }
        class62.field933.method1662(var4, (long) arg1, arg0 ^ 0xFFFFFF98);
        return var4;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)Z", line = 916)
    public final boolean method178(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field357++;
        if (arg1 == arg3 && arg0 == arg2) {
            return true;
        }
        int var6 = arg1 - this.field377;
        int var7 = arg0 - this.field363;
        if (var6 < 0 || var6 >= this.field355 || var7 < 0 || this.field379 <= var7) {
            return false;
        }
        int var8 = arg3 - this.field377;
        int var9;
        if (var6 > var8) {
            var9 = var6 - var8;
        } else {
            var9 = var8 - var6;
        }
        int var10 = arg2 - this.field363;
        int var11;
        if (var7 <= var10) {
            var11 = var10 - var7;
        } else {
            var11 = var7 - var10;
        }
        if (var9 <= var11) {
            int var12 = var9 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var10) {
                if (var7 > var10) {
                    if ((this.field384[var8][var10] & 0x12C0102) != 0) {
                        return false;
                    }
                    var10++;
                } else if (var7 < var10) {
                    if ((this.field384[var8][var10] & 0x12C0120) != 0) {
                        return false;
                    }
                    var10--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var8 < var6) {
                        if ((this.field384[var8][var10] & 0x12C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field384[var8][var10] & 0x12C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var9;
            int var15 = 32768;
            while (var6 != var8) {
                if (var6 > var8) {
                    if ((this.field384[var8][var10] & 0x12C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var6) {
                    if ((this.field384[var8][var10] & 0x12C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 > var10) {
                        if ((this.field384[var8][var10] & 0x12C0102) != 0) {
                            return false;
                        }
                        var10++;
                    } else if (var7 < var10) {
                        if ((this.field384[var8][var10] & 0x12C0120) != 0) {
                            return false;
                        }
                        var10--;
                    }
                }
            }
        }
        return (this.field384[var6][var7] & arg4) == 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BII)V", line = 1069)
    public final void method179(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field377;
        if (arg0 != -103) {
            this.method174(-95, 120, 15, 78, -101, -122, -109, -106);
        }
        int var5 = arg1 - this.field363;
        this.field384[var4][var5] = class72.method493(this.field384[var4][var5], 2097152);
        field376++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZII)V", line = 1085)
    public final void method180(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field363;
        if (arg0) {
            int var5 = arg2 - this.field377;
            this.field384[var5][var4] = class34.method251(this.field384[var5][var4], -262145);
            field367++;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V", line = 1098)
    public static void method181(int arg0) {
        field385 = null;
        field360 = null;
        field373 = null;
        field380 = null;
        field370 = null;
        if (arg0 != 0) {
            field360 = (class203[]) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIIIIIII)Z", line = 1115)
    public final boolean method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -13385) {
            this.method182(-41, -76, -42, 109, -123, 86, -102, 96);
        }
        field362++;
        if (arg4 == 1) {
            if (arg0 == arg5 && arg2 == arg3) {
                return true;
            }
        } else if (arg5 <= arg0 && arg5 + arg4 - 1 >= arg0 && arg3 <= arg3 && arg3 <= arg3 + arg4 - 1) {
            return true;
        }
        int var9 = arg3 - this.field363;
        int var10 = arg2 - this.field363;
        int var11 = arg0 - this.field377;
        int var12 = arg5 - this.field377;
        if (arg4 == 1) {
            if (arg1 == 0) {
                if (arg7 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field384[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field384[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field384[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field384[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field384[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field384[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field384[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field384[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg7 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field384[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field384[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field384[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field384[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field384[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field384[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field384[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field384[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field384[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field384[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field384[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 == var10 && (this.field384[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var12 - 1;
            int var14 = arg4 + var10 - 1;
            if (arg1 == 0) {
                if (arg7 == 0) {
                    if ((var11 - arg4) == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field384[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 - arg4 == var10 && (this.field384[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 >= var12 && var11 <= var13 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var11 - arg4 == var12 && var10 <= var9 && var14 >= var9 && (this.field384[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var14 >= var9 && (this.field384[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 + 1) == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 + 1) == var10 && (this.field384[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg4) == var10 && (this.field384[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg4) == var10) {
                        return true;
                    }
                    if ((var11 - arg4) == var12 && var9 >= var10 && var14 >= var9 && (this.field384[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var14 >= var9 && (this.field384[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg7 == 0) {
                    if ((var11 - arg4) == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9 && (this.field384[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg4) == var10 && (this.field384[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - arg4) == var12 && var10 <= var9 && var14 >= var9 && (this.field384[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var9 - arg4 == var10 && (this.field384[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - arg4 == var12 && var10 <= var9 && var9 <= var14 && (this.field384[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field384[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg4) == var10) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 - arg4 == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field384[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var14 >= var9 && (this.field384[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 - arg4) == var10) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var11 >= var12 && var11 <= var13 && (var9 + 1) == var10 && (this.field384[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var12 && var13 >= var11 && (var9 - arg4) == var10 && (this.field384[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var11 - arg4 == var12 && var10 <= var9 && var14 >= var9 && (this.field384[var13][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var10 <= var9 && var9 <= var14 && (this.field384[var12][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([SB)[S", line = 1479)
    public static final short[] method183(short[] arg0, byte arg1) {
        field375++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == -94) {
            short[] var2 = new short[arg0.length];
            class187.method1248(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return (short[]) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIII)V", line = 1506)
    private final void method184(int arg0, int arg1, int arg2, int arg3) {
        field356++;
        this.field384[arg3][arg1] = class34.method251(this.field384[arg3][arg1], ~arg2);
        if (arg0 <= 37) {
            this.field377 = 26;
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V", line = 1517)
    public static final void method185(int arg0) {
        class232.field3810 = class154.field2447;
        class295.field5041 = class204.field3296;
        class179.field2853 = class141.field2163;
        class26.field434 = class42.field669;
        class180.field2872 = class323.field5639;
        class241.field3943 = class46.field735;
        class208.field3396 = class116.field1644;
        class156.field2478 = class268.field4523;
        class70.field1017 = class114.field1621;
        class193.field3081 = class196.field3136;
        class124.field1735 = class284.field4829;
        class196.field3143 = class116.field1647;
        class106.field1515 = class41.field655;
        class15.field200 = class196.field3145;
        class73.field1069 = class194.field3101;
        class3.field56 = class289.field4890;
        class18.field257 = class245.field4129;
        class311.field5320 = class199.field3215;
        class112.field1593 = class303.field5210;
        class249.field4263 = class191.field3017;
        class170.field2663 = class157.field2511;
        class306.field5264 = class252.field4329;
        class197.field3169 = class295.field5043;
        field370 = class288.field4878;
        class55.field869 = class133.field2047;
        class197.field3163 = class295.field5043;
        class191.field3010 = class94.field1335;
        class107.field1518 = class240.field3931;
        class143.field2213 = class303.field5211;
        class198.field3180 = class65.field982;
        class48.field744 = class17.field245;
        class216.field3511 = class124.field1736;
        class26.field439 = class26.field444;
        class206.field3366 = class287.field4851;
        class249.field4204 = class280.field4790;
        class140.field2136 = class272.field4674;
        class81.field1130 = class249.field4169;
        class51.field797 = class228.field3735;
        class272.field4682 = class107.field1535;
        class128.field1963 = class224.field3644;
        class270.field4615 = class91.field1276;
        class113.field1608 = class286.field4843;
        class86.field1204 = class286.field4845;
        class143.field2205 = class180.field2875;
        class23.field406 = class323.field5643;
        class247.field4131 = class196.field3141;
        class227.field3680 = class107.field1527;
        class147.field2260 = class275.field4714;
        field382++;
        class202.field3265 = class44.field700;
        class149.field2313 = class163.field2586;
        class61.field915 = class234.field3832;
        class16.field214 = class277.field4745;
        class321.field5595 = class133.field2048;
        class269.field4535 = class157.field2510;
        class6.field99 = client.field4361;
        class26.field441 = class61.field919;
        class174.field2789 = class320.field5587;
        class116.field1628 = class122.field1722;
        class296.field5054 = class224.field3640;
        class91.field1275 = class282.field4800;
        class193.field3063 = class196.field3136;
        class179.field2861 = class234.field3837;
        class57.field880 = class238.field3900;
        class199.field3223 = class55.field870;
        class106.field1513 = class41.field655;
        class210.field3409 = class100.field1450;
        class4.field74 = class286.field4842;
        class65.field978 = class136.field2086;
        class245.field4111 = class120.field1686;
        class48.field741 = class92.field1302;
        class265.field4479 = class186.field2951;
        class167.field2630 = class239.field3922;
        class227.field3682 = class239.field3920;
        class282.field4807 = class134.field2059;
        class61.field917 = class189.field2987;
        class73.field1068 = class149.field2311;
        if (arg0 >= -77) {
            method175(-118);
        }
        class55.field860 = class175.field2824;
        class298.field5164 = class93.field1327;
        class200.field3235 = class251.field4300;
        class290.field4913 = class170.field2672;
        class248.field4143 = class120.field1703;
        class277.field4749 = class260.field4452;
        class154.field2457 = class72.field1051;
        class40.field650 = class321.field5598;
        class8.field103 = class118.field1682;
        class44.field699 = class39.field642;
        class277.field4737 = class160.field2546;
        class81.field1142 = class213.field3475;
        class90.field1266 = class91.field1271;
        class272.field4675 = class62.field945;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIIIBI)Z", line = 1855)
    private final boolean method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field383++;
        int var11 = arg0 + arg4;
        int var12 = arg2 + arg5;
        int var13 = arg6 + arg7;
        int var14 = arg1 + arg3;
        if (arg8 != -72) {
            field360 = (class203[]) null;
        }
        if (arg7 >= arg5 && arg7 < var12) {
            if (arg1 == var11 && (arg9 & 0x4) == 0) {
                int var15 = arg7;
                int var16 = var13 > var12 ? var12 : var13;
                while (var16 > var15) {
                    if ((this.field384[var15 - this.field377][var11 - this.field363 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg0 == var14 && (arg9 & 0x1) == 0) {
                int var17 = arg7;
                int var18 = var12 >= var13 ? var13 : var12;
                while (var17 < var18) {
                    if ((this.field384[var17 - this.field377][arg0 - this.field363] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg5 < var13 && var12 >= var13) {
            if (arg1 == var11 && (arg9 & 0x4) == 0) {
                for (int var19 = arg5; var19 < var13; var19++) {
                    if ((this.field384[var19 - this.field377][var11 - (this.field363 + 1)] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var14 && (arg9 & 0x1) == 0) {
                for (int var20 = arg5; var20 < var13; var20++) {
                    if ((this.field384[var20 - this.field377][arg0 - this.field363] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg1 <= arg0 && arg0 < var14) {
            if (arg5 == var13 && (arg9 & 0x8) == 0) {
                int var21 = arg0;
                int var22 = var11 > var14 ? var14 : var11;
                while (var22 > var21) {
                    if ((this.field384[var13 - this.field377 - 1][var21 - this.field363] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg7 == var12 && (arg9 & 0x2) == 0) {
                int var23 = arg0;
                int var24 = var11 > var14 ? var14 : var11;
                while (var24 > var23) {
                    if ((this.field384[arg7 - this.field377][var23 - this.field363] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg1 < var11 && var14 >= var11) {
            if (arg5 == var13 && (arg9 & 0x8) == 0) {
                for (int var25 = arg1; var25 < var11; var25++) {
                    if ((this.field384[var13 - this.field377 - 1][var25 - this.field363] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var12 && (arg9 & 0x2) == 0) {
                for (int var26 = arg1; var26 < var11; var26++) {
                    if ((this.field384[arg7 - this.field377][var26 - this.field363] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIIIZI)V", line = 2016)
    public final void method187(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field361++;
        int var7 = arg3 - this.field377;
        int var8 = arg5 - this.field363;
        int var9 = 256;
        if (arg0) {
            var9 += 131072;
        }
        int var10 = var7;
        if (!arg4) {
            this.method168((byte) -128, true, -35, -94, -30, -56);
        }
        while (var10 < (var7 + arg1)) {
            if (var10 >= 0 && this.field355 > var10) {
                for (int var11 = var8; var11 < arg2 + var8; var11++) {
                    if (var11 >= 0 && var11 < this.field379) {
                        this.method166(var10, var9, var11, 19661064);
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(II)V", line = 2067)
    public class22(int arg0, int arg1) {
        this.field355 = arg0;
        this.field363 = 0;
        this.field379 = arg1;
        this.field384 = new int[this.field355][this.field379];
        this.method167(-88);
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V", line = 2081)
    public static final void method188(int arg0) {
        field374++;
        int var1 = (class224.field3639 >> 10) + (class272.field4670 >> 3);
        int var2 = (class80.field1129 >> 10) + (class199.field3226 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        byte var6 = 8;
        class107.field1534 = new byte[var5][];
        class186.field2956 = new int[var5];
        class284.field4835 = new int[var5];
        class41.field662 = new int[var5];
        class249.field4217 = new int[var5][4];
        class104.field1495 = new int[var5];
        class323.field5637 = new byte[var5][];
        class148.field2274 = new byte[var5][];
        class170.field2677 = new int[var5];
        class133.field2041 = new byte[var5][];
        class63.field952 = new int[var5];
        class202.field3267 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class284.field4835[var7] = var10;
                class41.field662[var7] = class73.field1063.method1374(class195.method1307(new class152[] { class81.field1139, class38.method280(117, var8), class120.field1692, class38.method280(84, var9) }, (byte) 29), (byte) -52);
                class63.field952[var7] = class73.field1063.method1374(class195.method1307(new class152[] { class69.field1009, class38.method280(89, var8), class120.field1692, class38.method280(120, var9) }, (byte) 29), (byte) -52);
                class186.field2956[var7] = class73.field1063.method1374(class195.method1307(new class152[] { class132.field2027, class38.method280(96, var8), class120.field1692, class38.method280(99, var9) }, (byte) 29), (byte) -52);
                class170.field2677[var7] = class73.field1063.method1374(class195.method1307(new class152[] { class17.field234, class38.method280(89, var8), class120.field1692, class38.method280(102, var9) }, (byte) 29), (byte) -52);
                class104.field1495[var7] = class73.field1063.method1374(class195.method1307(new class152[] { class194.field3097, class38.method280(119, var8), class120.field1692, class38.method280(118, var9) }, (byte) 29), (byte) -52);
                if (class186.field2956[var7] == -1) {
                    class41.field662[var7] = -1;
                    class63.field952[var7] = -1;
                    class170.field2677[var7] = -1;
                    class104.field1495[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class186.field2956.length; var11++) {
            class186.field2956[var11] = -1;
            class41.field662[var11] = -1;
            class63.field952[var11] = -1;
            class170.field2677[var11] = -1;
            class104.field1495[var11] = -1;
        }
        int var12 = 69 / ((60 - arg0) / 43);
        class229.method1575(var3, var4, var6, 24015, var2, true, var1);
    }
}
