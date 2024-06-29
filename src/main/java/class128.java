import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class128 {

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    private int field2946 = 0;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    private int field2948;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    private int field2951;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    private int field2934;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "[[I")
    public int[][] field2958;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lr;")
    public static class118 field2939 = class153.method1136(119, "VOLL");

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lr;")
    public static class118 field2922 = class153.method1136(105, "logo");

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lr;")
    public static class118 field2935 = class153.method1136(94, " )2> ");

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "Lr;")
    private static class118 field2943 = class153.method1136(125, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public static int[] field2923 = new int[200];

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Lr;")
    public static class118 field2945 = class153.method1136(96, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "Lr;")
    private static class118 field2950 = class153.method1136(105, "skill)2");

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lr;")
    public static class118 field2930 = field2950;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Lr;")
    public static class118 field2942 = field2943;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lr;")
    public static class118 field2925 = class153.method1136(125, "Welt");

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lr;")
    public static class118 field2921 = class153.method1136(115, "(U1");

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "Lr;")
    public static class118 field2957 = class153.method1136(121, "hel");

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lff;")
    public static class42 field2932;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lff;")
    public static class42 field2938;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "Lff;")
    public static class42 field2947;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[[[B")
    public static byte[][][] field2933;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    public final void method989(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2946;
        int var5 = arg1 - this.field2951;
        field2920++;
        this.field2958[var4][var5] = class19.method178(this.field2958[var4][var5], 262144);
        if (arg2 != -1) {
            field2945 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZIII)V")
    public final void method990(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 105) {
            return;
        }
        field2924++;
        int var7 = arg4 - this.field2951;
        int var8 = arg1 - this.field2946;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method991(var8, (byte) 101, 128, var7);
                this.method991(var8 - 1, (byte) 119, 8, var7);
            }
            if (arg3 == 1) {
                this.method991(var8, (byte) 126, 2, var7);
                this.method991(var8, (byte) 113, 32, var7 + 1);
            }
            if (arg3 == 2) {
                this.method991(var8, (byte) 126, 8, var7);
                this.method991(var8 + 1, (byte) 103, 128, var7);
            }
            if (arg3 == 3) {
                this.method991(var8, (byte) 104, 32, var7);
                this.method991(var8, (byte) 118, 2, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method991(var8, (byte) 119, 1, var7);
                this.method991(var8 - 1, (byte) 99, 16, var7 + 1);
            }
            if (arg3 == 1) {
                this.method991(var8, (byte) 96, 4, var7);
                this.method991(var8 + 1, (byte) 103, 64, var7 + 1);
            }
            if (arg3 == 2) {
                this.method991(var8, (byte) 111, 16, var7);
                this.method991(var8 + 1, (byte) 100, 1, var7 - 1);
            }
            if (arg3 == 3) {
                this.method991(var8, (byte) 115, 64, var7);
                this.method991(var8 - 1, (byte) 119, 4, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method991(var8, (byte) 115, 130, var7);
                this.method991(var8 - 1, (byte) 119, 8, var7);
                this.method991(var8, (byte) 103, 32, var7 + 1);
            }
            if (arg3 == 1) {
                this.method991(var8, (byte) 111, 10, var7);
                this.method991(var8, (byte) 100, 32, var7 + 1);
                this.method991(var8 + 1, (byte) 109, 128, var7);
            }
            if (arg3 == 2) {
                this.method991(var8, (byte) 127, 40, var7);
                this.method991(var8 + 1, (byte) 126, 128, var7);
                this.method991(var8, (byte) 118, 2, var7 - 1);
            }
            if (arg3 == 3) {
                this.method991(var8, (byte) 111, 160, var7);
                this.method991(var8, (byte) 124, 2, var7 - 1);
                this.method991(var8 - 1, (byte) 109, 8, var7);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method991(var8, (byte) 122, 65536, var7);
                this.method991(var8 - 1, (byte) 117, 4096, var7);
            }
            if (arg3 == 1) {
                this.method991(var8, (byte) 102, 1024, var7);
                this.method991(var8, (byte) 119, 16384, var7 + 1);
            }
            if (arg3 == 2) {
                this.method991(var8, (byte) 127, 4096, var7);
                this.method991(var8 + 1, (byte) 120, 65536, var7);
            }
            if (arg3 == 3) {
                this.method991(var8, (byte) 108, 16384, var7);
                this.method991(var8, (byte) 119, 1024, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method991(var8, (byte) 116, 512, var7);
                this.method991(var8 - 1, (byte) 101, 8192, var7 + 1);
            }
            if (arg3 == 1) {
                this.method991(var8, (byte) 105, 2048, var7);
                this.method991(var8 + 1, (byte) 99, 32768, var7 + 1);
            }
            if (arg3 == 2) {
                this.method991(var8, (byte) 114, 8192, var7);
                this.method991(var8 + 1, (byte) 115, 512, var7 - 1);
            }
            if (arg3 == 3) {
                this.method991(var8, (byte) 104, 32768, var7);
                this.method991(var8 - 1, (byte) 120, 2048, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method991(var8, (byte) 121, 66560, var7);
            this.method991(var8 - 1, (byte) 119, 4096, var7);
            this.method991(var8, (byte) 106, 16384, var7 + 1);
        }
        if (arg3 == 1) {
            this.method991(var8, (byte) 118, 5120, var7);
            this.method991(var8, (byte) 120, 16384, var7 + 1);
            this.method991(var8 + 1, (byte) 118, 65536, var7);
        }
        if (arg3 == 2) {
            this.method991(var8, (byte) 102, 20480, var7);
            this.method991(var8 + 1, (byte) 111, 65536, var7);
            this.method991(var8, (byte) 114, 1024, var7 - 1);
        }
        if (arg3 == 3) {
            this.method991(var8, (byte) 123, 81920, var7);
            this.method991(var8, (byte) 112, 1024, var7 - 1);
            this.method991(var8 - 1, (byte) 123, 4096, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBII)V")
    private final void method991(int arg0, byte arg1, int arg2, int arg3) {
        this.field2958[arg0][arg3] = class19.method178(this.field2958[arg0][arg3], arg2);
        if (arg1 > 95) {
            field2936++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBIII)I")
    public static final int method992(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2940++;
        if (arg1 < 59) {
            field2922 = null;
        }
        int var5 = 65536 - class58.field1346[arg0 * 1024 / arg3] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2952++;
        if (arg0 == arg1 && arg4 == arg6) {
            return true;
        }
        int var8 = arg1 - this.field2946;
        int var9 = arg4 - this.field2951;
        int var10 = arg6 - this.field2951;
        if (arg2 >= -100) {
            this.field2951 = 52;
        }
        int var11 = arg0 - this.field2946;
        if (arg3 == 0) {
            if (arg5 == 0) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field2958[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field2958[var11][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 == var11 && var9 + 1 == var10) {
                    return true;
                }
                if (var8 - 1 == var11 && var9 == var10 && (this.field2958[var11][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2958[var11][var10] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field2958[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field2958[var11][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 == var11 && var9 - 1 == var10) {
                    return true;
                }
                if (var8 - 1 == var11 && var9 == var10 && (this.field2958[var11][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2958[var11][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2958[var11][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field2958[var11][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 - 1 == var11 && var9 == var10 && (this.field2958[var11][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field2958[var11][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var8 - 1 == var11 && var9 == var10 && (this.field2958[var11][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field2958[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field2958[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2958[var11][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var8 == var11 && var9 + 1 == var10 && (this.field2958[var11][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var9 - 1 == var10 && (this.field2958[var11][var10] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var11 && var9 == var10 && (this.field2958[var11][var10] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var11 && var9 == var10 && (this.field2958[var11][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method994(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 >> 14 & 0x7FFF;
        field2931++;
        int var5 = class68.field1583.method1147(class106.field2468, arg1, arg0, arg3);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class148 var8 = class47.method396(117, var4);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field3287;
                var9 = var8.field3279;
            } else {
                var9 = var8.field3287;
                var10 = var8.field3279;
            }
            int var11 = var8.field3283;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class81.method674(var11, class89.field2150.field710[0], (byte) -123, arg1, arg0, class89.field2150.field755[0], 2, true, var9, 0, var10, 0);
        } else {
            class81.method674(0, class89.field2150.field710[0], (byte) -120, arg1, arg0, class89.field2150.field755[0], 2, true, 0, var7, 0, var6 + 1);
        }
        class70.field1623 = class29.field701;
        class35.field893 = class14.field317;
        class124.field2831 = 2;
        int var12 = 58 % ((-arg2 - 32) / 61);
        class9.field195 = 0;
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2955++;
        int var9 = arg1 + arg7 - 1;
        if (arg6 != 0) {
            return false;
        }
        int var10 = arg4 + arg5 - 1;
        if (arg0 >= arg7 && arg0 <= var9 && arg5 <= arg2 && arg2 <= var10) {
            return true;
        } else if (arg7 - 1 == arg0 && arg5 <= arg2 && var10 >= arg2 && (this.field2958[arg0 - this.field2946][arg2 - this.field2951] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg0 && arg5 <= arg2 && var10 >= arg2 && (this.field2958[arg0 - this.field2946][arg2 - this.field2951] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg2 && arg0 >= arg7 && var9 >= arg0 && (this.field2958[arg0 - this.field2946][arg2 - this.field2951] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg7 <= arg0 && var9 >= arg0 && (this.field2958[arg0 - this.field2946][arg2 - this.field2951] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZIIIII)V")
    public final void method996(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field2951;
        int var9 = 43 / ((-arg0 - 17) / 44);
        field2956++;
        int var10 = arg2 - this.field2946;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg5;
            arg5 = arg6;
            arg6 = var11;
        }
        int var12 = 256;
        if (arg1) {
            var12 += 131072;
        }
        for (int var13 = var10; var13 < arg5 + var10; var13++) {
            if (var13 >= 0 && this.field2948 > var13) {
                for (int var14 = var8; var14 < var8 + arg6; var14++) {
                    if (var14 >= 0 && var14 < this.field2934) {
                        this.method1003(var14, true, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public final void method997(byte arg0) {
        field2927++;
        if (arg0 != 116) {
            this.method996(69, false, -7, 1, 73, 5, -55);
        }
        for (int var2 = 0; var2 < this.field2948; var2++) {
            for (int var3 = 0; var3 < this.field2934; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2948 - 5 <= var2 || var3 >= this.field2934 - 5) {
                    this.field2958[var2][var3] = 16777215;
                } else {
                    this.field2958[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIZI)V")
    public final void method998(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field2946;
        if (arg5 != -2) {
            field2932 = null;
        }
        int var8 = 256;
        int var9 = arg0 - this.field2951;
        field2937++;
        if (arg4) {
            var8 += 131072;
        }
        for (int var10 = var7; var10 < arg2 + var7; var10++) {
            if (var10 >= 0 && this.field2948 > var10) {
                for (int var11 = var9; var11 < arg1 + var9; var11++) {
                    if (var11 >= 0 && this.field2934 > var11) {
                        this.method991(var10, (byte) 106, var8, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static void method999(byte arg0) {
        if (arg0 > -71) {
            method992(51, (byte) -72, 40, 96, -5);
        }
        field2950 = null;
        field2923 = null;
        field2935 = null;
        field2921 = null;
        field2925 = null;
        field2933 = null;
        field2932 = null;
        field2942 = null;
        field2947 = null;
        field2945 = null;
        field2943 = null;
        field2939 = null;
        field2938 = null;
        field2930 = null;
        field2922 = null;
        field2957 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZIIII)V")
    public final void method1000(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2941++;
        int var7 = arg5 - this.field2951;
        int var8 = arg0 - this.field2946;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method1003(var7, true, 128, var8);
                this.method1003(var7, true, 8, var8 - 1);
            }
            if (arg3 == 1) {
                this.method1003(var7, true, 2, var8);
                this.method1003(var7 + 1, true, 32, var8);
            }
            if (arg3 == 2) {
                this.method1003(var7, true, 8, var8);
                this.method1003(var7, true, 128, var8 + 1);
            }
            if (arg3 == 3) {
                this.method1003(var7, true, 32, var8);
                this.method1003(var7 - 1, true, 2, var8);
            }
        }
        if (arg2 == arg4 || arg4 == 3) {
            if (arg3 == 0) {
                this.method1003(var7, true, 1, var8);
                this.method1003(var7 + 1, true, 16, var8 - 1);
            }
            if (arg3 == 1) {
                this.method1003(var7, true, 4, var8);
                this.method1003(var7 + 1, true, 64, var8 + 1);
            }
            if (arg3 == 2) {
                this.method1003(var7, true, 16, var8);
                this.method1003(var7 - 1, true, 1, var8 + 1);
            }
            if (arg3 == 3) {
                this.method1003(var7, true, 64, var8);
                this.method1003(var7 - 1, true, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method1003(var7, true, 130, var8);
                this.method1003(var7, true, 8, var8 - 1);
                this.method1003(var7 + 1, true, 32, var8);
            }
            if (arg3 == 1) {
                this.method1003(var7, true, 10, var8);
                this.method1003(var7 + 1, true, 32, var8);
                this.method1003(var7, true, 128, var8 + 1);
            }
            if (arg3 == 2) {
                this.method1003(var7, true, 40, var8);
                this.method1003(var7, true, 128, var8 + 1);
                this.method1003(var7 - 1, true, 2, var8);
            }
            if (arg3 == 3) {
                this.method1003(var7, true, 160, var8);
                this.method1003(var7 - 1, true, 2, var8);
                this.method1003(var7, true, 8, var8 - 1);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method1003(var7, true, 65536, var8);
                this.method1003(var7, true, 4096, var8 - 1);
            }
            if (arg3 == 1) {
                this.method1003(var7, true, 1024, var8);
                this.method1003(var7 + 1, true, 16384, var8);
            }
            if (arg3 == 2) {
                this.method1003(var7, true, 4096, var8);
                this.method1003(var7, true, 65536, var8 + 1);
            }
            if (arg3 == 3) {
                this.method1003(var7, true, 16384, var8);
                this.method1003(var7 - 1, true, 1024, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method1003(var7, true, 512, var8);
                this.method1003(var7 + 1, true, 8192, var8 - 1);
            }
            if (arg3 == 1) {
                this.method1003(var7, true, 2048, var8);
                this.method1003(var7 + 1, true, 32768, var8 + 1);
            }
            if (arg3 == 2) {
                this.method1003(var7, true, 8192, var8);
                this.method1003(var7 - 1, true, 512, var8 + 1);
            }
            if (arg3 == 3) {
                this.method1003(var7, true, 32768, var8);
                this.method1003(var7 - 1, true, 2048, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1003(var7, true, 66560, var8);
            this.method1003(var7, true, 4096, var8 - 1);
            this.method1003(var7 + 1, true, 16384, var8);
        }
        if (arg3 == 1) {
            this.method1003(var7, true, 5120, var8);
            this.method1003(var7 + 1, true, 16384, var8);
            this.method1003(var7, true, 65536, var8 + 1);
        }
        if (arg3 == 2) {
            this.method1003(var7, true, 20480, var8);
            this.method1003(var7, true, 65536, var8 + 1);
            this.method1003(var7 - 1, true, 1024, var8);
        }
        if (arg3 == 3) {
            this.method1003(var7, true, 81920, var8);
            this.method1003(var7 - 1, true, 1024, var8);
            this.method1003(var7, true, 4096, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
    public final void method1001(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2946;
        int var5 = arg0 - this.field2951;
        field2949++;
        if (arg1 == 1) {
            this.field2958[var4][var5] = class79.method669(this.field2958[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)V")
    public final void method1002(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field2946;
        int var5 = arg0 - this.field2951;
        int var6 = -8 % ((arg2 - 39) / 55);
        this.field2958[var4][var5] = class19.method178(this.field2958[var4][var5], 2097152);
        field2929++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZII)V")
    private final void method1003(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field2958[arg3][arg0] = class79.method669(this.field2958[arg3][arg0], ~arg2);
            field2928++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method1004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2953++;
        if (arg3 == arg5 && arg1 == arg4) {
            return true;
        }
        int var8 = arg5 - this.field2946;
        int var9 = arg3 - this.field2946;
        int var10 = arg4 - this.field2951;
        int var11 = arg1 - this.field2951;
        if (~arg6 == arg0 || arg6 == 7) {
            if (arg6 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field2958[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field2958[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field2958[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field2958[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field2958[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field2958[var8][var11] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field2958[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field2958[var8][var11] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var8 == var9 && var10 + 1 == var11 && (this.field2958[var8][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var11 && (this.field2958[var8][var11] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field2958[var8][var11] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field2958[var8][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIZI)V")
    public static final void method1005(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (class144.field3245 == 0 && !class35.field884) {
            class131.field2990++;
            class105.method830(class133.field3043, 0, -31278, class110.field2567, arg4 - arg1, -arg2 + arg0, 41);
        }
        field2926++;
        int var5 = -1;
        int var6 = 0;
        if (arg3) {
            return;
        }
        while (class155.field3594 > var6) {
            int var7 = class155.field3592[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                label279: {
                    var5 = var7;
                    if (var10 == 2 && class68.field1583.method1147(class106.field2468, var8, var9, var7) >= 0) {
                        class148 var12 = class47.method396(117, var11);
                        if (var12.field3310 != null) {
                            var12 = var12.method1085(-1);
                        }
                        if (var12 == null) {
                            break label279;
                        }
                        if (class144.field3245 == 1) {
                            class105.method830(class33.field834, var7, -31278, class144.method1066(true, new class118[] { class95.field2241, class153.field3473, var12.field3314 }), var9, var8, 1);
                            class88.field2123++;
                        } else if (!class35.field884) {
                            class82.field1978++;
                            class118[] var13 = var12.field3319;
                            if (class101.field2354) {
                                var13 = class44.method366(var13, (byte) -85);
                            }
                            if (var13 != null) {
                                for (int var14 = 4; var14 >= 0; var14--) {
                                    if (var13[var14] != null) {
                                        class106.field2465++;
                                        short var15 = 0;
                                        if (var14 == 0) {
                                            var15 = 43;
                                        }
                                        if (var14 == 1) {
                                            var15 = 15;
                                        }
                                        if (var14 == 2) {
                                            var15 = 57;
                                        }
                                        if (var14 == 3) {
                                            var15 = 51;
                                        }
                                        if (var14 == 4) {
                                            var15 = 1003;
                                        }
                                        class105.method830(var13[var14], var7, -31278, class144.method1066(true, new class118[] { class53.field1255, var12.field3314 }), var9, var8, var15);
                                    }
                                }
                            }
                            class105.method830(class158.field3649, var12.field3299 << 14, -31278, class144.method1066(true, new class118[] { class53.field1255, var12.field3314 }), var9, var8, 1007);
                        } else if ((class80.field1934 & 0x4) == 4) {
                            class105.method830(class103.field2378, var7, -31278, class144.method1066(true, new class118[] { class56.field1334, class153.field3473, var12.field3314 }), var9, var8, 49);
                            class149.field3354++;
                        }
                    }
                    if (var10 == 1) {
                        class83 var16 = class74.field1833[var11];
                        if (var16.field1989.field2575 == 1 && (var16.field760 & 0x7F) == 64 && (var16.field712 & 0x7F) == 64) {
                            for (int var17 = 0; var17 < class115.field2702; var17++) {
                                class83 var20 = class74.field1833[class68.field1580[var17]];
                                if (var20 != null && var16 != var20 && var20.field1989.field2575 == 1 && var16.field760 == var20.field760 && var16.field712 == var20.field712) {
                                    class78.method659((byte) 97, class68.field1580[var17], var8, var20.field1989, var9);
                                }
                            }
                            for (int var18 = 0; var18 < class105.field2425; var18++) {
                                class132 var19 = class108.field2526[class73.field1685[var18]];
                                if (var19 != null && var16.field760 == var19.field760 && var16.field712 == var19.field712) {
                                    class82.method676(var9, var19, var8, class73.field1685[var18], true);
                                }
                            }
                        }
                        class78.method659((byte) 124, var11, var8, var16.field1989, var9);
                    }
                    if (var10 == 0) {
                        class132 var21 = class108.field2526[var11];
                        if ((var21.field760 & 0x7F) == 64 && (var21.field712 & 0x7F) == 64) {
                            for (int var22 = 0; var22 < class115.field2702; var22++) {
                                class83 var25 = class74.field1833[class68.field1580[var22]];
                                if (var25 != null && var25.field1989.field2575 == 1 && var21.field760 == var25.field760 && var21.field712 == var25.field712) {
                                    class78.method659((byte) 108, class68.field1580[var22], var8, var25.field1989, var9);
                                }
                            }
                            for (int var23 = 0; var23 < class105.field2425; var23++) {
                                class132 var24 = class108.field2526[class73.field1685[var23]];
                                if (var24 != null && var21 != var24 && var21.field760 == var24.field760 && var21.field712 == var24.field712) {
                                    class82.method676(var9, var24, var8, class73.field1685[var23], true);
                                }
                            }
                        }
                        class82.method676(var9, var21, var8, var11, true);
                    }
                    if (var10 == 3) {
                        class113 var26 = class84.field2022[class106.field2468][var8][var9];
                        if (var26 != null) {
                            for (class84 var27 = (class84) var26.method886(-96); var27 != null; var27 = (class84) var26.method879((byte) -69)) {
                                class85 var28 = class131.method1013(-12582, var27.field2016);
                                if (class144.field3245 == 1) {
                                    class105.method830(class33.field834, var27.field2016, -31278, class144.method1066(!arg3, new class118[] { class95.field2241, class84.field2026, var28.field2048 }), var9, var8, 31);
                                    class48.field1155++;
                                } else if (!class35.field884) {
                                    class151.field3373++;
                                    class118[] var29 = var28.field2071;
                                    if (class101.field2354) {
                                        var29 = class44.method366(var29, (byte) -85);
                                    }
                                    for (int var30 = 4; var30 >= 0; var30--) {
                                        if (var29 != null && var29[var30] != null) {
                                            byte var31 = 0;
                                            if (var30 == 0) {
                                                var31 = 26;
                                            }
                                            class62.field1433++;
                                            if (var30 == 1) {
                                                var31 = 21;
                                            }
                                            if (var30 == 2) {
                                                var31 = 19;
                                            }
                                            if (var30 == 3) {
                                                var31 = 48;
                                            }
                                            if (var30 == 4) {
                                                var31 = 11;
                                            }
                                            class105.method830(var29[var30], var27.field2016, -31278, class144.method1066(true, new class118[] { class91.field2184, var28.field2048 }), var9, var8, var31);
                                        } else if (var30 == 2) {
                                            class105.method830(class121.field2796, var27.field2016, -31278, class144.method1066(true, new class118[] { class91.field2184, var28.field2048 }), var9, var8, 19);
                                            class13.field293++;
                                        }
                                    }
                                    class105.method830(class158.field3649, var27.field2016, -31278, class144.method1066(true, new class118[] { class91.field2184, var28.field2048 }), var9, var8, 1006);
                                } else if ((class80.field1934 & 0x1) == 1) {
                                    class105.method830(class103.field2378, var27.field2016, -31278, class144.method1066(true, new class118[] { class56.field1334, class84.field2026, var28.field2048 }), var9, var8, 46);
                                    class46.field1102++;
                                }
                            }
                        }
                    }
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(II)V")
    public class128(int arg0, int arg1) {
        this.field2948 = arg0;
        this.field2951 = 0;
        this.field2934 = arg1;
        this.field2958 = new int[this.field2948][this.field2934];
        this.method997((byte) 116);
    }
}
