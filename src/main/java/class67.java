import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class67 {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "[I")
    public static int[] field1033 = new int[2];

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "[I")
    public static int[] field1036 = new int[4096];

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "[J")
    public static long[] field1035;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([BZ)[B", line = 5)
    public static final byte[] method591(byte[] arg0, boolean arg1) {
        field1037++;
        if (arg1) {
            return null;
        } else {
            int var2 = arg0.length;
            byte[] var3 = new byte[var2];
            class85.method683(arg0, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 22)
    public static final void method592(int arg0) {
        class751.field10467.method388(class311.field4224, class243.field3580.field8005.method4058(false) == 1 ? class6.field58 + 256 << 2 : -1, arg0);
        field1032++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 46)
    public static void method593(boolean arg0) {
        if (!arg0) {
            method592(21);
        }
        field1033 = null;
        field1036 = null;
        field1035 = null;
    }
}
