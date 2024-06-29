import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class238 extends class509 {

    @OriginalMember(owner = "client!av", name = "j", descriptor = "Z")
    private boolean field3572 = false;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "Z")
    private boolean field3578 = false;

    @OriginalMember(owner = "client!av", name = "u", descriptor = "Lmm;")
    private class19 field3583;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "Lbr;")
    private class147 field3570;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "Z")
    public static boolean field3579 = false;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "Ljp;")
    public static class55 field3575 = new class55(47, -2);

    @OriginalMember(owner = "client!av", name = "t", descriptor = "Lpu;")
    public static class179 field3582 = new class179("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!av", name = "v", descriptor = "Lne;")
    public static class139 field3584 = new class139("WTQA", 2);

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!av", name = "w", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!av", name = "x", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Ltt;Lmm;)V")
    public class238(class249 arg0, class19 arg1) {
        super(arg0);
        this.field3583 = arg1;
        if (this.field3583.field207 != null && super.field7409.field4051 && super.field7409.field4007) {
            class279 var3 = class225.method1547("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", (byte) -46, 35633, super.field7409);
            class279 var4 = class225.method1547("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", (byte) -84, 35632, super.field7409);
            this.field3570 = class91.method782(new class279[] { var3, var4 }, (byte) -115, super.field7409);
            this.field3578 = this.field3570 != null;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)Z")
    public final boolean method124(int arg0) {
        ++field3586;
        if (arg0 != -32170) {
            method1608((class46) null, 95, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lpv;IZ)V")
    public static final void method1608(class46 arg0, int arg1, boolean arg2) {
        ++field3577;
        if (class540.field7909 < 400) {
            if (arg1 != 24986) {
                method1608((class46) null, 21, false);
            }
            class171 var3 = arg0.field718;
            if (var3.field2611 != null) {
                var3 = var3.method1221(class288.field4476, 0);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field2612) {
                String var4 = var3.field2600;
                if (~var3.field2591 != -1) {
                    String var5 = class401.field5923 != class268.field4258 ? class234.field3512.method1265(class345.field5141, -108) : class320.field4854.method1265(class345.field5141, arg1 + -25112);
                    var4 = var4 + class485.method2932(class116.field1781.field7469, var3.field2591, (byte) 37) + " (" + var5 + var3.field2591 + ")";
                }
                if (!class2.field17) {
                    if (!arg2) {
                        String[] var6 = var3.field2586;
                        if (class89.field1441) {
                            var6 = class149.method1065(-2025704630, var6);
                        }
                        if (var6 != null) {
                            for (int var7 = 4; ~var7 <= -1; --var7) {
                                if (var6[var7] != null && (var3.field2577 == 0 || !var6[var7].equalsIgnoreCase(class354.field5248.method1265(class345.field5141, -68)))) {
                                    byte var8 = 0;
                                    int var9 = class504.field7324;
                                    if (~var7 == -1) {
                                        var8 = 51;
                                    }
                                    if (var7 == 1) {
                                        var8 = 44;
                                    }
                                    if (~var7 == -3) {
                                        var8 = 16;
                                    }
                                    if (var7 == 3) {
                                        var8 = 57;
                                    }
                                    if (var7 == 4) {
                                        var8 = 58;
                                    }
                                    if (~var3.field2650 == ~var7) {
                                        var9 = var3.field2644;
                                    }
                                    if (var3.field2617 == var7) {
                                        var9 = var3.field2633;
                                    }
                                    ++class429.field6367;
                                    class423.method2637((long) arg0.field7562, -1, 0, (byte) -113, true, var8, var6[var7], !var6[var7].equalsIgnoreCase(class354.field5248.method1265(class345.field5141, arg1 + -25068)) ? var9 : var3.field2582, false, 0, "<col=ffff00>" + var4);
                                }
                            }
                        }
                        if (var3.field2577 == 1 && var6 != null) {
                            for (int var10 = 4; ~var10 <= -1; --var10) {
                                if (var6[var10] != null && var6[var10].equalsIgnoreCase(class354.field5248.method1265(class345.field5141, -90))) {
                                    short var11 = 0;
                                    if (var3.field2591 > class116.field1781.field7469) {
                                        var11 = 2000;
                                    }
                                    short var12 = 0;
                                    if (~var10 == -1) {
                                        var12 = 51;
                                    }
                                    if (var10 == 1) {
                                        var12 = 44;
                                    }
                                    if (var10 == 2) {
                                        var12 = 16;
                                    }
                                    if (~var10 == -4) {
                                        var12 = 57;
                                    }
                                    if (var10 == 4) {
                                        var12 = 58;
                                    }
                                    if (var12 != 0) {
                                        var12 += var11;
                                    }
                                    ++class457.field6793;
                                    class423.method2637((long) arg0.field7562, -1, 0, (byte) -113, true, var12, var6[var10], var3.field2582, false, 0, "<col=ffff00>" + var4);
                                }
                            }
                        }
                    }
                    ++class17.field180;
                    class423.method2637((long) arg0.field7562, -1, 0, (byte) -113, true, 1012, class74.field1257.method1265(class345.field5141, arg1 + -25088), class376.field5549, arg2, 0, "<col=ffff00>" + var4);
                } else {
                    if (!arg2) {
                        class450 var13 = class509.field7406 == -1 ? null : class264.field4225.method2789((byte) 36, class509.field7406);
                        if (~(2 & class166.field2500) != -1) {
                            if (var13 == null || var3.method1226(var13.field6692, (byte) 114, class509.field7406) != var13.field6692) {
                                ++class129.field1924;
                                class423.method2637((long) arg0.field7562, -1, 0, (byte) -113, true, 11, class218.field3297, class246.field3688, false, 0, class447.field6638 + " -> <col=ffff00>" + var4);
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BZ)V")
    public final void method128(byte arg0, boolean arg1) {
        ++field3574;
        if (arg0 < 44) {
            method1610(-38);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)V")
    public final void method122(boolean arg0, int arg1) {
        ++field3573;
        class32 var3 = super.field7409.method1729(true);
        if (arg1 != 64) {
            this.method121((byte) -97);
        }
        if (this.field3578 && var3 != null) {
            super.field7409.method1756(1, arg1 ^ 39);
            super.field7409.method1749(25752, var3);
            super.field7409.method1756(0, arg1 + 43);
            super.field7409.method1749(25752, this.field3583.field207);
            long var4 = this.field3570.field2191;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field7409.field3986[0], -super.field7409.field3986[1], -super.field7409.field3986[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7409.field4021, super.field7409.field3995, super.field7409.field3982, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field7409.field3986[1]) + 96.0F);
            this.field3572 = true;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZIII)I")
    public static final int method1609(boolean arg0, int arg1, int arg2, int arg3) {
        ++field3580;
        if (~arg1 == ~arg2) {
            return arg2;
        } else {
            int var4 = -arg3 + 128;
            int var5 = (arg1 & 127) * arg3 + (127 & arg2) * var4 >> 7;
            if (arg0) {
                return -24;
            } else {
                int var6 = (896 & arg1) * arg3 + (arg2 & 896) * var4 >> 7;
                int var7 = (64512 & arg1) * arg3 + (arg2 & 64512) * var4 >> 7;
                return var7 & 64512 | 896 & var6 | 127 & var5;
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(I)V")
    public static void method1610(int arg0) {
        if (arg0 <= 13) {
            field3579 = false;
        }
        field3575 = null;
        field3584 = null;
        field3582 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIZ)V")
    public final void method123(int arg0, int arg1, boolean arg2) {
        if (this.field3572) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((arg1 & 57) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) (arg0 >> 16 & 3) / 8.0F;
            long var8 = this.field3570.field2191;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7409.field3927 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field3576;
        if (arg2) {
            field3584 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public final void method121(byte arg0) {
        if (arg0 == 38) {
            if (this.field3572) {
                super.field7409.method1756(1, -18);
                super.field7409.method1749(25752, (class169) null);
                super.field7409.method1756(0, -36);
                super.field7409.method1749(25752, (class169) null);
                OpenGL.glUseProgramObjectARB(0L);
                this.field3572 = false;
            }
            ++field3571;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BILin;)V")
    public final void method125(byte arg0, int arg1, class169 arg2) {
        if (arg0 <= 9) {
            method1609(false, 36, -21, 65);
        }
        ++field3581;
        if (!this.field3572) {
            super.field7409.method1749(25752, arg2);
            super.field7409.method1734(-45, arg1);
        }
    }
}
