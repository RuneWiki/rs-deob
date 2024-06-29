import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class432 extends class503 {

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "Z")
    private boolean field6341 = false;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "Z")
    private boolean field6350 = false;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "Lha;")
    private class40 field6342;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "Ljh;")
    private class105 field6343;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "Z")
    public static boolean field6344 = true;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
    public static int field6349;

    static {
        new class194("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method623(byte arg0) {
        if (arg0 < 45) {
            return true;
        } else {
            ++field6346;
            return false;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IBLtu;)V", line = 15)
    public final void method626(int arg0, byte arg1, class221 arg2) {
        if (!this.field6350) {
            super.field7679.method2883(arg2, -107);
            super.field7679.method2914(124, arg0);
        }
        if (arg1 > -21) {
            this.field6341 = true;
        }
        ++field6348;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V", line = 35)
    public final void method629(byte arg0) {
        if (this.field6350) {
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2883((class221) null, arg0 ^ -108);
            super.field7679.method2849(0, (byte) -109);
            super.field7679.method2883((class221) null, -116);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6350 = false;
        }
        ++field6340;
        if (arg0 != -122) {
            this.method626(-53, (byte) 36, (class221) null);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZI)V", line = 59)
    public final void method627(boolean arg0, int arg1) {
        if (arg1 != -1805) {
            this.field6343 = null;
        }
        ++field6345;
        class368 var3 = super.field7679.method2885(-109);
        if (this.field6341 && var3 != null) {
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2883(var3, arg1 + 1689);
            super.field7679.method2849(0, (byte) -109);
            super.field7679.method2883(this.field6342.field618, -103);
            long var4 = this.field6343.field1409;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field7679.field7394[0], -super.field7679.field7394[1], -super.field7679.field7394[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7679.field7396, super.field7679.field7409, super.field7679.field7436, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field7679.field7394[1]) + 96.0F);
            this.field6350 = true;
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lrl;Lha;)V", line = 92)
    public class432(class487 arg0, class40 arg1) {
        super(arg0);
        this.field6342 = arg1;
        if (this.field6342.field618 != null && super.field7679.field7383 && super.field7679.field7366) {
            class260 var3 = class150.method921(super.field7679, 35633, (byte) 94, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class260 var4 = class150.method921(super.field7679, 35632, (byte) 110, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field6343 = class40.method307((byte) 55, super.field7679, new class260[] { var3, var4 });
            this.field6341 = this.field6343 != null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)V", line = 111)
    public final void method624(int arg0, int arg1, int arg2) {
        if (this.field6350) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) ((202104 & arg1) >> 16) / 8.0F;
            long var8 = this.field6343.field1409;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7679.field7316 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field6347;
        int var10 = -82 % (-arg0 / 59);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZZ)V", line = 145)
    public final void method625(boolean arg0, boolean arg1) {
        ++field6339;
        if (arg0) {
            this.method629((byte) -105);
        }
    }
}
