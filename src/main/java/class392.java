import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class392 extends class187 {

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Z")
    private boolean field5377 = false;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "Z")
    private boolean field5385 = false;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Lol;")
    private class301 field5386;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "Lag;")
    private class712 field5383;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "[I")
    public static int[] field5374 = new int[1];

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field5378 = new String[200];

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field5380 = -1;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z")
    public final boolean method171(int arg0) {
        if (arg0 != 20220) {
            return true;
        } else {
            ++field5375;
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
    public final void method172(int arg0, boolean arg1) {
        if (arg0 < 56) {
            this.method168(true, (byte) 88);
        }
        ++field5379;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
        ++field5376;
        if (arg0) {
            if (this.field5385) {
                super.field2885.method1002(1, -5172);
                super.field2885.method939((class18) null, 8448);
                super.field2885.method1002(0, -5172);
                super.field2885.method939((class18) null, 8448);
                OpenGL.glUseProgramObjectARB(0L);
                this.field5385 = false;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static void method2375(int arg0) {
        field5378 = null;
        if (arg0 > 76) {
            field5374 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLqk;)V")
    public final void method167(int arg0, byte arg1, class18 arg2) {
        if (arg1 != -126) {
            this.method170(10, false, -45);
        }
        if (!this.field5385) {
            super.field2885.method939(arg2, arg1 ^ -8574);
            super.field2885.method999(true, arg0);
        }
        ++field5381;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lhk;Lol;)V")
    public class392(class111 arg0, class301 arg1) {
        super(arg0);
        this.field5386 = arg1;
        if (this.field5386.field4138 != null && super.field2885.field2043 && super.field2885.field2074) {
            class546 var3 = class692.method3873("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", true, 35633, super.field2885);
            class546 var4 = class692.method3873("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", true, 35632, super.field2885);
            this.field5383 = class300.method1927(super.field2885, new class546[] { var3, var4 }, (byte) 31);
            this.field5377 = this.field5383 != null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZB)V")
    public final void method168(boolean arg0, byte arg1) {
        ++field5382;
        int var3 = -30 / ((arg1 - 36) / 48);
        class34 var4 = super.field2885.method1004(3553);
        if (this.field5377 && var4 != null) {
            super.field2885.method1002(1, -5172);
            super.field2885.method939(var4, 8448);
            super.field2885.method1002(0, -5172);
            super.field2885.method939(this.field5386.field4138, 8448);
            long var5 = this.field5383.field9800;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field2885.field2022[0], -super.field2885.field2022[1], -super.field2885.field2022[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field2885.field2014, super.field2885.field1977, super.field2885.field1990, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field2885.field2022[1]) + 96.0F);
            this.field5385 = true;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)V")
    public final void method170(int arg0, boolean arg1, int arg2) {
        if (this.field5385) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((60 & arg0) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            long var8 = this.field5383.field9800;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2885.field1938 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1) {
            ++field5384;
        }
    }
}
