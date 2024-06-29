import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class243 extends class265 {

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field3767;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    public static int field3765 = 0;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "[[I")
    public static int[][] field3771 = new int[6][];

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "Ltn;")
    public static class60 field3768 = new class60();

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "[B")
    public static byte[] field3772 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V", line = 3)
    public static void method1586(int arg0) {
        if (arg0 < 56) {
            field3768 = null;
        }
        field3772 = null;
        field3771 = null;
        field3768 = null;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 19)
    public class243(Object arg0, int arg1) {
        super(arg1);
        this.field3767 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)Z", line = 33)
    public static final boolean method1587(int arg0, boolean arg1) {
        field3769++;
        if (arg1) {
            return false;
        } else {
            return arg0 == 3 || arg0 == 4;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Z", line = 45)
    public final boolean method1588(int arg0) {
        if (arg0 != 14511) {
            method1587(48, true);
        }
        field3766++;
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(B)Ljava/lang/Object;", line = 65)
    public final Object method1589(byte arg0) {
        field3770++;
        int var2 = 112 / ((arg0 - 43) / 62);
        return this.field3767;
    }
}
