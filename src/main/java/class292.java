import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class292 {

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4819 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lul;")
    public static class201 field4817 = new class201(5000);

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "F")
    public static float field4822 = 0.0F;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4823 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Log;")
    public static class241 field4821;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lfa;")
    public static class273 field4815;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lfa;")
    public static class273 field4824;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
    public static final int method2039(int arg0, int arg1, int arg2) {
        field4816++;
        int var3 = class288.method2022(arg1 ^ 0x3CD9, arg0 - 1, arg2 + -1) - (-class288.method2022(-42, arg0 + 1, arg2 + -1) - (class288.method2022(-62, arg0 - 1, arg2 + 1) + class288.method2022(arg1 ^ 0x3CC0, arg0 + 1, arg2 + 1)));
        int var4 = class288.method2022(arg1 + 15461, arg0 + -1, arg2) + class288.method2022(-50, arg0 + 1, arg2) - (-class288.method2022(-86, arg0, arg2 + -1) + -class288.method2022(-45, arg0, arg2 + 1));
        if (arg1 != -15529) {
            method2039(107, 103, 109);
        }
        int var5 = class288.method2022(-37, arg0, arg2);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static final void method2040(int arg0) {
        field4820++;
        class100.field1502.method144(arg0);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public static void method2041(int arg0) {
        field4823 = null;
        if (arg0 < 1) {
            return;
        }
        field4815 = null;
        field4821 = null;
        field4824 = null;
        field4819 = null;
        field4817 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)I")
    public static final int method2042(byte arg0, int arg1) {
        int var2 = 26 / ((arg0 - 19) / 54);
        field4818++;
        return arg1 & 0x3FF;
    }
}
