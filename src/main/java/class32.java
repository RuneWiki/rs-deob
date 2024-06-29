import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class32 {

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Z")
    public boolean field435 = false;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field436 = 0;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
    public static int[] field432 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Lmh;")
    public static class62 field438 = class201.method1405(true, "<col=40ff00>");

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field437 = 0;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "J")
    public static long field446 = 0L;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field444 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "J")
    public long field442;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Ljm;")
    public class123 field443;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "Lhi;")
    public static class26 field440;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[Lmh;")
    public static class62[] field431;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "[[[I")
    public static int[][][] field445;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([II[Ljava/lang/Object;)V", line = 13)
    public static final void method208(int[] arg0, int arg1, Object[] arg2) {
        field441++;
        if (arg1 <= -89) {
            class182.method1280(0, arg0, arg0.length - 1, 1, arg2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZLhg;II)V", line = 66)
    public static final void method209(int arg0, boolean arg1, class216 arg2, int arg3, int arg4) {
        if (!arg1) {
            return;
        }
        field439++;
        for (class114 var5 = (class114) class38.field595.method334(-18673); var5 != null; var5 = (class114) class38.field595.method335((byte) 122)) {
            if (var5.field1897 == arg4 && (arg0 * 128) == var5.field1910 && arg3 * 128 == var5.field1916 && var5.field1906.field3689 == arg2.field3689) {
                if (var5.field1898 != null) {
                    class27.field331.method132(var5.field1898);
                    var5.field1898 = null;
                }
                if (var5.field1905 != null) {
                    class27.field331.method132(var5.field1905);
                    var5.field1905 = null;
                }
                var5.method1444((byte) 89);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 106)
    public static void method210(int arg0) {
        field445 = (int[][][]) null;
        field438 = null;
        field431 = null;
        field440 = null;
        field432 = null;
        if (arg0 != -1) {
            field436 = 26;
        }
    }
}
