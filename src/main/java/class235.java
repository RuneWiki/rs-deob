import jaggl.OpenGL;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class235 {

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "Los;")
    private class468 field3448;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "Lnj;")
    public static class487 field3445 = new class487("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "Lpn;")
    public static class68 field3452 = new class68();

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "Z")
    public static boolean field3454 = false;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "Lqp;")
    public static class586 field3453 = new class586(42, 3);

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "Ldca;")
    private class501 field3447;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "[Lsa;")
    public static class543[] field3455;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lmu;ILmu;F)Z", line = 4)
    public final boolean method1522(class422 arg0, int arg1, class422 arg2, float arg3) {
        field3449++;
        if (!this.method1524(true)) {
            return false;
        }
        class292 var5 = this.field3448.field6995;
        class480 var6 = new class480(this.field3448, 6408, arg2.field6049, arg2.field6047);
        if (arg1 < 39) {
            method1525(-58, null);
        }
        boolean var7 = false;
        this.field3448.method2789(0, var5);
        var5.method1817(var6, 0, -90);
        if (var5.method1814(false)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg2.field6049, arg2.field6047);
            OpenGL.glUseProgramObjectARB(this.field3447.field7498);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3447.field7498, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3447.field7498, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3447.field7498, "sampleSize"), 1.0F / (float) arg0.field6049, 1.0F / (float) arg0.field6047);
            for (int var8 = 0; var8 < arg2.field6046; var8++) {
                float var9 = (float) var8 / (float) arg2.field6046;
                this.field3448.method2811(arg0, -2);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord3f(0.0F, 0.0F, var9);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 0.0F, var9);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 1.0F, var9);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3f(0.0F, 1.0F, var9);
                OpenGL.glVertex2f(0.0F, 1.0F);
                OpenGL.glEnd();
                arg2.method2508(0, var8, arg2.field6047, 3317, 0, 0, arg2.field6049, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method1811(-115, 0);
        this.field3448.method2788((byte) -118, var5);
        return var7;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZI)V", line = 77)
    public static final void method1523(boolean arg0, int arg1) {
        field3451++;
        if (arg0) {
            return;
        }
        if (!class94.field1158.field292) {
            arg1 = -1;
        }
        if (class500.field7491 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class604 var2 = class271.field4008.method1353(arg1, 0);
            class610 var3 = var2.method3510(0);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class328.field4850.method2172(var3.method3548(), new Point(var2.field8895, var2.field8893), var3.method3557(), var3.method3558(), class110.field1401, (byte) -74);
                class500.field7491 = arg1;
            }
        }
        if (arg1 == -1 && class500.field7491 != -1) {
            class328.field4850.method2172(null, new Point(), -1, -1, class110.field1401, (byte) -74);
            class500.field7491 = -1;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)Z", line = 119)
    public final boolean method1524(boolean arg0) {
        field3450++;
        if (this.field3448.field6993 && this.field3448.field7077 && this.field3447 == null) {
            class346 var2 = class331.method2082("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field3448, 0, 35632);
            if (var2 != null) {
                this.field3447 = class169.method1072(1951, new class346[] { var2 }, this.field3448);
            }
        }
        if (!arg0) {
            this.field3447 = null;
        }
        return this.field3447 != null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILhca;)V", line = 146)
    public static final void method1525(int arg0, class179 arg1) {
        if (arg0 != 1) {
            return;
        }
        field3446++;
        class434 var2 = (class434) class426.field6077.method1333((long) arg1.field1053, false);
        if (var2 == null) {
            return;
        }
        if (var2.field6356 != null) {
            class105.field1321.method2085(var2.field6356);
            var2.field6356 = null;
        }
        var2.method2997(1);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V", line = 175)
    public static void method1526(int arg0) {
        if (arg0 == 1) {
            field3445 = null;
            field3453 = null;
            field3452 = null;
            field3455 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Los;)V", line = 191)
    public class235(class468 arg0) {
        this.field3448 = arg0;
    }
}
