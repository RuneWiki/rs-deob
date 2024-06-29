import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 {

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    private int field617 = 0;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "[[I")
    public int[][] field611;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field599 = 0;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lje;")
    private static class67 field612 = class85.method592(255, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lje;")
    public static class67 field604 = class85.method592(255, "_");

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field618 = 0;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Lje;")
    private static class67 field610 = class85.method592(255, "Loaded sprites");

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field607 = 0;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "Lje;")
    private static class67 field621 = class85.method592(255, "Loading config )2 ");

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "Lje;")
    public static class67 field622 = field621;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Lje;")
    public static class67 field619 = field612;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lje;")
    public static class67 field602 = field610;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Lje;")
    public static class67 field626 = class85.method592(255, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field627 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIBZ)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field597++;
        int var7 = arg3 - this.field617;
        int var8 = arg1 - this.field615;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method215(128, var8, var7, 106);
                this.method215(8, var8, var7 - 1, -107);
            }
            if (arg2 == 1) {
                this.method215(2, var8, var7, 111);
                this.method215(32, var8 + 1, var7, 67);
            }
            if (arg2 == 2) {
                this.method215(8, var8, var7, 68);
                this.method215(128, var8, var7 + 1, 72);
            }
            if (arg2 == 3) {
                this.method215(32, var8, var7, -89);
                this.method215(2, var8 - 1, var7, 68);
            }
        }
        int var9 = 40 / ((arg4 - 29) / 45);
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method215(1, var8, var7, -44);
                this.method215(16, var8 + 1, var7 + -1, -91);
            }
            if (arg2 == 1) {
                this.method215(4, var8, var7, -74);
                this.method215(64, var8 + 1, var7 + 1, -52);
            }
            if (arg2 == 2) {
                this.method215(16, var8, var7, -91);
                this.method215(1, var8 - 1, var7 + 1, 94);
            }
            if (arg2 == 3) {
                this.method215(64, var8, var7, 76);
                this.method215(4, var8 - 1, var7 + -1, -113);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method215(130, var8, var7, -59);
                this.method215(8, var8, var7 - 1, 100);
                this.method215(32, var8 + 1, var7, 65);
            }
            if (arg2 == 1) {
                this.method215(10, var8, var7, -78);
                this.method215(32, var8 + 1, var7, 87);
                this.method215(128, var8, var7 + 1, 100);
            }
            if (arg2 == 2) {
                this.method215(40, var8, var7, 63);
                this.method215(128, var8, var7 + 1, -71);
                this.method215(2, var8 - 1, var7, -94);
            }
            if (arg2 == 3) {
                this.method215(160, var8, var7, -54);
                this.method215(2, var8 - 1, var7, -57);
                this.method215(8, var8, var7 - 1, 97);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method215(65536, var8, var7, -52);
                this.method215(4096, var8, var7 - 1, -104);
            }
            if (arg2 == 1) {
                this.method215(1024, var8, var7, 112);
                this.method215(16384, var8 + 1, var7, -85);
            }
            if (arg2 == 2) {
                this.method215(4096, var8, var7, 127);
                this.method215(65536, var8, var7 + 1, 111);
            }
            if (arg2 == 3) {
                this.method215(16384, var8, var7, -89);
                this.method215(1024, var8 - 1, var7, 85);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method215(512, var8, var7, 98);
                this.method215(8192, var8 + 1, var7 + -1, 98);
            }
            if (arg2 == 1) {
                this.method215(2048, var8, var7, 127);
                this.method215(32768, var8 + 1, var7 + 1, -122);
            }
            if (arg2 == 2) {
                this.method215(8192, var8, var7, 70);
                this.method215(512, var8 - 1, var7 - -1, 71);
            }
            if (arg2 == 3) {
                this.method215(32768, var8, var7, -103);
                this.method215(2048, var8 - 1, var7 + -1, -128);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method215(66560, var8, var7, -127);
            this.method215(4096, var8, var7 - 1, -59);
            this.method215(16384, var8 + 1, var7, -70);
        }
        if (arg2 == 1) {
            this.method215(5120, var8, var7, -50);
            this.method215(16384, var8 + 1, var7, 62);
            this.method215(65536, var8, var7 + 1, 101);
        }
        if (arg2 == 2) {
            this.method215(20480, var8, var7, 101);
            this.method215(65536, var8, var7 + 1, -52);
            this.method215(1024, var8 - 1, var7, 82);
        }
        if (arg2 == 3) {
            this.method215(81920, var8, var7, -104);
            this.method215(1024, var8 - 1, var7, -100);
            this.method215(4096, var8, var7 - 1, -111);
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method209(int arg0) {
        field626 = null;
        field612 = null;
        field604 = null;
        field610 = null;
        field602 = null;
        if (arg0 > -113) {
            method209(16);
        }
        field621 = null;
        field622 = null;
        field619 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIZ)V")
    public final void method210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg1 - this.field617;
        if (arg3 != -1) {
            field627 = -32;
        }
        field603++;
        if (arg2 == 1 || arg2 == 3) {
            int var9 = arg5;
            arg5 = arg0;
            arg0 = var9;
        }
        int var10 = arg4 - this.field615;
        int var11 = 256;
        if (arg6) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < arg5 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field613) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field600) {
                        this.method215(var11, var13, var12, 100);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
    public final void method211(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field617;
        field608++;
        int var5 = arg0 - this.field615;
        this.field611[var4][var5] = class82.method579(this.field611[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIIZII)V")
    public final void method212(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field601++;
        if (arg0 != -35) {
            this.method210(112, -59, 71, -70, -124, -66, false);
        }
        int var7 = 256;
        int var8 = arg5 - this.field615;
        int var9 = arg2 - this.field617;
        if (arg3) {
            var7 += 131072;
        }
        for (int var10 = var9; var10 < arg4 + var9; var10++) {
            if (var10 >= 0 && var10 < this.field613) {
                for (int var11 = var8; var11 < arg1 + var8; var11++) {
                    if (var11 >= 0 && this.field600 > var11) {
                        this.method220(var10, -95, var7, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
    public static int method213(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method214(byte arg0) {
        field620++;
        class79.field1705 = new class145(32);
        if (arg0 != -19) {
            method217(null, -32);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
    private final void method215(int arg0, int arg1, int arg2, int arg3) {
        this.field611[arg2][arg1] = method213(this.field611[arg2][arg1], ~arg0);
        field609++;
        int var5 = 125 / ((9 - arg3) / 53);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIBIII)Z")
    public final boolean method216(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field598++;
        if (arg1 == arg6 && arg0 == arg2) {
            return true;
        }
        int var8 = arg0 - this.field615;
        int var9 = arg6 - this.field617;
        int var10 = arg2 - this.field615;
        int var11 = arg1 - this.field617;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var9 + 1 == var11 && var8 == var10 && (this.field611[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field611[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var9 - 1 == var11 && var8 == var10 && (this.field611[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field611[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var9 - 1 == var11 && var8 == var10 && (this.field611[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field611[var11][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var9 + 1 == var11 && var8 == var10 && (this.field611[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field611[var11][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var9 == var11 && var10 + 1 == var8 && (this.field611[var11][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var10 - 1 == var8 && (this.field611[var11][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var11 && var8 == var10 && (this.field611[var11][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var11 && var8 == var10 && (this.field611[var11][var8] & 0x80) == 0) {
                return true;
            }
        }
        if (arg3 < 49) {
            this.method221(31, -103, 49);
        }
        return false;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lkc;I)Lje;")
    public static final class67 method217(class72 arg0, int arg1) {
        if (arg1 != -4) {
            method217(null, 2);
        }
        field624++;
        if (class121.method954(false, class140.method1063(arg0, (byte) -61)) == 0) {
            return null;
        } else if (arg0.field1569 == null || arg0.field1569.method459((byte) 52).method445(false) == 0) {
            return class81.field1794 ? class140.field3161 : null;
        } else {
            return arg0.field1569;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
    public final void method218(int arg0, int arg1, byte arg2) {
        field614++;
        int var4 = arg1 - this.field617;
        int var5 = arg0 - this.field615;
        int var6 = 93 % ((arg2 - 19) / 49);
        this.field611[var4][var5] = class82.method579(this.field611[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIIBIII)Z")
    public final boolean method219(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field623++;
        if (arg1 == arg5 && arg0 == arg4) {
            return true;
        }
        int var8 = arg0 - this.field615;
        int var9 = arg5 - this.field617;
        int var10 = arg1 - this.field617;
        if (arg3 != 117) {
            field602 = null;
        }
        int var11 = arg4 - this.field615;
        if (arg2 == 0) {
            if (arg6 == 0) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field611[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field611[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var10 && var8 == var11 && (this.field611[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field611[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field611[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field611[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var10 && var8 == var11 && (this.field611[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field611[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg6 == 0) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field611[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field611[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field611[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field611[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field611[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field611[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field611[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field611[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var9 == var10 && var8 + 1 == var11 && (this.field611[var10][var11] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var8 - 1 == var11 && (this.field611[var10][var11] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var10 && var8 == var11 && (this.field611[var10][var11] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var10 && var8 == var11 && (this.field611[var10][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIII)V")
    private final void method220(int arg0, int arg1, int arg2, int arg3) {
        this.field611[arg0][arg3] = class82.method579(this.field611[arg0][arg3], arg2);
        field625++;
        if (arg1 > -52) {
            this.field613 = 26;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
    public final void method221(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field617;
        int var5 = arg1 - this.field615;
        field628++;
        this.field611[var4][var5] = method213(this.field611[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIZ)Z")
    public final boolean method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (!arg7) {
            return true;
        }
        int var9 = arg4 + arg1 - 1;
        field606++;
        int var10 = arg3 + arg5 - 1;
        if (arg0 >= arg4 && arg0 <= var9 && arg5 <= arg6 && var10 >= arg6) {
            return true;
        } else if (arg4 - 1 == arg0 && arg6 >= arg5 && arg6 <= var10 && (this.field611[arg0 - this.field617][arg6 - this.field615] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg0 && arg5 <= arg6 && arg6 <= var10 && (this.field611[arg0 - this.field617][arg6 - this.field615] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg6 && arg0 >= arg4 && arg0 <= var9 && (this.field611[arg0 - this.field617][arg6 - this.field615] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg6 && arg0 >= arg4 && var9 >= arg0 && (this.field611[arg0 - this.field617][arg6 - this.field615] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public final void method223(int arg0) {
        if (arg0 != 24495) {
            field622 = null;
        }
        field605++;
        for (int var2 = 0; var2 < this.field613; var2++) {
            for (int var3 = 0; var3 < this.field600; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field613 - 5 || var3 >= this.field600 - 5) {
                    this.field611[var2][var3] = 16777215;
                } else {
                    this.field611[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZIII)V")
    public final void method224(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field596++;
        int var7 = arg3 - this.field617;
        int var8 = arg0 - this.field615;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method220(var7, -102, 128, var8);
                this.method220(var7 - 1, -110, 8, var8);
            }
            if (arg1 == 1) {
                this.method220(var7, -111, 2, var8);
                this.method220(var7, -58, 32, var8 + 1);
            }
            if (arg1 == 2) {
                this.method220(var7, -100, 8, var8);
                this.method220(var7 + 1, -61, 128, var8);
            }
            if (arg1 == 3) {
                this.method220(var7, -56, 32, var8);
                this.method220(var7, -73, 2, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method220(var7, -59, 1, var8);
                this.method220(var7 - 1, -96, 16, var8 + 1);
            }
            if (arg1 == 1) {
                this.method220(var7, -112, 4, var8);
                this.method220(var7 + 1, -102, 64, var8 + 1);
            }
            if (arg1 == 2) {
                this.method220(var7, -103, 16, var8);
                this.method220(var7 + 1, -68, 1, var8 - 1);
            }
            if (arg1 == 3) {
                this.method220(var7, -71, 64, var8);
                this.method220(var7 - 1, -76, 4, var8 - 1);
            }
        }
        int var9 = -39 / ((15 - arg4) / 57);
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method220(var7, -72, 130, var8);
                this.method220(var7 - 1, -76, 8, var8);
                this.method220(var7, -97, 32, var8 + 1);
            }
            if (arg1 == 1) {
                this.method220(var7, -96, 10, var8);
                this.method220(var7, -78, 32, var8 + 1);
                this.method220(var7 + 1, -62, 128, var8);
            }
            if (arg1 == 2) {
                this.method220(var7, -84, 40, var8);
                this.method220(var7 + 1, -73, 128, var8);
                this.method220(var7, -119, 2, var8 - 1);
            }
            if (arg1 == 3) {
                this.method220(var7, -114, 160, var8);
                this.method220(var7, -57, 2, var8 - 1);
                this.method220(var7 - 1, -101, 8, var8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method220(var7, -64, 65536, var8);
                this.method220(var7 - 1, -76, 4096, var8);
            }
            if (arg1 == 1) {
                this.method220(var7, -106, 1024, var8);
                this.method220(var7, -109, 16384, var8 + 1);
            }
            if (arg1 == 2) {
                this.method220(var7, -85, 4096, var8);
                this.method220(var7 + 1, -66, 65536, var8);
            }
            if (arg1 == 3) {
                this.method220(var7, -82, 16384, var8);
                this.method220(var7, -68, 1024, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method220(var7, -94, 512, var8);
                this.method220(var7 - 1, -106, 8192, var8 + 1);
            }
            if (arg1 == 1) {
                this.method220(var7, -63, 2048, var8);
                this.method220(var7 + 1, -54, 32768, var8 + 1);
            }
            if (arg1 == 2) {
                this.method220(var7, -99, 8192, var8);
                this.method220(var7 + 1, -85, 512, var8 - 1);
            }
            if (arg1 == 3) {
                this.method220(var7, -124, 32768, var8);
                this.method220(var7 - 1, -67, 2048, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method220(var7, -116, 66560, var8);
            this.method220(var7 - 1, -88, 4096, var8);
            this.method220(var7, -55, 16384, var8 + 1);
        }
        if (arg1 == 1) {
            this.method220(var7, -91, 5120, var8);
            this.method220(var7, -96, 16384, var8 + 1);
            this.method220(var7 + 1, -75, 65536, var8);
        }
        if (arg1 == 2) {
            this.method220(var7, -125, 20480, var8);
            this.method220(var7 + 1, -53, 65536, var8);
            this.method220(var7, -99, 1024, var8 - 1);
        }
        if (arg1 == 3) {
            this.method220(var7, -95, 81920, var8);
            this.method220(var7, -94, 1024, var8 - 1);
            this.method220(var7 - 1, -109, 4096, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(II)V")
    public class34(int arg0, int arg1) {
        this.field613 = arg0;
        this.field615 = 0;
        this.field600 = arg1;
        this.field611 = new int[this.field613][this.field600];
        this.method223(24495);
    }
}
