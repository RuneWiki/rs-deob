import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class446 {

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Ljava/lang/String;")
    public String field6596;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public int field6591;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lbg;")
    public static class324 field6593;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "[I")
    public static int[] field6598;

    static {
        new class331("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field6594 = 0;
        field6593 = new class324(79, 6);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 3)
    public static void method2712(int arg0) {
        field6593 = null;
        if (arg0 == -7325) {
            field6598 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "toString", descriptor = "()Ljava/lang/String;", line = 32)
    public final String toString() {
        field6595++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lcw;II)V", line = 40)
    public static final void method2713(class120 arg0, int arg1, int arg2) {
        class522.field7672 = false;
        if (arg1 >= -114) {
            field6590 = -85;
        }
        class293.field4221 = 0;
        field6597++;
        class160.method1130(arg0, 0);
        class22.method189(arg0, (byte) -128);
        if (class522.field7672) {
            System.out.println("---endgpp---");
        }
        if (arg0.field827 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg0.field827 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 61)
    public class446(String arg0, int arg1) {
        this.field6596 = arg0;
        this.field6591 = arg1;
    }
}
