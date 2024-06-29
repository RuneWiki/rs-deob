import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class353 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Ljaa;")
    private class576 field4565;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Z")
    public static boolean field4564 = false;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lpfa;")
    public static class275 field4567;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Lsh;")
    private class65 field4568;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method2026(boolean arg0) {
        if (arg0) {
            this.method2027(null, (byte) -33, null, -0.9182665F);
        }
        field4566++;
        if (this.field4565.field7667 && this.field4565.field7732 && this.field4568 == null) {
            class491 var2 = class428.method2362("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35716, this.field4565, 35632);
            if (var2 != null) {
                this.field4568 = class234.method1417(new class491[] { var2 }, -128, this.field4565);
            }
        }
        return this.field4568 != null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lep;BLep;F)Z", line = 32)
    public final boolean method2027(class389 arg0, byte arg1, class389 arg2, float arg3) {
        field4569++;
        if (!this.method2026(false)) {
            return false;
        }
        class14 var5 = this.field4565.field7641;
        class130 var6 = new class130(this.field4565, 6408, arg0.field4989, arg0.field4998);
        boolean var7 = false;
        this.field4565.method3119(var5, -2015);
        var5.method64(0, 1, var6);
        if (var5.method67(99)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field4989, arg0.field4998);
            OpenGL.glUseProgramObjectARB(this.field4568.field785);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field4568.field785, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field4568.field785, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field4568.field785, "sampleSize"), 1.0F / (float) arg2.field4989, 1.0F / (float) arg2.field4998);
            for (int var8 = 0; var8 < arg0.field4996; var8++) {
                float var9 = (float) var8 / (float) arg0.field4996;
                this.field4565.method3194((byte) 75, arg2);
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
                arg0.method2221(arg0.field4989, -110, 0, arg0.field4998, 0, 0, var8, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method81(0, (byte) 90);
        this.field4565.method3164(-127, var5);
        int var10 = -40 % ((33 - arg1) / 33);
        return var7;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 105)
    public static void method2028(byte arg0) {
        int var1 = 103 % ((arg0 - 30) / 44);
        field4567 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ljaa;)V", line = 117)
    public class353(class576 arg0) {
        this.field4565 = arg0;
    }
}
