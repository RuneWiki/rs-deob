import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class242 extends class297 {

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "Z")
    private boolean field3233 = false;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "Z")
    private boolean field3234 = false;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "Lri;")
    private class73 field3238;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "Leu;")
    private class333 field3231;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "[Ldb;")
    public static class210[] field3235 = new class210[128];

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "[I")
    public static int[] field3229;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "[Lcv;")
    public static class398[] field3236;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZII)V", line = 4)
    public final void method245(boolean arg0, int arg1, int arg2) {
        ++field3237;
        if (this.field3234) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << ((58 & arg2) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            long var8 = this.field3231.field4375;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field3881.field7404 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (!arg0) {
            this.method245(false, -22, -60);
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lbo;Lri;)V", line = 34)
    public class242(class511 arg0, class73 arg1) {
        super(arg0);
        this.field3238 = arg1;
        if (this.field3238.field1099 != null && super.field3881.field7440 && super.field3881.field7429) {
            class191 var3 = class258.method1561("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35716, super.field3881, 35633);
            class191 var4 = class258.method1561("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35716, super.field3881, 35632);
            this.field3231 = class47.method335(super.field3881, new class191[] { var3, var4 }, true);
            this.field3233 = this.field3231 != null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 54)
    public final void method246(int arg0) {
        if (arg0 != 6) {
            this.field3238 = null;
        }
        ++field3242;
        if (this.field3234) {
            super.field3881.method3003(1, 3);
            super.field3881.method2980((class501) null, 115);
            super.field3881.method3003(0, 50);
            super.field3881.method2980((class501) null, arg0 ^ 106);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3234 = false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 76)
    public static void method1487(int arg0) {
        field3235 = null;
        if (arg0 == 0) {
            field3236 = null;
            field3229 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Z", line = 89)
    public final boolean method240(boolean arg0) {
        if (arg0) {
            field3236 = null;
        }
        ++field3230;
        return false;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V", line = 100)
    public final void method244(int arg0, boolean arg1) {
        ++field3241;
        class336 var3 = super.field3881.method2936(arg0);
        if (this.field3233 && var3 != null) {
            super.field3881.method3003(1, 127);
            super.field3881.method2980(var3, arg0 + 116);
            super.field3881.method3003(0, 29);
            super.field3881.method2980(this.field3238.field1099, 110);
            long var4 = this.field3231.field4375;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field3881.field7463[0], -super.field3881.field7463[1], -super.field3881.field7463[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3881.field7518, super.field3881.field7499, super.field3881.field7496, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field3881.field7463[1]) * 928.0F);
            this.field3234 = true;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lnk;II)V", line = 141)
    public final void method248(class501 arg0, int arg1, int arg2) {
        if (!this.field3234) {
            super.field3881.method2980(arg0, 120);
            super.field3881.method2976((byte) 59, arg2);
        }
        ++field3240;
        if (arg1 != 0) {
            this.method244(38, false);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)V", line = 158)
    public final void method241(boolean arg0, int arg1) {
        ++field3232;
        if (arg1 != -30965) {
            this.method240(true);
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V", line = 168)
    public static final void method1488(byte arg0) {
        if (arg0 != 81) {
            field3229 = null;
        }
        if (class487.field6768 != null) {
            class487.field6768.method2475(18298);
        }
        ++field3239;
        if (class322.field4216 != null) {
            class322.field4216.method2475(arg0 + 18217);
        }
    }
}
