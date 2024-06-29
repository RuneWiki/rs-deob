import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class589 {

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "Lpm;")
    private class501 field8741 = new class501();

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "[I")
    public static int[] field8735 = new int[16384];

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "[I")
    public static int[] field8742 = new int[16384];

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "Lpm;")
    private class501 field8744;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "Lpn;")
    public static class635 field8745;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field8742[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field8735[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        new class572("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method3497(boolean arg0) {
        field8740++;
        class103.field1484 = 0;
        class174.field2677.method122((byte) 14);
        class174.field2677.method131(class389.field5376, 0);
        if (arg0) {
            method3497(false);
        }
        class103.field1484++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILgw;)Lpca;", line = 18)
    public static final class611 method3498(int arg0, class148 arg1) {
        if (arg0 != 16384) {
            method3502((byte) 14);
        }
        field8743++;
        return new class611(arg1.method1047(arg0 ^ 0x4000), arg1.method1047(0), arg1.method1047(0), arg1.method1047(arg0 ^ 0x4000), arg1.method1047(0), arg1.method1047(0), arg1.method1047(arg0 - 16384), arg1.method1047(0), arg1.method1028((byte) 123), arg1.method1032((byte) -33));
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)I", line = 35)
    public final int method3499(byte arg0) {
        field8732++;
        int var2 = 0;
        int var3 = -59 % ((68 - arg0) / 57);
        for (class501 var4 = this.field8741.field7110; var4 != this.field8741; var4 = var4.field7110) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lpm;Z)V", line = 56)
    public final void method3500(class501 arg0, boolean arg1) {
        field8737++;
        if (arg1) {
            this.method3506(-48);
        }
        if (arg0.field7112 != null) {
            arg0.method2987(-1);
        }
        arg0.field7112 = this.field8741.field7112;
        arg0.field7110 = this.field8741;
        arg0.field7112.field7110 = arg0;
        arg0.field7110.field7112 = arg0;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)Lpm;", line = 75)
    public final class501 method3501(byte arg0) {
        field8738++;
        class501 var2 = this.field8744;
        if (this.field8741 == var2) {
            this.field8744 = null;
            return null;
        }
        this.field8744 = var2.field7110;
        if (arg0 <= 6) {
            this.method3504((byte) -87);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V", line = 97)
    public static void method3502(byte arg0) {
        field8745 = null;
        if (arg0 <= 99) {
            field8742 = null;
        }
        field8742 = null;
        field8735 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIB)Z", line = 113)
    public static final boolean method3503(int arg0, int arg1, byte arg2) {
        field8736++;
        if (arg2 == -19) {
            return (arg0 & 0x20) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(B)V", line = 125)
    public final void method3504(byte arg0) {
        field8733++;
        if (arg0 < 69) {
            this.field8744 = null;
        }
        while (true) {
            class501 var2 = this.field8741.field7110;
            if (this.field8741 == var2) {
                this.field8744 = null;
                return;
            }
            var2.method2987(-1);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)Lpm;", line = 147)
    public final class501 method3505(int arg0) {
        field8739++;
        class501 var2 = this.field8741.field7110;
        int var3 = -82 / ((arg0 - 32) / 36);
        if (this.field8741 == var2) {
            this.field8744 = null;
            return null;
        } else {
            this.field8744 = var2.field7110;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)Lpm;", line = 167)
    public final class501 method3506(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field8734++;
        class501 var2 = this.field8741.field7110;
        if (this.field8741 == var2) {
            return null;
        } else {
            var2.method2987(-1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V", line = 200)
    public class589() {
        this.field8741.field7110 = this.field8741;
        this.field8741.field7112 = this.field8741;
    }
}
