import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class520 extends class348 {

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Lwc;")
    private class273 field7694;

    @OriginalMember(owner = "client!it", name = "C", descriptor = "Law;")
    private class390 field7714;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "[F")
    private float[] field7695;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public static int field7705 = 0;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "[Z")
    public static boolean[] field7707 = new boolean[100];

    @OriginalMember(owner = "client!it", name = "u", descriptor = "Lqu;")
    public static class219 field7706 = new class219(63, -1);

    @OriginalMember(owner = "client!it", name = "z", descriptor = "[I")
    public static int[] field7711 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!it", name = "y", descriptor = "Lqu;")
    public static class219 field7710 = new class219(24, 6);

    @OriginalMember(owner = "client!it", name = "l", descriptor = "F")
    private float field7697;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    private int field7700;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!it", name = "A", descriptor = "Lc;")
    public static class205 field7712;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "Lkp;")
    private class292 field7699;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "(I)V")
    private final void method3114(int arg0) {
        this.field7699 = new class292(super.field5398, 2);
        ++field7704;
        this.field7699.method1965(0, (byte) -22);
        super.field5398.method1507(1, 0);
        super.field5398.method1550((byte) -122, -16777216);
        super.field5398.method1568(7681, 2896, 260);
        super.field5398.method1539(0, 34166, 770, (byte) 116);
        super.field5398.method1507(0, 0);
        OpenGL.glBindProgramARB(34336, this.field7714.field5932);
        OpenGL.glEnable(34336);
        this.field7699.method1962(-6635);
        this.field7699.method1965(1, (byte) -113);
        super.field5398.method1507(1, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field5398.method1494(0, -25951);
        if (arg0 >= -110) {
            field7705 = 64;
        }
        super.field5398.method1539(0, 5890, 770, (byte) 125);
        super.field5398.method1507(0, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field7699.method1962(-6635);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIB)V")
    public final void method263(int arg0, int arg1, byte arg2) {
        if (arg2 <= -51) {
            ++field7708;
            if (this.field7699 != null) {
                super.field5398.method1507(1, 0);
                if ((arg1 & 128) == 0) {
                    if ((1 & arg0) != 1) {
                        if (this.field7694.field4346) {
                            super.field5398.method1540(44, this.field7694.field4349);
                        } else {
                            super.field5398.method1540(121, this.field7694.field4344[0]);
                        }
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else if (!this.field7694.field4346) {
                        int var4 = super.field5398.field3484 % 4000 * 16 / 4000;
                        super.field5398.method1540(97, this.field7694.field4344[var4]);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        super.field5398.method1540(105, this.field7694.field4349);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field7697, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    super.field5398.method1540(44, (class427) null);
                }
                super.field5398.method1507(0, 0);
                if ((64 & arg1) != 0) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glGetFloatv(2899, class454.field7027, 0);
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class454.field7027, 0);
                }
                int var5 = arg1 & 3;
                if (~var5 != -3) {
                    if (~var5 != -4) {
                        OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                    }
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
    public final void method265(int arg0) {
        ++field7696;
        int var2 = 5 % ((arg0 - 61) / 63);
        if (this.field7699 != null) {
            this.field7699.method1963(true, '\u0001');
            super.field5398.method1507(1, 0);
            super.field5398.method1540(112, (class427) null);
            super.field5398.method1507(0, 0);
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lna;Lwc;)V")
    public class520(class211 arg0, class273 arg1) {
        super(arg0);
        this.field7694 = arg1;
        if (super.field5398.field3513 && ~super.field5398.field3556 <= -3) {
            this.field7714 = class52.method365(34336, super.field5398, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 0);
            if (this.field7714 != null) {
                int[][] var3 = class538.method3186(256, 8, 0.4F, false, 0, 64, 124, 4, 3);
                int[][] var4 = class538.method3186(256, 8, 0.4F, false, 8, 64, 125, 4, 3);
                int var5 = 0;
                this.field7695 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field7695[var5++] = (float) var7[var9] / 4096.0F;
                        this.field7695[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method3114(-127);
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([BBII)Ljava/lang/String;")
    public static final String method3115(byte[] arg0, byte arg1, int arg2, int arg3) {
        ++field7702;
        char[] var4 = new char[arg3];
        int var5 = 0;
        if (arg1 > -85) {
            return null;
        } else {
            for (int var6 = 0; arg3 > var6; ++var6) {
                int var7 = 255 & arg0[arg2 + var6];
                if (~var7 != -1) {
                    if (~var7 <= -129 && ~var7 > -161) {
                        char var8 = class270.field4308[var7 + -128];
                        if (var8 == 0) {
                            var8 = '?';
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
            }
            return new String(var4, 0, var5);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Z")
    public final boolean method267(int arg0) {
        if (arg0 != -233) {
            this.method262(false, (byte) 65);
        }
        ++field7703;
        return true;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V")
    public static void method3116(boolean arg0) {
        field7707 = null;
        field7706 = null;
        field7712 = null;
        if (arg0) {
            method3116(true);
        }
        field7710 = null;
        field7711 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IILed;)V")
    public final void method264(int arg0, int arg1, class427 arg2) {
        ++field7701;
        int var4 = -110 % ((-49 - arg1) / 44);
        super.field5398.method1540(52, arg2);
        super.field5398.method1494(arg0, -25951);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZB)V")
    public final void method262(boolean arg0, byte arg1) {
        int var3 = -15 % ((arg1 - -23) / 41);
        ++field7709;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(ZB)V")
    public final void method261(boolean arg0, byte arg1) {
        ++field7698;
        if (this.field7699 != null) {
            if (arg1 >= -30) {
                method3115((byte[]) null, (byte) 13, -73, 47);
            }
            this.field7699.method1963(true, '\u0000');
            super.field5398.method1507(1, 0);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5398.field3515.method612(false), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field5398.method1507(0, 0);
            if (~super.field5398.field3484 != ~this.field7700) {
                int var3 = super.field5398.field3484 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field7695, var4);
                    var4 += 2;
                }
                if (!this.field7694.field4346) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field7697 = (float) (super.field5398.field3484 % 4000) / 4000.0F;
                }
                this.field7700 = super.field5398.field3484;
            }
        }
    }
}
