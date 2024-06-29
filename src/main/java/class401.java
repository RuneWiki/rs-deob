import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class401 extends class184 {

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Z")
    private boolean field5600 = false;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "Z")
    private boolean field5604 = false;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "Lqr;")
    private class64 field5598;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Las;")
    private class151 field5599;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field5603 = 0;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
    public static int field5610 = -1;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Loea;Lqr;)V")
    public class401(class594 arg0, class64 arg1) {
        super(arg0);
        this.field5598 = arg1;
        if (this.field5598.field1161 != null && super.field2626.field8613 && super.field2626.field8684) {
            class698 var3 = class656.method3697(35633, 0, super.field2626, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class698 var4 = class656.method3697(35632, 0, super.field2626, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field5599 = class701.method3942(new class698[] { var3, var4 }, super.field2626, -123);
            this.field5600 = this.field5599 != null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
    public final void method702(boolean arg0) {
        if (this.field5604) {
            super.field2626.method3413(1, 33984);
            super.field2626.method3425((class87) null, -56);
            super.field2626.method3413(0, 33984);
            super.field2626.method3425((class87) null, 77);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5604 = false;
        }
        ++field5607;
        if (!arg0) {
            this.field5598 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)V")
    public final void method704(boolean arg0, int arg1) {
        ++field5602;
        if (arg1 != -28981) {
            this.method699(-12, false);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)V")
    public final void method699(int arg0, boolean arg1) {
        ++field5597;
        class518 var3 = super.field2626.method3432(-120);
        if (this.field5600 && var3 != null) {
            float var4 = (-Math.abs(super.field2626.field8604[1]) + 1.0F) * 2.0F + 1.0F;
            super.field2626.method3413(1, 33984);
            super.field2626.method3425(var3, -40);
            super.field2626.method3413(0, 33984);
            super.field2626.method3425(this.field5598.field1161, 66);
            long var5 = this.field5599.field2282;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field2626.field8604[0], -super.field2626.field8604[1], -super.field2626.field8604[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field2626.field8637 * var4, super.field2626.field8663 * var4, super.field2626.field8643 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field2626.field8604[1]) + 64.0F);
            this.field5604 = true;
        }
        if (arg0 >= -54) {
            this.method700((class87) null, true, 94);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "([Ljava/lang/String;[SIII)V")
    public static final void method2477(String[] arg0, short[] arg1, int arg2, int arg3, int arg4) {
        if (arg4 == -9696) {
            ++field5605;
            if (arg3 < arg2) {
                int var5 = (arg2 + arg3) / 2;
                int var6 = arg3;
                String var7 = arg0[var5];
                arg0[var5] = arg0[arg2];
                arg0[arg2] = var7;
                short var8 = arg1[var5];
                arg1[var5] = arg1[arg2];
                arg1[arg2] = var8;
                for (int var9 = arg3; var9 < arg2; ++var9) {
                    if (var7 == null || arg0[var9] != null && ~arg0[var9].compareTo(var7) > ~(1 & var9)) {
                        String var10 = arg0[var9];
                        arg0[var9] = arg0[var6];
                        arg0[var6] = var10;
                        short var11 = arg1[var9];
                        arg1[var9] = arg1[var6];
                        arg1[var6++] = var11;
                    }
                }
                arg0[arg2] = arg0[var6];
                arg0[var6] = var7;
                arg1[arg2] = arg1[var6];
                arg1[var6] = var8;
                method2477(arg0, arg1, var6 + -1, arg3, -9696);
                method2477(arg0, arg1, arg2, var6 + 1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIZ)V")
    public final void method705(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method705(68, 22, false);
        }
        if (this.field5604) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << ((arg1 & 63) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) (3 & arg0 >> 16) / 8.0F;
            float var8 = (float) ((arg0 & 8188735) >> 19) / 16.0F;
            float var9 = (float) (arg0 >> 23 & 15) / 16.0F;
            int var10 = 15 & arg0 >> 27;
            long var11 = this.field5599.field2282;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field2626.field8544 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field5609;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lud;I)V")
    public static final void method2478(class35 arg0, int arg1) {
        ++field5606;
        for (int var2 = 0; class660.field9306 > var2; ++var2) {
            int var3 = arg0.method232((byte) 96);
            int var4 = arg0.method253(-13900);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class200.field2874[var3] != null) {
                class200.field2874[var3].field9247 = var4;
            }
        }
        if (arg1 >= -57) {
            method2478((class35) null, -5);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
    public final boolean method698(int arg0) {
        if (arg0 != -20958) {
            return true;
        } else {
            ++field5596;
            return this.field5600;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
    public static final void method2479(int arg0) {
        ++field5608;
        if (class341.field4796.field5141 && class397.field5562.field8324 != -1) {
            class578.method3347(class397.field5562.field8321, arg0 + 303881289, class397.field5562.field8324);
        }
        if (arg0 != -303881189) {
            method2478((class35) null, -59);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Liia;ZI)V")
    public final void method700(class87 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field5600 = false;
        }
        ++field5601;
        if (!this.field5604) {
            super.field2626.method3425(arg0, 90);
            super.field2626.method3417(arg2, 0);
        }
    }
}
