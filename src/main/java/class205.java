import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class205 extends class45 {

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Z")
    private boolean field2992 = false;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "Z")
    private boolean field2994 = false;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Lm;")
    private class127 field2988;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Lru;")
    private class128 field2986;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "[I")
    public static int[] field2982 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Lib;")
    public static class106 field2990 = new class106(8);

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Lbg;")
    public static class324 field2995 = new class324(0, 28);

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZB)V")
    public final void method279(boolean arg0, byte arg1) {
        if (arg1 < 115) {
            this.field2986 = null;
        }
        ++field2993;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lfd;Lm;)V")
    public class205(class365 arg0, class127 arg1) {
        super(arg0);
        this.field2988 = arg1;
        if (this.field2988.field1849 != null && super.field506.field5446 && super.field506.field5442) {
            class280 var3 = class49.method499((byte) 121, super.field506, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class280 var4 = class49.method499((byte) 121, super.field506, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field2986 = class196.method1371(new class280[] { var3, var4 }, super.field506, -1);
            this.field2994 = this.field2986 != null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)Z")
    public final boolean method280(boolean arg0) {
        if (!arg0) {
            this.method279(false, (byte) 77);
        }
        ++field2984;
        return false;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    public static void method1432(byte arg0) {
        field2990 = null;
        field2995 = null;
        field2982 = null;
        if (arg0 != 121) {
            method1432((byte) -83);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)V")
    public final void method281(int arg0, boolean arg1) {
        ++field2991;
        class401 var3 = super.field506.method2229((byte) 60);
        if (arg0 != 0) {
            method1434(-87, -40, -112, -121, -33, -94, 120, (byte) 5, -29);
        }
        if (this.field2994 && var3 != null) {
            super.field506.method2219(1, -124);
            super.field506.method2188((byte) 78, var3);
            super.field506.method2219(0, -126);
            super.field506.method2188((byte) 78, this.field2988.field1849);
            long var4 = this.field2986.field1860;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field506.field5425[0], -super.field506.field5425[1], -super.field506.field5425[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field506.field5412, super.field506.field5338, super.field506.field5418, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field506.field5425[1]) + 96.0F);
            this.field2992 = true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public final void method287(int arg0) {
        if (this.field2992) {
            super.field506.method2219(1, -127);
            super.field506.method2188((byte) 78, (class396) null);
            super.field506.method2219(0, -118);
            super.field506.method2188((byte) 78, (class396) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2992 = false;
        }
        ++field2980;
        if (arg0 != 0) {
            method1434(-106, 12, -35, -121, 67, -95, -27, (byte) -102, 65);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILkj;Z)V")
    public final void method285(int arg0, class396 arg1, boolean arg2) {
        if (arg2) {
            if (!this.field2992) {
                super.field506.method2188((byte) 78, arg1);
                super.field506.method2183(7681, arg0);
            }
            ++field2983;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Loc;")
    public static final class136 method1433(int arg0, int arg1) {
        ++field2985;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (~arg0 != -9) {
                                            if (arg0 != 9) {
                                                if (~arg0 != -11) {
                                                    if (~arg0 != -12) {
                                                        if (arg0 != 12) {
                                                            if (~arg0 != -14) {
                                                                if (~arg0 != -15) {
                                                                    if (arg0 != 15) {
                                                                        if (arg0 != 16) {
                                                                            if (arg0 != 17) {
                                                                                if (~arg0 != -19) {
                                                                                    if (~arg0 != -20) {
                                                                                        if (arg0 != 20) {
                                                                                            if (~arg0 != -22) {
                                                                                                if (arg0 != 22) {
                                                                                                    if (arg0 != 23) {
                                                                                                        if (~arg0 != -25) {
                                                                                                            if (~arg0 != -26) {
                                                                                                                if (arg0 != 26) {
                                                                                                                    if (~arg0 != -28) {
                                                                                                                        if (~arg0 != -29) {
                                                                                                                            if (arg0 != 29) {
                                                                                                                                if (~arg0 != -31) {
                                                                                                                                    if (~arg0 != -32) {
                                                                                                                                        if (~arg0 != -33) {
                                                                                                                                            if (~arg0 != -34) {
                                                                                                                                                if (~arg0 != -35) {
                                                                                                                                                    if (arg0 != 35) {
                                                                                                                                                        if (~arg0 != -37) {
                                                                                                                                                            if (~arg0 != -38) {
                                                                                                                                                                if (arg0 != 38) {
                                                                                                                                                                    if (arg0 == 39) {
                                                                                                                                                                        return new class382();
                                                                                                                                                                    } else {
                                                                                                                                                                        return arg1 != 35 ? null : null;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return new class478();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class108();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class68();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class375();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class424();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class248();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class73();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class440();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class175();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class69();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class487();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class195();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class57();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class392();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class12();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class34();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class525();
                                                                                                }
                                                                                            } else {
                                                                                                return new class173();
                                                                                            }
                                                                                        } else {
                                                                                            return new class296();
                                                                                        }
                                                                                    } else {
                                                                                        return new class500();
                                                                                    }
                                                                                } else {
                                                                                    return new class226();
                                                                                }
                                                                            } else {
                                                                                return new class481();
                                                                            }
                                                                        } else {
                                                                            return new class96();
                                                                        }
                                                                    } else {
                                                                        return new class370();
                                                                    }
                                                                } else {
                                                                    return new class283();
                                                                }
                                                            } else {
                                                                return new class484();
                                                            }
                                                        } else {
                                                            return new class154();
                                                        }
                                                    } else {
                                                        return new class338();
                                                    }
                                                } else {
                                                    return new class496();
                                                }
                                            } else {
                                                return new class144();
                                            }
                                        } else {
                                            return new class33();
                                        }
                                    } else {
                                        return new class82();
                                    }
                                } else {
                                    return new class147();
                                }
                            } else {
                                return new class374();
                            }
                        } else {
                            return new class253();
                        }
                    } else {
                        return new class141();
                    }
                } else {
                    return new class348();
                }
            } else {
                return new class160();
            }
        } else {
            return new class456();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 == 27) {
            ++field2989;
            if (class518.method3081(-114, arg4)) {
                if (class335.field4671[arg4] != null) {
                    class138.method1040(arg2, arg3, arg8, arg1, class335.field4671[arg4], arg0, -1, arg5, arg6, -1268043624);
                } else {
                    class138.method1040(arg2, arg3, arg8, arg1, class123.field1803[arg4], arg0, -1, arg5, arg6, -1268043624);
                }
            } else if (arg1 != -1) {
                class342.field4736[arg1] = true;
            } else {
                for (int var9 = 0; ~var9 > -101; ++var9) {
                    class342.field4736[var9] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
    public final void method286(int arg0, int arg1, int arg2) {
        ++field2987;
        if (this.field2992) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((238546 & arg2) >> 16) / 8.0F;
            long var8 = this.field2986.field1860;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field506.field5306 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1 < 76) {
            this.method280(false);
        }
    }
}
