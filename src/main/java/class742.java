import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class742 {

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "Ldia;")
    private class246 field10242;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "Lmga;")
    public static class739 field10241 = new class739(52, 15);

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "Lsw;")
    public static class787 field10243 = new class787(3);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field10237;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field10240;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "Loca;")
    private class277 field10239;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "Loja;")
    public static class480 field10244;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)Z", line = 8)
    public final boolean method4105(byte arg0) {
        if (arg0 != 36) {
            this.field10242 = null;
        }
        field10240++;
        if (this.field10242.field3617 && this.field10242.field3635 && this.field10239 == null) {
            class298 var2 = class293.method1856(35632, this.field10242, arg0 - 153, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field10239 = class148.method1116(arg0 + 10746, new class298[] { var2 }, this.field10242);
            }
        }
        return this.field10239 != null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I[IIIIIII)Z", line = 35)
    public static final boolean method4106(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 1874069218) {
            method4108(77);
        }
        if (arg5 < 0) {
            arg5 = 0;
        }
        field10236++;
        if (class492.field6819 < arg6) {
            arg6 = class492.field6819;
        }
        if (arg6 <= arg5) {
            return true;
        }
        int var8 = arg5 + arg2 - 1;
        int var9 = arg6 - arg5 >> 2;
        int var10 = arg0 * arg5 + arg3;
        int var10000;
        if (class626.field8524 == 1) {
            class592.field7964 += var9;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var16 = arg6 - arg5 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var8++;
                        if (arg1[var8] > var10) {
                            arg1[var8] = var10;
                        }
                        var10 += arg0;
                    }
                }
                var8++;
                if (arg1[var8] > var10) {
                    arg1[var8] = var10;
                }
                int var17 = arg0 + var10;
                var8++;
                if (arg1[var8] > var17) {
                    arg1[var8] = var17;
                }
                int var18 = arg0 + var17;
                var10000 = ~var18;
                var8++;
                if (var10000 > ~arg1[var8]) {
                    arg1[var8] = var18;
                }
                int var19 = arg0 + var18;
                var8++;
                if (arg1[var8] > var19) {
                    arg1[var8] = var19;
                }
                var10 = arg0 + var19;
            }
        } else {
            int var11 = var10 - 38400;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var12 = arg6 - arg5 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var8++;
                        if (arg1[var8] > var11) {
                            return false;
                        }
                        var11 += arg0;
                    }
                }
                var8++;
                if (arg1[var8] > var11) {
                    return false;
                }
                int var13 = arg0 + var11;
                var10000 = ~var13;
                var8++;
                if (var10000 > ~arg1[var8]) {
                    return false;
                }
                int var14 = arg0 + var13;
                var8++;
                if (arg1[var8] > var14) {
                    return false;
                }
                int var15 = arg0 + var14;
                var8++;
                if (arg1[var8] > var15) {
                    return false;
                }
                var11 = arg0 + var15;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BFLsk;Lsk;)Z", line = 133)
    public final boolean method4107(byte arg0, float arg1, class650 arg2, class650 arg3) {
        field10237++;
        if (!this.method4105((byte) 36)) {
            return false;
        }
        class682 var5 = this.field10242.field3627;
        if (arg0 >= 0) {
            this.field10242 = null;
        }
        class620 var6 = new class620(this.field10242, 6408, arg2.field9013, arg2.field9015);
        this.field10242.method1638((byte) -41, var5);
        boolean var7 = false;
        var5.method3794(-14736, var6, 0);
        if (var5.method3787((byte) 11)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg2.field9013, arg2.field9015);
            OpenGL.glUseProgramObjectARB(this.field10239.field4108);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field10239.field4108, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field10239.field4108, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field10239.field4108, "sampleSize"), 1.0F / (float) arg3.field9013, 1.0F / (float) arg3.field9015);
            for (int var8 = 0; var8 < arg2.field9023; var8++) {
                float var9 = (float) var8 / (float) arg2.field9023;
                this.field10242.method1653((byte) 77, arg3);
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
                arg2.method3623(true, var8, 0, arg2.field9013, 0, arg2.field9015, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method3792(0, -10604);
        this.field10242.method1621(var5, false);
        return var7;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 202)
    public static void method4108(int arg0) {
        field10241 = null;
        if (arg0 != -6376) {
            method4106(-22, null, -21, -46, 108, -21, 90, 13);
        }
        field10244 = null;
        field10243 = null;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Ldia;)V", line = 217)
    public class742(class246 arg0) {
        this.field10242 = arg0;
    }
}
