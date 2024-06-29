import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class422 extends class246 {

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "Z")
    private boolean field6135 = false;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "Z")
    private boolean field6132 = false;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "Lrk;")
    private class339 field6144;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "Lie;")
    private class88 field6133;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field6142 = 0;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "Lmg;")
    public static class530 field6134 = new class530();

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "[I")
    public static int[] field6136;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)V", line = 5)
    public final void method743(boolean arg0, byte arg1) {
        ++field6138;
        if (arg1 >= 83) {
            class490 var3 = super.field3361.method2002(0);
            if (this.field6135 && var3 != null) {
                float var4 = (-Math.abs(super.field3361.field4768[1]) + 1.0F) * 2.0F + 1.0F;
                super.field3361.method1990(false, 1);
                super.field3361.method1977(var3, true);
                super.field3361.method1990(false, 0);
                super.field3361.method1977(this.field6144.field4917, true);
                long var5 = this.field6133.field1425;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field3361.field4768[0], -super.field3361.field4768[1], -super.field3361.field4768[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field3361.field4787 * var4, super.field3361.field4845 * var4, super.field3361.field4859 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field3361.field4768[1]) + 64.0F);
                this.field6132 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)Z", line = 37)
    public final boolean method738(byte arg0) {
        ++field6141;
        return arg0 <= 99 ? true : this.field6135;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 51)
    public final void method739(int arg0) {
        int var2 = -116 % ((-80 - arg0) / 32);
        if (this.field6132) {
            super.field3361.method1990(false, 1);
            super.field3361.method1977((class128) null, true);
            super.field3361.method1990(false, 0);
            super.field3361.method1977((class128) null, true);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6132 = false;
        }
        ++field6140;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V", line = 71)
    public static final void method2522(int arg0, int arg1) {
        class149.field2304 = 3;
        class65.field944 = -1;
        ++field6130;
        class203.field2940 = 100;
        if (arg1 == 1) {
            class437.field6306 = arg0;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V", line = 85)
    public final void method740(boolean arg0, int arg1) {
        ++field6139;
        if (arg1 != 26715) {
            field6136 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIII)V", line = 97)
    public static final void method2523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~arg2 >= ~class233.field3241 && arg1 >= class23.field320) {
            boolean var6;
            if (~class519.field7633 < ~arg5) {
                arg5 = class519.field7633;
                var6 = false;
            } else if (class375.field5387 < arg5) {
                var6 = false;
                arg5 = class375.field5387;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg3 < class519.field7633) {
                var7 = false;
                arg3 = class519.field7633;
            } else if (arg3 <= class375.field5387) {
                var7 = true;
            } else {
                var7 = false;
                arg3 = class375.field5387;
            }
            if (~arg2 > ~class23.field320) {
                arg2 = class23.field320;
            } else {
                class188.method1259(arg5, (byte) 27, arg3, arg0, class42.field626[arg2++]);
            }
            if (~arg1 < ~class233.field3241) {
                arg1 = class233.field3241;
            } else {
                class188.method1259(arg5, (byte) 27, arg3, arg0, class42.field626[arg1--]);
            }
            if (var6 && var7) {
                for (int var8 = arg2; arg1 >= var8; ++var8) {
                    int[] var9 = class42.field626[var8];
                    var9[arg5] = var9[arg3] = arg0;
                }
            } else if (!var6) {
                if (var7) {
                    for (int var10 = arg2; ~arg1 <= ~var10; ++var10) {
                        class42.field626[var10][arg3] = arg0;
                    }
                }
            } else {
                for (int var11 = arg2; arg1 >= var11; ++var11) {
                    class42.field626[var11][arg5] = arg0;
                }
            }
        }
        if (arg4 != 438908784) {
            method2522(95, 52);
        }
        ++field6131;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BII)V", line = 204)
    public final void method744(byte arg0, int arg1, int arg2) {
        if (this.field6132) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            float var8 = (float) (15 & arg2 >> 19) / 16.0F;
            float var9 = (float) ((arg2 & 130404974) >> 23) / 16.0F;
            int var10 = (2049930208 & arg2) >> 27;
            long var11 = this.field6133.field1425;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field3361.field4724 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg0 != 53) {
            this.method743(false, (byte) -65);
        }
        ++field6137;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lpg;Lrk;)V", line = 278)
    public class422(class333 arg0, class339 arg1) {
        super(arg0);
        this.field6144 = arg1;
        if (this.field6144.field4917 != null && super.field3361.field4818 && super.field3361.field4756) {
            class508 var3 = class510.method3025(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field3361, (byte) 67);
            class508 var4 = class510.method3025(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field3361, (byte) -96);
            this.field6133 = class370.method2208(new class508[] { var3, var4 }, super.field3361, false);
            this.field6135 = this.field6133 != null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILfg;I)V", line = 245)
    public final void method742(int arg0, class128 arg1, int arg2) {
        if (!this.field6132) {
            super.field3361.method1977(arg1, true);
            super.field3361.method1966(-1, arg2);
        }
        if (arg0 != 4) {
            field6145 = -3;
        }
        ++field6143;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(B)V", line = 262)
    public static void method2524(byte arg0) {
        if (arg0 != -117) {
            field6142 = 124;
        }
        field6136 = null;
        field6134 = null;
    }
}
