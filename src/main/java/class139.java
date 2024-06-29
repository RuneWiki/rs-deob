import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class139 extends class1 {

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "[J")
    private long[] field2993 = new long[10];

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    private int field2981 = 1;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    private int field2982 = 0;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    private int field2994 = 256;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "J")
    private long field2983 = class198.method1295((byte) 62);

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lgg;")
    public static class63 field2976 = class116.method911(43, "(U4");

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "[I")
    public static int[] field2979 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Z")
    public static boolean field2984 = false;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "Lgg;")
    public static class63 field2987 = class116.method911(43, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "[[S")
    public static short[][] field2992 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lgg;")
    private static class63 field2989 = class116.method911(43, "Loaded update list");

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lgg;")
    public static class63 field2978 = field2989;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    private int field2988;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "[[[[Z")
    public static boolean[][][][] field2985;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)Lgg;")
    public static final class63 method1003(int arg0, int arg1, int arg2) {
        int var3 = arg1 - arg0;
        field2980++;
        if (var3 < -9) {
            return class75.field1847;
        } else if (var3 < -6) {
            return class196.field3941;
        } else if (var3 < -3) {
            return class104.field2397;
        } else if (var3 < 0) {
            return class165.field3388;
        } else if (var3 > 9) {
            return class109.field2466;
        } else if (arg2 != 10) {
            return null;
        } else if (var3 > 6) {
            return class109.field2459;
        } else if (var3 > 3) {
            return class133.field2890;
        } else if (var3 > 0) {
            return class17.field415;
        } else {
            return class152.field3188;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public final void method1(byte arg0) {
        int var2 = 0;
        if (arg0 != -13) {
            this.method1((byte) -104);
        }
        while (var2 < 10) {
            this.field2993[var2] = 0L;
            var2++;
        }
        field2990++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
    public final int method4(int arg0, int arg1, int arg2) {
        int var4 = this.field2981;
        field2991++;
        this.field2981 = 1;
        int var5 = this.field2994;
        this.field2994 = 300;
        this.field2983 = class198.method1295((byte) 42);
        if (this.field2993[this.field2988] == 0L) {
            this.field2981 = var4;
            this.field2994 = var5;
        } else if (this.field2993[this.field2988] < this.field2983) {
            this.field2994 = (int) ((long) (arg1 * 2560) / (this.field2983 - this.field2993[this.field2988]));
        }
        if (this.field2994 < 25) {
            this.field2994 = 25;
        }
        if (this.field2994 > 256) {
            this.field2994 = 256;
            this.field2981 = (int) ((long) arg1 - (this.field2983 - this.field2993[this.field2988]) / 10L);
        }
        if (arg1 < this.field2981) {
            this.field2981 = arg1;
        }
        this.field2993[this.field2988] = this.field2983;
        this.field2988 = (this.field2988 + 1) % 10;
        if (this.field2981 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2993[var6] != 0L) {
                    this.field2993[var6] += this.field2981;
                }
            }
        }
        int var7 = 0;
        if (this.field2981 < arg0) {
            this.field2981 = arg0;
        }
        class196.method1281((byte) -8, (long) this.field2981);
        if (arg2 != -7604) {
            return 11;
        }
        while (this.field2982 < 256) {
            var7++;
            this.field2982 += this.field2994;
        }
        this.field2982 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB[Lie;I[BIIIII)V")
    public static final void method1004(int arg0, byte arg1, class79[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2977++;
        if (arg1 != -25) {
            return;
        }
        class3 var10 = new class3(arg4);
        int var11 = -1;
        while (true) {
            int var12 = var10.method45(arg1 ^ 0x1979);
            if (var12 == 0) {
                return;
            }
            int var13 = 0;
            var11 += var12;
            while (true) {
                int var14 = var10.method45(arg1 - 6473);
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method64(31790);
                int var19 = var18 & 0x3;
                int var20 = var18 >> 2;
                if (arg7 == var17 && arg5 <= var16 && var16 < arg5 + 8 && arg8 <= var15 && arg8 + 8 > var15) {
                    class37 var21 = class167.method1133(true, var11);
                    int var22 = arg6 + class33.method318(var19, (byte) -57, var21.field914, var15 & 0x7, var16 & 0x7, var21.field893, arg9);
                    int var23 = arg0 + class157.method1087(var15 & 0x7, var16 & 0x7, var21.field893, var19, 1, arg9, var21.field914);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg3;
                        if ((class49.field1194[1][var22][var23] & 0x2) == 2) {
                            var24 = arg3 - 1;
                        }
                        class79 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg2[var24];
                        }
                        class189.method1243(var23, arg3, 0, var22, arg9 + var19 & 0x3, var11, var20, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILpa;)V")
    public static final void method1005(int arg0, class136 arg1) {
        class75.field1861 = arg1;
        field2986++;
        int var2 = 27 / ((-arg0 - 80) / 34);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static void method1006(int arg0) {
        field2976 = null;
        field2985 = null;
        field2979 = null;
        field2989 = null;
        field2992 = null;
        if (arg0 != 1214583980) {
            field2989 = null;
        }
        field2987 = null;
        field2978 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class139() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2993[var1] = this.field2983;
        }
    }
}
