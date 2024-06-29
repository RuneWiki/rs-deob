import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class454 extends class518 {

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Z")
    private boolean field6187 = false;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Z")
    private boolean field6196 = false;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "Lpba;")
    private class472 field6193;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Log;")
    private class564 field6190;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Lcb;")
    public static class318 field6198 = new class318(85, 6);

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field6200 = -1;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "[S")
    public static short[] field6199;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZI)V", line = 7)
    public final void method1134(int arg0, boolean arg1, int arg2) {
        if (this.field6187) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((arg0 & 58) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((245644 & arg2) >> 16) / 8.0F;
            long var8 = this.field6190.field7719;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7145.field8943 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field6191;
        if (arg1) {
            field6199 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLwq;I)V", line = 38)
    public final void method1138(byte arg0, class254 arg1, int arg2) {
        ++field6195;
        if (!this.field6187) {
            super.field7145.method3553((byte) 99, arg1);
            super.field7145.method3524(arg2, 14);
        }
        if (arg0 != 75) {
            field6198 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZB)V", line = 55)
    public final void method1139(boolean arg0, byte arg1) {
        if (arg1 != 127) {
            method2578(true);
        }
        ++field6194;
        class322 var3 = super.field7145.method3528(arg1 + -235);
        if (this.field6196 && var3 != null) {
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3553((byte) -93, var3);
            super.field7145.method3488(0, (byte) 23);
            super.field7145.method3553((byte) 97, this.field6193.field6388);
            long var4 = this.field6190.field7719;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field7145.field8989[0], -super.field7145.field8989[1], -super.field7145.field8989[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7145.field9052, super.field7145.field8975, super.field7145.field9061, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field7145.field8989[1]));
            this.field6187 = true;
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V", line = 84)
    public static final void method2577(int arg0) {
        int var1 = 0;
        if (arg0 == -25605) {
            while (var1 < class485.field6555) {
                label141: {
                    class578 var2 = class658.field9278[var1];
                    boolean var3 = false;
                    if (var2.field7978 != null) {
                        if (!var2.field7978.method174(arg0 + 25669)) {
                            var3 = true;
                        }
                    } else {
                        --var2.field7981;
                        if (~var2.field7981 > ~(var2.method3253((byte) -121) ? -1500 : -10)) {
                            var3 = true;
                        } else {
                            if (var2.field7979 == 1 && var2.field7983 == null) {
                                var2.field7983 = class586.method3280(class589.field8086, var2.field7976, 0);
                                if (var2.field7983 == null) {
                                    break label141;
                                }
                                var2.field7981 += var2.field7983.method3277();
                            } else if (var2.method3253((byte) -96) && (var2.field7975 == null || var2.field7987 == null)) {
                                if (var2.field7975 == null) {
                                    var2.field7975 = class513.method2902(class16.field132, var2.field7976);
                                }
                                if (var2.field7975 == null) {
                                    break label141;
                                }
                                if (var2.field7987 == null) {
                                    var2.field7987 = var2.field7975.method2905(new int[] { 22050 });
                                    if (var2.field7987 == null) {
                                        break label141;
                                    }
                                }
                            }
                            if (var2.field7981 < 0) {
                                int var4;
                                if (~var2.field7989 == -1) {
                                    var4 = (var2.field7979 != 3 ? class72.field935.field6512 : class72.field935.field6514) * var2.field7984 >> 8;
                                } else {
                                    int var5 = 3 & var2.field7989 >> 24;
                                    if (class596.field8164.field3925 == var5) {
                                        int var6 = (255 & var2.field7989) << 9;
                                        int var7 = var2.field7989 >> 16 & 255;
                                        int var8 = (var7 << 9) - -256 + -class596.field8164.field3929;
                                        if (~var8 > -1) {
                                            var8 = -var8;
                                        }
                                        int var9 = var2.field7989 >> 8 & 255;
                                        int var10 = (var9 << 9) - -256 - class596.field8164.field3917;
                                        if (var10 < 0) {
                                            var10 = -var10;
                                        }
                                        int var11 = var8 + -512 + var10;
                                        if (~var11 < ~var6) {
                                            var2.field7981 = -99999;
                                            break label141;
                                        }
                                        if (var11 < 0) {
                                            var11 = 0;
                                        }
                                        var4 = (-var11 + var6) * class72.field935.field6526 * var2.field7984 / var6 >> 8;
                                    } else {
                                        var4 = 0;
                                    }
                                }
                                if (var4 > 0) {
                                    class53 var12 = null;
                                    if (~var2.field7979 == -2) {
                                        var12 = var2.field7983.method3279().method302(class606.field8277);
                                    } else if (var2.method3253((byte) -117)) {
                                        var12 = var2.field7987;
                                    }
                                    class491 var13 = var2.field7978 = class491.method2730(var12, 100, var4);
                                    var13.method2760(var2.field7988 + -1);
                                    class285.field3866.method3204(var13);
                                }
                            }
                        }
                    }
                    if (var3) {
                        --class485.field6555;
                        for (int var14 = var1; class485.field6555 > var14; ++var14) {
                            class658.field9278[var14] = class658.field9278[var14 + 1];
                        }
                        --var1;
                    }
                }
                ++var1;
            }
            ++field6197;
            if (class677.field9606 && !class242.method1488(-1799947892)) {
                if (~class72.field935.field6528 != -1 && ~class133.field1688 != 0) {
                    class21.method116(class328.field4812, class72.field935.field6528, 0, class133.field1688, false, 8956);
                }
                class677.field9606 = false;
            } else if (class72.field935.field6528 != 0 && class133.field1688 != -1 && !class242.method1488(-1799947892)) {
                class389.method2326((byte) 118, class409.field5750);
                ++class265.field3637;
                class253.field3491.method906(-1, class133.field1688);
                class133.field1688 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lpea;Lpba;)V", line = 259)
    public class454(class641 arg0, class472 arg1) {
        super(arg0);
        this.field6193 = arg1;
        if (this.field6193.field6388 != null && super.field7145.field9041 && super.field7145.field9071) {
            class216 var3 = class506.method2862(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 16686, super.field7145);
            class216 var4 = class506.method2862(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 16686, super.field7145);
            this.field6190 = class529.method3008((byte) -108, new class216[] { var3, var4 }, super.field7145);
            this.field6196 = this.field6190 != null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)Z", line = 278)
    public final boolean method1131(boolean arg0) {
        ++field6192;
        if (arg0) {
            this.method1137(37);
        }
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V", line = 290)
    public final void method1133(boolean arg0, int arg1) {
        ++field6188;
        if (arg1 <= 79) {
            method2578(true);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(Z)V", line = 301)
    public static void method2578(boolean arg0) {
        field6199 = null;
        field6198 = null;
        if (arg0) {
            method2578(false);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 313)
    public final void method1137(int arg0) {
        ++field6189;
        if (this.field6187) {
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3553((byte) -126, (class254) null);
            super.field7145.method3488(0, (byte) 23);
            super.field7145.method3553((byte) 82, (class254) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6187 = false;
        }
        if (arg0 != 6) {
            field6199 = null;
        }
    }
}
