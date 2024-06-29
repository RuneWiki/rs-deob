import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class131 {

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "Llf;")
    private class250 field1799;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "Lgw;")
    private class182 field1800;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "Lcc;")
    public static class760 field1803;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)V", line = 3)
    public static void method924(byte arg0) {
        if (arg0 != -115) {
            field1803 = null;
        }
        field1803 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)I", line = 13)
    public static final int method925(int arg0, int arg1, int arg2) {
        if (arg1 > -20) {
            return -30;
        }
        field1805++;
        int var3 = class607.method3380((byte) 77, arg0 + 91923, 4, arg2 + 45365) - (-(class607.method3380((byte) 77, arg0 + 37821, 2, arg2 + 10294) + -128 >> 1) - (class607.method3380((byte) 77, arg0, 1, arg2) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIII)V", line = 36)
    public static final void method926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1802++;
        int var9 = arg1 + 1;
        class464.method2733(arg4, arg0, arg5, -22816, class228.field2951[arg1]);
        int var10 = arg2 - 1;
        class464.method2733(arg4, arg0, arg5, -22816, class228.field2951[arg2]);
        if (arg3 > 117) {
            for (int var6 = var9; var6 <= var10; var6++) {
                int[] var7 = class228.field2951[var6];
                var7[arg0] = var7[arg5] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)Z", line = 60)
    public final boolean method927(int arg0) {
        if (this.field1799.field3652 && this.field1799.field3589 && this.field1800 == null) {
            class440 var2 = class498.method2925(this.field1799, (byte) 52, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field1800 = class40.method231(new class440[] { var2 }, (byte) -7, this.field1799);
            }
        }
        field1801++;
        int var3 = 51 % ((-arg0 - 47) / 59);
        return this.field1800 != null;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)Ljava/lang/String;", line = 87)
    public static final String method928(int arg0) {
        field1807++;
        if (class677.field9075 || class191.field2474 == null) {
            return "";
        } else {
            if (arg0 != 1) {
                field1803 = null;
            }
            return class191.field2474.field6710;
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Llf;)V", line = 105)
    public class131(class250 arg0) {
        this.field1799 = arg0;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(FILah;Lah;)Z", line = 117)
    public final boolean method929(float arg0, int arg1, class405 arg2, class405 arg3) {
        field1804++;
        if (!this.method927(-107)) {
            return false;
        }
        class82 var5 = this.field1799.field3628;
        class420 var6 = new class420(this.field1799, 6408, arg2.field5747, arg2.field5750);
        boolean var7 = false;
        this.field1799.method1594(var5, (byte) -79);
        var5.method667(var6, 0, 16070);
        if (arg1 != 1) {
            return false;
        }
        if (var5.method670(true)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg2.field5747, arg2.field5750);
            OpenGL.glUseProgramObjectARB(this.field1800.field2391);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field1800.field2391, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field1800.field2391, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field1800.field2391, "sampleSize"), 1.0F / (float) arg3.field5747, 1.0F / (float) arg3.field5750);
            for (int var8 = 0; var8 < arg2.field5752; var8++) {
                float var9 = (float) var8 / (float) arg2.field5752;
                this.field1799.method1595((byte) 111, arg3);
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
                arg2.method2446(0, arg2.field5750, arg2.field5747, 0, 0, var8, 0, (byte) -121);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method661((byte) 12, 0);
        this.field1799.method1567(var5, -115);
        return var7;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIIIII)V", line = 187)
    public static final void method930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1806++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg0 - arg5;
        int var12 = arg2 - arg5;
        int var13 = arg0 * arg0;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        if (arg1 != 11483) {
            method924((byte) -119);
        }
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        if (arg7 >= class291.field4156 && class233.field3099 >= arg7) {
            int[] var38 = class228.field2951[arg7];
            int var39 = class269.method1790(arg6 - arg0, class45.field472, class297.field4199, 13094);
            int var40 = class269.method1790(arg6 + arg0, class45.field472, class297.field4199, 13094);
            int var41 = class269.method1790(arg6 - var11, class45.field472, class297.field4199, 13094);
            int var42 = class269.method1790(arg6 + var11, class45.field472, class297.field4199, 13094);
            class464.method2733(arg3, var39, var41, -22816, var38);
            class464.method2733(arg4, var41, var42, -22816, var38);
            class464.method2733(arg3, var42, var40, -22816, var38);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var43;
                var34 -= var29;
                var43 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg7 - var9;
            int var46 = arg7 + var9;
            if (var46 >= class291.field4156 && class233.field3099 >= var45) {
                int var47 = class269.method1790(arg6 + var8, class45.field472, class297.field4199, 13094);
                int var48 = class269.method1790(arg6 - var8, class45.field472, class297.field4199, arg1 ^ 0x1FFD);
                if (var44) {
                    int var49 = class269.method1790(arg6 + var10, class45.field472, class297.field4199, 13094);
                    int var50 = class269.method1790(arg6 - var10, class45.field472, class297.field4199, 13094);
                    if (var45 >= class291.field4156) {
                        int[] var51 = class228.field2951[var45];
                        class464.method2733(arg3, var48, var50, arg1 ^ 0xFFFF8A3B, var51);
                        class464.method2733(arg4, var50, var49, arg1 ^ 0xFFFF8A3B, var51);
                        class464.method2733(arg3, var49, var47, arg1 - 34299, var51);
                    }
                    if (class233.field3099 >= var46) {
                        int[] var52 = class228.field2951[var46];
                        class464.method2733(arg3, var48, var50, -22816, var52);
                        class464.method2733(arg4, var50, var49, -22816, var52);
                        class464.method2733(arg3, var49, var47, -22816, var52);
                    }
                } else {
                    if (var45 >= class291.field4156) {
                        class464.method2733(arg3, var48, var47, -22816, class228.field2951[var45]);
                    }
                    if (var46 <= class233.field3099) {
                        class464.method2733(arg3, var48, var47, -22816, class228.field2951[var46]);
                    }
                }
            }
        }
    }
}
