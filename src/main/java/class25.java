import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 {

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public int field414 = 1;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "Lrl;")
    public static class672 field415 = new class672(78, -1);

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "[[B")
    public static byte[][] field416 = new byte[50][];

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "C")
    public char field412;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILie;)V", line = 3)
    public final void method417(int arg0, class6 arg1) {
        field411++;
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    this.method417(-59, null);
                    return;
                }
            }
            this.method419((byte) 86, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 25)
    public static void method418(int arg0) {
        field416 = null;
        field415 = null;
        if (arg0 != -15847) {
            method418(-126);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BILie;)V", line = 47)
    private final void method419(byte arg0, int arg1, class6 arg2) {
        if (arg1 == 1) {
            this.field412 = class457.method2868(-57, arg2.method81(true));
        } else if (arg1 == 2) {
            this.field414 = 0;
        }
        if (arg0 <= 52) {
            this.field412 = 'B';
        }
        field413++;
    }
}
