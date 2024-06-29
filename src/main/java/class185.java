import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class185 {

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "Z")
    public boolean field2727 = true;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "I")
    private int field2729 = -1;

    @OriginalMember(owner = "client!tw", name = "s", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "Lqd;")
    private class412 field2720;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    private int field2719;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "Lgj;")
    private class580 field2715;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    private int field2718;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    private int field2722;

    @OriginalMember(owner = "client!tw", name = "r", descriptor = "Ljn;")
    private class659 field2731;

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "Lhr;")
    private class483 field2714;

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "Lfc;")
    public static class235 field2730 = new class235(32, 8);

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!tw", name = "t", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!tw", name = "u", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "Lwk;")
    public static class128 field2723;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "[[[J")
    public static long[][][] field2716;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Ljn;IB)V", line = 17)
    public final void method1238(class659 arg0, int arg1, byte arg2) {
        if (arg1 > 0) {
            this.method1241(0);
            this.field2715.method3232(false, this.field2714);
            this.field2715.method318(this.field2722 + 1 - this.field2718, 4025, arg1, this.field2718, arg0, class47.field697, 0);
        }
        field2734++;
        if (arg2 != 106) {
            this.method1241(66);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 34)
    public static final void method1239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field2726++;
        if (class144.field2149 == null) {
            return;
        }
        class457 var14 = null;
        if (arg11 < 0) {
            int var15 = -arg11 - 1;
            if (class27.field343 == var15) {
                var14 = class253.field3576;
            } else {
                var14 = class495.field6821[var15];
            }
        } else {
            int var16 = arg11 - 1;
            class178 var17 = (class178) class323.field4762.method2061(arg3 - 17306, (long) var16);
            if (var17 != null) {
                var14 = var17.field2634;
            }
        }
        if (var14 == null) {
            return;
        }
        class620 var18 = class164.field2499.method2013(arg4, false);
        int var19;
        int var20;
        if (arg9 == 1 || arg9 == 3) {
            var20 = var18.field8582;
            var19 = var18.field8566;
        } else {
            var19 = var18.field8582;
            var20 = var18.field8566;
        }
        int var21 = (var19 >> 1) + arg8;
        int var22 = arg8 + (var19 + 1 >> 1);
        int var23 = (var20 >> 1) + arg5;
        int var24 = (var20 + 1 >> 1) + arg5;
        class136 var25 = class144.field2149[arg13];
        if (arg3 != 1) {
            field2733 = -27;
        }
        int var26 = var25.method273(var21, var23) + (var25.method273(var22, var23) + var25.method273(var21, var24) + var25.method273(var22, var24)) >> 2;
        class296 var27 = new class296();
        var27.field4423 = arg5;
        if (arg10 < arg12) {
            int var28 = arg12;
            arg12 = arg10;
            arg10 = var28;
        }
        var27.field4425 = class239.field3440 + arg0;
        var27.field4433 = arg8;
        var27.field4436 = class239.field3440 + arg2;
        var27.field4432 = var14.field520;
        var27.field4429 = arg4;
        var27.field4424 = arg7;
        var27.field4417 = arg9;
        var27.field4418 = arg8 + arg12;
        var27.field4431 = arg8 + arg10;
        if (arg1 < arg6) {
            int var29 = arg6;
            arg6 = arg1;
            arg1 = var29;
        }
        var27.field4430 = (var27.field4423 << 9) + (var20 << 8);
        var27.field4428 = (var27.field4433 << 9) + (var19 << 8);
        var27.field4427 = arg5 + arg6;
        var27.field4434 = var26;
        var27.field4426 = arg1 + arg5;
        class19.field278.method1273(var27, (byte) 122);
        var14.field6486 = var27;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lgj;Lqd;Lkb;IIIII)V", line = 347)
    public class185(class580 arg0, class412 arg1, class634 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2732 = arg6;
        this.field2720 = arg1;
        this.field2719 = arg7;
        this.field2715 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field1918 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field8893[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field2714 = null;
            this.field2724 = 0;
        } else {
            this.field2718 = Integer.MAX_VALUE;
            this.field2722 = Integer.MIN_VALUE;
            this.field2731 = this.field2715.method290(false, 0);
            this.field2731.method777(var10, (byte) 73);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field2731.method779((byte) -20, true);
                if (var15 != null) {
                    Stream var16 = this.field2715.method3212(var15, (byte) 122);
                    if (Stream.method3418()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field1918 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field8893[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field2718) {
                                            this.field2718 = var28;
                                        }
                                        if (this.field2722 < var28) {
                                            this.field2722 = var28;
                                        }
                                        var16.method3425(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field1918 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field8893[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 > this.field2722) {
                                            this.field2722 = var22;
                                        }
                                        if (this.field2718 > var22) {
                                            this.field2718 = var22;
                                        }
                                        var16.method3416(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3426();
                    if (this.field2731.method774(-22324)) {
                        break;
                    }
                }
            }
            this.field2724 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)V", line = 146)
    public final void method1240(boolean arg0) {
        this.method1238(this.field2731, this.field2724, (byte) 106);
        field2725++;
        if (arg0) {
            this.method1240(true);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 167)
    private final void method1241(int arg0) {
        field2728++;
        if (!this.field2727) {
            return;
        }
        this.field2727 = false;
        byte[] var2 = this.field2720.field5833;
        int var3 = 0;
        int var4 = this.field2720.field5826;
        int var5 = this.field2720.field5826 * this.field2719 + this.field2732;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field2714 != null && this.field2729 == var3) {
            this.field2727 = false;
            return;
        }
        this.field2729 = var3;
        int var7 = this.field2719 * var4 + this.field2732;
        int var8 = arg0;
        if (!this.field2715.method345(class381.field5355, (byte) 40, class82.field1147)) {
            if (class75.field1042 == null) {
                class75.field1042 = new int[16384];
            }
            int[] var9 = class75.field1042;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var7] == 0) {
                        int var12 = 0;
                        if (var2[var7 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field2720.field5826 - 128;
            }
            if (this.field2714 == null) {
                this.field2714 = this.field2715.method3214(128, 128, -17318, class75.field1042, false);
                this.field2714.method786(false, 27469, false);
            } else {
                this.field2714.method782(0, 128, 0, 128, 0, class75.field1042, 128, 123);
            }
            return;
        }
        if (class390.field5470 == null) {
            class390.field5470 = new byte[16384];
        }
        byte[] var13 = class390.field5470;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var7] == 0) {
                    int var16 = 0;
                    if (var2[var7 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var16++;
                    }
                    var13[var8++] = (byte) (var16 * 17);
                } else {
                    var13[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field2720.field5826 - 128;
        }
        if (this.field2714 == null) {
            this.field2714 = this.field2715.method3231(class390.field5470, 30569, 128, false, class381.field5355, 128);
            this.field2714.method786(false, 27469, false);
        } else {
            this.field2714.method783(class390.field5470, 0, 128, 128, class381.field5355, true, 0, 0, 128);
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V", line = 336)
    public static void method1242(int arg0) {
        field2723 = null;
        field2716 = null;
        field2730 = null;
        if (arg0 != 21654) {
            method1242(50);
        }
    }
}
