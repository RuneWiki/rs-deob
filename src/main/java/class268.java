import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class268 extends class318 {

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "Z")
    private boolean field4093 = false;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "Z")
    private boolean field4097 = false;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "Luo;")
    private class408 field4096;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "Lfe;")
    private class404 field4094;

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "Lhn;")
    public static class509 field4101;

    @OriginalMember(owner = "client!fu", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field4102;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
    public static int field4100;

    static {
        new class234("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field4101 = new class509(98, 12);
        field4102 = new String[100];
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V", line = 3)
    public final void method719(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            if (this.field4097) {
                int var4 = 1 << (3 & arg1);
                float var5 = (float) (1 << ((62 & arg1) >> 3)) / 32.0F;
                int var6 = arg0 & 65535;
                float var7 = (float) (3 & arg0 >> 16) / 8.0F;
                long var8 = this.field4094.field5993;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field4800.field3027 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
            ++field4099;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZZ)V", line = 31)
    public final void method718(boolean arg0, boolean arg1) {
        if (!arg1) {
            ++field4090;
            class428 var3 = super.field4800.method1261(16386);
            if (this.field4093 && var3 != null) {
                super.field4800.method1307(1, (byte) 92);
                super.field4800.method1289(-19391, var3);
                super.field4800.method1307(0, (byte) 92);
                super.field4800.method1289(-19391, this.field4096.field6092);
                long var4 = this.field4094.field5993;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field4800.field3147[0], -super.field4800.field3147[1], -super.field4800.field3147[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field4800.field3130, super.field4800.field3136, super.field4800.field3155, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field4800.field3147[1]));
                this.field4097 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(B)V", line = 60)
    public final void method723(byte arg0) {
        if (this.field4097) {
            super.field4800.method1307(1, (byte) 92);
            super.field4800.method1289(-19391, (class454) null);
            super.field4800.method1307(0, (byte) 92);
            super.field4800.method1289(-19391, (class454) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4097 = false;
        }
        ++field4095;
        if (arg0 <= 91) {
            this.method718(false, true);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V", line = 80)
    public static final void method1777(int arg0, int arg1) {
        ++field4098;
        class211 var2 = class452.method2749(12, -116, arg1);
        if (arg0 != 2080) {
            field4101 = null;
        }
        var2.method1460(true);
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V", line = 94)
    public static void method1778(int arg0) {
        if (arg0 == 62) {
            field4101 = null;
            field4102 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)Z", line = 107)
    public final boolean method721(int arg0) {
        if (arg0 != 0) {
            this.field4093 = false;
        }
        ++field4089;
        return false;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(III)Lqv;", line = 128)
    public static final class312 method1779(int arg0, int arg1, int arg2) {
        class138 var3 = client.field3311[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2104;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lkd;Luo;)V", line = 160)
    public class268(class188 arg0, class408 arg1) {
        super(arg0);
        this.field4096 = arg1;
        if (this.field4096.field6092 != null && super.field4800.field3119 && super.field4800.field3166) {
            class447 var3 = class71.method622(true, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field4800, 35633);
            class447 var4 = class71.method622(true, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field4800, 35632);
            this.field4094 = class75.method647(92, super.field4800, new class447[] { var3, var4 });
            this.field4093 = this.field4094 != null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lav;IB)V", line = 144)
    public final void method715(class454 arg0, int arg1, byte arg2) {
        if (arg2 > -108) {
            field4100 = 14;
        }
        ++field4092;
        if (!this.field4097) {
            super.field4800.method1289(-19391, arg0);
            super.field4800.method1248(arg1, true);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZ)V", line = 178)
    public final void method722(int arg0, boolean arg1) {
        int var3 = -92 % ((-23 - arg0) / 46);
        ++field4091;
    }
}
