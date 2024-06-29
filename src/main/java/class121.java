import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lje;")
    public static class67 field2711 = class85.method592(255, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lje;")
    public static class67 field2713 = class85.method592(255, "Spieler");

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lje;")
    public static class67 field2717 = class85.method592(255, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Lje;")
    public static class67 field2721 = class85.method592(255, "null");

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field2718 = 0;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Lje;")
    private static class67 field2724 = class85.method592(255, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lje;")
    public static class67 field2719 = field2724;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lje;")
    public static class67 field2714 = field2724;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lje;")
    private static class67 field2715 = class85.method592(255, "cyan:");

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lje;")
    public static class67 field2722 = field2715;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lje;")
    public static class67 field2723 = field2715;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Lje;")
    public static class67 field2725 = class85.method592(255, "(U3");

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)[Lkd;")
    public static final class73[] method952(byte arg0) {
        field2716++;
        class73[] var1 = new class73[class16.field283];
        for (int var2 = 0; var2 < class16.field283; var2++) {
            class73 var3 = var1[var2] = new class73();
            var3.field1593 = client.field397;
            var3.field1594 = class14.field246;
            var3.field1589 = class4.field61[var2];
            var3.field1596 = class128.field2804[var2];
            var3.field1592 = class4.field65[var2];
            var3.field1590 = class69.field1409[var2];
            var3.field1595 = class85.field1888;
            var3.field1591 = class152.field3489[var2];
        }
        if (arg0 != 80) {
            field2718 = 118;
        }
        class151.method1154(0);
        return var1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static void method953(boolean arg0) {
        if (arg0) {
            return;
        }
        field2725 = null;
        field2721 = null;
        field2713 = null;
        field2723 = null;
        field2722 = null;
        field2724 = null;
        field2717 = null;
        field2714 = null;
        field2719 = null;
        field2715 = null;
        field2711 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)I")
    public static final int method954(boolean arg0, int arg1) {
        if (arg0) {
            method952((byte) -43);
        }
        field2712++;
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
    public static final void method955(int arg0, int arg1, int arg2) {
        field2720++;
        if (arg2 <= 71) {
            field2721 = null;
        }
        class64 var3 = class80.method573(arg1, -15618);
        int var4 = var3.field1261;
        int var5 = var3.field1264;
        int var6 = var3.field1256;
        int var7 = class2.field5[var6 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class42.field804[var4] = class82.method579(class34.method213(var8, arg0 << var5), class34.method213(~var8, class42.field804[var4]));
    }
}
