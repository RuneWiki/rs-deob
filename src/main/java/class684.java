import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class684 implements class121 {

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public int field9694;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "Lbca;")
    public static class604 field9693 = new class604("", 17);

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZII)I")
    public static final int method3811(int arg0, boolean arg1, int arg2, int arg3) {
        field9695++;
        if (arg0 != -29126) {
            return -86;
        }
        class472 var4 = class236.method1367(arg2, true, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= 0 && var4.field6587.length > arg3) {
            return var4.field6587[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)Lqv;")
    public final class406 method484(int arg0) {
        if (arg0 == 16236) {
            field9697++;
            return class288.field3700;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I)V")
    public class684(int arg0) {
        this.field9694 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZJ)V")
    public static final void method3812(boolean arg0, long arg1) {
        if (arg0) {
            method3811(90, false, -16, 10);
        }
        field9696++;
        if (class97.field1074 != null) {
            if (class5.field41 == 1 || class5.field41 == 5) {
                class35.method190(82, arg1);
            } else if (class5.field41 == 4) {
                class504.method2899(92, arg1);
            }
        }
        class526.method2992((long) class469.field6549, class453.field6284, 64);
        if (class397.field5320 != -1) {
            class511.method2929(class397.field5320, 255);
        }
        for (int var3 = 0; var3 < class675.field9572; var3++) {
            if (class406.field5409[var3]) {
                class663.field9429[var3] = true;
            }
            class576.field8221[var3] = class406.field5409[var3];
            class406.field5409[var3] = false;
        }
        class390.field5213 = class469.field6549;
        if (class453.field6284.method315()) {
            class234.field2983 = true;
        }
        if (class397.field5320 != -1) {
            class675.field9572 = 0;
            class607.method3383((byte) -75);
        }
        class453.field6284.method378();
        class397.method2171(2, class453.field6284);
        int var4 = class145.method793(!arg0);
        if (var4 == -1) {
            var4 = class378.field4915;
        }
        if (var4 == -1) {
            var4 = class191.field2305;
        }
        class625.method3495(var4, -1);
        class285.method1621(class377.field4914.field4638, (byte) 113, class377.field4914.field4647, class233.field2978, class377.field4914.field4641);
        class233.field2978 = 0;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public static void method3813(int arg0) {
        field9693 = null;
        if (arg0 < 69) {
            method3811(-92, true, 34, -71);
        }
    }
}
