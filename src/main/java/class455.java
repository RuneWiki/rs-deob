import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class455 extends class126 {

    @OriginalMember(owner = "client!it", name = "F", descriptor = "[Lsm;")
    public static class186[] field6688 = new class186[2048];

    @OriginalMember(owner = "client!it", name = "O", descriptor = "Lqp;")
    public static class466 field6697 = new class466("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!it", name = "u", descriptor = "I")
    private int field6677;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "I")
    private int field6682;

    @OriginalMember(owner = "client!it", name = "E", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!it", name = "G", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!it", name = "H", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!it", name = "I", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!it", name = "J", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!it", name = "K", descriptor = "I")
    private int field6693;

    @OriginalMember(owner = "client!it", name = "L", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!it", name = "M", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!it", name = "N", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!it", name = "P", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!it", name = "R", descriptor = "I")
    private int field6700;

    @OriginalMember(owner = "client!it", name = "T", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "Lml;")
    private class264 field6679;

    @OriginalMember(owner = "client!it", name = "A", descriptor = "Lml;")
    private class264 field6683;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "Lwj;")
    public static class270 field6681;

    @OriginalMember(owner = "client!it", name = "D", descriptor = "Lje;")
    private class276 field6686;

    @OriginalMember(owner = "client!it", name = "Q", descriptor = "Lje;")
    private class276 field6699;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "Lbt;")
    private class33 field6680;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "Lbt;")
    private class33 field6684;

    @OriginalMember(owner = "client!it", name = "C", descriptor = "Lbt;")
    private class33 field6685;

    @OriginalMember(owner = "client!it", name = "S", descriptor = "Lbt;")
    private class33 field6701;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "[Lml;")
    private class264[] field6678;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
    public final void method872(int arg0) {
        ++field6689;
        this.field6679 = null;
        this.field6683 = null;
        this.field6686 = null;
        this.field6685 = null;
        this.field6678 = null;
        this.field6680 = null;
        this.field6699 = null;
        this.field6701 = null;
        if (arg0 <= 18) {
            this.method875(-107, true);
        }
        this.field6684 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V")
    public static final void method2675(int arg0, int arg1) {
        ++field6690;
        class257.method1543((byte) -72);
        class115.method826(true);
        class361.method2165(true, arg1, (byte) 96);
        class65.method561(class364.field5334, class269.field3721, class188.field2726, (byte) 94);
        class132.method904(class364.field5334, class269.field3721, (byte) -128);
        class253.method1518(-10, class134.field1947);
        if (arg0 < 54) {
            field6697 = null;
        }
        class419.method2498(-97);
        class361.method2180(true);
        if (class492.field7178 != 10) {
            if (~class492.field7178 != -31) {
                if (class492.field7178 == 5) {
                    class26.method149(class269.field3721, class364.field5334, (byte) 15);
                    return;
                }
            } else {
                class448.method2651(25, (byte) 112);
            }
        } else {
            class227.method1411(35044, false);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)V")
    public final void method875(int arg0, boolean arg1) {
        ++field6696;
        OpenGL.glUseProgramObjectARB(0L);
        if (arg1) {
            this.field6701 = null;
        }
        super.field1881.method1950(-29847, 1);
        super.field1881.method1996(2, (class40) null);
        super.field1881.method1950(-29847, 0);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILml;ILml;)V")
    public final void method879(int arg0, class264 arg1, int arg2, class264 arg3) {
        ++field6687;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field6678 == null) {
            super.field1881.method1996(arg2 ^ 2, arg3);
            super.field1881.method1939(this.field6686, (byte) 76);
            this.field6686.method1635(false, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field6701.field439;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class242.field3389, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field6682, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field6682, (float) this.field6693);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field6693);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field1881.method1939(this.field6699, (byte) 118);
            int var7 = class498.method2905(this.field6682, (byte) -122);
            int var8 = class498.method2905(this.field6693, (byte) 19);
            int var9 = 0;
            while (~var7 < -257 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field6699.method1649(0, (byte) 17, this.field6678[var9]);
                if (~var9 != -1) {
                    super.field1881.method1996(2, this.field6678[var9 - 1]);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field1881.method1996(2, arg3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field6682, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field6682, (float) this.field6693);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6693);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                if (var7 > 256) {
                    var7 >>= 1;
                }
                ++var9;
            }
            super.field1881.method2009(this.field6699, arg2);
            super.field1881.method1996(2, this.field6678[var9 + -1]);
            super.field1881.method1939(this.field6686, (byte) 81);
            this.field6686.method1635(false, 0);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field6680.field439;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class242.field3389, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field6686.method1635(false, 1);
        super.field1881.method1996(2, this.field6679);
        long var12 = this.field6684.field439;
        OpenGL.glUseProgramObjectARB(var12);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) arg2, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        this.field6686.method1635(false, 0);
        super.field1881.method1996(arg2 ^ 2, this.field6683);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        super.field1881.method2009(this.field6686, 0);
        long var14 = this.field6685.field439;
        OpenGL.glUseProgramObjectARB(var14);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class28.field366, class356.field5200, 0.0F);
        super.field1881.method1950(-29847, 1);
        super.field1881.method1996(2, this.field6679);
        super.field1881.method1950(arg2 + -29847, 0);
        super.field1881.method1996(2, arg3);
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "(B)V")
    public static void method2676(byte arg0) {
        field6681 = null;
        field6697 = null;
        field6688 = null;
        if (arg0 != -103) {
            method2675(31, -64);
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)Z")
    public final boolean method2677(boolean arg0) {
        ++field6695;
        if (arg0) {
            this.field6701 = null;
        }
        return super.field1881.field4798 && super.field1881.field4773 && super.field1881.field4779;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)Z")
    public final boolean method867(byte arg0) {
        ++field6702;
        if (arg0 != 81) {
            return true;
        } else if (super.field1881.field4798 && super.field1881.field4773 && super.field1881.field4779) {
            this.field6686 = new class276(super.field1881);
            this.field6679 = new class264(super.field1881, 3553, 34842, 256, 256);
            this.field6679.method1579(-6746, false, false);
            this.field6683 = new class264(super.field1881, 3553, 34842, 256, 256);
            this.field6683.method1579(-6746, false, false);
            super.field1881.method1939(this.field6686, (byte) 91);
            this.field6686.method1649(0, (byte) 17, this.field6679);
            this.field6686.method1649(1, (byte) 17, this.field6683);
            this.field6686.method1635(false, 0);
            if (!this.field6686.method1631(36053)) {
                super.field1881.method2009(this.field6686, 0);
                return false;
            } else {
                super.field1881.method2009(this.field6686, 0);
                this.field6701 = class209.method1294(new class432[] { class153.method1031(super.field1881, 35632, 1, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, (byte) 3, super.field1881);
                this.field6680 = class209.method1294(new class432[] { class153.method1031(super.field1881, 35632, 1, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, (byte) 3, super.field1881);
                this.field6685 = class209.method1294(new class432[] { class153.method1031(super.field1881, 35632, 1, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, (byte) 3, super.field1881);
                this.field6684 = class209.method1294(new class432[] { class153.method1031(super.field1881, 35632, 1, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, (byte) 3, super.field1881);
                return this.field6680 != null && this.field6701 != null && this.field6685 != null && this.field6684 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lef;)V")
    public class455(class338 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(I)Z")
    public final boolean method873(int arg0) {
        int var2 = -73 / ((arg0 - 52) / 51);
        ++field6692;
        return this.field6686 != null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
    public final void method876(int arg0, int arg1, int arg2) {
        if (arg2 <= 34) {
            this.method874((byte) 5);
        }
        ++field6691;
        this.field6693 = arg0;
        this.field6682 = arg1;
        int var4 = class498.method2905(this.field6682, (byte) -127);
        int var5 = class498.method2905(this.field6693, (byte) 20);
        if (~this.field6677 != ~var4 || ~this.field6700 != ~var5) {
            if (this.field6678 != null) {
                for (int var6 = 0; ~var6 > ~this.field6678.length; ++var6) {
                    this.field6678[var6].method341(-7733);
                }
                this.field6678 = null;
            }
            if (var4 <= 256 && var5 <= 256) {
                this.field6699 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field6699 == null) {
                    this.field6699 = new class276(super.field1881);
                }
                label59: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        this.field6678 = new class264[var9];
                        int var10 = var5;
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && var10 <= 256) {
                                break label59;
                            }
                            this.field6678[var12++] = new class264(super.field1881, 3553, 34842, var11, var10);
                            if (~var10 < -257) {
                                var10 >>= 1;
                            }
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                        }
                    }
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    ++var9;
                }
            }
            this.field6700 = var5;
            this.field6677 = var4;
        }
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(B)I")
    public final int method874(byte arg0) {
        if (arg0 != 80) {
            this.method872(64);
        }
        ++field6694;
        return 1;
    }
}
