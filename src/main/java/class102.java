import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class102 {

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Lbf;")
    public static class372 field1431;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "Z")
    public static boolean field1433;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public static void method867(int arg0) {
        field1431 = null;
        if (arg0 != 30068) {
            field1431 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1429++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(IIII)V")
    public class102(int arg0, int arg1, int arg2, int arg3) {
        this.field1428 = arg2;
        this.field1430 = arg0;
        this.field1426 = arg1;
        this.field1427 = arg3;
    }

    static {
        new class331("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field1431 = new class372(2, 6);
        field1433 = true;
        field1432 = 52;
    }
}
