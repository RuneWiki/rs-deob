import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class38 extends class37 {

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    private int field838;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "[I")
    public static int[] field837 = new int[128];

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "Ldd;")
    private static class35 field841 = class180.method1196((byte) 127, "Players");

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "Ldd;")
    public static class35 field846 = class180.method1196((byte) -126, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "Ldd;")
    public static class35 field842 = class180.method1196((byte) 127, ":");

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "Ldd;")
    private static class35 field844 = class180.method1196((byte) 3, "To create a new account you need to");

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "Ldd;")
    public static class35 field836 = field844;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "[I")
    public static int[] field845 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "Ldd;")
    public static class35 field840 = field841;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    public static int field848 = 0;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "Ldd;")
    public static class35 field843 = class180.method1196((byte) 126, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "Ldd;")
    public static class35 field851 = class180.method1196((byte) -23, "::rect_debug");

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "Ldd;")
    public static class35 field852 = class180.method1196((byte) 126, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "[Lba;")
    public static class12[] field853;

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V")
    private class38(int arg0) {
        super(0, true);
        this.field838 = 4096;
        this.field838 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)V")
    public static final void method374(int arg0, int arg1, int arg2) {
        ++field847;
        long var3 = (long) ((arg2 << 16) + arg1);
        class121 var5 = (class121) class113.field2482.method796(true, var3);
        if (var5 != null) {
            if (arg0 != 1476680528) {
                field844 = null;
            }
            class79.field1843.method1167(false, var5);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field849;
        if (arg0 != 75) {
            field851 = null;
        }
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            class156.method1047(var3, 0, class72.field1719, this.field838);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class38() {
        this(4096);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (arg1 != 1) {
            method375(false);
        }
        if (arg0 == 0) {
            this.field838 = (arg2.method221(-128) << 12) / 255;
        }
        ++field850;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
    public static void method375(boolean arg0) {
        field851 = null;
        field853 = null;
        field842 = null;
        field841 = null;
        field836 = null;
        field837 = null;
        field843 = null;
        field844 = null;
        if (arg0) {
            method375(true);
        }
        field846 = null;
        field840 = null;
        field852 = null;
        field845 = null;
    }
}
