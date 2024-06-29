import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class545 extends class42 {

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "S")
    public short field7989;

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "Lea;")
    public static class390 field7993 = new class390(2);

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "Lbd;")
    public static class44 field7994 = new class44("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "I")
    public static int field7996 = -1;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "Lmj;")
    public static class473 field7995;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BC)Z")
    public static final boolean method3199(byte arg0, char arg1) {
        field7990++;
        int var2 = 68 / ((-arg0 - 34) / 44);
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
    public class545() {
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public static void method3200(byte arg0) {
        int var1 = 103 / ((arg0 + 24) / 59);
        field7994 = null;
        field7995 = null;
        field7993 = null;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(S)V")
    public class545(short arg0) {
        this.field7989 = arg0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static final void method3201(int arg0) {
        if (arg0 != 18621) {
            field7993 = null;
        }
        class129.method955();
        field7992++;
    }
}
