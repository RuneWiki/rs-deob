import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class34 {

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Lrda;")
    private class663 field502;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "Lqr;")
    public static class65 field503 = new class65(4);

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "Lkaa;")
    public static class47 field507 = new class47(18, -1);

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field508 = 0;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "Lnfa;")
    private class680 field505;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "Z")
    public static boolean field510;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field504++;
        if (arg7 != (arg6 ? class411.field5711.field3894.method2432(true) : class411.field5711.field3887.method2432(true)) && arg0 != 0 && class501.field6728 < 50 && arg1 != -1) {
            class503.field6751[class501.field6728++] = new class121((byte) (arg6 ? 3 : 2), arg1, arg0, arg5, arg3, arg2, arg4, null);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V")
    public static void method282(boolean arg0) {
        if (arg0) {
            method281(-94, -68, -78, -3, 22, -23, false, -61);
        }
        field507 = null;
        field503 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lgr;FBLgr;)Z")
    public final boolean method283(class439 arg0, float arg1, byte arg2, class439 arg3) {
        field511++;
        if (!this.method284(35632)) {
            return false;
        }
        class749 var5 = this.field502.field9044;
        class719 var6 = new class719(this.field502, 6408, arg0.field6059, arg0.field6066);
        if (arg2 < 102) {
            this.method283(null, -0.32176483F, (byte) -104, null);
        }
        boolean var7 = false;
        this.field502.method3623(var5, 0);
        var5.method4194(var6, 15061, 0);
        if (var5.method4187(-88)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field6059, arg0.field6066);
            OpenGL.glUseProgramObjectARB(this.field505.field9499);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field505.field9499, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field505.field9499, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field505.field9499, "sampleSize"), 1.0F / (float) arg3.field6059, 1.0F / (float) arg3.field6066);
            for (int var8 = 0; var8 < arg0.field6068; var8++) {
                float var9 = (float) var8 / (float) arg0.field6068;
                this.field502.method3639(-2, arg3);
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
                arg0.method2530(0, 0, -118, var8, 0, arg0.field6059, 0, arg0.field6066);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method4200(1, 0);
        this.field502.method3637(var5, -116);
        return var7;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Z")
    public final boolean method284(int arg0) {
        field509++;
        if (arg0 != 35632) {
            method281(-14, 22, 55, 119, -38, -92, false, -111);
        }
        if (this.field502.field8985 && this.field502.field9079 && this.field505 == null) {
            class551 var2 = class380.method2244(arg0 - 35628, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, this.field502);
            if (var2 != null) {
                this.field505 = class373.method2186(this.field502, new class551[] { var2 }, -81);
            }
        }
        return this.field505 != null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public static final void method285(byte arg0) {
        if (arg0 <= 6) {
            field508 = -43;
        }
        for (int var1 = 0; var1 < class184.field2782.length; var1++) {
            for (int var2 = 0; var2 < class184.field2782[0].length; var2++) {
                for (int var3 = 0; var3 < class184.field2782[0][0].length; var3++) {
                    class184.field2782[var1][var2][var3] = 0;
                }
            }
        }
        field506++;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lrda;)V")
    public class34(class663 arg0) {
        this.field502 = arg0;
    }
}
