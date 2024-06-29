import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class367 {

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lpaa;")
    private class578 field4937 = new class578();

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Z")
    public static boolean field4945 = false;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "F")
    public static float field4942 = 0.0F;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lpaa;")
    private class578 field4947;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
    public static int[] field4940;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Lpaa;")
    public final class578 method2116(int arg0) {
        if (arg0 != 4) {
            this.field4937 = null;
        }
        field4935++;
        class578 var2 = this.field4937.field8163;
        if (this.field4937 == var2) {
            return null;
        } else {
            var2.method3301(101);
            return var2;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lpaa;")
    public final class578 method2117(int arg0) {
        field4934++;
        class578 var2 = this.field4947;
        if (this.field4937 == var2) {
            this.field4947 = null;
            return null;
        }
        if (arg0 != 100) {
            method2121((byte) -7, -92, 58, 18, -54);
        }
        this.field4947 = var2.field8163;
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static final void method2118(byte arg0) {
        field4951++;
        int var1 = 91 % ((-arg0 - 38) / 55);
        class639 var2 = (class639) class508.field6960.method1436(28964);
        boolean var3 = class396.field5579 != null || class614.field8574 > 0;
        if (var3) {
            class570.field8101 = 1;
        }
        if (field4945 && class353.field4698.method34(81, -16215) && class137.field1948 > 2) {
            if (var3) {
                class43.field518 = (class499) class588.field8265.field3151.field5621.field5621;
            } else {
                class624.method3467(var2.method1010(-113), var2.method1014(false), 0, (class499) class588.field8265.field3151.field5621.field5621);
            }
        } else if (var3) {
            class43.field518 = (class499) class588.field8265.field3151.field5621;
        } else {
            class624.method3467(var2.method1010(-96), var2.method1014(false), 0, (class499) class588.field8265.field3151.field5621);
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public final void method2119(int arg0) {
        if (arg0 != 0) {
            this.method2117(87);
        }
        while (true) {
            class578 var2 = this.field4937.field8163;
            if (this.field4937 == var2) {
                field4938++;
                this.field4947 = null;
                return;
            }
            var2.method3301(105);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2120(int arg0, boolean arg1) {
        field4949++;
        if (!arg1) {
            method2120(-17, false);
        }
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BIIII)V")
    public static final void method2121(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4941++;
        if (arg0 >= -30) {
            field4945 = false;
        }
        if (class543.field7378 == 1) {
            class521.field7092[class333.field4489 / 100].method3927(class107.field1494 - 8, class525.field7125 + -8);
        }
        if (class543.field7378 == 2) {
            class521.field7092[(class333.field4489 / 100) + 4].method3927(class107.field1494 - 8, class525.field7125 + -8);
        }
        class560.method3130((byte) 101);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lpaa;B)V")
    public final void method2122(class578 arg0, byte arg1) {
        int var3 = 95 / ((arg1 - 43) / 59);
        if (arg0.field8159 != null) {
            arg0.method3301(117);
        }
        field4950++;
        arg0.field8159 = this.field4937;
        arg0.field8163 = this.field4937.field8163;
        arg0.field8159.field8163 = arg0;
        arg0.field8163.field8159 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lpaa;I)V")
    public final void method2123(class578 arg0, int arg1) {
        if (arg0.field8159 != null) {
            arg0.method3301(arg1 + 98);
        }
        field4936++;
        if (arg1 != -1) {
            field4940 = null;
        }
        arg0.field8159 = this.field4937.field8159;
        arg0.field8163 = this.field4937;
        arg0.field8159.field8163 = arg0;
        arg0.field8163.field8159 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public static void method2124(int arg0) {
        field4940 = null;
        if (arg0 < 87) {
            field4945 = true;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public static final void method2125(byte arg0) {
        if (arg0 >= -43) {
            field4944 = 8;
        }
        field4943++;
        for (int var1 = 0; var1 < class698.field9912; var1++) {
            int var2 = class636.field8790[var1];
            class393 var3 = (class393) class299.field4071.method970((byte) 89, (long) var2);
            if (var3 != null) {
                class61 var4 = var3.field5552;
                class500.method2809(var4.field674.field8041, (byte) -81, var4);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)Lpaa;")
    public final class578 method2126(int arg0) {
        field4948++;
        class578 var2 = this.field4937.field8163;
        if (arg0 != -1) {
            this.method2126(-22);
        }
        if (this.field4937 == var2) {
            this.field4947 = null;
            return null;
        } else {
            this.field4947 = var2.field8163;
            return var2;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class367() {
        this.field4937.field8163 = this.field4937;
        this.field4937.field8159 = this.field4937;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)Lpaa;")
    public final class578 method2127(byte arg0) {
        if (arg0 != 83) {
            return null;
        }
        field4946++;
        class578 var2 = this.field4937.field8159;
        if (this.field4937 == var2) {
            return null;
        } else {
            var2.method3301(74);
            return var2;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)I")
    public final int method2128(boolean arg0) {
        field4939++;
        int var2 = 0;
        class578 var3 = this.field4937.field8163;
        while (this.field4937 != var3) {
            var3 = var3.field8163;
            var2++;
        }
        if (!arg0) {
            this.method2126(125);
        }
        return var2;
    }
}
