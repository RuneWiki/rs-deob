import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class352 extends class45 {

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "Z")
    private boolean field4877 = false;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Z")
    private boolean field4881 = false;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lm;")
    private class127 field4880;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Lru;")
    private class128 field4871;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field4882 = 64;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "[S")
    public static short[] field4872 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Lgk;")
    public static class331 field4869 = new class331(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "Lho;")
    public static class102 field4884 = new class102(2, 4, 4, 0);

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "[[S")
    public static short[][] field4885 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "[I")
    public static int[] field4886 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method281(int arg0, boolean arg1) {
        ++field4870;
        if (arg0 != 0) {
            this.field4877 = false;
        }
        class401 var3 = super.field506.method2229((byte) 114);
        if (this.field4877 && var3 != null) {
            float var4 = (1.0F - Math.abs(super.field506.field5425[1])) * 2.0F + 1.0F;
            super.field506.method2219(1, arg0 ^ -122);
            super.field506.method2188((byte) 78, var3);
            super.field506.method2219(0, -123);
            super.field506.method2188((byte) 78, this.field4880.field1849);
            long var5 = this.field4871.field1860;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field506.field5425[0], -super.field506.field5425[1], -super.field506.field5425[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field506.field5412 * var4, super.field506.field5338 * var4, super.field506.field5418 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field506.field5425[1]));
            this.field4881 = true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)Z", line = 38)
    public final boolean method280(boolean arg0) {
        ++field4875;
        if (!arg0) {
            field4886 = null;
        }
        return this.field4877;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(JLya;I)V", line = 49)
    public static final void method2118(long arg0, class38 arg1, int arg2) {
        ++field4874;
        class278.field4085 = class213.field3063;
        class287.field4137 = 0;
        if (arg2 >= 65) {
            class213.field3063 = 0;
            long var4 = class437.method2644(-93);
            for (class189 var6 = (class189) class229.field3359.method2955(62); var6 != null; var6 = (class189) class229.field3359.method2952((byte) -119)) {
                if (var6.method1332(arg1, arg0)) {
                    ++class287.field4137;
                }
            }
            if (class335.field4647 && ~(arg0 % 100L) == -1L) {
                System.out.println("Particle system count: " + class229.field3359.method2950((byte) -122) + ", running: " + class287.field4137 + ". Particles: " + class213.field3063 + ". Time taken: " + (class437.method2644(-128) + -var4) + "ms");
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V", line = 86)
    public final void method286(int arg0, int arg1, int arg2) {
        if (this.field4881) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((251981 & arg2) >> 16) / 8.0F;
            float var8 = (float) ((arg2 & 8242827) >> 19) / 16.0F;
            float var9 = (float) ((131514001 & arg2) >> 23) / 16.0F;
            int var10 = 15 & arg2 >> 27;
            long var11 = this.field4871.field1860;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field506.field5306 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg1 <= 76) {
            field4872 = null;
        }
        ++field4873;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILkj;Z)V", line = 123)
    public final void method285(int arg0, class396 arg1, boolean arg2) {
        ++field4878;
        if (!arg2) {
            this.method286(-28, -34, 26);
        }
        if (!this.field4881) {
            super.field506.method2188((byte) 78, arg1);
            super.field506.method2183(7681, arg0);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lfd;Lm;)V", line = 141)
    public class352(class365 arg0, class127 arg1) {
        super(arg0);
        this.field4880 = arg1;
        if (this.field4880.field1849 != null && super.field506.field5446 && super.field506.field5442) {
            class280 var3 = class49.method499((byte) 121, super.field506, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class280 var4 = class49.method499((byte) 121, super.field506, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field4871 = class196.method1371(new class280[] { var3, var4 }, super.field506, -1);
            this.field4877 = this.field4871 != null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 161)
    public final void method287(int arg0) {
        if (arg0 != 0) {
            this.method285(-118, (class396) null, false);
        }
        if (this.field4881) {
            super.field506.method2219(1, arg0 + -127);
            super.field506.method2188((byte) 78, (class396) null);
            super.field506.method2219(0, -128);
            super.field506.method2188((byte) 78, (class396) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4881 = false;
        }
        ++field4876;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V", line = 186)
    public static void method2119(byte arg0) {
        field4884 = null;
        field4885 = null;
        field4886 = null;
        field4869 = null;
        field4872 = null;
        if (arg0 != 95) {
            field4886 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZB)V", line = 200)
    public final void method279(boolean arg0, byte arg1) {
        ++field4879;
        if (arg1 <= 115) {
            this.method281(51, true);
        }
    }
}
