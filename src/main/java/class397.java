import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class397 extends class363 {

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Z")
    private boolean field5954 = false;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Z")
    private boolean field5955 = false;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "Lqh;")
    private class48 field5961;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lkh;")
    private class13 field5950;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Llt;")
    public static class475 field5946 = new class475("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field5959 = -1;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "[[I")
    public static int[][] field5960 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "Lri;")
    public static class73 field5958 = new class73(85, -1);

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "[[I")
    public static int[][] field5963;

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lod;Lqh;)V")
    public class397(class349 arg0, class48 arg1) {
        super(arg0);
        this.field5961 = arg1;
        if (this.field5961.field772 != null && super.field5564.field5315 && super.field5564.field5330) {
            class307 var3 = class471.method2826("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field5564, 35633, (byte) 73);
            class307 var4 = class471.method2826("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field5564, 35632, (byte) 80);
            this.field5950 = class312.method1948(super.field5564, -106, new class307[] { var3, var4 });
            this.field5954 = this.field5950 != null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)Z")
    public final boolean method126(int arg0) {
        ++field5953;
        int var2 = -27 % ((37 - arg0) / 48);
        return false;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V")
    public final void method125(boolean arg0, int arg1) {
        ++field5945;
        class374 var3 = super.field5564.method2151((byte) -97);
        if (arg1 > -69) {
            this.method128(84, -60, -98);
        }
        if (this.field5954 && var3 != null) {
            super.field5564.method2176(1, 29);
            super.field5564.method2200(var3, (byte) 117);
            super.field5564.method2176(0, 60);
            super.field5564.method2200(this.field5961.field772, (byte) 123);
            long var4 = this.field5950.field168;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field5564.field5341[0], -super.field5564.field5341[1], -super.field5564.field5341[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5564.field5362, super.field5564.field5337, super.field5564.field5294, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field5564.field5341[1]) + 96.0F);
            this.field5955 = true;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljk;IB)V")
    public final void method121(class446 arg0, int arg1, byte arg2) {
        if (arg2 > -69) {
            this.method121((class446) null, -117, (byte) 46);
        }
        ++field5957;
        if (!this.field5955) {
            super.field5564.method2200(arg0, (byte) 122);
            super.field5564.method2186(arg1, 48);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2399(String arg0, String arg1, int arg2, String arg3) {
        ++field5962;
        if (arg2 <= 40) {
            return null;
        } else {
            for (int var4 = arg0.indexOf(arg1); ~var4 != 0; var4 = arg0.indexOf(arg1, arg3.length() + var4)) {
                arg0 = arg0.substring(0, var4) + arg3 + arg0.substring(arg1.length() + var4);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZB)V")
    public final void method122(boolean arg0, byte arg1) {
        ++field5952;
        if (arg1 != 52) {
            this.method126(118);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V")
    public static void method2400(boolean arg0) {
        field5958 = null;
        field5963 = null;
        if (arg0) {
            field5959 = -30;
        }
        field5946 = null;
        field5960 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V")
    public static final void method2401(int arg0, int arg1) {
        int var2 = 117 % ((-32 - arg1) / 50);
        class265.field3875 = new int[arg0];
        class30.field322 = new int[arg0];
        ++field5948;
        class515.field7519 = new int[arg0];
        class438.field6538 = new int[arg0];
        class461.field6850 = new int[arg0];
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        ++field5956;
        if (!arg0) {
            if (this.field5955) {
                super.field5564.method2176(1, 105);
                super.field5564.method2200((class446) null, (byte) 124);
                super.field5564.method2176(0, 35);
                super.field5564.method2200((class446) null, (byte) 119);
                OpenGL.glUseProgramObjectARB(0L);
                this.field5955 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
    public final void method128(int arg0, int arg1, int arg2) {
        if (this.field5955) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << ((63 & arg2) >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((arg0 & 207377) >> 16) / 8.0F;
            long var8 = this.field5950.field168;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5564.field5228 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field5951;
        if (arg1 > -13) {
            this.method126(77);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII)Z")
    public static final boolean method2402(byte arg0, int arg1, int arg2) {
        ++field5949;
        if (arg0 != -82) {
            field5947 = -30;
        }
        return (2048 & arg1) != 0;
    }
}
