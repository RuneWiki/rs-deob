import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class183 extends class27 {

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "Z")
    private boolean field2648 = false;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "Z")
    private boolean field2642 = false;

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "Lud;")
    private class33 field2649;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lwba;")
    private class46 field2639;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "[[I")
    public static int[][] field2646;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V", line = 7)
    public static void method1256(int arg0) {
        if (arg0 != -1) {
            field2646 = null;
        }
        field2646 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IILvf;)V", line = 17)
    public final void method257(int arg0, int arg1, class136 arg2) {
        if (arg1 != -10479) {
            method1258(false);
        }
        ++field2647;
        if (!this.field2648) {
            super.field337.method3206(arg2, (byte) 26);
            super.field337.method3205(5123, arg0);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZI)V", line = 33)
    public final void method263(boolean arg0, int arg1) {
        ++field2650;
        if (arg1 != 8) {
            this.field2649 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Llj;Lud;)V", line = 43)
    public class183(class565 arg0, class33 arg1) {
        super(arg0);
        this.field2649 = arg1;
        if (this.field2649.field408 != null && super.field337.field7877 && super.field337.field7890) {
            class17 var3 = class78.method604((byte) -109, super.field337, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class17 var4 = class78.method604((byte) -105, super.field337, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field2639 = class138.method966((byte) -66, super.field337, new class17[] { var3, var4 });
            this.field2642 = this.field2639 != null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IBIIILlaa;)Ljava/awt/Frame;", line = 65)
    public static final Frame method1257(int arg0, byte arg1, int arg2, int arg3, int arg4, class105 arg5) {
        ++field2645;
        if (!arg5.method758(2)) {
            return null;
        } else if (arg1 < 92) {
            return null;
        } else {
            if (~arg4 == -1) {
                class483[] var6 = class78.method614(arg5, (byte) 43);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var8 < var6.length; ++var8) {
                    if (~var6[var8].field6634 == ~arg0 && ~var6[var8].field6642 == ~arg3 && (arg2 == 0 || var6[var8].field6640 == arg2) && (!var7 || arg4 < var6[var8].field6639)) {
                        arg4 = var6[var8].field6639;
                        var7 = true;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class70 var9 = arg5.method759(arg4, arg3, arg2, -124, arg0);
            while (~var9.field948 == -1) {
                class519.method2960(71, 10L);
            }
            Frame var10 = (Frame) var9.field946;
            if (var10 == null) {
                return null;
            } else if (~var9.field948 == -3) {
                class242.method1503(var10, arg5, (byte) -97);
                return null;
            } else {
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(Z)Lrd;", line = 140)
    public static final class307 method1258(boolean arg0) {
        ++field2638;
        try {
            return arg0 ? null : (class307) Class.forName("tca").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)Z", line = 161)
    public final boolean method260(boolean arg0) {
        if (arg0) {
            this.method257(-96, -61, (class136) null);
        }
        ++field2640;
        return false;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V", line = 172)
    public final void method256(byte arg0) {
        if (arg0 != 50) {
            field2646 = null;
        }
        ++field2641;
        if (this.field2648) {
            super.field337.method3220(arg0 + -50, 1);
            super.field337.method3206((class136) null, (byte) 26);
            super.field337.method3220(arg0 ^ 50, 0);
            super.field337.method3206((class136) null, (byte) 26);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2648 = false;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BZ)V", line = 194)
    public final void method258(byte arg0, boolean arg1) {
        ++field2643;
        if (arg0 >= -80) {
            this.method257(70, -32, (class136) null);
        }
        class696 var3 = super.field337.method3168((byte) -127);
        if (this.field2642 && var3 != null) {
            super.field337.method3220(0, 1);
            super.field337.method3206(var3, (byte) 26);
            super.field337.method3220(0, 0);
            super.field337.method3206(this.field2649.field408, (byte) 26);
            long var4 = this.field2639.field552;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field337.field7923[0], super.field337.field7923[1], super.field337.field7923[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field337.field7948, super.field337.field7963, super.field337.field7975, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field337.field7923[1]) * 928.0F + 96.0F);
            this.field2648 = true;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)V", line = 223)
    public final void method261(int arg0, int arg1, int arg2) {
        ++field2644;
        if (this.field2648) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (arg1 >> 16 & 3) / 8.0F;
            long var8 = this.field2639.field552;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field337.field7834 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg2 != 4) {
            field2646 = null;
        }
    }
}
