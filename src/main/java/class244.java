import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class244 extends class31 {

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    private int field3131 = -1;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    private int field3133 = -1;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Lpi;")
    public static class340 field3132 = new class340(86, 3);

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "Lhb;")
    public static class250 field3135 = new class250(68, 7);

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "Loi;")
    public static class169 field3136 = new class169(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "F")
    public static float field3138 = 0.0F;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "Loi;")
    public static class169 field3137 = new class169("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lgk;IIZ[[I)V")
    public class244(class463 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field3130 = arg2;
        super.field512.method2771(this, -16785);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class518.method3074(super.field512.field6793, arg2, arg4[var6], 32993, var6 + 34069, 20943, arg2, super.field519);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field519, arg2, arg2, 0, 32993, super.field512.field6793, arg4[var7], 0);
            }
        }
        this.method210(true, (byte) -127);
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V")
    public static void method1530(int arg0) {
        field3135 = null;
        field3137 = null;
        if (arg0 > -51) {
            method1530(61);
        }
        field3132 = null;
        field3136 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIB)V")
    public final void method1531(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, arg1, super.field509, arg0);
        ++field3129;
        if (arg4 != 93) {
            this.method220(-93);
        }
        this.field3131 = arg3;
        this.field3133 = arg2;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lgk;II)V")
    public class244(class463 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field3130 = arg2;
        super.field512.method2771(this, -16785);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field519, arg2, arg2, 0, class65.method365(super.field519, false), 5121, (byte[]) null, 0);
        }
        this.method210(true, (byte) 67);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lgk;IIZ[[BI)V")
    public class244(class463 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field3130 = arg2;
        super.field512.method2771(this, -16785);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field519, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method210(true, (byte) 47);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public final void method220(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field3131, this.field3133, 3553, 0, arg0);
        ++field3134;
        this.field3131 = -1;
        this.field3133 = -1;
    }
}
