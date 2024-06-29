import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class334 extends class477 {

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "Z")
    private boolean field4270 = false;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "Z")
    private boolean field4279 = false;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "Lwl;")
    private class511 field4268;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "Lss;")
    private class322 field4276;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Loi;")
    public static class169 field4267 = new class169("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "Lpi;")
    public static class340 field4282 = new class340(42, 8);

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "Z")
    public static boolean field4283 = true;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "Lpi;")
    public static class340 field4284 = new class340(40, 10);

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "F")
    public static float field4285;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "[Lf;")
    public static class404[] field4280;

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lgk;Lwl;)V")
    public class334(class463 arg0, class511 arg1) {
        super(arg0);
        this.field4268 = arg1;
        if (this.field4268.field7524 != null && super.field6964.field6726 && super.field6964.field6718) {
            class307 var3 = class206.method1346(super.field6964, 35633, -10993, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class307 var4 = class206.method1346(super.field6964, 35632, -10993, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field4276 = class310.method1853(108, super.field6964, new class307[] { var3, var4 });
            this.field4279 = this.field4276 != null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;IILgk;)Lhd;")
    public static final class211 method1983(String arg0, int arg1, int arg2, class463 arg3) {
        ++field4269;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class207.field2690, 0);
        if (arg1 != -6416) {
            return null;
        } else if (class207.field2690[0] != -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class211(arg3, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIZZ)Ldn;")
    public static final class201 method1984(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg0 != 0) {
            method1983((String) null, 126, 99, (class463) null);
        }
        ++field4273;
        class374 var5 = null;
        if (class4.field35 != null) {
            var5 = new class374(arg2, class4.field35, class132.field1788[arg2], 1000000);
        }
        class212.field2718[arg2] = class398.field5292.method2600(class242.field3113, arg2, (byte) -67, var5);
        if (arg3) {
            class212.field2718[arg2].method2358(false);
        }
        return new class201(class212.field2718[arg2], arg4, arg1);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)I")
    public static final int method1985(int arg0, int arg1, int arg2) {
        ++field4271;
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        if (arg2 != 0) {
            field4283 = true;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)V")
    public static void method1986(byte arg0) {
        field4282 = null;
        field4284 = null;
        if (arg0 >= 94) {
            field4267 = null;
            field4280 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)Z")
    public final boolean method264(byte arg0) {
        if (arg0 <= 45) {
            return true;
        } else {
            ++field4278;
            return false;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZZ)V")
    public final void method270(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field4277;
            class244 var3 = super.field6964.method2786(108);
            if (this.field4279 && var3 != null) {
                super.field6964.method2741((byte) -38, 1);
                super.field6964.method2771(var3, -16785);
                super.field6964.method2741((byte) -38, 0);
                super.field6964.method2771(this.field4268.field7524, -16785);
                long var4 = this.field4276.field4140;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field6964.field6750[0], -super.field6964.field6750[1], -super.field6964.field6750[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field6964.field6781, super.field6964.field6818, super.field6964.field6754, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field6964.field6750[1]) * 928.0F);
                this.field4270 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
    public final void method269(byte arg0) {
        if (arg0 != 126) {
            this.method271(false, 64);
        }
        ++field4274;
        if (this.field4270) {
            super.field6964.method2741((byte) -38, 1);
            super.field6964.method2771((class31) null, -16785);
            super.field6964.method2741((byte) -38, 0);
            super.field6964.method2771((class31) null, -16785);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4270 = false;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BII)V")
    public final void method272(byte arg0, int arg1, int arg2) {
        if (this.field4270) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((arg1 & 63) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            long var8 = this.field4276.field4140;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field6964.field6690 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field4275;
        if (arg0 < 33) {
            field4283 = true;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lrh;II)V")
    public final void method266(class31 arg0, int arg1, int arg2) {
        ++field4281;
        if (arg1 == -11) {
            if (!this.field4270) {
                super.field6964.method2771(arg0, -16785);
                super.field6964.method2739(arg2, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI)V")
    public final void method271(boolean arg0, int arg1) {
        ++field4272;
        if (arg1 != -13) {
            field4283 = false;
        }
    }
}
