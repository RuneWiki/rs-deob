import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class22 {

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "Lna;")
    public static class26 field232 = class33.method219("Please wait)3)3)3 Rendering Map", 95);

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "Lna;")
    public static class26 field233 = class33.method219("Sandpit", 104);

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "I")
    public static int field234 = 1;

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "Laa;")
    public static class1 field235;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(II)I", line = 41)
    public static int method119(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(B)I", line = 48)
    public static final int method120(byte arg0) {
        if (arg0 < 16) {
            method121(67);
        }
        return mapview.field349 == null ? 0 : mapview.field349[class6.field65];
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)V", line = 83)
    public static void method121(int arg0) {
        field235 = null;
        field233 = null;
        if (arg0 < 69) {
            method121(-45);
        }
        field232 = null;
    }
}
