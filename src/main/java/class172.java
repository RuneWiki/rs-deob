import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class172 {

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "Leq;")
    private class357 field2256;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "Lga;")
    public static class70 field2258 = new class70("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "Z")
    public static boolean field2259 = false;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "Lua;")
    private class636 field2257;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
    public static void method1070(int arg0) {
        if (arg0 < 38) {
            field2258 = null;
        }
        field2258 = null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lsaa;ILsaa;F)Z")
    public final boolean method1071(class629 arg0, int arg1, class629 arg2, float arg3) {
        field2255++;
        if (!this.method1072((byte) -52)) {
            return false;
        } else if (arg1 <= 40) {
            return false;
        } else {
            class504 var5 = this.field2256.field5005;
            class579 var6 = new class579(this.field2256, 6408, arg2.field8755, arg2.field8758);
            this.field2256.method2158(-29780, var5);
            boolean var7 = false;
            var5.method2905(true, 0, var6);
            if (var5.method2906(-1)) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, arg2.field8755, arg2.field8758);
                OpenGL.glUseProgramObjectARB(this.field2257.field8807);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field2257.field8807, "heightMap"), 0);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field2257.field8807, "rcpRelief"), 1.0F / arg3);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field2257.field8807, "sampleSize"), 1.0F / (float) arg0.field8755, 1.0F / (float) arg0.field8758);
                for (int var8 = 0; var8 < arg2.field8756; var8++) {
                    float var9 = (float) var8 / (float) arg2.field8756;
                    this.field2256.method2120(-1, arg0);
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
                    arg2.method3428(-63, 0, 0, 0, var8, arg2.field8755, 0, arg2.field8758);
                }
                OpenGL.glUseProgramObjectARB(0L);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                OpenGL.glPopMatrix();
                var7 = true;
            }
            var5.method2904(0, (byte) 126);
            this.field2256.method2142(-91, var5);
            return var7;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)Z")
    public final boolean method1072(byte arg0) {
        int var2 = 64 % ((arg0 - 36) / 40);
        field2253++;
        if (this.field2256.field5073 && this.field2256.field5065 && this.field2257 == null) {
            class692 var3 = class77.method560(this.field2256, (byte) 67, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var3 != null) {
                this.field2257 = class615.method3375(new class692[] { var3 }, (byte) 64, this.field2256);
            }
        }
        return this.field2257 != null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I[BIIIIII[B)V")
    public static final void method1073(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (arg2 != 3536) {
            return;
        }
        field2254++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg8[var10001] = (byte) (arg8[var10001] - arg1[arg3++]);
                int var14 = arg7++;
                arg8[var14] = (byte) (arg8[var14] - arg1[arg3++]);
                int var15 = arg7++;
                arg8[var15] = (byte) (arg8[var15] - arg1[arg3++]);
                int var16 = arg7++;
                arg8[var16] = (byte) (arg8[var16] - arg1[arg3++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg8[var10001] = (byte) (arg8[var10001] - arg1[arg3++]);
            }
            arg3 += arg6;
            arg7 += arg5;
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Leq;)V")
    public class172(class357 arg0) {
        this.field2256 = arg0;
    }
}
