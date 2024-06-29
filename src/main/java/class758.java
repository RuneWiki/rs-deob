import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class758 extends class345 {

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Z")
    private boolean field10577 = false;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Z")
    private boolean field10592 = false;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Llha;")
    private class626 field10590;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Lit;")
    private class648 field10591;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field10583 = 0;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Ltba;")
    public static class165 field10580 = new class165(8);

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field10578;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field10579;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field10581;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field10582;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field10584;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field10585;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field10586;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field10587;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field10588;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field10589;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILrba;ILmk;)V", line = 3)
    public static final void method4218(int arg0, class435 arg1, int arg2, class56 arg3) {
        ++field10587;
        if (~class3.field26 > -51) {
            if (arg3 != null && arg3.field790 != null && ~arg0 > ~arg3.field790.length && arg3.field790[arg0] != null) {
                int var4 = arg3.field790[arg0][arg2];
                int var5 = var4 >> 8;
                int var6 = (241 & var4) >> 5;
                int var7 = 31 & var4;
                if (~arg3.field790[arg0].length < -2) {
                    int var8 = (int) (Math.random() * (double) arg3.field790[arg0].length);
                    if (~var8 < -1) {
                        var5 = arg3.field790[arg0][var8];
                    }
                }
                int var9 = 256;
                if (arg3.field767 != null && arg3.field774 != null) {
                    var9 = arg3.field767[arg0] + (int) (Math.random() * (double) (arg3.field774[arg0] + -arg3.field767[arg0]));
                }
                int var10 = arg3.field793 == null ? 255 : arg3.field793[arg0];
                if (var7 == 0) {
                    if (class380.field4847 == arg1) {
                        if (arg3.field783) {
                            class622.method3499(var5, var9, false, true, var6, 0, var10);
                            return;
                        }
                        class75.method673(var6, var10, var5, 0, var9, 0);
                    }
                } else if (~class748.field10451.field10394.method4186((byte) 69) != -1) {
                    int var11 = arg1.field5801 + -256 >> 9;
                    int var12 = arg1.field5797 - 256 >> 9;
                    int var13 = class380.field4847 == arg1 ? 0 : (arg1.field5796 << 24) + (var11 << 16) - -(var12 << 8) + var7;
                    class742.field10360[class3.field26++] = new class268((byte) (!arg3.field783 ? 1 : 2), var5, var6, 0, var10, var13, var9, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V", line = 70)
    public final void method40(boolean arg0, int arg1) {
        ++field10588;
        if (arg1 != 50560) {
            this.field10591 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 80)
    public static void method4219(byte arg0) {
        if (arg0 > 89) {
            field10580 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIILha;IIIILvda;II)V", line = 93)
    public static final void method4220(int arg0, int arg1, int arg2, int arg3, class60 arg4, int arg5, int arg6, int arg7, int arg8, class184 arg9, int arg10, int arg11) {
        if (arg8 < arg6 && ~arg6 > ~(arg8 + arg11) && arg1 > arg2 + -13 && ~arg1 > ~(arg2 + 3)) {
            arg10 = arg3;
        }
        ++field10585;
        String var12 = class38.method235(-85, arg9);
        class242.field3132.method562(arg2, arg8 + 3, arg10, (byte) -87, class679.field9480, var12, class120.field1751, 0);
        int var13 = -85 / ((-18 - arg0) / 33);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 109)
    public final void method41(byte arg0) {
        int var2 = -52 % ((arg0 - 60) / 60);
        if (this.field10577) {
            super.field4357.method2847(1, false);
            super.field4357.method2850(104, (class695) null);
            super.field4357.method2847(0, false);
            super.field4357.method2850(115, (class695) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field10577 = false;
        }
        ++field10581;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lbi;Llha;)V", line = 129)
    public class758(class483 arg0, class626 arg1) {
        super(arg0);
        this.field10590 = arg1;
        if (this.field10590.field8609 != null && super.field4357.field6819 && super.field4357.field6888) {
            class584 var3 = class711.method3976(super.field4357, (byte) 118, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class584 var4 = class711.method3976(super.field4357, (byte) 20, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field10591 = class616.method3445((byte) -96, super.field4357, new class584[] { var3, var4 });
            this.field10592 = this.field10591 != null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZB)V", line = 148)
    public final void method34(boolean arg0, byte arg1) {
        ++field10578;
        if (arg1 != -82) {
            method4218(-63, (class435) null, 107, (class56) null);
        }
        class193 var3 = super.field4357.method2813((byte) 113);
        if (this.field10592 && var3 != null) {
            super.field4357.method2847(1, false);
            super.field4357.method2850(arg1 + 194, var3);
            super.field4357.method2847(0, false);
            super.field4357.method2850(119, this.field10590.field8609);
            long var4 = this.field10591.field8964;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field4357.field6871[0], -super.field4357.field6871[1], -super.field4357.field6871[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field4357.field6892, super.field4357.field6899, super.field4357.field6816, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field4357.field6871[1]) * 928.0F + 96.0F);
            this.field10577 = true;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILcj;)V", line = 178)
    public final void method36(int arg0, int arg1, class695 arg2) {
        ++field10589;
        if (!this.field10577) {
            super.field4357.method2850(70, arg2);
            super.field4357.method2800(arg1, -7);
        }
        if (arg0 != 50560) {
            field10580 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZII)V", line = 201)
    public final void method37(boolean arg0, int arg1, int arg2) {
        if (this.field10577) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << ((arg2 & 62) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            long var8 = this.field10591.field8964;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field4357.field6780 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field10582;
        if (!arg0) {
            this.field10577 = false;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z", line = 238)
    public final boolean method38(int arg0) {
        ++field10579;
        return arg0 != 50560;
    }
}
