import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class410 {

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "Z")
    public static boolean field5755 = true;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public int field5757;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "Ljava/lang/String;")
    public String field5756;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
    public static final byte[] method2503(Object arg0, int arg1, boolean arg2) {
        field5752++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class153.method1002(0, var3) : var3;
        } else {
            if (arg1 != 5) {
                method2503(null, 42, false);
            }
            if (!arg0 instanceof class353) {
                throw new IllegalArgumentException();
            }
            class353 var4 = (class353) arg0;
            return var4.method2223(16383);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lsha;I)V")
    public static final void method2504(class115 arg0, int arg1) {
        if (arg0.field1564 == 5 && arg0.field1458 != -1) {
            class288.method1903(arg1, arg0, class111.field1332);
        }
        field5754++;
        if (arg1 != 0) {
            method2503(null, 99, false);
        }
    }
}
