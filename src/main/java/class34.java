import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class34 extends class51 {

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    private int field580 = -1;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    private int field578 = -1;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "Lbc;")
    private class100 field588 = null;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    private int field596 = -32768;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "Z")
    private boolean field595 = false;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    private int field572;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lld;")
    private class104 field570;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Lbc;")
    private static class100 field576 = null;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "[B")
    public static byte[] field589;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "[Z")
    public static boolean[] field592;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "[Lfa;")
    public static class171[] field594;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "[I")
    public static int[] field602;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "Lnc;")
    private class125 field593;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lvh;I)Lvh;")
    public static final class43 method225(class43 arg0, int arg1) {
        field571++;
        int var2 = 51 / ((arg1 - 51) / 46);
        class43 var3 = client.method1515(arg0);
        if (var3 == null) {
            var3 = arg0.field715;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
    public final int method166() {
        field579++;
        return this.field596;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)V")
    private final void method226(int arg0, int arg1, int arg2) {
        if (arg2 <= 98) {
            this.method167(-117, -70, 4, -26, 79);
        }
        field577++;
        if (this.field570 == null) {
            return;
        }
        int var4 = class146.field2635 - this.field586;
        if (var4 > 100 && this.field570.field1819 > 0) {
            int var5 = this.field570.field1829.length - this.field570.field1819;
            while (this.field597 < var5 && this.field570.field1824[this.field597] < var4) {
                var4 -= this.field570.field1824[this.field597];
                this.field597++;
            }
            if (this.field597 >= var5) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field570.field1829.length; var7++) {
                    var6 += this.field570.field1824[var7];
                }
                var4 %= var6;
            }
        }
        while (var4 > this.field570.field1824[this.field597]) {
            class274.method1805(this.field570, this.field597, arg1, arg0, false, (byte) -66);
            var4 -= this.field570.field1824[this.field597];
            this.field597++;
            if (this.field597 >= this.field570.field1829.length) {
                this.field597 -= this.field570.field1819;
                if (this.field597 < 0 || this.field597 >= this.field570.field1829.length) {
                    this.field570 = null;
                    break;
                }
            }
        }
        this.field586 = class146.field2635 - var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static void method227(boolean arg0) {
        if (!arg0) {
            return;
        }
        field602 = null;
        field592 = null;
        field594 = null;
        field576 = null;
        field589 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Lqk;")
    private final class51 method228(int arg0) {
        field598++;
        return arg0 > -114 ? null : this.method229(3, false);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)Lqk;")
    private final class51 method229(int arg0, boolean arg1) {
        field574++;
        boolean var3 = class273.field4861 != class192.field3535;
        class209 var4 = method232(167, this.field600);
        if (var4.field3868 != null) {
            var4 = var4.method1467((byte) -118);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = arg0 & this.field573;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field3877;
            var6 = var4.field3836;
        } else {
            var6 = var4.field3877;
            var7 = var4.field3836;
        }
        int var8 = this.field582 + (var6 >> 1);
        int var9 = this.field582 + (var6 + 1 >> 1);
        int var10 = (var7 >> 1) + this.field581;
        int var11 = this.field581 + (var7 + 1 >> 1);
        this.method226(var8 * 128, var10 * 128, 102);
        boolean var12 = !var3 && var4.field3838 && (this.field580 != var4.field3879 || this.field597 != this.field578 && class32.field551 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class192.field3535[this.field585];
        int var14 = var13[var8][var10] + var13[var9][var10] - (-var13[var8][var11] + -var13[var9][var11]) >> 2;
        int var15 = (this.field582 << 7) + (var6 << 6);
        int var16 = (this.field581 << 7) + (var7 << 6);
        int[][] var17 = null;
        boolean var18 = this.field588 == null;
        if (var3) {
            var17 = class273.field4861[0];
        } else if (this.field585 < 3) {
            var17 = class192.field3535[this.field585 + 1];
        }
        class268 var19;
        if (this.field570 == null) {
            var19 = var4.method1462(this.field572, this.field573, var13, var17, var16, var18 ? field576 : this.field588, var15, arg0 - 115, false, var12, var14);
        } else {
            var19 = var4.method1466(this.field597, var17, this.field573, var13, this.field570, -7897, this.field572, var18 ? field576 : this.field588, var16, var12, var15, var14);
        }
        return var19 == null ? null : var19.field4802;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method226(arg3, arg4, 120);
        class51 var6 = null;
        field590++;
        if (!this.field595) {
            if (var6 == null) {
                var6 = this.method228(-122);
            }
            if (var6 == null) {
                return;
            }
            this.method230((byte) -109, var6);
        }
        if (this.field593 != null) {
            this.field593.method758(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLqk;)V")
    private final void method230(byte arg0, class51 arg1) {
        class183 var3 = (class183) arg1;
        if (arg0 > -108) {
            this.field595 = false;
        }
        if ((this.field593 == null || this.field593.field2190) && (var3.field3275 != null || var3.field3279 != null)) {
            class209 var4 = method232(167, this.field600);
            if (var4.field3868 != null) {
                var4 = var4.method1467((byte) -128);
            }
            if (var4 != null) {
                this.field593 = new class125(class146.field2635, var4.field3877, var4.field3836);
            }
        }
        if (this.field593 != null) {
            this.field593.method763(var3.field3275, var3.field3279, false, var3.field3284, var3.field3262, var3.field3274);
        }
        field575++;
        this.field595 = true;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
    public static final void method231(int arg0, int arg1) {
        if (arg1 > -4) {
            return;
        }
        class147.field2651 = -1;
        class203.field3691 = arg0;
        field583++;
        class147.field2651 = -1;
        class141.method849((byte) 97);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)Lfj;")
    public static final class209 method232(int arg0, int arg1) {
        field584++;
        if (arg0 != 167) {
            return null;
        }
        class209 var2 = (class209) class143.field2562.method826((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class194.field3589.method41(-18328, class20.method142(true, arg1), class91.method519(arg0 ^ 0xFFFFD706, arg1));
        class209 var4 = new class209();
        var4.field3879 = arg1;
        if (var3 != null) {
            var4.method1460((byte) 30, new class190(var3));
        }
        var4.method1461(-6);
        if (var4.field3869) {
            var4.field3890 = 0;
            var4.field3895 = false;
        }
        if (!class50.field993 && var4.field3852) {
            var4.field3839 = null;
        }
        class143.field2562.method827(-3, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIJILnc;)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class125 arg10) {
        class51 var13 = this.method228(-128);
        field599++;
        if (var13 != null) {
            this.method230((byte) -127, var13);
            var13.method174(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field593);
        }
    }

    @OriginalMember(owner = "client!tc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field601++;
        if (this.field593 != null) {
            this.field593.method753();
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)[B")
    public static final byte[] method233(int arg0, int arg1) {
        if (arg1 != 26939) {
            field602 = null;
        }
        field591++;
        class87 var2 = (class87) class124.field2186.method1168((long) arg0, (byte) 96);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class139.method834((byte) -54, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class87(var3);
            class124.field2186.method1163(var2, (long) arg0, 0);
        }
        return var2.field1591;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIIIIZLqk;)V")
    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class51 arg8) {
        this.field573 = arg2;
        this.field585 = arg3;
        this.field582 = arg4;
        this.field572 = arg1;
        this.field581 = arg5;
        this.field600 = arg0;
        if (arg6 != -1) {
            this.field570 = class164.method1081(arg6, -21331);
            this.field586 = class146.field2635 - 1;
            this.field597 = 0;
            if (this.field570.field1842 == 0 && arg8 != null && arg8 instanceof class34) {
                class34 var10 = (class34) arg8;
                if (this.field570 == var10.field570) {
                    this.field586 = var10.field586;
                    this.field597 = var10.field597;
                    return;
                }
            }
            if (arg7 && this.field570.field1819 != -1) {
                this.field597 = (int) ((double) this.field570.field1829.length * Math.random());
                this.field586 -= (int) (Math.random() * (double) this.field570.field1824[this.field597]);
                return;
            }
        }
    }

    static {
        int var0 = 0;
        field589 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field589[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field592 = new boolean[5];
        field594 = new class171[6];
        field602 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };
    }
}
