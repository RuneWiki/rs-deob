import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class747 extends class548 {

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "Ltf;")
    private class311 field10068;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "Lie;")
    private class6 field10070;

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "[F")
    private float[] field10077;

    @OriginalMember(owner = "client!dw", name = "t", descriptor = "[B")
    public static byte[] field10072 = new byte[2048];

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "Lqj;")
    public static class535 field10066 = new class535(8);

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "F")
    private float field10065;

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
    public static int field10067;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
    public static int field10071;

    @OriginalMember(owner = "client!dw", name = "u", descriptor = "I")
    public static int field10073;

    @OriginalMember(owner = "client!dw", name = "v", descriptor = "I")
    private int field10074;

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
    public static int field10076;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
    public static int field10078;

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!dw", name = "B", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "Lik;")
    private class222 field10075;

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "Lhr;")
    public static class551 field10081;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)V", line = 4)
    public final void method753(int arg0, int arg1, int arg2) {
        ++field10076;
        if (this.field10075 != null) {
            super.field7571.method1631(1, 76);
            if (~(arg1 & 128) == -1) {
                if (~(1 & arg0) == -2) {
                    if (this.field10068.field4393) {
                        super.field7571.method1595((byte) 108, this.field10068.field4397);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field10065, 0.0F, 0.0F, 1.0F);
                    } else {
                        int var4 = super.field7571.field3519 % 4000 * 16 / 4000;
                        super.field7571.method1595((byte) 88, this.field10068.field4391[var4]);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (this.field10068.field4393) {
                        super.field7571.method1595((byte) 82, this.field10068.field4397);
                    } else {
                        super.field7571.method1595((byte) 82, this.field10068.field4391[0]);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field7571.method1595((byte) 72, (class205) null);
            }
            super.field7571.method1631(0, 46);
            if ((arg1 & 64) == 0) {
                class702.field9304[2] = super.field7571.field3644 * super.field7571.field3583;
                class702.field9304[1] = super.field7571.field3584 * super.field7571.field3583;
                class702.field9304[0] = super.field7571.field3650 * super.field7571.field3583;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class702.field9304, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            if (arg2 == 14106) {
                int var5 = arg1 & 3;
                if (var5 == 2) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                } else if (~var5 != -4) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Llf;Ltf;)V", line = 76)
    public class747(class250 arg0, class311 arg1) {
        super(arg0);
        this.field10068 = arg1;
        if (super.field7571.field3636 && ~super.field7571.field3569 <= -3) {
            this.field10070 = class317.method2030(super.field7571, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336, -15801);
            if (this.field10070 != null) {
                int[][] var3 = class672.method3705(64, 256, 4, 3, (byte) 89, 0, 4, false, 0.4F);
                int[][] var4 = class672.method3705(64, 256, 4, 3, (byte) 89, 8, 4, false, 0.4F);
                this.field10077 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field10077[var5++] = (float) var7[var9] / 4096.0F;
                        this.field10077[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method4091(-98);
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 127)
    public final void method759(int arg0) {
        if (arg0 != 3) {
            field10072 = null;
        }
        ++field10080;
        if (this.field10075 != null) {
            this.field10075.method1413('\u0001', 0);
            super.field7571.method1631(1, -89);
            super.field7571.method1595((byte) 122, (class205) null);
            super.field7571.method1631(0, -84);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI)V", line = 146)
    public final void method758(boolean arg0, int arg1) {
        ++field10069;
        if (arg1 != 0) {
            this.field10074 = -120;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V", line = 156)
    public static void method4089(int arg0) {
        field10072 = null;
        if (arg0 != 34336) {
            field10072 = null;
        }
        field10081 = null;
        field10066 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZLqba;B)V", line = 169)
    public static final void method4090(boolean arg0, class425 arg1, byte arg2) {
        ++field10079;
        class588 var3 = arg1.method2573(-1);
        if (arg1.field6195 == 0) {
            class279.field4037 = -1;
            arg1.field6199 = 0;
            class605.field8206 = 0;
        } else {
            if (~arg1.field6138 != 0 && ~arg1.field6183 == -1) {
                class317 var4 = class693.field9223.method2388(arg1.field6138, 0);
                if (arg1.field6200 > 0 && var4.field4481 == 0) {
                    ++arg1.field6199;
                    class605.field8206 = 0;
                    class279.field4037 = -1;
                    return;
                }
                if (~arg1.field6200 >= -1 && var4.field4489 == 0) {
                    class279.field4037 = -1;
                    class605.field8206 = 0;
                    ++arg1.field6199;
                    return;
                }
            }
            for (int var5 = 0; var5 < arg1.field6110.length; ++var5) {
                if (~arg1.field6110[var5].field1549 != 0 && class572.field7788 >= arg1.field6110[var5].field1552) {
                    class573 var20 = class641.field8643.method918(arg1.field6110[var5].field1549, 64);
                    if (var20.field7801 && ~var20.field7819 != 0) {
                        class317 var21 = class693.field9223.method2388(var20.field7819, 0);
                        if (arg1.field6200 > 0 && ~var21.field4481 == -1) {
                            ++arg1.field6199;
                            class605.field8206 = 0;
                            class279.field4037 = -1;
                            return;
                        }
                        if (arg1.field6200 <= 0 && ~var21.field4489 == -1) {
                            class605.field8206 = 0;
                            class279.field4037 = -1;
                            ++arg1.field6199;
                            return;
                        }
                    }
                }
            }
            int var6 = arg1.field2802;
            int var7 = arg1.field2810;
            int var8 = arg1.field6198[arg1.field6195 + -1] * 512 + arg1.method2563(-12840) * 256;
            int var9 = arg1.field6197[arg1.field6195 + -1] * 512 - -(arg1.method2563(-12840) * 256);
            if (var8 > var6) {
                if (~var7 > ~var9) {
                    arg1.method2558(10240, -1);
                } else if (~var7 >= ~var9) {
                    arg1.method2558(12288, -1);
                } else {
                    arg1.method2558(14336, -1);
                }
            } else if (var8 < var6) {
                if (~var7 <= ~var9) {
                    if (~var9 <= ~var7) {
                        arg1.method2558(4096, -1);
                    } else {
                        arg1.method2558(2048, -1);
                    }
                } else {
                    arg1.method2558(6144, -1);
                }
            } else if (~var7 <= ~var9) {
                if (var9 < var7) {
                    arg1.method2558(0, -1);
                }
            } else {
                arg1.method2558(8192, -1);
            }
            byte var10 = arg1.field6194[arg1.field6195 + -1];
            if (!arg0 && (~(-var6 + var8) < -1025 || -var6 + var8 < -1024 || ~(-var7 + var9) < -1025 || -var7 + var9 < -1024)) {
                arg1.field2810 = var9;
                arg1.field2802 = var8;
                arg1.method2561(false, false, arg1.field6098);
                if (arg1.field6200 > 0) {
                    --arg1.field6200;
                }
                --arg1.field6195;
                class279.field4037 = -1;
                class605.field8206 = 0;
            } else {
                int var11 = 16;
                if (arg2 <= -31) {
                    boolean var12 = true;
                    if (arg1 instanceof class22) {
                        var12 = ((class22) arg1).field217.field4293;
                    }
                    if (!var12) {
                        if (!arg0 && arg1.field6195 > 1) {
                            var11 = 24;
                        }
                        if (!arg0 && ~arg1.field6195 < -3) {
                            var11 = 32;
                        }
                    } else {
                        int var13 = arg1.field6098 - arg1.field6109.field1854;
                        if (var13 != 0 && ~arg1.field6149 == 0 && ~arg1.field6101 != -1) {
                            var11 = 8;
                        }
                        if (!arg0 && arg1.field6195 > 2) {
                            var11 = 24;
                        }
                        if (!arg0 && arg1.field6195 > 3) {
                            var11 = 32;
                        }
                    }
                    if (~arg1.field6199 < -1 && ~arg1.field6195 < -2) {
                        var11 = 32;
                        --arg1.field6199;
                    }
                    if (~var10 == -3) {
                        var11 <<= 1;
                    } else if (~var10 == -1) {
                        var11 >>= 1;
                    }
                    if (~var3.field8002 != 0) {
                        int var14 = var11 << 9;
                        if (~arg1.field6195 != -2) {
                            if (~arg1.field6193 <= ~var14) {
                                if (~arg1.field6193 < -1) {
                                    arg1.field6193 -= var3.field8002;
                                    if (arg1.field6193 < 0) {
                                        arg1.field6193 = 0;
                                    }
                                }
                            } else {
                                arg1.field6193 += var3.field8002;
                                if (var14 < arg1.field6193) {
                                    arg1.field6193 = var14;
                                }
                            }
                        } else {
                            int var15 = arg1.field6193 * arg1.field6193;
                            int var16 = (~arg1.field2802 >= ~var8 ? -arg1.field2802 + var8 : -var8 + arg1.field2802) << 9;
                            int var17 = (arg1.field2810 <= var9 ? -arg1.field2810 + var9 : arg1.field2810 - var9) << 9;
                            int var18 = var17 < var16 ? var16 : var17;
                            int var19 = var18 * 2 * var3.field8002;
                            if (var15 <= var19) {
                                if (~(var15 / 2) < ~var18) {
                                    arg1.field6193 -= var3.field8002;
                                    if (~arg1.field6193 > -1) {
                                        arg1.field6193 = 0;
                                    }
                                } else if (~arg1.field6193 > ~var14) {
                                    arg1.field6193 += var3.field8002;
                                    if (~arg1.field6193 < ~var14) {
                                        arg1.field6193 = var14;
                                    }
                                }
                            } else {
                                arg1.field6193 /= 2;
                            }
                        }
                        var11 = arg1.field6193 >> 9;
                        if (~var11 > -2) {
                            var11 = 1;
                        }
                    }
                    class605.field8206 = 0;
                    if (~var6 == ~var8 && var7 == var9) {
                        class279.field4037 = -1;
                    } else {
                        if (~var8 < ~var6) {
                            class605.field8206 |= 4;
                            arg1.field2802 += var11;
                            if (~var8 > ~arg1.field2802) {
                                arg1.field2802 = var8;
                            }
                        } else if (var8 < var6) {
                            class605.field8206 |= 8;
                            arg1.field2802 -= var11;
                            if (var8 > arg1.field2802) {
                                arg1.field2802 = var8;
                            }
                        }
                        if (~var11 <= -33) {
                            class279.field4037 = 2;
                        } else {
                            class279.field4037 = var10;
                        }
                        if (var9 > var7) {
                            arg1.field2810 += var11;
                            class605.field8206 |= 1;
                            if (~arg1.field2810 < ~var9) {
                                arg1.field2810 = var9;
                            }
                        } else if (~var7 < ~var9) {
                            arg1.field2810 -= var11;
                            class605.field8206 |= 2;
                            if (~arg1.field2810 > ~var9) {
                                arg1.field2810 = var9;
                            }
                        }
                    }
                    if (arg1.field2802 == var8 && ~arg1.field2810 == ~var9) {
                        --arg1.field6195;
                        if (arg1.field6200 > 0) {
                            --arg1.field6200;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V", line = 496)
    private final void method4091(int arg0) {
        ++field10073;
        this.field10075 = new class222(super.field7571, 2);
        this.field10075.method1416(0, -28867);
        if (arg0 >= -16) {
            field10066 = null;
        }
        super.field7571.method1631(1, 25);
        super.field7571.method1624(5634, -16777216);
        super.field7571.method1630(260, 7681, 95);
        super.field7571.method1581(770, 13112, 0, 34166);
        super.field7571.method1631(0, 95);
        OpenGL.glBindProgramARB(34336, this.field10070.field41);
        OpenGL.glEnable(34336);
        this.field10075.method1418(4864);
        this.field10075.method1416(1, -28867);
        super.field7571.method1631(1, -67);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field7571.method1601(25456, 0);
        super.field7571.method1581(770, 13112, 0, 5890);
        super.field7571.method1631(0, -89);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field10075.method1418(4864);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lru;II)V", line = 533)
    public final void method760(class205 arg0, int arg1, int arg2) {
        ++field10078;
        if (arg1 != -1) {
            this.method756(true);
        }
        super.field7571.method1595((byte) 118, arg0);
        super.field7571.method1601(25456, arg2);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)Z", line = 549)
    public final boolean method756(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field10067;
            return true;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZZ)V", line = 563)
    public final void method754(boolean arg0, boolean arg1) {
        ++field10071;
        if (this.field10075 != null) {
            if (arg1) {
                this.method758(false, 21);
            }
            this.field10075.method1413('\u0000', 0);
            super.field7571.method1631(1, -94);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field7571.field3551.method3286(-79), 0);
            OpenGL.glMatrixMode(5888);
            super.field7571.method1631(0, 69);
            if (super.field7571.field3519 != this.field10074) {
                int var3 = super.field7571.field3519 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field10077, var3);
                    var3 += 2;
                }
                if (this.field10068.field4393) {
                    this.field10065 = (float) (super.field7571.field3519 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field10074 = super.field7571.field3519;
            }
        }
    }
}
