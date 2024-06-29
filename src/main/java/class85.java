import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class85 {

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "Lcea;")
    public static class180 field1035 = new class180("M", "M", "M", "M");

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "Lil;")
    public static class7 field1037 = new class7("WTRC", 1);

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "[I")
    public static int[] field1039 = new int[250];

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "Lhba;")
    public static class10 field1038;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "[I")
    public static int[] field1036;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V", line = 4)
    public static void method502(byte arg0) {
        if (arg0 != -102) {
            method502((byte) 59);
        }
        field1035 = null;
        field1036 = null;
        field1039 = null;
        field1037 = null;
        field1038 = null;
    }
}
