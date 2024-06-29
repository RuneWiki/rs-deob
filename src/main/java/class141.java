import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class141 {

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "Lqp;")
    public static class466 field2008 = new class466("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "Luc;")
    public static class23 field2016 = new class23(14, 1);

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "Luc;")
    public static class23 field2017 = new class23(15, 4);

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "Luc;")
    public static class23 field2018 = new class23(16, -2);

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "Luc;")
    public static class23 field2019 = new class23(17, 0);

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "Luc;")
    public static class23 field2020 = new class23(18, -2);

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "Luc;")
    public static class23 field2021 = new class23(20, 6);

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "Luc;")
    public static class23 field2022 = new class23(21, 8);

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "Luc;")
    public static class23 field2023 = new class23(22, -2);

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "Luc;")
    public static class23 field2024 = new class23(23, 4);

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "Luc;")
    public static class23 field2025 = new class23(24, -1);

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "[Luc;")
    private static class23[] field2026 = new class23[32];

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "Lqp;")
    public static class466 field2027;

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "Ldi;")
    public static class83 field2028;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "F")
    public static float field2015;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "Lmr;")
    public static class96 field2029;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "[[I")
    public int[][] field2013;

    static {
        class23[] var0 = class128.method885(93);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2026[var0[var1].field311] = var0[var1];
        }
        field2027 = new class466("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
        field2028 = new class83(40, 3);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V", line = 7)
    public static void method941(boolean arg0) {
        field2017 = null;
        if (arg0) {
            return;
        }
        field2024 = null;
        field2027 = null;
        field2026 = null;
        field2028 = null;
        field2021 = null;
        field2019 = null;
        field2018 = null;
        field2020 = null;
        field2016 = null;
        field2023 = null;
        field2029 = null;
        field2022 = null;
        field2008 = null;
        field2025 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)V", line = 36)
    public static final void method942(byte arg0, int arg1) {
        field2001++;
        if (arg0 < 81) {
            method941(false);
        }
        class97 var2 = class348.method2064(arg1, 8, -102);
        var2.method710(-9237);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIII)Z", line = 50)
    public final boolean method943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -1) {
            this.method954(22, 51, 22);
        }
        field2002++;
        if (arg5 == 1) {
            if (arg1 == arg2 && arg4 == arg6) {
                return true;
            }
        } else if (arg1 <= arg2 && (arg1 + arg5 - 1) >= arg2 && arg4 <= arg4 && arg4 <= (arg5 + arg4 - 1)) {
            return true;
        }
        int var9 = arg2 - this.field1992;
        int var10 = arg1 - this.field1992;
        int var11 = arg4 - this.field1994;
        int var12 = arg6 - this.field1994;
        if (arg5 == 1) {
            if (arg7 == 0) {
                if (arg3 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field2013[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field2013[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var10 && (var11 + 1) == var12) {
                        return true;
                    }
                    if (var9 - 1 == var10 && var11 == var12 && (this.field2013[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field2013[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field2013[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field2013[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var10 && (var11 - 1) == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field2013[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field2013[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg3 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field2013[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field2013[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field2013[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field2013[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field2013[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field2013[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field2013[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field2013[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 == var10 && var11 + 1 == var12 && (this.field2013[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var11 - 1) == var12 && (this.field2013[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var10 && var11 == var12 && (this.field2013[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var11 == var12 && (this.field2013[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg5 - 1;
            int var14 = arg5 + var12 - 1;
            if (arg7 == 0) {
                if (arg3 == 0) {
                    if ((var9 - arg5) == var10 && var11 >= var12 && var11 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var11 + 1 == var12 && (this.field2013[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var11 - arg5) == var12 && (this.field2013[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 >= var10 && var9 <= var13 && var11 + 1 == var12) {
                        return true;
                    }
                    if (var9 - arg5 == var10 && var11 >= var12 && var14 >= var11 && (this.field2013[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 <= var11 && var14 >= var11 && (this.field2013[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 + 1) == var10 && var11 >= var12 && var11 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var11 + 1 == var12 && (this.field2013[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var11 - arg5) == var12 && (this.field2013[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 <= var9 && var9 <= var13 && var11 - arg5 == var12) {
                        return true;
                    }
                    if (var9 - arg5 == var10 && var12 <= var11 && var11 <= var14 && (this.field2013[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 >= var12 && var14 >= var11 && (this.field2013[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg3 == 0) {
                    if (var9 - arg5 == var10 && var11 >= var12 && var14 >= var11) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 >= var12 && var11 <= var14 && (this.field2013[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var11 - arg5) == var12 && (this.field2013[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - arg5) == var10 && var12 <= var11 && var11 <= var14 && (this.field2013[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var11 + 1 == var12) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 >= var12 && var11 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var11 - arg5) == var12 && (this.field2013[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - arg5 == var10 && var12 <= var11 && var11 <= var14 && (this.field2013[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var11 + 1) == var12 && (this.field2013[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 >= var12 && var11 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var11 - arg5 == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 - arg5 == var10 && var11 >= var12 && var11 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var11 + 1) == var12 && (this.field2013[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 <= var11 && var14 >= var11 && (this.field2013[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var11 - arg5 == var12) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 >= var10 && var9 <= var13 && (var11 + 1) == var12 && (this.field2013[var9][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 >= var10 && var9 <= var13 && (var11 - arg5) == var12 && (this.field2013[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg5 == var10 && var12 <= var11 && var14 >= var11 && (this.field2013[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var12 <= var11 && var11 <= var14 && (this.field2013[var10][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIIIIIII)Z", line = 424)
    public final boolean method944(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1996++;
        if (arg2 == 1) {
            if (arg0 == arg4 && arg5 == arg6) {
                return true;
            }
        } else if (arg0 >= arg4 && arg0 <= (arg4 + arg2 - 1) && arg5 >= arg5 && arg5 <= (arg5 + arg2 - 1)) {
            return true;
        }
        int var9 = arg4 - this.field1992;
        int var10 = arg6 - this.field1994;
        int var11 = arg0 - this.field1992;
        if (arg3 != -1) {
            this.method947(-1, true, 28, -123, 55, false, 30);
        }
        int var12 = arg5 - this.field1994;
        if (arg2 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field2013[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2013[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2013[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2013[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2013[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2013[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2013[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field2013[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field2013[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field2013[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field2013[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field2013[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var9 - 1;
            int var14 = arg2 + var10 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field2013[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 - arg2) == var10 && (this.field2013[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var11 - arg2) == var9 && var10 <= var12 && var14 >= var12 && (this.field2013[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 - arg2 == var10 && (this.field2013[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 - arg2) == var9 && var10 <= var12 && var12 <= var14 && (this.field2013[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field2013[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 + 1 == var9 && var10 <= var12 && var12 <= var14 && (this.field2013[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10 && (this.field2013[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var11 >= var9 && var13 >= var11 && var12 + 1 == var10 && (this.field2013[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var13 >= var11 && var12 - arg2 == var10 && (this.field2013[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg2) == var9 && var12 >= var10 && var12 <= var14 && (this.field2013[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field2013[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V", line = 614)
    public final void method945(byte arg0) {
        if (arg0 != 66) {
            this.method946(true, -117, 49, -20, 22, 116, false);
        }
        field2004++;
        for (int var2 = 0; var2 < this.field1997; var2++) {
            for (int var3 = 0; var3 < this.field1998; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field1997 - 5) <= var2 || var3 >= this.field1998 - 5) {
                    this.field2013[var2][var3] = -1;
                } else {
                    this.field2013[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZIIIIIZ)V", line = 646)
    public final void method946(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2014++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg6) {
            var8 |= 0x40000000;
        }
        int var9 = arg3 - this.field1994;
        int var10 = arg2 - this.field1992;
        if (arg1 != 8868) {
            return;
        }
        for (int var11 = var10; var11 < var10 + arg5; var11++) {
            if (var11 >= 0 && var11 < this.field1997) {
                for (int var12 = var9; var12 < (arg4 + var9); var12++) {
                    if (var12 >= 0 && this.field1998 > var12) {
                        this.method955(var12, var11, var8, -83);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZIIIZI)V", line = 702)
    public final void method947(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg6 - this.field1992;
        field2005++;
        int var9 = arg4 - this.field1994;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method955(var9, var8, 128, -113);
                this.method955(var9, var8 - 1, 8, arg3 ^ 0x6B4D);
            }
            if (arg2 == 1) {
                this.method955(var9, var8, 2, arg3 ^ 0x6B67);
                this.method955(var9 + 1, var8, 32, -52);
            }
            if (arg2 == 2) {
                this.method955(var9, var8, 8, -48);
                this.method955(var9, var8 + 1, 128, -120);
            }
            if (arg2 == 3) {
                this.method955(var9, var8, 32, -30);
                this.method955(var9 - 1, var8, 2, -35);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method955(var9, var8, 1, -126);
                this.method955(var9 + 1, var8 + -1, 16, -34);
            }
            if (arg2 == 1) {
                this.method955(var9, var8, 4, -84);
                this.method955(var9 + 1, var8 + 1, 64, -47);
            }
            if (arg2 == 2) {
                this.method955(var9, var8, 16, -124);
                this.method955(var9 - 1, var8 - -1, 1, -62);
            }
            if (arg2 == 3) {
                this.method955(var9, var8, 64, -34);
                this.method955(var9 - 1, var8 + -1, 4, arg3 ^ 0x6B40);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method955(var9, var8, 130, -122);
                this.method955(var9, var8 - 1, 8, -57);
                this.method955(var9 + 1, var8, 32, -69);
            }
            if (arg2 == 1) {
                this.method955(var9, var8, 10, -34);
                this.method955(var9 + 1, var8, 32, -32);
                this.method955(var9, var8 + 1, 128, arg3 ^ 0x6B34);
            }
            if (arg2 == 2) {
                this.method955(var9, var8, 40, arg3 ^ 0x6B64);
                this.method955(var9, var8 + 1, 128, -62);
                this.method955(var9 - 1, var8, 2, arg3 ^ 0x6B57);
            }
            if (arg2 == 3) {
                this.method955(var9, var8, 160, -115);
                this.method955(var9 - 1, var8, 2, -56);
                this.method955(var9, var8 - 1, 8, -71);
            }
        }
        if (arg3 != -27419) {
            this.method945((byte) 71);
        }
        if (arg1) {
            if (arg0 == 0) {
                if (arg2 == 0) {
                    this.method955(var9, var8, 65536, -40);
                    this.method955(var9, var8 - 1, 4096, -82);
                }
                if (arg2 == 1) {
                    this.method955(var9, var8, 1024, -66);
                    this.method955(var9 + 1, var8, 16384, -103);
                }
                if (arg2 == 2) {
                    this.method955(var9, var8, 4096, -33);
                    this.method955(var9, var8 + 1, 65536, -54);
                }
                if (arg2 == 3) {
                    this.method955(var9, var8, 16384, -33);
                    this.method955(var9 - 1, var8, 1024, -60);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg2 == 0) {
                    this.method955(var9, var8, 512, -108);
                    this.method955(var9 + 1, var8 - 1, 8192, arg3 ^ 0x6B78);
                }
                if (arg2 == 1) {
                    this.method955(var9, var8, 2048, -60);
                    this.method955(var9 + 1, var8 + 1, 32768, -80);
                }
                if (arg2 == 2) {
                    this.method955(var9, var8, 8192, arg3 ^ 0x6B51);
                    this.method955(var9 - 1, var8 + 1, 512, -107);
                }
                if (arg2 == 3) {
                    this.method955(var9, var8, 32768, -31);
                    this.method955(var9 - 1, var8 + -1, 2048, -74);
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    this.method955(var9, var8, 66560, -94);
                    this.method955(var9, var8 - 1, 4096, arg3 ^ 0x6B6E);
                    this.method955(var9 + 1, var8, 16384, arg3 + 27309);
                }
                if (arg2 == 1) {
                    this.method955(var9, var8, 5120, -97);
                    this.method955(var9 + 1, var8, 16384, -115);
                    this.method955(var9, var8 + 1, 65536, -47);
                }
                if (arg2 == 2) {
                    this.method955(var9, var8, 20480, -63);
                    this.method955(var9, var8 + 1, 65536, arg3 + 27371);
                    this.method955(var9 - 1, var8, 1024, -30);
                }
                if (arg2 == 3) {
                    this.method955(var9, var8, 81920, -107);
                    this.method955(var9 - 1, var8, 1024, -98);
                    this.method955(var9, var8 - 1, 4096, -32);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method955(var9, var8, 536870912, -101);
                this.method955(var9, var8 - 1, 33554432, arg3 + 27366);
            }
            if (arg2 == 1) {
                this.method955(var9, var8, 8388608, -70);
                this.method955(var9 + 1, var8, 134217728, -105);
            }
            if (arg2 == 2) {
                this.method955(var9, var8, 33554432, -123);
                this.method955(var9, var8 + 1, 536870912, -102);
            }
            if (arg2 == 3) {
                this.method955(var9, var8, 134217728, -27);
                this.method955(var9 - 1, var8, 8388608, arg3 + 27291);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method955(var9, var8, 4194304, -91);
                this.method955(var9 + 1, var8 + -1, 67108864, -108);
            }
            if (arg2 == 1) {
                this.method955(var9, var8, 16777216, -110);
                this.method955(var9 + 1, var8 - -1, 268435456, -98);
            }
            if (arg2 == 2) {
                this.method955(var9, var8, 67108864, -79);
                this.method955(var9 - 1, var8 - -1, 4194304, -92);
            }
            if (arg2 == 3) {
                this.method955(var9, var8, 268435456, -52);
                this.method955(var9 - 1, var8 + -1, 16777216, arg3 + 27321);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method955(var9, var8, 545259520, -28);
            this.method955(var9, var8 - 1, 33554432, -108);
            this.method955(var9 + 1, var8, 134217728, -103);
        }
        if (arg2 == 1) {
            this.method955(var9, var8, 41943040, arg3 + 27371);
            this.method955(var9 + 1, var8, 134217728, -121);
            this.method955(var9, var8 + 1, 536870912, -77);
        }
        if (arg2 == 2) {
            this.method955(var9, var8, 167772160, -75);
            this.method955(var9, var8 + 1, 536870912, -30);
            this.method955(var9 - 1, var8, 8388608, -57);
        }
        if (arg2 == 3) {
            this.method955(var9, var8, 671088640, -108);
            this.method955(var9 - 1, var8, 8388608, -98);
            this.method955(var9, var8 - 1, 33554432, arg3 ^ 0x6B2F);
            return;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V", line = 1007)
    public final void method948(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1992;
        int var5 = arg1 - this.field1994;
        field2003++;
        this.field2013[var4][var5] = class251.method1501(this.field2013[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)V", line = 1023)
    public final void method949(int arg0, int arg1, int arg2) {
        int var4 = 98 / ((arg2 + 35) / 50);
        int var5 = arg0 - this.field1994;
        int var6 = arg1 - this.field1992;
        field1999++;
        this.field2013[var6][var5] = class255.method1532(this.field2013[var6][var5], 262144);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZIIIIZ)V", line = 1035)
    public final void method950(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2010++;
        int var8 = arg0 - this.field1992;
        int var9 = arg4 - this.field1994;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method957((byte) -80, var8, var9, 128);
                this.method957((byte) -74, var8 - 1, var9, 8);
            }
            if (arg2 == 1) {
                this.method957((byte) -116, var8, var9, 2);
                this.method957((byte) -94, var8, var9 + 1, 32);
            }
            if (arg2 == 2) {
                this.method957((byte) -91, var8, var9, 8);
                this.method957((byte) -87, var8 + 1, var9, 128);
            }
            if (arg2 == 3) {
                this.method957((byte) -96, var8, var9, 32);
                this.method957((byte) -74, var8, var9 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method957((byte) -89, var8, var9, 1);
                this.method957((byte) -90, var8 - 1, var9 + 1, 16);
            }
            if (arg2 == 1) {
                this.method957((byte) -105, var8, var9, 4);
                this.method957((byte) -96, var8 + 1, var9 + 1, 64);
            }
            if (arg2 == 2) {
                this.method957((byte) -109, var8, var9, 16);
                this.method957((byte) -105, var8 + 1, var9 + -1, 1);
            }
            if (arg2 == 3) {
                this.method957((byte) -80, var8, var9, 64);
                this.method957((byte) -86, var8 - 1, var9 - 1, 4);
            }
        }
        if (arg5 != -27120) {
            method956(-53, 61, null, 121);
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method957((byte) -103, var8, var9, 130);
                this.method957((byte) -91, var8 - 1, var9, 8);
                this.method957((byte) -61, var8, var9 + 1, 32);
            }
            if (arg2 == 1) {
                this.method957((byte) -82, var8, var9, 10);
                this.method957((byte) -83, var8, var9 + 1, 32);
                this.method957((byte) -61, var8 + 1, var9, 128);
            }
            if (arg2 == 2) {
                this.method957((byte) -113, var8, var9, 40);
                this.method957((byte) -109, var8 + 1, var9, 128);
                this.method957((byte) -95, var8, var9 - 1, 2);
            }
            if (arg2 == 3) {
                this.method957((byte) -74, var8, var9, 160);
                this.method957((byte) -97, var8, var9 - 1, 2);
                this.method957((byte) -61, var8 - 1, var9, 8);
            }
        }
        if (arg1) {
            if (arg3 == 0) {
                if (arg2 == 0) {
                    this.method957((byte) -115, var8, var9, 65536);
                    this.method957((byte) -91, var8 - 1, var9, 4096);
                }
                if (arg2 == 1) {
                    this.method957((byte) -127, var8, var9, 1024);
                    this.method957((byte) -120, var8, var9 + 1, 16384);
                }
                if (arg2 == 2) {
                    this.method957((byte) -100, var8, var9, 4096);
                    this.method957((byte) -72, var8 + 1, var9, 65536);
                }
                if (arg2 == 3) {
                    this.method957((byte) -101, var8, var9, 16384);
                    this.method957((byte) -73, var8, var9 - 1, 1024);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg2 == 0) {
                    this.method957((byte) -87, var8, var9, 512);
                    this.method957((byte) -64, var8 - 1, var9 + 1, 8192);
                }
                if (arg2 == 1) {
                    this.method957((byte) -78, var8, var9, 2048);
                    this.method957((byte) -96, var8 + 1, var9 + 1, 32768);
                }
                if (arg2 == 2) {
                    this.method957((byte) -61, var8, var9, 8192);
                    this.method957((byte) -122, var8 + 1, var9 + -1, 512);
                }
                if (arg2 == 3) {
                    this.method957((byte) -104, var8, var9, 32768);
                    this.method957((byte) -112, var8 - 1, var9 - 1, 2048);
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    this.method957((byte) -96, var8, var9, 66560);
                    this.method957((byte) -92, var8 - 1, var9, 4096);
                    this.method957((byte) -128, var8, var9 + 1, 16384);
                }
                if (arg2 == 1) {
                    this.method957((byte) -81, var8, var9, 5120);
                    this.method957((byte) -69, var8, var9 + 1, 16384);
                    this.method957((byte) -82, var8 + 1, var9, 65536);
                }
                if (arg2 == 2) {
                    this.method957((byte) -82, var8, var9, 20480);
                    this.method957((byte) -100, var8 + 1, var9, 65536);
                    this.method957((byte) -98, var8, var9 - 1, 1024);
                }
                if (arg2 == 3) {
                    this.method957((byte) -64, var8, var9, 81920);
                    this.method957((byte) -111, var8, var9 - 1, 1024);
                    this.method957((byte) -81, var8 - 1, var9, 4096);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method957((byte) -87, var8, var9, 536870912);
                this.method957((byte) -74, var8 - 1, var9, 33554432);
            }
            if (arg2 == 1) {
                this.method957((byte) -93, var8, var9, 8388608);
                this.method957((byte) -106, var8, var9 + 1, 134217728);
            }
            if (arg2 == 2) {
                this.method957((byte) -113, var8, var9, 33554432);
                this.method957((byte) -99, var8 + 1, var9, 536870912);
            }
            if (arg2 == 3) {
                this.method957((byte) -118, var8, var9, 134217728);
                this.method957((byte) -107, var8, var9 - 1, 8388608);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method957((byte) -85, var8, var9, 4194304);
                this.method957((byte) -108, var8 - 1, var9 + 1, 67108864);
            }
            if (arg2 == 1) {
                this.method957((byte) -104, var8, var9, 16777216);
                this.method957((byte) -88, var8 + 1, var9 + 1, 268435456);
            }
            if (arg2 == 2) {
                this.method957((byte) -122, var8, var9, 67108864);
                this.method957((byte) -66, var8 + 1, var9 + -1, 4194304);
            }
            if (arg2 == 3) {
                this.method957((byte) -96, var8, var9, 268435456);
                this.method957((byte) -85, var8 - 1, var9 - 1, 16777216);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method957((byte) -112, var8, var9, 545259520);
            this.method957((byte) -122, var8 - 1, var9, 33554432);
            this.method957((byte) -76, var8, var9 + 1, 134217728);
        }
        if (arg2 == 1) {
            this.method957((byte) -65, var8, var9, 41943040);
            this.method957((byte) -82, var8, var9 + 1, 134217728);
            this.method957((byte) -77, var8 + 1, var9, 536870912);
        }
        if (arg2 == 2) {
            this.method957((byte) -114, var8, var9, 167772160);
            this.method957((byte) -120, var8 + 1, var9, 536870912);
            this.method957((byte) -103, var8, var9 - 1, 8388608);
        }
        if (arg2 == 3) {
            this.method957((byte) -72, var8, var9, 671088640);
            this.method957((byte) -126, var8, var9 - 1, 8388608);
            this.method957((byte) -114, var8 - 1, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIZIIIII)Z", line = 1344)
    public final boolean method951(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1993++;
        if (arg6 > 1) {
            return class346.method2049(arg6, arg8, arg7, arg5, arg1, arg2, arg4, -4, arg6) ? true : this.method953(arg8, arg5, arg1, arg6, arg7, arg0, !arg3, arg6, arg2, arg4);
        }
        if (!arg3) {
            field2027 = null;
        }
        int var10 = arg4 + arg8 - 1;
        int var11 = arg1 + arg7 - 1;
        if (arg2 >= arg4 && arg2 <= var10 && arg1 <= arg5 && arg5 <= var11) {
            return true;
        } else if (arg4 - 1 == arg2 && arg5 >= arg1 && var11 >= arg5 && (this.field2013[arg2 - this.field1992][arg5 - this.field1994] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg2 && arg5 >= arg1 && arg5 <= var11 && (this.field2013[arg2 - this.field1992][arg5 - this.field1994] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg5 && arg2 >= arg4 && var10 >= arg2 && (this.field2013[arg2 - this.field1992][arg5 - this.field1994] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg5 && arg2 >= arg4 && arg2 <= var10 && (this.field2013[arg2 - this.field1992][arg5 - this.field1994] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(III)V", line = 1393)
    public final void method952(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1992;
        if (arg0 <= 11) {
            this.method948(69, 97, -45);
        }
        int var5 = arg1 - this.field1994;
        field2006++;
        this.field2013[var4][var5] = class255.method1532(this.field2013[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIZIII)Z", line = 1407)
    public final boolean method953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field2011++;
        if (arg6) {
            return false;
        }
        int var11 = arg3 + arg8;
        int var12 = arg1 + arg7;
        int var13 = arg0 + arg9;
        int var14 = arg2 + arg4;
        if (arg8 == var13 && (arg5 & 0x2) == 0) {
            int var15 = arg1 > arg2 ? arg1 : arg2;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field2013[var13 - this.field1992 - 1][var15 - this.field1994] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg9 == var11 && (arg5 & 0x8) == 0) {
            int var17 = arg1 <= arg2 ? arg2 : arg1;
            int var18 = var12 < var14 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field2013[arg9 - this.field1992][var17 - this.field1994] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg1 == var14 && (arg5 & 0x1) == 0) {
            int var19 = arg9 < arg8 ? arg8 : arg9;
            int var20 = var11 < var13 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field2013[var19 - this.field1992][var14 - this.field1994 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg2 == var12 && (arg5 & 0x4) == 0) {
            int var21 = arg8 > arg9 ? arg8 : arg9;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field2013[var21 - this.field1992][arg2 - this.field1994] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(III)V", line = 1507)
    public final void method954(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1994;
        field2000++;
        int var5 = arg1 - this.field1992;
        this.field2013[var5][var4] = class251.method1501(this.field2013[var5][var4], arg0);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIII)V", line = 1517)
    private final void method955(int arg0, int arg1, int arg2, int arg3) {
        field2012++;
        this.field2013[arg1][arg0] = class255.method1532(this.field2013[arg1][arg0], arg2);
        if (arg3 >= -24) {
            field2018 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[BI)[B", line = 1529)
    public static final byte[] method956(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 == -1) {
            field2009++;
            byte[] var4 = new byte[arg3];
            class91.method678(arg2, arg1, var4, 0, arg3);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BIII)V", line = 1543)
    private final void method957(byte arg0, int arg1, int arg2, int arg3) {
        field1995++;
        this.field2013[arg1][arg2] = class251.method1501(this.field2013[arg1][arg2], ~arg3);
        if (arg0 >= -59) {
            field2016 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZIIIIZ)V", line = 1554)
    public final void method958(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field2007++;
        int var9 = 256;
        if (arg2) {
            var9 |= 0x20000;
        }
        int var10 = arg3 - this.field1992;
        int var11 = arg6 - this.field1994;
        if (arg1 != -1) {
            field2028 = null;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg4;
            arg4 = arg0;
            arg0 = var12;
        }
        if (arg7) {
            var9 |= 0x40000000;
        }
        for (int var13 = var10; var13 < (arg4 + var10); var13++) {
            if (var13 >= 0 && this.field1997 > var13) {
                for (int var14 = var11; var14 < (var11 + arg0); var14++) {
                    if (var14 >= 0 && this.field1998 > var14) {
                        this.method957((byte) -86, var13, var14, var9);
                    }
                }
            }
        }
    }
}
