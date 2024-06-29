import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class33 {

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    private int field649;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    private int field640;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[[I")
    public int[][] field654;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lo;")
    public static class84 field643 = class15.method124("Use ", 255);

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Lud;")
    public static class118 field663;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lad;")
    public static class5 field641;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)Z", line = 5)
    public final boolean method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field644++;
        if (arg6 != -1) {
            this.method302(4, 70, 21, -27, 80, (byte) -101, -80);
        }
        if (arg3 == arg4 && arg1 == arg2) {
            return true;
        }
        int var8 = arg4 - this.field640;
        int var9 = arg3 - this.field640;
        int var10 = arg2 - this.field650;
        int var11 = arg1 - this.field650;
        if (arg5 == 0) {
            if (arg0 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field654[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field654[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field654[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field654[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field654[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field654[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field654[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field654[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field654[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field654[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field654[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field654[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field654[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field654[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field654[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field654[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var9 && var10 + 1 == var11 && (this.field654[var8][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var11 && (this.field654[var8][var11] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field654[var8][var11] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field654[var8][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZIIII)V", line = 191)
    public final void method295(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field650;
        field664++;
        int var8 = arg4 - this.field640;
        if (!arg1) {
            this.method302(-34, 0, -59, -54, -6, (byte) -8, 0);
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method306(128, var8, var7, false);
                this.method306(8, var8 - 1, var7, !arg1);
            }
            if (arg2 == 1) {
                this.method306(2, var8, var7, false);
                this.method306(32, var8, var7 + 1, false);
            }
            if (arg2 == 2) {
                this.method306(8, var8, var7, !arg1);
                this.method306(128, var8 + 1, var7, false);
            }
            if (arg2 == 3) {
                this.method306(32, var8, var7, false);
                this.method306(2, var8, var7 - 1, false);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method306(1, var8, var7, !arg1);
                this.method306(16, var8 - 1, var7 + 1, !arg1);
            }
            if (arg2 == 1) {
                this.method306(4, var8, var7, !arg1);
                this.method306(64, var8 + 1, var7 + 1, !arg1);
            }
            if (arg2 == 2) {
                this.method306(16, var8, var7, !arg1);
                this.method306(1, var8 + 1, var7 + -1, false);
            }
            if (arg2 == 3) {
                this.method306(64, var8, var7, false);
                this.method306(4, var8 - 1, var7 + -1, false);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method306(130, var8, var7, false);
                this.method306(8, var8 - 1, var7, false);
                this.method306(32, var8, var7 + 1, false);
            }
            if (arg2 == 1) {
                this.method306(10, var8, var7, !arg1);
                this.method306(32, var8, var7 + 1, !arg1);
                this.method306(128, var8 + 1, var7, false);
            }
            if (arg2 == 2) {
                this.method306(40, var8, var7, !arg1);
                this.method306(128, var8 + 1, var7, false);
                this.method306(2, var8, var7 - 1, false);
            }
            if (arg2 == 3) {
                this.method306(160, var8, var7, !arg1);
                this.method306(2, var8, var7 - 1, !arg1);
                this.method306(8, var8 - 1, var7, false);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method306(65536, var8, var7, !arg1);
                this.method306(4096, var8 - 1, var7, !arg1);
            }
            if (arg2 == 1) {
                this.method306(1024, var8, var7, !arg1);
                this.method306(16384, var8, var7 + 1, false);
            }
            if (arg2 == 2) {
                this.method306(4096, var8, var7, false);
                this.method306(65536, var8 + 1, var7, !arg1);
            }
            if (arg2 == 3) {
                this.method306(16384, var8, var7, false);
                this.method306(1024, var8, var7 - 1, false);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method306(512, var8, var7, false);
                this.method306(8192, var8 - 1, var7 + 1, false);
            }
            if (arg2 == 1) {
                this.method306(2048, var8, var7, false);
                this.method306(32768, var8 + 1, var7 - -1, !arg1);
            }
            if (arg2 == 2) {
                this.method306(8192, var8, var7, false);
                this.method306(512, var8 + 1, var7 + -1, false);
            }
            if (arg2 == 3) {
                this.method306(32768, var8, var7, false);
                this.method306(2048, var8 - 1, var7 + -1, false);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method306(66560, var8, var7, !arg1);
            this.method306(4096, var8 - 1, var7, false);
            this.method306(16384, var8, var7 + 1, !arg1);
        }
        if (arg2 == 1) {
            this.method306(5120, var8, var7, false);
            this.method306(16384, var8, var7 + 1, false);
            this.method306(65536, var8 + 1, var7, false);
        }
        if (arg2 == 2) {
            this.method306(20480, var8, var7, false);
            this.method306(65536, var8 + 1, var7, false);
            this.method306(1024, var8, var7 - 1, false);
        }
        if (arg2 == 3) {
            this.method306(81920, var8, var7, !arg1);
            this.method306(1024, var8, var7 - 1, false);
            this.method306(4096, var8 - 1, var7, false);
            return;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIZIII)V", line = 412)
    public final void method296(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -1) {
            this.field640 = 103;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var8 = arg0;
            arg0 = arg1;
            arg1 = var8;
        }
        int var9 = arg4 - this.field640;
        field646++;
        int var10 = 256;
        if (arg3) {
            var10 += 131072;
        }
        int var11 = arg6 - this.field650;
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field647) {
                for (int var13 = var11; var13 < arg1 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field649) {
                        this.method297(var10, arg5 + 16777216, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)V", line = 470)
    private final void method297(int arg0, int arg1, int arg2, int arg3) {
        this.field654[arg3][arg2] = class61.method486(this.field654[arg3][arg2], arg1 - arg0);
        field658++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZIIIII)V", line = 482)
    public final void method298(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field640;
        int var9 = arg5 - this.field650;
        field642++;
        if (arg4 != 19398920) {
            this.method303(-123, -124, -9);
        }
        if (arg3 == 1 || arg3 == 3) {
            int var10 = arg6;
            arg6 = arg0;
            arg0 = var10;
        }
        int var11 = 256;
        if (arg1) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < arg6 + var8; var12++) {
            if (var12 >= 0 && this.field647 > var12) {
                for (int var13 = var9; var13 < arg0 + var9; var13++) {
                    if (var13 >= 0 && this.field649 > var13) {
                        this.method306(var11, var12, var13, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBZIII)V", line = 535)
    public final void method299(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field650;
        field645++;
        int var8 = arg5 - this.field640;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method297(128, 16777215, var7, var8);
                this.method297(8, 16777215, var7, var8 - 1);
            }
            if (arg4 == 1) {
                this.method297(2, 16777215, var7, var8);
                this.method297(32, 16777215, var7 + 1, var8);
            }
            if (arg4 == 2) {
                this.method297(8, 16777215, var7, var8);
                this.method297(128, 16777215, var7, var8 + 1);
            }
            if (arg4 == 3) {
                this.method297(32, 16777215, var7, var8);
                this.method297(2, 16777215, var7 - 1, var8);
            }
        }
        if (arg1 >= -75) {
            field643 = null;
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method297(1, 16777215, var7, var8);
                this.method297(16, 16777215, var7 + 1, var8 + -1);
            }
            if (arg4 == 1) {
                this.method297(4, 16777215, var7, var8);
                this.method297(64, 16777215, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method297(16, 16777215, var7, var8);
                this.method297(1, 16777215, var7 - 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method297(64, 16777215, var7, var8);
                this.method297(4, 16777215, var7 - 1, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method297(130, 16777215, var7, var8);
                this.method297(8, 16777215, var7, var8 - 1);
                this.method297(32, 16777215, var7 + 1, var8);
            }
            if (arg4 == 1) {
                this.method297(10, 16777215, var7, var8);
                this.method297(32, 16777215, var7 + 1, var8);
                this.method297(128, 16777215, var7, var8 + 1);
            }
            if (arg4 == 2) {
                this.method297(40, 16777215, var7, var8);
                this.method297(128, 16777215, var7, var8 + 1);
                this.method297(2, 16777215, var7 - 1, var8);
            }
            if (arg4 == 3) {
                this.method297(160, 16777215, var7, var8);
                this.method297(2, 16777215, var7 - 1, var8);
                this.method297(8, 16777215, var7, var8 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method297(65536, 16777215, var7, var8);
                this.method297(4096, 16777215, var7, var8 - 1);
            }
            if (arg4 == 1) {
                this.method297(1024, 16777215, var7, var8);
                this.method297(16384, 16777215, var7 + 1, var8);
            }
            if (arg4 == 2) {
                this.method297(4096, 16777215, var7, var8);
                this.method297(65536, 16777215, var7, var8 + 1);
            }
            if (arg4 == 3) {
                this.method297(16384, 16777215, var7, var8);
                this.method297(1024, 16777215, var7 - 1, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method297(512, 16777215, var7, var8);
                this.method297(8192, 16777215, var7 + 1, var8 + -1);
            }
            if (arg4 == 1) {
                this.method297(2048, 16777215, var7, var8);
                this.method297(32768, 16777215, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method297(8192, 16777215, var7, var8);
                this.method297(512, 16777215, var7 - 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method297(32768, 16777215, var7, var8);
                this.method297(2048, 16777215, var7 - 1, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method297(66560, 16777215, var7, var8);
            this.method297(4096, 16777215, var7, var8 - 1);
            this.method297(16384, 16777215, var7 + 1, var8);
        }
        if (arg4 == 1) {
            this.method297(5120, 16777215, var7, var8);
            this.method297(16384, 16777215, var7 + 1, var8);
            this.method297(65536, 16777215, var7, var8 + 1);
        }
        if (arg4 == 2) {
            this.method297(20480, 16777215, var7, var8);
            this.method297(65536, 16777215, var7, var8 + 1);
            this.method297(1024, 16777215, var7 - 1, var8);
        }
        if (arg4 == 3) {
            this.method297(81920, 16777215, var7, var8);
            this.method297(1024, 16777215, var7 - 1, var8);
            this.method297(4096, 16777215, var7, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z", line = 736)
    public static final boolean method300(int arg0, int arg1) {
        field660++;
        if (!class128.method998(arg0, -20142)) {
            return false;
        }
        boolean var2 = false;
        class75[] var3 = class60.field1254[arg0];
        if (arg1 != 65536) {
            return true;
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            class75 var5 = var3[var4];
            if (var5 != null && var5.field1627 == 6) {
                if (var5.field1565 != -1 || var5.field1593 != -1) {
                    boolean var6 = class101.method766(var5, (byte) -70);
                    int var7;
                    if (var6) {
                        var7 = var5.field1593;
                    } else {
                        var7 = var5.field1565;
                    }
                    if (var7 != -1) {
                        class31 var8 = class74.method554(var7, arg1 - 60669);
                        var5.field1596 += class54.field1126;
                        label55: while (true) {
                            do {
                                do {
                                    if (var8.field628[var5.field1556] >= var5.field1596) {
                                        break label55;
                                    }
                                    var2 = true;
                                    var5.field1596 -= var8.field628[var5.field1556];
                                    var5.field1556++;
                                } while (var5.field1556 < var8.field612.length);
                                var5.field1556 -= var8.field620;
                            } while (var5.field1556 >= 0 && var5.field1556 < var8.field612.length);
                            var5.field1556 = 0;
                        }
                    }
                }
                if (var5.field1634 != 0) {
                    int var9 = var5.field1634 >> 16;
                    var2 = true;
                    int var10 = class54.field1126 * var9;
                    var5.field1573 = var5.field1573 + var10 & 0x7FF;
                    int var11 = var5.field1634 << 16 >> 16;
                    int var12 = class54.field1126 * var11;
                    var5.field1628 = var5.field1628 + var12 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 823)
    public final void method301(boolean arg0) {
        for (int var2 = 0; var2 < this.field647; var2++) {
            for (int var3 = 0; var3 < this.field649; var3++) {
                if (var2 == 0 || var3 == 0 || this.field647 - 1 == var2 || this.field649 - 1 == var3) {
                    this.field654[var2][var3] = 16777215;
                } else {
                    this.field654[var2][var3] = 16777216;
                }
            }
        }
        field661++;
        if (!arg0) {
            method300(-13, -59);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIBI)Z", line = 855)
    public final boolean method302(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field651++;
        int var8 = -61 % ((arg5 + 43) / 47);
        if (arg3 == arg6 && arg0 == arg4) {
            return true;
        }
        int var9 = arg3 - this.field640;
        int var10 = arg0 - this.field650;
        int var11 = arg4 - this.field650;
        int var12 = arg6 - this.field640;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var9 + 1 == var12 && var10 == var11 && (this.field654[var12][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field654[var12][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var9 - 1 == var12 && var10 == var11 && (this.field654[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field654[var12][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var9 - 1 == var12 && var10 == var11 && (this.field654[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 + 1 == var10 && (this.field654[var12][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var9 + 1 == var12 && var10 == var11 && (this.field654[var12][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 + 1 == var10 && (this.field654[var12][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var9 == var12 && var11 + 1 == var10 && (this.field654[var12][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var12 && var11 - 1 == var10 && (this.field654[var12][var10] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var12 && var10 == var11 && (this.field654[var12][var10] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var12 && var10 == var11 && (this.field654[var12][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V", line = 945)
    public final void method303(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field650;
        field659++;
        int var5 = arg2 - this.field640;
        this.field654[var5][var4] = class106.method785(this.field654[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(II)V", line = 962)
    public class33(int arg0, int arg1) {
        this.field649 = arg1;
        this.field647 = arg0;
        this.field640 = 0;
        this.field650 = 0;
        this.field654 = new int[this.field647][this.field649];
        this.method301(true);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)V", line = 980)
    public final void method304(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field640;
        if (arg2 == -32) {
            int var5 = arg0 - this.field650;
            field648++;
            this.field654[var4][var5] = class61.method486(this.field654[var4][var5], 14680063);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIZ)Z", line = 996)
    public final boolean method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field657++;
        int var9 = arg3 + arg6 - 1;
        if (arg7) {
            this.field647 = -24;
        }
        int var10 = arg2 + arg4 - 1;
        if (arg2 <= arg5 && arg5 <= var10 && arg1 >= arg3 && arg1 <= var9) {
            return true;
        } else if (arg2 - 1 == arg5 && arg3 <= arg1 && var9 >= arg1 && (this.field654[arg5 - this.field640][arg1 - this.field650] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg5 && arg3 <= arg1 && var9 >= arg1 && (this.field654[arg5 - this.field640][arg1 - this.field650] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg1 && arg2 <= arg5 && var10 >= arg5 && (this.field654[arg5 - this.field640][arg1 - this.field650] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg1 && arg5 >= arg2 && var10 >= arg5 && (this.field654[arg5 - this.field640][arg1 - this.field650] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIZ)V", line = 1027)
    private final void method306(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.method297(-97, 109, -128, 8);
        }
        field652++;
        this.field654[arg1][arg2] = class106.method785(this.field654[arg1][arg2], arg0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lcb;Lcb;BI)V", line = 1038)
    public static final void method307(class15 arg0, class15 arg1, byte arg2, int arg3) throws IOException {
        field656++;
        byte[] var4 = arg0.method128(arg3, 97);
        if (var4 == null) {
            return;
        }
        int var5 = 92 / ((arg2 - 67) / 53);
        int var6 = 0;
        byte[] var7 = new byte[1000];
        int var8 = var4.length - 2;
        GZIPInputStream var9 = new GZIPInputStream(new ByteArrayInputStream(var4));
        while (true) {
            int var10 = var9.read(var7, 0, var7.length);
            if (var10 == -1) {
                byte[] var11 = new byte[var4.length + 9];
                class68.method518(var4, 0, var11, 9, var4.length);
                class27 var13 = new class27(var11);
                var13.method226(-9646, 2);
                var13.method248(var8, -2147393384);
                var13.method248(var6, -2147393384);
                var13.field482 = var11.length - 2;
                int var14 = var13.method227(127);
                var13.field482 = var11.length - 2;
                Object var15 = null;
                var13.method217(var14 - 1, 769666216);
                arg1.method126(var11.length, arg3, var11, false);
                return;
            }
            var6 += var10;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 1091)
    public static void method308(int arg0) {
        field641 = null;
        field643 = null;
        field663 = null;
        if (arg0 != 5314) {
            method300(47, -71);
        }
    }
}
