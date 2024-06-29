import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class202 extends class90 {

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public int field3987;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Lrf;")
    public static class163 field3983 = class53.method392(-120, "Null");

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field3984 = 0;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
    public static int[] field3988 = new int[50];

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Lrf;")
    public static class163 field3991 = class53.method392(-67, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lrf;")
    public static class163 field3977 = class53.method392(112, "blaugr-Un:");

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Lrf;")
    public static class163 field3986 = class53.method392(54, "");

    @OriginalMember(owner = "client!w", name = "D", descriptor = "Lrf;")
    public static class163 field3985 = field3986;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "Lrf;")
    public static class163 field3990 = field3986;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Lrf;")
    public static class163 field3979 = field3986;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Lrf;")
    public static class163 field3989 = field3986;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Lrf;")
    public static class163 field3995 = field3986;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "Lrf;")
    public static class163 field3994 = field3986;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Lue;")
    public static class189 field3981;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[[B")
    public static byte[][] field3980;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public static void method1325(int arg0) {
        field3980 = null;
        field3990 = null;
        field3983 = null;
        if (arg0 != -1) {
            method1325(93);
        }
        field3977 = null;
        field3986 = null;
        field3979 = null;
        field3988 = null;
        field3991 = null;
        field3989 = null;
        field3981 = null;
        field3994 = null;
        field3995 = null;
        field3985 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(III)V")
    public static final void method1326(int arg0, int arg1, int arg2) {
        field3993++;
        if (class5.field106 == 2 && arg1 == 7057) {
            class106.method721((class206.field4024 - class69.field1470 << 7) + class139.field2873, class93.field2014 * 2, (class108.field2249 - class172.field3493 << 7) + class195.field3851, false);
            if (class168.field3405 > -1 && class51.field1023 % 20 < 10) {
                class96.field2045[0].method1106(class168.field3405 + arg2 - 12, class61.field1282 + -28 + arg0);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(II)V")
    public class202(int arg0, int arg1) {
        this.field3978 = arg0;
        this.field3987 = arg1;
    }
}
