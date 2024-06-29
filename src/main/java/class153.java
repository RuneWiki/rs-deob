import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class153 {

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    private int field3104;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    private int field3099;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    private int field3095;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    private int field3096;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "[[I")
    public int[][] field3094;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Z")
    public static boolean field3093 = true;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "Led;")
    private static class43 field3106 = class191.method1219("Loaded input handler", false);

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field3103 = 0;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "Led;")
    public static class43 field3107 = field3106;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "Led;")
    public static class43 field3112 = class191.method1219("<img=0>", false);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method962(int arg0) {
        field3107 = null;
        field3112 = null;
        if (arg0 != 8) {
            method977(111);
        }
        field3106 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIZI)V")
    public final void method963(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field3095;
        int var8 = arg2 - this.field3099;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method972(var8, var7, 109, 128);
                this.method972(var8 - 1, var7, -31, 8);
            }
            if (arg1 == 1) {
                this.method972(var8, var7, arg0 + 25750, 2);
                this.method972(var8, var7 + 1, arg0 + 25932, 32);
            }
            if (arg1 == 2) {
                this.method972(var8, var7, arg0 + 25776, 8);
                this.method972(var8 + 1, var7, arg0 + 25923, 128);
            }
            if (arg1 == 3) {
                this.method972(var8, var7, -79, 32);
                this.method972(var8, var7 - 1, arg0 + 25780, 2);
            }
        }
        field3101++;
        if (arg0 != -25812) {
            return;
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method972(var8, var7, arg0 + 25936, 1);
                this.method972(var8 - 1, var7 - -1, 119, 16);
            }
            if (arg1 == 1) {
                this.method972(var8, var7, 116, 4);
                this.method972(var8 + 1, var7 + 1, 124, 64);
            }
            if (arg1 == 2) {
                this.method972(var8, var7, -68, 16);
                this.method972(var8 + 1, var7 - 1, -86, 1);
            }
            if (arg1 == 3) {
                this.method972(var8, var7, 115, 64);
                this.method972(var8 - 1, var7 + -1, 125, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method972(var8, var7, -82, 130);
                this.method972(var8 - 1, var7, -83, 8);
                this.method972(var8, var7 + 1, 118, 32);
            }
            if (arg1 == 1) {
                this.method972(var8, var7, 120, 10);
                this.method972(var8, var7 + 1, -59, 32);
                this.method972(var8 + 1, var7, -75, 128);
            }
            if (arg1 == 2) {
                this.method972(var8, var7, -55, 40);
                this.method972(var8 + 1, var7, -119, 128);
                this.method972(var8, var7 - 1, 122, 2);
            }
            if (arg1 == 3) {
                this.method972(var8, var7, -34, 160);
                this.method972(var8, var7 - 1, -118, 2);
                this.method972(var8 - 1, var7, -108, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method972(var8, var7, -32, 65536);
                this.method972(var8 - 1, var7, 108, 4096);
            }
            if (arg1 == 1) {
                this.method972(var8, var7, arg0 ^ 0x64E2, 1024);
                this.method972(var8, var7 + 1, -91, 16384);
            }
            if (arg1 == 2) {
                this.method972(var8, var7, 119, 4096);
                this.method972(var8 + 1, var7, -59, 65536);
            }
            if (arg1 == 3) {
                this.method972(var8, var7, arg0 + 25753, 16384);
                this.method972(var8, var7 - 1, arg0 + 25937, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method972(var8, var7, 104, 512);
                this.method972(var8 - 1, var7 - -1, arg0 ^ 0xFFFF9B5E, 8192);
            }
            if (arg1 == 1) {
                this.method972(var8, var7, -93, 2048);
                this.method972(var8 + 1, var7 + 1, 111, 32768);
            }
            if (arg1 == 2) {
                this.method972(var8, var7, -22, 8192);
                this.method972(var8 + 1, var7 + -1, arg0 + 25780, 512);
            }
            if (arg1 == 3) {
                this.method972(var8, var7, 126, 32768);
                this.method972(var8 - 1, var7 + -1, -90, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method972(var8, var7, -68, 66560);
            this.method972(var8 - 1, var7, -106, 4096);
            this.method972(var8, var7 + 1, 124, 16384);
        }
        if (arg1 == 1) {
            this.method972(var8, var7, -86, 5120);
            this.method972(var8, var7 + 1, -86, 16384);
            this.method972(var8 + 1, var7, 127, 65536);
        }
        if (arg1 == 2) {
            this.method972(var8, var7, arg0 + 25928, 20480);
            this.method972(var8 + 1, var7, -103, 65536);
            this.method972(var8, var7 - 1, -60, 1024);
        }
        if (arg1 == 3) {
            this.method972(var8, var7, 106, 81920);
            this.method972(var8, var7 - 1, -19, 1024);
            this.method972(var8 - 1, var7, arg0 + 25781, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIB)Z")
    public final boolean method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field3105++;
        if (arg3 == arg4 && arg2 == arg5) {
            return true;
        }
        int var8 = arg5 - this.field3095;
        int var9 = arg4 - this.field3099;
        int var10 = arg3 - this.field3099;
        if (arg6 >= -4) {
            return false;
        }
        int var11 = arg2 - this.field3095;
        if (arg1 == 0) {
            if (arg0 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field3094[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field3094[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field3094[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field3094[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field3094[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field3094[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field3094[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field3094[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field3094[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field3094[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field3094[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field3094[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field3094[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field3094[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field3094[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field3094[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
            }
        }
        if (arg1 == 9) {
            if (var9 == var10 && var11 + 1 == var8 && (this.field3094[var9][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var8 && (this.field3094[var9][var8] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var9 && var8 == var11 && (this.field3094[var9][var8] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var9 && var8 == var11 && (this.field3094[var9][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg0 + arg6 - 1;
        if (arg2 != 128) {
            return true;
        }
        field3110++;
        int var10 = arg5 + arg7 - 1;
        if (arg3 >= arg7 && var10 >= arg3 && arg0 <= arg4 && arg4 <= var9) {
            return true;
        } else if (arg7 - 1 == arg3 && arg0 <= arg4 && var9 >= arg4 && (this.field3094[arg3 - this.field3099][arg4 - this.field3095] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg3 && arg0 <= arg4 && var9 >= arg4 && (this.field3094[arg3 - this.field3099][arg4 - this.field3095] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg4 && arg3 >= arg7 && var10 >= arg3 && (this.field3094[arg3 - this.field3099][arg4 - this.field3095] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg4 && arg7 <= arg3 && var10 >= arg3 && (this.field3094[arg3 - this.field3099][arg4 - this.field3095] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
    private final void method966(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -77) {
            field3107 = null;
        }
        field3088++;
        this.field3094[arg2][arg3] = class7.method38(this.field3094[arg2][arg3], ~arg0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIZ)V")
    public final void method967(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3097++;
        int var7 = -40 / ((-arg0 - 71) / 34);
        int var8 = arg1 - this.field3099;
        int var9 = arg2 - this.field3095;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method966(128, -97, var8, var9);
                this.method966(8, -114, var8 - 1, var9);
            }
            if (arg3 == 1) {
                this.method966(2, -104, var8, var9);
                this.method966(32, -122, var8, var9 + 1);
            }
            if (arg3 == 2) {
                this.method966(8, -109, var8, var9);
                this.method966(128, -83, var8 + 1, var9);
            }
            if (arg3 == 3) {
                this.method966(32, -119, var8, var9);
                this.method966(2, -118, var8, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method966(1, -92, var8, var9);
                this.method966(16, -82, var8 - 1, var9 - -1);
            }
            if (arg3 == 1) {
                this.method966(4, -103, var8, var9);
                this.method966(64, -119, var8 + 1, var9 + 1);
            }
            if (arg3 == 2) {
                this.method966(16, -95, var8, var9);
                this.method966(1, -112, var8 + 1, var9 + -1);
            }
            if (arg3 == 3) {
                this.method966(64, -96, var8, var9);
                this.method966(4, -103, var8 - 1, var9 + -1);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method966(130, -83, var8, var9);
                this.method966(8, -106, var8 - 1, var9);
                this.method966(32, -80, var8, var9 + 1);
            }
            if (arg3 == 1) {
                this.method966(10, -103, var8, var9);
                this.method966(32, -95, var8, var9 + 1);
                this.method966(128, -81, var8 + 1, var9);
            }
            if (arg3 == 2) {
                this.method966(40, -88, var8, var9);
                this.method966(128, -78, var8 + 1, var9);
                this.method966(2, -79, var8, var9 - 1);
            }
            if (arg3 == 3) {
                this.method966(160, -100, var8, var9);
                this.method966(2, -103, var8, var9 - 1);
                this.method966(8, -90, var8 - 1, var9);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method966(65536, -97, var8, var9);
                this.method966(4096, -119, var8 - 1, var9);
            }
            if (arg3 == 1) {
                this.method966(1024, -121, var8, var9);
                this.method966(16384, -83, var8, var9 + 1);
            }
            if (arg3 == 2) {
                this.method966(4096, -110, var8, var9);
                this.method966(65536, -116, var8 + 1, var9);
            }
            if (arg3 == 3) {
                this.method966(16384, -80, var8, var9);
                this.method966(1024, -126, var8, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method966(512, -119, var8, var9);
                this.method966(8192, -95, var8 - 1, var9 + 1);
            }
            if (arg3 == 1) {
                this.method966(2048, -126, var8, var9);
                this.method966(32768, -128, var8 + 1, var9 + 1);
            }
            if (arg3 == 2) {
                this.method966(8192, -100, var8, var9);
                this.method966(512, -100, var8 + 1, var9 + -1);
            }
            if (arg3 == 3) {
                this.method966(32768, -92, var8, var9);
                this.method966(2048, -119, var8 - 1, var9 + -1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method966(66560, -118, var8, var9);
            this.method966(4096, -122, var8 - 1, var9);
            this.method966(16384, -94, var8, var9 + 1);
        }
        if (arg3 == 1) {
            this.method966(5120, -128, var8, var9);
            this.method966(16384, -94, var8, var9 + 1);
            this.method966(65536, -113, var8 + 1, var9);
        }
        if (arg3 == 2) {
            this.method966(20480, -78, var8, var9);
            this.method966(65536, -105, var8 + 1, var9);
            this.method966(1024, -101, var8, var9 - 1);
        }
        if (arg3 == 3) {
            this.method966(81920, -98, var8, var9);
            this.method966(1024, -107, var8, var9 - 1);
            this.method966(4096, -89, var8 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3089++;
        if (arg3 == arg5 && arg1 == arg2) {
            return true;
        }
        int var8 = arg5 - this.field3099;
        int var9 = arg3 - this.field3099;
        int var10 = arg2 - this.field3095;
        int var11 = arg1 - this.field3095;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field3094[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field3094[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field3094[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field3094[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field3094[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field3094[var8][var11] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field3094[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field3094[var8][var11] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 != 3) {
            field3107 = null;
        }
        if (arg4 == 8) {
            if (var8 == var9 && var10 + 1 == var11 && (this.field3094[var8][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var11 && (this.field3094[var8][var11] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field3094[var8][var11] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field3094[var8][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
    public final void method969(int arg0, int arg1, int arg2) {
        field3100++;
        int var4 = arg1 - this.field3099;
        if (arg2 != 65536) {
            this.field3095 = 99;
        }
        int var5 = arg0 - this.field3095;
        this.field3094[var4][var5] = class33.method189(this.field3094[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLjava/util/Random;I)I")
    public static final int method970(byte arg0, Random arg1, int arg2) {
        field3090++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class81.method503((byte) -121, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            if (arg0 < 38) {
                return 63;
            }
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class19.method95(arg2, var4, false);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZIBII)V")
    public final void method971(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3085++;
        int var7 = arg2 - this.field3099;
        int var8 = 25 % ((arg3 + 92) / 33);
        int var9 = arg0 - this.field3095;
        int var10 = 256;
        if (arg1) {
            var10 += 131072;
        }
        for (int var11 = var7; var11 < var7 + arg4; var11++) {
            if (var11 >= 0 && var11 < this.field3096) {
                for (int var12 = var9; var12 < arg5 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field3104) {
                        this.method972(var11, var12, 115, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IIII)V")
    private final void method972(int arg0, int arg1, int arg2, int arg3) {
        field3111++;
        int var5 = 36 % ((arg2 - 44) / 60);
        this.field3094[arg0][arg1] = class33.method189(this.field3094[arg0][arg1], arg3);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)V")
    public final void method973(byte arg0, int arg1, int arg2) {
        field3092++;
        int var4 = arg1 - this.field3099;
        int var5 = arg2 - this.field3095;
        if (arg0 != -18) {
            field3112 = null;
        }
        this.field3094[var4][var5] = class33.method189(this.field3094[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(III)V")
    public final void method974(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3095;
        field3102++;
        if (arg0 != -26960) {
            field3107 = null;
        }
        int var5 = arg1 - this.field3099;
        this.field3094[var5][var4] = class7.method38(this.field3094[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public final void method975(int arg0) {
        for (int var2 = 0; var2 < this.field3096; var2++) {
            for (int var3 = 0; var3 < this.field3104; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field3096 - 5 || var3 >= this.field3104 - 5) {
                    this.field3094[var2][var3] = 16777215;
                } else {
                    this.field3094[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 != 16777215) {
            this.field3099 = -122;
        }
        field3086++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIBZ)V")
    public final void method976(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        if (arg5 != -26) {
            return;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var8 = arg3;
            arg3 = arg0;
            arg0 = var8;
        }
        int var9 = arg1 - this.field3095;
        int var10 = 256;
        field3091++;
        if (arg6) {
            var10 += 131072;
        }
        int var11 = arg4 - this.field3099;
        for (int var12 = var11; var12 < var11 + arg3; var12++) {
            if (var12 >= 0 && this.field3096 > var12) {
                for (int var13 = var9; var13 < arg0 + var9; var13++) {
                    if (var13 >= 0 && this.field3104 > var13) {
                        this.method966(var10, arg5 - 73, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(II)V")
    public class153(int arg0, int arg1) {
        this.field3104 = arg1;
        this.field3099 = 0;
        this.field3095 = 0;
        this.field3096 = arg0;
        this.field3094 = new int[this.field3096][this.field3104];
        this.method975(16777215);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
    public static final void method977(int arg0) {
        class105.field2012 = class138.field2862;
        class110.field2121 = class206.field4035;
        class23.field447 = class58.field1145;
        class194.field3806 = class204.field3971;
        class189.field3707 = class75.field1484;
        class13.field194 = class37.field715;
        class76.field1518 = class128.field2555;
        class191.field3726 = class9.field172;
        class16.field258 = class110.field2123;
        class108.field2094 = class121.field2409;
        class167.field3301 = class41.field794;
        class33.field612 = class15.field230;
        class171.field3427 = class76.field1534;
        class116.field2278 = class132.field2755;
        class36.field651 = class61.field1254;
        class32.field594 = class137.field2843;
        class67.field1350 = class148.field3022;
        class39.field742 = class194.field3804;
        class88.field1710 = class48.field966;
        class44.field881 = class173.field3453;
        class156.field3147 = class78.field1549;
        class194.field3803 = class207.field4055;
        class97.field1881 = class107.field2049;
        class138.field2855 = class176.field3502;
        class194.field3800 = class154.field3131;
        class29.field530 = class21.field363;
        class60.field1239 = class32.field607;
        class156.field3158 = class79.field1562;
        class95.field1853 = class68.field1367;
        class147.field3008 = class15.field234;
        class108.field2085 = class51.field1048;
        class36.field655 = class61.field1254;
        class207.field4047 = class48.field970;
        class108.field2088 = class121.field2409;
        class108.field2086 = class51.field1048;
        class29.field535 = class21.field363;
        class142.field2938 = class206.field4032;
        class159.field3227 = class9.field160;
        class92.field1815 = class97.field1882;
        class88.field1712 = class6.field123;
        class108.field2091 = class51.field1048;
        class150.field3042 = class140.field2918;
        class28.field498 = class172.field3442;
        class29.field539 = class4.field85;
        class85.field1663 = class207.field4052;
        class184.field3633 = class53.field1067;
        class73.field1452 = class1.field28;
        class41.field789 = class74.field1473;
        class114.field2217 = class61.field1249;
        class36.field682 = class61.field1254;
        class36.field672 = class61.field1254;
        class37.field703 = class112.field2149;
        class57.field1125 = class96.field1877;
        class36.field661 = class61.field1254;
        class51.field1042 = class207.field4045;
        class16.field241 = class37.field705;
        class171.field3406 = class92.field1827;
        class16.field260 = class39.field737;
        field3109++;
        class36.field685 = class61.field1254;
        class1.field37 = class46.field930;
        class44.field876 = class107.field2042;
        class7.field146 = class52.field1061;
        class175.field3489 = class95.field1854;
        class65.field1327 = class156.field3153;
        class61.field1257 = class4.field93;
        class39.field745 = class16.field253;
        class159.field3223 = class26.field474;
        class122.field2448 = class75.field1478;
        class170.field3395 = class92.field1823;
        class36.field678 = class173.field3457;
        class36.field653 = class64.field1309;
        class161.field3253 = class148.field3025;
        class164.field3273 = class6.field120;
        class2.field48 = class79.field1559;
        class36.field667 = class109.field2107;
        class124.field2455 = class206.field4025;
        class46.field928 = class48.field976;
        class36.field674 = class147.field3015;
        class74.field1464 = class51.field1036;
        class52.field1059 = class161.field3252;
        class99.field1903 = class41.field798;
        class104.field1981 = class75.field1492;
        class49.field1000 = class39.field735;
        class88.field1722 = class50.field1015;
        class36.field652 = class40.field783;
        class44.field873 = class145.field2983;
        class36.field684 = class77.field1536;
        class176.field3506 = class187.field3668;
        class90.field1802 = class103.field1954;
        class172.field3444 = class77.field1544;
        class175.field3476 = class132.field2749;
        class104.field1989 = class46.field918;
        class194.field3799 = class154.field3131;
        class36.field666 = class110.field2115;
        class125.field2486 = class145.field2985;
        class107.field2035 = class44.field885;
        class84.field1655 = class143.field2951;
        class26.field475 = class89.field1744;
        class32.field604 = class92.field1822;
        class84.field1646 = class148.field3017;
        class124.field2462 = class69.field1383;
        class41.field806 = class124.field2459;
        class73.field1455 = class101.field1939;
        class82.field1620 = class85.field1672;
        class92.field1830 = class97.field1882;
        class76.field1510 = class34.field620;
        class34.field626 = class48.field961;
        class36.field658 = class61.field1254;
        class36.field659 = class61.field1254;
        class129.field2668 = class14.field203;
        class36.field688 = class61.field1254;
        class93.field1843 = class175.field3481;
        class119.field2385 = class176.field3508;
        class140.field2900 = class73.field1460;
        class36.field664 = class61.field1254;
        class110.field2120 = class206.field4035;
        class73.field1461 = class194.field3789;
        class108.field2070 = class122.field2438;
        class156.field3146 = class100.field1922;
        class82.field1622 = class191.field3719;
        class28.field509 = class102.field1950;
        field3107 = class163.field3271;
        class29.field532 = class194.field3786;
        class157.field3188 = class184.field3620;
        class1.field34 = class132.field2750;
        class108.field2065 = class184.field3627;
        class143.field2950 = class24.field461;
        class189.field3708 = class75.field1484;
        class156.field3144 = class35.field638;
        class200.field3930 = class43.field856;
        class125.field2485 = class180.field3589;
        class47.field959 = class167.field3332;
        class68.field1360 = class79.field1564;
        class60.field1236 = class164.field3284;
        class36.field687 = class115.field2233;
        class187.field3672 = class49.field988;
        class36.field660 = class105.field2003;
        class13.field188 = class172.field3436;
        class36.field700 = class61.field1254;
        class110.field2125 = class204.field3977;
        class36.field683 = class40.field783;
        if (arg0 != -1) {
            method970((byte) -49, null, -12);
        }
        class100.field1921 = class185.field3639;
        class171.field3426 = class103.field1961;
        class201.field3951 = class117.field2279;
        class175.field3475 = class24.field457;
        class36.field686 = class61.field1254;
        class36.field695 = class61.field1254;
        class36.field679 = class61.field1254;
        class17.field282 = class38.field718;
        class19.field336 = class6.field116;
        class194.field3798 = class61.field1254;
        class145.field2987 = class107.field2059;
        class143.field2955 = class88.field1724;
        class36.field673 = class59.field1218;
        class14.field205 = class88.field1711;
        class36.field656 = class61.field1254;
        class54.field1094 = class28.field493;
        class139.field2888 = class103.field1958;
        class119.field2379 = class203.field3959;
        class125.field2490 = class52.field1063;
        class36.field657 = class105.field2003;
        class36.field681 = class61.field1254;
        class65.field1319 = class83.field1638;
        class97.field1890 = class127.field2546;
        class48.field962 = class200.field3935;
        class36.field699 = class2.field39;
        class36.field668 = class61.field1254;
        class140.field2903 = class117.field2281;
        class51.field1021 = class2.field54;
        class73.field1456 = class101.field1939;
        class78.field1553 = class100.field1913;
        class84.field1653 = class51.field1020;
        class105.field2024 = class193.field3754;
        class117.field2290 = class132.field2763;
        class49.field982 = class176.field3503;
        class36.field691 = class61.field1254;
        class19.field331 = class80.field1598;
        class15.field233 = class29.field518;
        class36.field680 = class61.field1254;
        class126.field2496 = class184.field3618;
        class170.field3389 = class193.field3749;
        class36.field689 = class51.field1048;
        class36.field690 = class89.field1780;
        class110.field2129 = class16.field252;
        class137.field2848 = class55.field1108;
        class171.field3418 = class187.field3677;
        class71.field1406 = class106.field2033;
        class36.field697 = class61.field1254;
        class89.field1737 = class110.field2126;
        class174.field3470 = class67.field1342;
        class115.field2239 = class90.field1795;
        class36.field648 = class61.field1254;
        class64.field1316 = class173.field3450;
        class156.field3156 = class167.field3302;
        class50.field1010 = class136.field2817;
        if (class193.field3775) {
        }
    }
}
