import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class163 extends class548 {

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Z")
    private boolean field2172 = false;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "Z")
    private boolean field2167 = false;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "Ltf;")
    private class311 field2173;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "Lgw;")
    private class182 field2175;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field2163 = -1;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public final void method759(int arg0) {
        if (this.field2172) {
            super.field7571.method1631(1, 89);
            super.field7571.method1595((byte) 91, (class205) null);
            super.field7571.method1631(0, 83);
            super.field7571.method1595((byte) 78, (class205) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2172 = false;
        }
        ++field2166;
        if (arg0 != 3) {
            this.method753(-46, -50, -62);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)V")
    public final void method758(boolean arg0, int arg1) {
        ++field2169;
        if (arg1 != 0) {
            this.method758(false, 119);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
    public final void method753(int arg0, int arg1, int arg2) {
        if (this.field2172) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) (3 & arg0 >> 16) / 8.0F;
            long var8 = this.field2175.field2391;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7571.field3519 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg2 != 14106) {
            this.method760((class205) null, 7, 74);
        }
        ++field2176;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Llf;Ltf;)V")
    public class163(class250 arg0, class311 arg1) {
        super(arg0);
        this.field2173 = arg1;
        if (this.field2173.field4396 != null && super.field7571.field3554 && super.field7571.field3589) {
            class440 var3 = class498.method2925(super.field7571, (byte) 45, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class440 var4 = class498.method2925(super.field7571, (byte) 96, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field2175 = class40.method231(new class440[] { var3, var4 }, (byte) -7, super.field7571);
            this.field2167 = this.field2175 != null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Z")
    public final boolean method756(boolean arg0) {
        if (!arg0) {
            this.method753(61, 95, 67);
        }
        ++field2171;
        return false;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lru;II)V")
    public final void method760(class205 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field2172 = true;
        }
        ++field2177;
        if (!this.field2172) {
            super.field7571.method1595((byte) 125, arg0);
            super.field7571.method1601(25456, arg2);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZZ)V")
    public final void method754(boolean arg0, boolean arg1) {
        ++field2165;
        class107 var3 = super.field7571.method1577(true);
        if (this.field2167 && var3 != null) {
            super.field7571.method1631(1, 81);
            super.field7571.method1595((byte) 71, var3);
            super.field7571.method1631(0, 125);
            super.field7571.method1595((byte) 94, this.field2173.field4396);
            long var4 = this.field2175.field2391;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field7571.field3552[0], -super.field7571.field3552[1], -super.field7571.field3552[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7571.field3650, super.field7571.field3584, super.field7571.field3644, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field7571.field3552[1]));
            this.field2172 = true;
        }
        if (arg1) {
            this.field2173 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/awt/Frame;Lec;I)V")
    public static final void method1130(Frame arg0, class248 arg1, int arg2) {
        int var3 = 25 / ((-76 - arg2) / 45);
        while (true) {
            class621 var4 = arg1.method1551(109, arg0);
            while (~var4.field8405 == -1) {
                class171.method1152(10L, false);
            }
            if (var4.field8405 == 1) {
                ++field2164;
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class171.method1152(100L, false);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILpp;)V")
    public static final void method1131(int arg0, class413 arg1) {
        if (arg1.field5941 != null) {
            arg1.field5941.field4109 = 0;
        }
        if (arg0 != 12972) {
            field2168 = 123;
        }
        ++field2170;
        arg1.field5944 = false;
        for (class413 var2 = arg1.method15(); var2 != null; var2 = arg1.method13()) {
            method1131(arg0, var2);
        }
    }
}
