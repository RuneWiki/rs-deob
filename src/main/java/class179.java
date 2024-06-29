import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class179 extends class157 {

    @OriginalMember(owner = "client!w", name = "v", descriptor = "F")
    public static float field2418 = 0.25F;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "F")
    public static float field2419 = 1.0F;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "F")
    public static float field2432 = 1.0F;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    private int field2423;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    private int field2426;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Lua;")
    private class435 field2420;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Lua;")
    private class435 field2421;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Loa;")
    private class452 field2417;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Loa;")
    private class452 field2422;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Loa;")
    private class452 field2425;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Loa;")
    private class452 field2427;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Lal;")
    private class58 field2424;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Lal;")
    private class58 field2430;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "[Lal;")
    private class58[] field2429;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()Z", line = 3)
    public final boolean method924() {
        return this.field2421 != null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V", line = 7)
    public final void method922(int arg0, int arg1) {
        this.field2423 = arg0;
        this.field2431 = arg1;
        int var3 = class363.method2210(this.field2423, (byte) 34);
        int var4 = class363.method2210(this.field2431, (byte) 34);
        if (this.field2426 == var3 && this.field2428 == var4) {
            return;
        }
        if (this.field2429 != null) {
            for (int var5 = 0; var5 < this.field2429.length; var5++) {
                this.field2429[var5].method2366();
            }
            this.field2429 = null;
        }
        if (var3 <= 256 && var4 <= 256) {
            this.field2420 = null;
        } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;
            label61: while (true) {
                if (var6 <= 256 && var7 <= 256) {
                    if (this.field2420 == null) {
                        this.field2420 = new class435(this.field2172);
                    }
                    this.field2429 = new class58[var8];
                    int var9 = var3;
                    int var10 = var4;
                    int var11 = 0;
                    while (true) {
                        if (var9 <= 256 && var10 <= 256) {
                            break label61;
                        }
                        this.field2429[var11++] = new class58(this.field2172, 3553, 34842, var9, var10);
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
        this.field2426 = var3;
        this.field2428 = var4;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()I", line = 79)
    public final int method917() {
        return 1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()Z", line = 82)
    public final boolean method916() {
        if (!this.field2172.field4656 || !this.field2172.field4655 || !this.field2172.field4714) {
            return false;
        }
        this.field2421 = new class435(this.field2172);
        this.field2430 = new class58(this.field2172, 3553, 34842, 256, 256);
        this.field2430.method415(false, false);
        this.field2424 = new class58(this.field2172, 3553, 34842, 256, 256);
        this.field2424.method415(false, false);
        this.field2172.method2028(this.field2421);
        this.field2421.method2561(0, this.field2430);
        this.field2421.method2561(1, this.field2424);
        this.field2421.method2563(0);
        if (!this.field2421.method2566()) {
            this.field2172.method2063(this.field2421);
            return false;
        }
        this.field2172.method2063(this.field2421);
        this.field2422 = class452.method2655(this.field2172, new class81[] { class81.method527(this.field2172, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field2427 = class452.method2655(this.field2172, new class81[] { class81.method527(this.field2172, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
        this.field2417 = class452.method2655(this.field2172, new class81[] { class81.method527(this.field2172, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
        this.field2425 = class452.method2655(this.field2172, new class81[] { class81.method527(this.field2172, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
        return this.field2427 != null && this.field2422 != null && this.field2417 != null && this.field2425 != null;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()V", line = 113)
    public final void method921() {
        this.field2420 = null;
        this.field2429 = null;
        this.field2421 = null;
        this.field2430 = null;
        this.field2424 = null;
        this.field2422 = null;
        this.field2427 = null;
        this.field2417 = null;
        this.field2425 = null;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()Z", line = 128)
    public final boolean method1018() {
        return this.field2172.field4656 && this.field2172.field4655 && this.field2172.field4714;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 131)
    public final void method923(int arg0) {
        this.field2172.field4604.glUseProgramObjectARB(0);
        this.field2172.method2067(1);
        this.field2172.method2106((class386) null);
        this.field2172.method2067(0);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lbf;)V", line = 139)
    public class179(class344 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILal;Lal;)V", line = 146)
    public final void method925(int arg0, class58 arg1, class58 arg2) {
        opengl var4 = this.field2172.field4604;
        var4.glPushAttrib(2048);
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field2429 == null) {
            this.field2172.method2106(arg1);
            this.field2172.method2028(this.field2421);
            this.field2421.method2563(0);
            var4.glViewport(0, 0, 256, 256);
            int var9 = this.field2422.field6142;
            var4.glUseProgramObjectARB(var9);
            var4.glUniform1iARB(var4.glGetUniformLocation(var9, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var9, "params"), field2432, 0.0F, 0.0F);
            var4.glBegin(7);
            var4.glTexCoord2f(0.0F, 0.0F);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2f((float) this.field2423, 0.0F);
            var4.glVertex2i(1, 0);
            var4.glTexCoord2f((float) this.field2423, (float) this.field2431);
            var4.glVertex2i(1, 1);
            var4.glTexCoord2f(0.0F, (float) this.field2431);
            var4.glVertex2i(0, 1);
            var4.glEnd();
        } else {
            this.field2172.method2028(this.field2420);
            int var5 = class363.method2210(this.field2423, (byte) 34);
            int var6 = class363.method2210(this.field2431, (byte) 34);
            int var7 = 0;
            while (var5 > 256 || var6 > 256) {
                var4.glViewport(0, 0, var5, var6);
                this.field2420.method2561(0, this.field2429[var7]);
                if (var7 == 0) {
                    this.field2172.method2106(arg1);
                    var4.glBegin(7);
                    var4.glTexCoord2f(0.0F, 0.0F);
                    var4.glVertex2i(0, 0);
                    var4.glTexCoord2f((float) this.field2423, 0.0F);
                    var4.glVertex2i(1, 0);
                    var4.glTexCoord2f((float) this.field2423, (float) this.field2431);
                    var4.glVertex2i(1, 1);
                    var4.glTexCoord2f(0.0F, (float) this.field2431);
                    var4.glVertex2i(0, 1);
                    var4.glEnd();
                } else {
                    this.field2172.method2106(this.field2429[var7 - 1]);
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
            this.field2172.method2063(this.field2420);
            this.field2172.method2106(this.field2429[var7 - 1]);
            this.field2172.method2028(this.field2421);
            this.field2421.method2563(0);
            var4.glViewport(0, 0, 256, 256);
            int var8 = this.field2427.field6142;
            var4.glUseProgramObjectARB(var8);
            var4.glUniform1iARB(var4.glGetUniformLocation(var8, "sceneTex"), 0);
            var4.glUniform3fARB(var4.glGetUniformLocation(var8, "params"), field2432, 0.0F, 0.0F);
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
        this.field2421.method2563(1);
        this.field2172.method2106(this.field2430);
        int var10 = this.field2425.field6142;
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
        this.field2421.method2563(0);
        this.field2172.method2106(this.field2424);
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
        this.field2172.method2063(this.field2421);
        int var11 = this.field2417.field6142;
        var4.glUseProgramObjectARB(var11);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "sceneTex"), 0);
        var4.glUniform1iARB(var4.glGetUniformLocation(var11, "bloomTex"), 1);
        var4.glUniform3fARB(var4.glGetUniformLocation(var11, "params"), field2418, field2419, 0.0F);
        this.field2172.method2067(1);
        this.field2172.method2106(this.field2430);
        this.field2172.method2067(0);
        this.field2172.method2106(arg1);
    }
}
