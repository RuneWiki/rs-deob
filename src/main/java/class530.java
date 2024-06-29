import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class530 {

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "Lod;")
    private class349 field7815;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "Lvp;")
    public static class123 field7818 = new class123();

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "Lkh;")
    private class13 field7814;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)Z")
    public final boolean method3129(byte arg0) {
        field7816++;
        int var2 = 86 % ((13 - arg0) / 56);
        if (this.field7815.field5318 && this.field7815.field5330 && this.field7814 == null) {
            class307 var3 = class471.method2826("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field7815, 35632, (byte) 42);
            if (var3 != null) {
                this.field7814 = class312.method1948(this.field7815, -127, new class307[] { var3 });
            }
        }
        return this.field7814 != null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "([BI)[B")
    public static final byte[] method3130(byte[] arg0, int arg1) {
        field7813++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class520.method3071(arg0, arg1, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lod;)V")
    public class530(class349 arg0) {
        this.field7815 = arg0;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V")
    public static void method3131(byte arg0) {
        field7818 = null;
        if (arg0 != 48) {
            field7818 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lmi;Lmi;BF)Z")
    public final boolean method3132(class341 arg0, class341 arg1, byte arg2, float arg3) {
        field7817++;
        if (!this.method3129((byte) -96)) {
            return false;
        }
        class77 var5 = this.field7815.field5369;
        int var6 = 46 / ((arg2 + 26) / 44);
        class347 var7 = new class347(this.field7815, 6408, arg1.field4861, arg1.field4863);
        this.field7815.method2137(var5, -7906);
        boolean var8 = false;
        var5.method444(104, var7, 0);
        if (var5.method446(-104)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field4861, arg1.field4863);
            OpenGL.glUseProgramObjectARB(this.field7814.field168);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field7814.field168, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field7814.field168, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field7814.field168, "sampleSize"), 1.0F / (float) arg0.field4861, 1.0F / (float) arg0.field4863);
            for (int var9 = 0; var9 < arg1.field4862; var9++) {
                float var10 = (float) var9 / (float) arg1.field4862;
                this.field7815.method2200(arg0, (byte) 116);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord3f(0.0F, 0.0F, var10);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 0.0F, var10);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 1.0F, var10);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3f(0.0F, 1.0F, var10);
                OpenGL.glVertex2f(0.0F, 1.0F);
                OpenGL.glEnd();
                arg1.method2083(0, arg1.field4863, 0, arg1.field4861, 0, 0, var9, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var8 = true;
            OpenGL.glPopMatrix();
        }
        var5.method451(53, 0);
        this.field7815.method2133(var5, -128);
        return var8;
    }
}
