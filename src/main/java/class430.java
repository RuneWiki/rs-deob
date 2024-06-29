import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class430 extends class125 {

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "Z")
    private boolean field6252 = false;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "Z")
    private boolean field6245 = false;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "Lqf;")
    private class482 field6258;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "Luq;")
    private class113 field6250;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field6246 = 0;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "Z")
    public static boolean field6255;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "[I")
    public static int[] field6256;

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "[I")
    public static int[] field6260;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "I")
    public static int field6259;

    static {
        new class305(" days.", " Tage.", " jours.", " dias.");
        field6255 = false;
        field6256 = new int[2];
        field6260 = new int[] { 1, 2, 4, 8 };
        new class305("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2642(byte arg0) {
        ++field6243;
        if (!class319.field4256.method1738(0, class20.field183) && ~class253.field3369 != ~class210.field2808) {
            class514.method3066(10, class126.field1634, false, class293.field3882, 0);
        } else {
            class19.method105(5, class343.field4596);
            int var1 = -13 / ((-24 - arg0) / 61);
            if (class340.field4507 != class210.field2808) {
                class397.method2452(0);
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZI)V", line = 25)
    public final void method668(boolean arg0, int arg1) {
        if (arg1 == 0) {
            ++field6254;
            class139 var3 = super.field1617.method2268(30323);
            if (this.field6245 && var3 != null) {
                float var4 = 1.0F + 2.0F * (-Math.abs(super.field1617.field5345[1]) + 1.0F);
                super.field1617.method2250((byte) 58, 1);
                super.field1617.method2236(var3, 124);
                super.field1617.method2250((byte) 54, 0);
                super.field1617.method2236(this.field6258.field7120, -29);
                long var5 = this.field6250.field1485;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field1617.field5345[0], -super.field1617.field5345[1], -super.field1617.field5345[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field1617.field5448 * var4, super.field1617.field5353 * var4, super.field1617.field5438 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field1617.field5345[1]) + 64.0F);
                this.field6252 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V", line = 57)
    public final void method667(int arg0) {
        if (this.field6252) {
            super.field1617.method2250((byte) 59, 1);
            super.field1617.method2236((class252) null, arg0 ^ 18135);
            super.field1617.method2250((byte) 73, 0);
            super.field1617.method2236((class252) null, 120);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6252 = false;
        }
        if (arg0 != -18112) {
            method2643(120, (String) null, 115);
        }
        ++field6257;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(ZI)V", line = 85)
    public final void method665(boolean arg0, int arg1) {
        if (arg1 < 92) {
            field6259 = 72;
        }
        ++field6253;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lur;Lqf;)V", line = 128)
    public class430(class377 arg0, class482 arg1) {
        super(arg0);
        this.field6258 = arg1;
        if (this.field6258.field7120 != null && super.field1617.field5409 && super.field1617.field5378) {
            class346 var3 = class113.method686("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, 125, super.field1617);
            class346 var4 = class113.method686("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, -89, super.field1617);
            this.field6250 = class151.method904((byte) 100, new class346[] { var3, var4 }, super.field1617);
            this.field6245 = this.field6250 != null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILhe;I)V", line = 111)
    public final void method669(int arg0, class252 arg1, int arg2) {
        if (arg0 != 67) {
            method2644((byte) 89);
        }
        ++field6247;
        if (!this.field6252) {
            super.field1617.method2236(arg1, arg0 + 48);
            super.field1617.method2260(arg0 + 16573, arg2);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)Z", line = 148)
    public final boolean method666(int arg0) {
        ++field6249;
        int var2 = 43 % ((11 - arg0) / 63);
        return this.field6245;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V", line = 161)
    public final void method662(int arg0, int arg1, int arg2) {
        if (this.field6252) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << ((59 & arg2) >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) ((243393 & arg1) >> 16) / 8.0F;
            float var8 = (float) (15 & arg1 >> 19) / 16.0F;
            float var9 = (float) ((arg1 & 130355017) >> 23) / 16.0F;
            int var10 = (2128746273 & arg1) >> 27;
            long var11 = this.field6250.field1485;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field1617.field5310 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg0 < -35) {
            ++field6248;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 205)
    public static final void method2643(int arg0, String arg1, int arg2) {
        ++field6251;
        int var3 = -12 % ((19 - arg2) / 53);
        int var4 = class461.field6877;
        int[] var5 = class342.field4589;
        boolean var6 = false;
        for (int var7 = 0; var4 > var7; ++var7) {
            class531 var8 = class29.field272[var5[var7]];
            if (var8 != null && class96.field1170 != var8 && var8.field7783 != null && var8.field7783.equalsIgnoreCase(arg1)) {
                var6 = true;
                if (arg0 == 1) {
                    ++class279.field3696;
                    class492.method2979(class418.field6071, 17);
                    class106.field1443.method2446(var5[var7], (byte) 118);
                    class106.field1443.method2427((byte) 84, 0);
                } else if (~arg0 != -5) {
                    if (~arg0 != -6) {
                        if (arg0 == 6) {
                            ++class212.field2870;
                            class492.method2979(class427.field6208, 71);
                            class106.field1443.method2444((byte) 65, var5[var7]);
                            class106.field1443.method2427((byte) 41, 0);
                        } else if (arg0 == 7) {
                            ++class363.field4959;
                            class492.method2979(class435.field6352, 25);
                            class106.field1443.method2449((byte) 115, 0);
                            class106.field1443.method2446(var5[var7], (byte) 118);
                        }
                    } else {
                        class492.method2979(class443.field6457, 45);
                        ++class245.field3227;
                        class106.field1443.method2427((byte) 105, 0);
                        class106.field1443.method2446(var5[var7], (byte) 122);
                    }
                } else {
                    ++class131.field1714;
                    class492.method2979(class419.field6087, 122);
                    class106.field1443.method2410(false, var5[var7]);
                    class106.field1443.method2449((byte) 115, 0);
                }
                break;
            }
        }
        if (!var6) {
            class180.method1053(0, class496.field7234.method1823(class374.field5072, (byte) -88) + arg1);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V", line = 284)
    public static void method2644(byte arg0) {
        field6256 = null;
        field6260 = null;
        if (arg0 < 90) {
            method2643(115, (String) null, 17);
        }
    }
}
