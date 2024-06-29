import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class29 extends class497 {

    @OriginalMember(owner = "client!qaa", name = "k", descriptor = "Z")
    private boolean field418 = false;

    @OriginalMember(owner = "client!qaa", name = "n", descriptor = "Z")
    private boolean field421 = false;

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "Lmha;")
    private class438 field417;

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "Loca;")
    private class277 field415;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!qaa", name = "m", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!qaa", name = "o", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!qaa", name = "q", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!qaa", name = "r", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!qaa", name = "s", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!qaa", name = "t", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!qaa", name = "l", descriptor = "Ljava/lang/Object;")
    public static Object field419;

    @OriginalMember(owner = "client!qaa", name = "p", descriptor = "[Lpia;")
    public static class103[] field423;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(ZZ)V")
    public final void method163(boolean arg0, boolean arg1) {
        ++field420;
        if (!arg1) {
            class196 var3 = super.field6867.method1618(1);
            if (this.field421 && var3 != null) {
                float var4 = 1.0F + 2.0F * (-Math.abs(super.field6867.field3611[1]) + 1.0F);
                super.field6867.method1637(33984, 1);
                super.field6867.method1653((byte) 89, var3);
                super.field6867.method1637(33984, 0);
                super.field6867.method1653((byte) 78, this.field417.field6171);
                long var5 = this.field415.field4108;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field6867.field3611[0], -super.field6867.field3611[1], -super.field6867.field3611[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field6867.field3626 * var4, super.field6867.field3643 * var4, super.field6867.field3570 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field6867.field3611[1]));
                this.field418 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V")
    public final void method161(int arg0) {
        ++field424;
        if (arg0 != -1756) {
            method214((byte) 8);
        }
        if (this.field418) {
            super.field6867.method1637(33984, 1);
            super.field6867.method1653((byte) 125, (class7) null);
            super.field6867.method1637(33984, 0);
            super.field6867.method1653((byte) 108, (class7) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field418 = false;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)V")
    public static void method214(byte arg0) {
        field423 = null;
        if (arg0 < 105) {
            method216(-125, -39, -69);
        }
        field419 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(III)V")
    public final void method162(int arg0, int arg1, int arg2) {
        ++field416;
        if (this.field418) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((arg2 & 243921) >> 16) / 8.0F;
            float var8 = (float) (arg2 >> 19 & 15) / 16.0F;
            float var9 = (float) (arg2 >> 23 & 15) / 16.0F;
            int var10 = (2031517300 & arg2) >> 27;
            long var11 = this.field415.field4108;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field6867.field3532 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg0 <= 122) {
            this.field418 = true;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILil;I)V")
    public final void method158(int arg0, class7 arg1, int arg2) {
        if (!this.field418) {
            super.field6867.method1653((byte) 105, arg1);
            super.field6867.method1589(-4, arg2);
        }
        ++field427;
        if (arg0 != 9) {
            method215(-61);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "(I)V")
    public static final void method215(int arg0) {
        ++field426;
        if (~class70.field998.toLowerCase().indexOf("microsoft") != 0) {
            class658.field9114[191] = 73;
            class658.field9114[219] = 42;
            class658.field9114[192] = 58;
            class658.field9114[187] = 27;
            class658.field9114[223] = 28;
            class658.field9114[222] = 59;
            class658.field9114[221] = 43;
            class658.field9114[188] = 71;
            class658.field9114[220] = 74;
            class658.field9114[186] = 57;
            class658.field9114[189] = 26;
            class658.field9114[190] = 72;
        } else {
            class658.field9114[44] = 71;
            class658.field9114[47] = 73;
            class658.field9114[61] = 27;
            class658.field9114[92] = 74;
            class658.field9114[59] = 57;
            class658.field9114[45] = 26;
            class658.field9114[91] = 42;
            if (class70.field994 == null) {
                class658.field9114[222] = 59;
                class658.field9114[192] = 58;
            } else {
                class658.field9114[222] = 58;
                class658.field9114[520] = 59;
                class658.field9114[192] = 28;
            }
            class658.field9114[46] = 72;
            class658.field9114[93] = 43;
        }
        if (arg0 != 1) {
            field419 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)Z")
    public final boolean method157(int arg0) {
        ++field422;
        return arg0 != -6808 ? true : this.field421;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IZ)V")
    public final void method164(int arg0, boolean arg1) {
        if (arg0 == 0) {
            ++field425;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(III)Z")
    public static final boolean method216(int arg0, int arg1, int arg2) {
        ++field414;
        if (arg1 != 43) {
            return true;
        } else {
            return class485.method2819(arg2, (byte) 22, arg0) | ~(262144 & arg0) != -1 || class291.method1844(arg2, arg1 ^ 43, arg0);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Ldia;Lmha;)V")
    public class29(class246 arg0, class438 arg1) {
        super(arg0);
        this.field417 = arg1;
        if (this.field417.field6171 != null && super.field6867.field3599 && super.field6867.field3635) {
            class298 var3 = class293.method1856(35633, super.field6867, -127, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class298 var4 = class293.method1856(35632, super.field6867, -119, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field415 = class148.method1116(10782, new class298[] { var3, var4 }, super.field6867);
            this.field421 = this.field415 != null;
        }
    }
}
