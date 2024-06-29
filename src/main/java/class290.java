import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class290 {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Lep;")
    private class371 field3798;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Z")
    public static boolean field3796 = false;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lqk;")
    public static class148 field3800 = new class148(78, 6);

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "[Lbc;")
    public static class330[] field3804 = new class330[100];

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Lwaa;")
    private class622 field3797;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V", line = 11)
    public static final void method1711(int arg0, boolean arg1) {
        field3799++;
        int var2 = class731.field10229;
        if (arg0 != 100) {
            return;
        }
        int var3 = class423.field5857;
        if (arg1 && class286.field3774) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class96.field1401.method2143(var3, var2);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lep;)V", line = 33)
    public class290(class371 arg0) {
        this.field3798 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)Z", line = 45)
    public final boolean method1712(int arg0) {
        field3803++;
        if (this.field3798.field5028 && this.field3798.field5005 && this.field3797 == null) {
            class510 var2 = class689.method3927("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field3798, (byte) -80, 35632);
            if (var2 != null) {
                this.field3797 = class163.method1016(this.field3798, new class510[] { var2 }, -12748);
            }
        }
        if (arg0 < 97) {
            this.method1713(null, null, -13, 1.3582965F);
        }
        return this.field3797 != null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ldv;Ldv;IF)Z", line = 71)
    public final boolean method1713(class87 arg0, class87 arg1, int arg2, float arg3) {
        field3801++;
        if (arg2 >= -47) {
            return true;
        } else if (this.method1712(125)) {
            class564 var5 = this.field3798.field5040;
            class264 var6 = new class264(this.field3798, 6408, arg1.field1204, arg1.field1197);
            this.field3798.method2182(var5, (byte) -123);
            boolean var7 = false;
            var5.method3378(var6, 0, false);
            if (var5.method3377(105)) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, arg1.field1204, arg1.field1197);
                OpenGL.glUseProgramObjectARB(this.field3797.field8850);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3797.field8850, "heightMap"), 0);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3797.field8850, "rcpRelief"), 1.0F / arg3);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3797.field8850, "sampleSize"), 1.0F / (float) arg0.field1204, 1.0F / (float) arg0.field1197);
                for (int var8 = 0; var8 < arg1.field1196; var8++) {
                    float var9 = (float) var8 / (float) arg1.field1196;
                    this.field3798.method2154(arg0, -2);
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
                    arg1.method529(0, var8, arg1.field1197, 0, (byte) -63, arg1.field1204, 0, 0);
                }
                OpenGL.glUseProgramObjectARB(0L);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                OpenGL.glPopMatrix();
                var7 = true;
            }
            var5.method3372(0, 36009);
            this.field3798.method2142((byte) -115, var5);
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 146)
    public static void method1714(int arg0) {
        field3804 = null;
        if (arg0 >= -119) {
            field3796 = false;
        }
        field3800 = null;
    }
}
