import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class171 extends class457 {

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "Z")
    private boolean field2542 = false;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "Z")
    private boolean field2543 = false;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "Lmc;")
    private class88 field2535;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Lbt;")
    private class33 field2536;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lmk;II)V")
    public final void method431(class40 arg0, int arg1, int arg2) {
        if (arg1 != 384) {
            this.field2542 = false;
        }
        ++field2532;
        if (!this.field2543) {
            super.field6706.method1996(2, arg0);
            super.field6706.method1974(arg2, arg1 + 4225);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIZ)V")
    public final void method430(int arg0, int arg1, boolean arg2) {
        if (this.field2543) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) (3 & arg0 >> 16) / 8.0F;
            float var8 = (float) ((8386335 & arg0) >> 19) / 16.0F;
            float var9 = (float) ((127720349 & arg0) >> 23) / 16.0F;
            int var10 = (arg0 & 2030251987) >> 27;
            long var11 = this.field2536.field439;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field6706.field4743 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field2539;
        if (arg2) {
            this.method431((class40) null, -112, 94);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)V")
    public final void method434(int arg0, boolean arg1) {
        ++field2534;
        class39 var3 = super.field6706.method1959(34018);
        if (this.field2542 && var3 != null) {
            float var4 = 2.0F * (1.0F - Math.abs(super.field6706.field4769[1])) + 1.0F;
            super.field6706.method1950(-29847, 1);
            super.field6706.method1996(2, var3);
            super.field6706.method1950(-29847, 0);
            super.field6706.method1996(2, this.field2535.field1288);
            long var5 = this.field2536.field439;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field6706.field4769[0], -super.field6706.field4769[1], -super.field6706.field4769[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field6706.field4866 * var4, super.field6706.field4847 * var4, super.field6706.field4822 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field6706.field4769[1]));
            this.field2543 = true;
        }
        if (arg0 != 28037) {
            this.field2535 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public final void method433(byte arg0) {
        if (arg0 != 8) {
            field2544 = -21;
        }
        ++field2538;
        if (this.field2543) {
            super.field6706.method1950(-29847, 1);
            super.field6706.method1996(arg0 ^ 10, (class40) null);
            super.field6706.method1950(-29847, 0);
            super.field6706.method1996(2, (class40) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2543 = false;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZB)V")
    public final void method435(boolean arg0, byte arg1) {
        ++field2533;
        if (arg1 < 32) {
            this.method429(16);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z")
    public final boolean method429(int arg0) {
        ++field2540;
        if (arg0 != 0) {
            this.method431((class40) null, -15, -86);
        }
        return this.field2542;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
    public static final void method1114(int arg0, int arg1) {
        if (arg0 == -24389) {
            class273.field3760 = arg1;
            ++field2537;
            class173.field2569.method1068(arg0 + 24389);
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lef;Lmc;)V")
    public class171(class338 arg0, class88 arg1) {
        super(arg0);
        this.field2535 = arg1;
        if (this.field2535.field1288 != null && super.field6706.field4865 && super.field6706.field4773) {
            class432 var3 = class153.method1031(super.field6706, 35633, 1, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class432 var4 = class153.method1031(super.field6706, 35632, 1, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field2536 = class209.method1294(new class432[] { var3, var4 }, (byte) 3, super.field6706);
            this.field2542 = this.field2536 != null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILod;[[B)V")
    public static final void method1115(int arg0, class349 arg1, byte[][] arg2) {
        ++field2541;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            byte[] var11 = arg2[var5];
            if (var11 != null) {
                class391 var12 = new class391(var11);
                int var13 = class310.field4218[var5] >> 8;
                int var14 = 255 & class310.field4218[var5];
                int var15 = var13 * 64 + -class510.field7566;
                int var16 = var14 * 64 + -class14.field204;
                class358.method2144((byte) -64);
                arg1.method1878(class510.field7566, class14.field204, var12, class82.field1229, var15, 1, var16);
                arg1.method2071(class269.field3721, var12, var15, var16, -120, var3);
                if (!arg1.field4433 && class38.field474 / 8 == var13 && class434.field6363 / 8 == var14 && ~var3[0] != 0) {
                    class294.field4052 = class214.field2995.method1264(var3[1], var3[3], 0, class328.field4481, var3[0], var3[2]);
                    class436.field6378 = var3[4];
                }
            }
        }
        int var6 = 90 % ((45 - arg0) / 49);
        for (int var7 = 0; ~var7 > ~var4; ++var7) {
            int var8 = (class310.field4218[var7] >> 8) * 64 - class510.field7566;
            int var9 = (255 & class310.field4218[var7]) * 64 + -class14.field204;
            byte[] var10 = arg2[var7];
            if (var10 == null && ~class434.field6363 > -801) {
                class358.method2144((byte) 76);
                arg1.method1887(64, 64, var9, -1, var8);
            }
        }
    }
}
