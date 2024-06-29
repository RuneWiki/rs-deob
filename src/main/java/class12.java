import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class12 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[I")
    public static int[] field119 = new int[1];

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lgo;")
    public static class581 field117 = new class581(8, 0, 4, 1);

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field120 = 0;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lem;")
    public static class206 field121 = new class206(91, 6);

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Z")
    public static boolean field122 = false;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lkr;")
    public static class693 field123 = new class693();

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Leg;")
    public static class93 field124 = new class93();

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field125 = -1;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 6)
    public static void method58(byte arg0) {
        field123 = null;
        field124 = null;
        if (arg0 >= -95) {
            method58((byte) 27);
        }
        field119 = null;
        field121 = null;
        field117 = null;
    }

    @OriginalMember(owner = "client!ma", name = "toString", descriptor = "()Ljava/lang/String;", line = 20)
    public final String toString() {
        field116++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I", line = 36)
    public final int method59(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            return -99;
        }
        field118++;
        int var4 = arg2 >= class340.field4553 ? arg2 : class340.field4553;
        if (class4.field30 == this) {
            return 0;
        } else if (class121.field1665 == this) {
            return var4 - arg1;
        } else if (class133.field1900 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }
}
