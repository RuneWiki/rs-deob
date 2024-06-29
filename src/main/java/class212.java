import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class212 extends class152 {

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "[[B")
    public static byte[][] field3611 = new byte[50][];

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public static int field3613 = 0;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "Lce;")
    public static class126 field3615 = class206.method1445(-7923, "tbrefresh");

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "Lce;")
    public static class126 field3610 = class206.method1445(-7923, "scrollbar");

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
    public static int field3616 = 0;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    public static int field3614 = 0;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "[I")
    public static int[] field3618 = new int[8];

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method1477(byte arg0, int arg1) {
        class315.field5413 = 0;
        class240.field4050 = -1;
        field3617++;
        class288.field4785 = false;
        class150.field2751 = arg1;
        class33.field477 = 1;
        class100.field1608 = null;
        if (arg0 != -111) {
            method1478(-29);
        }
        class272.field4587 = -1;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 27)
    public class212() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V", line = 35)
    public static void method1478(int arg0) {
        field3611 = (byte[][]) null;
        field3618 = null;
        if (arg0 > -102) {
            method1477((byte) -4, -39);
        }
        field3615 = null;
        field3610 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)[I", line = 71)
    public final int[] method6(boolean arg0, int arg1) {
        if (!arg0) {
            method1477((byte) 98, -49);
        }
        field3612++;
        return class29.field406;
    }
}
