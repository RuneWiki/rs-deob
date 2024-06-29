import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class117 extends class45 {

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Lm;")
    private class127 field1625;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Ltd;")
    private class315 field1623;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "[F")
    private float[] field1629;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "Lct;")
    private class98 field1634;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)V")
    public final void method281(int arg0, boolean arg1) {
        ++field1635;
        if (this.field1634 != null) {
            this.field1634.method832('\u0000', -1);
            super.field506.method2219(1, -118);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field506.field5394.method1553(arg0), arg0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field506.method2219(0, -119);
            if (super.field506.field5306 != this.field1631) {
                int var3 = super.field506.field5306 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field1629, var4);
                    var4 += 2;
                }
                if (!this.field1625.field1845) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    float var6 = (float) (super.field506.field5306 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                }
                this.field1631 = super.field506.field5306;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)Z")
    public final boolean method280(boolean arg0) {
        ++field1628;
        return !arg0 ? true : true;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZB)V")
    public final void method279(boolean arg0, byte arg1) {
        if (arg1 >= 115) {
            ++field1627;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
    public final void method286(int arg0, int arg1, int arg2) {
        ++field1630;
        if (this.field1634 != null) {
            if (arg1 >= 76) {
                super.field506.method2219(1, -120);
                if (~(128 & arg0) == -1) {
                    if (this.field1625.field1845) {
                        super.field506.method2188((byte) 78, this.field1625.field1850);
                    } else {
                        int var4 = super.field506.field5306 % 4000 * 16 / 4000;
                        super.field506.method2188((byte) 78, this.field1625.field1848[var4]);
                    }
                } else {
                    super.field506.method2188((byte) 78, (class396) null);
                }
                super.field506.method2219(0, -124);
                if (~(arg0 & 64) == -1) {
                    OpenGL.glGetFloatv(2899, class336.field4675, 0);
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class336.field4675, 0);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                }
                int var5 = arg0 & 3;
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

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public final void method287(int arg0) {
        ++field1636;
        if (this.field1634 != null) {
            this.field1634.method832('\u0001', ~arg0);
            super.field506.method2219(1, -118);
            super.field506.method2188((byte) 78, (class396) null);
            super.field506.method2219(arg0, -120);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILkj;Z)V")
    public final void method285(int arg0, class396 arg1, boolean arg2) {
        ++field1632;
        super.field506.method2188((byte) 78, arg1);
        if (!arg2) {
            method925(-18, 71, -107, -62);
        }
        super.field506.method2183(7681, arg0);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lfd;Lm;)V")
    public class117(class365 arg0, class127 arg1) {
        super(arg0);
        this.field1625 = arg1;
        if (super.field506.field5361 && super.field506.field5405 >= 2) {
            this.field1623 = class371.method2290(34336, (byte) 62, super.field506, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field1623 != null) {
                int[][] var3 = class318.method1983(0, 64, 4, 8, false, (byte) -94, 256, 0.4F, 3);
                int[][] var4 = class318.method1983(8, 64, 4, 8, false, (byte) -128, 256, 0.4F, 3);
                int var5 = 0;
                this.field1629 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field1629[var5++] = (float) var7[var9] / 4096.0F;
                        this.field1629[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method926((byte) -104);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)I")
    public static final int method925(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 2) {
            return -122;
        } else {
            ++field1626;
            if (arg3 > 243) {
                arg0 >>= 4;
            } else if (~arg3 >= -218) {
                if (arg3 > 192) {
                    arg0 >>= 2;
                } else if (~arg3 < -180) {
                    arg0 >>= 1;
                }
            } else {
                arg0 >>= 3;
            }
            return (arg3 >> 1) + (((63 & arg1 >> 2) << 10) - -(arg0 >> 5 << 7));
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
    private final void method926(byte arg0) {
        this.field1634 = new class98(super.field506, 2);
        ++field1624;
        if (arg0 >= -91) {
            this.field1634 = null;
        }
        this.field1634.method833(0, true);
        super.field506.method2219(1, -127);
        super.field506.method2184((byte) -100, -16777216);
        super.field506.method2195(260, 7681, true);
        super.field506.method2237(true, 770, 34166, 0);
        super.field506.method2219(0, -119);
        OpenGL.glBindProgramARB(34336, this.field1623.field4480);
        OpenGL.glEnable(34336);
        this.field1634.method834((byte) 39);
        this.field1634.method833(1, true);
        super.field506.method2219(1, -118);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field506.method2183(7681, 0);
        super.field506.method2237(true, 770, 5890, 0);
        super.field506.method2219(0, -120);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field1634.method834((byte) 39);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method927(String arg0, int arg1) {
        ++field1633;
        if (!arg0.equals("")) {
            class32.method258(-56, class351.field4863);
            if (arg1 == 65) {
                ++class250.field3686;
                class472.field6970.method638(255, class494.method2962(arg0, (byte) -78));
                class472.field6970.method605(63, arg0);
            }
        }
    }
}
