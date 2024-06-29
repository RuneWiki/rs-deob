import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class266 {

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Lkfa;")
    private class382 field3819;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field3822 = -1;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Lqn;")
    private class476 field3820;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lufa;IIBI)V")
    public static final void method1686(class141 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3821++;
        class674 var5 = arg0.method1093(true);
        if (arg3 != -31) {
            method1688(77, null, -112);
        }
        int var6 = arg0.field2395 - arg0.field2410.field3921 & 0x3FFF;
        if (arg4 == -1) {
            if (var6 != 0 || arg0.field2384 > 25) {
                if (arg2 < 0 && var5.field9576 != -1) {
                    arg0.field2353 = false;
                    arg0.field2425 = var5.field9576;
                } else if (arg2 <= 0 || var5.field9559 == -1) {
                    arg0.field2425 = var5.field9580;
                } else {
                    arg0.field2425 = var5.field9559;
                }
                arg0.field2353 = false;
            } else if (!arg0.field2353 || !var5.method3816(0, arg0.field2425)) {
                arg0.field2425 = var5.method3818(true);
                arg0.field2353 = arg0.field2425 != -1;
            }
        } else if (arg0.field2434 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class468.field6755[arg1] - arg0.field2410.field3921 & 0x3FFF;
            arg0.field2353 = false;
            if (arg4 == 2 && var5.field9572 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field9609 != -1) {
                    arg0.field2425 = var5.field9609;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field9598 != -1) {
                    arg0.field2425 = var5.field9598;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field9590 == -1) {
                    arg0.field2425 = var5.field9572;
                } else {
                    arg0.field2425 = var5.field9590;
                }
            } else if (arg4 == 0 && var5.field9563 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field9607 != -1) {
                    arg0.field2425 = var5.field9607;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field9578 != -1) {
                    arg0.field2425 = var5.field9578;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field9570 == -1) {
                    arg0.field2425 = var5.field9563;
                } else {
                    arg0.field2425 = var5.field9570;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field9582 != -1) {
                arg0.field2425 = var5.field9582;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field9579 != -1) {
                arg0.field2425 = var5.field9579;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field9583 == -1) {
                arg0.field2425 = var5.field9580;
            } else {
                arg0.field2425 = var5.field9583;
            }
        } else if (var6 == 0 && arg0.field2384 <= 25) {
            if (arg4 == 2 && var5.field9572 != -1) {
                arg0.field2425 = var5.field9572;
            } else if (arg4 == 0 && var5.field9563 != -1) {
                arg0.field2425 = var5.field9563;
            } else {
                arg0.field2425 = var5.field9580;
            }
            arg0.field2353 = false;
        } else {
            if (arg4 == 2 && var5.field9572 != -1) {
                if (arg2 < 0 && var5.field9588 != -1) {
                    arg0.field2425 = var5.field9588;
                } else if (arg2 <= 0 || var5.field9610 == -1) {
                    arg0.field2425 = var5.field9572;
                } else {
                    arg0.field2425 = var5.field9610;
                }
            } else if (arg4 == 0 && var5.field9563 != -1) {
                if (arg2 < 0 && var5.field9595 != -1) {
                    arg0.field2425 = var5.field9595;
                } else if (arg2 <= 0 || var5.field9568 == -1) {
                    arg0.field2425 = var5.field9563;
                } else {
                    arg0.field2425 = var5.field9568;
                }
            } else if (arg2 < 0 && var5.field9597 != -1) {
                arg0.field2425 = var5.field9597;
            } else if (arg2 <= 0 || var5.field9586 == -1) {
                arg0.field2425 = var5.field9580;
            } else {
                arg0.field2425 = var5.field9586;
            }
            arg0.field2353 = false;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BFLfp;Lfp;)Z")
    public final boolean method1687(byte arg0, float arg1, class535 arg2, class535 arg3) {
        field3823++;
        if (!this.method1689((byte) 9)) {
            return false;
        }
        class92 var5 = this.field3819.field5525;
        int var6 = 116 / ((arg0 - 10) / 47);
        class325 var7 = new class325(this.field3819, 6408, arg3.field7859, arg3.field7867);
        this.field3819.method2263(true, var5);
        boolean var8 = false;
        var5.method676((byte) -108, var7, 0);
        if (var5.method691(-107)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field7859, arg3.field7867);
            OpenGL.glUseProgramObjectARB(this.field3820.field6820);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3820.field6820, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3820.field6820, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3820.field6820, "sampleSize"), 1.0F / (float) arg2.field7859, 1.0F / (float) arg2.field7867);
            for (int var9 = 0; var9 < arg3.field7869; var9++) {
                float var10 = (float) var9 / (float) arg3.field7869;
                this.field3819.method2295((byte) 119, arg2);
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
                arg3.method3141(0, (byte) 54, arg3.field7867, 0, var9, arg3.field7859, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var8 = true;
            OpenGL.glPopMatrix();
        }
        var5.method688(51, 0);
        this.field3819.method2340((byte) 64, var5);
        return var8;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILsj;I)V")
    public static final void method1688(int arg0, class373 arg1, int arg2) {
        class531.field7831 = false;
        field3824++;
        class3.field38 = 0;
        class427.method2512(arg1, (byte) -6);
        class697.method3922((byte) 105, arg1);
        if (class531.field7831) {
            System.out.println("---endgpp---");
        }
        if (arg1.field6710 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field6710 + " psize:" + arg0);
        } else if (arg2 != 1) {
            method1688(-19, null, 33);
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lkfa;)V")
    public class266(class382 arg0) {
        this.field3819 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)Z")
    public final boolean method1689(byte arg0) {
        field3818++;
        if (arg0 != 9) {
            this.method1689((byte) -32);
        }
        if (this.field3819.field5571 && this.field3819.field5599 && this.field3820 == null) {
            class189 var2 = class697.method3921(this.field3819, 35632, 8, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field3820 = class358.method2161(arg0 - 9, new class189[] { var2 }, this.field3819);
            }
        }
        return this.field3820 != null;
    }
}
