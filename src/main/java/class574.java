import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class574 extends class605 {

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Z")
    private boolean field8078 = false;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Z")
    private boolean field8073 = false;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Lsda;")
    private class232 field8081;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Lhca;")
    private class452 field8076;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "[I")
    public static int[] field8074 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field8079 = 0;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "[B")
    public static byte[] field8080 = new byte[2048];

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Ljp;")
    public static class322 field8072;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "Loq;")
    public static class326 field8082;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Z", line = 7)
    public final boolean method48(boolean arg0) {
        if (arg0) {
            this.field8078 = true;
        }
        ++field8075;
        return false;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 20)
    public final void method45(int arg0) {
        if (this.field8073) {
            super.field8542.method1500(33984, 1);
            super.field8542.method1505(arg0 ^ -2, (class657) null);
            super.field8542.method1500(33984, 0);
            super.field8542.method1505(-2, (class657) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8073 = false;
        }
        ++field8070;
        if (arg0 != 0) {
            this.field8081 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lok;Lsda;)V", line = 44)
    public class574(class228 arg0, class232 arg1) {
        super(arg0);
        this.field8081 = arg1;
        if (this.field8081.field3615 != null && super.field8542.field3481 && super.field8542.field3464) {
            class558 var3 = class548.method3098((byte) -106, 35633, super.field8542, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class558 var4 = class548.method3098((byte) -119, 35632, super.field8542, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field8076 = class505.method2912(new class558[] { var3, var4 }, 0, super.field8542);
            this.field8078 = this.field8076 != null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZB)V", line = 71)
    public final void method46(boolean arg0, byte arg1) {
        ++field8071;
        if (arg1 > -16) {
            this.field8076 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 81)
    public static void method3256(int arg0) {
        field8074 = null;
        field8080 = null;
        field8082 = null;
        field8072 = null;
        if (arg0 != 0) {
            method3257((String) null, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILip;I)V", line = 95)
    public final void method43(int arg0, class657 arg1, int arg2) {
        if (!this.field8073) {
            super.field8542.method1505(-2, arg1);
            super.field8542.method1497(arg0, (byte) -29);
        }
        ++field8083;
        if (arg2 != 0) {
            this.method46(true, (byte) -25);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 114)
    public static final void method3257(String arg0, byte arg1) {
        if (arg1 < 122) {
            method3256(-57);
        }
        ++field8068;
        if (!arg0.equals("")) {
            ++class641.field9041;
            class135 var2 = class688.method3794(class407.field5950, class583.field8198, (byte) 38);
            var2.field1978.method3853((byte) 51, class652.method3606(12351, arg0));
            var2.field1978.method3837(4102, arg0);
            class19.method223(var2, 0);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZI)V", line = 134)
    public final void method47(int arg0, boolean arg1, int arg2) {
        ++field8077;
        if (this.field8073) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            long var8 = this.field8076.field6505;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field8542.field3405 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1) {
            this.field8076 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V", line = 172)
    public final void method51(boolean arg0, int arg1) {
        ++field8069;
        class431 var3 = super.field8542.method1579((byte) -108);
        if (this.field8078 && var3 != null) {
            super.field8542.method1500(33984, 1);
            super.field8542.method1505(-2, var3);
            super.field8542.method1500(33984, 0);
            super.field8542.method1505(-2, this.field8081.field3615);
            long var4 = this.field8076.field6505;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field8542.field3517[0], super.field8542.field3517[1], super.field8542.field3517[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field8542.field3451, super.field8542.field3497, super.field8542.field3503, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field8542.field3517[1]) * 928.0F);
            this.field8073 = true;
        }
        if (arg1 >= -127) {
            field8082 = null;
        }
    }
}
