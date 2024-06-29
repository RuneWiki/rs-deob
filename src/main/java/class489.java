import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class489 extends class477 {

    @OriginalMember(owner = "client!on", name = "t", descriptor = "Z")
    private boolean field7131 = false;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "Z")
    private boolean field7134 = false;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "Lwl;")
    private class511 field7133;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "Lss;")
    private class322 field7128;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field7124 = 0;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "Lpi;")
    public static class340 field7130 = new class340(85, 4);

    @OriginalMember(owner = "client!on", name = "y", descriptor = "Loe;")
    public static class98 field7136 = new class98(128);

    @OriginalMember(owner = "client!on", name = "A", descriptor = "[J")
    public static long[] field7138 = new long[32];

    @OriginalMember(owner = "client!on", name = "z", descriptor = "F")
    public static float field7137;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)Z")
    public final boolean method264(byte arg0) {
        ++field7135;
        return arg0 <= 45 ? true : this.field7131;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V")
    public final void method271(boolean arg0, int arg1) {
        if (arg1 != -13) {
            this.method270(true, false);
        }
        ++field7126;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lgk;Lwl;)V")
    public class489(class463 arg0, class511 arg1) {
        super(arg0);
        this.field7133 = arg1;
        if (this.field7133.field7524 != null && super.field6964.field6726 && super.field6964.field6718) {
            class307 var3 = class206.method1346(super.field6964, 35633, -10993, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class307 var4 = class206.method1346(super.field6964, 35632, -10993, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field7128 = class310.method1853(119, super.field6964, new class307[] { var3, var4 });
            this.field7131 = this.field7128 != null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZZ)V")
    public final void method270(boolean arg0, boolean arg1) {
        if (!arg0) {
            method2919(false);
        }
        ++field7129;
        class244 var3 = super.field6964.method2786(118);
        if (this.field7131 && var3 != null) {
            float var4 = 1.0F + 2.0F * (1.0F - Math.abs(super.field6964.field6750[1]));
            super.field6964.method2741((byte) -38, 1);
            super.field6964.method2771(var3, -16785);
            super.field6964.method2741((byte) -38, 0);
            super.field6964.method2771(this.field7133.field7524, -16785);
            long var5 = this.field7128.field4140;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field6964.field6750[0], -super.field6964.field6750[1], -super.field6964.field6750[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field6964.field6781 * var4, super.field6964.field6818 * var4, super.field6964.field6754 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field6964.field6750[1]) * 928.0F + 64.0F);
            this.field7134 = true;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lrh;II)V")
    public final void method266(class31 arg0, int arg1, int arg2) {
        ++field7123;
        if (arg1 == -11) {
            if (!this.field7134) {
                super.field6964.method2771(arg0, arg1 + -16774);
                super.field6964.method2739(arg2, 0);
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BII)V")
    public final void method272(byte arg0, int arg1, int arg2) {
        if (this.field7134) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            float var8 = (float) ((8370661 & arg2) >> 19) / 16.0F;
            float var9 = (float) (15 & arg2 >> 23) / 16.0F;
            int var10 = arg2 >> 27 & 15;
            long var11 = this.field7128.field4140;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field6964.field6690 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field7127;
        if (arg0 <= 33) {
            method2920(false);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
    public static final void method2919(boolean arg0) {
        if (arg0) {
            class212.field2721.method90((byte) -27);
            ++field7125;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)V")
    public static final void method2920(boolean arg0) {
        class248.field3171 = null;
        class461.field6448 = null;
        if (arg0) {
            method2919(false);
        }
        ++field7121;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
    public static void method2921(int arg0) {
        field7130 = null;
        field7138 = null;
        if (arg0 != 12176) {
            field7136 = null;
        }
        field7136 = null;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
    public final void method269(byte arg0) {
        if (this.field7134) {
            super.field6964.method2741((byte) -38, 1);
            super.field6964.method2771((class31) null, -16785);
            super.field6964.method2741((byte) -38, 0);
            super.field6964.method2771((class31) null, -16785);
            OpenGL.glUseProgramObjectARB(0L);
            this.field7134 = false;
        }
        ++field7122;
        if (arg0 != 126) {
            this.field7131 = false;
        }
    }
}
