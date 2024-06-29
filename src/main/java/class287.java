import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class287 extends class229 {

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Z")
    private boolean field3851 = false;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Z")
    private boolean field3848 = false;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Lgo;")
    private class442 field3855;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Led;")
    private class497 field3847;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field3858 = -1;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "[I")
    public static int[] field3852 = new int[13];

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "[[I")
    public static int[][] field3853 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[BI)I")
    public static final int method1636(int arg0, byte[] arg1, int arg2) {
        if (arg2 != -8849) {
            return -65;
        } else {
            ++field3854;
            return class57.method374(-1109078392, 0, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)V")
    public final void method12(int arg0, int arg1, int arg2) {
        int var4 = -57 % ((13 - arg1) / 46);
        ++field3846;
        if (this.field3848) {
            int var5 = 1 << (arg0 & 3);
            float var6 = (float) (1 << ((arg0 & 61) >> 3)) / 32.0F;
            int var7 = 65535 & arg2;
            float var8 = (float) ((arg2 & 200976) >> 16) / 8.0F;
            long var9 = this.field3847.field7320;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "time"), (float) (super.field3194.field5863 * var5 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "scale"), var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "breakWaterDepth"), (float) var7);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "breakWaterOffset"), var8);
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V")
    public static void method1637(byte arg0) {
        if (arg0 >= -94) {
            method1638((class80) null, (class80) null, 43);
        }
        field3853 = null;
        field3852 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILao;)V")
    public final void method22(int arg0, int arg1, class188 arg2) {
        if (arg0 >= -45) {
            this.method17(true, -88);
        }
        ++field3849;
        if (!this.field3848) {
            super.field3194.method2412((byte) 4, arg2);
            super.field3194.method2365(true, arg1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)Z")
    public final boolean method13(byte arg0) {
        if (arg0 <= 123) {
            field3844 = -74;
        }
        ++field3850;
        return false;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lht;Lgo;)V")
    public class287(class410 arg0, class442 arg1) {
        super(arg0);
        this.field3855 = arg1;
        if (this.field3855.field6425 != null && super.field3194.field5907 && super.field3194.field5918) {
            class528 var3 = class516.method3030("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field3194, 35633, (byte) -117);
            class528 var4 = class516.method3030("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field3194, 35632, (byte) -44);
            this.field3847 = class441.method2631(super.field3194, new class528[] { var3, var4 }, 16);
            this.field3851 = this.field3847 != null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lut;Lut;I)V")
    public static final void method1638(class80 arg0, class80 arg1, int arg2) {
        if (arg2 != -6809) {
            method1638((class80) null, (class80) null, 115);
        }
        ++field3843;
        if (arg1.field1142 != null) {
            arg1.method581(4);
        }
        arg1.field1142 = arg0;
        arg1.field1135 = arg0.field1135;
        arg1.field1142.field1135 = arg1;
        arg1.field1135.field1142 = arg1;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZ)V")
    public final void method20(boolean arg0, boolean arg1) {
        ++field3845;
        class7 var3 = super.field3194.method2370(5);
        if (this.field3851 && var3 != null) {
            super.field3194.method2398(1, (byte) 23);
            super.field3194.method2412((byte) 4, var3);
            super.field3194.method2398(0, (byte) 106);
            super.field3194.method2412((byte) 4, this.field3855.field6425);
            long var4 = this.field3847.field7320;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field3194.field5940[0], -super.field3194.field5940[1], -super.field3194.field5940[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3194.field5959, super.field3194.field5906, super.field3194.field5997, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field3194.field5940[1]) * 928.0F);
            this.field3848 = true;
        }
        if (!arg0) {
            field3844 = -75;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
    public final void method17(boolean arg0, int arg1) {
        if (arg1 != -27632) {
            this.method13((byte) -119);
        }
        ++field3857;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(III)B")
    public static final byte method1639(int arg0, int arg1, int arg2) {
        if (arg0 != -4588) {
            field3852 = null;
        }
        ++field3856;
        if (arg2 != 9) {
            return 0;
        } else {
            return (byte) ((1 & arg1) == 0 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public final void method19(int arg0) {
        if (this.field3848) {
            super.field3194.method2398(1, (byte) -26);
            super.field3194.method2412((byte) 4, (class188) null);
            super.field3194.method2398(0, (byte) -50);
            super.field3194.method2412((byte) 4, (class188) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3848 = false;
        }
        if (arg0 == 262144) {
            ++field3859;
        }
    }
}
