import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rb")
public class class159 {

    @OriginalMember(owner = "rb", name = "c", descriptor = "I")
    public static int field2979 = 0;

    @OriginalMember(owner = "rb", name = "e", descriptor = "I")
    public static int field2981 = 0;

    @OriginalMember(owner = "rb", name = "f", descriptor = "Llf;")
    public static class109 field2982 = class35.method275("_", 2);

    @OriginalMember(owner = "rb", name = "j", descriptor = "Llf;")
    public static class109 field2986 = class35.method275("nicht hergestellt werden)3", 2);

    @OriginalMember(owner = "rb", name = "d", descriptor = "Lvg;")
    public static class200 field2980 = null;

    @OriginalMember(owner = "rb", name = "l", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "rb", name = "i", descriptor = "[I")
    public static int[] field2985 = new int[128];

    @OriginalMember(owner = "rb", name = "b", descriptor = "I")
    public static int field2978 = 0;

    @OriginalMember(owner = "rb", name = "n", descriptor = "Llf;")
    private static class109 field2990 = class35.method275("Hidden", 2);

    @OriginalMember(owner = "rb", name = "o", descriptor = "Llf;")
    public static class109 field2991 = field2990;

    @OriginalMember(owner = "rb", name = "m", descriptor = "Llf;")
    public static class109 field2989 = class35.method275("RuneScape wird geladen )2 bitte warten)3)3)3", 2);

    @OriginalMember(owner = "rb", name = "a", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "rb", name = "g", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "rb", name = "h", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "rb", name = "k", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "rb", name = "a", descriptor = "(B)V")
    public static void method1080(byte arg0) {
        field2991 = null;
        field2980 = null;
        field2990 = null;
        field2989 = null;
        field2985 = null;
        field2982 = null;
        int var1 = 101 % ((arg0 - 34) / 55);
        field2986 = null;
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1081(int arg0, int arg1) {
        field2984++;
        if (arg0 == 100 && class139.field2689 > 0) {
            byte[] var2 = class70.field1372[--class139.field2689];
            class70.field1372[class139.field2689] = null;
            return var2;
        } else if (arg0 == 5000 && class202.field3982 > 0) {
            byte[] var3 = class31.field727[--class202.field3982];
            class31.field727[class202.field3982] = null;
            return var3;
        } else if (arg0 == 30000 && class180.field3399 > 0) {
            byte[] var4 = class96.field1953[--class180.field3399];
            class96.field1953[class180.field3399] = null;
            return var4;
        } else {
            int var5 = 7 / ((arg1 - 24) / 56);
            return new byte[arg0];
        }
    }
}
