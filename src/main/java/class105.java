import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class105 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "[Lri;")
    public static class39[] field1407 = new class39[14];

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
    public static int[] field1408 = new int[128];

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1410 = 0;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[I")
    public static int[] field1417 = new int[32];

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;II)I")
    public static final int method635(String arg0, int arg1, int arg2) {
        field1414++;
        if (arg1 > -36) {
            field1413 = -102;
        }
        return class184.method1280(-125, arg2, arg0, true);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
    public static void method636(boolean arg0) {
        field1417 = null;
        field1408 = null;
        if (!arg0) {
            field1407 = null;
        }
        field1407 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method637(int arg0) {
        field1409++;
        if (arg0 != 14) {
            method638((byte) 111);
        }
        class28.field396.method1701((byte) 80);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Lac;")
    public static final class208 method638(byte arg0) {
        field1411++;
        if (arg0 != 82) {
            field1412 = 15;
        }
        try {
            return (class208) Class.forName("ia").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class222();
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static final void method639(int arg0) {
        if (arg0 != 1965) {
            field1410 = 54;
        }
        field1416++;
        class27.field365.method1699(arg0 - 1965);
    }
}
