import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class109 {

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "Lno;")
    private class658 field1592;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "Lgba;")
    public static class625 field1591 = null;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "Lvca;")
    private class260 field1594;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "Lbi;")
    public static class449 field1597;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)Z")
    public final boolean method809(byte arg0) {
        if (this.field1592.field9284 && this.field1592.field9242 && this.field1594 == null) {
            class575 var2 = class421.method2422(this.field1592, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", arg0 ^ 0xFFFFFF93, 35632);
            if (var2 != null) {
                this.field1594 = class168.method1149(new class575[] { var2 }, false, this.field1592);
            }
        }
        if (arg0 != -109) {
            field1591 = null;
        }
        field1598++;
        return this.field1594 != null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lbi;Lbi;ILbi;Lnb;)Z")
    public static final boolean method810(class449 arg0, class449 arg1, int arg2, class449 arg3, class278 arg4) {
        if (arg2 <= 42) {
            method811(95, -86, 32, null, 66, -119, -115, -61, true, 120, -63);
        }
        field1595++;
        class5.field80 = arg3;
        class374.field5048 = arg0;
        class568.field7553 = arg4;
        class563.field7467 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIILed;IIIIZII)Z")
    public static final boolean method811(int arg0, int arg1, int arg2, class661 arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field1590++;
        int var11 = arg9;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        int var16 = arg6 - var14;
        if (arg8) {
            method811(-42, -76, 4, null, -15, -70, 72, -76, true, -105, -127);
        }
        class77.field1210[var13][var14] = 99;
        class526.field7006[var13][var14] = 0;
        byte var17 = 0;
        class255.field3541[var17] = arg9;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class445.field6092[var10001] = arg6;
        int[][] var19 = arg3.field9391;
        while (var26 != var18) {
            var12 = class445.field6092[var18];
            var11 = class255.field3541[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var12 - arg3.field9388;
            int var23 = var11 - arg3.field9385;
            if (arg1 == -4) {
                if (arg0 == var11 && arg7 == var12) {
                    class160.field2542 = var11;
                    class689.field9702 = var12;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class502.method2790(var12, 1, arg4, arg10, arg0, 1, arg7, var11, -24945)) {
                    class689.field9702 = var12;
                    class160.field2542 = var11;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg3.method3716(1, arg10, 1, 2, arg7, var11, arg4, arg2, var12, arg0)) {
                    class160.field2542 = var11;
                    class689.field9702 = var12;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg3.method3706(var11, 1, arg7, arg10, var12, (byte) -5, arg0, arg2, arg4)) {
                    class160.field2542 = var11;
                    class689.field9702 = var12;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg3.method3705(1, arg7, var12, var11, -105, arg1, arg5, arg0)) {
                    class689.field9702 = var12;
                    class160.field2542 = var11;
                    return true;
                }
            } else if (arg3.method3707(var12, 1, arg5, arg0, arg1, (byte) -71, arg7, var11)) {
                class689.field9702 = var12;
                class160.field2542 = var11;
                return true;
            }
            int var25 = class526.field7006[var20][var21] + 1;
            if (var20 > 0 && class77.field1210[var20 - 1][var21] == 0 && (var19[var23 - 1][var22] & 0x42240000) == 0) {
                class255.field3541[var26] = var11 - 1;
                class445.field6092[var26] = var12;
                class77.field1210[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class526.field7006[var20 - 1][var21] = var25;
            }
            if (var20 < 127 && class77.field1210[var20 + 1][var21] == 0 && (var19[var23 + 1][var22] & 0x60240000) == 0) {
                class255.field3541[var26] = var11 + 1;
                class445.field6092[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class77.field1210[var20 + 1][var21] = 8;
                class526.field7006[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class77.field1210[var20][var21 - 1] == 0 && (var19[var23][var22 - 1] & 0x40A40000) == 0) {
                class255.field3541[var26] = var11;
                class445.field6092[var26] = var12 - 1;
                class77.field1210[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class526.field7006[var20][var21 - 1] = var25;
            }
            if (var21 < 127 && class77.field1210[var20][var21 + 1] == 0 && (var19[var23][var22 + 1] & 0x48240000) == 0) {
                class255.field3541[var26] = var11;
                class445.field6092[var26] = var12 + 1;
                class77.field1210[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class526.field7006[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class77.field1210[var20 - 1][var21 - 1] == 0 && (var19[var23 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var22] & 0x42240000) == 0 && (var19[var23][var22 - 1] & 0x40A40000) == 0) {
                class255.field3541[var26] = var11 - 1;
                class445.field6092[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field1210[var20 - 1][var21 - 1] = 3;
                class526.field7006[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 127 && var21 > 0 && class77.field1210[var20 + 1][var21 - 1] == 0 && (var19[var23 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var22] & 0x60240000) == 0 && (var19[var23][var22 - 1] & 0x40A40000) == 0) {
                class255.field3541[var26] = var11 + 1;
                class445.field6092[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field1210[var20 + 1][var21 - 1] = 9;
                class526.field7006[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 127 && class77.field1210[var20 - 1][var21 + 1] == 0 && (var19[var23 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var22] & 0x42240000) == 0 && (var19[var23][var22 + 1] & 0x48240000) == 0) {
                class255.field3541[var26] = var11 - 1;
                class445.field6092[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field1210[var20 - 1][var21 + 1] = 6;
                class526.field7006[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 127 && var21 < 127 && class77.field1210[var20 + 1][var21 + 1] == 0 && (var19[var23 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var22] & 0x60240000) == 0 && (var19[var23][var22 + 1] & 0x48240000) == 0) {
                class255.field3541[var26] = var11 + 1;
                class445.field6092[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field1210[var20 + 1][var21 + 1] = 12;
                class526.field7006[var20 + 1][var21 + 1] = var25;
            }
        }
        class160.field2542 = var11;
        class689.field9702 = var12;
        return false;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
    public static void method812(int arg0) {
        int var1 = -103 / ((58 - arg0) / 55);
        field1597 = null;
        field1591 = null;
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lno;)V")
    public class109(class658 arg0) {
        this.field1592 = arg0;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IFLij;Lij;)Z")
    public final boolean method813(int arg0, float arg1, class391 arg2, class391 arg3) {
        field1599++;
        if (!this.method809((byte) -109)) {
            return false;
        }
        class79 var5 = this.field1592.field9280;
        if (arg0 < 119) {
            field1593 = 96;
        }
        class101 var6 = new class101(this.field1592, 6408, arg3.field5165, arg3.field5163);
        this.field1592.method3639(7, var5);
        boolean var7 = false;
        var5.method612(115, var6, 0);
        if (var5.method623(-32672)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field5165, arg3.field5163);
            OpenGL.glUseProgramObjectARB(this.field1594.field3572);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field1594.field3572, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field1594.field3572, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field1594.field3572, "sampleSize"), 1.0F / (float) arg2.field5165, 1.0F / (float) arg2.field5163);
            for (int var8 = 0; var8 < arg3.field5162; var8++) {
                float var9 = (float) var8 / (float) arg3.field5162;
                this.field1592.method3630(arg2, -2);
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
                arg3.method2254(0, 0, 0, 0, var8, arg3.field5165, arg3.field5163, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method620(1, 0);
        this.field1592.method3658(-125, var5);
        return var7;
    }
}
