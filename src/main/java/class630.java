import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class630 {

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "Lag;")
    private class469 field8718;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "Led;")
    public static class116 field8719 = new class116();

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "[F")
    public static float[] field8723 = new float[16];

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field8726 = 0;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "F")
    public static float field8725;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "Lga;")
    public static class332 field8722;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Lte;")
    private class490 field8713;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "Leba;")
    public static class550 field8724;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)Z")
    public final boolean method3486(int arg0) {
        if (this.field8718.field6507 && this.field8718.field6454 && this.field8713 == null) {
            class451 var2 = class362.method2116((byte) -48, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field8718, 35632);
            if (var2 != null) {
                this.field8713 = class482.method2780((byte) -53, this.field8718, new class451[] { var2 });
            }
        }
        int var3 = -55 % ((arg0 + 26) / 49);
        field8714++;
        return this.field8713 != null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII)Z")
    public static final boolean method3487(byte arg0, int arg1, int arg2) {
        if (arg0 != -67) {
            method3487((byte) -22, 49, -49);
        }
        field8717++;
        return class614.method3397(arg1, 0, arg2) || class472.method2727(arg2, arg1, -16489);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public static final void method3488(int arg0) {
        if (arg0 != 0) {
            method3491(null, -77, 30, 41, null, null);
        }
        field8720++;
        if (class548.field7502 != null) {
            class548.field7502.method3127(true);
            class548.field7502 = null;
            class523.field7235 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lpd;FZLpd;)Z")
    public final boolean method3489(class428 arg0, float arg1, boolean arg2, class428 arg3) {
        field8721++;
        if (!this.method3486(-114)) {
            return false;
        }
        class560 var5 = this.field8718.field6534;
        class72 var6 = new class72(this.field8718, 6408, arg3.field5763, arg3.field5759);
        boolean var7 = arg2;
        this.field8718.method2673(var5, 128);
        var5.method3112(1, var6, 0);
        if (var5.method3113((byte) 126)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field5763, arg3.field5759);
            OpenGL.glUseProgramObjectARB(this.field8713.field6786);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field8713.field6786, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field8713.field6786, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field8713.field6786, "sampleSize"), 1.0F / (float) arg0.field5763, 1.0F / (float) arg0.field5759);
            for (int var8 = 0; var8 < arg3.field5772; var8++) {
                float var9 = (float) var8 / (float) arg3.field5772;
                this.field8718.method2627(105, arg0);
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
                arg3.method2420(0, arg3.field5763, 4, var8, 0, 0, arg3.field5759, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method3105((byte) 107, 0);
        this.field8718.method2621((byte) -86, var5);
        return var7;
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V")
    public static void method3490(int arg0) {
        field8723 = null;
        int var1 = 119 % ((arg0 + 27) / 60);
        field8719 = null;
        field8724 = null;
        field8722 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([IIIILqq;[I)Llda;")
    public static final class200 method3491(int[] arg0, int arg1, int arg2, int arg3, class651 arg4, int[] arg5) {
        field8715++;
        if (arg1 < 67) {
            return null;
        } else if (arg4.method2037(class404.field5338, class635.field8783, (byte) 51)) {
            byte[] var10 = new byte[arg2 * arg3];
            for (int var11 = 0; var11 < arg2; var11++) {
                int var12 = arg3 * var11 + arg5[var11];
                for (int var13 = 0; var13 < arg0[var11]; var13++) {
                    var10[var12++] = -1;
                }
            }
            return new class200(arg4, arg3, arg2, var10);
        } else {
            int[] var6 = new int[arg2 * arg3];
            for (int var7 = 0; var7 < arg2; var7++) {
                int var8 = arg3 * var7 + arg5[var7];
                for (int var9 = 0; var9 < arg0[var7]; var9++) {
                    var6[var8++] = -16777216;
                }
            }
            return new class200(arg4, arg3, arg2, var6);
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lag;)V")
    public class630(class469 arg0) {
        this.field8718 = arg0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/awt/Canvas;Lfa;I)Lr;")
    public static final class562 method3492(Canvas arg0, class522 arg1, int arg2) {
        field8716++;
        if (arg2 <= 9) {
            field8719 = null;
        }
        return new class168(arg0, arg1);
    }
}
