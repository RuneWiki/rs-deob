import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class614 extends class190 {

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Z")
    private boolean field8657 = false;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
    private boolean field8652 = false;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Lah;")
    private class374 field8661;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Lun;")
    private class144 field8656;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field8651 = 503;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method3504(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg9 <= ~class184.field3102 && class657.field9347 >= arg9 && ~arg3 <= ~class184.field3102 && arg3 <= class657.field9347 && ~class184.field3102 >= ~arg8 && arg8 <= class657.field9347 && class184.field3102 <= arg4 && class657.field9347 >= arg4 && arg5 >= class76.field1126 && arg5 <= class461.field6699 && arg1 >= class76.field1126 && class461.field6699 >= arg1 && ~class76.field1126 >= ~arg6 && ~arg6 >= ~class461.field6699 && ~class76.field1126 >= ~arg7 && ~arg7 >= ~class461.field6699) {
            class340.method2170(arg5, arg3, arg1, arg8, arg9, arg4, arg7, arg6, arg2, arg0 ^ -73);
        } else {
            class133.method1081(arg5, arg7, arg9, arg2, (byte) -5, arg3, arg6, arg1, arg4, arg8);
        }
        if (arg0 != -30) {
            method3507((byte) 46, 84);
        }
        ++field8660;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI[F)[F")
    public static final float[] method3505(boolean arg0, int arg1, float[] arg2) {
        if (arg0) {
            method3506(true, (byte) 68, false);
        }
        ++field8649;
        float[] var3 = new float[arg1];
        class571.method3308(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILnba;I)V")
    public final void method911(int arg0, class487 arg1, int arg2) {
        if (arg2 != 0) {
            this.method915(true, 79);
        }
        if (!this.field8652) {
            super.field3195.method1306(arg1, 68);
            super.field3195.method1334(0, arg0);
        }
        ++field8662;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZBZ)V")
    public static final void method3506(boolean arg0, byte arg1, boolean arg2) {
        if (arg2) {
            ++class711.field10016;
            class155.method1166(1);
        }
        if (arg1 != 80) {
            method3507((byte) -34, 105);
        }
        ++field8658;
        if (arg0) {
            ++class101.field1509;
            class628.method3564((byte) 120);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V")
    public final void method915(boolean arg0, int arg1) {
        ++field8655;
        class708 var3 = super.field3195.method1332(14414);
        if (this.field8657 && var3 != null) {
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1306(var3, 43);
            super.field3195.method1298(0, (byte) -124);
            super.field3195.method1306(this.field8661.field5652, 103);
            long var4 = this.field8656.field2237;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field3195.field2868[0], -super.field3195.field2868[1], -super.field3195.field2868[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3195.field2814, super.field3195.field2803, super.field3195.field2835, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field3195.field2868[1]) * 928.0F + 96.0F);
            this.field8652 = true;
        }
        if (arg1 != 0) {
            this.field8656 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB)V")
    public final void method914(int arg0, int arg1, byte arg2) {
        if (arg2 != -122) {
            this.method910(false);
        }
        ++field8654;
        if (this.field8652) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) ((223554 & arg1) >> 16) / 8.0F;
            long var8 = this.field8656.field2237;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field3195.field2757 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lrs;Lah;)V")
    public class614(class166 arg0, class374 arg1) {
        super(arg0);
        this.field8661 = arg1;
        if (this.field8661.field5652 != null && super.field3195.field2875 && super.field3195.field2861) {
            class621 var3 = class616.method3521("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field3195, (byte) -99, 35633);
            class621 var4 = class616.method3521("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field3195, (byte) -99, 35632);
            this.field8656 = class231.method1605(new class621[] { var3, var4 }, super.field3195, (byte) -115);
            this.field8657 = this.field8656 != null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public final void method910(boolean arg0) {
        ++field8663;
        if (this.field8652) {
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1306((class487) null, 87);
            super.field3195.method1298(0, (byte) -124);
            super.field3195.method1306((class487) null, 83);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8652 = false;
        }
        if (arg0) {
            this.method914(-18, 70, (byte) -30);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
    public static final void method3507(byte arg0, int arg1) {
        int var2 = -93 / ((arg0 - 74) / 42);
        class311.field4689 = new int[arg1];
        class596.field8450 = new int[arg1];
        class555.field7915 = new int[arg1];
        class670.field9489 = new int[arg1];
        ++field8664;
        class642.field9111 = new int[arg1];
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z")
    public final boolean method908(int arg0) {
        ++field8659;
        if (arg0 <= 37) {
            field8651 = -103;
        }
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
    public final void method909(int arg0, boolean arg1) {
        ++field8650;
        if (arg0 != 16450) {
            this.field8657 = false;
        }
    }
}
