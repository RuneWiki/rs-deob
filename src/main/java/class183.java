import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class183 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field3604 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lcd;")
    private static class23 field3603 = class54.method414(" ", -1);

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lcd;")
    public static class23 field3608 = field3603;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lcd;")
    public static class23 field3609 = null;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lea;")
    public static class38 field3606;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)[Loe;")
    public static final class130[] method1127(int arg0) {
        field3605++;
        class130[] var1 = new class130[class79.field1730];
        if (arg0 > -67) {
            field3604 = -103;
        }
        for (int var2 = 0; var2 < class79.field1730; var2++) {
            class130 var3 = new class130();
            var3.field2705 = class167.field3328;
            var3.field2703 = class194.field3836;
            var3.field2700 = class107.field2287[var2];
            var3.field2699 = class15.field329[var2];
            var3.field2706 = class72.field1652[var2];
            var3.field2701 = class109.field2311[var2];
            var3.field2704 = class133.field2756;
            var3.field2702 = class129.field2698[var2];
            var1[var2] = var3;
        }
        class175.method1101(-126);
        return var1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILcd;BLcd;Lcd;)V")
    public static final void method1128(int arg0, class23 arg1, byte arg2, class23 arg3, class23 arg4) {
        if (arg2 != 85) {
            method1129((byte) 64);
        }
        for (int var5 = 99; var5 > 0; var5--) {
            class144.field2945[var5] = class144.field2945[var5 - 1];
            class61.field1411[var5] = class61.field1411[var5 - 1];
            class153.field3049[var5] = class153.field3049[var5 - 1];
            class161.field3227[var5] = class161.field3227[var5 - 1];
        }
        class61.field1411[0] = arg4;
        class153.field3049[0] = arg3;
        class78.field1720 = class13.field296;
        class161.field3227[0] = arg1;
        field3607++;
        class105.field2283++;
        class144.field2945[0] = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method1129(byte arg0) {
        field3606 = null;
        field3608 = null;
        field3609 = null;
        if (arg0 >= -79) {
            field3606 = null;
        }
        field3603 = null;
    }
}
