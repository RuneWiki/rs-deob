import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class357 extends class363 {

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "Z")
    private boolean field5482 = false;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "Z")
    private boolean field5476 = false;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "Lqh;")
    private class48 field5488;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "Lkh;")
    private class13 field5491;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "[F")
    public static float[] field5479 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "[I")
    public static int[] field5475 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "Lki;")
    public static class498 field5485 = new class498(64, -1);

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "Z")
    public static boolean field5480;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field5493;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)V")
    public final void method125(boolean arg0, int arg1) {
        if (arg1 >= -69) {
            this.method128(115, -103, -32);
        }
        ++field5489;
        class374 var3 = super.field5564.method2151((byte) 118);
        if (this.field5482 && var3 != null) {
            float var4 = 1.0F + (1.0F - Math.abs(super.field5564.field5341[1])) * 2.0F;
            super.field5564.method2176(1, 92);
            super.field5564.method2200(var3, (byte) 112);
            super.field5564.method2176(0, 82);
            super.field5564.method2200(this.field5488.field772, (byte) 119);
            long var5 = this.field5491.field168;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field5564.field5341[0], -super.field5564.field5341[1], -super.field5564.field5341[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field5564.field5362 * var4, super.field5564.field5337 * var4, super.field5564.field5294 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field5564.field5341[1]));
            this.field5476 = true;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZB)V")
    public final void method122(boolean arg0, byte arg1) {
        if (arg1 != 52) {
            this.method120(false);
        }
        ++field5483;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIIIILvb;III)Z")
    public static final boolean method2224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class130 arg8, int arg9, int arg10, int arg11) {
        ++field5486;
        int var12 = arg9;
        int var13 = arg5;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = -var14 + arg9;
        int var17 = -var15 + arg5;
        class402.field6048[var14][var15] = 99;
        class230.field3438[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        if (arg2 != -26027) {
            field5492 = 89;
        }
        class199.field2885[var18] = arg9;
        int var35 = var18 + 1;
        class315.field4499[var18] = arg5;
        int[][] var20 = arg8.field2008;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class70.field1055 = var13;
                                    class170.field2531 = var12;
                                    return false;
                                }
                                var13 = class315.field4499[var19];
                                var12 = class199.field2885[var19];
                                var19 = 4095 & var19 - -1;
                                var21 = -var16 + var12;
                                var22 = -var17 + var13;
                                var23 = -arg8.field2021 + var12;
                                var24 = -arg8.field2009 + var13;
                                if (arg10 != -4) {
                                    if (arg10 != -3) {
                                        if (arg10 != -2) {
                                            if (arg10 != -1) {
                                                if (arg10 != 0 && arg10 != 1 && arg10 != 2 && arg10 != 3 && arg10 != 9) {
                                                    if (arg8.method874(arg6, var13, arg7, 118, arg10, var12, arg0, arg1)) {
                                                        class70.field1055 = var13;
                                                        class170.field2531 = var12;
                                                        return true;
                                                    }
                                                } else if (arg8.method862(var13, 27254, arg10, arg6, arg7, arg0, var12, arg1)) {
                                                    class170.field2531 = var12;
                                                    class70.field1055 = var13;
                                                    return true;
                                                }
                                            } else if (arg8.method866(arg11, arg0, arg4, arg7, (byte) 71, var12, arg6, arg3, var13)) {
                                                class70.field1055 = var13;
                                                class170.field2531 = var12;
                                                return true;
                                            }
                                        } else if (arg8.method868(67108864, var13, arg3, arg0, arg6, arg6, arg11, arg4, arg7, var12)) {
                                            class70.field1055 = var13;
                                            class170.field2531 = var12;
                                            return true;
                                        }
                                    } else if (class429.method2562(arg0, var12, arg6, arg11, var13, (byte) -116, arg3, arg6, arg7)) {
                                        class170.field2531 = var12;
                                        class70.field1055 = var13;
                                        return true;
                                    }
                                } else if (arg7 == var12 && ~arg0 == ~var13) {
                                    class170.field2531 = var12;
                                    class70.field1055 = var13;
                                    return true;
                                }
                                var26 = class230.field3438[var21][var22] + 1;
                                if (~var21 < -1 && ~class402.field6048[var21 + -1][var22] == -1 && ~(var20[var23 + -1][var24] & 1134821376) == -1 && ~(var20[var23 - 1][arg6 + -1 + var24] & 1310982144) == -1) {
                                    int var27 = 1;
                                    while (true) {
                                        if (~(arg6 + -1) >= ~var27) {
                                            class199.field2885[var35] = var12 - 1;
                                            class315.field4499[var35] = var13;
                                            var35 = 4095 & var35 - -1;
                                            class402.field6048[var21 + -1][var22] = 2;
                                            class230.field3438[var21 + -1][var22] = var26;
                                            break;
                                        }
                                        if (~(var20[var23 + -1][var24 + var27] & 1336147968) != -1) {
                                            break;
                                        }
                                        ++var27;
                                    }
                                }
                                if (~var21 > ~(-arg6 + 128) && class402.field6048[var21 + 1][var22] == 0 && (var20[var23 - -arg6][var24] & 1625554944) == 0 && ~(var20[var23 - -arg6][arg6 + var24 + -1] & 2015625216) == -1) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg6 + -1) {
                                            class199.field2885[var35] = var12 - -1;
                                            class315.field4499[var35] = var13;
                                            var35 = var35 + 1 & 4095;
                                            class402.field6048[var21 - -1][var22] = 8;
                                            class230.field3438[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if (~(2028208128 & var20[arg6 + var23][var24 - -var28]) != -1) {
                                            break;
                                        }
                                        ++var28;
                                    }
                                }
                                if (~var22 < -1 && class402.field6048[var21][var22 - 1] == 0 && ~(var20[var23][var24 + -1] & 1134821376) == -1 && (1625554944 & var20[arg6 + var23 + -1][var24 - 1]) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (~(arg6 + -1) >= ~var29) {
                                            class199.field2885[var35] = var12;
                                            class315.field4499[var35] = var13 + -1;
                                            class402.field6048[var21][var22 + -1] = 1;
                                            var35 = 4095 & var35 + 1;
                                            class230.field3438[var21][var22 + -1] = var26;
                                            break;
                                        }
                                        if (~(1675886592 & var20[var23 + var29][var24 - 1]) != -1) {
                                            break;
                                        }
                                        ++var29;
                                    }
                                }
                                if (var22 < 128 - arg6 && ~class402.field6048[var21][var22 + 1] == -1 && (var20[var23][var24 - -arg6] & 1310982144) == 0 && (var20[arg6 + -1 + var23][arg6 + var24] & 2015625216) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (~var30 <= ~(arg6 + -1)) {
                                            class199.field2885[var35] = var12;
                                            class315.field4499[var35] = var13 + 1;
                                            class402.field6048[var21][var22 - -1] = 4;
                                            var35 = var35 - -1 & 4095;
                                            class230.field3438[var21][var22 - -1] = var26;
                                            break;
                                        }
                                        if ((2116288512 & var20[var23 - -var30][arg6 + var24]) != 0) {
                                            break;
                                        }
                                        ++var30;
                                    }
                                }
                                if (var21 > 0 && ~var22 < -1 && class402.field6048[var21 - 1][var22 + -1] == 0 && ~(1134821376 & var20[var23 + -1][var24 + -1]) == -1) {
                                    int var31 = 1;
                                    while (true) {
                                        if (~arg6 >= ~var31) {
                                            class199.field2885[var35] = var12 - 1;
                                            class315.field4499[var35] = var13 + -1;
                                            class402.field6048[var21 + -1][var22 + -1] = 3;
                                            var35 = var35 + 1 & 4095;
                                            class230.field3438[var21 + -1][var22 + -1] = var26;
                                            break;
                                        }
                                        if ((1336147968 & var20[var23 + -1][var31 + -1 + var24]) != 0 || ~(1675886592 & var20[var23 - -var31 + -1][var24 + -1]) != -1) {
                                            break;
                                        }
                                        ++var31;
                                    }
                                }
                                if (var21 < -arg6 + 128 && ~var22 < -1 && class402.field6048[var21 + 1][var22 - 1] == 0 && ~(1625554944 & var20[arg6 + var23][var24 + -1]) == -1) {
                                    int var32 = 1;
                                    while (true) {
                                        if (~var32 <= ~arg6) {
                                            class199.field2885[var35] = var12 + 1;
                                            class315.field4499[var35] = var13 + -1;
                                            class402.field6048[var21 + 1][var22 + -1] = 9;
                                            var35 = var35 + 1 & 4095;
                                            class230.field3438[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((2028208128 & var20[arg6 + var23][var24 + var32 + -1]) != 0 || ~(var20[var23 + var32][var24 + -1] & 1675886592) != -1) {
                                            break;
                                        }
                                        ++var32;
                                    }
                                }
                                if (~var21 < -1 && ~(-arg6 + 128) < ~var22 && class402.field6048[var21 + -1][var22 + 1] == 0 && (1310982144 & var20[var23 + -1][arg6 + var24]) == 0) {
                                    for (int var33 = 1; ~arg6 < ~var33; ++var33) {
                                        if (~(var20[var23 - 1][var24 + var33] & 1336147968) != -1 || ~(2116288512 & var20[var23 + -1 - -var33][arg6 + var24]) != -1) {
                                            continue label263;
                                        }
                                    }
                                    class199.field2885[var35] = var12 - 1;
                                    class315.field4499[var35] = var13 + 1;
                                    class402.field6048[var21 + -1][var22 + 1] = 6;
                                    var35 = 4095 & var35 + 1;
                                    class230.field3438[var21 + -1][var22 - -1] = var26;
                                }
                            } while (var21 >= -arg6 + 128);
                        } while (~var22 <= ~(128 - arg6));
                    } while (class402.field6048[var21 - -1][var22 + 1] != 0);
                } while ((2015625216 & var20[var23 - -arg6][var24 - -arg6]) != 0);
                for (int var34 = 1; ~var34 > ~arg6; ++var34) {
                    if ((2116288512 & var20[var23 + var34][arg6 + var24]) != 0 || ~(2028208128 & var20[arg6 + var23][var24 + var34]) != -1) {
                        continue label286;
                    }
                }
                class199.field2885[var35] = var12 + 1;
                class315.field4499[var35] = var13 + 1;
                class402.field6048[var21 + 1][var22 + 1] = 12;
                var35 = 4095 & var35 - -1;
                class230.field3438[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljk;IB)V")
    public final void method121(class446 arg0, int arg1, byte arg2) {
        ++field5487;
        if (!this.field5476) {
            super.field5564.method2200(arg0, (byte) 126);
            super.field5564.method2186(arg1, 34);
        }
        if (arg2 >= -69) {
            field5492 = 92;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        ++field5490;
        if (this.field5476) {
            super.field5564.method2176(1, 32);
            super.field5564.method2200((class446) null, (byte) 119);
            super.field5564.method2176(0, 61);
            super.field5564.method2200((class446) null, (byte) 117);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5476 = false;
        }
        if (arg0) {
            field5485 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V")
    public static void method2225(int arg0) {
        field5479 = null;
        field5485 = null;
        field5493 = null;
        field5475 = null;
        if (arg0 != -26006) {
            field5493 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
    public final void method128(int arg0, int arg1, int arg2) {
        ++field5481;
        if (this.field5476) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << ((arg2 & 59) >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((arg0 & 228771) >> 16) / 8.0F;
            float var8 = (float) (15 & arg0 >> 19) / 16.0F;
            float var9 = (float) (15 & arg0 >> 23) / 16.0F;
            int var10 = arg0 >> 27 & 15;
            long var11 = this.field5491.field168;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field5564.field5228 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg1 >= -13) {
            method2225(-113);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lod;Lqh;)V")
    public class357(class349 arg0, class48 arg1) {
        super(arg0);
        this.field5488 = arg1;
        if (this.field5488.field772 != null && super.field5564.field5315 && super.field5564.field5330) {
            class307 var3 = class471.method2826("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field5564, 35633, (byte) 82);
            class307 var4 = class471.method2826("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field5564, 35632, (byte) 47);
            this.field5491 = class312.method1948(super.field5564, -111, new class307[] { var3, var4 });
            this.field5482 = this.field5491 != null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILdh;)Lke;")
    public static final class422 method2226(int arg0, class209 arg1) {
        if (arg0 != 13795) {
            field5480 = true;
        }
        ++field5477;
        return new class422(arg1.method1447(29480), arg1.method1447(arg0 ^ 18123), arg1.method1447(arg0 ^ 18123), arg1.method1447(29480), arg1.method1458((byte) -10), arg1.method1458((byte) -10), arg1.method1428(32122));
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
    public static final void method2227(byte arg0) {
        int var1 = -25 / ((arg0 - -28) / 56);
        class81.field1223.method2601(-21859);
        ++field5478;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)Z")
    public final boolean method126(int arg0) {
        ++field5494;
        int var2 = 0 % ((37 - arg0) / 48);
        return this.field5482;
    }
}
