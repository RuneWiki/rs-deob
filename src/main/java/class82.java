import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class82 extends class387 {

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "Z")
    private boolean field985 = false;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "Z")
    private boolean field986 = false;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "Llba;")
    private class550 field992;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "Lnfa;")
    private class680 field990;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field991 = 0;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "[Lrs;")
    public static class653[] field989;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BILiga;)V")
    public final void method638(byte arg0, int arg1, class460 arg2) {
        if (!this.field985) {
            super.field5405.method3639(-2, arg2);
            super.field5405.method3631((byte) 115, arg1);
        }
        ++field982;
        if (arg0 < 53) {
            method642(-74);
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lrda;Llba;)V")
    public class82(class663 arg0, class550 arg1) {
        super(arg0);
        this.field992 = arg1;
        if (this.field992.field7259 != null && super.field5405.field9085 && super.field5405.field9079) {
            class551 var3 = class380.method2244(4, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.field5405);
            class551 var4 = class380.method2244(4, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, super.field5405);
            this.field990 = class373.method2186(super.field5405, new class551[] { var3, var4 }, -91);
            this.field986 = this.field990 != null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BZ)V")
    public final void method639(byte arg0, boolean arg1) {
        if (arg0 >= -123) {
            field989 = null;
        }
        ++field988;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZB)V")
    public final void method640(boolean arg0, byte arg1) {
        ++field987;
        class444 var3 = super.field5405.method3625(1);
        if (this.field986 && var3 != null) {
            float var4 = 2.0F * (-Math.abs(super.field5405.field8987[1]) + 1.0F) + 1.0F;
            super.field5405.method3630(true, 1);
            super.field5405.method3639(-2, var3);
            super.field5405.method3630(true, 0);
            super.field5405.method3639(-2, this.field992.field7259);
            long var5 = this.field990.field9499;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field5405.field8987[0], -super.field5405.field8987[1], -super.field5405.field8987[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field5405.field9033 * var4, super.field5405.field9016 * var4, super.field5405.field9042 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field5405.field8987[1]) + 64.0F);
            this.field985 = true;
        }
        if (arg1 <= 1) {
            this.method643(-119, -124, -61);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)Z")
    public final boolean method641(int arg0) {
        if (arg0 != -16777216) {
            return true;
        } else {
            ++field983;
            return this.field986;
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
    public static void method642(int arg0) {
        field989 = null;
        if (arg0 != 3344) {
            method642(-11);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V")
    public final void method643(int arg0, int arg1, int arg2) {
        ++field981;
        int var4 = 68 / ((arg2 - 74) / 36);
        if (this.field985) {
            int var5 = 1 << (arg0 & 3);
            float var6 = (float) (1 << ((arg0 & 59) >> 3)) / 32.0F;
            int var7 = 65535 & arg1;
            float var8 = (float) (arg1 >> 16 & 3) / 8.0F;
            float var9 = (float) (15 & arg1 >> 19) / 16.0F;
            float var10 = (float) (arg1 >> 23 & 15) / 16.0F;
            int var11 = (arg1 & 2056977350) >> 27;
            long var12 = this.field990.field9499;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "time"), (float) (super.field5405.field8949 * var5 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "scale"), var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "breakWaterDepth"), (float) var7);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "breakWaterOffset"), var8);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var12, "waveIntensity"), var10, var9);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "waveExponent"), (float) var11);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
    public final void method644(boolean arg0) {
        if (arg0) {
            this.method644(true);
        }
        ++field984;
        if (this.field985) {
            super.field5405.method3630(true, 1);
            super.field5405.method3639(-2, (class460) null);
            super.field5405.method3630(true, 0);
            super.field5405.method3639(-2, (class460) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field985 = false;
        }
    }
}
