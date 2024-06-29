import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class287 extends class446 {

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Z")
    private boolean field4339 = false;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Z")
    private boolean field4345 = false;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Lai;")
    private class428 field4344;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lvo;")
    private class32 field4338;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "[I")
    public static int[] field4340 = new int[13];

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)Z")
    public final boolean method691(byte arg0) {
        if (arg0 != -93) {
            this.field4344 = null;
        }
        ++field4349;
        return this.field4345;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    public static void method1799(int arg0) {
        if (arg0 != 1) {
            method1799(105);
        }
        field4340 = null;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)V")
    public static final void method1800(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            ++field4341;
            if (~class137.field2308 != ~arg0) {
                class460.field6860 = new int[arg0];
                for (int var3 = 0; ~arg0 < ~var3; ++var3) {
                    class460.field6860[var3] = (var3 << 12) / arg0;
                }
                class137.field2308 = arg0;
                class379.field5549 = arg0 * 32;
                class308.field4672 = arg0 + -1;
            }
            if (~class278.field4199 != ~arg1) {
                if (~class137.field2308 != ~arg1) {
                    class44.field795 = new int[arg1];
                    for (int var4 = 0; ~var4 > ~arg1; ++var4) {
                        class44.field795[var4] = (var4 << 12) / arg1;
                    }
                } else {
                    class44.field795 = class460.field6860;
                }
                class278.field4199 = arg1;
                class359.field5269 = arg1 + -1;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BZ)V")
    public final void method695(byte arg0, boolean arg1) {
        ++field4348;
        if (arg0 != -33) {
            this.method691((byte) -51);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
    public final void method689(int arg0, int arg1, int arg2) {
        if (this.field4339) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((arg2 & 260972) >> 16) / 8.0F;
            float var8 = (float) (arg2 >> 19 & 15) / 16.0F;
            float var9 = (float) ((133634431 & arg2) >> 23) / 16.0F;
            int var10 = 15 & arg2 >> 27;
            long var11 = this.field4338.field504;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field6642.field806 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field4342;
        if (arg0 != -1) {
            method1801(40, (class388) null);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public final void method688(int arg0) {
        if (this.field4339) {
            super.field6642.method392((byte) 106, 1);
            super.field6642.method381((byte) 28, (class381) null);
            super.field6642.method392((byte) 106, 0);
            super.field6642.method381((byte) 28, (class381) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4339 = false;
        }
        if (arg0 <= 5) {
            this.method691((byte) -115);
        }
        ++field4350;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZB)V")
    public final void method696(boolean arg0, byte arg1) {
        ++field4343;
        class46 var3 = super.field6642.method395(arg1);
        if (this.field4345 && var3 != null) {
            float var4 = 2.0F * (-Math.abs(super.field6642.field863[1]) + 1.0F) + 1.0F;
            super.field6642.method392((byte) 106, 1);
            super.field6642.method381((byte) 28, var3);
            super.field6642.method392((byte) 106, 0);
            super.field6642.method381((byte) 28, this.field4344.field6407);
            long var5 = this.field4338.field504;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field6642.field863[0], -super.field6642.field863[1], -super.field6642.field863[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field6642.field862 * var4, super.field6642.field864 * var4, super.field6642.field919 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field6642.field863[1]));
            this.field4339 = true;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILgh;)Lgh;")
    public static final class388 method1801(int arg0, class388 arg1) {
        ++field4347;
        if (arg0 != -2093830196) {
            field4340 = null;
        }
        class388 var2 = client.method1375(arg1);
        if (var2 == null) {
            var2 = arg1.field5825;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lda;Lai;)V")
    public class287(class44 arg0, class428 arg1) {
        super(arg0);
        this.field4344 = arg1;
        if (this.field4344.field6407 != null && super.field6642.field859 && super.field6642.field887) {
            class466 var3 = class257.method1658(35633, super.field6642, 2, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class466 var4 = class257.method1658(35632, super.field6642, 2, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field4338 = class244.method1592(false, super.field6642, new class466[] { var3, var4 });
            this.field4345 = this.field4338 != null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILac;)V")
    public final void method694(int arg0, int arg1, class381 arg2) {
        if (arg1 == 0) {
            ++field4337;
            if (!this.field4339) {
                super.field6642.method381((byte) 28, arg2);
                super.field6642.method288((byte) 81, arg0);
            }
        }
    }
}
