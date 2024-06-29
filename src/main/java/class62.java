import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class62 {

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Loh;")
    private static class263 field1257 = class253.method1681(-126, "fr");

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Loh;")
    public static class263 field1256 = class253.method1681(-125, "Abbrechen");

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Loh;")
    private static class263 field1260 = class253.method1681(-121, ")3fr");

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Loh;")
    private static class263 field1262 = class253.method1681(-118, "de");

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Z")
    public static volatile boolean field1253 = true;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Loh;")
    private static class263 field1261 = class253.method1681(-123, ")3de");

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Loh;")
    private static class263 field1259 = class253.method1681(-124, "en");

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Loh;")
    private static class263 field1252 = class253.method1681(-126, ")3en");

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[Loh;")
    private static class263[] field1258 = new class263[] { field1252, field1261, field1260 };

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[Loh;")
    public static class263[] field1254 = new class263[] { field1259, field1262, field1257 };

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[Lw;")
    public static class141[] field1255;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lpc;I)Lpc;")
    public static final class21 method381(class21 arg0, int arg1) {
        field1264++;
        if (arg0.field536 != -1) {
            return class8.method55(65535, arg0.field536);
        }
        int var2 = arg0.field537 >>> 16;
        if (arg1 <= 99) {
            return null;
        }
        class84 var3 = new class84(class212.field3797);
        for (class266 var4 = (class266) var3.method562((byte) -32); var4 != null; var4 = (class266) var3.method566((byte) -108)) {
            if (var4.field4641 == var2) {
                return class8.method55(65535, (int) var4.field4226);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method382(int arg0) {
        class101.field1922.method830(50);
        class212.field3795.method830(50);
        if (arg0 > -44) {
            method382(112);
        }
        field1263++;
        class47.field1010.method830(50);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static void method383(int arg0) {
        field1262 = null;
        field1260 = null;
        field1252 = null;
        field1261 = null;
        field1255 = null;
        field1257 = null;
        field1258 = null;
        field1256 = null;
        field1259 = null;
        if (arg0 <= -122) {
            field1254 = null;
        }
    }
}
