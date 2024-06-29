import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class522 extends class465 {

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Z")
    private boolean field6969 = false;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "Z")
    private boolean field6975 = false;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Lhm;")
    private class207 field6968;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Lvca;")
    private class260 field6973;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "Lqw;")
    public static class71 field6978 = new class71(6, 2);

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field6979 = -1;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Lbi;")
    public static class449 field6971;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public final void method213(int arg0) {
        ++field6976;
        if (arg0 == 15495) {
            if (this.field6975) {
                super.field6268.method3629((byte) 88, 1);
                super.field6268.method3630((class367) null, arg0 + -15497);
                super.field6268.method3629((byte) 68, 0);
                super.field6268.method3630((class367) null, -2);
                OpenGL.glUseProgramObjectARB(0L);
                this.field6975 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z")
    public final boolean method218(int arg0) {
        if (arg0 < 110) {
            this.field6968 = null;
        }
        ++field6977;
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZ)V")
    public final void method214(byte arg0, boolean arg1) {
        if (arg0 != 99) {
            field6978 = null;
        }
        ++field6974;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)V")
    public final void method210(int arg0, boolean arg1) {
        int var3 = -12 % ((-30 - arg0) / 38);
        ++field6972;
        class592 var4 = super.field6268.method3633(63);
        if (this.field6969 && var4 != null) {
            super.field6268.method3629((byte) -101, 1);
            super.field6268.method3630(var4, -2);
            super.field6268.method3629((byte) -113, 0);
            super.field6268.method3630(this.field6968.field2973, -2);
            long var5 = this.field6973.field3572;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field6268.field9216[0], -super.field6268.field9216[1], -super.field6268.field9216[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field6268.field9239, super.field6268.field9214, super.field6268.field9324, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field6268.field9216[1]) + 96.0F);
            this.field6975 = true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lno;Lhm;)V")
    public class522(class658 arg0, class207 arg1) {
        super(arg0);
        this.field6968 = arg1;
        if (this.field6968.field2973 != null && super.field6268.field9281 && super.field6268.field9242) {
            class575 var3 = class421.method2422(super.field6268, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 0, 35633);
            class575 var4 = class421.method2422(super.field6268, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 0, 35632);
            this.field6973 = class168.method1149(new class575[] { var3, var4 }, false, super.field6268);
            this.field6969 = this.field6973 != null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILhf;)V")
    public final void method212(int arg0, int arg1, class367 arg2) {
        if (!this.field6975) {
            super.field6268.method3630(arg2, -2);
            super.field6268.method3603((byte) -34, arg1);
        }
        if (arg0 != 0) {
            this.method213(-109);
        }
        ++field6967;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
    public final void method215(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method218(-67);
        }
        ++field6970;
        if (this.field6975) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((arg0 & 225001) >> 16) / 8.0F;
            long var8 = this.field6973.field3572;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field6268.field9186 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
    public static void method2926(int arg0) {
        int var1 = 104 % ((arg0 - 28) / 38);
        field6971 = null;
        field6978 = null;
    }
}
