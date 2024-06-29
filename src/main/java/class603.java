import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class603 extends class593 {

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "[I")
    public int[] field8585;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "[I")
    public int[] field8582;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "Lbv;")
    public static class567 field8584 = new class567("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "[I")
    public static int[] field8586 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(BI)Lbi;", line = 14)
    public static final class465 method3437(byte arg0, int arg1) {
        field8583++;
        if (arg0 != -22) {
            field8586 = null;
        }
        class115[] var2 = class616.field8718;
        synchronized (class616.field8718) {
            class465 var3;
            if (arg1 >= class616.field8718.length || class616.field8718[arg1].method945((byte) 30)) {
                var3 = new class465();
                var3.field6707 = new class315[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field6707[var4] = new class315();
                }
            } else {
                var3 = (class465) class616.field8718[arg1].method948(true);
                var3.method2753(arg0 ^ 0xFFFFFFEA);
                int var10002 = class79.field1426[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(II[I[I)V", line = 48)
    public class603(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field8585 = arg2;
        this.field8582 = arg3;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V", line = 66)
    public static void method3438(byte arg0) {
        field8584 = null;
        if (arg0 < -24) {
            field8586 = null;
        }
    }
}
