import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class51 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field1075 = 0;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Lpj;")
    public static class237 field1077 = class33.method353("<col=ffff00>", 123);

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "Lpj;")
    private static class237 field1082 = class33.method353("Loading interfaces )2 ", 25);

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lpj;")
    public static class237 field1078 = class33.method353("_labels", 104);

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Lpj;")
    public static class237 field1079 = class33.method353("Nehmen", 17);

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lpj;")
    public static class237 field1080 = field1082;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field1083 = 0;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field1085 = -1;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "Lfa;")
    public static class239 field1084;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public static void method460(boolean arg0) {
        field1084 = null;
        field1080 = null;
        field1078 = null;
        if (!arg0) {
            method461(-12, (class239) null, (class239) null);
        }
        field1077 = null;
        field1079 = null;
        field1082 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILfa;Lfa;)V")
    public static final void method461(int arg0, class239 arg1, class239 arg2) {
        if (arg0 > -92) {
            return;
        }
        field1081++;
        class96.field1708 = class101.method772(class36.field789, 0, arg1, (byte) 111, arg2);
        class155.field2749 = (class136) class96.field1708;
        class227.field3884 = class101.method772(class55.field1138, 0, arg1, (byte) 95, arg2);
        class80.field1507 = class101.method772(class151.field2680, 0, arg1, (byte) 108, arg2);
    }
}
