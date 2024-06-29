import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class218 {

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    private int field3747 = 0;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    private int field3758;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    private int field3765;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    private int field3738;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[[I")
    public int[][] field3756;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[I")
    public static int[] field3751 = new int[32];

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3743 = 0;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Lmh;")
    public static class62 field3757 = class201.method1405(true, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field3761 = 0;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3768;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "Z")
    public static boolean field3770;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Lwj;")
    public static class135 field3742;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Lhi;")
    public static class26 field3753;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[Z")
    public static boolean[] field3759;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)V", line = 22)
    public static final void method1544(int arg0, int arg1, int arg2, int arg3) {
        class166 var4 = class256.field4320[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class268 var5 = var4.field2720;
        if (var5 != null) {
            var5.field4543 = var5.field4543 * arg3 / 16;
            var5.field4548 = var5.field4548 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V", line = 41)
    public final void method1545(int arg0, int arg1, int arg2) {
        if (arg1 != -1337) {
            this.method1551(102, true, 45, (byte) -116, -78, -121);
        }
        field3760++;
        int var4 = arg2 - this.field3747;
        int var5 = arg0 - this.field3765;
        this.field3756[var4][var5] = class234.method1648(this.field3756[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIBI)Z", line = 54)
    public final boolean method1546(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3748++;
        if (arg2 == arg4 && arg0 == arg1) {
            return true;
        }
        int var6 = arg1 - this.field3765;
        int var7 = arg4 - this.field3747;
        if (var7 < 0 || var7 >= this.field3738 || var6 < 0 || var6 >= this.field3758) {
            return false;
        }
        int var8 = arg2 - this.field3747;
        int var9 = arg0 - this.field3765;
        if (arg3 <= 115) {
            return true;
        }
        int var10;
        if (var6 <= var9) {
            var10 = var9 - var6;
        } else {
            var10 = var6 - var9;
        }
        int var11;
        if (var8 >= var7) {
            var11 = var8 - var7;
        } else {
            var11 = var7 - var8;
        }
        if (var10 < var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var8) {
                if (var8 < var7) {
                    if ((this.field3756[var8][var9] & 0x12C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var7) {
                    if ((this.field3756[var8][var9] & 0x12C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 > var9) {
                        if ((this.field3756[var8][var9] & 0x12C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var6) {
                        if ((this.field3756[var8][var9] & 0x12C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var9) {
                if (var9 < var6) {
                    if ((this.field3756[var8][var9] & 0x12C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var9 > var6) {
                    if ((this.field3756[var8][var9] & 0x12C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 > var8) {
                        if ((this.field3756[var8][var9] & 0x12C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field3756[var8][var9] & 0x12C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field3756[var7][var6] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBII)V", line = 209)
    private final void method1547(int arg0, byte arg1, int arg2, int arg3) {
        field3739++;
        this.field3756[arg3][arg2] = class270.method1854(this.field3756[arg3][arg2], arg0);
        if (arg1 <= 68) {
            this.method1561(116, -49, 16, 6);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)V", line = 220)
    public final void method1548(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3765;
        int var5 = arg0 - this.field3747;
        field3754++;
        this.field3756[var5][var4] = class270.method1854(this.field3756[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIII)Z", line = 235)
    public final boolean method1549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3762++;
        if (arg1 > 1) {
            return this.method1550(arg5, arg0, arg7, arg1, arg1, arg4, arg2, arg8, -103) ? true : this.method1559(0, arg4, arg5, arg0, arg8, arg2, arg7, arg1, arg6, arg1);
        }
        int var10 = arg8 + arg2 - 1;
        int var11 = arg0 - (1 - arg4);
        if (arg5 >= arg0 && var11 >= arg5 && arg7 >= arg8 && var10 >= arg7) {
            return true;
        } else if ((arg0 - 1) == arg5 && arg8 <= arg7 && arg7 <= var10 && (this.field3756[arg5 - this.field3747][arg7 - this.field3765] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else {
            if (arg3 != 0) {
                this.method1545(108, -93, -80);
            }
            if ((var11 + 1) == arg5 && arg7 >= arg8 && arg7 <= var10 && (this.field3756[arg5 - this.field3747][arg7 - this.field3765] & 0x80) == 0 && (arg6 & 0x2) == 0) {
                return true;
            } else if ((arg8 - 1) == arg7 && arg0 <= arg5 && var11 >= arg5 && (this.field3756[arg5 - this.field3747][arg7 - this.field3765] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return (var10 + 1) == arg7 && arg5 >= arg0 && var11 >= arg5 && (this.field3756[arg5 - this.field3747][arg7 - this.field3765] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3751[var1] = var0 - 1;
            var0 += var0;
        }
        field3769 = 0;
        field3768 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field3770 = true;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIIIIII)Z", line = 285)
    private final boolean method1550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3763++;
        if (arg0 >= (arg1 + arg5) || arg0 + arg4 <= arg1) {
            return false;
        } else if (arg6 + arg7 > arg2 && arg2 + arg3 > arg7) {
            if (arg8 >= -27) {
                this.method1551(73, true, -35, (byte) 0, 24, 126);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZIBII)V", line = 308)
    public final void method1551(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3766++;
        if (arg3 != -22) {
            this.method1548(85, 69, -39);
        }
        int var7 = arg5 - this.field3747;
        int var8 = arg4 - this.field3765;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1547(128, (byte) 121, var8, var7);
                this.method1547(8, (byte) 99, var8, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1547(2, (byte) 81, var8, var7);
                this.method1547(32, (byte) 94, var8 + 1, var7);
            }
            if (arg0 == 2) {
                this.method1547(8, (byte) 94, var8, var7);
                this.method1547(128, (byte) 93, var8, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1547(32, (byte) 95, var8, var7);
                this.method1547(2, (byte) 97, var8 - 1, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1547(1, (byte) 127, var8, var7);
                this.method1547(16, (byte) 95, var8 + 1, var7 + -1);
            }
            if (arg0 == 1) {
                this.method1547(4, (byte) 106, var8, var7);
                this.method1547(64, (byte) 90, var8 + 1, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1547(16, (byte) 94, var8, var7);
                this.method1547(1, (byte) 118, var8 - 1, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1547(64, (byte) 71, var8, var7);
                this.method1547(4, (byte) 88, var8 - 1, var7 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method1547(130, (byte) 126, var8, var7);
                this.method1547(8, (byte) 89, var8, var7 - 1);
                this.method1547(32, (byte) 85, var8 + 1, var7);
            }
            if (arg0 == 1) {
                this.method1547(10, (byte) 73, var8, var7);
                this.method1547(32, (byte) 103, var8 + 1, var7);
                this.method1547(128, (byte) 89, var8, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1547(40, (byte) 81, var8, var7);
                this.method1547(128, (byte) 78, var8, var7 + 1);
                this.method1547(2, (byte) 116, var8 - 1, var7);
            }
            if (arg0 == 3) {
                this.method1547(160, (byte) 84, var8, var7);
                this.method1547(2, (byte) 85, var8 - 1, var7);
                this.method1547(8, (byte) 73, var8, var7 - 1);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1547(65536, (byte) 73, var8, var7);
                this.method1547(4096, (byte) 109, var8, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1547(1024, (byte) 75, var8, var7);
                this.method1547(16384, (byte) 109, var8 + 1, var7);
            }
            if (arg0 == 2) {
                this.method1547(4096, (byte) 114, var8, var7);
                this.method1547(65536, (byte) 113, var8, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1547(16384, (byte) 116, var8, var7);
                this.method1547(1024, (byte) 97, var8 - 1, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1547(512, (byte) 101, var8, var7);
                this.method1547(8192, (byte) 123, var8 + 1, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1547(2048, (byte) 94, var8, var7);
                this.method1547(32768, (byte) 112, var8 + 1, var7 - -1);
            }
            if (arg0 == 2) {
                this.method1547(8192, (byte) 71, var8, var7);
                this.method1547(512, (byte) 75, var8 - 1, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1547(32768, (byte) 119, var8, var7);
                this.method1547(2048, (byte) 117, var8 - 1, var7 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1547(66560, (byte) 92, var8, var7);
            this.method1547(4096, (byte) 103, var8, var7 - 1);
            this.method1547(16384, (byte) 78, var8 + 1, var7);
        }
        if (arg0 == 1) {
            this.method1547(5120, (byte) 96, var8, var7);
            this.method1547(16384, (byte) 76, var8 + 1, var7);
            this.method1547(65536, (byte) 81, var8, var7 + 1);
        }
        if (arg0 == 2) {
            this.method1547(20480, (byte) 94, var8, var7);
            this.method1547(65536, (byte) 75, var8, var7 + 1);
            this.method1547(1024, (byte) 86, var8 - 1, var7);
        }
        if (arg0 == 3) {
            this.method1547(81920, (byte) 119, var8, var7);
            this.method1547(1024, (byte) 84, var8 - 1, var7);
            this.method1547(4096, (byte) 115, var8, var7 - 1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BZIIIII)V", line = 524)
    public final void method1552(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == 1 || arg3 == 3) {
            int var8 = arg6;
            arg6 = arg4;
            arg4 = var8;
        }
        int var9 = 256;
        int var10 = arg5 - this.field3765;
        if (arg1) {
            var9 += 131072;
        }
        int var11 = arg2 - this.field3747;
        field3744++;
        if (arg0 != 17) {
            return;
        }
        for (int var12 = var11; var12 < (var11 + arg6); var12++) {
            if (var12 >= 0 && this.field3738 > var12) {
                for (int var13 = var10; var13 < var10 + arg4; var13++) {
                    if (var13 >= 0 && var13 < this.field3758) {
                        this.method1561(var12, var9, var13, 29426);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBIIIII)Z", line = 573)
    public final boolean method1553(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != -119) {
            this.field3758 = -71;
        }
        field3745++;
        if (arg1 == 1) {
            if (arg5 == arg7 && arg4 == arg6) {
                return true;
            }
        } else if (arg7 <= arg5 && arg7 + arg1 - 1 >= arg5 && arg4 >= arg4 && arg4 <= arg4 + arg1 - 1) {
            return true;
        }
        int var9 = arg6 - this.field3765;
        int var10 = arg5 - this.field3747;
        int var11 = arg7 - this.field3747;
        int var12 = arg4 - this.field3765;
        if (arg1 == 1) {
            if (arg0 == 0) {
                if (arg3 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field3756[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field3756[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field3756[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field3756[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field3756[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field3756[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field3756[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field3756[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field3756[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field3756[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field3756[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field3756[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field3756[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field3756[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field3756[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field3756[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field3756[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field3756[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field3756[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field3756[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var11 - 1;
            int var14 = var9 + arg1 - 1;
            if (arg0 == 0) {
                if (arg3 == 0) {
                    if (var10 - arg1 == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9 && (this.field3756[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg1) == var9 && (this.field3756[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 <= var10 && var10 <= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 - arg1) == var11 && var12 >= var9 && var14 >= var12 && (this.field3756[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14 && (this.field3756[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 + 1 == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 + 1 == var9 && (this.field3756[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 - arg1) == var9 && (this.field3756[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 >= var11 && var10 <= var13 && var12 - arg1 == var9) {
                        return true;
                    }
                    if ((var10 - arg1) == var11 && var12 >= var9 && var12 <= var14 && (this.field3756[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var14 >= var12 && (this.field3756[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    if ((var10 - arg1) == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field3756[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 - arg1) == var9 && (this.field3756[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - arg1 == var11 && var9 <= var12 && var12 <= var14 && (this.field3756[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg1) == var9 && (this.field3756[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - arg1 == var11 && var9 <= var12 && var14 >= var12 && (this.field3756[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 + 1 == var9 && (this.field3756[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 - arg1 == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 - arg1) == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 + 1) == var9 && (this.field3756[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var14 >= var12 && (this.field3756[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 - arg1) == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9 && (this.field3756[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var13 >= var10 && (var12 - arg1) == var9 && (this.field3756[var10][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var10 - arg1) == var11 && var9 <= var12 && var14 >= var12 && (this.field3756[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14 && (this.field3756[var11][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZIII)V", line = 945)
    public final void method1554(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field3747;
        int var8 = arg5 - this.field3765;
        field3740++;
        int var9 = 256;
        if (arg2) {
            var9 += 131072;
        }
        int var10 = var7;
        if (arg1 != -1) {
            return;
        }
        while (arg4 + var7 > var10) {
            if (var10 >= 0 && var10 < this.field3738) {
                for (int var11 = var8; var11 < arg3 + var8; var11++) {
                    if (var11 >= 0 && this.field3758 > var11) {
                        this.method1547(var9, (byte) 124, var11, var10);
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I", line = 991)
    public static final int method1555(int arg0, int arg1) {
        if (arg1 >= -91) {
            return 8;
        } else {
            field3746++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIII)Z", line = 1002)
    public final boolean method1556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3749++;
        if (arg1 == 1) {
            if (arg2 == arg5 && arg0 == arg6) {
                return true;
            }
        } else if (arg2 <= arg5 && (arg2 + arg1 - 1) >= arg5 && arg0 >= arg0 && (arg0 - (1 - arg1)) >= arg0) {
            return true;
        }
        int var9 = arg0 - this.field3765;
        int var10 = arg5 - this.field3747;
        if (arg7 != -1) {
            field3751 = (int[]) null;
        }
        int var11 = arg6 - this.field3765;
        int var12 = arg2 - this.field3747;
        if (arg1 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3756[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field3756[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field3756[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field3756[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3756[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3756[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3756[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field3756[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field3756[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field3756[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var9 == var11 && (this.field3756[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field3756[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var12 - 1;
            int var14 = var11 + arg1 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var10 + 1 == var12 && var9 >= var11 && var9 <= var14 && (this.field3756[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 - arg1 == var11 && (this.field3756[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var10 - arg1) == var12 && var9 >= var11 && var9 <= var14 && (this.field3756[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 - arg1 == var11 && (this.field3756[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - arg1 == var12 && var9 >= var11 && var9 <= var14 && (this.field3756[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11 && (this.field3756[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 + 1 == var12 && var9 >= var11 && var14 >= var9 && (this.field3756[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var9 + 1) == var11 && (this.field3756[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 >= var12 && var13 >= var10 && var9 + 1 == var11 && (this.field3756[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var12 && var13 >= var10 && var9 - arg1 == var11 && (this.field3756[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg1) == var12 && var11 <= var9 && var9 <= var14 && (this.field3756[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 <= var9 && var9 <= var14 && (this.field3756[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)V", line = 1190)
    public final void method1557(int arg0, int arg1, int arg2) {
        field3741++;
        int var4 = arg2 - this.field3765;
        int var5 = arg0 - this.field3747;
        this.field3756[var5][var4] = class270.method1854(this.field3756[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIIIII)V", line = 1200)
    public final void method1558(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field3747;
        field3750++;
        int var8 = arg2 - this.field3765;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1561(var7, 128, var8, 29426);
                this.method1561(var7 - 1, 8, var8, 29426);
            }
            if (arg1 == 1) {
                this.method1561(var7, 2, var8, 29426);
                this.method1561(var7, 32, var8 + 1, arg4 + 29429);
            }
            if (arg1 == 2) {
                this.method1561(var7, 8, var8, 29426);
                this.method1561(var7 + 1, 128, var8, 29426);
            }
            if (arg1 == 3) {
                this.method1561(var7, 32, var8, 29426);
                this.method1561(var7, 2, var8 - 1, 29426);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1561(var7, 1, var8, 29426);
                this.method1561(var7 - 1, 16, var8 + 1, 29426);
            }
            if (arg1 == 1) {
                this.method1561(var7, 4, var8, 29426);
                this.method1561(var7 + 1, 64, var8 + 1, 29426);
            }
            if (arg1 == 2) {
                this.method1561(var7, 16, var8, arg4 ^ 0xFFFF8D0F);
                this.method1561(var7 + 1, 1, var8 - 1, 29426);
            }
            if (arg1 == 3) {
                this.method1561(var7, 64, var8, 29426);
                this.method1561(var7 - 1, 4, var8 - 1, 29426);
            }
        }
        if (~arg5 == arg4) {
            if (arg1 == 0) {
                this.method1561(var7, 130, var8, 29426);
                this.method1561(var7 - 1, 8, var8, arg4 + 29429);
                this.method1561(var7, 32, var8 + 1, 29426);
            }
            if (arg1 == 1) {
                this.method1561(var7, 10, var8, 29426);
                this.method1561(var7, 32, var8 + 1, 29426);
                this.method1561(var7 + 1, 128, var8, arg4 + 29429);
            }
            if (arg1 == 2) {
                this.method1561(var7, 40, var8, 29426);
                this.method1561(var7 + 1, 128, var8, 29426);
                this.method1561(var7, 2, var8 - 1, 29426);
            }
            if (arg1 == 3) {
                this.method1561(var7, 160, var8, arg4 ^ 0xFFFF8D0F);
                this.method1561(var7, 2, var8 - 1, arg4 + 29429);
                this.method1561(var7 - 1, 8, var8, 29426);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1561(var7, 65536, var8, 29426);
                this.method1561(var7 - 1, 4096, var8, 29426);
            }
            if (arg1 == 1) {
                this.method1561(var7, 1024, var8, 29426);
                this.method1561(var7, 16384, var8 + 1, arg4 + 29429);
            }
            if (arg1 == 2) {
                this.method1561(var7, 4096, var8, 29426);
                this.method1561(var7 + 1, 65536, var8, arg4 + 29429);
            }
            if (arg1 == 3) {
                this.method1561(var7, 16384, var8, 29426);
                this.method1561(var7, 1024, var8 - 1, arg4 + 29429);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1561(var7, 512, var8, 29426);
                this.method1561(var7 - 1, 8192, var8 + 1, 29426);
            }
            if (arg1 == 1) {
                this.method1561(var7, 2048, var8, 29426);
                this.method1561(var7 + 1, 32768, var8 + 1, 29426);
            }
            if (arg1 == 2) {
                this.method1561(var7, 8192, var8, 29426);
                this.method1561(var7 + 1, 512, var8 - 1, 29426);
            }
            if (arg1 == 3) {
                this.method1561(var7, 32768, var8, 29426);
                this.method1561(var7 - 1, 2048, var8 - 1, 29426);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1561(var7, 66560, var8, 29426);
            this.method1561(var7 - 1, 4096, var8, 29426);
            this.method1561(var7, 16384, var8 + 1, 29426);
        }
        if (arg1 == 1) {
            this.method1561(var7, 5120, var8, arg4 ^ 0xFFFF8D0F);
            this.method1561(var7, 16384, var8 + 1, arg4 + 29429);
            this.method1561(var7 + 1, 65536, var8, 29426);
        }
        if (arg1 == 2) {
            this.method1561(var7, 20480, var8, arg4 ^ 0xFFFF8D0F);
            this.method1561(var7 + 1, 65536, var8, 29426);
            this.method1561(var7, 1024, var8 - 1, 29426);
        }
        if (arg1 == 3) {
            this.method1561(var7, 81920, var8, 29426);
            this.method1561(var7, 1024, var8 - 1, 29426);
            this.method1561(var7 - 1, 4096, var8, 29426);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1405)
    private final boolean method1559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3755++;
        int var11 = arg2 + arg7;
        if (arg0 != 0) {
            this.method1551(-18, true, -76, (byte) -89, 75, 118);
        }
        int var12 = arg1 + arg3;
        int var13 = arg6 + arg9;
        int var14 = arg4 + arg5;
        if (arg3 <= arg2 && arg2 < var12) {
            if (arg4 == var13 && (arg8 & 0x4) == 0) {
                int var15 = arg2;
                int var16 = var12 < var11 ? var12 : var11;
                while (var16 > var15) {
                    if ((this.field3756[var15 - this.field3747][var13 - this.field3765 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg6 == var14 && (arg8 & 0x1) == 0) {
                int var17 = arg2;
                int var18 = var12 >= var11 ? var11 : var12;
                while (var17 < var18) {
                    if ((this.field3756[var17 - this.field3747][arg6 - this.field3765] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg3 && var11 <= var12) {
            if (arg4 == var13 && (arg8 & 0x4) == 0) {
                for (int var19 = arg3; var19 < var11; var19++) {
                    if ((this.field3756[var19 - this.field3747][var13 - this.field3765 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var14 && (arg8 & 0x1) == 0) {
                for (int var20 = arg3; var20 < var11; var20++) {
                    if ((this.field3756[var20 - this.field3747][arg6 - this.field3765] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg6 >= arg4 && arg6 < var14) {
            if (arg3 == var11 && (arg8 & 0x8) == 0) {
                int var21 = arg6;
                int var22 = var14 < var13 ? var14 : var13;
                while (var21 < var22) {
                    if ((this.field3756[var11 - (this.field3747 + 1)][var21 - this.field3765] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg2 == var12 && (arg8 & 0x2) == 0) {
                int var23 = arg6;
                int var24 = var13 <= var14 ? var13 : var14;
                while (var23 < var24) {
                    if ((this.field3756[arg2 - this.field3747][var23 - this.field3765] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg4 < var13 && var14 >= var13) {
            if (arg3 == var11 && (arg8 & 0x8) == 0) {
                for (int var25 = arg4; var25 < var13; var25++) {
                    if ((this.field3756[var11 - this.field3747 - 1][var25 - this.field3765] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var12 && (arg8 & 0x2) == 0) {
                for (int var26 = arg4; var26 < var13; var26++) {
                    if ((this.field3756[arg2 - this.field3747][var26 - this.field3765] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 1570)
    public final void method1560(int arg0) {
        int var2 = 0;
        if (arg0 > -3) {
            return;
        }
        while (var2 < this.field3738) {
            for (int var3 = 0; var3 < this.field3758; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field3738 - 5 || this.field3758 - 5 <= var3) {
                    this.field3756[var2][var3] = 16777215;
                } else {
                    this.field3756[var2][var3] = 16777216;
                }
            }
            var2++;
        }
        field3767++;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIII)V", line = 1600)
    private final void method1561(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 29426) {
            this.method1549(-14, -75, 80, 47, -100, -31, -31, 19, 60);
        }
        this.field3756[arg0][arg2] = class234.method1648(this.field3756[arg0][arg2], ~arg1);
        field3752++;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 1613)
    public static void method1562(int arg0) {
        field3751 = null;
        field3742 = null;
        if (arg0 == 0) {
            field3753 = null;
            field3757 = null;
            field3759 = null;
            field3768 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(II)V", line = 1645)
    public class218(int arg0, int arg1) {
        this.field3758 = arg1;
        this.field3765 = 0;
        this.field3738 = arg0;
        this.field3756 = new int[this.field3738][this.field3758];
        this.method1560(-20);
    }
}
