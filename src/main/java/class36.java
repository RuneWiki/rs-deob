import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class36 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Ljava/lang/String;")
    public static String field638 = "Loaded sprites";

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Z")
    public static boolean field641 = true;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lpk;")
    public static class237 field637;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lkc;I)V")
    public static final void method281(class25 arg0, int arg1) {
        if (class120.field1794 == arg0.field442 || arg0.field483 == -1 || arg0.field475 != 0 || arg0.field437 + 1 > class108.method781(arg0.field483, -1).field3422[arg0.field412]) {
            int var2 = arg0.field442 - arg0.field495;
            int var3 = class120.field1794 - arg0.field495;
            int var4 = arg0.field404 * 128 + (arg0.method168(-85) * 64);
            int var5 = arg0.field428 * 128 + arg0.method168(-95) * 64;
            int var6 = arg0.field462 * 128 + (arg0.method168(-126) * 64);
            int var7 = arg0.field477 * 128 + arg0.method168(-125) * 64;
            arg0.field425 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field455 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0.field481 == 0) {
            arg0.field484 = 1024;
        }
        arg0.field478 = 0;
        if (arg0.field481 == 1) {
            arg0.field484 = 1536;
        }
        field639++;
        if (arg1 <= 83) {
            method284(-47);
        }
        if (arg0.field481 == 2) {
            arg0.field484 = 0;
        }
        if (arg0.field481 == 3) {
            arg0.field484 = 512;
        }
        arg0.field471 = arg0.field484;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method282(int arg0) {
        field638 = null;
        field637 = null;
        int var1 = -123 / ((arg0 + 31) / 59);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)I")
    public static final int method283(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field641 = false;
        }
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        field636++;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static final void method284(int arg0) {
        class59.field964.method1540(75, (byte) -2);
        class59.field964.method437(true, class227.method1552(false));
        field640++;
        class59.field964.method428(class126.field1854, (byte) 46);
        class59.field964.method428(class85.field1311, (byte) 46);
        if (arg0 <= -83) {
            class43.field754++;
            class59.field964.method437(true, client.field715);
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static final void method285(int arg0) {
        field642++;
        class156 var1 = class156.field2281;
        synchronized (class156.field2281) {
            class267.field4161++;
            if (arg0 != 9535) {
                method282(4);
            }
            class128.field1890 = class64.field1074;
            if (class211.field3149 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class293.field4451[var2] = false;
                }
                class211.field3149 = class33.field592;
            } else {
                while (class33.field592 != class211.field3149) {
                    int var3 = class202.field3040[class33.field592];
                    class33.field592 = class33.field592 + 1 & 0x7F;
                    if (var3 < 0) {
                        class293.field4451[~var3] = false;
                    } else {
                        class293.field4451[var3] = true;
                    }
                }
            }
            class64.field1074 = class14.field197;
        }
    }
}
