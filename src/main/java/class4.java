import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Loc;")
    public static class151 field82 = class137.method873(2, "::fps ");

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Loc;")
    public static class151 field84 = class137.method873(2, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Loc;")
    public static class151 field81 = class137.method873(2, " <col=ffff00>");

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[[I")
    public static int[][] field85 = new int[104][104];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static final void method29(int arg0) {
        class53.field1064.method1317((byte) -128);
        field79++;
        if (arg0 != 104) {
            field81 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method30(byte arg0) {
        field85 = null;
        field82 = null;
        if (arg0 != -89) {
            method29(88);
        }
        field84 = null;
        field81 = null;
    }
}
