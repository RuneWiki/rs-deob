import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class99 extends class165 {

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Lfa;")
    private class565 field1428;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "Lsea;")
    private class282 field1436;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "[F")
    private float[] field1434;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field1429 = -1;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Lqk;")
    public static class148 field1432 = new class148(44, -1);

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "F")
    private float field1439;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Lrj;")
    private class359 field1445;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1441;
        float var5 = (float) class531.field7449 / (float) class531.field7442;
        int var6 = arg4;
        int var7 = arg1;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg2 - (-var7 + arg1) / 2;
        int var9 = arg3 - (-var6 + arg4) / 2;
        class538.field7524 = class531.field7442 * var9 / var6;
        class313.field4031 = -1;
        class429.field5920 = -1;
        class29.field372 = -(class531.field7449 * var8 / var7) + class531.field7449;
        if (arg0 != -18747) {
            field1432 = null;
        }
        class577.method3446((byte) -109);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 35)
    public static void method669(int arg0) {
        field1432 = null;
        int var1 = 37 % ((4 - arg0) / 63);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Z", line = 51)
    public static final boolean method670(int arg0, int arg1) {
        ++field1430;
        for (class6 var2 = (class6) class478.field6510.method3118((byte) 73); var2 != null; var2 = (class6) class478.field6510.method3111(126)) {
            if (class462.method2765((byte) -106, var2.field60) && (long) arg1 == var2.field47) {
                return true;
            }
        }
        if (arg0 != -65) {
            method676(-92, (Random) null, 2);
        }
        return false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZLhl;)V", line = 73)
    public final void method671(int arg0, boolean arg1, class396 arg2) {
        if (!arg1) {
            this.field1434 = null;
        }
        super.field2260.method2154(arg2, -2);
        ++field1440;
        super.field2260.method2208(arg0, 6406);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)Z", line = 85)
    public final boolean method672(byte arg0) {
        ++field1437;
        if (arg0 < 11) {
            field1432 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)V", line = 98)
    public final void method673(int arg0, boolean arg1) {
        ++field1435;
        if (this.field1445 != null) {
            this.field1445.method2021(-108, '\u0000');
            super.field2260.method2196(1, (byte) 89);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2260.field4984.method2624(-8914), 0);
            if (arg0 > -115) {
                this.method672((byte) -77);
            }
            OpenGL.glMatrixMode(5888);
            super.field2260.method2196(0, (byte) 89);
            if (~super.field2260.field4947 != ~this.field1442) {
                int var3 = super.field2260.field4947 % 5000 * 128 / 5000;
                for (int var4 = 0; ~var4 > -65; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field1434, var3);
                    var3 += 2;
                }
                if (this.field1428.field8037) {
                    this.field1439 = (float) (super.field2260.field4947 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field1442 = super.field2260.field4947;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)Z", line = 149)
    public static final boolean method674(int arg0) {
        if (arg0 != 18289) {
            field1429 = 94;
        }
        ++field1431;
        if (class668.field9408) {
            try {
                if ((Boolean) class208.method1378("showingVideoAd", class622.field8847, -9875)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBI)V", line = 168)
    public final void method675(int arg0, byte arg1, int arg2) {
        ++field1446;
        if (arg1 < 3) {
            this.method677((byte) 79);
        }
        if (this.field1445 != null) {
            super.field2260.method2196(1, (byte) 89);
            if (~(arg0 & 128) == -1) {
                if ((arg2 & 1) != 1) {
                    if (!this.field1428.field8037) {
                        super.field2260.method2154(this.field1428.field8034[0], -2);
                    } else {
                        super.field2260.method2154(this.field1428.field8036, -2);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (this.field1428.field8037) {
                    super.field2260.method2154(this.field1428.field8036, -2);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field1439, 0.0F, 0.0F, 1.0F);
                } else {
                    int var4 = super.field2260.field4947 % 4000 * 16 / 4000;
                    super.field2260.method2154(this.field1428.field8034[var4], -2);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field2260.method2154((class396) null, -2);
            }
            super.field2260.method2196(0, (byte) 89);
            if ((arg0 & 64) != 0) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                class753.field10460[2] = super.field2260.field5046 * super.field2260.field5035;
                class753.field10460[0] = super.field2260.field5046 * super.field2260.field5015;
                class753.field10460[1] = super.field2260.field5046 * super.field2260.field5024;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class753.field10460, 0);
            }
            int var5 = 3 & arg0;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 == 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 239)
    public static final int method676(int arg0, Random arg1, int arg2) {
        ++field1444;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class447.method2664(0, arg0)) {
            return (int) ((long) arg0 * (4294967295L & (long) arg1.nextInt()) >> 32);
        } else {
            if (arg2 >= -36) {
                method668(56, -43, -27, 45, -97);
            }
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (~var3 >= ~var4);
            return class611.method3569(2439, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V", line = 272)
    private final void method677(byte arg0) {
        this.field1445 = new class359(super.field2260, 2);
        ++field1443;
        this.field1445.method2024(0, 51);
        super.field2260.method2196(1, (byte) 89);
        super.field2260.method2212((byte) -124, -16777216);
        super.field2260.method2207(260, 7681, -25248);
        super.field2260.method2190(0, 770, true, 34166);
        super.field2260.method2196(0, (byte) 89);
        OpenGL.glBindProgramARB(34336, this.field1436.field3742);
        OpenGL.glEnable(34336);
        this.field1445.method2022(0);
        this.field1445.method2024(1, 110);
        super.field2260.method2196(1, (byte) 89);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (arg0 < -29) {
            super.field2260.method2208(0, 6406);
            super.field2260.method2190(0, 770, true, 5890);
            super.field2260.method2196(0, (byte) 89);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field1445.method2022(0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)V", line = 305)
    public final void method678(boolean arg0, int arg1) {
        ++field1433;
        if (arg1 != 0) {
            this.method678(true, 54);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V", line = 316)
    public final void method679(byte arg0) {
        ++field1438;
        if (this.field1445 != null) {
            this.field1445.method2021(-100, '\u0001');
            if (arg0 > -97) {
                this.method672((byte) -4);
            }
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2154((class396) null, -2);
            super.field2260.method2196(0, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lep;Lfa;)V", line = 333)
    public class99(class371 arg0, class565 arg1) {
        super(arg0);
        this.field1428 = arg1;
        if (super.field2260.field5054 && super.field2260.field5074 >= 2) {
            this.field1436 = class213.method1407(34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field2260, 59);
            if (this.field1436 != null) {
                int[][] var3 = class298.method1756(64, 0, 0, 4, 256, false, 4, 3, 0.4F);
                int[][] var4 = class298.method1756(64, 0, 8, 4, 256, false, 4, 3, 0.4F);
                int var5 = 0;
                this.field1434 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field1434[var5++] = (float) var7[var9] / 4096.0F;
                        this.field1434[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method677((byte) -33);
            }
        }
    }
}
