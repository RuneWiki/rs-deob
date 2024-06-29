import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class476 extends class229 {

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "Z")
    private boolean field6959 = false;

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "Z")
    private boolean field6969 = false;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "Lgo;")
    private class442 field6971;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "Led;")
    private class497 field6966;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
    public static int field6964 = 0;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field6965 = 0;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "[I")
    public static int[] field6956 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!lt", name = "x", descriptor = "Z")
    public static boolean field6973 = false;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "Lhv;")
    public static class359 field6960;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILao;)V", line = 3)
    public final void method22(int arg0, int arg1, class188 arg2) {
        ++field6962;
        if (!this.field6969) {
            super.field3194.method2412((byte) 4, arg2);
            super.field3194.method2365(true, arg1);
        }
        if (arg0 > -45) {
            this.field6959 = false;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 25)
    public final void method19(int arg0) {
        if (arg0 != 262144) {
            field6965 = -110;
        }
        ++field6972;
        if (this.field6969) {
            super.field3194.method2398(1, (byte) -18);
            super.field3194.method2412((byte) 4, (class188) null);
            super.field3194.method2398(0, (byte) 102);
            super.field3194.method2412((byte) 4, (class188) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6969 = false;
        }
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(III)V", line = 46)
    public final void method12(int arg0, int arg1, int arg2) {
        if (this.field6969) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            float var8 = (float) (arg2 >> 19 & 15) / 16.0F;
            float var9 = (float) ((arg2 & 129468399) >> 23) / 16.0F;
            int var10 = arg2 >> 27 & 15;
            long var11 = this.field6966.field7320;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field3194.field5863 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field6967;
        int var13 = -39 % ((arg1 - 13) / 46);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZI)V", line = 82)
    public final void method17(boolean arg0, int arg1) {
        ++field6968;
        if (arg1 != -27632) {
            field6973 = false;
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lht;Lgo;)V", line = 191)
    public class476(class410 arg0, class442 arg1) {
        super(arg0);
        this.field6971 = arg1;
        if (this.field6971.field6425 != null && super.field3194.field5907 && super.field3194.field5918) {
            class528 var3 = class516.method3030("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field3194, 35633, (byte) -68);
            class528 var4 = class516.method3030("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field3194, 35632, (byte) -93);
            this.field6966 = class441.method2631(super.field3194, new class528[] { var3, var4 }, 16);
            this.field6959 = this.field6966 != null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZZ)V", line = 97)
    public final void method20(boolean arg0, boolean arg1) {
        ++field6963;
        if (!arg0) {
            this.field6971 = null;
        }
        class7 var3 = super.field3194.method2370(5);
        if (this.field6959 && var3 != null) {
            float var4 = (-Math.abs(super.field3194.field5940[1]) + 1.0F) * 2.0F + 1.0F;
            super.field3194.method2398(1, (byte) -54);
            super.field3194.method2412((byte) 4, var3);
            super.field3194.method2398(0, (byte) 112);
            super.field3194.method2412((byte) 4, this.field6971.field6425);
            long var5 = this.field6966.field7320;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field3194.field5940[0], -super.field3194.field5940[1], -super.field3194.field5940[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field3194.field5959 * var4, super.field3194.field5906 * var4, super.field3194.field5997 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field3194.field5940[1]));
            this.field6969 = true;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)Z", line = 128)
    public final boolean method13(byte arg0) {
        if (arg0 <= 123) {
            field6956 = null;
        }
        ++field6957;
        return this.field6959;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V", line = 140)
    public static void method2800(int arg0) {
        int var1 = 118 % ((arg0 - -10) / 63);
        field6960 = null;
        field6956 = null;
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)V", line = 170)
    public static final void method2801(int arg0) {
        ++field6970;
        if (arg0 != -4230) {
            field6973 = false;
        }
        if (~class452.field6564.length() != -1) {
            class58.method376((byte) -126, "--> " + class452.field6564);
            class109.method701(-3, false, class452.field6564);
            class452.field6564 = "";
            class29.field436 = 0;
            class410.field5850 = 0;
        }
    }

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "(I)V", line = 209)
    public static final void method2802(int arg0) {
        if (field6960 != null) {
            field6960.method1987(arg0 ^ 16953);
        }
        ++field6961;
        if (class254.field3531 != null) {
            class254.field3531.method1987(arg0 + -15815);
        }
        if (arg0 != -634) {
            method2801(72);
        }
    }
}
