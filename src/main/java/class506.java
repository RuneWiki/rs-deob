import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class506 extends class610 {

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Z")
    private boolean field6915 = false;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "Z")
    private boolean field6916 = false;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "Lh;")
    private class609 field6926;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Lkba;")
    private class91 field6928;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "[I")
    public static int[] field6925 = new int[5];

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "Luc;")
    public static class27 field6919 = new class27(3, -1);

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "Lfc;")
    public static class235 field6929 = new class235(65, 3);

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "[I")
    public static int[] field6930 = new int[6];

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "F")
    public static float field6931;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "[I")
    public static int[] field6923;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZZ)V", line = 5)
    public final void method254(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field6917;
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V", line = 15)
    public static void method2818(int arg0) {
        field6925 = null;
        if (arg0 != 1) {
            method2818(27);
        }
        field6929 = null;
        field6923 = null;
        field6930 = null;
        field6919 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILit;)V", line = 29)
    public final void method255(int arg0, int arg1, class591 arg2) {
        ++field6918;
        if (!this.field6915) {
            super.field8473.method1804(false, arg2);
            super.field8473.method1801(arg1, arg0 ^ 33910);
        }
        if (arg0 != 256) {
            method2820((byte) 80);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)I", line = 45)
    public static final int method2819(int arg0, int arg1, int arg2, int arg3) {
        ++field6927;
        int var4 = arg0 & 3;
        if (var4 == 0) {
            return arg2;
        } else {
            int var5 = -57 % ((-65 - arg1) / 61);
            if (~var4 == -2) {
                return arg3;
            } else {
                return var4 == 2 ? -arg2 + 4095 : -arg3 + 4095;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 70)
    public final void method252(int arg0) {
        if (arg0 != 31130) {
            this.method257(true, 33);
        }
        if (this.field6915) {
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1804(false, (class591) null);
            super.field8473.method1747(0, (byte) 108);
            super.field8473.method1804(false, (class591) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6915 = false;
        }
        ++field6920;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V", line = 90)
    public final void method257(boolean arg0, int arg1) {
        ++field6921;
        class389 var3 = super.field8473.method1746(0);
        if (arg1 >= -19) {
            this.method255(125, -108, (class591) null);
        }
        if (this.field6916 && var3 != null) {
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1804(false, var3);
            super.field8473.method1747(0, (byte) 108);
            super.field8473.method1804(false, this.field6926.field8464);
            long var4 = this.field6928.field1204;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field8473.field4360[0], -super.field8473.field4360[1], -super.field8473.field4360[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field8473.field4323, super.field8473.field4265, super.field8473.field4275, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field8473.field4360[1]) * 928.0F + 96.0F);
            this.field6915 = true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Len;Lh;)V", line = 126)
    public class506(class289 arg0, class609 arg1) {
        super(arg0);
        this.field6926 = arg1;
        if (this.field6926.field8464 != null && super.field8473.field4331 && super.field8473.field4301) {
            class10 var3 = class387.method2233(35633, 43, super.field8473, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class10 var4 = class387.method2233(35632, 99, super.field8473, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field6928 = class404.method2311(46, new class10[] { var3, var4 }, super.field8473);
            this.field6916 = this.field6928 != null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)V", line = 150)
    public final void method258(int arg0, int arg1, byte arg2) {
        if (this.field6915) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((arg0 & 240578) >> 16) / 8.0F;
            long var8 = this.field6928.field1204;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field8473.field4221 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg2 != 70) {
            this.method257(false, 54);
        }
        ++field6924;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 184)
    public static final void method2820(byte arg0) {
        class328 var1 = class44.field661;
        synchronized (class44.field661) {
            class44.field661.method1997(1);
        }
        ++field6922;
        class328 var2 = class533.field7259;
        synchronized (class533.field7259) {
            class533.field7259.method1997(1);
            if (arg0 != 70) {
                field6919 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Z", line = 201)
    public final boolean method262(int arg0) {
        ++field6914;
        return arg0 != -1 ? false : false;
    }
}
