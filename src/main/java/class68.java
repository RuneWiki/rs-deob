import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class68 {

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field779 = 0;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "Lwv;")
    public static class387 field777;

    @OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field778++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method416(int arg0, int arg1) {
        if (arg1 != 31621) {
            method417(29);
        }
        field780++;
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFFC6C3) >> 16) + "." + ((arg0 & 0xFFEE) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static void method417(int arg0) {
        field777 = null;
        if (arg0 != -8405) {
            method417(32);
        }
    }
}
