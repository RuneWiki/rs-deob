import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class259 {

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "Z")
    public static boolean field3256 = false;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "Lmg;")
    public static class697 field3254;

    @OriginalMember(owner = "client!ko", name = "toString", descriptor = "()Ljava/lang/String;", line = 10)
    public final String toString() {
        field3257++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)I", line = 19)
    public final int method1534(boolean arg0) {
        field3258++;
        return arg0 ? this.field3255 : 40;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 34)
    public class259(String arg0, int arg1) {
        this.field3255 = arg1;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 44)
    public static void method1535(int arg0) {
        if (arg0 == -22580) {
            field3254 = null;
        }
    }
}
