import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class35 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "J")
    public static long field566 = 0L;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lkb;")
    private static class93 field568 = class76.method390("flash1:", 0);

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lkb;")
    public static class93 field569 = field568;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lkb;")
    private static class93 field567 = class76.method390("Could not complete login)3", 0);

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lkb;")
    public static class93 field572 = field568;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field574 = 0;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "[Lkb;")
    public static class93[] field575 = new class93[500];

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lkb;")
    public static class93 field576 = field567;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "[[B")
    public static byte[][] field577;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[[[B")
    public static byte[][][] field571;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)Lid;")
    public static final class78 method193(int arg0, int arg1, int arg2, int arg3) {
        class78 var4 = new class78();
        var4.field1401 = arg3;
        var4.field1406 = arg1;
        class147.field2834.method617(arg0, (long) arg2, var4);
        field573++;
        class193.method1245(arg1, 18792);
        class191.method1231(arg1, (byte) 64);
        class65 var5 = class204.method1325(65535, arg2);
        if (var5 != null) {
            class160.method1095(0, var5);
        }
        if (class82.field1511 != null) {
            class160.method1095(arg0, class82.field1511);
            class82.field1511 = null;
        }
        class100.field1841 = arg0;
        class121.field2241 = false;
        class77.method392(class184.field3622, class66.field1202, class36.field593, class44.field722, 0);
        if (class97.field1824 != -1) {
            class190.method1229(class97.field1824, 1, arg0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method194(int arg0) {
        field572 = null;
        field571 = null;
        field567 = null;
        if (arg0 != 1) {
            method194(115);
        }
        field577 = null;
        field576 = null;
        field575 = null;
        field569 = null;
        field568 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static final void method195(int arg0) {
        class15.field266.method676(30626);
        field570++;
        int var1 = 40 % ((arg0 + 28) / 62);
    }
}
