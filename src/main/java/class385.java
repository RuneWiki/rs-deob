import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class385 extends class86 {

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Lhl;")
    private class373 field5851;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lsh;")
    private class49 field5844;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "[F")
    private float[] field5856;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field5850 = 1337;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Z")
    public static boolean field5849 = false;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field5854 = 1338;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Llp;")
    public static class272 field5845 = new class272(512);

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "Lni;")
    public static class367 field5858 = new class367(9, 2);

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "F")
    private float field5843;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    private int field5842;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lhq;")
    private class110 field5847;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method238(byte arg0) {
        ++field5852;
        if (arg0 > -2) {
            this.method236(true, (class538) null, 69);
        }
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lga;IIB)V", line = 16)
    public static final void method2407(class282 arg0, int arg1, int arg2, byte arg3) {
        class88.field1262 = arg1;
        if (arg3 != 83) {
            method2409((class500) null, 27, (class164) null, (byte) -119);
        }
        class308.field4460 = arg2;
        ++field5840;
        class282.field4156 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lnq;Lhl;)V", line = 32)
    public class385(class325 arg0, class373 arg1) {
        super(arg0);
        this.field5851 = arg1;
        if (super.field1248.field5003 && super.field1248.field4967 >= 2) {
            this.field5844 = class474.method2827(34336, super.field1248, 34933, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field5844 != null) {
                int[][] var3 = class266.method1703(0.4F, 3, 256, 28, 4, 0, 64, false, 8);
                int[][] var4 = class266.method1703(0.4F, 3, 256, 64, 4, 8, 64, false, 8);
                this.field5856 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field5856[var5++] = (float) var7[var9] / 4096.0F;
                        this.field5856[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2411((byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 80)
    public static void method2408(int arg0) {
        field5858 = null;
        if (arg0 != 1337) {
            method2408(3);
        }
        field5845 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZB)V", line = 91)
    public final void method235(boolean arg0, byte arg1) {
        if (arg1 != 112) {
            this.method236(true, (class538) null, 50);
        }
        ++field5857;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ldq;ILnj;B)V", line = 101)
    public static final void method2409(class500 arg0, int arg1, class164 arg2, byte arg3) {
        ++field5841;
        class183 var4 = new class183();
        var4.field2482 = arg2.method1087(false);
        var4.field2475 = arg2.method1099(-109);
        var4.field2480 = new class234[var4.field2482];
        var4.field2477 = new byte[var4.field2482][][];
        var4.field2474 = new int[var4.field2482];
        var4.field2483 = new int[var4.field2482];
        var4.field2484 = new class234[var4.field2482];
        var4.field2476 = new int[var4.field2482];
        if (arg3 >= -80) {
            method2408(-91);
        }
        for (int var5 = 0; ~var5 > ~var4.field2482; ++var5) {
            try {
                int var6 = arg2.method1087(false);
                if (~var6 != -1 && ~var6 != -2 && ~var6 != -3) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var7 = arg2.method1064(false);
                        String var8 = arg2.method1064(false);
                        int var9 = arg2.method1087(false);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var11 < var9; ++var11) {
                            var10[var11] = arg2.method1064(false);
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; var9 > var13; ++var13) {
                                int var14 = arg2.method1099(-127);
                                var12[var13] = new byte[var14];
                                arg2.method1109(var12[var13], (byte) 23, 0, var14);
                            }
                        }
                        var4.field2483[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; var9 > var16; ++var16) {
                            var15[var16] = class248.method1609(var10[var16], (byte) -49);
                        }
                        var4.field2480[var5] = arg0.method2987(var15, var8, true, class248.method1609(var7, (byte) -49));
                        var4.field2477[var5] = var12;
                    }
                } else {
                    String var17 = arg2.method1064(false);
                    String var18 = arg2.method1064(false);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method1099(-106);
                    }
                    var4.field2483[var5] = var6;
                    var4.field2474[var5] = var19;
                    var4.field2484[var5] = arg0.method2976(var18, class248.method1609(var17, (byte) -49), 0);
                }
            } catch (ClassNotFoundException var20) {
                var4.field2476[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2476[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2476[var5] = -3;
            } catch (Exception var23) {
                var4.field2476[var5] = -4;
            } catch (Throwable var24) {
                var4.field2476[var5] = -5;
            }
        }
        class132.field1784.method453((byte) 124, var4);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 213)
    public final void method237(int arg0) {
        ++field5853;
        if (this.field5847 != null) {
            this.field5847.method693((byte) 114, '\u0001');
            super.field1248.method2040((byte) -103, 1);
            if (arg0 != 27670) {
                method2408(98);
            }
            super.field1248.method2075((class538) null, 0);
            super.field1248.method2040((byte) 93, 0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLlr;I)V", line = 232)
    public final void method236(boolean arg0, class538 arg1, int arg2) {
        if (!arg0) {
            this.field5847 = null;
        }
        super.field1248.method2075(arg1, 0);
        ++field5855;
        super.field1248.method2045(34023, arg2);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V", line = 246)
    public final void method241(int arg0, boolean arg1) {
        ++field5839;
        if (this.field5847 != null) {
            this.field5847.method693((byte) 100, '\u0000');
            super.field1248.method2040((byte) -126, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field1248.field4986.method2550((byte) 91), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, (float) arg0, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field1248.method2040((byte) 38, 0);
            if (~super.field1248.field4899 != ~this.field5842) {
                int var3 = super.field1248.field4899 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field5856, var4);
                    var4 += 2;
                }
                if (this.field5851.field5673) {
                    this.field5843 = (float) (super.field1248.field4899 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field5842 = super.field1248.field4899;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Luu;ZLuu;)V", line = 292)
    public static final void method2410(class191 arg0, boolean arg1, class191 arg2) {
        class14.field264 = arg2;
        class176.field2358 = arg0;
        ++field5838;
        if (arg1) {
            field5854 = 124;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V", line = 313)
    private final void method2411(byte arg0) {
        ++field5848;
        this.field5847 = new class110(super.field1248, 2);
        this.field5847.method694(4864, 0);
        super.field1248.method2040((byte) -93, 1);
        super.field1248.method2073((byte) -114, -16777216);
        super.field1248.method2030(260, 7681, (byte) 71);
        if (arg0 > -114) {
            field5850 = -32;
        }
        super.field1248.method2044(0, 770, (byte) 64, 34166);
        super.field1248.method2040((byte) 35, 0);
        OpenGL.glBindProgramARB(34336, this.field5844.field695);
        OpenGL.glEnable(34336);
        this.field5847.method691(-65);
        this.field5847.method694(4864, 1);
        super.field1248.method2040((byte) -127, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field1248.method2045(34023, 0);
        super.field1248.method2044(0, 770, (byte) 64, 5890);
        super.field1248.method2040((byte) 121, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field5847.method691(-54);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)V", line = 349)
    public final void method239(int arg0, byte arg1, int arg2) {
        ++field5846;
        if (this.field5847 != null) {
            super.field1248.method2040((byte) -105, 1);
            if (~(128 & arg2) == -1) {
                if (~(1 & arg0) == -2) {
                    if (this.field5851.field5673) {
                        super.field1248.method2075(this.field5851.field5680, 0);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field5843, 0.0F, 0.0F, 1.0F);
                    } else {
                        int var4 = super.field1248.field4899 % 4000 * 16 / 4000;
                        super.field1248.method2075(this.field5851.field5678[var4], 0);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (this.field5851.field5673) {
                        super.field1248.method2075(this.field5851.field5680, 0);
                    } else {
                        super.field1248.method2075(this.field5851.field5678[0], 0);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field1248.method2075((class538) null, 0);
            }
            super.field1248.method2040((byte) -125, 0);
            if ((64 & arg2) == 0) {
                OpenGL.glGetFloatv(2899, class524.field7706, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class524.field7706, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = 29 / ((-50 - arg1) / 53);
            int var6 = arg2 & 3;
            if (~var6 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var6 != -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }
}
