import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class169 extends class301 {

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "Lwo;")
    private class722 field2252;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "Loca;")
    private class296 field2244;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "[F")
    private float[] field2236;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "Lk;")
    public static class66 field2235 = new class66("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "Lgp;")
    public static class576 field2250 = new class576(8, 1);

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "Lrn;")
    public static class633 field2253 = new class633(10, 3);

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "F")
    private float field2254;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    private int field2238;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "Lwm;")
    public static class30 field2248;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "Lnc;")
    private class516 field2241;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    private final void method1070(int arg0) {
        ++field2242;
        this.field2241 = new class516(super.field3803, 2);
        this.field2241.method2857(0, (byte) -105);
        super.field3803.method3945(1, false);
        super.field3803.method3921(-16777216, 7077);
        super.field3803.method3917(74, 260, 7681);
        super.field3803.method3922(0, 1, 770, 34166);
        super.field3803.method3945(0, false);
        OpenGL.glBindProgramARB(34336, this.field2244.field3755);
        OpenGL.glEnable(34336);
        this.field2241.method2856((byte) -115);
        this.field2241.method2857(1, (byte) -107);
        super.field3803.method3945(1, false);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        if (arg0 != 8221) {
            this.method28((class128) null, -90, -73);
        }
        OpenGL.glMatrixMode(5888);
        super.field3803.method3979((byte) 98, 0);
        super.field3803.method3922(0, 1, 770, 5890);
        super.field3803.method3945(0, false);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field2241.method2856((byte) -106);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)V")
    public final void method22(int arg0, int arg1, int arg2) {
        ++field2239;
        if (this.field2241 != null) {
            super.field3803.method3945(1, false);
            if (~(arg1 & 128) != -1) {
                super.field3803.method3975((byte) 116, (class128) null);
            } else if (~(arg0 & 1) == -2) {
                if (!this.field2252.field9478) {
                    int var4 = super.field3803.field9807 % 4000 * 16 / 4000;
                    super.field3803.method3975((byte) 124, this.field2252.field9479[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field3803.method3975((byte) 126, this.field2252.field9483);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field2254, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (!this.field2252.field9478) {
                    super.field3803.method3975((byte) 125, this.field2252.field9479[0]);
                } else {
                    super.field3803.method3975((byte) 123, this.field2252.field9483);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field3803.method3945(arg2, false);
            if (~(arg1 & 64) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                class298.field3772[1] = super.field3803.field9899 * super.field3803.field9870;
                class298.field3772[2] = super.field3803.field9921 * super.field3803.field9870;
                class298.field3772[0] = super.field3803.field9901 * super.field3803.field9870;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class298.field3772, 0);
            }
            int var5 = 3 & arg1;
            if (~var5 != -3) {
                if (var5 == 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lck;Lwo;)V")
    public class169(class733 arg0, class722 arg1) {
        super(arg0);
        this.field2252 = arg1;
        if (super.field3803.field9849 && ~super.field3803.field9846 <= -3) {
            this.field2244 = class416.method2407("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field3803, 34336, 34933);
            if (this.field2244 != null) {
                int[][] var3 = class485.method2719(4, 64, 0.4F, false, 3, 4, (byte) 91, 256, 0);
                int[][] var4 = class485.method2719(4, 64, 0.4F, false, 3, 4, (byte) 91, 256, 8);
                int var5 = 0;
                this.field2236 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field2236[var5++] = (float) var7[var9] / 4096.0F;
                        this.field2236[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1070(8221);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)Z")
    public final boolean method25(byte arg0) {
        if (arg0 < 7) {
            this.method22(112, 122, 3);
        }
        ++field2245;
        return true;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILmc;)Liv;")
    public static final class26 method1071(int arg0, class234 arg1) {
        ++field2240;
        class14 var2 = class600.method3240(-8314, arg1);
        int var3 = arg1.method1553((byte) 116);
        int var4 = arg1.method1553((byte) -128);
        int var5 = arg1.method1553((byte) 17);
        if (arg0 != 1) {
            return null;
        } else {
            int var6 = arg1.method1553((byte) -118);
            int var7 = arg1.method1553((byte) 30);
            int var8 = arg1.method1553((byte) -118);
            return new class26(var2.field149, var2.field143, var2.field144, var2.field151, var2.field140, var2.field141, var2.field146, var2.field150, var2.field142, var3, var4, var5, var6, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(IZ)V")
    public final void method27(int arg0, boolean arg1) {
        if (arg0 == 0) {
            ++field2243;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V")
    public final void method29(int arg0, boolean arg1) {
        ++field2246;
        if (arg0 < 18) {
            this.method1070(-2);
        }
        if (this.field2241 != null) {
            this.field2241.method2855(4864, '\u0000');
            super.field3803.method3945(1, false);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3803.field9840.method455(87), 0);
            OpenGL.glMatrixMode(5888);
            super.field3803.method3945(0, false);
            if (~super.field3803.field9807 != ~this.field2238) {
                int var3 = super.field3803.field9807 % 5000 * 128 / 5000;
                for (int var4 = 0; ~var4 > -65; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field2236, var3);
                    var3 += 2;
                }
                if (!this.field2252.field9478) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field2254 = (float) (super.field3803.field9807 % 4000) / 4000.0F;
                }
                this.field2238 = super.field3803.field9807;
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)V")
    public static void method1072(byte arg0) {
        field2253 = null;
        if (arg0 < 27) {
            method1072((byte) -108);
        }
        field2248 = null;
        field2250 = null;
        field2235 = null;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)V")
    public final void method24(byte arg0) {
        ++field2249;
        if (this.field2241 != null) {
            this.field2241.method2855(4864, '\u0001');
            if (arg0 < -89) {
                super.field3803.method3945(1, false);
                super.field3803.method3975((byte) 114, (class128) null);
                super.field3803.method3945(0, false);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIBI)V")
    public static final void method1073(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field2237;
        if (arg3 == -25) {
            class614 var5 = class497.method2759(8, 5977, (long) arg4);
            var5.method3277(639);
            var5.field7741 = arg2;
            var5.field7746 = arg1;
            var5.field7742 = arg0;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1074(boolean arg0, String arg1) {
        ++field2247;
        if (arg0) {
            System.exit(1);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZI[B)I")
    public static final int method1075(boolean arg0, int arg1, byte[] arg2) {
        ++field2251;
        return !arg0 ? 13 : class71.method425(arg2, 2, arg1, 0);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lwj;II)V")
    public final void method28(class128 arg0, int arg1, int arg2) {
        ++field2255;
        super.field3803.method3975((byte) 117, arg0);
        if (arg1 != 0) {
            field2248 = null;
        }
        super.field3803.method3979((byte) -66, arg2);
    }
}
