import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class240 extends class160 {

    @OriginalMember(owner = "client!gj", name = "ib", descriptor = "I")
    private int field3904 = 32768;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "[I")
    public static int[] field3894 = new int[2];

    @OriginalMember(owner = "client!gj", name = "db", descriptor = "Lam;")
    public static class180 field3899 = new class180();

    @OriginalMember(owner = "client!gj", name = "nb", descriptor = "Z")
    public static boolean field3909 = false;

    @OriginalMember(owner = "client!gj", name = "ob", descriptor = "[I")
    public static int[] field3910 = new int[2500];

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!gj", name = "eb", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!gj", name = "gb", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!gj", name = "jb", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!gj", name = "kb", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!gj", name = "lb", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!gj", name = "mb", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!gj", name = "hb", descriptor = "Lia;")
    public static class231 field3903;

    @OriginalMember(owner = "client!gj", name = "fb", descriptor = "Lhc;")
    public static class235 field3901;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "[I")
    public static int[] field3893;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "[[[I")
    public static int[][][] field3891;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "(B)V")
    public static void method1644(byte arg0) {
        field3899 = null;
        field3894 = null;
        if (arg0 == -4) {
            field3893 = null;
            field3910 = null;
            field3903 = null;
            field3901 = null;
            field3891 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V")
    public static final void method1645(int arg0) {
        ++field3902;
        class266.field4246.method1898((byte) 67);
        if (arg0 != 17548) {
            method1646((String) null, (String) null, 122, (String) null, -77, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IB)V")
    public static final void method1646(String arg0, String arg1, int arg2, String arg3, int arg4, byte arg5) {
        for (int var6 = 99; ~var6 < -1; --var6) {
            class152.field2382[var6] = class152.field2382[var6 + -1];
            class200.field3136[var6] = class200.field3136[var6 + -1];
            class193.field3060[var6] = class193.field3060[var6 + -1];
            class260.field4161[var6] = class260.field4161[var6 + -1];
            class62.field1073[var6] = class62.field1073[var6 + -1];
        }
        class200.field3136[0] = arg3;
        if (arg5 >= -78) {
            method1648(79);
        }
        class193.field3060[0] = arg0;
        ++field3889;
        class260.field4161[0] = arg1;
        ++class97.field1626;
        class238.field3854 = class275.field4392;
        class152.field2382[0] = arg2;
        class62.field1073[0] = arg4;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIIIB)V")
    public static final void method1647(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field3905;
        if (class53.method394(false, arg2)) {
            class293.method1959(arg0, arg3, 255, -1, arg1, class193.field3052[arg2]);
            if (arg4 <= 50) {
                field3896 = -119;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field3907;
        if (!arg1) {
            this.field3904 = -101;
        }
        int[][] var3 = super.field2476.method839(false, arg0);
        if (super.field2476.field1950) {
            int[] var4 = this.method1085(1, arg0, (byte) 80);
            int[] var5 = this.method1085(2, arg0, (byte) 88);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < field3896; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field3904 >> 12;
                int var12 = class106.field1759[var10] * var11 >> 12;
                int var13 = class197.field3112[var10] * var11 >> 12;
                int var14 = class53.field811 & (var12 >> 12) + arg0;
                int var15 = (var13 >> 12) + var9 & class189.field2929;
                int[][] var16 = this.method1079(var14, 96, 0);
                var7[var9] = var16[0][var15];
                var6[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class240() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field3895;
        int[] var3 = super.field2488.method15((byte) 124, arg0);
        if (arg1 != 57) {
            field3894 = null;
        }
        if (super.field2488.field42) {
            int[] var4 = this.method1085(1, arg0, (byte) 89);
            int[] var5 = this.method1085(2, arg0, (byte) 90);
            for (int var6 = 0; field3896 > var6; ++var6) {
                int var7 = var5[var6] * this.field3904 >> 12;
                int var8 = (var4[var6] & 4085) >> 4;
                int var9 = class106.field1759[var8] * var7 >> 12;
                int var10 = class197.field3112[var8] * var7 >> 12;
                int var11 = (var10 >> 12) + var6 & class189.field2929;
                int var12 = class53.field811 & (var9 >> 12) + arg0;
                int[] var13 = this.method1085(0, var12, (byte) 49);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field3897;
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field2494 = arg0.method633(73) == 1;
            }
        } else {
            this.field3904 = arg0.method645(11596) << 4;
        }
        if (arg1 <= 11) {
            this.method1(-11, (byte) -31);
        }
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        if (arg0 > -124) {
            field3909 = false;
        }
        class47.method338(121);
        ++field3898;
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)I")
    public static final int method1648(int arg0) {
        if (arg0 != 15760) {
            field3891 = null;
        }
        ++field3906;
        class58.field956 = 0;
        return class261.method1766(false);
    }
}
