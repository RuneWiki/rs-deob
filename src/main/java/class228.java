import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class228 extends class607 {

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "Z")
    private boolean field3203 = false;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "Z")
    private boolean field3204;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "[Lwn;")
    private class627[] field3194;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "Z")
    public static boolean field3195 = false;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "[I")
    public static int[] field3199 = new int[13];

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)Z")
    public final boolean method814(byte arg0) {
        ++field3202;
        if (arg0 != -97) {
            this.method808(-70, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)V")
    public final void method808(int arg0, boolean arg1) {
        ++field3200;
        super.field8870.method1912(class274.field3839, class457.field6837, 126);
        if (arg0 != 993) {
            this.method805((byte) 85);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBLiu;)V")
    public final void method810(int arg0, byte arg1, class502 arg2) {
        super.field8870.method1971((byte) -68, arg2);
        ++field3193;
        if (arg1 < -73) {
            super.field8870.method1904(arg0, -128);
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V")
    public final void method805(byte arg0) {
        if (this.field3203) {
            super.field8870.method1957(-2, 1);
            super.field8870.method1971((byte) -88, (class502) null);
            super.field8870.method1546(class479.field7049, arg0 ^ -21154);
            super.field8870.method1950(arg0 + 7927);
            if (!this.field3204) {
                super.field8870.method1912(class457.field6837, class457.field6837, 103);
                super.field8870.method1970(arg0 ^ 92, class83.field935, 0);
                super.field8870.method1957(-2, 2);
                super.field8870.method1912(class457.field6837, class457.field6837, arg0 + 156);
                super.field8870.method1970(33, class83.field935, 0);
                super.field8870.method1970(20, class577.field8332, 1);
                super.field8870.method1907(class83.field935, true, 0);
                super.field8870.method1971((byte) -80, (class502) null);
            } else {
                super.field8870.method1912(class457.field6837, class457.field6837, arg0 ^ -87);
                super.field8870.method1970(-107, class83.field935, 0);
                super.field8870.method1907(class83.field935, true, 0);
            }
            super.field8870.method1957(-2, 0);
            this.field3203 = false;
        } else {
            super.field8870.method1907(class83.field935, true, 0);
        }
        ++field3197;
        super.field8870.method1912(class457.field6837, class457.field6837, 97);
        if (arg0 != -58) {
            this.method814((byte) 51);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)V")
    public final void method815(int arg0, int arg1, int arg2) {
        if (arg0 == 12868) {
            if (this.field3203) {
                super.field8870.method1957(-2, 1);
                super.field8870.method1971((byte) -103, this.field3194[arg1 + -1]);
                super.field8870.method1957(-2, 0);
            }
            ++field3198;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V")
    public static final void method1478(byte arg0, int[] arg1, Object[] arg2) {
        class438.method2729(arg1.length - 1, 0, arg2, arg1, 43);
        ++field3196;
        if (arg0 > -121) {
            method1479(-30);
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V")
    public static void method1479(int arg0) {
        if (arg0 != 64) {
            method1479(-86);
        }
        field3199 = null;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ltu;)V")
    public class228(class294 arg0) {
        super(arg0);
        if (arg0.field4334) {
            this.field3204 = ~arg0.field4302 > -4;
            int var2 = !this.field3204 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 != -2) {
                                if (var14 == 2) {
                                    var15 = var13;
                                } else if (var14 == 3) {
                                    var15 = -var13;
                                } else if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field3194 = new class627[3];
            this.field3194[0] = super.field8870.method1537(false, 64, var4, false);
            this.field3194[1] = super.field8870.method1537(false, 64, var5, false);
            this.field3194[2] = super.field8870.method1537(false, 64, var3, false);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZB)V")
    public final void method811(boolean arg0, byte arg1) {
        if (arg1 == 91) {
            ++field3201;
            if (this.field3194 != null && arg0) {
                super.field8870.method1957(-2, 1);
                super.field8870.method1546(class555.field7885, 21144);
                class646 var3 = super.field8870.method1930(1);
                var3.method2017(1024);
                super.field8870.method1935(class199.field2683, true);
                if (!this.field3204) {
                    super.field8870.method1912(class457.field6837, class274.field3839, 106);
                    super.field8870.method1970(arg1 ^ -55, class577.field8332, 0);
                    super.field8870.method1957(arg1 + -93, 2);
                    super.field8870.method1912(class274.field3839, class107.field1276, arg1 ^ 63);
                    super.field8870.method1970(36, class577.field8332, 0);
                    super.field8870.method1521(true, 1, false, class577.field8332, false);
                    super.field8870.method1907(class242.field3434, true, 0);
                    super.field8870.method1971((byte) -75, super.field8870.field4288);
                } else {
                    super.field8870.method1912(class274.field3839, class107.field1276, arg1 + -201);
                    super.field8870.method1521(true, 0, false, class83.field935, false);
                    super.field8870.method1907(class242.field3434, true, 0);
                }
                super.field8870.method1957(arg1 + -93, 0);
                this.field3203 = true;
            } else {
                super.field8870.method1907(class242.field3434, true, 0);
            }
        }
    }
}
