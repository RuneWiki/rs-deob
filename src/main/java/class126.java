import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class126 {

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Loc;")
    private static class151 field2257 = class137.method873(2, "Drop");

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Loc;")
    public static class151 field2253 = class137.method873(2, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Loc;")
    public static class151 field2249 = field2257;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "[Lbi;")
    public static class21[] field2263 = new class21[6];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "J")
    public long field2258;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Lwg;")
    public class235 field2252;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lwg;")
    public class235 field2255;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Lwg;")
    public class235 field2260;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZI)Loc;")
    public static final class151 method759(int arg0, boolean arg1, int arg2) {
        field2250++;
        return arg0 == -1304 ? class116.method709(arg2, 0, 10, arg1) : null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public static void method760(boolean arg0) {
        field2263 = null;
        field2257 = null;
        field2253 = null;
        if (!arg0) {
            field2257 = null;
        }
        field2249 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([Loc;I)Loc;")
    public static final class151 method761(class151[] arg0, int arg1) {
        field2261++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg1 == 10260) {
            return class142.method919(arg0, true, 0, arg0.length);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BILwa;)Loc;")
    public static final class151 method762(byte arg0, int arg1, class229 arg2) {
        field2251++;
        try {
            class151 var3 = new class151();
            var3.field2690 = arg2.method1440(19108);
            if (arg0 <= 114) {
                return null;
            }
            if (arg1 < var3.field2690) {
                var3.field2690 = arg1;
            }
            var3.field2736 = new byte[var3.field2690];
            arg2.field4101 += class74.field1428.method1049(var3.field2690, arg2.field4087, arg2.field4101, 0, var3.field2736, (byte) -99);
            return var3;
        } catch (Exception var4) {
            return class162.field2938;
        }
    }
}
