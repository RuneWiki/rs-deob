import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class558 extends class511 {

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public int field7508 = -1;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public int field7509 = -1;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "Z")
    private boolean field7524 = false;

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "I")
    private int field7527 = 0;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public int field7516 = 0;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "[Lhr;")
    public static class486[] field7522 = null;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "[I")
    public static int[] field7521 = new int[8];

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lem;")
    public static class206 field7511 = new class206(59, 6);

    @OriginalMember(owner = "client!re", name = "ib", descriptor = "Lem;")
    public static class206 field7529 = new class206(44, 8);

    @OriginalMember(owner = "client!re", name = "jb", descriptor = "[Ljava/lang/String;")
    public static String[] field7530 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!re", name = "kb", descriptor = "Llh;")
    public static class487 field7531 = new class487(45, 3);

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public int field7512;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public int field7514;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    public int field7523;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
    public int field7528;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILr;)Z")
    public final boolean method224(int arg0, int arg1, int arg2, class166 arg3) {
        ++field7510;
        class392 var5 = arg3.method166();
        var5.method689(super.field4042, super.field4052 + -10, super.field4047);
        class55 var6 = class599.field8366.method3949(0, this.field7523).method3718(0, arg1, -1, (class403) null, 131072, this.field7528, 127, arg3, (class527) null);
        if (var6 != null && (class340.field4563 ? var6.method419(arg2, arg0, var5, true, class22.field250) : var6.method448(arg2, arg0, var5, true))) {
            return true;
        } else {
            if (this.field7508 != -1) {
                class55 var7 = class599.field8366.method3949(0, this.field7508).method3718(0, 0, -1, (class403) null, 131072, this.field7514, 105, arg3, (class527) null);
                if (var7 != null && (!class340.field4563 ? var7.method448(arg2, arg0, var5, true) : var7.method419(arg2, arg0, var5, true, class22.field250))) {
                    return true;
                }
            }
            if (this.field7509 != -1) {
                class55 var8 = class599.field8366.method3949(arg1, this.field7509).method3718(0, 0, -1, (class403) null, 131072, this.field7512, 110, arg3, (class527) null);
                if (var8 != null && (!class340.field4563 ? var8.method448(arg2, arg0, var5, true) : var8.method419(arg2, arg0, var5, true, class22.field250))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Lr;I)Lbca;")
    public final class614 method221(class166 arg0, int arg1) {
        ++field7515;
        class467 var3 = class396.method2322(super.field4053, super.field4042 >> class588.field8259, super.field4047 >> class588.field8259);
        if (var3 != null && var3.field6419.field2966) {
            int var4 = var3.field6419.method217(35);
            if (~this.field7516 != ~var4) {
                super.field4052 -= this.field7516;
                super.field4052 += var4;
                this.field7516 = var4;
            }
        }
        class392 var5 = arg0.method166();
        var5.method679();
        if (var3 == null || !var3.field6419.field2966) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class37 var9 = class409.field5812[super.field4050];
            int var10 = this.field7527 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method331(super.field4047 + var13, (byte) 50, super.field4042 + var12);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method331(super.field4047 + var16, (byte) 50, super.field4042 + var15);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method331(super.field4047 - -var19, (byte) 50, super.field4042 + var18);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method331(super.field4047 + var22, (byte) 50, super.field4042 - -var21);
            int var24 = ~var14 <= ~var17 ? var17 : var14;
            int var25 = ~var20 <= ~var23 ? var23 : var20;
            int var26 = ~var17 <= ~var23 ? var23 : var17;
            if (~var10 != -1) {
                int var27 = (int) (Math.atan2((double) (-var25 + var24), (double) var10) * 2607.5945876176133D) & 16383;
                if (~var27 != -1) {
                    var5.method684(var27);
                }
            }
            int var28 = ~var14 <= ~var20 ? var20 : var14;
            int var29 = var14 + var23;
            if (~var10 != -1) {
                int var30 = 16383 & (int) (Math.atan2((double) (var28 - var26), (double) var10) * 2607.5945876176133D);
                if (~var30 != -1) {
                    var5.method673(-var30);
                }
            }
            if (var29 > var17 + var20) {
                var29 = var17 + var20;
            }
            int var31 = (var29 >> 1) + -super.field4052;
            if (~var31 != -1) {
                var5.method687(0, var31, 0);
            }
        }
        var5.method687(super.field4042, super.field4052 + -10, super.field4047);
        if (arg1 != -5) {
            method3122(-54);
        }
        class614 var32 = class524.method2987(6257, 3);
        this.field7527 = 0;
        this.field7524 = false;
        if (this.field7509 != -1) {
            class55 var33 = class599.field8366.method3949(0, this.field7509).method3718(0, 0, -1, (class403) null, 2048, this.field7512, 88, arg0, (class527) null);
            if (var33 != null) {
                if (!class340.field4563) {
                    var33.method465(var5, var32.field8572[2], 0);
                } else {
                    var33.method453(var5, var32.field8572[2], class22.field250, 0);
                }
                this.field7524 |= var33.method430();
                this.field7527 = var33.method426();
            }
        }
        if (this.field7508 != -1) {
            class55 var34 = class599.field8366.method3949(0, this.field7508).method3718(0, 0, -1, (class403) null, 2048, this.field7514, 88, arg0, (class527) null);
            if (var34 != null) {
                if (!class340.field4563) {
                    var34.method465(var5, var32.field8572[1], 0);
                } else {
                    var34.method453(var5, var32.field8572[1], class22.field250, 0);
                }
                this.field7524 |= var34.method430();
                if (~var34.method426() < ~this.field7527) {
                    this.field7527 = var34.method426();
                }
            }
        }
        class55 var35 = class599.field8366.method3949(0, this.field7523).method3718(0, 0, -1, (class403) null, 2048, this.field7528, arg1 ^ -100, arg0, (class527) null);
        if (var35 != null) {
            if (!class340.field4563) {
                var35.method465(var5, var32.field8572[0], 0);
            } else {
                var35.method453(var5, var32.field8572[0], class22.field250, 0);
            }
            this.field7524 |= var35.method430();
            if (~var35.method426() < ~this.field7527) {
                this.field7527 = var35.method426();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIII)V")
    public class558(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(B)Z")
    public final boolean method209(byte arg0) {
        int var2 = 106 / ((arg0 - 31) / 42);
        ++field7519;
        return this.field7524;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)I")
    public final int method226(int arg0) {
        if (arg0 != 6329) {
            field7529 = null;
        }
        ++field7525;
        return this.field7527;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lr;Z)V")
    public final void method220(class166 arg0, boolean arg1) {
        ++field7518;
        if (!arg1) {
            this.method209((byte) -106);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILr;)Lcr;")
    public final class533 method214(int arg0, class166 arg1) {
        int var3 = 75 % ((81 - arg0) / 43);
        ++field7520;
        return null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method3122(int arg0) {
        field7529 = null;
        field7511 = null;
        if (arg0 != -1) {
            method3122(-81);
        }
        field7530 = null;
        field7521 = null;
        field7522 = null;
        field7531 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lsea;ILsea;Ljca;Lsea;Ljba;)Z")
    public static final boolean method3123(class648 arg0, int arg1, class648 arg2, class637 arg3, class648 arg4, class364 arg5) {
        class677.field9694 = arg0;
        class383.field5426 = arg4;
        ++field7513;
        class114.field1574 = arg3;
        class287.field3957 = new int[16];
        class224.field3124 = arg5;
        class691.field9859 = arg2;
        if (arg1 != 29631) {
            return false;
        } else {
            for (int var6 = 0; ~var6 > -17; ++var6) {
                class287.field3957[var6] = 255;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)I")
    public final int method217(int arg0) {
        ++field7517;
        return arg0 <= 29 ? 54 : -10;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)Z")
    public final boolean method216(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field7526;
            return false;
        }
    }
}
