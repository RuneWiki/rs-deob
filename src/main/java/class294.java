import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class294 {

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "Lkw;")
    private class346 field4036;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Llc;")
    public static class435 field4031 = new class435(95, -1);

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "[F")
    public static float[] field4034 = new float[16];

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "Lsm;")
    public static class387 field4040 = new class387("", 15);

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "Llc;")
    public static class435 field4041 = new class435(71, 4);

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Ldc;")
    private class62 field4032;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 7)
    public static void method1840(int arg0) {
        field4041 = null;
        field4040 = null;
        field4034 = null;
        if (arg0 != 5889) {
            method1841((byte) -10, 104);
        }
        field4031 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)V", line = 20)
    public static final void method1841(byte arg0, int arg1) {
        field4033++;
        if (arg0 != 97) {
            method1844();
        }
        class503 var2 = class512.method3112(7, arg1, 0);
        var2.method3074(arg0 ^ 0xFFFFFFF0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V", line = 40)
    public static final void method1842(int arg0, int arg1) {
        int var2 = 63 % ((51 - arg0) / 52);
        field4035++;
        class503 var3 = class512.method3112(16, arg1, 0);
        var3.method3074(-105);
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lkw;)V", line = 54)
    public class294(class346 arg0) {
        this.field4036 = arg0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZZ)I", line = 62)
    public static final int method1843(boolean arg0, boolean arg1) {
        field4037++;
        if (arg0) {
            method1841((byte) -81, -18);
        }
        int var2 = class270.field3833;
        if (var2 == 0) {
            return arg1 ? 0 : class72.field1098;
        } else if (var2 == 1) {
            return class72.field1098;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "()V", line = 112)
    public static final void method1844() {
        class465.field6628 = class465.field6627;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLte;Lte;F)Z", line = 115)
    public final boolean method1845(byte arg0, class48 arg1, class48 arg2, float arg3) {
        field4038++;
        if (!this.method1846(true)) {
            return false;
        }
        class604 var5 = this.field4036.field5061;
        class537 var6 = new class537(this.field4036, 6408, arg1.field789, arg1.field788);
        this.field4036.method2195(var5, arg0 ^ 0xFFFFFFE2);
        boolean var7 = false;
        var5.method3517(0, var6, (byte) 73);
        if (var5.method3522((byte) -63)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field789, arg1.field788);
            OpenGL.glUseProgramObjectARB(this.field4032.field1002);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field4032.field1002, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field4032.field1002, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field4032.field1002, "sampleSize"), 1.0F / (float) arg2.field789, 1.0F / (float) arg2.field788);
            for (int var8 = 0; var8 < arg1.field799; var8++) {
                float var9 = (float) var8 / (float) arg1.field799;
                this.field4036.method2164(arg0 + 124, arg2);
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
                arg1.method461(0, arg1.field788, arg1.field789, 0, arg0 ^ 0xFFFFFFBA, 0, var8, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method3519(0, -104);
        this.field4036.method2193(67, var5);
        return arg0 == -118 ? var7 : false;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)Z", line = 194)
    public final boolean method1846(boolean arg0) {
        if (this.field4036.field5006 && this.field4036.field5052 && this.field4032 == null) {
            class716 var2 = class535.method3235(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 221, this.field4036);
            if (var2 != null) {
                this.field4032 = class660.method3768(this.field4036, 35716, new class716[] { var2 });
            }
        }
        if (arg0) {
            field4039++;
            return this.field4032 != null;
        } else {
            return true;
        }
    }
}
