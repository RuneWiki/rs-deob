import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class30 {

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "[[I")
    public int[][] field409;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Ltl;")
    public static class59 field400 = class85.method639("<col=ff0000>", 9588);

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "Ltl;")
    public static class59 field411 = class85.method639("gr-Un:", 9588);

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field402 = 0;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
    public static int field421 = 0;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field420 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 7)
    public static void method186(byte arg0) {
        field400 = null;
        field411 = null;
        int var1 = 122 / ((arg0 - 7) / 43);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIII)V", line = 31)
    private final void method187(int arg0, int arg1, int arg2, int arg3) {
        this.field409[arg2][arg0] = class93.method680(this.field409[arg2][arg0], ~arg3);
        field405++;
        if (arg1 != 4) {
            this.method206(-64, (byte) 37, false, -41, 87, 122);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIZ)V", line = 42)
    public final void method188(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg3 - this.field406;
        field415++;
        int var8 = arg0 - this.field395;
        int var9 = 256;
        if (arg1 != -1) {
            this.method197(2, 12, false, 28, (byte) 124, 77);
        }
        if (arg5) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < arg2 + var8; var10++) {
            if (var10 >= 0 && this.field404 > var10) {
                for (int var11 = var7; var11 < arg4 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field416) {
                        this.method204(var11, var9, var10, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V", line = 86)
    public final void method189(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field395;
        int var5 = arg0 - this.field406;
        this.field409[var4][var5] = class239.method1677(this.field409[var4][var5], arg2);
        field398++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BII)V", line = 103)
    public final void method190(byte arg0, int arg1, int arg2) {
        if (arg0 <= 122) {
            this.method195(93, -21, 89);
        }
        field401++;
        int var4 = arg1 - this.field406;
        int var5 = arg2 - this.field395;
        this.field409[var5][var4] = class239.method1677(this.field409[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIII)Z", line = 118)
    private final boolean method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 != 0) {
            return false;
        }
        field396++;
        if (arg7 + arg0 > arg8 && arg7 < arg2 + arg8) {
            return arg5 + arg1 > arg3 && arg3 + arg6 > arg5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(III)I", line = 138)
    public static final int method192(int arg0, int arg1, int arg2) {
        field422++;
        int var3 = (class148.method1069(4, arg0 ^ -26920, arg1 + 91923, arg2 - -45365) - (-(class148.method1069(2, 29141, arg1 + 37821, arg2 + 10294) - 128 >> 1) - (class148.method1069(1, 29141, arg1, arg2) - 128 >> 2))) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 != -6387) {
            return -3;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BIIIIIII)Z", line = 171)
    public final boolean method193(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field410++;
        if (arg0 != -65) {
            this.method196(75, (byte) -43, -63, 72, -29);
        }
        if (arg4 == 1) {
            if (arg2 == arg6 && arg5 == arg7) {
                return true;
            }
        } else if (arg6 >= arg2 && (arg4 + arg2 - 1) >= arg6 && arg7 <= arg7 && arg7 <= arg7 + arg4 - 1) {
            return true;
        }
        int var9 = arg7 - this.field406;
        int var10 = arg2 - this.field395;
        int var11 = arg5 - this.field406;
        int var12 = arg6 - this.field395;
        if (arg4 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field409[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field409[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field409[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field409[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field409[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field409[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field409[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field409[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field409[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field409[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field409[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field409[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var11 - 1;
            int var14 = var10 + arg4 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var13 && (this.field409[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var14 && var9 - arg4 == var11 && (this.field409[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var12 - arg4) == var10 && var9 >= var11 && var9 <= var13 && (this.field409[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var14 >= var12 && var9 - arg4 == var11 && (this.field409[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - arg4 == var10 && var9 >= var11 && var9 <= var13 && (this.field409[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var14 >= var12 && var9 + 1 == var11 && (this.field409[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 + 1 == var10 && var11 <= var9 && var13 >= var9 && (this.field409[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var14 >= var12 && (var9 + 1) == var11 && (this.field409[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 <= var12 && var12 <= var14 && var9 + 1 == var11 && (this.field409[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var10 && var12 <= var14 && (var9 - arg4) == var11 && (this.field409[var12][var13] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg4 == var10 && var9 >= var11 && var13 >= var9 && (this.field409[var14][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 >= var11 && var13 >= var9 && (this.field409[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V", line = 359)
    public static final void method194(int arg0, int arg1) {
        class245 var2 = class120.field2010[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class245 var4 = class120.field2010[var3][arg0][arg1] = class120.field2010[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4088--;
                for (int var5 = 0; var5 < var4.field4092; var5++) {
                    class165 var6 = var4.field4107[var5];
                    if ((var6.field2673 >> 29 & 0x3L) == 2L && var6.field2682 == arg0 && var6.field2670 == arg1) {
                        var6.field2674--;
                    }
                }
            }
        }
        if (class120.field2010[0][arg0][arg1] == null) {
            class120.field2010[0][arg0][arg1] = new class245(0, arg0, arg1);
        }
        class120.field2010[0][arg0][arg1].field4084 = var2;
        class120.field2010[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(III)V", line = 397)
    public final void method195(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field395;
        int var5 = arg1 - this.field406;
        int var6 = 51 / ((arg0 - 24) / 32);
        this.field409[var4][var5] = class93.method680(this.field409[var4][var5], -262145);
        field413++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBIII)Z", line = 409)
    public final boolean method196(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field407++;
        if (arg3 == arg4 && arg0 == arg2) {
            return true;
        }
        int var6 = arg2 - this.field406;
        int var7 = arg3 - this.field395;
        if (var7 < 0 || this.field404 <= var7 || var6 < 0 || this.field416 <= var6) {
            return false;
        }
        int var8 = arg4 - this.field395;
        int var9 = arg0 - this.field406;
        if (arg1 >= -37) {
            field411 = (class59) null;
        }
        int var10;
        if (var6 > var9) {
            var10 = var6 - var9;
        } else {
            var10 = var9 - var6;
        }
        int var11;
        if (var7 > var8) {
            var11 = var7 - var8;
        } else {
            var11 = var8 - var7;
        }
        if (var11 > var10) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var8) {
                if (var7 > var8) {
                    if ((this.field409[var8][var9] & 0x12C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var7) {
                    if ((this.field409[var8][var9] & 0x12C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 > var9) {
                        if ((this.field409[var8][var9] & 0x12C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var6) {
                        if ((this.field409[var8][var9] & 0x12C0120) != 0) {
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
                if (var6 > var9) {
                    if ((this.field409[var8][var9] & 0x12C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var9 > var6) {
                    if ((this.field409[var8][var9] & 0x12C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 > var8) {
                        if ((this.field409[var8][var9] & 0x12C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field409[var8][var9] & 0x12C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field409[var7][var6] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIZIBI)V", line = 561)
    public final void method197(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg0 - this.field406;
        int var8 = arg5 - this.field395;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method204(var7, 128, var8, 1);
                this.method204(var7, 8, var8 - 1, 1);
            }
            if (arg1 == 1) {
                this.method204(var7, 2, var8, arg4 ^ 0xFFFFFF8B);
                this.method204(var7 + 1, 32, var8, arg4 + 119);
            }
            if (arg1 == 2) {
                this.method204(var7, 8, var8, 1);
                this.method204(var7, 128, var8 + 1, 1);
            }
            if (arg1 == 3) {
                this.method204(var7, 32, var8, 1);
                this.method204(var7 - 1, 2, var8, 1);
            }
        }
        field414++;
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method204(var7, 1, var8, 1);
                this.method204(var7 + 1, 16, var8 - 1, 1);
            }
            if (arg1 == 1) {
                this.method204(var7, 4, var8, 1);
                this.method204(var7 + 1, 64, var8 + 1, 1);
            }
            if (arg1 == 2) {
                this.method204(var7, 16, var8, arg4 + 119);
                this.method204(var7 - 1, 1, var8 + 1, arg4 ^ 0xFFFFFF8B);
            }
            if (arg1 == 3) {
                this.method204(var7, 64, var8, arg4 + 119);
                this.method204(var7 - 1, 4, var8 - 1, 1);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method204(var7, 130, var8, 1);
                this.method204(var7, 8, var8 - 1, 1);
                this.method204(var7 + 1, 32, var8, arg4 + 119);
            }
            if (arg1 == 1) {
                this.method204(var7, 10, var8, 1);
                this.method204(var7 + 1, 32, var8, arg4 + 119);
                this.method204(var7, 128, var8 + 1, 1);
            }
            if (arg1 == 2) {
                this.method204(var7, 40, var8, 1);
                this.method204(var7, 128, var8 + 1, 1);
                this.method204(var7 - 1, 2, var8, 1);
            }
            if (arg1 == 3) {
                this.method204(var7, 160, var8, arg4 ^ 0xFFFFFF8B);
                this.method204(var7 - 1, 2, var8, 1);
                this.method204(var7, 8, var8 - 1, 1);
            }
        }
        if (arg2) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.method204(var7, 65536, var8, arg4 ^ 0xFFFFFF8B);
                    this.method204(var7, 4096, var8 - 1, 1);
                }
                if (arg1 == 1) {
                    this.method204(var7, 1024, var8, 1);
                    this.method204(var7 + 1, 16384, var8, arg4 ^ 0xFFFFFF8B);
                }
                if (arg1 == 2) {
                    this.method204(var7, 4096, var8, 1);
                    this.method204(var7, 65536, var8 + 1, 1);
                }
                if (arg1 == 3) {
                    this.method204(var7, 16384, var8, arg4 ^ 0xFFFFFF8B);
                    this.method204(var7 - 1, 1024, var8, 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.method204(var7, 512, var8, 1);
                    this.method204(var7 + 1, 8192, var8 - 1, 1);
                }
                if (arg1 == 1) {
                    this.method204(var7, 2048, var8, arg4 ^ 0xFFFFFF8B);
                    this.method204(var7 + 1, 32768, var8 + 1, 1);
                }
                if (arg1 == 2) {
                    this.method204(var7, 8192, var8, 1);
                    this.method204(var7 - 1, 512, var8 + 1, 1);
                }
                if (arg1 == 3) {
                    this.method204(var7, 32768, var8, 1);
                    this.method204(var7 - 1, 2048, var8 - 1, 1);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.method204(var7, 66560, var8, arg4 ^ 0xFFFFFF8B);
                    this.method204(var7, 4096, var8 - 1, 1);
                    this.method204(var7 + 1, 16384, var8, arg4 + 119);
                }
                if (arg1 == 1) {
                    this.method204(var7, 5120, var8, 1);
                    this.method204(var7 + 1, 16384, var8, 1);
                    this.method204(var7, 65536, var8 + 1, 1);
                }
                if (arg1 == 2) {
                    this.method204(var7, 20480, var8, 1);
                    this.method204(var7, 65536, var8 + 1, 1);
                    this.method204(var7 - 1, 1024, var8, 1);
                }
                if (arg1 == 3) {
                    this.method204(var7, 81920, var8, 1);
                    this.method204(var7 - 1, 1024, var8, 1);
                    this.method204(var7, 4096, var8 - 1, 1);
                }
            }
        }
        if (arg4 != -118) {
            this.field395 = -55;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 767)
    public final void method198(int arg0) {
        int var2 = 0;
        if (arg0 != 31407) {
            field400 = (class59) null;
        }
        while (var2 < this.field404) {
            for (int var3 = 0; var3 < this.field416; var3++) {
                if (var2 == 0 || var3 == 0 || this.field404 - 5 <= var2 || this.field416 - 5 <= var3) {
                    this.field409[var2][var3] = 16777215;
                } else {
                    this.field409[var2][var3] = 16777216;
                }
            }
            var2++;
        }
        field418++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIIII)Z", line = 799)
    private final boolean method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field419++;
        int var11 = arg8 + arg5;
        int var12 = arg4 + arg9;
        int var13 = arg1 + arg6;
        int var14 = 27 / ((-arg7 - 63) / 49);
        int var15 = arg0 + arg2;
        if (arg9 >= arg6 && arg9 < var13) {
            if (arg0 == var11 && (arg3 & 0x4) == 0) {
                int var16 = arg9;
                int var17 = var13 < var12 ? var13 : var12;
                while (var16 < var17) {
                    if ((this.field409[var16 - this.field395][var11 - this.field406 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var16++;
                }
            } else if (arg8 == var15 && (arg3 & 0x1) == 0) {
                int var18 = arg9;
                int var19 = var12 > var13 ? var13 : var12;
                while (var18 < var19) {
                    if ((this.field409[var18 - this.field395][arg8 - this.field406] & 0x20) == 0) {
                        return true;
                    }
                    var18++;
                }
            }
        } else if (arg6 < var12 && var13 >= var12) {
            if (arg0 == var11 && (arg3 & 0x4) == 0) {
                for (int var20 = arg6; var20 < var12; var20++) {
                    if ((this.field409[var20 - this.field395][var11 - this.field406 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var15 && (arg3 & 0x1) == 0) {
                for (int var21 = arg6; var21 < var12; var21++) {
                    if ((this.field409[var21 - this.field395][arg8 - this.field406] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg0 <= arg8 && arg8 < var15) {
            if (arg6 == var12 && (arg3 & 0x8) == 0) {
                int var22 = arg8;
                int var23 = var11 <= var15 ? var11 : var15;
                while (var23 > var22) {
                    if ((this.field409[var12 - this.field395 - 1][var22 - this.field406] & 0x8) == 0) {
                        return true;
                    }
                    var22++;
                }
            } else if (arg9 == var13 && (arg3 & 0x2) == 0) {
                int var24 = arg8;
                int var25 = var11 <= var15 ? var11 : var15;
                while (var25 > var24) {
                    if ((this.field409[arg9 - this.field395][var24 - this.field406] & 0x80) == 0) {
                        return true;
                    }
                    var24++;
                }
            }
        } else if (var11 > arg0 && var11 <= var15) {
            if (arg6 == var12 && (arg3 & 0x8) == 0) {
                for (int var26 = arg0; var26 < var11; var26++) {
                    if ((this.field409[var12 - this.field395 - 1][var26 - this.field406] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var13 && (arg3 & 0x2) == 0) {
                for (int var27 = arg0; var27 < var11; var27++) {
                    if ((this.field409[arg9 - this.field395][var27 - this.field406] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(IIIIIIIII)Z", line = 963)
    public final boolean method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field403++;
        if (arg5 <= 1) {
            int var10 = arg7 + arg8 - 1;
            int var11 = arg3 + arg4 - 1;
            if (arg6 >= arg8 && arg6 <= var10 && arg2 >= arg3 && var11 >= arg2) {
                return true;
            } else if (arg8 - 1 == arg6 && arg2 >= arg3 && arg2 <= var11 && (this.field409[arg6 - this.field395][arg2 - this.field406] & 0x8) == 0 && (arg0 & 0x8) == 0) {
                return true;
            } else if ((var10 + 1) == arg6 && arg2 >= arg3 && arg2 <= var11 && (this.field409[arg6 - this.field395][arg2 - this.field406] & 0x80) == 0 && (arg0 & 0x2) == 0) {
                return true;
            } else if (arg1 != 12801) {
                return true;
            } else if ((arg3 - 1) == arg2 && arg6 >= arg8 && var10 >= arg6 && (this.field409[arg6 - this.field395][arg2 - this.field406] & 0x2) == 0 && (arg0 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg2 && arg8 <= arg6 && var10 >= arg6 && (this.field409[arg6 - this.field395][arg2 - this.field406] & 0x20) == 0 && (arg0 & 0x1) == 0;
            }
        } else if (this.method191(arg7, arg4, arg5, arg2, 0, arg3, arg5, arg8, arg6)) {
            return true;
        } else {
            return this.method199(arg3, arg7, arg4, arg0, arg5, arg5, arg8, arg1 ^ 0xFFFFCD8B, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIZ)V", line = 1013)
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg3 - this.field395;
        field408++;
        int var9 = arg2 - this.field406;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg5;
            arg5 = arg1;
            arg1 = var10;
        }
        int var11 = 256;
        if (arg6) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < arg5 + var8; var12++) {
            if (var12 >= 0 && this.field404 > var12) {
                for (int var13 = var9; var13 < (var9 + arg1); var13++) {
                    if (var13 >= 0 && this.field416 > var13) {
                        this.method187(var13, 4, var12, var11);
                    }
                }
            }
        }
        if (arg0 != -3176) {
            this.method196(125, (byte) -13, 62, 109, -8);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V", line = 1065)
    public static final void method202(byte arg0) {
        while (true) {
            if (class18.field236.method1770(100, class146.field2387) >= 11) {
                int var1 = class18.field236.method1762((byte) 116, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class211.field3438[var1] == null) {
                        var2 = true;
                        class211.field3438[var1] = new class102();
                        if (class299.field5119[var1] != null) {
                            class211.field3438[var1].method775(class299.field5119[var1], 653112528);
                        }
                    }
                    class243.field4060[class29.field385++] = var1;
                    class102 var3 = class211.field3438[var1];
                    var3.field1761 = field420;
                    int var4 = class18.field236.method1762((byte) -114, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class18.field236.method1762((byte) 19, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class18.field236.method1762((byte) 60, 1);
                    int var7 = class18.field236.method1762((byte) -2, 1);
                    if (var7 == 1) {
                        class301.field5143[class255.field4242++] = var1;
                    }
                    int var8 = class301.field5142[class18.field236.method1762((byte) 88, 3)];
                    if (var2) {
                        var3.field1750 = var3.field1765 = var8;
                    }
                    var3.method780(var6 == 1, class286.field4920.field1773[0] + var4, class286.field4920.field1729[0] - -var5, (byte) 50);
                    continue;
                }
            }
            class18.field236.method1766(75);
            int var9 = -58 / ((10 - arg0) / 32);
            field394++;
            return;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIBIII)Z", line = 1129)
    public final boolean method203(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field412++;
        if (arg2 == 1) {
            if (arg5 == arg7 && arg1 == arg6) {
                return true;
            }
        } else if (arg7 <= arg5 && arg5 <= arg2 + arg7 - 1 && arg1 >= arg1 && (arg1 + arg2 - 1) >= arg1) {
            return true;
        }
        int var9 = arg5 - this.field395;
        int var10 = 59 % ((-arg4 - 34) / 51);
        int var11 = arg6 - this.field406;
        int var12 = arg1 - this.field406;
        int var13 = arg7 - this.field395;
        if (arg2 == 1) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if (var9 - 1 == var13 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var13 && (var12 + 1) == var11 && (this.field409[var13][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var13 && (var12 - 1) == var11 && (this.field409[var13][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var13 && var11 == var12 && (this.field409[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var13 && var11 == var12 && (this.field409[var13][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 + 1 == var13 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var13 && var12 + 1 == var11 && (this.field409[var13][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var13 && var12 - 1 == var11 && (this.field409[var13][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var13 && var12 - 1 == var11) {
                        return true;
                    }
                    if (var9 - 1 == var13 && var11 == var12 && (this.field409[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var11 == var12 && (this.field409[var13][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if ((var9 - 1) == var13 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var11 == var12 && (this.field409[var13][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var13 && var12 - 1 == var11 && (this.field409[var13][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var9 - 1) == var13 && var11 == var12 && (this.field409[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var13 && var12 - 1 == var11 && (this.field409[var13][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - 1 == var13 && var11 == var12 && (this.field409[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var13 && (var12 + 1) == var11 && (this.field409[var13][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var13 && var12 - 1 == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var9 - 1) == var13 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var13 && var12 + 1 == var11 && (this.field409[var13][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var11 == var12 && (this.field409[var13][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var13 && var12 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 == var13 && (var12 + 1) == var11 && (this.field409[var13][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var13 && (var12 - 1) == var11 && (this.field409[var13][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var13 && var11 == var12 && (this.field409[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var13 && var11 == var12 && (this.field409[var13][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg2 + var13 - 1;
            int var15 = arg2 + var11 - 1;
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if (var9 - arg2 == var13 && var11 <= var12 && var12 <= var15) {
                        return true;
                    }
                    if (var9 >= var13 && var9 <= var14 && var12 + 1 == var11 && (this.field409[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var13 && var9 <= var14 && (var12 - arg2) == var11 && (this.field409[var9][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 >= var13 && var14 >= var9 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 - arg2 == var13 && var12 >= var11 && var12 <= var15 && (this.field409[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var11 <= var12 && var15 >= var12 && (this.field409[var13][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 + 1) == var13 && var12 >= var11 && var12 <= var15) {
                        return true;
                    }
                    if (var13 <= var9 && var14 >= var9 && (var12 + 1) == var11 && (this.field409[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var13 && var14 >= var9 && (var12 - arg2) == var11 && (this.field409[var9][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 >= var13 && var9 <= var14 && var12 - arg2 == var11) {
                        return true;
                    }
                    if (var9 - arg2 == var13 && var11 <= var12 && var15 >= var12 && (this.field409[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var11 <= var12 && var12 <= var15 && (this.field409[var13][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if ((var9 - arg2) == var13 && var12 >= var11 && var15 >= var12) {
                        return true;
                    }
                    if (var13 <= var9 && var9 <= var14 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var13 && var12 >= var11 && var15 >= var12 && (this.field409[var13][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var13 && var14 >= var9 && (var12 - arg2) == var11 && (this.field409[var9][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var9 - arg2) == var13 && var11 <= var12 && var12 <= var15 && (this.field409[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var13 <= var9 && var9 <= var14 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var13 && var12 >= var11 && var12 <= var15) {
                        return true;
                    }
                    if (var9 >= var13 && var9 <= var14 && var12 - arg2 == var11 && (this.field409[var9][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - arg2 == var13 && var12 >= var11 && var12 <= var15 && (this.field409[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var13 <= var9 && var14 >= var9 && var12 + 1 == var11 && (this.field409[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var13 && var11 <= var12 && var12 <= var15) {
                        return true;
                    }
                    if (var9 >= var13 && var14 >= var9 && (var12 - arg2) == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 - arg2 == var13 && var12 >= var11 && var12 <= var15) {
                        return true;
                    }
                    if (var13 <= var9 && var9 <= var14 && var12 + 1 == var11 && (this.field409[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var12 >= var11 && var15 >= var12 && (this.field409[var13][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var13 && var9 <= var14 && (var12 - arg2) == var11) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 >= var13 && var9 <= var14 && (var12 + 1) == var11 && (this.field409[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var13 <= var9 && var14 >= var9 && var12 - arg2 == var11 && (this.field409[var9][var15] & 0x12C0102) == 0) {
                    return true;
                }
                if (var9 - arg2 == var13 && var11 <= var12 && var12 <= var15 && (this.field409[var14][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var13 && var12 >= var11 && var15 >= var12 && (this.field409[var13][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(IIII)V", line = 1498)
    private final void method204(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1) {
            this.method204(-47, 45, 25, 110);
        }
        field397++;
        this.field409[arg2][arg0] = class239.method1677(this.field409[arg2][arg0], arg1);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lib;I)V", line = 1521)
    public static final void method205(class286 arg0, int arg1) {
        long var2 = (long) arg1;
        field417++;
        int var4 = 0;
        int var5 = -1;
        int var6 = 0;
        if (arg0.field4926 == 0) {
            var2 = class4.method25(arg0.field4913, arg0.field4921, arg0.field4910);
        }
        if (arg0.field4926 == 1) {
            var2 = class155.method1109(arg0.field4913, arg0.field4921, arg0.field4910);
        }
        if (arg0.field4926 == 2) {
            var2 = class316.method2179(arg0.field4913, arg0.field4921, arg0.field4910);
        }
        if (arg0.field4926 == 3) {
            var2 = class1.method10(arg0.field4913, arg0.field4921, arg0.field4910);
        }
        if (var2 != 0L) {
            var4 = ((int) var2 & 0x7C872) >> 14;
            var5 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg0.field4909 = var5;
        arg0.field4915 = var4;
        arg0.field4919 = var6;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(II)V", line = 1557)
    public class30(int arg0, int arg1) {
        this.field416 = arg1;
        this.field406 = 0;
        this.field404 = arg0;
        this.field409 = new int[this.field404][this.field416];
        this.field395 = 0;
        this.method198(31407);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBZIII)V", line = 1571)
    public final void method206(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field406;
        field399++;
        int var8 = arg5 - this.field395;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method187(var7, 4, var8, 128);
                this.method187(var7, 4, var8 - 1, 8);
            }
            if (arg3 == 1) {
                this.method187(var7, 4, var8, 2);
                this.method187(var7 + 1, 4, var8, 32);
            }
            if (arg3 == 2) {
                this.method187(var7, 4, var8, 8);
                this.method187(var7, 4, var8 + 1, 128);
            }
            if (arg3 == 3) {
                this.method187(var7, 4, var8, 32);
                this.method187(var7 - 1, 4, var8, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method187(var7, 4, var8, 1);
                this.method187(var7 + 1, 4, var8 - 1, 16);
            }
            if (arg3 == 1) {
                this.method187(var7, 4, var8, 4);
                this.method187(var7 + 1, 4, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method187(var7, 4, var8, 16);
                this.method187(var7 - 1, 4, var8 + 1, 1);
            }
            if (arg3 == 3) {
                this.method187(var7, 4, var8, 64);
                this.method187(var7 - 1, 4, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method187(var7, 4, var8, 130);
                this.method187(var7, 4, var8 - 1, 8);
                this.method187(var7 + 1, 4, var8, 32);
            }
            if (arg3 == 1) {
                this.method187(var7, 4, var8, 10);
                this.method187(var7 + 1, 4, var8, 32);
                this.method187(var7, 4, var8 + 1, 128);
            }
            if (arg3 == 2) {
                this.method187(var7, 4, var8, 40);
                this.method187(var7, 4, var8 + 1, 128);
                this.method187(var7 - 1, 4, var8, 2);
            }
            if (arg3 == 3) {
                this.method187(var7, 4, var8, 160);
                this.method187(var7 - 1, 4, var8, 2);
                this.method187(var7, 4, var8 - 1, 8);
            }
        }
        if (arg2) {
            if (arg4 == 0) {
                if (arg3 == 0) {
                    this.method187(var7, 4, var8, 65536);
                    this.method187(var7, 4, var8 - 1, 4096);
                }
                if (arg3 == 1) {
                    this.method187(var7, 4, var8, 1024);
                    this.method187(var7 + 1, 4, var8, 16384);
                }
                if (arg3 == 2) {
                    this.method187(var7, 4, var8, 4096);
                    this.method187(var7, 4, var8 + 1, 65536);
                }
                if (arg3 == 3) {
                    this.method187(var7, 4, var8, 16384);
                    this.method187(var7 - 1, 4, var8, 1024);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg3 == 0) {
                    this.method187(var7, 4, var8, 512);
                    this.method187(var7 + 1, 4, var8 - 1, 8192);
                }
                if (arg3 == 1) {
                    this.method187(var7, 4, var8, 2048);
                    this.method187(var7 + 1, 4, var8 + 1, 32768);
                }
                if (arg3 == 2) {
                    this.method187(var7, 4, var8, 8192);
                    this.method187(var7 - 1, 4, var8 + 1, 512);
                }
                if (arg3 == 3) {
                    this.method187(var7, 4, var8, 32768);
                    this.method187(var7 - 1, 4, var8 - 1, 2048);
                }
            }
            if (arg4 == 2) {
                if (arg3 == 0) {
                    this.method187(var7, 4, var8, 66560);
                    this.method187(var7, 4, var8 - 1, 4096);
                    this.method187(var7 + 1, 4, var8, 16384);
                }
                if (arg3 == 1) {
                    this.method187(var7, 4, var8, 5120);
                    this.method187(var7 + 1, 4, var8, 16384);
                    this.method187(var7, 4, var8 + 1, 65536);
                }
                if (arg3 == 2) {
                    this.method187(var7, 4, var8, 20480);
                    this.method187(var7, 4, var8 + 1, 65536);
                    this.method187(var7 - 1, 4, var8, 1024);
                }
                if (arg3 == 3) {
                    this.method187(var7, 4, var8, 81920);
                    this.method187(var7 - 1, 4, var8, 1024);
                    this.method187(var7, 4, var8 - 1, 4096);
                }
            }
        }
        if (arg1 < 94) {
            field402 = 20;
        }
    }
}
