import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class575 extends class118 {

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "Z")
    private boolean field8492 = false;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "Z")
    private boolean field8496 = false;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lkm;")
    private class120 field8490;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Ldca;")
    private class501 field8487;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lqp;")
    public static class586 field8486 = new class586(44, 0);

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZB)V", line = 3)
    public final void method442(boolean arg0, byte arg1) {
        if (arg1 >= -101) {
            this.method440((class541) null, -105, (byte) 22);
        }
        ++field8491;
        class227 var3 = super.field1544.method2819((byte) -12);
        if (this.field8492 && var3 != null) {
            float var4 = 1.0F + (-Math.abs(super.field1544.field7036[1]) + 1.0F) * 2.0F;
            super.field1544.method2842(1, (byte) 42);
            super.field1544.method2811(var3, -2);
            super.field1544.method2842(0, (byte) 42);
            super.field1544.method2811(this.field8490.field1553, -2);
            long var5 = this.field8487.field7498;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field1544.field7036[0], -super.field1544.field7036[1], -super.field1544.field7036[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field1544.field7063 * var4, super.field1544.field7001 * var4, super.field1544.field7069 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field1544.field7036[1]));
            this.field8496 = true;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)V", line = 35)
    public static void method3369(byte arg0) {
        int var1 = -10 % ((arg0 - -31) / 58);
        field8486 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BZ)V", line = 48)
    public final void method439(byte arg0, boolean arg1) {
        if (arg0 == 56) {
            ++field8489;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 58)
    public final void method441(int arg0) {
        ++field8495;
        int var2 = 89 / ((-58 - arg0) / 41);
        if (this.field8496) {
            super.field1544.method2842(1, (byte) 42);
            super.field1544.method2811((class541) null, -2);
            super.field1544.method2842(0, (byte) 42);
            super.field1544.method2811((class541) null, -2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8496 = false;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lbaa;IB)V", line = 83)
    public final void method440(class541 arg0, int arg1, byte arg2) {
        ++field8488;
        if (arg2 <= -17) {
            if (!this.field8496) {
                super.field1544.method2811(arg0, -2);
                super.field1544.method2791(arg1, (byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Los;Lkm;)V", line = 99)
    public class575(class468 arg0, class120 arg1) {
        super(arg0);
        this.field8490 = arg1;
        if (this.field8490.field1553 != null && super.field1544.field7091 && super.field1544.field7077) {
            class346 var3 = class331.method2082("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field1544, 0, 35633);
            class346 var4 = class331.method2082("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field1544, 0, 35632);
            this.field8487 = class169.method1072(1951, new class346[] { var3, var4 }, super.field1544);
            this.field8492 = this.field8487 != null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Z", line = 121)
    public final boolean method446(byte arg0) {
        if (arg0 != 29) {
            this.field8490 = null;
        }
        ++field8494;
        return this.field8492;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBI)V", line = 140)
    public final void method445(int arg0, byte arg1, int arg2) {
        ++field8493;
        if (this.field8496) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((200419 & arg2) >> 16) / 8.0F;
            float var8 = (float) ((arg2 & 7873039) >> 19) / 16.0F;
            float var9 = (float) ((arg2 & 133370868) >> 23) / 16.0F;
            int var10 = arg2 >> 27 & 15;
            long var11 = this.field8487.field7498;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field1544.field6961 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg1 != 23) {
            method3369((byte) -36);
        }
    }
}
