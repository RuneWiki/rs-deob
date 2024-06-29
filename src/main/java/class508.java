import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class508 extends class532 {

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public int field7575;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public int field7581;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "F")
    public float field7580;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "F")
    public float field7578;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "Z")
    public boolean field7573;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "Lss;")
    public static class213 field7574 = new class213("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Lbi;")
    public static class104 field7579 = new class104(61, 0);

    @OriginalMember(owner = "client!me", name = "X", descriptor = "Lss;")
    public static class213 field7582 = new class213("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "[I")
    public static int[] field7584 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public static void method3077(int arg0) {
        field7582 = null;
        field7584 = null;
        field7574 = null;
        if (arg0 != 1) {
            method3077(-86);
        }
        field7579 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lna;IIIIZ[BI)V")
    public class508(class211 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field7575 = arg3;
        this.field7581 = arg4;
        if (super.field6455 != 34037) {
            this.field7578 = this.field7580 = 1.0F;
            this.field7573 = true;
        } else {
            this.field7578 = (float) arg3;
            this.field7573 = false;
            this.field7580 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lna;IIIII[BI)V")
    public class508(class211 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field7575 = arg2;
        this.field7581 = arg3;
        this.method3164(0, arg2, 0, arg7, arg6, true, arg3, 0, 0, true);
        this.field7573 = false;
        this.field7580 = (float) arg3 / (float) arg5;
        this.field7578 = (float) arg2 / (float) arg4;
        this.method3160(false, (byte) 50, false);
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    public static final void method3078(byte arg0) {
        ++field7577;
        int var1 = -4 / ((arg0 - -61) / 57);
        class491.field7427.method2189(false);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lna;IIIIIIZ)V")
    public class508(class211 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field7581 = arg4;
        this.field7573 = false;
        this.field7578 = (float) arg3 / (float) arg5;
        this.field7580 = (float) arg4 / (float) arg6;
        this.field7575 = arg3;
        this.method3160(false, (byte) 50, false);
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)Z")
    public static final boolean method3079(int arg0) {
        if (arg0 != 34037) {
            method3079(-97);
        }
        ++field7572;
        if (class304.field4778) {
            try {
                if ((Boolean) class200.method1370(-114, class339.field5294.field27, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lna;IIIIIZ)V")
    public class508(class211 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field6455 == 34037) {
            this.field7578 = (float) arg4;
            this.field7580 = (float) arg5;
            this.field7573 = false;
        } else {
            this.field7573 = true;
            this.field7578 = this.field7580 = 1.0F;
        }
        this.field7581 = arg5;
        this.field7575 = arg4;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lna;IIII[I)V")
    public class508(class211 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field7575 = arg1;
        this.field7581 = arg2;
        this.method3163(arg2, 0, true, arg5, 0, 0, arg1, 0, 0);
        this.field7580 = (float) arg2 / (float) arg4;
        this.field7578 = (float) arg1 / (float) arg3;
        this.field7573 = false;
        this.method3160(false, (byte) 50, false);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILjava/net/Socket;)Lgl;")
    public static final class440 method3080(int arg0, int arg1, Socket arg2) throws IOException {
        if (arg0 != 34037) {
            return null;
        } else {
            ++field7583;
            return new class281(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lna;IIIZ[I)V")
    public class508(class211 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field7581 = arg3;
        if (super.field6455 == 34037) {
            this.field7573 = false;
            this.field7580 = (float) arg3;
            this.field7578 = (float) arg2;
        } else {
            this.field7573 = true;
            this.field7578 = this.field7580 = 1.0F;
        }
        this.field7575 = arg2;
    }
}
