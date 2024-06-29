import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class104 {

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lac;")
    private class541 field1392;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1393 = 0;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1396 = -1;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Luj;")
    private class387 field1390;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;)V", line = 14)
    public static final void method709(int arg0, String arg1) {
        field1394++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class540.method2966(-1, arg1);
        if (var2 == null) {
            return;
        }
        if (arg0 < 25) {
            field1393 = -32;
        }
        for (int var3 = 0; var3 < class233.field3026; var3++) {
            String var4 = class512.field6935[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class540.method2966(-1, var4);
            if (var5 != null && var5.equals(var2)) {
                class233.field3026--;
                for (int var6 = var3; var6 < class233.field3026; var6++) {
                    class512.field6935[var6] = class512.field6935[var6 + 1];
                    class58.field621[var6] = class58.field621[var6 + 1];
                    class48.field490[var6] = class48.field490[var6 + 1];
                    class441.field6158[var6] = class441.field6158[var6 + 1];
                    class179.field2206[var6] = class179.field2206[var6 + 1];
                    class24.field187[var6] = class24.field187[var6 + 1];
                }
                class328.field4444 = class292.field3876;
                class153.field1951++;
                class103 var7 = class752.method4186(260, class601.field8369, class449.field6285);
                var7.field1379.method3393(class601.method3326(arg1, (byte) 75), 67);
                var7.field1379.method3387(arg1, (byte) 113);
                class27.method104(false, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lac;)V", line = 79)
    public class104(class541 arg0) {
        this.field1392 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)Z", line = 93)
    public final boolean method710(boolean arg0) {
        if (!arg0) {
            field1396 = -111;
        }
        field1391++;
        if (this.field1392.field7671 && this.field1392.field7658 && this.field1390 == null) {
            class580 var2 = class754.method4195(35632, this.field1392, false, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field1390 = class713.method3993(this.field1392, new class580[] { var2 }, arg0);
            }
        }
        return this.field1390 != null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILqj;FLqj;)Z", line = 120)
    public final boolean method711(int arg0, class510 arg1, float arg2, class510 arg3) {
        field1398++;
        if (!this.method710(true)) {
            return false;
        }
        class365 var5 = this.field1392.field7574;
        class503 var6 = new class503(this.field1392, 6408, arg3.field6889, arg3.field6894);
        boolean var7 = false;
        this.field1392.method3041(true, var5);
        var5.method2100((byte) 120, 0, var6);
        if (var5.method2097((byte) 74)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field6889, arg3.field6894);
            OpenGL.glUseProgramObjectARB(this.field1390.field5459);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field1390.field5459, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field1390.field5459, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field1390.field5459, "sampleSize"), 1.0F / (float) arg1.field6889, 1.0F / (float) arg1.field6894);
            for (int var8 = 0; var8 < arg3.field6888; var8++) {
                float var9 = (float) var8 / (float) arg3.field6888;
                this.field1392.method3006(1, arg1);
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
                arg3.method2829(0, 0, var8, arg0, 0, arg3.field6889, arg3.field6894, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method2094(arg0, true);
        this.field1392.method3050(var5, -1);
        return var7;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V", line = 187)
    public static final void method712(boolean arg0, int arg1) {
        field1397++;
        if (arg0 && class642.field8928 != null) {
            class481.field6634 = class642.field8928.field3946;
        } else {
            class481.field6634 = -1;
        }
        class162.field2034 = null;
        int var2 = 18 % ((59 - arg1) / 59);
        class491.field6703 = 0;
        class642.field8928 = null;
        class600.field8354 = null;
        class642.method3613();
        class642.field8937.method728((byte) 47);
        class660.field9208 = null;
        class660.field9216 = null;
        class599.field8344 = null;
        class621.field8702 = null;
        class460.field6377 = null;
        class642.field8938 = null;
        class278.field3706 = -1;
        class681.field9490 = null;
        class239.field3133 = -1;
        class636.field8840 = null;
        class266.field3527 = null;
        class291.field3851 = null;
        if (class642.field8929 != null) {
            class642.field8929.method1648(0);
            class642.field8929.method1649(64, -30502, 128);
        }
        if (class642.field8931 != null) {
            class642.field8931.method1370(109, 64, 64);
        }
        if (class642.field8934 != null) {
            class642.field8934.method4113(-129, 64);
        }
        class465.field6445.method1838(64, (byte) -91);
    }
}
