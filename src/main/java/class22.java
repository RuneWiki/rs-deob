import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class22 extends class69 {

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Z")
    public static boolean field270 = true;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Ljava/lang/String;")
    public static String field277 = "Take";

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Ljj;")
    public static class134 field272;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "[[[I")
    public static int[][][] field279;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static final void method149(byte arg0) {
        int var1 = 42 / ((-arg0 - 36) / 56);
        field274++;
        class133.field2204 = new class103[class151.field2447.method924(125)][];
        class110.field1901 = new boolean[class151.field2447.method924(122)];
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBZZZ)Ljj;")
    public static final class134 method150(int arg0, byte arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var5 = 71 / ((37 - arg1) / 52);
        field271++;
        class9 var6 = null;
        if (class120.field2023 != null) {
            var6 = new class9(arg0, class120.field2023, class270.field4366[arg0], 1000000);
        }
        class290.field4629[arg0] = class189.field3023.method231(var6, 44, arg0, class291.field4643);
        if (arg3) {
            class290.field4629[arg0].method1320(true);
        }
        return new class134(class290.field4629[arg0], arg4, arg2);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public static void method151(byte arg0) {
        field279 = null;
        if (arg0 != 17) {
            method149((byte) 64);
        }
        field272 = null;
        field277 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
    public static final void method152(int arg0, int arg1) {
        int var2 = 100 / ((arg1 - 57) / 36);
        field280++;
        class283 var3 = class46.method360(4, -113, arg0);
        var3.method1900(true);
    }
}
