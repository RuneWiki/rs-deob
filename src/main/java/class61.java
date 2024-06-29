import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class61 {

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "Ljj;")
    private class66 field849;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field853 = 0;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "Z")
    public static boolean field852 = false;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "Lha;")
    public static class116 field851;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "Lvv;")
    private class640 field850;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Z")
    public final boolean method485(int arg0) {
        field854++;
        if (arg0 != 35632) {
            method487(77, null, 124, -91, -43, 86);
        }
        if (this.field849.field1201 && this.field849.field1167 && this.field850 == null) {
            class119 var2 = class20.method223(35632, this.field849, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", true);
            if (var2 != null) {
                this.field850 = class626.method3551(new class119[] { var2 }, 118, this.field849);
            }
        }
        return this.field850 != null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(FLho;BLho;)Z")
    public final boolean method486(float arg0, class422 arg1, byte arg2, class422 arg3) {
        field846++;
        if (!this.method485(35632)) {
            return false;
        } else if (arg2 == -99) {
            class353 var5 = this.field849.field1203;
            class528 var6 = new class528(this.field849, 6408, arg1.field6193, arg1.field6194);
            boolean var7 = false;
            this.field849.method539(var5, true);
            var5.method2145(0, (byte) 117, var6);
            if (var5.method2141(-36054)) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, arg1.field6193, arg1.field6194);
                OpenGL.glUseProgramObjectARB(this.field850.field9286);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field850.field9286, "heightMap"), 0);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field850.field9286, "rcpRelief"), 1.0F / arg0);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field850.field9286, "sampleSize"), 1.0F / (float) arg3.field6193, 1.0F / (float) arg3.field6194);
                for (int var8 = 0; var8 < arg1.field6196; var8++) {
                    float var9 = (float) var8 / (float) arg1.field6196;
                    this.field849.method648(126, arg3);
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
                    arg1.method2537(var8, arg1.field6193, 0, arg2 ^ 0x1F, 0, 0, arg1.field6194, 0);
                }
                OpenGL.glUseProgramObjectARB(0L);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                var7 = true;
                OpenGL.glPopMatrix();
            }
            var5.method2148(1, 0);
            this.field849.method564((byte) 76, var5);
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[BIIII)V")
    public static final void method487(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field848++;
        if (arg0 > -40) {
            field853 = -79;
        }
        if (arg3 <= arg2) {
            return;
        }
        int var6 = arg2 + arg4;
        int var7 = arg3 - arg2 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg3 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg1[var6++] = 1;
                }
            }
            arg1[var6++] = 1;
            arg1[var6++] = 1;
            arg1[var6++] = 1;
            arg1[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public static void method488(byte arg0) {
        if (arg0 != 7) {
            method487(-124, null, 122, 70, -53, -125);
        }
        field851 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZZLsf;)V")
    public static final void method489(int arg0, boolean arg1, boolean arg2, class553 arg3) {
        if (arg0 != -27920) {
            method487(114, null, 107, 35, 37, 117);
        }
        field847++;
        int var4 = arg3.field7827;
        int var5 = (int) arg3.field1798;
        arg3.method911(-52);
        if (arg1) {
            class409.method2481(var4, true);
        }
        class285.method1812(arg0 ^ 0xFFFFD2F0, var4);
        class549 var6 = class495.method2822((byte) -105, var5);
        if (var6 != null) {
            class412.method2497(var6, 86);
        }
        class264.method1675((byte) -12);
        if (!arg2 && class609.field8659 != -1) {
            class293.method1845(class609.field8659, 1, 0);
        }
        class305 var7 = new class305(class639.field9274);
        for (class553 var8 = (class553) var7.method1900(-1); var8 != null; var8 = (class553) var7.method1901((byte) 57)) {
            if (!var8.method912(false)) {
                var8 = (class553) var7.method1900(arg0 + 27919);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field7831 == 3) {
                int var9 = (int) var8.field1798;
                if (var9 >>> 16 == var4) {
                    method489(-27920, true, arg2, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ljj;)V")
    public class61(class66 arg0) {
        this.field849 = arg0;
    }
}
