import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class36 extends class30 {

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    private int field449 = 0;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    private int field444 = 0;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    private int field453 = 0;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Lpl;")
    public static class388 field437 = new class388();

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "[I")
    public static int[] field457 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "[I")
    public static int[] field441;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
    public static final void method233(byte arg0) {
        if (arg0 < -92) {
            for (int var1 = 0; var1 < 5; ++var1) {
                class8.field107[var1] = false;
            }
            ++field454;
            class346.field5332 = class108.field1516;
            class181.field2966 = 0;
            class222.field3689 = class427.field6301;
            class217.field3557 = 0;
            class305.field4844 = -1;
            class13.field194 = 5;
            class138.field2156 = class183.field2987;
            class234.field3917 = class290.field4631;
            class254.field4125 = -1;
            class40.field503 = class396.field5928;
            class150.field2345 = class379.field5733;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljd;IZ)V")
    public static final void method234(class124 arg0, int arg1, boolean arg2) {
        ++field443;
        class349 var3 = arg0.method912(-5);
        if (~arg0.field1909 == -1) {
            arg0.field1903 = 0;
            class290.field4634 = -1;
            class415.field6145 = 0;
        } else {
            if (~arg0.field1878 != 0 && arg0.field1880 == 0) {
                class417 var4 = class156.method1099(arg0.field1878, 124);
                if (arg0.field1911 > 0 && ~var4.field6175 == -1) {
                    class415.field6145 = 0;
                    ++arg0.field1903;
                    class290.field4634 = -1;
                    return;
                }
                if (~arg0.field1911 >= -1 && ~var4.field6170 == -1) {
                    class415.field6145 = 0;
                    class290.field4634 = -1;
                    ++arg0.field1903;
                    return;
                }
            }
            if (arg0.field1873 != -1 && arg0.field1886 <= class183.field2987) {
                class379 var5 = class115.method839((byte) -57, arg0.field1873);
                if (var5.field5731 && var5.field5734 != -1) {
                    class417 var6 = class156.method1099(var5.field5734, 90);
                    if (~arg0.field1911 < -1 && var6.field6175 == 0) {
                        class415.field6145 = 0;
                        class290.field4634 = -1;
                        ++arg0.field1903;
                        return;
                    }
                    if (~arg0.field1911 >= -1 && ~var6.field6170 == -1) {
                        class415.field6145 = 0;
                        ++arg0.field1903;
                        class290.field4634 = -1;
                        return;
                    }
                }
            }
            int var7 = arg0.field724;
            int var8 = arg0.field722;
            int var9 = arg0.field1906[arg0.field1909 - 1] * 128 + arg0.method903(-61) * 64;
            if (arg1 != -2) {
                field437 = null;
            }
            int var10 = arg0.field1916[arg0.field1909 - 1] * 128 + 64 * arg0.method903(-51);
            if (arg2 || -var7 + var9 <= 256 && ~(var9 - var7) <= 255 && ~(-var8 + var10) >= -257 && ~(-var8 + var10) <= 255) {
                if (var7 >= var9) {
                    if (~var7 >= ~var9) {
                        if (var8 >= var10) {
                            if (~var8 < ~var10) {
                                arg0.method904(0, 1);
                            }
                        } else {
                            arg0.method904(8192, 1);
                        }
                    } else if (var10 > var8) {
                        arg0.method904(6144, 1);
                    } else if (var10 >= var8) {
                        arg0.method904(4096, 1);
                    } else {
                        arg0.method904(2048, 1);
                    }
                } else if (var8 < var10) {
                    arg0.method904(10240, 1);
                } else if (~var10 > ~var8) {
                    arg0.method904(14336, ~arg1);
                } else {
                    arg0.method904(12288, 1);
                }
                int var11 = 4;
                boolean var12 = true;
                if (arg0 instanceof class50) {
                    var12 = ((class50) arg0).field615.field3763;
                }
                if (!var12) {
                    if (!arg2 && ~arg0.field1909 < -2) {
                        var11 = 6;
                    }
                    if (!arg2 && ~arg0.field1909 < -3) {
                        var11 = 8;
                    }
                } else {
                    int var13 = -arg0.field1870.field2248 + arg0.field1830;
                    if (~var13 != -1 && ~arg0.field1832 == 0 && ~arg0.field1833 != -1) {
                        var11 = 2;
                    }
                    if (!arg2 && arg0.field1909 > 2) {
                        var11 = 6;
                    }
                    if (!arg2 && ~arg0.field1909 < -4) {
                        var11 = 8;
                    }
                }
                if (arg0.field1903 > 0 && ~arg0.field1909 < -2) {
                    var11 = 8;
                    --arg0.field1903;
                }
                byte var14 = arg0.field1912[arg0.field1909 + -1];
                if (~var14 != -3) {
                    if (~var14 == -1) {
                        var11 >>= 1;
                    }
                } else {
                    var11 <<= 1;
                }
                if (var3.field5387 != -1) {
                    int var15 = var11 << 7;
                    if (~arg0.field1909 != -2) {
                        if (var15 <= arg0.field1917) {
                            if (arg0.field1917 > 0) {
                                arg0.field1917 -= var3.field5387;
                                if (~arg0.field1917 > -1) {
                                    arg0.field1917 = 0;
                                }
                            }
                        } else {
                            arg0.field1917 += var3.field5387;
                            if (arg0.field1917 > var15) {
                                arg0.field1917 = var15;
                            }
                        }
                    } else {
                        int var16 = arg0.field1917 * arg0.field1917;
                        int var17 = (arg0.field724 <= var9 ? -arg0.field724 + var9 : -var9 + arg0.field724) << 7;
                        int var18 = (var10 >= arg0.field722 ? var10 - arg0.field722 : -var10 + arg0.field722) << 7;
                        int var19 = ~var17 < ~var18 ? var17 : var18;
                        int var20 = var3.field5387 * var19 * 2;
                        if (~var20 <= ~var16) {
                            if (var16 / 2 > var19) {
                                arg0.field1917 -= var3.field5387;
                                if (arg0.field1917 < 0) {
                                    arg0.field1917 = 0;
                                }
                            } else if (~var15 < ~arg0.field1917) {
                                arg0.field1917 += var3.field5387;
                                if (var15 < arg0.field1917) {
                                    arg0.field1917 = var15;
                                }
                            }
                        } else {
                            arg0.field1917 /= 2;
                        }
                    }
                    var11 = arg0.field1917 >> 7;
                    if (var11 < 1) {
                        var11 = 1;
                    }
                }
                class415.field6145 = 0;
                if (var9 > var7) {
                    arg0.field724 += var11;
                    class415.field6145 |= 4;
                    if (arg0.field724 > var9) {
                        arg0.field724 = var9;
                    }
                } else if (~var9 > ~var7) {
                    arg0.field724 -= var11;
                    class415.field6145 |= 8;
                    if (var9 > arg0.field724) {
                        arg0.field724 = var9;
                    }
                }
                if (var10 <= var8) {
                    if (var8 > var10) {
                        arg0.field722 -= var11;
                        class415.field6145 |= 2;
                        if (~var10 < ~arg0.field722) {
                            arg0.field722 = var10;
                        }
                    }
                } else {
                    arg0.field722 += var11;
                    class415.field6145 |= 1;
                    if (var10 < arg0.field722) {
                        arg0.field722 = var10;
                    }
                }
                if (~var11 > -9) {
                    class290.field4634 = var14;
                } else {
                    class290.field4634 = 2;
                }
                if (arg0.field724 == var9 && ~arg0.field722 == ~var10) {
                    --arg0.field1909;
                    if (~arg0.field1911 < -1) {
                        --arg0.field1911;
                        return;
                    }
                }
            } else {
                class415.field6145 = 0;
                arg0.field722 = var10;
                arg0.field724 = var9;
                class290.field4634 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class36() {
        super(1, false);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 != 6456) {
            method236((byte) 25);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field453 = (arg0.method1327((byte) -104) << 12) / 100;
                }
            } else {
                this.field444 = (arg0.method1327((byte) -115) << 12) / 100;
            }
        } else {
            this.field449 = arg0.method1276((byte) -113);
        }
        ++field455;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lne;IIILjava/lang/String;IIZLq;Lgh;ILmp;)V")
    public static final void method235(class172 arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, boolean arg7, class245 arg8, class325 arg9, int arg10, class452 arg11) {
        ++field445;
        int var12;
        if (class13.field194 != 4) {
            var12 = 16383 & (int) class329.field5153 + class52.field650;
        } else {
            var12 = 16383 & (int) class329.field5153;
        }
        int var13 = Math.max(arg0.field2705 / 2, arg0.field2834 / 2) + 10;
        int var14 = arg2 * arg2 - -(arg3 * arg3);
        if (~(var13 * var13) <= ~var14) {
            int var15 = class258.field4177[var12];
            int var16 = class258.field4173[var12];
            if (arg7) {
                field437 = null;
            }
            if (~class13.field194 != -5) {
                var16 = var16 * 256 / (class367.field5561 + 256);
                var15 = var15 * 256 / (class367.field5561 + 256);
            }
            int var17 = arg2 * var16 + arg3 * var15 >> 15;
            int var18 = arg3 * var16 + -(arg2 * var15) >> 15;
            int var19 = arg9.method2155((byte) 127, (class356[]) null, 100, arg4);
            int var20 = var17 - var19 / 2;
            int var21 = arg9.method2153(0, (class356[]) null, arg4, (byte) 116, 100);
            if (-arg0.field2705 <= var20 && ~arg0.field2705 <= ~var20 && ~var18 <= ~(-arg0.field2834) && arg0.field2834 >= var18) {
                arg11.method2815(173, arg0.field2834 / 2 + -arg5 + -var18 + arg6 + -var21, (class356[]) null, 1, (int[]) null, arg8, 50, 0, var19, arg10, 0, arg1, arg4, arg0.field2705 / 2 + (var20 - -arg1), arg6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(B)V")
    public static final void method236(byte arg0) {
        class180.field2947.method335((byte) -85);
        if (arg0 != -53) {
            field437 = null;
        }
        ++field450;
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(B)V")
    public static void method237(byte arg0) {
        field437 = null;
        if (arg0 == -93) {
            field457 = null;
            field441 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)[[I")
    public final int[][] method203(byte arg0, int arg1) {
        ++field446;
        if (arg0 != -93) {
            return null;
        } else {
            int[][] var3 = super.field360.method2803(arg1, true);
            if (super.field360.field6566) {
                int[][] var4 = this.method206(arg1, 2, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class369.field5610 > var11; ++var11) {
                    this.method240(var7[var11], var5[var11], (byte) 8, var6[var11]);
                    this.field451 += this.field449;
                    this.field456 += this.field444;
                    this.field447 += this.field453;
                    while (this.field451 < 0) {
                        this.field451 += 4096;
                    }
                    while (this.field451 > 4096) {
                        this.field451 -= 4096;
                    }
                    if (this.field456 < 0) {
                        this.field456 = 0;
                    }
                    if (~this.field447 > -1) {
                        this.field447 = 0;
                    }
                    if (~this.field456 < -4097) {
                        this.field456 = 4096;
                    }
                    if (~this.field447 < -4097) {
                        this.field447 = 4096;
                    }
                    this.method239((byte) -91, this.field456, this.field451, this.field447);
                    var8[var11] = this.field439;
                    var9[var11] = this.field452;
                    var10[var11] = this.field448;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZIIII)Lma;")
    public static final class8 method238(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field458;
        if (arg2) {
            field457 = null;
        }
        long var7 = (long) arg0 * 986053L ^ (long) arg5 * 475427L ^ (long) arg3 * 67481L ^ (long) arg4 * 97549L ^ (long) arg1 * 32147369L ^ (long) arg6 * 76724863L;
        class8 var9 = (class8) class134.field2110.method331((byte) 69, var7);
        if (var9 != null) {
            return var9;
        } else {
            class8 var10 = class296.field4710.method601(arg3, arg4, arg5, arg0, arg1, arg6);
            class134.field2110.method341(69, var7, var10);
            return var10;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIII)V")
    private final void method239(byte arg0, int arg1, int arg2, int arg3) {
        ++field440;
        if (arg0 >= -64) {
            this.method239((byte) -31, -27, -9, -49);
        }
        int var5 = ~arg3 >= -2049 ? (arg1 + 4096) * arg3 >> 12 : arg3 - (arg1 * arg3 >> 12) + arg1;
        if (~var5 < -1) {
            int var6 = arg2 * 6;
            int var7 = arg3 - -arg3 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (var9 == 0) {
                this.field452 = var14;
                this.field439 = var5;
                this.field448 = var7;
                return;
            }
            if (~var9 == -2) {
                this.field452 = var5;
                this.field439 = var15;
                this.field448 = var7;
                return;
            }
            if (var9 == 2) {
                this.field439 = var7;
                this.field452 = var5;
                this.field448 = var14;
                return;
            }
            if (~var9 == -4) {
                this.field452 = var15;
                this.field448 = var5;
                this.field439 = var7;
                return;
            }
            if (var9 == 4) {
                this.field439 = var14;
                this.field452 = var7;
                this.field448 = var5;
                return;
            }
            if (~var9 == -6) {
                this.field439 = var5;
                this.field452 = var7;
                this.field448 = var15;
                return;
            }
        } else {
            this.field439 = this.field452 = this.field448 = arg3;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBI)V")
    private final void method240(int arg0, int arg1, byte arg2, int arg3) {
        ++field442;
        int var5 = ~arg1 >= ~arg3 ? arg3 : arg1;
        int var6 = ~arg1 <= ~arg3 ? arg3 : arg1;
        int var7 = var5 < arg0 ? arg0 : var5;
        int var8 = arg0 < var6 ? arg0 : var6;
        int var9 = -var8 + var7;
        this.field447 = (var8 - -var7) / 2;
        if (arg2 != 8) {
            this.field448 = -31;
        }
        if (var9 <= 0) {
            this.field451 = 0;
        } else {
            int var10 = (-arg1 + var7 << 12) / var9;
            int var11 = (-arg3 + var7 << 12) / var9;
            int var12 = (var7 - arg0 << 12) / var9;
            if (arg1 != var7) {
                if (arg3 == var7) {
                    this.field451 = arg0 == var8 ? 4096 - -var10 : -var12 + 12288;
                } else {
                    this.field451 = ~arg1 == ~var8 ? var11 + 12288 : 20480 - var10;
                }
            } else {
                this.field451 = arg3 == var8 ? 20480 - -var12 : 4096 - var11;
            }
            this.field451 /= 6;
        }
        if (~this.field447 < -1 && ~this.field447 > -4097) {
            this.field456 = (var9 << 12) / (this.field447 > 2048 ? -(this.field447 * 2) + 8192 : this.field447 * 2);
        } else {
            this.field456 = 0;
        }
    }
}
