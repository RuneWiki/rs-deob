import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class165 extends class182 {

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Z")
    private boolean field2362 = false;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Z")
    private boolean field2361 = false;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Lica;")
    private class215 field2364;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lte;")
    private class490 field2359;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Leba;")
    public static class550 field2357 = new class550(62, -2);

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field2367 = class252.method1532(-126, 1600);

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "Ltca;")
    public static class141 field2368 = new class141(0, 1);

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field2369 = 0;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "[I")
    public static int[] field2370 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lga;")
    public static class332 field2366;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "[[Z")
    public static boolean[][] field2371;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 8)
    public final void method82(int arg0) {
        if (arg0 == 26813) {
            ++field2356;
            if (this.field2362) {
                super.field2540.method2625(20296, 1);
                super.field2540.method2627(arg0 + -26781, (class262) null);
                super.field2540.method2625(20296, 0);
                super.field2540.method2627(122, (class262) null);
                OpenGL.glUseProgramObjectARB(0L);
                this.field2362 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)Z", line = 29)
    public final boolean method77(byte arg0) {
        if (arg0 != -96) {
            return true;
        } else {
            ++field2355;
            return this.field2361;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZ)V", line = 41)
    public final void method84(boolean arg0, boolean arg1) {
        ++field2363;
        if (!arg0) {
            this.method84(true, false);
        }
        class327 var3 = super.field2540.method2681(-21692);
        if (this.field2361 && var3 != null) {
            float var4 = (-Math.abs(super.field2540.field6448[1]) + 1.0F) * 2.0F + 1.0F;
            super.field2540.method2625(20296, 1);
            super.field2540.method2627(118, var3);
            super.field2540.method2625(20296, 0);
            super.field2540.method2627(26, this.field2364.field2821);
            long var5 = this.field2359.field6786;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field2540.field6448[0], -super.field2540.field6448[1], -super.field2540.field6448[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field2540.field6498 * var4, super.field2540.field6494 * var4, super.field2540.field6439 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field2540.field6448[1]) + 64.0F);
            this.field2362 = true;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lag;Lica;)V", line = 131)
    public class165(class469 arg0, class215 arg1) {
        super(arg0);
        this.field2364 = arg1;
        if (this.field2364.field2821 != null && super.field2540.field6540 && super.field2540.field6454) {
            class451 var3 = class362.method2116((byte) -48, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field2540, 35633);
            class451 var4 = class362.method2116((byte) -48, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field2540, 35632);
            this.field2359 = class482.method2780((byte) -53, super.field2540, new class451[] { var3, var4 });
            this.field2361 = this.field2359 != null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILvfa;B)V", line = 77)
    public final void method83(int arg0, class262 arg1, byte arg2) {
        if (!this.field2362) {
            super.field2540.method2627(99, arg1);
            super.field2540.method2650((byte) -118, arg0);
        }
        ++field2365;
        if (arg2 <= 87) {
            field2367 = 2;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V", line = 94)
    public final void method81(int arg0, int arg1, int arg2) {
        if (arg0 == 2) {
            if (this.field2362) {
                int var4 = 1 << (arg2 & 3);
                float var5 = (float) (1 << ((arg2 & 56) >> 3)) / 32.0F;
                int var6 = arg1 & 65535;
                float var7 = (float) ((arg1 & 221988) >> 16) / 8.0F;
                float var8 = (float) (arg1 >> 19 & 15) / 16.0F;
                float var9 = (float) (15 & arg1 >> 23) / 16.0F;
                int var10 = (2073399010 & arg1) >> 27;
                long var11 = this.field2359.field6786;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field2540.field6393 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
            }
            ++field2358;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)V", line = 150)
    public final void method79(boolean arg0, int arg1) {
        ++field2360;
        if (arg1 >= -21) {
            this.method84(false, false);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V", line = 169)
    public static void method1011(byte arg0) {
        field2357 = null;
        field2368 = null;
        field2366 = null;
        if (arg0 >= -59) {
            method1011((byte) 81);
        }
        field2371 = null;
        field2370 = null;
    }
}
