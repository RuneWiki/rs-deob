import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class358 extends class184 {

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "Z")
    private boolean field5023 = false;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "Z")
    private boolean field5020 = false;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "Lqr;")
    private class64 field5031;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "Las;")
    private class151 field5029;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public static int field5026 = -1;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method698(int arg0) {
        ++field5025;
        if (arg0 != -20958) {
            this.method700((class87) null, true, 51);
        }
        return false;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIZ)V", line = 15)
    public final void method705(int arg0, int arg1, boolean arg2) {
        if (this.field5020) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) (3 & arg0 >> 16) / 8.0F;
            long var8 = this.field5029.field2282;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2626.field8544 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field5021;
        if (arg2) {
            this.field5020 = true;
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Loea;Lqr;)V", line = 113)
    public class358(class594 arg0, class64 arg1) {
        super(arg0);
        this.field5031 = arg1;
        if (this.field5031.field1161 != null && super.field2626.field8613 && super.field2626.field8684) {
            class698 var3 = class656.method3697(35633, 0, super.field2626, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class698 var4 = class656.method3697(35632, 0, super.field2626, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field5029 = class701.method3942(new class698[] { var3, var4 }, super.field2626, -47);
            this.field5023 = this.field5029 != null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Liia;ZI)V", line = 53)
    public final void method700(class87 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (!this.field5020) {
                super.field2626.method3425(arg0, 67);
                super.field2626.method3417(arg2, 0);
            }
            ++field5024;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZ)V", line = 70)
    public final void method699(int arg0, boolean arg1) {
        if (arg0 >= -54) {
            this.method698(7);
        }
        ++field5022;
        class518 var3 = super.field2626.method3432(-121);
        if (this.field5023 && var3 != null) {
            super.field2626.method3413(1, 33984);
            super.field2626.method3425(var3, -107);
            super.field2626.method3413(0, 33984);
            super.field2626.method3425(this.field5031.field1161, 92);
            long var4 = this.field5029.field2282;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field2626.field8604[0], -super.field2626.field8604[1], -super.field2626.field8604[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field2626.field8637, super.field2626.field8663, super.field2626.field8643, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field2626.field8604[1]) * 928.0F + 96.0F);
            this.field5020 = true;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)V", line = 102)
    public final void method704(boolean arg0, int arg1) {
        if (arg1 != -28981) {
            field5026 = -99;
        }
        ++field5030;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V", line = 135)
    public final void method702(boolean arg0) {
        ++field5028;
        if (this.field5020) {
            super.field2626.method3413(1, 33984);
            super.field2626.method3425((class87) null, -96);
            super.field2626.method3413(0, 33984);
            super.field2626.method3425((class87) null, -66);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5020 = false;
        }
        if (!arg0) {
            this.method700((class87) null, true, 52);
        }
    }
}
