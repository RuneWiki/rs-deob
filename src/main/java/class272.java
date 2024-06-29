import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class272 extends class648 {

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "Z")
    private boolean field3773 = false;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "Z")
    private boolean field3783 = false;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "Lde;")
    private class454 field3774;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "Liu;")
    private class496 field3779;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "Lfca;")
    public static class74 field3778 = new class74("", 15);

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
    public static int field3787 = 0;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "Z")
    public static boolean field3789;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "[Ljw;")
    public static class475[] field3788;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)I")
    public static final int method1765(int arg0, int arg1) {
        if (arg1 != -1) {
            return 57;
        } else {
            ++field3782;
            return arg0 == 16711935 ? -1 : class350.method2103(arg0, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLmw;I)V")
    public final void method942(byte arg0, class418 arg1, int arg2) {
        if (!this.field3773) {
            super.field9395.method3358(32886, arg1);
            super.field9395.method3396((byte) 116, arg2);
        }
        ++field3780;
        if (arg0 != -30) {
            this.field3783 = false;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZ)V")
    public final void method947(int arg0, boolean arg1) {
        if (arg0 != 17729) {
            this.method946(30);
        }
        ++field3775;
        class403 var3 = super.field9395.method3409(0);
        if (this.field3783 && var3 != null) {
            float var4 = 2.0F * (-Math.abs(super.field9395.field8329[1]) + 1.0F) + 1.0F;
            super.field9395.method3398(-59, 1);
            super.field9395.method3358(32886, var3);
            super.field9395.method3398(-86, 0);
            super.field9395.method3358(32886, this.field3774.field6409);
            long var5 = this.field3779.field6934;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field9395.field8329[0], -super.field9395.field8329[1], -super.field9395.field8329[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field9395.field8309 * var4, super.field9395.field8340 * var4, super.field9395.field8274 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field9395.field8329[1]) + 64.0F);
            this.field3773 = true;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZ)V")
    public final void method944(byte arg0, boolean arg1) {
        ++field3777;
        if (arg0 >= -111) {
            this.method941(-84);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V")
    public final void method945(int arg0, int arg1, int arg2) {
        if (this.field3773) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((arg0 & 254692) >> 16) / 8.0F;
            float var8 = (float) ((8067053 & arg0) >> 19) / 16.0F;
            float var9 = (float) ((arg0 & 127135245) >> 23) / 16.0F;
            int var10 = arg0 >> 27 & 15;
            long var11 = this.field3779.field6934;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field9395.field8202 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        int var13 = -54 % ((30 - arg2) / 56);
        ++field3784;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Z")
    public final boolean method946(int arg0) {
        ++field3785;
        if (arg0 < 122) {
            this.field3779 = null;
        }
        return this.field3783;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lgi;Lde;)V")
    public class272(class583 arg0, class454 arg1) {
        super(arg0);
        this.field3774 = arg1;
        if (this.field3774.field6409 != null && super.field9395.field8280 && super.field9395.field8297) {
            class40 var3 = client.method1550(35633, false, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field9395);
            class40 var4 = client.method1550(35632, false, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field9395);
            this.field3779 = class209.method1377(new class40[] { var3, var4 }, super.field9395, 26013);
            this.field3783 = this.field3779 != null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    public final void method941(int arg0) {
        if (arg0 == 1) {
            ++field3776;
            if (this.field3773) {
                super.field9395.method3398(-82, 1);
                super.field9395.method3358(32886, (class418) null);
                super.field9395.method3398(-84, 0);
                super.field9395.method3358(32886, (class418) null);
                OpenGL.glUseProgramObjectARB(0L);
                this.field3773 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lan;BLdj;)V")
    public static final void method1766(class21 arg0, byte arg1, class288 arg2) {
        class533.field7460 = arg0;
        class400.field5708 = arg2;
        class418.field5886 = "";
        ++field3781;
        if (arg1 == -22) {
            if (class288.field3967.startsWith("win")) {
                class418.field5886 = class418.field5886 + "windows/";
            } else if (!class288.field3967.startsWith("linux")) {
                if (class288.field3967.startsWith("mac")) {
                    class418.field5886 = class418.field5886 + "macos/";
                }
            } else {
                class418.field5886 = class418.field5886 + "linux/";
            }
            if (class288.field3965 == 2) {
                class418.field5886 = class418.field5886 + "msjava/";
            } else if (!class288.field3972.startsWith("amd64") && !class288.field3972.startsWith("x86_64")) {
                if (!class288.field3972.startsWith("i586") && !class288.field3972.startsWith("x86")) {
                    if (!class288.field3972.startsWith("ppc")) {
                        class418.field5886 = class418.field5886 + "universal/";
                    } else {
                        class418.field5886 = class418.field5886 + "ppc/";
                    }
                } else {
                    class418.field5886 = class418.field5886 + "x86/";
                }
            } else {
                class418.field5886 = class418.field5886 + "x86_64/";
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
    public static void method1767(int arg0) {
        field3788 = null;
        field3778 = null;
        if (arg0 != -25392) {
            method1766((class21) null, (byte) 65, (class288) null);
        }
    }

    static {
        new class74("", 76);
        field3789 = false;
    }
}
