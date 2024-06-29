import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class37 {

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Lbu;")
    public static class21 field486 = new class21(101, 4);

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "S")
    public static short field490 = 256;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "Lha;")
    public static class65 field491;

    @OriginalMember(owner = "client!wv", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field489++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V", line = 23)
    public static void method288(byte arg0) {
        field491 = null;
        if (arg0 < -42) {
            field486 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V", line = 34)
    public static final void method289(byte arg0) {
        if (arg0 == 68) {
            field487++;
            class58.field724 = true;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)I", line = 49)
    public static final int method290(int arg0, int arg1, int arg2) {
        if (arg2 == -1365732769) {
            field488++;
            int var3 = arg1 - 1 & arg0 >> 31;
            return ((arg0 >>> 31) + arg0) % arg1 + var3;
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(II)V", line = 63)
    public class37(int arg0, int arg1) {
    }
}
