import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class177 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lhh;")
    private static class163 field3224 = class137.method1065("Starting 3d library", 17);

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lhh;")
    public static class163 field3229 = class137.method1065(" )2> <col=ffff00>", 17);

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lhh;")
    public static class163 field3228 = class137.method1065("logo", 17);

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lhh;")
    public static class163 field3232 = class137.method1065("Update)2Liste geladen)3", 17);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lhh;")
    public static class163 field3225 = field3224;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lhh;")
    private static class163 field3233 = class137.method1065("Please remove ", 17);

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lhh;")
    public static class163 field3227 = field3233;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lhh;")
    public static class163 field3234 = field3233;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLlh;)Llh;")
    public abstract class56 method1308(byte arg0, class56 arg1);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method1309(int arg0) {
        field3234 = null;
        field3224 = null;
        field3225 = null;
        field3232 = null;
        int var1 = 41 / ((arg0 - 6) / 47);
        field3228 = null;
        field3229 = null;
        field3227 = null;
        field3233 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z")
    public static final boolean method1310(int arg0) {
        if (arg0 != 4643) {
            field3234 = null;
        }
        field3230++;
        return class114.field2149;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lpc;B)V")
    public static final void method1311(class166 arg0, byte arg1) {
        field3231++;
        class230 var2 = null;
        try {
            if (arg1 != 55) {
                field3233 = null;
            }
            class198 var3 = arg0.method1249(0, "runescape");
            while (var3.field3566 == 0) {
                class107.method866(0, 1L);
            }
            if (var3.field3566 == 1) {
                var2 = (class230) var3.field3563;
                class81 var4 = class132.method1042(arg1 ^ 0x36);
                var2.method1600(var4.field1541, var4.field1562, arg1 ^ 0x41, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1603(0);
            }
        } catch (Exception var5) {
        }
    }
}
