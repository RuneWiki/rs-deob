import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class310 {

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public int field4152 = -1;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "Z")
    public static boolean field4150 = false;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "Z")
    public static boolean field4151 = false;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "Lnc;")
    public class21 field4157;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "[I")
    public int[] field4154;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field4155;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)I", line = 3)
    public static final int method1850(boolean arg0) {
        if (arg0) {
            field4156++;
            return class314.field4180;
        } else {
            return -111;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZ)V", line = 17)
    public static final void method1851(int arg0, boolean arg1) {
        class435.field6349 = -1;
        class476.field7045 = null;
        class97.field1260 = 1;
        class204.field2703 = 0;
        class337.field4464 = arg0;
        class481.field7112 = arg1;
        field4153++;
        class212.field2841 = -1;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 47)
    public static final void method1852(byte arg0) {
        field4158++;
        if (class413.field5903 != null) {
            return;
        }
        class413.field5903 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFE8D) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
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
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
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
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
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
            class413.field5903[var3] = var35;
        }
        if (arg0 <= 24) {
            method1852((byte) 82);
        }
    }
}
