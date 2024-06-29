import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class343 {

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "Lus;")
    private class1 field5102;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "Lsb;")
    public static class266 field5103 = new class266(28, 0);

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "Lqfa;")
    public static class85 field5106 = new class85(64, 2);

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "[C")
    public static char[] field5108 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "Lph;")
    public static class598 field5107 = new class598(3, 2);

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5109 = new String[200];

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "[I")
    public static int[] field5110 = new int[3];

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "Ltaa;")
    private class377 field5105;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljba;BLjba;F)Z")
    public final boolean method2206(class368 arg0, byte arg1, class368 arg2, float arg3) {
        field5100++;
        if (!this.method2207(-73)) {
            return false;
        }
        if (arg1 >= -27) {
            this.field5105 = null;
        }
        class323 var5 = this.field5102.field340;
        class540 var6 = new class540(this.field5102, 6408, arg0.field5449, arg0.field5448);
        boolean var7 = false;
        this.field5102.method60(var5, (byte) -92);
        var5.method2095((byte) -9, 0, var6);
        if (var5.method2081((byte) 64)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field5449, arg0.field5448);
            OpenGL.glUseProgramObjectARB(this.field5105.field5600);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field5105.field5600, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field5105.field5600, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field5105.field5600, "sampleSize"), 1.0F / (float) arg2.field5449, 1.0F / (float) arg2.field5448);
            for (int var8 = 0; var8 < arg0.field5447; var8++) {
                float var9 = (float) var8 / (float) arg0.field5447;
                this.field5102.method5(3845, arg2);
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
                arg0.method2326(0, arg0.field5448, 0, 0, arg0.field5449, 0, 0, var8);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method2074(0, -80);
        this.field5102.method141(2131, var5);
        return var7;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)Z")
    public final boolean method2207(int arg0) {
        field5104++;
        int var2 = -71 / ((arg0 - 61) / 52);
        if (this.field5102.field278 && this.field5102.field358 && this.field5105 == null) {
            class264 var3 = class469.method2798(35632, this.field5102, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 0);
            if (var3 != null) {
                this.field5105 = class70.method786(0, new class264[] { var3 }, this.field5102);
            }
        }
        return this.field5105 != null;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
    public static void method2208(int arg0) {
        field5103 = null;
        field5108 = null;
        field5110 = null;
        field5107 = null;
        field5106 = null;
        field5109 = null;
        if (arg0 != 1) {
            field5110 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIII)V")
    public static final void method2209(int arg0, int arg1, int arg2, int arg3) {
        field5101++;
        if (arg0 != 5665) {
            field5110 = null;
        }
        class19 var4 = class373.method2355(106, arg3, 11);
        var4.method432(56);
        var4.field833 = arg2;
        var4.field829 = arg1;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lus;)V")
    public class343(class1 arg0) {
        this.field5102 = arg0;
    }
}
