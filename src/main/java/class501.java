import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class501 extends class279 {

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "Z")
    private boolean field7275 = false;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "Z")
    private boolean field7269;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "[Lqn;")
    private class295[] field7277;

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "[Lam;")
    public static class53[] field7280 = new class53[1024];

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
    public static int field7276 = 0;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "Ltm;")
    public static class334 field7281 = new class334(18, 5);

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "F")
    public static float field7273;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method438(byte arg0) {
        if (arg0 >= -32) {
            return true;
        } else {
            ++field7279;
            return true;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZI)V", line = 18)
    public final void method435(boolean arg0, int arg1) {
        if (this.field7277 != null && arg0) {
            super.field4267.method411(1, (byte) -104);
            super.field4267.method333(true, class547.field7814);
            class341 var3 = super.field4267.method269(arg1 ^ 2049);
            var3.method674(1024);
            super.field4267.method342((byte) 2, class127.field1976);
            if (this.field7269) {
                super.field4267.method365(class200.field3408, class750.field10454, (byte) -122);
                super.field4267.method338(0, class388.field5817, false, true, 31181);
                super.field4267.method227(0, class580.field8210, arg1 + -1978);
            } else {
                super.field4267.method365(class750.field10454, class333.field4884, (byte) -122);
                super.field4267.method321(class493.field7145, 0, (byte) -95);
                super.field4267.method411(2, (byte) -106);
                super.field4267.method365(class200.field3408, class750.field10454, (byte) -122);
                super.field4267.method321(class493.field7145, 0, (byte) -95);
                super.field4267.method338(1, class493.field7145, false, true, 31181);
                super.field4267.method227(0, class580.field8210, 70);
                super.field4267.method215(8, super.field4267.field622);
            }
            super.field4267.method411(0, (byte) -110);
            this.field7275 = true;
        } else {
            super.field4267.method227(0, class580.field8210, 70);
        }
        ++field7272;
        if (arg1 != 2048) {
            this.field7277 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZLiu;)V", line = 62)
    public final void method437(int arg0, boolean arg1, class506 arg2) {
        super.field4267.method215(8, arg2);
        ++field7271;
        super.field4267.method405(arg0, (byte) 121);
        if (arg1) {
            field7280 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lpj;)V", line = 91)
    public class501(class38 arg0) {
        super(arg0);
        if (arg0.field583) {
            this.field7269 = ~arg0.field597 > -4;
            int var2 = this.field7269 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (var14 == 1) {
                            var15 = var13;
                        } else if (var14 != 2) {
                            if (~var14 != -4) {
                                if (~var14 == -5) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = -var12;
                            }
                        } else {
                            var15 = var12;
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
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field7277 = new class295[3];
            this.field7277[0] = super.field4267.method363(var4, (byte) -117, 64, false);
            this.field7277[1] = super.field4267.method363(var5, (byte) -109, 64, false);
            this.field7277[2] = super.field4267.method363(var3, (byte) -120, 64, false);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BZ)V", line = 80)
    public final void method441(byte arg0, boolean arg1) {
        super.field4267.method365(class333.field4884, class750.field10454, (byte) -122);
        if (arg0 != 9) {
            this.method435(true, 12);
        }
        ++field7274;
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(B)V", line = 205)
    public static void method3036(byte arg0) {
        field7280 = null;
        field7281 = null;
        if (arg0 != -60) {
            method3036((byte) 25);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)V", line = 218)
    public final void method443(int arg0, int arg1, int arg2) {
        if (this.field7275) {
            super.field4267.method411(1, (byte) -120);
            super.field4267.method215(8, this.field7277[arg0 + -1]);
            super.field4267.method411(0, (byte) -106);
        }
        if (arg1 != 0) {
            field7281 = null;
        }
        ++field7278;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V", line = 242)
    public final void method442(boolean arg0) {
        if (arg0) {
            this.field7269 = false;
        }
        if (!this.field7275) {
            super.field4267.method227(0, class388.field5817, 70);
        } else {
            super.field4267.method411(1, (byte) -96);
            super.field4267.method215(8, (class506) null);
            super.field4267.method333(true, class465.field6786);
            super.field4267.method250(26);
            if (this.field7269) {
                super.field4267.method365(class333.field4884, class333.field4884, (byte) -122);
                super.field4267.method321(class388.field5817, 0, (byte) -95);
                super.field4267.method227(0, class388.field5817, 70);
            } else {
                super.field4267.method365(class333.field4884, class333.field4884, (byte) -122);
                super.field4267.method321(class388.field5817, 0, (byte) -95);
                super.field4267.method411(2, (byte) -88);
                super.field4267.method365(class333.field4884, class333.field4884, (byte) -122);
                super.field4267.method321(class388.field5817, 0, (byte) -95);
                super.field4267.method321(class493.field7145, 1, (byte) -95);
                super.field4267.method227(0, class388.field5817, 70);
                super.field4267.method215(8, (class506) null);
            }
            super.field4267.method411(0, (byte) -84);
            this.field7275 = false;
        }
        ++field7270;
        super.field4267.method365(class333.field4884, class333.field4884, (byte) -122);
    }
}
