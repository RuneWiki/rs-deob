import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class84 extends class141 {

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Z")
    private boolean field1324 = false;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Z")
    private boolean field1326 = false;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Lpt;")
    private class376 field1322;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lej;")
    private class80 field1321;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "Z")
    public static boolean field1340;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1333;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "F")
    public static float field1334;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "Lrp;")
    public static class307 field1335;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "Lqg;")
    public static class329 field1341;

    // $FF: synthetic field
    @OriginalMember(owner = "client!di", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field1342;

    // $FF: synthetic method
    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method622(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class44("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        field1337 = -1;
        field1340 = false;
        field1333 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lbt;Lpt;)V", line = 4)
    public class84(class33 arg0, class376 arg1) {
        super(arg0);
        this.field1322 = arg1;
        if (this.field1322.field5414 != null && super.field2178.field652 && super.field2178.field653) {
            class314 var3 = class490.method2872(40, super.field2178, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633);
            class314 var4 = class490.method2872(-64, super.field2178, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632);
            this.field1321 = class533.method3155(super.field2178, true, new class314[] { var3, var4 });
            this.field1324 = this.field1321 != null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIILqa;BII)V", line = 23)
    public static final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, class167 arg5, byte arg6, int arg7, int arg8) {
        ++field1327;
        class534 var9 = (class534) class500.method2921(arg7, arg0, arg2);
        if (var9 != null) {
            class261 var10 = class277.field4139.method569((byte) 126, var9.method561((byte) -85));
            int var11 = 3 & var9.method560(-29863);
            int var12 = var9.method559((byte) 76);
            if (~var10.field3879 == 0) {
                int var13 = arg1;
                if (var10.field3872 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || ~var12 == -3) {
                    if (var11 != 0) {
                        if (~var11 != -2) {
                            if (var11 == 2) {
                                arg5.method1199(arg3, var13, arg8 - -3, 17136, 4);
                            } else if (var11 == 3) {
                                arg5.method1191(arg3 - -3, var13, -256, arg8, 4);
                            }
                        } else {
                            arg5.method1191(arg3, var13, -256, arg8, 4);
                        }
                    } else {
                        arg5.method1199(arg3, var13, arg8, 17136, 4);
                    }
                }
                if (var12 == 3) {
                    if (~var11 != -1) {
                        if (var11 != 1) {
                            if (var11 == 2) {
                                arg5.method1193(1, arg3 - -3, arg8 + 3, 1, 1, var13);
                            } else if (var11 == 3) {
                                arg5.method1193(1, arg3 - -3, arg8, 1, 1, var13);
                            }
                        } else {
                            arg5.method1193(1, arg3, arg8 + 3, 1, 1, var13);
                        }
                    } else {
                        arg5.method1193(1, arg3, arg8, 1, 1, var13);
                    }
                }
                if (~var12 == -3) {
                    if (var11 == 0) {
                        arg5.method1191(arg3, var13, -256, arg8, 4);
                    } else if (~var11 == -2) {
                        arg5.method1199(arg3, var13, arg8 + 3, 17136, 4);
                    } else if (~var11 != -3) {
                        if (~var11 == -4) {
                            arg5.method1199(arg3, var13, arg8, 17136, 4);
                        }
                    } else {
                        arg5.method1191(arg3 + 3, var13, -256, arg8, 4);
                    }
                }
            } else {
                class523.method3107(arg8, var11, arg3, -14008, var10, arg5);
            }
        }
        class534 var14 = (class534) class413.method2470(arg7, arg0, arg2, field1342 != null ? field1342 : (field1342 = method622("wo")));
        if (var14 != null) {
            class261 var15 = class277.field4139.method569((byte) 83, var14.method561((byte) -85));
            int var16 = 3 & var14.method560(-29863);
            int var17 = var14.method559((byte) 90);
            if (~var15.field3879 != 0) {
                class523.method3107(arg8, var16, arg3, -14008, var15, arg5);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (~var15.field3872 < -1) {
                    var18 = -1179648;
                }
                if (~var16 != -1 && ~var16 != -3) {
                    arg5.method1195(arg3, arg8 + 3, -1, arg8, arg3 - -3, var18);
                } else {
                    arg5.method1195(arg3 - -3, arg8 - -3, -1, arg8, arg3, var18);
                }
            }
        }
        class534 var19 = (class534) class388.method2347(arg7, arg0, arg2);
        if (var19 != null) {
            class261 var20 = class277.field4139.method569((byte) 98, var19.method561((byte) -85));
            int var21 = 3 & var19.method560(-29863);
            if (var20.field3879 != -1) {
                class523.method3107(arg8, var21, arg3, -14008, var20, arg5);
            }
        }
        if (arg6 <= 0) {
            method620(-63, -80, -72);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(III)I", line = 163)
    public static final int method619(int arg0, int arg1, int arg2) {
        ++field1339;
        int var3 = 1;
        while (~arg2 < -2) {
            if (~(1 & arg2) != -1) {
                var3 = arg0 * var3;
            }
            arg2 >>= 1;
            arg0 *= arg0;
        }
        if (~arg2 == -2) {
            return arg0 * var3;
        } else if (arg1 != -1) {
            return 20;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 192)
    public final void method48(int arg0) {
        int var2 = 59 / ((arg0 - -51) / 45);
        if (this.field1326) {
            super.field2178.method277(1, (byte) 122);
            super.field2178.method285(false, (class120) null);
            super.field2178.method277(0, (byte) 63);
            super.field2178.method285(false, (class120) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1326 = false;
        }
        ++field1328;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(III)B", line = 215)
    public static final byte method620(int arg0, int arg1, int arg2) {
        ++field1329;
        if (arg2 != -4164) {
            field1340 = true;
        }
        if (arg0 != 9) {
            return 0;
        } else {
            return (byte) (~(1 & arg1) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V", line = 234)
    public final void method51(int arg0, boolean arg1) {
        if (arg0 != -21897) {
            field1334 = -0.073169306F;
        }
        ++field1330;
        class221 var3 = super.field2178.method357(arg0 ^ 22010);
        if (this.field1324 && var3 != null) {
            super.field2178.method277(1, (byte) 59);
            super.field2178.method285(false, var3);
            super.field2178.method277(0, (byte) 98);
            super.field2178.method285(false, this.field1322.field5414);
            long var4 = this.field1321.field1301;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field2178.field675[0], -super.field2178.field675[1], -super.field2178.field675[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field2178.field646, super.field2178.field668, super.field2178.field690, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field2178.field675[1]) * 928.0F + 96.0F);
            this.field1326 = true;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V", line = 264)
    public final void method49(int arg0, int arg1, int arg2) {
        if (arg0 != 1400) {
            method618(72, -27, -36, 103, 48, (class167) null, (byte) -88, -93, 103);
        }
        if (this.field1326) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << ((56 & arg2) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            long var8 = this.field1321.field1301;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2178.field625 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field1336;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 300)
    public static void method621(byte arg0) {
        field1341 = null;
        field1335 = null;
        if (arg0 != 121) {
            method619(50, 11, -26);
        }
        field1333 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lei;II)V", line = 313)
    public final void method57(class120 arg0, int arg1, int arg2) {
        ++field1338;
        if (!this.field1326) {
            super.field2178.method285(false, arg0);
            super.field2178.method249(arg1, -2);
        }
        if (arg2 <= 89) {
            field1337 = 96;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)Z", line = 341)
    public final boolean method55(int arg0) {
        ++field1323;
        if (arg0 != 0) {
            field1331 = -97;
        }
        return false;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V", line = 358)
    public final void method53(boolean arg0, int arg1) {
        if (arg1 == 0) {
            ++field1325;
        }
    }
}
