import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class356 extends class398 {

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "Z")
    private boolean field5265 = false;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "Z")
    private boolean field5271 = false;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "Lal;")
    private class170 field5264;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "Lnba;")
    private class566 field5262;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field5260 = 1;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "[F")
    public static float[] field5261 = new float[4];

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "I")
    public static int field5266 = 0;

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "I")
    public static int field5273 = 0;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "Z")
    public static boolean field5267;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBI)V")
    public final void method86(int arg0, byte arg1, int arg2) {
        if (arg1 != 82) {
            this.method91(true, 114);
        }
        if (this.field5265) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << ((arg2 & 58) >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) (arg0 >> 16 & 3) / 8.0F;
            float var8 = (float) (15 & arg0 >> 19) / 16.0F;
            float var9 = (float) (15 & arg0 >> 23) / 16.0F;
            int var10 = arg0 >> 27 & 15;
            long var11 = this.field5262.field8262;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field6009.field4020 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field5269;
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
    public final void method92(int arg0) {
        if (arg0 != 512) {
            field5273 = 126;
        }
        ++field5272;
        if (this.field5265) {
            super.field6009.method1745(true, 1);
            super.field6009.method1709((byte) -48, (class517) null);
            super.field6009.method1745(true, 0);
            super.field6009.method1709((byte) -125, (class517) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5265 = false;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Luca;Lal;)V")
    public class356(class287 arg0, class170 arg1) {
        super(arg0);
        this.field5264 = arg1;
        if (this.field5264.field2404 != null && super.field6009.field4074 && super.field6009.field4099) {
            class129 var3 = class94.method592((byte) -36, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field6009, 35633);
            class129 var4 = class94.method592((byte) -41, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field6009, 35632);
            this.field5262 = class410.method2516(27, new class129[] { var3, var4 }, super.field6009);
            this.field5271 = this.field5262 != null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)Z")
    public final boolean method87(int arg0) {
        ++field5263;
        if (arg0 != 3) {
            this.method93(73, (class517) null, (byte) 14);
        }
        return this.field5271;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZ)V")
    public final void method94(int arg0, boolean arg1) {
        ++field5259;
        if (arg0 != 0) {
            this.method93(52, (class517) null, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZI)V")
    public final void method91(boolean arg0, int arg1) {
        ++field5270;
        if (arg1 == -5191) {
            class364 var3 = super.field6009.method1698((byte) -29);
            if (this.field5271 && var3 != null) {
                float var4 = (1.0F - Math.abs(super.field6009.field4149[1])) * 2.0F + 1.0F;
                super.field6009.method1745(true, 1);
                super.field6009.method1709((byte) -110, var3);
                super.field6009.method1745(true, 0);
                super.field6009.method1709((byte) -71, this.field5264.field2404);
                long var5 = this.field5262.field8262;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field6009.field4149[0], -super.field6009.field4149[1], -super.field6009.field4149[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field6009.field4088 * var4, super.field6009.field4072 * var4, super.field6009.field4061 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field6009.field4149[1]) * 928.0F + 64.0F);
                this.field5265 = true;
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILvaa;B)V")
    public final void method93(int arg0, class517 arg1, byte arg2) {
        ++field5268;
        if (!this.field5265) {
            super.field6009.method1709((byte) -100, arg1);
            super.field6009.method1751(arg0, 21575);
        }
        int var4 = -128 % ((arg2 - 76) / 41);
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V")
    public static void method2199(int arg0) {
        if (arg0 != -473338320) {
            field5260 = -81;
        }
        field5261 = null;
    }
}
