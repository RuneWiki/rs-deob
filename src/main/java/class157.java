import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class157 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Luk;")
    public static class96 field2953 = new class96(500);

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Ljd;")
    public static class86 field2957 = class122.method868("", true);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field2955 = 0;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Ljd;")
    public static class86 field2959 = class122.method868("(Y<)4col>", true);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Ljd;")
    public static class86 field2956 = class122.method868("sch-Utteln:", true);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
    public static int[] field2960 = new int[100];

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Ljd;")
    public static class86 field2963 = null;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lof;")
    public static class254 field2954;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Lod;")
    public static class90 field2962;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[[[I")
    public static int[][][] field2961;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method1142(byte arg0) {
        field2953 = null;
        if (arg0 != 97) {
            return;
        }
        field2961 = null;
        field2957 = null;
        field2954 = null;
        field2956 = null;
        field2960 = null;
        field2963 = null;
        field2962 = null;
        field2959 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
    public static final void method1143(int arg0, int arg1) {
        if (class267.field4707 == null || class267.field4707.length < arg1) {
            class267.field4707 = new int[arg1];
        }
        field2964++;
        if (arg0 != 21520) {
            method1142((byte) -105);
        }
    }
}
