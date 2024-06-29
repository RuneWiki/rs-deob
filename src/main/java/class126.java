import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class126 extends class139 {

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Z")
    private boolean field1529 = false;

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "Z")
    private boolean field1542;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "[Lqca;")
    private class105[] field1536;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "Ldr;")
    public static class675 field1530 = new class675(110, 8);

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "Lsv;")
    public static class617 field1540 = new class617();

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "J")
    public static long field1541;

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "[[[Lqs;")
    public static class565[][][] field1539;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZI)V")
    public final void method153(boolean arg0, int arg1) {
        if (arg1 != 43) {
            this.method150((byte) -96, -26, (class562) null);
        }
        ++field1532;
        if (this.field1536 != null && arg0) {
            super.field1681.method1298(28397, 1);
            super.field1681.method319(class449.field5650, false);
            class581 var3 = super.field1681.method1336(arg1 + -43);
            var3.method573(1024);
            super.field1681.method1339(true, class582.field7831);
            if (this.field1542) {
                super.field1681.method1287(class291.field3672, (byte) 57, class375.field4829);
                super.field1681.method390(true, class290.field3662, false, 0, arg1 ^ 262187);
                super.field1681.method1304(class195.field2295, 0, (byte) -17);
            } else {
                super.field1681.method1287(class607.field8276, (byte) 57, class291.field3672);
                super.field1681.method1274((byte) -39, class251.field3237, 0);
                super.field1681.method1298(arg1 ^ 28358, 2);
                super.field1681.method1287(class291.field3672, (byte) 57, class375.field4829);
                super.field1681.method1274((byte) -88, class251.field3237, 0);
                super.field1681.method390(true, class251.field3237, false, 1, 262144);
                super.field1681.method1304(class195.field2295, 0, (byte) -106);
                super.field1681.method1349(super.field1681.field2847, false);
            }
            super.field1681.method1298(28397, 0);
            this.field1529 = true;
        } else {
            super.field1681.method1304(class195.field2295, 0, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ)V")
    public final void method151(int arg0, boolean arg1) {
        if (arg0 == 43) {
            super.field1681.method1287(class291.field3672, (byte) 57, class607.field8276);
            ++field1537;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lkea;)V")
    public class126(class223 arg0) {
        super(arg0);
        if (arg0.field2802) {
            this.field1542 = ~arg0.field2854 > -4;
            int var2 = this.field1542 ? 48 : 127;
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
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 != -2) {
                                if (~var14 == -3) {
                                    var15 = var12;
                                } else if (var14 != 3) {
                                    if (var14 != 4) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = -var12;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var13;
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
            this.field1536 = new class105[3];
            this.field1536[0] = super.field1681.method352(-25, 64, var4, false);
            this.field1536[1] = super.field1681.method352(-25, 64, var5, false);
            this.field1536[2] = super.field1681.method352(-25, 64, var3, false);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method828(String arg0, int arg1) {
        ++field1533;
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            if (arg1 > -77) {
                field1541 = 73L;
            }
            String var2 = class279.method1680(-2415, arg0);
            if (var2 != null) {
                for (int var3 = 0; ~var3 > ~class189.field2253; ++var3) {
                    String var4 = class594.field7963[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class279.method1680(-2415, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class189.field2253;
                        for (int var6 = var3; class189.field2253 > var6; ++var6) {
                            class594.field7963[var6] = class594.field7963[var6 + 1];
                            class204.field2368[var6] = class204.field2368[var6 + 1];
                            class599.field8033[var6] = class599.field8033[var6 - -1];
                            class200.field2328[var6] = class200.field2328[var6 + 1];
                            class165.field1940[var6] = class165.field1940[var6 + 1];
                        }
                        class78.field1019 = class696.field9643;
                        ++class72.field930;
                        class124 var7 = class336.method1924(class363.field4656, class636.field8620, (byte) 117);
                        var7.field1516.method3090(class680.method3757((byte) 60, arg0), 3);
                        var7.field1516.method3050(false, arg0);
                        class197.method1156((byte) 93, var7);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (this.field1529) {
            super.field1681.method1298(28397, 1);
            super.field1681.method1349((class562) null, false);
            super.field1681.method319(class2.field8, false);
            super.field1681.method1324(0);
            if (this.field1542) {
                super.field1681.method1287(class607.field8276, (byte) 57, class607.field8276);
                super.field1681.method1274((byte) 56, class290.field3662, 0);
                super.field1681.method1304(class290.field3662, 0, (byte) -54);
            } else {
                super.field1681.method1287(class607.field8276, (byte) 57, class607.field8276);
                super.field1681.method1274((byte) 82, class290.field3662, 0);
                super.field1681.method1298(28397, 2);
                super.field1681.method1287(class607.field8276, (byte) 57, class607.field8276);
                super.field1681.method1274((byte) -89, class290.field3662, 0);
                super.field1681.method1274((byte) 118, class251.field3237, 1);
                super.field1681.method1304(class290.field3662, 0, (byte) 111);
                super.field1681.method1349((class562) null, false);
            }
            super.field1681.method1298(28397, 0);
            this.field1529 = false;
        } else {
            super.field1681.method1304(class290.field3662, 0, (byte) 16);
        }
        ++field1534;
        super.field1681.method1287(class607.field8276, (byte) 57, class607.field8276);
        if (arg0 > -4) {
            field1540 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BILgl;)V")
    public final void method150(byte arg0, int arg1, class562 arg2) {
        ++field1538;
        if (arg0 >= 103) {
            super.field1681.method1349(arg2, false);
            super.field1681.method1328((byte) -127, arg1);
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)Z")
    public final boolean method152(int arg0) {
        ++field1531;
        int var2 = 34 % ((arg0 - 50) / 48);
        return true;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
    public final void method148(int arg0, int arg1, int arg2) {
        if (this.field1529) {
            super.field1681.method1298(28397, 1);
            super.field1681.method1349(this.field1536[arg2 + -1], false);
            super.field1681.method1298(28397, 0);
        }
        ++field1535;
        if (arg0 != -2) {
            field1530 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V")
    public static void method829(int arg0) {
        field1530 = null;
        if (arg0 == 27530) {
            field1540 = null;
            field1539 = null;
        }
    }
}
