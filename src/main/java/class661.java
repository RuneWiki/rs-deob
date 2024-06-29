import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class661 extends class165 {

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "Z")
    private boolean field9325 = false;

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "Z")
    private boolean field9332 = false;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "Lfa;")
    private class565 field9322;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "Lwaa;")
    private class622 field9324;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "[I")
    public static int[] field9319 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "[S")
    private static short[] field9323 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "[S")
    private static short[] field9316 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "[S")
    private static short[] field9321 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "[[S")
    public static short[][] field9317 = new short[][] { field9323, field9321, field9316 };

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!dw", name = "t", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!dw", name = "u", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!dw", name = "v", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IBI)V", line = 3)
    public final void method675(int arg0, byte arg1, int arg2) {
        if (arg1 >= 3) {
            ++field9331;
            if (this.field9332) {
                int var4 = 1 << (3 & arg0);
                float var5 = (float) (1 << ((59 & arg0) >> 3)) / 32.0F;
                int var6 = arg2 & 65535;
                float var7 = (float) (3 & arg2 >> 16) / 8.0F;
                long var8 = this.field9324.field8850;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2260.field4947 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lep;Lfa;)V", line = 33)
    public class661(class371 arg0, class565 arg1) {
        super(arg0);
        this.field9322 = arg1;
        if (this.field9322.field8030 != null && super.field2260.field5093 && super.field2260.field5005) {
            class510 var3 = class689.method3927("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field2260, (byte) -80, 35633);
            class510 var4 = class689.method3927("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field2260, (byte) -80, 35632);
            this.field9324 = class163.method1016(super.field2260, new class510[] { var3, var4 }, -12748);
            this.field9325 = this.field9324 != null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)V", line = 52)
    public static void method3800(byte arg0) {
        field9323 = null;
        if (arg0 == 110) {
            field9319 = null;
            field9321 = null;
            field9317 = null;
            field9316 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lvj;I)Lvc;", line = 76)
    public static final class597 method3801(class26 arg0, int arg1) {
        ++field9315;
        class679 var2 = class664.method3813(arg0, -19264);
        int var3 = arg0.method189(255);
        if (arg1 != 4626) {
            return null;
        } else {
            int var4 = arg0.method189(arg1 + -4371);
            return new class597(var2.field9569, var2.field9563, var2.field9562, var2.field9570, var2.field9575, var2.field9561, var2.field9568, var2.field9572, var2.field9571, var3, var4);
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V", line = 95)
    public final void method679(byte arg0) {
        ++field9327;
        if (arg0 < -97) {
            if (this.field9332) {
                super.field2260.method2196(1, (byte) 89);
                super.field2260.method2154((class396) null, -2);
                super.field2260.method2196(0, (byte) 89);
                super.field2260.method2154((class396) null, -2);
                OpenGL.glUseProgramObjectARB(0L);
                this.field9332 = false;
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZ)V", line = 116)
    public final void method673(int arg0, boolean arg1) {
        ++field9328;
        class633 var3 = super.field2260.method2102(true);
        if (arg0 < -115) {
            if (this.field9325 && var3 != null) {
                super.field2260.method2196(1, (byte) 89);
                super.field2260.method2154(var3, -2);
                super.field2260.method2196(0, (byte) 89);
                super.field2260.method2154(this.field9322.field8030, -2);
                long var4 = this.field9324.field8850;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field2260.field5022[0], -super.field2260.field5022[1], -super.field2260.field5022[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field2260.field5015, super.field2260.field5024, super.field2260.field5035, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field2260.field5022[1]));
                this.field9332 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Z", line = 148)
    public final boolean method672(byte arg0) {
        ++field9320;
        if (arg0 <= 11) {
            field9316 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZLhl;)V", line = 162)
    public final void method671(int arg0, boolean arg1, class396 arg2) {
        if (!arg1) {
            method3800((byte) 101);
        }
        ++field9330;
        if (!this.field9332) {
            super.field2260.method2154(arg2, -2);
            super.field2260.method2208(arg0, 6406);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI)V", line = 191)
    public final void method678(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.field9332 = false;
        }
        ++field9326;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)J", line = 204)
    public static final long method3802(int arg0) {
        if (arg0 != 4540) {
            field9323 = null;
        }
        ++field9329;
        return class465.field6357.method755(30706);
    }
}
