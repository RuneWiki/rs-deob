import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class429 extends class720 {

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Lhh;")
    public static class140 field6219;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 10)
    public static final void method2578(int arg0) {
        field6217++;
        if (class217.field2836 != null) {
            return;
        }
        class217.field2836 = new int[65536];
        if (arg0 != 29531) {
            method2578(-82);
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x39B) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
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
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
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
            int var35 = (var32 << 16) - (-(var33 << 8) - var34);
            class217.field2836[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIB)Z", line = 124)
    public static final boolean method2579(int arg0, int arg1, byte arg2) {
        field6220++;
        int var3 = -52 / ((-arg2 - 74) / 37);
        return (class220.method1410(125, arg0, arg1) | class357.method2267(arg0, false, arg1) | class760.method4183((byte) 101, arg0, arg1)) & class550.method3160(arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(CZ)Z", line = 134)
    public static final boolean method2580(char arg0, boolean arg1) {
        if (arg1) {
            field6221++;
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V", line = 150)
    public static void method2581(byte arg0) {
        int var1 = -40 % ((arg0 + 53) / 62);
        field6219 = null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Liv;")
    public abstract class107 method1(int arg0);
}
