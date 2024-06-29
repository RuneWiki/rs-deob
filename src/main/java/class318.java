import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class318 extends class503 {

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "Z")
    private boolean field4661 = false;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "Z")
    private boolean field4673 = false;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "Lha;")
    private class40 field4668;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "Ljh;")
    private class105 field4677;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field4671 = 0;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "Z")
    public static boolean field4664 = false;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "Lwt;")
    public static class194 field4660 = new class194(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "I")
    public static int field4676 = 0;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public static int field4678 = 0;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIB)Z", line = 4)
    public static final boolean method1914(int arg0, int arg1, byte arg2) {
        int var3 = 28 % ((34 - arg2) / 47);
        ++field4674;
        return (arg0 & 65536) != 0;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)V", line = 14)
    public static void method1915(byte arg0) {
        field4660 = null;
        if (arg0 > -49) {
            field4676 = -84;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)V", line = 27)
    public final void method624(int arg0, int arg1, int arg2) {
        int var4 = 111 % (arg0 / 59);
        if (this.field4661) {
            int var5 = 1 << (3 & arg2);
            float var6 = (float) (1 << ((arg2 & 57) >> 3)) / 32.0F;
            int var7 = 65535 & arg1;
            float var8 = (float) (3 & arg1 >> 16) / 8.0F;
            float var9 = (float) (arg1 >> 19 & 15) / 16.0F;
            float var10 = (float) ((133253559 & arg1) >> 23) / 16.0F;
            int var11 = arg1 >> 27 & 15;
            long var12 = this.field4677.field1409;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "time"), (float) (super.field7679.field7316 * var5 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "scale"), var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "breakWaterDepth"), (float) var7);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "breakWaterOffset"), var8);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var12, "waveIntensity"), var10, var9);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "waveExponent"), (float) var11);
        }
        ++field4670;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(IIII)V", line = 64)
    public static final void method1916(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 26192) {
            ++field4667;
            class379.field5661 = new byte[arg0][arg3][arg2];
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIBI[BII[B)V", line = 77)
    public static final void method1917(int arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5, int arg6, int arg7, byte[] arg8) {
        ++field4659;
        int var9 = -(arg4 >> 2);
        int var10 = -(3 & arg4);
        for (int var11 = -arg7; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg2++;
                arg5[var10001] = (byte) (arg5[var10001] + -arg8[arg6++]);
                int var14 = arg2++;
                arg5[var14] = (byte) (arg5[var14] + -arg8[arg6++]);
                int var15 = arg2++;
                arg5[var15] = (byte) (arg5[var15] + -arg8[arg6++]);
                int var16 = arg2++;
                arg5[var16] = (byte) (arg5[var16] + -arg8[arg6++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg2++;
                arg5[var10001] = (byte) (arg5[var10001] + -arg8[arg6++]);
            }
            arg2 += arg1;
            arg6 += arg0;
        }
        if (arg3 <= 59) {
            method1915((byte) 84);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBLtu;)V", line = 121)
    public final void method626(int arg0, byte arg1, class221 arg2) {
        if (!this.field4661) {
            super.field7679.method2883(arg2, 33);
            super.field7679.method2914(125, arg0);
        }
        ++field4666;
        if (arg1 > -21) {
            method1916(-118, 86, -24, -25);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)Z", line = 141)
    public final boolean method623(byte arg0) {
        ++field4662;
        if (arg0 <= 45) {
            this.method623((byte) -4);
        }
        return this.field4673;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lrl;Lha;)V", line = 179)
    public class318(class487 arg0, class40 arg1) {
        super(arg0);
        this.field4668 = arg1;
        if (this.field4668.field618 != null && super.field7679.field7383 && super.field7679.field7366) {
            class260 var3 = class150.method921(super.field7679, 35633, (byte) -93, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class260 var4 = class150.method921(super.field7679, 35632, (byte) 77, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field4677 = class40.method307((byte) 55, super.field7679, new class260[] { var3, var4 });
            this.field4673 = this.field4677 != null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V", line = 156)
    public final void method629(byte arg0) {
        ++field4672;
        if (this.field4661) {
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2883((class221) null, -109);
            super.field7679.method2849(0, (byte) -109);
            super.field7679.method2883((class221) null, -109);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4661 = false;
        }
        if (arg0 != -122) {
            field4660 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)V", line = 202)
    public final void method627(boolean arg0, int arg1) {
        ++field4675;
        class368 var3 = super.field7679.method2885(114);
        if (this.field4673 && var3 != null) {
            float var4 = 2.0F * (1.0F - Math.abs(super.field7679.field7394[1])) + 1.0F;
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2883(var3, -101);
            super.field7679.method2849(0, (byte) -109);
            super.field7679.method2883(this.field4668.field618, -98);
            long var5 = this.field4677.field1409;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field7679.field7394[0], -super.field7679.field7394[1], -super.field7679.field7394[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field7679.field7396 * var4, super.field7679.field7409 * var4, super.field7679.field7436 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field7679.field7394[1]));
            this.field4661 = true;
        }
        if (arg1 != -1805) {
            field4678 = -86;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZZ)V", line = 234)
    public final void method625(boolean arg0, boolean arg1) {
        if (arg0) {
            this.method629((byte) 7);
        }
        ++field4663;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIII)V", line = 244)
    public static final void method1918(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= -4) {
            if (~arg0 <= ~class473.field6839 && ~class63.field933 <= ~arg0) {
                int var5 = class372.method2266(class7.field131, -20228, class92.field1252, arg2);
                int var6 = class372.method2266(class7.field131, -20228, class92.field1252, arg3);
                class19.method130(var6, arg0, var5, false, arg4);
            }
            ++field4669;
        }
    }
}
