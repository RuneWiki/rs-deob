import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class398 {

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field34 = 0;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "Ljava/lang/String;")
    public static String field35 = "Loading defaults - ";

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB)V", line = 4)
    public final void method23(int arg0, int arg1, byte arg2) {
        int var4 = -75 % ((-62 - arg2) / 37);
        ++field41;
        int var5 = this.field36 * arg0 >> 12;
        int var6 = this.field40 * arg0 >> 12;
        int var7 = this.field31 * arg1 >> 12;
        int var8 = this.field43 * arg1 >> 12;
        class129.method1088(var7, var8, super.field5864, var6, 77, var5, super.field5857, super.field5863);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lmb;III)V", line = 23)
    public static final void method24(class258 arg0, int arg1, int arg2, int arg3) {
        ++field32;
        int var4 = 43 % ((arg1 - 44) / 34);
        class134 var5 = arg0.method1871(class73.field1235, 16785);
        if (var5 != null) {
            class73.field1235.method752(arg3, arg2, arg0.field3764 + arg3, arg2 - -arg0.field3758);
            if (class234.field3392 >= 3) {
                class73.field1235.method766(-16777216, var5, arg3, arg2);
            } else {
                class443.field6423.method2647((float) arg0.field3764 / 2.0F + (float) arg3, (float) arg0.field3758 / 2.0F + (float) arg2, 4096, (16383 & (int) (-class106.field1756)) << 2, var5, arg3, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIIII)V", line = 46)
    public class5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field31 = arg1;
        this.field43 = arg3;
        this.field40 = arg2;
        this.field36 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)V", line = 73)
    public final void method25(int arg0, int arg1, int arg2) {
        ++field38;
        int var4 = this.field36 * arg0 >> 12;
        int var5 = this.field40 * arg0 >> 12;
        int var6 = this.field31 * arg2 >> 12;
        int var7 = this.field43 * arg2 >> 12;
        class122.method1033(var6, var5, false, var7, var4, super.field5857);
        if (arg1 > -46) {
            method24((class258) null, 82, 49, -50);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V", line = 93)
    public static final void method26(boolean arg0) {
        ++field39;
        if (class187.field2773 == null) {
            class187.field2773 = new int[65536];
            double var1 = 0.03D * Math.random() - 0.015D + 0.7D;
            for (int var3 = 0; ~var3 > -65537; ++var3) {
                double var4 = (double) (var3 >> 10 & 63) / 64.0D + 0.0078125D;
                double var6 = (double) (var3 >> 7 & 7) / 8.0D + 0.0625D;
                double var8 = (double) (var3 & 127) / 128.0D;
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
                    if (!(var20 * 6.0D < 1.0D)) {
                        if (!(var20 * 2.0D < 1.0D)) {
                            if (!(var20 * 3.0D < 2.0D)) {
                                var10 = var18;
                            } else {
                                var10 = (var16 - var18) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                            }
                        } else {
                            var10 = var16;
                        }
                    } else {
                        var10 = (-var18 + var16) * 6.0D * var20 + var18;
                    }
                    if (var4 * 6.0D < 1.0D) {
                        var12 = (-var18 + var16) * 6.0D * var4 + var18;
                    } else if (!(var4 * 2.0D < 1.0D)) {
                        if (var4 * 3.0D < 2.0D) {
                            var12 = (-var18 + var16) * (-var4 + 0.6666666666666666D) * 6.0D + var18;
                        } else {
                            var12 = var18;
                        }
                    } else {
                        var12 = var16;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (!(var24 * 6.0D < 1.0D)) {
                        if (var24 * 2.0D < 1.0D) {
                            var14 = var16;
                        } else if (!(var24 * 3.0D < 2.0D)) {
                            var14 = var18;
                        } else {
                            var14 = (0.6666666666666666D - var24) * (-var18 + var16) * 6.0D + var18;
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
                int var35 = (var33 << 8) + ((var32 << 16) - -var34);
                class187.field2773[var3] = var35;
            }
            if (arg0) {
                method26(false);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V", line = 206)
    public static void method27(int arg0) {
        field35 = null;
        if (arg0 != -4072) {
            field34 = -58;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V", line = 223)
    public final void method28(int arg0, int arg1, int arg2) {
        ++field37;
        int var4 = this.field36 * arg1 >> 12;
        int var5 = this.field40 * arg1 >> 12;
        if (arg2 == 0) {
            int var6 = this.field31 * arg0 >> 12;
            int var7 = this.field43 * arg0 >> 12;
            class52.method413(var4, var7, super.field5863, super.field5864, var5, true, var6);
        }
    }
}
