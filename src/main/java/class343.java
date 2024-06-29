import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class343 extends class648 {

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "Z")
    private boolean field4622 = false;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "Z")
    private boolean field4616 = false;

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "Lde;")
    private class454 field4612;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "Liu;")
    private class496 field4617;

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "Z")
    public static boolean field4626 = false;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "Lh;")
    public static class571 field4620 = new class571(4);

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "Lnj;")
    public static class204 field4627 = new class204(5000);

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field4615;

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "(I)[Loca;")
    public static final class221[] method2078(int arg0) {
        ++field4624;
        return arg0 != -1891794109 ? null : new class221[] { class103.field1567, class648.field9396, class171.field2476, class379.field5102, class548.field7579, class385.field5158, class167.field2408, class473.field6660, class133.field2120, class144.field2224, class399.field5689, class512.field7196, class645.field9366, class239.field3331 };
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BLmw;I)V")
    public final void method942(byte arg0, class418 arg1, int arg2) {
        if (!this.field4616) {
            super.field9395.method3358(arg0 + 32916, arg1);
            super.field9395.method3396((byte) 125, arg2);
        }
        ++field4623;
        if (arg0 != -30) {
            this.field4617 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)Z")
    public final boolean method946(int arg0) {
        if (arg0 < 122) {
            field4626 = false;
        }
        ++field4613;
        return false;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IZ)V")
    public final void method947(int arg0, boolean arg1) {
        ++field4614;
        class403 var3 = super.field9395.method3409(0);
        if (this.field4622 && var3 != null) {
            super.field9395.method3398(-44, 1);
            super.field9395.method3358(32886, var3);
            super.field9395.method3398(-32, 0);
            super.field9395.method3358(arg0 + 15157, this.field4612.field6409);
            long var4 = this.field4617.field6934;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field9395.field8329[0], -super.field9395.field8329[1], -super.field9395.field8329[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field9395.field8309, super.field9395.field8340, super.field9395.field8274, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field9395.field8329[1]) * 928.0F + 96.0F);
            this.field4616 = true;
        }
        if (arg0 != 17729) {
            this.field4617 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V")
    public static void method2079(byte arg0) {
        if (arg0 > -24) {
            method2079((byte) -125);
        }
        field4627 = null;
        field4620 = null;
        field4615 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V")
    public final void method945(int arg0, int arg1, int arg2) {
        if (this.field4616) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << ((56 & arg1) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) ((arg0 & 218476) >> 16) / 8.0F;
            long var8 = this.field4617.field6934;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field9395.field8202 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        int var10 = 25 / ((arg2 - 30) / 56);
        ++field4619;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
    public final void method941(int arg0) {
        if (this.field4616) {
            super.field9395.method3398(-102, 1);
            super.field9395.method3358(32886, (class418) null);
            super.field9395.method3398(arg0 + -114, 0);
            super.field9395.method3358(32886, (class418) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4616 = false;
        }
        ++field4625;
        if (arg0 != 1) {
            this.field4616 = true;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BZ)V")
    public final void method944(byte arg0, boolean arg1) {
        if (arg0 <= -111) {
            ++field4618;
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lgi;Lde;)V")
    public class343(class583 arg0, class454 arg1) {
        super(arg0);
        this.field4612 = arg1;
        if (this.field4612.field6409 != null && super.field9395.field8280 && super.field9395.field8297) {
            class40 var3 = client.method1550(35633, false, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field9395);
            class40 var4 = client.method1550(35632, false, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field9395);
            this.field4617 = class209.method1377(new class40[] { var3, var4 }, super.field9395, 26013);
            this.field4622 = this.field4617 != null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(III)I")
    public static final int method2080(int arg0, int arg1, int arg2) {
        ++field4621;
        if (~arg0 == 0) {
            return 12345678;
        } else {
            int var3 = (arg0 & 127) * arg2 >> 7;
            if (var3 >= 2) {
                if (var3 > 126) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            if (arg1 != 35632) {
                method2080(92, 114, 65);
            }
            return (65408 & arg0) + var3;
        }
    }
}
