import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class220 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field4072 = 0;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field4070 = 0;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Ls;")
    public static class194 field4073 = new class194(64);

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lqe;")
    public static class179 field4074 = class206.method1380("<col=ffffff> )4 ", (byte) -127);

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lqe;")
    public static class179 field4075 = class206.method1380("huffman", (byte) -128);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static void method1434(byte arg0) {
        field4074 = null;
        field4075 = null;
        if (arg0 < 24) {
            method1435(-26, 45);
        }
        field4073 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Lqe;")
    public static final class179 method1435(int arg0, int arg1) {
        field4069++;
        if (arg1 < 999999999) {
            return class148.method949((byte) -14, arg1);
        } else if (arg0 == 64) {
            return class31.field670;
        } else {
            return null;
        }
    }
}
