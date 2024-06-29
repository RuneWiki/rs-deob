import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class421 extends class581 {

    @OriginalMember(owner = "client!uw", name = "s", descriptor = "Lro;")
    private class2 field5795 = new class2();

    @OriginalMember(owner = "client!uw", name = "H", descriptor = "I")
    private int field5810 = 256;

    @OriginalMember(owner = "client!uw", name = "J", descriptor = "I")
    private int field5812 = 256;

    @OriginalMember(owner = "client!uw", name = "L", descriptor = "I")
    private int field5814 = 0;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
    private int field5804;

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "Z")
    public static boolean field5801 = false;

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!uw", name = "p", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!uw", name = "t", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!uw", name = "D", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!uw", name = "E", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!uw", name = "F", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!uw", name = "K", descriptor = "I")
    private int field5813;

    @OriginalMember(owner = "client!uw", name = "G", descriptor = "Z")
    private boolean field5809;

    @OriginalMember(owner = "client!uw", name = "I", descriptor = "Z")
    private boolean field5811;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZII)V")
    public static final void method2435(boolean arg0, int arg1, int arg2) {
        class480.method2707(arg2, class517.field6852.method2877(class713.field9854, (byte) -108), (byte) -9, arg0);
        field5806++;
        int var3 = 19 % ((7 - arg1) / 49);
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)V")
    public static final void method2436(int arg0) {
        if (arg0 != 18128) {
            field5800 = -127;
        }
        field5792++;
        int var1 = class45.field583 * 512 + 256;
        int var2 = class324.field4605 * 512 + 256;
        int var3 = class153.method1118(var2, var1, -124, class507.field6775) - class762.field10616;
        if (class75.field918 < 100) {
            if (class694.field9662 < var1) {
                class694.field9662 += (var1 - class694.field9662) * class75.field918 / 1000 + class168.field2588;
                if (class694.field9662 > var1) {
                    class694.field9662 = var1;
                }
            }
            if (var1 < class694.field9662) {
                class694.field9662 -= (class694.field9662 - var1) * class75.field918 / 1000 + class168.field2588;
                if (var1 > class694.field9662) {
                    class694.field9662 = var1;
                }
            }
            if (class222.field3162 < var3) {
                class222.field3162 += (var3 - class222.field3162) * class75.field918 / 1000 + class168.field2588;
                if (var3 < class222.field3162) {
                    class222.field3162 = var3;
                }
            }
            if (class222.field3162 > var3) {
                class222.field3162 -= (class222.field3162 - var3) * class75.field918 / 1000 + class168.field2588;
                if (var3 > class222.field3162) {
                    class222.field3162 = var3;
                }
            }
            if (class314.field4488 < var2) {
                class314.field4488 += class168.field2588 + ((var2 - class314.field4488) * class75.field918 / 1000);
                if (var2 < class314.field4488) {
                    class314.field4488 = var2;
                }
            }
            if (class314.field4488 > var2) {
                class314.field4488 -= (class314.field4488 - var2) * class75.field918 / 1000 + class168.field2588;
                if (class314.field4488 < var2) {
                    class314.field4488 = var2;
                }
            }
        } else {
            class694.field9662 = class45.field583 * 512 + 256;
            class314.field4488 = class324.field4605 * 512 + 256;
            class222.field3162 = class153.method1118(class314.field4488, class694.field9662, -105, class507.field6775) - class762.field10616;
        }
        int var4 = class617.field8245 * 512 + 256;
        int var5 = class98.field1230 * 512 + 256;
        int var6 = class153.method1118(var5, var4, 126, class507.field6775) - class516.field6830;
        int var7 = var4 - class694.field9662;
        int var8 = var6 - class222.field3162;
        int var9 = var5 - class314.field4488;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class332.field4729 < var11) {
            class332.field4729 += (var11 - class332.field4729 >> 3) * class489.field6634 / 1000 + class4.field120 << 3;
            if (class332.field4729 > var11) {
                class332.field4729 = var11;
            }
        }
        if (var11 < class332.field4729) {
            class332.field4729 -= class4.field120 + ((class332.field4729 - var11 >> 3) * class489.field6634 / 1000) << 3;
            if (var11 > class332.field4729) {
                class332.field4729 = var11;
            }
        }
        int var13 = var12 - class372.field5175;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class372.field5175 += class489.field6634 * var14 / 1000 + class4.field120 << 3;
            class372.field5175 &= 0x3FFF;
        }
        if (var14 < 0) {
            class372.field5175 -= class4.field120 + (-var14 * class489.field6634 / 1000) << 3;
            class372.field5175 &= 0x3FFF;
        }
        int var15 = var12 - class372.field5175;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class22.field400 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class372.field5175 = var12;
        }
    }

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "()I")
    public final int method49() {
        field5791++;
        return 1;
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)I")
    public final synchronized int method2437(int arg0) {
        if (arg0 != -101) {
            method2435(false, 111, 51);
        }
        field5796++;
        return this.field5814;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BZ)V")
    public final synchronized void method2438(byte arg0, boolean arg1) {
        this.field5809 = arg1;
        int var3 = 3 / ((50 - arg0) / 57);
        field5794++;
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(Z)D")
    public final synchronized double method2439(boolean arg0) {
        field5793++;
        if (arg0) {
            this.field5812 = -120;
        }
        if (this.field5814 < 1) {
            return -1.0D;
        } else {
            class596 var2 = (class596) this.field5795.method21(2);
            return var2 == null ? -1.0D : (double) (-((float) var2.field7754[0].length / (float) class405.field5646)) + var2.field7753;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZI)V")
    public final void method2440(boolean arg0, int arg1) {
        if (!arg0) {
            this.field5812 = arg1;
            field5807++;
            this.field5810 = arg1;
        }
    }

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "(I)V")
    private final synchronized void method2441(int arg0) {
        field5799++;
        class596 var2 = this.method2443(1000);
        if (arg0 != -24222) {
            field5800 = -44;
        }
        if (var2 != null) {
            var2.method3564(true);
            this.field5814--;
            this.field5813 = 0;
            class532.field7028.method1987(var2.method3238((byte) 118), (byte) 106, var2);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)V")
    public static final void method2442(int arg0, int arg1, int arg2) {
        boolean var3 = class660.field8718[0][arg1][arg2] != null && class660.field8718[0][arg1][arg2].field9744 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class660.field8718[var4][arg1][arg2] == null) {
                class701 var5 = class660.field8718[var4][arg1][arg2] = new class701(var4);
                if (var3) {
                    var5.field9730++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "(I)Lrj;")
    private final synchronized class596 method2443(int arg0) {
        field5805++;
        return arg0 == 1000 ? (class596) this.field5795.method21(2) : null;
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "()Lgu;")
    public final class581 method33() {
        field5789++;
        return null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLrj;)V")
    public final synchronized void method2444(byte arg0, class596 arg1) {
        field5798++;
        int var3 = -35 / ((-arg0 - 47) / 63);
        while (this.field5814 >= 100) {
            this.field5795.method10(false);
            this.field5814--;
        }
        this.field5795.method11(arg1, -99);
        this.field5814++;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "([III)V")
    public final synchronized void method26(int[] arg0, int arg1, int arg2) {
        field5803++;
        if (this.field5809) {
            return;
        }
        if (this.method2443(1000) != null) {
            int var4 = arg1 + arg2;
            if (class27.field430) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field5804 == 2) {
                var6 = 1;
            }
            while (var4 > arg1) {
                class596 var7 = this.method2443(1000);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field7754;
                while (var4 > arg1 && var8[0].length > this.field5813) {
                    if (class27.field430) {
                        arg0[arg1++] = var8[var5][this.field5813] * this.field5810;
                        arg0[arg1++] = var8[var6][this.field5813] * this.field5812;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field5813] * this.field5810 + var8[var6][this.field5813] * this.field5812;
                    }
                    this.field5813++;
                }
                if (this.field5813 >= var8[0].length) {
                    this.method2441(-24222);
                }
            }
        } else if (this.field5811) {
            this.method3564(true);
            class532.field7028.method1989(true);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "()Lgu;")
    public final class581 method53() {
        field5797++;
        return null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IDB)Lrj;")
    public final class596 method2445(int arg0, double arg1, byte arg2) {
        field5808++;
        if (arg2 <= 110) {
            this.field5809 = false;
        }
        long var5 = (long) (this.field5804 << 0 | arg0);
        class596 var7 = (class596) class532.field7028.method1988(var5, -1);
        if (var7 == null) {
            var7 = new class596(new short[this.field5804][arg0], arg1);
        } else {
            var7.field7753 = arg1;
            class532.field7028.method1990(var5, false);
        }
        return var7;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V")
    public final synchronized void method2446(byte arg0) {
        this.field5811 = true;
        field5802++;
        int var2 = -74 / ((arg0 - 60) / 58);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
    public final synchronized void method60(int arg0) {
        field5790++;
        if (this.field5809) {
            return;
        }
        while (true) {
            class596 var2 = this.method2443(1000);
            if (var2 == null) {
                if (this.field5811) {
                    this.method3564(true);
                    class532.field7028.method1989(true);
                }
                return;
            }
            if (arg0 < (var2.field7754[0].length - this.field5813)) {
                this.field5813 += arg0;
                return;
            }
            arg0 -= var2.field7754[0].length - this.field5813;
            this.method2441(-24222);
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(I)V")
    public class421(int arg0) {
        this.field5804 = arg0;
    }
}
