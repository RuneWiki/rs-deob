import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class229 {

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "[[Ljava/lang/String;")
    public static String[][] field2991 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lgg;")
    public static class114 field2992 = new class114(8);

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lus;")
    public static class328 field2993 = new class328(49, 6);

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "[Lac;")
    public static class712[] field2990;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method1464(int arg0) {
        field2992 = null;
        field2991 = null;
        field2993 = null;
        if (arg0 != 8) {
            field2990 = null;
        }
        field2990 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(FIIFFII[FIFI)V")
    public abstract void method832(float arg0, int arg1, int arg2, float arg3, float arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, int arg10);
}
