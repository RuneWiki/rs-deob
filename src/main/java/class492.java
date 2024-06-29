import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class492 extends class125 {

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Lqf;")
    private class482 field7200;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "Lik;")
    private class141 field7205;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "[F")
    private float[] field7203;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Ltd;")
    public static class317 field7204 = new class317("WIP", 2);

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "F")
    private float field7207;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    private int field7215;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "Lza;")
    public static class287 field7216;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Lpb;")
    private class468 field7211;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lur;Lqf;)V")
    public class492(class377 arg0, class482 arg1) {
        super(arg0);
        this.field7200 = arg1;
        if (super.field1617.field5413 && ~super.field1617.field5410 <= -3) {
            this.field7205 = class213.method1362("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field1617, (byte) 60, 34336);
            if (this.field7205 != null) {
                int[][] var3 = class342.method1992(3, 4, false, 64, -121, 0.4F, 256, 0, 8);
                int[][] var4 = class342.method1992(3, 4, false, 64, -112, 0.4F, 256, 8, 8);
                int var5 = 0;
                this.field7203 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field7203[var5++] = (float) var7[var9] / 4096.0F;
                        this.field7203[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2977((byte) -93);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Z")
    public final boolean method666(int arg0) {
        int var2 = 43 / ((11 - arg0) / 63);
        ++field7209;
        return true;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    private final void method2977(byte arg0) {
        ++field7213;
        this.field7211 = new class468(super.field1617, 2);
        this.field7211.method2854(-120, 0);
        super.field1617.method2250((byte) 92, 1);
        super.field1617.method2276(-16777216, (byte) -22);
        if (arg0 <= -28) {
            super.field1617.method2269(260, 8960, 7681);
            super.field1617.method2277((byte) -126, 770, 0, 34166);
            super.field1617.method2250((byte) 89, 0);
            OpenGL.glBindProgramARB(34336, this.field7205.field1871);
            OpenGL.glEnable(34336);
            this.field7211.method2855(22228);
            this.field7211.method2854(-85, 1);
            super.field1617.method2250((byte) 127, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field1617.method2260(16640, 0);
            super.field1617.method2277((byte) 17, 770, 0, 5890);
            super.field1617.method2250((byte) 93, 0);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field7211.method2855(22228);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILhe;I)V")
    public final void method669(int arg0, class252 arg1, int arg2) {
        super.field1617.method2236(arg1, 124);
        ++field7212;
        super.field1617.method2260(16640, arg2);
        if (arg0 != 67) {
            field7204 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(ZI)V")
    public final void method665(boolean arg0, int arg1) {
        ++field7208;
        if (arg1 < 92) {
            this.method662(-33, 34, 64);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
    public final void method668(boolean arg0, int arg1) {
        ++field7201;
        if (this.field7211 != null) {
            this.field7211.method2856('\u0000', arg1 + 1);
            super.field1617.method2250((byte) 68, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field1617.field5346.method1590(0), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, (float) arg1, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field1617.method2250((byte) 108, 0);
            if (super.field1617.field5310 != this.field7215) {
                int var3 = super.field1617.field5310 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; ~var5 > -65; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field7203, var4);
                    var4 += 2;
                }
                if (this.field7200.field7116) {
                    this.field7207 = (float) (super.field1617.field5310 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field7215 = super.field1617.field5310;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    public static void method2978(int arg0) {
        field7216 = null;
        field7204 = null;
        if (arg0 < 74) {
            method2979((class103) null, 62);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
    public final void method662(int arg0, int arg1, int arg2) {
        ++field7210;
        if (this.field7211 != null) {
            if (arg0 <= -35) {
                super.field1617.method2250((byte) 122, 1);
                if (~(arg2 & 128) != -1) {
                    super.field1617.method2236((class252) null, -50);
                } else if (~(arg1 & 1) == -2) {
                    if (this.field7200.field7116) {
                        super.field1617.method2236(this.field7200.field7118, -44);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field7207, 0.0F, 0.0F, 1.0F);
                    } else {
                        int var4 = super.field1617.field5310 % 4000 * 16 / 4000;
                        super.field1617.method2236(this.field7200.field7119[var4], -124);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (!this.field7200.field7116) {
                        super.field1617.method2236(this.field7200.field7119[0], -101);
                    } else {
                        super.field1617.method2236(this.field7200.field7118, -11);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                super.field1617.method2250((byte) 99, 0);
                if (~(arg2 & 64) == -1) {
                    OpenGL.glGetFloatv(2899, class29.field283, 0);
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class29.field283, 0);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                }
                int var5 = arg2 & 3;
                if (~var5 != -3) {
                    if (~var5 == -4) {
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

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public final void method667(int arg0) {
        ++field7202;
        if (this.field7211 != null) {
            this.field7211.method2856('\u0001', 1);
            super.field1617.method2250((byte) 122, 1);
            super.field1617.method2236((class252) null, arg0 ^ 18165);
            super.field1617.method2250((byte) 92, 0);
            if (arg0 != -18112) {
                this.field7200 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lho;I)V")
    public static final void method2979(class103 arg0, int arg1) {
        if (arg1 < 12) {
            field7214 = 117;
        }
        ++field7206;
        class106.field1443.method74(arg0.method625(false), (byte) 121);
    }

    static {
        new class305("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
