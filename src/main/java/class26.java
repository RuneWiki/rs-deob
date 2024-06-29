import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class26 extends class11 {

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Z")
    private boolean field278 = false;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
    private boolean field277 = false;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lme;")
    private class168 field280;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Lis;")
    private class434 field279;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field270 = -1;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 3)
    public final void method63(int arg0) {
        if (this.field277) {
            super.field95.method2269((byte) 97, 1);
            super.field95.method2295(-83, (class507) null);
            super.field95.method2269((byte) 35, 0);
            super.field95.method2295(-50, (class507) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field277 = false;
        }
        ++field282;
        int var2 = -7 % ((-61 - arg0) / 40);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V", line = 24)
    public final void method67(int arg0, boolean arg1) {
        ++field281;
        if (arg0 <= 115) {
            this.method67(-89, false);
        }
        class158 var3 = super.field95.method2336(11011);
        if (this.field278 && var3 != null) {
            super.field95.method2269((byte) -97, 1);
            super.field95.method2295(-120, var3);
            super.field95.method2269((byte) 38, 0);
            super.field95.method2295(-87, this.field280.field2049);
            long var4 = this.field279.field6444;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field95.field5387[0], -super.field95.field5387[1], -super.field95.field5387[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field95.field5380, super.field95.field5420, super.field95.field5444, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field95.field5387[1]));
            this.field277 = true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lad;Lme;)V", line = 56)
    public class26(class362 arg0, class168 arg1) {
        super(arg0);
        this.field280 = arg1;
        if (this.field280.field2049 != null && super.field95.field5383 && super.field95.field5459) {
            class451 var3 = class410.method2594("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field95, (byte) 70, 35633);
            class451 var4 = class410.method2594("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field95, (byte) 60, 35632);
            this.field279 = class224.method1458(new class451[] { var3, var4 }, super.field95, 5097);
            this.field278 = this.field279 != null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 76)
    public static final void method155(int arg0) {
        class453.field6779 = null;
        class287.field3978 = null;
        class379.field5761 = null;
        ++field275;
        class259.field3690 = null;
        class160.field1971 = null;
        class286.field3960 = null;
        class511.field7468 = null;
        if (arg0 == 35633) {
            class75.field806 = null;
            class498.field7253 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZ)V", line = 96)
    public final void method64(boolean arg0, boolean arg1) {
        ++field273;
        if (!arg0) {
            this.method67(-94, true);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)S", line = 110)
    public static final short method156(int arg0, int arg1) {
        if (arg0 <= 99) {
            field270 = 88;
        }
        ++field274;
        int var2 = 63 & arg1 >> 10;
        int var3 = (902 & arg1) >> 3;
        int var4 = arg1 & 127;
        int var5 = var4 > 64 ? (-var4 + 127) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 - -var5;
        int var7;
        if (~var6 != -1) {
            var7 = (var5 << 8) / var6;
        } else {
            var7 = var5 << 1;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Z", line = 148)
    public final boolean method68(byte arg0) {
        ++field272;
        if (arg0 != 95) {
            this.field277 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB)V", line = 159)
    public final void method62(int arg0, int arg1, byte arg2) {
        if (this.field277) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) ((arg1 & 229555) >> 16) / 8.0F;
            long var8 = this.field279.field6444;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field95.field5351 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg2 < 124) {
            this.field278 = false;
        }
        ++field276;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILpm;)V", line = 191)
    public final void method65(int arg0, int arg1, class507 arg2) {
        if (arg1 == -1) {
            ++field271;
            if (!this.field277) {
                super.field95.method2295(-87, arg2);
                super.field95.method2288(arg0, 7681);
            }
        }
    }
}
