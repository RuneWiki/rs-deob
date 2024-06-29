import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class575 extends class366 {

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Z")
    private boolean field8194 = false;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Z")
    private boolean field8196 = false;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "Lfj;")
    private class609 field8201;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Lcaa;")
    private class277 field8198;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "Z")
    public static boolean field8200 = false;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "[Lf;")
    public static class702[] field8195;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "[[I")
    public static int[][] field8191;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "[[Lpca;")
    public static class665[][] field8192;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V", line = 3)
    public final void method1136(int arg0, int arg1, int arg2) {
        if (arg0 == -6561) {
            ++field8197;
            if (this.field8196) {
                int var4 = 1 << (arg2 & 3);
                float var5 = (float) (1 << ((arg2 & 62) >> 3)) / 32.0F;
                int var6 = arg1 & 65535;
                float var7 = (float) ((arg1 & 248685) >> 16) / 8.0F;
                float var8 = (float) ((8188393 & arg1) >> 19) / 16.0F;
                float var9 = (float) (arg1 >> 23 & 15) / 16.0F;
                int var10 = 15 & arg1 >> 27;
                long var11 = this.field8198.field4482;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field5742.field1330 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 39)
    public static void method3373(int arg0) {
        int var1 = 45 / ((arg0 - 51) / 52);
        field8191 = null;
        field8192 = null;
        field8195 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIII)V", line = 51)
    public static final void method3374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 8 && arg0 != 16) {
            class252 var7 = class454.field6818[arg5][arg3][arg4];
            if (var7 == null) {
                var7 = new class252(arg5);
            }
            if (~arg0 == -2) {
                var7.field4032 = (short) arg6;
                var7.field4021 = (short) arg2;
            } else if (~arg0 == -3) {
                var7.field4020 = (short) arg6;
                var7.field4033 = (short) arg2;
            }
            if (class402.field6203) {
                client.method1939(-38);
            }
        } else if (arg0 == 8) {
            int var8 = arg3 << class439.field6699;
            int var9 = class134.field2203 + var8;
            int var10 = arg4 << class439.field6699;
            int var11 = var10 - -class134.field2203;
            int var12 = class491.field7187[arg5].method479(arg4, arg3, 28);
            int var13 = class491.field7187[arg5].method479(arg4 + 1, arg3 - -1, 46);
            class678.field9535[class102.field1684++] = new class686(arg0, arg5, var8, var9, var9, var8, var12, var13, -arg6 + var13, -arg6 + var12, var10, var11, var11, var10);
        } else {
            int var14 = (arg3 << class439.field6699) + class134.field2203;
            int var15 = -class134.field2203 + var14;
            int var16 = arg4 << class439.field6699;
            int var17 = class134.field2203 + var16;
            int var18 = class491.field7187[arg5].method479(arg4, arg3 - -1, 103);
            int var19 = class491.field7187[arg5].method479(arg4 + 1, arg3, 56);
            class678.field9535[class102.field1684++] = new class686(arg0, arg5, var14, var15, var15, var14, var18, var19, var19 - arg6, -arg6 + var18, var16, var17, var17, var16);
        }
        ++field8205;
        if (arg1 >= -2) {
            field8192 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)Z", line = 125)
    public static final boolean method3375(int arg0, int arg1, byte arg2) {
        if (arg2 > -26) {
            method3373(123);
        }
        ++field8202;
        return ~(arg0 & 540800) != -1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V", line = 138)
    public final void method1133(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method1130(35, (class386) null, -30);
        }
        ++field8190;
        class58 var3 = super.field5742.method880(arg1 + 63);
        if (this.field8194 && var3 != null) {
            float var4 = 2.0F * (1.0F - Math.abs(super.field5742.field1381[1])) + 1.0F;
            super.field5742.method834(true, 1);
            super.field5742.method856(false, var3);
            super.field5742.method834(true, 0);
            super.field5742.method856(false, this.field8201.field8653);
            long var5 = this.field8198.field4482;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field5742.field1381[0], -super.field5742.field1381[1], -super.field5742.field1381[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field5742.field1425 * var4, super.field5742.field1365 * var4, super.field5742.field1441 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field5742.field1381[1]) * 928.0F + 64.0F);
            this.field8196 = true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 172)
    public final void method1132(int arg0) {
        if (this.field8196) {
            super.field5742.method834(true, 1);
            super.field5742.method856(false, (class386) null);
            super.field5742.method834(true, 0);
            super.field5742.method856(false, (class386) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8196 = false;
        }
        ++field8206;
        if (arg0 != 0) {
            field8191 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Ler;Lfj;)V", line = 194)
    public class575(class92 arg0, class609 arg1) {
        super(arg0);
        this.field8201 = arg1;
        if (this.field8201.field8653 != null && super.field5742.field1398 && super.field5742.field1438) {
            class199 var3 = class319.method2170(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field5742, (byte) 116);
            class199 var4 = class319.method2170(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field5742, (byte) 70);
            this.field8198 = class402.method2585(super.field5742, false, new class199[] { var3, var4 });
            this.field8194 = this.field8198 != null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILep;I)V", line = 213)
    public final void method1130(int arg0, class386 arg1, int arg2) {
        ++field8204;
        if (arg0 != 1) {
            this.method1133(true, 55);
        }
        if (!this.field8196) {
            super.field5742.method856(false, arg1);
            super.field5742.method816(arg2, -126);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Z", line = 233)
    public final boolean method1137(boolean arg0) {
        ++field8193;
        if (arg0) {
            field8199 = -106;
        }
        return this.field8194;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZZ)V", line = 254)
    public final void method1131(boolean arg0, boolean arg1) {
        ++field8189;
        if (!arg1) {
            field8192 = null;
        }
    }
}
