import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class90 extends class117 {

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "Lvp;")
    public static class123 field1500 = new class123(29, 8);

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(I)V", line = 7)
    public class90(int arg0) {
        this.field1498 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V", line = 15)
    public static void method732(byte arg0) {
        if (arg0 >= -120) {
            field1500 = null;
        }
        field1500 = null;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(B)V", line = 27)
    public static final void method734(byte arg0) {
        int var1 = -67 / ((arg0 + 19) / 36);
        class406.field5977 = 0;
        field1496++;
        class56.field818 = -1;
        class48.field723 = -1;
        class403.field5926 = -1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B[B)[B", line = 44)
    public static final byte[] method735(byte arg0, byte[] arg1) {
        int var2 = 87 / ((-arg0 - 49) / 35);
        field1497++;
        int var3 = arg1.length;
        byte[] var4 = new byte[var3];
        class486.method2905(arg1, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lhh;II)Lds;", line = 59)
    public static final class12 method736(class84 arg0, int arg1, int arg2) {
        if (arg2 != 2987) {
            method732((byte) 75);
        }
        field1499++;
        byte[] var3 = arg0.method680(true, arg1);
        return var3 == null ? null : new class12(var3);
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method731(int arg0);

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)Z")
    public abstract boolean method733(byte arg0);
}
