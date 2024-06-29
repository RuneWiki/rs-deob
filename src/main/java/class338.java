import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class338 {

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "Lbi;")
    private class483 field4284;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "Lhg;")
    public static class693 field4282 = new class693(24, 3);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Lit;")
    private class648 field4283;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(FLsga;Lsga;Z)Z")
    public final boolean method1944(float arg0, class70 arg1, class70 arg2, boolean arg3) {
        field4281++;
        if (!this.method1946(26780)) {
            return false;
        } else if (arg3) {
            class656 var5 = this.field4284.field6842;
            class400 var6 = new class400(this.field4284, 6408, arg2.field985, arg2.field977);
            this.field4284.method2815((byte) 64, var5);
            boolean var7 = false;
            var5.method3695(1, 0, var6);
            if (var5.method3702(-24937)) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, arg2.field985, arg2.field977);
                OpenGL.glUseProgramObjectARB(this.field4283.field8964);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field4283.field8964, "heightMap"), 0);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field4283.field8964, "rcpRelief"), 1.0F / arg0);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field4283.field8964, "sampleSize"), 1.0F / (float) arg1.field985, 1.0F / (float) arg1.field977);
                for (int var8 = 0; var8 < arg2.field982; var8++) {
                    float var9 = (float) var8 / (float) arg2.field982;
                    this.field4284.method2850(72, arg1);
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
                    arg2.method635(0, 0, 0, 0, arg2.field977, arg2.field985, var8, 0);
                }
                OpenGL.glUseProgramObjectARB(0L);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                OpenGL.glPopMatrix();
                var7 = true;
            }
            var5.method3688(127, 0);
            this.field4284.method2851(5, var5);
            return var7;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    public static void method1945(byte arg0) {
        field4282 = null;
        if (arg0 != -11) {
            method1945((byte) 42);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z")
    public final boolean method1946(int arg0) {
        if (this.field4284.field6861 && this.field4284.field6888 && this.field4283 == null) {
            class584 var2 = class711.method3976(this.field4284, (byte) 118, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field4283 = class616.method3445((byte) -96, this.field4284, new class584[] { var2 });
            }
        }
        field4280++;
        if (arg0 == 26780) {
            return this.field4283 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lbi;)V")
    public class338(class483 arg0) {
        this.field4284 = arg0;
    }
}
