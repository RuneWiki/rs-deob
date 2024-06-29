import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class141 {

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    private int field2745 = 0;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    private int field2753;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    private int field2742;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "[[I")
    public int[][] field2748;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    private int field2759;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Lsd;")
    public static class166 field2743 = class135.method935("und Ihr Passwort ein)3", 0);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lsd;")
    public static class166 field2738 = class135.method935(":", 0);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lhc;")
    public static final class67 method958(Component arg0, int arg1, byte arg2, int arg3) {
        field2749++;
        try {
            if (arg2 > -89) {
                field2738 = null;
            }
            Class var4 = Class.forName("kd");
            class67 var5 = (class67) var4.getDeclaredConstructor().newInstance();
            var5.method548(4063, arg3, arg1, arg0);
            return var5;
        } catch (Throwable var7) {
            class124 var6 = new class124();
            var6.method548(4063, arg3, arg1, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method959(int arg0) {
        field2739++;
        if (arg0 != -8974) {
            return;
        }
        for (int var2 = 0; var2 < this.field2753; var2++) {
            for (int var3 = 0; var3 < this.field2742; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2753 - 5 <= var2 || var3 >= this.field2742 - 5) {
                    this.field2748[var2][var3] = 16777215;
                } else {
                    this.field2748[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)V")
    public final void method960(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field2759;
        int var5 = arg2 - this.field2745;
        int var6 = -35 / ((arg1 - 31) / 32);
        this.field2748[var5][var4] = class6.method42(this.field2748[var5][var4], 262144);
        field2754++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZII)V")
    public final void method961(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field2759;
        int var8 = arg5 - this.field2745;
        if (arg0 != 4) {
            field2738 = null;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method965(var8, 2048, 128, var7);
                this.method965(var8 - 1, 2048, 8, var7);
            }
            if (arg1 == 1) {
                this.method965(var8, 2048, 2, var7);
                this.method965(var8, 2048, 32, var7 + 1);
            }
            if (arg1 == 2) {
                this.method965(var8, arg0 ^ 0x804, 8, var7);
                this.method965(var8 + 1, arg0 ^ 0x804, 128, var7);
            }
            if (arg1 == 3) {
                this.method965(var8, 2048, 32, var7);
                this.method965(var8, arg0 ^ 0x804, 2, var7 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method965(var8, arg0 ^ 0x804, 1, var7);
                this.method965(var8 - 1, 2048, 16, var7 + 1);
            }
            if (arg1 == 1) {
                this.method965(var8, arg0 + 2044, 4, var7);
                this.method965(var8 + 1, 2048, 64, var7 + 1);
            }
            if (arg1 == 2) {
                this.method965(var8, 2048, 16, var7);
                this.method965(var8 + 1, 2048, 1, var7 - 1);
            }
            if (arg1 == 3) {
                this.method965(var8, 2048, 64, var7);
                this.method965(var8 - 1, arg0 + 2044, 4, var7 - 1);
            }
        }
        field2758++;
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method965(var8, arg0 + 2044, 130, var7);
                this.method965(var8 - 1, arg0 ^ 0x804, 8, var7);
                this.method965(var8, 2048, 32, var7 + 1);
            }
            if (arg1 == 1) {
                this.method965(var8, 2048, 10, var7);
                this.method965(var8, 2048, 32, var7 + 1);
                this.method965(var8 + 1, 2048, 128, var7);
            }
            if (arg1 == 2) {
                this.method965(var8, 2048, 40, var7);
                this.method965(var8 + 1, 2048, 128, var7);
                this.method965(var8, 2048, 2, var7 - 1);
            }
            if (arg1 == 3) {
                this.method965(var8, 2048, 160, var7);
                this.method965(var8, arg0 + 2044, 2, var7 - 1);
                this.method965(var8 - 1, arg0 + 2044, 8, var7);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method965(var8, arg0 ^ 0x804, 65536, var7);
                this.method965(var8 - 1, 2048, 4096, var7);
            }
            if (arg1 == 1) {
                this.method965(var8, 2048, 1024, var7);
                this.method965(var8, 2048, 16384, var7 + 1);
            }
            if (arg1 == 2) {
                this.method965(var8, 2048, 4096, var7);
                this.method965(var8 + 1, arg0 + 2044, 65536, var7);
            }
            if (arg1 == 3) {
                this.method965(var8, 2048, 16384, var7);
                this.method965(var8, 2048, 1024, var7 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method965(var8, arg0 + 2044, 512, var7);
                this.method965(var8 - 1, 2048, 8192, var7 + 1);
            }
            if (arg1 == 1) {
                this.method965(var8, arg0 ^ 0x804, 2048, var7);
                this.method965(var8 + 1, arg0 + 2044, 32768, var7 + 1);
            }
            if (arg1 == 2) {
                this.method965(var8, 2048, 8192, var7);
                this.method965(var8 + 1, 2048, 512, var7 - 1);
            }
            if (arg1 == 3) {
                this.method965(var8, 2048, 32768, var7);
                this.method965(var8 - 1, 2048, 2048, var7 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method965(var8, 2048, 66560, var7);
            this.method965(var8 - 1, arg0 + 2044, 4096, var7);
            this.method965(var8, 2048, 16384, var7 + 1);
        }
        if (arg1 == 1) {
            this.method965(var8, 2048, 5120, var7);
            this.method965(var8, 2048, 16384, var7 + 1);
            this.method965(var8 + 1, 2048, 65536, var7);
        }
        if (arg1 == 2) {
            this.method965(var8, 2048, 20480, var7);
            this.method965(var8 + 1, arg0 ^ 0x804, 65536, var7);
            this.method965(var8, 2048, 1024, var7 - 1);
        }
        if (arg1 == 3) {
            this.method965(var8, 2048, 81920, var7);
            this.method965(var8, 2048, 1024, var7 - 1);
            this.method965(var8 - 1, 2048, 4096, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBI)V")
    private final void method962(int arg0, int arg1, byte arg2, int arg3) {
        this.field2748[arg1][arg3] = class6.method42(this.field2748[arg1][arg3], arg0);
        if (arg2 != -38) {
            method970(false);
        }
        field2746++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2756++;
        if (arg3 == arg6 && arg4 == arg5) {
            return true;
        }
        int var8 = arg4 - this.field2759;
        int var9 = arg6 - this.field2745;
        int var10 = arg5 - this.field2759;
        int var11 = arg3 - this.field2745;
        if (arg0 == 0) {
            if (arg2 == 0) {
                if (var11 - 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field2748[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field2748[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var9 == var11 && var8 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var8 == var10 && (this.field2748[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field2748[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var11 + 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field2748[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field2748[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var9 == var11 && var8 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var8 == var10 && (this.field2748[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field2748[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                if (var11 - 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field2748[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field2748[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field2748[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field2748[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field2748[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field2748[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var11 - 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field2748[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field2748[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg1 != 1) {
            this.field2759 = 26;
        }
        if (arg0 == 9) {
            if (var9 == var11 && var8 + 1 == var10 && (this.field2748[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var8 - 1 == var10 && (this.field2748[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var8 == var10 && (this.field2748[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var8 == var10 && (this.field2748[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLud;)V")
    public static final void method964(boolean arg0, class184 arg1) {
        if (arg1.field3524 == 0) {
            arg1.field3489 = 1024;
        }
        field2751++;
        arg1.field3540 = 0;
        if (!arg0) {
            field2738 = null;
        }
        int var2 = arg1.field3512 * 128 + arg1.field3490 * 64;
        int var3 = arg1.field3475 - class49.field910;
        int var4 = arg1.field3520 * 128 + arg1.field3490 * 64;
        arg1.field3513 += (var2 - arg1.field3513) / var3;
        arg1.field3526 += (var4 - arg1.field3526) / var3;
        if (arg1.field3524 == 1) {
            arg1.field3489 = 1536;
        }
        if (arg1.field3524 == 2) {
            arg1.field3489 = 0;
        }
        if (arg1.field3524 == 3) {
            arg1.field3489 = 512;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)V")
    private final void method965(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 2048) {
            this.field2748[arg0][arg3] = class22.method151(this.field2748[arg0][arg3], ~arg2);
            field2755++;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZIII)V")
    public final void method966(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2760++;
        int var7 = arg5 - this.field2759;
        int var8 = arg3 - this.field2745;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method962(128, var8, (byte) -38, var7);
                this.method962(8, var8 - 1, (byte) -38, var7);
            }
            if (arg4 == 1) {
                this.method962(2, var8, (byte) -38, var7);
                this.method962(32, var8, (byte) -38, var7 + 1);
            }
            if (arg4 == 2) {
                this.method962(8, var8, (byte) -38, var7);
                this.method962(128, var8 + 1, (byte) -38, var7);
            }
            if (arg4 == 3) {
                this.method962(32, var8, (byte) -38, var7);
                this.method962(2, var8, (byte) -38, var7 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method962(1, var8, (byte) -38, var7);
                this.method962(16, var8 - 1, (byte) -38, var7 + 1);
            }
            if (arg4 == 1) {
                this.method962(4, var8, (byte) -38, var7);
                this.method962(64, var8 + 1, (byte) -38, var7 + 1);
            }
            if (arg4 == 2) {
                this.method962(16, var8, (byte) -38, var7);
                this.method962(1, var8 + 1, (byte) -38, var7 - 1);
            }
            if (arg4 == 3) {
                this.method962(64, var8, (byte) -38, var7);
                this.method962(4, var8 - 1, (byte) -38, var7 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method962(130, var8, (byte) -38, var7);
                this.method962(8, var8 - 1, (byte) -38, var7);
                this.method962(32, var8, (byte) -38, var7 + 1);
            }
            if (arg4 == 1) {
                this.method962(10, var8, (byte) -38, var7);
                this.method962(32, var8, (byte) -38, var7 + 1);
                this.method962(128, var8 + 1, (byte) -38, var7);
            }
            if (arg4 == 2) {
                this.method962(40, var8, (byte) -38, var7);
                this.method962(128, var8 + 1, (byte) -38, var7);
                this.method962(2, var8, (byte) -38, var7 - 1);
            }
            if (arg4 == 3) {
                this.method962(160, var8, (byte) -38, var7);
                this.method962(2, var8, (byte) -38, var7 - 1);
                this.method962(8, var8 - 1, (byte) -38, var7);
            }
        }
        if (arg0 != 1 || !arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method962(65536, var8, (byte) -38, var7);
                this.method962(4096, var8 - 1, (byte) -38, var7);
            }
            if (arg4 == 1) {
                this.method962(1024, var8, (byte) -38, var7);
                this.method962(16384, var8, (byte) -38, var7 + 1);
            }
            if (arg4 == 2) {
                this.method962(4096, var8, (byte) -38, var7);
                this.method962(65536, var8 + 1, (byte) -38, var7);
            }
            if (arg4 == 3) {
                this.method962(16384, var8, (byte) -38, var7);
                this.method962(1024, var8, (byte) -38, var7 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method962(512, var8, (byte) -38, var7);
                this.method962(8192, var8 - 1, (byte) -38, var7 + 1);
            }
            if (arg4 == 1) {
                this.method962(2048, var8, (byte) -38, var7);
                this.method962(32768, var8 + 1, (byte) -38, var7 + 1);
            }
            if (arg4 == 2) {
                this.method962(8192, var8, (byte) -38, var7);
                this.method962(512, var8 + 1, (byte) -38, var7 - 1);
            }
            if (arg4 == 3) {
                this.method962(32768, var8, (byte) -38, var7);
                this.method962(2048, var8 - 1, (byte) -38, var7 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method962(66560, var8, (byte) -38, var7);
            this.method962(4096, var8 - 1, (byte) -38, var7);
            this.method962(16384, var8, (byte) -38, var7 + 1);
        }
        if (arg4 == 1) {
            this.method962(5120, var8, (byte) -38, var7);
            this.method962(16384, var8, (byte) -38, var7 + 1);
            this.method962(65536, var8 + 1, (byte) -38, var7);
        }
        if (arg4 == 2) {
            this.method962(20480, var8, (byte) -38, var7);
            this.method962(65536, var8 + 1, (byte) -38, var7);
            this.method962(1024, var8, (byte) -38, var7 - 1);
        }
        if (arg4 == 3) {
            this.method962(81920, var8, (byte) -38, var7);
            this.method962(1024, var8, (byte) -38, var7 - 1);
            this.method962(4096, var8 - 1, (byte) -38, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBIIIIII)Z")
    public final boolean method967(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg3 + arg2 - 1;
        field2740++;
        int var10 = -45 % ((arg1 + 53) / 33);
        int var11 = arg6 + arg7 - 1;
        if (arg7 <= arg5 && arg5 <= var11 && arg2 <= arg4 && arg4 <= var9) {
            return true;
        } else if (arg7 - 1 == arg5 && arg2 <= arg4 && var9 >= arg4 && (this.field2748[arg5 - this.field2745][arg4 - this.field2759] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var11 + 1 == arg5 && arg2 <= arg4 && var9 >= arg4 && (this.field2748[arg5 - this.field2745][arg4 - this.field2759] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg4 && arg5 >= arg7 && var11 >= arg5 && (this.field2748[arg5 - this.field2745][arg4 - this.field2759] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg4 && arg7 <= arg5 && var11 >= arg5 && (this.field2748[arg5 - this.field2745][arg4 - this.field2759] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZIIIII)V")
    public final void method968(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field2745;
        if (arg2 == 1 || arg2 == 3) {
            int var9 = arg5;
            arg5 = arg4;
            arg4 = var9;
        }
        field2747++;
        int var10 = arg3 - this.field2759;
        int var11 = 256;
        if (arg0) {
            var11 += 131072;
        }
        int var12 = var8;
        if (!arg1) {
            this.field2759 = 0;
        }
        while (arg5 + var8 > var12) {
            if (var12 >= 0 && this.field2753 > var12) {
                for (int var13 = var10; var13 < var10 + arg4; var13++) {
                    if (var13 >= 0 && this.field2742 > var13) {
                        this.method965(var12, 2048, var11, var13);
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    public final void method969(int arg0, int arg1, int arg2) {
        if (arg0 == 9855) {
            field2752++;
            int var4 = arg2 - this.field2745;
            int var5 = arg1 - this.field2759;
            this.field2748[var4][var5] = class22.method151(this.field2748[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public static void method970(boolean arg0) {
        if (!arg0) {
            field2743 = null;
        }
        field2743 = null;
        field2738 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBIIIII)Z")
    public final boolean method971(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2741++;
        if (arg0 == arg2 && arg3 == arg6) {
            return true;
        }
        int var8 = arg3 - this.field2759;
        int var9 = arg0 - this.field2745;
        int var10 = arg6 - this.field2759;
        int var11 = arg2 - this.field2745;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var11 + 1 == var9 && var8 == var10 && (this.field2748[var9][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field2748[var9][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field2748[var9][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field2748[var9][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field2748[var9][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field2748[var9][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var11 + 1 == var9 && var8 == var10 && (this.field2748[var9][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field2748[var9][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        int var12 = 33 % ((-arg1 - 32) / 32);
        if (arg5 == 8) {
            if (var9 == var11 && var10 + 1 == var8 && (this.field2748[var9][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var10 - 1 == var8 && (this.field2748[var9][var8] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var8 == var10 && (this.field2748[var9][var8] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var8 == var10 && (this.field2748[var9][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZIIIZ)V")
    public final void method972(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg0 - this.field2759;
        if (!arg5) {
            this.method969(-77, 33, 23);
        }
        field2757++;
        int var8 = 256;
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field2745;
        for (int var10 = var9; var10 < var9 + arg3; var10++) {
            if (var10 >= 0 && var10 < this.field2753) {
                for (int var11 = var7; var11 < arg2 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field2742) {
                        this.method962(var8, var10, (byte) -38, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IBI)V")
    public final void method973(int arg0, byte arg1, int arg2) {
        field2744++;
        int var4 = arg2 - this.field2745;
        int var5 = arg0 - this.field2759;
        if (arg1 != 79) {
            this.method960(-7, (byte) -23, 96);
        }
        this.field2748[var4][var5] = class6.method42(this.field2748[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
    public class141(int arg0, int arg1) {
        this.field2753 = arg0;
        this.field2742 = arg1;
        this.field2748 = new int[this.field2753][this.field2742];
        this.field2759 = 0;
        this.method959(-8974);
    }
}
