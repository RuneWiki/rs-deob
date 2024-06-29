import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class583 {

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Lmh;")
    private class537 field8479;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field8482 = 0;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "Lrg;")
    public static class548 field8478 = new class548(33, 4);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "Lpi;")
    private class422 field8480;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public static void method3391(byte arg0) {
        if (arg0 < 99) {
            method3391((byte) -3);
        }
        field8478 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)Z")
    public final boolean method3392(int arg0) {
        field8477++;
        if (arg0 != 25059) {
            this.field8479 = null;
        }
        if (this.field8479.field7872 && this.field8479.field7763 && this.field8480 == null) {
            class187 var2 = class381.method2206(this.field8479, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", (byte) 79);
            if (var2 != null) {
                this.field8480 = class628.method3598(new class187[] { var2 }, this.field8479, (byte) -90);
            }
        }
        return this.field8480 != null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IFLlh;Llh;)Z")
    public final boolean method3393(int arg0, float arg1, class447 arg2, class447 arg3) {
        field8481++;
        if (!this.method3392(arg0 ^ 0x61E3)) {
            return false;
        }
        class88 var5 = this.field8479.field7836;
        class151 var6 = new class151(this.field8479, 6408, arg3.field6199, arg3.field6195);
        boolean var7 = false;
        this.field8479.method3096(var5, -127);
        var5.method517(arg0, -108, var6);
        if (var5.method522(-91)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field6199, arg3.field6195);
            OpenGL.glUseProgramObjectARB(this.field8480.field5446);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field8480.field5446, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field8480.field5446, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field8480.field5446, "sampleSize"), 1.0F / (float) arg2.field6199, 1.0F / (float) arg2.field6195);
            for (int var8 = 0; var8 < arg3.field6196; var8++) {
                float var9 = (float) var8 / (float) arg3.field6196;
                this.field8479.method3083((byte) 117, arg2);
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
                arg3.method2617(0, arg3.field6199, 0, arg3.field6195, 0, 0, true, var8);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method512(0, (byte) 79);
        this.field8479.method3109((byte) -108, var5);
        return var7;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3394(int arg0, int arg1, byte arg2) {
        int var3 = 76 / ((-arg2 - 31) / 46);
        field8476++;
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lmh;)V")
    public class583(class537 arg0) {
        this.field8479 = arg0;
    }
}
