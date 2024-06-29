import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class706 extends class168 {

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "J")
    public long field9780;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lkg;")
    public static class275 field9782 = new class275(9, 0);

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field9781;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Leba;")
    public static class590 field9779;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLiu;)V")
    public static final void method3952(boolean arg0, class580 arg1) {
        field9781++;
        arg1.field8116 = null;
        if (class461.field6214 < 20) {
            class299.field3933.method166(-8839, arg1);
            class461.field6214++;
        }
        if (!arg0) {
            method3953((byte) -30);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Loc;")
    public static final class206 method3953(byte arg0) {
        field9778++;
        if (arg0 != -116) {
            field9779 = null;
        }
        try {
            return new class11();
        } catch (Throwable var2) {
            try {
                return (class206) Class.forName("oca").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class202();
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class706() {
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(J)V")
    public class706(long arg0) {
        this.field9780 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public static void method3954(byte arg0) {
        field9779 = null;
        if (arg0 != 23) {
            method3953((byte) -117);
        }
        field9782 = null;
    }
}
