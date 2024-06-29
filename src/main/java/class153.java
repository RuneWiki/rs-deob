import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class153 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lbl;")
    private class442 field2441;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Loe;")
    public static class127 field2442 = new class127(90, 8);

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lsj;")
    private class305 field2444;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lga;BLga;F)Z", line = 3)
    public final boolean method981(class266 arg0, byte arg1, class266 arg2, float arg3) {
        field2446++;
        if (!this.method984(5888)) {
            return false;
        }
        class96 var5 = this.field2441.field6742;
        if (arg1 >= -55) {
            method985(52, -113, -102, 97, 64, -109, 23);
        }
        class177 var6 = new class177(this.field2441, 6408, arg0.field4030, arg0.field4024);
        boolean var7 = false;
        this.field2441.method2612(-43, var5);
        var5.method727(var6, 0, false);
        if (var5.method719(-1)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field4030, arg0.field4024);
            OpenGL.glUseProgramObjectARB(this.field2444.field4626);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field2444.field4626, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field2444.field4626, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field2444.field4626, "sampleSize"), 1.0F / (float) arg2.field4030, 1.0F / (float) arg2.field4024);
            for (int var8 = 0; var8 < arg0.field4022; var8++) {
                float var9 = (float) var8 / (float) arg0.field4022;
                this.field2441.method2586(arg2, false);
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
                arg0.method1626(var8, 0, arg0.field4030, 0, true, arg0.field4024, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method728(false, 0);
        this.field2441.method2591((byte) 51, var5);
        return var7;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V", line = 76)
    public static void method982(boolean arg0) {
        if (arg0) {
            field2442 = null;
        }
        field2442 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lbe;Lig;ZIIILtq;I)V", line = 87)
    public static final void method983(class28 arg0, class154 arg1, boolean arg2, int arg3, int arg4, int arg5, class427 arg6, int arg7) {
        field2447++;
        if (arg1 == null) {
            return;
        }
        int var8;
        if (class408.field5928 == 4) {
            var8 = (int) class23.field289 & 0x3FFF;
        } else {
            var8 = (int) class23.field289 + class273.field4145 & 0x3FFF;
        }
        if (arg2) {
            return;
        }
        int var9 = Math.max(arg6.field6175 / 2, arg6.field6126 / 2) + 10;
        int var10 = arg3 * arg3 + arg4 * arg4;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class195.field3075[var8];
        int var12 = class195.field3077[var8];
        if (class408.field5928 != 4) {
            var11 = var11 * 256 / (class222.field3427 + 256);
            var12 = var12 * 256 / (class222.field3427 + 256);
        }
        int var13 = arg3 * var11 + arg4 * var12 >> 15;
        int var14 = arg3 * var12 - arg4 * var11 >> 15;
        arg1.method574(var13 + arg5 + (arg6.field6175 / 2 - arg1.method988() / 2), arg7 - -(arg6.field6126 / 2) + (-var14 - arg1.method989() / 2), arg0, arg5, arg7);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Z", line = 129)
    public final boolean method984(int arg0) {
        if (this.field2441.field6802 && this.field2441.field6720 && this.field2444 == null) {
            class108 var2 = class83.method596(35632, this.field2441, arg0 - 5993, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field2444 = class375.method2261(this.field2441, 108, new class108[] { var2 });
            }
        }
        if (arg0 != 5888) {
            this.field2441 = null;
        }
        field2445++;
        return this.field2444 != null;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lbl;)V", line = 159)
    public class153(class442 arg0) {
        this.field2441 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIII)I", line = 167)
    public static final int method985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        field2443++;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg5;
            arg5 = var8;
        }
        if (arg0 != -21284) {
            return -20;
        } else if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 1 - (arg1 - (7 - arg3));
        } else {
            return 1 - (arg5 + arg4 - 7);
        }
    }
}
