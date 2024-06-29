import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class254 {

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public int field3768;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Z")
    public static boolean field3765 = false;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1691(int arg0, String arg1) throws ClassNotFoundException {
        field3766++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            if (arg0 >= -18) {
                field3765 = true;
            }
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3769++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIII)V")
    public class254(int arg0, int arg1, int arg2, int arg3) {
        this.field3768 = arg3;
        this.field3767 = arg2;
        this.field3770 = arg1;
        this.field3764 = arg0;
    }
}
