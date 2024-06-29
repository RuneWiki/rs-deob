import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class679 extends class517 {

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    private int field9607 = -1;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    private int field9606 = -1;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public int field9604;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public int field9603;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public int field9608;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "Lqu;")
    public static class281 field9602 = null;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public final void method847(byte arg0) {
        if (arg0 != -79) {
            this.field9606 = -96;
        }
        ++field9601;
        OpenGL.glFramebufferTexture3DEXT(this.field9606, this.field9607, super.field7260, 0, 0, 0);
        this.field9606 = -1;
        this.field9607 = -1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3814(int arg0, int arg1, int arg2, Class arg3) {
        class44 var4 = class603.field8695[arg0][arg1][arg2];
        if (var4 != null) {
            for (class361 var5 = var4.field667; var5 != null; var5 = var5.field5299) {
                class293 var6 = var5.field5301;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field4299 == arg1 && var6.field4300 == arg2) {
                    class296.method1851(var6, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Luca;IIII)V")
    public class679(class287 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field9604 = arg4;
        this.field9603 = arg2;
        this.field9608 = arg3;
        super.field7252.method1709((byte) -124, this);
        OpenGL.glTexImage3Dub(super.field7260, 0, super.field7259, this.field9603, this.field9608, this.field9604, 0, class422.method2556(super.field7259, (byte) -89), 5121, (byte[]) null, 0);
        this.method2924(true, -75);
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
    public static final void method3815(byte arg0) {
        class332.field4829 = null;
        class79.field1284 = null;
        ++field9605;
        if (arg0 > -66) {
            method3814(-114, 22, 94, (Class) null);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBIIIIII)V")
    public final void method3816(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 50) {
            method3814(-111, -107, -34, (Class) null);
        }
        ++field9609;
        super.field7252.method1709((byte) -65, this);
        OpenGL.glCopyTexSubImage3D(super.field7260, 0, arg4, arg6, arg2, arg5, arg3, arg7, arg0);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Luca;IIII[BI)V")
    public class679(class287 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field9603 = arg2;
        this.field9604 = arg4;
        this.field9608 = arg3;
        super.field7252.method1709((byte) -84, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field7260, 0, super.field7259, this.field9603, this.field9608, this.field9604, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2924(true, -49);
    }
}
