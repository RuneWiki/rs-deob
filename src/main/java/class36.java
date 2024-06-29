import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class36 {

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "Lih;")
    private class503 field405;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "[I")
    public static int[] field399 = new int[13];

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Lre;")
    private class435 field404;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIZII)V", line = 10)
    public static final void method202(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            method207((char) 65526, (byte) 120);
        }
        for (int var5 = 0; var5 < class449.field6257; var5++) {
            Rectangle var6 = class95.field1226[var5];
            if (arg1 < var6.x + var6.width && arg1 + arg4 > var6.x && arg3 < (var6.y + var6.height) && var6.y < arg0 + arg3) {
                class531.field7773[var5] = true;
            }
        }
        field400++;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(FLem;ILem;)Z", line = 40)
    public final boolean method203(float arg0, class153 arg1, int arg2, class153 arg3) {
        field402++;
        if (!this.method206(-12071)) {
            return false;
        }
        class146 var5 = this.field405.field7381;
        class466 var6 = new class466(this.field405, 6408, arg1.field2196, arg1.field2202);
        boolean var7 = false;
        this.field405.method2928(var5, (byte) -91);
        var5.method913(0, -1, var6);
        if (var5.method916((byte) 127)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field2196, arg1.field2202);
            OpenGL.glUseProgramObjectARB(this.field404.field6111);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field404.field6111, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field404.field6111, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field404.field6111, "sampleSize"), 1.0F / (float) arg3.field2196, 1.0F / (float) arg3.field2202);
            for (int var8 = 0; var8 < arg1.field2200; var8++) {
                float var9 = (float) var8 / (float) arg1.field2200;
                this.field405.method2968(arg3, arg2 - 1914);
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
                arg1.method981(arg1.field2196, arg1.field2202, 0, 0, var8, 0, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method906((byte) 87, 0);
        this.field405.method2931(false, var5);
        return arg2 == 1840 ? var7 : false;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 110)
    public static void method204(int arg0) {
        field399 = null;
        if (arg0 != 0) {
            field399 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)Z", line = 120)
    public static final boolean method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field401++;
        if ((class368.field5253[0][arg2][arg3] & 0x2) != 0) {
            return true;
        } else if ((class368.field5253[arg4][arg2][arg3] & 0x10) == arg1) {
            return arg0 == class328.method1974(arg3, arg2, (byte) -124, arg4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)Z", line = 141)
    public final boolean method206(int arg0) {
        if (arg0 != -12071) {
            this.method206(124);
        }
        if (this.field405.field7432 && this.field405.field7346 && this.field404 == null) {
            class110 var2 = class316.method1906("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", (byte) -76, this.field405, 35632);
            if (var2 != null) {
                this.field404 = class19.method102(arg0 ^ 0x2F6E, this.field405, new class110[] { var2 });
            }
        }
        field403++;
        return this.field404 != null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(CB)Z", line = 167)
    public static final boolean method207(char arg0, byte arg1) {
        field398++;
        int var2 = 2 % ((arg1 + 29) / 61);
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class64.method513(false, arg0)) {
            return true;
        } else {
            char[] var3 = class285.field4181;
            for (int var4 = 0; var4 < var3.length; var4++) {
                char var8 = var3[var4];
                if (arg0 == var8) {
                    return true;
                }
            }
            char[] var5 = class471.field6571;
            for (int var6 = 0; var6 < var5.length; var6++) {
                char var7 = var5[var6];
                if (arg0 == var7) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lih;)V", line = 212)
    public class36(class503 arg0) {
        this.field405 = arg0;
    }
}
