import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class355 extends class366 {

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "Z")
    private boolean field5372 = false;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "Z")
    private boolean field5379 = false;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "Lpe;")
    private class430 field5368;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "Lv;")
    private class406 field5371;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "S")
    public static short field5370 = 1;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "[I")
    public static int[] field5367 = new int[13];

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Z")
    public static boolean field5378 = false;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZZ)V", line = 8)
    public final void method7(boolean arg0, boolean arg1) {
        ++field5373;
        if (!arg0) {
            this.field5372 = false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z", line = 18)
    public final boolean method9(int arg0) {
        ++field5375;
        if (arg0 <= 21) {
            this.method1(-49);
        }
        return this.field5372;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V", line = 34)
    public final void method1(int arg0) {
        ++field5377;
        if (this.field5379) {
            super.field5494.method2030(1, (byte) -120);
            super.field5494.method2042((class440) null, 0);
            super.field5494.method2030(0, (byte) -127);
            super.field5494.method2042((class440) null, 0);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5379 = false;
        }
        if (arg0 <= 2) {
            field5367 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lqg;Lpe;)V", line = 55)
    public class355(class321 arg0, class430 arg1) {
        super(arg0);
        this.field5368 = arg1;
        if (this.field5368.field6268 != null && super.field5494.field4901 && super.field5494.field4831) {
            class279 var3 = class523.method3087(22476, 35633, super.field5494, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class279 var4 = class523.method3087(22476, 35632, super.field5494, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field5371 = class410.method2538(1357486177, super.field5494, new class279[] { var3, var4 });
            this.field5372 = this.field5371 != null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZI)V", line = 74)
    public final void method5(boolean arg0, int arg1) {
        int var3 = -99 % ((10 - arg1) / 48);
        ++field5369;
        class329 var4 = super.field5494.method2089(true);
        if (this.field5372 && var4 != null) {
            float var5 = 1.0F + (-Math.abs(super.field5494.field4859[1]) + 1.0F) * 2.0F;
            super.field5494.method2030(1, (byte) -125);
            super.field5494.method2042(var4, 0);
            super.field5494.method2030(0, (byte) -6);
            super.field5494.method2042(this.field5368.field6268, 0);
            long var6 = this.field5371.field5973;
            OpenGL.glUseProgramObjectARB(var6);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var6, "sunDir"), -super.field5494.field4859[0], -super.field5494.field4859[1], -super.field5494.field4859[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var6, "sunColour"), super.field5494.field4825 * var5, super.field5494.field4892 * var5, super.field5494.field4838 * var5, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var6, "sunExponent"), 64.0F + Math.abs(super.field5494.field4859[1]) * 928.0F);
            this.field5379 = true;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)V", line = 106)
    public final void method8(int arg0, int arg1, byte arg2) {
        ++field5374;
        if (this.field5379) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((arg0 & 258307) >> 16) / 8.0F;
            float var8 = (float) (arg0 >> 19 & 15) / 16.0F;
            float var9 = (float) ((132444090 & arg0) >> 23) / 16.0F;
            int var10 = (2085070688 & arg0) >> 27;
            long var11 = this.field5371.field5973;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field5494.field4781 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg2 < 18) {
            this.method8(82, 113, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V", line = 150)
    public static void method2294(int arg0) {
        field5367 = null;
        if (arg0 != 65535) {
            field5370 = 42;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILgo;B)V", line = 164)
    public final void method6(int arg0, class440 arg1, byte arg2) {
        ++field5376;
        int var4 = 14 / ((arg2 - 31) / 59);
        if (!this.field5379) {
            super.field5494.method2042(arg1, 0);
            super.field5494.method2068(arg0, 13134);
        }
    }
}
