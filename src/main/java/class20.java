import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class20 {

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Lbf;")
    public static class70 field184 = new class70();

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field185 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V", line = 4)
    public static final void method111(int arg0, int arg1, int arg2) {
        if (arg1 == -1914918544) {
            class522.field7230 = arg2 - class561.field7675;
            class92.field1131 = arg0 - class561.field7661;
            field183++;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 20)
    public static void method112(int arg0) {
        if (arg0 != 111739425) {
            field184 = null;
        }
        field184 = null;
        field185 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)Z", line = 34)
    public static final boolean method113(int arg0, int arg1) {
        field182++;
        if (arg0 < 22) {
            field185 = null;
        }
        return arg1 == 7 || arg1 == 8 || arg1 == 9;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)I", line = 48)
    public static final int method114(int arg0, byte arg1) {
        field181++;
        if (arg1 != 109) {
            method113(6, -49);
        }
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg0 & ~var7;
    }
}
