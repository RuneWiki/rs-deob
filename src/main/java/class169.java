import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class169 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Leb;")
    public static class230 field2978 = class68.method589(0, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Leb;")
    private static class230 field2979 = class68.method589(0, "wave2:");

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Leb;")
    private static class230 field2982 = class68.method589(0, " more options");

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Leb;")
    public static class230 field2980 = class68.method589(0, "Abbrechen");

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Leb;")
    public static class230 field2991 = field2982;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Leb;")
    public static class230 field2989 = field2979;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "Leb;")
    public static class230 field2993 = field2979;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Lfk;")
    public static class14 field2985 = new class14(new byte[5000]);

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Leb;")
    public static class230 field2994 = class68.method589(0, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field2997 = 2301979;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "Leb;")
    public static class230 field2999 = class68.method589(0, "http:)4)4");

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "Leb;")
    private static class230 field2996 = class68.method589(0, "Please wait)3)3)3");

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "Leb;")
    public static class230 field2995 = field2996;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "[I")
    public static int[] field2986;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "[[[B")
    public static byte[][][] field2990;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZ)V")
    public static final void method1245(int arg0, int arg1, int arg2, boolean arg3) {
        field2988++;
        if (arg2 != -459489680) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class55.field1011 = arg0;
        field2998 = arg1;
        class157.field2804 = arg3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1246(int arg0) {
        field2982 = null;
        if (arg0 != -1) {
            method1248(-58, false, false, true, -67);
        }
        field2989 = null;
        field2986 = null;
        field2985 = null;
        field2991 = null;
        field2993 = null;
        field2980 = null;
        field2996 = null;
        field2999 = null;
        field2978 = null;
        field2994 = null;
        field2990 = null;
        field2995 = null;
        field2979 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILka;)Lka;")
    public static final class245 method1247(int arg0, class245 arg1) {
        field2987++;
        if (arg1.field4245 != -1) {
            return class155.method1183(arg1.field4245, 17);
        }
        int var2 = arg1.field4362 >>> 16;
        class258 var3 = new class258(client.field2708);
        for (class150 var4 = (class150) var3.method1799(0); var4 != null; var4 = (class150) var3.method1802(69)) {
            if (var4.field2681 == var2) {
                return class155.method1183((int) var4.field1166, 17);
            }
        }
        if (arg0 != 1000000) {
            field2996 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZZZI)Lkk;")
    public static final class223 method1248(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        field2981++;
        class274 var5 = null;
        if (class103.field1891 != null) {
            var5 = new class274(arg0, class103.field1891, class158.field2822[arg0], 1000000);
        }
        class138.field2474[arg0] = class196.field3514.method320(class245.field4293, var5, arg0, -21877);
        if (arg2) {
            class138.field2474[arg0].method491(arg4 - 999937);
        }
        return arg4 == 1000000 ? new class223(class138.field2474[arg0], arg1, arg3) : null;
    }
}
