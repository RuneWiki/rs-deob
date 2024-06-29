import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class41 extends class30 {

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
    private int field515 = 32768;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "[Loh;")
    public static class231[] field512;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLmo;)V")
    public static final void method271(byte arg0, class447 arg1) {
        class193.field3135 = arg1;
        ++field519;
        if (arg0 > -115) {
            field516 = -87;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method203(byte arg0, int arg1) {
        ++field511;
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566) {
            int[] var4 = this.method210((byte) 117, 1, arg1);
            int[] var5 = this.method210((byte) 35, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class369.field5610; ++var9) {
                int var10 = (var4[var9] * 255 & 1045985) >> 12;
                int var11 = var5[var9] * this.field515 >> 12;
                int var12 = class183.field2986[var10] * var11 >> 12;
                int var13 = class232.field3877[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class106.field1492;
                int var15 = arg1 - -(var13 >> 12) & class246.field4033;
                int[][] var16 = this.method206(var15, 2, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 != -93) {
            field516 = -77;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class41() {
        super(3, false);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)V")
    public final void method111(byte arg0) {
        if (arg0 > 90) {
            class173.method1208(4096);
            ++field514;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field376 = arg0.method1322(false) == 1;
            }
        } else {
            this.field515 = arg0.method1272((byte) -88) << 4;
        }
        if (arg1 == 6456) {
            ++field513;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field518;
        if (arg1 <= 49) {
            return null;
        } else {
            int[] var3 = super.field371.method2367((byte) -55, arg0);
            if (super.field371.field5586) {
                int[] var4 = this.method210((byte) 53, 1, arg0);
                int[] var5 = this.method210((byte) 41, 2, arg0);
                for (int var6 = 0; ~class369.field5610 < ~var6; ++var6) {
                    int var7 = 255 & var4[var6] >> 4;
                    int var8 = var5[var6] * this.field515 >> 12;
                    int var9 = class183.field2986[var7] * var8 >> 12;
                    int var10 = class232.field3877[var7] * var8 >> 12;
                    int var11 = var6 - -(var9 >> 12) & class106.field1492;
                    int var12 = class246.field4033 & arg0 - -(var10 >> 12);
                    int[] var13 = this.method210((byte) 34, 0, var12);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)V")
    public static final void method272(byte arg0) {
        class52 var1 = class308.field4876;
        synchronized (class308.field4876) {
            class308.field4876.method335((byte) 58);
        }
        ++field509;
        class52 var2 = class86.field1081;
        synchronized (class86.field1081) {
            class86.field1081.method335((byte) -79);
        }
        if (arg0 == 101) {
            class52 var3 = class30.field373;
            synchronized (class30.field373) {
                class30.field373.method335((byte) -84);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
    public static void method273(int arg0) {
        int var1 = -90 % ((59 - arg0) / 40);
        field512 = null;
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(B)V")
    public static final void method274(byte arg0) {
        class84.field1046 = null;
        ++field517;
        class35.method228(0, class430.field6324, false, -1, class306.field4847, 0, class369.field5615, 0, 0);
        if (class84.field1046 != null) {
            class303.method2033(class158.field2516.field2781, 0, class71.field882, -1412584499, 0, class84.field1046, class430.field6324, -1, class222.field3700, class369.field5615);
            class84.field1046 = null;
        }
        if (arg0 != 6) {
            method272((byte) 105);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(BI)V")
    public static final void method275(byte arg0, int arg1) {
        if (arg0 == -77) {
            class217.field3552 = -1;
            class291.field4646 = 100;
            class411.field6088 = arg1;
            ++field508;
            class433.field6401 = 3;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILno;)I")
    public static final int method276(int arg0, class418 arg1) {
        ++field510;
        String var2 = class30.method209(arg1, (byte) -107);
        if (arg0 != -11133) {
            method271((byte) -3, (class447) null);
        }
        int[] var3 = null;
        if (class222.method1590((byte) -21, arg1.field6192)) {
            var3 = class155.method1092(true, (int) arg1.field6194).field1361;
        } else if (!class239.method1692(arg1.field6192, 119)) {
            if (class104.method792(arg1.field6192, 20308)) {
                if (arg1.field6192 == 1001) {
                    var3 = class137.method1003((int) arg1.field6194, -30796).field1959;
                } else {
                    var3 = class137.method1003((int) (arg1.field6194 >>> 32 & 2147483647L), -30796).field1959;
                }
            }
        } else {
            class50 var4 = class39.field499[(int) arg1.field6194];
            if (var4 != null) {
                var3 = var4.field615.field3797;
            }
        }
        if (var3 != null) {
            var2 = var2 + class269.method1826(true, var3);
        }
        return class413.field6111.method2156(class372.field5627, -63, var2);
    }
}
