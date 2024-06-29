import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public abstract class class33 {

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "Z")
    public static boolean field406 = true;

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "Lu;")
    public static class38 field407 = class28.method177("Pub)4Bar", (byte) -84);

    @OriginalMember(owner = "mapview!qa", name = "f", descriptor = "Lu;")
    public static class38 field411 = class28.method177("Overview", (byte) -84);

    @OriginalMember(owner = "mapview!qa", name = "e", descriptor = "Lu;")
    public static class38 field410 = class28.method177("Staff Shop", (byte) -84);

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "mapview!qa", name = "g", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "mapview!qa", name = "h", descriptor = "[B")
    public static byte[] field413;

    @OriginalMember(owner = "mapview!qa", name = "i", descriptor = "[B")
    public static byte[] field414;

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "[Lt;")
    public static class37[] field409;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(I)Lea;", line = 26)
    public static final class10 method196(int arg0) {
        if (arg0 != 25765) {
            field409 = null;
        }
        try {
            return (class10) Class.forName("q").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class1();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(II)I", line = 49)
    public static int method199(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "(I)V", line = 71)
    public static void method200(int arg0) {
        field413 = null;
        field411 = null;
        field414 = null;
        if (arg0 < 4) {
            method196(89);
        }
        field409 = null;
        field407 = null;
        field410 = null;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "([BZ)V")
    public abstract void method197(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "(I)[B")
    public abstract byte[] method198(int arg0);
}
