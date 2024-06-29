import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class292 {

    @OriginalMember(owner = "client!tha", name = "e", descriptor = "Loea;")
    private class594 field4102;

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "Lqaa;")
    public static class27 field4103 = new class27(23, 2);

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "Las;")
    private class151 field4101;

    @OriginalMember(owner = "client!tha", name = "h", descriptor = "Leq;")
    public static class209 field4105;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(III)I", line = 7)
    public static final int method1877(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            return -13;
        }
        field4099++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lefa;Lefa;IF)Z", line = 35)
    public final boolean method1878(class182 arg0, class182 arg1, int arg2, float arg3) {
        field4098++;
        if (!this.method1880(35632)) {
            return false;
        }
        class419 var5 = this.field4102.field8672;
        class744 var6 = new class744(this.field4102, 6408, arg0.field2607, arg0.field2595);
        int var7 = -77 / ((arg2 - 2) / 41);
        this.field4102.method3446(var5, (byte) 19);
        boolean var8 = false;
        var5.method2567(0, -1, var6);
        if (var5.method2557(105)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field2607, arg0.field2595);
            OpenGL.glUseProgramObjectARB(this.field4101.field2282);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field4101.field2282, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field4101.field2282, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field4101.field2282, "sampleSize"), 1.0F / (float) arg1.field2607, 1.0F / (float) arg1.field2595);
            for (int var9 = 0; var9 < arg0.field2597; var9++) {
                float var10 = (float) var9 / (float) arg0.field2597;
                this.field4102.method3425(arg1, -51);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord3f(0.0F, 0.0F, var10);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 0.0F, var10);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 1.0F, var10);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3f(0.0F, 1.0F, var10);
                OpenGL.glVertex2f(0.0F, 1.0F);
                OpenGL.glEnd();
                arg0.method1302(false, var9, arg0.field2607, 0, 0, arg0.field2595, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var8 = true;
            OpenGL.glPopMatrix();
        }
        var5.method2555(0, (byte) 74);
        this.field4102.method3442((byte) -121, var5);
        return var8;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)V", line = 105)
    public static void method1879(int arg0) {
        field4103 = null;
        field4105 = null;
        if (arg0 != -3362) {
            method1879(-108);
        }
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)Z", line = 126)
    public final boolean method1880(int arg0) {
        field4100++;
        if (this.field4102.field8624 && this.field4102.field8684 && this.field4101 == null) {
            class698 var2 = class656.method3697(35632, arg0 - 35632, this.field4102, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field4101 = class701.method3942(new class698[] { var2 }, this.field4102, -89);
            }
        }
        if (arg0 != 35632) {
            method1877(-117, 11, -116);
        }
        return this.field4101 != null;
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Loea;)V", line = 153)
    public class292(class594 arg0) {
        this.field4102 = arg0;
    }
}
