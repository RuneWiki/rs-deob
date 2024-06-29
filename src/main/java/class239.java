import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class239 {

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Lgv;")
    private class90 field3408 = new class90();

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field3403 = 52;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "Lgv;")
    private class90 field3413;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Lgv;", line = 3)
    public final class90 method1591(byte arg0) {
        field3405++;
        if (arg0 <= 61) {
            return null;
        }
        class90 var2 = this.field3408.field1364;
        if (this.field3408 == var2) {
            return null;
        } else {
            var2.method731((byte) 39);
            return var2;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIZ)I", line = 22)
    public static final int method1592(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            return 3;
        }
        field3402++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)Z", line = 46)
    public final boolean method1593(byte arg0) {
        field3411++;
        if (arg0 == 36) {
            return this.field3408.field1364 == this.field3408;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(B)Lgv;", line = 63)
    public final class90 method1594(byte arg0) {
        field3412++;
        if (arg0 != 31) {
            this.method1597((byte) 75);
        }
        class90 var2 = this.field3408.field1366;
        if (this.field3408 == var2) {
            this.field3413 = null;
            return null;
        } else {
            this.field3413 = var2.field1366;
            return var2;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)V", line = 84)
    public static final void method1595(byte arg0, int arg1) {
        class79.field1112 = new int[arg1];
        int var2 = -44 % (arg0 / 54);
        class737.field10175 = new int[arg1];
        class562.field7972 = new int[arg1];
        class379.field5164 = new int[arg1];
        field3414++;
        class58.field812 = new int[arg1];
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)I", line = 100)
    public final int method1596(int arg0) {
        field3415++;
        int var2 = -42 / ((arg0 + 69) / 39);
        int var3 = 0;
        for (class90 var4 = this.field3408.field1364; var4 != this.field3408; var4 = var4.field1364) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(B)Lgv;", line = 121)
    public final class90 method1597(byte arg0) {
        field3407++;
        class90 var2 = this.field3408.field1364;
        if (this.field3408 == var2) {
            this.field3413 = null;
            return null;
        } else {
            int var3 = 107 / ((5 - arg0) / 56);
            this.field3413 = var2.field1364;
            return var2;
        }
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(B)V", line = 145)
    public final void method1598(byte arg0) {
        if (arg0 != 47) {
            method1595((byte) 118, 32);
        }
        while (true) {
            class90 var2 = this.field3408.field1364;
            if (this.field3408 == var2) {
                field3404++;
                this.field3413 = null;
                return;
            }
            var2.method731((byte) 39);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILjava/lang/String;ZI)V", line = 166)
    public static final void method1599(int arg0, String arg1, boolean arg2, int arg3) {
        field3409++;
        class644.method3582(false);
        class715.method3977(1);
        class33.method198(true);
        if (arg0 != -3) {
            field3403 = -126;
        }
        class337.method2106(arg2, arg3, -126, arg1);
        class639.method3562((byte) -66);
        class223.method1519(class95.field1472, 8735);
        class366.method2234(arg0 ^ 0xFFFFA834, class95.field1472);
        class654.method3676(true, class95.field1472, class346.field4664);
        class506.method2887(0);
        class659.method3704((byte) -64, class70.field1037);
        class622.method3506(arg0 + 128);
        class463.method2677(118);
        if (class753.field10398 == 3) {
            class139.method1142(2, 4);
        } else if (class753.field10398 == 7) {
            class139.method1142(2, 8);
        } else if (class753.field10398 == 10) {
            class139.method1142(~arg0, 11);
        } else if (class753.field10398 == 1 || class753.field10398 == 2) {
            class393.method2381(3);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lgv;I)V", line = 211)
    public final void method1600(class90 arg0, int arg1) {
        field3410++;
        if (arg0.field1366 != null) {
            arg0.method731((byte) 39);
        }
        if (arg1 != -3) {
            this.method1596(-78);
        }
        arg0.field1364 = this.field3408;
        arg0.field1366 = this.field3408.field1366;
        arg0.field1366.field1364 = arg0;
        arg0.field1364.field1366 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 258)
    public class239() {
        this.field3408.field1364 = this.field3408;
        this.field3408.field1366 = this.field3408;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)Lgv;", line = 236)
    public final class90 method1601(int arg0) {
        field3406++;
        class90 var2 = this.field3413;
        if (this.field3408 == var2) {
            this.field3413 = null;
            return null;
        } else {
            this.field3413 = var2.field1364;
            return arg0 <= 70 ? null : var2;
        }
    }
}
