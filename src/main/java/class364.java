import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class364 extends class312 {

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Z")
    private boolean field5399 = false;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "Z")
    private boolean field5405 = false;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "Lvb;")
    private class180 field5406;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "Ltaa;")
    private class377 field5408;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "[Lnda;")
    public static class519[] field5411 = new class519[4];

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "[I")
    public static int[] field5412 = new int[1];

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "Lsl;")
    public static class427 field5409 = new class427(8);

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "Lfda;")
    public static class294 field5413 = new class294(1);

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method2312(String arg0, byte arg1, int arg2) {
        ++class219.field3317;
        ++field5407;
        class275 var3 = class185.method1355(0, class271.field4069, class395.field5772);
        var3.field4103.method693((byte) 106, 1 - -class511.method3019(arg0, -104));
        var3.field4103.method750(127, arg0);
        var3.field4103.method707(arg2, (byte) 100);
        class140.method1141(var3, 19321);
        int var4 = 97 / ((arg1 - 10) / 61);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)V")
    public final void method240(boolean arg0, int arg1) {
        ++field5404;
        if (arg1 < 102) {
            method2313(100);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V")
    public final void method238(int arg0, int arg1, byte arg2) {
        int var4 = -30 % ((74 - arg2) / 45);
        ++field5402;
        if (this.field5405) {
            int var5 = 1 << (3 & arg1);
            float var6 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var7 = 65535 & arg0;
            float var8 = (float) (3 & arg0 >> 16) / 8.0F;
            long var9 = this.field5408.field5600;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "time"), (float) (super.field4632.field215 * var5 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "scale"), var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "breakWaterDepth"), (float) var7);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "breakWaterOffset"), var8);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZ)V")
    public final void method243(boolean arg0, boolean arg1) {
        ++field5410;
        class243 var3 = super.field4632.method87(arg1);
        if (this.field5399 && var3 != null) {
            super.field4632.method125(1, 115);
            super.field4632.method5(3845, var3);
            super.field4632.method125(0, 102);
            super.field4632.method5(3845, this.field5406.field2920);
            long var4 = this.field5408.field5600;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field4632.field268[0], super.field4632.field268[1], super.field4632.field268[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field4632.field321, super.field4632.field319, super.field4632.field290, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field4632.field268[1]) * 928.0F);
            this.field5405 = true;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
    public static void method2313(int arg0) {
        field5411 = null;
        field5409 = null;
        if (arg0 == 10017) {
            field5413 = null;
            field5412 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lus;Lvb;)V")
    public class364(class1 arg0, class180 arg1) {
        super(arg0);
        this.field5406 = arg1;
        if (this.field5406.field2920 != null && super.field4632.field355 && super.field4632.field358) {
            class264 var3 = class469.method2798(35633, super.field4632, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 0);
            class264 var4 = class469.method2798(35632, super.field4632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 0);
            this.field5408 = class70.method786(0, new class264[] { var3, var4 }, super.field4632);
            this.field5399 = this.field5408 != null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)Z")
    public final boolean method242(byte arg0) {
        ++field5401;
        int var2 = 109 % ((25 - arg0) / 57);
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBLum;)V")
    public final void method244(int arg0, byte arg1, class487 arg2) {
        if (!this.field5405) {
            super.field4632.method5(3845, arg2);
            super.field4632.method133(arg0, (byte) -118);
        }
        ++field5403;
        if (arg1 > -78) {
            this.method240(false, -119);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        ++field5400;
        if (arg0 != -123) {
            this.field5405 = false;
        }
        if (this.field5405) {
            super.field4632.method125(1, -110);
            super.field4632.method5(arg0 + 3968, (class487) null);
            super.field4632.method125(0, -109);
            super.field4632.method5(3845, (class487) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5405 = false;
        }
    }
}
