import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class413 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[I")
    public static int[] field5963 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lce;")
    public static class168 field5964 = null;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5965 = "yellow:";

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2589(String arg0, int arg1) {
        class386.method2466(arg1, ~arg1, "", 0, arg0, "");
        field5967++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method2590(int arg0) {
        field5963 = null;
        field5965 = null;
        field5964 = null;
        if (arg0 != 104) {
            method2591(5, 66);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public static final int method2591(int arg0, int arg1) {
        if (arg0 == -6129) {
            field5966++;
            return arg1 >>> 8;
        } else {
            return -123;
        }
    }
}
