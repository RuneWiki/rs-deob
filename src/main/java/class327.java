import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class327 {

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "Lkv;")
    private class280 field4887;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
    public static int field4890 = 0;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lpd;")
    public static class267 field4885 = new class267();

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!hfa", name = "j", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lgb;")
    private class223 field4886;

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "[S")
    public static short[] field4891;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4888++;
        if (arg7 >= -99) {
            method2119((byte) -92);
        }
        if (arg6 == arg9 && arg0 == arg4 && arg1 == arg3 && arg2 == arg5) {
            class634.method3613(arg4, arg2, 16, arg3, arg6, arg8);
            return;
        }
        int var10 = arg6;
        int var11 = arg4;
        int var12 = arg6 * 3;
        int var13 = arg4 * 3;
        int var14 = arg9 * 3;
        int var15 = arg0 * 3;
        int var16 = arg1 * 3;
        int var17 = arg5 * 3;
        int var18 = var14 + arg3 - var16 - arg6;
        int var19 = arg2 + var15 - arg4 - var17;
        int var20 = var16 - var14 - (var14 - var12);
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg6;
            int var34 = arg4 + (var30 + var32 + var28 >> 12);
            class634.method3613(var11, var34, 38, var33, var10, arg8);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)Z")
    public final boolean method2118(byte arg0) {
        field4884++;
        if (this.field4887.field4285 && this.field4887.field4287 && this.field4886 == null) {
            class466 var2 = class535.method3097(35632, true, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field4887);
            if (var2 != null) {
                this.field4886 = class435.method2606(new class466[] { var2 }, this.field4887, false);
            }
        }
        if (arg0 <= 92) {
            method2119((byte) -68);
        }
        return this.field4886 != null;
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(B)V")
    public static void method2119(byte arg0) {
        field4891 = null;
        field4885 = null;
        if (arg0 != -66) {
            method2117(-113, 76, 14, 43, 89, 90, 46, 108, -59, 75);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IFLkga;Lkga;)Z")
    public final boolean method2120(int arg0, float arg1, class569 arg2, class569 arg3) {
        field4889++;
        if (!this.method2118((byte) 106)) {
            return false;
        }
        class50 var5 = this.field4887.field4217;
        if (arg0 != 1) {
            field4892 = -105;
        }
        class694 var6 = new class694(this.field4887, 6408, arg3.field8057, arg3.field8055);
        this.field4887.method1882(var5, false);
        boolean var7 = false;
        var5.method339(0, var6, false);
        if (var5.method336((byte) -31)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field8057, arg3.field8055);
            OpenGL.glUseProgramObjectARB(this.field4886.field3200);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field4886.field3200, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field4886.field3200, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field4886.field3200, "sampleSize"), 1.0F / (float) arg2.field8057, 1.0F / (float) arg2.field8055);
            for (int var8 = 0; var8 < arg3.field8058; var8++) {
                float var9 = (float) var8 / (float) arg3.field8058;
                this.field4887.method1840(arg2, 2205);
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
                arg3.method3306(0, var8, arg3.field8055, (byte) -125, 0, 0, arg3.field8057, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method332(0, (byte) 127);
        this.field4887.method1861(var5, (byte) 94);
        return var7;
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lkv;)V")
    public class327(class280 arg0) {
        this.field4887 = arg0;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZIII)I")
    public static final int method2121(boolean arg0, int arg1, int arg2, int arg3) {
        field4883++;
        class685 var4 = class26.method198(arg0, (byte) -19, arg3);
        if (arg2 != -28980) {
            method2119((byte) 37);
        }
        if (var4 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var4.field9723.length) {
            return var4.field9723[arg1];
        } else {
            return -1;
        }
    }
}
