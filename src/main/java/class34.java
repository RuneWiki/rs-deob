import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class34 {

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "Lck;")
    private class733 field384;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "Lrda;")
    public static class467 field383 = new class467(16);

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "Lfm;")
    private class477 field385;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method192(boolean arg0, int arg1) {
        field381++;
        if (!arg0) {
            field386 = -28;
        }
        class614 var2 = class497.method2759(12, 5977, (long) arg1);
        var2.method3279(false);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lkq;FBLkq;)Z", line = 17)
    public final boolean method193(class362 arg0, float arg1, byte arg2, class362 arg3) {
        field380++;
        if (!this.method195((byte) 86)) {
            return false;
        }
        class39 var5 = this.field384.field9942;
        class709 var6 = new class709(this.field384, 6408, arg0.field4409, arg0.field4401);
        this.field384.method3988(var5, -127);
        int var7 = -80 / ((arg2 + 45) / 32);
        boolean var8 = false;
        var5.method243(0, var6, false);
        if (var5.method234(-69)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field4409, arg0.field4401);
            OpenGL.glUseProgramObjectARB(this.field385.field6192);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field385.field6192, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field385.field6192, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field385.field6192, "sampleSize"), 1.0F / (float) arg3.field4409, 1.0F / (float) arg3.field4401);
            for (int var9 = 0; var9 < arg0.field4408; var9++) {
                float var10 = (float) var9 / (float) arg0.field4408;
                this.field384.method3975((byte) 118, arg3);
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
                arg0.method2084(arg0.field4409, 0, 0, 0, var9, false, arg0.field4401, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var8 = true;
        }
        var5.method236(0, -3);
        this.field384.method3918(4609, var5);
        return var8;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V", line = 89)
    public static void method194(int arg0) {
        field383 = null;
        if (arg0 != -14801) {
            method194(62);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)Z", line = 100)
    public final boolean method195(byte arg0) {
        field382++;
        if (arg0 != 86) {
            this.method193(null, -0.41074538F, (byte) -27, null);
        }
        if (this.field384.field9880 && this.field384.field9884 && this.field385 == null) {
            class668 var2 = class745.method4041(35632, (byte) 84, this.field384, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field385 = class617.method3302(new class668[] { var2 }, this.field384, arg0 - 199);
            }
        }
        return this.field385 != null;
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lck;)V", line = 133)
    public class34(class733 arg0) {
        this.field384 = arg0;
    }
}
