import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class433 extends class168 {

    @OriginalMember(owner = "client!g", name = "m", descriptor = "F")
    public static float field6363 = 1.0F;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "F")
    public static float field6369 = 0.25F;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "F")
    public static float field6374 = 1.0F;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    private int field6365;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    private int field6373;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    private int field6377;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    private int field6378;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lng;")
    private class113 field6366;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lng;")
    private class113 field6367;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Lng;")
    private class113 field6371;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "Lng;")
    private class113 field6376;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lir;")
    private class216 field6364;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Lir;")
    private class216 field6368;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "Lej;")
    private class74 field6370;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Lej;")
    private class74 field6372;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "[Lir;")
    private class216[] field6375;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "()Z", line = 5)
    public final boolean method2738() {
        return this.field2268.field3718 && this.field2268.field3755 && this.field2268.field3719;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V", line = 14)
    public final void method1039(int arg0, int arg1) {
        this.field6377 = arg0;
        this.field6373 = arg1;
        int var3 = class298.method2043(this.field6377, -118);
        int var4 = class298.method2043(this.field6373, -121);
        if (this.field6378 == var3 && this.field6365 == var4) {
            return;
        }
        if (this.field6375 != null) {
            for (int var5 = 0; var5 < this.field6375.length; var5++) {
                this.field6375[var5].method2356();
            }
            this.field6375 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field6370 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field6370 == null) {
                        this.field6370 = new class74(this.field2268);
                    }
                    this.field6375 = new class216[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field6375[var11++] = new class216(this.field2268, 3553, 34842, var9, var10);
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
        this.field6378 = var3;
        this.field6365 = var4;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()Z", line = 82)
    public final boolean method1035() {
        if (!this.field2268.field3718 || !this.field2268.field3755 || !this.field2268.field3719) {
            return false;
        }
        this.field6372 = new class74(this.field2268);
        this.field6364 = new class216(this.field2268, 3553, 34842, 256, 256);
        this.field6364.method1271(false, false);
        this.field6368 = new class216(this.field2268, 3553, 34842, 256, 256);
        this.field6368.method1271(false, false);
        this.field2268.method1725(this.field6372);
        this.field6372.method551(0, this.field6364);
        this.field6372.method551(1, this.field6368);
        this.field6372.method544(0);
        if (!this.field6372.method543()) {
            this.field2268.method1765(this.field6372);
            return false;
        }
        this.field2268.method1765(this.field6372);
        this.field6371 = class113.method734(this.field2268, new class326[] { class326.method2181(this.field2268, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field6366 = class113.method734(this.field2268, new class326[] { class326.method2181(this.field2268, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field6367 = class113.method734(this.field2268, new class326[] { class326.method2181(this.field2268, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field6376 = class113.method734(this.field2268, new class326[] { class326.method2181(this.field2268, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field6366 != null && this.field6371 != null && this.field6367 != null && this.field6376 != null;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "()V", line = 117)
    public final void method1037() {
        this.field6370 = null;
        this.field6375 = null;
        this.field6372 = null;
        this.field6364 = null;
        this.field6368 = null;
        this.field6371 = null;
        this.field6366 = null;
        this.field6367 = null;
        this.field6376 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lnf;)V", line = 128)
    public class433(class256 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V", line = 140)
    public final void method1038(int arg0) {
        this.field2268.field3634.glUseProgramObjectARB(0);
        this.field2268.method1777(1);
        this.field2268.method1669((class360) null);
        this.field2268.method1777(0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILir;Lir;)V", line = 147)
    public final void method1042(int arg0, class216 arg1, class216 arg2) {
        opengl var4 = this.field2268.field3634;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6375 == null) {
            this.field2268.method1669(arg1);
            this.field2268.method1725(this.field6372);
            this.field6372.method544(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field6371.field1601;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field6363, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field6377, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field6377, (float) this.field6373);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field6373);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field2268.method1725(this.field6370);
            int var5 = class298.method2043(this.field6377, -121);
            int var6 = class298.method2043(this.field6373, -119);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field6370.method551(0, this.field6375[var7]);
                if (var7 == 0) {
                    this.field2268.method1669(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field6377, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field6377, (float) this.field6373);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field6373);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field2268.method1669(this.field6375[var7 - 1]);
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
            this.field2268.method1765(this.field6370);
            this.field2268.method1669(this.field6375[var7 - 1]);
            this.field2268.method1725(this.field6372);
            this.field6372.method544(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field6366.field1601;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field6363, 0.0F, 0.0F);
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
        this.field6372.method544(1);
        this.field2268.method1669(this.field6364);
        int var10 = this.field6376.field1601;
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
        this.field6372.method544(0);
        this.field2268.method1669(this.field6368);
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
        this.field2268.method1765(this.field6372);
        int var11 = this.field6367.field1601;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field6369, field6374, 0.0F);
        this.field2268.method1777(1);
        this.field2268.method1669(this.field6364);
        this.field2268.method1777(0);
        this.field2268.method1669(arg1);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "()I", line = 294)
    public final int method1036() {
        return 1;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "()Z", line = 302)
    public final boolean method1041() {
        return this.field6372 != null;
    }
}
