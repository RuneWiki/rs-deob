import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class269 extends class369 {

    @OriginalMember(owner = "client!tia", name = "o", descriptor = "Z")
    private boolean field3799 = false;

    @OriginalMember(owner = "client!tia", name = "i", descriptor = "Z")
    private boolean field3793 = false;

    @OriginalMember(owner = "client!tia", name = "k", descriptor = "Llc;")
    private class648 field3795;

    @OriginalMember(owner = "client!tia", name = "q", descriptor = "Ldw;")
    private class716 field3801;

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "Lsj;")
    public static class460 field3789 = new class460("game3", 2);

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!tia", name = "g", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!tia", name = "h", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!tia", name = "j", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!tia", name = "l", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!tia", name = "n", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!tia", name = "p", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!tia", name = "r", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!tia", name = "s", descriptor = "J")
    public static long field3803;

    @OriginalMember(owner = "client!tia", name = "m", descriptor = "[Z")
    public static boolean[] field3797;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lud;BI)V", line = 5)
    public final void method373(class36 arg0, byte arg1, int arg2) {
        if (!this.field3793) {
            super.field5255.method256((byte) -128, arg0);
            super.field5255.method237(0, arg2);
        }
        ++field3796;
        if (arg1 >= -89) {
            this.method373((class36) null, (byte) -85, 27);
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZB)V", line = 22)
    public final void method366(boolean arg0, byte arg1) {
        int var3 = -57 / ((-60 - arg1) / 38);
        ++field3790;
    }

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "(I)Z", line = 36)
    public final boolean method368(int arg0) {
        if (arg0 >= -5) {
            return true;
        } else {
            ++field3794;
            return false;
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 50)
    public static final String method1786(boolean arg0) {
        if (arg0) {
            field3803 = -88L;
        }
        ++field3798;
        String var1 = "www";
        if (class79.field1419 != class436.field6234) {
            if (class436.field6234 != class327.field4545) {
                if (class746.field10327 == class436.field6234) {
                    var1 = "www-wtwip";
                }
            } else {
                var1 = "www-wtqa";
            }
        } else {
            var1 = "www-wtrc";
        }
        String var2 = "";
        if (class640.field8796 != null) {
            var2 = "/p=" + class640.field8796;
        }
        return "http://" + var1 + "." + class582.field7970.field6486 + ".com/l=" + class607.field8336 + "/a=" + class601.field8259 + var2 + "/";
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(Z)Z", line = 82)
    public static final boolean method1787(boolean arg0) {
        ++field3800;
        try {
            if (~class326.field4513 == -3) {
                if (class369.field5254 == null) {
                    class369.field5254 = class63.method660(class37.field915, class708.field9601, class726.field9825);
                    if (class369.field5254 == null) {
                        return false;
                    }
                }
                if (class119.field2023 == null) {
                    class119.field2023 = new class327(class88.field1563, class666.field9098);
                }
                class12 var1 = class266.field3769;
                if (class539.field7455 != null) {
                    var1 = class539.field7455;
                }
                if (var1.method98(class369.field5254, 22050, class119.field2023, class505.field7027, -35)) {
                    class266.field3769 = var1;
                    class266.field3769.method96((byte) 52);
                    if (~class383.field5557 >= -1) {
                        class326.field4513 = 0;
                        class266.field3769.method93(0, class273.field3839);
                        for (int var2 = 0; var2 < class240.field3497.length; ++var2) {
                            class266.field3769.method73(class240.field3497[var2], var2, -7836);
                            class240.field3497[var2] = 255;
                        }
                    } else {
                        class326.field4513 = 3;
                        class266.field3769.method93(0, ~class383.field5557 < ~class273.field3839 ? class273.field3839 : class383.field5557);
                        for (int var3 = 0; ~var3 > ~class240.field3497.length; ++var3) {
                            class266.field3769.method73(class240.field3497[var3], var3, -7836);
                            class240.field3497[var3] = 255;
                        }
                    }
                    if (class539.field7455 == null) {
                        if (~class640.field8801 >= -1L) {
                            class266.field3769.method101(class369.field5254, class185.field2789, false);
                        } else {
                            class266.field3769.method102(class369.field5254, class640.field8801, class185.field2789, true, (byte) 24);
                        }
                    }
                    if (class100.field1805 != null) {
                        class100.field1805.method3169(arg0, class266.field3769);
                    }
                    class37.field915 = null;
                    class369.field5254 = null;
                    class640.field8801 = 0L;
                    class119.field2023 = null;
                    class539.field7455 = null;
                    return true;
                }
            }
            if (arg0) {
                field3797 = null;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class266.field3769.method110(-128);
            class539.field7455 = null;
            class119.field2023 = null;
            class369.field5254 = null;
            class37.field915 = null;
            class326.field4513 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZZ)V", line = 186)
    public final void method369(boolean arg0, boolean arg1) {
        if (!arg1) {
            ++field3791;
            class429 var3 = super.field5255.method194(444720536);
            if (this.field3799 && var3 != null) {
                super.field5255.method190(-15039, 1);
                super.field5255.method256((byte) -126, var3);
                super.field5255.method190(-15039, 0);
                super.field5255.method256((byte) -75, this.field3795.field8914);
                long var4 = this.field3801.field9752;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field5255.field647[0], -super.field5255.field647[1], -super.field5255.field647[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5255.field603, super.field5255.field638, super.field5255.field645, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field5255.field647[1]) * 928.0F);
                this.field3793 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V", line = 216)
    public final void method371(int arg0) {
        if (arg0 <= -75) {
            ++field3792;
            if (this.field3793) {
                super.field5255.method190(-15039, 1);
                super.field5255.method256((byte) -108, (class36) null);
                super.field5255.method190(-15039, 0);
                super.field5255.method256((byte) -121, (class36) null);
                OpenGL.glUseProgramObjectARB(0L);
                this.field3793 = false;
            }
        }
    }

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "(Z)V", line = 239)
    public static void method1788(boolean arg0) {
        if (arg0) {
            field3789 = null;
            field3797 = null;
        }
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(Lqo;Llc;)V", line = 257)
    public class269(class22 arg0, class648 arg1) {
        super(arg0);
        this.field3795 = arg1;
        if (this.field3795.field8914 != null && super.field5255.field613 && super.field5255.field605) {
            class164 var3 = class594.method3381(35633, -110, super.field5255, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class164 var4 = class594.method3381(35632, -38, super.field5255, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field3801 = class705.method3931(super.field5255, -1, new class164[] { var3, var4 });
            this.field3799 = this.field3801 != null;
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIB)V", line = 282)
    public final void method372(int arg0, int arg1, byte arg2) {
        if (this.field3793) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((arg0 & 61) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            long var8 = this.field3801.field9752;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5255.field557 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg2 >= -42) {
            method1787(false);
        }
        ++field3802;
    }
}
