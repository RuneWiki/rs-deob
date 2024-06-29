import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class class119 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Loh;")
    private static class263 field2206 = class253.method1681(-118, "Discard");

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Loh;")
    public static class263 field2210 = class253.method1681(-121, "Wordpack geladen)3");

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field2211 = 0;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Loh;")
    public static class263 field2214 = field2206;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "[I")
    public static int[] field2217 = new int[100];

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Loh;")
    public static class263 field2218 = class253.method1681(-123, "::rect_debug");

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Loh;")
    private static class263 field2208 = class253.method1681(-126, "Prepared sound engine");

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Loh;")
    private static class263 field2220 = class253.method1681(-124, "Unable to find ");

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Loh;")
    public static class263 field2207 = field2220;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Loh;")
    public static class263 field2202 = field2208;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Z")
    public static boolean field2215 = false;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IJZISLoh;Loh;)V")
    public static final void method769(int arg0, long arg1, boolean arg2, int arg3, short arg4, class263 arg5, class263 arg6) {
        field2221++;
        if (!arg2 || class2.field53 || class252.field4384 >= 500) {
            return;
        }
        class156.field2811[class252.field4384] = arg6;
        class68.field1382[class252.field4384] = arg5;
        class202.field3645[class252.field4384] = arg4;
        class215.field3814[class252.field4384] = arg1;
        class106.field2018[class252.field4384] = arg0;
        class41.field918[class252.field4384] = arg3;
        class252.field4384++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method770(int arg0) {
        field2220 = null;
        field2214 = null;
        int var1 = -44 / ((58 - arg0) / 51);
        field2218 = null;
        field2217 = null;
        field2208 = null;
        field2206 = null;
        field2202 = null;
        field2210 = null;
        field2207 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
    public static final void method771(int arg0, int arg1, int arg2, int arg3) {
        class2 var4 = class18.field417[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class138 var5 = var4.field45;
        if (var5 != null) {
            var5.field2545 = var5.field2545 * arg3 / 16;
            var5.field2552 = var5.field2552 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
    public abstract void method620(int arg0, int arg1);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
    public abstract void method619(int arg0, int arg1, int arg2);
}
