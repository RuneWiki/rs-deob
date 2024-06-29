import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class431 {

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "Lrs;")
    private class166 field6297;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public static int field6299 = class730.method4052(1600, 108);

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "Lun;")
    private class144 field6294;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "Lul;")
    public static class363 field6300;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "Lla;")
    public static class422 field6296;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(FLtq;Ltq;I)Z")
    public final boolean method2677(float arg0, class512 arg1, class512 arg2, int arg3) {
        field6295++;
        if (!this.method2679(arg3 + 29744)) {
            return false;
        }
        class98 var5 = this.field6297.field2799;
        class314 var6 = new class314(this.field6297, 6408, arg1.field7451, arg1.field7448);
        this.field6297.method1322(var5, (byte) -86);
        boolean var7 = false;
        var5.method805(0, var6, 1);
        if (var5.method812((byte) -111)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field7451, arg1.field7448);
            OpenGL.glUseProgramObjectARB(this.field6294.field2237);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field6294.field2237, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field6294.field2237, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field6294.field2237, "sampleSize"), 1.0F / (float) arg2.field7451, 1.0F / (float) arg2.field7448);
            for (int var8 = 0; var8 < arg1.field7440; var8++) {
                float var9 = (float) var8 / (float) arg1.field7440;
                this.field6297.method1306(arg2, 38);
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
                arg1.method3078(arg3 ^ 0xFFFFE8A3, 0, arg1.field7451, 0, 0, arg1.field7448, var8, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method813((byte) -102, 0);
        this.field6297.method1293(arg3 ^ arg3, var5);
        return var7;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V")
    public static void method2678(boolean arg0) {
        if (!arg0) {
            field6296 = null;
        }
        field6296 = null;
        field6300 = null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)Z")
    public final boolean method2679(int arg0) {
        if (this.field6297.field2805 && this.field6297.field2861 && this.field6294 == null) {
            class621 var2 = class616.method3521("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field6297, (byte) -99, 35632);
            if (var2 != null) {
                this.field6294 = class231.method1605(new class621[] { var2 }, this.field6297, (byte) -110);
            }
        }
        if (arg0 != 35632) {
            field6299 = 2;
        }
        field6298++;
        return this.field6294 != null;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lrs;)V")
    public class431(class166 arg0) {
        this.field6297 = arg0;
    }
}
