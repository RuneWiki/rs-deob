import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class80 extends class189 {

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Z")
    private boolean field1040 = false;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "Z")
    private boolean field1039 = false;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "Lpq;")
    private class132 field1035;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "Lre;")
    private class435 field1045;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "Lkn;")
    public static class530 field1037 = new class530("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "Leh;")
    public static class246 field1046 = new class246(9, 14);

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "[[S")
    public static short[][] field1041;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[[[BIBII)V", line = 6)
    public static final void method603(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++class479.field6683;
        class357.field5124 = 0;
        for (int var6 = class228.field3359; var6 < class409.field5785; ++var6) {
            class239[][] var17 = class268.field3910[var6];
            for (int var18 = class230.field3392; var18 < class209.field3046; ++var18) {
                for (int var19 = class187.field2692; var19 < class276.field4100; ++var19) {
                    class239 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (!class477.field6647[var18 - class88.field1096 + class153.field2206][var19 - class204.field2910 + class153.field2206] || arg1 != null && var6 >= arg2 && arg1[var6][var18][var19] == arg3) {
                            var20.field3480 = false;
                            var20.field3472 = false;
                            var20.field3478 = 0;
                            if (var18 >= class88.field1096 - 16 && var18 <= class88.field1096 + 16 && var19 >= class204.field2910 - 16 && var19 <= class204.field2910 + 16 && (var20.field3487 != null || var20.field3473 != null || var20.field3474 != null || var20.field3471 != null || var20.field3493 != null || var20.field3482 != null)) {
                                class435.field6118.method1450((byte) -126, var20);
                            }
                        } else {
                            var20.field3480 = true;
                            var20.field3472 = true;
                            if (var20.field3482 != null) {
                                var20.field3490 = true;
                            } else {
                                var20.field3490 = false;
                            }
                            ++class357.field5124;
                        }
                    }
                }
            }
        }
        boolean var7 = class60.field743 == class330.field4818;
        for (int var8 = class228.field3359; var8 < class409.field5785; ++var8) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class489.field6839.method317() && var8 >= arg2 && arg1 != null) {
                int var10 = class477.field6647.length;
                if (class477.field6647.length + class230.field3392 > class6.field109) {
                    var10 -= class477.field6647.length + class230.field3392 - class6.field109;
                }
                int var11 = class477.field6647[0].length;
                if (class477.field6647[0].length + class187.field2692 > class272.field4032) {
                    var11 -= class477.field6647[0].length + class187.field2692 - class272.field4032;
                }
                int var12 = class12.field158;
                while (true) {
                    if (var12 >= var10) {
                        class435.field6118.method1451(true, 0, class330.field4818[var8], var9, var8);
                        break;
                    }
                    int var13 = class230.field3392 + var12 - class12.field158;
                    for (int var14 = class338.field4886; var14 < var11; ++var14) {
                        class12.field156[var12][var14] = false;
                        if (class477.field6647[var12][var14]) {
                            int var15 = class187.field2692 + var14 - class338.field4886;
                            for (int var16 = var8; var16 >= 0; --var16) {
                                if (class268.field3910[var16][var13][var15] != null && class268.field3910[var16][var13][var15].field3470 == var8) {
                                    class12.field156[var12][var14] = class268.field3910[var16][var13][var15].field3480;
                                    break;
                                }
                            }
                        }
                    }
                    ++var12;
                }
            } else {
                class435.field6118.method1451(false, 0, class330.field4818[var8], var9, var8);
            }
            class435.field6118.method1449((byte) 125);
        }
        if (!class104.method712(true)) {
            class104.method712(false);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 146)
    public static void method604(int arg0) {
        if (arg0 != 16) {
            field1041 = null;
        }
        field1041 = null;
        field1046 = null;
        field1037 = null;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lih;Lpq;)V", line = 159)
    public class80(class503 arg0, class132 arg1) {
        super(arg0);
        this.field1035 = arg1;
        if (this.field1035.field1737 != null && super.field2702.field7366 && super.field2702.field7346) {
            class110 var3 = class316.method1906("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", (byte) 58, super.field2702, 35633);
            class110 var4 = class316.method1906("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", (byte) -107, super.field2702, 35632);
            this.field1045 = class19.method102(-121, super.field2702, new class110[] { var3, var4 });
            this.field1039 = this.field1045 != null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lsv;IB)V", line = 180)
    public final void method51(class478 arg0, int arg1, byte arg2) {
        ++field1044;
        if (arg2 != -58) {
            this.method55(false, -84);
        }
        if (!this.field1040) {
            super.field2702.method2968(arg0, -54);
            super.field2702.method2999(arg1, 113);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(ZI)V", line = 202)
    public final void method55(boolean arg0, int arg1) {
        int var3 = 15 % ((arg1 - 36) / 46);
        ++field1036;
        class55 var4 = super.field2702.method2982((byte) 65);
        if (this.field1039 && var4 != null) {
            super.field2702.method2940(1, (byte) 125);
            super.field2702.method2968(var4, -44);
            super.field2702.method2940(0, (byte) 111);
            super.field2702.method2968(this.field1035.field1737, -72);
            long var5 = this.field1045.field6111;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field2702.field7374[0], -super.field2702.field7374[1], -super.field2702.field7374[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field2702.field7437, super.field2702.field7415, super.field2702.field7341, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field2702.field7374[1]));
            this.field1040 = true;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)V", line = 230)
    public final void method47(boolean arg0, int arg1) {
        if (arg1 != 2) {
            this.field1040 = false;
        }
        ++field1043;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V", line = 248)
    public final void method48(boolean arg0) {
        if (!arg0) {
            method603(-32, (byte[][][]) null, 8, (byte) 23, 62, -118);
        }
        if (this.field1040) {
            super.field2702.method2940(1, (byte) 111);
            super.field2702.method2968((class478) null, -59);
            super.field2702.method2940(0, (byte) 116);
            super.field2702.method2968((class478) null, -101);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1040 = false;
        }
        ++field1038;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BII)V", line = 275)
    public final void method52(byte arg0, int arg1, int arg2) {
        ++field1042;
        if (arg0 != 117) {
            this.method51((class478) null, -96, (byte) 49);
        }
        if (this.field1040) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << (arg2 >> 3 & 7)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (arg1 >> 16 & 3) / 8.0F;
            long var8 = this.field1045.field6111;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2702.field7313 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)Z", line = 306)
    public final boolean method53(byte arg0) {
        int var2 = -118 % ((-58 - arg0) / 43);
        ++field1034;
        return false;
    }
}
