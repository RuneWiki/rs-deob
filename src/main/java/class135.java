import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class135 extends class375 {

    @OriginalMember(owner = "client!el", name = "G", descriptor = "[I")
    public static int[] field1828 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "Ldn;")
    public static class201 field1829;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "[B")
    private byte[] field1825;

    static {
        new class169("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BIB)V", line = 4)
    public final void method942(byte arg0, int arg1, byte arg2) {
        field1827++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        if (arg0 < 55) {
            this.method942((byte) -58, 28, (byte) -41);
        }
        this.field1825[var4++] = var5;
        this.field1825[var4] = var5;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 19)
    public static void method943(boolean arg0) {
        field1828 = null;
        field1829 = null;
        if (arg0) {
            field1829 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)[B", line = 32)
    public final byte[] method944(int arg0, int arg1, int arg2, int arg3) {
        this.field1825 = new byte[arg1 * arg2 * arg0 * 2];
        field1826++;
        this.method1926(false, arg1, arg2, arg0);
        if (arg3 < 26) {
            field1828 = null;
        }
        return this.field1825;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 58)
    public class135() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
