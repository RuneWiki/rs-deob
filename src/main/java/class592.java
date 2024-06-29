import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class592 {

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Lkga;")
    private class506 field8567;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "Lvg;")
    public static class49 field8574 = new class49();

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Lfr;")
    private class378 field8569;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(FBLpfa;Lpfa;)Z")
    public final boolean method3431(float arg0, byte arg1, class268 arg2, class268 arg3) {
        if (arg1 >= -60) {
            return true;
        }
        field8573++;
        if (!this.method3432(28261)) {
            return false;
        }
        class416 var5 = this.field8567.field7346;
        class261 var6 = new class261(this.field8567, 6408, arg3.field3673, arg3.field3676);
        this.field8567.method2953(115, var5);
        boolean var7 = false;
        var5.method2498(0, var6, 0);
        if (var5.method2504(42)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field3673, arg3.field3676);
            OpenGL.glUseProgramObjectARB(this.field8569.field5078);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field8569.field5078, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field8569.field5078, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field8569.field5078, "sampleSize"), 1.0F / (float) arg2.field3673, 1.0F / (float) arg2.field3676);
            for (int var8 = 0; var8 < arg3.field3671; var8++) {
                float var9 = (float) var8 / (float) arg3.field3671;
                this.field8567.method2932(true, arg2);
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
                arg3.method1621(0, var8, arg3.field3676, 0, 0, 0, arg3.field3673, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method2502(0, 9136);
        this.field8567.method2954(var5, true);
        return var7;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z")
    public final boolean method3432(int arg0) {
        if (arg0 != 28261) {
            method3435(82, null);
        }
        if (this.field8567.field7397 && this.field8567.field7370 && this.field8569 == null) {
            class97 var2 = class161.method1021(this.field8567, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, -114);
            if (var2 != null) {
                this.field8569 = class339.method1957(new class97[] { var2 }, this.field8567, (byte) -116);
            }
        }
        field8566++;
        return this.field8569 != null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILfa;Lr;IIII)V")
    public static final void method3433(int arg0, class212 arg1, class165 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class411.field5847 < 100) {
            class229.method1387(arg2, false, arg1);
        }
        field8571++;
        arg2.method292(arg3, arg5, arg3 + arg4, arg5 - -arg6);
        if (class411.field5847 < 100) {
            byte var7 = 20;
            int var8 = arg3 + (arg4 / 2);
            int var9 = arg6 / 2 + arg5 - var7 - 18;
            arg2.method248(arg3, arg5, arg4, arg6, -16777216, 0);
            arg2.method278(var8 - 152, var9, 304, 34, class24.field578[class675.field9686].getRGB(), 0);
            arg2.method248(var8 - 150, var9 + 2, class411.field5847 * 3, 30, class156.field1908[class675.field9686].getRGB(), 0);
            class36.field691.method2525(var8, var7 + var9, class424.field6056.method2561(class370.field4980, 0), class678.field9724[class675.field9686].getRGB(), -1, 122);
            return;
        }
        int var10 = class418.field5921 - (int) ((float) arg4 / class550.field7984);
        int var11 = (int) ((float) arg6 / class550.field7984) + class426.field6111;
        int var12 = class418.field5921 + ((int) ((float) arg4 / class550.field7984));
        class469.field6558 = class426.field6111 - ((int) ((float) arg6 / class550.field7984));
        class620.field8887 = (int) ((float) (arg4 * 2) / class550.field7984);
        int var13 = class426.field6111 - ((int) ((float) arg6 / class550.field7984));
        class653.field9276 = (int) ((float) (arg6 * 2) / class550.field7984);
        class353.field4719 = class418.field5921 - ((int) ((float) arg4 / class550.field7984));
        class550.method3224(var10 + class550.field8007, class550.field8009 + var11, class550.field8007 + var12, class550.field8009 + var13, arg3, arg5, arg3 + arg4, arg5 - -arg6 + 1);
        class550.method3230(arg2);
        class183 var14 = class550.method3231(arg2);
        class96.method733(arg0, true, arg2, var14, 0);
        if (class200.field2421 > 0) {
            class167.field2045--;
            if (class167.field2045 == 0) {
                class167.field2045 = 20;
                class200.field2421--;
            }
        }
        if (!class564.field8151) {
            return;
        }
        int var15 = arg3 + arg4 - 5;
        int var16 = arg5 + arg6 - 8;
        class657.field9330.method2521(var15, 16776960, var16, -1, "Fps:" + class307.field4073, -1);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class657.field9330.method2521(var15, var19, var20, -1, "Mem:" + var18 + "k", arg0 - 1);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)I")
    public static final int method3434(int arg0, int arg1) {
        field8570++;
        if (arg1 <= 18) {
            field8574 = null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILun;)V")
    public static final void method3435(int arg0, class389 arg1) {
        field8568++;
        int var2 = -66 / ((arg0 - 40) / 44);
        for (int var3 = 0; var3 < class681.field9749; var3++) {
            int var4 = arg1.method2266((byte) 110);
            int var5 = arg1.method2260(-116);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class487.field6815[var4] != null) {
                class487.field6815[var4].field7797 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IFIIFIFI)[F")
    public static final float[] method3436(int arg0, float arg1, int arg2, int arg3, float arg4, int arg5, float arg6, int arg7) {
        field8572++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[7] = 0.0F;
        var8[2] = var11;
        var8[8] = var10;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        var8[1] = 0.0F;
        var8[3] = 0.0F;
        var8[0] = var10;
        var8[6] = -var11;
        float var12 = 1.0F - var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg5 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var18 = 1.0F - var15;
        if (arg7 > -71) {
            method3433(-121, null, null, 124, -54, -51, -69);
        }
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg0 / var19;
                var14 = (float) (-arg2) / var19;
            }
            var13[6] = var14 * var16 * var18;
            var13[3] = -var16 * var17;
            var13[7] = -var14 * var17;
            var13[8] = var16 * var16 * var18 + var15;
            var13[4] = var15;
            var13[1] = var16 * var17;
            var13[2] = var14 * var16 * var18;
            var13[0] = var14 * var14 * var18 + var15;
            var13[5] = var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[5] *= arg1;
        var9[7] *= arg6;
        var9[3] *= arg1;
        var9[0] *= arg4;
        var9[2] *= arg4;
        var9[8] *= arg6;
        var9[6] *= arg6;
        var9[1] *= arg4;
        var9[4] *= arg1;
        return var9;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
    public static void method3437(int arg0) {
        field8574 = null;
        if (arg0 != -14117) {
            method3436(-121, 1.309692F, 55, -107, -0.3066518F, -59, 1.5484456F, 59);
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lkga;)V")
    public class592(class506 arg0) {
        this.field8567 = arg0;
    }
}
