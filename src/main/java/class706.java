import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class706 extends class429 {

    @OriginalMember(owner = "client!fda", name = "s", descriptor = "Z")
    private boolean field9891 = false;

    @OriginalMember(owner = "client!fda", name = "q", descriptor = "Z")
    private boolean field9889;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "[Lwf;")
    private class540[] field9887;

    @OriginalMember(owner = "client!fda", name = "v", descriptor = "Lin;")
    public static class380 field9894 = new class380(86, 7);

    @OriginalMember(owner = "client!fda", name = "y", descriptor = "I")
    public static int field9897 = 500;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!fda", name = "r", descriptor = "I")
    public static int field9890;

    @OriginalMember(owner = "client!fda", name = "t", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!fda", name = "u", descriptor = "I")
    public static int field9893;

    @OriginalMember(owner = "client!fda", name = "w", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!fda", name = "x", descriptor = "I")
    public static int field9896;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZZ)V")
    public final void method44(boolean arg0, boolean arg1) {
        if (!arg1) {
            if (this.field9887 != null && arg0) {
                super.field5939.method959(1, -58);
                super.field5939.method98(class431.field5982, (byte) -60);
                class742 var3 = super.field5939.method943(-23324);
                var3.method1562(1024);
                super.field5939.method983(-112, class604.field8581);
                if (this.field9889) {
                    super.field5939.method974(class228.field3319, class552.field7657, (byte) -59);
                    super.field5939.method139(0, false, true, class264.field3730, 0);
                    super.field5939.method973(0, class368.field5193, (byte) 75);
                } else {
                    super.field5939.method974(class552.field7657, class317.field4523, (byte) -59);
                    super.field5939.method1014(0, 99, class317.field4535);
                    super.field5939.method959(2, 114);
                    super.field5939.method974(class228.field3319, class552.field7657, (byte) -59);
                    super.field5939.method1014(0, 115, class317.field4535);
                    super.field5939.method139(1, false, true, class317.field4535, 0);
                    super.field5939.method973(0, class368.field5193, (byte) 88);
                    super.field5939.method988(1, super.field5939.field1900);
                }
                super.field5939.method959(0, 7);
                this.field9891 = true;
            } else {
                super.field5939.method973(0, class368.field5193, (byte) 108);
            }
            ++field9895;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Len;ZI)V")
    public final void method45(class408 arg0, boolean arg1, int arg2) {
        super.field5939.method988(1, arg0);
        if (arg1) {
            method3945(-105, -81);
        }
        ++field9890;
        super.field5939.method949(arg2, (byte) 57);
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(B)V")
    public static void method3944(byte arg0) {
        if (arg0 > 109) {
            field9894 = null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)Z")
    public static final boolean method3945(int arg0, int arg1) {
        ++field9885;
        if (arg1 >= -87) {
            return false;
        } else {
            return ~arg0 != -2 && ~arg0 != -8;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)Z")
    public final boolean method48(byte arg0) {
        if (arg0 != -128) {
            method3944((byte) 70);
        }
        ++field9893;
        return true;
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lmj;)V")
    public class706(class114 arg0) {
        super(arg0);
        if (arg0.field1894) {
            this.field9889 = ~arg0.field1861 > -4;
            int var2 = !this.field9889 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (var14 != 1) {
                                if (var14 != 2) {
                                    if (~var14 == -4) {
                                        var15 = -var13;
                                    } else if (~var14 != -5) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = var13;
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
            this.field9887 = new class540[3];
            this.field9887[0] = super.field5939.method81(false, var4, 64, false);
            this.field9887[1] = super.field5939.method81(false, var5, 64, false);
            this.field9887[2] = super.field5939.method81(false, var3, 64, false);
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(II)J")
    public static final long method3946(int arg0, int arg1) {
        ++field9892;
        int var2 = -90 / ((arg1 - 35) / 63);
        return (long) (arg0 - -11745) * 86400000L;
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)V")
    public final void method47(byte arg0) {
        if (this.field9891) {
            super.field5939.method959(1, -128);
            super.field5939.method988(1, (class408) null);
            super.field5939.method98(class766.field10585, (byte) -60);
            super.field5939.method1013(true);
            if (this.field9889) {
                super.field5939.method974(class317.field4523, class317.field4523, (byte) -59);
                super.field5939.method1014(0, 69, class264.field3730);
                super.field5939.method973(0, class264.field3730, (byte) 57);
            } else {
                super.field5939.method974(class317.field4523, class317.field4523, (byte) -59);
                super.field5939.method1014(0, 100, class264.field3730);
                super.field5939.method959(2, 109);
                super.field5939.method974(class317.field4523, class317.field4523, (byte) -59);
                super.field5939.method1014(0, 115, class264.field3730);
                super.field5939.method1014(1, 82, class317.field4535);
                super.field5939.method973(0, class264.field3730, (byte) 76);
                super.field5939.method988(1, (class408) null);
            }
            super.field5939.method959(0, 2);
            this.field9891 = false;
        } else {
            super.field5939.method973(0, class264.field3730, (byte) 78);
        }
        ++field9896;
        super.field5939.method974(class317.field4523, class317.field4523, (byte) -59);
        int var2 = -35 / ((-56 - arg0) / 48);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)V")
    public final void method46(int arg0, int arg1, int arg2) {
        if (arg0 == 37) {
            if (this.field9891) {
                super.field5939.method959(1, 6);
                super.field5939.method988(1, this.field9887[arg2 + -1]);
                super.field5939.method959(0, 121);
            }
            ++field9886;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZ)V")
    public final void method43(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method3944((byte) 76);
        }
        ++field9888;
        super.field5939.method974(class317.field4523, class552.field7657, (byte) -59);
    }
}
