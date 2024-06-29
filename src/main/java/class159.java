import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class159 extends class180 {

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2148 = " from your friend list first.";

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field2151 = 0;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field2145 = 0;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2149 = " ";

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "Llm;")
    public static class347 field2150;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "[I")
    public static int[] field2152;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 19)
    public static void method989(int arg0) {
        field2150 = null;
        if (arg0 == 0) {
            field2152 = null;
            field2148 = null;
            field2149 = null;
        }
    }
}
