import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class792 extends class232 {

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "Z")
    private boolean field10859 = false;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "Z")
    private boolean field10863;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "[Lbv;")
    private class320[] field10855;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "Lke;")
    public static class622 field10864 = new class622(61, 7);

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "Ljo;")
    public static class351 field10866 = new class351(29, -1);

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "Lke;")
    public static class622 field10867 = new class622(32, 28);

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field10868 = new String[200];

    @OriginalMember(owner = "client!mp", name = "y", descriptor = "I")
    public static int field10870 = -1;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field10854;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field10856;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field10857;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field10858;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
    public static int field10860;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
    public static int field10861;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
    public static int field10862;

    @OriginalMember(owner = "client!mp", name = "x", descriptor = "I")
    public static int field10869;

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "[I")
    public static int[] field10865;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)V")
    public final void method573(byte arg0) {
        ++field10856;
        if (this.field10859) {
            super.field3368.method1140((byte) -14, 1);
            super.field3368.method1104(true, (class749) null);
            super.field3368.method1065(-13455, class607.field8551);
            super.field3368.method1048(true);
            if (this.field10863) {
                super.field3368.method1136((byte) -128, class174.field2460, class174.field2460);
                super.field3368.method1056(32, class412.field5814, 0);
                super.field3368.method1157(1, 0, class412.field5814);
            } else {
                super.field3368.method1136((byte) -120, class174.field2460, class174.field2460);
                super.field3368.method1056(32, class412.field5814, 0);
                super.field3368.method1140((byte) -124, 2);
                super.field3368.method1136((byte) -90, class174.field2460, class174.field2460);
                super.field3368.method1056(32, class412.field5814, 0);
                super.field3368.method1056(32, class490.field6967, 1);
                super.field3368.method1157(1, 0, class412.field5814);
                super.field3368.method1104(true, (class749) null);
            }
            super.field3368.method1140((byte) -114, 0);
            this.field10859 = false;
        } else {
            super.field3368.method1157(1, 0, class412.field5814);
        }
        if (arg0 <= 77) {
            this.method569(47, 110, -53);
        }
        super.field3368.method1136((byte) -117, class174.field2460, class174.field2460);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZB)V")
    public final void method568(boolean arg0, byte arg1) {
        if (this.field10855 != null && arg0) {
            super.field3368.method1140((byte) -109, 1);
            super.field3368.method1065(-13455, class163.field2391);
            class468 var3 = super.field3368.method1043(false);
            var3.method1966(1024);
            super.field3368.method1073(class144.field1840, arg1 + 25342);
            if (!this.field10863) {
                super.field3368.method1136((byte) -105, class438.field6278, class174.field2460);
                super.field3368.method1056(32, class490.field6967, 0);
                super.field3368.method1140((byte) -90, 2);
                super.field3368.method1136((byte) -115, class576.field8141, class438.field6278);
                super.field3368.method1056(32, class490.field6967, 0);
                super.field3368.method1057(1, false, class490.field6967, true, (byte) 118);
                super.field3368.method1157(1, 0, class492.field6991);
                super.field3368.method1104(true, super.field3368.field2200);
            } else {
                super.field3368.method1136((byte) -94, class576.field8141, class438.field6278);
                super.field3368.method1057(0, false, class412.field5814, true, (byte) 121);
                super.field3368.method1157(1, 0, class492.field6991);
            }
            super.field3368.method1140((byte) -76, 0);
            this.field10859 = true;
        } else {
            super.field3368.method1157(arg1 + 127, 0, class492.field6991);
        }
        if (arg1 != -126) {
            method4326((byte) 15);
        }
        ++field10858;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILdr;I)V")
    public final void method570(int arg0, class749 arg1, int arg2) {
        ++field10857;
        super.field3368.method1104(true, arg1);
        super.field3368.method1088((byte) -31, arg2);
        if (arg0 != 2305) {
            this.method568(false, (byte) -43);
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lwk;)V")
    public class792(class151 arg0) {
        super(arg0);
        if (arg0.field2210) {
            this.field10863 = ~arg0.field2197 > -4;
            int var2 = !this.field10863 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (~var14 != -3) {
                                if (var14 == 3) {
                                    var15 = -var12;
                                } else if (~var14 == -5) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field10855 = new class320[3];
            this.field10855[0] = super.field3368.method1066(var4, false, -105, 64);
            this.field10855[1] = super.field3368.method1066(var5, false, -109, 64);
            this.field10855[2] = super.field3368.method1066(var3, false, -110, 64);
        }
    }

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "(I)Z")
    public final boolean method571(int arg0) {
        ++field10860;
        if (arg0 != -30998) {
            field10870 = -29;
        }
        return true;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BJ)V")
    public static final void method4325(byte arg0, long arg1) {
        ++field10861;
        if (class378.field5427 != null) {
            if (class763.field10510 != 1 && ~class763.field10510 != -6) {
                if (class763.field10510 == 4) {
                    class636.method3620(arg1, -11);
                }
            } else {
                class493.method2879(arg1, -113);
            }
        }
        class205.method1471(class638.field8979, (long) class673.field9441, 0);
        if (~class251.field3546 != 0) {
            class48.method310(class251.field3546, -72);
        }
        for (int var3 = 0; class351.field5115 > var3; ++var3) {
            if (class397.field5653[var3]) {
                class89.field1151[var3] = true;
            }
            class73.field987[var3] = class397.field5653[var3];
            class397.field5653[var3] = false;
        }
        class433.field6163 = class673.field9441;
        class145.method998(-58, (class176) null, -1, -1);
        class694.method3913(-1, (class176) null, -1, true);
        int var4 = 45 % ((arg0 - -29) / 36);
        if (class251.field3546 != -1) {
            class351.field5115 = 0;
            client.method2053((byte) 111);
        }
        class638.field8979.method463();
        class9.method74(class638.field8979, -6);
        int var5 = class600.method3472(-13);
        if (var5 == -1) {
            var5 = class303.field4540;
        }
        if (var5 == -1) {
            var5 = class733.field10240;
        }
        class759.method4189(var5, true);
        int var6 = class251.field3549.method2692((byte) -128) << 8;
        class433.method2598(6172, class251.field3549.field7719 + var6, class251.field3549.field7718 + var6, class55.field755, class251.field3549.field7710);
        class55.field755 = 0;
    }

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(B)V")
    public static void method4326(byte arg0) {
        field10868 = null;
        field10864 = null;
        field10867 = null;
        field10866 = null;
        field10865 = null;
        int var1 = 78 / ((16 - arg0) / 58);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
    public final void method569(int arg0, int arg1, int arg2) {
        if (this.field10859) {
            super.field3368.method1140((byte) -42, 1);
            super.field3368.method1104(true, this.field10855[arg2 - 1]);
            super.field3368.method1140((byte) -94, 0);
        }
        int var4 = -36 / ((arg0 - 48) / 51);
        ++field10869;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)V")
    public final void method572(boolean arg0, int arg1) {
        ++field10862;
        if (arg1 < 21) {
            method4326((byte) -117);
        }
        super.field3368.method1136((byte) -122, class174.field2460, class438.field6278);
    }
}
