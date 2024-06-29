import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class58 extends class132 {

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "[B")
    public byte[] field1087;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Lvd;")
    public static class222 field1079 = class212.method1357("Ein kostenloses Spielkonto erstellen)3", 10731);

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field1080 = 0;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field1081 = 0;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Lvd;")
    public static class222 field1082 = class212.method1357("Sprites geladen)3", 10731);

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "Lvd;")
    public static class222 field1085 = class212.method1357("<img=1>", 10731);

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Lka;")
    public static class109 field1084;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "[I")
    public static int[] field1077;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
    public static final void method420(int arg0, int arg1) {
        class31.field653 = 50;
        class193.field3553 = arg1;
        field1086++;
        if (arg0 < 9) {
            method420(-37, -99);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III[[[I)V")
    public static final void method421(int arg0, int arg1, int arg2, int[][][] arg3) {
        class184.field3411 = arg0;
        class126.field2409 = arg1;
        class181.field3357 = arg2;
        class204.field3800 = new class121[arg0][arg1][arg2];
        class42.field898 = new int[arg0][arg1 + 1][arg2 + 1];
        class80.field1544 = arg3;
        class151.method975();
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public static void method422(byte arg0) {
        field1085 = null;
        if (arg0 < 63) {
            field1077 = null;
        }
        field1084 = null;
        field1082 = null;
        field1077 = null;
        field1079 = null;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([B)V")
    public class58(byte[] arg0) {
        this.field1087 = arg0;
    }
}
