import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public abstract class class548 {

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "Llf;")
    public class250 field7571;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "[I")
    public static int[] field7567 = new int[3];

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field7570 = 0;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "Ljb;")
    public static class519 field7568 = new class519(106, -1);

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "Lmw;")
    public static class517 field7573 = new class517(39, 4);

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "Led;")
    public static class732 field7575 = new class732(0, 2, 2, 1);

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "Luq;")
    public static class172 field7565;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "Luq;")
    public static class172 field7572;

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "Llh;")
    public static class552 field7574;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "Llt;")
    public static class702 field7564;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)V", line = 17)
    public static final void method3153(int arg0, int arg1) {
        field7569++;
        class778 var2 = class389.method2406(-90, (long) arg0, 6);
        if (arg1 > -50) {
            method3153(-106, 118);
        }
        var2.method4276(0);
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Llf;)V", line = 32)
    public class548(class250 arg0) {
        this.field7571 = arg0;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V", line = 40)
    public static void method3154(byte arg0) {
        field7565 = null;
        field7572 = null;
        field7573 = null;
        field7568 = null;
        field7575 = null;
        field7564 = null;
        field7567 = null;
        if (arg0 < 61) {
            method3153(-14, 86);
        }
        field7574 = null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZZ)V")
    public abstract void method754(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lru;II)V")
    public abstract void method760(class205 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
    public abstract void method759(int arg0);

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)Z")
    public abstract boolean method756(boolean arg0);

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZI)V")
    public abstract void method758(boolean arg0, int arg1);

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)V")
    public abstract void method753(int arg0, int arg1, int arg2);
}
