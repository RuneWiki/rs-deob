import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class270 extends class497 {

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Z")
    private boolean field3975 = false;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Z")
    private boolean field3974 = false;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Lmha;")
    private class438 field3972;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Loca;")
    private class277 field3973;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Ljw;")
    public static class581 field3985 = new class581(38, -2);

    @OriginalMember(owner = "client!se", name = "o", descriptor = "F")
    public static float field3979;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Lvl;")
    public static class15 field3980;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V", line = 3)
    public final void method161(int arg0) {
        ++field3983;
        if (arg0 != -1756) {
            this.field3975 = false;
        }
        if (this.field3975) {
            super.field6867.method1637(33984, 1);
            super.field6867.method1653((byte) 122, (class7) null);
            super.field6867.method1637(33984, 0);
            super.field6867.method1653((byte) 86, (class7) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3975 = false;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)Z", line = 24)
    public static final boolean method1755(int arg0, int arg1, int arg2) {
        ++field3987;
        if (arg2 != 16385) {
            method1755(-38, -121, 97);
        }
        return ((arg0 & 8192) != 0 | class481.method2801(arg0, -545, arg1) | class515.method2992(arg2 + -4569, arg0, arg1)) & class135.method1061((byte) 126, arg0, arg1);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V", line = 35)
    public final void method164(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method1755(-31, -128, 99);
        }
        ++field3976;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 45)
    public static final void method1756(boolean arg0, String arg1) {
        ++field3971;
        class251.field3720 = arg1;
        if (class735.field10183 != null) {
            if (arg0) {
                field3979 = -0.0134588815F;
            }
            try {
                String var2 = class735.field10183.getParameter("cookieprefix");
                String var3 = class735.field10183.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg1.length() != 0) {
                    var5 = var4 + "; Expires=" + class386.method2449(94608000000L + class302.method1910(0), 88) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                class623.method3412("document.cookie=\"" + var5 + "\"", class735.field10183, -25118);
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILil;I)V", line = 80)
    public final void method158(int arg0, class7 arg1, int arg2) {
        if (arg0 != 9) {
            this.field3973 = null;
        }
        if (!this.field3975) {
            super.field6867.method1653((byte) 78, arg1);
            super.field6867.method1589(-4, arg2);
        }
        ++field3978;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Z", line = 97)
    public final boolean method157(int arg0) {
        ++field3984;
        return arg0 != -6808 ? false : false;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V", line = 116)
    public final void method162(int arg0, int arg1, int arg2) {
        if (arg0 > 122) {
            ++field3981;
            if (this.field3975) {
                int var4 = 1 << (3 & arg1);
                float var5 = (float) (1 << ((arg1 & 63) >> 3)) / 32.0F;
                int var6 = 65535 & arg2;
                float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
                long var8 = this.field3973.field4108;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field6867.field3532 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ldia;Lmha;)V", line = 165)
    public class270(class246 arg0, class438 arg1) {
        super(arg0);
        this.field3972 = arg1;
        if (this.field3972.field6171 != null && super.field6867.field3599 && super.field6867.field3635) {
            class298 var3 = class293.method1856(35633, super.field6867, -121, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class298 var4 = class293.method1856(35632, super.field6867, -127, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field3973 = class148.method1116(10782, new class298[] { var3, var4 }, super.field6867);
            this.field3974 = this.field3973 != null;
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V", line = 153)
    public static void method1757(int arg0) {
        field3985 = null;
        field3980 = null;
        if (arg0 != 30929) {
            method1757(92);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([SBI)[S", line = 193)
    public static final short[] method1758(short[] arg0, byte arg1, int arg2) {
        ++field3977;
        if (arg1 > -94) {
            return null;
        } else {
            short[] var3 = new short[arg2];
            class278.method1800(arg0, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(ZZ)V", line = 209)
    public final void method163(boolean arg0, boolean arg1) {
        ++field3982;
        class196 var3 = super.field6867.method1618(1);
        if (this.field3974 && var3 != null) {
            super.field6867.method1637(33984, 1);
            super.field6867.method1653((byte) 99, var3);
            super.field6867.method1637(33984, 0);
            super.field6867.method1653((byte) 89, this.field3972.field6171);
            long var4 = this.field3973.field4108;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field6867.field3611[0], -super.field6867.field3611[1], -super.field6867.field3611[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field6867.field3626, super.field6867.field3643, super.field6867.field3570, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field6867.field3611[1]));
            this.field3975 = true;
        }
        if (arg1) {
            this.method164(77, false);
        }
    }
}
