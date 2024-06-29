import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class471 {

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "[I")
    public static int[] field7020 = new int[5];

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public int field7017;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public int field7018;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field7019;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public int field7022;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public int field7024;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public int field7026;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public int field7027;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "[B")
    public byte[] field7023;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "[B")
    public byte[] field7025;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Luu;I)V", line = 15)
    public static final void method2821(class191 arg0, int arg1) {
        class263.field3685 = 0;
        class281.field3978 = 0;
        field7021++;
        class11.field184 = new class507();
        class457.field6857 = new class97[arg1];
        class277.method1784((byte) -126, arg0);
        class303.method1915(arg1 ^ 0x402, arg0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V", line = 30)
    public static void method2822(boolean arg0) {
        if (!arg0) {
            method2821(null, -91);
        }
        field7020 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Ljw;", line = 41)
    public static final class394 method2823(int arg0, int arg1, int arg2) {
        class452 var3 = class443.field6672[arg0][arg1][arg2];
        return var3 == null || var3.field6801 == null ? null : var3.field6801;
    }
}
