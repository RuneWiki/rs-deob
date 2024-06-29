import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class31 {

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    private int field644 = 0;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    private int field649 = 0;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "[[I")
    public int[][] field656;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Ldd;")
    public static class35 field638 = class180.method1196((byte) 127, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Ldd;")
    private static class35 field645 = class180.method1196((byte) 127, "flash1:");

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Ldd;")
    public static class35 field650 = field645;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Ldd;")
    public static class35 field642 = field645;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lld;")
    public static class111 field639 = new class111(260);

    @OriginalMember(owner = "client!d", name = "y", descriptor = "[Lba;")
    public static class12[] field658 = new class12[1000];

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field659 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
    public static final void method289(boolean arg0) {
        field653++;
        if (!arg0) {
            method289(true);
        }
        while (true) {
            class187 var1 = class71.field1698;
            class161 var2;
            synchronized (class71.field1698) {
                var2 = (class161) class19.field373.method1234(82);
            }
            if (var2 == null) {
                return;
            }
            var2.field3285.method915(-115, var2.field3281, false, (int) var2.field2416, var2.field3274);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method290(byte arg0) {
        if (arg0 != 96) {
            field642 = null;
        }
        field650 = null;
        field639 = null;
        field638 = null;
        field658 = null;
        field645 = null;
        field642 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIB)V")
    public final void method291(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field644;
        int var5 = 80 % ((60 - arg2) / 37);
        int var6 = arg0 - this.field649;
        this.field656[var6][var4] = class152.method1027(this.field656[var6][var4], 2097152);
        field655++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIZIII)Z")
    public final boolean method292(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field651++;
        if (arg1 == arg4 && arg0 == arg2) {
            return true;
        }
        int var8 = arg4 - this.field649;
        if (arg3) {
            field650 = null;
        }
        int var9 = arg2 - this.field644;
        int var10 = arg0 - this.field644;
        int var11 = arg1 - this.field649;
        if (arg6 == 0) {
            if (arg5 == 0) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field656[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field656[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var10 && (this.field656[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field656[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field656[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field656[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var10 && (this.field656[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field656[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg5 == 0) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field656[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field656[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field656[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field656[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field656[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field656[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field656[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field656[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var11 && var10 + 1 == var9 && (this.field656[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var10 - 1 == var9 && (this.field656[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var10 && (this.field656[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var10 && (this.field656[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
    public final void method293(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field649;
        if (arg0 != -6327) {
            this.method296(-88, (byte) 47, 10, true, 43, -51, -120);
        }
        field646++;
        int var5 = arg2 - this.field644;
        this.field656[var4][var5] = class152.method1027(this.field656[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
    private final void method294(int arg0, int arg1, int arg2, int arg3) {
        field643++;
        this.field656[arg3][arg1] = class152.method1027(this.field656[arg3][arg1], arg2);
        if (arg0 != 1) {
            this.field656 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
    public final void method295(int arg0, int arg1, int arg2) {
        field660++;
        int var4 = arg2 - this.field649;
        int var5 = arg0 - this.field644;
        this.field656[var4][var5] = class208.method1372(this.field656[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IBIZIII)V")
    public final void method296(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= -92) {
            this.method300(-72, -29, 122, -58, 122, 99, 72, 116);
        }
        int var8 = arg6 - this.field644;
        field652++;
        int var9 = 256;
        int var10 = arg0 - this.field649;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg4;
            arg4 = arg5;
            arg5 = var11;
        }
        if (arg3) {
            var9 += 131072;
        }
        for (int var12 = var10; var12 < arg4 + var10; var12++) {
            if (var12 >= 0 && var12 < this.field654) {
                for (int var13 = var8; var13 < var8 + arg5; var13++) {
                    if (var13 >= 0 && this.field636 > var13) {
                        this.method303(var13, var12, -3, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public final void method297(int arg0) {
        field640++;
        if (arg0 != -5) {
            this.method298(-85, -40, 68, -17, -63, -90, -105);
        }
        for (int var2 = 0; var2 < this.field654; var2++) {
            for (int var3 = 0; var3 < this.field636; var3++) {
                if (var2 == 0 || var3 == 0 || this.field654 - 5 <= var2 || this.field636 - 5 <= var3) {
                    this.field656[var2][var3] = 16777215;
                } else {
                    this.field656[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 <= 42) {
            this.field636 = -27;
        }
        field634++;
        if (arg2 == arg5 && arg0 == arg3) {
            return true;
        }
        int var8 = arg5 - this.field649;
        int var9 = arg2 - this.field649;
        int var10 = arg0 - this.field644;
        int var11 = arg3 - this.field644;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field656[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field656[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field656[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field656[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field656[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field656[var8][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field656[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field656[var8][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var8 == var9 && var11 + 1 == var10 && (this.field656[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var11 - 1 == var10 && (this.field656[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field656[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field656[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIIIII)V")
    public final void method299(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field644;
        field641++;
        int var8 = arg3 - this.field649;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method303(var7, var8, -3, 128);
                this.method303(var7, var8 - 1, -3, 8);
            }
            if (arg2 == 1) {
                this.method303(var7, var8, -3, 2);
                this.method303(var7 + 1, var8, -3, 32);
            }
            if (arg2 == 2) {
                this.method303(var7, var8, -3, 8);
                this.method303(var7, var8 + 1, -3, 128);
            }
            if (arg2 == 3) {
                this.method303(var7, var8, -3, 32);
                this.method303(var7 - 1, var8, -3, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method303(var7, var8, -3, 1);
                this.method303(var7 + 1, var8 - 1, -3, 16);
            }
            if (arg2 == 1) {
                this.method303(var7, var8, -3, 4);
                this.method303(var7 + 1, var8 - -1, -3, 64);
            }
            if (arg2 == 2) {
                this.method303(var7, var8, -3, 16);
                this.method303(var7 - 1, var8 + 1, -3, 1);
            }
            if (arg2 == 3) {
                this.method303(var7, var8, -3, 64);
                this.method303(var7 - 1, var8 + -1, -3, 4);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method303(var7, var8, -3, 130);
                this.method303(var7, var8 - 1, -3, 8);
                this.method303(var7 + 1, var8, -3, 32);
            }
            if (arg2 == 1) {
                this.method303(var7, var8, -3, 10);
                this.method303(var7 + 1, var8, -3, 32);
                this.method303(var7, var8 + 1, -3, 128);
            }
            if (arg2 == 2) {
                this.method303(var7, var8, -3, 40);
                this.method303(var7, var8 + 1, -3, 128);
                this.method303(var7 - 1, var8, -3, 2);
            }
            if (arg2 == 3) {
                this.method303(var7, var8, -3, 160);
                this.method303(var7 - 1, var8, -3, 2);
                this.method303(var7, var8 - 1, -3, 8);
            }
        }
        if (arg0) {
            if (arg4 == 0) {
                if (arg2 == 0) {
                    this.method303(var7, var8, -3, 65536);
                    this.method303(var7, var8 - 1, -3, 4096);
                }
                if (arg2 == 1) {
                    this.method303(var7, var8, -3, 1024);
                    this.method303(var7 + 1, var8, -3, 16384);
                }
                if (arg2 == 2) {
                    this.method303(var7, var8, -3, 4096);
                    this.method303(var7, var8 + 1, -3, 65536);
                }
                if (arg2 == 3) {
                    this.method303(var7, var8, -3, 16384);
                    this.method303(var7 - 1, var8, -3, 1024);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg2 == 0) {
                    this.method303(var7, var8, -3, 512);
                    this.method303(var7 + 1, var8 + -1, -3, 8192);
                }
                if (arg2 == 1) {
                    this.method303(var7, var8, -3, 2048);
                    this.method303(var7 + 1, var8 + 1, -3, 32768);
                }
                if (arg2 == 2) {
                    this.method303(var7, var8, -3, 8192);
                    this.method303(var7 - 1, var8 + 1, -3, 512);
                }
                if (arg2 == 3) {
                    this.method303(var7, var8, -3, 32768);
                    this.method303(var7 - 1, var8 - 1, -3, 2048);
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    this.method303(var7, var8, -3, 66560);
                    this.method303(var7, var8 - 1, -3, 4096);
                    this.method303(var7 + 1, var8, -3, 16384);
                }
                if (arg2 == 1) {
                    this.method303(var7, var8, -3, 5120);
                    this.method303(var7 + 1, var8, -3, 16384);
                    this.method303(var7, var8 + 1, -3, 65536);
                }
                if (arg2 == 2) {
                    this.method303(var7, var8, -3, 20480);
                    this.method303(var7, var8 + 1, -3, 65536);
                    this.method303(var7 - 1, var8, -3, 1024);
                }
                if (arg2 == 3) {
                    this.method303(var7, var8, -3, 81920);
                    this.method303(var7 - 1, var8, -3, 1024);
                    this.method303(var7, var8 - 1, -3, 4096);
                }
            }
        }
        int var9 = -52 / ((arg1 + 85) / 33);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg3 + arg7 - 1;
        field635++;
        int var10 = arg6 + arg5 - 1;
        if (arg3 <= arg0 && var9 >= arg0 && arg1 >= arg6 && var10 >= arg1) {
            return true;
        } else if (arg3 - 1 == arg0 && arg6 <= arg1 && arg1 <= var10 && (this.field656[arg0 - this.field649][arg1 - this.field644] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg0 && arg1 >= arg6 && var10 >= arg1 && (this.field656[arg0 - this.field649][arg1 - this.field644] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else {
            if (arg2 != 0) {
                this.field654 = -94;
            }
            if (arg6 - 1 == arg1 && arg3 <= arg0 && arg0 <= var9 && (this.field656[arg0 - this.field649][arg1 - this.field644] & 0x2) == 0 && (arg4 & 0x4) == 0) {
                return true;
            } else {
                return var10 + 1 == arg1 && arg0 >= arg3 && var9 >= arg0 && (this.field656[arg0 - this.field649][arg1 - this.field644] & 0x20) == 0 && (arg4 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIZIII)V")
    public final void method301(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field648++;
        int var7 = arg4 - this.field644;
        int var8 = arg3 - this.field649;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method294(1, var7, 128, var8);
                this.method294(1, var7, 8, var8 - 1);
            }
            if (arg0 == 1) {
                this.method294(1, var7, 2, var8);
                this.method294(1, var7 + 1, 32, var8);
            }
            if (arg0 == 2) {
                this.method294(1, var7, 8, var8);
                this.method294(1, var7, 128, var8 + 1);
            }
            if (arg0 == 3) {
                this.method294(1, var7, 32, var8);
                this.method294(1, var7 - 1, 2, var8);
            }
        }
        if (arg5 != -1) {
            return;
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method294(1, var7, 1, var8);
                this.method294(1, var7 + 1, 16, var8 - 1);
            }
            if (arg0 == 1) {
                this.method294(1, var7, 4, var8);
                this.method294(1, var7 + 1, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method294(1, var7, 16, var8);
                this.method294(1, var7 - 1, 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method294(1, var7, 64, var8);
                this.method294(1, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method294(1, var7, 130, var8);
                this.method294(1, var7, 8, var8 - 1);
                this.method294(1, var7 + 1, 32, var8);
            }
            if (arg0 == 1) {
                this.method294(1, var7, 10, var8);
                this.method294(1, var7 + 1, 32, var8);
                this.method294(arg5 + 2, var7, 128, var8 + 1);
            }
            if (arg0 == 2) {
                this.method294(arg5 + 2, var7, 40, var8);
                this.method294(1, var7, 128, var8 + 1);
                this.method294(1, var7 - 1, 2, var8);
            }
            if (arg0 == 3) {
                this.method294(arg5 + 2, var7, 160, var8);
                this.method294(arg5 ^ 0xFFFFFFFE, var7 - 1, 2, var8);
                this.method294(arg5 + 2, var7, 8, var8 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method294(1, var7, 65536, var8);
                this.method294(1, var7, 4096, var8 - 1);
            }
            if (arg0 == 1) {
                this.method294(arg5 ^ 0xFFFFFFFE, var7, 1024, var8);
                this.method294(1, var7 + 1, 16384, var8);
            }
            if (arg0 == 2) {
                this.method294(1, var7, 4096, var8);
                this.method294(1, var7, 65536, var8 + 1);
            }
            if (arg0 == 3) {
                this.method294(arg5 + 2, var7, 16384, var8);
                this.method294(1, var7 - 1, 1024, var8);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method294(arg5 ^ 0xFFFFFFFE, var7, 512, var8);
                this.method294(1, var7 + 1, 8192, var8 - 1);
            }
            if (arg0 == 1) {
                this.method294(1, var7, 2048, var8);
                this.method294(1, var7 + 1, 32768, var8 + 1);
            }
            if (arg0 == 2) {
                this.method294(arg5 ^ 0xFFFFFFFE, var7, 8192, var8);
                this.method294(arg5 + 2, var7 + -1, 512, var8 + 1);
            }
            if (arg0 == 3) {
                this.method294(arg5 ^ 0xFFFFFFFE, var7, 32768, var8);
                this.method294(1, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method294(1, var7, 66560, var8);
            this.method294(1, var7, 4096, var8 - 1);
            this.method294(1, var7 + 1, 16384, var8);
        }
        if (arg0 == 1) {
            this.method294(arg5 + 2, var7, 5120, var8);
            this.method294(1, var7 + 1, 16384, var8);
            this.method294(1, var7, 65536, var8 + 1);
        }
        if (arg0 == 2) {
            this.method294(arg5 ^ 0xFFFFFFFE, var7, 20480, var8);
            this.method294(1, var7, 65536, var8 + 1);
            this.method294(1, var7 - 1, 1024, var8);
        }
        if (arg0 == 3) {
            this.method294(1, var7, 81920, var8);
            this.method294(1, var7 - 1, 1024, var8);
            this.method294(1, var7, 4096, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIIII)V")
    public final void method302(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field649;
        int var8 = arg0 - this.field644;
        field657++;
        int var9 = 256;
        if (arg1) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < arg4 + var7; var10++) {
            if (var10 >= 0 && this.field654 > var10) {
                for (int var11 = var8; var11 < arg2 + var8; var11++) {
                    if (var11 >= 0 && var11 < this.field636) {
                        this.method294(1, var11, var9, var10);
                    }
                }
            }
        }
        if (arg3 <= 5) {
            field659 = -49;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIII)V")
    private final void method303(int arg0, int arg1, int arg2, int arg3) {
        this.field656[arg1][arg0] = class208.method1372(this.field656[arg1][arg0], ~arg3);
        field647++;
        if (arg2 != -3) {
            this.method296(-41, (byte) 119, -92, false, 74, -18, -108);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II)V")
    public class31(int arg0, int arg1) {
        this.field636 = arg1;
        this.field654 = arg0;
        this.field656 = new int[this.field654][this.field636];
        this.method297(-5);
    }
}
