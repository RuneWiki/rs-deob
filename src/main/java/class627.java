import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class627 {

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "Lpq;")
    private class194 field8784;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
    public static int field8783 = 100;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "Lon;")
    private class759 field8779;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(FLui;ILui;)Z")
    public final boolean method3608(float arg0, class554 arg1, int arg2, class554 arg3) {
        field8785++;
        if (!this.method3609(35632)) {
            return false;
        }
        class772 var5 = this.field8784.field2703;
        class265 var6 = new class265(this.field8784, 6408, arg3.field7672, arg3.field7669);
        if (arg2 >= -52) {
            return true;
        }
        this.field8784.method1274(2, var5);
        boolean var7 = false;
        var5.method4262(0, -121, var6);
        if (var5.method4266((byte) 114)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field7672, arg3.field7669);
            OpenGL.glUseProgramObjectARB(this.field8779.field10433);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field8779.field10433, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field8779.field10433, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field8779.field10433, "sampleSize"), 1.0F / (float) arg1.field7672, 1.0F / (float) arg1.field7669);
            for (int var8 = 0; var8 < arg3.field7676; var8++) {
                float var9 = (float) var8 / (float) arg3.field7676;
                this.field8784.method1219((byte) 72, arg1);
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
                arg3.method3261(0, 0, var8, arg3.field7669, 0, 0, false, arg3.field7672);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method4268((byte) -128, 0);
        this.field8784.method1259((byte) 63, var5);
        return var7;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)Z")
    public final boolean method3609(int arg0) {
        field8781++;
        if (this.field8784.field2695 && this.field8784.field2747 && this.field8779 == null) {
            class190 var2 = class342.method2171(35632, this.field8784, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", arg0 ^ 0x8B30);
            if (var2 != null) {
                this.field8779 = class792.method4336(new class190[] { var2 }, 35716, this.field8784);
            }
        }
        if (arg0 != 35632) {
            field8783 = 27;
        }
        return this.field8779 != null;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z")
    public static final boolean method3610(int arg0, int arg1, int arg2) {
        field8780++;
        if (arg1 == 0) {
            return (arg2 & 0x100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lpq;)V")
    public class627(class194 arg0) {
        this.field8784 = arg0;
    }
}
