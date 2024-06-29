import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class199 {

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Lqfa;")
    private class106 field3038;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "Lbu;")
    public static class21 field3041 = new class21(80, 4);

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "[I")
    public static int[] field3043 = new int[13];

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "Luh;")
    public static class176 field3045 = new class176(7, 0, 1, 1);

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "D")
    public static double field3044;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "Lhw;")
    private class140 field3042;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public static void method1370(int arg0) {
        field3045 = null;
        field3043 = null;
        if (arg0 == 1) {
            field3041 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(FLek;ZLek;)Z")
    public final boolean method1371(float arg0, class532 arg1, boolean arg2, class532 arg3) {
        field3040++;
        if (!this.method1372(0)) {
            return false;
        }
        class54 var5 = this.field3038.field1501;
        class516 var6 = new class516(this.field3038, 6408, arg1.field7689, arg1.field7682);
        this.field3038.method776(var5, 411);
        boolean var7 = arg2;
        var5.method381((byte) -126, 0, var6);
        if (var5.method375((byte) -120)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field7689, arg1.field7682);
            OpenGL.glUseProgramObjectARB(this.field3042.field2083);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3042.field2083, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3042.field2083, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3042.field2083, "sampleSize"), 1.0F / (float) arg3.field7689, 1.0F / (float) arg3.field7682);
            for (int var8 = 0; var8 < arg1.field7683; var8++) {
                float var9 = (float) var8 / (float) arg1.field7683;
                this.field3038.method808((byte) 34, arg3);
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
                arg1.method3208(-1489, 0, arg1.field7689, 0, 0, 0, var8, arg1.field7682);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method372(0, -51);
        this.field3038.method755(var5, 0);
        return var7;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lqfa;)V")
    public class199(class106 arg0) {
        this.field3038 = arg0;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)Z")
    public final boolean method1372(int arg0) {
        field3039++;
        if (arg0 != 0) {
            return false;
        }
        if (this.field3038.field1577 && this.field3038.field1523 && this.field3042 == null) {
            class394 var2 = class24.method237(arg0 - 115, 35632, this.field3038, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field3042 = class422.method2562(new class394[] { var2 }, 0, this.field3038);
            }
        }
        return this.field3042 != null;
    }
}
