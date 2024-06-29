import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class233 extends class190 {

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "Z")
    private boolean field3429 = false;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "Z")
    private boolean field3427 = false;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "Llm;")
    private class307 field3423;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "Lvv;")
    private class640 field3425;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "[I")
    public static int[] field3424 = new int[200];

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    public static int field3426 = 1406;

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "I")
    public static int field3435 = 0;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!wda", name = "u", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "Lra;")
    public static class259 field3431;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(B)V")
    public static void method1520(byte arg0) {
        field3424 = null;
        if (arg0 < 39) {
            method1520((byte) 126);
        }
        field3431 = null;
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ljj;Llm;)V")
    public class233(class66 arg0, class307 arg1) {
        super(arg0);
        this.field3423 = arg1;
        if (this.field3423.field4414 != null && super.field2722.field1256 && super.field2722.field1167) {
            class119 var3 = class20.method223(35633, super.field2722, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", true);
            class119 var4 = class20.method223(35632, super.field2722, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", true);
            this.field3425 = class626.method3551(new class119[] { var3, var4 }, 123, super.field2722);
            this.field3427 = this.field3425 != null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)Z")
    public final boolean method928(int arg0) {
        ++field3422;
        int var2 = 117 % ((arg0 - -7) / 57);
        return this.field3427;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZB)V")
    public final void method919(boolean arg0, byte arg1) {
        ++field3433;
        class498 var3 = super.field2722.method630((byte) -85);
        int var4 = 39 / ((-55 - arg1) / 47);
        if (this.field3427 && var3 != null) {
            float var5 = 1.0F + 2.0F * (-Math.abs(super.field2722.field1247[1]) + 1.0F);
            super.field2722.method654(false, 1);
            super.field2722.method648(103, var3);
            super.field2722.method654(false, 0);
            super.field2722.method648(104, this.field3423.field4414);
            long var6 = this.field3425.field9286;
            OpenGL.glUseProgramObjectARB(var6);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var6, "sunDir"), -super.field2722.field1247[0], -super.field2722.field1247[1], -super.field2722.field1247[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var6, "sunColour"), super.field2722.field1262 * var5, super.field2722.field1161 * var5, super.field2722.field1208 * var5, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var6, "sunExponent"), 928.0F * Math.abs(super.field2722.field1247[1]) + 64.0F);
            this.field3429 = true;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IBIIIIIZI)Z")
    public static final boolean method1521(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (arg1 > -72) {
            method1521(-123, (byte) 83, -22, -95, 57, -54, 0, true, 40);
        }
        ++field3430;
        int var9 = class644.field9367.field1571[0];
        int var10 = class644.field9367.field1572[0];
        if (var9 >= 0 && var9 < class146.field2247 && ~var10 <= -1 && var10 < class66.field990) {
            if (arg5 >= 0 && ~arg5 > ~class146.field2247 && ~arg0 <= -1 && ~arg0 > ~class66.field990) {
                int var11 = class503.method2851(arg5, arg0, class268.field3916[class644.field9367.field5116], class2.field15, arg8, arg2, class648.field9391, var9, var10, false, arg4, class644.field9367.method781((byte) -89), arg6, arg3, arg7);
                if (~var11 > -2) {
                    return false;
                } else {
                    class476.field6810 = class648.field9391[var11 + -1];
                    class439.field6391 = class2.field15[var11 + -1];
                    class624.field8810 = false;
                    class406.method2468((byte) -15);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)V")
    public final void method926(byte arg0) {
        if (this.field3429) {
            super.field2722.method654(false, 1);
            super.field2722.method648(-88, (class222) null);
            super.field2722.method654(false, 0);
            super.field2722.method648(88, (class222) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3429 = false;
        }
        if (arg0 < -102) {
            ++field3420;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(III)V")
    public final void method925(int arg0, int arg1, int arg2) {
        ++field3432;
        if (this.field3429) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((58 & arg0) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            float var8 = (float) (arg2 >> 19 & 15) / 16.0F;
            float var9 = (float) ((arg2 & 131196920) >> 23) / 16.0F;
            int var10 = arg2 >> 27 & 15;
            long var11 = this.field3425.field9286;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field2722.field1135 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg1 != 0) {
            field3426 = 115;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILaba;I)V")
    public final void method927(int arg0, class222 arg1, int arg2) {
        ++field3428;
        if (!this.field3429) {
            super.field2722.method648(76, arg1);
            super.field2722.method634(7, arg0);
        }
        if (arg2 != 20731) {
            this.method927(-80, (class222) null, -113);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZI)V")
    public final void method921(boolean arg0, int arg1) {
        ++field3421;
        if (arg1 != 25747) {
            this.method926((byte) 93);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIZIZI)V")
    public static final void method1522(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        if (arg0 != 2) {
            field3431 = null;
        }
        ++field3434;
        if (~arg2 > ~arg4) {
            int var7 = (arg2 - -arg4) / 2;
            int var8 = arg2;
            class225 var9 = class445.field6493[var7];
            class445.field6493[var7] = class445.field6493[arg4];
            class445.field6493[arg4] = var9;
            for (int var10 = arg2; ~var10 > ~arg4; ++var10) {
                if (class612.method3473(var9, false, arg5, arg6, arg1, class445.field6493[var10], arg3) <= 0) {
                    class225 var11 = class445.field6493[var10];
                    class445.field6493[var10] = class445.field6493[var8];
                    class445.field6493[var8++] = var11;
                }
            }
            class445.field6493[arg4] = class445.field6493[var8];
            class445.field6493[var8] = var9;
            method1522(2, arg1, arg2, arg3, var8 + -1, arg5, arg6);
            method1522(2, arg1, var8 - -1, arg3, arg4, arg5, arg6);
        }
    }
}
