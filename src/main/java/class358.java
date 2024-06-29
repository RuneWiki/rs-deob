import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class358 {

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Lok;")
    private class228 field5127;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "[[I")
    public static int[][] field5133 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Lhca;")
    private class452 field5129;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V", line = 8)
    public static void method2181(byte arg0) {
        field5133 = null;
        if (arg0 >= -13) {
            field5133 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2182(int arg0) {
        field5132++;
        class120.field1828 = false;
        if (arg0 != 4) {
            field5133 = null;
        }
        class158.method1100(112);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lhj;FILhj;)Z", line = 32)
    public final boolean method2183(class528 arg0, float arg1, int arg2, class528 arg3) {
        field5128++;
        if (!this.method2184((byte) -93)) {
            return false;
        }
        class139 var5 = this.field5127.field3486;
        class462 var6 = new class462(this.field5127, 6408, arg3.field7435, arg3.field7439);
        this.field5127.method1578(0, var5);
        boolean var7 = false;
        var5.method1014(arg2, arg2 - 5253, var6);
        if (var5.method1005(-121)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field7435, arg3.field7439);
            OpenGL.glUseProgramObjectARB(this.field5129.field6505);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field5129.field6505, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field5129.field6505, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field5129.field6505, "sampleSize"), 1.0F / (float) arg0.field7435, 1.0F / (float) arg0.field7439);
            for (int var8 = 0; var8 < arg3.field7437; var8++) {
                float var9 = (float) var8 / (float) arg3.field7437;
                this.field5127.method1505(-2, arg0);
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
                arg3.method3024(0, arg3.field7439, var8, 0, true, 0, 0, arg3.field7435);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method1003(0, -105);
        this.field5127.method1565(-13986, var5);
        return var7;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)Z", line = 99)
    public final boolean method2184(byte arg0) {
        if (this.field5127.field3515 && this.field5127.field3464 && this.field5129 == null) {
            class558 var2 = class548.method3098((byte) -99, 35632, this.field5127, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field5129 = class505.method2912(new class558[] { var2 }, 0, this.field5127);
            }
        }
        field5130++;
        int var3 = -59 % ((arg0 - 61) / 33);
        return this.field5129 != null;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lok;)V", line = 124)
    public class358(class228 arg0) {
        this.field5127 = arg0;
    }
}
