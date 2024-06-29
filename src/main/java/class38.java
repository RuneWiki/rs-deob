import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lr;")
    public static class118[] field946 = new class118[256];

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Laf;")
    public static class7 field952 = class48.method406(40, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Laf;")
    private static class7 field950 = class48.method406(40, "yellow:");

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Laf;")
    public static class7 field953 = field950;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Laf;")
    public static class7 field954 = field950;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Laf;")
    private static class7 field955 = class48.method406(40, "wave:");

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[I")
    public static int[] field949 = new int[50];

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Laf;")
    public static class7 field948 = field955;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Laf;")
    public static class7 field951 = field955;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Laf;")
    public static class7 field958 = class48.method406(40, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Laf;")
    public static class7 field956 = class48.method406(40, "welle2:");

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field961 = 0;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[Lbf;")
    public static class14[] field959;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[Laf;")
    public static class7[] field960;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lcd;B)V")
    public static final void method331(class19 arg0, byte arg1) {
        if (class155.field3611 == arg0.field486 || arg0.field478 == -1 || arg0.field457 != 0 || arg0.field463 + 1 > class87.method710(arg0.field478, 6491).field2169[arg0.field487]) {
            int var2 = arg0.field486 - arg0.field483;
            int var3 = class155.field3611 - arg0.field483;
            int var4 = arg0.field481 * 128 + arg0.field473 * 64;
            int var5 = arg0.field506 * 128 + arg0.field473 * 64;
            int var6 = arg0.field446 * 128 + arg0.field473 * 64;
            int var7 = arg0.field473 * 64 + arg0.field461 * 128;
            arg0.field505 = ((var2 - var3) * var4 + var3 * var7) / var2;
            arg0.field491 = ((var2 - var3) * var5 + var3 * var6) / var2;
        }
        field957++;
        if (arg0.field479 == 0) {
            arg0.field492 = 1024;
        }
        if (arg0.field479 == 1) {
            arg0.field492 = 1536;
        }
        arg0.field441 = 0;
        if (arg0.field479 == 2) {
            arg0.field492 = 0;
        }
        int var8 = -31 / ((65 - arg1) / 53);
        if (arg0.field479 == 3) {
            arg0.field492 = 512;
        }
        arg0.field485 = arg0.field492;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method332(int arg0) {
        field950 = null;
        field956 = null;
        field959 = null;
        field952 = null;
        field960 = null;
        field946 = null;
        field954 = null;
        field955 = null;
        int var1 = 120 % ((-arg0 - 29) / 49);
        field948 = null;
        field949 = null;
        field951 = null;
        field953 = null;
        field958 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([Lof;II)V")
    public static final void method333(class103[] arg0, int arg1, int arg2) {
        field947++;
        int var3 = 0;
        if (arg1 != -4407) {
            return;
        }
        while (var3 < arg0.length) {
            class103 var4 = arg0[var3];
            if (var4 != null && var4.field2516 == arg2 && (!var4.field2565 || !class24.method229(false, var4))) {
                label97: {
                    if (var4.field2483 == 0) {
                        if (!var4.field2565 && class24.method229(false, var4) && class77.field1776 != var4) {
                            break label97;
                        }
                        method333(arg0, -4407, var4.field2442);
                        if (var4.field2433 != null) {
                            method333(var4.field2433, -4407, var4.field2442);
                        }
                        class28 var5 = (class28) class75.field1748.method126((long) var4.field2442, (byte) 27);
                        if (var5 != null) {
                            class145.method1173(var5.field734, (byte) 11);
                        }
                    }
                    if (var4.field2483 == 6) {
                        if (var4.field2564 != -1 || var4.field2490 != -1) {
                            boolean var6 = class96.method783(-5, var4);
                            int var7;
                            if (var6) {
                                var7 = var4.field2490;
                            } else {
                                var7 = var4.field2564;
                            }
                            if (var7 != -1) {
                                class93 var8 = class87.method710(var7, 6491);
                                var4.field2477 += class108.field2646;
                                while (var4.field2477 > var8.field2169[var4.field2459]) {
                                    var4.field2477 -= var8.field2169[var4.field2459];
                                    var4.field2459++;
                                    if (var8.field2158.length <= var4.field2459) {
                                        var4.field2459 -= var8.field2176;
                                        if (var4.field2459 < 0 || var4.field2459 >= var8.field2158.length) {
                                            var4.field2459 = 0;
                                        }
                                    }
                                    class141.method1151(arg1 + 19976, var4);
                                }
                            }
                        }
                        if (var4.field2471 != 0 && !var4.field2565) {
                            int var9 = var4.field2471 >> 16;
                            int var10 = class108.field2646 * var9;
                            var4.field2431 = var4.field2431 + var10 & 0x7FF;
                            int var11 = var4.field2471 << 16 >> 16;
                            int var12 = class108.field2646 * var11;
                            var4.field2548 = var4.field2548 + var12 & 0x7FF;
                            class141.method1151(15569, var4);
                        }
                    }
                }
            }
            var3++;
        }
    }
}
