import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class174 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lok;")
    public static class146 field2911 = class235.method1724(-12908, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lok;")
    public static class146 field2913 = class235.method1724(-12908, "ul");

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "[I")
    public static int[] field2918 = new int[50];

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lok;")
    public static class146 field2915 = class235.method1724(-12908, "Fertigkeit: ");

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field2910 = -1;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lok;")
    public static class146 field2912 = class235.method1724(-12908, "Stufe: ");

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "F")
    public static float field2917;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "[[[I")
    public static int[][][] field2914;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 21)
    public static final void method1343(int arg0, int arg1) {
        class39.field688.method794(-17435, arg0);
        int var2 = -24 % ((arg1 - 56) / 63);
        field2919++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 43)
    public static void method1344(int arg0) {
        field2915 = null;
        field2911 = null;
        field2912 = null;
        field2914 = (int[][][]) null;
        field2913 = null;
        if (arg0 != 13500) {
            method1343(-108, 10);
        }
        field2918 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([Ljava/lang/Object;B[I)V", line = 67)
    public static final void method1345(Object[] arg0, byte arg1, int[] arg2) {
        field2920++;
        class214.method1596(arg2, arg2.length - 1, 0, (byte) 124, arg0);
        int var3 = 39 / ((-arg1 - 13) / 57);
    }
}
