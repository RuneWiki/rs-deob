import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class556 extends class366 {

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Z")
    private boolean field8035 = false;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Z")
    private boolean field8046 = false;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Lfj;")
    private class609 field8038;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lcaa;")
    private class277 field8034;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Lhga;")
    public static class158 field8033 = new class158(9, -1);

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILep;I)V")
    public final void method1130(int arg0, class386 arg1, int arg2) {
        ++field8041;
        if (arg0 != 1) {
            this.method1137(true);
        }
        if (!this.field8035) {
            super.field5742.method856(false, arg1);
            super.field5742.method816(arg2, arg0 ^ -119);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZ)V")
    public final void method1131(boolean arg0, boolean arg1) {
        ++field8043;
        if (!arg1) {
            this.field8035 = false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ler;Lfj;)V")
    public class556(class92 arg0, class609 arg1) {
        super(arg0);
        this.field8038 = arg1;
        if (this.field8038.field8653 != null && super.field5742.field1398 && super.field5742.field1438) {
            class199 var3 = class319.method2170(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field5742, (byte) 116);
            class199 var4 = class319.method2170(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field5742, (byte) 126);
            this.field8034 = class402.method2585(super.field5742, false, new class199[] { var3, var4 });
            this.field8046 = this.field8034 != null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIII)V")
    public static final void method3322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class17.field282.field4860 != 0 && arg4 != 0 && ~class275.field4413 > -51 && arg0 != -1) {
            class674.field9494[class275.field4413++] = new class681((byte) 1, arg0, arg4, arg3, arg5, 0, arg2, (class692) null);
        }
        int var6 = -62 % ((-10 - arg1) / 52);
        ++field8044;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public final void method1132(int arg0) {
        if (this.field8035) {
            super.field5742.method834(true, 1);
            super.field5742.method856(false, (class386) null);
            super.field5742.method834(true, 0);
            super.field5742.method856(false, (class386) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8035 = false;
        }
        ++field8036;
        if (arg0 != 0) {
            this.field8046 = false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
    public static final void method3323(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method3322(5, -72, 111, -46, -59, -14);
        }
        if (~class81.field1009 != ~arg2) {
            class328.field5091 = new int[arg2];
            for (int var3 = 0; var3 < arg2; ++var3) {
                class328.field5091[var3] = (var3 << 12) / arg2;
            }
            class504.field7373 = arg2 + -1;
            class433.field6589 = arg2 * 32;
            class81.field1009 = arg2;
        }
        ++field8037;
        if (class246.field3926 != arg0) {
            if (~class81.field1009 == ~arg0) {
                class657.field9166 = class328.field5091;
            } else {
                class657.field9166 = new int[arg0];
                for (int var4 = 0; ~var4 > ~arg0; ++var4) {
                    class657.field9166[var4] = (var4 << 12) / arg0;
                }
            }
            class66.field849 = arg0 - 1;
            class246.field3926 = arg0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V")
    public final void method1136(int arg0, int arg1, int arg2) {
        if (arg0 == -6561) {
            if (this.field8035) {
                int var4 = 1 << (3 & arg2);
                float var5 = (float) (1 << (7 & arg2 >> 3)) / 32.0F;
                int var6 = 65535 & arg1;
                float var7 = (float) (3 & arg1 >> 16) / 8.0F;
                long var8 = this.field8034.field4482;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5742.field1330 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
            ++field8045;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Z")
    public final boolean method1137(boolean arg0) {
        if (arg0) {
            field8042 = -66;
        }
        ++field8040;
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)V")
    public final void method1133(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method1131(true, true);
        }
        ++field8039;
        class58 var3 = super.field5742.method880(41);
        if (this.field8046 && var3 != null) {
            super.field5742.method834(true, 1);
            super.field5742.method856(false, var3);
            super.field5742.method834(true, 0);
            super.field5742.method856(false, this.field8038.field8653);
            long var4 = this.field8034.field4482;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field5742.field1381[0], super.field5742.field1381[1], super.field5742.field1381[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5742.field1425, super.field5742.field1365, super.field5742.field1441, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field5742.field1381[1]));
            this.field8035 = true;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public static void method3324(int arg0) {
        field8033 = null;
        if (arg0 != 24178) {
            field8033 = null;
        }
    }
}
