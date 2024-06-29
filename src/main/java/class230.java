import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class230 {

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lvd;")
    private class258 field3232;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field3230 = 0;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[[B")
    public static byte[][] field3233 = new byte[50][];

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Ll;")
    public static class127 field3235;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lij;")
    private class467 field3229;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[[B")
    public static byte[][] field3231;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method1426(int arg0) {
        field3236++;
        if (arg0 != -3154) {
            method1427(null, -55);
        }
        int var1 = field3231.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (field3231[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class370.field5616; var4++) {
                    if (class495.field7349[var2] == class258.field3710[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class258.field3710[class370.field5616] = class495.field7349[var2];
                    var3 = class370.field5616++;
                }
                class468 var5 = new class468(field3231[var2]);
                int var6 = 0;
                while (var5.field6830 < field3231[var2].length && var6 < 511 && class519.field7609 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2727((byte) 43);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class495.field7349[var2] >> 8) * 64 + var10 - class267.field3979;
                    int var13 = (class495.field7349[var2] & 0xFF) * 64 + var11 - class241.field3358;
                    class277 var14 = class373.field5641.method774(var5.method2727((byte) 43), -77);
                    if (class88.field1375[var7] == null && (var14.field4175 & 0x1) > 0 && class151.field2295 == var9 && var12 >= 0 && class50.field640 > (var14.field4128 + var12) && var13 >= 0 && class448.field6611 > (var14.field4128 + var13)) {
                        class88.field1375[var7] = new class351();
                        class88.field1375[var7].field6015 = var7;
                        class351 var15 = class88.field1375[var7];
                        class327.field5114[class519.field7609++] = var7;
                        var15.field6038 = class86.field1350;
                        var15.method2127(var14, (byte) 75);
                        var15.method2424(var15.field5409.field4128, (byte) 123);
                        var15.field5971 = var15.field5409.field4196 << 3;
                        if (var15.field5971 == 0) {
                            var15.method2413(0, 16383);
                        } else {
                            var15.method2413(var15.field5409.field4145 + 4 << 11 & 0x3CEF, 16383);
                        }
                        var15.method2124(true, var13, (byte) 24, var12, var15.method2419((byte) 105), var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1427(String arg0, int arg1) {
        field3234++;
        if (!class302.field4504) {
            return;
        }
        boolean var2 = false;
        int var3 = class146.field2203;
        int[] var4 = class457.field6694;
        for (int var5 = arg1; var5 < var3; var5++) {
            class480 var6 = class83.field1327[var4[var5]];
            if (var6 != null && class410.field6198 != var6 && var6.field7063 != null && var6.field7063.equalsIgnoreCase(arg0)) {
                class97.method758(class224.field3174, false);
                class440.field6469++;
                class43.field559.method2775((byte) 92, 0);
                class43.field559.method2777((byte) 74, class179.field2655);
                class43.field559.method2737(class327.field5118, true);
                class43.field559.method2739(class532.field7837, (byte) -41);
                class43.field559.method2742((byte) 126, var4[var5]);
                class27.method262(0, (byte) -125, true, var6.field6068[0], 0, var6.method2419((byte) 125), -2, var6.field6065[0], var6.method2419((byte) 122));
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class264.method1653((byte) 120, class152.field2315.method2103(class30.field430, (byte) 34) + arg0);
        }
        if (class302.field4504) {
            class312.method1967(arg1 - 128);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z")
    public final boolean method1428(byte arg0) {
        if (this.field3232.field3812 && this.field3232.field3735 && this.field3229 == null) {
            class224 var2 = class154.method1112(arg0 + 88, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field3232);
            if (var2 != null) {
                this.field3229 = class145.method1056(new class224[] { var2 }, this.field3232, true);
            }
        }
        field3227++;
        if (arg0 != -87) {
            this.field3229 = null;
        }
        return this.field3229 != null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static void method1429(int arg0) {
        if (arg0 == 0) {
            field3233 = null;
            field3231 = null;
            field3235 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lvd;)V")
    public class230(class258 arg0) {
        this.field3232 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(FBLjk;Ljk;)Z")
    public final boolean method1430(float arg0, byte arg1, class134 arg2, class134 arg3) {
        field3228++;
        if (!this.method1428((byte) -87)) {
            return false;
        }
        class476 var5 = this.field3232.field3825;
        class375 var6 = new class375(this.field3232, 6408, arg3.field2000, arg3.field2003);
        this.field3232.method1568(var5, 100);
        boolean var7 = false;
        if (arg1 != -20) {
            return false;
        }
        var5.method2831(0, var6, arg1 ^ 0xFFFFFFED);
        if (var5.method2832((byte) 126)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field2000, arg3.field2003);
            OpenGL.glUseProgramObjectARB(this.field3229.field6796);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3229.field6796, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3229.field6796, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3229.field6796, "sampleSize"), 1.0F / (float) arg2.field2000, 1.0F / (float) arg2.field2003);
            for (int var8 = 0; var8 < arg3.field1992; var8++) {
                float var9 = (float) var8 / (float) arg3.field1992;
                this.field3232.method1546(-2, arg2);
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
                arg3.method986(0, var8, 0, arg3.field2000, arg3.field2003, 0, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method2833(0, (byte) 118);
        this.field3232.method1554(var5, arg1 ^ 0xFFFFCE88);
        return var7;
    }
}
