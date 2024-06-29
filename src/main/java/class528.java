import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class528 extends class443 implements class238 {

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    private int field7338 = -1;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    private int field7346 = -1;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "Ljj;")
    private class66 field7339;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    private int field7340;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public int field7344;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public int field7342;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    private int field7350;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    private int field7343;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "[I")
    public static int[] field7349 = new int[14];

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "[Lip;")
    public static class392[] field7352;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "Liu;")
    public static class517 field7351;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!cm", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2972(40);
        field7345++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
    public final void method1492(int arg0) {
        field7341++;
        OpenGL.glFramebufferRenderbufferEXT(this.field7346, this.field7338, 36161, 0);
        if (arg0 != -29948) {
            this.field7350 = -94;
        }
        this.field7346 = -1;
        this.field7338 = -1;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
    public final void method2972(int arg0) {
        if (this.field7350 > 0) {
            this.field7339.method554(this.field7350, this.field7343, 107);
            this.field7350 = 0;
        }
        if (arg0 > 30) {
            field7347++;
        }
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V")
    public static void method2973(int arg0) {
        if (arg0 == -16853) {
            field7351 = null;
            field7349 = null;
            field7352 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V")
    public final void method2974(int arg0, int arg1, int arg2) {
        int var4 = -22 % ((41 - arg1) / 35);
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field7350);
        field7348++;
        this.field7338 = arg2;
        this.field7346 = arg0;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ljj;III)V")
    public class528(class66 arg0, int arg1, int arg2, int arg3) {
        this.field7339 = arg0;
        this.field7340 = arg1;
        this.field7344 = arg2;
        this.field7342 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class14.field147, 0);
        this.field7350 = class14.field147[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7350);
        OpenGL.glRenderbufferStorageEXT(36161, this.field7340, this.field7344, this.field7342);
        this.field7343 = this.field7344 * this.field7342 * this.field7339.method646(this.field7340, false);
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ljj;IIII)V")
    public class528(class66 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7339 = arg0;
        this.field7342 = arg3;
        this.field7344 = arg2;
        this.field7340 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class14.field147, 0);
        this.field7350 = class14.field147[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7350);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field7340, this.field7344, this.field7342);
        this.field7343 = this.field7344 * this.field7342 * this.field7339.method646(this.field7340, false);
    }

    static {
        new class567("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field7352 = new class392[32];
        field7351 = new class517(11, 10);
    }
}
