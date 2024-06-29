import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class140 extends class83 {

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    private int field1792 = 4096;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    private int field1799 = 0;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field1793 = 0;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field1794 = 0;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    public static int field1798 = 0;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "[[B")
    public static byte[][] field1796;

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class140() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([Lfd;IZ)V")
    public static final void method762(class194[] arg0, int arg1, boolean arg2) {
        if (arg2) {
            for (int var3 = 0; arg0.length > var3; ++var3) {
                class194 var4 = arg0[var3];
                if (var4 != null && ~var4.field2470 == ~arg1 && (!var4.field2575 || !client.method1420(var4))) {
                    if (~var4.field2492 == -1) {
                        if (!var4.field2575 && client.method1420(var4) && class222.field2972 != var4) {
                            continue;
                        }
                        method762(arg0, var4.field2502, true);
                        if (var4.field2620 != null) {
                            method762(var4.field2620, var4.field2502, true);
                        }
                        class141 var5 = (class141) class337.field4495.method308((long) var4.field2502, (byte) 117);
                        if (var5 != null) {
                            class209.method1133(var5.field1802, 97);
                        }
                    }
                    if (var4.field2492 == 6) {
                        if (var4.field2516 != -1 || ~var4.field2578 != 0) {
                            boolean var6 = class392.method2438((byte) -90, var4);
                            int var7;
                            if (var6) {
                                var7 = var4.field2578;
                            } else {
                                var7 = var4.field2516;
                            }
                            if (var7 != -1) {
                                class208 var8 = class193.method1037(84, var7);
                                if (var8 != null) {
                                    var4.field2508 += class259.field3526;
                                    while (var4.field2508 > var8.field2818[var4.field2463]) {
                                        var4.field2508 -= var8.field2818[var4.field2463];
                                        ++var4.field2463;
                                        if (var4.field2463 >= var8.field2823.length) {
                                            var4.field2463 -= var8.field2828;
                                            if (~var4.field2463 > -1 || ~var4.field2463 <= ~var8.field2823.length) {
                                                var4.field2463 = 0;
                                            }
                                        }
                                        var4.field2486 = var4.field2463 + 1;
                                        if (var4.field2486 >= var8.field2823.length) {
                                            var4.field2486 -= var8.field2828;
                                            if (~var4.field2486 > -1 || ~var4.field2486 <= ~var8.field2823.length) {
                                                var4.field2486 = -1;
                                            }
                                        }
                                        class204.method1107(var4, (byte) -98);
                                    }
                                }
                            }
                        }
                        if (~var4.field2499 != -1 && !var4.field2575) {
                            int var9 = var4.field2499 >> 16;
                            int var10 = class259.field3526 * var9;
                            int var11 = var4.field2499 << 16 >> 16;
                            var4.field2479 = 16383 & var4.field2479 - -var10;
                            int var12 = class259.field3526 * var11;
                            var4.field2583 = var4.field2583 + var12 & 16383;
                            class204.method1107(var4, (byte) -99);
                        }
                    }
                }
            }
            ++field1797;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = -124 / ((arg1 - -27) / 50);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field924 = ~arg2.method1350(31351) == -2;
                }
            } else {
                this.field1792 = arg2.method1374(-2);
            }
        } else {
            this.field1799 = arg2.method1374(-2);
        }
        ++field1790;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field1800;
        int[][] var3 = super.field927.method1774((byte) -45, arg1);
        if (!arg0) {
            field1798 = -55;
        }
        if (super.field927.field4104) {
            int[][] var4 = this.method449(0, arg0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class420.field6139 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 > ~this.field1799) {
                    var8[var11] = this.field1799;
                } else if (var12 <= this.field1792) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field1792;
                }
                if (var13 < this.field1799) {
                    var9[var11] = this.field1799;
                } else if (~this.field1792 <= ~var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field1792;
                }
                if (~var14 <= ~this.field1799) {
                    if (~this.field1792 > ~var14) {
                        var10[var11] = this.field1792;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field1799;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class427 var7 = new class427();
        var7.field6269 = arg1 >> 7;
        var7.field6268 = arg2 >> 7;
        var7.field6274 = arg3 >> 7;
        var7.field6275 = arg4 >> 7;
        var7.field6259 = arg0;
        var7.field6256 = arg1;
        var7.field6272 = arg2;
        var7.field6254 = arg3;
        var7.field6261 = arg4;
        var7.field6265 = arg5;
        var7.field6271 = arg6;
        class179.field2250[class248.field3338++] = var7;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field1789;
        int[] var3 = super.field916.method1813(arg1, (byte) 22);
        if (arg0 != 2) {
            this.method35(-100, (byte) -34, (class250) null);
        }
        if (super.field916.field4174) {
            int[] var4 = this.method451(0, 99, arg1);
            for (int var5 = 0; var5 < class420.field6139; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field1799) {
                    if (~this.field1792 <= ~var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field1792;
                    }
                } else {
                    var3[var5] = this.field1799;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)V")
    public static void method764(byte arg0) {
        if (arg0 == -43) {
            field1796 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
    public static final void method765(int arg0) {
        ++field1791;
        if (arg0 != -18522) {
            method762((class194[]) null, -13, false);
        }
        if (!class216.field2897) {
            if (class165.field2104) {
                class425.field6241 = (float) (-128 & (int) class425.field6241 + 191);
            } else {
                class335.field4460 += (24.0F - class335.field4460) / 2.0F;
            }
            class216.field2897 = true;
            class69.field726 = true;
        }
    }
}
