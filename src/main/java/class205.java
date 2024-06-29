import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class205 extends class702 {

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Z")
    private boolean field2456 = false;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "Z")
    private boolean field2466 = false;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Lwca;")
    private class628 field2461;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "Lfr;")
    private class378 field2464;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field2465 = 104;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Lf;")
    public static class701 field2454;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1002(boolean arg0) {
        if (this.field2466) {
            super.field9912.method2975(1, 75);
            super.field9912.method2932(arg0, (class197) null);
            super.field9912.method2975(0, 123);
            super.field9912.method2932(true, (class197) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2466 = false;
        }
        if (!arg0) {
            this.field2456 = false;
        }
        ++field2458;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BIIIIII)V", line = 25)
    public static final void method1237(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2460;
        int var7 = class396.method2393(class598.field8632, class288.field3883, 5890, arg4);
        int var8 = class396.method2393(class598.field8632, class288.field3883, 5890, arg3);
        int var9 = class396.method2393(class587.field8513, class221.field2866, 5890, arg5);
        int var10 = class396.method2393(class587.field8513, class221.field2866, 5890, arg1);
        int var11 = class396.method2393(class598.field8632, class288.field3883, 5890, arg4 + arg6);
        int var12 = class396.method2393(class598.field8632, class288.field3883, 5890, -arg6 + arg3);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class359.method2018(class678.field9722[var13], var10, -63, arg2, var9);
        }
        int var14 = var8;
        int var15 = -88 / ((arg0 - -79) / 38);
        while (var12 < var14) {
            class359.method2018(class678.field9722[var14], var10, -108, arg2, var9);
            --var14;
        }
        int var16 = class396.method2393(class587.field8513, class221.field2866, 5890, arg5 + arg6);
        int var17 = class396.method2393(class587.field8513, class221.field2866, 5890, arg1 - arg6);
        for (int var18 = var11; ~var18 >= ~var12; ++var18) {
            int[] var19 = class678.field9722[var18];
            class359.method2018(var19, var16, -37, arg2, var9);
            class359.method2018(var19, var10, 82, arg2, var17);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V", line = 76)
    public final void method1001(int arg0, int arg1, int arg2) {
        ++field2463;
        int var4 = -73 % ((55 - arg1) / 36);
        if (this.field2466) {
            int var5 = 1 << (3 & arg0);
            float var6 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var7 = 65535 & arg2;
            float var8 = (float) ((arg2 & 243025) >> 16) / 8.0F;
            float var9 = (float) ((arg2 & 8094309) >> 19) / 16.0F;
            float var10 = (float) ((131607133 & arg2) >> 23) / 16.0F;
            int var11 = arg2 >> 27 & 15;
            long var12 = this.field2464.field5078;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "time"), (float) (super.field9912.field7264 * var5 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "scale"), var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "breakWaterDepth"), (float) var7);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "breakWaterOffset"), var8);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var12, "waveIntensity"), var10, var9);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "waveExponent"), (float) var11);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)V", line = 114)
    public final void method1005(boolean arg0, int arg1) {
        ++field2455;
        class187 var3 = super.field9912.method2930(127);
        if (arg1 <= -102) {
            if (this.field2456 && var3 != null) {
                float var4 = (-Math.abs(super.field9912.field7324[1]) + 1.0F) * 2.0F + 1.0F;
                super.field9912.method2975(1, 96);
                super.field9912.method2932(true, var3);
                super.field9912.method2975(0, 73);
                super.field9912.method2932(true, this.field2461.field9006);
                long var5 = this.field2464.field5078;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field9912.field7324[0], -super.field9912.field7324[1], -super.field9912.field7324[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field9912.field7330 * var4, super.field9912.field7376 * var4, super.field9912.field7307 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + Math.abs(super.field9912.field7324[1]) * 928.0F);
                this.field2466 = true;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lkga;Lwca;)V", line = 150)
    public class205(class506 arg0, class628 arg1) {
        super(arg0);
        this.field2461 = arg1;
        if (this.field2461.field9006 != null && super.field9912.field7386 && super.field9912.field7370) {
            class97 var3 = class161.method1021(super.field9912, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, -68);
            class97 var4 = class161.method1021(super.field9912, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, -69);
            this.field2464 = class339.method1957(new class97[] { var3, var4 }, super.field9912, (byte) -108);
            this.field2456 = this.field2464 != null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljf;II)V", line = 175)
    public final void method1004(class197 arg0, int arg1, int arg2) {
        if (!this.field2466) {
            super.field9912.method2932(true, arg0);
            super.field9912.method2985(arg1, -26973);
        }
        ++field2457;
        if (arg2 != 58) {
            field2454 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)Z", line = 191)
    public final boolean method998(boolean arg0) {
        ++field2459;
        if (arg0) {
            field2454 = null;
        }
        return this.field2456;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)V", line = 207)
    public static void method1238(byte arg0) {
        if (arg0 != -54) {
            field2454 = null;
        }
        field2454 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZ)V", line = 217)
    public final void method1000(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field2462;
        }
    }
}
