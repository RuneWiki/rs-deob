import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class65 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lbo;")
    private class511 field1011;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
    public static int[] field1013 = new int[5];

    @OriginalMember(owner = "client!al", name = "f", descriptor = "J")
    public static long field1016 = 0L;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Leu;")
    private class333 field1018;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 12)
    public static void method444(int arg0) {
        if (arg0 == 33) {
            field1013 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IFLfb;Lfb;)Z", line = 22)
    public final boolean method445(int arg0, float arg1, class474 arg2, class474 arg3) {
        field1012++;
        if (!this.method447(arg0 + 119)) {
            return false;
        }
        class48 var5 = this.field1011.field7478;
        class488 var6 = new class488(this.field1011, 6408, arg2.field6546, arg2.field6551);
        this.field1011.method2938(var5, 10);
        boolean var7 = false;
        var5.method350((byte) -23, var6, 0);
        if (var5.method366((byte) 23)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg2.field6546, arg2.field6551);
            OpenGL.glUseProgramObjectARB(this.field1018.field4375);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field1018.field4375, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field1018.field4375, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field1018.field4375, "sampleSize"), 1.0F / (float) arg3.field6546, 1.0F / (float) arg3.field6551);
            for (int var8 = 0; var8 < arg2.field6552; var8++) {
                float var9 = (float) var8 / (float) arg2.field6552;
                this.field1011.method2980(arg3, arg0 + 121);
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
                arg2.method2731(0, 0, 0, arg2.field6551, var8, arg2.field6546, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method362(arg0 + 7553, arg0);
        this.field1011.method2942(2, var5);
        return var7;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lqk;", line = 89)
    public static final class14 method446(int arg0, int arg1) {
        field1014++;
        if (arg0 == 0) {
            return new class115();
        } else if (arg0 == 1) {
            return new class229();
        } else if (arg0 == 2) {
            return new class246();
        } else if (arg0 == 3) {
            return new class471();
        } else if (arg0 == 4) {
            return new class28();
        } else if (arg0 == 5) {
            return new class461();
        } else if (arg0 == 6) {
            return new class129();
        } else if (arg0 == 7) {
            return new class200();
        } else if (arg0 == 8) {
            return new class265();
        } else if (arg0 == 9) {
            return new class466();
        } else if (arg0 == 10) {
            return new class300();
        } else if (arg0 == 11) {
            return new class339();
        } else if (arg0 == 12) {
            return new class448();
        } else if (arg0 == 13) {
            return new class281();
        } else if (arg0 == 14) {
            return new class141();
        } else if (arg0 == 15) {
            return new class53();
        } else if (arg0 == 16) {
            return new class78();
        } else if (arg0 == 17) {
            return new class249();
        } else if (arg0 == 18) {
            return new class269();
        } else if (arg0 == 19) {
            return new class43();
        } else if (arg0 == 20) {
            return new class67();
        } else if (arg0 == 21) {
            return new class19();
        } else if (arg0 == 22) {
            return new class507();
        } else if (arg0 == 23) {
            return new class481();
        } else if (arg0 == 24) {
            return new class319();
        } else if (arg0 == 25) {
            return new class337();
        } else if (arg0 == 26) {
            return new class470();
        } else if (arg0 == 27) {
            return new class260();
        } else if (arg0 == 28) {
            return new class61();
        } else if (arg0 == 29) {
            return new class80();
        } else if (arg0 == 30) {
            return new class186();
        } else if (arg0 == 31) {
            return new class125();
        } else if (arg0 == 32) {
            return new class393();
        } else if (arg0 == 33) {
            return new class335();
        } else if (arg0 == 34) {
            return new class120();
        } else if (arg0 == 35) {
            return new class359();
        } else if (arg0 == 36) {
            return new class247();
        } else if (arg0 == 37) {
            return new class116();
        } else if (arg0 == 38) {
            return new class59();
        } else if (arg0 == 39) {
            return new class306();
        } else {
            if (arg1 != -20) {
                method444(117);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z", line = 411)
    public final boolean method447(int arg0) {
        if (this.field1011.field7510 && this.field1011.field7429 && this.field1018 == null) {
            class191 var2 = class258.method1561("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35716, this.field1011, 35632);
            if (var2 != null) {
                this.field1018 = class47.method335(this.field1011, new class191[] { var2 }, true);
            }
        }
        int var3 = 66 / ((50 - arg0) / 36);
        field1015++;
        return this.field1018 != null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lbo;)V", line = 443)
    public class65(class511 arg0) {
        this.field1011 = arg0;
    }
}
