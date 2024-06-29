import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class122 extends class193 {

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Z")
    private boolean field1647 = false;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Z")
    private boolean field1640 = false;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Lpl;")
    private class462 field1642;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lme;")
    private class131 field1634;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Z")
    public static boolean field1641 = false;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Z")
    public static boolean field1646 = false;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "[Lwc;")
    public static class49[] field1639 = new class49[30];

    @OriginalMember(owner = "client!r", name = "q", descriptor = "[I")
    public static int[] field1643 = new int[8];

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Frame;Lpc;I)V")
    public static final void method868(Frame arg0, class476 arg1, int arg2) {
        while (true) {
            class121 var3 = arg1.method2891(arg0, -69);
            while (~var3.field1628 == -1) {
                class199.method1251(10L, (byte) -91);
            }
            if (~var3.field1628 == -2) {
                if (arg2 != 0) {
                    field1643 = null;
                }
                ++field1645;
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class199.method1251(100L, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static void method869(byte arg0) {
        if (arg0 != -125) {
            field1633 = 49;
        }
        field1639 = null;
        field1643 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)V")
    public final void method99(int arg0, int arg1, boolean arg2) {
        ++field1644;
        if (arg2) {
            field1633 = -88;
        }
        if (this.field1647) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) (arg1 >> 16 & 3) / 8.0F;
            long var8 = this.field1634.field1719;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2498.field5503 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)I")
    public static final int method870(int arg0, int arg1, int arg2, int arg3) {
        ++field1636;
        if (~arg1 == ~arg2) {
            return arg2;
        } else {
            int var4 = -arg0 + 128;
            int var5 = (127 & arg1) * arg0 + (127 & arg2) * var4 >> 7;
            if (arg3 < 93) {
                return 21;
            } else {
                int var6 = (896 & arg1) * arg0 + (arg2 & 896) * var4 >> 7;
                int var7 = (64512 & arg1) * arg0 + (64512 & arg2) * var4 >> 7;
                return var7 & 64512 | 896 & var6 | 127 & var5;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(CZ)B")
    public static final byte method871(char arg0, boolean arg1) {
        ++field1638;
        if (arg1) {
            method868((Frame) null, (class476) null, 43);
        }
        byte var2;
        if ((~arg0 >= -1 || ~arg0 <= -129) && (arg0 < 160 || ~arg0 < -256)) {
            if (~arg0 == -8365) {
                var2 = -128;
            } else if (~arg0 != -8219) {
                if (~arg0 == -403) {
                    var2 = -125;
                } else if (~arg0 != -8223) {
                    if (~arg0 != -8231) {
                        if (~arg0 == -8225) {
                            var2 = -122;
                        } else if (arg0 == 8225) {
                            var2 = -121;
                        } else if (arg0 != 710) {
                            if (arg0 == 8240) {
                                var2 = -119;
                            } else if (~arg0 == -353) {
                                var2 = -118;
                            } else if (arg0 != 8249) {
                                if (~arg0 != -339) {
                                    if (arg0 == 381) {
                                        var2 = -114;
                                    } else if (~arg0 == -8217) {
                                        var2 = -111;
                                    } else if (~arg0 == -8218) {
                                        var2 = -110;
                                    } else if (~arg0 == -8221) {
                                        var2 = -109;
                                    } else if (arg0 == 8221) {
                                        var2 = -108;
                                    } else if (~arg0 == -8227) {
                                        var2 = -107;
                                    } else if (~arg0 == -8212) {
                                        var2 = -106;
                                    } else if (arg0 == 8212) {
                                        var2 = -105;
                                    } else if (~arg0 == -733) {
                                        var2 = -104;
                                    } else if (~arg0 == -8483) {
                                        var2 = -103;
                                    } else if (arg0 != 353) {
                                        if (arg0 != 8250) {
                                            if (~arg0 == -340) {
                                                var2 = -100;
                                            } else if (~arg0 != -383) {
                                                if (arg0 != 376) {
                                                    var2 = 63;
                                                } else {
                                                    var2 = -97;
                                                }
                                            } else {
                                                var2 = -98;
                                            }
                                        } else {
                                            var2 = -101;
                                        }
                                    } else {
                                        var2 = -102;
                                    }
                                } else {
                                    var2 = -116;
                                }
                            } else {
                                var2 = -117;
                            }
                        } else {
                            var2 = -120;
                        }
                    } else {
                        var2 = -123;
                    }
                } else {
                    var2 = -124;
                }
            } else {
                var2 = -126;
            }
        } else {
            var2 = (byte) arg0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Z")
    public final boolean method93(boolean arg0) {
        ++field1637;
        if (arg0) {
            this.method92((byte) -99);
        }
        return false;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(ZZ)V")
    public final void method95(boolean arg0, boolean arg1) {
        ++field1650;
        if (!arg1) {
            this.method93(false);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZZ)V")
    public final void method94(boolean arg0, boolean arg1) {
        ++field1649;
        class288 var3 = super.field2498.method2285((byte) 69);
        if (!arg0) {
            this.field1642 = null;
        }
        if (this.field1640 && var3 != null) {
            super.field2498.method2321(1, 25322);
            super.field2498.method2322(var3, 14);
            super.field2498.method2321(0, 25322);
            super.field2498.method2322(this.field1642.field6608, 14);
            long var4 = this.field1634.field1719;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field2498.field5595[0], -super.field2498.field5595[1], -super.field2498.field5595[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field2498.field5609, super.field2498.field5570, super.field2498.field5626, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field2498.field5595[1]));
            this.field1647 = true;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lug;Lpl;)V")
    public class122(class395 arg0, class462 arg1) {
        super(arg0);
        this.field1642 = arg1;
        if (this.field1642.field6608 != null && super.field2498.field5625 && super.field2498.field5531) {
            class320 var3 = class157.method1019("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, 1, super.field2498);
            class320 var4 = class157.method1019("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, 1, super.field2498);
            this.field1634 = class18.method155(super.field2498, new class320[] { var3, var4 }, 0);
            this.field1640 = this.field1634 != null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public final void method92(byte arg0) {
        ++field1648;
        if (arg0 >= -56) {
            field1643 = null;
        }
        if (this.field1647) {
            super.field2498.method2321(1, 25322);
            super.field2498.method2322((class119) null, 14);
            super.field2498.method2321(0, 25322);
            super.field2498.method2322((class119) null, 14);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1647 = false;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lsq;II)V")
    public final void method97(class119 arg0, int arg1, int arg2) {
        if (arg2 != 36) {
            this.field1647 = false;
        }
        ++field1635;
        if (!this.field1647) {
            super.field2498.method2322(arg0, 14);
            super.field2498.method2305(arg2 ^ 7717, arg1);
        }
    }
}
