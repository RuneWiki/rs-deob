import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class397 extends class201 {

    @OriginalMember(owner = "client!po", name = "v", descriptor = "Lnq;")
    private class325 field6061;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "Lus;")
    private class1 field6058;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "[I")
    public static int[] field6059 = new int[4096];

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public static void method2461(int arg0) {
        field6059 = null;
        int var1 = -64 % ((arg0 + 5) / 58);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lus;ILus;F)Z")
    public final boolean method2462(class1 arg0, int arg1, class1 arg2, float arg3) {
        field6060++;
        boolean var5 = true;
        class447 var6 = this.field6061.field5013;
        this.field6061.method850(class43.field619);
        this.field6061.method753();
        this.field6061.method2019(105);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field6058.field5, this.field6058.field5);
        this.field6061.method2069(false, (byte) 68);
        this.field6061.method2018(false, (byte) 99);
        this.field6061.method2064(124, false);
        this.field6061.method2083((byte) -70, false);
        int var7 = -45 / ((43 - arg1) / 59);
        this.field6061.method2015(-2, (byte) -121);
        this.field6061.method2040((byte) -109, 1);
        this.field6061.method2020((byte) 75, 0.0F, 0.0F, arg3, 0.0F);
        this.field6061.method2030(34165, 34165, (byte) 71);
        this.field6061.method2075(arg0, 0);
        this.field6061.method2040((byte) -106, 0);
        this.field6061.method2045(34023, 1);
        this.field6061.method2075(arg2, 0);
        this.field6061.method2071(113, var6);
        for (int var8 = 0; var8 < 6; var8++) {
            int var9 = var8 + 34069;
            var6.method2712(0, this.field6058, -62, var9);
            var6.method2711(-66, 0);
            if (!var6.method2713(36053)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var9 == 34069) {
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
            } else if (var9 == 34070) {
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
            } else if (var9 == 34071) {
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
            } else if (var9 == 34072) {
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
            } else if (var9 == 34073) {
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
            } else if (var9 == 34074) {
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
        var6.method2717(0, (byte) -77);
        this.field6061.method2055(var6, -11);
        this.field6061.method2040((byte) 72, 1);
        this.field6061.method2075(null, 0);
        this.field6061.method2030(8448, 8448, (byte) 71);
        this.field6061.method2040((byte) 113, 0);
        this.field6061.method2075(null, 0);
        OpenGL.glPopAttrib();
        this.field6061.method739(class43.field619[0], class43.field619[1], class43.field619[2], class43.field619[3]);
        if (var5 && !this.field6061.field4947) {
            this.field6058.method3175(-1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)Lus;")
    public final class1 method1364(int arg0) {
        field6056++;
        if (arg0 <= 88) {
            method2461(-2);
        }
        return this.field6058;
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)I")
    public final int method2463(int arg0) {
        if (arg0 < 29) {
            field6059 = null;
        }
        field6057++;
        return this.field6058.field5;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lnq;I)V")
    public class397(class325 arg0, int arg1) {
        this.field6061 = arg0;
        this.field6058 = new class1(arg0, 6408, arg1);
    }
}
