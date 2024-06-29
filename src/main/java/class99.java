import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class99 extends class665 {

    @OriginalMember(owner = "client!lfa", name = "n", descriptor = "J")
    public long field1553;

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
    public static int field1551 = -1;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!lfa", name = "m", descriptor = "Lf;")
    public static class702 field1552;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method806(int arg0, String arg1) throws ClassNotFoundException {
        if (arg0 != -1) {
            return null;
        }
        field1550++;
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
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public static void method807(int arg0) {
        if (arg0 == -1) {
            field1552 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "()V")
    public class99() {
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(J)V")
    public class99(long arg0) {
        this.field1553 = arg0;
    }
}
