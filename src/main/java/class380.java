import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class380 extends class301 {

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Z")
    private boolean field4645 = false;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Z")
    private boolean field4650 = false;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lwo;")
    private class722 field4642;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lfm;")
    private class477 field4641;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lrn;")
    public static class633 field4652 = new class633(33, -1);

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "[I")
    public static int[] field4654 = new int[2];

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "Luw;")
    public static class208 field4656 = new class208(97, 3);

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field4658 = 0;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Luw;")
    public static class208 field4657 = new class208(18, -1);

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "[I")
    public static int[] field4659;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIII)V")
    public static final void method2165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4644;
        if (~class485.field6252.field6946.method1340(false) != -1 && ~arg2 != -1 && ~class303.field3823 > -51 && ~arg4 != 0) {
            class718.field9426[class303.field3823++] = new class327((byte) 1, arg4, arg2, arg5, arg1, 0, arg3, (class210) null);
        }
        if (arg0 != 9736) {
            field4659 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
    public final void method22(int arg0, int arg1, int arg2) {
        if (this.field4650) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << ((arg1 & 58) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) (3 & arg0 >> 16) / 8.0F;
            long var8 = this.field4641.field6192;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field3803.field9807 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field4649;
        if (arg2 != 0) {
            field4656 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Z")
    public final boolean method25(byte arg0) {
        if (arg0 < 7) {
            this.method25((byte) -33);
        }
        ++field4653;
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IZ)V")
    public final void method27(int arg0, boolean arg1) {
        ++field4647;
        if (arg0 != 0) {
            method2165(-122, 113, -45, 107, 124, -104);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
    public static void method2166(boolean arg0) {
        field4659 = null;
        if (!arg0) {
            field4658 = -23;
        }
        field4656 = null;
        field4652 = null;
        field4657 = null;
        field4654 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)V")
    public final void method29(int arg0, boolean arg1) {
        ++field4646;
        class528 var3 = super.field3803.method3933(true);
        if (arg0 <= 18) {
            method2166(true);
        }
        if (this.field4645 && var3 != null) {
            super.field3803.method3945(1, false);
            super.field3803.method3975((byte) 127, var3);
            super.field3803.method3945(0, false);
            super.field3803.method3975((byte) 119, this.field4642.field9486);
            long var4 = this.field4641.field6192;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field3803.field9903[0], -super.field3803.field9903[1], -super.field3803.field9903[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3803.field9901, super.field3803.field9899, super.field3803.field9921, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field3803.field9903[1]) + 96.0F);
            this.field4650 = true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)Z")
    public static final boolean method2167(int arg0, int arg1, int arg2) {
        ++field4651;
        if (arg2 != 0) {
            field4657 = null;
        }
        return class298.method1776(arg2 + 76, arg0, arg1) | (458752 & arg1) != 0 || class19.method85(arg1, (byte) 112, arg0);
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lck;Lwo;)V")
    public class380(class733 arg0, class722 arg1) {
        super(arg0);
        this.field4642 = arg1;
        if (this.field4642.field9486 != null && super.field3803.field9909 && super.field3803.field9884) {
            class668 var3 = class745.method4041(35633, (byte) 119, super.field3803, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class668 var4 = class745.method4041(35632, (byte) 43, super.field3803, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field4641 = class617.method3302(new class668[] { var3, var4 }, super.field3803, -127);
            this.field4645 = this.field4641 != null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lwj;II)V")
    public final void method28(class128 arg0, int arg1, int arg2) {
        ++field4648;
        if (!this.field4650) {
            super.field3803.method3975((byte) 126, arg0);
            super.field3803.method3979((byte) 106, arg2);
        }
        if (arg1 != 0) {
            this.method29(30, true);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
    public final void method24(byte arg0) {
        if (arg0 >= -89) {
            this.field4645 = false;
        }
        if (this.field4650) {
            super.field3803.method3945(1, false);
            super.field3803.method3975((byte) 116, (class128) null);
            super.field3803.method3945(0, false);
            super.field3803.method3975((byte) 122, (class128) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4650 = false;
        }
        ++field4655;
    }
}
