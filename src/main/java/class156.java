import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class156 extends class263 {

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
    private boolean field2454 = false;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Z")
    private boolean field2461 = false;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Lmt;")
    private class261 field2460;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lsj;")
    private class305 field2455;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Lhi;")
    public static class131 field2458 = new class131(12, 0, 1, 0);

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Lsk;")
    public static class423 field2463 = new class423("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Lij;")
    public static class278 field2465;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "[I")
    public static int[] field2452;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZB)V")
    public final void method669(boolean arg0, byte arg1) {
        ++field2457;
        int var3 = -36 / ((arg1 - 24) / 34);
        class304 var4 = super.field3984.method2606(0);
        if (this.field2461 && var4 != null) {
            float var5 = 2.0F * (-Math.abs(super.field3984.field6798[1]) + 1.0F) + 1.0F;
            super.field3984.method2582((byte) 115, 1);
            super.field3984.method2586(var4, false);
            super.field3984.method2582((byte) -84, 0);
            super.field3984.method2586(this.field2460.field3961, false);
            long var6 = this.field2455.field4626;
            OpenGL.glUseProgramObjectARB(var6);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var6, "sunDir"), -super.field3984.field6798[0], -super.field3984.field6798[1], -super.field3984.field6798[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var6, "sunColour"), super.field3984.field6811 * var5, super.field3984.field6715 * var5, super.field3984.field6768 * var5, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var6, "sunExponent"), 928.0F * Math.abs(super.field3984.field6798[1]) + 64.0F);
            this.field2454 = true;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public final void method670(byte arg0) {
        ++field2453;
        if (arg0 != -94) {
            this.method669(false, (byte) -7);
        }
        if (this.field2454) {
            super.field3984.method2582((byte) -21, 1);
            super.field3984.method2586((class194) null, false);
            super.field3984.method2582((byte) -50, 0);
            super.field3984.method2586((class194) null, false);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2454 = false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
    public final void method673(int arg0, int arg1, int arg2) {
        ++field2456;
        if (arg2 != 6908) {
            this.method671((class194) null, -16, true);
        }
        if (this.field2454) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) ((229220 & arg1) >> 16) / 8.0F;
            float var8 = (float) (arg1 >> 19 & 15) / 16.0F;
            float var9 = (float) (arg1 >> 23 & 15) / 16.0F;
            int var10 = arg1 >> 27 & 15;
            long var11 = this.field2455.field4626;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field3984.field6691 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Z")
    public final boolean method675(int arg0) {
        ++field2459;
        return arg0 > -112 ? true : this.field2461;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lce;IZ)V")
    public final void method671(class194 arg0, int arg1, boolean arg2) {
        if (!this.field2454) {
            super.field3984.method2586(arg0, false);
            super.field3984.method2610(0, arg1);
        }
        if (!arg2) {
            this.field2460 = null;
        }
        ++field2462;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)V")
    public final void method666(int arg0, boolean arg1) {
        ++field2451;
        if (arg0 != -2560) {
            this.method673(-114, 109, 98);
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lbl;Lmt;)V")
    public class156(class442 arg0, class261 arg1) {
        super(arg0);
        this.field2460 = arg1;
        if (this.field2460.field3961 != null && super.field3984.field6741 && super.field3984.field6720) {
            class108 var3 = class83.method596(35633, super.field3984, -72, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class108 var4 = class83.method596(35632, super.field3984, -15, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field2455 = class375.method2261(super.field3984, 71, new class108[] { var3, var4 });
            this.field2461 = this.field2455 != null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static void method1003(int arg0) {
        field2463 = null;
        if (arg0 == 15) {
            field2458 = null;
            field2452 = null;
            field2465 = null;
        }
    }
}
