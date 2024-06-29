import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class576 {

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Llj;")
    private class565 field8147;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lwba;")
    private class46 field8149;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lfba;Lfba;BF)Z")
    public final boolean method3288(class24 arg0, class24 arg1, byte arg2, float arg3) {
        field8144++;
        if (!this.method3292(-26176)) {
            return false;
        }
        class254 var5 = this.field8147.field7889;
        class624 var6 = new class624(this.field8147, 6408, arg0.field298, arg0.field297);
        boolean var7 = false;
        this.field8147.method3200((byte) -47, var5);
        var5.method1562(true, 0, var6);
        if (var5.method1563(-6236)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field298, arg0.field297);
            OpenGL.glUseProgramObjectARB(this.field8149.field552);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field8149.field552, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field8149.field552, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field8149.field552, "sampleSize"), 1.0F / (float) arg1.field298, 1.0F / (float) arg1.field297);
            for (int var8 = 0; var8 < arg0.field290; var8++) {
                float var9 = (float) var8 / (float) arg0.field290;
                this.field8147.method3206(arg1, (byte) 26);
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
                arg0.method242(2, arg0.field297, var8, 0, 0, 0, 0, arg0.field298);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method1565(-101, 0);
        this.field8147.method3166(var5, (byte) -126);
        return arg2 > -57 ? true : var7;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)Z")
    public static final boolean method3289(int arg0, int arg1, int arg2) {
        field8146++;
        if (arg0 == 0) {
            return (arg2 & 0x580) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIZII)V")
    public static final void method3290(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            field8143 = 88;
        }
        field8145++;
        int var6 = arg5 - arg2;
        int var7 = arg4 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class670.method3782(arg2, arg0, (byte) -112, arg1, arg4);
            }
        } else if (var7 == 0) {
            class222.method1404(arg0, arg2, -1, arg5, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class128.field1831) {
                var10 = class128.field1831;
                var11 = (class128.field1831 * var8 >> 12) + var9;
            } else if (class529.field7169 >= arg5) {
                var10 = arg5;
                var11 = arg4;
            } else {
                var11 = (class529.field7169 * var8 >> 12) + var9;
                var10 = class529.field7169;
            }
            int var12;
            int var13;
            if (class128.field1831 > arg2) {
                var12 = class128.field1831;
                var13 = (class128.field1831 * var8 >> 12) + var9;
            } else if (class529.field7169 < arg2) {
                var12 = class529.field7169;
                var13 = (class529.field7169 * var8 >> 12) + var9;
            } else {
                var12 = arg2;
                var13 = arg0;
            }
            if (var13 < class469.field6466) {
                var13 = class469.field6466;
                var12 = (class469.field6466 - var9 << 12) / var8;
            } else if (var13 > class533.field7200) {
                var13 = class533.field7200;
                var12 = (class533.field7200 - var9 << 12) / var8;
            }
            if (var11 < class469.field6466) {
                var11 = class469.field6466;
                var10 = (class469.field6466 - var9 << 12) / var8;
            } else if (class533.field7200 < var11) {
                var11 = class533.field7200;
                var10 = (class533.field7200 - var9 << 12) / var8;
            }
            class25.method247(var11, var12, var13, arg1, var10, 58);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method3291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8148++;
        if ((arg3 + arg5) <= arg1 || arg3 >= (arg1 + arg2)) {
            return false;
        } else if (arg0 <= 60) {
            return false;
        } else {
            return arg7 < (arg6 + arg8) && arg4 + arg7 > arg8;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Z")
    public final boolean method3292(int arg0) {
        if (this.field8147.field7949 && this.field8147.field7890 && this.field8149 == null) {
            class17 var2 = class78.method604((byte) -125, this.field8147, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field8149 = class138.method966((byte) -66, this.field8147, new class17[] { var2 });
            }
        }
        if (arg0 == -26176) {
            field8142++;
            return this.field8149 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Llj;)V")
    public class576(class565 arg0) {
        this.field8147 = arg0;
    }
}
