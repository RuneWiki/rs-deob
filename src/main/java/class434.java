import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class434 extends class402 {

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lod;")
    private class533 field5719;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lvea;")
    private class290 field5729;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "[F")
    private float[] field5739;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "Llf;")
    public static class251 field5732 = new class251(4, 1);

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Llja;")
    public static class744 field5736 = new class744(39, 3);

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "F")
    private float field5721;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    private int field5733;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Lpia;")
    private class104 field5737;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Lha;")
    public static class66 field5738;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Llc;")
    public static class675 field5720;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "[I")
    public static int[] field5725;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V", line = 7)
    public static final void method2567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5730;
        if (~class118.field1503.field10666.method1581(arg2 ^ arg2) != -1 && arg4 != 0 && ~class707.field9936 > -51 && ~arg5 != 0) {
            class415.field5422[class707.field9936++] = new class228((byte) 1, arg5, arg4, arg1, arg0, arg6, arg3, (class61) null);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBLfha;)V", line = 22)
    public final void method180(int arg0, byte arg1, class400 arg2) {
        super.field5243.method3936(false, arg2);
        ++field5735;
        super.field5243.method3932(arg0, (byte) -125);
        if (arg1 > -103) {
            this.field5721 = -0.017569728F;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZIII)V", line = 35)
    public static final void method2568(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field5722;
        if (!arg1) {
            float var5 = (float) class9.field179 / (float) class9.field166;
            int var6 = arg2;
            int var7 = arg0;
            if (!(var5 < 1.0F)) {
                var6 = (int) ((float) arg0 / var5);
            } else {
                var7 = (int) ((float) arg2 * var5);
            }
            int var8 = arg3 - (-var7 + arg0) / 2;
            int var9 = arg4 - (-var6 + arg2) / 2;
            class62.field850 = -(class9.field179 * var8 / var7) + class9.field179;
            class461.field6482 = -1;
            class580.field7912 = class9.field166 * var9 / var6;
            class683.field9348 = -1;
            class448.method2641(-1);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lpc;Lod;)V", line = 64)
    public class434(class700 arg0, class533 arg1) {
        super(arg0);
        this.field5719 = arg1;
        if (super.field5243.field9833 && ~super.field5243.field9798 <= -3) {
            this.field5729 = class784.method4343("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336, 28932, super.field5243);
            if (this.field5729 != null) {
                int[][] var3 = class114.method905(4, 256, 3, 0.4F, 4, false, 64, 6505, 0);
                int[][] var4 = class114.method905(4, 256, 3, 0.4F, 4, false, 64, 6505, 8);
                int var5 = 0;
                this.field5739 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field5739[var5++] = (float) var7[var9] / 4096.0F;
                        this.field5739[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2570(true);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 116)
    public static final void method2569(int arg0) {
        ++field5728;
        short var1 = 1024;
        short var2 = 3072;
        if (class502.field7084) {
            var2 = 4096;
            if (class96.field1252) {
                var1 = 2048;
            }
        }
        if ((float) var1 > class229.field2718) {
            class229.field2718 = (float) var1;
        }
        while (class47.field626 >= 16384.0F) {
            class47.field626 -= 16384.0F;
        }
        if (class229.field2718 > (float) var2) {
            class229.field2718 = (float) var2;
        }
        while (class47.field626 < 0.0F) {
            class47.field626 += 16384.0F;
        }
        int var3 = class713.field10000 >> 9;
        int var4 = class353.field4390 >> 9;
        if (arg0 >= -34) {
            method2569(-6);
        }
        int var5 = class483.method2867(class581.field7921, (byte) -94, class353.field4390, class713.field10000);
        int var6 = 0;
        if (~var3 < -4 && ~var4 < -4 && var3 < class596.field8090 - 4 && ~(class107.field1350 + -4) < ~var4) {
            for (int var7 = var3 + -4; var7 <= var3 + 4; ++var7) {
                for (int var8 = var4 + -4; var4 + 4 >= var8; ++var8) {
                    int var9 = class581.field7921;
                    if (var9 < 3 && class77.method708(var7, -184949524, var8)) {
                        ++var9;
                    }
                    int var10 = 0;
                    if (class441.field5923.field3334 != null && class441.field5923.field3334[var9] != null) {
                        var10 = (255 & class441.field5923.field3334[var9][var7][var8]) * 8 << 2;
                    }
                    if (class621.field8523 != null && class621.field8523[var9] != null) {
                        int var11 = var5 - -var10 - class621.field8523[var9].method1728(var8, (byte) -51, var7);
                        if (var11 > var6) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (~var12 < -786433) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (var12 <= class459.field6467) {
            if (class459.field6467 > var12) {
                class459.field6467 += (var12 - class459.field6467) / 80;
                return;
            }
        } else {
            class459.field6467 += (var12 - class459.field6467) / 24;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)Z", line = 221)
    public final boolean method178(byte arg0) {
        ++field5726;
        if (arg0 >= -55) {
            method2569(56);
        }
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IZ)V", line = 238)
    public final void method176(int arg0, boolean arg1) {
        if (arg0 > -32) {
            this.field5733 = -82;
        }
        ++field5723;
        if (this.field5737 != null) {
            this.field5737.method856(-120, '\u0000');
            super.field5243.method3925((byte) -101, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5243.field9761.method2633((byte) 74), 0);
            OpenGL.glMatrixMode(5888);
            super.field5243.method3925((byte) 24, 0);
            if (super.field5243.field9726 != this.field5733) {
                int var3 = super.field5243.field9726 % 5000 * 128 / 5000;
                for (int var4 = 0; ~var4 > -65; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field5739, var3);
                    var3 += 2;
                }
                if (this.field5719.field7506) {
                    this.field5721 = (float) (super.field5243.field9726 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field5733 = super.field5243.field9726;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 286)
    public final void method181(int arg0) {
        ++field5724;
        if (this.field5737 != null) {
            this.field5737.method856(arg0 + -120, '\u0001');
            super.field5243.method3925((byte) -115, 1);
            super.field5243.method3936(false, (class400) null);
            super.field5243.method3925((byte) -117, 0);
            if (arg0 != -1) {
                method2569(93);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V", line = 303)
    public final void method183(int arg0, int arg1, int arg2) {
        ++field5734;
        if (this.field5737 != null) {
            super.field5243.method3925((byte) -121, 1);
            if ((arg1 & 128) != 0) {
                super.field5243.method3936(false, (class400) null);
            } else if ((arg2 & 1) != 1) {
                if (this.field5719.field7506) {
                    super.field5243.method3936(false, this.field5719.field7509);
                } else {
                    super.field5243.method3936(false, this.field5719.field7508[0]);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else if (!this.field5719.field7506) {
                int var4 = super.field5243.field9726 % 4000 * 16 / 4000;
                super.field5243.method3936(false, this.field5719.field7508[var4]);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else {
                super.field5243.method3936(false, this.field5719.field7509);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field5721, 0.0F, 0.0F, 1.0F);
            }
            super.field5243.method3925((byte) 70, 0);
            if (~(arg1 & arg0) == -1) {
                class149.field1866[1] = super.field5243.field9857 * super.field5243.field9850;
                class149.field1866[0] = super.field5243.field9850 * super.field5243.field9781;
                class149.field1866[2] = super.field5243.field9850 * super.field5243.field9813;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class149.field1866, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = 3 & arg1;
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 == 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(IZ)V", line = 370)
    public final void method184(int arg0, boolean arg1) {
        if (arg0 == 64) {
            ++field5727;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 380)
    private final void method2570(boolean arg0) {
        ++field5731;
        this.field5737 = new class104(super.field5243, 2);
        this.field5737.method858(0, (byte) -128);
        super.field5243.method3925((byte) -117, 1);
        super.field5243.method3953(-16777216, -10);
        super.field5243.method3961(7681, 260, 16127);
        super.field5243.method3931(0, 8960, 770, 34166);
        super.field5243.method3925((byte) -110, 0);
        OpenGL.glBindProgramARB(34336, this.field5729.field3496);
        OpenGL.glEnable(34336);
        this.field5737.method857(0);
        this.field5737.method858(1, (byte) -121);
        super.field5243.method3925((byte) 113, 1);
        if (arg0) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field5243.method3932(0, (byte) 103);
            super.field5243.method3931(0, 8960, 770, 5890);
            super.field5243.method3925((byte) -107, 0);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field5737.method857(0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)V", line = 419)
    public static void method2571(boolean arg0) {
        if (!arg0) {
            field5738 = null;
        }
        field5725 = null;
        field5736 = null;
        field5738 = null;
        field5732 = null;
        field5720 = null;
    }
}
