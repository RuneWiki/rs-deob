import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class562 {

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "Ler;")
    private class92 field8089;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field8084 = 0;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "[I")
    public static int[] field8090 = new int[32];

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "Lcaa;")
    private class277 field8087;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lnh;FILnh;)Z")
    public final boolean method3337(class694 arg0, float arg1, int arg2, class694 arg3) {
        field8086++;
        if (!this.method3339(0)) {
            return false;
        }
        class276 var5 = this.field8089.field1387;
        class106 var6 = new class106(this.field8089, 6408, arg3.field9718, arg3.field9726);
        this.field8089.method881(false, var5);
        boolean var7 = false;
        var5.method1964((byte) 47, 0, var6);
        if (arg2 != 1) {
            return true;
        }
        if (var5.method1970((byte) -101)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field9718, arg3.field9726);
            OpenGL.glUseProgramObjectARB(this.field8087.field4482);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field8087.field4482, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field8087.field4482, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field8087.field4482, "sampleSize"), 1.0F / (float) arg0.field9718, 1.0F / (float) arg0.field9726);
            for (int var8 = 0; var8 < arg3.field9719; var8++) {
                float var9 = (float) var8 / (float) arg3.field9719;
                this.field8089.method856(false, arg0);
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
                arg3.method3921(arg3.field9726, 0, var8, 0, 0, true, arg3.field9718, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method1965(95, 0);
        this.field8089.method828(var5, 0);
        return var7;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public static void method3338(int arg0) {
        if (arg0 != 1) {
            method3340((byte) 4, -93, 89, null, -120, -19, -53);
        }
        field8090 = null;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)Z")
    public final boolean method3339(int arg0) {
        field8091++;
        if (arg0 != 0) {
            field8085 = 35;
        }
        if (this.field8089.field1472 && this.field8089.field1438 && this.field8087 == null) {
            class199 var2 = class319.method2170(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field8089, (byte) 118);
            if (var2 != null) {
                this.field8087 = class402.method2585(this.field8089, false, new class199[] { var2 });
            }
        }
        return this.field8087 != null;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Ler;)V")
    public class562(class92 arg0) {
        this.field8089 = arg0;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BII[BIII)Z")
    public static final boolean method3340(byte arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field8088++;
        int var7 = arg1 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg2 + arg4 - 1) / arg4);
        int var10 = 64 % ((-arg0 - 33) / 52);
        int var11 = -((arg1 + arg4 - 1) / arg4);
        for (int var12 = var9; var12 < 0; var12++) {
            for (int var13 = var11; var13 < 0; var13++) {
                if (arg3[arg6] == 0) {
                    return true;
                }
                arg6 += arg4;
            }
            int var14 = arg6 - var8;
            if (arg3[var14 - 1] == 0) {
                return true;
            }
            arg6 = arg5 + var14;
        }
        return false;
    }
}
