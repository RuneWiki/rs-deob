import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class162 extends class123 {

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    private int field2722 = -32768;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    private int field2747 = 0;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    private int field2749 = 0;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Z")
    private boolean field2730 = false;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    private int field2758;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    private int field2748;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    private int field2751;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    private int field2740;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    private int field2738;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public int field2743;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "Lpb;")
    private class2 field2761;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
    public static int field2762 = 0;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2727 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "D")
    private double field2724;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "D")
    public double field2728;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "D")
    private double field2729;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "D")
    private double field2741;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "D")
    public double field2745;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "D")
    private double field2746;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "D")
    private double field2750;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "D")
    public double field2754;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    private int field2756;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method1081(int arg0, byte arg1) {
        field2737++;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class292.field5028 += arg0 * 128;
        if (class69.field1196.length < class292.field5028) {
            int var3 = (int) (Math.random() * 12.0D);
            class292.field5028 -= class69.field1196.length;
            class286.method2013(class114.field1967[var3], arg1 ^ 0xFFFFEAC0);
        }
        if (arg1 != 24) {
            field2727 = (BigInteger) null;
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class5.field66[var4 + var5] - (class69.field1196[class292.field5028 + var4 & class69.field1196.length + -1] * arg0 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class5.field66[var4++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class5.field66[var10 + var11] = 255;
                } else {
                    class5.field66[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class293.field5047[var13] = class293.field5047[arg0 + var13];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class293.field5047[var14] = (int) (Math.sin((double) class236.field4135 / 14.0D) * 16.0D + Math.sin((double) class236.field4135 / 15.0D) * 14.0D + Math.sin((double) class236.field4135 / 16.0D) * 12.0D);
            class236.field4135++;
        }
        int var15 = ((class202.field3498 & 0x1) + arg0) / 2;
        class137.field2345 += arg0;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class137.field2345; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class5.field66[(var18 << 7) + var17] = 192;
        }
        class137.field2345 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var22 + var15 < 128) {
                    var21 += class5.field66[var15 + var22 + var20];
                }
                if (var22 - var15 - 1 >= 0) {
                    var21 -= class5.field66[var20 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class188.field3340[var20 + var22] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > (var15 + var25)) {
                    var24 += class188.field3340[var15 * 128 + var23 + var26];
                }
                if ((var25 - var15 - 1) >= 0) {
                    var24 -= class188.field3340[var26 + var23 - (var15 * 128 + 128)];
                }
                if (var25 >= 0) {
                    class5.field66[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIJI)Loh;", line = 186)
    public static final class258 method1082(boolean arg0, int arg1, long arg2, int arg3) {
        if (arg1 > -94) {
            method1085(24, -83L);
        }
        field2759++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var5 = 1;
        for (long var6 = arg2 / (long) arg3; var6 != 0L; var6 /= (long) arg3) {
            var5++;
        }
        int var8 = var5;
        if (arg2 < 0L || arg0) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg2 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg2 % (long) arg3);
            arg2 /= (long) arg3;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class258 var12 = new class258();
        var12.field4490 = var9;
        var12.field4478 = var8;
        return var12;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)Li;", line = 247)
    private final class305 method1083(int arg0) {
        field2731++;
        if (arg0 > -120) {
            this.method1087(-115, 62);
        }
        class212 var2 = class149.method1022(this.field2738, false);
        class305 var3 = var2.method1417((byte) -62, this.field2747);
        if (var3 == null) {
            return null;
        } else {
            var3.method638(this.field2756);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLoh;)Loh;", line = 277)
    public static final class258 method1084(byte arg0, class258 arg1) {
        field2736++;
        int var2 = class78.method559(5, arg1);
        if (var2 == -1) {
            return class113.field1949;
        } else {
            int var3 = 11 % ((arg0 + 28) / 61);
            return class65.field1144.field3851[var2].method1773(144, class225.field3869, class50.field765);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IJ)Loh;", line = 296)
    public static final class258 method1085(int arg0, long arg1) {
        field2732++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 115 % ((arg0 - 28) / 51);
            int var4 = 0;
            for (long var5 = arg1; var5 != 0L; var5 /= 37L) {
                var4++;
            }
            byte[] var7 = new byte[var4];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var4--;
                var7[var4] = class231.field3976[(int) (var8 - (arg1 * 37L))];
            }
            class258 var10 = new class258();
            var10.field4490 = var7;
            var10.field4478 = var7.length;
            return var10;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILgb;II)Z", line = 338)
    public static final boolean method1086(int arg0, class213 arg1, int arg2, int arg3) {
        byte[] var4 = arg1.method1453(arg3, (byte) -29, arg2);
        field2739++;
        if (arg0 != 0) {
            return false;
        } else if (var4 == null) {
            return false;
        } else {
            class212.method1418(-97, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 580)
    public class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2726 = arg1;
        this.field2760 = arg5;
        this.field2758 = arg2;
        this.field2752 = arg9;
        this.field2734 = arg3;
        this.field2748 = arg4;
        this.field2751 = arg8;
        this.field2723 = arg6;
        this.field2730 = false;
        this.field2740 = arg7;
        this.field2738 = arg0;
        this.field2743 = arg10;
        int var12 = class149.method1022(this.field2738, false).field3657;
        if (var12 == -1) {
            this.field2761 = null;
        } else {
            this.field2761 = class263.method1842(var12, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V", line = 360)
    public final void method1087(int arg0, int arg1) {
        this.field2745 += (double) arg1 * this.field2750;
        int var3 = 76 / ((-arg0 - 11) / 54);
        this.field2728 += (double) arg1 * this.field2746;
        this.field2730 = true;
        this.field2754 += this.field2729 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2724;
        this.field2724 += (double) arg1 * this.field2729;
        field2753++;
        this.field2755 = (int) (Math.atan2(this.field2746, this.field2750) * 325.949D) + 1024 & 0x7FF;
        this.field2756 = (int) (Math.atan2(this.field2724, this.field2741) * 325.949D) & 0x7FF;
        if (this.field2761 == null) {
            return;
        }
        this.field2749 += arg1;
        while (true) {
            do {
                do {
                    if (this.field2749 <= this.field2761.field35[this.field2747]) {
                        return;
                    }
                    this.field2749 -= this.field2761.field35[this.field2747];
                    this.field2747++;
                } while (this.field2747 < this.field2761.field41.length);
                this.field2747 -= this.field2761.field14;
            } while (this.field2747 >= 0 && this.field2747 < this.field2761.field41.length);
            this.field2747 = 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(JII[I)Loh;", line = 411)
    public static final class258 method1088(long arg0, int arg1, int arg2, int[] arg3) {
        field2733++;
        if (class23.field282 != null) {
            class258 var5 = class23.field282.method779(-29496, arg3, arg0, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg2 >= -32) {
            return (class258) null;
        } else if (arg1 == 5) {
            return method1085(-95, arg0).method1786((byte) 107);
        } else {
            return class152.method1041((byte) 47, arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIIJ)V", line = 446)
    public final void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2757++;
        class305 var11 = this.method1083(-126);
        if (var11 != null) {
            var11.method363(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2722 = var11.method361();
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)V", line = 460)
    public static final void method1089(int arg0, int arg1) {
        field2742++;
        if (arg0 == -1 || !class48.field720[arg0]) {
            return;
        }
        class289.field4987.method1426(arg0, 0);
        if (class23.field290[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = arg1; var3 < class23.field290[arg0].length; var3++) {
            if (class23.field290[arg0][var3] != null) {
                if (class23.field290[arg0][var3].field2936 == 2) {
                    var2 = false;
                } else {
                    class23.field290[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class23.field290[arg0] = null;
        }
        class48.field720[arg0] = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBIII)V", line = 520)
    public final void method1090(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2725++;
        if (!this.field2730) {
            double var6 = (double) (arg3 - this.field2758);
            double var8 = (double) (arg2 - this.field2734);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2745 = (double) this.field2751 * var8 / var10 + (double) this.field2734;
            this.field2754 = (double) this.field2748;
            this.field2728 = (double) this.field2751 * var6 / var10 + (double) this.field2758;
        }
        if (arg1 > -14) {
            method1084((byte) -65, (class258) null);
        }
        double var12 = (double) (this.field2723 + 1 - arg0);
        this.field2750 = ((double) arg2 - this.field2745) / var12;
        this.field2746 = ((double) arg3 - this.field2728) / var12;
        this.field2741 = Math.sqrt(this.field2750 * this.field2750 + this.field2746 * this.field2746);
        if (!this.field2730) {
            this.field2724 = -this.field2741 * Math.tan((double) this.field2740 * 0.02454369D);
        }
        this.field2729 = ((double) arg4 - this.field2754 - (this.field2724 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 554)
    public static void method1091(int arg0) {
        if (arg0 == 128) {
            field2727 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()I", line = 571)
    public final int method361() {
        field2744++;
        return this.field2722;
    }
}
