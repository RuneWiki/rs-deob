import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class476 {

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Lnp;")
    private class85 field6962 = new class85();

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lpi;")
    public static class340 field6952 = new class340(97, 15);

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Loi;")
    public static class169 field6961 = new class169("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lnp;")
    private class85 field6963;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)Lnp;")
    public final class85 method2856(boolean arg0) {
        field6959++;
        class85 var2 = this.field6963;
        if (this.field6962 == var2) {
            this.field6963 = null;
            return null;
        } else {
            this.field6963 = var2.field1151;
            return arg0 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V")
    public static void method2857(boolean arg0) {
        field6952 = null;
        if (arg0) {
            field6961 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILnp;)V")
    public final void method2858(int arg0, class85 arg1) {
        field6957++;
        if (arg1.field1146 != null) {
            arg1.method540((byte) 112);
        }
        arg1.field1151 = this.field6962;
        arg1.field1146 = this.field6962.field1146;
        arg1.field1146.field1151 = arg1;
        if (arg0 == 15) {
            arg1.field1151.field1146 = arg1;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class270.method1664(true, arg4, arg1, arg2, arg0, arg6, arg3, arg7, arg8, arg5);
        field6958++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)Lnp;")
    public final class85 method2860(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field6955++;
        class85 var2 = this.field6962.field1151;
        if (this.field6962 == var2) {
            this.field6963 = null;
            return null;
        } else {
            this.field6963 = var2.field1151;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Lnp;")
    public final class85 method2861(byte arg0) {
        field6956++;
        class85 var2 = this.field6962.field1151;
        if (this.field6962 == var2) {
            return null;
        }
        var2.method540((byte) -73);
        if (arg0 != -124) {
            this.method2860(29);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public final void method2862(int arg0) {
        field6960++;
        while (true) {
            class85 var2 = this.field6962.field1151;
            if (this.field6962 == var2) {
                this.field6963 = null;
                if (arg0 == 97) {
                    return;
                } else {
                    field6961 = null;
                    return;
                }
            }
            var2.method540((byte) -87);
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)I")
    public final int method2863(int arg0) {
        field6954++;
        int var2 = 0;
        class85 var3 = this.field6962.field1151;
        if (arg0 != 20168) {
            return -25;
        }
        while (this.field6962 != var3) {
            var3 = var3.field1151;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class476() {
        this.field6962.field1146 = this.field6962;
        this.field6962.field1151 = this.field6962;
    }
}
