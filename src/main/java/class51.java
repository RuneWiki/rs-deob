import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class51 extends class159 {

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Z")
    private boolean field749 = false;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Z")
    private boolean field756 = false;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lcd;")
    private class23 field751;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lcba;")
    private class54 field746;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field750 = 0;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
    public static int[] field757 = new int[5];

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Lkr;")
    public static class602 field752 = new class602(54, -1);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "[Lro;")
    public static class526[] field758 = new class526[14];

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZII)V")
    public final void method367(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method373(true, (byte) 40);
        }
        ++field753;
        if (this.field756) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << ((arg1 & 60) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            long var8 = this.field746.field777;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2221.field9008 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwu;II)V")
    public final void method368(class559 arg0, int arg1, int arg2) {
        if (!this.field756) {
            super.field2221.method3681(arg0, 0);
            super.field2221.method3720(-26014, arg2);
        }
        ++field748;
        if (arg1 != 26264) {
            this.field756 = false;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public final void method369(byte arg0) {
        ++field747;
        if (arg0 >= -59) {
            this.method373(false, (byte) -75);
        }
        if (this.field756) {
            super.field2221.method3738((byte) -63, 1);
            super.field2221.method3681((class559) null, 0);
            super.field2221.method3738((byte) -63, 0);
            super.field2221.method3681((class559) null, 0);
            OpenGL.glUseProgramObjectARB(0L);
            this.field756 = false;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BZ)V")
    public final void method370(byte arg0, boolean arg1) {
        if (arg0 >= 88) {
            ++field755;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method371(int arg0) {
        field758 = null;
        field757 = null;
        if (arg0 <= 5) {
            field750 = 28;
        }
        field752 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Ldw;Lcd;)V")
    public class51(class664 arg0, class23 arg1) {
        super(arg0);
        this.field751 = arg1;
        if (this.field751.field283 != null && super.field2221.field9110 && super.field2221.field9058) {
            class193 var3 = class694.method3921(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 0, super.field2221);
            class193 var4 = class694.method3921(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 0, super.field2221);
            this.field746 = class651.method3644(new class193[] { var3, var4 }, super.field2221, (byte) 84);
            this.field749 = this.field746 != null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z")
    public final boolean method372(boolean arg0) {
        ++field754;
        if (!arg0) {
            this.method370((byte) 62, true);
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZB)V")
    public final void method373(boolean arg0, byte arg1) {
        if (arg1 >= -109) {
            field752 = null;
        }
        ++field745;
        class413 var3 = super.field2221.method3676(8);
        if (this.field749 && var3 != null) {
            super.field2221.method3738((byte) -63, 1);
            super.field2221.method3681(var3, 0);
            super.field2221.method3738((byte) -63, 0);
            super.field2221.method3681(this.field751.field283, 0);
            long var4 = this.field746.field777;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field2221.field9104[0], -super.field2221.field9104[1], -super.field2221.field9104[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field2221.field9107, super.field2221.field9077, super.field2221.field9080, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field2221.field9104[1]) * 928.0F);
            this.field756 = true;
        }
    }
}
