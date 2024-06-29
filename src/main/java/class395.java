import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class395 extends class140 {

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Z")
    private boolean field5428 = false;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Z")
    private boolean field5433 = false;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lwq;")
    private class146 field5429;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Lgda;")
    private class49 field5435;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "[I")
    public static int[] field5427 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Llo;")
    public static class642 field5438;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public final void method143(int arg0) {
        if (this.field5428) {
            super.field1984.method3111(arg0 + 33991, 1);
            super.field1984.method3152(-2, (class228) null);
            super.field1984.method3111(33984, 0);
            super.field1984.method3152(-2, (class228) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5428 = false;
        }
        ++field5432;
        if (arg0 != -7) {
            this.method149(113);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Z")
    public final boolean method149(int arg0) {
        ++field5440;
        if (arg0 > -36) {
            this.field5435 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lte;Lwq;)V")
    public class395(class527 arg0, class146 arg1) {
        super(arg0);
        this.field5429 = arg1;
        if (this.field5429.field2121 != null && super.field1984.field7874 && super.field1984.field7825) {
            class346 var3 = class522.method3080(-89, 35633, super.field1984, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class346 var4 = class522.method3080(-110, 35632, super.field1984, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field5435 = class560.method3370(super.field1984, new class346[] { var3, var4 }, -108);
            this.field5433 = this.field5435 != null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILjl;)V")
    public final void method146(int arg0, int arg1, class228 arg2) {
        if (!this.field5428) {
            super.field1984.method3152(-2, arg2);
            super.field1984.method3121(-27745, arg1);
        }
        ++field5436;
        if (arg0 != -7) {
            this.field5429 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lvp;BI)Ljava/lang/String;")
    public static final String method2342(class162 arg0, byte arg1, int arg2) {
        ++field5434;
        if (!client.method1599(arg0).method3654(arg2, true) && arg0.field2405 == null) {
            return null;
        } else {
            int var3 = -105 / ((63 - arg1) / 52);
            if (arg0.field2463 != null && arg2 < arg0.field2463.length && arg0.field2463[arg2] != null && ~arg0.field2463[arg2].trim().length() != -1) {
                return arg0.field2463[arg2];
            } else {
                return class112.field1592 ? "Hidden-" + arg2 : null;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
    public final void method144(int arg0, int arg1, int arg2) {
        if (arg1 == -4741) {
            ++field5431;
            if (this.field5428) {
                int var4 = 1 << (3 & arg2);
                float var5 = (float) (1 << (arg2 >> 3 & 7)) / 32.0F;
                int var6 = 65535 & arg0;
                float var7 = (float) (arg0 >> 16 & 3) / 8.0F;
                long var8 = this.field5435.field575;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field1984.field7747 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
    public static final void method2343(int arg0, int arg1, int arg2, int arg3) {
        ++field5430;
        if (arg1 < 43) {
            method2343(93, -52, 70, 43);
        }
        class261 var4 = class491.field6998[arg0][arg2];
        class114.method823(arg3, var4 == null ? class84.field1197 : var4, -1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V")
    public final void method145(int arg0, boolean arg1) {
        ++field5437;
        if (arg0 != -7) {
            field5438 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZB)V")
    public final void method148(boolean arg0, byte arg1) {
        if (arg1 != -86) {
            this.method143(-50);
        }
        ++field5439;
        class384 var3 = super.field1984.method3114(31095);
        if (this.field5433 && var3 != null) {
            super.field1984.method3111(33984, 1);
            super.field1984.method3152(-2, var3);
            super.field1984.method3111(33984, 0);
            super.field1984.method3152(arg1 ^ 84, this.field5429.field2121);
            long var4 = this.field5435.field575;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field1984.field7800[0], -super.field1984.field7800[1], -super.field1984.field7800[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field1984.field7840, super.field1984.field7828, super.field1984.field7865, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field1984.field7800[1]) * 928.0F);
            this.field5428 = true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static void method2344(boolean arg0) {
        field5427 = null;
        field5438 = null;
        if (!arg0) {
            method2344(false);
        }
    }
}
