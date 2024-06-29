import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class460 {

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Z")
    private boolean field40 = false;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Z")
    private boolean field34 = false;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Ldk;")
    private class477 field44;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lsh;")
    private class65 field35;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field41 = 0;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "F")
    public static float field37;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "F")
    public static float field45;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lq;")
    public static class396 field39;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method13(boolean arg0, int arg1) {
        if (arg1 != -32460) {
            method14(105);
        }
        ++field42;
        class51 var3 = super.field5744.method3187((byte) -40);
        if (this.field34 && var3 != null) {
            super.field5744.method3126(1, arg1 + 32397);
            super.field5744.method3194((byte) 75, var3);
            super.field5744.method3126(0, -59);
            super.field5744.method3194((byte) 75, this.field44.field5939);
            long var4 = this.field35.field785;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field5744.field7624[0], -super.field5744.field7624[1], -super.field5744.field7624[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5744.field7711, super.field5744.field7650, super.field5744.field7733, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field5744.field7624[1]) + 96.0F);
            this.field40 = true;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V", line = 33)
    public static void method14(int arg0) {
        field39 = null;
        if (arg0 != 2) {
            field41 = 72;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Ljaa;Ldk;)V", line = 45)
    public class5(class576 arg0, class477 arg1) {
        super(arg0);
        this.field44 = arg1;
        if (this.field44.field5939 != null && super.field5744.field7724 && super.field5744.field7732) {
            class491 var3 = class428.method2362("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35716, super.field5744, 35633);
            class491 var4 = class428.method2362("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35716, super.field5744, 35632);
            this.field35 = class234.method1417(new class491[] { var3, var4 }, -128, super.field5744);
            this.field34 = this.field35 != null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 68)
    public final void method15(int arg0) {
        ++field43;
        if (this.field40) {
            super.field5744.method3126(1, -104);
            super.field5744.method3194((byte) 75, (class185) null);
            super.field5744.method3126(0, arg0 + -64);
            super.field5744.method3194((byte) 75, (class185) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field40 = false;
        }
        if (arg0 != 0) {
            this.field44 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Z", line = 91)
    public final boolean method16(int arg0) {
        ++field47;
        if (arg0 != -24566) {
            this.field44 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BZ)V", line = 102)
    public final void method17(byte arg0, boolean arg1) {
        if (arg0 < 100) {
            this.method16(119);
        }
        ++field36;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIB)V", line = 129)
    public final void method18(int arg0, int arg1, byte arg2) {
        if (arg2 >= -110) {
            this.field35 = null;
        }
        ++field38;
        if (this.field40) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) ((216549 & arg1) >> 16) / 8.0F;
            long var8 = this.field35.field785;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5744.field7595 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILtj;)V", line = 158)
    public final void method19(int arg0, int arg1, class185 arg2) {
        if (!this.field40) {
            super.field5744.method3194((byte) 75, arg2);
            super.field5744.method3134(100, arg0);
        }
        int var4 = -104 % ((25 - arg1) / 59);
        ++field46;
    }
}
