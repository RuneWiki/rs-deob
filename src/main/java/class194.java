import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class194 {

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "Lda;")
    private class44 field3134;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Lvo;")
    private class32 field3133;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Z")
    public final boolean method1310(byte arg0) {
        if (this.field3134.field920 && this.field3134.field887 && this.field3133 == null) {
            class466 var2 = class257.method1658(35632, this.field3134, 2, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field3133 = class244.method1592(false, this.field3134, new class466[] { var2 });
            }
        }
        field3132++;
        if (arg0 <= 49) {
            return false;
        } else {
            return this.field3133 != null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
    public static final void method1311(int arg0, int arg1, int arg2) {
        field3130++;
        int var3 = class272.field4126.method2808(class265.field4034.method1977(class146.field2452, 67), -123);
        for (class328 var4 = (class328) class373.field5469.method1892(arg2 ^ 0x6F); var4 != null; var4 = (class328) class373.field5469.method1893((byte) -2)) {
            int var8 = class462.method2774((byte) 99, var4);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class332.field5041 * 16 + 21;
        int var6 = arg1 - (var3 / arg2);
        if ((var6 + var3) > class71.field1415) {
            var6 = class71.field1415 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg0;
        if ((var5 + arg0) > class65.field1330) {
            var7 = class65.field1330 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class229.field3561 = var6;
        class76.field1543 = true;
        class186.field2991 = class332.field5041 * 16 + (class192.field3105 ? 26 : 22);
        class280.field4218 = var7;
        class383.field5601 = var3;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(FLiq;Liq;I)Z")
    public final boolean method1312(float arg0, class434 arg1, class434 arg2, int arg3) {
        field3136++;
        if (!this.method1310((byte) 58)) {
            return false;
        }
        class206 var5 = this.field3134.field930;
        class438 var6 = new class438(this.field3134, 6408, arg1.field6461, arg1.field6459);
        boolean var7 = false;
        this.field3134.method434(arg3 + 10903, var5);
        var5.method1407(0, arg3 ^ arg3, var6);
        if (var5.method1413(false)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field6461, arg1.field6459);
            OpenGL.glUseProgramObjectARB(this.field3133.field504);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3133.field504, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3133.field504, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3133.field504, "sampleSize"), 1.0F / (float) arg2.field6461, 1.0F / (float) arg2.field6459);
            for (int var8 = 0; var8 < arg1.field6460; var8++) {
                float var9 = (float) var8 / (float) arg1.field6460;
                this.field3134.method381((byte) 28, arg2);
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
                arg1.method2606(arg1.field6461, 0, arg1.field6459, 0, var8, 0, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method1409(0, -59);
        this.field3134.method354(var5, true);
        return var7;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIII)V")
    public static final void method1313(int arg0, int arg1, int arg2, int arg3) {
        field3131++;
        if (arg3 != -1) {
            method1311(87, 73, 73);
        }
        class469 var4 = class360.field5288[arg1][arg0];
        class301.method1937(var4 == null ? class322.field4924 : var4, (byte) -58, arg2);
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lda;)V")
    public class194(class44 arg0) {
        this.field3134 = arg0;
    }
}
