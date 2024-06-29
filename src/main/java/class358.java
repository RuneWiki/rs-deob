import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class358 extends class263 {

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Z")
    private boolean field5305 = false;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Z")
    private boolean field5308 = false;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "Lmt;")
    private class261 field5310;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Lsj;")
    private class305 field5302;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5303 = "";

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "[[B")
    public static byte[][] field5314;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[[Z")
    public static boolean[][] field5313;

    static {
        new class423("From", "Von:", "De", "De");
        field5312 = -1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V", line = 3)
    public final void method673(int arg0, int arg1, int arg2) {
        if (arg2 == 6908) {
            ++field5309;
            if (this.field5305) {
                int var4 = 1 << (arg0 & 3);
                float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
                int var6 = arg1 & 65535;
                float var7 = (float) (3 & arg1 >> 16) / 8.0F;
                long var8 = this.field5302.field4626;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field3984.field6691 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z", line = 31)
    public final boolean method675(int arg0) {
        if (arg0 > -112) {
            return true;
        } else {
            ++field5311;
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZB)V", line = 44)
    public final void method669(boolean arg0, byte arg1) {
        ++field5307;
        class304 var3 = super.field3984.method2606(0);
        if (this.field5308 && var3 != null) {
            super.field3984.method2582((byte) 4, 1);
            super.field3984.method2586(var3, false);
            super.field3984.method2582((byte) 127, 0);
            super.field3984.method2586(this.field5310.field3961, false);
            long var4 = this.field5302.field4626;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field3984.field6798[0], -super.field3984.field6798[1], -super.field3984.field6798[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3984.field6811, super.field3984.field6715, super.field3984.field6768, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field3984.field6798[1]) + 96.0F);
            this.field5305 = true;
        }
        int var6 = -13 / ((24 - arg1) / 34);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 74)
    public final void method670(byte arg0) {
        ++field5300;
        if (this.field5305) {
            super.field3984.method2582((byte) 125, 1);
            super.field3984.method2586((class194) null, false);
            super.field3984.method2582((byte) 125, 0);
            super.field3984.method2586((class194) null, false);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5305 = false;
        }
        if (arg0 != -94) {
            this.method669(false, (byte) 29);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lce;IZ)V", line = 95)
    public final void method671(class194 arg0, int arg1, boolean arg2) {
        ++field5301;
        if (!this.field5305) {
            super.field3984.method2586(arg0, false);
            super.field3984.method2610(0, arg1);
        }
        if (!arg2) {
            this.field5302 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB[BI)Ljava/lang/String;", line = 111)
    public static final String method2187(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 <= 15) {
            method2188(61);
        }
        ++field5304;
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; ++var6) {
            int var7 = 255 & arg2[arg3 + var6];
            if (~var7 != -1) {
                if (~var7 <= -129 && ~var7 > -161) {
                    char var8 = class320.field4811[var7 + -128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lbl;Lmt;)V", line = 153)
    public class358(class442 arg0, class261 arg1) {
        super(arg0);
        this.field5310 = arg1;
        if (this.field5310.field3961 != null && super.field3984.field6741 && super.field3984.field6720) {
            class108 var3 = class83.method596(35633, super.field3984, -58, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class108 var4 = class83.method596(35632, super.field3984, -57, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field5302 = class375.method2261(super.field3984, 92, new class108[] { var3, var4 });
            this.field5308 = this.field5302 != null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 173)
    public static void method2188(int arg0) {
        field5313 = null;
        if (arg0 != 3) {
            field5314 = null;
        }
        field5314 = null;
        field5303 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V", line = 196)
    public final void method666(int arg0, boolean arg1) {
        if (arg0 != -2560) {
            this.field5310 = null;
        }
        ++field5306;
    }
}
