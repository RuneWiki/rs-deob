import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 {

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Laf;")
    public static class7 field2834 = class48.method406(40, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2835 = 0;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Laf;")
    private static class7 field2830 = class48.method406(40, "slide:");

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "[Laf;")
    public static class7[] field2839 = new class7[100];

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Laf;")
    public static class7 field2828 = field2830;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Laf;")
    public static class7 field2838 = class48.method406(40, "weiss:");

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Laf;")
    public static class7 field2831 = field2830;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2836 = 0;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lr;")
    public static class118 field2826;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static void method923(boolean arg0) {
        field2831 = null;
        if (!arg0) {
            return;
        }
        field2830 = null;
        field2839 = null;
        field2838 = null;
        field2826 = null;
        field2828 = null;
        field2834 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lkb;Lkb;Lkb;I)V")
    public static final void method924(class71 arg0, class71 arg1, class71 arg2, int arg3) {
        class152.field3560 = arg0;
        class77.field1792 = arg2;
        field2829++;
        if (arg3 != 80040880) {
            method925(-29, 12, -41, -71, (byte) -101);
        }
        class133.field3112 = arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIB)I")
    public static final int method925(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = 65536 - class134.field3160[arg0 * 1024 / arg1] >> 1;
        field2827++;
        return arg4 == 15 ? ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16) : 46;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BII)I")
    public static final int method926(byte arg0, int arg1, int arg2) {
        field2832++;
        int var3 = 88 % ((arg0 - 13) / 50);
        if (arg2 == -1) {
            return 12345678;
        }
        int var4 = (arg2 & 0x7F) * arg1 / 128;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg2 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLqc;)V")
    public static final void method927(byte arg0, class114 arg1) {
        field2833++;
        int var2 = -33 / ((arg0 + 29) / 60);
        for (int var3 = 0; var3 < class18.field423.length; var3++) {
            class18.field423[var3] = 0;
        }
        short var4 = 256;
        for (int var5 = 0; var5 < 5000; var5++) {
            int var17 = (int) ((double) var4 * Math.random() * 128.0D);
            class18.field423[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var13 = 1; var13 < var4 - 1; var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = var15 + (var13 << 7);
                    class25.field671[var16] = (class18.field423[var16 - 128] + class18.field423[var16 + 128] + class18.field423[var16 - 1] + class18.field423[var16 + 1]) / 4;
                }
            }
            int[] var14 = class18.field423;
            class18.field423 = class25.field671;
            class25.field671 = var14;
        }
        if (arg1 == null) {
            return;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg1.field2722; var8++) {
            for (int var9 = 0; var9 < arg1.field2723; var9++) {
                if (arg1.field2724[var7++] != 0) {
                    int var10 = var8 + arg1.field2725 + 16;
                    int var11 = arg1.field2728 + var9 + 16;
                    int var12 = var11 + (var10 << 7);
                    class18.field423[var12] = 0;
                }
            }
        }
    }
}
