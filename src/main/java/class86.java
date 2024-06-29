import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class86 extends class318 {

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "Luo;")
    private class408 field1243;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "Lrm;")
    private class284 field1240;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[F")
    private float[] field1229;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lee;")
    public static class480 field1228 = new class480("stellardawn", 1);

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "F")
    public static float field1237;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Lrn;")
    private class178 field1230;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lav;IB)V")
    public final void method715(class454 arg0, int arg1, byte arg2) {
        super.field4800.method1289(-19391, arg0);
        ++field1239;
        super.field4800.method1248(arg1, true);
        if (arg2 > -108) {
            this.field1243 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    private final void method716(int arg0) {
        ++field1232;
        this.field1230 = new class178(super.field4800, 2);
        this.field1230.method1192(0, (byte) -49);
        super.field4800.method1307(1, (byte) 92);
        super.field4800.method1292(-16777216, false);
        super.field4800.method1242(arg0 ^ -54350, 7681, 260);
        super.field4800.method1296(770, 34166, 0, (byte) -120);
        super.field4800.method1307(0, (byte) 92);
        OpenGL.glBindProgramARB(34336, this.field1240.field4316);
        OpenGL.glEnable(34336);
        this.field1230.method1196(110);
        this.field1230.method1192(1, (byte) 104);
        super.field4800.method1307(1, (byte) 92);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field4800.method1248(0, true);
        super.field4800.method1296(770, 5890, 0, (byte) -79);
        super.field4800.method1307(0, (byte) 92);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field1230.method1196(110);
        if (arg0 != -20800) {
            this.method718(false, true);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static void method717(boolean arg0) {
        field1228 = null;
        if (arg0) {
            method717(false);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZ)V")
    public final void method718(boolean arg0, boolean arg1) {
        ++field1233;
        if (this.field1230 != null) {
            this.field1230.method1191('\u0000', (byte) 97);
            super.field4800.method1307(1, (byte) 92);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field4800.field3061.method2073(-48), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            if (arg1) {
                this.method715((class454) null, -91, (byte) -44);
            }
            OpenGL.glMatrixMode(5888);
            super.field4800.method1307(0, (byte) 92);
            if (~super.field4800.field3027 != ~this.field1231) {
                int var3 = super.field4800.field3027 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; ~var5 > -65; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field1229, var4);
                    var4 += 2;
                }
                if (this.field1243.field6091) {
                    float var6 = (float) (super.field4800.field3027 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field1231 = super.field4800.field3027;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
    public final void method719(int arg0, int arg1, int arg2) {
        ++field1241;
        if (this.field1230 != null) {
            super.field4800.method1307(1, (byte) 92);
            if ((128 & arg1) != 0) {
                super.field4800.method1289(-19391, (class454) null);
            } else if (!this.field1243.field6091) {
                int var4 = super.field4800.field3027 % 4000 * 16 / 4000;
                super.field4800.method1289(-19391, this.field1243.field6090[var4]);
            } else {
                super.field4800.method1289(-19391, this.field1243.field6093);
            }
            super.field4800.method1307(arg2, (byte) 92);
            if (~(64 & arg1) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class440.field6449, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class440.field6449, 0);
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

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)Z")
    public static final boolean method720(int arg0, int arg1, int arg2) {
        ++field1234;
        if (arg2 >= -113) {
            return true;
        } else {
            return ~(arg0 & 384) != -1;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
    public final boolean method721(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field1236;
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lkd;Luo;)V")
    public class86(class188 arg0, class408 arg1) {
        super(arg0);
        this.field1243 = arg1;
        if (super.field4800.field3074 && super.field4800.field3097 >= 2) {
            this.field1240 = class46.method473(34336, (byte) 52, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field4800);
            if (this.field1240 != null) {
                int[][] var3 = class505.method3012(64, 0, 3, -122, false, 8, 0.4F, 4, 256);
                int[][] var4 = class505.method3012(64, 8, 3, -123, false, 8, 0.4F, 4, 256);
                int var5 = 0;
                this.field1229 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field1229[var5++] = (float) var7[var9] / 4096.0F;
                        this.field1229[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method716(-20800);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
    public final void method722(int arg0, boolean arg1) {
        int var3 = 82 / ((arg0 - -23) / 46);
        ++field1238;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public final void method723(byte arg0) {
        if (arg0 <= 91) {
            field1228 = null;
        }
        ++field1235;
        if (this.field1230 != null) {
            this.field1230.method1191('\u0001', (byte) -126);
            super.field4800.method1307(1, (byte) 92);
            super.field4800.method1289(-19391, (class454) null);
            super.field4800.method1307(0, (byte) 92);
        }
    }
}
