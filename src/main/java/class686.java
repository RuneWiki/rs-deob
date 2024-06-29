import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class686 extends class387 {

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "Z")
    private boolean field9559 = false;

    @OriginalMember(owner = "client!vha", name = "m", descriptor = "Z")
    private boolean field9569 = false;

    @OriginalMember(owner = "client!vha", name = "j", descriptor = "Llba;")
    private class550 field9566;

    @OriginalMember(owner = "client!vha", name = "n", descriptor = "Lnfa;")
    private class680 field9570;

    @OriginalMember(owner = "client!vha", name = "e", descriptor = "J")
    public static long field9561 = -1L;

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "Ljava/lang/String;")
    public static String field9560 = null;

    @OriginalMember(owner = "client!vha", name = "f", descriptor = "I")
    public static int field9562;

    @OriginalMember(owner = "client!vha", name = "g", descriptor = "I")
    public static int field9563;

    @OriginalMember(owner = "client!vha", name = "h", descriptor = "I")
    public static int field9564;

    @OriginalMember(owner = "client!vha", name = "i", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!vha", name = "k", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!vha", name = "l", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!vha", name = "o", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!vha", name = "p", descriptor = "I")
    public static int field9572;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vha", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field9573;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3865(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Z)V", line = 3)
    public final void method644(boolean arg0) {
        if (this.field9559) {
            super.field5405.method3630(true, 1);
            super.field5405.method3639(-2, (class460) null);
            super.field5405.method3630(true, 0);
            super.field5405.method3639(-2, (class460) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field9559 = false;
        }
        if (arg0) {
            field9560 = null;
        }
        ++field9571;
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(Z)V", line = 24)
    public static void method3862(boolean arg0) {
        if (!arg0) {
            field9560 = null;
        }
        field9560 = null;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)Z", line = 43)
    public final boolean method641(int arg0) {
        if (arg0 != -16777216) {
            return false;
        } else {
            ++field9562;
            return false;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIII)V", line = 54)
    public static final void method3863(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class261.field3632 <= -arg2 + arg1 && class209.field3090 >= arg1 + arg2 && ~(-arg2 + arg4) <= ~class380.field5289 && ~(arg2 + arg4) >= ~class431.field5944) {
            class758.method4224(false, arg2, arg4, arg0, arg1);
        } else {
            class252.method1541(arg2, 1, arg4, arg0, arg1);
        }
        if (arg3 != 25187) {
            method3863(64, -86, 36, 103, 9);
        }
        ++field9563;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(III)V", line = 73)
    public final void method643(int arg0, int arg1, int arg2) {
        if (this.field9559) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) ((arg1 & 241045) >> 16) / 8.0F;
            long var8 = this.field9570.field9499;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5405.field8949 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field9572;
        int var10 = 54 / ((74 - arg2) / 36);
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(BILiga;)V", line = 100)
    public final void method638(byte arg0, int arg1, class460 arg2) {
        if (!this.field9559) {
            super.field5405.method3639(-2, arg2);
            super.field5405.method3631((byte) 113, arg1);
        }
        ++field9564;
        if (arg0 < 53) {
            this.method643(122, 72, -114);
        }
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Lrda;Llba;)V", line = 134)
    public class686(class663 arg0, class550 arg1) {
        super(arg0);
        this.field9566 = arg1;
        if (this.field9566.field7259 != null && super.field5405.field9085 && super.field5405.field9079) {
            class551 var3 = class380.method2244(4, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.field5405);
            class551 var4 = class380.method2244(4, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, super.field5405);
            this.field9570 = class373.method2186(super.field5405, new class551[] { var3, var4 }, -114);
            this.field9569 = this.field9570 != null;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(BZ)V", line = 124)
    public final void method639(byte arg0, boolean arg1) {
        if (arg0 >= -123) {
            field9560 = null;
        }
        ++field9567;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(ZB)V", line = 154)
    public final void method640(boolean arg0, byte arg1) {
        ++field9565;
        if (arg1 <= 1) {
            this.field9569 = false;
        }
        class444 var3 = super.field5405.method3625(1);
        if (this.field9569 && var3 != null) {
            super.field5405.method3630(true, 1);
            super.field5405.method3639(-2, var3);
            super.field5405.method3630(true, 0);
            super.field5405.method3639(-2, this.field9566.field7259);
            long var4 = this.field9570.field9499;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field5405.field8987[0], -super.field5405.field8987[1], -super.field5405.field8987[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5405.field9033, super.field5405.field9016, super.field5405.field9042, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field5405.field8987[1]) + 96.0F);
            this.field9559 = true;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIIIIII)V", line = 186)
    public static final void method3864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -24938) {
            method3862(true);
        }
        ++field9568;
        if (~arg4 <= -1 && arg2 >= 0 && class719.field10004 + -1 > arg4 && ~(class107.field1453 + -1) < ~arg2) {
            if (class660.field8718 == null) {
                return;
            }
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (arg1 == 3) {
                            class624 var8 = (class624) class694.method3906(arg6, arg4, arg2);
                            if (var8 != null) {
                                if (var8 instanceof class462) {
                                    ((class462) var8).field6330.method1155((byte) 118, arg3);
                                    return;
                                }
                                class515.method2875(arg5, arg3, arg6, 121, arg1, var8.method1759((byte) 112), arg4, arg7, arg2);
                                return;
                            }
                        }
                    } else {
                        class624 var9 = (class624) class490.method2780(arg6, arg4, arg2, field9573 != null ? field9573 : (field9573 = method3865("paa")));
                        if (var9 == null) {
                            return;
                        }
                        if (~arg7 == -12) {
                            arg7 = 10;
                        }
                        if (var9 instanceof class284) {
                            ((class284) var9).field4031.method1155((byte) 100, arg3);
                            return;
                        }
                        class515.method2875(arg5, arg3, arg6, 126, arg1, var9.method1759((byte) 97), arg4, arg7, arg2);
                    }
                    return;
                } else {
                    class624 var10 = (class624) class88.method674(arg6, arg4, arg2);
                    if (var10 == null) {
                        return;
                    }
                    if (var10 instanceof class353) {
                        ((class353) var10).field4975.method1155((byte) -24, arg3);
                        return;
                    }
                    int var11 = var10.method1759((byte) 109);
                    if (arg7 == 4 || arg7 == 5) {
                        class515.method2875(arg5, arg3, arg6, 107, arg1, var11, arg4, 4, arg2);
                        return;
                    }
                    if (~arg7 != -7) {
                        if (~arg7 == -8) {
                            class515.method2875((3 & arg5 + 2) - -4, arg3, arg6, arg0 ^ -24851, arg1, var11, arg4, 4, arg2);
                            return;
                        }
                        if (arg7 == 8) {
                            class515.method2875(arg5 + 4, arg3, arg6, arg0 ^ 24835, arg1, var11, arg4, 4, arg2);
                            class515.method2875((3 & arg5 + 2) + 4, arg3, arg6, -84, arg1, var11, arg4, 4, arg2);
                            return;
                        }
                    } else {
                        class515.method2875(arg5 + 4, arg3, arg6, 100, arg1, var11, arg4, 4, arg2);
                    }
                }
                return;
            }
            class624 var12 = (class624) class672.method3710(arg6, arg4, arg2);
            class624 var13 = (class624) class700.method3945(arg6, arg4, arg2);
            if (var12 != null && ~arg7 != -3) {
                if (var12 instanceof class435) {
                    ((class435) var12).field6002.method1155((byte) 118, arg3);
                } else {
                    class515.method2875(arg5, arg3, arg6, -84, arg1, var12.method1759((byte) 73), arg4, arg7, arg2);
                }
            }
            if (var13 != null) {
                if (!(var13 instanceof class435)) {
                    class515.method2875(arg5, arg3, arg6, arg0 + 24866, arg1, var13.method1759((byte) 67), arg4, arg7, arg2);
                    return;
                }
                ((class435) var13).field6002.method1155((byte) -36, arg3);
                return;
            }
        }
    }
}
