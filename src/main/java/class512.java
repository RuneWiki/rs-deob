import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class512 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
    public static int[] field7597 = new int[13];

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field7600 = 0;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field7601 = 2;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Lcm;")
    public static class449 field7604 = new class449(32, 7);

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lns;")
    public static class438 field7606;

    @OriginalMember(owner = "client!si", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7598++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILqa;IIIB)Lc;")
    public static final class201 method3048(int arg0, int arg1, class496 arg2, int arg3, int arg4, int arg5, byte arg6) {
        field7602++;
        long var7 = (long) arg1;
        class201 var9 = (class201) class15.field250.method1013(var7, (byte) -106);
        short var10 = 2055;
        if (var9 == null) {
            class192 var11 = class143.method956(arg1, class274.field3819, 0, 22953);
            if (var11 == null) {
                return null;
            }
            if (var11.field2694 < 13) {
                var11.method1348(true, 0);
            }
            var9 = arg2.method1076(var11, var10, class156.field2262, 64, 768);
            class15.field250.method1012(-125, var7, var9);
        }
        class201 var12 = var9.method292((byte) 2, var10, true);
        if (arg4 != 0) {
            var12.method290(arg4);
        }
        if (arg3 != 0) {
            var12.method293(arg3);
        }
        if (arg5 != 0) {
            var12.method287(arg5);
        }
        if (arg0 != 0) {
            var12.method307(0, arg0, 0);
        }
        if (arg6 < 123) {
            field7601 = -116;
        }
        return var12;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method3049(byte arg0) {
        if (arg0 != -105) {
            method3048(-47, 78, null, -96, -92, 7, (byte) 32);
        }
        field7597 = null;
        field7604 = null;
        field7606 = null;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(II)V")
    public class512(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ltl;I)V")
    public static final void method3050(class91 arg0, int arg1) {
        field7603++;
        if ((arg0.field1277.length - arg0.field1292) < 1) {
            return;
        }
        int var2 = arg0.method618((byte) 100);
        if (var2 < 0 || var2 > 1 || arg0.field1277.length - arg0.field1292 < arg1) {
            return;
        }
        int var3 = arg0.method631(10494);
        if (var3 * 6 != arg0.field1277.length - arg0.field1292) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg0.field1292 >= arg0.field1277.length) {
                            return;
                        }
                        var4 = arg0.method631(10494);
                        var5 = arg0.method626((byte) 100);
                    } while (class129.field1815.length <= var4);
                } while (!class397.field6038[var4]);
            } while (class34.field540.method2488(var4, (byte) 89).field7613 == '1' && (var5 < -1 || var5 > 1));
            class129.field1815[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lmb;")
    public static final class285 method3051(int arg0, int arg1) {
        field7605++;
        class285 var2 = (class285) class325.field4993.method1013((long) arg1, (byte) -106);
        if (var2 != null) {
            return var2;
        } else if (arg0 <= 102) {
            return null;
        } else {
            byte[] var3 = class85.field1161.method2650(arg1, -80, 1);
            class285 var4 = new class285();
            var4.field4246 = arg1;
            if (var3 != null) {
                var4.method1855(-12565, new class91(var3));
            }
            var4.method1856(-9);
            if (var4.field4236 == 2 && class480.field7010.method943((long) arg1, -1) == null) {
                class480.field7010.method940((long) arg1, -85, new class74(class69.field963));
                class119.field1663[class69.field963++] = var4;
            }
            class325.field4993.method1012(-64, (long) arg1, var4);
            return var4;
        }
    }
}
