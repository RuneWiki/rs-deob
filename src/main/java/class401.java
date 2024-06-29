import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class401 extends class396 {

    @OriginalMember(owner = "client!im", name = "y", descriptor = "I")
    private int field5942 = -1;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    private int field5944 = -1;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    public int field5948;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    public static int field5943 = -1;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "Lgk;")
    public static class331 field5945;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lfd;IIZ[[BI)V")
    public class401(class365 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5948 = arg2;
        super.field5800.method2188((byte) 78, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field5804, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2421(80, true);
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)V")
    public static void method2465(int arg0) {
        field5945 = null;
        if (arg0 != -1) {
            method2465(-34);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIBI)V")
    public final void method2466(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field5941;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg4, arg2, super.field5811, arg1);
        this.field5942 = arg4;
        int var6 = -45 / ((arg3 - 59) / 59);
        this.field5944 = arg0;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lfd;IIZ[[I)V")
    public class401(class365 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field5948 = arg2;
        super.field5800.method2188((byte) 78, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field5804, arg2, arg2, 0, 32993, super.field5800.field5411, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class269.method1729(32993, arg4[var7], super.field5804, arg2, arg2, super.field5800.field5411, var7 + 34069, 17054);
            }
        }
        this.method2421(94, true);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lfd;II)V")
    public class401(class365 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field5948 = arg2;
        super.field5800.method2188((byte) 78, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field5804, arg2, arg2, 0, class454.method2741(super.field5804, 13519), 5121, (byte[]) null, 0);
        }
        this.method2421(104, true);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public final void method1628(int arg0) {
        if (arg0 < 121) {
            this.method1628(-44);
        }
        ++field5946;
        OpenGL.glFramebufferTexture2DEXT(this.field5944, this.field5942, 3553, 0, 0);
        this.field5942 = -1;
        this.field5944 = -1;
    }

    static {
        new class331("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field5947 = 100;
        field5945 = new class331("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");
        field5950 = 0;
        field5949 = 0;
    }
}
