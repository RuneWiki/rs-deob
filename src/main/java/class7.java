import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class7 {

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "Llf;")
    public class508 field64 = new class508();

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "Z")
    public static boolean field60 = false;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Ldn;")
    public static class201 field59;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "Llf;")
    private class508 field67;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)Z")
    public final boolean method38(byte arg0) {
        field65++;
        if (arg0 == 63) {
            return this.field64.field7454 == this.field64;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)Llf;")
    public final class508 method39(boolean arg0) {
        field71++;
        class508 var2 = this.field64.field7455;
        if (!arg0) {
            this.field64 = null;
        }
        if (this.field64 == var2) {
            this.field67 = null;
            return null;
        } else {
            this.field67 = var2.field7455;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)I")
    public static final int method40(int arg0, byte arg1) {
        field63++;
        return arg1 >= -69 ? -103 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILlf;)V")
    public final void method41(int arg0, class508 arg1) {
        field68++;
        if (arg1.field7455 != null) {
            arg1.method3021(arg0 ^ 0x2F3AD718);
        }
        arg1.field7455 = this.field64;
        arg1.field7454 = this.field64.field7454;
        if (arg0 != -792385400) {
            method48(-109);
        }
        arg1.field7455.field7454 = arg1;
        arg1.field7454.field7455 = arg1;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Llf;I)V")
    public final void method42(class508 arg0, int arg1) {
        field66++;
        if (arg0.field7455 != null) {
            arg0.method3021(121);
        }
        if (arg1 != 0) {
            method51(-25, (byte) 23);
        }
        arg0.field7454 = this.field64;
        arg0.field7455 = this.field64.field7455;
        arg0.field7455.field7454 = arg0;
        arg0.field7454.field7455 = arg0;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ltu;I)V")
    public final void method43(class7 arg0, int arg1) {
        this.method44(arg0, this.field64.field7454, 0);
        field72++;
        if (arg1 <= 2) {
            this.field67 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ltu;Llf;I)V")
    private final void method44(class7 arg0, class508 arg1, int arg2) {
        field73++;
        class508 var4 = this.field64.field7455;
        this.field64.field7455 = arg1.field7455;
        arg1.field7455.field7454 = this.field64;
        if (this.field64 != arg1) {
            arg1.field7455 = arg0.field64.field7455;
            arg1.field7455.field7454 = arg1;
            var4.field7454 = arg0.field64;
            arg0.field64.field7455 = var4;
        }
        if (arg2 != 0) {
            this.field67 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        field56++;
        int var2 = 0;
        for (class508 var3 = this.field64.field7454; var3 != this.field64; var3 = var3.field7454) {
            var2++;
        }
        if (arg0 != -15978) {
            this.method39(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)Llf;")
    public final class508 method46(byte arg0) {
        if (arg0 <= 1) {
            return null;
        }
        field58++;
        class508 var2 = this.field67;
        if (this.field64 == var2) {
            this.field67 = null;
            return null;
        } else {
            this.field67 = var2.field7454;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
    public final void method47(int arg0) {
        field70++;
        while (true) {
            class508 var2 = this.field64.field7454;
            if (this.field64 == var2) {
                if (arg0 == 0) {
                    this.field67 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method3021(arg0 ^ 0x79);
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
    public static void method48(int arg0) {
        field59 = null;
        if (arg0 != 28765) {
            method40(34, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)Llf;")
    public final class508 method49(int arg0) {
        field57++;
        class508 var2 = this.field64.field7454;
        int var3 = -55 / ((-arg0 - 58) / 43);
        if (this.field64 == var2) {
            this.field67 = null;
            return null;
        } else {
            this.field67 = var2.field7454;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
    public class7() {
        this.field64.field7454 = this.field64;
        this.field64.field7455 = this.field64;
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)Llf;")
    public final class508 method50(byte arg0) {
        field61++;
        class508 var2 = this.field67;
        if (arg0 <= 110) {
            this.method43(null, -42);
        }
        if (this.field64 == var2) {
            this.field67 = null;
            return null;
        } else {
            this.field67 = var2.field7455;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(IB)V")
    public static final void method51(int arg0, byte arg1) {
        field69++;
        if (arg1 != -1) {
            method40(-48, (byte) -85);
        }
        class436 var2 = class459.method2712(2, arg0, -1759243680);
        var2.method2567(arg1 ^ 0xFFFFC172);
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(B)Llf;")
    public final class508 method52(byte arg0) {
        if (arg0 >= -95) {
            field59 = null;
        }
        field62++;
        class508 var2 = this.field64.field7454;
        if (this.field64 == var2) {
            return null;
        } else {
            var2.method3021(106);
            return var2;
        }
    }
}
