import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class452 extends class297 {

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "Z")
    private boolean field6144 = false;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "Z")
    private boolean field6152 = false;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Lri;")
    private class73 field6153;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Leu;")
    private class333 field6146;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "[I")
    public static int[] field6151 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)V")
    public final void method244(int arg0, boolean arg1) {
        ++field6147;
        class336 var3 = super.field3881.method2936(arg0);
        if (this.field6152 && var3 != null) {
            float var4 = 2.0F * (-Math.abs(super.field3881.field7463[1]) + 1.0F) + 1.0F;
            super.field3881.method3003(1, 20);
            super.field3881.method2980(var3, arg0 + 117);
            super.field3881.method3003(0, arg0 + 95);
            super.field3881.method2980(this.field6153.field1099, 122);
            long var5 = this.field6146.field4375;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field3881.field7463[0], -super.field3881.field7463[1], -super.field3881.field7463[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field3881.field7518 * var4, super.field3881.field7499 * var4, super.field3881.field7496 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field3881.field7463[1]));
            this.field6144 = true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)V")
    public final void method241(boolean arg0, int arg1) {
        if (arg1 != -30965) {
            method2585(true);
        }
        ++field6149;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)Z")
    public final boolean method240(boolean arg0) {
        if (arg0) {
            this.field6152 = false;
        }
        ++field6148;
        return this.field6152;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZII)V")
    public final void method245(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method245(true, -16, 33);
        }
        ++field6145;
        if (this.field6144) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) ((239403 & arg1) >> 16) / 8.0F;
            float var8 = (float) (15 & arg1 >> 19) / 16.0F;
            float var9 = (float) (15 & arg1 >> 23) / 16.0F;
            int var10 = 15 & arg1 >> 27;
            long var11 = this.field6146.field4375;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field3881.field7404 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIZZ)Lpc;")
    public static final class473 method2584(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        ++field6154;
        if (arg0 > -115) {
            field6151 = null;
        }
        class135 var5 = null;
        if (class62.field970 != null) {
            var5 = new class135(arg1, class62.field970, class105.field1539[arg1], 1000000);
        }
        class28.field477[arg1] = class202.field2797.method1585(false, arg1, class27.field458, var5);
        if (arg4) {
            class28.field477[arg1].method2492(20464);
        }
        return new class473(class28.field477[arg1], arg3, arg2);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
    public static void method2585(boolean arg0) {
        if (arg0) {
            field6151 = null;
        }
        field6151 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lnk;II)V")
    public final void method248(class501 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2584(-26, 13, -79, false, false);
        }
        ++field6142;
        if (!this.field6144) {
            super.field3881.method2980(arg0, 120);
            super.field3881.method2976((byte) 67, arg2);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (this.field6144) {
            super.field3881.method3003(1, arg0 + 42);
            super.field3881.method2980((class501) null, arg0 + 110);
            super.field3881.method3003(0, arg0 ^ 2);
            super.field3881.method2980((class501) null, 111);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6144 = false;
        }
        if (arg0 != 6) {
            this.method241(false, -20);
        }
        ++field6150;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lbo;Lri;)V")
    public class452(class511 arg0, class73 arg1) {
        super(arg0);
        this.field6153 = arg1;
        if (this.field6153.field1099 != null && super.field3881.field7440 && super.field3881.field7429) {
            class191 var3 = class258.method1561("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35716, super.field3881, 35633);
            class191 var4 = class258.method1561("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35716, super.field3881, 35632);
            this.field6146 = class47.method335(super.field3881, new class191[] { var3, var4 }, true);
            this.field6152 = this.field6146 != null;
        }
    }
}
