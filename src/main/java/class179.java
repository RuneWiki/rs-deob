import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class179 extends class374 {

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Z")
    private boolean field2644 = false;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "Z")
    private boolean field2656 = false;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Lbt;")
    private class89 field2639;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Lij;")
    private class467 field2637;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Ljo;")
    public static class382 field2643 = new class382(8);

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "[I")
    public static int[] field2652;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZZ)V")
    public final void method25(boolean arg0, boolean arg1) {
        ++field2653;
        class487 var3 = super.field5646.method1589((byte) -128);
        if (!arg1) {
            method1220(56, 52);
        }
        if (this.field2644 && var3 != null) {
            float var4 = 1.0F + (1.0F - Math.abs(super.field5646.field3804[1])) * 2.0F;
            super.field5646.method1553(1, -8156);
            super.field5646.method1546(-2, var3);
            super.field5646.method1553(0, -8156);
            super.field5646.method1546(-2, this.field2639.field1393);
            long var5 = this.field2637.field6796;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field5646.field3804[0], -super.field5646.field3804[1], -super.field5646.field3804[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field5646.field3778 * var4, super.field5646.field3739 * var4, super.field5646.field3775 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field5646.field3804[1]) * 928.0F + 64.0F);
            this.field2656 = true;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I")
    public static final int method1220(int arg0, int arg1) {
        if (arg0 != 10729) {
            return -29;
        } else {
            ++field2647;
            return arg1 & 255;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Z")
    public final boolean method21(byte arg0) {
        ++field2650;
        return arg0 <= 85 ? true : this.field2644;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lya;Lok;I)V")
    public static final void method1221(class11 arg0, class74 arg1, int arg2) {
        ++field2645;
        class319[] var3 = class319.method1995(arg1, class31.field439, 0);
        class456.field6688 = new class127[var3.length];
        for (int var4 = 0; var4 < var3.length; ++var4) {
            class456.field6688[var4] = arg0.method98(var3[var4], true);
        }
        class319[] var5 = class319.method1995(arg1, class103.field1554, 0);
        class397.field5929 = new class127[var5.length];
        for (int var6 = 0; var5.length > var6; ++var6) {
            class397.field5929[var6] = arg0.method98(var5[var6], true);
        }
        class319[] var7 = class319.method1995(arg1, class141.field2131, arg2);
        class367.field5596 = new class127[var7.length];
        for (int var8 = 0; var8 < var7.length; ++var8) {
            class367.field5596[var8] = arg0.method98(var7[var8], true);
        }
        class319[] var9 = class319.method1995(arg1, class351.field5404, 0);
        class52.field672 = new class127[var9.length];
        for (int var10 = 0; ~var9.length < ~var10; ++var10) {
            class52.field672[var10] = arg0.method98(var9[var10], true);
        }
        class319[] var11 = class319.method1995(arg1, class356.field5463, 0);
        class320.field4929 = new class127[var11.length];
        for (int var12 = 0; var12 < var11.length; ++var12) {
            class320.field4929[var12] = arg0.method98(var11[var12], true);
        }
        class319[] var13 = class319.method1995(arg1, class187.field2747, 0);
        class320.field4932 = new class127[var13.length];
        for (int var14 = 0; var13.length > var14; ++var14) {
            class320.field4932[var14] = arg0.method98(var13[var14], true);
        }
        class319[] var15 = class319.method1995(arg1, class123.field1865, 0);
        class473.field6976 = new class127[var15.length];
        for (int var16 = 0; ~var16 > ~var15.length; ++var16) {
            class473.field6976[var16] = arg0.method98(var15[var16], true);
        }
        class319[] var17 = class319.method1995(arg1, class126.field1898, 0);
        class254.field3448 = new class127[var17.length];
        for (int var18 = 0; var17.length > var18; ++var18) {
            class254.field3448[var18] = arg0.method98(var17[var18], true);
        }
        class319[] var19 = class319.method1995(arg1, class238.field3332, 0);
        class76.field1074 = new class127[var19.length];
        for (int var20 = 0; var20 < var19.length; ++var20) {
            class76.field1074[var20] = arg0.method98(var19[var20], true);
        }
        class319[] var21 = class319.method1995(arg1, class180.field2669, 0);
        class268.field3993 = new class127[var21.length];
        for (int var22 = 0; ~var21.length < ~var22; ++var22) {
            class268.field3993[var22] = arg0.method98(var21[var22], true);
        }
        class319[] var23 = class319.method1995(arg1, class280.field4225, 0);
        class286.field4296 = new class127[var23.length];
        for (int var24 = 0; ~var24 > ~var23.length; ++var24) {
            class286.field4296[var24] = arg0.method98(var23[var24], true);
        }
        class319[] var25 = class319.method1995(arg1, class44.field576, 0);
        class279.field4217 = new class127[var25.length];
        for (int var26 = 0; ~var26 > ~var25.length; ++var26) {
            class279.field4217[var26] = arg0.method98(var25[var26], true);
        }
        class311.field4816 = arg0.method98(class319.method1994(arg1, class293.field4383, 0), true);
        class283.field4279 = arg0.method98(class319.method1994(arg1, class121.field1841, 0), true);
        class319[] var27 = class319.method1995(arg1, class24.field358, 0);
        class406.field6122 = new class127[var27.length];
        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
            class406.field6122[var28] = arg0.method98(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lvd;Lbt;)V")
    public class179(class258 arg0, class89 arg1) {
        super(arg0);
        this.field2639 = arg1;
        if (this.field2639.field1393 != null && super.field5646.field3734 && super.field5646.field3735) {
            class224 var3 = class154.method1112(1, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field5646);
            class224 var4 = class154.method1112(1, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field5646);
            this.field2637 = class145.method1056(new class224[] { var3, var4 }, super.field5646, true);
            this.field2644 = this.field2637 != null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIBII)V")
    public static final void method1222(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (class454.field6661.field976 != 0 && ~arg4 != -1 && ~class187.field2744 > -51 && arg2 != -1) {
            class158.field2387[class187.field2744++] = new class425((byte) 1, arg2, arg4, arg5, arg0, arg1);
        }
        ++field2641;
        if (arg3 < 48) {
            field2654 = 53;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (this.field2656) {
            super.field5646.method1553(1, -8156);
            super.field5646.method1546(-2, (class271) null);
            super.field5646.method1553(0, -8156);
            super.field5646.method1546(-2, (class271) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2656 = false;
        }
        ++field2638;
        if (arg0 <= 74) {
            method1220(-126, -86);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
    public final void method19(boolean arg0, int arg1) {
        ++field2642;
        if (arg1 >= -2) {
            field2652 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)V")
    public static final void method1223(byte arg0, int arg1) {
        ++field2640;
        class506 var2 = class14.method185(-1304589728, arg1, 2);
        if (arg0 == 20) {
            var2.method2986(65);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
    public final void method20(int arg0, int arg1, int arg2) {
        ++field2649;
        if (this.field2656) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((59 & arg0) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((203448 & arg2) >> 16) / 8.0F;
            float var8 = (float) ((7907299 & arg2) >> 19) / 16.0F;
            float var9 = (float) ((arg2 & 127251506) >> 23) / 16.0F;
            int var10 = (arg2 & 2105073550) >> 27;
            long var11 = this.field2637.field6796;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field5646.field3703 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg1 != -20857) {
            this.method21((byte) -77);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBII)V")
    public static final void method1224(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        if (arg1 != 3) {
            method1225(-5, 24, false);
        }
        int var5 = arg0 << 3;
        int var6 = arg2 << 3;
        ++field2648;
        class254.field3443 = (float) var6;
        class311.field4836 = (float) var4;
        if (~class350.field5388 == -3) {
            class431.field6396 = var4;
            class487.field7247 = var5;
            class350.field5383 = var6;
        }
        class221.method1403(-4);
        class116.field1745 = true;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIZ)I")
    public static final int method1225(int arg0, int arg1, boolean arg2) {
        ++field2651;
        if (arg2) {
            return 0;
        } else {
            class411 var3 = class171.method1179(arg2, true, arg0);
            if (var3 == null) {
                return class245.field3399.method2566(arg0, (byte) 110).field2009;
            } else {
                int var4 = 0;
                if (arg1 != 30332) {
                    method1226((byte) -26);
                }
                for (int var5 = 0; ~var5 > ~var3.field6200.length; ++var5) {
                    if (var3.field6200[var5] == -1) {
                        ++var4;
                    }
                }
                return var4 + class245.field3399.method2566(arg0, (byte) 108).field2009 + -var3.field6200.length;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLew;I)V")
    public final void method18(boolean arg0, class271 arg1, int arg2) {
        if (!this.field2656) {
            super.field5646.method1546(-2, arg1);
            super.field5646.method1582(arg2, true);
        }
        ++field2646;
        if (!arg0) {
            field2652 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
    public static void method1226(byte arg0) {
        if (arg0 > -76) {
            field2652 = null;
        }
        field2643 = null;
        field2652 = null;
    }

    static {
        new class347("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field2654 = 0;
        field2655 = -1;
    }
}
