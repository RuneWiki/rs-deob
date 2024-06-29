import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class20 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "J")
    public long field319;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Ltb;")
    public class184 field315;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Ltb;")
    public class184 field316;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Ltb;")
    public class184 field317;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Lfb;")
    public static final class20 method143(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class20 var4 = var3.field1982;
            var3.field1982 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)Lvd;")
    public static final class151 method144(byte arg0, int arg1) {
        field323++;
        if (arg0 != -52) {
            method144((byte) -12, -71);
        }
        class151 var2 = (class151) class241.field3966.method57((long) arg1, -58);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class292.field4661.method746(arg1, (byte) -128, 1);
        class151 var4 = new class151();
        if (var3 != null) {
            var4.method1039(-116, new class101(var3), arg1);
        }
        class241.field3966.method62(0, var4, (long) arg1);
        return var4;
    }
}
