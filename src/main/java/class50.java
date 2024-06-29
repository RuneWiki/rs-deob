import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class50 extends class484 {

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lkfa;")
    public static class549 field530 = new class549(72, 2);

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "[I")
    public static int[] field533 = new int[1];

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public static final void method255(int arg0) {
        ++field532;
        if (class505.field7285 == null) {
            class505.field7285 = new int[65536];
            double var1 = -0.015D + Math.random() * 0.03D + 0.7D;
            for (int var3 = 0; ~var3 > -65537; ++var3) {
                double var4 = (double) ((65065 & var3) >> 10) / 64.0D + 0.0078125D;
                double var6 = (double) (var3 >> 7 & 7) / 8.0D + 0.0625D;
                double var8 = (double) (127 & var3) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (!(var8 < 0.5D)) {
                        var16 = var6 + var8 + -(var6 * var8);
                    } else {
                        var16 = (var6 + 1.0D) * var8;
                    }
                    double var18 = var8 * 2.0D - var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 + -0.3333333333333333D;
                    if (var4 * 6.0D < 1.0D) {
                        var12 = (var16 - var18) * 6.0D * var4 + var18;
                    } else if (var4 * 2.0D < 1.0D) {
                        var12 = var16;
                    } else if (var4 * 3.0D < 2.0D) {
                        var12 = (-var18 + var16) * (-var4 + 0.6666666666666666D) * 6.0D + var18;
                    } else {
                        var12 = var18;
                    }
                    if (var20 * 6.0D < 1.0D) {
                        var10 = (var16 - var18) * 6.0D * var20 + var18;
                    } else if (var20 * 2.0D < 1.0D) {
                        var10 = var16;
                    } else if (var20 * 3.0D < 2.0D) {
                        var10 = (-var18 + var16) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                    } else {
                        var10 = var18;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (!(var24 * 6.0D < 1.0D)) {
                        if (!(var24 * 2.0D < 1.0D)) {
                            if (!(var24 * 3.0D < 2.0D)) {
                                var14 = var18;
                            } else {
                                var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                            }
                        } else {
                            var14 = var16;
                        }
                    } else {
                        var14 = (-var18 + var16) * 6.0D * var24 + var18;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var32 << 16) - (-(var33 << 8) + -var34);
                class505.field7285[var3] = var35;
            }
            if (arg0 != 3) {
                field530 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Loq;)V")
    public class50(class326 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZZI)V")
    public final void method148(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field529;
        class453.field6284.method334(arg3 - 2, arg0, super.field7055.field4617 + 4, super.field7055.field4607 - -2, ((class326) super.field7055).field4242, 0);
        class453.field6284.method334(arg3 - 1, arg0 - -1, super.field7055.field4617 - -2, super.field7055.field4607, 0, 0);
        if (!arg1) {
            field527 = -12;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)Z")
    public final boolean method152(int arg0) {
        ++field534;
        if (arg0 != -18257) {
            field530 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BZII)V")
    public final void method151(byte arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 >= 16) {
            ++field535;
            int var5 = class112.field1300 * super.field7055.field4617 / 100;
            class453.field6284.method286(arg2, arg3 + 2, var5, super.field7055.field4607 + -2, ((class326) super.field7055).field4245, 0);
            class453.field6284.method286(arg2 + var5, arg3 + 2, -var5 + super.field7055.field4617, super.field7055.field4607 + -2, 0, 0);
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V")
    public static void method256(int arg0) {
        if (arg0 == 2) {
            field530 = null;
            field533 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (arg0 == -29265) {
            ++field531;
        }
    }
}
