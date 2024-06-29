import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 {

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lvc;")
    public static class137 field728 = class45.method325("Spiel)2Fenster geladen)3", -46);

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lvc;")
    private static class137 field729 = class45.method325("Welcome to RuneScape", -46);

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lvc;")
    public static class137 field724 = class45.method325("headicons_prayer", -46);

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lvc;")
    public static class137 field723 = field729;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lqa;")
    public static class105 field726 = new class105(100);

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field733 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Z")
    public static boolean field737 = false;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Lvc;")
    private static class137 field736 = class45.method325("Please try again)3", -46);

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Lvc;")
    private static class137 field735 = class45.method325("To", -46);

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lvc;")
    public static class137 field730 = field736;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lvc;")
    public static class137 field731 = class45.method325("@gre@", -46);

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lvc;")
    public static class137 field732 = field735;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lnb;")
    public static class88 field734;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lnb;")
    public static class88 field738;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method248(byte arg0) {
        class125.field2880.method763(arg0);
        class141.field3319.method763((byte) 102);
        class8.field184.method763((byte) 115);
        field722++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static void method249(boolean arg0) {
        field728 = null;
        field724 = null;
        field731 = null;
        field729 = null;
        field734 = null;
        field732 = null;
        field735 = null;
        if (arg0) {
            return;
        }
        field730 = null;
        field736 = null;
        field726 = null;
        field738 = null;
        field723 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)Lpd;")
    public static final class102 method250(int arg0, boolean arg1) {
        class102 var2 = (class102) class115.field2730.method758((long) arg0, (byte) -89);
        field727++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class33.field700.method668(3, -214, arg0);
        class102 var4 = new class102();
        if (var3 != null) {
            var4.method745(new class109(var3), 12);
        }
        class115.field2730.method760(var4, 0, (long) arg0);
        if (arg1) {
            field735 = null;
        }
        return var4;
    }
}
