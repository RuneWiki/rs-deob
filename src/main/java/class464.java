import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class464 extends class402 {

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Z")
    private boolean field6495 = false;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Z")
    private boolean field6496 = false;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lod;")
    private class533 field6499;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lpq;")
    private class207 field6503;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lhj;")
    public static class596 field6498 = new class596(89, 6);

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[S")
    public static short[] field6501 = new short[256];

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)Z")
    public final boolean method178(byte arg0) {
        if (arg0 > -55) {
            this.method178((byte) -9);
        }
        ++field6494;
        return false;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IZ)V")
    public final void method176(int arg0, boolean arg1) {
        if (arg0 < -32) {
            ++field6505;
            class331 var3 = super.field5243.method3962(3);
            if (this.field6495 && var3 != null) {
                super.field5243.method3925((byte) -116, 1);
                super.field5243.method3936(false, var3);
                super.field5243.method3925((byte) 34, 0);
                super.field5243.method3936(false, this.field6499.field7507);
                long var4 = this.field6503.field2457;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field5243.field9869[0], -super.field5243.field9869[1], -super.field5243.field9869[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5243.field9781, super.field5243.field9857, super.field5243.field9813, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field5243.field9869[1]) * 928.0F);
                this.field6496 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
    public static void method2789(byte arg0) {
        if (arg0 != -70) {
            field6501 = null;
        }
        field6498 = null;
        field6501 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lpc;Lod;)V")
    public class464(class700 arg0, class533 arg1) {
        super(arg0);
        this.field6499 = arg1;
        if (this.field6499.field7507 != null && super.field5243.field9774 && super.field5243.field9768) {
            class426 var3 = class253.method1506(-1, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field5243);
            class426 var4 = class253.method1506(-1, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field5243);
            this.field6503 = class89.method810(new class426[] { var3, var4 }, super.field5243, (byte) -123);
            this.field6495 = this.field6503 != null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method183(int arg0, int arg1, int arg2) {
        if (arg0 != 64) {
            this.method176(-81, true);
        }
        if (this.field6496) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << ((arg1 & 56) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((234480 & arg2) >> 16) / 8.0F;
            long var8 = this.field6503.field2457;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5243.field9726 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field6502;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBLfha;)V")
    public final void method180(int arg0, byte arg1, class400 arg2) {
        if (arg1 > -103) {
            field6501 = null;
        }
        if (!this.field6496) {
            super.field5243.method3936(false, arg2);
            super.field5243.method3932(arg0, (byte) -73);
        }
        ++field6497;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public final void method181(int arg0) {
        if (arg0 != -1) {
            this.field6503 = null;
        }
        if (this.field6496) {
            super.field5243.method3925((byte) -97, 1);
            super.field5243.method3936(false, (class400) null);
            super.field5243.method3925((byte) 43, 0);
            super.field5243.method3936(false, (class400) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6496 = false;
        }
        ++field6504;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(IZ)V")
    public final void method184(int arg0, boolean arg1) {
        ++field6500;
        if (arg0 != 64) {
            this.method178((byte) -13);
        }
    }
}
