import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class39 extends class605 {

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "Z")
    private boolean field652 = false;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Z")
    private boolean field643 = false;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "Lsda;")
    private class232 field644;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "Lhca;")
    private class452 field650;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)V")
    public final void method51(boolean arg0, int arg1) {
        if (arg1 > -127) {
            field645 = -15;
        }
        ++field651;
        class431 var3 = super.field8542.method1579((byte) -117);
        if (this.field652 && var3 != null) {
            float var4 = 1.0F + (-Math.abs(super.field8542.field3517[1]) + 1.0F) * 2.0F;
            super.field8542.method1500(33984, 1);
            super.field8542.method1505(-2, var3);
            super.field8542.method1500(33984, 0);
            super.field8542.method1505(-2, this.field644.field3615);
            long var5 = this.field650.field6505;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field8542.field3517[0], -super.field8542.field3517[1], -super.field8542.field3517[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field8542.field3451 * var4, super.field8542.field3497 * var4, super.field8542.field3503 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field8542.field3517[1]) * 928.0F + 64.0F);
            this.field643 = true;
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lok;Lsda;)V")
    public class39(class228 arg0, class232 arg1) {
        super(arg0);
        this.field644 = arg1;
        if (this.field644.field3615 != null && super.field8542.field3481 && super.field8542.field3464) {
            class558 var3 = class548.method3098((byte) -100, 35633, super.field8542, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class558 var4 = class548.method3098((byte) -112, 35632, super.field8542, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field650 = class505.method2912(new class558[] { var3, var4 }, 0, super.field8542);
            this.field652 = this.field650 != null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIFIIIIZI)[[I")
    public static final int[][] method452(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        ++field653;
        int[][] var9 = new int[arg4][arg6];
        class61 var10 = new class61();
        var10.field1153 = arg3;
        var10.field1151 = arg0;
        var10.field1152 = arg1;
        var10.field1157 = (int) (arg2 * 4096.0F);
        var10.field1149 = arg7;
        var10.method230(arg5 ^ -9);
        class550.method3115(arg6, (byte) -99, arg4);
        for (int var11 = arg5; var11 < arg4; ++var11) {
            var10.method642(-10242, var9[var11], var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V")
    public final void method46(boolean arg0, byte arg1) {
        ++field648;
        if (arg1 > -16) {
            field645 = 12;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)Z")
    public final boolean method48(boolean arg0) {
        ++field646;
        return arg0 ? false : this.field652;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILip;I)V")
    public final void method43(int arg0, class657 arg1, int arg2) {
        if (!this.field643) {
            super.field8542.method1505(-2, arg1);
            super.field8542.method1497(arg0, (byte) -29);
        }
        ++field649;
        if (arg2 != 0) {
            this.field644 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZI)V")
    public final void method47(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field645 = -21;
        }
        ++field647;
        if (this.field643) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((arg2 & 227225) >> 16) / 8.0F;
            float var8 = (float) (15 & arg2 >> 19) / 16.0F;
            float var9 = (float) (15 & arg2 >> 23) / 16.0F;
            int var10 = (2039829868 & arg2) >> 27;
            long var11 = this.field650.field6505;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field8542.field3405 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public final void method45(int arg0) {
        if (arg0 != 0) {
            this.method47(-64, true, -54);
        }
        ++field642;
        if (this.field643) {
            super.field8542.method1500(33984, 1);
            super.field8542.method1505(-2, (class657) null);
            super.field8542.method1500(33984, 0);
            super.field8542.method1505(arg0 + -2, (class657) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field643 = false;
        }
    }
}
