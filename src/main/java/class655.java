import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class655 extends class340 {

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "Lkga;")
    private class506 field9297;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "Lsa;")
    private class187 field9298;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "Lwo;")
    public static class690 field9303 = new class690(44, 2);

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "Ljk;")
    public static class585 field9304 = new class585(36, 7);

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "Z")
    public static boolean field9305 = false;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(FLsa;BLsa;)Z", line = 3)
    public final boolean method3705(float arg0, class187 arg1, byte arg2, class187 arg3) {
        field9300++;
        boolean var5 = true;
        class416 var6 = this.field9297.field7346;
        this.field9297.method251(class4.field22);
        this.field9297.method249();
        this.field9297.method2973(-98);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        if (arg2 != -54) {
            field9304 = null;
        }
        OpenGL.glViewport(0, 0, this.field9298.field2289, this.field9298.field2289);
        this.field9297.method2943(false, (byte) -113);
        this.field9297.method2969(false, (byte) -104);
        this.field9297.method2952(false, (byte) 24);
        this.field9297.method2931((byte) -113, false);
        this.field9297.method2988(true, -2);
        this.field9297.method2975(1, 72);
        this.field9297.method2983(0.0F, -124, 0.0F, arg0, 0.0F);
        this.field9297.method2948(34165, 34165, (byte) -126);
        this.field9297.method2932(true, arg3);
        this.field9297.method2975(0, 98);
        this.field9297.method2985(1, arg2 ^ 0x6969);
        this.field9297.method2932(true, arg1);
        this.field9297.method2953(126, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2500(0, this.field9298, 36160, var8);
            var6.method2505(0, false);
            if (!var6.method2504(25)) {
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
        var6.method2502(0, 9136);
        this.field9297.method2954(var6, true);
        this.field9297.method2975(1, 102);
        this.field9297.method2932(true, null);
        this.field9297.method2948(8448, 8448, (byte) 52);
        this.field9297.method2975(0, 89);
        this.field9297.method2932(true, null);
        OpenGL.glPopAttrib();
        this.field9297.method292(class4.field22[0], class4.field22[1], class4.field22[2], class4.field22[3]);
        if (var5 && !this.field9297.field7407) {
            this.field9298.method1202(-32177);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)I", line = 203)
    public final int method3706(boolean arg0) {
        field9299++;
        if (arg0) {
            this.method3706(true);
        }
        return this.field9298.field2289;
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)Lsa;", line = 214)
    public final class187 method1959(int arg0) {
        field9302++;
        return arg0 == -1199488062 ? this.field9298 : null;
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lkga;I)V", line = 224)
    public class655(class506 arg0, int arg1) {
        this.field9297 = arg0;
        this.field9298 = new class187(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "(I)V", line = 235)
    public static void method3707(int arg0) {
        field9303 = null;
        field9304 = null;
        if (arg0 != 8448) {
            method3707(-69);
        }
    }
}
