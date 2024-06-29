import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class328 extends class56 {

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "Z")
    private boolean field5022 = false;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "Z")
    private boolean field5026 = false;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "Lre;")
    private class222 field5020;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "Lrs;")
    private class486 field5027;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "Lui;")
    public static class375 field5032 = new class375("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "[I")
    public static int[] field5033 = new int[4096];

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "Lf;")
    public static class191 field5023;

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field5033[var0] = class415.method2516(var0, 119);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2115(boolean arg0) {
        if (!arg0) {
            field5023 = null;
        }
        field5032 = null;
        field5023 = null;
        field5033 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V", line = 15)
    public final void method382(int arg0, int arg1, int arg2) {
        if (this.field5026) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((57 & arg1) >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((arg0 & 207865) >> 16) / 8.0F;
            float var8 = (float) (15 & arg0 >> 19) / 16.0F;
            float var9 = (float) ((127446056 & arg0) >> 23) / 16.0F;
            int var10 = (arg0 & 2060803429) >> 27;
            long var11 = this.field5027.field7133;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field752.field4086 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg2 != 0) {
            field5032 = null;
        }
        ++field5025;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lbv;Lre;)V", line = 52)
    public class328(class282 arg0, class222 arg1) {
        super(arg0);
        this.field5020 = arg1;
        if (this.field5020.field3105 != null && super.field752.field4198 && super.field752.field4150) {
            class238 var3 = class117.method760(super.field752, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, -12054);
            class238 var4 = class117.method760(super.field752, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, -12054);
            this.field5027 = class384.method2382((byte) 90, new class238[] { var3, var4 }, super.field752);
            this.field5022 = this.field5027 != null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V", line = 71)
    public final void method380(boolean arg0, int arg1) {
        if (arg1 > 42) {
            ++field5024;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(ZI)V", line = 89)
    public final void method383(boolean arg0, int arg1) {
        ++field5019;
        class237 var3 = super.field752.method1805(1365);
        if (arg1 < -77) {
            if (this.field5022 && var3 != null) {
                float var4 = (-Math.abs(super.field752.field4110[1]) + 1.0F) * 2.0F + 1.0F;
                super.field752.method1819(1, (byte) 115);
                super.field752.method1787(var3, (byte) 121);
                super.field752.method1819(0, (byte) 107);
                super.field752.method1787(this.field5020.field3105, (byte) 121);
                long var5 = this.field5027.field7133;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field752.field4110[0], -super.field752.field4110[1], -super.field752.field4110[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field752.field4111 * var4, super.field752.field4182 * var4, super.field752.field4194 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field752.field4110[1]));
                this.field5026 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lbp;B)I", line = 127)
    public static final int method2116(class322 arg0, byte arg1) {
        ++field5029;
        int var2 = arg0.field4938;
        class219 var3 = arg0.method2181(0);
        if (arg1 != -29) {
            return 3;
        } else {
            if (!arg0.field5294) {
                if (arg0.field5253 != var3.field3054 && arg0.field5253 != var3.field3036 && arg0.field5253 != var3.field3056 && ~arg0.field5253 != ~var3.field3063) {
                    if (arg0.field5253 == var3.field3052 || arg0.field5253 == var3.field3042 || ~arg0.field5253 == ~var3.field3037 || arg0.field5253 == var3.field3044) {
                        var2 = arg0.field4951;
                    }
                } else {
                    var2 = arg0.field4955;
                }
            } else {
                var2 = arg0.field4980;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Z", line = 156)
    public final boolean method377(byte arg0) {
        ++field5028;
        if (arg0 > -8) {
            this.field5022 = false;
        }
        return this.field5022;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 167)
    public final void method381(int arg0) {
        if (this.field5026) {
            super.field752.method1819(1, (byte) 109);
            super.field752.method1787((class14) null, (byte) 121);
            super.field752.method1819(0, (byte) 118);
            super.field752.method1787((class14) null, (byte) 121);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5026 = false;
        }
        if (arg0 > -50) {
            field5033 = null;
        }
        ++field5030;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIZIIILwq;)Z", line = 189)
    public static final boolean method2117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class370 arg10) {
        ++field5021;
        int var11 = arg2;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg2;
        int var16 = -var14 + arg1;
        class91.field1335[var13][var14] = 99;
        class77.field1063[var13][var14] = 0;
        if (arg6) {
            method2115(false);
        }
        byte var17 = 0;
        class498.field7264[var17] = arg2;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class510.field7589[var10001] = arg1;
        int[][] var19 = arg10.field5678;
        while (~var26 != ~var18) {
            var11 = class498.field7264[var18];
            var12 = class510.field7589[var18];
            int var20 = -arg10.field5692 + var11;
            int var21 = -var16 + var12;
            int var22 = -var15 + var11;
            int var23 = var12 - arg10.field5669;
            var18 = var18 + 1 & 4095;
            if (~arg7 != 3) {
                if (~arg7 != 2) {
                    if (~arg7 != 1) {
                        if (~arg7 != 0) {
                            if (arg7 != 0 && ~arg7 != -2 && arg7 != 2 && arg7 != 3 && arg7 != 9) {
                                if (arg10.method2307(arg3, -97, arg7, var11, 1, var12, arg4, arg8)) {
                                    class96.field1400 = var11;
                                    class411.field6181 = var12;
                                    return true;
                                }
                            } else if (arg10.method2308(arg7, arg8, var11, (byte) -78, arg4, var12, 1, arg3)) {
                                class96.field1400 = var11;
                                class411.field6181 = var12;
                                return true;
                            }
                        } else if (arg10.method2317(arg9, 91, 1, arg3, var11, arg8, arg0, var12, arg5)) {
                            class96.field1400 = var11;
                            class411.field6181 = var12;
                            return true;
                        }
                    } else if (arg10.method2313(var11, 1, arg9, true, arg5, var12, 1, arg8, arg0, arg3)) {
                        class96.field1400 = var11;
                        class411.field6181 = var12;
                        return true;
                    }
                } else if (class231.method1574(var12, arg0, 1, arg9, arg8, 2, arg3, 1, var11)) {
                    class96.field1400 = var11;
                    class411.field6181 = var12;
                    return true;
                }
            } else if (arg3 == var11 && arg8 == var12) {
                class96.field1400 = var11;
                class411.field6181 = var12;
                return true;
            }
            int var25 = class77.field1063[var22][var21] + 1;
            if (~var22 < -1 && ~class91.field1335[var22 - 1][var21] == -1 && (var19[var20 + -1][var23] & 1109655552) == 0) {
                class498.field7264[var26] = var11 - 1;
                class510.field7589[var26] = var12;
                class91.field1335[var22 + -1][var21] = 2;
                var26 = var26 + 1 & 4095;
                class77.field1063[var22 + -1][var21] = var25;
            }
            if (var22 < 127 && ~class91.field1335[var22 + 1][var21] == -1 && (1612972032 & var19[var20 + 1][var23]) == 0) {
                class498.field7264[var26] = var11 - -1;
                class510.field7589[var26] = var12;
                var26 = 4095 & var26 + 1;
                class91.field1335[var22 + 1][var21] = 8;
                class77.field1063[var22 + 1][var21] = var25;
            }
            if (~var21 < -1 && class91.field1335[var22][var21 - 1] == 0 && ~(1084489728 & var19[var20][var23 + -1]) == -1) {
                class498.field7264[var26] = var11;
                class510.field7589[var26] = var12 - 1;
                var26 = var26 + 1 & 4095;
                class91.field1335[var22][var21 + -1] = 1;
                class77.field1063[var22][var21 + -1] = var25;
            }
            if (~var21 > -128 && class91.field1335[var22][var21 - -1] == 0 && (var19[var20][var23 + 1] & 1210318848) == 0) {
                class498.field7264[var26] = var11;
                class510.field7589[var26] = var12 + 1;
                var26 = var26 + 1 & 4095;
                class91.field1335[var22][var21 + 1] = 4;
                class77.field1063[var22][var21 + 1] = var25;
            }
            if (~var22 < -1 && ~var21 < -1 && class91.field1335[var22 + -1][var21 + -1] == 0 && ~(var19[var20 + -1][var23 + -1] & 1134821376) == -1 && (var19[var20 + -1][var23] & 1109655552) == 0 && ~(1084489728 & var19[var20][var23 + -1]) == -1) {
                class498.field7264[var26] = var11 + -1;
                class510.field7589[var26] = var12 + -1;
                var26 = 4095 & var26 + 1;
                class91.field1335[var22 + -1][var21 + -1] = 3;
                class77.field1063[var22 + -1][var21 + -1] = var25;
            }
            if (var22 < 127 && var21 > 0 && ~class91.field1335[var22 + 1][var21 + -1] == -1 && ~(1625554944 & var19[var20 - -1][var23 + -1]) == -1 && (1612972032 & var19[var20 - -1][var23]) == 0 && (1084489728 & var19[var20][var23 - 1]) == 0) {
                class498.field7264[var26] = var11 + 1;
                class510.field7589[var26] = var12 - 1;
                var26 = var26 + 1 & 4095;
                class91.field1335[var22 + 1][var21 + -1] = 9;
                class77.field1063[var22 + 1][var21 - 1] = var25;
            }
            if (var22 > 0 && ~var21 > -128 && ~class91.field1335[var22 + -1][var21 - -1] == -1 && (1310982144 & var19[var20 + -1][var23 + 1]) == 0 && ~(var19[var20 + -1][var23] & 1109655552) == -1 && (1210318848 & var19[var20][var23 - -1]) == 0) {
                class498.field7264[var26] = var11 + -1;
                class510.field7589[var26] = var12 + 1;
                class91.field1335[var22 + -1][var21 + 1] = 6;
                var26 = var26 - -1 & 4095;
                class77.field1063[var22 + -1][var21 + 1] = var25;
            }
            if (var22 < 127 && ~var21 > -128 && class91.field1335[var22 + 1][var21 + 1] == 0 && (var19[var20 + 1][var23 + 1] & 2015625216) == 0 && ~(var19[var20 + 1][var23] & 1612972032) == -1 && ~(var19[var20][var23 - -1] & 1210318848) == -1) {
                class498.field7264[var26] = var11 + 1;
                class510.field7589[var26] = var12 + 1;
                var26 = var26 + 1 & 4095;
                class91.field1335[var22 + 1][var21 + 1] = 12;
                class77.field1063[var22 - -1][var21 - -1] = var25;
            }
        }
        class411.field6181 = var12;
        class96.field1400 = var11;
        return false;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILkv;)V", line = 438)
    public final void method379(int arg0, int arg1, class14 arg2) {
        ++field5031;
        int var4 = -11 / ((81 - arg1) / 39);
        if (!this.field5026) {
            super.field752.method1787(arg2, (byte) 121);
            super.field752.method1794(arg0, 74);
        }
    }
}
