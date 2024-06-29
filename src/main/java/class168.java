import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class168 {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lvj;")
    private class422 field1877;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lcq;")
    public static class110 field1883 = new class110(58, 10);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Ldi;")
    private class243 field1879;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Llba;")
    public static class255 field1884;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 6)
    public static final void method915(int arg0) {
        field1881++;
        if (class194.field2239 != null) {
            return;
        }
        class194.field2239 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFDA6) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3C8) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class194.field2239[var3] = var35;
        }
        if (arg0 != 23876) {
            field1883 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Z", line = 123)
    public final boolean method916(int arg0) {
        if (arg0 > -5) {
            field1883 = null;
        }
        if (this.field1877.field5948 && this.field1877.field5879 && this.field1879 == null) {
            class424 var2 = class6.method45(35632, true, this.field1877, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field1879 = class306.method1762(new class424[] { var2 }, (byte) -79, this.field1877);
            }
        }
        field1876++;
        return this.field1879 != null;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V", line = 148)
    public static final void method917(int arg0) {
        class551.field7881 = class583.method3301(0.4F, 8, 2048, 8, true, 35, 4, 2);
        field1874++;
        if (arg0 > -26) {
            method915(122);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZFLcd;Lcd;)Z", line = 161)
    public final boolean method918(boolean arg0, float arg1, class90 arg2, class90 arg3) {
        field1882++;
        if (!arg0) {
            return false;
        } else if (this.method916(-31)) {
            class24 var5 = this.field1877.field5925;
            class508 var6 = new class508(this.field1877, 6408, arg2.field907, arg2.field901);
            this.field1877.method2364(var5, (byte) -128);
            boolean var7 = false;
            var5.method113(var6, 0, (byte) -34);
            if (var5.method124((byte) -102)) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, arg2.field907, arg2.field901);
                OpenGL.glUseProgramObjectARB(this.field1879.field3000);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field1879.field3000, "heightMap"), 0);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field1879.field3000, "rcpRelief"), 1.0F / arg1);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field1879.field3000, "sampleSize"), 1.0F / (float) arg3.field907, 1.0F / (float) arg3.field901);
                for (int var8 = 0; var8 < arg2.field900; var8++) {
                    float var9 = (float) var8 / (float) arg2.field900;
                    this.field1877.method2396((byte) 36, arg3);
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
                    arg2.method460(0, arg2.field907, 0, var8, 0, 0, arg2.field901, 0);
                }
                OpenGL.glUseProgramObjectARB(0L);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                var7 = true;
                OpenGL.glPopMatrix();
            }
            var5.method125(0, 1);
            this.field1877.method2429(-30575, var5);
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)V", line = 231)
    public static final void method919(int arg0, byte arg1, int arg2) {
        field1880++;
        class76 var3 = class3.method28(12, (byte) 42, arg2);
        var3.method403((byte) -85);
        if (arg1 != 12) {
            field1878 = -81;
        }
        var3.field785 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lvj;)V", line = 247)
    public class168(class422 arg0) {
        this.field1877 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V", line = 257)
    public static void method920(boolean arg0) {
        field1883 = null;
        if (!arg0) {
            field1883 = null;
        }
        field1884 = null;
    }
}
