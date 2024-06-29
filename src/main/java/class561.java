import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class561 {

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Leea;")
    private class131 field7880;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field7879 = 0;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "F")
    public static float field7877;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lem;")
    public static class223 field7881;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Laea;")
    private class49 field7876;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method3232(boolean arg0) {
        if (!arg0) {
            method3234(6);
        }
        if (this.field7880.field1858 && this.field7880.field1914 && this.field7876 == null) {
            class19 var2 = class619.method3482((byte) 120, this.field7880, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632);
            if (var2 != null) {
                this.field7876 = class579.method3300(new class19[] { var2 }, -1, this.field7880);
            }
        }
        field7875++;
        return this.field7876 != null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(FLkv;ILkv;)Z", line = 29)
    public final boolean method3233(float arg0, class268 arg1, int arg2, class268 arg3) {
        field7878++;
        if (!this.method3232(true)) {
            return false;
        }
        class269 var5 = this.field7880.field1911;
        class321 var6 = new class321(this.field7880, 6408, arg3.field3826, arg3.field3821);
        this.field7880.method877((byte) -119, var5);
        boolean var7 = false;
        var5.method1762(0, 1, var6);
        if (var5.method1749((byte) -116)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field3826, arg3.field3821);
            OpenGL.glUseProgramObjectARB(this.field7876.field575);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field7876.field575, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field7876.field575, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field7876.field575, "sampleSize"), 1.0F / (float) arg1.field3826, 1.0F / (float) arg1.field3821);
            for (int var8 = 0; var8 < arg3.field3825; var8++) {
                float var9 = (float) var8 / (float) arg3.field3825;
                this.field7880.method926(arg1, 43);
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
                arg3.method1747(arg2 ^ 0xFFFFFFB5, 0, var8, arg3.field3826, 0, 0, 0, arg3.field3821);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method1761(1, arg2);
        this.field7880.method913(var5, (byte) -127);
        return var7;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 95)
    public static void method3234(int arg0) {
        field7881 = null;
        if (arg0 != 1) {
            field7881 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Leea;)V", line = 116)
    public class561(class131 arg0) {
        this.field7880 = arg0;
    }
}
