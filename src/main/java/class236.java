import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class236 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Z")
    public static boolean field3000 = false;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
    public static int[] field3001 = new int[1000];

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static final void method1366(int arg0) {
        field3005++;
        if (class453.field6284.method332()) {
            class453.field6284.method273(class220.field2664);
            class332.method1870((byte) 79);
            class453.field6284.method374(class220.field2664);
            class453.field6284.method284(class220.field2664);
        } else {
            class466.method2646(8000, class150.field1711);
        }
        int var1 = -76 / ((62 - arg0) / 33);
        class14.method66(12287);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZZ)Ldn;")
    public static final class472 method1367(int arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            field3004++;
            long var3 = (long) (arg0 | (arg2 ? Integer.MIN_VALUE : 0));
            return (class472) class153.field1732.method3234((byte) -49, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method1368(int arg0) {
        if (arg0 < -4) {
            field3001 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z[[I)V")
    public static final void method1369(boolean arg0, int[][] arg1) {
        if (!arg0) {
            field3000 = false;
        }
        field3002++;
        class156.field1755 = arg1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILep;)Ljava/lang/String;")
    public static final String method1370(int arg0, class382 arg1) {
        if (arg0 != -1) {
            method1369(true, null);
        }
        field3003++;
        if (client.method1530(arg1).method1495((byte) 122) == 0) {
            return null;
        } else if (arg1.field5040 == null || arg1.field5040.trim().length() == 0) {
            return class87.field933 ? "Hidden-use" : null;
        } else {
            return arg1.field5040;
        }
    }
}
