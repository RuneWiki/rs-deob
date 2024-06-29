import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class398 {

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Lvj;")
    private class303 field6003;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "Z")
    public static boolean field6004 = false;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "Lgb;")
    public static class142 field6002;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "Lli;")
    public static class293 field6007;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "Lwf;")
    private class88 field6006;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljd;ZFLjd;)Z", line = 10)
    public final boolean method2456(class152 arg0, boolean arg1, float arg2, class152 arg3) {
        field6001++;
        if (!this.method2458((byte) -125)) {
            return false;
        }
        class240 var5 = this.field6003.field4625;
        class497 var6 = new class497(this.field6003, 6408, arg3.field2421, arg3.field2410);
        if (!arg1) {
            return true;
        }
        this.field6003.method1945(var5, !arg1);
        boolean var7 = false;
        var5.method1565(0, var6, 0);
        if (var5.method1567(46)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field2421, arg3.field2410);
            OpenGL.glUseProgramObjectARB(this.field6006.field1539);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field6006.field1539, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field6006.field1539, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field6006.field1539, "sampleSize"), 1.0F / (float) arg0.field2421, 1.0F / (float) arg0.field2410);
            for (int var8 = 0; var8 < arg3.field2417; var8++) {
                float var9 = (float) var8 / (float) arg3.field2417;
                this.field6003.method1990(arg0, 11864);
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
                arg3.method1158(var8, 0, arg3.field2421, 0, 0, 0, arg3.field2410, -18608);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method1564(0, 102);
        this.field6003.method1916(var5, 115);
        return var7;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 83)
    public static void method2457(int arg0) {
        field6007 = null;
        if (arg0 != 0) {
            method2457(16);
        }
        field6002 = null;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lvj;)V", line = 99)
    public class398(class303 arg0) {
        this.field6003 = arg0;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Z", line = 110)
    public final boolean method2458(byte arg0) {
        if (this.field6003.field4532 && this.field6003.field4612 && this.field6006 == null) {
            class108 var2 = class88.method693(1, 35632, this.field6003, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field6006 = class5.method40(new class108[] { var2 }, false, this.field6003);
            }
        }
        int var3 = -62 / ((-arg0 - 70) / 49);
        field6000++;
        return this.field6006 != null;
    }
}
