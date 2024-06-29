import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class337 extends class283 {

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Z")
    private boolean field4551 = false;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
    private boolean field4554 = false;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Ldja;")
    private class311 field4558;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Luj;")
    private class387 field4550;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Lo;")
    public static class29 field4552 = new class29();

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(III)Z", line = 11)
    public static final boolean method1998(int arg0, int arg1, int arg2) {
        ++field4553;
        if (arg1 != 544) {
            method1999(-28);
        }
        return ~(arg0 & 544) == -545 | (arg0 & 24) != 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lcu;ZI)V", line = 22)
    public final void method140(class221 arg0, boolean arg1, int arg2) {
        ++field4559;
        if (!this.field4551) {
            super.field3749.method3006(1, arg0);
            super.field3749.method3039(260, arg2);
        }
        if (arg1) {
            this.field4558 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lac;Ldja;)V", line = 39)
    public class337(class541 arg0, class311 arg1) {
        super(arg0);
        this.field4558 = arg1;
        if (this.field4558.field4204 != null && super.field3749.field7610 && super.field3749.field7658) {
            class580 var3 = class754.method4195(35633, super.field3749, false, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class580 var4 = class754.method4195(35632, super.field3749, false, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field4550 = class713.method3993(super.field3749, new class580[] { var3, var4 }, true);
            this.field4554 = this.field4550 != null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 57)
    public final void method144(byte arg0) {
        if (arg0 >= 25) {
            if (this.field4551) {
                super.field3749.method2988(1, 847872872);
                super.field3749.method3006(1, (class221) null);
                super.field3749.method2988(0, 847872872);
                super.field3749.method3006(1, (class221) null);
                OpenGL.glUseProgramObjectARB(0L);
                this.field4551 = false;
            }
            ++field4560;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V", line = 78)
    public final void method142(boolean arg0, int arg1) {
        ++field4549;
        if (arg1 != 255) {
            this.field4551 = false;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZZ)V", line = 94)
    public final void method141(boolean arg0, boolean arg1) {
        if (!arg0) {
            ++field4557;
            class132 var3 = super.field3749.method2970(-122);
            if (this.field4554 && var3 != null) {
                float var4 = 2.0F * (1.0F - Math.abs(super.field3749.field7649[1])) + 1.0F;
                super.field3749.method2988(1, 847872872);
                super.field3749.method3006(1, var3);
                super.field3749.method2988(0, 847872872);
                super.field3749.method3006(1, this.field4558.field4204);
                long var5 = this.field4550.field5459;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field3749.field7649[0], -super.field3749.field7649[1], -super.field3749.field7649[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field3749.field7644 * var4, super.field3749.field7631 * var4, super.field3749.field7669 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field3749.field7649[1]));
                this.field4551 = true;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)Z", line = 126)
    public final boolean method138(int arg0) {
        ++field4556;
        return arg0 != 31565 ? true : this.field4554;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V", line = 140)
    public final void method137(int arg0, int arg1, int arg2) {
        if (this.field4551) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) ((arg1 & 229040) >> 16) / 8.0F;
            float var8 = (float) (15 & arg1 >> 19) / 16.0F;
            float var9 = (float) (15 & arg1 >> 23) / 16.0F;
            int var10 = (2140876324 & arg1) >> 27;
            long var11 = this.field4550.field5459;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field3749.field7532 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field4555;
        if (arg2 >= -2) {
            field4552 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 176)
    public static void method1999(int arg0) {
        field4552 = null;
        if (arg0 != 928) {
            method1999(84);
        }
    }
}
