import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class431 {

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lcr;")
    public static class189 field6336 = new class189(200);

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Z")
    public static boolean field6338 = true;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6337 = "glow1:";

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)V")
    public static final void method2728(int arg0, byte arg1) {
        int var2 = -68 % ((52 - arg1) / 50);
        field6335++;
        class129.field1787.method1142((byte) -104, arg0);
        class188.field2524.method1142((byte) -85, arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lps;II)I")
    public static final int method2729(class394 arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method2731(17);
        }
        field6331++;
        if (!client.method1544(arg0).method2073(-69, arg1) && arg0.field5760 == null) {
            return -1;
        } else if (arg0.field5750 == null || arg1 >= arg0.field5750.length) {
            return -1;
        } else {
            return arg0.field5750[arg1];
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method2730(int arg0) {
        field6336 = null;
        field6337 = null;
        if (arg0 != 0) {
            method2728(-43, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public static final void method2731(int arg0) {
        class253.field3497 = null;
        class276.field3998 = arg0;
        field6332++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)I")
    public static final int method2732(byte arg0, int arg1, int arg2) {
        field6333++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else if (arg0 < 83) {
            return -125;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Lur;")
    public static final class92 method2733(int arg0) {
        field6334++;
        if (arg0 != -1) {
            field6336 = null;
        }
        return class248.field3343 < class16.field226.length ? class16.field226[class248.field3343++] : null;
    }
}
