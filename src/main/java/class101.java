import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class101 extends class311 {

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "[[S")
    public static short[][] field1398 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1400 = null;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "Lvg;")
    public class108 field1395;

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "Lvg;")
    public class108 field1403;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "Ljava/lang/String;")
    public String field1399;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "Z")
    public boolean field1397;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "[Ljava/lang/Object;")
    public Object[] field1393;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "[[S")
    public static short[][] field1391;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)Z")
    public static final boolean method772(int arg0, int arg1) {
        field1407++;
        if (arg0 == 11 || arg0 == 45 || arg0 == 22 || arg0 == 51 || arg0 == 12) {
            return true;
        } else {
            return (short) arg1 == arg0 || arg0 == 1008;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
    public static final void method773(int arg0, int arg1, int arg2) {
        field1405++;
        int var3 = class359.field4970.field2662[0];
        int var4 = class359.field4970.field2659[arg2];
        if (class133.field1986 == 1) {
            if (!class398.method2469(arg0, false, 1, 0, 1, arg1, -2, 0, var4, arg2 + 94, var3)) {
                class398.method2469(arg0, false, 1, 0, 1, arg1, -3, 0, var4, arg2 ^ 0xFFFFFFCC, var3);
            }
        } else if (!class398.method2469(arg0, false, 1, 0, 1, arg1, -3, 0, var4, arg2 + 114, var3)) {
            class398.method2469(arg0, false, 1, 0, 1, arg1, -2, 0, var4, -101, var3);
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
    public static final void method774(int arg0) {
        class144.field2108.method248(((float) class359.field4957 * 0.1F + 0.7F) * class90.field1265);
        field1406++;
        if (arg0 > 48) {
            class144.field2108.method171(class67.field941, class53.field682, class102.field1411, (float) class61.field834, (float) class394.field5473, (float) class304.field4141);
            class144.field2108.method256(class18.field244);
        }
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V")
    public static void method775(int arg0) {
        field1400 = null;
        int var1 = 17 / ((arg0 + 30) / 39);
        field1398 = null;
        field1391 = null;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)V")
    public static final void method776(boolean arg0) {
        field1404++;
        if (arg0) {
            field1398 = null;
        }
        class254.field3518.method2530((byte) -126);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIILrd;)V")
    public static final void method777(int arg0, int arg1, int arg2, class419 arg3) {
        if (arg3.field2619 == arg1 && arg1 != -1) {
            class83 var4 = class408.method2521((byte) -112, arg1);
            int var5 = var4.field1166;
            if (var5 == 1) {
                arg3.field2578 = 0;
                arg3.field2593 = 0;
                arg3.field2648 = 1;
                arg3.field2626 = 0;
                arg3.field2617 = arg0;
                class431.method2657(var4, -63, arg3.field40, false, arg3.field2593, arg3.field44);
            }
            if (var5 == 2) {
                arg3.field2578 = 0;
            }
        } else if (arg1 == -1 || arg3.field2619 == -1 || class408.method2521((byte) -111, arg1).field1163 >= class408.method2521((byte) -106, arg3.field2619).field1163) {
            arg3.field2578 = 0;
            arg3.field2619 = arg1;
            arg3.field2593 = 0;
            arg3.field2626 = 0;
            arg3.field2617 = arg0;
            arg3.field2666 = arg3.field2654;
            arg3.field2648 = 1;
            if (arg3.field2619 != -1) {
                class431.method2657(class408.method2521((byte) 37, arg3.field2619), -63, arg3.field40, false, arg3.field2593, arg3.field44);
            }
        }
        field1401++;
        if (arg2 > -64) {
            field1391 = null;
        }
    }
}
