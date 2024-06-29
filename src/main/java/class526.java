import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class526 extends class692 {

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Z")
    private boolean field7339 = false;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Z")
    private boolean field7348 = false;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lan;")
    private class193 field7342;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lkba;")
    private class25 field7337;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILfga;I)V", line = 4)
    public final void method1119(int arg0, class377 arg1, int arg2) {
        if (arg0 <= 48) {
            this.field7348 = false;
        }
        if (!this.field7348) {
            super.field9753.method3384(arg1, (byte) 113);
            super.field9753.method3375(arg2, (byte) 102);
        }
        ++field7346;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZI)V", line = 23)
    public final void method1113(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method1112(124);
        }
        if (this.field7348) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            long var8 = this.field7337.field277;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field9753.field8133 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field7349;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V", line = 51)
    public final void method1118(boolean arg0, int arg1) {
        ++field7343;
        class653 var3 = super.field9753.method3331((byte) -128);
        if (arg1 == -3826) {
            if (this.field7339 && var3 != null) {
                super.field9753.method3321(1, arg1 + -15761);
                super.field9753.method3384(var3, (byte) 98);
                super.field9753.method3321(0, arg1 ^ 17011);
                super.field9753.method3384(this.field7342.field2892, (byte) 112);
                long var4 = this.field7337.field277;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field9753.field8278[0], -super.field9753.field8278[1], -super.field9753.field8278[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field9753.field8273, super.field9753.field8202, super.field9753.field8193, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field9753.field8278[1]) * 928.0F + 96.0F);
                this.field7348 = true;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 86)
    public static final void method3075(int arg0) {
        class278.field4014 = new class420[50];
        if (arg0 != 7) {
            field7341 = -58;
        }
        class57.field884 = 0;
        ++field7344;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZB)V", line = 101)
    public final void method1117(boolean arg0, byte arg1) {
        ++field7340;
        if (arg1 != 57) {
            this.field7337 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)Z", line = 112)
    public final boolean method1112(int arg0) {
        ++field7338;
        return arg0 > -124 ? false : false;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Llea;Lan;)V", line = 170)
    public class526(class573 arg0, class193 arg1) {
        super(arg0);
        this.field7342 = arg1;
        if (this.field7342.field2892 != null && super.field9753.field8172 && super.field9753.field8175) {
            class235 var3 = class472.method2756(-21541, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field9753, 35633);
            class235 var4 = class472.method2756(-21541, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field9753, 35632);
            this.field7337 = class505.method2954(new class235[] { var3, var4 }, super.field9753, (byte) -124);
            this.field7339 = this.field7337 != null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZJILjava/lang/String;IIZZIJILjava/lang/String;)V", line = 126)
    public static final void method3076(int arg0, boolean arg1, long arg2, int arg3, String arg4, int arg5, int arg6, boolean arg7, boolean arg8, int arg9, long arg10, int arg11, String arg12) {
        ++field7347;
        if (!class383.field5382 && class624.field8863 < 500) {
            if (arg3 != 500) {
                method3075(127);
            }
            int var15 = arg9 == -1 ? class578.field8338 : arg9;
            class554 var16 = new class554(arg12, arg4, var15, arg11, arg0, arg2, arg6, arg5, arg8, arg7, arg10, arg1);
            class780.method4284(var16, 2);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 145)
    public final void method1111(byte arg0) {
        if (this.field7348) {
            super.field9753.method3321(1, -19587);
            super.field9753.method3384((class377) null, (byte) 92);
            super.field9753.method3321(0, -19587);
            super.field9753.method3384((class377) null, (byte) 52);
            OpenGL.glUseProgramObjectARB(0L);
            this.field7348 = false;
        }
        ++field7345;
        if (arg0 != 114) {
            this.field7348 = false;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)I", line = 190)
    public static final int method3077(byte arg0) {
        if (arg0 != -38) {
            field7341 = 86;
        }
        ++field7350;
        return class138.field2289.method2703(0);
    }
}
