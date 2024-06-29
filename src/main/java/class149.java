import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class149 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2148 = "Face here";

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[I")
    public static int[] field2147 = new int[25];

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[[B")
    public static byte[][] field2149;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lcs;B)Lcs;")
    public abstract class189 method819(class189 arg0, byte arg1);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1019(int arg0) {
        field2149 = null;
        if (arg0 >= 77) {
            field2147 = null;
            field2148 = null;
        }
    }
}
