import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class765 extends class497 {

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "Z")
    private boolean field10539 = false;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "Z")
    private boolean field10532;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "[Lks;")
    private class461[] field10538;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "[C")
    public static char[] field10531 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field10533;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field10534;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field10535;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field10536;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field10537;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
    public static void method4234(int arg0) {
        field10531 = null;
        if (arg0 >= -23) {
            field10531 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZB)V")
    public final void method928(boolean arg0, byte arg1) {
        ++field10533;
        int var3 = -32 / ((arg1 - 24) / 46);
        super.field7086.method1080(class463.field6532, class776.field10666, -30);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public final void method926(int arg0) {
        if (arg0 == -339) {
            if (this.field10539) {
                super.field7086.method1192(-22137, 1);
                super.field7086.method1118(0, (class684) null);
                super.field7086.method1081(107, class29.field417);
                super.field7086.method1182((byte) -120);
                if (!this.field10532) {
                    super.field7086.method1080(class463.field6532, class463.field6532, -30);
                    super.field7086.method1180(0, (byte) 91, class605.field8453);
                    super.field7086.method1192(-22137, 2);
                    super.field7086.method1080(class463.field6532, class463.field6532, -30);
                    super.field7086.method1180(0, (byte) 91, class605.field8453);
                    super.field7086.method1180(1, (byte) 91, class639.field8962);
                    super.field7086.method1082(0, class605.field8453, (byte) -112);
                    super.field7086.method1118(arg0 + 339, (class684) null);
                } else {
                    super.field7086.method1080(class463.field6532, class463.field6532, -30);
                    super.field7086.method1180(0, (byte) 91, class605.field8453);
                    super.field7086.method1082(0, class605.field8453, (byte) -112);
                }
                super.field7086.method1192(-22137, 0);
                this.field10539 = false;
            } else {
                super.field7086.method1082(0, class605.field8453, (byte) -112);
            }
            ++field10535;
            super.field7086.method1080(class463.field6532, class463.field6532, -30);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Z")
    public final boolean method921(int arg0) {
        ++field10537;
        int var2 = 65 % ((arg0 - 19) / 52);
        return true;
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)I")
    public static final int method4235(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class270.field3919 - 1; ++var2) {
            if (arg0 < class606.field8480[var2] + class189.field2915[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class270.field3919 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BILkja;)V")
    public final void method925(byte arg0, int arg1, class684 arg2) {
        if (arg0 > 83) {
            ++field10536;
            super.field7086.method1118(0, arg2);
            super.field7086.method1189(55, arg1);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBI)V")
    public final void method923(int arg0, byte arg1, int arg2) {
        ++field10534;
        if (this.field10539) {
            super.field7086.method1192(-22137, 1);
            super.field7086.method1118(0, this.field10538[arg0 + -1]);
            super.field7086.method1192(-22137, 0);
        }
        if (arg1 < 5) {
            this.field10532 = true;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)V")
    public final void method929(int arg0, boolean arg1) {
        ++field10540;
        if (arg0 > -83) {
            this.field10532 = true;
        }
        if (this.field10538 != null && arg1) {
            super.field7086.method1192(-22137, 1);
            super.field7086.method1081(123, class335.field4713);
            class385 var3 = super.field7086.method1161(256);
            var3.method1888(1024);
            super.field7086.method1152(115, class714.field9899);
            if (!this.field10532) {
                super.field7086.method1080(class776.field10666, class463.field6532, -30);
                super.field7086.method1180(0, (byte) 91, class639.field8962);
                super.field7086.method1192(-22137, 2);
                super.field7086.method1080(class624.field8745, class776.field10666, -30);
                super.field7086.method1180(0, (byte) 91, class639.field8962);
                super.field7086.method1158(false, true, (byte) -118, class639.field8962, 1);
                super.field7086.method1082(0, class407.field5550, (byte) -112);
                super.field7086.method1118(0, super.field7086.field2465);
            } else {
                super.field7086.method1080(class624.field8745, class776.field10666, -30);
                super.field7086.method1158(false, true, (byte) -89, class605.field8453, 0);
                super.field7086.method1082(0, class407.field5550, (byte) -112);
            }
            super.field7086.method1192(-22137, 0);
            this.field10539 = true;
        } else {
            super.field7086.method1082(0, class407.field5550, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lpj;)V")
    public class765(class156 arg0) {
        super(arg0);
        if (arg0.field2481) {
            this.field10532 = arg0.field2436 < 3;
            int var2 = this.field10532 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (~var14 != -3) {
                                if (~var14 == -4) {
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
            this.field10538 = new class461[3];
            this.field10538[0] = super.field7086.method1134(false, 64, -2, var4);
            this.field10538[1] = super.field7086.method1134(false, 64, -2, var5);
            this.field10538[2] = super.field7086.method1134(false, 64, -2, var3);
        }
    }
}
