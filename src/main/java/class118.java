import java.awt.event.KeyEvent;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class118 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    private int field2097 = 0;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    private int field2118;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    private int field2100;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    private int field2092;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[[I")
    public int[][] field2094;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lda;")
    private static class275 field2095 = class255.method1672(125, "green:");

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lda;")
    public static class275 field2093 = class255.method1672(123, "<br>");

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lda;")
    public static class275 field2096 = field2095;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Lda;")
    public static class275 field2104 = field2095;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "[[[Lrg;")
    public static class84[][][] field2122 = new class84[4][104][104];

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Lda;")
    public static class275 field2109 = class255.method1672(124, "<)4col>");

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2114 = Calendar.getInstance();

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "Loa;")
    public static class276 field2125 = new class276(32);

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "Lda;")
    public static class275 field2126 = class255.method1672(126, "0");

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lma;")
    public static class105 field2101;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2111++;
        if (arg2 < arg3 + arg7 && arg7 < (arg0 + arg2)) {
            if (arg5 != 4096) {
                method861(-19);
            }
            return (arg1 + arg6) > arg8 && arg1 < (arg4 + arg8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static final void method855(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var1 = -1; var1 < class32.field486; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class149.field2595[var1];
            }
            class109 var3 = class16.field238[var2];
            if (var3 != null) {
                class87.method622(var3, 0, var3.method750((byte) -107));
            }
        }
        field2106++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BIIIIIII)Z")
    public final boolean method856(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2121++;
        if (arg5 == 1) {
            if (arg2 == arg6 && arg3 == arg7) {
                return true;
            }
        } else if (arg6 <= arg2 && arg6 + arg5 - 1 >= arg2 && arg3 >= arg3 && (arg3 + arg5 - 1) >= arg3) {
            return true;
        }
        if (arg0 != 121) {
            field2093 = null;
        }
        int var9 = arg6 - this.field2097;
        int var10 = arg7 - this.field2092;
        int var11 = arg2 - this.field2097;
        int var12 = arg3 - this.field2092;
        if (arg5 == 1) {
            if (arg4 == 0) {
                if (arg1 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2094[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2094[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field2094[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field2094[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field2094[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field2094[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2094[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2094[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2094[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2094[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2094[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2094[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2094[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2094[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2094[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field2094[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field2094[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field2094[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field2094[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field2094[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var9 - 1;
            int var14 = arg5 + var10 - 1;
            if (arg4 == 0) {
                if (arg1 == 0) {
                    if ((var11 - arg5) == var9 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10 && (this.field2094[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 - arg5) == var10 && (this.field2094[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 <= var11 && var11 <= var13 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - arg5) == var9 && var12 >= var10 && var14 >= var12 && (this.field2094[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var14 >= var12 && (this.field2094[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 + 1) == var9 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10 && (this.field2094[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 - arg5 == var10 && (this.field2094[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 >= var9 && var11 <= var13 && var12 - arg5 == var10) {
                        return true;
                    }
                    if ((var11 - arg5) == var9 && var12 >= var10 && var12 <= var14 && (this.field2094[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field2094[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    if (var11 - arg5 == var9 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 <= var12 && var12 <= var14 && (this.field2094[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 - arg5 == var10 && (this.field2094[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var11 - arg5) == var9 && var10 <= var12 && var14 >= var12 && (this.field2094[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 - arg5) == var10 && (this.field2094[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 - arg5) == var9 && var10 <= var12 && var12 <= var14 && (this.field2094[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field2094[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 - arg5) == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var11 - arg5) == var9 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10 && (this.field2094[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 >= var10 && var14 >= var12 && (this.field2094[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 - arg5 == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field2094[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var9 && var13 >= var11 && var12 - arg5 == var10 && (this.field2094[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var11 - arg5) == var9 && var12 >= var10 && var14 >= var12 && (this.field2094[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var12 >= var10 && var12 <= var14 && (this.field2094[var9][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method857(int arg0, KeyEvent arg1) {
        field2119++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (~var2 >= arg0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZIIII)V")
    public final void method858(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 1) {
            field2114 = null;
        }
        int var7 = arg4 - this.field2097;
        int var8 = arg0 - this.field2092;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method867(17433600, var8, var7, 128);
                this.method867(17433600, var8, var7 - 1, 8);
            }
            if (arg3 == 1) {
                this.method867(arg2 ^ 0x10A0401, var8, var7, 2);
                this.method867(arg2 + 17433599, var8 - -1, var7, 32);
            }
            if (arg3 == 2) {
                this.method867(17433600, var8, var7, 8);
                this.method867(17433600, var8, var7 + 1, 128);
            }
            if (arg3 == 3) {
                this.method867(arg2 + 17433599, var8, var7, 32);
                this.method867(17433600, var8 - 1, var7, 2);
            }
        }
        field2117++;
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method867(arg2 ^ 0x10A0401, var8, var7, 1);
                this.method867(arg2 + 17433599, var8 + 1, var7 - 1, 16);
            }
            if (arg3 == 1) {
                this.method867(arg2 ^ 0x10A0401, var8, var7, 4);
                this.method867(17433600, var8 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method867(17433600, var8, var7, 16);
                this.method867(17433600, var8 - 1, var7 - -1, 1);
            }
            if (arg3 == 3) {
                this.method867(17433600, var8, var7, 64);
                this.method867(17433600, var8 - 1, var7 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method867(17433600, var8, var7, 130);
                this.method867(17433600, var8, var7 - 1, 8);
                this.method867(arg2 + 17433599, var8 + 1, var7, 32);
            }
            if (arg3 == 1) {
                this.method867(arg2 + 17433599, var8, var7, 10);
                this.method867(17433600, var8 + 1, var7, 32);
                this.method867(17433600, var8, var7 + 1, 128);
            }
            if (arg3 == 2) {
                this.method867(17433600, var8, var7, 40);
                this.method867(arg2 + 17433599, var8, var7 + 1, 128);
                this.method867(arg2 ^ 0x10A0401, var8 - 1, var7, 2);
            }
            if (arg3 == 3) {
                this.method867(17433600, var8, var7, 160);
                this.method867(17433600, var8 - 1, var7, 2);
                this.method867(arg2 + 17433599, var8, var7 - 1, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method867(17433600, var8, var7, 65536);
                this.method867(17433600, var8, var7 - 1, 4096);
            }
            if (arg3 == 1) {
                this.method867(17433600, var8, var7, 1024);
                this.method867(17433600, var8 + 1, var7, 16384);
            }
            if (arg3 == 2) {
                this.method867(17433600, var8, var7, 4096);
                this.method867(17433600, var8, var7 + 1, 65536);
            }
            if (arg3 == 3) {
                this.method867(17433600, var8, var7, 16384);
                this.method867(arg2 + 17433599, var8 + -1, var7, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method867(17433600, var8, var7, 512);
                this.method867(arg2 + 17433599, var8 + 1, var7 - 1, 8192);
            }
            if (arg3 == 1) {
                this.method867(17433600, var8, var7, 2048);
                this.method867(17433600, var8 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method867(17433600, var8, var7, 8192);
                this.method867(17433600, var8 - 1, var7 + 1, 512);
            }
            if (arg3 == 3) {
                this.method867(17433600, var8, var7, 32768);
                this.method867(arg2 + 17433599, var8 + -1, var7 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method867(17433600, var8, var7, 66560);
            this.method867(17433600, var8, var7 - 1, 4096);
            this.method867(17433600, var8 + 1, var7, 16384);
        }
        if (arg3 == 1) {
            this.method867(17433600, var8, var7, 5120);
            this.method867(arg2 + 17433599, var8 + 1, var7, 16384);
            this.method867(arg2 + 17433599, var8, var7 + 1, 65536);
        }
        if (arg3 == 2) {
            this.method867(17433600, var8, var7, 20480);
            this.method867(17433600, var8, var7 + 1, 65536);
            this.method867(arg2 + 17433599, var8 - 1, var7, 1024);
        }
        if (arg3 == 3) {
            this.method867(arg2 ^ 0x10A0401, var8, var7, 81920);
            this.method867(17433600, var8 - 1, var7, 1024);
            this.method867(arg2 ^ 0x10A0401, var8, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2098++;
        if (arg5 != -1) {
            method857(-1, (KeyEvent) null);
        }
        int var11 = arg1 + arg6;
        int var12 = arg2 + arg8;
        int var13 = arg3 + arg9;
        int var14 = arg0 + arg4;
        if (arg8 >= arg3 && var13 > arg8) {
            if (arg0 == var11 && (arg7 & 0x4) == 0) {
                int var15 = arg8;
                int var16 = var13 < var12 ? var13 : var12;
                while (var16 > var15) {
                    if ((this.field2094[var15 - this.field2097][var11 - this.field2092 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg6 == var14 && (arg7 & 0x1) == 0) {
                int var17 = arg8;
                int var18 = var13 >= var12 ? var12 : var13;
                while (var18 > var17) {
                    if ((this.field2094[var17 - this.field2097][arg6 - this.field2092] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg3 < var12 && var13 >= var12) {
            if (arg0 == var11 && (arg7 & 0x4) == 0) {
                for (int var19 = arg3; var19 < var12; var19++) {
                    if ((this.field2094[var19 - this.field2097][var11 - this.field2092 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var14 && (arg7 & 0x1) == 0) {
                for (int var20 = arg3; var20 < var12; var20++) {
                    if ((this.field2094[var20 - this.field2097][arg6 - this.field2092] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg6 >= arg0 && var14 > arg6) {
            if (arg3 == var12 && (arg7 & 0x8) == 0) {
                int var21 = arg6;
                int var22 = var11 <= var14 ? var11 : var14;
                while (var21 < var22) {
                    if ((this.field2094[var12 - this.field2097 - 1][var21 - this.field2092] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg8 == var13 && (arg7 & 0x2) == 0) {
                int var23 = arg6;
                int var24 = var11 <= var14 ? var11 : var14;
                while (var23 < var24) {
                    if ((this.field2094[arg8 - this.field2097][var23 - this.field2092] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var11 > arg0 && var11 <= var14) {
            if (arg3 == var12 && (arg7 & 0x8) == 0) {
                for (int var25 = arg0; var25 < var11; var25++) {
                    if ((this.field2094[var12 - this.field2097 - 1][var25 - this.field2092] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var13 && (arg7 & 0x2) == 0) {
                for (int var26 = arg0; var26 < var11; var26++) {
                    if ((this.field2094[arg8 - this.field2097][var26 - this.field2092] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZIBI)V")
    public final void method860(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg1 - this.field2092;
        int var8 = arg3 - this.field2097;
        int var9 = 256;
        if (arg4 <= 87) {
            return;
        }
        field2116++;
        if (arg2) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < (var8 + arg5); var10++) {
            if (var10 >= 0 && this.field2118 > var10) {
                for (int var11 = var7; var11 < (arg0 + var7); var11++) {
                    if (var11 >= 0 && this.field2100 > var11) {
                        this.method872(false, var11, var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method861(int arg0) {
        field2104 = null;
        field2093 = null;
        field2125 = null;
        field2126 = null;
        field2101 = null;
        field2122 = null;
        field2114 = null;
        field2095 = null;
        field2096 = null;
        field2109 = null;
        if (arg0 >= -110) {
            method861(-74);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZZIIII)V")
    public final void method862(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg1) {
            return;
        }
        field2120++;
        int var7 = arg5 - this.field2092;
        int var8 = arg4 - this.field2097;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method872(false, var7, 128, var8);
                this.method872(false, var7, 8, var8 - 1);
            }
            if (arg2 == 1) {
                this.method872(false, var7, 2, var8);
                this.method872(false, var7 + 1, 32, var8);
            }
            if (arg2 == 2) {
                this.method872(false, var7, 8, var8);
                this.method872(false, var7, 128, var8 + 1);
            }
            if (arg2 == 3) {
                this.method872(false, var7, 32, var8);
                this.method872(false, var7 - 1, 2, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method872(!arg1, var7, 1, var8);
                this.method872(false, var7 + 1, 16, var8 - 1);
            }
            if (arg2 == 1) {
                this.method872(false, var7, 4, var8);
                this.method872(false, var7 + 1, 64, var8 + 1);
            }
            if (arg2 == 2) {
                this.method872(false, var7, 16, var8);
                this.method872(false, var7 - 1, 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method872(false, var7, 64, var8);
                this.method872(false, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method872(false, var7, 130, var8);
                this.method872(false, var7, 8, var8 - 1);
                this.method872(!arg1, var7 + 1, 32, var8);
            }
            if (arg2 == 1) {
                this.method872(false, var7, 10, var8);
                this.method872(false, var7 + 1, 32, var8);
                this.method872(!arg1, var7, 128, var8 + 1);
            }
            if (arg2 == 2) {
                this.method872(false, var7, 40, var8);
                this.method872(false, var7, 128, var8 + 1);
                this.method872(!arg1, var7 - 1, 2, var8);
            }
            if (arg2 == 3) {
                this.method872(!arg1, var7, 160, var8);
                this.method872(false, var7 - 1, 2, var8);
                this.method872(false, var7, 8, var8 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method872(false, var7, 65536, var8);
                this.method872(false, var7, 4096, var8 - 1);
            }
            if (arg2 == 1) {
                this.method872(false, var7, 1024, var8);
                this.method872(false, var7 + 1, 16384, var8);
            }
            if (arg2 == 2) {
                this.method872(false, var7, 4096, var8);
                this.method872(false, var7, 65536, var8 + 1);
            }
            if (arg2 == 3) {
                this.method872(false, var7, 16384, var8);
                this.method872(!arg1, var7 - 1, 1024, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method872(false, var7, 512, var8);
                this.method872(false, var7 + 1, 8192, var8 - 1);
            }
            if (arg2 == 1) {
                this.method872(false, var7, 2048, var8);
                this.method872(!arg1, var7 + 1, 32768, var8 + 1);
            }
            if (arg2 == 2) {
                this.method872(false, var7, 8192, var8);
                this.method872(false, var7 - 1, 512, var8 + 1);
            }
            if (arg2 == 3) {
                this.method872(false, var7, 32768, var8);
                this.method872(false, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method872(false, var7, 66560, var8);
            this.method872(false, var7, 4096, var8 - 1);
            this.method872(false, var7 + 1, 16384, var8);
        }
        if (arg2 == 1) {
            this.method872(false, var7, 5120, var8);
            this.method872(!arg1, var7 + 1, 16384, var8);
            this.method872(false, var7, 65536, var8 + 1);
        }
        if (arg2 == 2) {
            this.method872(false, var7, 20480, var8);
            this.method872(false, var7, 65536, var8 + 1);
            this.method872(!arg1, var7 - 1, 1024, var8);
        }
        if (arg2 == 3) {
            this.method872(false, var7, 81920, var8);
            this.method872(false, var7 - 1, 1024, var8);
            this.method872(false, var7, 4096, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIIIIII)Z")
    public final boolean method863(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2115++;
        if (arg2 > 1) {
            return this.method854(arg2, arg7, arg5, arg4, arg2, 4096, arg1, arg6, arg3) ? true : this.method859(arg7, arg2, arg2, arg6, arg1, -1, arg3, arg0, arg5, arg4);
        }
        int var10 = arg6 + arg4 - 1;
        int var11 = arg7 + arg1 - 1;
        if (arg5 >= arg6 && var10 >= arg5 && arg3 >= arg7 && var11 >= arg3) {
            return true;
        } else if ((arg6 - 1) == arg5 && arg3 >= arg7 && var11 >= arg3 && (this.field2094[arg5 - this.field2097][arg3 - this.field2092] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var10 - arg8 == arg5 && arg3 >= arg7 && arg3 <= var11 && (this.field2094[arg5 - this.field2097][arg3 - this.field2092] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if ((arg7 - 1) == arg3 && arg6 <= arg5 && var10 >= arg5 && (this.field2094[arg5 - this.field2097][arg3 - this.field2092] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg3 && arg5 >= arg6 && var10 >= arg5 && (this.field2094[arg5 - this.field2097][arg3 - this.field2092] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBI)V")
    public final void method864(int arg0, byte arg1, int arg2) {
        field2102++;
        int var4 = arg0 - this.field2097;
        int var5 = arg2 - this.field2092;
        this.field2094[var4][var5] = class19.method98(this.field2094[var4][var5], -262145);
        if (arg1 >= -19) {
            this.method866(1, -26, -75, -9, 25, (byte) 46, 112, -112);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIZBI)V")
    public final void method865(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        int var8 = arg6 - this.field2097;
        field2112++;
        int var9 = arg0 - this.field2092;
        int var10 = 256;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg2;
            arg2 = arg1;
            arg1 = var11;
        }
        if (arg5 != 28) {
            this.method865(-54, -62, 40, 94, true, (byte) -2, 51);
        }
        if (arg4) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < (arg2 + var8); var12++) {
            if (var12 >= 0 && var12 < this.field2118) {
                for (int var13 = var9; var13 < (arg1 + var9); var13++) {
                    if (var13 >= 0 && var13 < this.field2100) {
                        this.method867(17433600, var13, var12, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIBII)Z")
    public final boolean method866(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field2107++;
        if (arg5 != -46) {
            field2114 = null;
        }
        if (arg7 == 1) {
            if (arg3 == arg6 && arg0 == arg1) {
                return true;
            }
        } else if (arg6 <= arg3 && arg3 <= (arg7 + arg6 - 1) && arg1 >= arg1 && arg1 <= (arg1 + arg7 - 1)) {
            return true;
        }
        int var9 = arg6 - this.field2097;
        int var10 = arg0 - this.field2092;
        int var11 = arg1 - this.field2092;
        int var12 = arg3 - this.field2097;
        if (arg7 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field2094[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field2094[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field2094[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field2094[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field2094[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field2094[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 + 1 == var9 && var10 == var11 && (this.field2094[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field2094[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var12 && (var11 + 1) == var10 && (this.field2094[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field2094[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field2094[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field2094[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg7 - 1;
            int var14 = var10 + arg7 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var12 + 1 == var9 && var11 >= var10 && var14 >= var11 && (this.field2094[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 - arg7 == var10 && (this.field2094[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - arg7) == var9 && var10 <= var11 && var11 <= var14 && (this.field2094[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 - arg7 == var10 && (this.field2094[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - arg7 == var9 && var11 >= var10 && var11 <= var14 && (this.field2094[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10 && (this.field2094[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 + 1 == var9 && var10 <= var11 && var14 >= var11 && (this.field2094[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10 && (this.field2094[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 <= var12 && var13 >= var12 && (var11 + 1) == var10 && (this.field2094[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var9 && var12 <= var13 && var11 - arg7 == var10 && (this.field2094[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg7 == var9 && var10 <= var11 && var14 >= var11 && (this.field2094[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 <= var11 && var11 <= var14 && (this.field2094[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)V")
    private final void method867(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 17433600) {
            field2104 = null;
        }
        this.field2094[arg2][arg1] = class19.method98(this.field2094[arg2][arg1], ~arg3);
        field2110++;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public final void method868(int arg0) {
        for (int var2 = 0; var2 < this.field2118; var2++) {
            for (int var3 = 0; var3 < this.field2100; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2118 - 5 <= var2 || (this.field2100 - 5) <= var3) {
                    this.field2094[var2][var3] = 16777215;
                } else {
                    this.field2094[var2][var3] = 16777216;
                }
            }
        }
        field2099++;
        if (arg0 != 21744) {
            this.field2097 = -17;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V")
    public final void method869(int arg0, int arg1, int arg2) {
        field2113++;
        int var4 = arg0 - this.field2097;
        int var5 = arg2 - this.field2092;
        this.field2094[var4][var5] = class246.method1612(this.field2094[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BIZILfd;)V")
    public static final void method870(byte arg0, int arg1, boolean arg2, int arg3, class229 arg4) {
        field2108++;
        int var5 = arg4.field3885;
        if (arg0 != -31) {
            method857(-99, (KeyEvent) null);
        }
        if (arg4.field3880 == 0) {
            arg4.field3885 = arg4.field3986;
        } else if (arg4.field3880 == 1) {
            arg4.field3885 = arg1 - arg4.field3986;
        } else if (arg4.field3880 == 2) {
            arg4.field3885 = arg4.field3986 * arg1 >> 14;
        } else if (arg4.field3880 == 3) {
            if (arg4.field3858 == 2) {
                arg4.field3885 = (arg4.field3986 - 1) * arg4.field3973 + arg4.field3986 * 32;
            } else if (arg4.field3858 == 7) {
                arg4.field3885 = (arg4.field3986 - 1) * arg4.field3973 + arg4.field3986 * 115;
            }
        }
        int var6 = arg4.field3980;
        if (arg4.field3945 == 0) {
            arg4.field3980 = arg4.field3951;
        } else if (arg4.field3945 == 1) {
            arg4.field3980 = arg3 - arg4.field3951;
        } else if (arg4.field3945 == 2) {
            arg4.field3980 = arg4.field3951 * arg3 >> 14;
        } else if (arg4.field3945 == 3) {
            if (arg4.field3858 == 2) {
                arg4.field3980 = (arg4.field3951 - 1) * arg4.field4014 + arg4.field3951 * 32;
            } else if (arg4.field3858 == 7) {
                arg4.field3980 = (arg4.field3951 - 1) * arg4.field4014 + arg4.field3951 * 12;
            }
        }
        if (arg4.field3880 == 4) {
            arg4.field3885 = arg4.field3991 * arg4.field3980 / arg4.field3962;
        }
        if (arg4.field3945 == 4) {
            arg4.field3980 = arg4.field3962 * arg4.field3885 / arg4.field3991;
        }
        if (class143.field2518 && (client.method635(arg4) != 0 || arg4.field3858 == 0)) {
            if (arg4.field3980 < 5 && arg4.field3885 < 5) {
                arg4.field3885 = 5;
                arg4.field3980 = 5;
            } else {
                if (arg4.field3885 <= 0) {
                    arg4.field3885 = 5;
                }
                if (arg4.field3980 <= 0) {
                    arg4.field3980 = 5;
                }
            }
        }
        if (arg4.field3886 == 1337) {
            class91.field1542 = arg4;
        }
        if (arg2 && arg4.field3944 != null && arg4.field3885 != var5 || arg4.field3980 != var6) {
            class99 var7 = new class99();
            var7.field1678 = arg4.field3944;
            var7.field1677 = arg4;
            class275.field4775.method547(104, var7);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IBI)V")
    public final void method871(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field2092;
        int var5 = arg0 - this.field2097;
        if (arg1 >= -22) {
            this.field2118 = 49;
        }
        field2103++;
        this.field2094[var5][var4] = class246.method1612(this.field2094[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIII)V")
    private final void method872(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            this.field2094[arg3][arg1] = class246.method1612(this.field2094[arg3][arg1], arg2);
            field2124++;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II)V")
    public class118(int arg0, int arg1) {
        this.field2118 = arg0;
        this.field2100 = arg1;
        this.field2092 = 0;
        this.field2094 = new int[this.field2118][this.field2100];
        this.method868(21744);
    }
}
