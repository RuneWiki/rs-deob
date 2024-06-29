import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class345 {

    @OriginalMember(owner = "client!il", name = "q", descriptor = "Z")
    private boolean field76 = false;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Z")
    private boolean field82 = false;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Llha;")
    private class626 field65;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lit;")
    private class648 field68;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Lhg;")
    public static class693 field71 = new class693(27, 7);

    @OriginalMember(owner = "client!il", name = "p", descriptor = "Lwaa;")
    public static class705 field75 = new class705("LIVE", "", "", 0);

    @OriginalMember(owner = "client!il", name = "t", descriptor = "D")
    public static double field79;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[Liea;")
    public static class481[] field81;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZB)V")
    public final void method34(boolean arg0, byte arg1) {
        ++field78;
        class193 var3 = super.field4357.method2813((byte) 99);
        if (this.field82 && var3 != null) {
            float var4 = 2.0F * (1.0F - Math.abs(super.field4357.field6871[1])) + 1.0F;
            super.field4357.method2847(1, false);
            super.field4357.method2850(-67, var3);
            super.field4357.method2847(0, false);
            super.field4357.method2850(-101, this.field65.field8609);
            long var5 = this.field68.field8964;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field4357.field6871[0], -super.field4357.field6871[1], -super.field4357.field6871[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field4357.field6892 * var4, super.field4357.field6899 * var4, super.field4357.field6816 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field4357.field6871[1]) + 64.0F);
            this.field76 = true;
        }
        if (arg1 != -82) {
            field79 = -1.2924268548871984D;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V")
    public static final void method35(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field69;
        if (arg2 != 6462) {
            method35(77, -17, -44, 22, 37);
        }
        int var5 = class90.field1248;
        if (var5 != 0) {
            if (~var5 != -2) {
                if (~var5 == -3) {
                    if (~arg1 > ~class745.field10383) {
                        class745.field10383 = arg1;
                    }
                    if (class100.field1389 < arg0) {
                        class100.field1389 = arg0;
                    }
                    if (~arg3 > ~class330.field4224) {
                        class330.field4224 = arg3;
                    }
                    if (~arg4 < ~class122.field1766) {
                        class122.field1766 = arg4;
                    }
                }
            } else {
                class330.field4224 = arg3;
                class122.field1766 = arg4;
                class100.field1389 = arg0;
                class90.field1248 = 2;
                class745.field10383 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILcj;)V")
    public final void method36(int arg0, int arg1, class695 arg2) {
        if (arg0 != 50560) {
            this.field82 = true;
        }
        if (!this.field76) {
            super.field4357.method2850(118, arg2);
            super.field4357.method2800(arg1, 126);
        }
        ++field72;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZII)V")
    public final void method37(boolean arg0, int arg1, int arg2) {
        ++field80;
        if (!arg0) {
            this.method37(false, 100, -15);
        }
        if (this.field76) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << ((arg2 & 57) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (arg1 >> 16 & 3) / 8.0F;
            float var8 = (float) ((arg1 & 8119609) >> 19) / 16.0F;
            float var9 = (float) (15 & arg1 >> 23) / 16.0F;
            int var10 = (arg1 & 2013704086) >> 27;
            long var11 = this.field68.field8964;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field4357.field6780 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Z")
    public final boolean method38(int arg0) {
        ++field83;
        if (arg0 != 50560) {
            this.field76 = false;
        }
        return this.field82;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lbi;Llha;)V")
    public class7(class483 arg0, class626 arg1) {
        super(arg0);
        this.field65 = arg1;
        if (this.field65.field8609 != null && super.field4357.field6819 && super.field4357.field6888) {
            class584 var3 = class711.method3976(super.field4357, (byte) 17, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class584 var4 = class711.method3976(super.field4357, (byte) 125, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field68 = class616.method3445((byte) -96, super.field4357, new class584[] { var3, var4 });
            this.field82 = this.field68 != null;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(ZI)I")
    public static final int method39(boolean arg0, int arg1) {
        ++field66;
        if (class628.field8647 == null) {
            return 0;
        } else if (!arg0 && class517.field7241 != null) {
            return class628.field8647.length * 2;
        } else {
            int var2 = 0;
            int var3 = 0;
            if (arg1 != 27) {
                field71 = null;
            }
            while (~class628.field8647.length < ~var3) {
                int var4 = class628.field8647[var3];
                if (class640.field8890.method3154(var4, (byte) 98)) {
                    ++var2;
                }
                if (class596.field8307.method3154(var4, (byte) 98)) {
                    ++var2;
                }
                ++var3;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)V")
    public final void method40(boolean arg0, int arg1) {
        ++field73;
        if (arg1 != 50560) {
            this.field68 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        int var2 = -109 / ((arg0 - 60) / 60);
        if (this.field76) {
            super.field4357.method2847(1, false);
            super.field4357.method2850(80, (class695) null);
            super.field4357.method2847(0, false);
            super.field4357.method2850(105, (class695) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field76 = false;
        }
        ++field74;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;I)V")
    public static final void method42(String arg0, boolean arg1, int arg2, String arg3, int arg4) {
        ++field77;
        class589 var5 = class293.method1762(arg4 + -41963);
        var5.field8251.method2578(class262.field3304.field7471, arg4 ^ -1221522752);
        var5.field8251.method2620(0, false);
        int var6 = var5.field8251.field6193;
        var5.field8251.method2620(638, false);
        int[] var7 = class373.method2147(var5, arg4 + -35628);
        int var8 = var5.field8251.field6193;
        var5.field8251.method2597(arg0, (byte) 102);
        var5.field8251.method2620(class313.field4096, false);
        var5.field8251.method2597(arg3, (byte) 64);
        var5.field8251.method2586(-25417, class721.field10032);
        var5.field8251.method2578(class243.field3143, -1221492240);
        var5.field8251.method2578(class293.field3867.field1416, arg4 ^ -1221522752);
        class380.method2168(var5.field8251, (byte) -126);
        String var9 = class618.field8529;
        var5.field8251.method2578(var9 == null ? 0 : 1, -1221492240);
        if (var9 != null) {
            var5.field8251.method2597(var9, (byte) 113);
        }
        var5.field8251.method2578(arg2, arg4 + -1221527872);
        var5.field8251.method2578(!arg1 ? 0 : 1, -1221492240);
        if (arg4 != 35632) {
            method35(-6, 59, -74, 72, 21);
        }
        var5.field8251.field6193 += 7;
        var5.field8251.method2615(var7, var8, var5.field8251.field6193, -32768);
        var5.field8251.method2602(-var6 + var5.field8251.field6193, (byte) 101);
        class737.method4107(var5, arg4 + -35625);
        class142.field2011 = 1;
        class638.field8793 = 0;
        class359.field4634 = 0;
        class692.field9626 = -3;
        if (arg2 < 13) {
            class295.field3882 = true;
            class160.method1126(arg4 + -35519);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
    public static void method43(byte arg0) {
        field71 = null;
        field81 = null;
        field75 = null;
        if (arg0 != 2) {
            method35(116, 121, -90, -21, -114);
        }
    }
}
