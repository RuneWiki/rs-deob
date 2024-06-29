import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class268 extends class232 {

    @OriginalMember(owner = "client!a", name = "L", descriptor = "Llj;")
    public class46 field4617;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "[[[Llc;")
    public static class160[][][] field4614 = new class160[4][104][104];

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Lok;")
    public static class146 field4611 = class235.method1724(-12908, "name_icons");

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public static int field4616 = 0;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "[Lje;")
    public static class70[] field4613;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V", line = 15)
    public static void method1946(int arg0) {
        field4613 = null;
        field4614 = (class160[][][]) null;
        if (arg0 > -53) {
            field4612 = 86;
        }
        field4611 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I", line = 41)
    public static final int method1947(int arg0, int arg1) {
        if (arg0 < 110) {
            return -53;
        } else {
            field4615++;
            return (arg1 & 0x3FDBF) >> 11;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)Lhm;", line = 52)
    public static final class19 method1948(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        return var3 == null ? null : var3.field223;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Llj;)V", line = 72)
    public class268(class46 arg0) {
        this.field4617 = arg0;
    }
}
