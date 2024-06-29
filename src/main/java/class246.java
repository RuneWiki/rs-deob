import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class246 {

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "[[B")
    private static byte[][] field3813 = new byte[1000][];

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Z")
    public static boolean field3814 = false;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Z")
    public static volatile boolean field3815 = true;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3812 = 0;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1625(int arg0) {
        if (arg0 == 100) {
            class72.field1505 = null;
            class33.field679 = null;
            class44.field894 = null;
            field3816++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILbm;)I", line = 19)
    public static final int method1626(int arg0, class307 arg1) {
        field3819++;
        int var2 = arg0;
        if (arg1.method2051(arg0 + 108, class336.field5162)) {
            var2 = arg0 + 1;
        }
        if (arg1.method2051(33, class9.field191)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V", line = 36)
    public static void method1627(int arg0) {
        field3813 = (byte[][]) null;
        if (arg0 != -27045) {
            field3818 = 4;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)[B", line = 46)
    public static final synchronized byte[] method1628(int arg0, boolean arg1) {
        field3811++;
        if (arg0 == 100 && class101.field1766 > 0) {
            byte[] var2 = field3813[--class101.field1766];
            field3813[class101.field1766] = null;
            return var2;
        } else if (arg0 == 5000 && class293.field4484 > 0) {
            byte[] var3 = class86.field1618[--class293.field4484];
            class86.field1618[class293.field4484] = null;
            return var3;
        } else if (arg0 == 30000 && class325.field4969 > 0) {
            byte[] var4 = class295.field4502[--class325.field4969];
            class295.field4502[class325.field4969] = null;
            return var4;
        } else {
            if (arg1) {
                field3813 = (byte[][]) ((byte[][]) null);
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V", line = 105)
    public static final void method1629(int arg0, byte arg1) {
        field3817++;
        if (arg1 > -40) {
            method1628(22, false);
        }
        class125.field2161.method1883(2047773287, arg0);
    }
}
