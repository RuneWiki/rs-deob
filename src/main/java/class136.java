import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class136 extends class249 {

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Z")
    private boolean field1824 = false;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Z")
    private boolean field1821 = false;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Ljga;")
    private class718 field1811;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lrv;")
    private class111 field1817;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1813 = 0;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Z")
    public static boolean field1814 = true;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "[I")
    public static int[] field1816;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)Lmi;", line = 4)
    public static final class497 method955(int arg0) {
        if (arg0 != 254484) {
            field1814 = true;
        }
        ++field1815;
        return class134.method948(1, arg0 + -254611);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZZ)V", line = 15)
    public final void method608(boolean arg0, boolean arg1) {
        if (!arg0) {
            field1816 = null;
        }
        ++field1812;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Z", line = 26)
    public final boolean method605(int arg0) {
        ++field1820;
        if (arg0 != 2) {
            method956((byte) 70);
        }
        return this.field1824;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lwh;Ljga;)V", line = 37)
    public class136(class148 arg0, class718 arg1) {
        super(arg0);
        this.field1811 = arg1;
        if (this.field1811.field10093 != null && super.field3613.field2249 && super.field3613.field2273) {
            class396 var3 = class758.method4225(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field3613, (byte) 120);
            class396 var4 = class758.method4225(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field3613, (byte) 114);
            this.field1817 = class734.method4132(new class396[] { var3, var4 }, super.field3613, 14964);
            this.field1824 = this.field1817 != null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 56)
    public final void method611(int arg0) {
        ++field1819;
        if (arg0 == 2) {
            if (this.field1821) {
                super.field3613.method1024(1, (byte) -11);
                super.field3613.method1088((class195) null, arg0 + -27751);
                super.field3613.method1024(0, (byte) -11);
                super.field3613.method1088((class195) null, arg0 ^ -27751);
                OpenGL.glUseProgramObjectARB(0L);
                this.field1821 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V", line = 93)
    public final void method610(int arg0, boolean arg1) {
        if (arg0 != 1) {
            method956((byte) -105);
        }
        ++field1823;
        class24 var3 = super.field3613.method1071(arg0 ^ -4);
        if (this.field1824 && var3 != null) {
            float var4 = 2.0F * (-Math.abs(super.field3613.field2269[1]) + 1.0F) + 1.0F;
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1088(var3, -27749);
            super.field3613.method1024(0, (byte) -11);
            super.field3613.method1088(this.field1811.field10093, -27749);
            long var5 = this.field1817.field1549;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field3613.field2269[0], -super.field3613.field2269[1], -super.field3613.field2269[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field3613.field2277 * var4, super.field3613.field2279 * var4, super.field3613.field2253 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field3613.field2269[1]));
            this.field1821 = true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 133)
    public static void method956(byte arg0) {
        field1816 = null;
        int var1 = 120 % ((arg0 - -18) / 51);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lme;ZI)V", line = 142)
    public final void method603(class195 arg0, boolean arg1, int arg2) {
        ++field1818;
        if (!arg1) {
            this.method611(-22);
        }
        if (!this.field1821) {
            super.field3613.method1088(arg0, -27749);
            super.field3613.method1066(arg2, 260);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V", line = 161)
    public final void method607(int arg0, int arg1, int arg2) {
        ++field1822;
        if (this.field1821) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((60 & arg0) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((254484 & arg2) >> 16) / 8.0F;
            float var8 = (float) ((arg2 & 8198783) >> 19) / 16.0F;
            float var9 = (float) ((arg2 & 127106738) >> 23) / 16.0F;
            int var10 = 15 & arg2 >> 27;
            long var11 = this.field1817.field1549;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field3613.field2167 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg1 != -13582) {
            this.field1821 = false;
        }
    }
}
