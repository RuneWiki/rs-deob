import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class132 extends class59 {

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    private int field2573 = 1;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    private int field2576 = 25;

    @OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
    private int field2582 = 2048;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    private int field2575 = 5;

    @OriginalMember(owner = "client!of", name = "eb", descriptor = "I")
    private int field2581 = 2;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
    private int field2578 = 0;

    @OriginalMember(owner = "client!of", name = "pb", descriptor = "I")
    private int field2592 = 5;

    @OriginalMember(owner = "client!of", name = "jb", descriptor = "[I")
    public static int[] field2586 = new int[128];

    @OriginalMember(owner = "client!of", name = "kb", descriptor = "Lsd;")
    public static class166 field2587 = class135.method935("Einloggen", 0);

    @OriginalMember(owner = "client!of", name = "nb", descriptor = "I")
    public static int field2590 = 0;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "Lsd;")
    public static class166 field2570 = class135.method935("logo", 0);

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    private int field2574;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
    private int field2579;

    @OriginalMember(owner = "client!of", name = "gb", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!of", name = "hb", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!of", name = "ib", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!of", name = "mb", descriptor = "I")
    private int field2589;

    @OriginalMember(owner = "client!of", name = "ob", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!of", name = "qb", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!of", name = "lb", descriptor = "Lf;")
    public static class47 field2588;

    @OriginalMember(owner = "client!of", name = "db", descriptor = "[[I")
    private int[][] field2580;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
    public static void method923(int arg0) {
        field2587 = null;
        field2588 = null;
        if (arg0 != -1788249332) {
            method925(94);
        }
        field2586 = null;
        field2570 = null;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    private final void method924(byte arg0) {
        ++field2585;
        Random var2 = new Random((long) this.field2578);
        int var3 = 4096 / this.field2592;
        this.field2576 = this.field2592 * this.field2575;
        int var4 = 4096 / this.field2575;
        this.field2580 = new int[this.field2576][2];
        this.field2589 = var3 >> 1;
        int var5 = this.field2589 * this.field2582 >> 12;
        if (arg0 < 49) {
            this.method926(-125, -18, 16, -114);
        }
        this.field2574 = var4 >> 1;
        int var6 = this.field2582 * this.field2574 >> 12;
        for (int var7 = 0; this.field2592 > var7; ++var7) {
            int var8 = var3 * var7;
            for (int var9 = 0; ~this.field2575 < ~var9; ++var9) {
                int var10 = this.field2575 * var7 - -var9;
                int var11 = (-4096 + class12.method75(var2, (byte) -126, 8192)) * var6 >> 12;
                int var12 = (-4096 + class12.method75(var2, (byte) -128, 8192)) * var5 >> 12;
                this.field2580[var10][0] = var4 * var9 + var11;
                this.field2580[var10][1] = var8 + var12;
            }
        }
        this.field2579 = ~this.field2592 <= ~this.field2575 ? this.field2592 : this.field2575;
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V")
    public static final void method925(int arg0) {
        ++field2572;
        int var1 = class179.field3377.method708(8, 8);
        if (~class6.field131 < ~var1) {
            for (int var2 = var1; var2 < class6.field131; ++var2) {
                class167.field3219[class2.field29++] = class53.field967[var2];
            }
        }
        if (arg0 == -4096) {
            if (class6.field131 < var1) {
                throw new RuntimeException("gppov1");
            } else {
                class6.field131 = 0;
                for (int var3 = 0; ~var3 > ~var1; ++var3) {
                    int var4 = class53.field967[var3];
                    class123 var5 = class182.field3451[var4];
                    int var6 = class179.field3377.method708(8, 1);
                    if (~var6 == -1) {
                        class53.field967[class6.field131++] = var4;
                        var5.field3535 = class49.field910;
                    } else {
                        int var7 = class179.field3377.method708(8, 2);
                        if (~var7 == -1) {
                            class53.field967[class6.field131++] = var4;
                            var5.field3535 = class49.field910;
                            class2.field11[class206.field4058++] = var4;
                        } else if (var7 == 1) {
                            class53.field967[class6.field131++] = var4;
                            var5.field3535 = class49.field910;
                            int var8 = class179.field3377.method708(8, 3);
                            var5.method1247(false, var8, -1);
                            int var9 = class179.field3377.method708(8, 1);
                            if (var9 == 1) {
                                class2.field11[class206.field4058++] = var4;
                            }
                        } else if (~var7 == -3) {
                            class53.field967[class6.field131++] = var4;
                            var5.field3535 = class49.field910;
                            int var10 = class179.field3377.method708(8, 3);
                            var5.method1247(true, var10, -1);
                            int var11 = class179.field3377.method708(arg0 ^ -4088, 3);
                            var5.method1247(true, var11, -1);
                            int var12 = class179.field3377.method708(8, 1);
                            if (var12 == 1) {
                                class2.field11[class206.field4058++] = var4;
                            }
                        } else if (var7 == 3) {
                            class167.field3219[class2.field29++] = var4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        int[] var3 = super.field1219.method721(arg0, -128);
        ++field2584;
        if (super.field1219.field1816) {
            int var4 = class136.field2657[arg0];
            int var5 = this.field2581;
            if (var5 != 2) {
                if (~var5 == -2) {
                    for (int var6 = 0; ~class98.field1879 < ~var6; ++var6) {
                        int var7 = class187.field3569[var6];
                        var3[var6] = this.method926(2, var7, var4, 61)[1];
                    }
                } else {
                    for (int var8 = 0; var8 < class98.field1879; ++var8) {
                        int var9 = class187.field3569[var8];
                        var3[var8] = this.method926(1, var9, var4, 121)[0];
                    }
                }
            } else {
                for (int var10 = 0; ~var10 > ~class98.field1879; ++var10) {
                    int var11 = class187.field3569[var10];
                    int[] var12 = this.method926(2, var11, var4, 127);
                    var3[var10] = var12[1] + -var12[0];
                }
            }
        }
        if (arg1 >= -124) {
            field2586 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class132() {
        super(0, true);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)[I")
    private final int[] method926(int arg0, int arg1, int arg2, int arg3) {
        ++field2583;
        int[] var5 = new int[arg0];
        for (int var6 = 0; var6 < arg0; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = this.field2574 + arg1;
        if (~var7 < -4097) {
            var7 -= 4096;
        }
        int var8 = this.field2575 * var7 >> 12;
        int var9 = this.field2589 + arg2;
        if (var9 > 4096) {
            var9 -= 4096;
        }
        int var10 = this.field2592 * var9 >> 12;
        int var11 = -1;
        int var12 = -1;
        int var13 = Integer.MAX_VALUE;
        if (arg3 < 58) {
            method923(70);
        }
        int var14 = Integer.MAX_VALUE;
        int var15 = this.field2592 <= 2 ? this.field2592 + -1 : 2;
        int var16 = this.field2575 > 2 ? 2 : this.field2575 + -1;
        for (int var17 = -var16; var16 >= var17; ++var17) {
            for (int var25 = -var15; ~var25 >= ~var15; ++var25) {
                int var26 = var8 + var17;
                if (var26 < 0) {
                    var26 += this.field2575;
                }
                int var27 = var10 + var25;
                if (~var27 > -1) {
                    var27 += this.field2592;
                }
                if (~this.field2575 >= ~var26) {
                    var26 -= this.field2575;
                }
                if (var27 >= this.field2592) {
                    var27 -= this.field2592;
                }
                int var28 = this.field2575 * var27 + var26;
                int var29 = this.field2580[var28][0];
                int var30 = -var29 + var7;
                int var31 = this.field2580[var28][1];
                if (var30 < 0) {
                    var30 = -var30;
                }
                int var32 = -var31 + var9;
                if (~var30 < -2049) {
                    var30 = -var30 + 4096;
                }
                if (var32 < 0) {
                    var32 = -var32;
                }
                if (var32 > 2048) {
                    var32 = 4096 - var32;
                }
                int var33 = var30 * var30 + var32 * var32 >> 12;
                if (var33 < var14) {
                    if (var12 != -1) {
                        var12 = var11;
                        var13 = var14;
                    } else {
                        var12 = var28;
                        var13 = var33;
                    }
                    var14 = var33;
                    var11 = var28;
                } else if (~var11 == ~var12 && ~var12 != ~var28 || var13 > var33 && var11 != var28) {
                    var12 = var28;
                    var13 = var33;
                }
            }
        }
        int var18 = -this.field2580[var11][0] + var7;
        if (var18 < 0) {
            var18 = -var18;
        }
        if (var18 > 2048) {
            var18 = -var18 + 4096;
        }
        int var19 = -this.field2580[var11][1] + var9;
        int var20 = var9 - this.field2580[var12][1];
        if (var19 < 0) {
            var19 = -var19;
        }
        if (~var19 < -2049) {
            var19 = -var19 + 4096;
        }
        if (var20 < 0) {
            var20 = -var20;
        }
        int var21 = -this.field2580[var12][0] + var7;
        if (var21 < 0) {
            var21 = -var21;
        }
        if (var21 > 2048) {
            var21 = -var21 + 4096;
        }
        if (var20 > 2048) {
            var20 = -var20 + 4096;
        }
        int var22 = this.field2573;
        int var23;
        int var24;
        if (~var22 != -2) {
            if (~var22 == -3) {
                var23 = Math.max(var18, var19);
                var24 = Math.max(var21, var20);
            } else {
                var23 = var18 * var18 + var19 * var19;
                var24 = var20 * var20 + var21 * var21;
            }
        } else {
            var23 = (int) Math.sqrt((double) (var18 * var18 + var19 * var19));
            var24 = (int) Math.sqrt((double) (var21 * var21 - -(var20 * var20)));
        }
        if (~arg0 < -2) {
            var5[1] = this.field2579 * var24;
        }
        var5[0] = this.field2579 * var23;
        return var5;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 >= 18) {
            ++field2591;
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (arg2 != 4) {
                                if (arg2 != 5) {
                                    if (~arg2 == -7) {
                                        this.field2592 = arg0.method400(255);
                                    }
                                } else {
                                    this.field2575 = arg0.method400(255);
                                }
                            } else {
                                this.field2573 = arg0.method400(255);
                            }
                        } else {
                            this.field2581 = arg0.method400(255);
                        }
                    } else {
                        this.field2582 = arg0.method405(2);
                    }
                } else {
                    this.field2578 = arg0.method400(255);
                }
            } else {
                this.field2575 = this.field2592 = arg0.method400(255);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lkf;B)V")
    public static final void method927(class96 arg0, byte arg1) {
        for (int var2 = 0; ~var2 > ~class41.field743.length; ++var2) {
            class41.field743[var2] = 0;
        }
        ++field2593;
        short var3 = 256;
        for (int var4 = 0; ~var4 > -5001; ++var4) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class41.field743[var16] = (int) (Math.random() * 256.0D);
        }
        if (arg1 != -117) {
            field2586 = null;
        }
        for (int var5 = 0; ~var5 > -21; ++var5) {
            for (int var12 = 1; var3 + -1 > var12; ++var12) {
                for (int var14 = 1; ~var14 > -128; ++var14) {
                    int var15 = var14 - -(var12 << 7);
                    class95.field1836[var15] = (class41.field743[var15 + -128] + class41.field743[var15 + -1] + class41.field743[var15 + 1] + class41.field743[var15 + 128]) / 4;
                }
            }
            int[] var13 = class41.field743;
            class41.field743 = class95.field1836;
            class95.field1836 = var13;
        }
        if (arg0 != null) {
            int var6 = 0;
            for (int var7 = 0; ~var7 > ~arg0.field1849; ++var7) {
                for (int var8 = 0; var8 < arg0.field1852; ++var8) {
                    if (~arg0.field1855[var6++] != -1) {
                        int var9 = arg0.field1853 + 16 + var8;
                        int var10 = var7 + 16 + arg0.field1856;
                        int var11 = var9 - -(var10 << 7);
                        class41.field743[var11] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        ++field2577;
        this.method924((byte) 111);
        if (arg0 != 23459) {
            this.method924((byte) -26);
        }
    }
}
