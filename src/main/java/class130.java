import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class130 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[I")
    public static int[] field1731 = new int[4096];

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1732 = null;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "[B")
    public static byte[] field1735 = new byte[2048];

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field1733 = 0;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Lb;")
    public static class372 field1734 = new class372(0, -1);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method764(byte arg0) {
        field1731 = null;
        field1734 = null;
        field1735 = null;
        int var1 = 101 / ((63 - arg0) / 34);
        field1732 = null;
    }
}
