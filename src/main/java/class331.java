import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class331 extends class277 {

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "Z")
    private boolean field4219 = false;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "Z")
    private boolean field4222 = false;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "Lpea;")
    private class222 field4218;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "Llaa;")
    private class633 field4230;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "F")
    public static float field4223 = 0.0F;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILrg;)V")
    public final void method279(int arg0, int arg1, class615 arg2) {
        if (arg1 == 7) {
            if (!this.field4222) {
                super.field3475.method2960(arg2, arg1 + -9);
                super.field3475.method3005(false, arg0);
            }
            ++field4229;
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)V")
    public static final void method1878(int arg0) {
        class310.method1790(-1, false);
        ++field4220;
        class445.field5621 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~var2 > ~class209.field2635.length; ++var2) {
            if (class442.field5599[var2] != -1 && class209.field2635[var2] == null) {
                class209.field2635[var2] = class600.field8416.method3365(0, class688.method3877(arg0, 113), class442.field5599[var2]);
                if (class209.field2635[var2] == null) {
                    var1 = false;
                    ++class445.field5621;
                }
            }
            if (~class511.field6945[var2] != 0 && class137.field1782[var2] == null) {
                class137.field1782[var2] = class600.field8416.method3366(0, class500.field6598[var2], (byte) 121, class511.field6945[var2]);
                if (class137.field1782[var2] == null) {
                    var1 = false;
                    ++class445.field5621;
                }
            }
            if (class633.field8884[var2] != -1 && class496.field6546[var2] == null) {
                class496.field6546[var2] = class600.field8416.method3365(0, class688.method3877(arg0, 47), class633.field8884[var2]);
                if (class496.field6546[var2] == null) {
                    ++class445.field5621;
                    var1 = false;
                }
            }
            if (class638.field8956[var2] != -1 && class169.field2212[var2] == null) {
                class169.field2212[var2] = class600.field8416.method3365(0, -126, class638.field8956[var2]);
                if (class169.field2212[var2] == null) {
                    ++class445.field5621;
                    var1 = false;
                }
            }
            if (class565.field7887 != null && class277.field3474[var2] == null && ~class565.field7887[var2] != 0) {
                class277.field3474[var2] = class600.field8416.method3366(0, class500.field6598[var2], (byte) 103, class565.field7887[var2]);
                if (class277.field3474[var2] == null) {
                    ++class445.field5621;
                    var1 = false;
                }
            }
        }
        if (class61.field827 == null) {
            if (class142.field1837 != null && class381.field4806.method3373(class142.field1837.field574 + "_staticelements", true)) {
                if (class381.field4806.method3362(false, class142.field1837.field574 + "_staticelements")) {
                    class61.field827 = class365.method2002(class381.field4806, 512, class66.field896, class142.field1837.field574 + "_staticelements");
                } else {
                    var1 = false;
                    ++class445.field5621;
                }
            } else {
                class61.field827 = new class335(0);
            }
        }
        if (!var1) {
            class655.field9233 = 1;
        } else {
            boolean var3 = true;
            class508.field6879 = 0;
            for (int var4 = 0; ~var4 > ~class209.field2635.length; ++var4) {
                byte[] var21 = class137.field1782[var4];
                if (var21 != null) {
                    int var22 = (class564.field7842[var4] >> 8) * 64 - class145.field1879;
                    int var23 = (255 & class564.field7842[var4]) * 64 + -class630.field8817;
                    if (class360.field4584 != 0) {
                        var22 = 10;
                        var23 = 10;
                    }
                    var3 &= class22.method165(var21, var22, (byte) 68, class431.field5395, var23, class452.field5802);
                }
                byte[] var24 = class169.field2212[var4];
                if (var24 != null) {
                    int var25 = (class564.field7842[var4] >> 8) * 64 + -class145.field1879;
                    int var26 = (class564.field7842[var4] & 255) * 64 + -class630.field8817;
                    if (~class360.field4584 != -1) {
                        var26 = 10;
                        var25 = 10;
                    }
                    var3 &= class22.method165(var24, var25, (byte) -105, class431.field5395, var26, class452.field5802);
                }
            }
            if (!var3) {
                class655.field9233 = 2;
            } else {
                if (class655.field9233 != 0) {
                    class112.method627(true, class32.field452, true, class689.field9771, class133.field1729, class83.field1120.method476((byte) -88, class250.field3068) + "<br>(100%)");
                }
                class671.method3767((byte) 76);
                class111.method623(0);
                boolean var5 = false;
                if (class32.field452.method1047() && class301.field3698.field6631) {
                    for (int var6 = 0; ~class209.field2635.length < ~var6; ++var6) {
                        if (class169.field2212[var6] != null || class496.field6546[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class301.field3698.field6609) {
                    var7 = class390.field4917[class637.field8934];
                } else {
                    var7 = class351.field4492[class637.field8934];
                }
                if (class32.field452.method1011()) {
                    ++var7;
                }
                class631.method3533(class32.field452, class271.field3428, 9, 4, class431.field5395, class452.field5802, var7, var5, class32.field452.method997() > 0);
                if (!class413.field5172) {
                    class245.method1460((class413) null);
                } else {
                    class245.method1460(class462.field5888);
                }
                for (int var8 = 0; var8 < 4; ++var8) {
                    class154.field1991[var8].method1954(2097152);
                }
                class449.method2400(1);
                class487.method2636(2, false);
                class583.method3213(arg0 + 66);
                class381.field4815 = false;
                class419.field5274 = null;
                class671.method3767((byte) 76);
                System.gc();
                class310.method1790(-1, true);
                class377.method2049(arg0 ^ -5);
                class507.field6870 = class301.field3698.method2703(class651.field9191, arg0 ^ -123);
                class135.field1753 = class301.field3698.field6631;
                class324.field4168 = ~class380.field4801 <= -97;
                class388.field4897 = class301.field3698.method2700(-51, class651.field9191);
                class119.field1528 = !class301.field3698.field6621;
                class232.field2895 = !class301.field3698.method135(class651.field9191, arg0 + 95) ? class667.field9402 : -1;
                class349.field4463 = class408.method2167(5, class651.field9191) || class301.field3698.field6636;
                class222.field2717 = class301.field3698.field6604;
                class392.field4940 = new class646(4, class431.field5395, class452.field5802, false);
                if (~class360.field4584 != -1) {
                    class428.method2266((byte) 111, class209.field2635, class392.field4940);
                } else {
                    class106.method598(class209.field2635, class392.field4940, arg0 ^ 12);
                }
                class462.method2457(class431.field5395 >> 4, false, class452.field5802 >> 4);
                class550.method3038((byte) 77);
                if (var5) {
                    class68.method405(true);
                    class148.field1898 = new class646(1, class431.field5395, class452.field5802, true);
                    if (class360.field4584 == 0) {
                        class106.method598(class496.field6546, class148.field1898, 8);
                        class310.method1790(arg0 + -5, true);
                    } else {
                        class428.method2266((byte) 94, class496.field6546, class148.field1898);
                        class310.method1790(-1, true);
                    }
                    class148.field1898.method505((byte) -62, 0, class392.field4940.field1245[0]);
                    class148.field1898.method509((int[][][]) null, (class356[]) null, class32.field452, (byte) 20);
                    class68.method405(false);
                }
                class392.field4940.method509(var5 ? class148.field1898.field1245 : null, class154.field1991, class32.field452, (byte) 20);
                if (~class360.field4584 == -1) {
                    class310.method1790(arg0 + -5, true);
                    class663.method3735(class137.field1782, class392.field4940, (byte) 88);
                    if (class277.field3474 != null) {
                        class537.method2914(-124);
                    }
                } else {
                    class310.method1790(-1, true);
                    class613.method3377(-111, class392.field4940, class137.field1782);
                }
                class111.method623(arg0 ^ 4);
                if (~class380.field4801 > -97) {
                    class233.method1405((byte) 88);
                }
                class310.method1790(-1, true);
                class392.field4940.method516(!var5 ? null : class699.field9887[0], (class272) null, -23, class32.field452);
                class392.field4940.method3608(false, (byte) 45, class32.field452);
                class310.method1790(-1, true);
                if (var5) {
                    class68.method405(true);
                    class310.method1790(arg0 + -5, true);
                    if (~class360.field4584 != -1) {
                        class613.method3377(124, class148.field1898, class169.field2212);
                    } else {
                        class663.method3735(class169.field2212, class148.field1898, (byte) 50);
                    }
                    class111.method623(arg0 ^ 4);
                    class310.method1790(-1, true);
                    class148.field1898.method516((class272) null, class256.field3127[0], arg0 + 100, class32.field452);
                    class148.field1898.method3608(true, (byte) 45, class32.field452);
                    class310.method1790(-1, true);
                    class68.method405(false);
                }
                class458.method2446(25923);
                int var9 = class392.field4940.field9083;
                if (~class476.field6039 > ~var9) {
                    var9 = class476.field6039;
                }
                if (~var9 > ~(class476.field6039 + -1)) {
                    var9 = class476.field6039 + -1;
                }
                if (!class301.field3698.method135(class651.field9191, 105)) {
                    class52.method336(var9);
                } else {
                    class52.method336(0);
                }
                for (int var10 = 0; ~var10 > -5; ++var10) {
                    for (int var19 = 0; ~var19 > ~class431.field5395; ++var19) {
                        for (int var20 = 0; ~var20 > ~class452.field5802; ++var20) {
                            class195.method1179(1736, var20, var10, var19);
                        }
                    }
                }
                class512.method2766(-110);
                class671.method3767((byte) 76);
                class529.method2876(-1);
                class111.method623(arg0 ^ arg0);
                class138.method792(false);
                if (class582.field8140 != null && class446.field5686 != null && ~class504.field6675 == -12) {
                    ++class207.field2625;
                    class704 var11 = class314.method1820(class464.field5912, class400.field5014, (byte) -119);
                    var11.field9929.method3464(1057001181, -117);
                    class122.method654(var11, (byte) -36);
                }
                if (~class360.field4584 == -1) {
                    int var12 = (-(class431.field5395 >> 4) + class313.field4036) / 8;
                    int var13 = ((class431.field5395 >> 4) + class313.field4036) / 8;
                    int var14 = (-(class452.field5802 >> 4) + class285.field3532) / 8;
                    int var15 = ((class452.field5802 >> 4) + class285.field3532) / 8;
                    for (int var16 = var12 + -1; var16 <= var13 + 1; ++var16) {
                        for (int var17 = var14 - 1; ~(var15 + 1) <= ~var17; ++var17) {
                            if (var16 < var12 || var13 < var16 || ~var14 < ~var17 || var15 < var17) {
                                class600.field8416.method3347("m" + var16 + "_" + var17, (byte) 54);
                                class600.field8416.method3347("l" + var16 + "_" + var17, (byte) 54);
                            }
                        }
                    }
                }
                if (~class504.field6675 == -5) {
                    class361.method1987(3, arg0 ^ 17);
                } else if (class504.field6675 != 8) {
                    class361.method1987(10, -119);
                    if (class446.field5686 != null) {
                        class704 var18 = class314.method1820(class49.field697, class400.field5014, (byte) -69);
                        class122.method654(var18, (byte) -36);
                    }
                } else {
                    class361.method1987(7, 22);
                }
                class273.method1566(false);
                class671.method3767((byte) 76);
                class494.method2665(true);
                if (class468.field5952) {
                    class193.method1171(4, "Took: " + (class571.method3150(arg0 ^ 106) + -class559.field7751) + "ms");
                    class468.field5952 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(IZ)V")
    public final void method277(int arg0, boolean arg1) {
        int var3 = 21 % ((arg0 - 65) / 60);
        ++field4224;
        class33 var4 = super.field3475.method2965(8960);
        if (this.field4219 && var4 != null) {
            float var5 = (1.0F - Math.abs(super.field3475.field7610[1])) * 2.0F + 1.0F;
            super.field3475.method3027(1, true);
            super.field3475.method2960(var4, -2);
            super.field3475.method3027(0, true);
            super.field3475.method2960(this.field4218.field2721, -2);
            long var6 = this.field4230.field8883;
            OpenGL.glUseProgramObjectARB(var6);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var6, "sunDir"), -super.field3475.field7610[0], -super.field3475.field7610[1], -super.field3475.field7610[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var6, "sunColour"), super.field3475.field7541 * var5, super.field3475.field7620 * var5, super.field3475.field7534 * var5, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var6, "sunExponent"), 928.0F * Math.abs(super.field3475.field7610[1]) + 64.0F);
            this.field4222 = true;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIII)V")
    public static final void method1879(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4221;
        if (arg3 != 0) {
            field4223 = -0.29173368F;
        }
        class592 var5 = class61.method371(4, arg2, (byte) -109);
        var5.method3256((byte) 11);
        var5.field8319 = arg4;
        var5.field8314 = arg0;
        var5.field8312 = arg1;
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lqj;Lpea;)V")
    public class331(class548 arg0, class222 arg1) {
        super(arg0);
        this.field4218 = arg1;
        if (this.field4218.field2721 != null && super.field3475.field7592 && super.field3475.field7544) {
            class165 var3 = class506.method2719((byte) 118, super.field3475, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class165 var4 = class506.method2719((byte) 110, super.field3475, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field4230 = class220.method1300(new class165[] { var3, var4 }, super.field3475, 0);
            this.field4219 = this.field4230 != null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)V")
    public final void method276(int arg0, int arg1, int arg2) {
        if (this.field4222) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            float var8 = (float) (arg2 >> 19 & 15) / 16.0F;
            float var9 = (float) (15 & arg2 >> 23) / 16.0F;
            int var10 = (2092844276 & arg2) >> 27;
            long var11 = this.field4230.field8883;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field3475.field7477 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field4225;
        if (arg1 != 50) {
            this.method277(121, true);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
    public final void method278(int arg0) {
        ++field4231;
        if (this.field4222) {
            super.field3475.method3027(1, true);
            super.field3475.method2960((class615) null, arg0 + -1270);
            super.field3475.method3027(0, true);
            super.field3475.method2960((class615) null, -2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4222 = false;
        }
        if (arg0 != 1268) {
            this.field4219 = true;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)Z")
    public final boolean method284(byte arg0) {
        if (arg0 >= -93) {
            this.method276(-94, -97, -126);
        }
        ++field4226;
        return this.field4219;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IZ)V")
    public final void method280(int arg0, boolean arg1) {
        ++field4228;
        if (arg0 >= -64) {
            this.method277(-86, true);
        }
    }
}
