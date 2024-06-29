import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class298 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "Lgk;")
    private class463 field3863;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "[I")
    public static int[] field3866 = new int[1000];

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Z")
    public static boolean field3869 = false;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Lpi;")
    public static class340 field3865 = new class340(50, 0);

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Lss;")
    private class322 field3868;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 16)
    public static void method1787(int arg0) {
        field3865 = null;
        if (arg0 != 5889) {
            field3865 = null;
        }
        field3866 = null;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lgk;)V", line = 26)
    public class298(class463 arg0) {
        this.field3863 = arg0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIILqa;I)Lc;", line = 34)
    public static final class507 method1788(int arg0, int arg1, int arg2, int arg3, int arg4, class129 arg5, int arg6) {
        field3867++;
        long var7 = (long) arg2;
        class507 var9 = (class507) class382.field5036.method78(var7, (byte) -101);
        short var10 = 2055;
        if (var9 == null) {
            class420 var11 = class370.method2154(arg3 + 24427, arg2, 0, class83.field1031);
            if (var11 == null) {
                return null;
            }
            if (var11.field5593 < 13) {
                var11.method2466(0, (byte) 107);
            }
            var9 = arg5.method888(var11, var10, class319.field4103, 64, 768);
            class382.field5036.method88(var7, arg3 ^ 0xFFFFC9BD, var9);
        }
        class507 var12 = var9.method510((byte) 2, var10, true);
        if (arg1 != 0) {
            var12.method522(arg1);
        }
        if (arg4 != 0) {
            var12.method535(arg4);
        }
        if (arg6 != 0) {
            var12.method506(arg6);
        }
        if (arg3 != -13946) {
            field3865 = null;
        }
        if (arg0 != 0) {
            var12.method537(0, arg0, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)Z", line = 82)
    public final boolean method1789(int arg0) {
        if (this.field3863.field6719 && this.field3863.field6718 && this.field3868 == null) {
            class307 var2 = class206.method1346(this.field3863, 35632, arg0 - 38439, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field3868 = class310.method1853(arg0 - 27365, this.field3863, new class307[] { var2 });
            }
        }
        if (arg0 != 27446) {
            method1787(50);
        }
        field3871++;
        return this.field3868 != null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lrg;FILrg;)Z", line = 112)
    public final boolean method1790(class460 arg0, float arg1, int arg2, class460 arg3) {
        if (arg2 != -15185) {
            this.field3868 = null;
        }
        field3870++;
        if (!this.method1789(arg2 ^ 0xFFFFAF99)) {
            return false;
        }
        class453 var5 = this.field3863.field6761;
        class288 var6 = new class288(this.field3863, 6408, arg3.field6431, arg3.field6428);
        this.field3863.method2747(var5, 3);
        boolean var7 = false;
        var5.method2686(0, var6, 620);
        if (var5.method2693((byte) -120)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field6431, arg3.field6428);
            OpenGL.glUseProgramObjectARB(this.field3868.field4140);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3868.field4140, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3868.field4140, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3868.field4140, "sampleSize"), 1.0F / (float) arg0.field6431, 1.0F / (float) arg0.field6428);
            for (int var8 = 0; var8 < arg3.field6424; var8++) {
                float var9 = (float) var8 / (float) arg3.field6424;
                this.field3863.method2771(arg0, arg2 ^ 0x7AC0);
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
                arg3.method2714(0, arg3.field6431, 0, false, arg3.field6428, 0, var8, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method2684(0, 1);
        this.field3863.method2770(var5, false);
        return var7;
    }
}
