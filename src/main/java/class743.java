import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class743 extends class402 {

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "Z")
    private boolean field10351 = false;

    @OriginalMember(owner = "client!nea", name = "j", descriptor = "Z")
    private boolean field10354 = false;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "Lod;")
    private class533 field10350;

    @OriginalMember(owner = "client!nea", name = "o", descriptor = "Lpq;")
    private class207 field10359;

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
    public static int field10348;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
    public static int field10349;

    @OriginalMember(owner = "client!nea", name = "h", descriptor = "I")
    public static int field10352;

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "I")
    public static int field10353;

    @OriginalMember(owner = "client!nea", name = "k", descriptor = "I")
    public static int field10355;

    @OriginalMember(owner = "client!nea", name = "l", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!nea", name = "m", descriptor = "I")
    public static int field10357;

    @OriginalMember(owner = "client!nea", name = "n", descriptor = "I")
    public static int field10358;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method178(byte arg0) {
        ++field10348;
        if (arg0 > -55) {
            this.method180(127, (byte) 53, (class400) null);
        }
        return this.field10351;
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lpc;Lod;)V", line = 150)
    public class743(class700 arg0, class533 arg1) {
        super(arg0);
        this.field10350 = arg1;
        if (this.field10350.field7507 != null && super.field5243.field9774 && super.field5243.field9768) {
            class426 var3 = class253.method1506(-1, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field5243);
            class426 var4 = class253.method1506(-1, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field5243);
            this.field10359 = class89.method810(new class426[] { var3, var4 }, super.field5243, (byte) 0);
            this.field10351 = this.field10359 != null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V", line = 24)
    public final void method181(int arg0) {
        if (arg0 != -1) {
            field10349 = 108;
        }
        if (this.field10354) {
            super.field5243.method3925((byte) -100, 1);
            super.field5243.method3936(false, (class400) null);
            super.field5243.method3925((byte) 71, 0);
            super.field5243.method3936(false, (class400) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field10354 = false;
        }
        ++field10358;
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(IZ)V", line = 45)
    public final void method184(int arg0, boolean arg1) {
        if (arg0 != 64) {
            field10352 = 101;
        }
        ++field10353;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IBLfha;)V", line = 56)
    public final void method180(int arg0, byte arg1, class400 arg2) {
        if (arg1 >= -103) {
            this.field10350 = null;
        }
        if (!this.field10354) {
            super.field5243.method3936(false, arg2);
            super.field5243.method3932(arg0, (byte) -113);
        }
        ++field10355;
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(IZ)V", line = 76)
    public final void method176(int arg0, boolean arg1) {
        ++field10357;
        class331 var3 = super.field5243.method3962(3);
        if (this.field10351 && var3 != null) {
            float var4 = (1.0F - Math.abs(super.field5243.field9869[1])) * 2.0F + 1.0F;
            super.field5243.method3925((byte) 29, 1);
            super.field5243.method3936(false, var3);
            super.field5243.method3925((byte) -96, 0);
            super.field5243.method3936(false, this.field10350.field7507);
            long var5 = this.field10359.field2457;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field5243.field9869[0], -super.field5243.field9869[1], -super.field5243.field9869[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field5243.field9781 * var4, super.field5243.field9857 * var4, super.field5243.field9813 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + Math.abs(super.field5243.field9869[1]) * 928.0F);
            this.field10354 = true;
        }
        if (arg0 > -32) {
            this.method180(-32, (byte) -99, (class400) null);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V", line = 108)
    public final void method183(int arg0, int arg1, int arg2) {
        if (this.field10354) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((arg2 & 202353) >> 16) / 8.0F;
            float var8 = (float) ((arg2 & 8088898) >> 19) / 16.0F;
            float var9 = (float) ((131024959 & arg2) >> 23) / 16.0F;
            int var10 = (arg2 & 2126058929) >> 27;
            long var11 = this.field10359.field2457;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field5243.field9726 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg0 != 64) {
            this.field10351 = false;
        }
        ++field10356;
    }
}
