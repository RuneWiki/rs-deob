import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public abstract class class23 {

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "I")
    public static int field238 = 0;

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "Lw;")
    public static class38 field240 = class35.method219("overlay2)3dat", true);

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "Lw;")
    public static class38 field239 = class35.method219("Requesting", true);

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "I")
    public static int field244 = 0;

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Ljava/lang/String;")
    public static String field243;

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "[B")
    public static byte[] field241;

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "[I")
    public static int[] field242;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)V", line = 34)
    public static void method131(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field242 = null;
        field241 = null;
        field240 = null;
        field239 = null;
        field243 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(I)V")
    public abstract void method132(int arg0);

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(BII)I")
    public abstract int method133(byte arg0, int arg1, int arg2);
}
