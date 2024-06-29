import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class520 extends class354 {

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field7636 = 0;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7635 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field7642 = -1;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field7639 = 0;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "F")
    public static float field7640;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "Lmo;")
    public static class525 field7641;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZIII)V", line = 4)
    public static final void method3071(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class86.field1436.field4333 = 0;
        ++field7638;
        if (arg1) {
            class86.field1436.method1923((byte) 62, class224.field3253.field6584);
            class86.field1436.method1923((byte) 62, arg4);
            class86.field1436.method1923((byte) 62, arg0);
            class86.field1436.method1874(arg3, (byte) -110);
            class86.field1436.method1874(arg2, (byte) -110);
            class412.field6071 = -3;
            class303.field4362 = 0;
            class343.field5238 = 0;
            class267.field3859 = 1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)[I", line = 24)
    public final int[] method253(int arg0, byte arg1) {
        ++field7634;
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            class486.method2900(var3, 0, class404.field5952, class278.field4009[arg0]);
        }
        if (arg1 != -95) {
            method3071(-113, true, -71, 118, 116);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 47)
    public class520() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V", line = 50)
    public static void method3072(int arg0) {
        field7635 = null;
        if (arg0 != 0) {
            field7642 = 67;
        }
        field7641 = null;
    }
}
