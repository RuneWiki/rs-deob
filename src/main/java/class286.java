import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class286 extends class531 {

    @OriginalMember(owner = "client!tja", name = "l", descriptor = "Z")
    private boolean field4211 = false;

    @OriginalMember(owner = "client!tja", name = "o", descriptor = "Z")
    private boolean field4214 = false;

    @OriginalMember(owner = "client!tja", name = "s", descriptor = "Lgo;")
    private class653 field4218;

    @OriginalMember(owner = "client!tja", name = "p", descriptor = "Lhw;")
    private class140 field4215;

    @OriginalMember(owner = "client!tja", name = "m", descriptor = "[F")
    public static float[] field4212 = new float[4];

    @OriginalMember(owner = "client!tja", name = "g", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!tja", name = "h", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!tja", name = "i", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!tja", name = "j", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!tja", name = "k", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!tja", name = "n", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!tja", name = "q", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!tja", name = "t", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!tja", name = "r", descriptor = "Lwia;")
    public static class791 field4217;

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "(I)V", line = 3)
    public final void method300(int arg0) {
        ++field4210;
        if (arg0 != 1) {
            method1852(-30);
        }
        if (this.field4214) {
            super.field7676.method813((byte) 103, 1);
            super.field7676.method808((byte) 34, (class188) null);
            super.field7676.method813((byte) 103, 0);
            super.field7676.method808((byte) 34, (class188) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4214 = false;
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method304(int arg0) {
        if (arg0 <= 125) {
            return true;
        } else {
            ++field4209;
            return this.field4211;
        }
    }

    @OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(Lqfa;Lgo;)V", line = 35)
    public class286(class106 arg0, class653 arg1) {
        super(arg0);
        this.field4218 = arg1;
        if (this.field4218.field9124 != null && super.field7676.field1521 && super.field7676.field1523) {
            class394 var3 = class24.method237(-32, 35633, super.field7676, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class394 var4 = class24.method237(-51, 35632, super.field7676, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field4215 = class422.method2562(new class394[] { var3, var4 }, 0, super.field7676);
            this.field4211 = this.field4215 != null;
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(BII)V", line = 59)
    public final void method311(byte arg0, int arg1, int arg2) {
        ++field4208;
        if (this.field4214) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((arg1 & 62) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            float var8 = (float) ((arg2 & 7886393) >> 19) / 16.0F;
            float var9 = (float) (arg2 >> 23 & 15) / 16.0F;
            int var10 = arg2 >> 27 & 15;
            long var11 = this.field4215.field2083;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field7676.field1437 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg0 >= -55) {
            this.field4215 = null;
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "([BI)V", line = 99)
    public static final void method1850(byte[] arg0, int arg1) {
        if (arg1 < 52) {
            field4217 = null;
        }
        ++field4207;
        class494 var2 = new class494(arg0);
        while (true) {
            while (true) {
                int var3 = var2.method2964((byte) 69);
                if (~var3 == -1) {
                    return;
                }
                if (~var3 == -2) {
                    int[] var4 = class511.field7230 = new int[6];
                    var4[0] = var2.method2998(true);
                    var4[1] = var2.method2998(true);
                    var4[2] = var2.method2998(true);
                    var4[3] = var2.method2998(true);
                    var4[4] = var2.method2998(true);
                    var4[5] = var2.method2998(true);
                } else if (~var3 == -5) {
                    int var5 = var2.method2964((byte) 44);
                    class211.field3268 = new int[var5];
                    for (int var6 = 0; var5 > var6; ++var6) {
                        class211.field3268[var6] = var2.method2998(true);
                        if (class211.field3268[var6] == 65535) {
                            class211.field3268[var6] = -1;
                        }
                    }
                } else if (~var3 == -6) {
                    int var7 = var2.method2964((byte) 118);
                    class650.field9081 = new int[var7];
                    for (int var8 = 0; var8 < var7; ++var8) {
                        class650.field9081[var8] = var2.method2998(true);
                        if (class650.field9081[var8] == 65535) {
                            class650.field9081[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tja", name = "d", descriptor = "(I)V", line = 177)
    public static final void method1851(int arg0) {
        ++field4206;
        if (arg0 != 20906) {
            field4217 = null;
        }
        class599.field8413 = null;
        if (class195.field2997 && class592.method3442((byte) -91) != 1) {
            class8.method56(27690, class571.method3359(arg0 ^ 20928), 0, 0, class266.field3873 == 3 || class266.field3873 == 7, class737.method4106(1011472681));
        }
        int var1 = 0;
        int var2 = 0;
        if (class195.field2997) {
            var1 = class493.method2933((byte) -64);
            var2 = class242.method1613(8220);
        }
        class389.method2419(-1, class428.field5825 + var1, var1, class371.field5137, class714.field9895 + var2, var1, var2, -67, var2);
        if (class599.field8413 != null) {
            class471.method2800(class428.field5825 + var1, class262.field3837, var2 - -class714.field9895, class252.field3715, class226.field3479.field6251, -1412584499, (byte) -120, class599.field8413, true, var2, var1);
            class599.field8413 = null;
        }
    }

    @OriginalMember(owner = "client!tja", name = "e", descriptor = "(I)V", line = 212)
    public static void method1852(int arg0) {
        field4217 = null;
        field4212 = null;
        if (arg0 != 0) {
            field4212 = null;
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(ZI)V", line = 223)
    public final void method309(boolean arg0, int arg1) {
        if (arg1 >= -67) {
            this.field4214 = true;
        }
        ++field4219;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(IZLdca;)V", line = 238)
    public final void method307(int arg0, boolean arg1, class188 arg2) {
        ++field4213;
        if (arg1) {
            this.field4218 = null;
        }
        if (!this.field4214) {
            super.field7676.method808((byte) 34, arg2);
            super.field7676.method795(arg0, 34023);
        }
    }

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "(ZI)V", line = 254)
    public final void method301(boolean arg0, int arg1) {
        ++field4216;
        class425 var3 = super.field7676.method803(true);
        if (this.field4211 && var3 != null) {
            float var4 = (-Math.abs(super.field7676.field1542[1]) + 1.0F) * 2.0F + 1.0F;
            super.field7676.method813((byte) 103, 1);
            super.field7676.method808((byte) 34, var3);
            super.field7676.method813((byte) 103, 0);
            super.field7676.method808((byte) 34, this.field4218.field9124);
            long var5 = this.field4215.field2083;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field7676.field1542[0], -super.field7676.field1542[1], -super.field7676.field1542[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field7676.field1536 * var4, super.field7676.field1573 * var4, super.field7676.field1482 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field7676.field1542[1]));
            this.field4214 = true;
        }
        if (arg1 > -9) {
            this.field4218 = null;
        }
    }
}
