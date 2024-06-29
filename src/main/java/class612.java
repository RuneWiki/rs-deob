import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class612 extends class209 {

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "Z")
    private boolean field8805 = false;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Z")
    private boolean field8796 = false;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Lln;")
    private class94 field8803;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Lqca;")
    private class610 field8794;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "Lg;")
    public static class513 field8806;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "F")
    public static float field8798;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Lbv;")
    public static class568 field8795;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
    public static void method3498(int arg0) {
        if (arg0 != -18208) {
            field8806 = null;
        }
        field8806 = null;
        field8795 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        if (!arg0) {
            field8804 = -7;
        }
        ++field8797;
        return this.field8796;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Luq;Lln;)V")
    public class612(class313 arg0, class94 arg1) {
        super(arg0);
        this.field8803 = arg1;
        if (this.field8803.field1241 != null && super.field2710.field4299 && super.field2710.field4274) {
            class364 var3 = class579.method3253("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field2710, 35633, false);
            class364 var4 = class579.method3253("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field2710, 35632, false);
            this.field8794 = class643.method3710(super.field2710, 80, new class364[] { var3, var4 });
            this.field8796 = this.field8794 != null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lea;IZ)V")
    public final void method44(class148 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field8794 = null;
        }
        if (!this.field8805) {
            super.field2710.method1884(arg0, -2);
            super.field2710.method1909(-107, arg1);
        }
        ++field8802;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (this.field8805) {
            super.field2710.method1966(3000, 1);
            super.field2710.method1884((class148) null, arg0 + -1);
            super.field2710.method1966(3000, 0);
            super.field2710.method1884((class148) null, -2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8805 = false;
        }
        if (arg0 == -1) {
            ++field8807;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZB)V")
    public final void method47(boolean arg0, byte arg1) {
        ++field8801;
        class415 var3 = super.field2710.method1929((byte) -43);
        if (this.field8796 && var3 != null) {
            float var4 = 1.0F + 2.0F * (-Math.abs(super.field2710.field4284[1]) + 1.0F);
            super.field2710.method1966(3000, 1);
            super.field2710.method1884(var3, -2);
            super.field2710.method1966(3000, 0);
            super.field2710.method1884(this.field8803.field1241, -2);
            long var5 = this.field8794.field8770;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field2710.field4284[0], -super.field2710.field4284[1], -super.field2710.field4284[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field2710.field4312 * var4, super.field2710.field4235 * var4, super.field2710.field4252 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field2710.field4284[1]) * 928.0F + 64.0F);
            this.field8805 = true;
        }
        if (arg1 < 88) {
            field8806 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(ZB)V")
    public final void method48(boolean arg0, byte arg1) {
        if (arg1 >= 122) {
            ++field8799;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
    public final void method45(int arg0, int arg1, int arg2) {
        if (arg2 >= -75) {
            field8798 = -0.78301203F;
        }
        if (this.field8805) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((arg0 & 57) >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) ((arg1 & 211007) >> 16) / 8.0F;
            float var8 = (float) (arg1 >> 19 & 15) / 16.0F;
            float var9 = (float) ((arg1 & 126423307) >> 23) / 16.0F;
            int var10 = (arg1 & 2030610219) >> 27;
            long var11 = this.field8794.field8770;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field2710.field4198 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field8800;
    }

    static {
        new class344("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field8806 = new class513("runescape", 0);
    }
}
