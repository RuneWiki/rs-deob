import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class600 extends class601 {

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "Lqr;")
    public static class65 field7880 = new class65(260);

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "[I")
    public static int[] field7882 = new int[250];

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)V")
    public static final void method3264(boolean arg0, int arg1) {
        if (arg0) {
            field7882 = null;
        }
        ++field7881;
        class127 var2 = class760.method4231(arg1, -874792672, 8);
        var2.method1002(-87);
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
    public static void method3265(int arg0) {
        field7880 = null;
        if (arg0 == 0) {
            field7882 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field7879;
        if (arg0 != -40) {
            method3265(75);
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int[][] var4 = this.method3268(arg1, 0, 65535);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class171.field2624; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class600() {
        super(1, true);
    }
}
