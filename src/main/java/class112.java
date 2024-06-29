import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class112 extends class457 {

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "Z")
    private boolean field1679 = false;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "Z")
    private boolean field1686 = false;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "Lmc;")
    private class88 field1684;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "Lbt;")
    private class33 field1682;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "[I")
    public static int[] field1680 = new int[4];

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "[C")
    public static char[] field1678 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)V", line = 3)
    public static void method810(int arg0) {
        int var1 = -32 % ((arg0 - -69) / 32);
        field1680 = null;
        field1678 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)V", line = 16)
    public final void method434(int arg0, boolean arg1) {
        ++field1689;
        if (arg0 != 28037) {
            this.field1684 = null;
        }
        class39 var3 = super.field6706.method1959(34018);
        if (this.field1686 && var3 != null) {
            super.field6706.method1950(-29847, 1);
            super.field6706.method1996(2, var3);
            super.field6706.method1950(arg0 ^ -6420, 0);
            super.field6706.method1996(2, this.field1684.field1288);
            long var4 = this.field1682.field439;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field6706.field4769[0], -super.field6706.field4769[1], -super.field6706.field4769[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field6706.field4866, super.field6706.field4847, super.field6706.field4822, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field6706.field4769[1]) * 928.0F + 96.0F);
            this.field1679 = true;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIZ)V", line = 45)
    public final void method430(int arg0, int arg1, boolean arg2) {
        ++field1683;
        if (arg2) {
            this.field1682 = null;
        }
        if (this.field1679) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) (arg0 >> 16 & 3) / 8.0F;
            long var8 = this.field1682.field439;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field6706.field4743 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZB)V", line = 74)
    public final void method435(boolean arg0, byte arg1) {
        if (arg1 > 32) {
            ++field1681;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V", line = 85)
    public final void method433(byte arg0) {
        if (this.field1679) {
            super.field6706.method1950(-29847, 1);
            super.field6706.method1996(2, (class40) null);
            super.field6706.method1950(-29847, 0);
            super.field6706.method1996(2, (class40) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1679 = false;
        }
        if (arg0 != 8) {
            this.field1679 = false;
        }
        ++field1687;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Z", line = 111)
    public final boolean method429(int arg0) {
        ++field1685;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lef;Lmc;)V", line = 128)
    public class112(class338 arg0, class88 arg1) {
        super(arg0);
        this.field1684 = arg1;
        if (this.field1684.field1288 != null && super.field6706.field4865 && super.field6706.field4773) {
            class432 var3 = class153.method1031(super.field6706, 35633, 1, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class432 var4 = class153.method1031(super.field6706, 35632, 1, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field1682 = class209.method1294(new class432[] { var3, var4 }, (byte) 3, super.field6706);
            this.field1686 = this.field1682 != null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lmk;II)V", line = 150)
    public final void method431(class40 arg0, int arg1, int arg2) {
        if (!this.field1679) {
            super.field6706.method1996(2, arg0);
            super.field6706.method1974(arg2, 4609);
        }
        if (arg1 == 384) {
            ++field1688;
        }
    }
}
