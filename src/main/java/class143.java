import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class143 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lpg;")
    private class333 field2124;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field2125 = 0;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field2121 = 0;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Z")
    public static boolean field2122 = false;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "F")
    public static float field2128;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lie;")
    private class88 field2126;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Z")
    public final boolean method997(int arg0) {
        if (this.field2124.field4773 && this.field2124.field4756 && this.field2126 == null) {
            class508 var2 = class510.method3025(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field2124, (byte) -65);
            if (var2 != null) {
                this.field2126 = class370.method2208(new class508[] { var2 }, this.field2124, false);
            }
        }
        if (arg0 != 16532) {
            this.field2124 = null;
        }
        field2120++;
        return this.field2126 != null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(CI)Z")
    public static final boolean method998(char arg0, int arg1) {
        field2123++;
        if (arg1 > -46) {
            method998('s', -104);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lcl;FBLcl;)Z")
    public final boolean method999(class53 arg0, float arg1, byte arg2, class53 arg3) {
        field2127++;
        if (!this.method997(16532)) {
            return false;
        }
        class60 var5 = this.field2124.field4823;
        class22 var6 = new class22(this.field2124, 6408, arg3.field760, arg3.field761);
        this.field2124.method2001(var5, 77);
        boolean var7 = false;
        var5.method387(var6, (byte) 124, 0);
        if (arg2 < 13) {
            this.field2124 = null;
        }
        if (var5.method401(-1)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field760, arg3.field761);
            OpenGL.glUseProgramObjectARB(this.field2126.field1425);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field2126.field1425, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field2126.field1425, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field2126.field1425, "sampleSize"), 1.0F / (float) arg0.field760, 1.0F / (float) arg0.field761);
            for (int var8 = 0; var8 < arg3.field762; var8++) {
                float var9 = (float) var8 / (float) arg3.field762;
                this.field2124.method1977(arg0, true);
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
                arg3.method346(0, (byte) 120, var8, 0, 0, 0, arg3.field761, arg3.field760);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method397(0, (byte) -81);
        this.field2124.method1970(var5, true);
        return var7;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lpg;)V")
    public class143(class333 arg0) {
        this.field2124 = arg0;
    }
}
