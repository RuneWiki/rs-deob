import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class302 {

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lbt;")
    private class33 field4476;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lqv;")
    public static class316 field4478 = new class316(80, -1);

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lwp;")
    public static class122 field4481 = new class122();

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field4483 = 0;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Lqt;")
    public static class459 field4484;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Lej;")
    private class80 field4480;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "[[I")
    public static int[][] field4482;

    static {
        new class405("", 73);
        field4484 = new class459(37, 4);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V", line = 7)
    public static final void method1931(int arg0, int arg1, int arg2) {
        field4477++;
        int var3 = class425.field6028.method875(class136.field2113.method426(class503.field7255, 62), (byte) 5);
        for (class341 var4 = (class341) class258.field3829.method863(-1); var4 != null; var4 = (class341) class258.field3829.method865(-1)) {
            int var8 = class344.method2177(2, var4);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class430.field6184 * 16 + 21;
        int var6 = arg2 - (var3 / 2);
        if (class50.field927 < var3 + var6) {
            var6 = class50.field927 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (arg1 >= -14) {
            return;
        }
        int var7 = arg0;
        if (class76.field1247 < var5 + arg0) {
            var7 = class76.field1247 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class252.field3743 = var6;
        class517.field7487 = (class535.field7888 ? 26 : 22) + class430.field6184 * 16;
        class291.field4322 = var7;
        class248.field3714 = true;
        class415.field5887 = var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z", line = 60)
    public final boolean method1932(int arg0) {
        field4479++;
        int var2 = -40 % ((arg0 + 33) / 47);
        if (this.field4476.field758 && this.field4476.field653 && this.field4480 == null) {
            class314 var3 = class490.method2872(104, this.field4476, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632);
            if (var3 != null) {
                this.field4480 = class533.method3155(this.field4476, true, new class314[] { var3 });
            }
        }
        return this.field4480 != null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 93)
    public static void method1933(byte arg0) {
        field4484 = null;
        if (arg0 <= -24) {
            field4481 = null;
            field4478 = null;
            field4482 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lbt;)V", line = 112)
    public class302(class33 arg0) {
        this.field4476 = arg0;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(III)Log;", line = 123)
    public static final class467 method1934(int arg0, int arg1, int arg2) {
        class188 var3 = class461.field6675[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class467 var4 = var3.field2753;
            var3.field2753 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILgh;Lgh;F)Z", line = 137)
    public final boolean method1935(int arg0, class392 arg1, class392 arg2, float arg3) {
        field4475++;
        if (!this.method1932(35)) {
            return false;
        } else if (arg0 > -97) {
            return false;
        } else {
            class292 var5 = this.field4476.field658;
            class262 var6 = new class262(this.field4476, 6408, arg2.field5571, arg2.field5563);
            this.field4476.method289(8704, var5);
            boolean var7 = false;
            var5.method1883((byte) -100, 0, var6);
            if (var5.method1866(-36054)) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, arg2.field5571, arg2.field5563);
                OpenGL.glUseProgramObjectARB(this.field4480.field1301);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field4480.field1301, "heightMap"), 0);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field4480.field1301, "rcpRelief"), 1.0F / arg3);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field4480.field1301, "sampleSize"), 1.0F / (float) arg1.field5571, 1.0F / (float) arg1.field5563);
                for (int var8 = 0; var8 < arg2.field5561; var8++) {
                    float var9 = (float) var8 / (float) arg2.field5561;
                    this.field4476.method285(false, arg1);
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
                    arg2.method2361(0, var8, arg2.field5571, 0, 0, 0, arg2.field5563, 0);
                }
                OpenGL.glUseProgramObjectARB(0L);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                var7 = true;
                OpenGL.glPopMatrix();
            }
            var5.method1878((byte) -100, 0);
            this.field4476.method281(var5, -21590);
            return var7;
        }
    }
}
