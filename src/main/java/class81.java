import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class81 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lcd;")
    public static class64 field1494 = class44.method335((byte) 71, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lcd;")
    public static class64 field1499 = class44.method335((byte) 71, "M");

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lcd;")
    public static class64 field1497 = class44.method335((byte) 71, "p12_full");

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field1504 = 0;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "Lcd;")
    public static class64 field1502 = class44.method335((byte) 71, "<col=c0ff00>");

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Lcd;")
    private static class64 field1503 = class44.method335((byte) 71, "Ok");

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Lcd;")
    public static class64 field1495 = field1503;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "[Lic;")
    public static class110[] field1496;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 4)
    public static void method631(byte arg0) {
        field1496 = null;
        field1499 = null;
        if (arg0 >= -99) {
            return;
        }
        field1502 = null;
        field1503 = null;
        field1495 = null;
        field1494 = null;
        field1497 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILqm;I)[Lnm;", line = 34)
    public static final class176[] method632(int arg0, int arg1, class222 arg2, int arg3) {
        field1501++;
        if (class135.method966(90, arg0, arg3, arg2)) {
            if (arg1 <= 17) {
                field1502 = (class64) null;
            }
            return class213.method1500((byte) -87);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 53)
    public static final void method633(int arg0) {
        class6.field117 = true;
        if (arg0 <= 17) {
            field1503 = (class64) null;
        }
        field1500++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([Lcd;I[S)V", line = 85)
    public static final void method634(class64[] arg0, int arg1, short[] arg2) {
        class267.method1869(arg0.length - 1, arg0, 116, arg2, 0);
        if (arg1 == 13122) {
            field1498++;
        }
    }
}
