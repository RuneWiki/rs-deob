import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class323 {

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Laq;")
    public class701 field4349 = new class701();

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "[I")
    public static int[] field4355 = new int[2];

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public static int field4356 = 0;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "Luf;")
    public static class380 field4357 = new class380(20);

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "Leba;")
    public static class550 field4358 = new class550(113, 2);

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field4359 = 0;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "[I")
    public static int[] field4360 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4362 = null;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "Leba;")
    public static class550 field4361 = new class550(116, 6);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "Laq;")
    private class701 field4354;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
    public final void method1874(boolean arg0) {
        field4347++;
        if (!arg0) {
            return;
        }
        while (true) {
            class701 var2 = this.field4349.field9865;
            if (this.field4349 == var2) {
                this.field4354 = null;
                return;
            }
            var2.method3940(-121);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)Laq;")
    public final class701 method1875(int arg0) {
        if (arg0 != 2) {
            return null;
        }
        field4351++;
        class701 var2 = this.field4349.field9865;
        if (this.field4349 == var2) {
            this.field4354 = null;
            return null;
        } else {
            this.field4354 = var2.field9865;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ltc;IIII)V")
    public static final void method1876(class600 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4353++;
        class502 var5 = (class502) class552.field7525.method2506(68);
        if (arg1 != -257174775) {
            return;
        }
        while (var5 != null) {
            if (var5.field6898 == arg3 && (arg4 << 9) == var5.field6919 && (arg2 << 9) == var5.field6907 && var5.field6905.field8345 == arg0.field8345) {
                if (var5.field6915 != null) {
                    class126.field1759.method1345(var5.field6915);
                    var5.field6915 = null;
                }
                if (var5.field6893 != null) {
                    class126.field1759.method1345(var5.field6893);
                    var5.field6893 = null;
                }
                var5.method242(true);
                return;
            }
            var5 = (class502) class552.field7525.method2505(-124);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLaq;)V")
    public final void method1877(byte arg0, class701 arg1) {
        field4352++;
        if (arg1.field9869 != null) {
            arg1.method3940(-127);
        }
        arg1.field9869 = this.field4349.field9869;
        arg1.field9865 = this.field4349;
        arg1.field9869.field9865 = arg1;
        if (arg0 != -18) {
            method1879(-47);
        }
        arg1.field9865.field9869 = arg1;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(Z)Laq;")
    public final class701 method1878(boolean arg0) {
        field4348++;
        if (!arg0) {
            this.method1875(-76);
        }
        class701 var2 = this.field4354;
        if (this.field4349 == var2) {
            this.field4354 = null;
            return null;
        } else {
            this.field4354 = var2.field9865;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
    public class323() {
        this.field4349.field9869 = this.field4349;
        this.field4349.field9865 = this.field4349;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
    public static void method1879(int arg0) {
        field4358 = null;
        if (arg0 != 113) {
            field4360 = null;
        }
        field4361 = null;
        field4355 = null;
        field4360 = null;
        field4357 = null;
        field4362 = null;
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)I")
    public final int method1880(int arg0) {
        field4350++;
        int var2 = 0;
        class701 var3 = this.field4349.field9865;
        if (arg0 != 39) {
            this.method1874(true);
        }
        while (this.field4349 != var3) {
            var2++;
            var3 = var3.field9865;
        }
        return var2;
    }
}
