import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class164 extends class104 {

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field2270 = 50;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2262 = "Choose Option";

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "[I")
    public static int[] field2265 = new int[field2270];

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "[I")
    public static int[] field2269 = new int[field2270];

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field2264 = new String[field2270];

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "[I")
    public static int[] field2268 = new int[field2270];

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "[I")
    public static int[] field2266 = new int[field2270];

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[I")
    public static int[] field2263 = new int[field2270];

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "[I")
    public static int[] field2272 = new int[field2270];

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "[I")
    public static int[] field2267 = new int[field2270];

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Llc;")
    public static class175 field2271;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 20)
    public static void method1076(int arg0) {
        field2268 = null;
        field2263 = null;
        field2267 = null;
        field2271 = null;
        field2265 = null;
        field2272 = null;
        field2264 = null;
        field2262 = null;
        field2266 = null;
        field2269 = null;
        if (arg0 != 50) {
            method1076(-97);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)Z")
    public abstract boolean method1074(byte arg0);

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1075(byte arg0);
}
