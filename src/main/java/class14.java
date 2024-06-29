import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class14 {

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Lta;")
    public static class37 field151 = class20.method87(-114, "download");

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "I")
    public static int field152 = 0;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "Lta;")
    public static class37 field154 = class20.method87(-101, "Gem Shop");

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "Z")
    public static volatile boolean field155 = true;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Lta;")
    public static class37 field153 = class20.method87(-99, "Legende");

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(II)Lta;", line = 39)
    public static final class37 method60(int arg0, int arg1) {
        if (arg0 != 3038) {
            field151 = null;
        }
        return class1.method1(false, false, 10, arg1);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)V", line = 63)
    public static void method61(byte arg0) {
        field153 = null;
        int var1 = -29 % ((arg0 + 11) / 43);
        field154 = null;
        field151 = null;
    }
}
