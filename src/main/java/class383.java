import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class383 extends class246 {

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "Z")
    private boolean field5497 = false;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "Z")
    private boolean field5494 = false;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "Lrk;")
    private class339 field5492;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "Lie;")
    private class88 field5499;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "Lkc;")
    public static class157 field5496 = new class157("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "Ldk;")
    public static class421 field5501;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "Ldk;")
    public static class421 field5505;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BII)V")
    public final void method744(byte arg0, int arg1, int arg2) {
        ++field5498;
        if (arg0 != 53) {
            field5501 = null;
        }
        if (this.field5497) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            long var8 = this.field5499.field1425;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field3361.field4724 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILdc;IIIZILdc;)V")
    public static final void method2272(int arg0, int arg1, int arg2, class16 arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, class16 arg9) {
        ++field5503;
        int var10 = arg3.method105(arg7);
        if (var10 != -1) {
            Object var11 = null;
            class359 var12 = (class359) class348.field5002.method2767((long) var10, 0);
            if (var12 == null) {
                class396[] var13 = class396.method2347(class509.field7453, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class275.field3737.method555(var13[0], true);
                class348.field5002.method2777(-1025, var12, (long) var10);
            }
            class17.method123(arg9.method116(8569) * 64, 0, arg9.field6279, arg2 >> 1, arg9.field6287, 5, arg9.field6284, arg8, arg5 >> 1, arg6);
            int var14 = class385.field5520[0] + arg0 + -18;
            int var15 = arg1 / 4 * 18 + var14;
            int var16 = class385.field5520[1] + arg4 + -16 + -54;
            int var17 = arg1 % 4 * 18 + var16;
            var12.method2142(var15, var17);
            if (arg3 == arg9) {
                class275.field3737.method1707((byte) 55, -256, 18, var17 + -1, 18, var15 + -1);
            }
            class221 var18 = class8.method56(-89);
            var18.field3118 = var17;
            var18.field3119 = var15;
            var18.field3123 = var17 + 16;
            var18.field3121 = var15 - -16;
            var18.field3120 = arg3;
            class240.field3321.method2599(1256, var18);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILfg;I)V")
    public final void method742(int arg0, class128 arg1, int arg2) {
        if (!this.field5497) {
            super.field3361.method1977(arg1, true);
            super.field3361.method1966(-1, arg2);
        }
        if (arg0 != 4) {
            this.method744((byte) -49, -75, 36);
        }
        ++field5495;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILat;II)V")
    public static final void method2273(int arg0, class444 arg1, int arg2, int arg3) {
        if (!class375.field5390) {
            for (int var4 = 9; var4 >= 5; --var4) {
                String var8 = class249.method1487(122, var4, arg1);
                if (var8 != null) {
                    class193.method1274(arg1.field6510, var8, true, class239.method1458((byte) -82, arg1, var4), arg1.field6409, arg1.field6481, arg1.field6469, 1002, false, true, (long) (var4 - -1));
                    ++class224.field3163;
                }
            }
            String var5 = class295.method1705(true, arg1);
            if (var5 != null) {
                class193.method1274(arg1.field6510, var5, true, arg1.field6545, arg1.field6409, arg1.field6481, arg1.field6469, 11, false, true, 0L);
                ++class98.field1559;
            }
            for (int var6 = 4; ~var6 <= -1; --var6) {
                String var7 = class249.method1487(118, var6, arg1);
                if (var7 != null) {
                    class193.method1274(arg1.field6510, var7, true, class239.method1458((byte) -82, arg1, var6), arg1.field6409, arg1.field6481, arg1.field6469, 23, false, true, (long) (var6 + 1));
                    ++class224.field3163;
                }
            }
            if (client.method3067(arg1).method2549(6)) {
                if (arg1.field6388 == null) {
                    class193.method1274(arg1.field6510, class135.field2055.method1126(class486.field6998, (byte) -19), true, -1, "", arg1.field6481, arg1.field6469, 8, false, true, 0L);
                } else {
                    class193.method1274(arg1.field6510, arg1.field6388, true, -1, "", arg1.field6481, arg1.field6469, 8, false, true, 0L);
                }
                ++class518.field7595;
            }
        } else {
            class145 var9 = ~class284.field3850 != 0 ? class365.field5241.method2181((byte) 111, class284.field3850) : null;
            if (client.method3067(arg1).method2553(false) && (32 & class107.field1737) != 0 && (var9 == null || arg1.method2616(-19977, var9.field2140, class284.field3850) != var9.field2140)) {
                ++class494.field7154;
                class193.method1274(arg1.field6510, class87.field1409, true, class484.field6965, class476.field6886 + " -> " + arg1.field6409, arg1.field6481, arg1.field6469, 25, false, true, 0L);
            }
        }
        ++field5500;
        if (arg0 != 8) {
            field5502 = 106;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)Z")
    public final boolean method738(byte arg0) {
        ++field5504;
        if (arg0 < 99) {
            this.field5497 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)V")
    public final void method740(boolean arg0, int arg1) {
        ++field5493;
        if (arg1 != 26715) {
            field5505 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public final void method739(int arg0) {
        ++field5490;
        int var2 = -54 / ((arg0 - -80) / 32);
        if (this.field5497) {
            super.field3361.method1990(false, 1);
            super.field3361.method1977((class128) null, true);
            super.field3361.method1990(false, 0);
            super.field3361.method1977((class128) null, true);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5497 = false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lpg;Lrk;)V")
    public class383(class333 arg0, class339 arg1) {
        super(arg0);
        this.field5492 = arg1;
        if (this.field5492.field4917 != null && super.field3361.field4818 && super.field3361.field4756) {
            class508 var3 = class510.method3025(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field3361, (byte) 64);
            class508 var4 = class510.method3025(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field3361, (byte) 122);
            this.field5499 = class370.method2208(new class508[] { var3, var4 }, super.field3361, false);
            this.field5494 = this.field5499 != null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZB)V")
    public final void method743(boolean arg0, byte arg1) {
        ++field5491;
        if (arg1 > 83) {
            class490 var3 = super.field3361.method2002(0);
            if (this.field5494 && var3 != null) {
                super.field3361.method1990(false, 1);
                super.field3361.method1977(var3, true);
                super.field3361.method1990(false, 0);
                super.field3361.method1977(this.field5492.field4917, true);
                long var4 = this.field5499.field1425;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field3361.field4768[0], -super.field3361.field4768[1], -super.field3361.field4768[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3361.field4787, super.field3361.field4845, super.field3361.field4859, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field3361.field4768[1]) * 928.0F + 96.0F);
                this.field5497 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
    public static void method2274(int arg0) {
        field5496 = null;
        field5501 = null;
        field5505 = null;
        if (arg0 != -18) {
            method2273(-37, (class444) null, -40, -93);
        }
    }
}
