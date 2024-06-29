import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class415 extends class283 {

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Z")
    private boolean field5867 = false;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Z")
    private boolean field5865 = false;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Ldja;")
    private class311 field5858;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Luj;")
    private class387 field5861;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "[I")
    public static int[] field5859 = new int[256];

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "F")
    public static float field5868;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lcu;ZI)V")
    public final void method140(class221 arg0, boolean arg1, int arg2) {
        ++field5863;
        if (!this.field5865) {
            super.field3749.method3006(1, arg0);
            super.field3749.method3039(260, arg2);
        }
        if (arg1) {
            this.field5867 = false;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lac;Ldja;)V")
    public class415(class541 arg0, class311 arg1) {
        super(arg0);
        this.field5858 = arg1;
        if (this.field5858.field4204 != null && super.field3749.field7610 && super.field3749.field7658) {
            class580 var3 = class754.method4195(35633, super.field3749, false, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class580 var4 = class754.method4195(35632, super.field3749, false, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field5861 = class713.method3993(super.field3749, new class580[] { var3, var4 }, true);
            this.field5867 = this.field5861 != null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    public static void method2393(int arg0) {
        field5859 = null;
        if (arg0 != 23777) {
            method2393(68);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Z")
    public final boolean method138(int arg0) {
        if (arg0 != 31565) {
            this.method140((class221) null, false, -85);
        }
        ++field5857;
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
    public final void method137(int arg0, int arg1, int arg2) {
        ++field5862;
        if (this.field5865) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) ((arg1 & 223063) >> 16) / 8.0F;
            long var8 = this.field5861.field5459;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field3749.field7532 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg2 >= -2) {
            this.method138(120);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZZ)V")
    public final void method141(boolean arg0, boolean arg1) {
        if (!arg0) {
            ++field5869;
            class132 var3 = super.field3749.method2970(-125);
            if (this.field5867 && var3 != null) {
                super.field3749.method2988(1, 847872872);
                super.field3749.method3006(1, var3);
                super.field3749.method2988(0, 847872872);
                super.field3749.method3006(1, this.field5858.field4204);
                long var4 = this.field5861.field5459;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field3749.field7649[0], -super.field3749.field7649[1], -super.field3749.field7649[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3749.field7644, super.field3749.field7631, super.field3749.field7669, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field3749.field7649[1]) * 928.0F + 96.0F);
                this.field5865 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)V")
    public final void method142(boolean arg0, int arg1) {
        if (arg1 != 255) {
            method2393(-19);
        }
        ++field5866;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public final void method144(byte arg0) {
        if (this.field5865) {
            super.field3749.method2988(1, 847872872);
            super.field3749.method3006(1, (class221) null);
            super.field3749.method2988(0, 847872872);
            super.field3749.method3006(1, (class221) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5865 = false;
        }
        ++field5864;
        if (arg0 <= 25) {
            this.method138(-51);
        }
    }
}
