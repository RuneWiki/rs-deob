import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 extends class88 {

    @OriginalMember(owner = "client!r", name = "G", descriptor = "Z")
    public boolean field2691 = false;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Z")
    public static boolean field2680 = false;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "Ltd;")
    private static class136 field2688 = class145.method1172("This world is full)3", 45);

    @OriginalMember(owner = "client!r", name = "E", descriptor = "Z")
    public static boolean field2689 = false;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "Ltd;")
    public static class136 field2692 = class145.method1172("welle:", 45);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Ltd;")
    public static class136 field2685 = class145.method1172("event_opbase", 45);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field2686 = 1;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "Ltd;")
    public static class136 field2695 = field2688;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "Ltd;")
    private static class136 field2698 = class145.method1172("Walk here", 45);

    @OriginalMember(owner = "client!r", name = "N", descriptor = "[Ltc;")
    public static class135[] field2697 = new class135[50];

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Ltd;")
    public static class136 field2694 = field2698;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public int field2682;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Lmd;")
    public static class87 field2687;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lmd;Lmd;ILmd;)V")
    public static final void method927(class87 arg0, class87 arg1, int arg2, class87 arg3) {
        class93.field2178 = arg1;
        int var4 = -25 % ((arg2 + 11) / 57);
        field2681++;
        class73.field1543 = arg0;
        class59.field1283 = arg3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lmd;III)[Lbb;")
    public static final class10[] method928(class87 arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -38) {
            method928(null, -96, -67, -58);
        }
        field2690++;
        return class78.method565(arg0, arg3, -128, arg2) ? class113.method882(512) : null;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public static void method929(int arg0) {
        if (arg0 != -15) {
            method929(1);
        }
        field2695 = null;
        field2698 = null;
        field2687 = null;
        field2694 = null;
        field2688 = null;
        field2685 = null;
        field2692 = null;
        field2697 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
    public static final void method930(int arg0, int arg1, int arg2) {
        field2684++;
        if (arg0 >= -101) {
            method929(-72);
        }
        if (class14.field274 < 2 && class147.field3410 == 0 && !class40.field933) {
            return;
        }
        class136 var3;
        if (class147.field3410 == 1 && class14.field274 < 2) {
            var3 = class79.method570(0, new class136[] { class152.field3483, class37.field859, class49.field1126, class83.field1953 });
        } else if (class40.field933 && class14.field274 < 2) {
            var3 = class79.method570(0, new class136[] { class27.field602, class37.field859, class28.field620, class83.field1953 });
        } else {
            var3 = class69.method508(class14.field274 - 1, (byte) -88);
        }
        if (class14.field274 > 2) {
            var3 = class79.method570(0, new class136[] { var3, class4.field67, class19.method140(class14.field274 - 2, -114), class108.field2560 });
        }
        class81.field1943.method721(var3, arg1 + 4, arg2 - -15, 16777215, 0, class44.field1013 / 1000);
    }
}
