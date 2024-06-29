import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class392 extends class83 {

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "Z")
    private boolean field5326 = false;

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "Z")
    private boolean field5318 = false;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "Lud;")
    private class123 field5316;

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "Ldi;")
    private class243 field5324;

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "I")
    public static int field5314 = -1;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "[Z")
    public static boolean[] field5325 = new boolean[200];

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "Ltf;")
    public static class701 field5317;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(BZ)V", line = 4)
    public final void method433(byte arg0, boolean arg1) {
        ++field5319;
        if (arg0 != -48) {
            this.method440((byte) -8);
        }
        class140 var3 = super.field855.method2367(1);
        if (this.field5318 && var3 != null) {
            float var4 = (-Math.abs(super.field855.field5899[1]) + 1.0F) * 2.0F + 1.0F;
            super.field855.method2431((byte) -69, 1);
            super.field855.method2396((byte) 36, var3);
            super.field855.method2431((byte) -116, 0);
            super.field855.method2396((byte) 36, this.field5316.field1370);
            long var5 = this.field5324.field3000;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field855.field5899[0], -super.field855.field5899[1], -super.field855.field5899[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field855.field5947 * var4, super.field855.field5890 * var4, super.field855.field5881 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field855.field5899[1]) + 64.0F);
            this.field5326 = true;
        }
    }

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "(I)V", line = 36)
    public static void method2229(int arg0) {
        if (arg0 == 9204) {
            field5325 = null;
            field5317 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZI)V", line = 53)
    public final void method439(boolean arg0, int arg1) {
        ++field5313;
        if (arg1 > -123) {
            this.field5324 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lvj;Lud;)V", line = 65)
    public class392(class422 arg0, class123 arg1) {
        super(arg0);
        this.field5316 = arg1;
        if (this.field5316.field1370 != null && super.field855.field5959 && super.field855.field5879) {
            class424 var3 = class6.method45(35633, true, super.field855, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class424 var4 = class6.method45(35632, true, super.field855, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field5324 = class306.method1762(new class424[] { var3, var4 }, (byte) -122, super.field855);
            this.field5318 = this.field5324 != null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)Z", line = 89)
    public final boolean method440(byte arg0) {
        ++field5321;
        return arg0 > -100 ? false : this.field5318;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILav;)V", line = 100)
    public final void method441(int arg0, int arg1, class325 arg2) {
        if (!this.field5326) {
            super.field855.method2396((byte) 36, arg2);
            super.field855.method2421(arg1, 1);
        }
        if (arg0 != -29092) {
            this.method433((byte) 49, true);
        }
        ++field5322;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)V", line = 117)
    public final void method435(int arg0, int arg1, int arg2) {
        int var4 = -24 / ((arg2 - -60) / 33);
        if (this.field5326) {
            int var5 = 1 << (arg1 & 3);
            float var6 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var7 = arg0 & 65535;
            float var8 = (float) ((228881 & arg0) >> 16) / 8.0F;
            float var9 = (float) (15 & arg0 >> 19) / 16.0F;
            float var10 = (float) ((arg0 & 134093021) >> 23) / 16.0F;
            int var11 = (arg0 & 2122402529) >> 27;
            long var12 = this.field5324.field3000;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "time"), (float) (super.field855.field5817 * var5 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "scale"), var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "breakWaterDepth"), (float) var7);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "breakWaterOffset"), var8);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var12, "waveIntensity"), var10, var9);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "waveExponent"), (float) var11);
        }
        ++field5323;
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V", line = 160)
    public final void method438(int arg0) {
        ++field5320;
        if (arg0 != 18610) {
            this.method439(false, -107);
        }
        if (this.field5326) {
            super.field855.method2431((byte) -58, 1);
            super.field855.method2396((byte) 36, (class325) null);
            super.field855.method2431((byte) -35, 0);
            super.field855.method2396((byte) 36, (class325) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5326 = false;
        }
    }
}
