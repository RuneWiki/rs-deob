import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class461 extends class303 implements class323 {

    @OriginalMember(owner = "client!et", name = "I", descriptor = "Lrr;")
    public class303 field6443;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "Loi;")
    public static class169 field6444;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "Loi;")
    public static class169 field6447;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "Z")
    public static boolean field6449;

    @OriginalMember(owner = "client!et", name = "P", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!et", name = "B", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!et", name = "C", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!et", name = "D", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!et", name = "E", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!et", name = "F", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!et", name = "N", descriptor = "Ljava/awt/Font;")
    public static Font field6448;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
    public final int method414(int arg0) {
        field6440++;
        return arg0 == 17350 ? 0 : 69;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lqa;I)V")
    public final void method416(class129 arg0, int arg1) {
        field6434++;
        if (arg1 != 16663) {
            field6444 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "h", descriptor = "(I)V")
    public static void method2715(int arg0) {
        field6444 = null;
        field6448 = null;
        field6447 = null;
        if (arg0 != -4222) {
            method2715(116);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)I")
    public final int method1131(byte arg0) {
        field6446++;
        return arg0 <= 72 ? 97 : 0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)Z")
    public final boolean method417(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field6433++;
            return false;
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Lqa;B)Lvs;")
    public final class465 method172(class129 arg0, byte arg1) {
        int var3 = 46 % ((arg1 - 48) / 60);
        field6445++;
        return null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILqa;)Lc;")
    public final class507 method419(int arg0, int arg1, class129 arg2) {
        field6439++;
        if (arg1 != -32039) {
            this.method417(false);
        }
        return null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)I")
    public final int method413(int arg0) {
        field6436++;
        if (arg0 != -30502) {
            this.method172(null, (byte) -5);
        }
        return 0;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)I")
    public final int method415(int arg0) {
        field6441++;
        return arg0 == -15317 ? 0 : -89;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BLqa;)V")
    public final void method175(byte arg0, class129 arg1) {
        if (arg0 == 91) {
            field6435++;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IZILqa;)Z")
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        if (arg1) {
            return false;
        } else {
            field6437++;
            return false;
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIILrr;)V")
    public class461(int arg0, int arg1, int arg2, int arg3, int arg4, class303 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class312.method1860(arg0, false, arg1));
        this.field6443 = arg5;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
    public final void method418(int arg0) {
        if (arg0 != -14924) {
            this.method413(75);
        }
        field6442++;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lqa;B)V")
    public final void method421(class129 arg0, byte arg1) {
        if (arg1 <= -88) {
            field6438++;
        }
    }

    static {
        new class169("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field6444 = new class169("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");
        field6447 = new class169("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");
        field6449 = true;
        field6450 = 0;
    }
}
