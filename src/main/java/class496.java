import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class496 extends class366 {

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "Z")
    private boolean field7214 = false;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "Z")
    private boolean field7222 = false;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "Lpe;")
    private class430 field7224;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "Lv;")
    private class406 field7221;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "Loq;")
    public static class239 field7227;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "Lhh;")
    public static class84 field7216;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V", line = 3)
    public static void method2952(int arg0) {
        if (arg0 != 0) {
            method2952(93);
        }
        field7227 = null;
        field7216 = null;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V", line = 16)
    public final void method1(int arg0) {
        if (arg0 >= 2) {
            if (this.field7214) {
                super.field5494.method2030(1, (byte) -125);
                super.field5494.method2042((class440) null, 0);
                super.field5494.method2030(0, (byte) -128);
                super.field5494.method2042((class440) null, 0);
                OpenGL.glUseProgramObjectARB(0L);
                this.field7214 = false;
            }
            ++field7226;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)Z", line = 38)
    public final boolean method9(int arg0) {
        if (arg0 < 21) {
            return false;
        } else {
            ++field7220;
            return false;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILgo;B)V", line = 52)
    public final void method6(int arg0, class440 arg1, byte arg2) {
        if (!this.field7214) {
            super.field5494.method2042(arg1, 0);
            super.field5494.method2068(arg0, 13134);
        }
        int var4 = -17 % ((arg2 - 31) / 59);
        ++field7213;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILtn;I)V", line = 68)
    public static final void method2953(int arg0, int arg1, class58 arg2, int arg3) {
        ++field7212;
        class381 var4 = arg2.method415(class394.field5821, arg1 + -1010386112);
        if (var4 != null) {
            if (arg1 != -1467647389) {
                method2953(35, 111, (class58) null, -104);
            }
            class394.field5821.method509(arg3, arg0, arg2.field925 + arg3, arg2.field896 + arg0);
            if (~class406.field5977 > -4) {
                class342.field5219.method3133((float) arg2.field925 / 2.0F + (float) arg3, (float) arg2.field896 / 2.0F + (float) arg0, 4096, (16383 & (int) (-class66.field1161)) << 2, var4, arg3, arg0);
            } else {
                class394.field5821.method434(-16777216, var4, arg3, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIB)V", line = 93)
    public final void method8(int arg0, int arg1, byte arg2) {
        if (this.field7214) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((60 & arg1) >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((219016 & arg0) >> 16) / 8.0F;
            long var8 = this.field7221.field5973;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5494.field4781 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field7217;
        if (arg2 < 18) {
            this.method8(-120, -25, (byte) 18);
        }
    }

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V", line = 122)
    public static final void method2954(int arg0) {
        class169.field2542 = new class231(class193.field2834.method1273(true, class370.field5530), "", class508.field7429, 1004, -1, 0L, 0, 0, true, false);
        ++field7223;
        if (arg0 != 13884) {
            method2955((String) null, -73, -49);
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lqg;Lpe;)V", line = 133)
    public class496(class321 arg0, class430 arg1) {
        super(arg0);
        this.field7224 = arg1;
        if (this.field7224.field6268 != null && super.field5494.field4901 && super.field5494.field4831) {
            class279 var3 = class523.method3087(22476, 35633, super.field5494, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class279 var4 = class523.method3087(22476, 35632, super.field5494, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field7221 = class410.method2538(1357486177, super.field5494, new class279[] { var3, var4 });
            this.field7222 = this.field7221 != null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 152)
    public static final void method2955(String arg0, int arg1, int arg2) {
        ++field7225;
        if (arg2 != 2) {
            method2954(-65);
        }
        class114.method841(false, class288.field4145);
        ++class354.field5356;
        class86.field1436.method1923((byte) 62, 1 + class8.method57(-114, arg0));
        class86.field1436.method1882((byte) 93, arg0);
        class86.field1436.method1915((byte) -116, arg1);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLti;)V", line = 173)
    public static final void method2956(byte arg0, class303 arg1) {
        int var2 = 54 % ((arg0 - -40) / 45);
        ++field7219;
        if (arg1.field4326.length + -arg1.field4333 >= 1) {
            int var3 = arg1.method1918((byte) -70);
            if (var3 >= 0 && var3 <= 1) {
                if (arg1.field4326.length - arg1.field4333 >= 2) {
                    int var4 = arg1.method1868(0);
                    if (var4 * 6 == arg1.field4326.length + -arg1.field4333) {
                        while (true) {
                            int var5;
                            int var6;
                            do {
                                do {
                                    do {
                                        if (arg1.field4326.length <= arg1.field4333) {
                                            return;
                                        }
                                        var5 = arg1.method1868(0);
                                        var6 = arg1.method1870(-1945262512);
                                    } while (class400.field5869.length <= var5);
                                } while (!class424.field6226[var5]);
                            } while (class367.field5499.method2239((byte) -104, var5).field3689 == '1' && (var6 < -1 || ~var6 < -2));
                            class400.field5869[var5] = var6;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)V", line = 219)
    public final void method5(boolean arg0, int arg1) {
        ++field7218;
        class329 var3 = super.field5494.method2089(true);
        int var4 = 61 % ((10 - arg1) / 48);
        if (this.field7222 && var3 != null) {
            super.field5494.method2030(1, (byte) -124);
            super.field5494.method2042(var3, 0);
            super.field5494.method2030(0, (byte) -122);
            super.field5494.method2042(this.field7224.field6268, 0);
            long var5 = this.field7221.field5973;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field5494.field4859[0], -super.field5494.field4859[1], -super.field5494.field4859[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field5494.field4825, super.field5494.field4892, super.field5494.field4838, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field5494.field4859[1]) + 96.0F);
            this.field7214 = true;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)I", line = 248)
    public static final int method2957(int arg0, int arg1, int arg2) {
        if (arg0 != 14133) {
            field7227 = null;
        }
        ++field7215;
        if (~arg2 > ~arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (~arg1 != -1) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZZ)V", line = 275)
    public final void method7(boolean arg0, boolean arg1) {
        ++field7228;
        if (!arg0) {
            field7227 = null;
        }
    }
}
