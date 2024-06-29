import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class546 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Z")
    public static boolean field7591 = false;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[Lgga;")
    public static class511[] field7594 = new class511[2048];

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "[I")
    public static int[] field7593 = new int[1];

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
    public static boolean field7590;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 4)
    public static void method3229(int arg0) {
        field7593 = null;
        if (arg0 == -1) {
            field7594 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)I", line = 21)
    public static final int method3230(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class791.field10844 - 1; var2++) {
            if (arg0 < class718.field9947[var2] + class362.field5227[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class791.field10844 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([Ljava/lang/Object;III[I)V", line = 46)
    public static final void method3231(Object[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field7589++;
        if (arg3 != Integer.MAX_VALUE) {
            method3231(null, 4, 24, -57, null);
        }
        if (arg1 >= arg2) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        int var7 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var7;
        Object var8 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg2; var10++) {
            if (((var9 & var10) + var7) > arg4[var10]) {
                int var11 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6] = var11;
                Object var12 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var12;
            }
        }
        arg4[arg2] = arg4[var6];
        arg4[var6] = var7;
        arg0[arg2] = arg0[var6];
        arg0[var6] = var8;
        method3231(arg0, arg1, var6 - 1, Integer.MAX_VALUE, arg4);
        method3231(arg0, var6 + 1, arg2, Integer.MAX_VALUE, arg4);
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V", line = 103)
    public static final void method3232(int arg0) {
        field7595++;
        if (class109.field1323 != null) {
            return;
        }
        class109.field1323 = new int[65536];
        if (arg0 >= -108) {
            field7594 = null;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFFB4) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
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
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
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
            int var35 = (var33 << 8) + (var32 << 16) + var34;
            class109.field1323[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V", line = 228)
    public static final void method3233(int arg0) {
        class396.field5621 = 0;
        class346.field5034++;
        class701.field9773 = 0;
        field7592++;
        class737.method4085(1);
        class367.method2292(5);
        class347.method2195(7);
        boolean var1 = false;
        for (int var2 = 0; var2 < class396.field5621; var2++) {
            int var5 = class106.field1246[var2];
            class685 var6 = (class685) class450.field6288.method3669(false, (long) var5);
            class359 var7 = var6.field9573;
            if (class263.field3850 && class679.method3863(-104, var5)) {
                class735.method4080(0);
            }
            if (class346.field5034 != var7.field9132) {
                if (var7.field5172.method3646(true)) {
                    class632.method3625((byte) -111, var7);
                }
                var7.method2258(-74, null);
                var1 = true;
                var6.method527(-11229);
            }
        }
        if (arg0 >= -108) {
            return;
        }
        if (var1) {
            class744.field10275 = class450.field6288.method3664(0);
            class450.field6288.method3663(class669.field9376, false);
        }
        if (class179.field2258 != class315.field4517.field6962) {
            throw new RuntimeException("gnp1 pos:" + class315.field4517.field6962 + " psize:" + class179.field2258);
        }
        for (int var3 = 0; var3 < class429.field5988; var3++) {
            if (class450.field6288.method3669(false, (long) class425.field5934[var3]) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class429.field5988);
            }
        }
        if ((class744.field10275 - class429.field5988) != 0) {
            throw new RuntimeException("gnp3 mis:" + (class744.field10275 - class429.field5988));
        }
        for (int var4 = 0; var4 < class744.field10275; var4++) {
            if (class346.field5034 != class669.field9376[var4].field9573.field9132) {
                throw new RuntimeException("gnp4 uk:" + class669.field9376[var4].field9573.field9186);
            }
        }
    }
}
