import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class294 extends class631 {

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Z")
    private boolean field4136 = false;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Z")
    private boolean field4137 = false;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lrc;")
    private class538 field4131;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "Laea;")
    private class49 field4145;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Lqfa;")
    public static class98 field4138 = null;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "J")
    public static long field4132 = 0L;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method1507(byte arg0) {
        int var2 = -58 % ((-9 - arg0) / 53);
        ++field4139;
        return false;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILta;)V", line = 18)
    public final void method1508(int arg0, int arg1, class210 arg2) {
        ++field4133;
        if (!this.field4136) {
            super.field8722.method926(arg2, 118);
            super.field8722.method891(arg0, (byte) 17);
        }
        int var4 = -122 % ((arg1 - 52) / 62);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIILjb;JLaa;I)V", line = 35)
    public static final void method1913(int arg0, int arg1, int arg2, int arg3, int arg4, class493 arg5, long arg6, class486 arg7, int arg8) {
        ++field4140;
        int var10 = arg8 * arg8 - -(arg4 * arg4);
        if (arg6 >= (long) var10) {
            int var11 = Math.min(arg5.field7095 / 2, arg5.field7031 / arg1);
            if (var10 <= var11 * var11) {
                class93.method691(-111, arg2, arg8, arg7, class587.field8274[arg3], arg4, arg0, arg5);
            } else {
                var11 -= 10;
                int var12;
                if (~class97.field1168 != -5) {
                    var12 = 16383 & (int) class552.field7773 + class535.field7520;
                } else {
                    var12 = 16383 & (int) class552.field7773;
                }
                int var13 = class164.field2258[var12];
                int var14 = class164.field2252[var12];
                if (class97.field1168 != 4) {
                    var14 = var14 * 256 / (class180.field2412 + 256);
                    var13 = var13 * 256 / (class180.field2412 + 256);
                }
                int var15 = arg4 * var13 - -(arg8 * var14) >> 14;
                int var16 = arg4 * var14 + -(arg8 * var13) >> 14;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) (Math.sin(var17) * (double) var11);
                int var20 = (int) ((double) var11 * Math.cos(var17));
                class731.field10207[arg3].method664((float) arg5.field7095 / 2.0F + (float) arg0 + (float) var19, (float) arg5.field7031 / 2.0F + (float) arg2 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIZI[BLeea;II)Lll;", line = 88)
    public static final class364 method1914(boolean arg0, int arg1, boolean arg2, int arg3, byte[] arg4, class131 arg5, int arg6, int arg7) {
        if (!arg0) {
            field4138 = null;
        }
        ++field4142;
        if (!arg5.field1869 && (!class253.method1681(arg3, (byte) 68) || !class253.method1681(arg1, (byte) 105))) {
            return arg5.field1906 ? new class364(arg5, 34037, arg6, arg3, arg1, arg2, arg4, arg7) : new class364(arg5, arg6, arg3, arg1, class123.method837(116, arg3), class123.method837(106, arg1), arg4, arg7);
        } else {
            return new class364(arg5, 3553, arg6, arg3, arg1, arg2, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lct;III)V", line = 107)
    public static final void method1915(class144 arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= -56) {
            class703.field9787[arg1][arg2] = arg0;
            ++field4134;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 118)
    public final void method1513(int arg0) {
        ++field4141;
        if (this.field4136) {
            super.field8722.method884(1, true);
            super.field8722.method926((class210) null, 87);
            super.field8722.method884(0, true);
            super.field8722.method926((class210) null, 78);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4136 = false;
        }
        if (arg0 < 74) {
            this.field4131 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Leea;Lrc;)V", line = 140)
    public class294(class131 arg0, class538 arg1) {
        super(arg0);
        this.field4131 = arg1;
        if (this.field4131.field7544 != null && super.field8722.field1875 && super.field8722.field1914) {
            class19 var3 = class619.method3482((byte) 120, super.field8722, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633);
            class19 var4 = class619.method3482((byte) 120, super.field8722, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632);
            this.field4145 = class579.method3300(new class19[] { var3, var4 }, -1, super.field8722);
            this.field4137 = this.field4145 != null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V", line = 160)
    public static void method1916(byte arg0) {
        if (arg0 >= -35) {
            method1914(true, 23, true, 9, (byte[]) null, (class131) null, -120, 84);
        }
        field4138 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V", line = 174)
    public final void method1512(int arg0, int arg1, int arg2) {
        if (this.field4136) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((arg0 & 63) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            long var8 = this.field4145.field575;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field8722.field1790 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1 < 72) {
            this.field4145 = null;
        }
        ++field4135;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZLjava/lang/Object;)[B", line = 207)
    public static final byte[] method1917(int arg0, boolean arg1, Object arg2) {
        ++field4130;
        if (arg0 != 2) {
            return null;
        } else if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return !arg1 ? var3 : class529.method3083(var3, (byte) 95);
        } else if (arg2 instanceof class281) {
            class281 var4 = (class281) arg2;
            return var4.method1849(126);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZZ)V", line = 246)
    public final void method1509(boolean arg0, boolean arg1) {
        ++field4144;
        class375 var3 = super.field8722.method929(0);
        if (this.field4137 && var3 != null) {
            super.field8722.method884(1, true);
            super.field8722.method926(var3, 90);
            super.field8722.method884(0, true);
            super.field8722.method926(this.field4131.field7544, 69);
            long var4 = this.field4145.field575;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field8722.field1845[0], -super.field8722.field1845[1], -super.field8722.field1845[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field8722.field1919, super.field8722.field1895, super.field8722.field1851, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field8722.field1845[1]) * 928.0F);
            this.field4136 = true;
        }
        if (!arg0) {
            this.method1513(-119);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)V", line = 276)
    public final void method1506(int arg0, boolean arg1) {
        if (arg0 != 17660) {
            field4132 = -26L;
        }
        ++field4143;
    }
}
