import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class55 {

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lvo;")
    public static class358 field835 = class481.method2901(0);

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Lum;")
    public static class83 field836;

    @OriginalMember(owner = "client!jp", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field837++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)I", line = 24)
    public final int method355(int arg0) {
        if (arg0 > -83) {
            method356((byte) -42);
        }
        field838++;
        return this.field839;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 35)
    public static void method356(byte arg0) {
        field836 = null;
        int var1 = 16 / ((arg0 + 51) / 57);
        field835 = null;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(II)V", line = 46)
    public class55(int arg0, int arg1) {
        this.field840 = arg1;
        this.field839 = arg0;
    }
}
