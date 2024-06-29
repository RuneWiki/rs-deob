import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class392 extends class159 {

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "Z")
    private boolean field5635 = false;

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "Z")
    private boolean field5636 = false;

    @OriginalMember(owner = "client!ada", name = "t", descriptor = "Lcd;")
    private class23 field5639;

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "Lcba;")
    private class54 field5629;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!ada", name = "o", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!ada", name = "r", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!ada", name = "s", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!ada", name = "u", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Ldw;Lcd;)V")
    public class392(class664 arg0, class23 arg1) {
        super(arg0);
        this.field5639 = arg1;
        if (this.field5639.field283 != null && super.field2221.field9110 && super.field2221.field9058) {
            class193 var3 = class694.method3921(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 0, super.field2221);
            class193 var4 = class694.method3921(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 0, super.field2221);
            this.field5629 = class651.method3644(new class193[] { var3, var4 }, super.field2221, (byte) 84);
            this.field5635 = this.field5629 != null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(B)V")
    public final void method369(byte arg0) {
        if (this.field5636) {
            super.field2221.method3738((byte) -63, 1);
            super.field2221.method3681((class559) null, 0);
            super.field2221.method3738((byte) -63, 0);
            super.field2221.method3681((class559) null, 0);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5636 = false;
        }
        ++field5633;
        if (arg0 > -59) {
            field5630 = -65;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(BZ)V")
    public final void method370(byte arg0, boolean arg1) {
        ++field5638;
        if (arg0 <= 88) {
            this.field5639 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZB)V")
    public final void method373(boolean arg0, byte arg1) {
        ++field5637;
        if (arg1 >= -109) {
            this.field5639 = null;
        }
        class413 var3 = super.field2221.method3676(8);
        if (this.field5635 && var3 != null) {
            float var4 = 1.0F + 2.0F * (-Math.abs(super.field2221.field9104[1]) + 1.0F);
            super.field2221.method3738((byte) -63, 1);
            super.field2221.method3681(var3, 0);
            super.field2221.method3738((byte) -63, 0);
            super.field2221.method3681(this.field5639.field283, 0);
            long var5 = this.field5629.field777;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field2221.field9104[0], -super.field2221.field9104[1], -super.field2221.field9104[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field2221.field9107 * var4, super.field2221.field9077 * var4, super.field2221.field9080 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field2221.field9104[1]) * 928.0F + 64.0F);
            this.field5636 = true;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2457(int arg0, int arg1, byte arg2) {
        ++field5628;
        int var3 = 19 / ((arg2 - 13) / 36);
        return (32768 & arg1) != 0;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lwu;II)V")
    public final void method368(class559 arg0, int arg1, int arg2) {
        if (arg1 != 26264) {
            method2458(99, (String) null);
        }
        if (!this.field5636) {
            super.field2221.method3681(arg0, 0);
            super.field2221.method3720(-26014, arg2);
        }
        ++field5634;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)Z")
    public final boolean method372(boolean arg0) {
        ++field5632;
        if (!arg0) {
            this.method370((byte) -14, false);
        }
        return this.field5635;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZII)V")
    public final void method367(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field5636 = true;
        }
        if (this.field5636) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((arg2 & 211818) >> 16) / 8.0F;
            float var8 = (float) ((arg2 & 8252756) >> 19) / 16.0F;
            float var9 = (float) ((arg2 & 132510084) >> 23) / 16.0F;
            int var10 = arg2 >> 27 & 15;
            long var11 = this.field5629.field777;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field2221.field9008 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field5640;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2458(int arg0, String arg1) {
        ++field5631;
        if (arg0 != 928) {
            field5630 = -67;
        }
        for (int var2 = 0; var2 < class344.field4905.length; ++var2) {
            if (class344.field4905[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
