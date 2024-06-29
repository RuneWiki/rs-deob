import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class92 extends class161 {

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public static int field1132 = 0;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field1134 = 0;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "[I")
    public static int[] field1133 = new int[50];

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)Lee;", line = 3)
    public static final class402 method545(int arg0, byte arg1) {
        if (arg1 < 31) {
            method546((byte) -64);
        }
        field1136++;
        class402 var2 = (class402) class368.field5580.method331((byte) 69, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class221.field3676.method2771(1, arg0, 3);
        class402 var4 = new class402();
        if (var3 != null) {
            var4.method2527(new class186(var3), 0, arg0);
        }
        class368.field5580.method341(121, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)V", line = 41)
    public static void method546(byte arg0) {
        if (arg0 != -15) {
            field1132 = 87;
        }
        field1133 = null;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(II)V", line = 54)
    public class92(int arg0, int arg1) {
        this.field1137 = arg0;
        this.field1135 = arg1;
    }
}
