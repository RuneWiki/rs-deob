import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class102 {

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    private int field1790 = 0;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    private int field1768 = 0;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    private int field1774;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[[I")
    public int[][] field1769;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lcf;")
    public static class93 field1773 = class147.method1066("rouge:", -48);

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Lcf;")
    public static class93 field1781 = class147.method1066("name_icons", -48);

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "Lcf;")
    public static class93 field1782 = class147.method1066(":duelfriend:", -48);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lhg;")
    public static class177 field1771;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILtg;)I")
    public static final int method732(int arg0, int arg1, class181 arg2) {
        field1772++;
        if (arg2.field3313 == null || arg0 >= arg2.field3313.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int var4 = -96 % ((arg1 + 20) / 61);
            byte var5 = 0;
            int[] var6 = arg2.field3313[arg0];
            int var7 = 0;
            while (true) {
                int var8 = var6[var7++];
                int var9 = 0;
                byte var10 = 0;
                if (var8 == 0) {
                    return var3;
                }
                if (var8 == 15) {
                    var10 = 1;
                }
                if (var8 == 1) {
                    var9 = class172.field3014[var6[var7++]];
                }
                if (var8 == 2) {
                    var9 = class144.field2491[var6[var7++]];
                }
                if (var8 == 3) {
                    var9 = class273.field4866[var6[var7++]];
                }
                if (var8 == 16) {
                    var10 = 2;
                }
                if (var8 == 4) {
                    int var11 = var6[var7++] << 16;
                    int var12 = var11 + var6[var7++];
                    class181 var13 = client.method1114(-20985, var12);
                    int var14 = var6[var7++];
                    if (var14 != -1 && (!class89.method617(var14, 0).field424 || class144.field2494)) {
                        for (int var15 = 0; var15 < var13.field3301.length; var15++) {
                            if ((var14 + 1) == var13.field3301[var15]) {
                                var9 += var13.field3304[var15];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var9 = class176.field3061[var6[var7++]];
                }
                if (var8 == 17) {
                    var10 = 3;
                }
                if (var8 == 6) {
                    var9 = class63.field1148[class144.field2491[var6[var7++]] - 1];
                }
                if (var8 == 7) {
                    var9 = class176.field3061[var6[var7++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var9 = class166.field2927.field4228;
                }
                if (var8 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class13.field163[var16]) {
                            var9 += class144.field2491[var16];
                        }
                    }
                }
                if (var8 == 10) {
                    int var17 = var6[var7++] << 16;
                    int var18 = var17 + var6[var7++];
                    class181 var19 = client.method1114(-20985, var18);
                    int var20 = var6[var7++];
                    if (var20 != -1 && (!class89.method617(var20, 0).field424 || class144.field2494)) {
                        for (int var21 = 0; var21 < var19.field3301.length; var21++) {
                            if ((var20 + 1) == var19.field3301[var21]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var9 = class89.field1592;
                }
                if (var8 == 12) {
                    var9 = class121.field2173;
                }
                if (var8 == 13) {
                    int var22 = class176.field3061[var6[var7++]];
                    int var23 = var6[var7++];
                    var9 = (var22 & 0x1 << var23) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var24 = var6[var7++];
                    var9 = class159.method1148(1051585612, var24);
                }
                if (var8 == 18) {
                    var9 = (class166.field2927.field3868 >> 7) + class229.field4111;
                }
                if (var8 == 19) {
                    var9 = (class166.field2927.field3784 >> 7) + class4.field52;
                }
                if (var8 == 20) {
                    var9 = var6[var7++];
                }
                if (var10 == 0) {
                    if (var5 == 0) {
                        var3 += var9;
                    }
                    if (var5 == 1) {
                        var3 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var3 /= var9;
                    }
                    if (var5 == 3) {
                        var3 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var10;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method733(byte arg0) {
        if (arg0 != -93) {
            method733((byte) 71);
        }
        field1781 = null;
        field1771 = null;
        field1782 = null;
        field1773 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1788++;
        if (arg3 + arg8 > arg5 && arg5 + arg2 > arg8) {
            if (arg7 != -11590) {
                this.method734(-19, 118, 14, -6, -49, 16, -32, 84, 19);
            }
            return arg4 < arg1 + arg6 && arg0 + arg4 > arg6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIZ)V")
    public final void method735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field1790;
        int var9 = arg5 - this.field1768;
        if (arg0 != 5) {
            return;
        }
        int var10 = 256;
        field1767++;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg4;
            arg4 = arg3;
            arg3 = var11;
        }
        if (arg6) {
            var10 += 131072;
        }
        for (int var12 = var9; var12 < (arg4 + var9); var12++) {
            if (var12 >= 0 && var12 < this.field1789) {
                for (int var13 = var8; var13 < (arg3 + var8); var13++) {
                    if (var13 >= 0 && var13 < this.field1774) {
                        this.method750(var10, var12, 19661058, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIBI)Z")
    public final boolean method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field1779++;
        if (arg3 == 1) {
            if (arg0 == arg1 && arg5 == arg7) {
                return true;
            }
        } else if (arg0 >= arg1 && arg0 <= (arg1 + arg3 - 1) && arg5 >= arg5 && (arg5 + arg3 - 1) >= arg5) {
            return true;
        }
        int var9 = arg1 - this.field1768;
        int var10 = -46 / ((80 - arg6) / 33);
        int var11 = arg5 - this.field1790;
        int var12 = arg0 - this.field1768;
        int var13 = arg7 - this.field1790;
        if (arg3 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var12 + 1) == var9 && var11 == var13 && (this.field1769[var9][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var13 && (this.field1769[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - 1) == var9 && var11 == var13 && (this.field1769[var9][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var13 && (this.field1769[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - 1 == var9 && var11 == var13 && (this.field1769[var9][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var13 && (this.field1769[var9][var13] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var12 + 1) == var9 && var11 == var13 && (this.field1769[var9][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var13 && (this.field1769[var9][var13] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var12 && (var11 + 1) == var13 && (this.field1769[var9][var13] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var13 && (this.field1769[var9][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var11 == var13 && (this.field1769[var9][var13] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var11 == var13 && (this.field1769[var9][var13] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg3 + var9 - 1;
            int var15 = arg3 + var13 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var12 + 1) == var9 && var11 >= var13 && var11 <= var15 && (this.field1769[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var14 >= var12 && (var11 - arg3) == var13 && (this.field1769[var12][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 - arg3 == var9 && var13 <= var11 && var15 >= var11 && (this.field1769[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var14 >= var12 && var11 - arg3 == var13 && (this.field1769[var12][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - arg3 == var9 && var13 <= var11 && var11 <= var15 && (this.field1769[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && var11 + 1 == var13 && (this.field1769[var12][var13] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 + 1 == var9 && var11 >= var13 && var15 >= var11 && (this.field1769[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && (var11 + 1) == var13 && (this.field1769[var12][var13] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var12 >= var9 && var14 >= var12 && var11 + 1 == var13 && (this.field1769[var12][var13] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var9 && var14 >= var12 && var11 - arg3 == var13 && (this.field1769[var12][var15] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg3 == var9 && var11 >= var13 && var15 >= var11 && (this.field1769[var14][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var13 <= var11 && var15 >= var11 && (this.field1769[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIIIIIIII)Z")
    public final boolean method737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1764++;
        if (arg0 > 1) {
            return this.method734(arg0, arg5, arg0, arg4, arg8, arg3, arg7, -11590, arg1) ? true : this.method749(arg5, arg7, arg8, arg0, (byte) 66, arg4, arg0, arg6, arg1, arg3);
        }
        int var10 = arg4 + arg1 - 1;
        int var11 = arg5 + arg7 - 1;
        if (arg2 <= 48) {
            return false;
        } else if (arg1 <= arg3 && var10 >= arg3 && arg7 <= arg8 && var11 >= arg8) {
            return true;
        } else if ((arg1 - 1) == arg3 && arg7 <= arg8 && var11 >= arg8 && (this.field1769[arg3 - this.field1768][arg8 - this.field1790] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg3 && arg8 >= arg7 && var11 >= arg8 && (this.field1769[arg3 - this.field1768][arg8 - this.field1790] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg8 && arg3 >= arg1 && arg3 <= var10 && (this.field1769[arg3 - this.field1768][arg8 - this.field1790] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg8 && arg3 >= arg1 && var10 >= arg3 && (this.field1769[arg3 - this.field1768][arg8 - this.field1790] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIZB)V")
    public final void method738(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        int var7 = 256;
        int var8 = arg0 - this.field1790;
        field1770++;
        int var9 = arg1 - this.field1768;
        if (arg5 != 44) {
            return;
        }
        if (arg4) {
            var7 += 131072;
        }
        for (int var10 = var9; var10 < (arg3 + var9); var10++) {
            if (var10 >= 0 && var10 < this.field1789) {
                for (int var11 = var8; var11 < (arg2 + var8); var11++) {
                    if (var11 >= 0 && this.field1774 > var11) {
                        this.method741(var7, var11, (byte) -126, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII)V")
    public final void method739(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1768;
        field1777++;
        int var5 = arg2 - this.field1790;
        if (arg0 < 88) {
            this.field1768 = 24;
        }
        this.field1769[var4][var5] = class58.method333(this.field1769[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIZI)V")
    public final void method740(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1786++;
        int var7 = arg1 - this.field1768;
        int var8 = arg0 - this.field1790;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method750(128, var7, 19661058, var8);
                this.method750(8, var7 - 1, 19661058, var8);
            }
            if (arg5 == 1) {
                this.method750(2, var7, 19661058, var8);
                this.method750(32, var7, 19661058, var8 + 1);
            }
            if (arg5 == 2) {
                this.method750(8, var7, 19661058, var8);
                this.method750(128, var7 + 1, 19661058, var8);
            }
            if (arg5 == 3) {
                this.method750(32, var7, 19661058, var8);
                this.method750(2, var7, 19661058, var8 - 1);
            }
        }
        if (arg3 <= 3) {
            this.method742(-60, 29, -40);
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method750(1, var7, 19661058, var8);
                this.method750(16, var7 - 1, 19661058, var8 + 1);
            }
            if (arg5 == 1) {
                this.method750(4, var7, 19661058, var8);
                this.method750(64, var7 + 1, 19661058, var8 + 1);
            }
            if (arg5 == 2) {
                this.method750(16, var7, 19661058, var8);
                this.method750(1, var7 + 1, 19661058, var8 - 1);
            }
            if (arg5 == 3) {
                this.method750(64, var7, 19661058, var8);
                this.method750(4, var7 - 1, 19661058, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method750(130, var7, 19661058, var8);
                this.method750(8, var7 - 1, 19661058, var8);
                this.method750(32, var7, 19661058, var8 + 1);
            }
            if (arg5 == 1) {
                this.method750(10, var7, 19661058, var8);
                this.method750(32, var7, 19661058, var8 + 1);
                this.method750(128, var7 + 1, 19661058, var8);
            }
            if (arg5 == 2) {
                this.method750(40, var7, 19661058, var8);
                this.method750(128, var7 + 1, 19661058, var8);
                this.method750(2, var7, 19661058, var8 - 1);
            }
            if (arg5 == 3) {
                this.method750(160, var7, 19661058, var8);
                this.method750(2, var7, 19661058, var8 - 1);
                this.method750(8, var7 - 1, 19661058, var8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method750(65536, var7, 19661058, var8);
                this.method750(4096, var7 - 1, 19661058, var8);
            }
            if (arg5 == 1) {
                this.method750(1024, var7, 19661058, var8);
                this.method750(16384, var7, 19661058, var8 + 1);
            }
            if (arg5 == 2) {
                this.method750(4096, var7, 19661058, var8);
                this.method750(65536, var7 + 1, 19661058, var8);
            }
            if (arg5 == 3) {
                this.method750(16384, var7, 19661058, var8);
                this.method750(1024, var7, 19661058, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method750(512, var7, 19661058, var8);
                this.method750(8192, var7 - 1, 19661058, var8 + 1);
            }
            if (arg5 == 1) {
                this.method750(2048, var7, 19661058, var8);
                this.method750(32768, var7 + 1, 19661058, var8 + 1);
            }
            if (arg5 == 2) {
                this.method750(8192, var7, 19661058, var8);
                this.method750(512, var7 + 1, 19661058, var8 - 1);
            }
            if (arg5 == 3) {
                this.method750(32768, var7, 19661058, var8);
                this.method750(2048, var7 - 1, 19661058, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method750(66560, var7, 19661058, var8);
            this.method750(4096, var7 - 1, 19661058, var8);
            this.method750(16384, var7, 19661058, var8 + 1);
        }
        if (arg5 == 1) {
            this.method750(5120, var7, 19661058, var8);
            this.method750(16384, var7, 19661058, var8 + 1);
            this.method750(65536, var7 + 1, 19661058, var8);
        }
        if (arg5 == 2) {
            this.method750(20480, var7, 19661058, var8);
            this.method750(65536, var7 + 1, 19661058, var8);
            this.method750(1024, var7, 19661058, var8 - 1);
        }
        if (arg5 == 3) {
            this.method750(81920, var7, 19661058, var8);
            this.method750(1024, var7, 19661058, var8 - 1);
            this.method750(4096, var7 - 1, 19661058, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIBI)V")
    private final void method741(int arg0, int arg1, byte arg2, int arg3) {
        this.field1769[arg3][arg1] = class270.method1797(this.field1769[arg3][arg1], arg0);
        int var5 = -79 / ((arg2 + 64) / 61);
        field1765++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
    public final void method742(int arg0, int arg1, int arg2) {
        field1785++;
        int var4 = arg1 - this.field1768;
        int var5 = arg0 - this.field1790;
        this.field1769[var4][var5] = class270.method1797(this.field1769[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([IIIIII)V")
    public static final void method743(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class41 var6 = class232.field4138[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class61 var7 = var6.field633;
        if (var7 != null) {
            int var8 = var7.field1036;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class21 var10 = var6.field639;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field271;
        int var12 = var10.field273;
        int var13 = var10.field268;
        int var14 = var10.field274;
        int[] var15 = class246.field4430[var11];
        int[] var16 = class73.field1305[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1787++;
        if (arg3 == 1) {
            if (arg1 == arg5 && arg4 == arg7) {
                return true;
            }
        } else if (arg1 >= arg5 && (arg3 + arg5 - 1) >= arg1 && arg4 <= arg4 && arg4 - (1 - arg3) >= arg4) {
            return true;
        }
        int var9 = arg7 - this.field1790;
        int var10 = arg1 - this.field1768;
        int var11 = arg4 - this.field1790;
        if (arg2 < 108) {
            this.method744(-68, -102, -40, -61, -10, 4, 21, -5);
        }
        int var12 = arg5 - this.field1768;
        if (arg3 == 1) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field1769[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field1769[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1769[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field1769[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field1769[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field1769[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1769[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1769[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field1769[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field1769[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field1769[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field1769[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1769[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field1769[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field1769[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1769[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 == var12 && (var11 + 1) == var9 && (this.field1769[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var11 - 1) == var9 && (this.field1769[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field1769[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 == var11 && (this.field1769[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg3 - 1;
            int var14 = var9 + arg3 - 1;
            if (arg0 == 0) {
                if (arg6 == 0) {
                    if (var10 - arg3 == var12 && var11 >= var9 && var14 >= var11) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var11 + 1) == var9 && (this.field1769[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var11 - arg3 == var9 && (this.field1769[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 <= var10 && var13 >= var10 && (var11 + 1) == var9) {
                        return true;
                    }
                    if ((var10 - arg3) == var12 && var11 >= var9 && var11 <= var14 && (this.field1769[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var14 >= var11 && (this.field1769[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 + 1 == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var11 + 1) == var9 && (this.field1769[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var11 - arg3) == var9 && (this.field1769[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 >= var12 && var10 <= var13 && var11 - arg3 == var9) {
                        return true;
                    }
                    if (var10 - arg3 == var12 && var11 >= var9 && var11 <= var14 && (this.field1769[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var14 && (this.field1769[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    if ((var10 - arg3) == var12 && var11 >= var9 && var14 >= var11) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var11 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 <= var11 && var11 <= var14 && (this.field1769[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var11 - arg3) == var9 && (this.field1769[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var10 - arg3) == var12 && var9 <= var11 && var14 >= var11 && (this.field1769[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var11 - arg3) == var9 && (this.field1769[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - arg3 == var12 && var11 >= var9 && var14 >= var11 && (this.field1769[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var11 + 1) == var9 && (this.field1769[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 - arg3 == var9) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 - arg3 == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var11 + 1) == var9 && (this.field1769[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 <= var11 && var14 >= var11 && (this.field1769[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var11 - arg3 == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 >= var12 && var10 <= var13 && (var11 + 1) == var9 && (this.field1769[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var12 && var13 >= var10 && var11 - arg3 == var9 && (this.field1769[var10][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var10 - arg3 == var12 && var11 >= var9 && var11 <= var14 && (this.field1769[var13][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 <= var11 && var11 <= var14 && (this.field1769[var12][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIZII)V")
    public final void method745(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1775++;
        int var7 = arg0 - this.field1768;
        int var8 = arg4 - this.field1790;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method741(128, var8, (byte) -126, var7);
                this.method741(8, var8, (byte) -128, var7 - 1);
            }
            if (arg5 == 1) {
                this.method741(2, var8, (byte) 33, var7);
                this.method741(32, var8 + 1, (byte) -128, var7);
            }
            if (arg5 == 2) {
                this.method741(8, var8, (byte) 67, var7);
                this.method741(128, var8, (byte) 96, var7 + 1);
            }
            if (arg5 == 3) {
                this.method741(32, var8, (byte) 47, var7);
                this.method741(2, var8 - 1, (byte) -126, var7);
            }
        }
        if (arg1 != -1) {
            return;
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method741(1, var8, (byte) -126, var7);
                this.method741(16, var8 + 1, (byte) -126, var7 - 1);
            }
            if (arg5 == 1) {
                this.method741(4, var8, (byte) 5, var7);
                this.method741(64, var8 + 1, (byte) -125, var7 + 1);
            }
            if (arg5 == 2) {
                this.method741(16, var8, (byte) 100, var7);
                this.method741(1, var8 - 1, (byte) 25, var7 + 1);
            }
            if (arg5 == 3) {
                this.method741(64, var8, (byte) -128, var7);
                this.method741(4, var8 - 1, (byte) -128, var7 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method741(130, var8, (byte) 97, var7);
                this.method741(8, var8, (byte) 103, var7 - 1);
                this.method741(32, var8 + 1, (byte) 27, var7);
            }
            if (arg5 == 1) {
                this.method741(10, var8, (byte) 59, var7);
                this.method741(32, var8 + 1, (byte) 37, var7);
                this.method741(128, var8, (byte) -127, var7 + 1);
            }
            if (arg5 == 2) {
                this.method741(40, var8, (byte) -125, var7);
                this.method741(128, var8, (byte) 71, var7 + 1);
                this.method741(2, var8 - 1, (byte) 17, var7);
            }
            if (arg5 == 3) {
                this.method741(160, var8, (byte) 88, var7);
                this.method741(2, var8 - 1, (byte) 70, var7);
                this.method741(8, var8, (byte) -127, var7 - 1);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method741(65536, var8, (byte) -126, var7);
                this.method741(4096, var8, (byte) 107, var7 - 1);
            }
            if (arg5 == 1) {
                this.method741(1024, var8, (byte) 48, var7);
                this.method741(16384, var8 + 1, (byte) -128, var7);
            }
            if (arg5 == 2) {
                this.method741(4096, var8, (byte) 76, var7);
                this.method741(65536, var8, (byte) -125, var7 + 1);
            }
            if (arg5 == 3) {
                this.method741(16384, var8, (byte) -126, var7);
                this.method741(1024, var8 - 1, (byte) -128, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method741(512, var8, (byte) 115, var7);
                this.method741(8192, var8 + 1, (byte) 80, var7 - 1);
            }
            if (arg5 == 1) {
                this.method741(2048, var8, (byte) -126, var7);
                this.method741(32768, var8 + 1, (byte) 49, var7 + 1);
            }
            if (arg5 == 2) {
                this.method741(8192, var8, (byte) -126, var7);
                this.method741(512, var8 - 1, (byte) 34, var7 + 1);
            }
            if (arg5 == 3) {
                this.method741(32768, var8, (byte) -128, var7);
                this.method741(2048, var8 - 1, (byte) -125, var7 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method741(66560, var8, (byte) -128, var7);
            this.method741(4096, var8, (byte) -127, var7 - 1);
            this.method741(16384, var8 + 1, (byte) 121, var7);
        }
        if (arg5 == 1) {
            this.method741(5120, var8, (byte) 116, var7);
            this.method741(16384, var8 + 1, (byte) -127, var7);
            this.method741(65536, var8, (byte) 72, var7 + 1);
        }
        if (arg5 == 2) {
            this.method741(20480, var8, (byte) -128, var7);
            this.method741(65536, var8, (byte) -127, var7 + 1);
            this.method741(1024, var8 - 1, (byte) 70, var7);
        }
        if (arg5 == 3) {
            this.method741(81920, var8, (byte) -128, var7);
            this.method741(1024, var8 - 1, (byte) -128, var7);
            this.method741(4096, var8, (byte) -126, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)V")
    public final void method746(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field1790;
        int var5 = 56 / ((17 - arg1) / 55);
        field1780++;
        int var6 = arg2 - this.field1768;
        this.field1769[var6][var4] = class270.method1797(this.field1769[var6][var4], 262144);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method747(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class53.field867 * arg3 + class40.field624 * arg0 >> 16;
        int var6 = class40.field624 * arg3 - class53.field867 * arg0 >> 16;
        int var7 = class266.field4734 * var6 + class218.field3981 * arg1 >> 16;
        int var8 = class266.field4734 * arg1 - class218.field3981 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class266.field4734 * var6 + class218.field3981 * arg2 >> 16;
        int var12 = class266.field4734 * arg2 - class218.field3981 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class231.field4134 && var13 < class231.field4134) {
            return false;
        } else if (var9 > class216.field3931 && var13 > class216.field3931) {
            return false;
        } else if (var10 < class14.field169 && var14 < class14.field169) {
            return false;
        } else {
            return var10 <= class204.field3685 || var14 <= class204.field3685;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public final void method748(boolean arg0) {
        field1783++;
        int var2 = 0;
        if (arg0) {
            this.method746(1, (byte) -69, 79);
        }
        while (this.field1789 > var2) {
            for (int var3 = 0; var3 < this.field1774; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1789 - 5 <= var2 || var3 >= this.field1774 - 5) {
                    this.field1769[var2][var3] = 16777215;
                } else {
                    this.field1769[var2][var3] = 16777216;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIBIIIII)Z")
    private final boolean method749(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1766++;
        int var11 = 101 / ((arg4 + 31) / 46);
        int var12 = arg6 + arg9;
        int var13 = arg2 + arg3;
        int var14 = arg5 + arg8;
        int var15 = arg1 + arg0;
        if (arg9 >= arg8 && arg9 < var14) {
            if (arg1 == var13 && (arg7 & 0x4) == 0) {
                int var16 = var14 < var12 ? var14 : var12;
                for (int var17 = arg9; var17 < var16; var17++) {
                    if ((this.field1769[var17 - this.field1768][var13 - this.field1790 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var15 && (arg7 & 0x1) == 0) {
                int var18 = arg9;
                int var19 = var12 > var14 ? var14 : var12;
                while (var18 < var19) {
                    if ((this.field1769[var18 - this.field1768][arg2 - this.field1790] & 0x20) == 0) {
                        return true;
                    }
                    var18++;
                }
            }
        } else if (var12 > arg8 && var12 <= var14) {
            if (arg1 == var13 && (arg7 & 0x4) == 0) {
                for (int var20 = arg8; var20 < var12; var20++) {
                    if ((this.field1769[var20 - this.field1768][var13 - this.field1790 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var15 && (arg7 & 0x1) == 0) {
                for (int var21 = arg8; var21 < var12; var21++) {
                    if ((this.field1769[var21 - this.field1768][arg2 - this.field1790] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg2 >= arg1 && arg2 < var15) {
            if (arg8 == var12 && (arg7 & 0x8) == 0) {
                int var22 = arg2;
                int var23 = var13 > var15 ? var15 : var13;
                while (var22 < var23) {
                    if ((this.field1769[var12 - this.field1768 - 1][var22 - this.field1790] & 0x8) == 0) {
                        return true;
                    }
                    var22++;
                }
            } else if (arg9 == var14 && (arg7 & 0x2) == 0) {
                int var24 = arg2;
                int var25 = var15 < var13 ? var15 : var13;
                while (var25 > var24) {
                    if ((this.field1769[arg9 - this.field1768][var24 - this.field1790] & 0x80) == 0) {
                        return true;
                    }
                    var24++;
                }
            }
        } else if (arg1 < var13 && var15 >= var13) {
            if (arg8 == var12 && (arg7 & 0x8) == 0) {
                for (int var26 = arg1; var26 < var13; var26++) {
                    if ((this.field1769[var12 - this.field1768 - 1][var26 - this.field1790] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var14 && (arg7 & 0x2) == 0) {
                for (int var27 = arg1; var27 < var13; var27++) {
                    if ((this.field1769[arg9 - this.field1768][var27 - this.field1790] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)V")
    private final void method750(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 19661058) {
            this.field1769[arg1][arg3] = class58.method333(this.field1769[arg1][arg3], ~arg0);
            field1784++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqb;")
    public static final class58 method751(Throwable arg0, String arg1) {
        class58 var2;
        if (arg0 instanceof class58) {
            var2 = (class58) arg0;
            var2.field983 = var2.field983 + ' ' + arg1;
        } else {
            var2 = new class58(arg0, arg1);
        }
        field1778++;
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(II)V")
    public class102(int arg0, int arg1) {
        this.field1774 = arg1;
        this.field1789 = arg0;
        this.field1769 = new int[this.field1789][this.field1774];
        this.method748(false);
    }
}
