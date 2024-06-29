import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class114 extends class249 {

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Z")
    private boolean field1577 = false;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "Z")
    private boolean field1588 = false;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "Ljga;")
    private class718 field1590;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Lrv;")
    private class111 field1585;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Z")
    public static boolean field1578 = false;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "F")
    public static float field1579 = 0.25F;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)Z")
    public final boolean method605(int arg0) {
        if (arg0 != 2) {
            return true;
        } else {
            ++field1584;
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
    public final void method607(int arg0, int arg1, int arg2) {
        ++field1580;
        if (this.field1588) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((arg0 & 63) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            long var8 = this.field1585.field1549;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field3613.field2167 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1 != -13582) {
            field1578 = false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lwh;Ljga;)V")
    public class114(class148 arg0, class718 arg1) {
        super(arg0);
        this.field1590 = arg1;
        if (this.field1590.field10093 != null && super.field3613.field2249 && super.field3613.field2273) {
            class396 var3 = class758.method4225(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field3613, (byte) 111);
            class396 var4 = class758.method4225(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field3613, (byte) 97);
            this.field1585 = class734.method4132(new class396[] { var3, var4 }, super.field3613, 14964);
            this.field1577 = this.field1585 != null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZZ)V")
    public final void method608(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field1591;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)V")
    public final void method610(int arg0, boolean arg1) {
        if (arg0 == 1) {
            ++field1581;
            class24 var3 = super.field3613.method1071(arg0 + -4);
            if (this.field1577 && var3 != null) {
                super.field3613.method1024(1, (byte) -11);
                super.field3613.method1088(var3, arg0 ^ -27750);
                super.field3613.method1024(0, (byte) -11);
                super.field3613.method1088(this.field1590.field10093, -27749);
                long var4 = this.field1585.field1549;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field3613.field2269[0], -super.field3613.field2269[1], -super.field3613.field2269[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3613.field2277, super.field3613.field2279, super.field3613.field2253, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field3613.field2269[1]));
                this.field1588 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V")
    public static final void method843(int arg0) {
        ++field1586;
        int var1 = -42 / ((arg0 - -3) / 56);
        if (class201.field3012 != null) {
            class201.field3012.method447((byte) -9);
            class145.field1937 = null;
            class201.field3012 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lme;ZI)V")
    public final void method603(class195 arg0, boolean arg1, int arg2) {
        ++field1587;
        if (!this.field1588) {
            super.field3613.method1088(arg0, -27749);
            super.field3613.method1066(arg2, 260);
        }
        if (!arg1) {
            this.method611(-60);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ldv;IIBI)V")
    public static final void method844(class661 arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field1583;
        if (arg3 < 83) {
            method845((byte) -51);
        }
        long var5 = (long) (arg2 << 28 | arg1 << 14 | arg4);
        class258 var7 = (class258) class12.field173.method2287(var5, (byte) -117);
        if (var7 == null) {
            class258 var8 = new class258();
            class12.field173.method2278((byte) -102, var5, var8);
            var8.field3693.method1203(arg0, (byte) 78);
        } else {
            class578 var9 = class336.field4876.method2079(arg0.field9243, (byte) -70);
            int var10 = var9.field8159;
            if (~var9.field8158 == -2) {
                var10 = (arg0.field9240 + 1) * var10;
            }
            for (class661 var11 = (class661) var7.field3693.method1195(0); var11 != null; var11 = (class661) var7.field3693.method1201(2)) {
                class578 var12 = class336.field4876.method2079(var11.field9243, (byte) 102);
                int var13 = var12.field8159;
                if (~var12.field8158 == -2) {
                    var13 = (var11.field9240 + 1) * var13;
                }
                if (var10 > var13) {
                    class314.method1989((byte) 100, var11, arg0);
                    return;
                }
            }
            var7.field3693.method1203(arg0, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static final void method845(byte arg0) {
        ++field1582;
        for (int var1 = 0; var1 < 100; ++var1) {
            class590.field8371[var1] = null;
        }
        class78.field1084 = 0;
        int var2 = 20 / ((-6 - arg0) / 63);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
    public final void method611(int arg0) {
        ++field1589;
        if (arg0 != 2) {
            this.field1577 = false;
        }
        if (this.field1588) {
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1088((class195) null, -27749);
            super.field3613.method1024(0, (byte) -11);
            super.field3613.method1088((class195) null, -27749);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1588 = false;
        }
    }
}
