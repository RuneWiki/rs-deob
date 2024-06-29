import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class21 extends class129 {

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "[Lrd;")
    public static class173[] field461 = new class173[500];

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "[[[B")
    public static byte[][][] field462 = new byte[4][104][104];

    @OriginalMember(owner = "client!c", name = "z", descriptor = "Lrd;")
    public static class173 field469 = class133.method843("<col=ff3000>", 55);

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Lbb;")
    public static class13 field467;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Lbc;")
    public static class14 field465;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
    public static int method181(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static void method182(int arg0) {
        field462 = null;
        field461 = null;
        field465 = null;
        field467 = null;
        if (arg0 != 14340) {
            method182(-8);
        }
        field469 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(II)V")
    public class21(int arg0, int arg1) {
        this.field464 = arg0;
        this.field470 = arg1;
    }
}
