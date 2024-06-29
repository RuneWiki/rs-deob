import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class422 extends class222 {

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
    private int field6195 = -1;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
    private int field6199 = -1;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    public int field6196;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
    public int field6193;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIIII)V")
    public final void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -94 / ((-82 - arg3) / 42);
        super.field3332.method648(66, this);
        ++field6192;
        OpenGL.glCopyTexSubImage3D(super.field3347, 0, arg2, arg5, arg0, arg4, arg7, arg1, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ljj;IIII[BI)V")
    public class422(class66 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6194 = arg3;
        this.field6196 = arg4;
        this.field6193 = arg2;
        super.field3332.method648(-44, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3347, 0, super.field3340, this.field6193, this.field6194, this.field6196, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1490((byte) 74, true);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6197;
        if (class543.method3045(arg6, -29039)) {
            if (arg2 == 5121) {
                if (class44.field610[arg6] == null) {
                    client.method3517(class177.field2593[arg6], -1, arg5, arg9, arg7, arg1, arg4, arg0, arg8, arg3);
                } else {
                    client.method3517(class44.field610[arg6], -1, arg5, arg9, arg7, arg1, arg4, arg0, arg8, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public final void method1492(int arg0) {
        ++field6198;
        OpenGL.glFramebufferTexture3DEXT(this.field6199, this.field6195, super.field3347, 0, 0, 0);
        this.field6199 = -1;
        if (arg0 != -29948) {
            this.field6194 = 94;
        }
        this.field6195 = -1;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ljj;IIII)V")
    public class422(class66 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field6194 = arg3;
        this.field6196 = arg4;
        this.field6193 = arg2;
        super.field3332.method648(69, this);
        OpenGL.glTexImage3Dub(super.field3347, 0, super.field3340, this.field6193, this.field6194, this.field6196, 0, class209.method1337(super.field3340, (byte) 123), 5121, (byte[]) null, 0);
        this.method1490((byte) 104, true);
    }

    static {
        new class567("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
