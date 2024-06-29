import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class683 {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Lpi;")
    public class525 field9507 = new class525();

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Lmo;")
    public static class780 field9506 = new class780("", 14);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field9504;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field9513;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Lpi;")
    private class525 field9511;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lgj;")
    public static class662 field9512;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Lpi;", line = 5)
    public final class525 method3847(byte arg0) {
        field9509++;
        if (arg0 != 27) {
            return null;
        }
        class525 var2 = this.field9511;
        if (this.field9507 == var2) {
            this.field9511 = null;
            return null;
        } else {
            this.field9511 = var2.field7133;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)I", line = 29)
    public final int method3848(int arg0) {
        field9508++;
        int var2 = arg0;
        class525 var3 = this.field9507.field7133;
        while (this.field9507 != var3) {
            var3 = var3.field7133;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 48)
    public final void method3849(int arg0) {
        while (true) {
            class525 var2 = this.field9507.field7133;
            if (this.field9507 == var2) {
                if (arg0 != 29893) {
                    field9510 = 16;
                }
                field9513++;
                this.field9511 = null;
                return;
            }
            var2.method2987(arg0 - 29985);
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V", line = 70)
    public static void method3850(int arg0) {
        int var1 = -38 / ((-arg0 - 25) / 37);
        field9506 = null;
        field9512 = null;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V", line = 133)
    public class683() {
        this.field9507.field7138 = this.field9507;
        this.field9507.field7133 = this.field9507;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILpi;)V", line = 91)
    public final void method3851(int arg0, class525 arg1) {
        if (arg1.field7138 != null) {
            arg1.method2987(-55);
        }
        field9505++;
        arg1.field7138 = this.field9507.field7138;
        if (arg0 != 13246) {
            this.method3852((byte) -58);
        }
        arg1.field7133 = this.field9507;
        arg1.field7138.field7133 = arg1;
        arg1.field7133.field7138 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)Lpi;", line = 109)
    public final class525 method3852(byte arg0) {
        field9504++;
        class525 var2 = this.field9507.field7133;
        if (this.field9507 == var2) {
            this.field9511 = null;
            return null;
        }
        if (arg0 > -93) {
            field9512 = null;
        }
        this.field9511 = var2.field7133;
        return var2;
    }
}
