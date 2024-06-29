import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class385 extends class318 {

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Z")
    private boolean field5789 = false;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Z")
    private boolean field5795 = false;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Luo;")
    private class408 field5796;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lfe;")
    private class404 field5783;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[S")
    public static short[] field5784 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lh;")
    public static class473 field5785 = class403.method2520(-3);

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field5798 = -1;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Z")
    public final boolean method721(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field5791;
            return this.field5789;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)I")
    public static final int method2402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5786;
        if (class491.field7059 == null) {
            return 0;
        } else {
            if (arg5 > arg1) {
                int var6 = arg2 >> 7;
                int var7 = arg3 >> 7;
                if (arg0 < 0 || arg4 < 0 || class69.field976 + -1 < arg0 || arg4 > class285.field4328 + -1) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || var6 > class69.field976 + -1 || ~(class285.field4328 - 1) > ~var7) {
                    return 0;
                }
                boolean var8 = (2 & class476.field6873[1][arg2 >> 7][arg3 >> 7]) != 0;
                if ((127 & arg2) == 0) {
                    boolean var9 = ~(2 & class476.field6873[1][var6 - 1][arg3 >> 7]) != -1;
                    boolean var10 = (2 & class476.field6873[1][var6][arg3 >> 7]) != 0;
                    if (!var9 == var10) {
                        var8 = ~(class476.field6873[1][arg0][arg4] & 2) != -1;
                    }
                }
                if (~(arg3 & 127) == -1) {
                    boolean var11 = (2 & class476.field6873[1][arg2 >> 7][var7 + -1]) != 0;
                    boolean var12 = (class476.field6873[1][arg2 >> 7][var7] & 2) != 0;
                    if (!var12 != !var11) {
                        var8 = (2 & class476.field6873[1][arg0][arg4]) != 0;
                    }
                }
                if (var8) {
                    ++arg1;
                }
            }
            return class491.field7059[arg1].method412(arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public final void method723(byte arg0) {
        if (arg0 < 91) {
            field5798 = -18;
        }
        ++field5793;
        if (this.field5795) {
            super.field4800.method1307(1, (byte) 92);
            super.field4800.method1289(-19391, (class454) null);
            super.field4800.method1307(0, (byte) 92);
            super.field4800.method1289(-19391, (class454) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5795 = false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIZ)I")
    public static final int method2403(int arg0, int arg1, int arg2, boolean arg3) {
        ++field5779;
        if (!arg3) {
            return 14;
        } else if (~arg2 > ~arg1) {
            return arg1;
        } else {
            return arg0 >= arg2 ? arg2 : arg0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
    public static void method2404(byte arg0) {
        if (arg0 != -90) {
            method2404((byte) 41);
        }
        field5784 = null;
        field5785 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
    public final void method722(int arg0, boolean arg1) {
        ++field5781;
        int var3 = -62 / ((arg0 - -23) / 46);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/lang/String;BII)V")
    public static final void method2405(int arg0, String arg1, byte arg2, int arg3, int arg4) {
        ++field5792;
        class114 var5 = class181.method1210(arg3, arg2 ^ 31, arg0);
        if (var5 != null) {
            if (var5.field1678 != null) {
                class405 var6 = new class405();
                var6.field5997 = arg1;
                var6.field6000 = arg4;
                var6.field6008 = var5.field1678;
                var6.field6004 = var5;
                class192.method1356(var6);
            }
            if (class429.field6373 == 9) {
                if (arg2 != -31) {
                    field5785 = null;
                }
                boolean var7 = true;
                if (var5.field1592 != 0) {
                    var7 = class85.method714(-16598, var5);
                }
                if (var7) {
                    if (client.method1387(var5).method2413((byte) -105, arg4 + -1)) {
                        if (~arg4 == -2) {
                            ++class178.field2683;
                            class74.method640(arg2 ^ 29604, class402.field5976);
                            class246.method1669(var5.field1670, arg0, (byte) -106, arg3);
                        }
                        if (arg4 == 2) {
                            ++class260.field3989;
                            class74.method640(-29627, class130.field1998);
                            class246.method1669(var5.field1670, arg0, (byte) -121, arg3);
                        }
                        if (arg4 == 3) {
                            ++class318.field4801;
                            class74.method640(-29627, class271.field4149);
                            class246.method1669(var5.field1670, arg0, (byte) -90, arg3);
                        }
                        if (~arg4 == -5) {
                            ++class522.field7642;
                            class74.method640(-29627, class46.field599);
                            class246.method1669(var5.field1670, arg0, (byte) 126, arg3);
                        }
                        if (~arg4 == -6) {
                            ++class305.field4599;
                            class74.method640(-29627, class448.field6556);
                            class246.method1669(var5.field1670, arg0, (byte) -8, arg3);
                        }
                        if (~arg4 == -7) {
                            class74.method640(-29627, class342.field5077);
                            ++class315.field4748;
                            class246.method1669(var5.field1670, arg0, (byte) -66, arg3);
                        }
                        if (~arg4 == -8) {
                            class74.method640(-29627, class121.field1825);
                            ++class515.field7492;
                            class246.method1669(var5.field1670, arg0, (byte) -113, arg3);
                        }
                        if (arg4 == 8) {
                            class74.method640(-29627, class509.field7455);
                            ++class519.field7595;
                            class246.method1669(var5.field1670, arg0, (byte) 118, arg3);
                        }
                        if (~arg4 == -10) {
                            ++client.field3301;
                            class74.method640(-29627, class314.field4741);
                            class246.method1669(var5.field1670, arg0, (byte) 109, arg3);
                        }
                        if (~arg4 == -11) {
                            ++class315.field4746;
                            class74.method640(-29627, class183.field2729);
                            class246.method1669(var5.field1670, arg0, (byte) 126, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)Z")
    public static final boolean method2406(int arg0, int arg1, int arg2) {
        if (arg0 != -17064) {
            field5798 = -66;
        }
        ++field5790;
        return ~(2 & class476.field6873[1][arg1][arg2]) != -1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lcl;I)V")
    public static final void method2407(class177 arg0, int arg1) {
        ++field5787;
        if (arg1 <= -9) {
            class101 var2 = (class101) class25.field314.method2585((byte) 114, (long) arg0.field1881);
            if (var2 != null) {
                if (var2.field1443 != null) {
                    class359.field5328.method385(var2.field1443);
                    var2.field1443 = null;
                }
                var2.method2677(-22491);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZZ)V")
    public final void method718(boolean arg0, boolean arg1) {
        if (!arg1) {
            ++field5797;
            class428 var3 = super.field4800.method1261(16386);
            if (this.field5789 && var3 != null) {
                float var4 = (1.0F - Math.abs(super.field4800.field3147[1])) * 2.0F + 1.0F;
                super.field4800.method1307(1, (byte) 92);
                super.field4800.method1289(-19391, var3);
                super.field4800.method1307(0, (byte) 92);
                super.field4800.method1289(-19391, this.field5796.field6092);
                long var5 = this.field5783.field5993;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field4800.field3147[0], -super.field4800.field3147[1], -super.field4800.field3147[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field4800.field3130 * var4, super.field4800.field3136 * var4, super.field4800.field3155 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field4800.field3147[1]));
                this.field5795 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static final void method2408(int arg0) {
        class181.field2717.method339(class95.field1370, class321.field4819, class411.field6145);
        ++field5788;
        if (arg0 != 0) {
            field5798 = -51;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lkd;Luo;)V")
    public class385(class188 arg0, class408 arg1) {
        super(arg0);
        this.field5796 = arg1;
        if (this.field5796.field6092 != null && super.field4800.field3119 && super.field4800.field3166) {
            class447 var3 = class71.method622(true, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field4800, 35633);
            class447 var4 = class71.method622(true, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field4800, 35632);
            this.field5783 = class75.method647(-24, super.field4800, new class447[] { var3, var4 });
            this.field5789 = this.field5783 != null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lav;IB)V")
    public final void method715(class454 arg0, int arg1, byte arg2) {
        if (!this.field5795) {
            super.field4800.method1289(-19391, arg0);
            super.field4800.method1248(arg1, true);
        }
        ++field5782;
        if (arg2 >= -108) {
            this.method722(-46, true);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2409(String arg0, int arg1) {
        ++field5780;
        if (arg0 != null) {
            if ((class64.field785 < 100 || class88.field1252) && class64.field785 < 200) {
                if (arg1 > -65) {
                    method2407((class177) null, -62);
                }
                String var2 = class38.method286(arg0, true);
                if (var2 != null) {
                    for (int var3 = 0; ~var3 > ~class64.field785; ++var3) {
                        String var7 = class38.method286(class221.field3622[var3], true);
                        if (var7 != null && var7.equals(var2)) {
                            class358.method2249(0, arg0 + class503.field7262.method1635(class224.field3673, (byte) 124));
                            return;
                        }
                        if (class501.field7207[var3] != null) {
                            String var8 = class38.method286(class501.field7207[var3], true);
                            if (var8 != null && var8.equals(var2)) {
                                class358.method2249(0, arg0 + class503.field7262.method1635(class224.field3673, (byte) 118));
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; ~class327.field4923 < ~var4; ++var4) {
                        String var5 = class38.method286(class257.field3933[var4], true);
                        if (var5 != null && var5.equals(var2)) {
                            class358.method2249(0, class501.field7200.method1635(class224.field3673, (byte) 125) + arg0 + class476.field6866.method1635(class224.field3673, (byte) 119));
                            return;
                        }
                        if (class210.field3435[var4] != null) {
                            String var6 = class38.method286(class210.field3435[var4], true);
                            if (var6 != null && var6.equals(var2)) {
                                class358.method2249(0, class501.field7200.method1635(class224.field3673, (byte) -38) + arg0 + class476.field6866.method1635(class224.field3673, (byte) 1));
                                return;
                            }
                        }
                    }
                    if (class38.method286(class398.field5947.field2660, true).equals(var2)) {
                        class358.method2249(0, class384.field5773.method1635(class224.field3673, (byte) 122));
                    } else {
                        ++class58.field695;
                        class74.method640(-29627, class76.field1099);
                        class71.field1020.method1545(class4.method10(arg0, 119), -70);
                        class71.field1020.method1534(arg0, false);
                    }
                }
            } else {
                class358.method2249(0, class150.field2243.method1635(class224.field3673, (byte) 122));
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    public final void method719(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2405(-94, (String) null, (byte) 116, 19, -25);
        }
        ++field5794;
        if (this.field5795) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) (arg0 >> 16 & 3) / 8.0F;
            float var8 = (float) ((arg0 & 8136084) >> 19) / 16.0F;
            float var9 = (float) ((129510692 & arg0) >> 23) / 16.0F;
            int var10 = arg0 >> 27 & 15;
            long var11 = this.field5783.field5993;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field4800.field3027 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }
}
