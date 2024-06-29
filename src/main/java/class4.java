import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class4 {

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
    public static int[] field57 = new int[25];

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lrb;")
    public static class196 field54 = new class196();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lda;")
    private static class275 field60 = class255.method1672(104, "Created gameworld");

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lda;")
    public static class275 field63 = field60;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field62 = 0;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Z")
    public static boolean field59;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[I")
    public static int[] field53;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public static final int method16(int arg0, int arg1) {
        if (arg1 >= -127) {
            field59 = false;
        }
        field52++;
        return (arg0 & 0x1E31A2) >> 18;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static final void method17(byte arg0) {
        if (arg0 != 1) {
            method16(-97, 22);
        }
        class86.field1454.method993(109);
        class82.field1331.method993(103);
        field58++;
        class44.field744.method993(120);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    public static void method18(byte arg0) {
        field60 = null;
        if (arg0 > 1) {
            field54 = null;
            field53 = null;
            field57 = null;
            field63 = null;
        }
    }
}
