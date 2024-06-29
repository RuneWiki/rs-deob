import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class106 extends class198 {

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    private int field1522 = -1;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field1524 = 0;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lsv;")
    public static class570 field1523 = new class570(50, 7);

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[I")
    public static int[] field1528 = new int[1];

    @OriginalMember(owner = "client!db", name = "r", descriptor = "B")
    private byte field1521;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "Ld;")
    public static class103 field1527;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLol;)V", line = 3)
    public final void method855(boolean arg0, class431 arg1) {
        field1529++;
        this.field1522 = arg1.method2565((byte) -104);
        this.field1521 = arg1.method2529(47);
        if (!arg0) {
            field1524 = -3;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 17)
    public static void method856(byte arg0) {
        int var1 = -103 % ((-arg0 - 23) / 52);
        field1528 = null;
        field1523 = null;
        field1527 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)V", line = 29)
    public static final void method857(boolean arg0, int arg1) {
        if (arg1 != 0) {
            field1523 = null;
        }
        field1526++;
        class26.method223(class448.field6174, class709.field9923, arg0, (byte) 100, class379.field5314);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILlm;)V", line = 43)
    public final void method858(int arg0, class50 arg1) {
        field1525++;
        if (arg0 != 3) {
            method856((byte) 82);
        }
        arg1.method401(this.field1522, this.field1521, -24707);
    }
}
