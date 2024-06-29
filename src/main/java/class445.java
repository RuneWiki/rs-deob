import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class445 {

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Lap;")
    private class435 field6121;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lpr;")
    public static class407 field6117 = new class407(105, 3);

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "[I")
    public static int[] field6124 = new int[5];

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Lkfa;")
    public static class549 field6123 = new class549(77, 3);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Llj;")
    private class555 field6114;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljm;BFLjm;)Z", line = 3)
    public final boolean method2459(class630 arg0, byte arg1, float arg2, class630 arg3) {
        field6122++;
        if (!this.method2460((byte) -92)) {
            return false;
        }
        class162 var5 = this.field6121.field6053;
        class491 var6 = new class491(this.field6121, 6408, arg0.field8953, arg0.field8951);
        boolean var7 = false;
        this.field6121.method2395(true, var5);
        var5.method977(var6, 0, (byte) 123);
        if (var5.method976((byte) 45)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field8953, arg0.field8951);
            OpenGL.glUseProgramObjectARB(this.field6114.field7904);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field6114.field7904, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field6114.field7904, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field6114.field7904, "sampleSize"), 1.0F / (float) arg3.field8953, 1.0F / (float) arg3.field8951);
            for (int var8 = 0; var8 < arg0.field8954; var8++) {
                float var9 = (float) var8 / (float) arg0.field8954;
                this.field6121.method2388((byte) 118, arg3);
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
                arg0.method3531(0, var8, 0, 7318, arg0.field8951, 0, 0, arg0.field8953);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        if (arg1 > -76) {
            return false;
        } else {
            var5.method988(0, 512);
            this.field6121.method2341(var5, (byte) -91);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Z", line = 73)
    public final boolean method2460(byte arg0) {
        if (this.field6121.field6063 && this.field6121.field5955 && this.field6114 == null) {
            class58 var2 = class182.method1062("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, (byte) -16, this.field6121);
            if (var2 != null) {
                this.field6114 = class596.method3341(-89, new class58[] { var2 }, this.field6121);
            }
        }
        if (arg0 != -92) {
            method2466(-51);
        }
        field6118++;
        return this.field6114 != null;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)I", line = 100)
    public static final int method2461(byte arg0) {
        field6113++;
        if ((double) class637.field9024 == 3.0D) {
            return 37;
        } else if ((double) class637.field9024 == 4.0D) {
            return 50;
        } else {
            int var1 = 126 % ((52 - arg0) / 58);
            if ((double) class637.field9024 == 6.0D) {
                return 75;
            } else if ((double) class637.field9024 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 128)
    public static final byte[] method2462(String arg0, int arg1) {
        field6120++;
        if (arg1 > -88) {
            method2461((byte) -4);
        }
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var3 - 2 >= var2 || class89.method553((byte) 5, arg0.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if (var3 - 1 >= var2 || class89.method553((byte) 5, arg0.charAt(var3 - 1)) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class618.method3472(0, 7, var5, arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII[I)V", line = 160)
    public static final void method2463(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field6119++;
        arg0--;
        if (arg1 < 91) {
            field6124 = null;
        }
        int var11 = arg2 - 1;
        int var5 = var11 - 7;
        while (var5 > arg0) {
            int var6 = arg0 + 1;
            arg4[var6] = arg3;
            int var7 = var6 + 1;
            arg4[var7] = arg3;
            int var8 = var7 + 1;
            arg4[var8] = arg3;
            int var9 = var8 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var12 = var10 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg0 = var13 + 1;
            arg4[arg0] = arg3;
        }
        while (arg0 < var11) {
            arg0++;
            arg4[arg0] = arg3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)Z", line = 193)
    public static final boolean method2464(boolean arg0, byte arg1) {
        field6116++;
        if (arg1 != -27) {
            method2462(null, 73);
        }
        boolean var2 = class453.field6284.method310();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class453.field6284.method280();
        } else if (!class453.field6284.method291()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class601.field8530.field2849 = arg0;
            class601.field8530.method1841(119, class623.field8837);
            return true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I", line = 230)
    public static final int method2465(int arg0, int arg1, int arg2) {
        field6115++;
        if (arg0 == arg1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 251)
    public static void method2466(int arg0) {
        if (arg0 == 7) {
            field6123 = null;
            field6124 = null;
            field6117 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lap;)V", line = 269)
    public class445(class435 arg0) {
        this.field6121 = arg0;
    }
}
