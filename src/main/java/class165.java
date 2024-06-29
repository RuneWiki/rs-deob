import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class165 {

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "Lot;")
    public class165 field2133;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Lia;")
    public class142 field2134;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "[I")
    public static int[] field2136 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field2139 = 0;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field2140 = 1;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public int field2130;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
    public static void method1094(int arg0) {
        if (arg0 == 1) {
            field2136 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Lot;")
    public final class165 method1095(int arg0, int arg1) {
        if (arg1 >= -50) {
            return null;
        } else {
            field2141++;
            return new class165(this.field2132, arg0);
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)Lit;")
    public final class388 method1096(int arg0) {
        field2135++;
        if (arg0 != 2) {
            this.field2132 = -125;
        }
        return class65.method366((byte) 92, this.field2132);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(II)V")
    public class165(int arg0, int arg1) {
        this.field2131 = arg1;
        this.field2132 = arg0;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lot;I)V")
    public class165(class165 arg0, int arg1) {
        this.field2133 = arg0;
        this.field2134 = this.field2133.field2134;
        this.field2132 = this.field2133.field2132;
        this.field2131 = this.field2133.field2131 + arg1;
    }
}
