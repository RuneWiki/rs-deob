import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class309 {

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "Lwh;")
    private class148 field4378;

    @OriginalMember(owner = "client!dja", name = "g", descriptor = "I")
    public static int field4384 = 0;

    @OriginalMember(owner = "client!dja", name = "k", descriptor = "[I")
    public static int[] field4388 = new int[1000];

    @OriginalMember(owner = "client!dja", name = "h", descriptor = "I")
    public static int field4385 = 0;

    @OriginalMember(owner = "client!dja", name = "j", descriptor = "Lmia;")
    public static class63 field4387 = new class63(61, 7);

    @OriginalMember(owner = "client!dja", name = "c", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!dja", name = "e", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!dja", name = "f", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!dja", name = "i", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "Lrv;")
    private class111 field4379;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1954(int arg0, int arg1) {
        class640.field8989 = new int[arg1];
        field4386++;
        class242.field3535 = new int[arg1];
        class375.field5687 = new int[arg1];
        class421.field6281 = new int[arg1];
        if (arg0 != 0) {
            method1957(13);
        }
        class193.field2931 = new int[arg1];
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(BI)Lki;", line = 23)
    public static final class710 method1955(byte arg0, int arg1) {
        field4383++;
        if (arg0 < 123) {
            field4385 = -107;
        }
        return arg1 >= 0 && arg1 < 100 ? class590.field8371[arg1] : null;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(Lgp;BLgp;F)Z", line = 38)
    public final boolean method1956(class49 arg0, byte arg1, class49 arg2, float arg3) {
        field4380++;
        if (!this.method1959(-31793)) {
            return false;
        }
        class30 var5 = this.field4378.field2207;
        class51 var6 = new class51(this.field4378, 6408, arg0.field707, arg0.field705);
        this.field4378.method1098(var5, 495185768);
        if (arg1 != -10) {
            method1955((byte) -46, -69);
        }
        boolean var7 = false;
        var5.method155(var6, arg1 + 10, 0);
        if (var5.method154(239)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field707, arg0.field705);
            OpenGL.glUseProgramObjectARB(this.field4379.field1549);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field4379.field1549, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field4379.field1549, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field4379.field1549, "sampleSize"), 1.0F / (float) arg2.field707, 1.0F / (float) arg2.field705);
            for (int var8 = 0; var8 < arg0.field708; var8++) {
                float var9 = (float) var8 / (float) arg0.field708;
                this.field4378.method1088(arg2, -27749);
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
                arg0.method362(0, 0, (byte) 112, arg0.field705, arg0.field707, 0, 0, var8);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method157(0, -210);
        this.field4378.method1059(var5, 515);
        return var7;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)V", line = 110)
    public static void method1957(int arg0) {
        if (arg0 == 1) {
            field4387 = null;
            field4388 = null;
        }
    }

    @OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Lwh;)V", line = 121)
    public class309(class148 arg0) {
        this.field4378 = arg0;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(JI)V", line = 131)
    public static final void method1958(long arg0, int arg1) {
        field4381++;
        if (arg1 != 1199) {
            method1957(25);
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "(I)Z", line = 150)
    public final boolean method1959(int arg0) {
        field4382++;
        if (this.field4378.field2205 && this.field4378.field2273 && this.field4379 == null) {
            class396 var2 = class758.method4225(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field4378, (byte) 106);
            if (var2 != null) {
                this.field4379 = class734.method4132(new class396[] { var2 }, this.field4378, 14964);
            }
        }
        if (arg0 == -31793) {
            return this.field4379 != null;
        } else {
            return false;
        }
    }
}
