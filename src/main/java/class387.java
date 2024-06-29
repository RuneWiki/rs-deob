import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class387 extends class189 {

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Z")
    private boolean field5435 = false;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Z")
    private boolean field5438 = false;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lpq;")
    private class132 field5434;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lre;")
    private class435 field5427;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Ltn;")
    public static class60 field5442 = new class60(21, 15);

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Ll;")
    public static class16 field5431;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(ZI)V", line = 5)
    public final void method55(boolean arg0, int arg1) {
        ++field5436;
        int var3 = 117 % ((arg1 - 36) / 46);
        class55 var4 = super.field2702.method2982((byte) 65);
        if (this.field5438 && var4 != null) {
            float var5 = 2.0F * (-Math.abs(super.field2702.field7374[1]) + 1.0F) + 1.0F;
            super.field2702.method2940(1, (byte) 95);
            super.field2702.method2968(var4, -86);
            super.field2702.method2940(0, (byte) 113);
            super.field2702.method2968(this.field5434.field1737, -125);
            long var6 = this.field5427.field6111;
            OpenGL.glUseProgramObjectARB(var6);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var6, "sunDir"), -super.field2702.field7374[0], -super.field2702.field7374[1], -super.field2702.field7374[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var6, "sunColour"), super.field2702.field7437 * var5, super.field2702.field7415 * var5, super.field2702.field7341 * var5, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var6, "sunExponent"), Math.abs(super.field2702.field7374[1]) * 928.0F + 64.0F);
            this.field5435 = true;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 37)
    public static final void method2239(int arg0) {
        class345.field5009.method872(127);
        ++field5433;
        class22.field277.method1193((byte) -7);
        int var1 = 121 / ((arg0 - -34) / 49);
        class534.field7831.method1648(-1);
        class487.field6799.setBackground(Color.black);
        class362.field5180 = -1;
        class345.field5009 = class162.method1027((byte) -32, class487.field6799);
        class22.field277 = class271.method1716((byte) 30, true, class487.field6799);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lsv;IB)V", line = 53)
    public final void method51(class478 arg0, int arg1, byte arg2) {
        ++field5432;
        if (arg2 == -58) {
            if (!this.field5435) {
                super.field2702.method2968(arg0, -118);
                super.field2702.method2999(arg1, 72);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Z", line = 69)
    public final boolean method53(byte arg0) {
        int var2 = 96 % ((-58 - arg0) / 43);
        ++field5426;
        return this.field5438;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIILjg;)V", line = 79)
    public static final void method2240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class228 arg6) {
        class58.method478(arg6.field1899, arg2, arg6.field1896, arg1, arg4, arg0, 0, arg3, arg6.field1904, 83);
        if (arg5 != 65535) {
            field5431 = null;
        }
        ++field5437;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)V", line = 94)
    public final void method47(boolean arg0, int arg1) {
        ++field5440;
        if (arg1 != 2) {
            method2241((String) null, -48, (String) null, (byte) -17, (String) null, -21, -26, (String) null);
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lih;Lpq;)V", line = 104)
    public class387(class503 arg0, class132 arg1) {
        super(arg0);
        this.field5434 = arg1;
        if (this.field5434.field1737 != null && super.field2702.field7366 && super.field2702.field7346) {
            class110 var3 = class316.method1906("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", (byte) 89, super.field2702, 35633);
            class110 var4 = class316.method1906("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", (byte) -72, super.field2702, 35632);
            this.field5427 = class19.method102(-51, super.field2702, new class110[] { var3, var4 });
            this.field5438 = this.field5427 != null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 125)
    public final void method48(boolean arg0) {
        if (this.field5435) {
            super.field2702.method2940(1, (byte) 124);
            super.field2702.method2968((class478) null, -90);
            super.field2702.method2940(0, (byte) 124);
            super.field2702.method2968((class478) null, -91);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5435 = false;
        }
        if (!arg0) {
            this.field5435 = false;
        }
        ++field5429;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BII)V", line = 154)
    public final void method52(byte arg0, int arg1, int arg2) {
        if (this.field5435) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            float var8 = (float) ((7928356 & arg1) >> 19) / 16.0F;
            float var9 = (float) ((arg1 & 130280973) >> 23) / 16.0F;
            int var10 = arg1 >> 27 & 15;
            long var11 = this.field5427.field6111;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field2702.field7313 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field5439;
        if (arg0 != 117) {
            this.method53((byte) -28);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;BLjava/lang/String;IILjava/lang/String;)V", line = 196)
    public static final void method2241(String arg0, int arg1, String arg2, byte arg3, String arg4, int arg5, int arg6, String arg7) {
        ++field5428;
        int var8 = -93 % ((arg3 - 10) / 55);
        for (int var9 = 99; var9 > 0; --var9) {
            class179.field2569[var9] = class179.field2569[var9 - 1];
            class268.field3917[var9] = class268.field3917[var9 + -1];
            class254.field3759[var9] = class254.field3759[var9 + -1];
            class315.field4557[var9] = class315.field4557[var9 + -1];
            class308.field4479[var9] = class308.field4479[var9 + -1];
            class189.field2709[var9] = class189.field2709[var9 + -1];
            class509.field7535[var9] = class509.field7535[var9 - 1];
        }
        class179.field2569[0] = arg5;
        class254.field3759[0] = arg7;
        class268.field3917[0] = arg1;
        class315.field4557[0] = arg4;
        class308.field4479[0] = arg2;
        class244.field3545 = class371.field5285;
        class509.field7535[0] = arg6;
        ++class341.field4943;
        class189.field2709[0] = arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLjg;)I", line = 230)
    public static final int method2242(boolean arg0, class228 arg1) {
        ++field5430;
        if (arg0) {
            field5431 = null;
        }
        if (arg1.field3313 == 0) {
            return 0;
        } else {
            if (~arg1.field3338 != 0) {
                class228 var2 = null;
                if (arg1.field3338 >= 32768) {
                    if (~arg1.field3338 <= -32769) {
                        var2 = class378.field5355[arg1.field3338 + -32768];
                    }
                } else {
                    class378 var3 = (class378) class125.field1687.method2405((long) arg1.field3338, -88);
                    if (var3 != null) {
                        var2 = var3.field5353;
                    }
                }
                if (var2 != null) {
                    int var4 = -var2.field1896 + arg1.field1896;
                    int var5 = -var2.field1899 + arg1.field1899;
                    if (~var4 != -1 || var5 != 0) {
                        arg1.method1400(16383 & (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D), true);
                    }
                }
            }
            if (!(arg1 instanceof class22)) {
                if (arg1 instanceof class429) {
                    class429 var6 = (class429) arg1;
                    if (~var6.field6049 != 0 && (~var6.field3369 == -1 || var6.field3377 > 0)) {
                        int var7 = -((-class441.field6171 + -class441.field6171 + var6.field6049) * 64) + var6.field1896;
                        int var8 = var6.field1899 - (-class367.field5241 + var6.field6057 + -class367.field5241) * 64;
                        if (var7 != 0 || var8 != 0) {
                            var6.method1400((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 16383, true);
                        }
                        var6.field6049 = -1;
                    }
                }
            } else {
                class22 var9 = (class22) arg1;
                if (var9.field259 != -1 && (~var9.field3369 == -1 || ~var9.field3377 < -1)) {
                    var9.method1400(var9.field259, true);
                    var9.field259 = -1;
                }
            }
            return arg1.method1402(false);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V", line = 312)
    public static void method2243(int arg0) {
        field5442 = null;
        if (arg0 != 6173) {
            method2240(115, -28, -92, 5, 124, -109, (class228) null);
        }
        field5431 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 323)
    public static final int method2244(String arg0, int arg1) {
        ++field5441;
        if (arg1 != 10) {
            field5442 = null;
        }
        return class494.method2863(10, true, arg0, -1);
    }
}
