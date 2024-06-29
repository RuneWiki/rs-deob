import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class568 extends class16 {

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "Z")
    private boolean field8047 = false;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "Z")
    private boolean field8056 = false;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "Lum;")
    private class479 field8059;

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "Llj;")
    private class555 field8049;

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "Lpr;")
    public static class407 field8048 = new class407(65, 2);

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "I")
    public static int field8060 = 0;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V", line = 3)
    public final void method48(byte arg0) {
        ++field8054;
        int var2 = -59 % ((arg0 - -29) / 51);
        if (this.field8056) {
            super.field141.method2380(1, (byte) -82);
            super.field141.method2388((byte) 114, (class412) null);
            super.field141.method2380(0, (byte) -70);
            super.field141.method2388((byte) -21, (class412) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8056 = false;
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lap;Lum;)V", line = 23)
    public class568(class435 arg0, class479 arg1) {
        super(arg0);
        this.field8059 = arg1;
        if (this.field8059.field7035 != null && super.field141.field6021 && super.field141.field5955) {
            class58 var3 = class182.method1062("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, (byte) -16, super.field141);
            class58 var4 = class182.method1062("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, (byte) -16, super.field141);
            this.field8049 = class596.method3341(-118, new class58[] { var3, var4 }, super.field141);
            this.field8047 = this.field8049 != null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIZ)V", line = 43)
    public final void method42(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method46((byte) -123, true);
        }
        ++field8057;
        if (this.field8056) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((58 & arg0) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            float var8 = (float) ((arg1 & 8083736) >> 19) / 16.0F;
            float var9 = (float) (15 & arg1 >> 23) / 16.0F;
            int var10 = arg1 >> 27 & 15;
            long var11 = this.field8049.field7904;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field141.field5926 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BZ)V", line = 82)
    public final void method46(byte arg0, boolean arg1) {
        if (arg0 == -61) {
            ++field8055;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZB)V", line = 95)
    public final void method50(boolean arg0, byte arg1) {
        ++field8050;
        class310 var3 = super.field141.method2394(46);
        if (arg1 == 42) {
            if (this.field8047 && var3 != null) {
                float var4 = 2.0F * (1.0F - Math.abs(super.field141.field6020[1])) + 1.0F;
                super.field141.method2380(1, (byte) -125);
                super.field141.method2388((byte) -58, var3);
                super.field141.method2380(0, (byte) -126);
                super.field141.method2388((byte) 97, this.field8059.field7035);
                long var5 = this.field8049.field7904;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field141.field6020[0], -super.field141.field6020[1], -super.field141.field6020[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field141.field6031 * var4, super.field141.field6004 * var4, super.field141.field5989 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field141.field6020[1]));
                this.field8056 = true;
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)I", line = 127)
    public static final int method3208(int arg0) {
        if (arg0 != 1) {
            return -60;
        } else {
            ++field8052;
            return class24.field299;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)Z", line = 138)
    public final boolean method52(int arg0) {
        ++field8058;
        return arg0 != 12733 ? true : this.field8047;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILuda;)V", line = 149)
    public final void method44(int arg0, int arg1, class412 arg2) {
        ++field8051;
        if (arg1 != -1) {
            this.method48((byte) 54);
        }
        if (!this.field8056) {
            super.field141.method2388((byte) 120, arg2);
            super.field141.method2396(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(Z)V", line = 179)
    public static void method3209(boolean arg0) {
        field8048 = null;
        if (!arg0) {
            method3208(-102);
        }
    }
}
