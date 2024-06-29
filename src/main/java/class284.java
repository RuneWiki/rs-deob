import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class284 extends class503 {

    @OriginalMember(owner = "client!st", name = "r", descriptor = "Lha;")
    private class40 field4048;

    @OriginalMember(owner = "client!st", name = "y", descriptor = "Lth;")
    private class405 field4055;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "[F")
    private float[] field4049;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4050 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!st", name = "v", descriptor = "I")
    public static int field4052 = 0;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    private int field4046;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!st", name = "u", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!st", name = "w", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!st", name = "x", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!st", name = "z", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!st", name = "A", descriptor = "Lhe;")
    public static class239 field4057;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "Lhu;")
    private class81 field4043;

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lrl;Lha;)V", line = 4)
    public class284(class487 arg0, class40 arg1) {
        super(arg0);
        this.field4048 = arg1;
        if (super.field7679.field7447 && super.field7679.field7387 >= 2) {
            this.field4055 = class100.method606(34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", -25535, super.field7679);
            if (this.field4055 != null) {
                int[][] var3 = class8.method68((byte) -2, false, 3, 8, 256, 0.4F, 64, 0, 4);
                int[][] var4 = class8.method68((byte) -2, false, 3, 8, 256, 0.4F, 64, 8, 4);
                this.field4049 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field4049[var5++] = (float) var7[var9] / 4096.0F;
                        this.field4049[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1723(125);
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BZ)V", line = 52)
    public static final void method1722(byte arg0, boolean arg1) {
        if (class449.field6546 == null) {
            class449.field6546 = new byte[4][class362.field5442][class203.field2813];
        }
        ++field4042;
        if (!arg1) {
            field4053 = 17;
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; class362.field5442 > var3; ++var3) {
                for (int var4 = 0; var4 < class203.field2813; ++var4) {
                    class449.field6546[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)V", line = 88)
    public final void method629(byte arg0) {
        ++field4047;
        if (this.field4043 != null) {
            this.field4043.method523((byte) -36, '\u0001');
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2883((class221) null, -113);
            super.field7679.method2849(0, (byte) -109);
            if (arg0 != -122) {
                field4050 = null;
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZZ)V", line = 105)
    public final void method625(boolean arg0, boolean arg1) {
        ++field4054;
        if (arg0) {
            method1722((byte) 41, false);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)Z", line = 118)
    public final boolean method623(byte arg0) {
        if (arg0 < 45) {
            field4050 = null;
        }
        ++field4041;
        return true;
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V", line = 134)
    private final void method1723(int arg0) {
        this.field4043 = new class81(super.field7679, 2);
        ++field4040;
        this.field4043.method520(118, 0);
        super.field7679.method2849(1, (byte) -109);
        super.field7679.method2865(-16777216, -126);
        super.field7679.method2919(7681, 260, false);
        super.field7679.method2876(-397556104, 0, 770, 34166);
        super.field7679.method2849(0, (byte) -109);
        if (arg0 <= 64) {
            this.method1723(-102);
        }
        OpenGL.glBindProgramARB(34336, this.field4055.field5944);
        OpenGL.glEnable(34336);
        this.field4043.method522(false);
        this.field4043.method520(110, 1);
        super.field7679.method2849(1, (byte) -109);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field7679.method2914(127, 0);
        super.field7679.method2876(-397556104, 0, 770, 5890);
        super.field7679.method2849(0, (byte) -109);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field4043.method522(false);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)V", line = 167)
    public final void method627(boolean arg0, int arg1) {
        ++field4045;
        if (arg1 == -1805) {
            if (this.field4043 != null) {
                this.field4043.method523((byte) -64, '\u0000');
                super.field7679.method2849(1, (byte) -109);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field7679.field7452.method1579((byte) -53), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field7679.method2849(0, (byte) -109);
                if (super.field7679.field7316 != this.field4046) {
                    int var3 = super.field7679.field7316 % 5120 * 128 / 5120;
                    int var4 = var3 * 128;
                    for (int var5 = 0; var5 < 64; ++var5) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field4049, var4);
                        var4 += 2;
                    }
                    if (this.field4048.field615) {
                        float var6 = (float) (super.field7679.field7316 % 4000) / 4000.0F;
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field4046 = super.field7679.field7316;
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(B)V", line = 217)
    public static void method1724(byte arg0) {
        if (arg0 >= -63) {
            method1724((byte) 8);
        }
        field4050 = null;
        field4057 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IBLtu;)V", line = 239)
    public final void method626(int arg0, byte arg1, class221 arg2) {
        super.field7679.method2883(arg2, 44);
        if (arg1 <= -21) {
            ++field4044;
            super.field7679.method2914(124, arg0);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)V", line = 257)
    public final void method624(int arg0, int arg1, int arg2) {
        ++field4051;
        if (this.field4043 != null) {
            super.field7679.method2849(1, (byte) -109);
            int var4 = 75 % (arg0 / 59);
            if (~(128 & arg2) != -1) {
                super.field7679.method2883((class221) null, -110);
            } else if (!this.field4048.field615) {
                int var5 = super.field7679.field7316 % 4000 * 16 / 4000;
                super.field7679.method2883(this.field4048.field610[var5], -97);
            } else {
                super.field7679.method2883(this.field4048.field621, -112);
            }
            super.field7679.method2849(0, (byte) -109);
            if (~(64 & arg2) == -1) {
                OpenGL.glGetFloatv(2899, class410.field6019, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class410.field6019, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var6 = arg2 & 3;
            if (var6 != 2) {
                if (~var6 == -4) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
        }
    }
}
