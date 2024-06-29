import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class203 {

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lkd;")
    private class188 field3370;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field3373 = -1;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lfe;")
    private class404 field3368;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lul;")
    public static class406 field3371;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lis;IFLis;)Z", line = 3)
    public final boolean method1417(class349 arg0, int arg1, float arg2, class349 arg3) {
        field3372++;
        if (!this.method1418(0)) {
            return false;
        }
        class395 var5 = this.field3370.field3110;
        class146 var6 = new class146(this.field3370, 6408, arg0.field5156, arg0.field5155);
        boolean var7 = false;
        this.field3370.method1284(5122, var5);
        var5.method2484(-90, var6, 0);
        int var8 = -54 / ((47 - arg1) / 55);
        if (var5.method2488(98)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field5156, arg0.field5155);
            OpenGL.glUseProgramObjectARB(this.field3368.field5993);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3368.field5993, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3368.field5993, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3368.field5993, "sampleSize"), 1.0F / (float) arg3.field5156, 1.0F / (float) arg3.field5155);
            for (int var9 = 0; var9 < arg0.field5158; var9++) {
                float var10 = (float) var9 / (float) arg0.field5158;
                this.field3370.method1289(-19391, arg3);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord3f(0.0F, 0.0F, var10);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 0.0F, var10);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 1.0F, var10);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3f(0.0F, 1.0F, var10);
                OpenGL.glVertex2f(0.0F, 1.0F);
                OpenGL.glEnd();
                arg0.method2176(var9, 0, arg0.field5155, 0, 0, 7517, 0, arg0.field5156);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method2489(0, true);
        this.field3370.method1283(var5, true);
        return var7;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Z", line = 71)
    public final boolean method1418(int arg0) {
        if (arg0 != 0) {
            this.field3370 = null;
        }
        if (this.field3370.field3145 && this.field3370.field3166 && this.field3368 == null) {
            class447 var2 = class71.method622(true, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field3370, 35632);
            if (var2 != null) {
                this.field3368 = class75.method647(120, this.field3370, new class447[] { var2 });
            }
        }
        field3369++;
        return this.field3368 != null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 103)
    public static void method1419(int arg0) {
        field3371 = null;
        if (arg0 != 0) {
            method1419(90);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lkd;)V", line = 119)
    public class203(class188 arg0) {
        this.field3370 = arg0;
    }
}
