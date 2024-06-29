import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class159 {

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Ltt;")
    private class249 field2418;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field2416 = 0;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Leg;")
    public static class34 field2414 = new class34("", 15);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lbr;")
    private class147 field2417;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Z")
    public static boolean field2411;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lfi;", line = 9)
    public static final class38 method1143(int arg0, int arg1) {
        field2420++;
        int var2 = arg1 >> 16;
        if (arg0 != -357225936) {
            return null;
        }
        int var3 = arg1 & 0xFFFF;
        if (class237.field3555[var2] == null || class237.field3555[var2][var3] == null) {
            boolean var4 = class31.method189(14, var2);
            if (!var4) {
                return null;
            }
        }
        return class237.field3555[var2][var3];
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BIII)I", line = 34)
    public static final int method1144(byte arg0, int arg1, int arg2, int arg3) {
        field2410++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else {
            if (arg0 <= 88) {
                field2411 = true;
            }
            return var4 == 2 ? 1023 - arg2 : -arg3 + 1023;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)I", line = 57)
    public static final int method1145(byte arg0) {
        field2412++;
        if (arg0 != 121) {
            method1143(-94, -114);
        }
        if (class337.field5072 == null) {
            return class368.field5419 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IFLfd;Lfd;)Z", line = 77)
    public final boolean method1146(int arg0, float arg1, class111 arg2, class111 arg3) {
        field2419++;
        if (!this.method1150(35632)) {
            return false;
        }
        class35 var5 = this.field2418.field3980;
        class296 var6 = new class296(this.field2418, 6408, arg2.field1664, arg2.field1661);
        this.field2418.method1765(var5, (byte) 21);
        boolean var7 = false;
        var5.method230(var6, false, arg0);
        if (var5.method220(-16793)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg2.field1664, arg2.field1661);
            OpenGL.glUseProgramObjectARB(this.field2417.field2191);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field2417.field2191, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field2417.field2191, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field2417.field2191, "sampleSize"), 1.0F / (float) arg3.field1664, 1.0F / (float) arg3.field1661);
            for (int var8 = 0; var8 < arg2.field1663; var8++) {
                float var9 = (float) var8 / (float) arg2.field1663;
                this.field2418.method1749(25752, arg3);
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
                arg2.method861((byte) 82, 0, var8, 0, 0, 0, arg2.field1664, arg2.field1661);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method231((byte) 63, 0);
        this.field2418.method1782(var5, true);
        return var7;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)I", line = 144)
    public static final int method1147(byte arg0, int arg1, int arg2) {
        field2413++;
        if (arg0 <= 112) {
            field2411 = false;
        }
        return arg1 == 4 || arg1 == 5 ? class453.field6737[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V", line = 170)
    public static final void method1148(int arg0, int arg1, int arg2, int arg3) {
        class281 var4 = class348.field5192[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class202 var5 = var4.field4376;
        class202 var6 = var4.field4389;
        if (var5 != null) {
            var5.field3131 = var5.field3131 * arg3 / (0x10 << class295.field4543 - 7);
            var5.field3120 = var5.field3120 * arg3 / (0x10 << class295.field4543 - 7);
        }
        if (var6 != null) {
            var6.field3131 = var6.field3131 * arg3 / (0x10 << class295.field4543 - 7);
            var6.field3120 = var6.field3120 * arg3 / (0x10 << class295.field4543 - 7);
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ltt;)V", line = 191)
    public class159(class249 arg0) {
        this.field2418 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 199)
    public static void method1149(int arg0) {
        field2414 = null;
        if (arg0 != 31174) {
            field2411 = true;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Z", line = 209)
    public final boolean method1150(int arg0) {
        if (arg0 != 35632) {
            this.field2418 = null;
        }
        if (this.field2418.field3993 && this.field2418.field4007 && this.field2417 == null) {
            class279 var2 = class225.method1547("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", (byte) -125, 35632, this.field2418);
            if (var2 != null) {
                this.field2417 = class91.method782(new class279[] { var2 }, (byte) -116, this.field2418);
            }
        }
        field2415++;
        return this.field2417 != null;
    }
}
