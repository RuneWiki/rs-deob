import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class192 extends class130 {

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "Lnv;")
    public class44 field2952 = new class44();

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "[I")
    public static int[] field2953 = new int[1000];

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "F")
    public static float field2956;

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "Lo;")
    public static class363 field2955;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "Ljq;")
    public static class370 field2954;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method1329(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field2954 = null;
        }
        field2957++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V", line = 17)
    public static void method1330(int arg0) {
        field2954 = null;
        field2955 = null;
        field2953 = null;
        if (arg0 != 1000) {
            method1330(2);
        }
    }
}
