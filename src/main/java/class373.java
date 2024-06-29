import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class373 extends class465 {

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Z")
    private boolean field5031 = false;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Z")
    private boolean field5036 = false;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lhm;")
    private class207 field5044;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lvca;")
    private class260 field5041;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5037 = null;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "[I")
    public static int[] field5042 = new int[4096];

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Los;")
    public static class412 field5039 = new class412(4, 1);

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Ljava/lang/String;")
    public static String field5045 = "";

    @OriginalMember(owner = "client!je", name = "y", descriptor = "S")
    public static short field5047 = 205;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "[I")
    public static int[] field5046;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[[B")
    public static byte[][] field5029;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method210(int arg0, boolean arg1) {
        int var3 = 47 % ((-30 - arg0) / 38);
        ++field5038;
        class592 var4 = super.field6268.method3633(50);
        if (this.field5031 && var4 != null) {
            float var5 = 1.0F + (-Math.abs(super.field6268.field9216[1]) + 1.0F) * 2.0F;
            super.field6268.method3629((byte) -111, 1);
            super.field6268.method3630(var4, -2);
            super.field6268.method3629((byte) -108, 0);
            super.field6268.method3630(this.field5044.field2973, -2);
            long var6 = this.field5041.field3572;
            OpenGL.glUseProgramObjectARB(var6);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var6, "sunDir"), -super.field6268.field9216[0], -super.field6268.field9216[1], -super.field6268.field9216[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var6, "sunColour"), super.field6268.field9239 * var5, super.field6268.field9214 * var5, super.field6268.field9324 * var5, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var6, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field6268.field9216[1]));
            this.field5036 = true;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLvj;)V", line = 33)
    public static final void method2197(boolean arg0, class411 arg1) {
        ++field5032;
        int var2 = -class642.field8626 + arg1.field5548;
        int var3 = arg1.field5589 * 512 - -(256 * arg1.method2317((byte) 40));
        if (arg0) {
            method2197(false, (class411) null);
        }
        int var4 = arg1.field5578 * 512 + 256 * arg1.method2317((byte) 40);
        arg1.field8620 += (var3 - arg1.field8620) / var2;
        arg1.field8612 += (var4 - arg1.field8612) / var2;
        arg1.field5644 = 0;
        if (arg1.field5627 == 0) {
            arg1.method2360(90, 8192);
        }
        if (arg1.field5627 == 1) {
            arg1.method2360(119, 12288);
        }
        if (arg1.field5627 == 2) {
            arg1.method2360(118, 0);
        }
        if (~arg1.field5627 == -4) {
            arg1.method2360(111, 4096);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 68)
    public final void method213(int arg0) {
        ++field5033;
        if (this.field5036) {
            super.field6268.method3629((byte) -106, 1);
            super.field6268.method3630((class367) null, -2);
            super.field6268.method3629((byte) -124, 0);
            super.field6268.method3630((class367) null, -2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5036 = false;
        }
        if (arg0 != 15495) {
            this.field5031 = true;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILhf;)V", line = 96)
    public final void method212(int arg0, int arg1, class367 arg2) {
        if (arg0 != 0) {
            field5045 = null;
        }
        ++field5035;
        if (!this.field5036) {
            super.field6268.method3630(arg2, -2);
            super.field6268.method3603((byte) -34, arg1);
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lno;Lhm;)V", line = 113)
    public class373(class658 arg0, class207 arg1) {
        super(arg0);
        this.field5044 = arg1;
        if (this.field5044.field2973 != null && super.field6268.field9281 && super.field6268.field9242) {
            class575 var3 = class421.method2422(super.field6268, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 0, 35633);
            class575 var4 = class421.method2422(super.field6268, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 0, 35632);
            this.field5041 = class168.method1149(new class575[] { var3, var4 }, false, super.field6268);
            this.field5031 = this.field5041 != null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V", line = 131)
    public final void method215(int arg0, int arg1, int arg2) {
        ++field5043;
        if (arg1 == 0) {
            if (this.field5036) {
                int var4 = 1 << (3 & arg2);
                float var5 = (float) (1 << ((58 & arg2) >> 3)) / 32.0F;
                int var6 = arg0 & 65535;
                float var7 = (float) (3 & arg0 >> 16) / 8.0F;
                float var8 = (float) ((arg0 & 8269961) >> 19) / 16.0F;
                float var9 = (float) ((arg0 & 131678538) >> 23) / 16.0F;
                int var10 = arg0 >> 27 & 15;
                long var11 = this.field5041.field3572;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field6268.field9186 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V", line = 168)
    public static void method2198(int arg0) {
        field5029 = null;
        field5039 = null;
        field5046 = null;
        field5045 = null;
        if (arg0 > -39) {
            field5039 = null;
        }
        field5042 = null;
        field5037 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIBIILdv;Z)V", line = 185)
    public static final void method2199(int arg0, int arg1, byte arg2, int arg3, int arg4, class616 arg5, boolean arg6) {
        ++field5040;
        if (arg2 < 85) {
            field5047 = 14;
        }
        if (class273.field3798 < 50) {
            if (arg5 != null && arg5.field8166 != null && arg4 < arg5.field8166.length && arg5.field8166[arg4] != null) {
                int var7 = arg5.field8166[arg4][0];
                int var8 = var7 >> 8;
                int var9 = (var7 & 252) >> 5;
                if (arg5.field8166[arg4].length > 1) {
                    int var10 = (int) (Math.random() * (double) arg5.field8166[arg4].length);
                    if (var10 > 0) {
                        var8 = arg5.field8166[arg4][var10];
                    }
                }
                int var11 = var7 & 31;
                if (~var11 == -1) {
                    if (arg6) {
                        if (!arg5.field8168) {
                            class506.method2810(var9, -51, 255, 0, var8);
                            return;
                        }
                        class505.method2800(0, 255, true, var8, false, var9);
                    }
                } else if (~class344.field4718.field5414 != -1) {
                    int var12 = arg1 + -256 >> 9;
                    int var13 = arg3 + -256 >> 9;
                    class653.field8828[class273.field3798++] = new class70((byte) (arg5.field8168 ? 2 : 1), var8, var9, 0, 255, (arg0 << 24) + (var12 << 16) + (var13 << 8) + var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)Z", line = 253)
    public final boolean method218(int arg0) {
        if (arg0 < 110) {
            method2197(false, (class411) null);
        }
        ++field5034;
        return this.field5031;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BZ)V", line = 268)
    public final void method214(byte arg0, boolean arg1) {
        if (arg0 == 99) {
            ++field5030;
        }
    }
}
