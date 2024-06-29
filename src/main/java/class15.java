import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class15 extends class283 {

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "Z")
    private boolean field147 = false;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "Z")
    private boolean field158 = false;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "Lrb;")
    private class401 field150;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "Ldc;")
    private class62 field148;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field149 = 1;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "Lgr;")
    public static class530 field151 = new class530(63, -1);

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)V")
    public final void method73(boolean arg0, int arg1) {
        ++field155;
        if (arg1 != 2) {
            field149 = -27;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public final void method74(byte arg0) {
        if (arg0 != 85) {
            field149 = 79;
        }
        if (this.field158) {
            super.field3958.method2171(126, 1);
            super.field3958.method2164(6, (class158) null);
            super.field3958.method2171(arg0 + 25, 0);
            super.field3958.method2164(arg0 ^ 83, (class158) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field158 = false;
        }
        ++field157;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lou;II)V")
    public final void method75(class158 arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            this.method77(-39);
        }
        if (!this.field158) {
            super.field3958.method2164(6, arg0);
            super.field3958.method2120(arg2, arg1 + 53);
        }
        ++field146;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        ++field154;
        class96 var3 = super.field3958.method2150(-109);
        if (arg0 == -938) {
            if (this.field147 && var3 != null) {
                super.field3958.method2171(arg0 ^ -967, 1);
                super.field3958.method2164(6, var3);
                super.field3958.method2171(119, 0);
                super.field3958.method2164(6, this.field150.field5737);
                long var4 = this.field148.field1002;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field3958.field5111[0], -super.field3958.field5111[1], -super.field3958.field5111[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3958.field5092, super.field3958.field5029, super.field3958.field5077, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field3958.field5111[1]));
                this.field158 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        ++field152;
        if (arg0 < 96) {
            this.field148 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lkw;Lrb;)V")
    public class15(class346 arg0, class401 arg1) {
        super(arg0);
        this.field150 = arg1;
        if (this.field150.field5737 != null && super.field3958.field5100 && super.field3958.field5052) {
            class716 var3 = class535.method3235(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 221, super.field3958);
            class716 var4 = class535.method3235(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 221, super.field3958);
            this.field148 = class660.method3768(super.field3958, 35716, new class716[] { var3, var4 });
            this.field147 = this.field148 != null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public static void method78(boolean arg0) {
        field151 = null;
        if (arg0) {
            method78(true);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZII)V")
    public final void method79(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field149 = -27;
        }
        if (this.field158) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << ((63 & arg2) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (arg1 >> 16 & 3) / 8.0F;
            long var8 = this.field148.field1002;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field3958.field4973 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field153;
    }
}
