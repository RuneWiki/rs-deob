import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class220 {

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Len;")
    private class289 field3195;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field3192 = 0;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
    public static int[] field3190 = new int[1];

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Lfc;")
    public static class235 field3194 = new class235(82, 5);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Lwi;")
    public static class428 field3196;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lkba;")
    private class91 field3191;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 10)
    public static final void method1416(byte arg0) {
        field3189++;
        if (class35.field433 != null) {
            return;
        }
        class35.field433 = new int[65536];
        if (arg0 != 102) {
            field3190 = null;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFE32) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
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
            class35.field433[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V", line = 136)
    public static void method1417(byte arg0) {
        if (arg0 != 98) {
            field3190 = null;
        }
        field3190 = null;
        field3196 = null;
        field3194 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Z", line = 148)
    public final boolean method1418(int arg0) {
        if (arg0 <= 72) {
            field3190 = null;
        }
        if (this.field3195.field4252 && this.field3195.field4301 && this.field3191 == null) {
            class10 var2 = class387.method2233(35632, 61, this.field3195, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field3191 = class404.method2311(111, new class10[] { var2 }, this.field3195);
            }
        }
        field3193++;
        return this.field3191 != null;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)[Lrg;", line = 177)
    public static final class588[] method1419(int arg0) {
        field3187++;
        if (arg0 != 1) {
            method1416((byte) -13);
        }
        return new class588[] { class553.field7492, class186.field2740, class522.field7090 };
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Len;)V", line = 187)
    public class220(class289 arg0) {
        this.field3195 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(FBLrb;Lrb;)Z", line = 199)
    public final boolean method1420(float arg0, byte arg1, class321 arg2, class321 arg3) {
        field3188++;
        if (!this.method1418(115)) {
            return false;
        }
        class625 var5 = this.field3195.field4313;
        class601 var6 = new class601(this.field3195, 6408, arg2.field4751, arg2.field4753);
        this.field3195.method1817(var5, false);
        boolean var7 = false;
        int var8 = -104 % ((18 - arg1) / 36);
        var5.method3476(0, var6, 82);
        if (var5.method3475(28296)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg2.field4751, arg2.field4753);
            OpenGL.glUseProgramObjectARB(this.field3191.field1204);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3191.field1204, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3191.field1204, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3191.field1204, "sampleSize"), 1.0F / (float) arg3.field4751, 1.0F / (float) arg3.field4753);
            for (int var9 = 0; var9 < arg2.field4750; var9++) {
                float var10 = (float) var9 / (float) arg2.field4750;
                this.field3195.method1804(false, arg3);
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
                arg2.method1955(0, arg2.field4751, var9, false, 0, 0, 0, arg2.field4753);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method3469((byte) -65, 0);
        this.field3195.method1785(var5, (byte) -1);
        return var7;
    }
}
