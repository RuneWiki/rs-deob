import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class193 {

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lcba;")
    public static class471 field2732 = new class471(36, 8);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lbi;")
    public static class408 field2730;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)J")
    public abstract long method573(byte arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1196(int arg0) {
        field2732 = null;
        field2730 = null;
        if (arg0 != 1692859728) {
            field2732 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)J")
    public abstract long method571(int arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public static final int method1197(int arg0, int arg1) {
        if (arg0 != 255) {
            field2730 = null;
        }
        field2735++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
    public abstract void method570(boolean arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IJ)I")
    public final int method1198(int arg0, long arg1) {
        field2736++;
        if (arg0 != 32625) {
            return -52;
        }
        long var4 = this.method573((byte) 89);
        if (var4 > 0L) {
            class21.method220(0, var4);
        }
        return this.method574(2, arg1);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)Ldu;")
    public static final class299 method1199(byte arg0) {
        field2731++;
        if (class413.field5819 == null || class325.field4373 == null) {
            return null;
        }
        int var1 = -1 / ((arg0 + 14) / 47);
        class325.field4373.method3463((byte) -97, class413.field5819);
        class299 var2 = (class299) class325.field4373.method3464(-107);
        if (var2 == null) {
            return null;
        } else {
            class463 var3 = class413.field5809.method2136(-117, var2.field4088);
            return var3 != null && var3.field6516 && var3.method2709(class413.field5804, (byte) -110) ? var2 : class341.method2073((byte) -120);
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
    public static final void method1200(byte arg0) {
        field2734++;
        if (class118.field1940 != null) {
            return;
        }
        class118.field1940 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        if (arg0 < 87) {
            field2732 = null;
        }
        while (var3 < 65536) {
            double var4 = (double) ((var3 & 0xFD67) >> 10) / 64.0D + 0.0078125D;
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
                    var16 = var6 + var8 - var6 * var8;
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
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
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
            class118.field1940[var3] = var35;
            var3++;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IJ)I")
    public abstract int method574(int arg0, long arg1);
}
