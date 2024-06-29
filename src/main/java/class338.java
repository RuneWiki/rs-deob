import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class338 extends class118 {

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Lkm;")
    private class120 field4952;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Lku;")
    private class494 field4954;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "[F")
    private float[] field4960;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "F")
    private float field4959;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    private int field4963;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Lni;")
    private class630 field4955;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "Lvv;")
    public static class640 field4956;

    static {
        new class487((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZB)V", line = 4)
    public final void method442(boolean arg0, byte arg1) {
        ++field4961;
        if (this.field4955 != null) {
            this.field4955.method3670('\u0000', false);
            super.field1544.method2842(1, (byte) 42);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field1544.field7081.method1594(77), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field1544.method2842(0, (byte) 42);
            if (arg1 > -101) {
                this.method442(false, (byte) 116);
            }
            if (super.field1544.field6961 != this.field4963) {
                int var3 = super.field1544.field6961 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; ~var5 > -65; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field4960, var4);
                    var4 += 2;
                }
                if (!this.field4952.field1555) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field4959 = (float) (super.field1544.field6961 % 4000) / 4000.0F;
                }
                this.field4963 = super.field1544.field6961;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 51)
    private final void method2101(int arg0) {
        ++field4962;
        this.field4955 = new class630(super.field1544, 2);
        this.field4955.method3673(0, -1);
        super.field1544.method2842(1, (byte) 42);
        super.field1544.method2843(-1, -16777216);
        super.field1544.method2852(260, (byte) 93, 7681);
        super.field1544.method2772(34166, 770, (byte) 125, 0);
        super.field1544.method2842(0, (byte) 42);
        OpenGL.glBindProgramARB(34336, this.field4954.field7452);
        OpenGL.glEnable(34336);
        if (arg0 == 27995) {
            this.field4955.method3674(true);
            this.field4955.method3673(1, -1);
            super.field1544.method2842(1, (byte) 42);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field1544.method2791(0, (byte) -51);
            super.field1544.method2772(5890, 770, (byte) -116, 0);
            super.field1544.method2842(0, (byte) 42);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field4955.method3674(true);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Los;Lkm;)V", line = 83)
    public class338(class468 arg0, class120 arg1) {
        super(arg0);
        this.field4952 = arg1;
        if (super.field1544.field7092 && ~super.field1544.field7035 <= -3) {
            this.field4954 = class167.method1063("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336, 53, super.field1544);
            if (this.field4954 != null) {
                int[][] var3 = class203.method1308(256, 0, false, 0.4F, 64, -35, 4, 8, 3);
                int[][] var4 = class203.method1308(256, 8, false, 0.4F, 64, -111, 4, 8, 3);
                this.field4960 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field4960[var5++] = (float) var7[var9] / 4096.0F;
                        this.field4960[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2101(27995);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBI)V", line = 129)
    public final void method445(int arg0, byte arg1, int arg2) {
        ++field4949;
        if (this.field4955 != null) {
            if (arg1 != 23) {
                this.method2101(-48);
            }
            super.field1544.method2842(1, (byte) 42);
            if (~(arg0 & 128) == -1) {
                if (~(arg2 & 1) == -2) {
                    if (!this.field4952.field1555) {
                        int var4 = super.field1544.field6961 % 4000 * 16 / 4000;
                        super.field1544.method2811(this.field4952.field1556[var4], -2);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        super.field1544.method2811(this.field4952.field1559, -2);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field4959, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (!this.field4952.field1555) {
                        super.field1544.method2811(this.field4952.field1556[0], -2);
                    } else {
                        super.field1544.method2811(this.field4952.field1559, -2);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field1544.method2811((class541) null, arg1 ^ -23);
            }
            super.field1544.method2842(0, (byte) 42);
            if (~(64 & arg0) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class232.field3428, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class232.field3428, 0);
            }
            int var5 = arg0 & 3;
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 == 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)Z", line = 198)
    public final boolean method446(byte arg0) {
        if (arg0 != 29) {
            field4956 = null;
        }
        ++field4957;
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 210)
    public final void method441(int arg0) {
        int var2 = -74 / ((-58 - arg0) / 41);
        ++field4950;
        if (this.field4955 != null) {
            this.field4955.method3670('\u0001', false);
            super.field1544.method2842(1, (byte) 42);
            super.field1544.method2811((class541) null, -2);
            super.field1544.method2842(0, (byte) 42);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lbaa;IB)V", line = 227)
    public final void method440(class541 arg0, int arg1, byte arg2) {
        ++field4953;
        if (arg2 <= -17) {
            super.field1544.method2811(arg0, -2);
            super.field1544.method2791(arg1, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZ)V", line = 243)
    public final void method439(byte arg0, boolean arg1) {
        ++field4958;
        if (arg0 != 56) {
            field4956 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/io/File;)[B", line = 253)
    public static final byte[] method2102(int arg0, File arg1) {
        if (arg0 >= -39) {
            return null;
        } else {
            ++field4951;
            return class29.method129((int) arg1.length(), 47, arg1);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V", line = 269)
    public static void method2103(int arg0) {
        field4956 = null;
        if (arg0 != 0) {
            method2102(-127, (File) null);
        }
    }
}
