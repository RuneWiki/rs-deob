import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class538 {

    @OriginalMember(owner = "client!us", name = "z", descriptor = "I")
    private int field3 = -1;

    @OriginalMember(owner = "client!us", name = "x", descriptor = "I")
    private int field1 = -1;

    @OriginalMember(owner = "client!us", name = "C", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!us", name = "D", descriptor = "[I")
    public static int[] field6 = new int[4096];

    @OriginalMember(owner = "client!us", name = "I", descriptor = "[F")
    public static float[] field10;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "y", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "B", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "F", descriptor = "[Lhi;")
    public static class140[] field8;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "[S")
    public static short[] field9;

    static {
        new class446("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field10 = new float[4];
        field7 = 16777215;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIII)V", line = 4)
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4;
        if (arg3 != -9324) {
            field8 = null;
        }
        OpenGL.glFramebufferTexture2DEXT(arg1, arg4, arg0, super.field7894, arg2);
        this.field3 = arg1;
        this.field1 = arg4;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lnq;II)V", line = 18)
    public class1(class325 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field5 = arg2;
        super.field7884.method2075(this, 0);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field7878, arg2, arg2, 0, class259.method1676(super.field7878, 128), 5121, (byte[]) null, 0);
        }
        this.method3176(false, true);
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lnq;IIZ[[BI)V", line = 38)
    public class1(class325 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5 = arg2;
        super.field7884.method2075(this, 0);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field7878, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method3176(false, true);
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lnq;IIZ[[I)V", line = 57)
    public class1(class325 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field5 = arg2;
        super.field7884.method2075(this, 0);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class24.method224(var6 + 34069, arg2, super.field7878, 32993, super.field7884.field4925, arg2, -121, arg4[var6]);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field7878, arg2, arg2, 0, 32993, super.field7884.field4925, arg4[var7], 0);
            }
        }
        this.method3176(false, true);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)V", line = 91)
    public final void method2(boolean arg0) {
        ++field2;
        OpenGL.glFramebufferTexture2DEXT(this.field3, this.field1, 3553, 0, 0);
        if (!arg0) {
            this.field3 = -1;
            this.field1 = -1;
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V", line = 112)
    public static void method3(byte arg0) {
        field6 = null;
        field8 = null;
        field10 = null;
        if (arg0 != 26) {
            method3((byte) 106);
        }
        field9 = null;
    }
}
