import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class638 extends class592 {

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Z")
    private boolean field8877 = false;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "Z")
    private boolean field8887 = false;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "Lpm;")
    private class553 field8886;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "Lhq;")
    private class47 field8885;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "[I")
    public static int[] field8888 = new int[14];

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "[I")
    public static int[] field8880 = new int[25];

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZB)V")
    public final void method27(boolean arg0, byte arg1) {
        ++field8878;
        if (arg1 >= -67) {
            field8880 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V")
    public final void method32(int arg0, boolean arg1) {
        if (arg0 != -1) {
            this.method32(92, false);
        }
        ++field8883;
        class660 var3 = super.field8014.method3447((byte) 98);
        if (this.field8887 && var3 != null) {
            float var4 = 1.0F + 2.0F * (-Math.abs(super.field8014.field8645[1]) + 1.0F);
            super.field8014.method3469(1, false);
            super.field8014.method3388(var3, false);
            super.field8014.method3469(0, false);
            super.field8014.method3388(this.field8886.field7237, false);
            long var5 = this.field8885.field667;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field8014.field8645[0], -super.field8014.field8645[1], -super.field8014.field8645[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field8014.field8616 * var4, super.field8014.field8646 * var4, super.field8014.field8661 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field8014.field8645[1]) * 928.0F + 64.0F);
            this.field8877 = true;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method3522(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field8882;
        char[] var4 = new char[arg1];
        int var5 = 0;
        if (arg2 < 76) {
            method3522((byte[]) null, -32, 122, -33);
        }
        for (int var6 = 0; arg1 > var6; ++var6) {
            int var7 = arg0[arg3 + var6] & 255;
            if (var7 != 0) {
                if (~var7 <= -129 && ~var7 > -161) {
                    char var8 = class578.field7885[var7 + -128];
                    if (~var8 == -1) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
    public static void method3523(byte arg0) {
        field8880 = null;
        if (arg0 <= 81) {
            method3522((byte[]) null, -116, 95, -77);
        }
        field8888 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZII)V")
    public final void method33(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            ++field8879;
            if (this.field8877) {
                int var4 = 1 << (3 & arg1);
                float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
                int var6 = 65535 & arg2;
                float var7 = (float) (3 & arg2 >> 16) / 8.0F;
                float var8 = (float) ((arg2 & 8245045) >> 19) / 16.0F;
                float var9 = (float) ((129005425 & arg2) >> 23) / 16.0F;
                int var10 = (arg2 & 2043198686) >> 27;
                long var11 = this.field8885.field667;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field8014.field8566 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public final void method29(int arg0) {
        if (arg0 != -1640) {
            this.field8885 = null;
        }
        if (this.field8877) {
            super.field8014.method3469(1, false);
            super.field8014.method3388((class710) null, false);
            super.field8014.method3469(0, false);
            super.field8014.method3388((class710) null, false);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8877 = false;
        }
        ++field8889;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)Z")
    public final boolean method30(byte arg0) {
        if (arg0 > -90) {
            return false;
        } else {
            ++field8884;
            return this.field8887;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lji;Lpm;)V")
    public class638(class622 arg0, class553 arg1) {
        super(arg0);
        this.field8886 = arg1;
        if (this.field8886.field7237 != null && super.field8014.field8625 && super.field8014.field8614) {
            class238 var3 = class648.method3566(35633, -125, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field8014);
            class238 var4 = class648.method3566(35632, -116, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field8014);
            this.field8885 = class149.method1098(new class238[] { var3, var4 }, super.field8014, (byte) 15);
            this.field8887 = this.field8885 != null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILgq;)V")
    public final void method35(int arg0, int arg1, class710 arg2) {
        if (!this.field8877) {
            super.field8014.method3388(arg2, false);
            super.field8014.method3443(arg0, true);
        }
        ++field8876;
        if (arg1 != 458752) {
            this.field8885 = null;
        }
    }
}
