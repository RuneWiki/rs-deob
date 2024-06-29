import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class619 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lqj;")
    private class548 field8654;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Z")
    public static boolean field8653 = false;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Llaa;")
    private class633 field8657;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([FIIIIFIIII)V", line = 5)
    public static final void method3400(float[] arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 > -13) {
            return;
        }
        int var10 = arg3 - arg1;
        int var11 = arg2 - arg6;
        field8656++;
        int var12 = arg8 - arg9;
        float var13 = arg0[2] * (float) var11 + arg0[1] * (float) var12 + arg0[0] * (float) var10;
        float var14 = arg0[5] * (float) var11 + arg0[3] * (float) var10 + arg0[4] * (float) var12;
        float var15 = arg0[8] * (float) var11 + arg0[6] * (float) var10 + arg0[7] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg5 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg4 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg4 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg4 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class699.field9881 = var17;
        class52.field777 = var18;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Z", line = 57)
    public final boolean method3401(byte arg0) {
        if (this.field8654.field7593 && this.field8654.field7544 && this.field8657 == null) {
            class165 var2 = class506.method2719((byte) 108, this.field8654, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field8657 = class220.method1300(new class165[] { var2 }, this.field8654, 0);
            }
        }
        field8652++;
        if (arg0 >= -119) {
            return true;
        } else {
            return this.field8657 != null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lgba;Lgba;FB)Z", line = 99)
    public final boolean method3402(class392 arg0, class392 arg1, float arg2, byte arg3) {
        field8655++;
        if (!this.method3401((byte) -122)) {
            return false;
        }
        class12 var5 = this.field8654.field7538;
        if (arg3 >= -35) {
            return false;
        }
        class400 var6 = new class400(this.field8654, 6408, arg0.field4939, arg0.field4934);
        this.field8654.method3026(255, var5);
        boolean var7 = false;
        var5.method99(0, var6, -2693);
        if (var5.method96(false)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field4939, arg0.field4934);
            OpenGL.glUseProgramObjectARB(this.field8657.field8883);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field8657.field8883, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field8657.field8883, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field8657.field8883, "sampleSize"), 1.0F / (float) arg1.field4939, 1.0F / (float) arg1.field4934);
            for (int var8 = 0; var8 < arg0.field4938; var8++) {
                float var9 = (float) var8 / (float) arg0.field4938;
                this.field8654.method2960(arg1, -2);
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
                arg0.method2105(0, arg0.field4939, var8, arg0.field4934, 0, 0, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method89(0, 1);
        this.field8654.method2981(65, var5);
        return var7;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lqj;)V", line = 169)
    public class619(class548 arg0) {
        this.field8654 = arg0;
    }
}
