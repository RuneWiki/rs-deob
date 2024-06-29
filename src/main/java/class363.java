import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class363 extends class675 {

    @OriginalMember(owner = "client!gha", name = "k", descriptor = "Z")
    private boolean field5253 = false;

    @OriginalMember(owner = "client!gha", name = "l", descriptor = "Z")
    private boolean field5254 = false;

    @OriginalMember(owner = "client!gha", name = "n", descriptor = "Lb;")
    private class350 field5256;

    @OriginalMember(owner = "client!gha", name = "o", descriptor = "Lgb;")
    private class223 field5257;

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!gha", name = "g", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!gha", name = "h", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!gha", name = "i", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!gha", name = "m", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "Lag;")
    public static class710 field5244;

    @OriginalMember(owner = "client!gha", name = "j", descriptor = "Lip;")
    public static class734 field5252;

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method1347(byte arg0) {
        if (arg0 < 105) {
            return false;
        } else {
            ++field5251;
            return this.field5254;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZZIIIII)V", line = 17)
    public static final void method2268(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 0) {
            field5244 = null;
        }
        if (arg3 < arg2) {
            int var7 = (arg2 + arg3) / 2;
            int var8 = arg3;
            class162 var9 = class194.field2859[var7];
            class194.field2859[var7] = class194.field2859[arg2];
            class194.field2859[arg2] = var9;
            for (int var10 = arg3; ~arg2 < ~var10; ++var10) {
                if (class662.method3771(arg5, arg0, -94, arg4, var9, arg1, class194.field2859[var10]) <= 0) {
                    class162 var11 = class194.field2859[var10];
                    class194.field2859[var10] = class194.field2859[var8];
                    class194.field2859[var8++] = var11;
                }
            }
            class194.field2859[arg2] = class194.field2859[var8];
            class194.field2859[var8] = var9;
            method2268(arg0, arg1, var8 + -1, arg3, arg4, arg5, 0);
            method2268(arg0, arg1, arg2, var8 - -1, arg4, arg5, 0);
        }
        ++field5245;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZLrv;)Lrl;", line = 62)
    public static final class751 method2269(boolean arg0, class120 arg1) {
        arg1.method842(2384);
        ++field5248;
        int var2 = arg1.method842(2384);
        class751 var3 = class434.method2600((byte) -99, var2);
        var3.field10414 = arg1.method842(2384);
        int var4 = arg1.method842(2384);
        for (int var5 = 0; var5 < var4; ++var5) {
            int var6 = arg1.method842(2384);
            var3.method309(89, arg1, var6);
        }
        if (arg0) {
            return null;
        } else {
            var3.method1454((byte) 124);
            return var3;
        }
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lkv;Lb;)V", line = 100)
    public class363(class280 arg0, class350 arg1) {
        super(arg0);
        this.field5256 = arg1;
        if (this.field5256.field5114 != null && super.field9618.field4246 && super.field9618.field4287) {
            class466 var3 = class535.method3097(35633, true, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field9618);
            class466 var4 = class535.method3097(35632, true, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field9618);
            this.field5257 = class435.method2606(new class466[] { var3, var4 }, super.field9618, false);
            this.field5254 = this.field5257 != null;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lfia;IZ)V", line = 118)
    public final void method1348(class599 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field5252 = null;
        }
        ++field5247;
        if (!this.field5253) {
            super.field9618.method1840(arg0, 2205);
            super.field9618.method1889(false, arg1);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZZ)V", line = 136)
    public final void method1350(boolean arg0, boolean arg1) {
        ++field5246;
        if (arg1) {
            this.field5257 = null;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(III)V", line = 146)
    public final void method1351(int arg0, int arg1, int arg2) {
        if (this.field5253) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            float var8 = (float) ((arg2 & 8307311) >> 19) / 16.0F;
            float var9 = (float) ((arg2 & 132324878) >> 23) / 16.0F;
            int var10 = (2026695387 & arg2) >> 27;
            long var11 = this.field5257.field3200;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field9618.field4167 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field5255;
        if (arg1 != 8865) {
            method2269(false, (class120) null);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZI)V", line = 184)
    public final void method1354(boolean arg0, int arg1) {
        if (arg1 == -24765) {
            ++field5249;
            class314 var3 = super.field9618.method1848((byte) 121);
            if (this.field5254 && var3 != null) {
                float var4 = 2.0F * (1.0F - Math.abs(super.field9618.field4260[1])) + 1.0F;
                super.field9618.method1825(1, -95);
                super.field9618.method1840(var3, 2205);
                super.field9618.method1825(0, -66);
                super.field9618.method1840(this.field5256.field5114, 2205);
                long var5 = this.field5257.field3200;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field9618.field4260[0], -super.field9618.field4260[1], -super.field9618.field4260[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field9618.field4232 * var4, super.field9618.field4220 * var4, super.field9618.field4203 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + Math.abs(super.field9618.field4260[1]) * 928.0F);
                this.field5253 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V", line = 218)
    public final void method1353(byte arg0) {
        ++field5250;
        if (this.field5253) {
            super.field9618.method1825(1, -48);
            super.field9618.method1840((class599) null, 2205);
            super.field9618.method1825(0, 126);
            super.field9618.method1840((class599) null, 2205);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5253 = false;
        }
        if (arg0 != 52) {
            this.field5254 = true;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)V", line = 241)
    public static void method2270(int arg0) {
        if (arg0 == -26160) {
            field5252 = null;
            field5244 = null;
        }
    }
}
