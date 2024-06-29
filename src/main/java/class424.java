import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class424 extends class366 {

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "Lfj;")
    private class609 field6448;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "Led;")
    private class655 field6444;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "[F")
    private float[] field6452;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field6447 = 0;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "F")
    private float field6453;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    private int field6446;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "Lsr;")
    private class231 field6450;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)V")
    public final void method1133(boolean arg0, int arg1) {
        ++field6457;
        if (this.field6450 != null) {
            this.field6450.method1687('\u0000', arg1 + 4864);
            super.field5742.method834(true, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5742.field1364.method513(arg1 ^ -27428), arg1);
            OpenGL.glMatrixMode(5888);
            super.field5742.method834(true, 0);
            if (~super.field5742.field1330 != ~this.field6446) {
                int var3 = super.field5742.field1330 % 5000 * 128 / 5000;
                for (int var4 = 0; ~var4 > -65; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field6452, var3);
                    var3 += 2;
                }
                if (this.field6448.field8644) {
                    this.field6453 = (float) (super.field5742.field1330 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field6446 = super.field5742.field1330;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2690(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return true;
        } else {
            ++field6445;
            return (458752 & arg1) != 0 | class643.method3729(-1, arg1, arg2) || class247.method1758(arg1, -85, arg2);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public final void method1132(int arg0) {
        ++field6442;
        if (this.field6450 != null) {
            this.field6450.method1687('\u0001', 4864);
            super.field5742.method834(true, 1);
            super.field5742.method856(false, (class386) null);
            super.field5742.method834(true, arg0);
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ler;Lfj;)V")
    public class424(class92 arg0, class609 arg1) {
        super(arg0);
        this.field6448 = arg1;
        if (super.field5742.field1454 && ~super.field5742.field1369 <= -3) {
            this.field6444 = class375.method2466(34336, super.field5742, 0, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field6444 != null) {
                int[][] var3 = class332.method2254(0.4F, 3, 0, 4, 4, 64, 4096, false, 256);
                int[][] var4 = class332.method2254(0.4F, 3, 8, 4, 4, 64, 4096, false, 256);
                this.field6452 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field6452[var5++] = (float) var7[var9] / 4096.0F;
                        this.field6452[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2692((byte) -121);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
    public static final void method2691(int arg0) {
        ++field6454;
        if (class124.field2053 == null) {
            class154 var1 = new class154();
            byte[] var2 = var1.method1275(128, 128, 16, -111);
            class124.field2053 = class129.method1126(false, (byte) 68, var2);
        }
        if (arg0 != -11418) {
            field6451 = 79;
        }
        if (class442.field6730 == null) {
            class457 var3 = new class457();
            byte[] var4 = var3.method2867(arg0 + 11494, 16, 128, 128);
            class442.field6730 = class129.method1126(false, (byte) -41, var4);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
    public final void method1136(int arg0, int arg1, int arg2) {
        ++field6449;
        if (this.field6450 != null) {
            super.field5742.method834(true, 1);
            if ((128 & arg2) == 0) {
                if ((arg1 & 1) == 1) {
                    if (!this.field6448.field8644) {
                        int var4 = super.field5742.field1330 % 4000 * 16 / 4000;
                        super.field5742.method856(false, this.field6448.field8642[var4]);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        super.field5742.method856(false, this.field6448.field8647);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field6453, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (!this.field6448.field8644) {
                        super.field5742.method856(false, this.field6448.field8642[0]);
                    } else {
                        super.field5742.method856(false, this.field6448.field8647);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field5742.method856(false, (class386) null);
            }
            super.field5742.method834(true, 0);
            if (~(64 & arg2) == -1) {
                OpenGL.glGetFloatv(2899, class155.field2635, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class155.field2635, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            if (arg0 != -6561) {
                this.field6450 = null;
            }
            int var5 = arg2 & 3;
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 != 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)Z")
    public final boolean method1137(boolean arg0) {
        ++field6455;
        if (arg0) {
            method2691(41);
        }
        return true;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
    private final void method2692(byte arg0) {
        ++field6458;
        this.field6450 = new class231(super.field5742, 2);
        this.field6450.method1689(arg0 ^ 31988, 0);
        super.field5742.method834(true, 1);
        super.field5742.method893(-16777216, 104);
        super.field5742.method857(8960, 7681, 260);
        super.field5742.method820(34166, 770, 0, 121);
        super.field5742.method834(true, 0);
        if (arg0 != -121) {
            this.method1137(false);
        }
        OpenGL.glBindProgramARB(34336, this.field6444.field9156);
        OpenGL.glEnable(34336);
        this.field6450.method1690(-120);
        this.field6450.method1689(-31885, 1);
        super.field5742.method834(true, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field5742.method816(0, -125);
        super.field5742.method820(5890, 770, 0, 121);
        super.field5742.method834(true, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field6450.method1690(arg0 ^ 1);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZZ)V")
    public final void method1131(boolean arg0, boolean arg1) {
        ++field6443;
        if (!arg1) {
            field6447 = 106;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILep;I)V")
    public final void method1130(int arg0, class386 arg1, int arg2) {
        ++field6456;
        super.field5742.method856(false, arg1);
        super.field5742.method816(arg2, -127);
        if (arg0 != 1) {
            field6447 = -35;
        }
    }
}
