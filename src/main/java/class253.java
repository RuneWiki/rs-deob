import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class253 extends class120 {

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "F")
    public static float field3628 = 1.0F;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "F")
    public static float field3625 = 1.0F;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "F")
    public static float field3640 = 0.25F;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    private int field3626;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    private int field3635;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    private int field3637;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    private int field3638;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "Lhm;")
    private class148 field3634;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "Lhm;")
    private class148 field3636;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "Lin;")
    private class234 field3629;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "Lin;")
    private class234 field3630;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "Lin;")
    private class234 field3631;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "Lin;")
    private class234 field3632;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "Luo;")
    private class429 field3633;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Luo;")
    private class429 field3639;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "[Luo;")
    private class429[] field3627;

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lfu;)V")
    public class253(class42 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "()I")
    public final int method934() {
        return 1;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "()V")
    public final void method930() {
        this.field3636 = null;
        this.field3627 = null;
        this.field3634 = null;
        this.field3639 = null;
        this.field3633 = null;
        this.field3632 = null;
        this.field3629 = null;
        this.field3631 = null;
        this.field3630 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public final void method928(int arg0, int arg1) {
        this.field3637 = arg0;
        this.field3635 = arg1;
        int var3 = class2.method10(-1, this.field3637);
        int var4 = class2.method10(-1, this.field3635);
        if (this.field3626 == var3 && this.field3638 == var4) {
            return;
        }
        if (this.field3627 != null) {
            for (int var5 = 0; var5 < this.field3627.length; var5++) {
                this.field3627[var5].method2300();
            }
            this.field3627 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field3636 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field3636 == null) {
                        this.field3636 = new class148(this.field1657);
                    }
                    this.field3627 = new class429[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field3627[var11++] = new class429(this.field1657, 3553, 34842, var9, var10);
                        if (var9 > 256) {
                            var9 >>= 0x1;
                        }
                        if (var10 > 256) {
                            var10 >>= 0x1;
                        }
                    }
                }
                if (var6 > 256) {
                    var6 >>= 0x1;
                }
                if (var7 > 256) {
                    var7 >>= 0x1;
                }
                var8++;
            }
        }
        this.field3626 = var3;
        this.field3638 = var4;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "()Z")
    public final boolean method927() {
        return this.field3634 != null;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
    public final void method931(int arg0) {
        this.field1657.field557.glUseProgramObjectARB(0);
        this.field1657.method407(1);
        this.field1657.method303((class375) null);
        this.field1657.method407(0);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILuo;Luo;)V")
    public final void method929(int arg0, class429 arg1, class429 arg2) {
        opengl var4 = this.field1657.field557;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field3627 == null) {
            this.field1657.method303(arg1);
            this.field1657.method319(this.field3634);
            this.field3634.method1054(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field3632.field3407;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field3625, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field3637, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field3637, (float) this.field3635);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field3635);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field1657.method319(this.field3636);
            int var5 = class2.method10(-1, this.field3637);
            int var6 = class2.method10(-1, this.field3635);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field3636.method1051(0, this.field3627[var7]);
                if (var7 == 0) {
                    this.field1657.method303(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field3637, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field3637, (float) this.field3635);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field3635);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field1657.method303(this.field3627[var7 - 1]);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f(1.0F, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f(1.0F, 1.0F);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, 1.0F);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                }
                if (var5 > 256) {
                    var5 >>= 0x1;
                }
                if (var6 > 256) {
                    var6 >>= 0x1;
                }
                var7++;
            }
            this.field1657.method413(this.field3636);
            this.field1657.method303(this.field3627[var7 - 1]);
            this.field1657.method319(this.field3634);
            this.field3634.method1054(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field3629.field3407;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field3625, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f(1.0F, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f(1.0F, 1.0F);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, 1.0F);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        }
        this.field3634.method1054(1);
        this.field1657.method303(this.field3639);
        int var10 = this.field3630.field3407;
        var4.glUseProgramObjectARB(var10);
        var4.glUniform1iARB(var4.glGetUniformLocation(var10, "baseTex"), 0);
        var4.glUniform3fARB(var4.glGetUniformLocation(var10, "step"), 0.00390625F, 0.0F, 0.0F);
        var4.glBegin(7);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2i(0, 0);
        var4.glTexCoord2f(1.0F, 0.0F);
        var4.glVertex2i(1, 0);
        var4.glTexCoord2f(1.0F, 1.0F);
        var4.glVertex2i(1, 1);
        var4.glTexCoord2f(0.0F, 1.0F);
        var4.glVertex2i(0, 1);
        var4.glEnd();
        this.field3634.method1054(0);
        this.field1657.method303(this.field3633);
        var4.glUniform3fARB(var4.glGetUniformLocation(var10, "step"), 0.0F, 0.00390625F, 0.0F);
        var4.glBegin(7);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2i(0, 0);
        var4.glTexCoord2f(1.0F, 0.0F);
        var4.glVertex2i(1, 0);
        var4.glTexCoord2f(1.0F, 1.0F);
        var4.glVertex2i(1, 1);
        var4.glTexCoord2f(0.0F, 1.0F);
        var4.glVertex2i(0, 1);
        var4.glEnd();
        var4.glPopAttrib();
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        this.field1657.method413(this.field3634);
        int var11 = this.field3631.field3407;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field3640, field3628, 0.0F);
        this.field1657.method407(1);
        this.field1657.method303(this.field3639);
        this.field1657.method407(0);
        this.field1657.method303(arg1);
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "()Z")
    public final boolean method1721() {
        return this.field1657.field693 && this.field1657.field677 && this.field1657.field676;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()Z")
    public final boolean method926() {
        if (!this.field1657.field693 || !this.field1657.field677 || !this.field1657.field676) {
            return false;
        }
        this.field3634 = new class148(this.field1657);
        this.field3639 = new class429(this.field1657, 3553, 34842, 256, 256);
        this.field3639.method2564(false, false);
        this.field3633 = new class429(this.field1657, 3553, 34842, 256, 256);
        this.field3633.method2564(false, false);
        this.field1657.method319(this.field3634);
        this.field3634.method1051(0, this.field3639);
        this.field3634.method1051(1, this.field3633);
        this.field3634.method1054(0);
        if (!this.field3634.method1053()) {
            this.field1657.method413(this.field3634);
            return false;
        }
        this.field1657.method413(this.field3634);
        this.field3632 = class234.method1639(this.field1657, new class376[] { class376.method2303(this.field1657, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field3629 = class234.method1639(this.field1657, new class376[] { class376.method2303(this.field1657, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field3631 = class234.method1639(this.field1657, new class376[] { class376.method2303(this.field1657, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field3630 = class234.method1639(this.field1657, new class376[] { class376.method2303(this.field1657, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field3629 != null && this.field3632 != null && this.field3631 != null && this.field3630 != null;
    }
}
