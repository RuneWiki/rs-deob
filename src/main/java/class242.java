import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class242 {

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "Lte;")
    private class527 field3464;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "Lada;")
    public static class144 field3467;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "Lgf;")
    public static class232 field3468;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "Lgda;")
    private class49 field3462;

    static {
        new class572("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field3467 = new class144(59, -2);
        field3468 = new class232();
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1538(int arg0) {
        int var2 = 72 % ((arg0 + 32) / 33);
        if (this.field3464.field7856 && this.field3464.field7825 && this.field3462 == null) {
            class346 var3 = class522.method3080(-123, 35632, this.field3464, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var3 != null) {
                this.field3462 = class560.method3370(this.field3464, new class346[] { var3 }, -50);
            }
        }
        field3465++;
        return this.field3462 != null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IJ)V", line = 30)
    public static final void method1539(int arg0, long arg1) {
        field3463++;
        int var3 = class131.field1807 + class541.field8119.field8496;
        int var4 = class541.field8119.field8500 + class159.field2369;
        if (class24.field224 - var3 < -500 || class24.field224 - var3 > 500 || class111.field1579 - var4 < -500 || class111.field1579 - var4 > 500) {
            class24.field224 = var3;
            class111.field1579 = var4;
        }
        if (class24.field224 != var3) {
            int var5 = var3 - class24.field224;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class24.field224 += var6;
        }
        if (!class56.field668.field6852) {
            class539.field8023 += (float) arg1 * class308.field4258 / 6.0F;
            class278.field3902 += (float) arg1 * class92.field1389 / 6.0F;
        }
        if (class111.field1579 != var4) {
            int var7 = var4 - class111.field1579;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class111.field1579 += var8;
        }
        if (arg0 != 0) {
            method1541(116);
        }
        class84.method634(arg0 ^ 0x1);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(FBLau;Lau;)Z", line = 122)
    public final boolean method1540(float arg0, byte arg1, class629 arg2, class629 arg3) {
        field3466++;
        if (!this.method1538(5)) {
            return false;
        }
        class266 var5 = this.field3464.field7817;
        class86 var6 = new class86(this.field3464, 6408, arg3.field9248, arg3.field9238);
        boolean var7 = false;
        this.field3464.method3149(1, var5);
        var5.method1672((byte) -125, 0, var6);
        if (var5.method1677((byte) 81)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field9248, arg3.field9238);
            OpenGL.glUseProgramObjectARB(this.field3462.field575);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3462.field575, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3462.field575, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3462.field575, "sampleSize"), 1.0F / (float) arg2.field9248, 1.0F / (float) arg2.field9238);
            for (int var8 = 0; var8 < arg3.field9239; var8++) {
                float var9 = (float) var8 / (float) arg3.field9239;
                this.field3464.method3152(-2, arg2);
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
                arg3.method3667(arg1 + 27818, 0, arg3.field9248, var8, 0, 0, 0, arg3.field9238);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method1678(0, true);
        this.field3464.method3158(arg1 + 201, var5);
        if (arg1 != 54) {
            method1539(-118, -20L);
        }
        return var7;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V", line = 190)
    public static void method1541(int arg0) {
        field3468 = null;
        if (arg0 != -500) {
            field3467 = null;
        }
        field3467 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lte;)V", line = 201)
    public class242(class527 arg0) {
        this.field3464 = arg0;
    }
}
