import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class561 extends class277 {

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "Lpea;")
    private class222 field7789;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "Lbj;")
    private class483 field7798;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "[F")
    private float[] field7794;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "[Lwa;")
    public static class662[] field7792 = new class662[14];

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
    public static int field7790 = 0;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "Lwp;")
    public static class453 field7791 = new class453(24, 3);

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
    public static int field7807 = 0;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "F")
    private float field7799;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
    private int field7801;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!lu", name = "B", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "Lfb;")
    private class52 field7793;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
    private final void method3079(int arg0) {
        ++field7804;
        this.field7793 = new class52(super.field3475, 2);
        this.field7793.method331(0, arg0 + -260);
        super.field3475.method3027(1, true);
        super.field3475.method2972(arg0 ^ -29195, -16777216);
        super.field3475.method2983(arg0, arg0 + -465309396, 7681);
        super.field3475.method3015(34166, 770, 0, true);
        super.field3475.method3027(0, true);
        OpenGL.glBindProgramARB(34336, this.field7798.field6416);
        OpenGL.glEnable(34336);
        this.field7793.method332((byte) 76);
        this.field7793.method331(1, 0);
        super.field3475.method3027(1, true);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field3475.method3005(false, 0);
        super.field3475.method3015(5890, 770, 0, true);
        super.field3475.method3027(0, true);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field7793.method332((byte) 69);
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)V")
    public static void method3080(byte arg0) {
        if (arg0 >= -34) {
            field7792 = null;
        }
        field7792 = null;
        field7791 = null;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lqj;Lpea;)V")
    public class561(class548 arg0, class222 arg1) {
        super(arg0);
        this.field7789 = arg1;
        if (super.field3475.field7524 && super.field3475.field7561 >= 2) {
            this.field7798 = class393.method2108("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", -65536, 34336, super.field3475);
            if (this.field7798 != null) {
                int[][] var3 = client.method3808(0, 256, 4, 3, 4, (byte) 70, false, 64, 0.4F);
                int[][] var4 = client.method3808(8, 256, 4, 3, 4, (byte) 70, false, 64, 0.4F);
                this.field7794 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field7794[var5++] = (float) var7[var9] / 4096.0F;
                        this.field7794[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method3079(260);
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public final void method278(int arg0) {
        ++field7809;
        if (this.field7793 != null) {
            this.field7793.method333(arg0 ^ -30404, '\u0001');
            super.field3475.method3027(1, true);
            super.field3475.method2960((class615) null, -2);
            super.field3475.method3027(0, true);
            if (arg0 != 1268) {
                this.field7789 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZ)V")
    public final void method280(int arg0, boolean arg1) {
        ++field7795;
        if (arg0 >= -64) {
            this.method3079(121);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II[BBILjava/lang/String;)I")
    public static final int method3081(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, String arg5) {
        ++field7796;
        int var6 = arg1 - arg0;
        if (arg3 >= -49) {
            return -73;
        } else {
            for (int var7 = 0; ~var7 > ~var6; ++var7) {
                char var8 = arg5.charAt(arg0 + var7);
                if (~var8 < -1 && var8 < 128 || var8 >= 160 && var8 <= 255) {
                    arg2[arg4 + var7] = (byte) var8;
                } else if (~var8 == -8365) {
                    arg2[arg4 - -var7] = -128;
                } else if (~var8 == -8219) {
                    arg2[arg4 - -var7] = -126;
                } else if (var8 == 402) {
                    arg2[arg4 + var7] = -125;
                } else if (var8 != 8222) {
                    if (var8 != 8230) {
                        if (var8 != 8224) {
                            if (~var8 != -8226) {
                                if (~var8 == -711) {
                                    arg2[arg4 + var7] = -120;
                                } else if (~var8 == -8241) {
                                    arg2[arg4 + var7] = -119;
                                } else if (~var8 == -353) {
                                    arg2[arg4 + var7] = -118;
                                } else if (~var8 == -8250) {
                                    arg2[arg4 + var7] = -117;
                                } else if (~var8 != -339) {
                                    if (~var8 != -382) {
                                        if (~var8 == -8217) {
                                            arg2[arg4 - -var7] = -111;
                                        } else if (~var8 == -8218) {
                                            arg2[arg4 + var7] = -110;
                                        } else if (~var8 != -8221) {
                                            if (var8 == 8221) {
                                                arg2[arg4 + var7] = -108;
                                            } else if (var8 == 8226) {
                                                arg2[arg4 - -var7] = -107;
                                            } else if (~var8 != -8212) {
                                                if (var8 == 8212) {
                                                    arg2[arg4 + var7] = -105;
                                                } else if (~var8 != -733) {
                                                    if (var8 != 8482) {
                                                        if (var8 != 353) {
                                                            if (~var8 != -8251) {
                                                                if (~var8 == -340) {
                                                                    arg2[arg4 + var7] = -100;
                                                                } else if (~var8 == -383) {
                                                                    arg2[arg4 - -var7] = -98;
                                                                } else if (~var8 == -377) {
                                                                    arg2[arg4 + var7] = -97;
                                                                } else {
                                                                    arg2[arg4 + var7] = 63;
                                                                }
                                                            } else {
                                                                arg2[arg4 + var7] = -101;
                                                            }
                                                        } else {
                                                            arg2[arg4 + var7] = -102;
                                                        }
                                                    } else {
                                                        arg2[arg4 + var7] = -103;
                                                    }
                                                } else {
                                                    arg2[arg4 + var7] = -104;
                                                }
                                            } else {
                                                arg2[arg4 + var7] = -106;
                                            }
                                        } else {
                                            arg2[arg4 + var7] = -109;
                                        }
                                    } else {
                                        arg2[arg4 + var7] = -114;
                                    }
                                } else {
                                    arg2[arg4 + var7] = -116;
                                }
                            } else {
                                arg2[arg4 + var7] = -121;
                            }
                        } else {
                            arg2[arg4 + var7] = -122;
                        }
                    } else {
                        arg2[arg4 + var7] = -123;
                    }
                } else {
                    arg2[arg4 + var7] = -124;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILr;)V")
    public static final void method3082(int arg0, int arg1, class566 arg2) {
        ++field7808;
        if (!class68.field926) {
            class145.field1881 = 0;
        } else {
            if (class236.field2955) {
                class583.field8142 = class46.field612.method784(false);
            }
            class352.field4496 = 0;
            class613.field8621 = 0;
            class463.field5901 = 0;
            int[] var3 = arg2.method1016();
            class80.field1084 = (int) ((float) var3[2] / 3.0F);
            if (arg1 == 26871) {
                class117.field1518 = (int) ((float) var3[3] / 3.0F);
                arg2.method1030(class160.field2110);
                if (~((int) ((float) class160.field2110[0] / 3.0F)) != ~class278.field3478 || ~((int) ((float) class160.field2110[1] / 3.0F)) != ~class294.field3635) {
                    class294.field3635 = (int) ((float) class160.field2110[1] / 3.0F);
                    class278.field3478 = (int) ((float) class160.field2110[0] / 3.0F);
                    class395.field4969 = class294.field3635 >> 1;
                    class169.field2211 = new int[class294.field3635 * class278.field3478];
                    class201.field2543 = class278.field3478 >> 1;
                }
                class192.field2395 = arg2.method1033();
                class145.field1881 = 0;
                for (int var4 = 0; ~class430.field5385 < ~var4; ++var4) {
                    class567.method3127(arg0, arg2, 0, class642.field9049[var4]);
                }
                for (int var5 = 0; var5 < class207.field2629; ++var5) {
                    class567.method3127(arg0, arg2, 0, class425.field5335[var5]);
                }
                for (int var6 = 0; ~class472.field5992 < ~var6; ++var6) {
                    class567.method3127(arg0, arg2, 0, class311.field3980[var6]);
                }
                class160.field2109 = 0;
                if (~class145.field1881 < -1) {
                    int var7 = class169.field2211.length;
                    int var8 = 7 & -var7 + var7;
                    int var9 = 0;
                    while (var8 > var9) {
                        class169.field2211[var9++] = Integer.MAX_VALUE;
                        class169.field2211[var9++] = Integer.MAX_VALUE;
                        class169.field2211[var9++] = Integer.MAX_VALUE;
                        class169.field2211[var9++] = Integer.MAX_VALUE;
                        class169.field2211[var9++] = Integer.MAX_VALUE;
                        class169.field2211[var9++] = Integer.MAX_VALUE;
                        class169.field2211[var9++] = Integer.MAX_VALUE;
                        class169.field2211[var9++] = Integer.MAX_VALUE;
                    }
                    while (~var7 < ~var9) {
                        class169.field2211[var9++] = Integer.MAX_VALUE;
                    }
                    class653.field9212 = 1;
                    for (int var10 = 0; ~var10 > ~class145.field1881; ++var10) {
                        class199 var11 = class484.field6435[var10];
                        class188.method1151(var11.field2519[0], var11.field2513[3], var11.field2519[1], 0, var11.field2522[3], var11.field2522[1], var11.field2519[3], var11.field2513[0], var11.field2513[1], var11.field2522[0]);
                        class188.method1151(var11.field2519[1], var11.field2513[3], var11.field2519[2], 0, var11.field2522[3], var11.field2522[2], var11.field2519[3], var11.field2513[1], var11.field2513[2], var11.field2522[1]);
                    }
                    class653.field9212 = 2;
                }
                if (class236.field2955) {
                    class560.field7788 = class46.field612.method784(false) - class583.field8142;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILrg;)V")
    public final void method279(int arg0, int arg1, class615 arg2) {
        super.field3475.method2960(arg2, arg1 + -9);
        ++field7805;
        if (arg1 != 7) {
            this.field7789 = null;
        }
        super.field3475.method3005(false, arg0);
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(IZ)V")
    public final void method277(int arg0, boolean arg1) {
        ++field7797;
        if (this.field7793 != null) {
            int var3 = 41 / ((65 - arg0) / 60);
            this.field7793.method333(-29240, '\u0000');
            super.field3475.method3027(1, true);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3475.field7516.method909(true), 0);
            OpenGL.glMatrixMode(5888);
            super.field3475.method3027(0, true);
            if (super.field3475.field7477 != this.field7801) {
                int var4 = super.field3475.field7477 % 5000 * 128 / 5000;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field7794, var4);
                    var4 += 2;
                }
                if (!this.field7789.field2714) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field7799 = (float) (super.field3475.field7477 % 4000) / 4000.0F;
                }
                this.field7801 = super.field3475.field7477;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method3083(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        ++field7800;
        int var6 = arg0 + -334;
        if (var6 >= 0) {
            if (var6 > 100) {
                var6 = 100;
            }
        } else {
            var6 = 0;
        }
        int var7 = (-class149.field1922 + class537.field7219) * var6 / 100 + class149.field1922;
        if (~class509.field6891 >= ~var7) {
            if (~var7 < ~class611.field8574) {
                var7 = class611.field8574;
            }
        } else {
            var7 = class509.field6891;
        }
        int var8 = arg0 * var7 * 512 / (arg4 * 334);
        if (arg2 != -16777216) {
            field7792 = null;
        }
        if (var8 >= class127.field1593) {
            if (var8 > class504.field6671) {
                short var9 = class504.field6671;
                var7 = arg4 * var9 * 334 / (arg0 * 512);
                if (var7 < class509.field6891) {
                    var7 = class509.field6891;
                    int var10 = var9 * 334 * arg4 / (var7 * 512);
                    int var11 = (-var10 + arg0) / 2;
                    if (arg5) {
                        class32.field452.method1017();
                        class32.field452.method3118(-16777216, arg1, arg3, 1, var11, arg4);
                        class32.field452.method3118(-16777216, arg1, arg3 - -arg0 - var11, 1, var11, arg4);
                    }
                    arg0 -= var11 * 2;
                    arg3 += var11;
                }
            }
        } else {
            short var12 = class127.field1593;
            var7 = var12 * 334 * arg4 / (arg0 * 512);
            if (class611.field8574 < var7) {
                var7 = class611.field8574;
                int var13 = arg0 * var7 * 512 / (var12 * 334);
                int var14 = (-var13 + arg4) / 2;
                if (arg5) {
                    class32.field452.method1017();
                    class32.field452.method3118(-16777216, arg1, arg3, arg2 ^ -16777215, arg0, var14);
                    class32.field452.method3118(-16777216, arg1 + arg4 + -var14, arg3, 1, arg0, var14);
                }
                arg1 += var14;
                arg4 -= var14 * 2;
            }
        }
        class396.field4997 = (short) arg4;
        class458.field5837 = arg0 * var7 / 334;
        class298.field3670 = arg3;
        class474.field6010 = arg1;
        class475.field6029 = (short) arg0;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)Z")
    public final boolean method284(byte arg0) {
        ++field7806;
        return arg0 < -93;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIILvda;)J")
    public static final long method3084(int arg0, int arg1, int arg2, class339 arg3) {
        ++field7803;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class441 var8 = class428.field5352.method3138((byte) 63, arg3.method65((byte) 127));
        long var9 = (long) (arg3.method74((byte) 42) << 14 | arg1 | arg0 << 7 | arg3.method78((byte) 61) << 20 | 1073741824);
        if (~var8.field5560 == arg2) {
            var9 |= var6;
        }
        if (~var8.field5507 == -2) {
            var9 |= var4;
        }
        return var9 | (long) arg3.method65((byte) 127) << 32;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)V")
    public final void method276(int arg0, int arg1, int arg2) {
        ++field7802;
        if (this.field7793 != null) {
            if (arg1 != 50) {
                method3082(12, -10, (class566) null);
            }
            super.field3475.method3027(1, true);
            if ((arg0 & 128) != 0) {
                super.field3475.method2960((class615) null, -2);
            } else if (~(1 & arg2) == -2) {
                if (this.field7789.field2714) {
                    super.field3475.method2960(this.field7789.field2722, -2);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field7799, 0.0F, 0.0F, 1.0F);
                } else {
                    int var4 = super.field3475.field7477 % 4000 * 16 / 4000;
                    super.field3475.method2960(this.field7789.field2718[var4], -2);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (this.field7789.field2714) {
                    super.field3475.method2960(this.field7789.field2722, -2);
                } else {
                    super.field3475.method2960(this.field7789.field2718[0], -2);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field3475.method3027(0, true);
            if ((64 & arg0) == 0) {
                OpenGL.glGetFloatv(2899, class98.field1332, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class98.field1332, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = arg0 & 3;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var5 == -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }
}
