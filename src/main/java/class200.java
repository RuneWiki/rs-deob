import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class200 extends class261 {

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Z")
    private boolean field3177 = false;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Z")
    private boolean field3189 = false;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "Ljq;")
    private class264 field3188;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Leq;")
    private class256 field3179;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3181 = new String[100];

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lih;Ljq;)V")
    public class200(class214 arg0, class264 arg1) {
        super(arg0);
        this.field3188 = arg1;
        if (this.field3188.field4411 != null && super.field4358.field3681 && super.field4358.field3721) {
            class303 var3 = class64.method421((byte) -125, 35633, super.field4358, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class303 var4 = class64.method421((byte) -125, 35632, super.field4358, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field3179 = class287.method1864(new class303[] { var3, var4 }, super.field4358, 1);
            this.field3189 = this.field3179 != null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)Z")
    public final boolean method1026(int arg0) {
        if (arg0 < 69) {
            this.field3188 = null;
        }
        ++field3180;
        return this.field3189;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
    public static void method1324(boolean arg0) {
        field3181 = null;
        if (!arg0) {
            field3187 = -69;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)V")
    public final void method1022(int arg0, boolean arg1) {
        int var3 = -125 % ((87 - arg0) / 37);
        ++field3182;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZB)V")
    public final void method1020(boolean arg0, byte arg1) {
        ++field3185;
        class358 var3 = super.field4358.method1435(false);
        if (this.field3189 && var3 != null) {
            float var4 = 1.0F + 2.0F * (1.0F - Math.abs(super.field4358.field3695[1]));
            super.field4358.method1440(1, 0);
            super.field4358.method1471(true, var3);
            super.field4358.method1440(0, 0);
            super.field4358.method1471(true, this.field3188.field4411);
            long var5 = this.field3179.field4330;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field4358.field3695[0], -super.field4358.field3695[1], -super.field4358.field3695[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field4358.field3697 * var4, super.field4358.field3672 * var4, super.field4358.field3652 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + Math.abs(super.field4358.field3695[1]) * 928.0F);
            this.field3177 = true;
        }
        if (arg1 < 23) {
            this.method1023(120);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
    public final void method1021(int arg0, int arg1, int arg2) {
        if (this.field3177) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << ((arg2 & 56) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) (arg0 >> 16 & 3) / 8.0F;
            float var8 = (float) ((8350309 & arg0) >> 19) / 16.0F;
            float var9 = (float) ((arg0 & 133077278) >> 23) / 16.0F;
            int var10 = (2069978771 & arg0) >> 27;
            long var11 = this.field3179.field4330;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field4358.field3602 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field3186;
        int var13 = 72 % ((arg1 - 82) / 41);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILkk;)V")
    public final void method1024(int arg0, int arg1, class179 arg2) {
        if (!this.field3177) {
            super.field4358.method1471(true, arg2);
            super.field4358.method1410(arg0, 7681);
        }
        ++field3178;
        int var4 = 9 % ((21 - arg1) / 36);
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
    public final void method1023(int arg0) {
        if (arg0 == 5000) {
            if (this.field3177) {
                super.field4358.method1440(1, 0);
                super.field4358.method1471(true, (class179) null);
                super.field4358.method1440(0, 0);
                super.field4358.method1471(true, (class179) null);
                OpenGL.glUseProgramObjectARB(0L);
                this.field3177 = false;
            }
            ++field3184;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([BI)Ljava/lang/String;")
    public static final String method1325(byte[] arg0, int arg1) {
        ++field3183;
        if (arg1 != -19931) {
            return null;
        } else {
            int var2 = arg0.length;
            char[] var3 = new char[var2];
            int var4 = 0;
            for (int var5 = 0; var2 > var5; ++var5) {
                int var6 = arg0[var5] & 255;
                if (var6 >= 128) {
                    if (var6 < 194) {
                        throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                    }
                    if (var6 >= 224) {
                        if (~var6 > -241) {
                            if (~(var5 + 2) <= ~var2) {
                                throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                            }
                            ++var5;
                            int var7 = arg0[var5] & 255;
                            if (var7 >= 128 && var7 <= 191) {
                                ++var5;
                                int var8 = 255 & arg0[var5];
                                if (~var8 <= -129 && ~var8 >= -192) {
                                    var3[var4++] = (char) class338.method2141(class338.method2141(class344.method2224(-129, var7) << 6, class344.method2224(var6 << 12, -921600)), class344.method2224(-129, var8));
                                    continue;
                                }
                                throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                            }
                            throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                        }
                        if (~var6 <= -245) {
                            throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                        }
                        throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                    } else {
                        if (~var2 >= ~(var5 + 1)) {
                            throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                        }
                        ++var5;
                        int var9 = arg0[var5] & 255;
                        if (var9 < 128 || var9 > 191) {
                            throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                        }
                        var3[var4++] = (char) class338.method2141(class344.method2224(-12352, var6 << 6), class344.method2224(var9, -129));
                    }
                } else {
                    var3[var4++] = (char) var6;
                }
            }
            return new String(var3, 0, var4);
        }
    }
}
