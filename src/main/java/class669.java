import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class669 {

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "Ldw;")
    private class664 field9232;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "[Z")
    public static boolean[] field9236 = new boolean[100];

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public static int field9237 = 0;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "[Lgl;")
    public static class396[] field9235 = new class396[50];

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "Lqi;")
    public static class293 field9239 = new class293(64);

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "Lcba;")
    private class54 field9233;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method3771(int arg0) {
        field9236 = null;
        field9239 = null;
        field9235 = null;
        int var1 = -42 / ((arg0 - 15) / 61);
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)Z")
    public final boolean method3772(int arg0) {
        field9234++;
        if (arg0 > -85) {
            field9236 = null;
        }
        if (this.field9232.field9108 && this.field9232.field9058 && this.field9233 == null) {
            class193 var2 = class694.method3921(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 0, this.field9232);
            if (var2 != null) {
                this.field9233 = class651.method3644(new class193[] { var2 }, this.field9232, (byte) 84);
            }
        }
        return this.field9233 != null;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILfj;Lfj;F)Z")
    public final boolean method3773(int arg0, class659 arg1, class659 arg2, float arg3) {
        field9240++;
        if (!this.method3772(-124)) {
            return false;
        }
        class665 var5 = this.field9232.field9111;
        class473 var6 = new class473(this.field9232, 6408, arg1.field8774, arg1.field8780);
        boolean var7 = false;
        this.field9232.method3695(var5, -17015);
        var5.method3754(85, var6, 0);
        if (var5.method3755(0)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field8774, arg1.field8780);
            OpenGL.glUseProgramObjectARB(this.field9233.field777);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field9233.field777, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field9233.field777, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field9233.field777, "sampleSize"), 1.0F / (float) arg2.field8774, 1.0F / (float) arg2.field8780);
            for (int var8 = 0; var8 < arg1.field8779; var8++) {
                float var9 = (float) var8 / (float) arg1.field8779;
                this.field9232.method3681(arg2, 0);
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
                arg1.method3666(0, 0, arg1.field8780, 0, 0, arg1.field8774, var8, -20156);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method3757(0, false);
        this.field9232.method3694(var5, (byte) -126);
        if (arg0 < 74) {
            field9237 = -54;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Z")
    public static final boolean method3774(int arg0, int arg1) {
        if (arg1 != 0) {
            return true;
        }
        field9238++;
        if (arg0 == 23 || arg0 == 19 || arg0 == 16 || arg0 == 57 || arg0 == 1001) {
            return true;
        } else {
            return arg0 == 20 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ldw;)V")
    public class669(class664 arg0) {
        this.field9232 = arg0;
    }
}
