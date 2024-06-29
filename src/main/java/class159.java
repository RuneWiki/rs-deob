import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class159 extends class702 {

    @OriginalMember(owner = "client!dca", name = "t", descriptor = "Z")
    private boolean field1941 = false;

    @OriginalMember(owner = "client!dca", name = "v", descriptor = "Z")
    private boolean field1943 = false;

    @OriginalMember(owner = "client!dca", name = "r", descriptor = "Lwca;")
    private class628 field1939;

    @OriginalMember(owner = "client!dca", name = "w", descriptor = "Lfr;")
    private class378 field1944;

    @OriginalMember(owner = "client!dca", name = "m", descriptor = "[Lbi;")
    public static class446[] field1934 = new class446[128];

    @OriginalMember(owner = "client!dca", name = "u", descriptor = "[Lwi;")
    public static class432[] field1942 = new class432[6];

    @OriginalMember(owner = "client!dca", name = "o", descriptor = "Lwo;")
    public static class690 field1936 = new class690(17, 3);

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!dca", name = "l", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!dca", name = "n", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!dca", name = "p", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!dca", name = "q", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!dca", name = "s", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(Z)Z", line = 4)
    public final boolean method998(boolean arg0) {
        if (arg0) {
            method999(-29, (byte) -106);
        }
        ++field1931;
        return false;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IB)I", line = 22)
    public static final int method999(int arg0, byte arg1) {
        if (arg1 < 88) {
            field1942 = null;
        }
        ++field1933;
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZZ)V", line = 33)
    public final void method1000(boolean arg0, boolean arg1) {
        ++field1935;
        if (!arg0) {
            method1003(-44);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(III)V", line = 45)
    public final void method1001(int arg0, int arg1, int arg2) {
        if (this.field1941) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((arg0 & 60) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((213870 & arg2) >> 16) / 8.0F;
            long var8 = this.field1944.field5078;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field9912.field7264 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        int var10 = -119 % ((55 - arg1) / 36);
        ++field1937;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Z)V", line = 73)
    public final void method1002(boolean arg0) {
        if (!arg0) {
            field1934 = null;
        }
        if (this.field1941) {
            super.field9912.method2975(1, 79);
            super.field9912.method2932(true, (class197) null);
            super.field9912.method2975(0, 92);
            super.field9912.method2932(arg0, (class197) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1941 = false;
        }
        ++field1940;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)V", line = 96)
    public static void method1003(int arg0) {
        field1942 = null;
        field1936 = null;
        if (arg0 != 0) {
            method999(-83, (byte) 111);
        }
        field1934 = null;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljf;II)V", line = 109)
    public final void method1004(class197 arg0, int arg1, int arg2) {
        ++field1932;
        if (arg2 != 58) {
            field1938 = -39;
        }
        if (!this.field1941) {
            super.field9912.method2932(true, arg0);
            super.field9912.method2985(arg1, -26973);
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lkga;Lwca;)V", line = 133)
    public class159(class506 arg0, class628 arg1) {
        super(arg0);
        this.field1939 = arg1;
        if (this.field1939.field9006 != null && super.field9912.field7386 && super.field9912.field7370) {
            class97 var3 = class161.method1021(super.field9912, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, -114);
            class97 var4 = class161.method1021(super.field9912, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, -93);
            this.field1944 = class339.method1957(new class97[] { var3, var4 }, super.field9912, (byte) -114);
            this.field1943 = this.field1944 != null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZI)V", line = 161)
    public final void method1005(boolean arg0, int arg1) {
        ++field1930;
        class187 var3 = super.field9912.method2930(106);
        if (this.field1943 && var3 != null) {
            super.field9912.method2975(1, 106);
            super.field9912.method2932(true, var3);
            super.field9912.method2975(0, 109);
            super.field9912.method2932(true, this.field1939.field9006);
            long var4 = this.field1944.field5078;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field9912.field7324[0], super.field9912.field7324[1], super.field9912.field7324[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field9912.field7330, super.field9912.field7376, super.field9912.field7307, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field9912.field7324[1]));
            this.field1941 = true;
        }
        if (arg1 > -102) {
            this.field1943 = false;
        }
    }
}
