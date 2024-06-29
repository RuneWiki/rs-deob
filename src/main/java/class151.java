import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class151 extends class489 {

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Z")
    private boolean field1826 = false;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Z")
    private boolean field1832 = false;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Lfaa;")
    private class452 field1831;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "Lua;")
    private class636 field1833;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field1828 = 0;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "F")
    public static float field1834;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public final void method6(int arg0) {
        if (this.field1832) {
            super.field6956.method2135(1, arg0 + -5027);
            super.field6956.method2120(-1, (class411) null);
            super.field6956.method2135(0, arg0 + -5027);
            super.field6956.method2120(-1, (class411) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1832 = false;
        }
        ++field1837;
        if (arg0 != 0) {
            this.method7((byte) -77);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
    public final void method8(int arg0, int arg1, int arg2) {
        ++field1829;
        if (arg2 == 40) {
            if (this.field1832) {
                int var4 = 1 << (arg1 & 3);
                float var5 = (float) (1 << ((arg1 & 58) >> 3)) / 32.0F;
                int var6 = arg0 & 65535;
                float var7 = (float) ((241460 & arg0) >> 16) / 8.0F;
                long var8 = this.field1833.field8807;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field6956.field4961 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLkp;I)V")
    public final void method12(byte arg0, class411 arg1, int arg2) {
        if (!this.field1832) {
            super.field6956.method2120(-1, arg1);
            super.field6956.method2153(-55, arg2);
        }
        ++field1830;
        if (arg0 > -66) {
            this.method8(67, 105, -117);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IZ)V")
    public final void method9(int arg0, boolean arg1) {
        ++field1838;
        if (arg0 != -5) {
            this.method7((byte) 56);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)Z")
    public final boolean method7(byte arg0) {
        if (arg0 <= 95) {
            return true;
        } else {
            ++field1835;
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Leq;Lfaa;)V")
    public class151(class357 arg0, class452 arg1) {
        super(arg0);
        this.field1831 = arg1;
        if (this.field1831.field6339 != null && super.field6956.field5085 && super.field6956.field5065) {
            class692 var3 = class77.method560(super.field6956, (byte) 110, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class692 var4 = class77.method560(super.field6956, (byte) 127, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field1833 = class615.method3375(new class692[] { var3, var4 }, (byte) 64, super.field6956);
            this.field1826 = this.field1833 != null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)V")
    public final void method10(int arg0, boolean arg1) {
        ++field1827;
        int var3 = 37 % ((arg0 - -43) / 37);
        class45 var4 = super.field6956.method2168(-109);
        if (this.field1826 && var4 != null) {
            super.field6956.method2135(1, -5027);
            super.field6956.method2120(-1, var4);
            super.field6956.method2135(0, -5027);
            super.field6956.method2120(-1, this.field1831.field6339);
            long var5 = this.field1833.field8807;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field6956.field5031[0], -super.field6956.field5031[1], -super.field6956.field5031[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field6956.field5102, super.field6956.field5019, super.field6956.field5018, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field6956.field5031[1]));
            this.field1832 = true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method941(int arg0, String arg1) {
        System.exit(1);
        if (arg0 == 0) {
            ++field1836;
        }
    }
}
