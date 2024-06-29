import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class252 {

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Lih;")
    private class214 field4301;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Leq;")
    private class256 field4302;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4300;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "[Lsh;")
    public static class194[] field4299;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 10)
    public static void method1717(int arg0) {
        field4300 = null;
        field4299 = null;
        if (arg0 != 5888) {
            method1717(-67);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Liv;Liv;FB)Z", line = 23)
    public final boolean method1718(class428 arg0, class428 arg1, float arg2, byte arg3) {
        field4303++;
        if (!this.method1719(0)) {
            return false;
        }
        class533 var5 = this.field4301.field3649;
        class213 var6 = new class213(this.field4301, 6408, arg1.field6418, arg1.field6423);
        this.field4301.method1429(0, var5);
        boolean var7 = false;
        var5.method3154(var6, (byte) 20, 0);
        int var8 = 111 / ((-arg3 - 77) / 37);
        if (var5.method3165((byte) 81)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field6418, arg1.field6423);
            OpenGL.glUseProgramObjectARB(this.field4302.field4330);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field4302.field4330, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field4302.field4330, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field4302.field4330, "sampleSize"), 1.0F / (float) arg0.field6418, 1.0F / (float) arg0.field6423);
            for (int var9 = 0; var9 < arg1.field6419; var9++) {
                float var10 = (float) var9 / (float) arg1.field6419;
                this.field4301.method1471(true, arg0);
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
                arg1.method2609(0, 0, 0, 0, arg1.field6418, var9, arg1.field6423, true);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method3157(119, 0);
        this.field4301.method1416(var5, 107);
        return var7;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)Z", line = 95)
    public final boolean method1719(int arg0) {
        if (this.field4301.field3724 && this.field4301.field3721 && this.field4302 == null) {
            class303 var2 = class64.method421((byte) -119, 35632, this.field4301, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field4302 = class287.method1864(new class303[] { var2 }, this.field4301, arg0 ^ 0x1);
            }
        }
        if (arg0 != 0) {
            field4299 = null;
        }
        field4298++;
        return this.field4302 != null;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lih;)V", line = 122)
    public class252(class214 arg0) {
        this.field4301 = arg0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BIII)I", line = 130)
    public static final int method1720(byte arg0, int arg1, int arg2, int arg3) {
        field4304++;
        if (class57.field900 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg2 - class210.field3357;
        int var7 = arg3 - class210.field3340;
        class366 var8 = (class366) class210.field3332.method2538(-3);
        if (arg0 <= 123) {
            method1720((byte) -2, 90, 10, -24);
        }
        while (var8 != null) {
            if (var8.field5694 == arg1) {
                int var9 = var8.field5692;
                int var10 = var8.field5690;
                int var11 = class210.field3340 + var10 | class210.field3357 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
            var8 = (class366) class210.field3332.method2535((byte) -62);
        }
        return var4;
    }
}
