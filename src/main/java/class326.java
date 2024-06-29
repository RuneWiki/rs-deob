import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class326 extends class101 {

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Ljava/lang/String;")
    public String field4908;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Z")
    public static boolean field4911 = false;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[Z")
    public static boolean[] field4913 = new boolean[5];

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4914 = "Walk here";

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
    public static int[] field4909;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[[[B")
    public static byte[][][] field4912;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V", line = 7)
    public static void method2221(boolean arg0) {
        if (arg0) {
            field4914 = null;
            field4913 = null;
            field4909 = null;
            field4912 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 20)
    public static final void method2222(byte arg0) {
        field4907++;
        class30.method200(5, -76);
        class204.method1406(5, (byte) 22);
        class43.method284((byte) -73, 5);
        class78.method526(1, 5);
        class66.method434(false, 5);
        class61.method410(5, -2130);
        class44.method288((byte) -60, 5);
        class132.method972((byte) 119, 5);
        class218.method1497(-10304, 5);
        class104.method730(5, (byte) -119);
        class184.method1272(5, arg0 + 22);
        class177.method1223(5, arg0 - 6905);
        class281.method1966(5, arg0 ^ 0x24);
        class49.method340(0, 5);
        class195.method1342(true, 5);
        class156.method1112(-66, 50);
        class299.method2083(5, (byte) -61);
        class12.method68((byte) 126, 5);
        if (arg0 != -22) {
            field4913 = (boolean[]) null;
        }
        class13.field146.method2174(-12634, 5);
        class211.field3215.method2174(-12634, 5);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 66)
    public class326() {
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 69)
    public class326(String arg0, int arg1) {
        this.field4908 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)I", line = 80)
    public static final int method2223(int arg0) {
        field4910++;
        if (arg0 != -1) {
            field4912 = (byte[][][]) ((byte[][][]) null);
        }
        return class96.field1446 && class120.field1879[81] && class190.field2829 > 2 ? class155.field2322[class190.field2829 - 2] : class155.field2322[class190.field2829 - 1];
    }
}
