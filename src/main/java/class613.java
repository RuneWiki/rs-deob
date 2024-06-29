import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class613 extends class548 {

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "Z")
    private boolean field8294 = false;

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "Z")
    private boolean field8303 = false;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "Ltf;")
    private class311 field8295;

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "Lgw;")
    private class182 field8291;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "[I")
    public static int[] field8296 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "[I")
    public static int[] field8293 = new int[4];

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
    public static int field8297;

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!eba", name = "x", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!eba", name = "y", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)V", line = 8)
    public final void method753(int arg0, int arg1, int arg2) {
        if (this.field8294) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) ((198883 & arg0) >> 16) / 8.0F;
            float var8 = (float) (arg0 >> 19 & 15) / 16.0F;
            float var9 = (float) (arg0 >> 23 & 15) / 16.0F;
            int var10 = (2039718709 & arg0) >> 27;
            long var11 = this.field8291.field2391;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field7571.field3519 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg2 != 14106) {
            this.field8295 = null;
        }
        ++field8298;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lru;II)V", line = 49)
    public final void method760(class205 arg0, int arg1, int arg2) {
        ++field8292;
        if (!this.field8294) {
            super.field7571.method1595((byte) 125, arg0);
            super.field7571.method1601(arg1 + 25457, arg2);
        }
        if (arg1 != -1) {
            this.field8294 = true;
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V", line = 66)
    public static void method3410(int arg0) {
        field8293 = null;
        field8296 = null;
        int var1 = -102 % ((arg0 - -16) / 46);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V", line = 84)
    public final void method759(int arg0) {
        ++field8299;
        if (this.field8294) {
            super.field7571.method1631(1, 55);
            super.field7571.method1595((byte) 84, (class205) null);
            super.field7571.method1631(0, 47);
            super.field7571.method1595((byte) 75, (class205) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8294 = false;
        }
        if (arg0 != 3) {
            this.field8294 = false;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZZ)V", line = 105)
    public final void method754(boolean arg0, boolean arg1) {
        ++field8302;
        if (arg1) {
            this.field8295 = null;
        }
        class107 var3 = super.field7571.method1577(true);
        if (this.field8303 && var3 != null) {
            float var4 = 1.0F + 2.0F * (-Math.abs(super.field7571.field3552[1]) + 1.0F);
            super.field7571.method1631(1, 58);
            super.field7571.method1595((byte) 125, var3);
            super.field7571.method1631(0, -72);
            super.field7571.method1595((byte) 78, this.field8295.field4396);
            long var5 = this.field8291.field2391;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field7571.field3552[0], -super.field7571.field3552[1], -super.field7571.field3552[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field7571.field3650 * var4, super.field7571.field3584 * var4, super.field7571.field3644 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field7571.field3552[1]));
            this.field8294 = true;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)Z", line = 140)
    public final boolean method756(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field8301;
            return this.field8303;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZI)V", line = 151)
    public final void method758(boolean arg0, int arg1) {
        ++field8297;
        if (arg1 != 0) {
            this.method756(true);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZII)V", line = 161)
    public static final void method3411(boolean arg0, int arg1, int arg2) {
        ++field8290;
        class778 var3 = class389.method2406(-117, (long) arg2, 7);
        var3.method4274(105);
        var3.field10690 = arg1;
        if (arg0) {
            method3410(56);
        }
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Llf;Ltf;)V", line = 176)
    public class613(class250 arg0, class311 arg1) {
        super(arg0);
        this.field8295 = arg1;
        if (this.field8295.field4396 != null && super.field7571.field3554 && super.field7571.field3589) {
            class440 var3 = class498.method2925(super.field7571, (byte) 53, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class440 var4 = class498.method2925(super.field7571, (byte) 91, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field8291 = class40.method231(new class440[] { var3, var4 }, (byte) -7, super.field7571);
            this.field8303 = this.field8291 != null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lha;ILd;)V", line = 202)
    public static final void method3412(class66 arg0, int arg1, class161 arg2) {
        ++field8300;
        if (class752.field10158 != null) {
            if (arg1 > -12) {
                method3410(9);
            }
            if (~class286.field4101 > -11) {
                if (!class752.field10152.method1159(class752.field10158.field2583, (byte) -47)) {
                    class286.field4101 = class627.field8494.method1172(class752.field10158.field2583, 105) / 10;
                    return;
                }
                client.method2035(-121);
                class286.field4101 = 10;
            }
            if (class286.field4101 == 10) {
                class752.field10178 = class752.field10158.field2573 >> 6 << 6;
                class752.field10177 = class752.field10158.field2582 >> 6 << 6;
                class752.field10181 = (class752.field10158.field2577 >> 6 << 6) - -64 + -class752.field10178;
                class752.field10176 = (class752.field10158.field2591 >> 6 << 6) + -class752.field10177 + 64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class752.field10158.method1306((class625.field8475.field2810 >> 9) + class259.field3849, (class625.field8475.field2802 >> 9) + class120.field1625, var3, class625.field8475.field2813, 0)) {
                    var4 = var3[1] + -class752.field10177;
                    var5 = var3[2] - class752.field10178;
                }
                if (!class609.field8244 && ~var4 <= -1 && var4 < class752.field10176 && ~var5 <= -1 && ~var5 > ~class752.field10181) {
                    int var6 = var4 + (int) (Math.random() * 10.0D) + -5;
                    int var7 = var5 + ((int) (Math.random() * 10.0D) - 5);
                    class720.field9789 = var6;
                    class81.field1129 = var7;
                } else if (class318.field4525 != -1 && ~class302.field4238 != 0) {
                    class752.field10158.method1299(class318.field4525, class302.field4238, 8000, var3);
                    class609.field8244 = false;
                    if (var3 != null) {
                        class81.field1129 = var3[2] + -class752.field10178;
                        class720.field9789 = var3[1] + -class752.field10177;
                    }
                    class302.field4238 = -1;
                    class318.field4525 = -1;
                } else {
                    class752.field10158.method1299(16383 & class752.field10158.field2569 >> 14, class752.field10158.field2569 & 16383, 8000, var3);
                    class720.field9789 = var3[1] + -class752.field10177;
                    class81.field1129 = var3[2] + -class752.field10178;
                }
                if (~class752.field10158.field2579 == -38) {
                    class752.field10166 = 3.0F;
                    class752.field10160 = 3.0F;
                } else if (~class752.field10158.field2579 == -51) {
                    class752.field10166 = 4.0F;
                    class752.field10160 = 4.0F;
                } else if (class752.field10158.field2579 != 75) {
                    if (class752.field10158.field2579 != 100) {
                        if (class752.field10158.field2579 != 200) {
                            class752.field10166 = 8.0F;
                            class752.field10160 = 8.0F;
                        } else {
                            class752.field10166 = 16.0F;
                            class752.field10160 = 16.0F;
                        }
                    } else {
                        class752.field10166 = 8.0F;
                        class752.field10160 = 8.0F;
                    }
                } else {
                    class752.field10166 = 6.0F;
                    class752.field10160 = 6.0F;
                }
                class752.field10165 = (int) class752.field10166 >> 1;
                class752.field10167 = class786.method4308(class752.field10165, -1);
                class642.method3536(126);
                class752.method4105();
                class735.field9966 = new class84();
                class752.field10162 += (int) (5.0D * Math.random()) - 2;
                if (class752.field10162 < -8) {
                    class752.field10162 = -8;
                }
                class752.field10163 += (int) (Math.random() * 5.0D) - 2;
                if (class752.field10162 > 8) {
                    class752.field10162 = 8;
                }
                if (~class752.field10163 > 15) {
                    class752.field10163 = -16;
                }
                if (~class752.field10163 < -17) {
                    class752.field10163 = 16;
                }
                class752.method4108(arg2, class752.field10162 >> 2 << 10, class752.field10163 >> 1);
                class752.field10153.method2067(-13764, 256, 1024);
                class752.field10151.method3179(34, 256, 256);
                class752.field10150.method1363(4096, (byte) 126);
                class547.field7563.method3715(256, (byte) 69);
                class286.field4101 = 20;
            } else if (~class286.field4101 == -21) {
                class540.method3125(true, 0);
                class752.method4103(arg0, class752.field10162, class752.field10163);
                class286.field4101 = 60;
                class540.method3125(true, 0);
                class597.method3344((byte) -36);
            } else if (~class286.field4101 == -61) {
                if (!class752.field10152.method1181(-5252, class752.field10158.field2583 + "_staticelements")) {
                    class752.field10164 = new class329(0);
                } else {
                    if (!class752.field10152.method1159(class752.field10158.field2583 + "_staticelements", (byte) -56)) {
                        return;
                    }
                    class752.field10164 = class64.method413(class86.field1212, class752.field10152, 1, class752.field10158.field2583 + "_staticelements");
                }
                class752.method4112();
                class286.field4101 = 70;
                class540.method3125(true, 0);
                class597.method3344((byte) -36);
            } else if (class286.field4101 == 70) {
                class171.field2242 = new class513(arg0, 11, true, class669.field8962);
                class286.field4101 = 73;
                class540.method3125(true, 0);
                class597.method3344((byte) -36);
            } else if (class286.field4101 == 73) {
                class537.field7443 = new class513(arg0, 12, true, class669.field8962);
                class286.field4101 = 76;
                class540.method3125(true, 0);
                class597.method3344((byte) -36);
            } else if (class286.field4101 == 76) {
                class698.field9253 = new class513(arg0, 14, true, class669.field8962);
                class286.field4101 = 79;
                class540.method3125(true, 0);
                class597.method3344((byte) -36);
            } else if (class286.field4101 == 79) {
                class490.field6824 = new class513(arg0, 17, true, class669.field8962);
                class286.field4101 = 82;
                class540.method3125(true, 0);
                class597.method3344((byte) -36);
            } else if (~class286.field4101 == -83) {
                class43.field461 = new class513(arg0, 19, true, class669.field8962);
                class286.field4101 = 85;
                class540.method3125(true, 0);
                class597.method3344((byte) -36);
            } else if (~class286.field4101 == -86) {
                class626.field8488 = new class513(arg0, 22, true, class669.field8962);
                class286.field4101 = 88;
                class540.method3125(true, 0);
                class597.method3344((byte) -36);
            } else if (~class286.field4101 == -89) {
                class577.field7875 = new class513(arg0, 26, true, class669.field8962);
                class286.field4101 = 91;
                class540.method3125(true, 0);
                class597.method3344((byte) -36);
            } else {
                class55.field649 = new class513(arg0, 30, true, class669.field8962);
                class286.field4101 = 100;
                class540.method3125(true, 0);
                class597.method3344((byte) -36);
                System.gc();
            }
        }
    }
}
