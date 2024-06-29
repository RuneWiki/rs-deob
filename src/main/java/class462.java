import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class462 {

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "Liaa;")
    public static class462 field6252 = new class462();

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "Liaa;")
    public static class462 field6253 = new class462();

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "Liaa;")
    public static class462 field6254 = new class462();

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "Liaa;")
    public static class462 field6255 = new class462();

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "Lrda;")
    public static class620 field6256 = new class620();

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!iaa", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field6250++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIZ)Z", line = 12)
    public static final boolean method2621(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field6256 = null;
        }
        field6251++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V", line = 40)
    public static void method2622(int arg0) {
        field6253 = null;
        field6255 = null;
        if (arg0 != -1) {
            field6254 = null;
        }
        field6254 = null;
        field6256 = null;
        field6252 = null;
    }
}
