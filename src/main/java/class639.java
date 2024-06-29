import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class639 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9073 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Lsb;")
    public static class305 field9076 = new class305(22, 6);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lrd;")
    public static class460 field9075;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method3599(byte arg0) {
        field9076 = null;
        if (arg0 < 20) {
            method3599((byte) -63);
        }
        field9075 = null;
        field9073 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[Lf;)V")
    public static final void method3600(int arg0, class534[] arg1) {
        class162.field1810 = arg1.length;
        field9074++;
        class420.field5596 = new int[class162.field1810 + 10];
        class587.field8315 = new class534[class162.field1810 + 10];
        class567.method3216(arg1, 0, class587.field8315, 0, class162.field1810);
        for (int var2 = 0; var2 < class162.field1810; var2++) {
            class420.field5596[var2] = class587.field8315[var2].method304();
        }
        int var3 = -21 / ((-arg0 - 67) / 57);
        for (int var4 = class162.field1810; var4 < class587.field8315.length; var4++) {
            class420.field5596[var4] = 12;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ltf;Ltf;Ltf;Ltf;Z)V")
    public static final void method3601(class701 arg0, class701 arg1, class701 arg2, class701 arg3, boolean arg4) {
        class424.field5983 = arg2;
        field9072++;
        class551.field7882 = arg0;
        if (arg4) {
            field9073 = null;
        }
        class241.field2985 = arg1;
        class102.field1106 = new class452[class551.field7882.method3877(100)][];
        class507.field7282 = new boolean[class551.field7882.method3877(100)];
    }
}
