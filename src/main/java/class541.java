import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class541 extends class190 {

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "Z")
    private boolean field7727 = false;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "Z")
    private boolean field7726 = false;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "Lah;")
    private class374 field7717;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "Lun;")
    private class144 field7728;

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "[[B")
    public static byte[][] field7731 = new byte[250][];

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "Lcb;")
    public static class631 field7722 = new class631(11, 16);

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "[Liaa;")
    public static class251[] field7732 = new class251[8];

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    public static int field7730;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cv", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field7733;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "[I")
    public static int[] field7718;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3171(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method3166(byte arg0, int arg1) {
        class145.field2239.method68(arg0 ^ 16823, arg1);
        if (arg0 != -91) {
            field7718 = null;
        }
        ++field7715;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)Z", line = 17)
    public final boolean method908(int arg0) {
        ++field7716;
        return arg0 < 37 ? true : this.field7726;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILnba;I)V", line = 30)
    public final void method911(int arg0, class487 arg1, int arg2) {
        if (arg2 == 0) {
            ++field7725;
            if (!this.field7727) {
                super.field3195.method1306(arg1, 114);
                super.field3195.method1334(0, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lrs;Lah;)V", line = 47)
    public class541(class166 arg0, class374 arg1) {
        super(arg0);
        this.field7717 = arg1;
        if (this.field7717.field5652 != null && super.field3195.field2875 && super.field3195.field2861) {
            class621 var3 = class616.method3521("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field3195, (byte) -99, 35633);
            class621 var4 = class616.method3521("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field3195, (byte) -99, 35632);
            this.field7728 = class231.method1605(new class621[] { var3, var4 }, super.field3195, (byte) -118);
            this.field7726 = this.field7728 != null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIB)V", line = 66)
    public final void method914(int arg0, int arg1, byte arg2) {
        ++field7720;
        if (this.field7727) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) ((arg1 & 261465) >> 16) / 8.0F;
            float var8 = (float) (arg1 >> 19 & 15) / 16.0F;
            float var9 = (float) (arg1 >> 23 & 15) / 16.0F;
            int var10 = 15 & arg1 >> 27;
            long var11 = this.field7728.field2237;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field3195.field2757 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg2 != -122) {
            method3166((byte) 74, -81);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V", line = 105)
    public final void method910(boolean arg0) {
        if (this.field7727) {
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1306((class487) null, 64);
            super.field3195.method1298(0, (byte) -124);
            super.field3195.method1306((class487) null, 83);
            OpenGL.glUseProgramObjectARB(0L);
            this.field7727 = false;
        }
        ++field7730;
        if (arg0) {
            method3170(-43, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI)V", line = 126)
    public final void method915(boolean arg0, int arg1) {
        ++field7723;
        if (arg1 == 0) {
            class708 var3 = super.field3195.method1332(14414);
            if (this.field7726 && var3 != null) {
                float var4 = 1.0F + (-Math.abs(super.field3195.field2868[1]) + 1.0F) * 2.0F;
                super.field3195.method1298(1, (byte) -124);
                super.field3195.method1306(var3, arg1 ^ 61);
                super.field3195.method1298(0, (byte) -124);
                super.field3195.method1306(this.field7717.field5652, 89);
                long var5 = this.field7728.field2237;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field3195.field2868[0], -super.field3195.field2868[1], -super.field3195.field2868[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field3195.field2814 * var4, super.field3195.field2803 * var4, super.field3195.field2835 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field3195.field2868[1]));
                this.field7727 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V", line = 164)
    public static final void method3167(int arg0, int arg1) {
        ++field7729;
        class674.field9530 = arg1;
        if (arg0 == 1) {
            class577.field8175.method76(38);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V", line = 180)
    public static void method3168(byte arg0) {
        if (arg0 > 21) {
            field7731 = null;
            field7732 = null;
            field7718 = null;
            field7722 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 204)
    public static final boolean method3169(String arg0, int arg1) {
        int var2 = -113 / ((arg1 - 53) / 46);
        ++field7724;
        return class209.method1520(arg0, true, field7733 != null ? field7733 : (field7733 = method3171("lha")));
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IZ)V", line = 214)
    public final void method909(int arg0, boolean arg1) {
        if (arg0 != 16450) {
            this.method909(-43, false);
        }
        ++field7719;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IB)I", line = 224)
    public static final int method3170(int arg0, byte arg1) {
        ++field7721;
        if (arg1 > -21) {
            field7714 = -8;
        }
        return arg0 & 1023;
    }
}
