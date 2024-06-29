import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class405 extends class11 {

    @OriginalMember(owner = "client!so", name = "p", descriptor = "Z")
    private boolean field6113 = false;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "Z")
    private boolean field6117 = false;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "Lme;")
    private class168 field6119;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "Lis;")
    private class434 field6114;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "[[S")
    public static short[][] field6110 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public final void method63(int arg0) {
        if (this.field6113) {
            super.field95.method2269((byte) -118, 1);
            super.field95.method2295(-69, (class507) null);
            super.field95.method2269((byte) 46, 0);
            super.field95.method2295(-100, (class507) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6113 = false;
        }
        ++field6116;
        int var2 = 46 / ((arg0 - -61) / 40);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZZ)V")
    public final void method64(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method64(false, true);
        }
        ++field6109;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIB)V")
    public final void method62(int arg0, int arg1, byte arg2) {
        ++field6112;
        if (arg2 <= 124) {
            this.field6113 = true;
        }
        if (this.field6113) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((arg0 & 61) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) ((198542 & arg1) >> 16) / 8.0F;
            float var8 = (float) ((7877716 & arg1) >> 19) / 16.0F;
            float var9 = (float) (arg1 >> 23 & 15) / 16.0F;
            int var10 = 15 & arg1 >> 27;
            long var11 = this.field6114.field6444;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field95.field5351 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZIIIILhi;I)V")
    public static final void method2571(boolean arg0, int arg1, int arg2, int arg3, int arg4, class177 arg5, int arg6) {
        ++field6111;
        if (~class220.field3015 > -51) {
            if (arg5 != null && arg5.field2159 != null && arg5.field2159.length > arg6 && arg5.field2159[arg6] != null) {
                int var7 = arg5.field2159[arg6][0];
                int var8 = var7 >> 8;
                int var9 = var7 >> 5 & 7;
                if (arg5.field2159[arg6].length > 1) {
                    int var10 = (int) (Math.random() * (double) arg5.field2159[arg6].length);
                    if (var10 > 0) {
                        var8 = arg5.field2159[arg6][var10];
                    }
                }
                int var11 = 31 & var7;
                if (~var11 == -1) {
                    if (arg0) {
                        if (arg5.field2173) {
                            class173.method994(255, var8, -9368, false, 0, var9);
                            return;
                        }
                        class260.method1732(16, 0, 255, var8, var9);
                    }
                } else if (~class595.field8694.field6544 != -1) {
                    int var12 = arg1 + -256 >> 9;
                    int var13 = -103 % ((21 - arg2) / 48);
                    int var14 = arg3 + -256 >> 9;
                    class526.field7632[class220.field3015++] = new class85((byte) (!arg5.field2173 ? 1 : 2), var8, var9, 0, 255, (arg4 << 24) + (var12 << 16) - -(var14 << 8) + var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Z")
    public final boolean method68(byte arg0) {
        ++field6115;
        if (arg0 != 95) {
            this.method62(79, 29, (byte) 126);
        }
        return this.field6117;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IILpm;)V")
    public final void method65(int arg0, int arg1, class507 arg2) {
        if (!this.field6113) {
            super.field95.method2295(-68, arg2);
            super.field95.method2288(arg0, 7681);
        }
        if (arg1 == -1) {
            ++field6108;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lad;Lme;)V")
    public class405(class362 arg0, class168 arg1) {
        super(arg0);
        this.field6119 = arg1;
        if (this.field6119.field2049 != null && super.field95.field5383 && super.field95.field5459) {
            class451 var3 = class410.method2594("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field95, (byte) 65, 35633);
            class451 var4 = class410.method2594("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field95, (byte) 85, 35632);
            this.field6114 = class224.method1458(new class451[] { var3, var4 }, super.field95, 5097);
            this.field6117 = this.field6114 != null;
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
    public static void method2572(int arg0) {
        field6110 = null;
        if (arg0 > -67) {
            field6120 = -35;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)V")
    public final void method67(int arg0, boolean arg1) {
        ++field6107;
        class158 var3 = super.field95.method2336(11011);
        if (this.field6117 && var3 != null) {
            float var4 = 1.0F + 2.0F * (-Math.abs(super.field95.field5387[1]) + 1.0F);
            super.field95.method2269((byte) -110, 1);
            super.field95.method2295(-93, var3);
            super.field95.method2269((byte) -97, 0);
            super.field95.method2295(-90, this.field6119.field2049);
            long var5 = this.field6114.field6444;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field95.field5387[0], -super.field95.field5387[1], -super.field95.field5387[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field95.field5380 * var4, super.field95.field5420 * var4, super.field95.field5444 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field95.field5387[1]));
            this.field6113 = true;
        }
        if (arg0 <= 115) {
            this.field6114 = null;
        }
    }

    static {
        new class474("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }
}
