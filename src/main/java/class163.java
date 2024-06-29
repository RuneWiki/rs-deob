import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class163 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    private int field3083;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    private int field3097;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    private int field3077;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[[I")
    public int[][] field3080;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lsg;")
    public static class203 field3076 = new class203();

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Ldc;")
    public static class37 field3084 = class185.method1233((byte) 86, ":clan:");

    @OriginalMember(owner = "client!p", name = "p", descriptor = "[Ldc;")
    public static class37[] field3087 = new class37[100];

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Ldc;")
    public static class37 field3102 = class185.method1233((byte) 86, "Ablegen");

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Z")
    public static boolean field3100 = false;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "Ldc;")
    private static class37 field3104 = class185.method1233((byte) 86, "Loading config )2 ");

    @OriginalMember(owner = "client!p", name = "D", descriptor = "Ldc;")
    public static class37 field3101 = field3104;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Ldc;")
    public static class37 field3091 = class185.method1233((byte) 86, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "[Lng;")
    public static class148[] field3093;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIB)Z")
    public final boolean method1088(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field3096++;
        if (arg4 > 1) {
            return this.method1092((byte) -41, arg0, arg3, arg5, arg4, arg2, arg4, arg7, arg1) ? true : this.method1102(arg6, arg4, arg7, arg1, arg5, arg4, 115, arg3, arg2, arg0);
        } else if (arg8 == -124) {
            int var10 = arg3 + arg1 - 1;
            int var11 = arg0 + arg7 - 1;
            if (arg1 <= arg2 && var10 >= arg2 && arg5 >= arg0 && arg5 <= var11) {
                return true;
            } else if (arg1 - 1 == arg2 && arg0 <= arg5 && arg5 <= var11 && (this.field3080[arg2 - this.field3081][arg5 - this.field3097] & 0x8) == 0 && (arg6 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg2 && arg0 <= arg5 && var11 >= arg5 && (this.field3080[arg2 - this.field3081][arg5 - this.field3097] & 0x80) == 0 && (arg6 & 0x2) == 0) {
                return true;
            } else if (arg0 - 1 == arg5 && arg1 <= arg2 && var10 >= arg2 && (this.field3080[arg2 - this.field3081][arg5 - this.field3097] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg5 && arg1 <= arg2 && var10 >= arg2 && (this.field3080[arg2 - this.field3081][arg5 - this.field3097] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1089(int arg0, int[] arg1) {
        field3098++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class4.method34(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)V")
    public final void method1090(byte arg0, int arg1, int arg2) {
        field3088++;
        int var4 = -108 % ((43 - arg0) / 57);
        int var5 = arg2 - this.field3081;
        int var6 = arg1 - this.field3097;
        this.field3080[var5][var6] = class138.method960(this.field3080[var5][var6], 2097152);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZIIIII)V")
    public final void method1091(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field3097;
        int var8 = arg4;
        int var9 = arg5 - this.field3081;
        if (arg0) {
            var8 = arg4 + 131072;
        }
        field3072++;
        for (int var10 = var9; var10 < arg3 + var9; var10++) {
            if (var10 >= 0 && var10 < this.field3083) {
                for (int var11 = var7; var11 < var7 + arg2; var11++) {
                    if (var11 >= 0 && this.field3077 > var11) {
                        this.method1094(var10, var8, false, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BIIIIIIII)Z")
    private final boolean method1092(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3078++;
        if (arg0 != -41) {
            return false;
        } else if (arg5 < arg2 + arg8 && arg4 + arg5 > arg8) {
            return arg1 + arg7 > arg3 && arg3 + arg6 > arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZZIIII)V")
    public final void method1093(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3085++;
        if (!arg0) {
            return;
        }
        int var7 = arg5 - this.field3097;
        int var8 = arg2 - this.field3081;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method1100((byte) -71, var7, var8, 128);
                this.method1100((byte) -124, var7, var8 - 1, 8);
            }
            if (arg4 == 1) {
                this.method1100((byte) -97, var7, var8, 2);
                this.method1100((byte) -128, var7 + 1, var8, 32);
            }
            if (arg4 == 2) {
                this.method1100((byte) -22, var7, var8, 8);
                this.method1100((byte) -109, var7, var8 + 1, 128);
            }
            if (arg4 == 3) {
                this.method1100((byte) -72, var7, var8, 32);
                this.method1100((byte) -49, var7 - 1, var8, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method1100((byte) -48, var7, var8, 1);
                this.method1100((byte) -29, var7 + 1, var8 + -1, 16);
            }
            if (arg4 == 1) {
                this.method1100((byte) -3, var7, var8, 4);
                this.method1100((byte) -82, var7 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method1100((byte) -9, var7, var8, 16);
                this.method1100((byte) -47, var7 - 1, var8 + 1, 1);
            }
            if (arg4 == 3) {
                this.method1100((byte) -6, var7, var8, 64);
                this.method1100((byte) -81, var7 - 1, var8 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method1100((byte) -29, var7, var8, 130);
                this.method1100((byte) -24, var7, var8 - 1, 8);
                this.method1100((byte) -2, var7 + 1, var8, 32);
            }
            if (arg4 == 1) {
                this.method1100((byte) -42, var7, var8, 10);
                this.method1100((byte) -68, var7 + 1, var8, 32);
                this.method1100((byte) -60, var7, var8 + 1, 128);
            }
            if (arg4 == 2) {
                this.method1100((byte) -38, var7, var8, 40);
                this.method1100((byte) -71, var7, var8 + 1, 128);
                this.method1100((byte) -55, var7 - 1, var8, 2);
            }
            if (arg4 == 3) {
                this.method1100((byte) -113, var7, var8, 160);
                this.method1100((byte) -45, var7 - 1, var8, 2);
                this.method1100((byte) -118, var7, var8 - 1, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method1100((byte) -6, var7, var8, 65536);
                this.method1100((byte) -60, var7, var8 - 1, 4096);
            }
            if (arg4 == 1) {
                this.method1100((byte) -23, var7, var8, 1024);
                this.method1100((byte) -68, var7 + 1, var8, 16384);
            }
            if (arg4 == 2) {
                this.method1100((byte) -68, var7, var8, 4096);
                this.method1100((byte) -23, var7, var8 + 1, 65536);
            }
            if (arg4 == 3) {
                this.method1100((byte) -8, var7, var8, 16384);
                this.method1100((byte) -70, var7 - 1, var8, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method1100((byte) -47, var7, var8, 512);
                this.method1100((byte) -52, var7 + 1, var8 + -1, 8192);
            }
            if (arg4 == 1) {
                this.method1100((byte) -124, var7, var8, 2048);
                this.method1100((byte) -16, var7 + 1, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method1100((byte) -67, var7, var8, 8192);
                this.method1100((byte) -35, var7 - 1, var8 + 1, 512);
            }
            if (arg4 == 3) {
                this.method1100((byte) -111, var7, var8, 32768);
                this.method1100((byte) -56, var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1100((byte) -73, var7, var8, 66560);
            this.method1100((byte) -83, var7, var8 - 1, 4096);
            this.method1100((byte) -28, var7 + 1, var8, 16384);
        }
        if (arg4 == 1) {
            this.method1100((byte) -39, var7, var8, 5120);
            this.method1100((byte) -20, var7 + 1, var8, 16384);
            this.method1100((byte) -22, var7, var8 + 1, 65536);
        }
        if (arg4 == 2) {
            this.method1100((byte) -25, var7, var8, 20480);
            this.method1100((byte) -61, var7, var8 + 1, 65536);
            this.method1100((byte) -60, var7 - 1, var8, 1024);
        }
        if (arg4 == 3) {
            this.method1100((byte) -4, var7, var8, 81920);
            this.method1100((byte) -96, var7 - 1, var8, 1024);
            this.method1100((byte) -126, var7, var8 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZI)V")
    private final void method1094(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field3080[arg0][arg3] = class138.method960(this.field3080[arg0][arg3], arg1);
            field3079++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
    public final void method1095(int arg0, int arg1, int arg2) {
        field3086++;
        int var4 = arg2 - this.field3097;
        int var5 = -22 % ((arg1 - 16) / 58);
        int var6 = arg0 - this.field3081;
        this.field3080[var6][var4] = class138.method960(this.field3080[var6][var4], 262144);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public final void method1096(int arg0) {
        field3103++;
        if (arg0 <= 93) {
            this.method1096(103);
        }
        for (int var2 = 0; var2 < this.field3083; var2++) {
            for (int var3 = 0; var3 < this.field3077; var3++) {
                if (var2 == 0 || var3 == 0 || this.field3083 - 5 <= var2 || var3 >= this.field3077 - 5) {
                    this.field3080[var2][var3] = 16777215;
                } else {
                    this.field3080[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIZIII)V")
    public final void method1097(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3073++;
        int var8 = arg0 - this.field3081;
        int var9 = arg6 - this.field3097;
        if (arg2 != 31317) {
            this.field3083 = 95;
        }
        int var10 = 256;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg1;
            arg1 = arg4;
            arg4 = var11;
        }
        if (arg3) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < arg1 + var8; var12++) {
            if (var12 >= 0 && this.field3083 > var12) {
                for (int var13 = var9; var13 < arg4 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field3077) {
                        this.method1100((byte) -38, var13, var12, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static void method1098(int arg0) {
        if (arg0 != 0) {
            field3104 = null;
        }
        field3087 = null;
        field3101 = null;
        field3084 = null;
        field3104 = null;
        field3102 = null;
        field3076 = null;
        field3091 = null;
        field3093 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILce;IIZIBII)V")
    public static final void method1099(int arg0, class28 arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (arg6 >= -114) {
            return;
        }
        field3075++;
        if (arg3 < 0 || arg3 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var11 = arg1.method215(-1797813752);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg1.method215(-1797813752);
                    return;
                }
                if (var11 <= 49) {
                    arg1.method215(-1797813752);
                }
            }
        }
        if (!arg4) {
            class193.field3602[arg2][arg3][arg0] = 0;
        }
        while (true) {
            int var9 = arg1.method215(-1797813752);
            if (var9 == 0) {
                if (arg4) {
                    class39.field808[0][arg3][arg0] = class78.field1370[0][arg3][arg0];
                    return;
                } else if (arg2 == 0) {
                    class39.field808[0][arg3][arg0] = -class145.method1003(-118, arg8 + arg0 + 556238, arg3 + 932731 + arg5) * 8;
                    return;
                } else {
                    class39.field808[arg2][arg3][arg0] = class39.field808[arg2 - 1][arg3][arg0] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg1.method215(-1797813752);
                if (arg4) {
                    class39.field808[0][arg3][arg0] = var10 * 8 + class78.field1370[0][arg3][arg0];
                    return;
                }
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg2 == 0) {
                    class39.field808[0][arg3][arg0] = -var10 * 8;
                    return;
                }
                class39.field808[arg2][arg3][arg0] = class39.field808[arg2 - 1][arg3][arg0] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                class95.field1676[arg2][arg3][arg0] = arg1.method206(-16933672);
                class193.field3608[arg2][arg3][arg0] = (byte) ((var9 - 2) / 4);
                class145.field2774[arg2][arg3][arg0] = (byte) class58.method449(3, arg7 + var9 - 2);
            } else if (var9 > 81) {
                class106.field1836[arg2][arg3][arg0] = (byte) (var9 - 81);
            } else if (!arg4) {
                class193.field3602[arg2][arg3][arg0] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BIII)V")
    private final void method1100(byte arg0, int arg1, int arg2, int arg3) {
        this.field3080[arg2][arg1] = class58.method449(this.field3080[arg2][arg1], ~arg3);
        if (arg0 >= -1) {
            this.field3097 = 54;
        }
        field3099++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBIIIIII)Z")
    public final boolean method1101(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3095++;
        if (arg7 == 1) {
            if (arg0 == arg3 && arg2 == arg4) {
                return true;
            }
        } else if (arg0 >= arg3 && arg0 <= arg3 + arg7 - 1 && arg4 >= arg4 && arg4 <= arg4 + arg7 - 1) {
            return true;
        }
        int var9 = arg0 - this.field3081;
        int var10 = arg4 - this.field3097;
        int var11 = arg3 - this.field3081;
        int var12 = arg2 - this.field3097;
        if (arg1 < 52) {
            field3076 = null;
        }
        if (arg7 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field3080[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3080[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field3080[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3080[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field3080[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3080[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field3080[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3080[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field3080[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field3080[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field3080[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field3080[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var11 - 1;
            int var14 = var12 + arg7 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field3080[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 - arg7 == var12 && (this.field3080[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 - arg7 == var11 && var10 >= var12 && var14 >= var10 && (this.field3080[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 - arg7 == var12 && (this.field3080[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var9 - arg7 == var11 && var12 <= var10 && var10 <= var14 && (this.field3080[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 + 1 == var12 && (this.field3080[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14 && (this.field3080[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 + 1 == var12 && (this.field3080[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var11 <= var9 && var9 <= var13 && var10 + 1 == var12 && (this.field3080[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var9 && var9 <= var13 && var10 - arg7 == var12 && (this.field3080[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg7 == var11 && var10 >= var12 && var10 <= var14 && (this.field3080[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var12 <= var10 && var14 >= var10 && (this.field3080[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method1102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3089++;
        int var11 = arg1 + arg4;
        int var12 = arg5 + arg8;
        int var13 = arg3 + arg7;
        int var14 = arg2 + arg9;
        if (arg3 <= arg8 && arg8 < var13) {
            if (arg9 == var11 && (arg0 & 0x4) == 0) {
                int var15 = arg8;
                int var16 = var13 < var12 ? var13 : var12;
                while (var16 > var15) {
                    if ((this.field3080[var15 - this.field3081][var11 - this.field3097 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg4 == var14 && (arg0 & 0x1) == 0) {
                int var17 = arg8;
                int var18 = var12 <= var13 ? var12 : var13;
                while (var17 < var18) {
                    if ((this.field3080[var17 - this.field3081][arg4 - this.field3097] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg3 < var12 && var13 >= var12) {
            if (arg9 == var11 && (arg0 & 0x4) == 0) {
                for (int var19 = arg3; var19 < var12; var19++) {
                    if ((this.field3080[var19 - this.field3081][var11 - this.field3097 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg4 == var14 && (arg0 & 0x1) == 0) {
                for (int var20 = arg3; var20 < var12; var20++) {
                    if ((this.field3080[var20 - this.field3081][arg4 - this.field3097] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg4 >= arg9 && arg4 < var14) {
            if (arg3 == var12 && (arg0 & 0x8) == 0) {
                int var21 = arg4;
                int var22 = var11 > var14 ? var14 : var11;
                while (var22 > var21) {
                    if ((this.field3080[var12 - this.field3081 - 1][var21 - this.field3097] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg8 == var13 && (arg0 & 0x2) == 0) {
                int var23 = arg4;
                int var24 = var11 <= var14 ? var11 : var14;
                while (var23 < var24) {
                    if ((this.field3080[arg8 - this.field3081][var23 - this.field3097] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var11 > arg9 && var14 >= var11) {
            if (arg3 == var12 && (arg0 & 0x8) == 0) {
                for (int var25 = arg9; var25 < var11; var25++) {
                    if ((this.field3080[var12 - this.field3081 - 1][var25 - this.field3097] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var13 && (arg0 & 0x2) == 0) {
                for (int var26 = arg9; var26 < var11; var26++) {
                    if ((this.field3080[arg8 - this.field3081][var26 - this.field3097] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return arg6 <= 112 ? false : false;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BIIIIIII)Z")
    public final boolean method1103(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3074++;
        if (arg5 == 1) {
            if (arg3 == arg6 && arg4 == arg7) {
                return true;
            }
        } else if (arg3 >= arg6 && arg3 <= arg6 + arg5 - 1 && arg7 >= arg7 && arg7 <= arg5 + arg7 - 1) {
            return true;
        }
        int var9 = arg4 - this.field3097;
        int var10 = arg3 - this.field3081;
        int var11 = arg7 - this.field3097;
        int var12 = arg6 - this.field3081;
        if (arg5 == 1) {
            if (arg1 == 0) {
                if (arg2 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field3080[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field3080[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3080[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3080[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field3080[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field3080[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3080[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3080[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg2 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3080[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field3080[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3080[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field3080[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3080[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field3080[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field3080[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3080[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 == var12 && var11 + 1 == var9 && (this.field3080[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 - 1 == var9 && (this.field3080[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field3080[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field3080[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg5 - 1;
            int var14 = var9 + arg5 - 1;
            if (arg1 == 0) {
                if (arg2 == 0) {
                    if (var10 - arg5 == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var11 + 1 == var9 && (this.field3080[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var11 - arg5 == var9 && (this.field3080[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 >= var12 && var13 >= var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - arg5 == var12 && var11 >= var9 && var14 >= var11 && (this.field3080[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var14 >= var11 && (this.field3080[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 + 1 == var12 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 + 1 == var9 && (this.field3080[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 - arg5 == var9 && (this.field3080[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var12 <= var10 && var10 <= var13 && var11 - arg5 == var9) {
                        return true;
                    }
                    if (var10 - arg5 == var12 && var9 <= var11 && var11 <= var14 && (this.field3080[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 <= var11 && var14 >= var11 && (this.field3080[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg2 == 0) {
                    if (var10 - arg5 == var12 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 <= var11 && var11 <= var14 && (this.field3080[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 - arg5 == var9 && (this.field3080[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - arg5 == var12 && var11 >= var9 && var11 <= var14 && (this.field3080[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var11 - arg5 == var9 && (this.field3080[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - arg5 == var12 && var9 <= var11 && var14 >= var11 && (this.field3080[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 + 1 == var9 && (this.field3080[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var14 >= var11) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var11 - arg5 == var9) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 - arg5 == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 + 1 == var9 && (this.field3080[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var14 >= var11 && (this.field3080[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 - arg5 == var9) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 >= var12 && var10 <= var13 && var11 + 1 == var9 && (this.field3080[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var12 && var13 >= var10 && var11 - arg5 == var9 && (this.field3080[var10][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var10 - arg5 == var12 && var11 >= var9 && var14 >= var11 && (this.field3080[var13][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 >= var9 && var14 >= var11 && (this.field3080[var12][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        int var15 = -4 / ((arg0 + 14) / 38);
        return false;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
    public static final void method1104(int arg0, int arg1, int arg2, int arg3) {
        class18 var4 = class180.field3354[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class58 var5 = var4.field299;
        if (var5 != null) {
            var5.field1092 = var5.field1092 * arg3 / 16;
            var5.field1088 = var5.field1088 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(JIBZ)Ldc;")
    public static final class37 method1105(long arg0, int arg1, byte arg2, boolean arg3) {
        field3092++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var5 = 1;
        long var6 = arg0 / (long) arg1;
        if (arg2 != 43) {
            field3104 = null;
        }
        while (var6 != 0L) {
            var6 /= arg1;
            var5++;
        }
        int var8 = var5;
        if (arg0 < 0L || arg3) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg3) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg0 % (long) arg1);
            arg0 /= arg1;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class37 var11 = new class37();
        var11.field733 = var8;
        var11.field743 = var9;
        return var11;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(II)V")
    public class163(int arg0, int arg1) {
        this.field3083 = arg0;
        this.field3097 = 0;
        this.field3077 = arg1;
        this.field3080 = new int[this.field3083][this.field3077];
        this.field3081 = 0;
        this.method1096(122);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(III)V")
    public final void method1106(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3097;
        field3094++;
        if (arg2 != 7446) {
            this.field3080 = null;
        }
        int var5 = arg0 - this.field3081;
        this.field3080[var5][var4] = class58.method449(this.field3080[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(ZIIIII)V")
    public final void method1107(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3090++;
        int var7 = arg4 - this.field3081;
        int var8 = arg1 - this.field3097;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method1094(var7, 128, false, var8);
                this.method1094(var7 - 1, 8, false, var8);
            }
            if (arg2 == 1) {
                this.method1094(var7, 2, false, var8);
                this.method1094(var7, 32, false, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1094(var7, 8, false, var8);
                this.method1094(var7 + 1, 128, false, var8);
            }
            if (arg2 == 3) {
                this.method1094(var7, 32, false, var8);
                this.method1094(var7, 2, false, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method1094(var7, 1, false, var8);
                this.method1094(var7 - 1, 16, false, var8 + 1);
            }
            if (arg2 == 1) {
                this.method1094(var7, 4, false, var8);
                this.method1094(var7 + 1, 64, false, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1094(var7, 16, false, var8);
                this.method1094(var7 + 1, 1, false, var8 - 1);
            }
            if (arg2 == 3) {
                this.method1094(var7, 64, false, var8);
                this.method1094(var7 - 1, 4, false, var8 - 1);
            }
        }
        int var9 = 24 % ((arg3 + 63) / 49);
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method1094(var7, 130, false, var8);
                this.method1094(var7 - 1, 8, false, var8);
                this.method1094(var7, 32, false, var8 + 1);
            }
            if (arg2 == 1) {
                this.method1094(var7, 10, false, var8);
                this.method1094(var7, 32, false, var8 + 1);
                this.method1094(var7 + 1, 128, false, var8);
            }
            if (arg2 == 2) {
                this.method1094(var7, 40, false, var8);
                this.method1094(var7 + 1, 128, false, var8);
                this.method1094(var7, 2, false, var8 - 1);
            }
            if (arg2 == 3) {
                this.method1094(var7, 160, false, var8);
                this.method1094(var7, 2, false, var8 - 1);
                this.method1094(var7 - 1, 8, false, var8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method1094(var7, 65536, false, var8);
                this.method1094(var7 - 1, 4096, false, var8);
            }
            if (arg2 == 1) {
                this.method1094(var7, 1024, false, var8);
                this.method1094(var7, 16384, false, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1094(var7, 4096, false, var8);
                this.method1094(var7 + 1, 65536, false, var8);
            }
            if (arg2 == 3) {
                this.method1094(var7, 16384, false, var8);
                this.method1094(var7, 1024, false, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method1094(var7, 512, false, var8);
                this.method1094(var7 - 1, 8192, false, var8 + 1);
            }
            if (arg2 == 1) {
                this.method1094(var7, 2048, false, var8);
                this.method1094(var7 + 1, 32768, false, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1094(var7, 8192, false, var8);
                this.method1094(var7 + 1, 512, false, var8 - 1);
            }
            if (arg2 == 3) {
                this.method1094(var7, 32768, false, var8);
                this.method1094(var7 - 1, 2048, false, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1094(var7, 66560, false, var8);
            this.method1094(var7 - 1, 4096, false, var8);
            this.method1094(var7, 16384, false, var8 + 1);
        }
        if (arg2 == 1) {
            this.method1094(var7, 5120, false, var8);
            this.method1094(var7, 16384, false, var8 + 1);
            this.method1094(var7 + 1, 65536, false, var8);
        }
        if (arg2 == 2) {
            this.method1094(var7, 20480, false, var8);
            this.method1094(var7 + 1, 65536, false, var8);
            this.method1094(var7, 1024, false, var8 - 1);
        }
        if (arg2 == 3) {
            this.method1094(var7, 81920, false, var8);
            this.method1094(var7, 1024, false, var8 - 1);
            this.method1094(var7 - 1, 4096, false, var8);
            return;
        }
    }
}
