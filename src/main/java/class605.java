import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class605 {

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lds;")
    public class65 field8547 = new class65();

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field8554 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Lds;")
    private class65 field8551;

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 212)
    public class605() {
        this.field8547.field1044 = this.field8547;
        this.field8547.field1042 = this.field8547;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Lds;", line = 21)
    public final class65 method3463(byte arg0) {
        if (arg0 != -50) {
            this.method3469((byte) 8);
        }
        field8545++;
        class65 var2 = this.field8547.field1044;
        if (this.field8547 == var2) {
            this.field8551 = null;
            return null;
        } else {
            this.field8551 = var2.field1044;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lds;Ltg;Z)V", line = 42)
    private final void method3464(class65 arg0, class605 arg1, boolean arg2) {
        field8559++;
        class65 var4 = this.field8547.field1042;
        this.field8547.field1042 = arg0.field1042;
        arg0.field1042.field1044 = this.field8547;
        if (!arg2 && this.field8547 != arg0) {
            arg0.field1042 = arg1.field8547.field1042;
            arg0.field1042.field1044 = arg0;
            arg1.field8547.field1042 = var4;
            var4.field1044 = arg1.field8547;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 65)
    public final void method3465(int arg0) {
        while (true) {
            class65 var2 = this.field8547.field1044;
            if (this.field8547 == var2) {
                if (arg0 != 0) {
                    field8554 = 38;
                }
                field8556++;
                this.field8551 = null;
                return;
            }
            var2.method636((byte) 97);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Lds;", line = 86)
    public final class65 method3466(int arg0) {
        field8553++;
        class65 var2 = this.field8547.field1044;
        if (arg0 != 0) {
            this.method3470(-54);
        }
        if (this.field8547 == var2) {
            return null;
        } else {
            var2.method636((byte) 97);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)I", line = 104)
    public final int method3467(int arg0) {
        field8548++;
        int var2 = 0;
        class65 var3 = this.field8547.field1044;
        while (this.field8547 != var3) {
            var3 = var3.field1044;
            var2++;
        }
        return arg0 == 25623 ? var2 : 9;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)Lds;", line = 130)
    public final class65 method3468(byte arg0) {
        field8558++;
        if (arg0 <= 20) {
            field8554 = -113;
        }
        class65 var2 = this.field8547.field1042;
        if (this.field8547 == var2) {
            this.field8551 = null;
            return null;
        } else {
            this.field8551 = var2.field1042;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)Lds;", line = 151)
    public final class65 method3469(byte arg0) {
        field8546++;
        if (arg0 != 107) {
            this.method3474(-109, null);
        }
        class65 var2 = this.field8551;
        if (this.field8547 == var2) {
            this.field8551 = null;
            return null;
        } else {
            this.field8551 = var2.field1044;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)Lds;", line = 176)
    public final class65 method3470(int arg0) {
        field8550++;
        if (arg0 != 0) {
            this.method3473(true);
        }
        class65 var2 = this.field8551;
        if (this.field8547 == var2) {
            this.field8551 = null;
            return null;
        } else {
            this.field8551 = var2.field1042;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILtg;)V", line = 202)
    public final void method3471(int arg0, class605 arg1) {
        field8557++;
        if (arg0 < -33) {
            this.method3464(this.field8547.field1044, arg1, false);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILds;)V", line = 221)
    public final void method3472(int arg0, class65 arg1) {
        field8552++;
        if (arg1.field1042 != null) {
            arg1.method636((byte) 97);
        }
        arg1.field1042 = this.field8547.field1042;
        arg1.field1044 = this.field8547;
        arg1.field1042.field1044 = arg1;
        if (arg0 <= 82) {
            this.method3471(-90, null);
        }
        arg1.field1044.field1042 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)Z", line = 239)
    public final boolean method3473(boolean arg0) {
        if (arg0) {
            this.method3466(-12);
        }
        field8555++;
        return this.field8547.field1044 == this.field8547;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(ILds;)V", line = 251)
    public final void method3474(int arg0, class65 arg1) {
        if (arg1.field1042 != null) {
            arg1.method636((byte) 97);
        }
        if (arg0 != 1807) {
            this.method3469((byte) -46);
        }
        field8549++;
        arg1.field1042 = this.field8547;
        arg1.field1044 = this.field8547.field1044;
        arg1.field1042.field1044 = arg1;
        arg1.field1044.field1042 = arg1;
    }
}
