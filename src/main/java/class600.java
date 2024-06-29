import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class600 extends class495 {

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "I")
    public int field8672;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    public int field8669;

    @OriginalMember(owner = "client!em", name = "O", descriptor = "Z")
    public boolean field8670;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "F")
    public float field8671;

    @OriginalMember(owner = "client!em", name = "V", descriptor = "F")
    public float field8676;

    @OriginalMember(owner = "client!em", name = "X", descriptor = "Lwg;")
    public static class58 field8677 = new class58(4);

    @OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
    public static int field8679 = 1;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!em", name = "U", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!em", name = "Y", descriptor = "Lha;")
    public static class116 field8678;

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Luq;IIII[I)V")
    public class600(class313 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field8672 = arg1;
        this.field8669 = arg2;
        this.method2780(0, 0, arg5, 0, (byte) 121, true, arg1, arg2, 0);
        this.field8670 = false;
        this.field8671 = (float) arg2 / (float) arg4;
        this.field8676 = (float) arg1 / (float) arg3;
        this.method2776(-36, false, false);
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Luq;IIIIIZ)V")
    public class600(class313 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field8672 = arg4;
        this.field8669 = arg5;
        if (~super.field1907 != -34038) {
            this.field8670 = true;
            this.field8676 = this.field8671 = 1.0F;
        } else {
            this.field8670 = false;
            this.field8671 = (float) arg5;
            this.field8676 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Luq;IIIII[BI)V")
    public class600(class313 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field8669 = arg3;
        this.field8672 = arg2;
        this.method2782(true, arg3, (byte) -105, arg6, 0, 0, 0, arg7, arg2, 0);
        this.field8671 = (float) arg3 / (float) arg5;
        this.field8670 = false;
        this.field8676 = (float) arg2 / (float) arg4;
        this.method2776(-87, false, false);
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Luq;IIIIIIZ)V")
    public class600(class313 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field8670 = false;
        this.field8671 = (float) arg4 / (float) arg6;
        this.field8669 = arg4;
        this.field8672 = arg3;
        this.field8676 = (float) arg3 / (float) arg5;
        this.method2776(-55, false, false);
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(B)V")
    public static void method3452(byte arg0) {
        if (arg0 != 118) {
            method3453(-11, 110);
        }
        field8678 = null;
        field8677 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Z")
    public static final boolean method3453(int arg0, int arg1) {
        ++field8675;
        if (arg1 >= -66) {
            method3455(102, (byte) 60, 108, -57, 7, 25, -56, (class23) null, (class23) null, 2);
        }
        return arg0 == 2 || ~arg0 == -7 || arg0 == 9;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Luq;IIIIZ[BI)V")
    public class600(class313 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field1907 == 34037) {
            this.field8676 = (float) arg3;
            this.field8670 = false;
            this.field8671 = (float) arg4;
        } else {
            this.field8676 = this.field8671 = 1.0F;
            this.field8670 = true;
        }
        this.field8669 = arg4;
        this.field8672 = arg3;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Luq;IIIZ[I)V")
    public class600(class313 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field8672 = arg2;
        this.field8669 = arg3;
        if (~super.field1907 == -34038) {
            this.field8670 = false;
            this.field8676 = (float) arg2;
            this.field8671 = (float) arg3;
        } else {
            this.field8676 = this.field8671 = 1.0F;
            this.field8670 = true;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method3454(boolean arg0, String arg1, byte arg2) {
        ++field8673;
        if (arg1 != null) {
            if (~class466.field6613 <= -101) {
                class534.method2970(class52.field698.method2157(class245.field3103, 4074), (byte) -71);
            } else {
                String var3 = class22.method125(48, arg1);
                if (var3 != null) {
                    for (int var4 = 0; var4 < class466.field6613; ++var4) {
                        String var8 = class22.method125(69, class546.field7616[var4]);
                        if (var8 != null && var8.equals(var3)) {
                            class534.method2970(arg1 + class491.field6862.method2157(class245.field3103, 4074), (byte) -51);
                            return;
                        }
                        if (class282.field3694[var4] != null) {
                            String var9 = class22.method125(59, class282.field3694[var4]);
                            if (var9 != null && var9.equals(var3)) {
                                class534.method2970(arg1 + class491.field6862.method2157(class245.field3103, arg2 ^ 4002), (byte) -20);
                                return;
                            }
                        }
                    }
                    if (arg2 != 72) {
                        field8678 = null;
                    }
                    for (int var5 = 0; class447.field6284 > var5; ++var5) {
                        String var6 = class22.method125(83, class395.field5457[var5]);
                        if (var6 != null && var6.equals(var3)) {
                            class534.method2970(class646.field9347.method2157(class245.field3103, 4074) + arg1 + class90.field1219.method2157(class245.field3103, 4074), (byte) -63);
                            return;
                        }
                        if (class71.field964[var5] != null) {
                            String var7 = class22.method125(arg2 + 23, class71.field964[var5]);
                            if (var7 != null && var7.equals(var3)) {
                                class534.method2970(class646.field9347.method2157(class245.field3103, 4074) + arg1 + class90.field1219.method2157(class245.field3103, 4074), (byte) -72);
                                return;
                            }
                        }
                    }
                    if (class22.method125(122, class147.field1899.field257).equals(var3)) {
                        class534.method2970(class407.field5586.method2157(class245.field3103, 4074), (byte) -116);
                    } else {
                        class118.method650(true, class646.field9351);
                        ++class165.field2092;
                        class272.field3457.method3060(1 + class194.method1241(arg1, arg2 + -198), arg2 + -25170);
                        class272.field3457.method3040(false, arg1);
                        class272.field3457.method3060(!arg0 ? 0 : 1, arg2 ^ -25154);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IBIIIIILdc;Ldc;I)V")
    public static final void method3455(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class23 arg7, class23 arg8, int arg9) {
        ++field8674;
        int var10 = arg7.method113(-125);
        if (~var10 != 0) {
            Object var11 = null;
            class116 var12 = (class116) class26.field449.method323((long) var10, -19814);
            if (var12 == null) {
                class295[] var13 = class295.method1803(class24.field433, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class301.field3918.method916(var13[0], true);
                class26.field449.method316((long) var10, (byte) -115, var12);
            }
            class521.method2908(arg8.field6362, arg8.field6368, arg8.field6358, 0, arg8.method104((byte) -92) * 256, arg5 >> 1, arg3, arg6 >> 1, arg0, arg1 + 28);
            int var14 = class155.field2011[0] + arg9 + -18;
            int var15 = arg4 - 54 + class155.field2011[1] + -16;
            if (arg1 == -30) {
                int var16 = arg2 / 4 * 18 + var14;
                int var17 = arg2 % 4 * 18 + var15;
                var12.method632(var16, var17);
                if (arg7 == arg8) {
                    class301.field3918.method919(var16 - 1, 18, 18, (byte) 0, -256, var17 + -1);
                }
                class93 var18 = class308.method1846(0);
                var18.field1235 = var16 - -16;
                var18.field1232 = var17 + 16;
                var18.field1236 = var17;
                var18.field1228 = var16;
                var18.field1231 = arg7;
                class620.field8927.method1873(var18, true);
            }
        }
    }
}
