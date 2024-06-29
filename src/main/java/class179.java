import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class179 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Z")
    public static volatile boolean field2980 = true;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Leg;")
    public static class37 field2983 = class174.method1167("tbrefresh", -53);

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Leg;")
    public static class37 field2982 = class174.method1167("Spielwelt erstellt)3", -46);

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Leg;")
    public static class37 field2985 = class174.method1167("0", -101);

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lpa;")
    public static class140 field2984 = new class140(512);

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field2987 = 500;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Leg;")
    public static class37 field2989 = class174.method1167("", -80);

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Leg;")
    public static class37 field2990 = field2989;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Leg;")
    public static class37 field2991 = field2989;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Z")
    public static boolean field2988;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lpi;B)V")
    public static final void method1187(class188 arg0, byte arg1) {
        field2981++;
        int var2 = 90 / ((arg1 - 49) / 63);
        class89 var3 = (class89) class154.field2584.method992((byte) 125, arg0.field3235.method217((byte) -102));
        if (var3 == null) {
            return;
        }
        if (var3.field1410 != null) {
            class127.field2127.method1514(var3.field1410);
            var3.field1410 = null;
        }
        var3.method441(16773377);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method1188(byte arg0) {
        field2984 = null;
        field2985 = null;
        field2983 = null;
        int var1 = 88 % ((arg0 - 2) / 51);
        field2991 = null;
        field2989 = null;
        field2990 = null;
        field2982 = null;
    }
}
