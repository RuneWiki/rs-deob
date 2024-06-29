import jaggl.OpenGL;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class280 extends class398 {

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "Z")
    private boolean field3697 = false;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "Z")
    private boolean field3706 = false;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "Lal;")
    private class170 field3702;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "Lnba;")
    private class566 field3696;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public static int field3704 = 1;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "Lvg;")
    public static class622 field3698 = new class622(82, 1);

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "Liba;")
    public static class211 field3707 = new class211(20, 7);

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
    public static int field3710 = -1;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "Lnb;")
    public static class318 field3708 = new class318("LIVE", 0);

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "Lmv;")
    public static class295 field3711;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "[I")
    public static int[] field3709;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IBI)V", line = 5)
    public final void method86(int arg0, byte arg1, int arg2) {
        if (this.field3697) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << ((arg2 & 58) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) ((arg0 & 227666) >> 16) / 8.0F;
            long var8 = this.field3696.field8262;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field6009.field4020 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1 == 82) {
            ++field3705;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Z", line = 35)
    public final boolean method87(int arg0) {
        if (arg0 != 3) {
            method1656(-87);
        }
        ++field3703;
        return false;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZI)V", line = 46)
    public final void method91(boolean arg0, int arg1) {
        ++field3693;
        class364 var3 = super.field6009.method1698((byte) -29);
        if (this.field3706 && var3 != null) {
            super.field6009.method1745(true, 1);
            super.field6009.method1709((byte) -113, var3);
            super.field6009.method1745(true, 0);
            super.field6009.method1709((byte) -69, this.field3702.field2404);
            long var4 = this.field3696.field8262;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field6009.field4149[0], super.field6009.field4149[1], super.field6009.field4149[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field6009.field4088, super.field6009.field4072, super.field6009.field4061, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field6009.field4149[1]) + 96.0F);
            this.field3697 = true;
        }
        if (arg1 != -5191) {
            this.method91(false, 45);
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V", line = 79)
    public static void method1656(int arg0) {
        field3698 = null;
        field3709 = null;
        int var1 = -71 % ((arg0 - 48) / 43);
        field3707 = null;
        field3711 = null;
        field3708 = null;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V", line = 94)
    public final void method92(int arg0) {
        if (this.field3697) {
            super.field6009.method1745(true, 1);
            super.field6009.method1709((byte) -77, (class517) null);
            super.field6009.method1745(true, 0);
            super.field6009.method1709((byte) -48, (class517) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3697 = false;
        }
        ++field3701;
        if (arg0 != 512) {
            this.field3696 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)V", line = 115)
    public static final void method1657(int arg0) {
        ++field3694;
        if (arg0 != 82) {
            method1656(96);
        }
        if (class348.field5160 == null) {
            Container var1;
            if (class388.field5808 == null) {
                if (class551.field8116 != null) {
                    var1 = class551.field8116;
                } else {
                    var1 = class679.field9602;
                }
            } else {
                var1 = class388.field5808;
            }
            class173.field2443 = var1.getSize().width;
            class300.field4447 = var1.getSize().height;
            if (class388.field5808 == var1) {
                Insets var2 = class388.field5808.getInsets();
                class173.field2443 -= var2.right + var2.left;
                class300.field4447 -= var2.top + var2.bottom;
            }
            if (~class38.method219(-2) == -2) {
                class356.field5273 = 0;
                class454.field6538 = class677.field9591;
                class189.field2573 = (class173.field2443 - class677.field9591) / 2;
                class425.field6218 = class619.field8966;
            } else {
                class487.method2784(arg0 ^ 82);
            }
            if (field3708 != class215.field2882) {
                boolean var10000;
                if (class454.field6538 < 1024 && class425.field6218 < 768) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            class410.field6110.setSize(class454.field6538, class425.field6218);
            if (class332.field4821 != null) {
                class332.field4821.method641(class410.field6110);
            }
            if (class388.field5808 == var1) {
                Insets var3 = class388.field5808.getInsets();
                class410.field6110.setLocation(class189.field2573 + var3.left, class356.field5273 + var3.top);
            } else {
                class410.field6110.setLocation(class189.field2573, class356.field5273);
            }
            if (class567.field8270 != -1) {
                class537.method3101(true, arg0 + 3449);
            }
            class549.method3204(false);
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Luca;Lal;)V", line = 194)
    public class280(class287 arg0, class170 arg1) {
        super(arg0);
        this.field3702 = arg1;
        if (this.field3702.field2404 != null && super.field6009.field4074 && super.field6009.field4099) {
            class129 var3 = class94.method592((byte) -20, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field6009, 35633);
            class129 var4 = class94.method592((byte) 94, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field6009, 35632);
            this.field3696 = class410.method2516(-79, new class129[] { var3, var4 }, super.field6009);
            this.field3706 = this.field3696 != null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILvaa;B)V", line = 215)
    public final void method93(int arg0, class517 arg1, byte arg2) {
        int var4 = -120 % ((76 - arg2) / 41);
        ++field3700;
        if (!this.field3697) {
            super.field6009.method1709((byte) -97, arg1);
            super.field6009.method1751(arg0, 21575);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 231)
    public static final void method1658(String arg0, int arg1) {
        ++field3695;
        if (class451.field6509 != null) {
            ++class234.field3087;
            class654 var2 = class631.method3628(client.field1438, (byte) -51, class357.field5280);
            var2.field9358.method3110(class420.method2543(1, arg0), 87);
            var2.field9358.method3132(arg0, 3);
            int var3 = 97 % ((-12 - arg1) / 56);
            class444.method2623(120, var2);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZ)V", line = 258)
    public final void method94(int arg0, boolean arg1) {
        ++field3699;
        if (arg0 != 0) {
            this.method92(53);
        }
    }
}
