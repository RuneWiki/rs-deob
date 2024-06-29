import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class571 extends class712 {

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Lrda;")
    private class663 field7504;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Ljc;")
    private class444 field7498;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBIIII)V", line = 10)
    public static final void method3144(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 57 % ((arg2 - 2) / 42);
        field7503++;
        if (arg3 - arg4 >= class261.field3632 && class209.field3090 >= (arg3 + arg4) && class380.field5289 <= (arg1 - arg4) && (arg1 + arg4) <= class431.field5944) {
            class588.method3210(arg4, arg6, arg3, arg1, arg5, 18177, arg0);
        } else {
            class648.method3547(arg0, arg4, arg1, 2, arg5, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)Ljc;", line = 26)
    public final class444 method1922(boolean arg0) {
        field7500++;
        if (!arg0) {
            method3148((byte) 105, 36);
        }
        return this.field7498;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)I", line = 37)
    public final int method3145(int arg0) {
        field7501++;
        if (arg0 != 32395) {
            this.method1922(false);
        }
        return this.field7498.field6108;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljc;Ljc;BF)Z", line = 49)
    public final boolean method3146(class444 arg0, class444 arg1, byte arg2, float arg3) {
        field7499++;
        boolean var5 = true;
        class749 var6 = this.field7504.field9044;
        this.field7504.method393(class377.field5252);
        this.field7504.method435();
        this.field7504.method3634((byte) -59);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field7498.field6108, this.field7498.field6108);
        this.field7504.method3649(2286, false);
        this.field7504.method3628(false, -104);
        this.field7504.method3663(false, 0);
        this.field7504.method3620(28, false);
        this.field7504.method3632(-2, (byte) -118);
        this.field7504.method3630(true, 1);
        this.field7504.method3660(-14217, 0.0F, 0.0F, 0.0F, arg3);
        if (arg2 <= 48) {
            return true;
        }
        this.field7504.method3608(121, 34165, 34165);
        this.field7504.method3639(-2, arg0);
        this.field7504.method3630(true, 0);
        this.field7504.method3631((byte) 116, 1);
        this.field7504.method3639(-2, arg1);
        this.field7504.method3623(var6, 0);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method4196(this.field7498, var8, 0, 0);
            var6.method4201(0, false);
            if (!var6.method4187(42)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method4200(1, 0);
        this.field7504.method3637(var6, -122);
        this.field7504.method3630(true, 1);
        this.field7504.method3639(-2, null);
        this.field7504.method3608(-90, 8448, 8448);
        this.field7504.method3630(true, 0);
        this.field7504.method3639(-2, null);
        OpenGL.glPopAttrib();
        this.field7504.method419(class377.field5252[0], class377.field5252[1], class377.field5252[2], class377.field5252[3]);
        if (var5 && !this.field7504.field9026) {
            this.field7498.method2616((byte) -70);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(III)Z", line = 249)
    public static final boolean method3147(int arg0, int arg1, int arg2) {
        field7497++;
        int var3 = -127 / ((44 - arg1) / 41);
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)I", line = 260)
    public static final int method3148(byte arg0, int arg1) {
        field7502++;
        return arg0 < 10 ? -3 : arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lrda;I)V", line = 271)
    public class571(class663 arg0, int arg1) {
        this.field7504 = arg0;
        this.field7498 = new class444(arg0, 6408, arg1);
    }
}
