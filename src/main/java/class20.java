import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class20 extends class509 {

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "Z")
    private boolean field216 = false;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "Z")
    private boolean field222 = false;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "Lmm;")
    private class19 field227;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "Lbr;")
    private class147 field219;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "[Lgo;")
    public static class313[] field218 = new class313[14];

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field220 = 0;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V", line = 4)
    public final void method121(byte arg0) {
        ++field226;
        if (this.field216) {
            super.field7409.method1756(1, -60);
            super.field7409.method1749(25752, (class169) null);
            super.field7409.method1756(0, 120);
            super.field7409.method1749(25752, (class169) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field216 = false;
        }
        if (arg0 != 38) {
            this.field222 = true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)V", line = 25)
    public final void method122(boolean arg0, int arg1) {
        ++field229;
        class32 var3 = super.field7409.method1729(true);
        if (this.field222 && var3 != null) {
            float var4 = 1.0F + 2.0F * (-Math.abs(super.field7409.field3986[1]) + 1.0F);
            super.field7409.method1756(1, 127);
            super.field7409.method1749(arg1 ^ 25816, var3);
            super.field7409.method1756(0, -32);
            super.field7409.method1749(arg1 ^ 25816, this.field227.field207);
            long var5 = this.field219.field2191;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field7409.field3986[0], -super.field7409.field3986[1], -super.field7409.field3986[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field7409.field4021 * var4, super.field7409.field3995 * var4, super.field7409.field3982 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + Math.abs(super.field7409.field3986[1]) * 928.0F);
            this.field216 = true;
        }
        if (arg1 != 64) {
            method126(false, -109);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIZ)V", line = 59)
    public final void method123(int arg0, int arg1, boolean arg2) {
        ++field221;
        if (arg2) {
            this.method125((byte) 101, -109, (class169) null);
        }
        if (this.field216) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) ((arg0 & 222850) >> 16) / 8.0F;
            float var8 = (float) (arg0 >> 19 & 15) / 16.0F;
            float var9 = (float) (15 & arg0 >> 23) / 16.0F;
            int var10 = (arg0 & 2079274100) >> 27;
            long var11 = this.field219.field2191;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field7409.field3927 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Z", line = 99)
    public final boolean method124(int arg0) {
        if (arg0 != -32170) {
            field220 = 123;
        }
        ++field223;
        return this.field222;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BILin;)V", line = 112)
    public final void method125(byte arg0, int arg1, class169 arg2) {
        ++field217;
        if (arg0 >= 9) {
            if (!this.field216) {
                super.field7409.method1749(25752, arg2);
                super.field7409.method1734(-76, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(ZI)V", line = 128)
    public static final void method126(boolean arg0, int arg1) {
        if (arg0 && class362.field5327 != null) {
            class59.field909 = class362.field5327.field7879;
        } else {
            class59.field909 = -1;
        }
        ++field228;
        class398.field5876 = null;
        class328.field4965 = null;
        class307.field4698 = 0;
        class362.field5327 = null;
        class362.method2293();
        class362.field5333.method291(false);
        class305.field4670 = null;
        class507.field7377 = null;
        if (arg1 <= -65) {
            class27.field300 = null;
            class240.field3593 = -1;
            class328.field4958 = null;
            class271.field4282 = null;
            class80.field1322 = null;
            class139.field2094 = null;
            class357.field5290 = -1;
            class362.field5336 = null;
            class360.field5312 = null;
            class503.field7312 = null;
            class362.field5329.method2183((byte) 126);
            class362.field5331.method773(64, 64, 64);
            class362.field5329.method2180(64, 128, (byte) 120);
            class362.field5326.method2280((byte) 107, 64);
            class529.field7739.method2104((byte) -18, 64);
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Ltt;Lmm;)V", line = 206)
    public class20(class249 arg0, class19 arg1) {
        super(arg0);
        this.field227 = arg1;
        if (this.field227.field207 != null && super.field7409.field4051 && super.field7409.field4007) {
            class279 var3 = class225.method1547("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", (byte) -89, 35633, super.field7409);
            class279 var4 = class225.method1547("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", (byte) -100, 35632, super.field7409);
            this.field219 = class91.method782(new class279[] { var3, var4 }, (byte) -126, super.field7409);
            this.field222 = this.field219 != null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V", line = 179)
    public static void method127(int arg0) {
        field218 = null;
        if (arg0 < 44) {
            method126(false, -46);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BZ)V", line = 189)
    public final void method128(byte arg0, boolean arg1) {
        ++field224;
        if (arg0 <= 44) {
            field220 = -128;
        }
    }
}
