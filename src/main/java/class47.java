import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class47 extends class41 {

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "Lsc;")
    public static class181 field738 = class149.method967(255, "mapflag");

    @OriginalMember(owner = "client!le", name = "z", descriptor = "[[B")
    public static byte[][] field737 = new byte[50][];

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field740 = -1;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "Lsc;")
    public static class181 field739 = class149.method967(255, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field743 = 0;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "Ljd;")
    public static class265 field744 = new class265(30);

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "Ljb;")
    public static class11 field745;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "[I")
    public static int[] field735;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "[Ltg;")
    public static class107[] field746;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public static void method318(int arg0) {
        field738 = null;
        field735 = null;
        field745 = null;
        field739 = null;
        int var1 = 86 / ((arg0 - 49) / 62);
        field744 = null;
        field746 = null;
        field737 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIZIZ)Ldg;")
    public static final class90 method319(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        class195 var5 = null;
        if (class93.field1479 != null) {
            var5 = new class195(arg3, class93.field1479, class238.field4134[arg3], 1000000);
        }
        field742++;
        if (arg1 != 1000000) {
            method318(20);
        }
        return new class90(var5, class160.field2732, arg3, arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(II)V")
    public class47(int arg0, int arg1) {
        this.field733 = arg0;
        this.field741 = arg1;
    }
}
