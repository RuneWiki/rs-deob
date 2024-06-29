import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class565 extends class112 {

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Los;")
    private class468 field8370;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "Lbo;")
    private class227 field8374;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "J")
    public static long field8372 = 0L;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "Ldda;")
    public static class597 field8375;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method3303(int arg0) {
        if (arg0 != -16911) {
            method3303(-112);
        }
        field8375 = null;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)Lbo;")
    public final class227 method665(byte arg0) {
        field8376++;
        int var2 = -24 % ((arg0 + 63) / 60);
        return this.field8374;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(FLbo;ZLbo;)Z")
    public final boolean method3304(float arg0, class227 arg1, boolean arg2, class227 arg3) {
        field8371++;
        boolean var5 = arg2;
        class292 var6 = this.field8370.field6995;
        this.field8370.method1025(class552.field8218);
        this.field8370.method985();
        this.field8370.method2833((byte) 112);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field8374.field3336, this.field8374.field3336);
        this.field8370.method2787(false, (byte) 4);
        this.field8370.method2828(5126, false);
        this.field8370.method2836(2929, false);
        this.field8370.method2800(false, -32);
        this.field8370.method2778(-2, 0);
        this.field8370.method2842(1, (byte) 42);
        this.field8370.method2837(0.0F, 0.0F, arg0, -15078, 0.0F);
        this.field8370.method2852(34165, (byte) 105, 34165);
        this.field8370.method2811(arg1, -2);
        this.field8370.method2842(0, (byte) 42);
        this.field8370.method2791(1, (byte) 99);
        this.field8370.method2811(arg3, -2);
        this.field8370.method2789(0, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1801(0, var8, this.field8374, (byte) -128);
            var6.method1804((byte) -51, 0);
            if (!var6.method1814(false)) {
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
        var6.method1811(-120, 0);
        this.field8370.method2788((byte) -118, var6);
        this.field8370.method2842(1, (byte) 42);
        this.field8370.method2811(null, -2);
        this.field8370.method2852(8448, (byte) 85, 8448);
        this.field8370.method2842(0, (byte) 42);
        this.field8370.method2811(null, -2);
        OpenGL.glPopAttrib();
        this.field8370.method1022(class552.field8218[0], class552.field8218[1], class552.field8218[2], class552.field8218[3]);
        if (var5 && !this.field8370.field7079) {
            this.field8374.method3183((byte) -93);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Los;I)V")
    public class565(class468 arg0, int arg1) {
        this.field8370 = arg0;
        this.field8374 = new class227(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)I")
    public final int method3305(int arg0) {
        if (arg0 == 7) {
            field8373++;
            return this.field8374.field3336;
        } else {
            return -107;
        }
    }
}
