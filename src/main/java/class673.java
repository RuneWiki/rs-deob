import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class673 extends class631 {

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Z")
    private boolean field9129 = false;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Z")
    private boolean field9125 = false;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lrc;")
    private class538 field9123;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Laea;")
    private class49 field9117;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
    public static int[] field9115 = new int[1000];

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field9121 = -1;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Z")
    public static boolean field9128 = true;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Z")
    public static boolean field9127;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
    public final void method1512(int arg0, int arg1, int arg2) {
        if (this.field9125) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((arg2 & 219530) >> 16) / 8.0F;
            float var8 = (float) ((8251906 & arg2) >> 19) / 16.0F;
            float var9 = (float) (arg2 >> 23 & 15) / 16.0F;
            int var10 = 15 & arg2 >> 27;
            long var11 = this.field9117.field575;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field8722.field1790 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field9116;
        if (arg1 <= 72) {
            field9128 = false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILta;)V")
    public final void method1508(int arg0, int arg1, class210 arg2) {
        if (!this.field9125) {
            super.field8722.method926(arg2, 56);
            super.field8722.method891(arg0, (byte) 17);
        }
        int var4 = 29 / ((52 - arg1) / 62);
        ++field9126;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZ)V")
    public final void method1509(boolean arg0, boolean arg1) {
        ++field9124;
        if (arg0) {
            class375 var3 = super.field8722.method929(0);
            if (this.field9129 && var3 != null) {
                float var4 = (1.0F - Math.abs(super.field8722.field1845[1])) * 2.0F + 1.0F;
                super.field8722.method884(1, arg0);
                super.field8722.method926(var3, 73);
                super.field8722.method884(0, true);
                super.field8722.method926(this.field9123.field7544, 51);
                long var5 = this.field9117.field575;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field8722.field1845[0], -super.field8722.field1845[1], -super.field8722.field1845[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field8722.field1919 * var4, super.field8722.field1895 * var4, super.field8722.field1851 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + Math.abs(super.field8722.field1845[1]) * 928.0F);
                this.field9125 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Leea;Lrc;)V")
    public class673(class131 arg0, class538 arg1) {
        super(arg0);
        this.field9123 = arg1;
        if (this.field9123.field7544 != null && super.field8722.field1875 && super.field8722.field1914) {
            class19 var3 = class619.method3482((byte) 120, super.field8722, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633);
            class19 var4 = class619.method3482((byte) 120, super.field8722, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632);
            this.field9117 = class579.method3300(new class19[] { var3, var4 }, -1, super.field8722);
            this.field9129 = this.field9117 != null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lfp;I)I")
    public static final int method3678(class323 arg0, int arg1) {
        ++field9118;
        int var2 = 0;
        if (arg0.method2088(class196.field2613, 108)) {
            ++var2;
        }
        if (arg0.method2088(class404.field5715, 93)) {
            ++var2;
        }
        if (arg0.method2088(class350.field4954, -46)) {
            ++var2;
        }
        if (arg0.method2088(class514.field7337, -30)) {
            ++var2;
        }
        if (arg1 > -20) {
            return 64;
        } else {
            if (arg0.method2088(class8.field119, 95)) {
                ++var2;
            }
            if (arg0.method2088(class734.field10236, 113)) {
                ++var2;
            }
            if (arg0.method2088(class734.field10235, 116)) {
                ++var2;
            }
            if (arg0.method2088(class563.field7902, 120)) {
                ++var2;
            }
            if (arg0.method2088(class29.field392, 92)) {
                ++var2;
            }
            if (arg0.method2088(class609.field8565, -63)) {
                ++var2;
            }
            if (arg0.method2088(class144.field2054, -35)) {
                ++var2;
            }
            if (arg0.method2088(class237.field3178, -105)) {
                ++var2;
            }
            if (arg0.method2088(class199.field2622, 92)) {
                ++var2;
            }
            if (arg0.method2088(class153.field2152, -39)) {
                ++var2;
            }
            if (arg0.method2088(class381.field5460, -125)) {
                ++var2;
            }
            if (arg0.method2088(class337.field4696, -59)) {
                ++var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
    public final void method1506(int arg0, boolean arg1) {
        if (arg0 == 17660) {
            ++field9120;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public final void method1513(int arg0) {
        if (arg0 <= 74) {
            field9127 = true;
        }
        if (this.field9125) {
            super.field8722.method884(1, true);
            super.field8722.method926((class210) null, 37);
            super.field8722.method884(0, true);
            super.field8722.method926((class210) null, 79);
            OpenGL.glUseProgramObjectARB(0L);
            this.field9125 = false;
        }
        ++field9119;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Z")
    public final boolean method1507(byte arg0) {
        ++field9130;
        int var2 = -14 / ((arg0 - -9) / 53);
        return this.field9129;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BZ)V")
    public static final void method3679(byte arg0, boolean arg1) {
        if (arg1 && class678.field9271 != null) {
            class451.field6391 = class678.field9271.field599;
        } else {
            class451.field6391 = -1;
        }
        ++field9122;
        class724.field10104 = null;
        class678.field9271 = null;
        class230.field3104 = null;
        class725.field10122 = 0;
        class678.method3783();
        class678.field9278.method2767((byte) -19);
        if (arg0 != 113) {
            field9121 = -16;
        }
        class125.field1525 = null;
        class4.field42 = null;
        class597.field8400 = null;
        class336.field4680 = null;
        class678.field9284 = null;
        class707.field9816 = null;
        class516.field7360 = null;
        class625.field8690 = -1;
        class473.field6698 = null;
        class206.field2719 = -1;
        class145.field2087 = null;
        class134.field1955 = null;
        if (class678.field9273 != null) {
            class678.field9273.method3085((byte) -86);
            class678.field9273.method3086(64, (byte) -16, 128);
        }
        if (class678.field9272 != null) {
            class678.field9272.method1416(2060105417, 64, 64);
        }
        if (class678.field9268 != null) {
            class678.field9268.method557(64, arg0 ^ 13);
        }
        class130.field1568.method179(arg0 ^ -114, 64);
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
    public static void method3680(int arg0) {
        if (arg0 != -28581) {
            field9128 = true;
        }
        field9115 = null;
    }
}
