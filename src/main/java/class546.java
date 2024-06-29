import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class546 {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "Lpea;")
    private class641 field7477;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Log;")
    private class564 field7482;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public static final void method3072(byte arg0) {
        field7481++;
        class361[] var1 = class648.field9171;
        synchronized (class648.field9171) {
            if (arg0 != 124) {
                method3073(-3, 70);
            }
            for (int var2 = 0; var2 < class648.field9171.length; var2++) {
                class648.field9171[var2] = new class361();
                class388.field5602[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)I")
    public static final int method3073(int arg0, int arg1) {
        field7478++;
        return arg0 == 255 ? arg1 & 0xFF : 67;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lbu;FLbu;B)Z")
    public final boolean method3074(class529 arg0, float arg1, class529 arg2, byte arg3) {
        field7479++;
        if (!this.method3075(35632)) {
            return false;
        }
        if (arg3 <= 74) {
            this.field7477 = null;
        }
        class120 var5 = this.field7477.field9003;
        class335 var6 = new class335(this.field7477, 6408, arg2.field7317, arg2.field7319);
        this.field7477.method3541(var5, (byte) -13);
        boolean var7 = false;
        var5.method731(-118, var6, 0);
        if (var5.method737(73)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg2.field7317, arg2.field7319);
            OpenGL.glUseProgramObjectARB(this.field7482.field7719);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field7482.field7719, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field7482.field7719, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field7482.field7719, "sampleSize"), 1.0F / (float) arg0.field7317, 1.0F / (float) arg0.field7319);
            for (int var8 = 0; var8 < arg2.field7320; var8++) {
                float var9 = (float) var8 / (float) arg2.field7320;
                this.field7477.method3553((byte) 91, arg0);
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
                arg2.method3010(0, arg2.field7317, var8, 0, 0, -1, arg2.field7319, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method738(-107, 0);
        this.field7477.method3522(var5, -80);
        return var7;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)Z")
    public final boolean method3075(int arg0) {
        field7480++;
        if (this.field7477.field9013 && this.field7477.field9071 && this.field7482 == null) {
            class216 var2 = class506.method2862(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 16686, this.field7477);
            if (var2 != null) {
                this.field7482 = class529.method3008((byte) -80, new class216[] { var2 }, this.field7477);
            }
        }
        if (arg0 == 35632) {
            return this.field7482 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lpea;)V")
    public class546(class641 arg0) {
        this.field7477 = arg0;
    }
}
