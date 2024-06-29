import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class333 extends class140 {

    @OriginalMember(owner = "client!br", name = "i", descriptor = "Z")
    private boolean field4603 = false;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "Z")
    private boolean field4611 = false;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "Lwq;")
    private class146 field4616;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "Lgda;")
    private class49 field4610;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "[B")
    public static byte[] field4601 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public static int field4604 = 0;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "I")
    public static int field4615 = 0;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "Lwf;")
    public static class117 field4607 = new class117(8);

    @OriginalMember(owner = "client!br", name = "w", descriptor = "I")
    public static int field4617 = 0;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "Lkda;")
    public static class328 field4619;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V", line = 3)
    public final void method144(int arg0, int arg1, int arg2) {
        ++field4606;
        if (arg1 != -4741) {
            field4618 = -25;
        }
        if (this.field4611) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << ((63 & arg2) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) (3 & arg0 >> 16) / 8.0F;
            float var8 = (float) ((8245612 & arg0) >> 19) / 16.0F;
            float var9 = (float) (arg0 >> 23 & 15) / 16.0F;
            int var10 = (2078254161 & arg0) >> 27;
            long var11 = this.field4610.field575;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field1984.field7747 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V", line = 43)
    public final void method145(int arg0, boolean arg1) {
        if (arg0 == -7) {
            ++field4614;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)I", line = 54)
    public static final int method2030(boolean arg0) {
        if (arg0) {
            method2030(true);
        }
        ++field4605;
        return 6;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lte;Lwq;)V", line = 65)
    public class333(class527 arg0, class146 arg1) {
        super(arg0);
        this.field4616 = arg1;
        if (this.field4616.field2121 != null && super.field1984.field7874 && super.field1984.field7825) {
            class346 var3 = class522.method3080(-83, 35633, super.field1984, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class346 var4 = class522.method3080(-128, 35632, super.field1984, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field4610 = class560.method3370(super.field1984, new class346[] { var3, var4 }, -120);
            this.field4603 = this.field4610 != null;
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V", line = 87)
    public final void method143(int arg0) {
        ++field4612;
        if (arg0 != -7) {
            this.field4610 = null;
        }
        if (this.field4611) {
            super.field1984.method3111(33984, 1);
            super.field1984.method3152(-2, (class228) null);
            super.field1984.method3111(33984, 0);
            super.field1984.method3152(arg0 + 5, (class228) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4611 = false;
        }
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(I)V", line = 108)
    public static void method2031(int arg0) {
        field4601 = null;
        field4607 = null;
        if (arg0 != 2) {
            field4618 = -102;
        }
        field4619 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILjl;)V", line = 123)
    public final void method146(int arg0, int arg1, class228 arg2) {
        if (arg0 != -7) {
            this.method144(-58, -108, -60);
        }
        ++field4602;
        if (!this.field4611) {
            super.field1984.method3152(-2, arg2);
            super.field1984.method3121(-27745, arg1);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILvp;Lqa;ILpa;IIII)V", line = 141)
    public static final void method2032(int arg0, class162 arg1, class208 arg2, int arg3, class311 arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4609;
        class308 var9 = class440.field5876.method3058(arg5, arg6 ^ arg6);
        if (var9 != null && var9.field4238 && var9.method1876(class556.field8280, (byte) -28)) {
            if (var9.field4250 != null) {
                int[] var10 = new int[var9.field4250.length];
                for (int var11 = 0; var10.length / 2 > var11; ++var11) {
                    int var13;
                    if (~class531.field7929 != -5) {
                        var13 = (int) class539.field8023 + class300.field4113 & 16383;
                    } else {
                        var13 = 16383 & (int) class539.field8023;
                    }
                    int var14 = class589.field8742[var13];
                    int var15 = class589.field8735[var13];
                    if (~class531.field7929 != -5) {
                        var15 = var15 * 256 / (class449.field6301 + 256);
                        var14 = var14 * 256 / (class449.field6301 + 256);
                    }
                    var10[var11 * 2] = arg1.field2527 / 2 + arg3 - -((var9.field4250[var11 * 2] * 4 + arg0) * var15 + (var9.field4250[var11 * 2 - -1] * 4 + arg7) * var14 >> 15);
                    var10[var11 * 2 - -1] = arg1.field2459 / 2 + -((var9.field4250[var11 * 2 + 1] * 4 + arg7) * var15 + -((var9.field4250[var11 * 2] * 4 + arg0) * var14) >> 15) + arg8;
                }
                class107.method797(arg2, var10, var9.field4259, arg1.field2401, arg1.field2551);
                for (int var12 = 0; ~(var10.length / 2 + -1) < ~var12; ++var12) {
                    arg2.method441(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 3], var9.field4215, 1, arg4, arg3, arg8);
                }
                arg2.method441(var10[var10.length + -2], var10[var10.length + -1], var10[0], var10[1], var9.field4215, 1, arg4, arg3, arg8);
            }
            class53 var16 = null;
            if (~var9.field4252 != 0) {
                var16 = var9.method1880((byte) -124, false, arg2);
                if (var16 != null) {
                    class440.method2558(arg1, arg0, arg4, arg8, var16, 11643, arg7, arg3);
                }
            }
            if (var9.field4235 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method318();
                }
                class92 var18 = class519.field7407;
                class352 var19 = class335.field4642;
                if (~var9.field4227 == -2) {
                    var18 = class465.field6539;
                    var19 = class643.field9365;
                }
                if (var9.field4227 == 2) {
                    var18 = class114.field1608;
                    var19 = class470.field6636;
                }
                class312.method1901(arg8, var9.field4251, arg7, arg1, arg0, arg3, arg6 ^ -73, arg4, var18, var17, var9.field4235, var19);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZB)V", line = 244)
    public final void method148(boolean arg0, byte arg1) {
        ++field4613;
        class384 var3 = super.field1984.method3114(31095);
        if (this.field4603 && var3 != null) {
            float var4 = (-Math.abs(super.field1984.field7800[1]) + 1.0F) * 2.0F + 1.0F;
            super.field1984.method3111(arg1 + 34070, 1);
            super.field1984.method3152(-2, var3);
            super.field1984.method3111(33984, 0);
            super.field1984.method3152(-2, this.field4616.field2121);
            long var5 = this.field4610.field575;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field1984.field7800[0], -super.field1984.field7800[1], -super.field1984.field7800[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field1984.field7840 * var4, super.field1984.field7828 * var4, super.field1984.field7865 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field1984.field7800[1]) * 928.0F + 64.0F);
            this.field4611 = true;
        }
        if (arg1 != -86) {
            field4618 = 110;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)Z", line = 292)
    public final boolean method149(int arg0) {
        if (arg0 > -36) {
            field4618 = -29;
        }
        ++field4608;
        return this.field4603;
    }
}
