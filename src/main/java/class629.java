import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class629 extends class228 {

    @OriginalMember(owner = "client!au", name = "D", descriptor = "I")
    private int field9240 = -1;

    @OriginalMember(owner = "client!au", name = "G", descriptor = "I")
    private int field9243 = -1;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    public int field9238;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    public int field9239;

    @OriginalMember(owner = "client!au", name = "L", descriptor = "I")
    public int field9248;

    @OriginalMember(owner = "client!au", name = "H", descriptor = "S")
    public static short field9244;

    @OriginalMember(owner = "client!au", name = "K", descriptor = "Lh;")
    public static class572 field9247;

    @OriginalMember(owner = "client!au", name = "M", descriptor = "Lh;")
    public static class572 field9249;

    @OriginalMember(owner = "client!au", name = "E", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!au", name = "I", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!au", name = "J", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!au", name = "N", descriptor = "I")
    public static int field9250;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "Ltq;")
    public static class537 field9242;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIIII)V")
    public final void method3667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field9246;
        super.field3325.method3152(arg0 ^ -27874, this);
        if (arg0 == 27872) {
            OpenGL.glCopyTexSubImage3D(super.field3333, 0, arg5, arg4, arg3, arg1, arg6, arg2, arg7);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(CZ)Z")
    public static final boolean method3668(char arg0, boolean arg1) {
        ++field9241;
        if (!arg1) {
            return true;
        } else {
            return arg0 == 160 || ~arg0 == -33 || arg0 == '_' || ~arg0 == -46;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public final void method642(int arg0) {
        ++field9250;
        if (arg0 <= -80) {
            OpenGL.glFramebufferTexture3DEXT(this.field9240, this.field9243, super.field3333, 0, 0, 0);
            this.field9240 = -1;
            this.field9243 = -1;
        }
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "(B)V")
    public static void method3669(byte arg0) {
        field9242 = null;
        field9249 = null;
        field9247 = null;
        if (arg0 > -127) {
            field9244 = 75;
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lte;IIII)V")
    public class629(class527 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field9238 = arg3;
        this.field9239 = arg4;
        this.field9248 = arg2;
        super.field3325.method3152(-2, this);
        OpenGL.glTexImage3Dub(super.field3333, 0, super.field3319, this.field9248, this.field9238, this.field9239, 0, class372.method2220(120, super.field3319), 5121, (byte[]) null, 0);
        this.method1460(true, -5286);
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lte;IIII[BI)V")
    public class629(class527 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field9238 = arg3;
        this.field9248 = arg2;
        this.field9239 = arg4;
        super.field3325.method3152(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3333, 0, super.field3319, this.field9248, this.field9238, this.field9239, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1460(true, -5286);
    }

    static {
        new class572("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field9244 = 320;
        field9247 = new class572("glow1:", "leuchten1:", "brillant1:", "brilho1:");
        field9249 = new class572("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
    }
}
