import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class642 {

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public int field9326 = -1;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public int field9328 = -1;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "Lej;")
    public static class104 field9324 = new class104("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "Lki;")
    public static class607 field9327;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "[I")
    public int[] field9325;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static void method3704(int arg0) {
        field9327 = null;
        field9324 = null;
        if (arg0 >= -47) {
            field9324 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ldaa;I)V")
    public final void method3705(class11 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method110((byte) 58);
            if (var3 == 0) {
                field9329++;
                if (arg1 != 3) {
                    method3704(103);
                    return;
                }
                return;
            }
            this.method3706(arg0, var3, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ldaa;IB)V")
    private final void method3706(class11 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field9328 = arg0.method93((byte) 122);
        } else if (arg1 == 2) {
            this.field9325 = new int[arg0.method110((byte) 30)];
            for (int var4 = 0; var4 < this.field9325.length; var4++) {
                this.field9325[var4] = arg0.method93((byte) 75);
            }
        } else if (arg1 == 3) {
            this.field9326 = arg0.method110((byte) 63);
        }
        if (arg2 <= 90) {
            field9324 = null;
        }
        field9323++;
    }
}
