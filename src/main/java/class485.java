import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class485 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lfa;")
    private class156 field7123 = new class156(64);

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public int field7132 = 0;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Lfs;")
    private class387 field7128;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field7126;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lbg;")
    public static class324 field7131;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Z")
    public static boolean field7133;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field7134;

    static {
        new class331("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field7131 = new class324(37, 8);
        field7133 = false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2916(int arg0) {
        class144.field2023 = 0;
        if (arg0 != 4) {
            field7131 = null;
        }
        class98.field1317 = -1;
        field7129++;
        class74.field1012 = -1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 16)
    public final void method2917(byte arg0) {
        class156 var2 = this.field7123;
        synchronized (this.field7123) {
            this.field7123.method1105(false);
        }
        if (arg0 == -128) {
            field7130++;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lis;", line = 30)
    public final class345 method2918(int arg0, int arg1) {
        field7127++;
        class156 var3 = this.field7123;
        class345 var4;
        synchronized (this.field7123) {
            var4 = (class345) this.field7123.method1115((long) arg1, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7128.method2363(arg1, arg0, 104);
        class345 var6 = new class345();
        var6.field4779 = this;
        var6.field4795 = arg1;
        if (var5 != null) {
            var6.method2090(arg0 - 90, new class65(var5));
        }
        var6.method2086(false);
        class156 var7 = this.field7123;
        synchronized (this.field7123) {
            this.field7123.method1107(arg0 ^ 0x5, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 59)
    public final void method2919(int arg0) {
        class156 var2 = this.field7123;
        synchronized (this.field7123) {
            this.field7123.method1119(116);
        }
        if (arg0 != -1) {
            field7133 = true;
        }
        field7125++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V", line = 78)
    public final void method2920(int arg0, boolean arg1) {
        class156 var3 = this.field7123;
        synchronized (this.field7123) {
            this.field7123.method1116(arg0, -50);
            if (arg1) {
                this.method2919(57);
            }
        }
        field7124++;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljk;ILfs;)V", line = 122)
    public class485(class446 arg0, int arg1, class387 arg2) {
        this.field7128 = arg2;
        this.field7126 = this.field7128.method2367(4, 28724);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 106)
    public static void method2921(int arg0) {
        field7131 = null;
        if (arg0 != 4) {
            field7131 = null;
        }
    }
}
