import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class724 extends class203 {

    @OriginalMember(owner = "client!lja", name = "q", descriptor = "Z")
    private boolean field10029 = false;

    @OriginalMember(owner = "client!lja", name = "l", descriptor = "Z")
    private boolean field10024 = false;

    @OriginalMember(owner = "client!lja", name = "o", descriptor = "Lsa;")
    private class780 field10027;

    @OriginalMember(owner = "client!lja", name = "h", descriptor = "Lon;")
    private class759 field10020;

    @OriginalMember(owner = "client!lja", name = "p", descriptor = "Ljn;")
    public static class134 field10028 = new class134(64, -1);

    @OriginalMember(owner = "client!lja", name = "g", descriptor = "I")
    public static int field10019;

    @OriginalMember(owner = "client!lja", name = "i", descriptor = "I")
    public static int field10021;

    @OriginalMember(owner = "client!lja", name = "j", descriptor = "I")
    public static int field10022;

    @OriginalMember(owner = "client!lja", name = "k", descriptor = "I")
    public static int field10023;

    @OriginalMember(owner = "client!lja", name = "m", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!lja", name = "n", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!lja", name = "r", descriptor = "I")
    public static int field10030;

    @OriginalMember(owner = "client!lja", name = "s", descriptor = "Lib;")
    public static class723 field10031;

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "(IZ)I")
    public static final int method4033(int arg0, boolean arg1) {
        ++field10030;
        if (class75.field842 == null) {
            return 0;
        } else if (!arg1 && class340.field4924 != null) {
            return class75.field842.length * 2;
        } else {
            int var2 = 0;
            for (int var3 = 0; var3 < class75.field842.length; ++var3) {
                int var4 = class75.field842[var3];
                if (class83.field1001.method1860(var4, (byte) 124)) {
                    ++var2;
                }
                if (class92.field1077.method1860(var4, (byte) 124)) {
                    ++var2;
                }
            }
            if (arg0 != 1) {
                return 85;
            } else {
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(BZ)V")
    public final void method688(byte arg0, boolean arg1) {
        ++field10025;
        if (arg0 > -25) {
            this.method686(23);
        }
        class734 var3 = super.field2843.method1244(-126);
        if (this.field10029 && var3 != null) {
            super.field2843.method1262(1, 0);
            super.field2843.method1219((byte) 107, var3);
            super.field2843.method1262(0, 0);
            super.field2843.method1219((byte) 105, this.field10027.field10719);
            long var4 = this.field10020.field10433;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field2843.field2745[0], -super.field2843.field2745[1], -super.field2843.field2745[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field2843.field2738, super.field2843.field2750, super.field2843.field2683, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field2843.field2745[1]) * 928.0F + 96.0F);
            this.field10024 = true;
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(IIZ)V")
    public final void method682(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method688((byte) -77, true);
        }
        ++field10022;
        if (this.field10024) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) (3 & arg0 >> 16) / 8.0F;
            long var8 = this.field10020.field10433;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2843.field2614 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Lpq;Lsa;)V")
    public class724(class194 arg0, class780 arg1) {
        super(arg0);
        this.field10027 = arg1;
        if (this.field10027.field10719 != null && super.field2843.field2663 && super.field2843.field2747) {
            class190 var3 = class342.method2171(35633, super.field2843, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 0);
            class190 var4 = class342.method2171(35632, super.field2843, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 0);
            this.field10020 = class792.method4336(new class190[] { var3, var4 }, 35716, super.field2843);
            this.field10029 = this.field10020 != null;
        }
    }

    @OriginalMember(owner = "client!lja", name = "c", descriptor = "(I)V")
    public static void method4034(int arg0) {
        field10031 = null;
        if (arg0 != 0) {
            field10028 = null;
        }
        field10028 = null;
    }

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "(I)Z")
    public final boolean method687(int arg0) {
        ++field10019;
        return arg0 != -12 ? false : false;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(ZB)V")
    public final void method681(boolean arg0, byte arg1) {
        ++field10023;
        if (arg1 < 0) {
            field10031 = null;
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)V")
    public final void method686(int arg0) {
        if (this.field10024) {
            super.field2843.method1262(1, 0);
            super.field2843.method1219((byte) 91, (class539) null);
            super.field2843.method1262(0, 0);
            super.field2843.method1219((byte) 83, (class539) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field10024 = false;
        }
        if (arg0 < 64) {
            field10028 = null;
        }
        ++field10021;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(IZLwha;)V")
    public final void method683(int arg0, boolean arg1, class539 arg2) {
        if (!arg1) {
            ++field10026;
            if (!this.field10024) {
                super.field2843.method1219((byte) 87, arg2);
                super.field2843.method1263(arg0, 95);
            }
        }
    }
}
