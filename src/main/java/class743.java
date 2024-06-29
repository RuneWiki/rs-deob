import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class743 extends class283 {

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "Lrb;")
    private class401 field10363;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "Lft;")
    private class695 field10357;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "[F")
    private float[] field10367;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "Ldj;")
    public static class703 field10362 = new class703(7, 0, 1, 1);

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "[[I")
    public static int[][] field10366 = new int[6][];

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "Llc;")
    public static class435 field10368 = new class435(6, 10);

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "F")
    private float field10355;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field10354;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    private int field10356;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field10358;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field10359;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field10360;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public static int field10361;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public static int field10365;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    public static int field10369;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    public static int field10370;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    public static int field10371;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
    public static int field10373;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public static int field10374;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    public static int field10375;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "Ltw;")
    private class523 field10364;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(ZI)V")
    public static final void method4134(boolean arg0, int arg1) {
        if (class39.field672 != 1) {
            if (class39.field672 == 2) {
                class560.field8129 = arg1;
            }
        } else {
            class642.field9133 = arg1;
        }
        if (!arg0) {
            method4139((class146) null, (byte) 118);
        }
        ++field10369;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V")
    public static final void method4135(byte arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class157.field2258[var1] = false;
        }
        ++field10376;
        class729.field10234 = -1;
        if (arg0 < 31) {
            field10366 = null;
        }
        class165.field2351 = 1;
        class405.field5770 = 0;
        class39.field674 = -1;
        class749.field10449 = 0;
        class616.field8773 = -1;
        class539.field7824 = -1;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lkw;Lrb;)V")
    public class743(class346 arg0, class401 arg1) {
        super(arg0);
        this.field10363 = arg1;
        if (super.field3958.field5009 && super.field3958.field5055 >= 2) {
            this.field10357 = class216.method1530(34336, super.field3958, true, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field10357 != null) {
                int[][] var3 = class583.method3431(0, 64, 4, false, 0.4F, -105, 3, 256, 4);
                int[][] var4 = class583.method3431(8, 64, 4, false, 0.4F, 99, 3, 256, 4);
                this.field10367 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field10367[var5++] = (float) var7[var9] / 4096.0F;
                        this.field10367[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method4140(-15966);
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        ++field10372;
        if (this.field10364 != null) {
            this.field10364.method3185(114, '\u0000');
            super.field3958.method2171(124, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3958.field5005.method2350(false), 0);
            OpenGL.glMatrixMode(5888);
            super.field3958.method2171(127, 0);
            if (arg0 != -938) {
                this.field10357 = null;
            }
            if (~super.field3958.field4973 != ~this.field10356) {
                int var3 = super.field3958.field4973 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field10367, var3);
                    var3 += 2;
                }
                if (!this.field10363.field5748) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field10355 = (float) (super.field3958.field4973 % 4000) / 4000.0F;
                }
                this.field10356 = super.field3958.field4973;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZII)V")
    public final void method79(boolean arg0, int arg1, int arg2) {
        ++field10365;
        if (this.field10364 != null) {
            if (arg0) {
                super.field3958.method2171(110, 1);
                if ((arg2 & 128) != 0) {
                    super.field3958.method2164(6, (class158) null);
                } else if ((1 & arg1) != 1) {
                    if (!this.field10363.field5748) {
                        super.field3958.method2164(6, this.field10363.field5741[0]);
                    } else {
                        super.field3958.method2164(6, this.field10363.field5742);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (!this.field10363.field5748) {
                    int var4 = super.field3958.field4973 % 4000 * 16 / 4000;
                    super.field3958.method2164(6, this.field10363.field5741[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field3958.method2164(6, this.field10363.field5742);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field10355, 0.0F, 0.0F, 1.0F);
                }
                super.field3958.method2171(113, 0);
                if (~(64 & arg2) != -1) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                } else {
                    class322.field4397[2] = super.field3958.field5077 * super.field3958.field5063;
                    class322.field4397[0] = super.field3958.field5092 * super.field3958.field5063;
                    class322.field4397[1] = super.field3958.field5063 * super.field3958.field5029;
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class322.field4397, 0);
                }
                int var5 = 3 & arg2;
                if (var5 != 2) {
                    if (~var5 != -4) {
                        OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                    }
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
    public static final void method4136(byte arg0) {
        if (arg0 < -28) {
            ++field10374;
            class705.field9940 = new class304(class608.field8624.method3543(-24350, class45.field748), "", class548.field7953, 1003, -1, 0L, 0, 0, true, false, 0L, true);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        ++field10359;
        if (arg0 <= 96) {
            method4139((class146) null, (byte) 68);
        }
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
    public static void method4137(int arg0) {
        if (arg0 != 6811) {
            field10371 = -63;
        }
        field10366 = null;
        field10362 = null;
        field10368 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)I")
    public static final int method4138(int arg0, int arg1) {
        if (arg0 != -28197) {
            return 45;
        } else {
            ++field10375;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lqk;B)Lqk;")
    public static final class146 method4139(class146 arg0, byte arg1) {
        ++field10358;
        if (arg0.field2109 != -1) {
            return class250.method1689(arg0.field2109, false);
        } else {
            if (arg1 != 126) {
                field10371 = -34;
            }
            int var2 = arg0.field2079 >>> 16;
            class756 var3 = new class756(class591.field8410);
            for (class182 var4 = (class182) var3.method4201(false); var4 != null; var4 = (class182) var3.method4198(1)) {
                if (~var4.field2505 == ~var2) {
                    return class250.method1689((int) var4.field6188, false);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    public final void method74(byte arg0) {
        ++field10370;
        if (this.field10364 != null) {
            this.field10364.method3185(122, '\u0001');
            super.field3958.method2171(112, 1);
            super.field3958.method2164(6, (class158) null);
            if (arg0 != 85) {
                this.method74((byte) 107);
            }
            super.field3958.method2171(110, 0);
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
    private final void method4140(int arg0) {
        this.field10364 = new class523(super.field3958, 2);
        ++field10354;
        this.field10364.method3184(0, arg0 ^ 15978);
        super.field3958.method2171(110, 1);
        super.field3958.method2123(-16777216, arg0 ^ -15968);
        super.field3958.method2149(-11771, 7681, 260);
        super.field3958.method2136(8960, 34166, 0, 770);
        super.field3958.method2171(118, 0);
        OpenGL.glBindProgramARB(34336, this.field10357.field9830);
        OpenGL.glEnable(34336);
        if (arg0 == -15966) {
            this.field10364.method3181(true);
            this.field10364.method3184(1, -119);
            super.field3958.method2171(119, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field3958.method2120(0, 47);
            super.field3958.method2136(arg0 + 24926, 5890, 0, 770);
            super.field3958.method2171(113, 0);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field10364.method3181(true);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lou;II)V")
    public final void method75(class158 arg0, int arg1, int arg2) {
        ++field10373;
        super.field3958.method2164(6, arg0);
        if (arg1 == 2) {
            super.field3958.method2120(arg2, arg1 + 55);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZI)V")
    public final void method73(boolean arg0, int arg1) {
        ++field10360;
        if (arg1 != 2) {
            this.method79(false, 65, -96);
        }
    }
}
