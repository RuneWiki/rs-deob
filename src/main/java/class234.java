import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class234 extends class34 {

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "Z")
    private boolean field3668 = false;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "Z")
    private boolean field3666 = false;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "Lud;")
    private class2 field3679 = null;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    private int field3669 = -32768;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    private int field3677 = -1;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    private int field3684 = -1;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    private int field3657;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    private int field3662;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    private int field3656;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    private int field3660;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    private int field3675;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    private int field3673;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    private int field3671;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    private int field3683;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    private int field3654;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    private int field3655;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "Lai;")
    private class91 field3678;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public static int field3680 = 0;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "Lgi;")
    public static class164 field3667;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lga;")
    private class181 field3653;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static final void method1611(int arg0) {
        field3682++;
        if (arg0 != 16359) {
            method1614((class2) null, (byte) 9);
        }
        class247.field3881 = new class223();
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public static void method1612(int arg0) {
        field3667 = null;
        int var1 = 97 / ((2 - arg0) / 57);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZZ)Lie;")
    private final class34 method1613(boolean arg0, boolean arg1) {
        field3670++;
        boolean var3 = class300.field4915 != class166.field2746;
        class172 var4 = class49.method319(this.field3657, 0);
        if (var4.field2846 != null) {
            var4 = var4.method1214(-124);
        }
        if (var4 == null) {
            this.field3684 = -1;
            this.field3677 = this.field3655;
            return null;
        }
        if (!this.field3668 && this.field3684 != var4.field2843) {
            this.method1616((byte) -120, -1);
        }
        int var5 = this.field3673 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field2809;
            var6 = var4.field2821;
        } else {
            var6 = var4.field2809;
            var7 = var4.field2821;
        }
        int var8 = (var7 >> 1) + this.field3675;
        int var9 = (var7 + 1 >> 1) + this.field3675;
        int var10 = (var6 >> 1) + this.field3660;
        int var11 = (var6 + 1 >> 1) + this.field3660;
        this.method1619(-122, var8 * 128, var10 * 128);
        boolean var12 = !var3 && var4.field2884 && (this.field3684 != var4.field2843 || (this.field3677 != this.field3655 || this.field3678 != null && (this.field3678.field1446 || class271.field4369) && this.field3683 != this.field3655) && class240.field3761 >= 2);
        if (arg1 && !var12) {
            this.field3684 = var4.field2843;
            this.field3677 = this.field3655;
            return null;
        }
        int[][] var13 = class166.field2746[this.field3662];
        int var14 = var13[var8][var10] + var13[var8][var11] + var13[var9][var11] + var13[var9][var10] >> 2;
        int var15 = (this.field3660 << 7) + (var6 << 6);
        int var16 = (this.field3675 << 7) + (var7 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class300.field4915[0];
        } else if (this.field3662 < 3) {
            var17 = class166.field2746[this.field3662 + 1];
        }
        boolean var18 = this.field3679 == null;
        class193 var19;
        if (this.field3678 == null) {
            var19 = var4.method1224(var14, var13, var18 ? class45.field671 : this.field3679, var17, var16, false, var15, this.field3673, 114, this.field3656, var12);
        } else {
            var19 = var4.method1229(var16, this.field3678, this.field3683, 104, var17, var14, this.field3656, var12, this.field3673, this.field3654, var13, var18 ? class45.field671 : this.field3679, this.field3655, var15);
        }
        if (var19 == null) {
            this.field3684 = var4.field2843;
            this.field3677 = this.field3655;
            return null;
        }
        this.field3677 = this.field3655;
        if (!arg0) {
            this.field3673 = -21;
        }
        this.field3684 = var4.field2843;
        return var19.field3149;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()I")
    public final int method22() {
        field3664++;
        return this.field3669;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lud;B)V")
    public static final void method1614(class2 arg0, byte arg1) {
        field3661++;
        for (int var2 = 0; var2 < class242.field3791.length; var2++) {
            class242.field3791[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class242.field3791[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class133.field2143[var15] = (class242.field3791[var15 - 128] + class242.field3791[var15 + 1] + class242.field3791[var15 + -1] + class242.field3791[var15 - -128]) / 4;
                }
            }
            int[] var13 = class242.field3791;
            class242.field3791 = class133.field2143;
            class133.field2143 = var13;
        }
        if (arg0 != null) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field3181; var7++) {
                for (int var8 = 0; var8 < arg0.field3179; var8++) {
                    if (arg0.field2[var6++] != 0) {
                        int var9 = var8 + arg0.field3169 + 16;
                        int var10 = arg0.field3175 + var7 + 16;
                        int var11 = (var10 << 7) + var9;
                        class242.field3791[var11] = 0;
                    }
                }
            }
        }
        if (arg1 >= -26) {
            method1614((class2) null, (byte) -104);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZ)I")
    public static final int method1615(int arg0, int arg1, boolean arg2) {
        field3674++;
        if (!arg2) {
            field3667 = null;
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3663++;
        this.method1619(29, arg3, arg4);
        class34 var6 = null;
        if (!this.field3666) {
            if (var6 == null) {
                var6 = this.method1617(1);
            }
            if (var6 == null) {
                return;
            }
            this.method1618(var6, 1);
        }
        if (this.field3653 != null) {
            this.field3653.method1275(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)V")
    private final void method1616(byte arg0, int arg1) {
        field3676++;
        boolean var3 = false;
        int var4 = arg1;
        if (arg1 == -1) {
            class172 var5 = class49.method319(this.field3657, 0);
            class172 var6 = var5;
            if (var5.field2846 != null) {
                var5 = var5.method1214(-94);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field2823 != null) {
                if (this.field3678 != null && var5.method1220(-55, this.field3678.field1455)) {
                    return;
                }
                var4 = var5.method1228((byte) 63);
                if (this.field3684 != var5.field2843) {
                    var3 = var5.field2855;
                }
            } else if (var5.field2805 == -1) {
                if (var6 != null && var6.field2823 != null) {
                    if (this.field3678 != null && var6.method1220(-24, this.field3678.field1455)) {
                        return;
                    }
                    var4 = var6.method1228((byte) 82);
                    if (this.field3684 != var6.field2843) {
                        var3 = var6.field2855;
                    }
                } else if (var6 != null && var6.field2805 != -1 && this.field3684 != var6.field2843) {
                    var3 = var6.field2855;
                    var4 = var6.field2805;
                }
            } else if (this.field3684 != var5.field2843) {
                var4 = var5.field2805;
                var3 = var5.field2855;
            }
        }
        if (var4 == -1) {
            this.field3678 = null;
            return;
        }
        if (this.field3678 == null || this.field3678.field1455 != var4) {
            this.field3678 = class159.method1085((byte) -63, var4);
        } else if (this.field3678.field1453 == 0) {
            return;
        }
        if (var3) {
            this.field3655 = (int) (Math.random() * (double) this.field3678.field1434.length);
            this.field3654 = ((int) ((double) this.field3678.field1452[this.field3655] * Math.random())) + 1;
        } else {
            this.field3654 = 1;
            this.field3655 = 0;
        }
        this.field3683 = this.field3655 + 1;
        if (arg0 <= -97) {
            if (this.field3683 < 0 || this.field3678.field1434.length <= this.field3683) {
                this.field3683 = -1;
            }
            this.field3671 = class274.field4472 - this.field3654;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lie;")
    public final class34 method1617(int arg0) {
        field3672++;
        if (arg0 != 1) {
            this.field3684 = 54;
        }
        return this.method1613(true, false);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lie;I)V")
    private final void method1618(class34 arg0, int arg1) {
        field3659++;
        class3 var3 = (class3) arg0;
        if ((this.field3653 == null || this.field3653.field2992) && (var3.field26 != null || var3.field17 != null)) {
            class172 var4 = class49.method319(this.field3657, 0);
            if (var4.field2846 != null) {
                var4 = var4.method1214(-118);
            }
            if (var4 != null) {
                this.field3653 = new class181(class274.field4472, var4.field2821, var4.field2809);
            }
        }
        if (this.field3653 != null) {
            this.field3653.method1274(var3.field26, var3.field17, false, var3.field36, var3.field40, var3.field10);
        }
        if (arg1 != 1) {
            this.method1619(-28, 23, 79);
        }
        this.field3666 = true;
    }

    @OriginalMember(owner = "client!ce", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3653 != null) {
            this.field3653.method1269();
        }
        field3658++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class181 arg10) {
        field3665++;
        class34 var13 = this.method1617(1);
        if (var13 != null) {
            this.method1618(var13, 1);
            var13.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3653);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(III)V")
    private final void method1619(int arg0, int arg1, int arg2) {
        int var4 = 117 / ((arg0 + 62) / 58);
        field3652++;
        label88: while (true) {
            if (this.field3678 == null) {
                if (this.field3668) {
                    return;
                }
                this.method1616((byte) -112, -1);
                if (this.field3678 == null) {
                    return;
                }
            }
            int var5 = class274.field4472 - this.field3671;
            if (var5 > 100 && this.field3678.field1442 > 0) {
                int var6 = this.field3678.field1434.length - this.field3678.field1442;
                while (var6 > this.field3655 && this.field3678.field1452[this.field3655] < var5) {
                    var5 -= this.field3678.field1452[this.field3655];
                    this.field3655++;
                }
                if (var6 <= this.field3655) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field3678.field1434.length; var8++) {
                        var7 += this.field3678.field1452[var8];
                    }
                    var5 %= var7;
                }
                this.field3683 = this.field3655 + 1;
                if (this.field3683 >= this.field3678.field1434.length) {
                    this.field3683 -= this.field3678.field1442;
                    if (this.field3683 < 0 || this.field3678.field1434.length <= this.field3683) {
                        this.field3683 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field3678.field1452[this.field3655] >= var5) {
                            this.field3671 = class274.field4472 - var5;
                            this.field3654 = var5;
                            return;
                        }
                        class252.method1710(this.field3655, arg2, this.field3678, arg1, false, 120);
                        var5 -= this.field3678.field1452[this.field3655];
                        this.field3655++;
                        if (this.field3655 >= this.field3678.field1434.length) {
                            this.field3655 -= this.field3678.field1442;
                            if (this.field3655 < 0 || this.field3678.field1434.length <= this.field3655) {
                                this.field3678 = null;
                                continue label88;
                            }
                        }
                        this.field3683 = this.field3655 + 1;
                    } while (this.field3683 < this.field3678.field1434.length);
                    this.field3683 -= this.field3678.field1442;
                } while (this.field3683 >= 0 && this.field3683 < this.field3678.field1434.length);
                this.field3683 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(IIIIIIIZLie;)V")
    public class234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class34 arg8) {
        this.field3657 = arg0;
        this.field3662 = arg3;
        this.field3656 = arg1;
        this.field3660 = arg5;
        this.field3675 = arg4;
        this.field3673 = arg2;
        if (arg8 != null) {
            this.field3668 = true;
            if (arg8 instanceof class234) {
                class234 var10 = (class234) arg8;
                this.field3671 = var10.field3671;
                this.field3683 = var10.field3683;
                this.field3654 = var10.field3654;
                this.field3655 = var10.field3655;
                this.field3678 = var10.field3678;
            }
        }
        if (this.field3668) {
            this.method1616((byte) -114, arg6);
        }
    }
}
