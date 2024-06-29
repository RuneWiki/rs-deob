import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class433 {

    @OriginalMember(owner = "client!so", name = "a", descriptor = "[F")
    public static float[] field6335 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field6338 = 0;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IBI)Z", line = 3)
    public static final boolean method2578(int arg0, byte arg1, int arg2) {
        field6337++;
        if (arg1 <= 119) {
            field6335 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!so", name = "toString", descriptor = "()Ljava/lang/String;", line = 14)
    public final String toString() {
        field6340++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I[BI)[B", line = 22)
    public static final byte[] method2579(int arg0, byte[] arg1, int arg2) {
        field6339++;
        if (arg0 < 90) {
            field6335 = null;
        }
        byte[] var3 = new byte[arg2];
        class476.method2792(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BZ)V", line = 40)
    public static final void method2580(byte arg0, boolean arg1) {
        int var2 = 42 % ((83 - arg0) / 39);
        field6336++;
        class508.method2919((byte) -102, arg1, class31.field494, class100.field1556, class487.field6930);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 59)
    public static void method2581(int arg0) {
        field6335 = null;
        int var1 = -47 % ((-arg0 - 32) / 53);
    }
}
