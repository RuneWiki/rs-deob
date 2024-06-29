import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class118 extends class194 {

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public int field2053;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lqk;")
    public static class207 field2044 = class24.method212(255, "Choisir une option");

    @OriginalMember(owner = "client!u", name = "v", descriptor = "[I")
    public static int[] field2048 = new int[14];

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[Lqk;")
    public static class207[] field2042 = new class207[200];

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field2050 = -1;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "[Lqk;")
    public static class207[] field2047 = new class207[5];

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Lqk;")
    public static class207 field2051 = class24.method212(255, "welle2:");

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "[[Z")
    public static boolean[][] field2045;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Lo;")
    public static final class246 method840(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class246 var4 = var3.field3152;
            var3.field3152 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lhd;")
    public static final class11 method841(int arg0, int arg1) {
        class11 var2 = (class11) class231.field4239.method1387((long) arg0, 125);
        field2046++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class283.field4972.method705(arg1, arg0, -1);
        class11 var4 = new class11();
        if (var3 != null) {
            var4.method61(new class149(var3), arg0, -1);
        }
        class231.field4239.method1385((long) arg0, var4, (byte) -115);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BIIILwd;ILka;Lfk;)V")
    public static final void method842(byte arg0, int arg1, int arg2, int arg3, class22 arg4, int arg5, class256 arg6, class14 arg7) {
        field2052++;
        class79 var8 = new class79();
        var8.field1456 = arg5;
        var8.field1450 = arg2 * 128;
        var8.field1445 = arg1 * 128;
        if (arg4 != null) {
            var8.field1455 = arg4.field399;
            var8.field1457 = arg4;
            var8.field1439 = arg4.field430;
            int var9 = arg4.field392;
            var8.field1451 = arg4.field369;
            var8.field1454 = arg4.field378 * 128;
            var8.field1436 = arg4.field396;
            int var10 = arg4.field414;
            if (arg3 == 1 || arg3 == 3) {
                var9 = arg4.field414;
                var10 = arg4.field392;
            }
            var8.field1431 = (arg2 + var10) * 128;
            var8.field1435 = (arg1 + var9) * 128;
            if (arg4.field428 != null) {
                var8.field1452 = true;
                var8.method599(113);
            }
            if (var8.field1439 != null) {
                var8.field1440 = var8.field1455 + (int) ((double) (var8.field1436 - var8.field1455) * Math.random());
            }
            class78.field1415.method931(var8, 122);
        } else if (arg6 != null) {
            class72 var11 = arg6.field4581;
            var8.field1432 = arg6;
            if (var11.field1293 != null) {
                var8.field1452 = true;
                var11 = var11.method517(-73);
            }
            if (var11 != null) {
                var8.field1431 = (var11.field1303 + arg2) * 128;
                var8.field1435 = (arg1 + var11.field1303) * 128;
                var8.field1451 = class279.method1896((byte) -6, arg6);
                var8.field1454 = var11.field1304 * 128;
            }
            class47.field942.method931(var8, 127);
        } else if (arg7 != null) {
            var8.field1448 = arg7;
            var8.field1435 = (arg1 + arg7.method83(true)) * 128;
            var8.field1431 = (arg2 + arg7.method83(true)) * 128;
            var8.field1451 = class275.method1871(-1, arg7);
            var8.field1454 = arg7.field219 * 128;
            class175.field3168.method1863((byte) 112, var8, arg7.field209.method1428(0));
        }
        if (arg0 > -29) {
            method842((byte) -69, -37, 115, 65, (class22) null, -74, (class256) null, (class14) null);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
    public static final void method843(int arg0, byte arg1) {
        field2043++;
        class268.field4734.method1383(-8052, arg0);
        class125.field2174.method1383(arg1 - 8164, arg0);
        if (arg1 != 112) {
            field2048 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    public static final void method844(int arg0) {
        field2041++;
        if (!class36.field698) {
            return;
        }
        class36.field698 = false;
        class165.field2909 = null;
        class125.field2180 = null;
        if (arg0 != -11692) {
            field2042 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
    public static void method845(byte arg0) {
        field2044 = null;
        int var1 = -19 % ((-arg0 - 14) / 60);
        field2051 = null;
        field2042 = null;
        field2047 = null;
        field2048 = null;
        field2045 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lpk;I)V")
    public static final void method846(class99 arg0, int arg1) {
        class207.field3681 = arg0;
        if (arg1 != -2) {
            method845((byte) -91);
        }
        field2049++;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V")
    public class118(int arg0, int arg1) {
        this.field2053 = arg0;
        this.field2054 = arg1;
    }
}
