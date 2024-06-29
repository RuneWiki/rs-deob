import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class71 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lnq;")
    private class325 field986;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lsu;")
    private class142 field987;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[Lo;")
    public static class23[] field988;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method491(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1) {
            method493((byte) -91, null, 45);
        }
        field995++;
        int var4 = 255 - arg1;
        int var5 = ((arg0 & 0xFF00FF) * arg1 & 0xFF00FF00 | (arg0 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
        return (((arg2 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg2 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBLwk;II)V", line = 28)
    public static final void method492(int arg0, byte arg1, class96 arg2, int arg3, int arg4) {
        field993++;
        int var5 = arg2.field3917[0];
        int var6 = arg2.field3915[0];
        if (var5 < 0 || class398.field6071 <= var5 || var6 < 0 || var6 >= class528.field7734 || arg4 < 0 || arg4 >= class398.field6071 || arg3 < 0 || arg3 >= class528.field7734) {
            return;
        }
        int var7 = class275.method1769(class166.field2252, 0, var6, 0, 0, -4, arg3, true, arg2.method637((byte) -101), arg4, class466.field6948, class9.field174[arg2.field1866], 0, 99999999, var5);
        if (var7 >= arg0 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg2.method642(class466.field6948[var8], class166.field2252[var8], arg1, (byte) 105);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLhi;I)Lj;", line = 64)
    public static final class384 method493(byte arg0, class140 arg1, int arg2) {
        field991++;
        class384 var3;
        if (class96.field1430 == null) {
            var3 = new class384();
        } else {
            var3 = class96.field1430;
            class96.field1430 = class96.field1430.field5834;
            class412.field6263--;
            var3.field5834 = null;
        }
        if (arg0 != 21) {
            method494(-97, null, -29, (byte) -125, null, null);
        }
        var3.field5833 = arg2;
        var3.field5832 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V", line = 88)
    public static final void method494(int arg0, String arg1, int arg2, byte arg3, String arg4, String arg5) {
        class525.method3111(arg5, null, arg2, arg1, -1, 28353, arg4, arg0);
        if (arg3 < 81) {
            field988 = null;
        }
        field994++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 99)
    public static void method495(int arg0) {
        field988 = null;
        if (arg0 != 0) {
            field988 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Llj;Llj;FB)Z", line = 110)
    public final boolean method496(class439 arg0, class439 arg1, float arg2, byte arg3) {
        if (arg3 != -44) {
            return true;
        }
        field990++;
        if (!this.method497(arg3 ^ 0xFFFFFFD4)) {
            return false;
        }
        class447 var5 = this.field986.field5013;
        class60 var6 = new class60(this.field986, 6408, arg1.field6619, arg1.field6622);
        this.field986.method2071(arg3 + 167, var5);
        boolean var7 = false;
        var5.method2715(0, false, var6);
        if (var5.method2713(36053)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field6619, arg1.field6622);
            OpenGL.glUseProgramObjectARB(this.field987.field1898);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field987.field1898, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field987.field1898, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field987.field1898, "sampleSize"), 1.0F / (float) arg0.field6619, 1.0F / (float) arg0.field6622);
            for (int var8 = 0; var8 < arg1.field6617; var8++) {
                float var9 = (float) var8 / (float) arg1.field6617;
                this.field986.method2075(arg0, 0);
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
                arg1.method2658(arg1.field6619, 0, 0, 0, 0, var8, 54, arg1.field6622);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method2717(0, (byte) -124);
        this.field986.method2055(var5, arg3 + 137);
        return var7;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lnq;)V", line = 179)
    public class71(class325 arg0) {
        this.field986 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Z", line = 188)
    public final boolean method497(int arg0) {
        if (this.field986.field4939 && this.field986.field4923 && this.field987 == null) {
            class473 var2 = class222.method1502("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field986, 35632, (byte) -95);
            if (var2 != null) {
                this.field987 = class194.method1306(this.field986, new class473[] { var2 }, (byte) -114);
            }
        }
        if (arg0 == 0) {
            field992++;
            return this.field987 != null;
        } else {
            return false;
        }
    }
}
