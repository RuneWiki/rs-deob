import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class405 extends class205 {

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    private int field5745 = -1;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    private int field5753 = -1;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public int field5752;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public int field5750;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public int field5747;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "Z")
    public static boolean field5751 = false;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "[Lhh;")
    public static class140[] field5744;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIB)V", line = 3)
    public final void method2446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        super.field2640.method1595((byte) 104, this);
        ++field5746;
        OpenGL.glCopyTexSubImage3D(super.field2649, 0, arg4, arg6, arg5, arg0, arg3, arg2, arg1);
        if (arg7 >= -63) {
            this.field5745 = -98;
        }
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Llf;IIII)V", line = 17)
    public class405(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field5752 = arg4;
        this.field5750 = arg3;
        this.field5747 = arg2;
        super.field2640.method1595((byte) 85, this);
        OpenGL.glTexImage3Dub(super.field2649, 0, super.field2644, this.field5747, this.field5750, this.field5752, 0, class172.method1167(4229, super.field2644), 5121, (byte[]) null, 0);
        this.method1344(-15578, true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 35)
    public final void method804(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field5745, this.field5753, super.field2649, 0, arg0, 0);
        ++field5748;
        this.field5753 = -1;
        this.field5745 = -1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZIIZII)V", line = 46)
    public static final void method2447(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 == 3317) {
            ++field5749;
            if (~arg6 > ~arg2) {
                int var7 = (arg6 - -arg2) / 2;
                int var8 = arg6;
                class154 var9 = class310.field4388[var7];
                class310.field4388[var7] = class310.field4388[arg2];
                class310.field4388[arg2] = var9;
                for (int var10 = arg6; var10 < arg2; ++var10) {
                    if (class587.method3299(class310.field4388[var10], var9, -28314, arg3, arg1, arg0, arg4) <= 0) {
                        class154 var11 = class310.field4388[var10];
                        class310.field4388[var10] = class310.field4388[var8];
                        class310.field4388[var8++] = var11;
                    }
                }
                class310.field4388[arg2] = class310.field4388[var8];
                class310.field4388[var8] = var9;
                method2447(arg0, arg1, var8 - 1, arg3, arg4, 3317, arg6);
                method2447(arg0, arg1, arg2, arg3, arg4, 3317, var8 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Llf;IIII[BI)V", line = 100)
    public class405(class250 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field5747 = arg2;
        this.field5750 = arg3;
        this.field5752 = arg4;
        super.field2640.method1595((byte) 112, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2649, 0, super.field2644, this.field5747, this.field5750, this.field5752, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1344(-15578, true);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V", line = 115)
    public static void method2448(byte arg0) {
        int var1 = 67 % ((arg0 - -49) / 39);
        field5744 = null;
    }
}
