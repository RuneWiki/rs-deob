import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class275 extends class692 {

    @OriginalMember(owner = "client!bha", name = "l", descriptor = "Z")
    private boolean field3854 = false;

    @OriginalMember(owner = "client!bha", name = "p", descriptor = "Z")
    private boolean field3858 = false;

    @OriginalMember(owner = "client!bha", name = "n", descriptor = "Lan;")
    private class193 field3856;

    @OriginalMember(owner = "client!bha", name = "h", descriptor = "Lkba;")
    private class25 field3850;

    @OriginalMember(owner = "client!bha", name = "m", descriptor = "B")
    public static byte field3855;

    @OriginalMember(owner = "client!bha", name = "i", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!bha", name = "j", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!bha", name = "k", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!bha", name = "o", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!bha", name = "q", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!bha", name = "r", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!bha", name = "s", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!bha", name = "t", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!bha", name = "g", descriptor = "Lgga;")
    public static class513 field3849;

    @OriginalMember(owner = "client!bha", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3848;

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Llea;Lan;)V")
    public class275(class573 arg0, class193 arg1) {
        super(arg0);
        this.field3856 = arg1;
        if (this.field3856.field2892 != null && super.field9753.field8172 && super.field9753.field8175) {
            class235 var3 = class472.method2756(-21541, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field9753, 35633);
            class235 var4 = class472.method2756(-21541, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field9753, 35632);
            this.field3850 = class505.method2954(new class235[] { var3, var4 }, super.field9753, (byte) -121);
            this.field3858 = this.field3850 != null;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZBI)Lng;")
    public static final class393 method1745(boolean arg0, byte arg1, int arg2) {
        ++field3853;
        if (arg1 > -52) {
            method1747(false);
        }
        long var3 = (long) (arg2 | (!arg0 ? 0 : Integer.MIN_VALUE));
        return (class393) class11.field139.method4253(var3, -1);
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZB)V")
    public final void method1117(boolean arg0, byte arg1) {
        if (arg1 != 57) {
            field3848 = null;
        }
        ++field3852;
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(I)Z")
    public final boolean method1112(int arg0) {
        ++field3861;
        if (arg0 >= -124) {
            this.method1112(124);
        }
        return this.field3858;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z)V")
    public static void method1746(boolean arg0) {
        field3849 = null;
        if (arg0) {
            method1745(true, (byte) -123, -7);
        }
        field3848 = null;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IZI)V")
    public final void method1113(int arg0, boolean arg1, int arg2) {
        ++field3860;
        if (!arg1) {
            field3855 = -24;
        }
        if (this.field3854) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((63 & arg0) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            float var8 = (float) ((arg2 & 7967042) >> 19) / 16.0F;
            float var9 = (float) ((arg2 & 133047979) >> 23) / 16.0F;
            int var10 = 15 & arg2 >> 27;
            long var11 = this.field3850.field277;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field9753.field8133 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V")
    public final void method1111(byte arg0) {
        ++field3857;
        if (this.field3854) {
            super.field9753.method3321(1, arg0 + -19701);
            super.field9753.method3384((class377) null, (byte) 78);
            super.field9753.method3321(0, -19587);
            super.field9753.method3384((class377) null, (byte) 112);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3854 = false;
        }
        if (arg0 != 114) {
            method1747(true);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZI)V")
    public final void method1118(boolean arg0, int arg1) {
        ++field3859;
        class653 var3 = super.field9753.method3331((byte) -118);
        if (arg1 == -3826) {
            if (this.field3858 && var3 != null) {
                float var4 = 1.0F + (-Math.abs(super.field9753.field8278[1]) + 1.0F) * 2.0F;
                super.field9753.method3321(1, arg1 ^ 17011);
                super.field9753.method3384(var3, (byte) 127);
                super.field9753.method3321(0, arg1 ^ 17011);
                super.field9753.method3384(this.field3856.field2892, (byte) 51);
                long var5 = this.field3850.field277;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field9753.field8278[0], -super.field9753.field8278[1], -super.field9753.field8278[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field9753.field8273 * var4, super.field9753.field8202 * var4, super.field9753.field8193 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field9753.field8278[1]) * 928.0F + 64.0F);
                this.field3854 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(Z)V")
    public static final void method1747(boolean arg0) {
        for (int var1 = 0; var1 < class57.field884; ++var1) {
            class420 var3 = class278.field4014[var1];
            boolean var4 = false;
            if (var3.field5817 != null) {
                if (!var3.field5817.method4235(-128)) {
                    var4 = true;
                }
            } else {
                --var3.field5814;
                if (var3.field5814 >= (!var3.method2481((byte) 2) ? -10 : -1500)) {
                    if (~var3.field5830 == -2 && var3.field5818 == null) {
                        var3.field5818 = class520.method3057(class12.field151, var3.field5815, 0);
                        if (var3.field5818 == null) {
                            continue;
                        }
                        var3.field5814 += var3.field5818.method3058();
                    } else if (var3.method2481((byte) 2) && (var3.field5813 == null || var3.field5825 == null)) {
                        if (var3.field5813 == null) {
                            var3.field5813 = class543.method3140(class224.field3296, var3.field5815);
                        }
                        if (var3.field5813 == null) {
                            continue;
                        }
                        if (var3.field5825 == null) {
                            var3.field5825 = var3.field5813.method3141(new int[] { 22050 });
                            if (var3.field5825 == null) {
                                continue;
                            }
                        }
                    }
                    if (~var3.field5814 > -1) {
                        int var5 = 8192;
                        int var6;
                        if (~var3.field5816 == -1) {
                            var6 = var3.field5812 * (~var3.field5830 != -4 ? class420.field5820.field9448.method1367(17539) : class420.field5820.field9451.method1367(17539)) >> 2;
                        } else {
                            int var7 = (66776010 & var3.field5816) >> 24;
                            if (class719.field10041.field10361 != var7) {
                                var6 = 0;
                            } else {
                                int var8 = var3.field5816 << 9 & 130560;
                                int var9 = class719.field10041.method209(true) << 8;
                                int var10 = (var3.field5816 & 16730989) >> 16;
                                int var11 = (var10 << 9) + -class719.field10041.field10347 + var9 + 256;
                                int var12 = 255 & var3.field5816 >> 8;
                                int var13 = (var12 << 9) + 256 + var9 + -class719.field10041.field10350;
                                int var14 = Math.abs(var11) + Math.abs(var13) + -512;
                                if (~var8 > ~var14) {
                                    var3.field5814 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var6 = (-var14 + var8) * class420.field5820.field9484.method1367(17539) * var3.field5812 / var8 >> 2;
                                if (var3.field5828 != null && var3.field5828 instanceof class208) {
                                    class208 var15 = (class208) var3.field5828;
                                    short var16 = var15.field3035;
                                    short var17 = var15.field3027;
                                }
                                if (var11 != 0 || var13 != 0) {
                                    int var18 = 16383 & -4096 + -class642.field9037 + -((int) (2607.5945876176133D * Math.atan2((double) var11, (double) var13)));
                                    if (var18 > 8192) {
                                        var18 = -var18 + 16384;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 >= 4096) {
                                        var19 = 16384;
                                    } else {
                                        var19 = (-var14 + 8192) / 4096 + 8192;
                                    }
                                    var5 = var18 * var19 / 8192 - -(-var19 + 16384 >> 1);
                                }
                            }
                        }
                        if (~var6 < -1) {
                            class101 var20 = null;
                            if (var3.field5830 != 1) {
                                if (var3.method2481((byte) 2)) {
                                    var20 = var3.field5825;
                                }
                            } else {
                                var20 = var3.field5818.method3056().method839(class191.field2877);
                            }
                            class557 var21 = var3.field5817 = class557.method3247(var20, var3.field5821, var6, var5);
                            var21.method3213(var3.field5823 - 1);
                            class234.field3399.method4221(var21);
                        }
                    }
                } else {
                    var4 = true;
                }
            }
            if (var4) {
                --class57.field884;
                for (int var22 = var1; class57.field884 > var22; ++var22) {
                    class278.field4014[var22] = class278.field4014[var22 + 1];
                }
                --var1;
            }
        }
        if (arg0) {
            field3849 = null;
        }
        ++field3862;
        if (class301.field4330 && !class556.method3205(!arg0)) {
            if (~class420.field5820.field9491.method1367(17539) != -1 && class371.field5236 != -1) {
                if (class602.field8558 == null) {
                    class531.method3095(class371.field5236, 127, class420.field5820.field9491.method1367(17539), class399.field5495, 0, false);
                } else {
                    class423.method2492(0, class371.field5236, false, class420.field5820.field9491.method1367(17539), class399.field5495, false, class602.field8558);
                }
            }
            class301.field4330 = false;
            class602.field8558 = null;
        } else if (~class420.field5820.field9491.method1367(17539) != -1 && class371.field5236 != -1 && !class556.method3205(true)) {
            ++class685.field9686;
            class302 var2 = class582.method3419(class13.field159, (byte) 125, class626.field8901);
            var2.field4341.method2548(class371.field5236, (byte) -99);
            class501.method2928(0, var2);
            class371.field5236 = -1;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(ILfga;I)V")
    public final void method1119(int arg0, class377 arg1, int arg2) {
        if (!this.field3854) {
            super.field9753.method3384(arg1, (byte) 92);
            super.field9753.method3375(arg2, (byte) 102);
        }
        ++field3851;
        if (arg0 <= 48) {
            method1747(true);
        }
    }
}
