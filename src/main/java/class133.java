import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class133 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Lve;")
    public static class255 field2218 = class87.method607(85, "Schlie-8en");

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Lve;")
    public static class255 field2220 = class87.method607(36, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lve;")
    public static class255 field2222 = class87.method607(61, "Abbrechen");

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[S")
    public static short[] field2219;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 10)
    public static void method996(boolean arg0) {
        if (!arg0) {
            field2222 = (class255) null;
        }
        field2219 = null;
        field2218 = null;
        field2220 = null;
        field2222 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBI)V", line = 24)
    public static final void method997(int arg0, byte arg1, int arg2) {
        field2221++;
        class220.field3715 = class185.field2982[arg2][arg0].field2941;
        class172.field2850 = class185.field2982[arg2][arg0].field2938;
        class129.field2136 = class185.field2982[arg2][arg0].field2940;
        class272.method1903((float) class220.field3715, (float) class172.field2850, (float) class129.field2136);
        if (arg1 >= -62) {
            field2219 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLve;)V", line = 64)
    public static final void method998(byte arg0, class255 arg1) {
        field2217++;
        int var2 = -50 % ((arg0 + 23) / 38);
        if (class153.field2594 == null) {
            return;
        }
        int var3 = 0;
        long var4 = arg1.method1764((byte) 80);
        if (var4 == 0L) {
            return;
        }
        while (class153.field2594.length > var3 && class153.field2594[var3].field3568 != var4) {
            var3++;
        }
        if (var3 < class153.field2594.length && class153.field2594[var3] != null) {
            class172.field2848++;
            class255.field4318.method1523(22260, 138);
            class255.field4318.method449(16711680, class153.field2594[var3].field3568);
        }
    }
}
