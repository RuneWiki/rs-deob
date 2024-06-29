import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class70 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lsd;")
    public static class166 field1413 = class135.method935("Benutzen Sie bitte eine andere Welt)3", 0);

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Lsd;")
    public static class166 field1415 = class135.method935("blinken2:", 0);

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lsd;")
    private static class166 field1418 = class135.method935("Continue", 0);

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field1420 = 0;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lsd;")
    public static class166 field1417 = field1418;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method563(int arg0) {
        field1417 = null;
        if (arg0 > -20) {
            field1415 = null;
        }
        field1418 = null;
        field1413 = null;
        field1415 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(JB)V")
    public static final void method564(long arg0, byte arg1) {
        field1414++;
        if (arg1 != -123) {
            field1420 = -101;
        }
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class119.field2344; var3++) {
            if (class72.field1430[var3] == arg0) {
                class203.field4003++;
                class119.field2344--;
                for (int var4 = var3; var4 < class119.field2344; var4++) {
                    class72.field1430[var4] = class72.field1430[var4 + 1];
                    class128.field2507[var4] = class128.field2507[var4 + 1];
                }
                class128.field2508 = class95.field1844;
                class156.field2989.method705(186, (byte) 9);
                class156.field2989.method428(arg0, (byte) 71);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lud;Z)V")
    public static final void method565(class184 arg0, boolean arg1) {
        if (class49.field910 == arg0.field3479 || arg0.field3543 == -1 || arg0.field3530 != 0 || arg0.field3519 + 1 > class110.method798(arg0.field3543, 12).field1268[arg0.field3529]) {
            int var2 = arg0.field3479 - arg0.field3475;
            int var3 = class49.field910 - arg0.field3475;
            int var4 = arg0.field3512 * 128 + arg0.field3490 * 64;
            int var5 = arg0.field3520 * 128 + arg0.field3490 * 64;
            int var6 = arg0.field3493 * 128 + arg0.field3490 * 64;
            arg0.field3526 = ((var2 - var3) * var5 + var3 * var6) / var2;
            int var7 = arg0.field3522 * 128 + arg0.field3490 * 64;
            arg0.field3513 = ((var2 - var3) * var4 + var3 * var7) / var2;
        }
        if (arg0.field3524 == 0) {
            arg0.field3489 = 1024;
        }
        field1416++;
        if (arg0.field3524 == 1) {
            arg0.field3489 = 1536;
        }
        arg0.field3540 = 0;
        if (arg0.field3524 == 2) {
            arg0.field3489 = 0;
        }
        if (arg0.field3524 == 3) {
            arg0.field3489 = 512;
        }
        if (arg1) {
            field1415 = null;
        }
        arg0.field3488 = arg0.field3489;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)Lkg;")
    public static final class97 method566(byte arg0, int arg1) {
        class97 var2 = (class97) class204.field4023.method64((byte) 28, (long) arg1);
        field1419++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class134.field2600.method353(16, arg1, -55);
        class97 var4 = new class97();
        if (arg0 != 50) {
            return null;
        }
        if (var3 != null) {
            var4.method735(true, new class53(var3));
        }
        class204.field4023.method67(var4, 15266, (long) arg1);
        return var4;
    }
}
