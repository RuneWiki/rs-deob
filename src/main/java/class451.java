import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class451 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lpc;")
    private class700 field6373;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "J")
    public static long field6377 = -1L;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field6372 = 0;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[I")
    public static int[] field6378 = new int[14];

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lpq;")
    private class207 field6379;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILtj;FLtj;)Z")
    public final boolean method2739(int arg0, class210 arg1, float arg2, class210 arg3) {
        field6374++;
        if (!this.method2740(arg0 + 35631)) {
            return false;
        }
        class195 var5 = this.field6373.field9828;
        class322 var6 = new class322(this.field6373, 6408, arg1.field2488, arg1.field2491);
        this.field6373.method3956(false, var5);
        boolean var7 = false;
        if (arg0 != 1) {
            method2741(34, -36);
        }
        var5.method1267(arg0 + 109, 0, var6);
        if (var5.method1276((byte) 24)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field2488, arg1.field2491);
            OpenGL.glUseProgramObjectARB(this.field6379.field2457);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field6379.field2457, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field6379.field2457, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field6379.field2457, "sampleSize"), 1.0F / (float) arg3.field2488, 1.0F / (float) arg3.field2491);
            for (int var8 = 0; var8 < arg1.field2494; var8++) {
                float var9 = (float) var8 / (float) arg1.field2494;
                this.field6373.method3936(false, arg3);
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
                arg1.method1324(0, 0, 0, arg1.field2488, arg1.field2491, var8, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method1284(21450, 0);
        this.field6373.method3964(var5, -1);
        return var7;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Z")
    public final boolean method2740(int arg0) {
        if (this.field6373.field9841 && this.field6373.field9768 && this.field6379 == null) {
            class426 var2 = class253.method1506(-1, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field6373);
            if (var2 != null) {
                this.field6379 = class89.method810(new class426[] { var2 }, this.field6373, (byte) -23);
            }
        }
        field6375++;
        if (arg0 != 35632) {
            this.method2740(81);
        }
        return this.field6379 != null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Z")
    public static final boolean method2741(int arg0, int arg1) {
        field6376++;
        if (arg1 != 0) {
            field6378 = null;
        }
        return arg0 == 7 || arg0 == 8 || arg0 == 9;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lpc;)V")
    public class451(class700 arg0) {
        this.field6373 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method2742(int arg0) {
        int var1 = -124 % ((arg0 + 38) / 60);
        field6378 = null;
    }
}
