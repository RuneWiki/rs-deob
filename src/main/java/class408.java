import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class408 {

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "Luq;")
    private class313 field5594;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Z")
    public static boolean field5600 = false;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "Lvt;")
    public static class344 field5599 = new class344("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "Lqca;")
    private class610 field5596;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Z")
    public final boolean method2432(int arg0) {
        field5595++;
        if (arg0 != 35632) {
            field5600 = true;
        }
        if (this.field5594.field4336 && this.field5594.field4274 && this.field5596 == null) {
            class364 var2 = class579.method3253("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field5594, 35632, false);
            if (var2 != null) {
                this.field5596 = class643.method3710(this.field5594, arg0 - 35528, new class364[] { var2 });
            }
        }
        return this.field5596 != null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lmm;ILmm;F)Z")
    public final boolean method2433(class26 arg0, int arg1, class26 arg2, float arg3) {
        field5597++;
        if (!this.method2432(35632)) {
            return false;
        }
        class327 var5 = this.field5594.field4314;
        if (arg1 != 11) {
            method2437((byte) 3);
        }
        class584 var6 = new class584(this.field5594, 6408, arg2.field444, arg2.field446);
        boolean var7 = false;
        this.field5594.method1918(var5, 121);
        var5.method2017(0, var6, arg1 ^ 0x3C);
        if (var5.method2020(-63)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg2.field444, arg2.field446);
            OpenGL.glUseProgramObjectARB(this.field5596.field8770);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field5596.field8770, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field5596.field8770, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field5596.field8770, "sampleSize"), 1.0F / (float) arg0.field444, 1.0F / (float) arg0.field446);
            for (int var8 = 0; var8 < arg2.field445; var8++) {
                float var9 = (float) var8 / (float) arg2.field445;
                this.field5594.method1884(arg0, arg1 - 13);
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
                arg2.method156(0, 0, arg1 ^ 0xB, var8, arg2.field444, 0, 0, arg2.field446);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method2022(false, 0);
        this.field5594.method1917((byte) 54, var5);
        return var7;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII)V")
    public static final void method2434(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 58 % ((31 - arg1) / 45);
        field5598++;
        class266 var5 = class257.field3197[arg2][arg0];
        class409.method2440((byte) -86, var5 == null ? class597.field8614 : var5, arg3);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZBIII)V")
    public static final void method2435(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg2 != 94) {
            method2437((byte) 90);
        }
        field5592++;
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class145.field1892 - class343.field4766) * var6 / 100 + class343.field4766;
        if (var7 < class354.field4956) {
            var7 = class354.field4956;
        } else if (var7 > class228.field2926) {
            var7 = class228.field2926;
        }
        int var8 = arg3 * var7 * 512 / (arg4 * 334);
        if (class154.field2003 > var8) {
            short var12 = class154.field2003;
            var7 = arg4 * var12 * 334 / (arg3 * 512);
            if (var7 > class228.field2926) {
                var7 = class228.field2926;
                int var13 = var7 * 512 * arg3 / (var12 * 334);
                int var14 = (arg4 - var13) / 2;
                if (arg1) {
                    class301.field3918.method962();
                    class301.field3918.method974(-16777216, 1, arg3, arg0, var14, arg5);
                    class301.field3918.method974(-16777216, arg2 - 93, arg3, arg0 + arg4 - var14, var14, arg5);
                }
                arg4 -= var14 * 2;
                arg0 += var14;
            }
        } else if (var8 > class450.field6370) {
            short var9 = class450.field6370;
            var7 = arg4 * var9 * 334 / (arg3 * 512);
            if (var7 < class354.field4956) {
                var7 = class354.field4956;
                int var10 = arg4 * var9 * 334 / (var7 * 512);
                int var11 = (arg3 - var10) / 2;
                if (arg1) {
                    class301.field3918.method962();
                    class301.field3918.method974(-16777216, 1, var11, arg0, arg4, arg5);
                    class301.field3918.method974(-16777216, 1, var11, arg0, arg4, arg3 + arg5 - var11);
                }
                arg3 -= var11 * 2;
                arg5 += var11;
            }
        }
        class386.field5375 = arg5;
        class221.field2838 = (short) arg4;
        class94.field1251 = arg0;
        class350.field4819 = arg3 * var7 / 334;
        class151.field1992 = (short) arg3;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Z")
    public static final boolean method2436(int arg0, int arg1) {
        field5593++;
        class53.field706 = arg1 + 1 & 0xFFFF;
        class634.field9232 = true;
        if (arg0 != -8759) {
            field5601 = -115;
        }
        return true;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Luq;)V")
    public class408(class313 arg0) {
        this.field5594 = arg0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
    public static void method2437(byte arg0) {
        field5599 = null;
        if (arg0 > -12) {
            method2434(121, -31, 76, 15);
        }
    }
}
