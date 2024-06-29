import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class516 extends class16 {

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Z")
    private boolean field7376 = false;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Z")
    private boolean field7384 = false;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lum;")
    private class479 field7380;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Llj;")
    private class555 field7382;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lpr;")
    public static class407 field7378 = new class407(83, 12);

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lqv;")
    public static class406 field7386 = new class406(2, 1);

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Lpr;")
    public static class407 field7388 = new class407(31, 3);

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Ljo;")
    public static class303 field7385;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V", line = 5)
    public static void method2947(byte arg0) {
        field7378 = null;
        field7386 = null;
        int var1 = 88 / ((arg0 - 69) / 56);
        field7385 = null;
        field7388 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BZ)V", line = 17)
    public final void method46(byte arg0, boolean arg1) {
        ++field7389;
        if (arg0 != -61) {
            this.field7384 = true;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 27)
    public final void method48(byte arg0) {
        if (this.field7376) {
            super.field141.method2380(1, (byte) -79);
            super.field141.method2388((byte) -125, (class412) null);
            super.field141.method2380(0, (byte) -84);
            super.field141.method2388((byte) 92, (class412) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field7376 = false;
        }
        ++field7383;
        int var2 = -11 % ((-29 - arg0) / 51);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lap;Lum;)V", line = 115)
    public class516(class435 arg0, class479 arg1) {
        super(arg0);
        this.field7380 = arg1;
        if (this.field7380.field7035 != null && super.field141.field6021 && super.field141.field5955) {
            class58 var3 = class182.method1062("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, (byte) -16, super.field141);
            class58 var4 = class182.method1062("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, (byte) -16, super.field141);
            this.field7382 = class596.method3341(61, new class58[] { var3, var4 }, super.field141);
            this.field7384 = this.field7382 != null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Z", line = 54)
    public final boolean method52(int arg0) {
        if (arg0 != 12733) {
            return false;
        } else {
            ++field7377;
            return false;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZB)V", line = 68)
    public final void method50(boolean arg0, byte arg1) {
        if (arg1 != 42) {
            method2947((byte) 41);
        }
        ++field7381;
        class310 var3 = super.field141.method2394(-98);
        if (this.field7384 && var3 != null) {
            super.field141.method2380(1, (byte) -78);
            super.field141.method2388((byte) 88, var3);
            super.field141.method2380(0, (byte) -93);
            super.field141.method2388((byte) 87, this.field7380.field7035);
            long var4 = this.field7382.field7904;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field141.field6020[0], -super.field141.field6020[1], -super.field141.field6020[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field141.field6031, super.field141.field6004, super.field141.field5989, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field141.field6020[1]) * 928.0F + 96.0F);
            this.field7376 = true;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILuda;)V", line = 98)
    public final void method44(int arg0, int arg1, class412 arg2) {
        if (!this.field7376) {
            super.field141.method2388((byte) -22, arg2);
            super.field141.method2396(arg0, arg1);
        }
        if (arg1 != -1) {
            this.method44(6, 32, (class412) null);
        }
        ++field7379;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZ)V", line = 139)
    public final void method42(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method50(true, (byte) -68);
        }
        ++field7387;
        if (this.field7376) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((arg0 & 58) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) ((231531 & arg1) >> 16) / 8.0F;
            long var8 = this.field7382.field7904;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field141.field5926 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }
}
