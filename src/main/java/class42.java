import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class42 extends class477 {

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "Lwl;")
    private class511 field620;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "Lhd;")
    private class211 field612;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "[F")
    private float[] field622;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "Leo;")
    public static class423 field614 = null;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "Lbf;")
    private class181 field610;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "Lf;")
    public static class404 field615;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method264(byte arg0) {
        ++field611;
        if (arg0 <= 45) {
            this.method270(false, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V", line = 15)
    public static void method265(int arg0) {
        field615 = null;
        if (arg0 <= 46) {
            field614 = null;
        }
        field614 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lrh;II)V", line = 32)
    public final void method266(class31 arg0, int arg1, int arg2) {
        super.field6964.method2771(arg0, -16785);
        ++field609;
        if (arg1 != -11) {
            this.field612 = null;
        }
        super.field6964.method2739(arg2, 0);
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V", line = 45)
    private final void method267(int arg0) {
        this.field610 = new class181(super.field6964, 2);
        ++field623;
        this.field610.method1188(0, (byte) -63);
        super.field6964.method2741((byte) -38, 1);
        super.field6964.method2720(20, -16777216);
        super.field6964.method2794(260, 7681, true);
        super.field6964.method2775(770, 34166, 0, -83);
        super.field6964.method2741((byte) -38, 0);
        OpenGL.glBindProgramARB(34336, this.field612.field2716);
        OpenGL.glEnable(34336);
        this.field610.method1193(112);
        this.field610.method1188(1, (byte) -102);
        super.field6964.method2741((byte) -38, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        if (arg0 < 9) {
            this.field612 = null;
        }
        OpenGL.glMatrixMode(5888);
        super.field6964.method2739(0, 0);
        super.field6964.method2775(770, 5890, 0, -49);
        super.field6964.method2741((byte) -38, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field610.method1193(126);
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)[Lhk;", line = 77)
    public static final class268[] method268(byte arg0) {
        if (arg0 != 26) {
            field615 = null;
        }
        if (class30.field505 == null) {
            class268[] var1 = class256.method1600(arg0 ^ 6869, class172.field2221);
            class268[] var2 = new class268[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; ~var1.length < ~var4; ++var4) {
                class268 var8 = var1[var4];
                if ((~var8.field3391 >= -1 || ~var8.field3391 <= -25) && var8.field3395 >= 800 && var8.field3393 >= 600 && (~class472.field6899 <= -97 || class520.field7690 != 0 || ~var8.field3395 >= -1025 && ~var8.field3393 >= -769)) {
                    for (int var9 = 0; ~var9 > ~var3; ++var9) {
                        class268 var10 = var2[var9];
                        if (~var8.field3395 == ~var10.field3395 && var8.field3393 == var10.field3393) {
                            if (var10.field3391 < var8.field3391) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    ++var3;
                }
            }
            class30.field505 = new class268[var3];
            class526.method3115(var2, 0, class30.field505, 0, var3);
            int[] var5 = new int[class30.field505.length];
            for (int var6 = 0; class30.field505.length > var6; ++var6) {
                class268 var7 = class30.field505[var6];
                var5[var6] = var7.field3395 * var7.field3393;
            }
            class104.method698(var5, class30.field505, arg0 + 101);
        }
        ++field618;
        return class30.field505;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V", line = 157)
    public final void method269(byte arg0) {
        if (arg0 == 126) {
            ++field613;
            if (this.field610 != null) {
                this.field610.method1190((byte) 47, '\u0001');
                super.field6964.method2741((byte) -38, 1);
                super.field6964.method2771((class31) null, -16785);
                super.field6964.method2741((byte) -38, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lgk;Lwl;)V", line = 178)
    public class42(class463 arg0, class511 arg1) {
        super(arg0);
        this.field620 = arg1;
        if (super.field6964.field6772 && super.field6964.field6779 >= 2) {
            this.field612 = class334.method1983("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", -6416, 34336, super.field6964);
            if (this.field612 != null) {
                int[][] var3 = class77.method447(64, false, 0, -122, 0.4F, 8, 4, 256, 3);
                int[][] var4 = class77.method447(64, false, 8, -124, 0.4F, 8, 4, 256, 3);
                this.field622 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field622[var5++] = (float) var7[var9] / 4096.0F;
                        this.field622[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method267(82);
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZ)V", line = 225)
    public final void method270(boolean arg0, boolean arg1) {
        ++field621;
        if (this.field610 != null) {
            this.field610.method1190((byte) -105, '\u0000');
            super.field6964.method2741((byte) -38, 1);
            if (!arg0) {
                this.field610 = null;
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6964.field6800.method2681((byte) 93), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field6964.method2741((byte) -38, 0);
            if (~super.field6964.field6690 != ~this.field617) {
                int var3 = super.field6964.field6690 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field622, var4);
                    var4 += 2;
                }
                if (!this.field620.field7523) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    float var6 = (float) (super.field6964.field6690 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
                }
                this.field617 = super.field6964.field6690;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)V", line = 275)
    public final void method271(boolean arg0, int arg1) {
        ++field619;
        if (arg1 != -13) {
            field614 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BII)V", line = 293)
    public final void method272(byte arg0, int arg1, int arg2) {
        ++field616;
        if (this.field610 != null) {
            super.field6964.method2741((byte) -38, 1);
            if ((arg1 & 128) != 0) {
                super.field6964.method2771((class31) null, -16785);
            } else if (this.field620.field7523) {
                super.field6964.method2771(this.field620.field7532, -16785);
            } else {
                int var4 = super.field6964.field6690 % 4000 * 16 / 4000;
                super.field6964.method2771(this.field620.field7525[var4], -16785);
            }
            if (arg0 <= 33) {
                this.field612 = null;
            }
            super.field6964.method2741((byte) -38, 0);
            if (~(arg1 & 64) == -1) {
                OpenGL.glGetFloatv(2899, class126.field1728, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class126.field1728, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = arg1 & 3;
            if (~var5 != -3) {
                if (var5 != 3) {
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
