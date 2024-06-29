import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class321 {

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Lur;")
    private class377 field4277;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "[S")
    public static short[] field4278 = new short[] { 46, 19, 48, 45, 10, 8, 3, 6 };

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field4284 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field4274 = 0;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Lho;")
    public static class103 field4280 = new class103(39, 15);

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Luq;")
    private class113 field4275;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lfo;ZLjava/lang/String;I)Lhl;", line = 3)
    public static final class370 method1899(class361 arg0, boolean arg1, String arg2, int arg3) {
        field4276++;
        int var4 = arg0.method2148(arg2, 0);
        if (arg3 != 28709) {
            return null;
        } else if (var4 == -1) {
            return new class370(0);
        } else {
            int[] var5 = arg0.method2152(var4, -1);
            class370 var6 = new class370(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var6.field5038 > var7) {
                    class396 var9 = new class396(arg0.method2130(var4, var5[var8++], arg3 - 28835));
                    int var10 = var9.method2406((byte) -71);
                    int var11 = var9.method2386(-23648);
                    int var12 = var9.method2388((byte) -122);
                    if (!arg1 && var12 == 1) {
                        var6.field5038--;
                    } else {
                        var6.field5039[var7] = var10;
                        var6.field5035[var7] = var11;
                        var7++;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V", line = 48)
    public static final void method1900(boolean arg0, int arg1) {
        if (class446.field6499 != null) {
            class446.field6499.method2625(true);
            class446.field6499 = null;
        }
        field4285++;
        class328.field4360 = 0;
        class377.method2252((byte) 76);
        class478.method2923();
        for (int var2 = 0; var2 < 4; var2++) {
            class96.field1223[var2].method661(-99);
        }
        class477.method2910(arg1 ^ 0xFFFFB14E, false);
        System.gc();
        class310.method1851(2, false);
        class43.field460 = -1;
        class401.field5809 = false;
        class138.method859(true, true);
        class116.field1512 = 0;
        class293.field3882 = 0;
        class357.field4867 = 0;
        class126.field1634 = 0;
        class418.field6074 = 0;
        int var3 = 0;
        if (arg1 != -20147) {
            return;
        }
        while (var3 < class497.field7241.length) {
            class497.field7241[var3] = null;
            var3++;
        }
        class391.method2363(-101);
        for (int var4 = 0; var4 < 2048; var4++) {
            class29.field272[var4] = null;
        }
        class401.field5813 = 0;
        for (int var5 = 0; var5 < 32768; var5++) {
            class339.field4484[var5] = null;
        }
        class243.field3208.method293((byte) 80);
        class380.method2322((byte) 113);
        class263.field3537 = 0;
        class52.field606.method1329(arg1 ^ 0x4ED5);
        class528.method3134((byte) 124);
        class459.method2827((byte) -5);
        class488.field7160 = 0L;
        class102.field1387 = null;
        if (arg0) {
            class57.method345(arg1 + 20148, 11);
            return;
        }
        class57.method345(1, 2);
        try {
            class400.method2475(class381.field5518.field1828, -107, "loggedout");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 137)
    public static void method1901(boolean arg0) {
        field4280 = null;
        if (!arg0) {
            field4278 = null;
        }
        field4278 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)Z", line = 149)
    public final boolean method1902(byte arg0) {
        if (arg0 < 109) {
            this.field4275 = null;
        }
        if (this.field4277.field5417 && this.field4277.field5378 && this.field4275 == null) {
            class346 var2 = class113.method686("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, -113, this.field4277);
            if (var2 != null) {
                this.field4275 = class151.method904((byte) 30, new class346[] { var2 }, this.field4277);
            }
        }
        field4286++;
        return this.field4275 != null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)Lkf;", line = 180)
    public static final class168 method1903(int arg0) {
        field4282++;
        try {
            return new class403();
        } catch (Throwable var2) {
            try {
                return (class168) Class.forName("rn").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return arg0 == 0 ? new class315() : null;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lwt;ILwt;F)Z", line = 203)
    public final boolean method1904(class205 arg0, int arg1, class205 arg2, float arg3) {
        field4281++;
        if (!this.method1902((byte) 113)) {
            return false;
        }
        class354 var5 = this.field4277.field5373;
        if (arg1 != -18178) {
            this.field4275 = null;
        }
        class446 var6 = new class446(this.field4277, 6408, arg2.field2712, arg2.field2708);
        this.field4277.method2264(var5, -47);
        boolean var7 = false;
        var5.method2078(0, var6, 36053);
        if (var5.method2076((byte) -98)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg2.field2712, arg2.field2708);
            OpenGL.glUseProgramObjectARB(this.field4275.field1485);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field4275.field1485, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field4275.field1485, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field4275.field1485, "sampleSize"), 1.0F / (float) arg0.field2712, 1.0F / (float) arg0.field2708);
            for (int var8 = 0; var8 < arg2.field2711; var8++) {
                float var9 = (float) var8 / (float) arg2.field2711;
                this.field4277.method2236(arg0, 120);
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
                arg2.method1304(arg2.field2712, 0, var8, 0, 0, arg2.field2708, (byte) -96, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method2068(1, 0);
        this.field4277.method2271((byte) 39, var5);
        return var7;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)V", line = 273)
    public static final void method1905(int arg0, boolean arg1) {
        class382.field5526 = arg0;
        field4283++;
        class320.field4268.method3045(48);
        if (!arg1) {
            method1906(-113, null);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILug;)V", line = 289)
    public static final void method1906(int arg0, class396 arg1) {
        field4279++;
        byte[] var2 = new byte[24];
        if (class63.field735 != null) {
            try {
                class63.field735.method1094(110, 0L);
                class63.field735.method1103(0, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2438(0, var2, 24, 1769508784);
        if (arg0 != -1) {
            method1905(-100, true);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lur;)V", line = 343)
    public class321(class377 arg0) {
        this.field4277 = arg0;
    }
}
