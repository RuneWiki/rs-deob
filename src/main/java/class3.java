import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 extends class489 {

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Z")
    private boolean field18 = false;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "Z")
    private boolean field27 = false;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Lfaa;")
    private class452 field14;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "Lua;")
    private class636 field21;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field16 = 0;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "Lsga;")
    public static class583 field26 = new class583(32);

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public final void method6(int arg0) {
        ++field24;
        if (arg0 != 0) {
            this.method8(11, 49, 67);
        }
        if (this.field27) {
            super.field6956.method2135(1, arg0 ^ -5027);
            super.field6956.method2120(-1, (class411) null);
            super.field6956.method2135(0, -5027);
            super.field6956.method2120(-1, (class411) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field27 = false;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Z")
    public final boolean method7(byte arg0) {
        if (arg0 < 95) {
            this.field27 = false;
        }
        ++field15;
        return this.field18;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
    public final void method8(int arg0, int arg1, int arg2) {
        if (arg2 != 40) {
            method11(false);
        }
        ++field19;
        if (this.field27) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((arg1 & 59) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) ((arg0 & 223158) >> 16) / 8.0F;
            float var8 = (float) ((arg0 & 8283879) >> 19) / 16.0F;
            float var9 = (float) (arg0 >> 23 & 15) / 16.0F;
            int var10 = (arg0 & 2063112760) >> 27;
            long var11 = this.field21.field8807;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field6956.field4961 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(IZ)V")
    public final void method9(int arg0, boolean arg1) {
        if (arg0 != -5) {
            this.method10(-123, true);
        }
        ++field22;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZ)V")
    public final void method10(int arg0, boolean arg1) {
        ++field17;
        class45 var3 = super.field6956.method2168(-78);
        int var4 = -104 % ((arg0 - -43) / 37);
        if (this.field18 && var3 != null) {
            float var5 = (1.0F - Math.abs(super.field6956.field5031[1])) * 2.0F + 1.0F;
            super.field6956.method2135(1, -5027);
            super.field6956.method2120(-1, var3);
            super.field6956.method2135(0, -5027);
            super.field6956.method2120(-1, this.field14.field6339);
            long var6 = this.field21.field8807;
            OpenGL.glUseProgramObjectARB(var6);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var6, "sunDir"), -super.field6956.field5031[0], -super.field6956.field5031[1], -super.field6956.field5031[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var6, "sunColour"), super.field6956.field5102 * var5, super.field6956.field5019 * var5, super.field6956.field5018 * var5, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var6, "sunExponent"), 64.0F + Math.abs(super.field6956.field5031[1]) * 928.0F);
            this.field27 = true;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Leq;Lfaa;)V")
    public class3(class357 arg0, class452 arg1) {
        super(arg0);
        this.field14 = arg1;
        if (this.field14.field6339 != null && super.field6956.field5085 && super.field6956.field5065) {
            class692 var3 = class77.method560(super.field6956, (byte) 38, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class692 var4 = class77.method560(super.field6956, (byte) 99, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field21 = class615.method3375(new class692[] { var3, var4 }, (byte) 64, super.field6956);
            this.field18 = this.field21 != null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static void method11(boolean arg0) {
        if (arg0) {
            field16 = 112;
        }
        field26 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLkp;I)V")
    public final void method12(byte arg0, class411 arg1, int arg2) {
        if (arg0 > -66) {
            this.field14 = null;
        }
        if (!this.field27) {
            super.field6956.method2120(-1, arg1);
            super.field6956.method2153(67, arg2);
        }
        ++field25;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(CI)Z")
    public static final boolean method13(char arg0, int arg1) {
        if (arg1 != 248) {
            field26 = null;
        }
        ++field20;
        return arg0 >= '0' && arg0 <= '9' || ~arg0 <= -66 && arg0 <= 'Z' || ~arg0 <= -98 && ~arg0 >= -123;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method14(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field23;
        char[] var4 = new char[arg1];
        int var5 = -121 / ((34 - arg3) / 54);
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg0 - -arg1;
        while (~var8 < ~var7) {
            int var9 = arg2[var7++] & 255;
            int var10;
            if (~var9 <= -129) {
                if (~var9 <= -193) {
                    if (var9 < 224) {
                        if (~var7 > ~var8 && ~(192 & arg2[var7]) == -129) {
                            var10 = arg2[var7++] & 63 | var9 << 6 & 1984;
                            if (~var10 > -129) {
                                var10 = 65533;
                            }
                        } else {
                            var10 = 65533;
                        }
                    } else if (~var9 > -241) {
                        if (var8 > var7 - -1 && (192 & arg2[var7]) == 128 && ~(192 & arg2[var7 + 1]) == -129) {
                            var10 = (15 & var9) << 12 | arg2[var7++] << 6 & 4032 | arg2[var7++] & 63;
                            if (~var10 > -2049) {
                                var10 = 65533;
                            }
                        } else {
                            var10 = 65533;
                        }
                    } else if (var9 < 248) {
                        if (var8 > var7 + 2 && (192 & arg2[var7]) == 128 && ~(192 & arg2[var7 - -1]) == -129 && (192 & arg2[var7 + 2]) == 128) {
                            int var11 = (var9 & 7) << 18 | 258048 & arg2[var7++] << 12 | (arg2[var7++] & 63) << 6 | arg2[var7++] & 63;
                            if (~var11 <= -65537 && ~var11 >= -1114112) {
                                var10 = 65533;
                            } else {
                                var10 = 65533;
                            }
                        } else {
                            var10 = 65533;
                        }
                    } else {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (~var9 != -1) {
                var10 = var9;
            } else {
                var10 = 65533;
            }
            var4[var6++] = (char) var10;
        }
        return new String(var4, 0, var6);
    }
}
