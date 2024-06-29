import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class285 extends class648 {

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lde;")
    private class454 field3924;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lmv;")
    private class313 field3928;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "[F")
    private float[] field3922;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "[I")
    public static int[] field3916 = new int[2048];

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lcba;")
    public static class471 field3915 = new class471(21, 17);

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "F")
    private float field3927;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    private int field3919;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lud;")
    private class31 field3918;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BZ)V")
    public final void method944(byte arg0, boolean arg1) {
        ++field3929;
        if (arg0 > -111) {
            this.field3924 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BC)Z")
    public static final boolean method1824(byte arg0, char arg1) {
        if (arg0 > -42) {
            method1824((byte) -106, '_');
        }
        ++field3930;
        return arg1 >= '0' && ~arg1 >= -58 || arg1 >= 'A' && ~arg1 >= -91 || ~arg1 <= -98 && ~arg1 >= -123;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLmw;I)V")
    public final void method942(byte arg0, class418 arg1, int arg2) {
        super.field9395.method3358(32886, arg1);
        if (arg0 != -30) {
            field3916 = null;
        }
        ++field3925;
        super.field9395.method3396((byte) -27, arg2);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
    public final void method947(int arg0, boolean arg1) {
        ++field3926;
        if (this.field3918 != null) {
            this.field3918.method317('\u0000', true);
            if (arg0 != 17729) {
                this.method944((byte) -119, true);
            }
            super.field9395.method3398(arg0 ^ -17717, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field9395.field8314.method1746((byte) 30), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field9395.method3398(-107, 0);
            if (~super.field9395.field8202 != ~this.field3919) {
                int var3 = super.field9395.field8202 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; ~var5 > -65; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field3922, var4);
                    var4 += 2;
                }
                if (!this.field3924.field6411) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field3927 = (float) (super.field9395.field8202 % 4000) / 4000.0F;
                }
                this.field3919 = super.field9395.field8202;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lgi;Lde;)V")
    public class285(class583 arg0, class454 arg1) {
        super(arg0);
        this.field3924 = arg1;
        if (super.field9395.field8301 && super.field9395.field8258 >= 2) {
            this.field3928 = class568.method3230(0, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336, super.field9395);
            if (this.field3928 != null) {
                int[][] var3 = class374.method2219(4, 8, 0.4F, 3, 22106, false, 64, 256, 0);
                int[][] var4 = class374.method2219(4, 8, 0.4F, 3, 22106, false, 64, 256, 8);
                this.field3922 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field3922[var5++] = (float) var7[var9] / 4096.0F;
                        this.field3922[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1825(97);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
    public final void method945(int arg0, int arg1, int arg2) {
        ++field3923;
        if (this.field3918 != null) {
            super.field9395.method3398(-56, 1);
            if ((arg1 & 128) != 0) {
                super.field9395.method3358(32886, (class418) null);
            } else if ((arg0 & 1) != 1) {
                if (this.field3924.field6411) {
                    super.field9395.method3358(32886, this.field3924.field6410);
                } else {
                    super.field9395.method3358(32886, this.field3924.field6419[0]);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else if (this.field3924.field6411) {
                super.field9395.method3358(32886, this.field3924.field6410);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field3927, 0.0F, 0.0F, 1.0F);
            } else {
                int var4 = super.field9395.field8202 % 4000 * 16 / 4000;
                super.field9395.method3358(32886, this.field3924.field6419[var4]);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field9395.method3398(-75, 0);
            if (~(arg1 & 64) == -1) {
                OpenGL.glGetFloatv(2899, class63.field1089, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class63.field1089, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = 85 / ((30 - arg2) / 56);
            int var6 = 3 & arg1;
            if (~var6 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var6 != -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    private final void method1825(int arg0) {
        this.field3918 = new class31(super.field9395, 2);
        ++field3920;
        this.field3918.method320(-28457, 0);
        super.field9395.method3398(-117, 1);
        super.field9395.method3362(-16777216, 12432);
        super.field9395.method3389(false, 260, 7681);
        super.field9395.method3340(770, 0, 34166, 1);
        super.field9395.method3398(-56, 0);
        OpenGL.glBindProgramARB(34336, this.field3928.field4220);
        int var2 = -22 % ((arg0 - 61) / 33);
        OpenGL.glEnable(34336);
        this.field3918.method321(2);
        this.field3918.method320(-28457, 1);
        super.field9395.method3398(-61, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field9395.method3396((byte) 109, 0);
        super.field9395.method3340(770, 0, 5890, 1);
        super.field9395.method3398(-43, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field3918.method321(2);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
    public final boolean method946(int arg0) {
        ++field3917;
        if (arg0 < 122) {
            this.method942((byte) 74, (class418) null, 70);
        }
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public static void method1826(int arg0) {
        field3915 = null;
        if (arg0 == -65) {
            field3916 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public final void method941(int arg0) {
        ++field3921;
        if (this.field3918 != null) {
            this.field3918.method317('\u0001', true);
            super.field9395.method3398(-98, 1);
            if (arg0 != 1) {
                this.method946(75);
            }
            super.field9395.method3358(32886, (class418) null);
            super.field9395.method3398(-128, 0);
        }
    }
}
