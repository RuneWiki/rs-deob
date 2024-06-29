import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class498 extends class595 {

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "Z")
    private boolean field6957 = false;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "Z")
    private boolean field6951;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "[Ljg;")
    private class284[] field6960;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "Lcba;")
    public static class471 field6953 = new class471(88, 10);

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "[I")
    public static int[] field6955 = new int[1];

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "Lan;")
    public static class21 field6959;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
    public static void method2891(int arg0) {
        field6959 = null;
        if (arg0 == 6) {
            field6953 = null;
            field6955 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(B)V")
    public final void method298(byte arg0) {
        if (!this.field6957) {
            super.field8612.method2326(arg0 + 169, 0, class583.field8185);
        } else {
            super.field8612.method2296(0, 1);
            super.field8612.method2267(2, (class445) null);
            super.field8612.method1647(class438.field6223, 119);
            super.field8612.method2325(1);
            if (!this.field6951) {
                super.field8612.method2313(class167.field2417, 100, class167.field2417);
                super.field8612.method2315(class583.field8185, 0, 8);
                super.field8612.method2296(arg0 ^ -60, 2);
                super.field8612.method2313(class167.field2417, -23, class167.field2417);
                super.field8612.method2315(class583.field8185, 0, 8);
                super.field8612.method2315(class459.field6466, 1, arg0 ^ -52);
                super.field8612.method2326(91, 0, class583.field8185);
                super.field8612.method2267(arg0 + 62, (class445) null);
            } else {
                super.field8612.method2313(class167.field2417, 90, class167.field2417);
                super.field8612.method2315(class583.field8185, 0, 8);
                super.field8612.method2326(arg0 ^ -71, 0, class583.field8185);
            }
            super.field8612.method2296(0, 0);
            this.field6957 = false;
        }
        ++field6961;
        if (arg0 == -60) {
            super.field8612.method2313(class167.field2417, -88, class167.field2417);
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(III)Lfba;")
    public static final class23 method2892(int arg0, int arg1, int arg2) {
        class622 var3 = class356.field4807[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8977;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)Z")
    public final boolean method297(byte arg0) {
        ++field6962;
        return arg0 >= -119 ? true : true;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZZ)V")
    public final void method302(boolean arg0, boolean arg1) {
        if (arg1) {
            ++field6958;
            if (this.field6960 != null && arg0) {
                super.field8612.method2296(0, 1);
                super.field8612.method1647(class65.field1105, 111);
                class557 var3 = super.field8612.method2289(-19);
                var3.method1053(1024);
                super.field8612.method2299(48, class184.field2590);
                if (this.field6951) {
                    super.field8612.method2313(class137.field2155, 119, class205.field2890);
                    super.field8612.method1641(true, false, 0, class583.field8185, 0);
                    super.field8612.method2326(103, 0, class453.field6402);
                } else {
                    super.field8612.method2313(class167.field2417, 125, class137.field2155);
                    super.field8612.method2315(class459.field6466, 0, 8);
                    super.field8612.method2296(0, 2);
                    super.field8612.method2313(class137.field2155, -87, class205.field2890);
                    super.field8612.method2315(class459.field6466, 0, 8);
                    super.field8612.method1641(true, false, 1, class459.field6466, 0);
                    super.field8612.method2326(118, 0, class453.field6402);
                    super.field8612.method2267(2, super.field8612.field5407);
                }
                super.field8612.method2296(0, 0);
                this.field6957 = true;
            } else {
                super.field8612.method2326(125, 0, class453.field6402);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lbaa;II)V")
    public final void method301(class445 arg0, int arg1, int arg2) {
        ++field6956;
        super.field8612.method2267(arg1 + 3, arg0);
        super.field8612.method2334(arg2, (byte) -68);
        if (arg1 != -1) {
            this.field6957 = true;
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lwr;)V")
    public class498(class388 arg0) {
        super(arg0);
        if (arg0.field5411) {
            this.field6951 = ~arg0.field5457 > -4;
            int var2 = this.field6951 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (var14 == 1) {
                                var15 = var12;
                            } else if (var14 != 2) {
                                if (~var14 == -4) {
                                    var15 = -var13;
                                } else if (var14 == 4) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
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
            this.field6960 = new class284[3];
            this.field6960[0] = super.field8612.method1613(var4, 64, false, true);
            this.field6960[1] = super.field8612.method1613(var5, 64, false, true);
            this.field6960[2] = super.field8612.method1613(var3, 64, false, true);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        if (this.field6957) {
            super.field8612.method2296(0, 1);
            super.field8612.method2267(2, this.field6960[arg1 + -1]);
            super.field8612.method2296(0, 0);
        }
        if (arg2 >= -114) {
            this.method302(false, false);
        }
        ++field6952;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)V")
    public final void method299(int arg0, boolean arg1) {
        super.field8612.method2313(class137.field2155, -41, class167.field2417);
        ++field6954;
        if (arg0 != -1) {
            this.method298((byte) 116);
        }
    }
}
