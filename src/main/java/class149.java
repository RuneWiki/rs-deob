import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class149 extends class83 {

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Z")
    private boolean field1645 = false;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Z")
    private boolean field1648 = false;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Lud;")
    private class123 field1646;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Ldi;")
    private class243 field1652;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "F")
    public static float field1650;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILav;)V", line = 4)
    public final void method441(int arg0, int arg1, class325 arg2) {
        if (arg0 != -29092) {
            this.field1645 = true;
        }
        ++field1642;
        if (!this.field1648) {
            super.field855.method2396((byte) 36, arg2);
            super.field855.method2421(arg1, arg0 ^ -29091);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lvj;Lud;)V", line = 22)
    public class149(class422 arg0, class123 arg1) {
        super(arg0);
        this.field1646 = arg1;
        if (this.field1646.field1370 != null && super.field855.field5959 && super.field855.field5879) {
            class424 var3 = class6.method45(35633, true, super.field855, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class424 var4 = class6.method45(35632, true, super.field855, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field1652 = class306.method1762(new class424[] { var3, var4 }, (byte) -101, super.field855);
            this.field1645 = this.field1652 != null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BZ)V", line = 42)
    public final void method433(byte arg0, boolean arg1) {
        ++field1643;
        class140 var3 = super.field855.method2367(arg0 + 49);
        if (arg0 != -48) {
            this.field1652 = null;
        }
        if (this.field1645 && var3 != null) {
            super.field855.method2431((byte) -27, 1);
            super.field855.method2396((byte) 36, var3);
            super.field855.method2431((byte) -98, 0);
            super.field855.method2396((byte) 36, this.field1646.field1370);
            long var4 = this.field1652.field3000;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field855.field5899[0], super.field855.field5899[1], super.field855.field5899[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field855.field5947, super.field855.field5890, super.field855.field5881, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field855.field5899[1]) * 928.0F);
            this.field1648 = true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 72)
    public final void method438(int arg0) {
        if (arg0 != 18610) {
            this.field1652 = null;
        }
        if (this.field1648) {
            super.field855.method2431((byte) -32, 1);
            super.field855.method2396((byte) 36, (class325) null);
            super.field855.method2431((byte) -35, 0);
            super.field855.method2396((byte) 36, (class325) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1648 = false;
        }
        ++field1651;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V", line = 94)
    public final void method439(boolean arg0, int arg1) {
        ++field1649;
        if (arg1 >= -123) {
            this.method440((byte) 19);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIZILpi;)Ljava/awt/Frame;", line = 104)
    public static final Frame method815(int arg0, int arg1, int arg2, boolean arg3, int arg4, class464 arg5) {
        ++field1653;
        if (!arg5.method2671(0)) {
            return null;
        } else {
            if (~arg1 == -1) {
                class7[] var6 = class341.method1970(arg5, (byte) 97);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var6.length > var8; ++var8) {
                    if (var6[var8].field82 == arg2 && ~var6[var8].field80 == ~arg0 && (arg4 == 0 || ~var6[var8].field77 == ~arg4) && (!var7 || var6[var8].field78 > arg1)) {
                        var7 = true;
                        arg1 = var6[var8].field78;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class88 var9 = arg5.method2683(arg0, arg2, arg1, arg4, (byte) 122);
            while (~var9.field884 == -1) {
                class452.method2602(10L, (byte) -97);
            }
            if (!arg3) {
                field1650 = 0.31422028F;
            }
            Frame var10 = (Frame) var9.field886;
            if (var10 == null) {
                return null;
            } else if (var9.field884 == 2) {
                class146.method803((byte) -94, arg5, var10);
                return null;
            } else {
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIJ)V", line = 176)
    public static final void method816(int arg0, int arg1, int arg2, long arg3) {
        ++field1644;
        int var5 = (508706 & (int) arg3) >> 14;
        int var6 = ((int) arg3 & 3312042) >> 20;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (~var5 != -11 && ~var5 != -12 && var5 != 22) {
            class285.method1662(0, var6, var5, 0, 0, (byte) 111, arg0, true, arg2);
        } else {
            class638 var8 = class364.field4891.method2134(var7, true);
            int var9;
            int var10;
            if (var6 != 0 && var6 != 2) {
                var9 = var8.field9060;
                var10 = var8.field9051;
            } else {
                var9 = var8.field9051;
                var10 = var8.field9060;
            }
            int var11 = var8.field9008;
            if (var6 != 0) {
                var11 = (var11 >> -var6 + 4) + (var11 << var6 & 15);
            }
            class285.method1662(var11, 0, 0, var10, var9, (byte) 126, arg0, true, arg2);
        }
        if (arg1 != -30373) {
            method816(-20, -37, 14, -74L);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V", line = 220)
    public final void method435(int arg0, int arg1, int arg2) {
        ++field1641;
        if (this.field1648) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) (arg0 >> 16 & 3) / 8.0F;
            long var8 = this.field1652.field3000;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field855.field5817 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        int var10 = 71 % ((-60 - arg2) / 33);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)Z", line = 248)
    public final boolean method440(byte arg0) {
        if (arg0 > -100) {
            this.method440((byte) 83);
        }
        ++field1647;
        return false;
    }
}
