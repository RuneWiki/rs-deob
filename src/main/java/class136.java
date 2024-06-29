import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class136 {

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Lkg;")
    public static class179 field1754 = new class179(82, -1);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "[B")
    public byte[] field1752;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "[S")
    public short[] field1748;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "[S")
    public short[] field1749;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "[S")
    public short[] field1753;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method934(int arg0, int arg1, int arg2) {
        field1750++;
        if (arg0 == 24016) {
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lhd;I)V", line = 24)
    public static final void method935(class523 arg0, int arg1) {
        if (class500.field7236 == arg0.field7626) {
            class229.field2928[arg0.field7621] = true;
        }
        field1751++;
        if (arg1 >= -123) {
            method934(111, 74, -120);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 45)
    public static void method936(int arg0) {
        if (arg0 != 82) {
            method936(100);
        }
        field1754 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILhu;)V", line = 55)
    public static final void method937(int arg0, class86 arg1) {
        if (arg1.field1077 != null) {
            arg1.field1077.field4201 = 0;
        }
        arg1.field1078 = false;
        int var2 = -25 % ((arg0 + 34) / 37);
        field1747++;
        for (class86 var3 = arg1.method689(); var3 != null; var3 = arg1.method692()) {
            method937(-118, var3);
        }
    }
}
