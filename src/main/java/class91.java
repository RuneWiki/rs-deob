import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class91 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1125 = 0;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static volatile int field1129 = -1;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1128 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lwd;")
    public static class148 field1131;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public static final void method539(boolean arg0) {
        if (arg0) {
            class423.field6252 = class179.field2923;
            class275.field4396 = class364.field5542;
        } else {
            class423.field6252 = class309.field4886;
            class275.field4396 = class181.field2961;
        }
        class81.field1006 = class423.field6252.length;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
    public static final void method540(int arg0, int arg1) {
        field1123++;
        if (arg0 != -65537) {
            field1128 = 4;
        }
        class224.field3736.method337(arg1, (byte) -121);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static final void method541(int arg0) {
        field1127++;
        if (arg0 >= -98) {
            field1129 = 47;
        }
        if (class36.field441 != null) {
            return;
        }
        class36.field441 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFE68) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3A8) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
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
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
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
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
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
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class36.field441[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 31 / ((40 - arg2) / 57);
        field1124++;
        String var5 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var5);
        class223.method1603(true, (byte) 66, var5);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static final void method543(byte arg0) {
        field1126++;
        if (class141.field2184 == 2) {
            return;
        }
        try {
            class169.method1180(class97.field1359, "tbrefresh", false);
            if (arg0 >= -102) {
                method540(99, -9);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
    public static void method544(boolean arg0) {
        if (!arg0) {
            field1128 = 78;
        }
        field1131 = null;
    }
}
