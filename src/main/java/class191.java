import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class191 {

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    private int field3773 = 0;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    private int field3781;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    private int field3770;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "[[I")
    public int[][] field3776;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    private int field3771;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lsg;")
    private static class169 field3755 = class165.method1060("Verbinde mit Server)3)3)3", 1536);

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Z")
    public static boolean field3769 = false;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Lsg;")
    private static class169 field3775 = class165.method1060("Willkommen auf RuneScape", 1536);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(JI)V")
    public static final void method1254(long arg0, int arg1) {
        int var3 = -31 % ((14 - arg1) / 50);
        field3759++;
        if (arg0 != 0L) {
            class141.field2621.method1024(131, (byte) -94);
            class64.field1179++;
            class141.field2621.method816(arg0, -16701);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
    public final void method1255(int arg0, int arg1, int arg2) {
        field3768++;
        int var4 = arg2 - this.field3773;
        if (arg0 > -61) {
            field3755 = null;
        }
        int var5 = arg1 - this.field3771;
        this.field3776[var4][var5] = class10.method56(this.field3776[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method1256(int arg0) {
        field3755 = null;
        if (arg0 != 10) {
            method1254(-15L, 111);
        }
        field3775 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method1257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3780++;
        if (arg0 == arg5 && arg2 == arg6) {
            return true;
        }
        int var8 = arg5 - this.field3773;
        int var9 = arg6 - this.field3771;
        int var10 = arg0 - this.field3773;
        int var11 = arg2 - this.field3771;
        if (arg4 == 0) {
            if (arg1 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field3776[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field3776[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field3776[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field3776[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field3776[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field3776[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field3776[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field3776[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 != 19661058) {
            field3755 = null;
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field3776[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field3776[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field3776[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field3776[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field3776[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field3776[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field3776[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field3776[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field3776[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field3776[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var10 && var9 == var11 && (this.field3776[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var10 && var9 == var11 && (this.field3776[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBIIIIII)Z")
    public final boolean method1258(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg5 + arg6 - 1;
        field3772++;
        if (arg1 != -98) {
            this.field3776 = null;
        }
        int var10 = arg4 + arg2 - 1;
        if (arg0 >= arg5 && arg0 <= var9 && arg7 >= arg4 && var10 >= arg7) {
            return true;
        } else if (arg5 - 1 == arg0 && arg7 >= arg4 && var10 >= arg7 && (this.field3776[arg0 - this.field3773][arg7 - this.field3771] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg0 && arg4 <= arg7 && arg7 <= var10 && (this.field3776[arg0 - this.field3773][arg7 - this.field3771] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg7 && arg5 <= arg0 && var9 >= arg0 && (this.field3776[arg0 - this.field3773][arg7 - this.field3771] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg5 <= arg0 && var9 >= arg0 && (this.field3776[arg0 - this.field3773][arg7 - this.field3771] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIIZ)V")
    public final void method1259(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg0 - this.field3773;
        field3777++;
        int var8 = arg2 - this.field3771;
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        if (!arg1) {
            this.field3773 = -51;
        }
        for (int var10 = var7; var10 < arg3 + var7; var10++) {
            if (var10 >= 0 && this.field3781 > var10) {
                for (int var11 = var8; var11 < arg4 + var8; var11++) {
                    if (var11 >= 0 && this.field3770 > var11) {
                        this.method1269(var10, var11, var9, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
    private final void method1260(int arg0, int arg1, int arg2, int arg3) {
        this.field3776[arg3][arg2] = class150.method984(this.field3776[arg3][arg2], ~arg0);
        field3760++;
        if (arg1 != 19661064) {
            this.method1262(-110, 35, 96);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIZII)V")
    public final void method1261(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field3773;
        field3779++;
        if (arg1) {
            return;
        }
        int var8 = arg5 - this.field3771;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1260(128, 19661064, var8, var7);
                this.method1260(8, 19661064, var8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method1260(2, 19661064, var8, var7);
                this.method1260(32, 19661064, var8 + 1, var7);
            }
            if (arg4 == 2) {
                this.method1260(8, 19661064, var8, var7);
                this.method1260(128, 19661064, var8, var7 + 1);
            }
            if (arg4 == 3) {
                this.method1260(32, 19661064, var8, var7);
                this.method1260(2, 19661064, var8 - 1, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1260(1, 19661064, var8, var7);
                this.method1260(16, 19661064, var8 + 1, var7 + -1);
            }
            if (arg4 == 1) {
                this.method1260(4, 19661064, var8, var7);
                this.method1260(64, 19661064, var8 + 1, var7 + 1);
            }
            if (arg4 == 2) {
                this.method1260(16, 19661064, var8, var7);
                this.method1260(1, 19661064, var8 - 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method1260(64, 19661064, var8, var7);
                this.method1260(4, 19661064, var8 - 1, var7 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method1260(130, 19661064, var8, var7);
                this.method1260(8, 19661064, var8, var7 - 1);
                this.method1260(32, 19661064, var8 + 1, var7);
            }
            if (arg4 == 1) {
                this.method1260(10, 19661064, var8, var7);
                this.method1260(32, 19661064, var8 + 1, var7);
                this.method1260(128, 19661064, var8, var7 + 1);
            }
            if (arg4 == 2) {
                this.method1260(40, 19661064, var8, var7);
                this.method1260(128, 19661064, var8, var7 + 1);
                this.method1260(2, 19661064, var8 - 1, var7);
            }
            if (arg4 == 3) {
                this.method1260(160, 19661064, var8, var7);
                this.method1260(2, 19661064, var8 - 1, var7);
                this.method1260(8, 19661064, var8, var7 - 1);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1260(65536, 19661064, var8, var7);
                this.method1260(4096, 19661064, var8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method1260(1024, 19661064, var8, var7);
                this.method1260(16384, 19661064, var8 + 1, var7);
            }
            if (arg4 == 2) {
                this.method1260(4096, 19661064, var8, var7);
                this.method1260(65536, 19661064, var8, var7 + 1);
            }
            if (arg4 == 3) {
                this.method1260(16384, 19661064, var8, var7);
                this.method1260(1024, 19661064, var8 - 1, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1260(512, 19661064, var8, var7);
                this.method1260(8192, 19661064, var8 + 1, var7 - 1);
            }
            if (arg4 == 1) {
                this.method1260(2048, 19661064, var8, var7);
                this.method1260(32768, 19661064, var8 + 1, var7 + 1);
            }
            if (arg4 == 2) {
                this.method1260(8192, 19661064, var8, var7);
                this.method1260(512, 19661064, var8 - 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method1260(32768, 19661064, var8, var7);
                this.method1260(2048, 19661064, var8 - 1, var7 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1260(66560, 19661064, var8, var7);
            this.method1260(4096, 19661064, var8, var7 - 1);
            this.method1260(16384, 19661064, var8 + 1, var7);
        }
        if (arg4 == 1) {
            this.method1260(5120, 19661064, var8, var7);
            this.method1260(16384, 19661064, var8 + 1, var7);
            this.method1260(65536, 19661064, var8, var7 + 1);
        }
        if (arg4 == 2) {
            this.method1260(20480, 19661064, var8, var7);
            this.method1260(65536, 19661064, var8, var7 + 1);
            this.method1260(1024, 19661064, var8 - 1, var7);
        }
        if (arg4 == 3) {
            this.method1260(81920, 19661064, var8, var7);
            this.method1260(1024, 19661064, var8 - 1, var7);
            this.method1260(4096, 19661064, var8, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
    public final void method1262(int arg0, int arg1, int arg2) {
        field3757++;
        int var4 = arg1 - this.field3771;
        int var5 = arg2 - this.field3773;
        this.field3776[var5][var4] = class150.method984(this.field3776[var5][var4], arg0);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLv;I)V")
    public static final void method1263(byte arg0, class189 arg1, int arg2) {
        field3756++;
        if (class162.field3107 < arg1.field3693) {
            class165.method1061(arg0 - 116, arg1);
        } else if (arg1.field3718 < class162.field3107) {
            class42.method273(arg0 ^ 0x36, arg1);
        } else {
            class64.method399(false, arg1);
        }
        if (arg1.field3698 < 128 || arg1.field3679 < 128 || arg1.field3698 >= 13184 || arg1.field3679 >= 13184) {
            arg1.field3679 = arg1.field3729[0] * 128 + arg1.field3711 * 64;
            arg1.field3703 = -1;
            arg1.field3698 = arg1.field3734[0] * 128 + arg1.field3711 * 64;
            arg1.field3697 = -1;
            arg1.field3718 = 0;
            arg1.field3693 = 0;
            arg1.method1243(-29203);
        }
        if (class4.field79 == arg1 && (arg1.field3698 < 1536 || arg1.field3679 < 1536 || arg1.field3698 >= 11776 || arg1.field3679 >= 11776)) {
            arg1.field3703 = -1;
            arg1.field3693 = 0;
            arg1.field3679 = arg1.field3729[0] * 128 + arg1.field3711 * 64;
            arg1.field3718 = 0;
            arg1.field3698 = arg1.field3734[0] * 128 + arg1.field3711 * 64;
            arg1.field3697 = -1;
            arg1.method1243(-29203);
        }
        class141.method938((byte) 112, arg1);
        if (arg0 != 113) {
            method1264(null, 62, null, null, null);
        }
        class177.method1183(-1, arg1);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lke;ILke;Lse;Lke;)Z")
    public static final boolean method1264(class95 arg0, int arg1, class95 arg2, class167 arg3, class95 arg4) {
        if (arg1 != -1) {
            field3769 = true;
        }
        class4.field88 = arg2;
        field3765++;
        class162.field3113 = arg4;
        class203.field3980 = arg0;
        class154.field2971 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public final void method1265(int arg0) {
        if (arg0 <= 50) {
            field3755 = null;
        }
        for (int var2 = 0; var2 < this.field3781; var2++) {
            for (int var3 = 0; var3 < this.field3770; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field3781 - 5 || this.field3770 - 5 <= var3) {
                    this.field3776[var2][var3] = 16777215;
                } else {
                    this.field3776[var2][var3] = 16777216;
                }
            }
        }
        field3778++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIZI)V")
    public final void method1266(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field3771;
        int var8 = arg3 - this.field3773;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method1269(var8, var7, 128, -1);
                this.method1269(var8 - 1, var7, 8, -1);
            }
            if (arg2 == 1) {
                this.method1269(var8, var7, 2, -1);
                this.method1269(var8, var7 + 1, 32, -1);
            }
            if (arg2 == 2) {
                this.method1269(var8, var7, 8, -1);
                this.method1269(var8 + 1, var7, 128, -1);
            }
            if (arg2 == 3) {
                this.method1269(var8, var7, 32, -1);
                this.method1269(var8, var7 - 1, 2, -1);
            }
        }
        field3763++;
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method1269(var8, var7, 1, -1);
                this.method1269(var8 - 1, var7 + 1, 16, -1);
            }
            if (arg2 == 1) {
                this.method1269(var8, var7, 4, -1);
                this.method1269(var8 + 1, var7 + 1, 64, -1);
            }
            if (arg2 == 2) {
                this.method1269(var8, var7, 16, -1);
                this.method1269(var8 + 1, var7 + -1, 1, -1);
            }
            if (arg2 == 3) {
                this.method1269(var8, var7, 64, -1);
                this.method1269(var8 - 1, var7 + -1, 4, -1);
            }
        }
        if (arg4) {
            field3761 = -7;
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method1269(var8, var7, 130, -1);
                this.method1269(var8 - 1, var7, 8, -1);
                this.method1269(var8, var7 + 1, 32, -1);
            }
            if (arg2 == 1) {
                this.method1269(var8, var7, 10, -1);
                this.method1269(var8, var7 + 1, 32, -1);
                this.method1269(var8 + 1, var7, 128, -1);
            }
            if (arg2 == 2) {
                this.method1269(var8, var7, 40, -1);
                this.method1269(var8 + 1, var7, 128, -1);
                this.method1269(var8, var7 - 1, 2, -1);
            }
            if (arg2 == 3) {
                this.method1269(var8, var7, 160, -1);
                this.method1269(var8, var7 - 1, 2, -1);
                this.method1269(var8 - 1, var7, 8, -1);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method1269(var8, var7, 65536, -1);
                this.method1269(var8 - 1, var7, 4096, -1);
            }
            if (arg2 == 1) {
                this.method1269(var8, var7, 1024, -1);
                this.method1269(var8, var7 + 1, 16384, -1);
            }
            if (arg2 == 2) {
                this.method1269(var8, var7, 4096, -1);
                this.method1269(var8 + 1, var7, 65536, -1);
            }
            if (arg2 == 3) {
                this.method1269(var8, var7, 16384, -1);
                this.method1269(var8, var7 - 1, 1024, -1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method1269(var8, var7, 512, -1);
                this.method1269(var8 - 1, var7 + 1, 8192, -1);
            }
            if (arg2 == 1) {
                this.method1269(var8, var7, 2048, -1);
                this.method1269(var8 + 1, var7 + 1, 32768, -1);
            }
            if (arg2 == 2) {
                this.method1269(var8, var7, 8192, -1);
                this.method1269(var8 + 1, var7 + -1, 512, -1);
            }
            if (arg2 == 3) {
                this.method1269(var8, var7, 32768, -1);
                this.method1269(var8 - 1, var7 + -1, 2048, -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1269(var8, var7, 66560, -1);
            this.method1269(var8 - 1, var7, 4096, -1);
            this.method1269(var8, var7 + 1, 16384, -1);
        }
        if (arg2 == 1) {
            this.method1269(var8, var7, 5120, -1);
            this.method1269(var8, var7 + 1, 16384, -1);
            this.method1269(var8 + 1, var7, 65536, -1);
        }
        if (arg2 == 2) {
            this.method1269(var8, var7, 20480, -1);
            this.method1269(var8 + 1, var7, 65536, -1);
            this.method1269(var8, var7 - 1, 1024, -1);
        }
        if (arg2 == 3) {
            this.method1269(var8, var7, 81920, -1);
            this.method1269(var8, var7 - 1, 1024, -1);
            this.method1269(var8 - 1, var7, 4096, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static final void method1267(int arg0) {
        class57.field1067 = class54.field993;
        class22.field471 = class169.field3249;
        class183.field3563 = class44.field816;
        class93.field1743 = class190.field3740;
        class81.field1484 = class13.field315;
        class121.field2227 = class103.field1901;
        class90.field1638 = class156.field3003;
        class67.field1270 = class116.field2141;
        class98.field1835 = class151.field2917;
        class48.field872 = class77.field1446;
        class96.field1817 = class15.field329;
        class7.field196 = class171.field3310;
        class149.field2747 = class185.field3620;
        class4.field94 = class51.field926;
        class7.field206 = class61.field1139;
        class7.field177 = class66.field1240;
        class94.field1762 = class15.field323;
        class89.field1628 = class20.field437;
        class56.field1039 = class73.field1328;
        class132.field2451 = class203.field3967;
        class103.field1891 = class143.field2661;
        class86.field1587 = class3.field69;
        class99.field1854 = class121.field2231;
        class151.field2920 = class156.field3000;
        class205.field4010 = class123.field2273;
        class8.field229 = class22.field481;
        class136.field2542 = class145.field2698;
        class7.field139 = class13.field314;
        class27.field556 = class35.field707;
        class7.field135 = class171.field3310;
        class7.field194 = class171.field3310;
        class43.field801 = class159.field3039;
        class182.field3556 = class64.field1201;
        class176.field3453 = class89.field1619;
        class165.field3164 = class5.field112;
        class4.field90 = class21.field452;
        class7.field199 = class171.field3310;
        class174.field3367 = class155.field2986;
        class7.field166 = class82.field1515;
        class122.field2253 = class110.field2010;
        class114.field2080 = class77.field1448;
        class149.field2752 = class195.field3832;
        class180.field3502 = class81.field1495;
        class73.field1361 = class118.field2189;
        class61.field1125 = class163.field3127;
        class54.field995 = class81.field1498;
        class135.field2528 = class96.field1818;
        class123.field2263 = class139.field2584;
        class62.field1148 = class17.field389;
        class7.field210 = class171.field3310;
        class115.field2130 = class125.field2299;
        class51.field925 = class87.field1595;
        class43.field808 = class8.field219;
        class7.field141 = class171.field3310;
        class195.field3820 = class32.field681;
        class56.field1041 = class73.field1328;
        class46.field859 = class160.field3049;
        class199.field3896 = class58.field1081;
        class58.field1094 = class93.field1736;
        class149.field2751 = class88.field1611;
        class3.field76 = class77.field1447;
        class115.field2095 = class107.field1953;
        class7.field144 = class171.field3310;
        class7.field174 = class171.field3310;
        class140.field2609 = class76.field1437;
        class73.field1369 = class42.field793;
        class4.field85 = class132.field2443;
        class206.field4035 = class177.field3455;
        class115.field2104 = class16.field336;
        class15.field321 = class192.field3797;
        class57.field1066 = class158.field3016;
        class137.field2556 = class128.field2391;
        class44.field822 = class92.field1734;
        class154.field2972 = class164.field3145;
        class156.field3001 = class86.field1574;
        class183.field3561 = class82.field1509;
        class43.field803 = class22.field470;
        class196.field3855 = class197.field3882;
        class86.field1585 = class127.field2310;
        class42.field781 = class75.field1423;
        class7.field151 = class171.field3310;
        class98.field1844 = class86.field1581;
        class61.field1131 = field3755;
        class143.field2666 = class125.field2294;
        class195.field3822 = class68.field1290;
        class171.field3304 = field3775;
        class189.field3717 = class162.field3111;
        class162.field3110 = class13.field296;
        class90.field1646 = class2.field32;
        class151.field2908 = class134.field2513;
        class201.field3925 = class61.field1124;
        class147.field2713 = class196.field3852;
        class163.field3126 = class44.field820;
        class203.field3982 = class169.field3276;
        class7.field150 = class171.field3310;
        class139.field2580 = class70.field1317;
        class180.field3520 = class193.field3816;
        class82.field1503 = class92.field1732;
        class122.field2241 = class6.field128;
        class115.field2127 = class188.field3648;
        class7.field161 = class171.field3310;
        class139.field2590 = class114.field2077;
        class177.field3467 = class197.field3881;
        class188.field3654 = class178.field3470;
        class7.field178 = class171.field3310;
        class156.field2999 = class42.field782;
        class7.field185 = class171.field3310;
        class22.field462 = class169.field3249;
        class116.field2139 = class192.field3799;
        class104.field1904 = class32.field677;
        class35.field705 = class185.field3613;
        class11.field274 = class196.field3864;
        class138.field2571 = class106.field1941;
        class70.field1314 = class65.field1221;
        class148.field2716 = class35.field695;
        class91.field1654 = class26.field549;
        class115.field2107 = class107.field1953;
        class104.field1906 = class195.field3835;
        class7.field205 = class41.field778;
        if (arg0 != 1) {
            field3769 = false;
        }
        class112.field2057 = class176.field3433;
        class189.field3713 = class162.field3111;
        class7.field153 = class128.field2384;
        class41.field775 = class48.field874;
        class63.field1162 = class188.field3650;
        class177.field3456 = class196.field3862;
        class22.field466 = class171.field3310;
        class7.field163 = class206.field4055;
        class55.field1000 = class174.field3361;
        class85.field1557 = class190.field3742;
        class41.field779 = class120.field2206;
        class7.field170 = class171.field3310;
        class7.field180 = class66.field1240;
        class111.field2035 = class44.field819;
        class75.field1420 = class174.field3382;
        class125.field2279 = class66.field1239;
        class6.field130 = class82.field1502;
        class158.field3026 = class151.field2910;
        class7.field147 = class180.field3517;
        class42.field780 = class64.field1202;
        class127.field2377 = class58.field1095;
        class7.field169 = class171.field3310;
        class20.field440 = class127.field2371;
        class22.field482 = class25.field519;
        class62.field1142 = class17.field389;
        class21.field446 = class164.field3153;
        class155.field2982 = class67.field1258;
        class204.field3998 = class152.field2924;
        client.field583 = class1.field17;
        class115.field2134 = class107.field1953;
        class61.field1128 = class1.field10;
        class132.field2444 = class44.field826;
        class7.field140 = class171.field3310;
        class7.field165 = class171.field3310;
        class7.field200 = class135.field2526;
        class205.field4025 = class110.field2018;
        class118.field2190 = class55.field1014;
        class115.field2097 = class125.field2299;
        class121.field2223 = class58.field1073;
        class135.field2524 = class114.field2085;
        class7.field191 = class107.field1953;
        class73.field1368 = class129.field2420;
        class7.field172 = class142.field2653;
        class179.field3486 = class111.field2036;
        class13.field312 = class118.field2195;
        class8.field218 = class176.field3432;
        class55.field1013 = class31.field667;
        class201.field3928 = class61.field1124;
        class195.field3837 = class92.field1735;
        class27.field554 = class143.field2659;
        class131.field2436 = class139.field2577;
        class45.field841 = class125.field2301;
        class112.field2056 = class181.field3526;
        class7.field203 = class171.field3310;
        class7.field207 = class125.field2297;
        class16.field335 = class105.field1936;
        class7.field158 = class171.field3310;
        class107.field1955 = class147.field2710;
        class31.field659 = class68.field1283;
        class7.field186 = class171.field3310;
        class152.field2932 = class57.field1070;
        field3767++;
        class127.field2373 = class118.field2203;
        class112.field2044 = class13.field301;
        class202.field3966 = class94.field1751;
        class188.field3656 = class123.field2259;
        class129.field2405 = class65.field1218;
        class152.field2935 = class205.field4006;
        class62.field1146 = class164.field3144;
        class7.field175 = class134.field2512;
        class114.field2071 = class77.field1448;
        class5.field110 = class88.field1612;
        class145.field2697 = class35.field693;
        class122.field2242 = class66.field1233;
        class7.field211 = class134.field2512;
        class7.field157 = class171.field3310;
        class149.field2749 = class88.field1607;
        class145.field2700 = class49.field883;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)V")
    public final void method1268(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field3773;
        field3762++;
        int var5 = arg0 - this.field3771;
        if (arg1 != 1) {
            field3755 = null;
        }
        this.field3776[var4][var5] = class10.method56(this.field3776[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIII)V")
    private final void method1269(int arg0, int arg1, int arg2, int arg3) {
        this.field3776[arg0][arg1] = class10.method56(this.field3776[arg0][arg1], arg2);
        if (arg3 != -1) {
            this.method1271((byte) 7, 73, -99, -20, -84, -120, -83);
        }
        field3764++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIZIIII)V")
    public final void method1270(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -37 % ((arg0 - 78) / 45);
        field3766++;
        int var9 = arg3 - this.field3771;
        int var10 = 256;
        if (arg2) {
            var10 += 131072;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg4;
            arg4 = arg6;
            arg6 = var11;
        }
        int var12 = arg1 - this.field3773;
        for (int var13 = var12; var13 < arg4 + var12; var13++) {
            if (var13 >= 0 && var13 < this.field3781) {
                for (int var14 = var9; var14 < arg6 + var9; var14++) {
                    if (var14 >= 0 && this.field3770 > var14) {
                        this.method1260(var10, 19661064, var14, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIIIIII)Z")
    public final boolean method1271(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3758++;
        if (arg1 == arg4 && arg2 == arg5) {
            return true;
        }
        int var8 = arg2 - this.field3771;
        int var9 = arg4 - this.field3773;
        int var10 = arg5 - this.field3771;
        if (arg0 != -94) {
            this.method1255(-112, 3, 93);
        }
        int var11 = arg1 - this.field3773;
        if (arg3 == 6 || arg3 == 7) {
            if (arg3 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var9 + 1 == var11 && var8 == var10 && (this.field3776[var11][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field3776[var11][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var9 - 1 == var11 && var8 == var10 && (this.field3776[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field3776[var11][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var9 - 1 == var11 && var8 == var10 && (this.field3776[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field3776[var11][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var9 + 1 == var11 && var8 == var10 && (this.field3776[var11][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field3776[var11][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 8) {
            if (var9 == var11 && var8 + 1 == var10 && (this.field3776[var11][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var8 - 1 == var10 && (this.field3776[var11][var10] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var11 && var8 == var10 && (this.field3776[var11][var10] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var11 && var8 == var10 && (this.field3776[var11][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(II)V")
    public class191(int arg0, int arg1) {
        this.field3781 = arg0;
        this.field3770 = arg1;
        this.field3776 = new int[this.field3781][this.field3770];
        this.field3771 = 0;
        this.method1265(81);
    }
}
