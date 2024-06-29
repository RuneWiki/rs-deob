import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class112 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lcc;")
    public static class670 field1530 = new class670("LIVE", 0);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 4)
    public static void method838(int arg0) {
        field1530 = null;
        if (arg0 != 8182) {
            field1530 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Z", line = 14)
    public static final boolean method839(int arg0, int arg1) {
        int var2 = 21 % ((arg1 + 37) / 50);
        field1529++;
        return arg0 == 4 || arg0 == 8 || arg0 == 11;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILum;)Lum;")
    public abstract class482 method20(int arg0, class482 arg1);
}
