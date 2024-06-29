import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class430 extends class337 {

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Z")
    private boolean field5827 = false;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Z")
    private boolean field5834 = false;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Lpda;")
    private class535 field5830;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lpi;")
    private class422 field5832;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "Lcu;")
    public static class185 field5838 = new class185(13, 3);

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "Lvj;")
    public static class373 field5840;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public static void method2490(int arg0) {
        field5840 = null;
        field5838 = null;
        if (arg0 != 896) {
            field5840 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lmh;Lpda;)V")
    public class430(class537 arg0, class535 arg1) {
        super(arg0);
        this.field5830 = arg1;
        if (this.field5830.field7505 != null && super.field4382.field7863 && super.field4382.field7763) {
            class187 var3 = class381.method2206(super.field4382, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", (byte) 79);
            class187 var4 = class381.method2206(super.field4382, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", (byte) 79);
            this.field5832 = class628.method3598(new class187[] { var3, var4 }, super.field4382, (byte) -38);
            this.field5834 = this.field5832 != null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BZ)V")
    public final void method252(byte arg0, boolean arg1) {
        ++field5833;
        class15 var3 = super.field4382.method3111(74);
        if (arg0 > 10) {
            if (this.field5834 && var3 != null) {
                float var4 = 1.0F + (-Math.abs(super.field4382.field7859[1]) + 1.0F) * 2.0F;
                super.field4382.method3078(33984, 1);
                super.field4382.method3083((byte) 119, var3);
                super.field4382.method3078(33984, 0);
                super.field4382.method3083((byte) 84, this.field5830.field7505);
                long var5 = this.field5832.field5446;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field4382.field7859[0], -super.field4382.field7859[1], -super.field4382.field7859[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field4382.field7860 * var4, super.field4382.field7774 * var4, super.field4382.field7804 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field4382.field7859[1]) * 928.0F + 64.0F);
                this.field5827 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBLuu;)V")
    public final void method253(int arg0, byte arg1, class238 arg2) {
        if (arg1 == 93) {
            ++field5835;
            if (!this.field5827) {
                super.field4382.method3083((byte) 90, arg2);
                super.field4382.method3063(arg0, (byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)V")
    public static final void method2491(int arg0, int arg1, int arg2, int arg3) {
        class349 var4 = class383.field5070[arg0][arg1][arg2];
        if (var4 != null) {
            class56 var5 = var4.field4507;
            class56 var6 = var4.field4498;
            if (var5 != null) {
                var5.field487 = var5.field487 * arg3 / (16 << class362.field4756 - 7);
                var5.field494 = var5.field494 * arg3 / (16 << class362.field4756 - 7);
            }
            if (var6 != null) {
                var6.field487 = var6.field487 * arg3 / (16 << class362.field4756 - 7);
                var6.field494 = var6.field494 * arg3 / (16 << class362.field4756 - 7);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)I")
    public static final int method2492(int arg0, byte arg1) {
        if (arg1 != -122) {
            return 107;
        } else {
            ++field5831;
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 + -61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)Z")
    public final boolean method257(byte arg0) {
        ++field5829;
        if (arg0 < 115) {
            this.field5832 = null;
        }
        return this.field5834;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZII)V")
    public final void method258(boolean arg0, int arg1, int arg2) {
        ++field5836;
        if (this.field5827) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((60 & arg1) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((245984 & arg2) >> 16) / 8.0F;
            float var8 = (float) (arg2 >> 19 & 15) / 16.0F;
            float var9 = (float) ((129711905 & arg2) >> 23) / 16.0F;
            int var10 = 15 & arg2 >> 27;
            long var11 = this.field5832.field5446;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field4382.field7730 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg0) {
            field5840 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public final void method251(byte arg0) {
        if (arg0 >= -21) {
            this.field5834 = false;
        }
        ++field5839;
        if (this.field5827) {
            super.field4382.method3078(33984, 1);
            super.field4382.method3083((byte) 95, (class238) null);
            super.field4382.method3078(33984, 0);
            super.field4382.method3083((byte) 72, (class238) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5827 = false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V")
    public final void method256(boolean arg0, int arg1) {
        if (arg1 != 28300) {
            this.method258(true, 7, -1);
        }
        ++field5828;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIII)I")
    public static final int method2493(int arg0, int arg1, int arg2, int arg3) {
        ++field5837;
        if (arg1 == arg2) {
            return arg2;
        } else {
            int var4 = 128 - arg3;
            int var5 = (arg1 & 127) * arg3 + (arg2 & 127) * var4 >> 7;
            int var6 = (896 & arg2) * var4 - -((arg1 & arg0) * arg3) >> 7;
            int var7 = (arg2 & 64512) * var4 - -((arg1 & 64512) * arg3) >> 7;
            return 64512 & var7 | var6 & 896 | var5 & 127;
        }
    }

    static {
        new class92("", 73);
        field5840 = new class373(19, 3);
    }
}
