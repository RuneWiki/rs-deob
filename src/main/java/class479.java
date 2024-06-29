import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class479 {

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field6878 = 0;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Lqfa;")
    public static class85 field6877 = new class85(4, -2);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Ltu;")
    public static class321 field6874;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public static void method2907(int arg0) {
        field6877 = null;
        if (arg0 != -16815) {
            method2907(75);
        }
        field6874 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZZI)V")
    public static final void method2908(boolean arg0, boolean arg1, int arg2) {
        field6876++;
        class430 var3 = class605.method3470((byte) -72, arg0, arg2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (!arg1) {
            field6880 = 116;
        }
        while (var3.field6215.length > var4) {
            var3.field6215[var4] = -1;
            var3.field6218[var4] = 0;
            var4++;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)Z")
    public static final boolean method2909(byte arg0) {
        field6879++;
        if (class251.method1681("jaclib", 334)) {
            if (arg0 != 109) {
                field6878 = 76;
            }
            return class251.method1681("hw3d", arg0 + 225);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V")
    public static final void method2910(byte arg0) {
        class92.method885();
        field6875++;
        for (int var1 = 0; var1 < 4; var1++) {
            class223.field3352[var1].method3480((byte) -103);
        }
        if (arg0 != 127) {
            field6880 = -126;
        }
        class136.method1116(-83);
        class432.method2627(255);
        System.gc();
        class623.field9017.method28();
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(B)V")
    public static final void method2911(byte arg0) {
        if (arg0 >= -36) {
            return;
        }
        for (int var1 = 0; var1 < class132.field2373; var1++) {
            class373 var2 = class286.field4264[var1];
            if (var2.field5549 == 3) {
                if (var2.field5548 == null) {
                    var2.field5552 = Integer.MIN_VALUE;
                } else {
                    class50.field1184.method2073(var2.field5548);
                }
            }
        }
        field6873++;
    }
}
