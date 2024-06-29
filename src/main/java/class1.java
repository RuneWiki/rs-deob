import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Lna;")
    private class211 field1;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "J")
    public static long field5 = 0L;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lbi;")
    public static class104 field7 = new class104(33, -1);

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lss;")
    public static class213 field9 = new class213("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Lmv;")
    private class233 field4;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public static void method1(byte arg0) {
        int var1 = 58 % ((-arg0 - 42) / 56);
        field9 = null;
        field7 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLza;ILnj;I)V")
    public static final void method2(byte arg0, class497 arg1, int arg2, class317 arg3, int arg4) {
        field2++;
        class541.field7908.method2120((byte) 27);
        if (class411.field6235 || arg0 != -107) {
            return;
        }
        for (class224 var5 = (class224) arg3.method2123(-99); var5 != null; var5 = (class224) arg3.method2126((byte) 61)) {
            class210 var6 = class194.field2866.method662(var5.field3759, true);
            if (class299.method2002((byte) -84, var6)) {
                boolean var7 = class266.method1815(arg1, arg2, arg4, 126, var6, var5);
                if (var7) {
                    class322.method2148(var6, arg1, var5, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)B")
    public static final byte method3(int arg0, int arg1, int arg2) {
        field6++;
        if (arg2 == 9) {
            return (byte) (~(arg1 & 0x1) == arg0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z")
    public final boolean method4(int arg0) {
        field3++;
        if (arg0 != 35632) {
            return true;
        }
        if (this.field1.field3529 && this.field1.field3545 && this.field4 == null) {
            class297 var2 = class284.method1908(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field1, (byte) 108);
            if (var2 != null) {
                this.field4 = class326.method2178(this.field1, new class297[] { var2 }, 114);
            }
        }
        return this.field4 != null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ler;IFLer;)Z")
    public final boolean method5(class160 arg0, int arg1, float arg2, class160 arg3) {
        field8++;
        if (!this.method4(35632)) {
            return false;
        }
        class146 var5 = this.field1.field3568;
        class85 var6 = new class85(this.field1, 6408, arg3.field2189, arg3.field2190);
        this.field1.method1522(true, var5);
        boolean var7 = false;
        var5.method881(0, (byte) -124, var6);
        if (var5.method888(18274)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field2189, arg3.field2190);
            OpenGL.glUseProgramObjectARB(this.field4.field3852);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field4.field3852, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field4.field3852, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field4.field3852, "sampleSize"), 1.0F / (float) arg0.field2189, 1.0F / (float) arg0.field2190);
            for (int var8 = 0; var8 < arg3.field2193; var8++) {
                float var9 = (float) var8 / (float) arg3.field2193;
                this.field1.method1540(124, arg0);
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
                arg3.method974(arg3.field2189, var8, (byte) -118, 0, 0, 0, 0, arg3.field2190);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method880(1675886592, 0);
        if (arg1 >= -61) {
            field5 = -120L;
        }
        this.field1.method1503(8, var5);
        return var7;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lna;)V")
    public class1(class211 arg0) {
        this.field1 = arg0;
    }
}
