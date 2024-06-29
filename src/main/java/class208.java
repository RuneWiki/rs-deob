import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class208 extends class55 {

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "Z")
    private boolean field2756 = false;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Z")
    private boolean field2757;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "[Lnn;")
    private class418[] field2759;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Z")
    public static boolean field2752 = false;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field2763 = -1;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)V")
    public final void method196(int arg0, boolean arg1) {
        if (arg0 == 5) {
            if (this.field2759 != null && arg1) {
                super.field759.method2393(1, (byte) 30);
                super.field759.method2014(class545.field7603, 0);
                class477 var3 = super.field759.method2364((byte) -127);
                var3.method590(1024);
                super.field759.method2384(2, class559.field7776);
                if (!this.field2757) {
                    super.field759.method2397(class476.field6418, class405.field5120, (byte) -81);
                    super.field759.method2394(class84.field1162, (byte) 112, 0);
                    super.field759.method2393(2, (byte) -127);
                    super.field759.method2397(class155.field2108, class476.field6418, (byte) 41);
                    super.field759.method2394(class84.field1162, (byte) 125, 0);
                    super.field759.method2036((byte) -100, false, true, class84.field1162, 1);
                    super.field759.method2422(class479.field6523, 0, (byte) -10);
                    super.field759.method2396(arg0 + 22352, super.field759.field5648);
                } else {
                    super.field759.method2397(class155.field2108, class476.field6418, (byte) 21);
                    super.field759.method2036((byte) 119, false, true, class447.field5937, 0);
                    super.field759.method2422(class479.field6523, 0, (byte) -10);
                }
                super.field759.method2393(0, (byte) 44);
                this.field2756 = true;
            } else {
                super.field759.method2422(class479.field6523, 0, (byte) -10);
            }
            ++field2755;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZB)V")
    public final void method197(boolean arg0, byte arg1) {
        ++field2760;
        super.field759.method2397(class405.field5120, class476.field6418, (byte) -89);
        int var3 = 5 / ((arg1 - -61) / 44);
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lij;)V")
    public class208(class424 arg0) {
        super(arg0);
        if (arg0.field5591) {
            this.field2757 = ~arg0.field5586 > -4;
            int var2 = !this.field2757 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (~var14 == -2) {
                            var15 = var12;
                        } else if (var14 != 2) {
                            if (var14 == 3) {
                                var15 = -var13;
                            } else if (var14 == 4) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
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
            this.field2759 = new class418[3];
            this.field2759[0] = super.field759.method2034(64, false, -9866, var4);
            this.field2759[1] = super.field759.method2034(64, false, -9866, var5);
            this.field2759[2] = super.field759.method2034(64, false, -9866, var3);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILfe;)V")
    public final void method200(int arg0, int arg1, class572 arg2) {
        if (arg1 < 30) {
            this.field2759 = null;
        }
        super.field759.method2396(22357, arg2);
        ++field2750;
        super.field759.method2379(arg0, -15829);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
    public final void method201(boolean arg0) {
        if (!arg0) {
            this.field2759 = null;
        }
        ++field2761;
        if (this.field2756) {
            super.field759.method2393(1, (byte) -118);
            super.field759.method2396(22357, (class572) null);
            super.field759.method2014(class94.field1317, 0);
            super.field759.method2418(11032);
            if (!this.field2757) {
                super.field759.method2397(class405.field5120, class405.field5120, (byte) -82);
                super.field759.method2394(class447.field5937, (byte) 93, 0);
                super.field759.method2393(2, (byte) 38);
                super.field759.method2397(class405.field5120, class405.field5120, (byte) -116);
                super.field759.method2394(class447.field5937, (byte) 110, 0);
                super.field759.method2394(class84.field1162, (byte) 74, 1);
                super.field759.method2422(class447.field5937, 0, (byte) -10);
                super.field759.method2396(22357, (class572) null);
            } else {
                super.field759.method2397(class405.field5120, class405.field5120, (byte) -73);
                super.field759.method2394(class447.field5937, (byte) 67, 0);
                super.field759.method2422(class447.field5937, 0, (byte) -10);
            }
            super.field759.method2393(0, (byte) -94);
            this.field2756 = false;
        } else {
            super.field759.method2422(class447.field5937, 0, (byte) -10);
        }
        super.field759.method2397(class405.field5120, class405.field5120, (byte) -95);
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)Z")
    public final boolean method202(int arg0) {
        if (arg0 != 1) {
            return true;
        } else {
            ++field2751;
            return true;
        }
    }

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "(I)Z")
    public static final boolean method1344(int arg0) {
        int var1 = -44 % ((-82 - arg0) / 35);
        ++field2754;
        return !class633.method3549("jaclib", 99) ? false : class633.method3549("hw3d", 99);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)V")
    public final void method199(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            if (this.field2756) {
                super.field759.method2393(1, (byte) 9);
                super.field759.method2396(22357, this.field2759[arg0 + -1]);
                super.field759.method2393(0, (byte) 57);
            }
            ++field2753;
        }
    }

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "(I)V")
    public static final void method1345(int arg0) {
        ++field2758;
        if (arg0 == -86324136) {
            class237.field3088.method3965(false);
        }
    }
}
