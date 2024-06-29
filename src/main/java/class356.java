import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class356 extends class283 {

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Z")
    private boolean field5259 = false;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Z")
    private boolean field5258 = false;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Lrb;")
    private class401 field5254;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Ldc;")
    private class62 field5253;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "[Ljf;")
    public static class638[] field5256;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
    public static void method2266(int arg0) {
        if (arg0 != 675442595) {
            method2266(26);
        }
        field5256 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lou;II)V")
    public final void method75(class158 arg0, int arg1, int arg2) {
        ++field5261;
        if (arg1 == 2) {
            if (!this.field5259) {
                super.field3958.method2164(6, arg0);
                super.field3958.method2120(arg2, 104);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)V")
    public final void method73(boolean arg0, int arg1) {
        if (arg1 != 2) {
            method2266(83);
        }
        ++field5252;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public final void method74(byte arg0) {
        if (this.field5259) {
            super.field3958.method2171(114, 1);
            super.field3958.method2164(6, (class158) null);
            super.field3958.method2171(111, 0);
            super.field3958.method2164(6, (class158) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5259 = false;
        }
        ++field5251;
        if (arg0 != 85) {
            field5256 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lkw;Lrb;)V")
    public class356(class346 arg0, class401 arg1) {
        super(arg0);
        this.field5254 = arg1;
        if (this.field5254.field5737 != null && super.field3958.field5100 && super.field3958.field5052) {
            class716 var3 = class535.method3235(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 221, super.field3958);
            class716 var4 = class535.method3235(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 221, super.field3958);
            this.field5253 = class660.method3768(super.field3958, 35716, new class716[] { var3, var4 });
            this.field5258 = this.field5253 != null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII)V")
    public final void method79(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method73(false, 72);
        }
        ++field5260;
        if (this.field5259) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << (arg2 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            float var8 = (float) (arg1 >> 19 & 15) / 16.0F;
            float var9 = (float) ((arg1 & 129907642) >> 23) / 16.0F;
            int var10 = (2092232528 & arg1) >> 27;
            long var11 = this.field5253.field1002;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field3958.field4973 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        ++field5255;
        if (arg0 < 96) {
            method2266(-52);
        }
        return this.field5258;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        if (arg0 == -938) {
            ++field5257;
            class96 var3 = super.field3958.method2150(106);
            if (this.field5258 && var3 != null) {
                float var4 = 2.0F * (-Math.abs(super.field3958.field5111[1]) + 1.0F) + 1.0F;
                super.field3958.method2171(117, 1);
                super.field3958.method2164(6, var3);
                super.field3958.method2171(arg0 + 1063, 0);
                super.field3958.method2164(6, this.field5254.field5737);
                long var5 = this.field5253.field1002;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field3958.field5111[0], -super.field3958.field5111[1], -super.field3958.field5111[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field3958.field5092 * var4, super.field3958.field5029 * var4, super.field3958.field5077 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field3958.field5111[1]) * 928.0F + 64.0F);
                this.field5259 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
    public static final void method2267(int arg0, byte arg1) {
        ++field5262;
        class503 var2 = class512.method3112(17, arg0, 0);
        var2.method3074(-117);
        int var3 = 78 / ((arg1 - -56) / 55);
    }
}
