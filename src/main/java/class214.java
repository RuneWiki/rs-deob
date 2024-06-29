import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class214 extends class106 {

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "Z")
    private boolean field3080 = false;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "Z")
    private boolean field3085 = false;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "Lpo;")
    private class389 field3075;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "Lwf;")
    private class88 field3082;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "[I")
    public static int[] field3083 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "Lgr;")
    public static class296 field3087 = new class296(11, 5);

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "Liv;")
    public static class64 field3090 = new class64(4, 20);

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "Lf;")
    public static class529 field3089;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZB)V")
    public final void method344(boolean arg0, byte arg1) {
        if (arg1 > 102) {
            ++field3088;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILih;)V")
    public final void method346(int arg0, int arg1, class492 arg2) {
        if (arg0 != 128) {
            this.method346(96, -17, (class492) null);
        }
        if (!this.field3080) {
            super.field1770.method1990(arg2, 11864);
            super.field1770.method1989(-24145, arg1);
        }
        ++field3078;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IBLqa;Lug;I)V")
    public static final void method1429(int arg0, byte arg1, class162 arg2, class392 arg3, int arg4) {
        class329.field4971.method2419((byte) 106);
        ++field3086;
        if (!class161.field2492) {
            int var5 = 66 % ((55 - arg1) / 53);
            for (class353 var6 = (class353) arg3.method2427(106); var6 != null; var6 = (class353) arg3.method2422(-75)) {
                class447 var7 = class509.field7486.method1812((byte) 28, var6.field5397);
                if (class5.method39(var7, true)) {
                    boolean var8 = class138.method1038(-109, var6, arg0, arg4, var7, arg2);
                    if (var8) {
                        class35.method377(var7, (byte) -17, var6, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V")
    public final void method343(boolean arg0, int arg1) {
        ++field3074;
        if (arg1 != 1) {
            field3087 = null;
        }
        class221 var3 = super.field1770.method1914((byte) -59);
        if (this.field3085 && var3 != null) {
            float var4 = 2.0F * (-Math.abs(super.field1770.field4527[1]) + 1.0F) + 1.0F;
            super.field1770.method1929(1, (byte) 112);
            super.field1770.method1990(var3, 11864);
            super.field1770.method1929(0, (byte) 103);
            super.field1770.method1990(this.field3075.field5851, arg1 + 11863);
            long var5 = this.field3082.field1539;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field1770.field4527[0], -super.field1770.field4527[1], -super.field1770.field4527[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field1770.field4573 * var4, super.field1770.field4575 * var4, super.field1770.field4536 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + Math.abs(super.field1770.field4527[1]) * 928.0F);
            this.field3080 = true;
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)Z")
    public final boolean method348(int arg0) {
        ++field3079;
        if (arg0 != -22884) {
            this.method346(-124, 24, (class492) null);
        }
        return this.field3085;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lvj;Lpo;)V")
    public class214(class303 arg0, class389 arg1) {
        super(arg0);
        this.field3075 = arg1;
        if (this.field3075.field5851 != null && super.field1770.field4523 && super.field1770.field4612) {
            class108 var3 = class88.method693(1, 35633, super.field1770, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class108 var4 = class88.method693(1, 35632, super.field1770, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field3082 = class5.method40(new class108[] { var3, var4 }, false, super.field1770);
            this.field3085 = this.field3082 != null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)V")
    public static void method1430(int arg0) {
        field3087 = null;
        if (arg0 != 11) {
            method1429(-7, (byte) 83, (class162) null, (class392) null, 127);
        }
        field3090 = null;
        field3089 = null;
        field3083 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lnu;)V")
    public static final void method1431(class417 arg0) {
        for (int var1 = arg0.field6231; var1 <= arg0.field6235; ++var1) {
            for (int var2 = arg0.field6238; var2 <= arg0.field6226; ++var2) {
                class429 var3 = class380.field5761[arg0.field6232][var1][var2];
                if (var3 != null) {
                    class166 var4 = var3.field6364;
                    class166 var5 = null;
                    while (var4 != null) {
                        if (var4.field2576 == arg0) {
                            if (var5 != null) {
                                var5.field2572 = var4.field2572;
                            } else {
                                var3.field6364 = var4.field2572;
                            }
                            var4.method1226(0);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field2572;
                    }
                    var3.field6363 = 0;
                    for (class166 var6 = var3.field6364; var6 != null; var6 = var6.field2572) {
                        var3.field6363 = (byte) (var3.field6363 | var6.field2573);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        if (arg0 != 3) {
            method1430(119);
        }
        if (this.field3080) {
            super.field1770.method1929(1, (byte) 66);
            super.field1770.method1990((class492) null, 11864);
            super.field1770.method1929(0, (byte) 74);
            super.field1770.method1990((class492) null, arg0 + 11861);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3080 = false;
        }
        ++field3076;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IBI)V")
    public final void method347(int arg0, byte arg1, int arg2) {
        if (this.field3080) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((arg0 & 58) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((198364 & arg2) >> 16) / 8.0F;
            float var8 = (float) ((8179875 & arg2) >> 19) / 16.0F;
            float var9 = (float) (15 & arg2 >> 23) / 16.0F;
            int var10 = (arg2 & 2015292702) >> 27;
            long var11 = this.field3082.field1539;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field1770.field4490 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg1 == 43) {
            ++field3084;
        }
    }
}
