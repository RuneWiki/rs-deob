import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class218 extends class460 {

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "Z")
    private boolean field3271 = false;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "Z")
    private boolean field3273 = false;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "Lul;")
    private class440 field3276;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "Lqn;")
    private class476 field3264;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "[I")
    public static int[] field3274 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1168(int arg0) {
        ++field3263;
        return arg0 != 2048 ? false : false;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZLjava/lang/String;BLjava/lang/String;)V", line = 14)
    public static final void method1466(boolean arg0, String arg1, byte arg2, String arg3) {
        if (arg2 == -74) {
            class330.field4563 = arg3;
            class616.field8808 = arg1;
            class684.field9724 = arg0;
            ++field3265;
            if (class684.field9724 || class133.field2155 == 3 || !class616.field8808.equals("") && !class330.field4563.equals("")) {
                class253.field3666 = false;
                if (~class133.field2155 != -2) {
                    class38.field510 = -1;
                    class461.field6628 = 0;
                }
                class562.method3287(-3, arg2 ^ 74);
                class498.field7413 = 0;
                class3.field39 = 0;
                class160.field2597 = 1;
            } else {
                class562.method3287(3, -4);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjo;I)V", line = 47)
    public final void method1169(int arg0, class337 arg1, int arg2) {
        int var4 = -105 % ((arg2 - 65) / 53);
        if (!this.field3273) {
            super.field6621.method2295((byte) -121, arg1);
            super.field6621.method2270(arg0, (byte) 110);
        }
        ++field3268;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 63)
    public final void method1174(byte arg0) {
        if (arg0 >= -56) {
            this.field3271 = true;
        }
        if (this.field3273) {
            super.field6621.method2308(1, -15115);
            super.field6621.method2295((byte) -115, (class337) null);
            super.field6621.method2308(0, -15115);
            super.field6621.method2295((byte) 95, (class337) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3273 = false;
        }
        ++field3266;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BZ)V", line = 83)
    public final void method1177(byte arg0, boolean arg1) {
        ++field3270;
        int var3 = -86 / ((-85 - arg0) / 38);
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lkfa;Lul;)V", line = 92)
    public class218(class382 arg0, class440 arg1) {
        super(arg0);
        this.field3276 = arg1;
        if (this.field3276.field6372 != null && super.field6621.field5529 && super.field6621.field5599) {
            class189 var3 = class697.method3921(super.field6621, 35633, 8, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class189 var4 = class697.method3921(super.field6621, 35632, 8, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field3264 = class358.method2161(0, new class189[] { var3, var4 }, super.field6621);
            this.field3271 = this.field3264 != null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)V", line = 111)
    public final void method1175(boolean arg0, int arg1) {
        ++field3275;
        class656 var3 = super.field6621.method2335(arg1);
        if (this.field3271 && var3 != null) {
            super.field6621.method2308(1, arg1 + -15115);
            super.field6621.method2295((byte) -120, var3);
            super.field6621.method2308(0, -15115);
            super.field6621.method2295((byte) -108, this.field3276.field6372);
            long var4 = this.field3264.field6820;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field6621.field5596[0], super.field6621.field5596[1], super.field6621.field5596[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field6621.field5588, super.field6621.field5547, super.field6621.field5504, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field6621.field5596[1]) + 96.0F);
            this.field3273 = true;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V", line = 137)
    public static void method1467(byte arg0) {
        field3274 = null;
        if (arg0 <= 94) {
            method1466(false, (String) null, (byte) -99, (String) null);
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)Z", line = 152)
    public static final boolean method1468(int arg0) {
        ++field3262;
        boolean var1 = true;
        if (class606.field8722 == null) {
            if (!class468.field6754.method2077(0, class242.field3550)) {
                var1 = false;
            } else {
                class606.field8722 = class628.method3537(class468.field6754, class242.field3550);
            }
        }
        if (arg0 != 26851) {
            return true;
        } else {
            if (class648.field9186 == null) {
                if (!class468.field6754.method2077(0, class699.field9905)) {
                    var1 = false;
                } else {
                    class648.field9186 = class628.method3537(class468.field6754, class699.field9905);
                }
            }
            if (class180.field2853 == null) {
                if (class468.field6754.method2077(0, class331.field4573)) {
                    class180.field2853 = class628.method3537(class468.field6754, class331.field4573);
                } else {
                    var1 = false;
                }
            }
            if (class115.field1830 == null) {
                if (class399.field5771.method2077(0, class681.field9698)) {
                    class115.field1830 = class61.method514(class399.field5771, class681.field9698, -1);
                } else {
                    var1 = false;
                }
            }
            if (class590.field8597 == null) {
                if (class468.field6754.method2077(arg0 + -26851, class681.field9698)) {
                    class590.field8597 = class628.method3538(class468.field6754, class681.field9698);
                } else {
                    var1 = false;
                }
            }
            return var1;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lr;B)V", line = 225)
    public static final void method1469(class98 arg0, byte arg1) {
        ++field3267;
        arg0.method771(0, 0, class465.field6689, 350);
        arg0.method824(0, 0, class465.field6689, 350, 3351159 | class540.field7926 << 24, 1);
        int var2 = 350 / class397.field5751;
        if (~class487.field6943 < -1) {
            int var3 = -class397.field5751 + -4 + 346;
            int var4 = var2 * var3 / (var2 - 1 + class487.field6943);
            int var5 = 4;
            if (~class487.field6943 < -2) {
                var5 += (class487.field6943 + -1 - class303.field4250) * (-var4 + var3) / (class487.field6943 + -1);
            }
            arg0.method824(class465.field6689 + -16, var5, 12, var4, class540.field7926 << 24 | 3351159, 2);
            for (int var6 = class303.field4250; class303.field4250 + var2 > var6 && var6 < class487.field6943; ++var6) {
                String[] var7 = class6.method26(class679.field9668[var6], (byte) 65, '\b');
                int var8 = (class465.field6689 + -8 + -16) / var7.length;
                for (int var9 = 0; var7.length > var9; ++var9) {
                    int var10 = var8 * var9 + 8;
                    arg0.method771(var10, 0, var8 + var10 + -8, 350);
                    class335.field4670.method2394((byte) 125, var10, class141.method1098(0, var7[var9]), -16777216, -1, -class399.field5763.field7041 + 350 + -class105.field1743 + -2 - (-class303.field4250 + var6) * class397.field5751);
                }
            }
        }
        class424.field6054.method2403(63409608, -1, 330, class465.field6689 + -25, -16777216, "Build: 624");
        arg0.method771(0, 0, class465.field6689, 350);
        if (arg1 >= -64) {
            field3274 = null;
        }
        arg0.method773(-class105.field1743 + 350, 128, class465.field6689, -1, 0);
        class148.field2503.method2394((byte) 124, 10, "--> " + class141.method1098(0, class476.field6818), -16777216, -1, -class246.field3584.field7041 + 349);
        if (class54.field710) {
            int var11 = -1;
            if (~(class148.field2508 % 30) < -16) {
                var11 = 16777215;
            }
            arg0.method750(339 - class246.field3584.field7041, 24708, class246.field3584.method2870(true, "--> " + class141.method1098(0, class476.field6818).substring(0, class149.field2511)) + 10, 12, var11);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lba;I[BIIFIFFIFFI)V", line = 293)
    public static final void method1470(class108 arg0, int arg1, byte[] arg2, int arg3, int arg4, float arg5, int arg6, float arg7, float arg8, int arg9, float arg10, float arg11, int arg12) {
        ++field3272;
        if (arg6 < 113) {
            field3274 = null;
        }
        for (int var13 = 0; ~var13 > ~arg12; ++var13) {
            class691.method3889(arg5, arg7, arg2, arg1, (byte) 4, arg3, arg0, arg4, arg9, arg10, arg12, arg8, arg11, var13);
            arg1 += arg3 * arg9;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(III)V", line = 321)
    public final void method1170(int arg0, int arg1, int arg2) {
        ++field3269;
        if (this.field3273) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((arg1 & 60) >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) (arg0 >> 16 & 3) / 8.0F;
            long var8 = this.field3264.field6820;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field6621.field5456 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg2 != 1) {
            field3274 = null;
        }
    }
}
