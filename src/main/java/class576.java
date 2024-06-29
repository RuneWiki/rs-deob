import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class576 extends class610 {

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Z")
    private boolean field7737 = false;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "Z")
    private boolean field7744 = false;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "Lh;")
    private class609 field7749;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "Lkba;")
    private class91 field7739;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "S")
    public static short field7742 = 320;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZI)V", line = 7)
    public final void method257(boolean arg0, int arg1) {
        ++field7743;
        if (arg1 >= -19) {
            this.method255(-51, -83, (class591) null);
        }
        class389 var3 = super.field8473.method1746(0);
        if (this.field7744 && var3 != null) {
            float var4 = 1.0F + (1.0F - Math.abs(super.field8473.field4360[1])) * 2.0F;
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1804(false, var3);
            super.field8473.method1747(0, (byte) 108);
            super.field8473.method1804(false, this.field7749.field8464);
            long var5 = this.field7739.field1204;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field8473.field4360[0], -super.field8473.field4360[1], -super.field8473.field4360[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field8473.field4323 * var4, super.field8473.field4265 * var4, super.field8473.field4275 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field8473.field4360[1]) * 928.0F + 64.0F);
            this.field7737 = true;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILit;)V", line = 38)
    public final void method255(int arg0, int arg1, class591 arg2) {
        if (!this.field7737) {
            super.field8473.method1804(false, arg2);
            super.field8473.method1801(arg1, 34166);
        }
        ++field7748;
        if (arg0 != 256) {
            this.method255(-35, -118, (class591) null);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIB)V", line = 56)
    public final void method258(int arg0, int arg1, byte arg2) {
        if (this.field7737) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((61 & arg1) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) ((258974 & arg0) >> 16) / 8.0F;
            float var8 = (float) (15 & arg0 >> 19) / 16.0F;
            float var9 = (float) (arg0 >> 23 & 15) / 16.0F;
            int var10 = (2114095069 & arg0) >> 27;
            long var11 = this.field7739.field1204;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field8473.field4221 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field7747;
        if (arg2 != 70) {
            this.field7749 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V", line = 97)
    public static final void method3161(int arg0, boolean arg1) {
        ++field7740;
        while (~class602.field8356.method3734(class532.field7250, (byte) -107) <= -16) {
            int var2 = class602.field8356.method3726(15, arg0 ^ 7);
            if (~var2 == -32768) {
                break;
            }
            boolean var3 = false;
            class178 var4 = (class178) class323.field4762.method2061(-17305, (long) var2);
            if (var4 == null) {
                class225 var5 = new class225();
                var5.field6388 = var2;
                var4 = new class178(var5);
                class323.field4762.method2063((long) var2, 1, var4);
                var3 = true;
                class252.field3537[class679.field9578++] = var4;
            }
            class225 var6 = var4.field2634;
            class594.field8262[class602.field8365++] = var2;
            var6.field6440 = class239.field3440;
            if (var6.field3245 != null && var6.field3245.method1116(-56)) {
                class99.method767(var6, (byte) -93);
            }
            int var7;
            if (!arg1) {
                var7 = class602.field8356.method3726(5, 8);
                if (~var7 < -16) {
                    var7 -= 32;
                }
            } else {
                var7 = class602.field8356.method3726(8, 8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            }
            int var8 = (-1394606073 & class602.field8356.method3726(3, arg0 ^ 7) + 4) << 11;
            int var9;
            if (arg1) {
                var9 = class602.field8356.method3726(8, arg0 + -7);
                if (~var9 < -128) {
                    var9 -= 256;
                }
            } else {
                var9 = class602.field8356.method3726(5, 8);
                if (~var9 < -16) {
                    var9 -= 32;
                }
            }
            int var10 = class602.field8356.method3726(2, arg0 + -7);
            int var11 = class602.field8356.method3726(1, 8);
            if (var11 == 1) {
                class586.field8197[class499.field6860++] = var2;
            }
            int var12 = class602.field8356.method3726(1, arg0 + -7);
            var6.method1443(0, class648.field9185.method1493(class602.field8356.method3726(14, 8), (byte) -71));
            var6.method2638(18799, var6.field3245.field2463);
            var6.field6394 = var6.field3245.field2407 << 3;
            if (var3) {
                var6.method2644(-109, var8, true);
            }
            var6.method1439(var6.method1722((byte) -119), var10, class253.field3576.field6483[0] + var7, arg0 ^ 112, var12 == 1, class253.field3576.field6477[0] - -var9);
            if (var6.field3245.method1116(-114)) {
                class80.method637((byte) -95, (class286) null, 0, (class620) null, var6.field6483[0], var6.field520, var6, var6.field6477[0]);
            }
        }
        class602.field8356.method3730(-29878);
        if (arg0 != 15) {
            field7741 = 12;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Len;Lh;)V", line = 219)
    public class576(class289 arg0, class609 arg1) {
        super(arg0);
        this.field7749 = arg1;
        if (this.field7749.field8464 != null && super.field8473.field4331 && super.field8473.field4301) {
            class10 var3 = class387.method2233(35633, 50, super.field8473, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class10 var4 = class387.method2233(35632, 69, super.field8473, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field7739 = class404.method2311(-120, new class10[] { var3, var4 }, super.field8473);
            this.field7744 = this.field7739 != null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V", line = 209)
    public static final void method3162(int arg0, int arg1, String arg2, String arg3) {
        class208.field3075 = arg1;
        class86.field1181 = arg0;
        ++field7735;
        class402.method2295(arg0 + 31642, arg2, false, arg3);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 239)
    public final void method252(int arg0) {
        if (arg0 != 31130) {
            this.field7744 = false;
        }
        if (this.field7737) {
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1804(false, (class591) null);
            super.field8473.method1747(0, (byte) 108);
            super.field8473.method1804(false, (class591) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field7737 = false;
        }
        ++field7746;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZZ)V", line = 261)
    public final void method254(boolean arg0, boolean arg1) {
        ++field7736;
        if (!arg0) {
            this.field7744 = true;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)Z", line = 274)
    public final boolean method262(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field7738;
            return this.field7744;
        }
    }
}
