import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 extends class84 {

    @OriginalMember(owner = "client!ed", name = "qb", descriptor = "I")
    private int field717 = 0;

    @OriginalMember(owner = "client!ed", name = "rb", descriptor = "Z")
    private boolean field718 = false;

    @OriginalMember(owner = "client!ed", name = "Sb", descriptor = "B")
    private byte field745 = 0;

    @OriginalMember(owner = "client!ed", name = "Vb", descriptor = "I")
    private int field748 = 0;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "I")
    private int field702;

    @OriginalMember(owner = "client!ed", name = "lb", descriptor = "[I")
    private int[] field712;

    @OriginalMember(owner = "client!ed", name = "yb", descriptor = "[I")
    private int[] field725;

    @OriginalMember(owner = "client!ed", name = "mb", descriptor = "[I")
    private int[] field713;

    @OriginalMember(owner = "client!ed", name = "Qb", descriptor = "[I")
    private int[] field743;

    @OriginalMember(owner = "client!ed", name = "Fb", descriptor = "[I")
    private int[] field732;

    @OriginalMember(owner = "client!ed", name = "pb", descriptor = "[I")
    private int[] field716;

    @OriginalMember(owner = "client!ed", name = "Mb", descriptor = "[I")
    private int[] field739;

    @OriginalMember(owner = "client!ed", name = "Ub", descriptor = "[B")
    private byte[] field747;

    @OriginalMember(owner = "client!ed", name = "sb", descriptor = "[B")
    private byte[] field719;

    @OriginalMember(owner = "client!ed", name = "Jb", descriptor = "[B")
    private byte[] field736;

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "[I")
    private int[] field703;

    @OriginalMember(owner = "client!ed", name = "Eb", descriptor = "[S")
    private short[] field731;

    @OriginalMember(owner = "client!ed", name = "nb", descriptor = "[B")
    private byte[] field714;

    @OriginalMember(owner = "client!ed", name = "Gb", descriptor = "[S")
    private short[] field733;

    @OriginalMember(owner = "client!ed", name = "Lb", descriptor = "[B")
    private byte[] field738;

    @OriginalMember(owner = "client!ed", name = "zb", descriptor = "[S")
    private short[] field726;

    @OriginalMember(owner = "client!ed", name = "Ob", descriptor = "[S")
    private short[] field741;

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "[S")
    private short[] field708;

    @OriginalMember(owner = "client!ed", name = "wb", descriptor = "[S")
    private short[] field723;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "[S")
    private short[] field706;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "[S")
    private short[] field704;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "[S")
    private short[] field709;

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "[B")
    private byte[] field707;

    @OriginalMember(owner = "client!ed", name = "vb", descriptor = "[S")
    private short[] field722;

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "[S")
    private short[] field711;

    @OriginalMember(owner = "client!ed", name = "Ib", descriptor = "[[I")
    private int[][] field735;

    @OriginalMember(owner = "client!ed", name = "Ab", descriptor = "[[I")
    private int[][] field727;

    @OriginalMember(owner = "client!ed", name = "Pb", descriptor = "[Lmf;")
    private class89[] field742;

    @OriginalMember(owner = "client!ed", name = "Bb", descriptor = "[Lke;")
    private class74[] field728;

    @OriginalMember(owner = "client!ed", name = "Hb", descriptor = "[Lmf;")
    private class89[] field734;

    @OriginalMember(owner = "client!ed", name = "Cb", descriptor = "S")
    public short field729;

    @OriginalMember(owner = "client!ed", name = "ob", descriptor = "S")
    public short field715;

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "[I")
    private static int[] field705 = new int[10000];

    @OriginalMember(owner = "client!ed", name = "ub", descriptor = "I")
    private static int field721 = 0;

    @OriginalMember(owner = "client!ed", name = "Db", descriptor = "[I")
    private static int[] field730 = class105.field2210;

    @OriginalMember(owner = "client!ed", name = "Kb", descriptor = "[I")
    private static int[] field737 = class105.field2221;

    @OriginalMember(owner = "client!ed", name = "Nb", descriptor = "[I")
    private static int[] field740 = new int[10000];

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "client!ed", name = "tb", descriptor = "I")
    private int field720;

    @OriginalMember(owner = "client!ed", name = "xb", descriptor = "I")
    private int field724;

    @OriginalMember(owner = "client!ed", name = "Rb", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!ed", name = "Tb", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(III)V")
    public final void method330(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field717; ++var4) {
            this.field712[var4] += arg0;
            this.field725[var4] += arg1;
            this.field713[var4] += arg2;
        }
        this.method344();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()V")
    public final void method331() {
        for (int var1 = 0; var1 < this.field717; ++var1) {
            this.field713[var1] = -this.field713[var1];
        }
        for (int var2 = 0; var2 < this.field748; ++var2) {
            int var3 = this.field732[var2];
            this.field732[var2] = this.field739[var2];
            this.field739[var2] = var3;
        }
        this.method344();
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "()Led;")
    public final class33 method332() {
        class33 var1 = new class33();
        if (this.field747 != null) {
            var1.field747 = new byte[this.field748];
            for (int var2 = 0; var2 < this.field748; ++var2) {
                var1.field747[var2] = this.field747[var2];
            }
        }
        var1.field717 = this.field717;
        var1.field748 = this.field748;
        var1.field702 = this.field702;
        var1.field712 = this.field712;
        var1.field725 = this.field725;
        var1.field713 = this.field713;
        var1.field732 = this.field732;
        var1.field716 = this.field716;
        var1.field739 = this.field739;
        var1.field719 = this.field719;
        var1.field736 = this.field736;
        var1.field714 = this.field714;
        var1.field733 = this.field733;
        var1.field731 = this.field731;
        var1.field745 = this.field745;
        var1.field738 = this.field738;
        var1.field726 = this.field726;
        var1.field741 = this.field741;
        var1.field708 = this.field708;
        var1.field723 = this.field723;
        var1.field706 = this.field706;
        var1.field704 = this.field704;
        var1.field709 = this.field709;
        var1.field707 = this.field707;
        var1.field722 = this.field722;
        var1.field711 = this.field711;
        var1.field743 = this.field743;
        var1.field703 = this.field703;
        var1.field735 = this.field735;
        var1.field727 = this.field727;
        var1.field742 = this.field742;
        var1.field728 = this.field728;
        var1.field729 = this.field729;
        var1.field715 = this.field715;
        return var1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([[IIIIZI)Led;")
    public final class33 method333(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method335();
        int var7 = this.field724 + arg1;
        int var8 = this.field710 + arg1;
        int var9 = this.field720 + arg3;
        int var10 = this.field744 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class33 var15;
                if (arg4) {
                    var15 = new class33();
                    var15.field717 = this.field717;
                    var15.field748 = this.field748;
                    var15.field702 = this.field702;
                    var15.field712 = this.field712;
                    var15.field713 = this.field713;
                    var15.field732 = this.field732;
                    var15.field716 = this.field716;
                    var15.field739 = this.field739;
                    var15.field747 = this.field747;
                    var15.field719 = this.field719;
                    var15.field736 = this.field736;
                    var15.field714 = this.field714;
                    var15.field733 = this.field733;
                    var15.field731 = this.field731;
                    var15.field745 = this.field745;
                    var15.field738 = this.field738;
                    var15.field726 = this.field726;
                    var15.field741 = this.field741;
                    var15.field708 = this.field708;
                    var15.field723 = this.field723;
                    var15.field706 = this.field706;
                    var15.field704 = this.field704;
                    var15.field709 = this.field709;
                    var15.field707 = this.field707;
                    var15.field722 = this.field722;
                    var15.field711 = this.field711;
                    var15.field743 = this.field743;
                    var15.field703 = this.field703;
                    var15.field735 = this.field735;
                    var15.field727 = this.field727;
                    var15.field729 = this.field729;
                    var15.field715 = this.field715;
                    var15.field725 = new int[var15.field717];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field717; ++var16) {
                        int var17 = this.field712[var16] + arg1;
                        int var18 = this.field713[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field725[var16] = this.field725[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field717; ++var26) {
                        int var27 = (-this.field725[var26] << 16) / super.field1780;
                        if (var27 < arg5) {
                            int var28 = this.field712[var26] + arg1;
                            int var29 = this.field713[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field725[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field725[var26];
                        }
                    }
                }
                var15.method344();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)Lwb;")
    public final class155 method334(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method343();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class155 var8 = new class155();
        var8.field3542 = new int[this.field748];
        var8.field3535 = new int[this.field748];
        var8.field3539 = new int[this.field748];
        if (this.field702 > 0 && this.field714 != null) {
            int[] var9 = new int[this.field702];
            for (int var10 = 0; var10 < this.field748; ++var10) {
                if (this.field714[var10] != -1) {
                    ++var9[this.field714[var10] & 255];
                }
            }
            var8.field3546 = 0;
            for (int var11 = 0; var11 < this.field702; ++var11) {
                if (var9[var11] > 0 && this.field738[var11] == 0) {
                    ++var8.field3546;
                }
            }
            var8.field3548 = new int[var8.field3546];
            var8.field3525 = new int[var8.field3546];
            var8.field3524 = new int[var8.field3546];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field702; ++var13) {
                if (var9[var13] > 0 && this.field738[var13] == 0) {
                    var8.field3548[var12] = this.field726[var13] & 65535;
                    var8.field3525[var12] = this.field741[var13] & 65535;
                    var8.field3524[var12] = this.field708[var13] & 65535;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field3538 = new byte[this.field748];
            for (int var14 = 0; var14 < this.field748; ++var14) {
                if (this.field714[var14] != -1) {
                    var8.field3538[var14] = (byte) var9[this.field714[var14] & 255];
                } else {
                    var8.field3538[var14] = -1;
                }
            }
        }
        for (int var15 = 0; var15 < this.field748; ++var15) {
            byte var16;
            if (this.field747 == null) {
                var16 = 0;
            } else {
                var16 = this.field747[var15];
            }
            byte var17;
            if (this.field736 == null) {
                var17 = 0;
            } else {
                var17 = this.field736[var15];
            }
            short var18;
            if (this.field731 == null) {
                var18 = -1;
            } else {
                var18 = this.field731[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 != 0) {
                    if (var16 == 1) {
                        class74 var26 = this.field728[var15];
                        int var27 = (var26.field1487 * arg4 + var26.field1491 * arg3 + var26.field1486 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field3542[var15] = method345(this.field733[var15] & 65535, var27);
                        var8.field3539[var15] = -1;
                    } else if (var16 == 3) {
                        var8.field3542[var15] = 128;
                        var8.field3539[var15] = -1;
                    } else {
                        var8.field3539[var15] = -2;
                    }
                } else {
                    int var19 = this.field733[var15] & 65535;
                    class89 var20;
                    if (this.field734 != null && this.field734[this.field732[var15]] != null) {
                        var20 = this.field734[this.field732[var15]];
                    } else {
                        var20 = this.field742[this.field732[var15]];
                    }
                    int var21 = (var20.field1875 * arg4 + var20.field1883 * arg2 + var20.field1873 * arg3) / (var20.field1878 * var7) + arg0;
                    var8.field3542[var15] = method345(var19, var21);
                    class89 var22;
                    if (this.field734 != null && this.field734[this.field716[var15]] != null) {
                        var22 = this.field734[this.field716[var15]];
                    } else {
                        var22 = this.field742[this.field716[var15]];
                    }
                    int var23 = (var22.field1875 * arg4 + var22.field1883 * arg2 + var22.field1873 * arg3) / (var22.field1878 * var7) + arg0;
                    var8.field3535[var15] = method345(var19, var23);
                    class89 var24;
                    if (this.field734 != null && this.field734[this.field739[var15]] != null) {
                        var24 = this.field734[this.field739[var15]];
                    } else {
                        var24 = this.field742[this.field739[var15]];
                    }
                    int var25 = (var24.field1875 * arg4 + var24.field1883 * arg2 + var24.field1873 * arg3) / (var24.field1878 * var7) + arg0;
                    var8.field3539[var15] = method345(var19, var25);
                }
            } else if (var16 != 0) {
                if (var16 == 1) {
                    class74 var34 = this.field728[var15];
                    int var35 = (var34.field1487 * arg4 + var34.field1491 * arg3 + var34.field1486 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field3542[var15] = method338(var35);
                    var8.field3539[var15] = -1;
                } else {
                    var8.field3539[var15] = -2;
                }
            } else {
                class89 var28;
                if (this.field734 != null && this.field734[this.field732[var15]] != null) {
                    var28 = this.field734[this.field732[var15]];
                } else {
                    var28 = this.field742[this.field732[var15]];
                }
                int var29 = (var28.field1875 * arg4 + var28.field1883 * arg2 + var28.field1873 * arg3) / (var28.field1878 * var7) + arg0;
                var8.field3542[var15] = method338(var29);
                class89 var30;
                if (this.field734 != null && this.field734[this.field716[var15]] != null) {
                    var30 = this.field734[this.field716[var15]];
                } else {
                    var30 = this.field742[this.field716[var15]];
                }
                int var31 = (var30.field1875 * arg4 + var30.field1883 * arg2 + var30.field1873 * arg3) / (var30.field1878 * var7) + arg0;
                var8.field3535[var15] = method338(var31);
                class89 var32;
                if (this.field734 != null && this.field734[this.field739[var15]] != null) {
                    var32 = this.field734[this.field739[var15]];
                } else {
                    var32 = this.field742[this.field739[var15]];
                }
                int var33 = (var32.field1875 * arg4 + var32.field1883 * arg2 + var32.field1873 * arg3) / (var32.field1878 * var7) + arg0;
                var8.field3539[var15] = method338(var33);
            }
        }
        this.method339();
        var8.field3540 = this.field717;
        var8.field3544 = this.field712;
        var8.field3545 = this.field725;
        var8.field3550 = this.field713;
        var8.field3537 = this.field748;
        var8.field3528 = this.field732;
        var8.field3541 = this.field716;
        var8.field3536 = this.field739;
        var8.field3549 = this.field719;
        var8.field3522 = this.field736;
        var8.field3521 = this.field745;
        var8.field3534 = this.field735;
        var8.field3529 = this.field727;
        var8.field3532 = this.field731;
        return var8;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "()V")
    private final void method335() {
        if (!this.field718) {
            super.field1780 = 0;
            this.field746 = 0;
            this.field724 = 999999;
            this.field710 = -999999;
            this.field744 = -99999;
            this.field720 = 99999;
            for (int var1 = 0; var1 < this.field717; ++var1) {
                int var2 = this.field712[var1];
                int var3 = this.field725[var1];
                int var4 = this.field713[var1];
                if (var2 < this.field724) {
                    this.field724 = var2;
                }
                if (var2 > this.field710) {
                    this.field710 = var2;
                }
                if (var4 < this.field720) {
                    this.field720 = var4;
                }
                if (var4 > this.field744) {
                    this.field744 = var4;
                }
                if (-var3 > super.field1780) {
                    super.field1780 = -var3;
                }
                if (var3 > this.field746) {
                    this.field746 = var3;
                }
            }
            this.field718 = true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(SS)V")
    public final void method336(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field748; ++var3) {
            if (this.field733[var3] == arg0) {
                this.field733[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(III)V")
    public final void method337(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field717; ++var4) {
            this.field712[var4] = this.field712[var4] * arg0 / 128;
            this.field725[var4] = this.field725[var4] * arg1 / 128;
            this.field713[var4] = this.field713[var4] * arg2 / 128;
        }
        this.method344();
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)I")
    private static final int method338(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "()V")
    private final void method339() {
        int var10002;
        if (this.field743 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field717; ++var3) {
                int var7 = this.field743[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field735 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field735[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field717) {
                int var6 = this.field743[var5];
                this.field735[var6][var1[var6]++] = var5++;
            }
            this.field743 = null;
        }
        if (this.field703 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field748; ++var10) {
                int var14 = this.field703[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field727 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field727[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field748) {
                int var13 = this.field703[var12];
                this.field727[var13][var8[var13]++] = var12++;
            }
            this.field703 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "()V")
    public final void method340() {
        for (int var1 = 0; var1 < this.field717; ++var1) {
            int var2 = this.field712[var1];
            this.field712[var1] = this.field713[var1];
            this.field713[var1] = -var2;
        }
        this.method344();
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V")
    public final void method341(int arg0) {
        int var2 = field737[arg0];
        int var3 = field730[arg0];
        for (int var4 = 0; var4 < this.field717; ++var4) {
            int var5 = this.field713[var4] * var2 + this.field712[var4] * var3 >> 16;
            this.field713[var4] = this.field713[var4] * var3 - this.field712[var4] * var2 >> 16;
            this.field712[var4] = var5;
        }
        this.method344();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Led;I)I")
    private final int method342(class33 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field712[arg1];
        int var5 = arg0.field725[arg1];
        int var6 = arg0.field713[arg1];
        for (int var7 = 0; var7 < this.field717; ++var7) {
            if (this.field712[var7] == var4 && this.field725[var7] == var5 && this.field713[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field712[this.field717] = var4;
            this.field725[this.field717] = var5;
            this.field713[this.field717] = var6;
            if (arg0.field743 != null) {
                this.field743[this.field717] = arg0.field743[arg1];
            }
            var3 = this.field717++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "()V")
    public final void method343() {
        if (this.field742 == null) {
            this.field742 = new class89[this.field717];
            for (int var1 = 0; var1 < this.field717; ++var1) {
                this.field742[var1] = new class89();
            }
            for (int var2 = 0; var2 < this.field748; ++var2) {
                int var3 = this.field732[var2];
                int var4 = this.field716[var2];
                int var5 = this.field739[var2];
                int var6 = this.field712[var4] - this.field712[var3];
                int var7 = this.field725[var4] - this.field725[var3];
                int var8 = this.field713[var4] - this.field713[var3];
                int var9 = this.field712[var5] - this.field712[var3];
                int var10 = this.field725[var5] - this.field725[var3];
                int var11 = this.field713[var5] - this.field713[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field747 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field747[var2];
                }
                if (var19 == 0) {
                    class89 var20 = this.field742[var3];
                    var20.field1883 += var16;
                    var20.field1873 += var17;
                    var20.field1875 += var18;
                    ++var20.field1878;
                    class89 var21 = this.field742[var4];
                    var21.field1883 += var16;
                    var21.field1873 += var17;
                    var21.field1875 += var18;
                    ++var21.field1878;
                    class89 var22 = this.field742[var5];
                    var22.field1883 += var16;
                    var22.field1873 += var17;
                    var22.field1875 += var18;
                    ++var22.field1878;
                } else if (var19 == 1) {
                    if (this.field728 == null) {
                        this.field728 = new class74[this.field748];
                    }
                    class74 var23 = this.field728[var2] = new class74();
                    var23.field1486 = var16;
                    var23.field1491 = var17;
                    var23.field1487 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "()V")
    private final void method344() {
        this.field742 = null;
        this.field734 = null;
        this.field728 = null;
        this.field718 = false;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)I")
    private static final int method345(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([B)V")
    private final void method346(byte[] arg0) {
        class13 var2 = new class13(arg0);
        class13 var3 = new class13(arg0);
        class13 var4 = new class13(arg0);
        class13 var5 = new class13(arg0);
        class13 var6 = new class13(arg0);
        class13 var7 = new class13(arg0);
        class13 var8 = new class13(arg0);
        var2.field309 = arg0.length - 23;
        int var9 = var2.method105(1375221240);
        int var10 = var2.method105(1375221240);
        int var11 = var2.method142(27467);
        int var12 = var2.method142(27467);
        int var13 = var2.method142(27467);
        int var14 = var2.method142(27467);
        int var15 = var2.method142(27467);
        int var16 = var2.method142(27467);
        int var17 = var2.method142(27467);
        int var18 = var2.method105(1375221240);
        int var19 = var2.method105(1375221240);
        int var20 = var2.method105(1375221240);
        int var21 = var2.method105(1375221240);
        int var22 = var2.method105(1375221240);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field738 = new byte[var11];
            var2.field309 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field738[var26] = var2.method131(false);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field717 = var9;
        this.field748 = var10;
        this.field702 = var11;
        this.field712 = new int[var9];
        this.field725 = new int[var9];
        this.field713 = new int[var9];
        this.field732 = new int[var10];
        this.field716 = new int[var10];
        this.field739 = new int[var10];
        if (var17 == 1) {
            this.field743 = new int[var9];
        }
        if (var12 == 1) {
            this.field747 = new byte[var10];
        }
        if (var13 == 255) {
            this.field719 = new byte[var10];
        } else {
            this.field745 = (byte) var13;
        }
        if (var14 == 1) {
            this.field736 = new byte[var10];
        }
        if (var15 == 1) {
            this.field703 = new int[var10];
        }
        if (var16 == 1) {
            this.field731 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field714 = new byte[var10];
        }
        this.field733 = new short[var10];
        if (var11 > 0) {
            this.field726 = new short[var11];
            this.field741 = new short[var11];
            this.field708 = new short[var11];
            if (var24 > 0) {
                this.field723 = new short[var24];
                this.field706 = new short[var24];
                this.field704 = new short[var24];
                this.field709 = new short[var24];
                this.field707 = new byte[var24];
                this.field722 = new short[var24];
            }
            if (var25 > 0) {
                this.field711 = new short[var25];
            }
        }
        var2.field309 = var11;
        var3.field309 = var44;
        var4.field309 = var46;
        var5.field309 = var48;
        var6.field309 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method142(27467);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method155(49152);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method155(49152);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method155(49152);
            }
            this.field712[var67] = var64 + var82;
            this.field725[var67] = var65 + var83;
            this.field713[var67] = var66 + var84;
            var64 = this.field712[var67];
            var65 = this.field725[var67];
            var66 = this.field713[var67];
            if (var17 == 1) {
                this.field743[var67] = var6.method142(27467);
            }
        }
        var2.field309 = var42;
        var3.field309 = var31;
        var4.field309 = var34;
        var5.field309 = var37;
        var6.field309 = var35;
        var7.field309 = var40;
        var8.field309 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field733[var68] = (short) var2.method105(1375221240);
            if (var12 == 1) {
                this.field747[var68] = var3.method131(false);
            }
            if (var13 == 255) {
                this.field719[var68] = var4.method131(false);
            }
            if (var14 == 1) {
                this.field736[var68] = var5.method131(false);
            }
            if (var15 == 1) {
                this.field703[var68] = var6.method142(27467);
            }
            if (var16 == 1) {
                this.field731[var68] = (short) (var7.method105(1375221240) - 1);
            }
            if (this.field714 != null && this.field731[var68] != -1) {
                this.field714[var68] = (byte) (var8.method142(27467) - 1);
            }
        }
        var2.field309 = var33;
        var3.field309 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method142(27467);
            if (var77 == 1) {
                var69 = var2.method155(49152) + var72;
                var70 = var2.method155(49152) + var69;
                var71 = var2.method155(49152) + var70;
                var72 = var71;
                this.field732[var73] = var69;
                this.field716[var73] = var70;
                this.field739[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method155(49152) + var72;
                var72 = var71;
                this.field732[var73] = var69;
                this.field716[var73] = var70;
                this.field739[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method155(49152) + var72;
                var72 = var71;
                this.field732[var73] = var69;
                this.field716[var73] = var70;
                this.field739[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method155(49152) + var72;
                var72 = var71;
                this.field732[var73] = var69;
                this.field716[var73] = var80;
                this.field739[var73] = var71;
            }
        }
        var2.field309 = var50;
        var3.field309 = var52;
        var4.field309 = var54;
        var5.field309 = var56;
        var6.field309 = var58;
        var7.field309 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field738[var74] & 255;
            if (var76 == 0) {
                this.field726[var74] = (short) var2.method105(1375221240);
                this.field741[var74] = (short) var2.method105(1375221240);
                this.field708[var74] = (short) var2.method105(1375221240);
            }
            if (var76 == 1) {
                this.field726[var74] = (short) var3.method105(1375221240);
                this.field741[var74] = (short) var3.method105(1375221240);
                this.field708[var74] = (short) var3.method105(1375221240);
                this.field723[var74] = (short) var4.method105(1375221240);
                this.field706[var74] = (short) var4.method105(1375221240);
                this.field704[var74] = (short) var4.method105(1375221240);
                this.field709[var74] = (short) var5.method105(1375221240);
                this.field707[var74] = var6.method131(false);
                this.field722[var74] = (short) var7.method105(1375221240);
            }
            if (var76 == 2) {
                this.field726[var74] = (short) var3.method105(1375221240);
                this.field741[var74] = (short) var3.method105(1375221240);
                this.field708[var74] = (short) var3.method105(1375221240);
                this.field723[var74] = (short) var4.method105(1375221240);
                this.field706[var74] = (short) var4.method105(1375221240);
                this.field704[var74] = (short) var4.method105(1375221240);
                this.field709[var74] = (short) var5.method105(1375221240);
                this.field707[var74] = var6.method131(false);
                this.field722[var74] = (short) var7.method105(1375221240);
                this.field711[var74] = (short) var7.method105(1375221240);
            }
            if (var76 == 3) {
                this.field726[var74] = (short) var3.method105(1375221240);
                this.field741[var74] = (short) var3.method105(1375221240);
                this.field708[var74] = (short) var3.method105(1375221240);
                this.field723[var74] = (short) var4.method105(1375221240);
                this.field706[var74] = (short) var4.method105(1375221240);
                this.field704[var74] = (short) var4.method105(1375221240);
                this.field709[var74] = (short) var5.method105(1375221240);
                this.field707[var74] = var6.method131(false);
                this.field722[var74] = (short) var7.method105(1375221240);
            }
        }
        var2.field309 = var62;
        int var75 = var2.method142(27467);
        if (var75 != 0) {
            new class32();
            var2.method105(1375221240);
            var2.method105(1375221240);
            var2.method105(1375221240);
            var2.method112(false);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(SS)V")
    public final void method347(short arg0, short arg1) {
        if (this.field731 != null) {
            for (int var3 = 0; var3 < this.field748; ++var3) {
                if (this.field731[var3] == arg0) {
                    this.field731[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "()V")
    public final void method348() {
        for (int var1 = 0; var1 < this.field717; ++var1) {
            this.field712[var1] = -this.field712[var1];
            this.field713[var1] = -this.field713[var1];
        }
        this.method344();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Led;Led;IIIZ)V")
    public static final void method349(class33 arg0, class33 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method335();
        arg0.method343();
        arg1.method335();
        arg1.method343();
        ++field721;
        int var6 = 0;
        int[] var7 = arg1.field712;
        int var8 = arg1.field717;
        for (int var9 = 0; var9 < arg0.field717; ++var9) {
            class89 var12 = arg0.field742[var9];
            if (var12.field1878 != 0) {
                int var13 = arg0.field725[var9] - arg3;
                if (var13 <= arg1.field746) {
                    int var14 = arg0.field712[var9] - arg2;
                    if (var14 >= arg1.field724 && var14 <= arg1.field710) {
                        int var15 = arg0.field713[var9] - arg4;
                        if (var15 >= arg1.field720 && var15 <= arg1.field744) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class89 var17 = arg1.field742[var16];
                                if (var7[var16] == var14 && arg1.field713[var16] == var15 && arg1.field725[var16] == var13 && var17.field1878 != 0) {
                                    if (arg0.field734 == null) {
                                        arg0.field734 = new class89[arg0.field717];
                                    }
                                    if (arg1.field734 == null) {
                                        arg1.field734 = new class89[var8];
                                    }
                                    class89 var18 = arg0.field734[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field734[var9] = new class89(var12);
                                    }
                                    class89 var19 = arg1.field734[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field734[var16] = new class89(var17);
                                    }
                                    var18.field1883 += var17.field1883;
                                    var18.field1873 += var17.field1873;
                                    var18.field1875 += var17.field1875;
                                    var18.field1878 += var17.field1878;
                                    var19.field1883 += var12.field1883;
                                    var19.field1873 += var12.field1873;
                                    var19.field1875 += var12.field1875;
                                    var19.field1878 += var12.field1878;
                                    ++var6;
                                    field705[var9] = field721;
                                    field740[var16] = field721;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field748; ++var10) {
                if (field705[arg0.field732[var10]] == field721 && field705[arg0.field716[var10]] == field721 && field705[arg0.field739[var10]] == field721) {
                    if (arg0.field747 == null) {
                        arg0.field747 = new byte[arg0.field748];
                    }
                    arg0.field747[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field748; ++var11) {
                if (field740[arg1.field732[var11]] == field721 && field740[arg1.field716[var11]] == field721 && field740[arg1.field739[var11]] == field721) {
                    if (arg1.field747 == null) {
                        arg1.field747 = new byte[arg1.field748];
                    }
                    arg1.field747[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "()V")
    public final void method350() {
        for (int var1 = 0; var1 < this.field717; ++var1) {
            int var2 = this.field713[var1];
            this.field713[var1] = this.field712[var1];
            this.field712[var1] = -var2;
        }
        this.method344();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lna;II)Led;")
    public static final class33 method351(class91 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method742(arg2, 51, arg1);
        return var3 == null ? null : new class33(var3);
    }

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "()V")
    public static void method352() {
        field705 = null;
        field740 = null;
        field737 = null;
        field730 = null;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "([B)V")
    private final void method353(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class13 var4 = new class13(arg0);
        class13 var5 = new class13(arg0);
        class13 var6 = new class13(arg0);
        class13 var7 = new class13(arg0);
        class13 var8 = new class13(arg0);
        var4.field309 = arg0.length - 18;
        int var9 = var4.method105(1375221240);
        int var10 = var4.method105(1375221240);
        int var11 = var4.method142(27467);
        int var12 = var4.method142(27467);
        int var13 = var4.method142(27467);
        int var14 = var4.method142(27467);
        int var15 = var4.method142(27467);
        int var16 = var4.method142(27467);
        int var17 = var4.method105(1375221240);
        int var18 = var4.method105(1375221240);
        int var19 = var4.method105(1375221240);
        int var20 = var4.method105(1375221240);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field717 = var9;
        this.field748 = var10;
        this.field702 = var11;
        this.field712 = new int[var9];
        this.field725 = new int[var9];
        this.field713 = new int[var9];
        this.field732 = new int[var10];
        this.field716 = new int[var10];
        this.field739 = new int[var10];
        if (var11 > 0) {
            this.field738 = new byte[var11];
            this.field726 = new short[var11];
            this.field741 = new short[var11];
            this.field708 = new short[var11];
        }
        if (var16 == 1) {
            this.field743 = new int[var9];
        }
        if (var12 == 1) {
            this.field747 = new byte[var10];
            this.field714 = new byte[var10];
            this.field731 = new short[var10];
        }
        if (var13 == 255) {
            this.field719 = new byte[var10];
        } else {
            this.field745 = (byte) var13;
        }
        if (var14 == 1) {
            this.field736 = new byte[var10];
        }
        if (var15 == 1) {
            this.field703 = new int[var10];
        }
        this.field733 = new short[var10];
        var4.field309 = var21;
        var5.field309 = var36;
        var6.field309 = var38;
        var7.field309 = var40;
        var8.field309 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method142(27467);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method155(49152);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method155(49152);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method155(49152);
            }
            this.field712[var46] = var43 + var63;
            this.field725[var46] = var44 + var64;
            this.field713[var46] = var45 + var65;
            var43 = this.field712[var46];
            var44 = this.field725[var46];
            var45 = this.field713[var46];
            if (var16 == 1) {
                this.field743[var46] = var8.method142(27467);
            }
        }
        var4.field309 = var32;
        var5.field309 = var28;
        var6.field309 = var26;
        var7.field309 = var30;
        var8.field309 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field733[var47] = (short) var4.method105(1375221240);
            if (var12 == 1) {
                int var61 = var5.method142(27467);
                if ((var61 & 1) == 1) {
                    this.field747[var47] = 1;
                    var2 = true;
                } else {
                    this.field747[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field714[var47] = (byte) (var61 >> 2);
                    this.field731[var47] = this.field733[var47];
                    this.field733[var47] = 127;
                    if (this.field731[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field714[var47] = -1;
                    this.field731[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field719[var47] = var6.method131(false);
            }
            if (var14 == 1) {
                this.field736[var47] = var7.method131(false);
            }
            if (var15 == 1) {
                this.field703[var47] = var8.method142(27467);
            }
        }
        var4.field309 = var25;
        var5.field309 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method142(27467);
            if (var57 == 1) {
                var48 = var4.method155(49152) + var51;
                var49 = var4.method155(49152) + var48;
                var50 = var4.method155(49152) + var49;
                var51 = var50;
                this.field732[var52] = var48;
                this.field716[var52] = var49;
                this.field739[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method155(49152) + var51;
                var51 = var50;
                this.field732[var52] = var48;
                this.field716[var52] = var49;
                this.field739[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method155(49152) + var51;
                var51 = var50;
                this.field732[var52] = var48;
                this.field716[var52] = var49;
                this.field739[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method155(49152) + var51;
                var51 = var50;
                this.field732[var52] = var48;
                this.field716[var52] = var60;
                this.field739[var52] = var50;
            }
        }
        var4.field309 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field738[var53] = 0;
            this.field726[var53] = (short) var4.method105(1375221240);
            this.field741[var53] = (short) var4.method105(1375221240);
            this.field708[var53] = (short) var4.method105(1375221240);
        }
        if (this.field714 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field714[var55] & 255;
                if (var56 != 255) {
                    if ((this.field726[var56] & 65535) == this.field732[var55] && (this.field741[var56] & 65535) == this.field716[var55] && (this.field708[var56] & 65535) == this.field739[var55]) {
                        this.field714[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field714 = null;
            }
        }
        if (!var3) {
            this.field731 = null;
        }
        if (!var2) {
            this.field747 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    private class33() {
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V")
    private class33(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method346(arg0);
        } else {
            this.method353(arg0);
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([Led;I)V")
    public class33(class33[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field717 = 0;
        this.field748 = 0;
        this.field702 = 0;
        this.field745 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class33 var15 = arg0[var9];
            if (var15 != null) {
                this.field717 += var15.field717;
                this.field748 += var15.field748;
                this.field702 += var15.field702;
                if (var15.field719 != null) {
                    var4 = true;
                } else {
                    if (this.field745 == -1) {
                        this.field745 = var15.field745;
                    }
                    if (this.field745 != var15.field745) {
                        var4 = true;
                    }
                }
                var3 |= var15.field747 != null;
                var5 |= var15.field736 != null;
                var6 |= var15.field703 != null;
                var7 |= var15.field731 != null;
                var8 |= var15.field714 != null;
            }
        }
        this.field712 = new int[this.field717];
        this.field725 = new int[this.field717];
        this.field713 = new int[this.field717];
        this.field743 = new int[this.field717];
        this.field732 = new int[this.field748];
        this.field716 = new int[this.field748];
        this.field739 = new int[this.field748];
        if (var3) {
            this.field747 = new byte[this.field748];
        }
        if (var4) {
            this.field719 = new byte[this.field748];
        }
        if (var5) {
            this.field736 = new byte[this.field748];
        }
        if (var6) {
            this.field703 = new int[this.field748];
        }
        if (var7) {
            this.field731 = new short[this.field748];
        }
        if (var8) {
            this.field714 = new byte[this.field748];
        }
        this.field733 = new short[this.field748];
        if (this.field702 > 0) {
            this.field738 = new byte[this.field702];
            this.field726 = new short[this.field702];
            this.field741 = new short[this.field702];
            this.field708 = new short[this.field702];
            this.field723 = new short[this.field702];
            this.field706 = new short[this.field702];
            this.field704 = new short[this.field702];
            this.field709 = new short[this.field702];
            this.field707 = new byte[this.field702];
            this.field722 = new short[this.field702];
            this.field711 = new short[this.field702];
        }
        this.field717 = 0;
        this.field748 = 0;
        this.field702 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class33 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field748; ++var12) {
                    if (var3 && var11.field747 != null) {
                        this.field747[this.field748] = var11.field747[var12];
                    }
                    if (var4) {
                        if (var11.field719 != null) {
                            this.field719[this.field748] = var11.field719[var12];
                        } else {
                            this.field719[this.field748] = var11.field745;
                        }
                    }
                    if (var5 && var11.field736 != null) {
                        this.field736[this.field748] = var11.field736[var12];
                    }
                    if (var6 && var11.field703 != null) {
                        this.field703[this.field748] = var11.field703[var12];
                    }
                    if (var7) {
                        if (var11.field731 != null) {
                            this.field731[this.field748] = var11.field731[var12];
                        } else {
                            this.field731[this.field748] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field714 != null && var11.field714[var12] != -1) {
                            this.field714[this.field748] = (byte) (var11.field714[var12] + this.field702);
                        } else {
                            this.field714[this.field748] = -1;
                        }
                    }
                    this.field733[this.field748] = var11.field733[var12];
                    this.field732[this.field748] = this.method342(var11, var11.field732[var12]);
                    this.field716[this.field748] = this.method342(var11, var11.field716[var12]);
                    this.field739[this.field748] = this.method342(var11, var11.field739[var12]);
                    ++this.field748;
                }
                for (int var13 = 0; var13 < var11.field702; ++var13) {
                    byte var14 = this.field738[this.field702] = var11.field738[var13];
                    if (var14 == 0) {
                        this.field726[this.field702] = (short) this.method342(var11, var11.field726[var13]);
                        this.field741[this.field702] = (short) this.method342(var11, var11.field741[var13]);
                        this.field708[this.field702] = (short) this.method342(var11, var11.field708[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field726[this.field702] = var11.field726[var13];
                        this.field741[this.field702] = var11.field741[var13];
                        this.field708[this.field702] = var11.field708[var13];
                        this.field723[this.field702] = var11.field723[var13];
                        this.field706[this.field702] = var11.field706[var13];
                        this.field704[this.field702] = var11.field704[var13];
                        this.field709[this.field702] = var11.field709[var13];
                        this.field707[this.field702] = var11.field707[var13];
                        this.field722[this.field702] = var11.field722[var13];
                    }
                    if (var14 == 2) {
                        this.field711[this.field702] = var11.field711[var13];
                    }
                    ++this.field702;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Led;ZZZZ)V")
    public class33(class33 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field717 = arg0.field717;
        this.field748 = arg0.field748;
        this.field702 = arg0.field702;
        if (arg1) {
            this.field712 = arg0.field712;
            this.field725 = arg0.field725;
            this.field713 = arg0.field713;
        } else {
            this.field712 = new int[this.field717];
            this.field725 = new int[this.field717];
            this.field713 = new int[this.field717];
            for (int var6 = 0; var6 < this.field717; ++var6) {
                this.field712[var6] = arg0.field712[var6];
                this.field725[var6] = arg0.field725[var6];
                this.field713[var6] = arg0.field713[var6];
            }
        }
        if (arg2) {
            this.field733 = arg0.field733;
        } else {
            this.field733 = new short[this.field748];
            for (int var7 = 0; var7 < this.field748; ++var7) {
                this.field733[var7] = arg0.field733[var7];
            }
        }
        if (!arg3 && arg0.field731 != null) {
            this.field731 = new short[this.field748];
            for (int var8 = 0; var8 < this.field748; ++var8) {
                this.field731[var8] = arg0.field731[var8];
            }
        } else {
            this.field731 = arg0.field731;
        }
        if (arg4) {
            this.field736 = arg0.field736;
        } else {
            this.field736 = new byte[this.field748];
            if (arg0.field736 == null) {
                for (int var9 = 0; var9 < this.field748; ++var9) {
                    this.field736[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field748; ++var10) {
                    this.field736[var10] = arg0.field736[var10];
                }
            }
        }
        this.field732 = arg0.field732;
        this.field716 = arg0.field716;
        this.field739 = arg0.field739;
        this.field747 = arg0.field747;
        this.field719 = arg0.field719;
        this.field714 = arg0.field714;
        this.field745 = arg0.field745;
        this.field738 = arg0.field738;
        this.field726 = arg0.field726;
        this.field741 = arg0.field741;
        this.field708 = arg0.field708;
        this.field723 = arg0.field723;
        this.field706 = arg0.field706;
        this.field704 = arg0.field704;
        this.field709 = arg0.field709;
        this.field707 = arg0.field707;
        this.field722 = arg0.field722;
        this.field711 = arg0.field711;
        this.field743 = arg0.field743;
        this.field703 = arg0.field703;
        this.field735 = arg0.field735;
        this.field727 = arg0.field727;
        this.field742 = arg0.field742;
        this.field728 = arg0.field728;
        this.field734 = arg0.field734;
        this.field729 = arg0.field729;
        this.field715 = arg0.field715;
    }
}
