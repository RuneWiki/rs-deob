import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class277 {

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "Lgi;")
    private class583 field3835;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "Lan;")
    public static class21 field3831;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "Liu;")
    private class496 field3832;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "[[[I")
    public static int[][][] field3830;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
    public static void method1782(int arg0) {
        field3831 = null;
        field3830 = null;
        if (arg0 != -28448) {
            field3830 = null;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)Z")
    public final boolean method1783(byte arg0) {
        field3829++;
        if (arg0 != 46) {
            return false;
        }
        if (this.field3835.field8306 && this.field3835.field8297 && this.field3832 == null) {
            class40 var2 = client.method1550(35632, false, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field3835);
            if (var2 != null) {
                this.field3832 = class209.method1377(new class40[] { var2 }, this.field3835, 26013);
            }
        }
        return this.field3832 != null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(FLmj;Lmj;I)Z")
    public final boolean method1784(float arg0, class562 arg1, class562 arg2, int arg3) {
        field3833++;
        if (!this.method1783((byte) 46)) {
            return false;
        }
        class45 var5 = this.field3835.field8341;
        class267 var6 = new class267(this.field3835, 6408, arg1.field7789, arg1.field7783);
        this.field3835.method3350(-2438, var5);
        boolean var7 = false;
        var5.method449(var6, 24029, 0);
        if (arg3 != -2102) {
            field3831 = null;
        }
        if (var5.method448(-120)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field7789, arg1.field7783);
            OpenGL.glUseProgramObjectARB(this.field3832.field6934);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3832.field6934, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3832.field6934, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3832.field6934, "sampleSize"), 1.0F / (float) arg2.field7789, 1.0F / (float) arg2.field7783);
            for (int var8 = 0; var8 < arg1.field7788; var8++) {
                float var9 = (float) var8 / (float) arg1.field7788;
                this.field3835.method3358(32886, arg2);
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
                arg1.method3208(0, var8, 0, 0, true, arg1.field7783, 0, arg1.field7789);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method452((byte) 65, 0);
        this.field3835.method3395(var5, arg3 + 16134);
        return var7;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lgi;)V")
    public class277(class583 arg0) {
        this.field3835 = arg0;
    }

    static {
        new class104("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field3828 = 0;
    }
}
