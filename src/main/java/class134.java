import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class134 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1942 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lqp;")
    public static class466 field1941 = new class466("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lwj;")
    public static class270 field1946 = new class270(58, 0);

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lla;")
    public static class315 field1943;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[Ll;")
    public static class16[] field1947;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)I", line = 4)
    public static final int method914(byte arg0) {
        if (arg0 != 62) {
            field1942 = 87;
        }
        field1945++;
        if (class110.field1664 == null) {
            if (!class181.field2659 && class274.field3764 > 0) {
                if (class481.field7023 && class310.field4231.method901(0, 81) && class274.field3764 > 2) {
                    return ((class82) class526.field7778.field6997.field3617.field3617).field1231;
                }
                return ((class82) class526.field7778.field6997.field3617).field1231;
            }
            int var1 = class518.field7668.method1813(0);
            int var2 = class518.field7668.method1822(126);
            int var3 = class88.field1290;
            int var4 = class263.field3634;
            int var5 = class464.field6821;
            if (var1 > var3 && var1 < (var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class274.field3764; var7++) {
                    if (class476.field6942) {
                        int var12 = (class274.field3764 - var7 - 1) * 16 + var4 + 33;
                        if ((var12 - 13) < var2 && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class274.field3764 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var11 - 13) && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class131 var9 = new class131(class526.field7778);
                    for (class82 var10 = (class82) var9.method897(-121); var10 != null; var10 = (class82) var9.method900(-8)) {
                        if ((var8++) == var6) {
                            return var10.field1231;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 96)
    public static final void method915(int arg0) {
        field1944++;
        if (arg0 != -4737) {
            method916(23);
        }
        if (class166.field2487 != null) {
            return;
        }
        class166.field2487 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3C8) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class166.field2487[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V", line = 210)
    public static void method916(int arg0) {
        if (arg0 != 26295) {
            method916(38);
        }
        field1941 = null;
        field1946 = null;
        field1943 = null;
        field1947 = null;
    }
}
