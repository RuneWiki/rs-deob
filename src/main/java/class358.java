import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class358 extends class348 {

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
    private boolean field5548 = false;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Z")
    private boolean field5556 = false;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Lwc;")
    private class273 field5561;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lmv;")
    private class233 field5551;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field5550 = -1;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lqu;")
    public static class219 field5552 = new class219(30, -1);

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field5563 = 0;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Lbi;")
    public static class104 field5562 = new class104(91, -2);

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "[Lct;")
    public static class369[] field5564 = new class369[128];

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field5566 = 0;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "Lgh;")
    public static class350 field5565;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZB)V")
    public final void method262(boolean arg0, byte arg1) {
        ++field5549;
        int var3 = 118 / ((arg1 - -23) / 41);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Z")
    public final boolean method267(int arg0) {
        if (arg0 != -233) {
            this.method263(-124, -53, (byte) -75);
        }
        ++field5558;
        return false;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
    public static void method2373(int arg0) {
        field5564 = null;
        field5562 = null;
        if (arg0 == 26738) {
            field5565 = null;
            field5552 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILpb;ILhw;)V")
    public static final void method2374(int arg0, class2 arg1, int arg2, class208 arg3) {
        ++field5557;
        class540 var4 = new class540();
        var4.field7893 = arg3.method1445(arg0 + 47);
        var4.field7888 = arg3.method1436((byte) 105);
        var4.field7889 = new class495[var4.field7893];
        var4.field7887 = new class495[var4.field7893];
        var4.field7895 = new int[var4.field7893];
        var4.field7896 = new int[var4.field7893];
        var4.field7891 = new byte[var4.field7893][][];
        var4.field7892 = new int[var4.field7893];
        for (int var5 = arg0; var5 < var4.field7893; ++var5) {
            try {
                int var6 = arg3.method1445(-92);
                if (var6 != 0 && var6 != 1 && ~var6 != -3) {
                    if (var6 == 3 || ~var6 == -5) {
                        String var7 = arg3.method1448(65535);
                        String var8 = arg3.method1448(65535);
                        int var9 = arg3.method1445(-118);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; ~var11 > ~var9; ++var11) {
                            var10[var11] = arg3.method1448(65535);
                        }
                        byte[][] var12 = new byte[var9][];
                        if (~var6 == -4) {
                            for (int var13 = 0; var13 < var9; ++var13) {
                                int var14 = arg3.method1436((byte) 119);
                                var12[var13] = new byte[var14];
                                arg3.method1471(var14, true, var12[var13], 0);
                            }
                        }
                        var4.field7896[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; ~var16 > ~var9; ++var16) {
                            var15[var16] = class263.method1804(var10[var16], (byte) 123);
                        }
                        var4.field7889[var5] = arg1.method20(0, class263.method1804(var7, (byte) 118), var15, var8);
                        var4.field7891[var5] = var12;
                    }
                } else {
                    String var17 = arg3.method1448(65535);
                    String var18 = arg3.method1448(65535);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method1436((byte) 98);
                    }
                    var4.field7896[var5] = var6;
                    var4.field7895[var5] = var19;
                    var4.field7887[var5] = arg1.method28((byte) 50, class263.method1804(var17, (byte) 105), var18);
                }
            } catch (ClassNotFoundException var20) {
                var4.field7892[var5] = -1;
            } catch (SecurityException var21) {
                var4.field7892[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field7892[var5] = -3;
            } catch (Exception var23) {
                var4.field7892[var5] = -4;
            } catch (Throwable var24) {
                var4.field7892[var5] = -5;
            }
        }
        class229.field3804.method2124(var4, (byte) 112);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILed;)V")
    public final void method264(int arg0, int arg1, class427 arg2) {
        ++field5553;
        if (!this.field5556) {
            super.field5398.method1540(54, arg2);
            super.field5398.method1494(arg0, -25951);
        }
        int var4 = -117 / ((arg1 - -49) / 44);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(ZB)V")
    public final void method261(boolean arg0, byte arg1) {
        ++field5560;
        class15 var3 = super.field5398.method1517((byte) 115);
        if (this.field5548 && var3 != null) {
            super.field5398.method1507(1, 0);
            super.field5398.method1540(118, var3);
            super.field5398.method1507(0, 0);
            super.field5398.method1540(94, this.field5561.field4348);
            long var4 = this.field5551.field3852;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field5398.field3572[0], -super.field5398.field3572[1], -super.field5398.field3572[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5398.field3611, super.field5398.field3512, super.field5398.field3539, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field5398.field3572[1]) + 96.0F);
            this.field5556 = true;
        }
        if (arg1 > -30) {
            this.field5556 = true;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)V")
    public final void method263(int arg0, int arg1, byte arg2) {
        ++field5559;
        if (this.field5556) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << ((arg1 & 62) >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((245062 & arg0) >> 16) / 8.0F;
            long var8 = this.field5551.field3852;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5398.field3484 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg2 > -51) {
            field5566 = -12;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Z")
    public static final boolean method2375(int arg0, int arg1, int arg2) {
        ++field5555;
        int var3 = 77 % ((-42 - arg1) / 39);
        return (458752 & arg2) != 0 | class416.method2663(arg2, arg0, 122) || class439.method2789(63, arg2, arg0);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public final void method265(int arg0) {
        if (this.field5556) {
            super.field5398.method1507(1, 0);
            super.field5398.method1540(75, (class427) null);
            super.field5398.method1507(0, 0);
            super.field5398.method1540(100, (class427) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5556 = false;
        }
        int var2 = 104 % ((arg0 - 61) / 63);
        ++field5554;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lna;Lwc;)V")
    public class358(class211 arg0, class273 arg1) {
        super(arg0);
        this.field5561 = arg1;
        if (this.field5561.field4348 != null && super.field5398.field3504 && super.field5398.field3545) {
            class297 var3 = class284.method1908(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field5398, (byte) -85);
            class297 var4 = class284.method1908(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field5398, (byte) -48);
            this.field5551 = class326.method2178(super.field5398, new class297[] { var3, var4 }, 126);
            this.field5548 = this.field5551 != null;
        }
    }
}
