import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class395 {

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lrp;")
    private class288 field5760 = new class288(64);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Llt;")
    private class458 field5756;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public int field5759;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Z")
    public static boolean field5764 = true;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field5762 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Llt;")
    public static class458 field5765;

    static {
        new class423("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        new class423("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZIBILlt;)V", line = 10)
    public static final void method2341(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class458 arg6) {
        class107.field1871 = arg6;
        class322.field4842 = 1;
        if (arg4 > -64) {
            method2343((byte) -63);
        }
        class93.field1656 = arg2;
        class15.field207 = arg5;
        class91.field1639 = arg1;
        class275.field4169 = arg3;
        class232.field3525 = arg0;
        field5755++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;I)Lts;", line = 32)
    public static final class357 method2342(Component arg0, int arg1) {
        if (arg1 <= 68) {
            field5764 = true;
        }
        field5757++;
        return new class272(arg0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 45)
    public static void method2343(byte arg0) {
        field5765 = null;
        if (arg0 != -23) {
            method2342(null, 63);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lcm;ILlt;)V", line = 109)
    public class395(class491 arg0, int arg1, class458 arg2) {
        this.field5756 = arg2;
        this.field5759 = this.field5756.method2726((byte) 113, 19);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Z", line = 62)
    public static final boolean method2344(int arg0, int arg1) {
        field5763++;
        if (arg0 != -14262) {
            field5764 = false;
        }
        if (arg1 == 17 || arg1 == 4 || arg1 == 9 || arg1 == 60 || arg1 == 51) {
            return true;
        } else {
            return arg1 == 57 || arg1 == 1008;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)Lkl;", line = 81)
    public final class51 method2345(boolean arg0, int arg1) {
        field5758++;
        if (!arg0) {
            return null;
        }
        class288 var3 = this.field5760;
        class51 var4;
        synchronized (this.field5760) {
            var4 = (class51) this.field5760.method1752(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5756.method2715(arg1, 19, false);
        class51 var6 = new class51();
        if (var5 != null) {
            var6.method360(new class40(var5), (byte) -87);
        }
        class288 var7 = this.field5760;
        synchronized (this.field5760) {
            this.field5760.method1758(1, var6, (long) arg1);
            return var6;
        }
    }
}
