import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class262 extends class165 {

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Z")
    private boolean field3569 = false;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "Z")
    private boolean field3585 = false;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Lfa;")
    private class565 field3577;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Lwaa;")
    private class622 field3573;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field3583 = 0;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lju;")
    public static class102 field3575 = new class102(55, -1);

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "Lwu;")
    public static class557 field3579;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V", line = 4)
    public final void method679(byte arg0) {
        if (this.field3569) {
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2154((class396) null, -2);
            super.field2260.method2196(0, (byte) 89);
            super.field2260.method2154((class396) null, -2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3569 = false;
        }
        ++field3578;
        if (arg0 >= -97) {
            this.method678(false, -82);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lwu;Lwu;Lwu;ILwu;)V", line = 26)
    private static final void method1622(class557 arg0, class557 arg1, class557 arg2, int arg3, class557 arg4) {
        class121.field1664 = arg2;
        ++field3582;
        if (arg3 > -70) {
            method1622((class557) null, (class557) null, (class557) null, 64, (class557) null);
        }
        class602.field8614 = arg4;
        class306.field3969 = arg1;
        class491.field6599 = new class712[class602.field8614.method3341((byte) -56)][];
        class325.field4188 = new boolean[class602.field8614.method3341((byte) -106)];
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lep;Lfa;)V", line = 92)
    public class262(class371 arg0, class565 arg1) {
        super(arg0);
        this.field3577 = arg1;
        if (this.field3577.field8030 != null && super.field2260.field5093 && super.field2260.field5005) {
            class510 var3 = class689.method3927("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field2260, (byte) -80, 35633);
            class510 var4 = class689.method3927("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field2260, (byte) -80, 35632);
            this.field3573 = class163.method1016(super.field2260, new class510[] { var3, var4 }, -12748);
            this.field3585 = this.field3573 != null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIII)V", line = 49)
    public static final void method1623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3572;
        if (arg5 >= -111) {
            field3575 = null;
        }
        if (~arg4 <= -2 && arg7 >= 1 && ~arg4 >= ~(class514.field7179 + -2) && class456.field6281 + -2 >= arg7) {
            int var9 = arg1;
            if (~arg1 > -4 && class753.method4175(-12388, arg7, arg4)) {
                var9 = arg1 + 1;
            }
            if (class674.field9500.field5113.method3798(0) == 0 && !client.method2687(var9, arg4, arg7, class183.field2654, 115)) {
                return;
            }
            if (class352.field4549 == null) {
                return;
            }
            class97.field1412.method1733(class464.field6351[arg1], arg4, class96.field1401, arg2, (byte) -58, arg1, arg7);
            if (~arg3 <= -1) {
                int var10 = class674.field9500.field5131.method2840(0);
                class674.field9500.method2250((byte) 100, 1, class674.field9500.field5131);
                class97.field1412.method1731(class464.field6351[arg1], arg6, class96.field1401, arg0, (byte) -55, arg1, arg3, arg7, arg8, var9, arg4);
                class674.field9500.method2250((byte) 105, var10, class674.field9500.field5131);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V", line = 113)
    public final void method673(int arg0, boolean arg1) {
        ++field3571;
        class633 var3 = super.field2260.method2102(true);
        if (arg0 >= -115) {
            this.method672((byte) -61);
        }
        if (this.field3585 && var3 != null) {
            float var4 = (-Math.abs(super.field2260.field5022[1]) + 1.0F) * 2.0F + 1.0F;
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2154(var3, -2);
            super.field2260.method2196(0, (byte) 89);
            super.field2260.method2154(this.field3577.field8030, -2);
            long var5 = this.field3573.field8850;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field2260.field5022[0], -super.field2260.field5022[1], -super.field2260.field5022[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field2260.field5015 * var4, super.field2260.field5024 * var4, super.field2260.field5035 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field2260.field5022[1]) + 64.0F);
            this.field3569 = true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBI)V", line = 144)
    public final void method675(int arg0, byte arg1, int arg2) {
        if (arg1 < 3) {
            this.field3569 = false;
        }
        if (this.field3569) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((59 & arg0) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((229289 & arg2) >> 16) / 8.0F;
            float var8 = (float) ((arg2 & 8154636) >> 19) / 16.0F;
            float var9 = (float) ((arg2 & 128443573) >> 23) / 16.0F;
            int var10 = arg2 >> 27 & 15;
            long var11 = this.field3573.field8850;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field2260.field4947 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field3576;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V", line = 192)
    public final void method678(boolean arg0, int arg1) {
        ++field3584;
        if (arg1 != 0) {
            this.field3577 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 203)
    public static final void method1624(int arg0) {
        if (arg0 <= -113) {
            class8.field81 = false;
            ++field3570;
            class330.method1918(7);
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)I", line = 215)
    public static final int method1625(byte arg0) {
        if (~class674.field9500.field5164.method3935(0) == -1) {
            for (int var1 = 0; class457.field6296 > var1; ++var1) {
                if (class751.field10438[var1].method1544(-28046) == 's' || class751.field10438[var1].method1544(-28046) == 'S') {
                    class674.field9500.method2250((byte) 117, 1, class674.field9500.field5164);
                    break;
                }
            }
        }
        ++field3581;
        if (class666.field9389 == class471.field6431) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() + -var2.freeMemory()) / 1024L);
            long var4 = class224.method1457((byte) -62);
            if (class18.field221 == 0L) {
                class18.field221 = var4;
            }
            if (var3 > 16384 && -class18.field221 + var4 < 5000L) {
                if (-class124.field1697 + var4 > 1000L) {
                    System.gc();
                    class124.field1697 = var4;
                }
                return 0;
            }
        }
        if (class666.field9389 == class471.field6444) {
            if (class433.field5948 == null) {
                class433.field5948 = new class452(class480.field6528, class474.field6488, class701.field9768, class682.field9584);
            }
            if (!class433.field5948.method2720(-121)) {
                return 0;
            }
            class735.method4079(false, (String) null, true, 0);
            class696.field9712 = !class747.method4152(-120);
            class488.field6577 = class61.method395(class696.field9712 ? 34 : 32, 1, false, 1000000);
            class395.field5488 = class61.method395(33, 1, false, 1000000);
            class448.field6168 = class61.method395(13, 1, false, 1000000);
        }
        if (class666.field9389 == class471.field6445) {
            boolean var6 = class395.field5488.method3320((byte) 126);
            int var7 = class753.field10469[33].method2275((byte) -56);
            int var8 = var7 + class753.field10469[class696.field9712 ? 34 : 32].method2275((byte) -56);
            int var9 = var8 + class753.field10469[13].method2275((byte) -56);
            int var10 = var9 + (var6 ? 100 : class395.field5488.method3315(0));
            if (var10 != 400) {
                return var10 / 4;
            }
            class515.field7188 = class488.field6577.method3331(25219);
            class132.field1789 = class395.field5488.method3331(25219);
            class359.method2027(class488.field6577, arg0 + -88);
            int var11 = class674.field9500.field5140.method72(0);
            class374.field5165 = new class639(class210.field2984, class369.field4721, class395.field5488);
            int[] var12 = class374.field5165.method3715(0, var11);
            if (~var12.length == -1) {
                var12 = class374.field5165.method3715(arg0 + -88, 0);
            }
            class210 var13 = new class210(class488.field6577, class448.field6168);
            if (~var12.length < -1) {
                class14.field199 = new class381[var12.length];
                for (int var14 = 0; ~var14 > ~class14.field199.length; ++var14) {
                    class14.field199[var14] = new class36(class374.field5165.method3716(29944, var12[var14]), var13);
                }
            }
        }
        if (class666.field9389 == class471.field6446) {
            class40.method280(class160.method1000(true), (byte) -32, class488.field6577, class448.field6168);
        }
        if (class666.field9389 == class471.field6447) {
            int var15 = class48.method329(1629291756);
            int var16 = class755.method4185(arg0 ^ 66);
            if (~var15 > ~var16) {
                return var15 * 100 / var16;
            }
        }
        if (class666.field9389 == class471.field6448) {
            if (class14.field199 != null && class14.field199.length > 0) {
                if (~class14.field199[0].method252((byte) 40) > -101) {
                    return 0;
                }
                if (~class14.field199.length < -2 && class374.field5165.method3717(0) && class14.field199[1].method252((byte) 40) < 100) {
                    return 0;
                }
            }
            class533.method3182(class96.field1401, (byte) 99);
            class717.method4031(class96.field1401, (byte) 50);
            class647.method3754(1, true);
        }
        if (class666.field9389 == class471.field6449) {
            for (int var17 = 0; var17 < 4; ++var17) {
                class464.field6351[var17] = class285.method1701(-6169, class456.field6281, class514.field7179);
            }
        }
        if (class666.field9389 == class471.field6450) {
            class323.field4156 = class61.method395(8, 1, false, 1000000);
            class332.field4260 = class61.method395(0, 1, false, arg0 + 999912);
            class351.field4466 = class61.method395(1, 1, false, 1000000);
            class437.field5994 = class61.method395(2, 1, false, 1000000);
            class335.field4305 = class61.method395(3, 1, false, arg0 ^ 999960);
            class264.field3590 = class61.method395(4, 1, false, 1000000);
            class281.field3729 = class61.method395(5, 1, true, 1000000);
            class76.field1047 = class61.method395(6, 1, true, 1000000);
            class547.field7709 = class61.method395(7, 1, false, 1000000);
            class372.field5101 = class61.method395(9, 1, false, arg0 ^ 999960);
            class245.field3413 = class61.method395(10, 1, false, arg0 + 999912);
            class728.field10211 = class61.method395(11, 1, false, arg0 ^ 999960);
            class300.field3919 = class61.method395(12, 1, false, 1000000);
            class445.field6084 = class61.method395(14, 1, false, arg0 ^ 999960);
            class91.field1237 = class61.method395(15, 1, false, 1000000);
            class331.field4253 = class61.method395(16, 1, false, 1000000);
            class574.field8111 = class61.method395(17, 1, false, 1000000);
            class506.field7072 = class61.method395(18, 1, false, 1000000);
            class743.field10355 = class61.method395(19, 1, false, arg0 ^ 999960);
            class216.field3065 = class61.method395(20, 1, false, 1000000);
            class579.field8272 = class61.method395(21, 1, false, 1000000);
            class399.field5524 = class61.method395(22, 1, false, arg0 + 999912);
            class378.field5267 = class61.method395(23, 1, true, 1000000);
            class132.field1785 = class61.method395(24, 1, false, 1000000);
            class610.field8678 = class61.method395(25, 1, false, 1000000);
            class604.field8637 = class61.method395(26, 1, true, 1000000);
            field3579 = class61.method395(27, 1, false, 1000000);
            class602.field8615 = class61.method395(28, 1, true, 1000000);
            class430.field5923 = class61.method395(29, 1, false, 1000000);
            class640.field9093 = class61.method395(30, 1, true, arg0 ^ 999960);
            class387.field5400 = class61.method395(31, 1, true, 1000000);
            class635.field9039 = class61.method395(36, 2, true, 1000000);
        }
        if (class666.field9389 == class471.field6451) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; ++var19) {
                if (class753.field10469[var19] != null) {
                    var18 += class753.field10469[var19].method2275((byte) -56) * class35.field501[var19] / 100;
                }
            }
            if (~var18 != -101) {
                if (class317.field4079 < 0) {
                    class317.field4079 = var18;
                }
                return (-class317.field4079 + var18) * 100 / (-class317.field4079 + 100);
            }
            class340.method1966(1, class323.field4156);
            class40.method280(class160.method1000(true), (byte) -32, class323.field4156, class448.field6168);
        }
        if (class666.field9389 == class471.field6452) {
            if (class658.field9295 == -1) {
                class658.field9295 = class76.field1047.method3311((byte) -24, "scape main");
            }
            class181.method1208(arg0 + -87);
            class647.method3754(2, true);
        }
        if (class666.field9389 == class471.field6453) {
            class88.method533(class640.field9093, 101, class379.field5339);
        }
        if (class666.field9389 == class471.field6454) {
            int var20 = class81.method484((byte) 79);
            if (var20 < 100) {
                return var20;
            }
            class583.method3465((byte) -70, class602.field8615.method3318(arg0 + 8853, 1));
            class289.method1708(class602.field8615.method3318(8941, 3), (byte) 116);
        }
        if (class666.field9389 == class471.field6455) {
            if (~class504.field7045 != 0 && !class547.field7709.method3321(class504.field7045, (byte) 122, 0)) {
                return 99;
            }
            class746.field10393 = new class18(class604.field8637, class372.field5101, class323.field4156);
            class223.field3134 = new class392(class210.field2984, class369.field4721, class437.field5994);
            class544.field7653 = new class267(class210.field2984, class369.field4721, class437.field5994);
            class466.field6364 = new class169(class210.field2984, class369.field4721, class437.field5994, class323.field4156);
            class751.field10442 = new class157(class210.field2984, class369.field4721, class574.field8111);
            class124.field1690 = new class140(class210.field2984, class369.field4721, class437.field5994);
            class304.field3958 = new class4(class210.field2984, class369.field4721, class437.field5994);
            class486.field6564 = new class129(class210.field2984, class369.field4721, class437.field5994, class547.field7709);
            class17.field217 = new class206(class210.field2984, class369.field4721, class437.field5994);
            class125.field1706 = new class610(class210.field2984, class369.field4721, class437.field5994);
            class264.field3604 = new class534(class210.field2984, class369.field4721, true, class331.field4253, class547.field7709);
            class92.field1241 = new class343(class210.field2984, class369.field4721, class437.field5994, class323.field4156);
            class625.field8924 = new class139(class210.field2984, class369.field4721, class437.field5994, class323.field4156);
            class643.field9112 = new class678(class210.field2984, class369.field4721, true, class506.field7072, class547.field7709);
            class487.field6572 = new class511(class210.field2984, class369.field4721, true, class223.field3134, class743.field10355, class547.field7709);
            class535.field7498 = new class370(class210.field2984, class369.field4721, class437.field5994);
            class274.field3684 = new class322(class210.field2984, class369.field4721, class216.field3065, class332.field4260, class351.field4466);
            class533.field7474 = new class184(class210.field2984, class369.field4721, class437.field5994);
            class128.field1758 = new class713(class210.field2984, class369.field4721, class437.field5994);
            class267.field3625 = new class708(class210.field2984, class369.field4721, class579.field8272, class547.field7709);
            class98.field1425 = new class755(class210.field2984, class369.field4721, class437.field5994);
            class296.field3858 = new class399(class210.field2984, class369.field4721, class437.field5994);
            class468.field6403 = new class114(class210.field2984, class369.field4721, class437.field5994);
            class62.field836 = new class274(class210.field2984, class369.field4721, class399.field5524);
            class410.field5694 = new class637(class210.field2984, class369.field4721, class437.field5994);
            method1622(class448.field6168, class547.field7709, class323.field4156, -85, class335.field4305);
            class646.method3748((byte) 82, class430.field5923);
            class139.field1910 = new class631(class369.field4721, class132.field1785, class610.field8678);
            class225.field3151 = new class627(class369.field4721, class132.field1785, class610.field8678, new class109());
            class509.method3040(false);
            class264.field3604.method3190(15, class674.field9500.field5113.method3798(0) == 0);
            class554.field7826 = new class736();
            class469.method2794(false);
            class490.method2864((byte) 64, field3579);
            class720.method4040(class746.field10393, 124, class547.field7709);
            class317 var21 = new class317(class245.field3413.method3330((byte) 67, "", "huffman"));
            class92.method553((byte) -92, var21);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class465.field6357 = class741.method4129((byte) 89);
            class105.field1537 = new class361(true, class379.field5339);
        }
        if (class666.field9389 == class471.field6457) {
            int var22 = class625.method3654(arg0 ^ -64, class323.field4156) - -class673.method3855(-22016, true);
            int var23 = class523.method3127(true) + class755.method4185(arg0 + -62);
            if (~var22 > ~var23) {
                return var22 * 100 / var23;
            }
        }
        if (class666.field9389 == class471.field6458) {
            class531.method3169(class378.field5267, class124.field1690, class304.field3958, class264.field3604, class92.field1241, class625.field8924, class554.field7826);
        }
        if (class666.field9389 == class471.field6459) {
            class594.field8568 = new int[class468.field6403.field1605];
            class504.field7038 = new boolean[class468.field6403.field1605];
            class216.field3066 = new String[class296.field3858.field5521];
            for (int var24 = 0; var24 < class468.field6403.field1605; ++var24) {
                if (~class468.field6403.method761(var24, 11).field1669 == -1) {
                    class504.field7038[var24] = true;
                    ++class333.field4270;
                }
                class594.field8568[var24] = -1;
            }
            class519.method3088(0);
            class704.field9788 = class335.field4305.method3311((byte) -24, "loginscreen");
            class711.field9918 = class335.field4305.method3311((byte) -24, "lobbyscreen");
            class281.field3729.method3338(false, true, true);
            class76.field1047.method3338(true, true, true);
            class323.field4156.method3338(true, true, true);
            class448.field6168.method3338(true, true, true);
            class245.field3413.method3338(true, true, true);
            class335.field4305.method3338(true, true, true);
            class437.field5994.field7898 = 2;
            class594.field8565 = true;
            class574.field8111.field7898 = 2;
            class331.field4253.field7898 = 2;
            class506.field7072.field7898 = 2;
            class743.field10355.field7898 = 2;
            class216.field3065.field7898 = 2;
            class579.field8272.field7898 = 2;
        }
        if (class666.field9389 == class471.field6460) {
            if (!class393.method2393(class704.field9788, -1)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; ~class491.field6599[class704.field9788].length < ~var26; ++var26) {
                class712 var27 = class491.field6599[class704.field9788][var26];
                if (~var27.field10039 == -6 && ~var27.field9973 != 0 && !class323.field4156.method3321(var27.field9973, (byte) 101, 0)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (arg0 != 88) {
            method1624(-52);
        }
        if (class666.field9389 == class471.field6461) {
            class404.method2452(true, true);
        }
        if (class666.field9389 == class471.field6462) {
            class562.field7995.method1572((byte) -5);
            try {
                class494.field6942.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class562.field7995 = null;
            class14.field199 = null;
            class395.field5488 = null;
            class488.field6577 = null;
            class494.field6942 = null;
            class374.field5165 = null;
            class287.method1704(1806);
            class442.field6070 = class674.field9500.field5164.method3935(0) == 1;
            class674.field9500.method2250((byte) 101, 1, class674.field9500.field5164);
            class199.method1350(arg0 + -26247);
            if (class442.field6070) {
                class736.method4088((byte) 122, false, 0);
            } else {
                class736.method4088((byte) 122, false, class674.field9500.field5118.method1006(0));
            }
            class518.method3079(false, -1, -1, true, class674.field9500.field5133.method1962(arg0 + -88));
            class533.method3182(class96.field1401, (byte) 99);
            class717.method4031(class96.field1401, (byte) 50);
            class359.method2025(-2301, class96.field1401, class323.field4156);
            class375.method2264(arg0 ^ -36, class209.field2979);
        }
        return class102.method691((byte) 106);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLhl;)V", line = 651)
    public final void method671(int arg0, boolean arg1, class396 arg2) {
        ++field3574;
        if (!this.field3569) {
            super.field2260.method2154(arg2, -2);
            super.field2260.method2208(arg0, 6406);
        }
        if (!arg1) {
            this.field3569 = false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V", line = 674)
    public static void method1626(byte arg0) {
        field3579 = null;
        int var1 = -59 % ((-73 - arg0) / 45);
        field3575 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Z", line = 689)
    public final boolean method672(byte arg0) {
        if (arg0 < 11) {
            return false;
        } else {
            ++field3580;
            return this.field3585;
        }
    }
}
