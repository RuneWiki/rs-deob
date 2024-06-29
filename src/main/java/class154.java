import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class154 extends class200 {

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    private int field2823 = 12288;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    private int field2810 = 8192;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    private int field2822 = 0;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    private int field2820 = 2048;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
    private int field2825 = 0;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    private int field2812 = 4096;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    private int field2821 = 2048;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "Lid;")
    private static class149 field2815 = class60.method382("Loaded wordpack", (byte) 7);

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "S")
    public static short field2824 = 256;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lid;")
    public static class149 field2819 = class60.method382(":assist:", (byte) 21);

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "Lid;")
    public static class149 field2817 = field2815;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "Lid;")
    public static class149 field2814 = class60.method382("Zugewiesener Speicher)3", (byte) 15);

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "Lid;")
    public static class149 field2828 = class60.method382("Hierhin drehen", (byte) 29);

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "[[[B")
    public static byte[][][] field2830;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IB)V")
    public static final void method1090(int arg0, byte arg1) {
        class71.field1246 = 0;
        class128.field2254 = null;
        class99.field1757 = -1;
        class93.field1643 = -1;
        ++field2829;
        class10.field133 = false;
        class76.field1375 = 1;
        class231.field4070 = arg0;
        int var2 = 52 / ((arg1 - -18) / 54);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        int var2 = 84 % ((arg0 - -60) / 62);
        class124.method871(-106);
        ++field2816;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Z")
    private final boolean method1091(int arg0, int arg1, int arg2) {
        ++field2826;
        int var4 = (-arg2 + arg1) * this.field2823 >> 12;
        int var5 = class106.field1832[arg0 * var4 >> 12 & 255];
        int var6 = (var5 << 12) / this.field2823;
        int var7 = (var6 << 12) / this.field2810;
        int var8 = this.field2812 * var7 >> 12;
        return var8 > arg2 - -arg1 && ~(arg1 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public static final void method1092(int arg0) {
        ++field2827;
        if (arg0 != -1) {
            method1095(-1);
        }
        class27.field406.method1290((byte) 37);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1095(47);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field2810 = arg0.method485(-2386);
                                }
                            } else {
                                this.field2812 = arg0.method485(-2386);
                            }
                        } else {
                            this.field2823 = arg0.method485(-2386);
                        }
                    } else {
                        this.field2821 = arg0.method485(-2386);
                    }
                } else {
                    this.field2825 = arg0.method485(-2386);
                }
            } else {
                this.field2822 = arg0.method485(-2386);
            }
        } else {
            this.field2820 = arg0.method485(-2386);
        }
        ++field2811;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field2813;
        if (arg1 != 55) {
            this.method1094(-11, -50, -27);
        }
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int var4 = class93.field1644[arg0] + -2048;
            for (int var5 = 0; ~var5 > ~class137.field2515; ++var5) {
                int var6 = class73.field1263[var5] + -2048;
                int var7 = this.field2822 + var4;
                int var8 = this.field2825 + var6;
                int var9 = var7 < -2048 ? var7 + 4096 : var7;
                int var10 = this.field2820 + var6;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = var8 >= -2048 ? var8 : var8 - -4096;
                int var13 = this.field2821 + var4;
                int var14 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var15 = ~var12 >= -2049 ? var12 : var12 + -4096;
                int var16 = var9 > 2048 ? var9 - 4096 : var9;
                int var17 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method1091(255, var16, var14) && !this.method1094(0, var18, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)Lpg;")
    public static final class75 method1093(byte arg0, int arg1) {
        int var2 = 49 % ((60 - arg0) / 34);
        ++field2808;
        class75 var3 = (class75) class248.field4350.method800(261775, (long) arg1);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4;
            if (~arg1 > -32769) {
                var4 = class54.field968.method1562(-809612665, arg1, 0);
            } else {
                var4 = class233.field4104.method1562(-809612665, arg1 & 32767, 0);
            }
            class75 var5 = new class75();
            if (var4 != null) {
                var5.method542(71, new class74(var4));
            }
            if (~arg1 <= -32769) {
                var5.method536(-24414);
            }
            class248.field4350.method802((long) arg1, 0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)Z")
    private final boolean method1094(int arg0, int arg1, int arg2) {
        int var4 = (arg1 - -arg2) * this.field2823 >> 12;
        int var5 = class106.field1832[(1046891 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field2823;
        ++field2809;
        int var7 = (var6 << 12) / this.field2810;
        if (arg0 != 0) {
            return false;
        } else {
            int var8 = this.field2812 * var7 >> 12;
            return -arg2 + arg1 < var8 && -arg2 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
    public static void method1095(int arg0) {
        if (arg0 != 9000) {
            method1092(61);
        }
        field2830 = null;
        field2828 = null;
        field2817 = null;
        field2819 = null;
        field2815 = null;
        field2814 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class154() {
        super(0, true);
    }
}
