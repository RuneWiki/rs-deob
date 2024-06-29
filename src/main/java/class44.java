import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class44 {

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    private int field853;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    private int field855;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "[[I")
    public int[][] field839;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field827 = 0;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Lqd;")
    public static class40 field837 = class147.method1106("Abbrechen", (byte) -81);

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static volatile int field826 = -1;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field840 = 0;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lqd;")
    public static class40 field834 = class147.method1106("Verbindung mit Update)2Server)3)3)3", (byte) -103);

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Lqd;")
    public static class40 field841 = class147.method1106("document)3cookie=(R", (byte) -98);

    @OriginalMember(owner = "client!m", name = "z", descriptor = "Lqd;")
    public static class40 field850 = class147.method1106("Stufe: ", (byte) -102);

    @OriginalMember(owner = "client!m", name = "H", descriptor = "Lqd;")
    public static class40 field857 = class147.method1106("Loaded titlescreen)3", (byte) -50);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "[[Lrb;")
    public static class213[][] field845;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZIIB)V", line = 5)
    public final void method396(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        field836++;
        int var7 = arg3 - this.field848;
        int var8 = arg4 - this.field853;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method399(var8, var7, 128, -114);
                this.method399(var8 - 1, var7, 8, 58);
            }
            if (arg0 == 1) {
                this.method399(var8, var7, 2, -128);
                this.method399(var8, var7 + 1, 32, -122);
            }
            if (arg0 == 2) {
                this.method399(var8, var7, 8, 99);
                this.method399(var8 + 1, var7, 128, arg5 ^ 0x49);
            }
            if (arg0 == 3) {
                this.method399(var8, var7, 32, 81);
                this.method399(var8, var7 - 1, 2, -111);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method399(var8, var7, 1, 127);
                this.method399(var8 - 1, var7 + 1, 16, 126);
            }
            if (arg0 == 1) {
                this.method399(var8, var7, 4, arg5 - 87);
                this.method399(var8 + 1, var7 + 1, 64, -117);
            }
            if (arg0 == 2) {
                this.method399(var8, var7, 16, 122);
                this.method399(var8 + 1, var7 - 1, 1, -125);
            }
            if (arg0 == 3) {
                this.method399(var8, var7, 64, 47);
                this.method399(var8 - 1, var7 - 1, 4, arg5 ^ 0xFFFFFFD8);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method399(var8, var7, 130, 25);
                this.method399(var8 - 1, var7, 8, arg5 ^ 0xFFFFFF99);
                this.method399(var8, var7 + 1, 32, arg5 + 131);
            }
            if (arg0 == 1) {
                this.method399(var8, var7, 10, arg5 + 97);
                this.method399(var8, var7 + 1, 32, -118);
                this.method399(var8 + 1, var7, 128, -1);
            }
            if (arg0 == 2) {
                this.method399(var8, var7, 40, -119);
                this.method399(var8 + 1, var7, 128, 121);
                this.method399(var8, var7 - 1, 2, -115);
            }
            if (arg0 == 3) {
                this.method399(var8, var7, 160, arg5 ^ 0xFFFFFFB4);
                this.method399(var8, var7 - 1, 2, arg5 ^ 0x5D);
                this.method399(var8 - 1, var7, 8, 16);
            }
        }
        if (arg5 != -39) {
            method403(-2);
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method399(var8, var7, 65536, -124);
                this.method399(var8 - 1, var7, 4096, 60);
            }
            if (arg0 == 1) {
                this.method399(var8, var7, 1024, 3);
                this.method399(var8, var7 + 1, 16384, arg5 - 84);
            }
            if (arg0 == 2) {
                this.method399(var8, var7, 4096, 126);
                this.method399(var8 + 1, var7, 65536, 18);
            }
            if (arg0 == 3) {
                this.method399(var8, var7, 16384, arg5 ^ 0xFFFFFF85);
                this.method399(var8, var7 - 1, 1024, 65);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method399(var8, var7, 512, -112);
                this.method399(var8 - 1, var7 + 1, 8192, 39);
            }
            if (arg0 == 1) {
                this.method399(var8, var7, 2048, -113);
                this.method399(var8 + 1, var7 - -1, 32768, -126);
            }
            if (arg0 == 2) {
                this.method399(var8, var7, 8192, -126);
                this.method399(var8 + 1, var7 - 1, 512, -127);
            }
            if (arg0 == 3) {
                this.method399(var8, var7, 32768, -117);
                this.method399(var8 - 1, var7 + -1, 2048, 108);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method399(var8, var7, 66560, 102);
            this.method399(var8 - 1, var7, 4096, -116);
            this.method399(var8, var7 + 1, 16384, arg5 ^ 0x49);
        }
        if (arg0 == 1) {
            this.method399(var8, var7, 5120, 126);
            this.method399(var8, var7 + 1, 16384, arg5 ^ 0xFFFFFFBF);
            this.method399(var8 + 1, var7, 65536, arg5 ^ 0x26);
        }
        if (arg0 == 2) {
            this.method399(var8, var7, 20480, arg5 + 58);
            this.method399(var8 + 1, var7, 65536, arg5 ^ 0x5A);
            this.method399(var8, var7 - 1, 1024, 2);
        }
        if (arg0 == 3) {
            this.method399(var8, var7, 81920, arg5 + 72);
            this.method399(var8, var7 - 1, 1024, arg5 ^ 0xFFFFFFBE);
            this.method399(var8 - 1, var7, 4096, -124);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V", line = 209)
    public final void method397(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field853;
        if (arg0 < -43) {
            field849++;
            int var5 = arg1 - this.field848;
            this.field839[var4][var5] = class276.method1923(this.field839[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)V", line = 228)
    public final void method398(int arg0, int arg1, byte arg2) {
        field831++;
        int var4 = arg0 - this.field853;
        int var5 = arg1 - this.field848;
        this.field839[var4][var5] = class11.method71(this.field839[var4][var5], 262144);
        if (arg2 < 65) {
            method407(-56);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)V", line = 249)
    private final void method399(int arg0, int arg1, int arg2, int arg3) {
        this.field839[arg0][arg1] = class11.method71(this.field839[arg0][arg1], arg2);
        int var5 = 90 / ((arg3 + 56) / 55);
        field825++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBII)V", line = 264)
    private final void method400(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == -120) {
            this.field839[arg3][arg2] = class276.method1923(this.field839[arg3][arg2], ~arg0);
            field843++;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(III)V", line = 287)
    public final void method401(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field848;
        int var5 = -44 / ((-arg2 - 18) / 36);
        int var6 = arg0 - this.field853;
        this.field839[var6][var4] = class11.method71(this.field839[var6][var4], 2097152);
        field856++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILsd;)Lnf;", line = 309)
    public static final class62 method402(int arg0, class26 arg1) {
        if (arg0 <= 72) {
            field826 = 114;
        }
        field830++;
        return new class62(arg1.method201(true), arg1.method201(true), arg1.method201(true), arg1.method201(true), arg1.method201(true), arg1.method201(true), arg1.method201(true), arg1.method201(true), arg1.method244(-26711), arg1.method226(255));
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 323)
    public static void method403(int arg0) {
        int var1 = 67 / ((-arg0 - 45) / 48);
        field841 = null;
        field857 = null;
        field850 = null;
        field837 = null;
        field834 = null;
        field845 = (class213[][]) null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZIIII)V", line = 339)
    public final void method404(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        int var9 = arg4 - this.field853;
        if (arg0 != 0) {
            return;
        }
        field832++;
        if (arg3 == 1 || arg3 == 3) {
            int var10 = arg1;
            arg1 = arg6;
            arg6 = var10;
        }
        int var11 = arg5 - this.field848;
        if (arg2) {
            var8 += 131072;
        }
        for (int var12 = var9; var12 < var9 + arg1; var12++) {
            if (var12 >= 0 && var12 < this.field855) {
                for (int var13 = var11; var13 < (arg6 + var11); var13++) {
                    if (var13 >= 0 && var13 < this.field844) {
                        this.method400(var8, (byte) -120, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIZIII)Z", line = 391)
    public final boolean method405(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field851++;
        if (arg6 == 1) {
            if (arg0 == arg7 && arg3 == arg5) {
                return true;
            }
        } else if (arg0 >= arg7 && (arg6 + arg7 - 1) >= arg0 && arg5 >= arg5 && arg5 <= (arg5 + arg6 - 1)) {
            return true;
        }
        int var9 = arg7 - this.field853;
        if (arg4) {
            method407(4);
        }
        int var10 = arg0 - this.field853;
        int var11 = arg5 - this.field848;
        int var12 = arg3 - this.field848;
        if (arg6 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field839[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field839[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field839[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field839[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field839[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field839[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field839[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field839[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 == var10 && (var11 + 1) == var12 && (this.field839[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var12 && (this.field839[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var11 == var12 && (this.field839[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var12 && (this.field839[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var9 - 1;
            int var14 = arg6 + var12 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var10 + 1 == var9 && var12 <= var11 && var11 <= var14 && (this.field839[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var11 - arg6 == var12 && (this.field839[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - arg6 == var9 && var12 <= var11 && var11 <= var14 && (this.field839[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var11 - arg6 == var12 && (this.field839[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 - arg6) == var9 && var11 >= var12 && var11 <= var14 && (this.field839[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var11 + 1 == var12 && (this.field839[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 + 1 == var9 && var11 >= var12 && var11 <= var14 && (this.field839[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var11 + 1 == var12 && (this.field839[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 <= var10 && var13 >= var10 && (var11 + 1) == var12 && (this.field839[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var10 && var13 >= var10 && (var11 - arg6) == var12 && (this.field839[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg6) == var9 && var11 >= var12 && var11 <= var14 && (this.field839[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var12 <= var11 && var14 >= var11 && (this.field839[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIIII)Z", line = 576)
    private final boolean method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field828++;
        if (arg5 + arg8 > arg2 && (arg2 + arg4) > arg5) {
            if (arg0 != 0) {
                field834 = (class40) null;
            }
            return arg1 + arg7 > arg6 && arg3 + arg6 > arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 596)
    public static final void method407(int arg0) {
        int var1 = 67 % ((19 - arg0) / 50);
        field847++;
        for (class65 var2 = (class65) class121.field2086.method1971(100); var2 != null; var2 = (class65) class121.field2086.method1967(100)) {
            if (var2.field1215 == -1) {
                var2.field1208 = 0;
                class20.method129(var2, true);
            } else {
                var2.method2095(0);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZIIIIIII)Z", line = 627)
    public final boolean method408(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field835++;
        if (arg8 <= 1) {
            if (arg1) {
                this.method405(-103, -8, 112, -107, true, -118, 118, -50);
            }
            int var10 = arg2 + arg0 - 1;
            int var11 = arg3 + arg7 - 1;
            if (arg5 >= arg2 && arg5 <= var10 && arg4 >= arg3 && var11 >= arg4) {
                return true;
            } else if (arg2 - 1 == arg5 && arg4 >= arg3 && arg4 <= var11 && (this.field839[arg5 - this.field853][arg4 - this.field848] & 0x8) == 0 && (arg6 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg5 && arg4 >= arg3 && arg4 <= var11 && (this.field839[arg5 - this.field853][arg4 - this.field848] & 0x80) == 0 && (arg6 & 0x2) == 0) {
                return true;
            } else if (arg3 - 1 == arg4 && arg5 >= arg2 && arg5 <= var10 && (this.field839[arg5 - this.field853][arg4 - this.field848] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg4 && arg2 <= arg5 && arg5 <= var10 && (this.field839[arg5 - this.field853][arg4 - this.field848] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        } else if (this.method406(0, arg7, arg5, arg8, arg8, arg2, arg4, arg3, arg0)) {
            return true;
        } else {
            return this.method409(arg8, arg4, arg7, arg6, arg8, arg5, arg0, -123, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIIIII)Z", line = 672)
    private final boolean method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 > -72) {
            this.method406(22, -128, 24, -46, -95, -68, 48, 99, 92);
        }
        int var11 = arg5 + arg0;
        field842++;
        int var12 = arg1 + arg4;
        int var13 = arg6 + arg8;
        int var14 = arg2 + arg9;
        if (arg8 <= arg5 && arg5 < var13) {
            if (arg9 == var12 && (arg3 & 0x4) == 0) {
                int var15 = arg5;
                int var16 = var11 > var13 ? var13 : var11;
                while (var15 < var16) {
                    if ((this.field839[var15 - this.field853][var12 - this.field848 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg1 == var14 && (arg3 & 0x1) == 0) {
                int var17 = arg5;
                int var18 = var11 > var13 ? var13 : var11;
                while (var18 > var17) {
                    if ((this.field839[var17 - this.field853][arg1 - this.field848] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg8 && var11 <= var13) {
            if (arg9 == var12 && (arg3 & 0x4) == 0) {
                for (int var19 = arg8; var19 < var11; var19++) {
                    if ((this.field839[var19 - this.field853][var12 - this.field848 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var14 && (arg3 & 0x1) == 0) {
                for (int var20 = arg8; var20 < var11; var20++) {
                    if ((this.field839[var20 - this.field853][arg1 - this.field848] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg1 >= arg9 && arg1 < var14) {
            if (arg8 == var11 && (arg3 & 0x8) == 0) {
                int var21 = arg1;
                int var22 = var14 >= var12 ? var12 : var14;
                while (var22 > var21) {
                    if ((this.field839[var11 - this.field853 - 1][var21 - this.field848] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg5 == var13 && (arg3 & 0x2) == 0) {
                int var23 = arg1;
                int var24 = var14 >= var12 ? var12 : var14;
                while (var23 < var24) {
                    if ((this.field839[arg5 - this.field853][var23 - this.field848] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg9 < var12 && var12 <= var14) {
            if (arg8 == var11 && (arg3 & 0x8) == 0) {
                for (int var25 = arg9; var25 < var12; var25++) {
                    if ((this.field839[var11 - this.field853 - 1][var25 - this.field848] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var13 && (arg3 & 0x2) == 0) {
                for (int var26 = arg9; var26 < var12; var26++) {
                    if ((this.field839[arg5 - this.field853][var26 - this.field848] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIZI)V", line = 837)
    public final void method410(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg2 - this.field848;
        int var8 = -127 / ((arg1 + 26) / 45);
        int var9 = arg0 - this.field853;
        field852++;
        int var10 = 256;
        if (arg4) {
            var10 += 131072;
        }
        for (int var11 = var9; var11 < arg5 + var9; var11++) {
            if (var11 >= 0 && this.field855 > var11) {
                for (int var12 = var7; var12 < arg3 + var7; var12++) {
                    if (var12 >= 0 && var12 < this.field844) {
                        this.method399(var11, var12, var10, 17);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBIIIIII)Z", line = 878)
    public final boolean method411(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field846++;
        if (arg7 == 1) {
            if (arg2 == arg4 && arg0 == arg3) {
                return true;
            }
        } else if (arg4 >= arg2 && arg4 <= (arg7 + arg2 - 1) && arg3 <= arg3 && arg7 + arg3 - 1 >= arg3) {
            return true;
        }
        int var9 = arg3 - this.field848;
        int var10 = arg2 - this.field853;
        int var11 = arg4 - this.field853;
        if (arg1 <= 62) {
            return true;
        }
        int var12 = arg0 - this.field848;
        if (arg7 == 1) {
            if (arg5 == 0) {
                if (arg6 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field839[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field839[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field839[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field839[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field839[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field839[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field839[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field839[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field839[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field839[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field839[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field839[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field839[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field839[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var11 - 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field839[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field839[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field839[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field839[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field839[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 == var12 && (this.field839[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var10 - 1;
            int var14 = arg7 + var12 - 1;
            if (arg5 == 0) {
                if (arg6 == 0) {
                    if (var11 - arg7 == var10 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 + 1) == var12 && (this.field839[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var9 - arg7) == var12 && (this.field839[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 <= var11 && var11 <= var13 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var11 - arg7 == var10 && var12 <= var9 && var9 <= var14 && (this.field839[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 <= var9 && var14 >= var9 && (this.field839[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 + 1) == var10 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var9 + 1 == var12 && (this.field839[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var9 - arg7 == var12 && (this.field839[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 <= var11 && var13 >= var11 && (var9 - arg7) == var12) {
                        return true;
                    }
                    if ((var11 - arg7) == var10 && var12 <= var9 && var9 <= var14 && (this.field839[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 <= var9 && var14 >= var9 && (this.field839[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    if (var11 - arg7 == var10 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 >= var12 && var9 <= var14 && (this.field839[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var9 - arg7) == var12 && (this.field839[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var11 - arg7) == var10 && var12 <= var9 && var14 >= var9 && (this.field839[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var9 - arg7) == var12 && (this.field839[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - arg7 == var10 && var12 <= var9 && var9 <= var14 && (this.field839[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var9 + 1) == var12 && (this.field839[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var9 - arg7 == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 - arg7 == var10 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 + 1) == var12 && (this.field839[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 <= var9 && var14 >= var9 && (this.field839[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var9 - arg7 == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var11 >= var10 && var13 >= var11 && (var9 + 1) == var12 && (this.field839[var11][var12] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var10 && var11 <= var13 && var9 - arg7 == var12 && (this.field839[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var11 - arg7) == var10 && var12 <= var9 && var9 <= var14 && (this.field839[var13][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var12 <= var9 && var14 >= var9 && (this.field839[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 1246)
    public static final void method412(Throwable arg0, int arg1, String arg2) {
        field854++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class256.method1802(arg0, 32);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class25.field442.field1876 == null) {
                return;
            }
            class70 var8 = class25.field442.method818(new URL(class25.field442.field1876.getCodeBase(), "clienterror.ws?c=" + class299.field5008 + "&u=" + class205.field3271 + "&v1=" + class107.field1885 + "&v2=" + class107.field1869 + "&e=" + var7), 0);
            while (var8.field1258 == 0) {
                class160.method1227(1L, false);
            }
            if (arg1 != -14997) {
                method403(-3);
            }
            if (var8.field1258 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field1260;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)Z", line = 1299)
    public final boolean method413(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field829++;
        if (arg2 == arg3 && arg1 == arg4) {
            return true;
        }
        int var6 = arg3 - this.field853;
        int var7 = arg4 - this.field848;
        if (var6 < 0 || this.field855 <= var6 || var7 < 0 || var7 >= this.field844) {
            return false;
        }
        int var8 = arg1 - this.field848;
        int var9 = arg2 - this.field853;
        int var10;
        if (var6 > var9) {
            var10 = var6 - var9;
        } else {
            var10 = var9 - var6;
        }
        int var11;
        if (var7 <= var8) {
            var11 = var8 - var7;
        } else {
            var11 = var7 - var8;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var8) {
                if (var7 > var8) {
                    if ((this.field839[var9][var8] & 0x12C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var7) {
                    if ((this.field839[var9][var8] & 0x12C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 > var9) {
                        if ((this.field839[var9][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var6 < var9) {
                        if ((this.field839[var9][var8] & 0x12C0180) != 0) {
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
                    if ((this.field839[var9][var8] & 0x12C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var9 > var6) {
                    if ((this.field839[var9][var8] & 0x12C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 > var8) {
                        if ((this.field839[var9][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field839[var9][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return ~(this.field839[var6][var7] & 0x1240100) == arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIIIBI)V", line = 1449)
    public final void method414(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field833++;
        int var7 = arg2 - this.field848;
        int var8 = arg1 - this.field853;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method400(128, (byte) -120, var7, var8);
                this.method400(8, (byte) -120, var7, var8 - 1);
            }
            if (arg5 == 1) {
                this.method400(2, (byte) -120, var7, var8);
                this.method400(32, (byte) -120, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method400(8, (byte) -120, var7, var8);
                this.method400(128, (byte) -120, var7, var8 + 1);
            }
            if (arg5 == 3) {
                this.method400(32, (byte) -120, var7, var8);
                this.method400(2, (byte) -120, var7 - 1, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method400(1, (byte) -120, var7, var8);
                this.method400(16, (byte) -120, var7 + 1, var8 + -1);
            }
            if (arg5 == 1) {
                this.method400(4, (byte) -120, var7, var8);
                this.method400(64, (byte) -120, var7 + 1, var8 - -1);
            }
            if (arg5 == 2) {
                this.method400(16, (byte) -120, var7, var8);
                this.method400(1, (byte) -120, var7 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method400(64, (byte) -120, var7, var8);
                this.method400(4, (byte) -120, var7 - 1, var8 + -1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method400(130, (byte) -120, var7, var8);
                this.method400(8, (byte) -120, var7, var8 - 1);
                this.method400(32, (byte) -120, var7 + 1, var8);
            }
            if (arg5 == 1) {
                this.method400(10, (byte) -120, var7, var8);
                this.method400(32, (byte) -120, var7 + 1, var8);
                this.method400(128, (byte) -120, var7, var8 + 1);
            }
            if (arg5 == 2) {
                this.method400(40, (byte) -120, var7, var8);
                this.method400(128, (byte) -120, var7, var8 + 1);
                this.method400(2, (byte) -120, var7 - 1, var8);
            }
            if (arg5 == 3) {
                this.method400(160, (byte) -120, var7, var8);
                this.method400(2, (byte) -120, var7 - 1, var8);
                this.method400(8, (byte) -120, var7, var8 - 1);
            }
        }
        if (arg0) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method400(65536, (byte) -120, var7, var8);
                    this.method400(4096, (byte) -120, var7, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method400(1024, (byte) -120, var7, var8);
                    this.method400(16384, (byte) -120, var7 + 1, var8);
                }
                if (arg5 == 2) {
                    this.method400(4096, (byte) -120, var7, var8);
                    this.method400(65536, (byte) -120, var7, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method400(16384, (byte) -120, var7, var8);
                    this.method400(1024, (byte) -120, var7 - 1, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method400(512, (byte) -120, var7, var8);
                    this.method400(8192, (byte) -120, var7 + 1, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method400(2048, (byte) -120, var7, var8);
                    this.method400(32768, (byte) -120, var7 + 1, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method400(8192, (byte) -120, var7, var8);
                    this.method400(512, (byte) -120, var7 - 1, var8 - -1);
                }
                if (arg5 == 3) {
                    this.method400(32768, (byte) -120, var7, var8);
                    this.method400(2048, (byte) -120, var7 - 1, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method400(66560, (byte) -120, var7, var8);
                    this.method400(4096, (byte) -120, var7, var8 - 1);
                    this.method400(16384, (byte) -120, var7 + 1, var8);
                }
                if (arg5 == 1) {
                    this.method400(5120, (byte) -120, var7, var8);
                    this.method400(16384, (byte) -120, var7 + 1, var8);
                    this.method400(65536, (byte) -120, var7, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method400(20480, (byte) -120, var7, var8);
                    this.method400(65536, (byte) -120, var7, var8 + 1);
                    this.method400(1024, (byte) -120, var7 - 1, var8);
                }
                if (arg5 == 3) {
                    this.method400(81920, (byte) -120, var7, var8);
                    this.method400(1024, (byte) -120, var7 - 1, var8);
                    this.method400(4096, (byte) -120, var7, var8 - 1);
                }
            }
        }
        int var9 = 120 / ((-arg4 - 41) / 38);
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V", line = 1656)
    public final void method415(int arg0) {
        if (arg0 < 90) {
            field837 = (class40) null;
        }
        for (int var2 = 0; var2 < this.field855; var2++) {
            for (int var3 = 0; var3 < this.field844; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field855 - 5 || var3 >= (this.field844 - 5)) {
                    this.field839[var2][var3] = 16777215;
                } else {
                    this.field839[var2][var3] = 16777216;
                }
            }
        }
        field838++;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(II)V", line = 1693)
    public class44(int arg0, int arg1) {
        this.field844 = arg1;
        this.field853 = 0;
        this.field848 = 0;
        this.field855 = arg0;
        this.field839 = new int[this.field855][this.field844];
        this.method415(114);
    }
}
