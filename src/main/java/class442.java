import jaggl.OpenGL;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class442 extends class261 {

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Ljq;")
    private class264 field6581;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "Lbh;")
    private class304 field6593;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[F")
    private float[] field6594;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "Lvv;")
    public static class313 field6591 = new class313(45, 2);

    @OriginalMember(owner = "client!il", name = "y", descriptor = "Llo;")
    public static class306 field6597 = new class306("K", "T", "K", "K");

    @OriginalMember(owner = "client!il", name = "z", descriptor = "[S")
    public static short[] field6598 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!il", name = "x", descriptor = "F")
    private float field6596;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    private int field6586;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lcs;")
    private class426 field6580;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method1022(int arg0, boolean arg1) {
        ++field6589;
        int var3 = -13 % ((87 - arg0) / 37);
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V", line = 15)
    private final void method2660(int arg0) {
        if (arg0 != 45) {
            field6597 = null;
        }
        ++field6582;
        this.field6580 = new class426(super.field4358, 2);
        this.field6580.method2604(arg0 ^ 35, 0);
        super.field4358.method1440(1, 0);
        super.field4358.method1427(-16777216, false);
        super.field4358.method1482(260, 8960, 7681);
        super.field4358.method1484(34166, 0, 770, arg0 ^ 34213);
        super.field4358.method1440(0, 0);
        OpenGL.glBindProgramARB(34336, this.field6593.field4864);
        OpenGL.glEnable(34336);
        this.field6580.method2601((byte) 122);
        this.field6580.method2604(14, 1);
        super.field4358.method1440(1, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field4358.method1410(0, arg0 ^ 7724);
        super.field4358.method1484(5890, 0, 770, arg0 ^ 34213);
        super.field4358.method1440(0, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field6580.method2601((byte) 122);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILkk;)V", line = 47)
    public final void method1024(int arg0, int arg1, class179 arg2) {
        super.field4358.method1471(true, arg2);
        ++field6584;
        super.field4358.method1410(arg0, 7681);
        int var4 = -52 % ((arg1 - 21) / 36);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 58)
    public static void method2661(byte arg0) {
        field6597 = null;
        field6598 = null;
        if (arg0 >= -105) {
            field6597 = null;
        }
        field6591 = null;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V", line = 71)
    public final void method1023(int arg0) {
        ++field6587;
        if (this.field6580 != null) {
            this.field6580.method2603('\u0001', -17213);
            if (arg0 != 5000) {
                method2663(-43, 6, 59);
            }
            super.field4358.method1440(1, 0);
            super.field4358.method1471(true, (class179) null);
            super.field4358.method1440(0, 0);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZB)V", line = 92)
    public final void method1020(boolean arg0, byte arg1) {
        ++field6585;
        if (this.field6580 != null) {
            this.field6580.method2603('\u0000', -17213);
            super.field4358.method1440(1, 0);
            if (arg1 >= 23) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field4358.field3675.method1675(85), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field4358.method1440(0, 0);
                if (super.field4358.field3602 != this.field6586) {
                    int var3 = super.field4358.field3602 % 5120 * 128 / 5120;
                    int var4 = var3 * 128;
                    for (int var5 = 0; var5 < 64; ++var5) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field6594, var4);
                        var4 += 2;
                    }
                    if (!this.field6581.field4409) {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        this.field6596 = (float) (super.field4358.field3602 % 4000) / 4000.0F;
                    }
                    this.field6586 = super.field4358.field3602;
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Z", line = 140)
    public final boolean method1026(int arg0) {
        ++field6592;
        if (arg0 <= 69) {
            this.field6580 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILnv;ILjava/awt/Component;I)Lfl;", line = 153)
    public static final class75 method2662(int arg0, class493 arg1, int arg2, Component arg3, int arg4) {
        ++field6583;
        if (class12.field141 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (~arg2 > -257) {
                arg2 = 256;
            }
            try {
                class75 var5 = (class75) Class.forName("fs").newInstance();
                var5.field1280 = new int[256 * (class175.field2777 ? 2 : 1)];
                var5.field1293 = arg2;
                var5.method530(arg3);
                var5.field1297 = (arg2 & -1024) + 1024;
                if (~var5.field1297 < -16385) {
                    var5.field1297 = 16384;
                }
                var5.method525(var5.field1297);
                if (~class396.field6052 < -1 && class471.field6995 == null) {
                    class471.field6995 = new class332();
                    class471.field6995.field5228 = arg1;
                    arg1.method2874(-27, class471.field6995, class396.field6052);
                }
                if (class471.field6995 != null) {
                    if (class471.field6995.field5222[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class471.field6995.field5222[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class478 var6 = new class478(arg1, arg0);
                    var6.field1293 = arg2;
                    var6.field1280 = new int[256 * (!class175.field2777 ? 1 : 2)];
                    var6.method530(arg3);
                    var6.field1297 = 16384;
                    var6.method525(var6.field1297);
                    if (~class396.field6052 < arg4 && class471.field6995 == null) {
                        class471.field6995 = new class332();
                        class471.field6995.field5228 = arg1;
                        arg1.method2874(arg4 + 2, class471.field6995, class396.field6052);
                    }
                    if (class471.field6995 != null) {
                        if (class471.field6995.field5222[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class471.field6995.field5222[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class75();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V", line = 242)
    public final void method1021(int arg0, int arg1, int arg2) {
        ++field6588;
        if (this.field6580 != null) {
            int var4 = -16 / ((82 - arg1) / 41);
            super.field4358.method1440(1, 0);
            if ((arg2 & 128) != 0) {
                super.field4358.method1471(true, (class179) null);
            } else if ((1 & arg0) != 1) {
                if (this.field6581.field4409) {
                    super.field4358.method1471(true, this.field6581.field4410);
                } else {
                    super.field4358.method1471(true, this.field6581.field4414[0]);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else if (this.field6581.field4409) {
                super.field4358.method1471(true, this.field6581.field4410);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field6596, 0.0F, 0.0F, 1.0F);
            } else {
                int var5 = super.field4358.field3602 % 4000 * 16 / 4000;
                super.field4358.method1471(true, this.field6581.field4414[var5]);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field4358.method1440(0, 0);
            if ((arg2 & 64) == 0) {
                OpenGL.glGetFloatv(2899, class20.field223, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class20.field223, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var6 = arg2 & 3;
            if (~var6 != -3) {
                if (~var6 != -4) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(III)I", line = 311)
    public static final int method2663(int arg0, int arg1, int arg2) {
        int var3 = -53 / ((-54 - arg2) / 33);
        ++field6595;
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 ^ var4 << 13;
        int var6 = (var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE;
        return (133943274 & var6) >> 19;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V", line = 326)
    public static final void method2664(int arg0, int arg1) {
        if (arg1 > arg0 || arg0 > 2) {
            arg0 = 0;
        }
        ++field6590;
        class314.field4944 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lih;Ljq;)V", line = 342)
    public class442(class214 arg0, class264 arg1) {
        super(arg0);
        this.field6581 = arg1;
        if (super.field4358.field3684 && super.field4358.field3722 >= 2) {
            this.field6593 = class263.method1752(super.field4358, 19652, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field6593 != null) {
                int[][] var3 = class325.method2044(0, 64, 256, -124, false, 8, 3, 4, 0.4F);
                int[][] var4 = class325.method2044(8, 64, 256, -123, false, 8, 3, 4, 0.4F);
                this.field6594 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field6594[var5++] = (float) var7[var9] / 4096.0F;
                        this.field6594[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2660(45);
            }
        }
    }
}
