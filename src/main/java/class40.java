import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class40 extends class531 {

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Z")
    private boolean field514 = false;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Z")
    private boolean field526 = false;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Lgo;")
    private class653 field520;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Lhw;")
    private class140 field525;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "[I")
    public static int[] field528 = new int[5];

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lfba;")
    public static class27 field512 = new class27(54, -1);

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "Lwv;")
    public static class37 field529 = new class37(2, 3);

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "[I")
    public static int[] field518;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 6)
    public final void method300(int arg0) {
        ++field527;
        if (this.field526) {
            super.field7676.method813((byte) 103, 1);
            super.field7676.method808((byte) 34, (class188) null);
            super.field7676.method813((byte) 103, 0);
            super.field7676.method808((byte) 34, (class188) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field526 = false;
        }
        if (arg0 != 1) {
            field512 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(ZI)V", line = 27)
    public final void method301(boolean arg0, int arg1) {
        if (arg1 < -9) {
            ++field521;
            class425 var3 = super.field7676.method803(true);
            if (this.field514 && var3 != null) {
                super.field7676.method813((byte) 103, 1);
                super.field7676.method808((byte) 34, var3);
                super.field7676.method813((byte) 103, 0);
                super.field7676.method808((byte) 34, this.field520.field9124);
                long var4 = this.field525.field2083;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field7676.field1542[0], -super.field7676.field1542[1], -super.field7676.field1542[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7676.field1536, super.field7676.field1573, super.field7676.field1482, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field7676.field1542[1]) + 96.0F);
                this.field526 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII)V", line = 57)
    public static final void method302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~arg1 <= ~class618.field8645 && class463.field6533 >= arg3 && class734.field10153 <= arg6 && arg4 <= class407.field5535) {
            if (~arg5 != -2) {
                class643.method3665(arg1, arg5, arg2, arg4, arg3, arg6, (byte) -65);
            } else {
                class621.method3582(arg1, arg4, arg6, 121, arg3, arg2);
            }
        } else if (~arg5 != -2) {
            class419.method2541(arg2, arg1, arg5, (byte) -33, arg6, arg4, arg3);
        } else {
            class720.method4029(arg4, arg2, (byte) 99, arg3, arg1, arg6);
        }
        ++field517;
        if (arg0 >= -46) {
            field528 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V", line = 89)
    public static void method303(int arg0) {
        if (arg0 != 10684) {
            field512 = null;
        }
        field518 = null;
        field528 = null;
        field512 = null;
        field529 = null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lqfa;Lgo;)V", line = 107)
    public class40(class106 arg0, class653 arg1) {
        super(arg0);
        this.field520 = arg1;
        if (this.field520.field9124 != null && super.field7676.field1521 && super.field7676.field1523) {
            class394 var3 = class24.method237(114, 35633, super.field7676, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class394 var4 = class24.method237(108, 35632, super.field7676, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field525 = class422.method2562(new class394[] { var3, var4 }, 0, super.field7676);
            this.field514 = this.field525 != null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z", line = 126)
    public final boolean method304(int arg0) {
        ++field513;
        if (arg0 <= 125) {
            field528 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(BII)Z", line = 137)
    public static final boolean method305(byte arg0, int arg1, int arg2) {
        ++field511;
        if (arg0 > -92) {
            method308((class529) null, -27, false, (byte[]) null);
        }
        return class600.method3494((byte) -52, arg2, arg1) || class358.method2263(1064779144, arg2, arg1);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)I", line = 150)
    public static final int method306(int arg0, boolean arg1) {
        ++field524;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 + -61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return arg1 ? -97 : var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZLdca;)V", line = 167)
    public final void method307(int arg0, boolean arg1, class188 arg2) {
        if (arg1) {
            field512 = null;
        }
        ++field519;
        if (!this.field526) {
            super.field7676.method808((byte) 34, arg2);
            super.field7676.method795(arg0, 34023);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lko;IZ[B)Lhka;", line = 187)
    public static final class57 method308(class529 arg0, int arg1, boolean arg2, byte[] arg3) {
        ++field523;
        if (arg3 == null) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg1, var4);
            OpenGL.glProgramRawARB(arg1, 34933, arg3);
            OpenGL.glGetIntegerv(34379, class746.field10332, 0);
            if (~class746.field10332[0] != 0) {
                OpenGL.glBindProgramARB(arg1, 0);
                return null;
            } else {
                if (!arg2) {
                    method310(-88, -48, 62);
                }
                OpenGL.glBindProgramARB(arg1, 0);
                return new class57(arg0, arg1, var4);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)V", line = 216)
    public final void method309(boolean arg0, int arg1) {
        if (arg1 < -67) {
            ++field522;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Z", line = 227)
    public static final boolean method310(int arg0, int arg1, int arg2) {
        ++field515;
        if (arg2 != 50560) {
            return false;
        } else {
            return ~(arg0 & 50560) != -1;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BII)V", line = 244)
    public final void method311(byte arg0, int arg1, int arg2) {
        if (arg0 >= -55) {
            field528 = null;
        }
        ++field516;
        if (this.field526) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((236493 & arg2) >> 16) / 8.0F;
            long var8 = this.field525.field2083;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7676.field1437 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }
}
