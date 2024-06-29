import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class437 extends class432 {

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "Ljava/lang/Object;")
    private Object field6214;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field6216 = 2;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field6218 = -1;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "Lch;")
    public static class151 field6215 = new class151("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)Z", line = 3)
    public final boolean method487(int arg0) {
        field6213++;
        if (arg0 != 3) {
            field6218 = -6;
        }
        return false;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 17)
    public final Object method486(int arg0) {
        field6212++;
        if (arg0 != 128) {
            this.method487(5);
        }
        return this.field6214;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lts;Ljava/lang/Object;I)V", line = 34)
    public class437(class23 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6214 = arg1;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V", line = 42)
    public static void method2670(byte arg0) {
        if (arg0 < -93) {
            field6215 = null;
        }
    }
}
