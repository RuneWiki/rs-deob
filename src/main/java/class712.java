import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class712 {

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "Lnv;")
    private class417 field10029;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "[I")
    public static int[] field10027 = new int[3];

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
    public static int field10030;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "I")
    public static int field10031;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "Lrda;")
    private class660 field10028;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V", line = 5)
    public static void method3983(int arg0) {
        field10027 = null;
        if (arg0 >= -120) {
            field10031 = 10;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Ldl;ILdl;F)Z", line = 27)
    public final boolean method3984(class62 arg0, int arg1, class62 arg2, float arg3) {
        if (arg1 > -84) {
            this.method3985(-9);
        }
        field10026++;
        if (!this.method3985(91)) {
            return false;
        }
        class106 var5 = this.field10029.field6054;
        class14 var6 = new class14(this.field10029, 6408, arg0.field634, arg0.field631);
        this.field10029.method2615(var5, true);
        boolean var7 = false;
        var5.method725(var6, 26867, 0);
        if (var5.method727(36053)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field634, arg0.field631);
            OpenGL.glUseProgramObjectARB(this.field10028.field9424);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field10028.field9424, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field10028.field9424, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field10028.field9424, "sampleSize"), 1.0F / (float) arg2.field634, 1.0F / (float) arg2.field631);
            for (int var8 = 0; var8 < arg0.field635; var8++) {
                float var9 = (float) var8 / (float) arg0.field635;
                this.field10029.method2621(-2, arg2);
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
                arg0.method469(arg0.field634, 0, 0, (byte) -1, arg0.field631, 0, 0, var8);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method737(0, (byte) -118);
        this.field10029.method2617((byte) -6, var5);
        return var7;
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)Z", line = 95)
    public final boolean method3985(int arg0) {
        if (arg0 <= 83) {
            field10027 = null;
        }
        field10030++;
        if (this.field10029.field6033 && this.field10029.field6030 && this.field10028 == null) {
            class299 var2 = class261.method1572(this.field10029, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", false);
            if (var2 != null) {
                this.field10028 = class501.method2971(this.field10029, new class299[] { var2 }, -15582);
            }
        }
        return this.field10028 != null;
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lnv;)V", line = 120)
    public class712(class417 arg0) {
        this.field10029 = arg0;
    }
}
