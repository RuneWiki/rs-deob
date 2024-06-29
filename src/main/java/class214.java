import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class214 extends class203 {

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "Z")
    private boolean field2959 = false;

    @OriginalMember(owner = "client!afa", name = "p", descriptor = "Z")
    private boolean field2966 = false;

    @OriginalMember(owner = "client!afa", name = "q", descriptor = "Lsa;")
    private class780 field2967;

    @OriginalMember(owner = "client!afa", name = "m", descriptor = "Lon;")
    private class759 field2963;

    @OriginalMember(owner = "client!afa", name = "n", descriptor = "[I")
    public static int[] field2964 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!afa", name = "k", descriptor = "Lqk;")
    public static class1 field2961 = new class1(13, -1);

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!afa", name = "l", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!afa", name = "o", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!afa", name = "r", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!afa", name = "s", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
    public final void method686(int arg0) {
        if (this.field2959) {
            super.field2843.method1262(1, 0);
            super.field2843.method1219((byte) 78, (class539) null);
            super.field2843.method1262(0, 0);
            super.field2843.method1219((byte) 80, (class539) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2959 = false;
        }
        ++field2969;
        if (arg0 < 64) {
            field2961 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lpq;Lsa;)V")
    public class214(class194 arg0, class780 arg1) {
        super(arg0);
        this.field2967 = arg1;
        if (this.field2967.field10719 != null && super.field2843.field2663 && super.field2843.field2747) {
            class190 var3 = class342.method2171(35633, super.field2843, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 0);
            class190 var4 = class342.method2171(35632, super.field2843, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 0);
            this.field2963 = class792.method4336(new class190[] { var3, var4 }, 35716, super.field2843);
            this.field2966 = this.field2963 != null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(BZ)V")
    public final void method688(byte arg0, boolean arg1) {
        if (arg0 < -25) {
            ++field2965;
            class734 var3 = super.field2843.method1244(-127);
            if (this.field2966 && var3 != null) {
                float var4 = 2.0F * (1.0F - Math.abs(super.field2843.field2745[1])) + 1.0F;
                super.field2843.method1262(1, 0);
                super.field2843.method1219((byte) 124, var3);
                super.field2843.method1262(0, 0);
                super.field2843.method1219((byte) 81, this.field2967.field10719);
                long var5 = this.field2963.field10433;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field2843.field2745[0], -super.field2843.field2745[1], -super.field2843.field2745[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field2843.field2738 * var4, super.field2843.field2750 * var4, super.field2843.field2683 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field2843.field2745[1]) * 928.0F + 64.0F);
                this.field2959 = true;
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)Z")
    public final boolean method687(int arg0) {
        if (arg0 != -12) {
            this.field2967 = null;
        }
        ++field2962;
        return this.field2966;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method1342(byte arg0) {
        ++field2958;
        if (arg0 != -42) {
            return null;
        } else {
            return !class263.field3850 && class99.field1151 != null ? class99.field1151.field2180 : "";
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZLwha;)V")
    public final void method683(int arg0, boolean arg1, class539 arg2) {
        if (!arg1) {
            ++field2968;
            if (!this.field2959) {
                super.field2843.method1219((byte) 91, arg2);
                super.field2843.method1263(arg0, 117);
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIZ)V")
    public final void method682(int arg0, int arg1, boolean arg2) {
        if (this.field2959) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) (3 & arg0 >> 16) / 8.0F;
            float var8 = (float) (arg0 >> 19 & 15) / 16.0F;
            float var9 = (float) (15 & arg0 >> 23) / 16.0F;
            int var10 = (2083932025 & arg0) >> 27;
            long var11 = this.field2963.field10433;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field2843.field2614 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg2) {
            ++field2960;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZB)V")
    public final void method681(boolean arg0, byte arg1) {
        ++field2957;
        if (arg1 < 0) {
            field2964 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(B)V")
    public static void method1343(byte arg0) {
        field2961 = null;
        field2964 = null;
        int var1 = 8 / ((-44 - arg0) / 54);
    }
}
