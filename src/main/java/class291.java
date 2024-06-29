import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class291 {

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Ltk;")
    public static class230 field3704 = new class230();

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Lap;")
    public static class335 field3706 = new class335("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "D")
    public static double field3707 = -1.0D;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "Z")
    public static boolean field3709 = true;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "[S")
    public static short[] field3710 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "Lkg;")
    public static class179 field3708 = new class179(29, 2);

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "Ldq;")
    public static class493 field3711 = new class493(101, 12);

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1707(int arg0) {
        field3703++;
        if (arg0 != 1077367982) {
            method1709(45);
        }
        int var1 = class166.field2121.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class166.field2121[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class524.field7751; var4++) {
                    if (class79.field1025[var2] == class187.field2445[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class187.field2445[class524.field7751] = class79.field1025[var2];
                    var3 = class524.field7751++;
                }
                class463 var5 = new class463(class166.field2121[var2]);
                int var6 = 0;
                while (class166.field2121[var2].length > var5.field6631 && var6 < 511 && class489.field7114 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2758((byte) 117);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FB1) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class79.field1025[var2] >> 8) * 64 + var10 - class441.field6317;
                    int var13 = (class79.field1025[var2] & 0xFF) * 64 + var11 - class320.field4064;
                    class477 var14 = class390.field5244.method1327(var5.method2758((byte) 121), (byte) -126);
                    if (class187.field2446[var7] == null && (var14.field6913 & 0x1) > 0 && class415.field5926 == var9 && var12 >= 0 && var12 + var14.field6921 < class452.field6526 && var13 >= 0 && class440.field6307 > var14.field6921 + var13) {
                        class187.field2446[var7] = new class295();
                        class187.field2446[var7].field4890 = var7;
                        class295 var15 = class187.field2446[var7];
                        class403.field5735[class489.field7114++] = var7;
                        var15.field4848 = class163.field2065;
                        var15.method1731(-16385, var14);
                        var15.method2133(false, var15.field3773.field6921);
                        var15.field4911 = var15.field3773.field6919 << 3;
                        if (var15.field4911 == 0) {
                            var15.method2125((byte) -122, 0);
                        } else {
                            var15.method2125((byte) -98, (var15.field3773.field6938 + 4 & 0xFF600007) << 11);
                        }
                        var15.method1728(arg0 - 1077367983, true, var15.method1366((byte) -102), var9, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V", line = 98)
    public static void method1708(boolean arg0) {
        field3704 = null;
        if (!arg0) {
            method1709(49);
        }
        field3710 = null;
        field3711 = null;
        field3708 = null;
        field3706 = null;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V", line = 112)
    public static final void method1709(int arg0) {
        if (arg0 != 24552) {
            method1709(-72);
        }
        field3705++;
        if (class441.field6318 != null) {
            return;
        }
        class441.field6318 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
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
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
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
            class441.field6318[var3] = var35;
        }
    }
}
