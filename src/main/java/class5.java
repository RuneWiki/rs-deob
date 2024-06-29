import jaggl.OpenGL;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class312 {

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Z")
    private boolean field468 = false;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Z")
    private boolean field479 = false;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lvb;")
    private class180 field481;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Ltaa;")
    private class377 field469;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lkj;")
    public static class527 field475 = new class527(8, 7);

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "Lqfa;")
    public static class85 field480 = new class85(8, 3);

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lkj;")
    public static class527 field482 = new class527(5, 19);

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
    public static int[] field470;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIB)V")
    public final void method238(int arg0, int arg1, byte arg2) {
        int var4 = 79 % ((74 - arg2) / 45);
        if (this.field468) {
            int var5 = 1 << (arg1 & 3);
            float var6 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var7 = arg0 & 65535;
            float var8 = (float) ((arg0 & 228033) >> 16) / 8.0F;
            float var9 = (float) (arg0 >> 19 & 15) / 16.0F;
            float var10 = (float) ((arg0 & 131941103) >> 23) / 16.0F;
            int var11 = (arg0 & 2021395805) >> 27;
            long var12 = this.field469.field5600;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "time"), (float) (super.field4632.field215 * var5 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "scale"), var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "breakWaterDepth"), (float) var7);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "breakWaterOffset"), var8);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var12, "waveIntensity"), var10, var9);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, "waveExponent"), (float) var11);
        }
        ++field472;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lus;Lvb;)V")
    public class5(class1 arg0, class180 arg1) {
        super(arg0);
        this.field481 = arg1;
        if (this.field481.field2920 != null && super.field4632.field355 && super.field4632.field358) {
            class264 var3 = class469.method2798(35633, super.field4632, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 0);
            class264 var4 = class469.method2798(35632, super.field4632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 0);
            this.field469 = class70.method786(0, new class264[] { var3, var4 }, super.field4632);
            this.field479 = this.field469 != null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/io/File;IB)[B")
    public static final byte[] method239(File arg0, int arg1, byte arg2) {
        ++field471;
        try {
            byte[] var3 = new byte[arg1];
            class606.method3489(var3, arg1, arg0, (byte) 123);
            return arg2 >= -28 ? null : var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
    public final void method240(boolean arg0, int arg1) {
        ++field477;
        if (arg1 <= 102) {
            method239((File) null, -71, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        if (this.field468) {
            super.field4632.method125(1, 117);
            super.field4632.method5(3845, (class487) null);
            super.field4632.method125(0, 112);
            super.field4632.method5(3845, (class487) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field468 = false;
        }
        if (arg0 != -123) {
            this.field479 = true;
        }
        ++field474;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)Z")
    public final boolean method242(byte arg0) {
        int var2 = -97 / ((arg0 - 25) / 57);
        ++field467;
        return this.field479;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZ)V")
    public final void method243(boolean arg0, boolean arg1) {
        ++field478;
        class243 var3 = super.field4632.method87(arg1);
        if (this.field479 && var3 != null) {
            float var4 = (1.0F - Math.abs(super.field4632.field268[1])) * 2.0F + 1.0F;
            super.field4632.method125(1, -47);
            super.field4632.method5(3845, var3);
            super.field4632.method125(0, 77);
            super.field4632.method5(3845, this.field481.field2920);
            long var5 = this.field469.field5600;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field4632.field268[0], -super.field4632.field268[1], -super.field4632.field268[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field4632.field321 * var4, super.field4632.field319 * var4, super.field4632.field290 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field4632.field268[1]));
            this.field468 = true;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLum;)V")
    public final void method244(int arg0, byte arg1, class487 arg2) {
        ++field476;
        if (arg1 > -78) {
            this.field469 = null;
        }
        if (!this.field468) {
            super.field4632.method5(3845, arg2);
            super.field4632.method133(arg0, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method245(boolean arg0, int arg1, String arg2) {
        ++field473;
        if (arg0) {
            method246((byte) -96);
        }
        class19 var3 = class373.method2355(90, arg1, 2);
        var3.method432(102);
        var3.field831 = arg2;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    public static void method246(byte arg0) {
        field482 = null;
        field480 = null;
        field475 = null;
        field470 = null;
        int var1 = 109 % ((-47 - arg0) / 32);
    }
}
