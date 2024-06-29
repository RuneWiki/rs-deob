import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class509 {

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Lji;")
    private class622 field6674;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field6669 = 0;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "[I")
    public static int[] field6673 = new int[200];

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field6672 = 0;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Lhca;")
    public static class365 field6675 = new class365();

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lhq;")
    private class47 field6670;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method2742(int arg0) {
        if (arg0 != 35632) {
            return false;
        }
        field6676++;
        if (this.field6674.field8640 && this.field6674.field8614 && this.field6670 == null) {
            class238 var2 = class648.method3566(35632, -116, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field6674);
            if (var2 != null) {
                this.field6670 = class149.method1098(new class238[] { var2 }, this.field6674, (byte) 120);
            }
        }
        return this.field6670 != null;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 36)
    public static void method2743(int arg0) {
        if (arg0 != 20162) {
            method2745(-0.4368998F, 1.9182932F, 0.75140876F, true);
        }
        field6673 = null;
        field6675 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lsp;Lsp;ZF)Z", line = 47)
    public final boolean method2744(class690 arg0, class690 arg1, boolean arg2, float arg3) {
        field6668++;
        if (!this.method2742(35632)) {
            return false;
        }
        if (!arg2) {
            field6669 = 5;
        }
        class701 var5 = this.field6674.field8660;
        class565 var6 = new class565(this.field6674, 6408, arg1.field9434, arg1.field9431);
        boolean var7 = false;
        this.field6674.method3395(18469, var5);
        var5.method3839(-15959, 0, var6);
        if (var5.method3833(22734)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field9434, arg1.field9431);
            OpenGL.glUseProgramObjectARB(this.field6670.field667);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field6670.field667, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field6670.field667, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field6670.field667, "sampleSize"), 1.0F / (float) arg0.field9434, 1.0F / (float) arg0.field9431);
            for (int var8 = 0; var8 < arg1.field9433; var8++) {
                float var9 = (float) var8 / (float) arg1.field9433;
                this.field6674.method3388(arg0, false);
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
                arg1.method3758(0, 0, 0, (byte) 113, var8, arg1.field9431, arg1.field9434, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method3843(-26732, 0);
        this.field6674.method3390(-22078, var5);
        return var7;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFFZ)I", line = 122)
    public static final int method2745(float arg0, float arg1, float arg2, boolean arg3) {
        field6671++;
        if (arg3) {
            field6673 = null;
        }
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg0 < 0.0F ? -arg0 : arg0;
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (var5 > var4 && var6 < var5) {
            return (arg0 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return (arg2 > 0.0F) ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lji;)V", line = 170)
    public class509(class622 arg0) {
        this.field6674 = arg0;
    }
}
