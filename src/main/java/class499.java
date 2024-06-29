import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class499 {

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public int field7487 = 1;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7484 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "Lnj;")
    public static class487 field7488 = new class487("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "C")
    public char field7483;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILps;I)V")
    private final void method3005(int arg0, class428 arg1, int arg2) {
        field7485++;
        if (~arg0 == arg2) {
            this.field7483 = class281.method1772(true, arg1.method2570((byte) 57));
        } else if (arg0 == 2) {
            this.field7487 = 0;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(BLps;)V")
    public final void method3006(byte arg0, class428 arg1) {
        if (arg0 < 113) {
            field7484 = null;
        }
        field7486++;
        while (true) {
            int var3 = arg1.method2561((byte) 110);
            if (var3 == 0) {
                return;
            }
            this.method3005(var3, arg1, -2);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
    public static void method3007(byte arg0) {
        field7484 = null;
        field7488 = null;
        if (arg0 <= 24) {
            method3007((byte) -110);
        }
    }
}
