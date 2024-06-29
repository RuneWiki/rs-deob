import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class213 {

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "[J")
    public static long[] field3079 = new long[100];

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "[[[I")
    public static int[][][] field3076 = new int[2][][];

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "[I")
    public static int[] field3073 = new int[100];

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "Z")
    public static boolean field3078;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 5)
    public static void method1534(int arg0) {
        field3073 = null;
        field3079 = null;
        field3076 = (int[][][]) null;
        if (arg0 > -78) {
            field3073 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([IZ)[I", line = 20)
    public static final int[] method1535(int[] arg0, boolean arg1) {
        field3074++;
        if (arg0 == null) {
            return null;
        } else if (arg1) {
            return (int[]) null;
        } else {
            int[] var2 = new int[arg0.length];
            class84.method689(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BZ)V", line = 38)
    public static final void method1536(byte arg0, boolean arg1) {
        class105.field1508 = (int[][][]) null;
        class96.field1364 = 0;
        class105.field1513 = (byte[][][]) null;
        class105.field1509 = (int[][][]) null;
        class49.field727 = null;
        class105.field1512 = (byte[][][]) null;
        class105.field1519 = (byte[][][]) null;
        class105.field1517 = (byte[][][]) null;
        class105.field1522 = (byte[][][]) null;
        class105.field1516 = null;
        if (arg1 && class105.field1500 != null) {
            class308.field4598 = class105.field1500.field4276;
        } else {
            class308.field4598 = -1;
        }
        class197.field2855 = null;
        class105.field1500 = null;
        class105.field1505.method2392((byte) 78);
        class19.field303 = null;
        class299.field4473 = -1;
        field3077++;
        class362.field5742 = -1;
        class35.field519 = null;
        class105.field1502 = null;
        class50.field762 = null;
        class250.field3714 = null;
        class215.field3173 = null;
        class240.field3571 = null;
        class54.field791 = null;
        class191.field2784 = null;
        class56.field807 = null;
        class50.field759 = null;
        class302.method2132(arg0);
        class33.field477 = null;
        class40.field578 = null;
        class278.field4227 = null;
        class294.method2106(128, 64, (byte) 28);
        class99.method785(64, 64, 0);
        class360.method2501(47, 64);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/String;)V", line = 85)
    public static final void method1537(int arg0, String arg1) {
        field3075++;
        if (!arg1.equals("")) {
            class197.field2857++;
            class107.field1533.method1915(true, arg0);
            class107.field1533.method1355((byte) -111, class225.method1646(-39, arg1));
            class107.field1533.method1343(arg1, arg0 ^ 0x40);
        }
    }
}
