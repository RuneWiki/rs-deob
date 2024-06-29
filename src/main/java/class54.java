import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class54 {

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Lub;")
    private static class227 field943 = class257.method1749(" from your ignore list first)3", 17263);

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "[Z")
    public static boolean[] field944 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[I")
    public static int[] field940 = new int[100];

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lub;")
    public static class227 field939 = class257.method1749("(R", 17263);

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lub;")
    private static class227 field947 = class257.method1749("Prepared sound engine", 17263);

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Lub;")
    public static class227 field945 = field943;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lub;")
    public static class227 field941 = field947;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Lub;")
    public static class227 field946 = class257.method1749("null", 17263);

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Lub;")
    public static class227 field948 = class257.method1749("showingVideoAd", 17263);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
    public static final void method310(int arg0, int arg1) {
        if (arg1 != 232) {
            method312(false, -104, -99, -3);
        }
        class60.field1114.method1727(true, arg0);
        class59.field1090.method1727(true, arg0);
        class254.field4472.method1727(true, arg0);
        field937++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static void method311(boolean arg0) {
        field940 = null;
        field945 = null;
        field943 = null;
        field947 = null;
        field939 = null;
        field948 = null;
        field941 = null;
        field946 = null;
        if (arg0) {
            field944 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZIII)V")
    public static final void method312(boolean arg0, int arg1, int arg2, int arg3) {
        field938++;
        if (arg3 > arg1 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class195.field3316 = arg1;
        class77.field1357 = arg2;
        class216.field3641 = arg0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static final void method313(int arg0) {
        class42.field688 = new class201(32);
        field935++;
        if (arg0 != 304) {
            field941 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lpd;I)V")
    public static final void method314(class196 arg0, int arg1) {
        field942++;
        byte var2 = 20;
        int var3 = 253 - var2;
        arg0.method1243(class46.field819, 382, 245 - var2, 16777215, -1);
        class111.method705(230, var3, 304, 34, 9179409);
        class111.method705(231, var3 + 1, 302, 32, 0);
        class111.method694(232, var3 + 2, class120.field2184 * 3, 30, 9179409);
        class111.method694(class120.field2184 * 3 + 232, var3 - -2, 300 - (class120.field2184 * 3), 30, 0);
        arg0.method1243(class7.field153, 382, 276 - var2, 16777215, -1);
        int var4 = 15 / (-arg1 / 58);
    }
}
