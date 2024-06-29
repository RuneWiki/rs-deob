import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class113 extends class190 {

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "Lah;")
    private class374 field1747;

    @OriginalMember(owner = "client!wea", name = "m", descriptor = "Lica;")
    private class391 field1752;

    @OriginalMember(owner = "client!wea", name = "o", descriptor = "[F")
    private float[] field1754;

    @OriginalMember(owner = "client!wea", name = "p", descriptor = "F")
    private float field1755;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!wea", name = "k", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!wea", name = "n", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
    private int field1756;

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "Liw;")
    private class607 field1745;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)Z")
    public final boolean method908(int arg0) {
        if (arg0 <= 37) {
            this.field1747 = null;
        }
        ++field1753;
        return true;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZ)V")
    public final void method909(int arg0, boolean arg1) {
        ++field1746;
        if (arg0 != 16450) {
            this.field1755 = 0.11054134F;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)V")
    public final void method910(boolean arg0) {
        ++field1743;
        if (this.field1745 != null) {
            if (arg0) {
                this.method915(false, 43);
            }
            this.field1745.method3477((byte) 52, '\u0001');
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1306((class487) null, 52);
            super.field3195.method1298(0, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILnba;I)V")
    public final void method911(int arg0, class487 arg1, int arg2) {
        super.field3195.method1306(arg1, 120);
        ++field1744;
        super.field3195.method1334(arg2 ^ arg2, arg0);
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lrs;Lah;)V")
    public class113(class166 arg0, class374 arg1) {
        super(arg0);
        this.field1747 = arg1;
        if (super.field3195.field2892 && super.field3195.field2793 >= 2) {
            this.field1752 = class259.method1736(0, super.field3195, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field1752 != null) {
                int[][] var3 = class86.method758(3, 4, 0.4F, 256, 64, false, 80, 0, 4);
                int[][] var4 = class86.method758(3, 4, 0.4F, 256, 64, false, 123, 8, 4);
                int var5 = 0;
                this.field1754 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field1754[var5++] = (float) var7[var9] / 4096.0F;
                        this.field1754[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method913(0);
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method912(int arg0, String arg1) {
        ++field1748;
        if (arg1 == null) {
            return false;
        } else if (arg0 != 34166) {
            return false;
        } else {
            for (int var2 = 0; var2 < class468.field6818; ++var2) {
                if (arg1.equalsIgnoreCase(class562.field7961[var2])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(class145.field2251.field8146);
        }
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V")
    private final void method913(int arg0) {
        this.field1745 = new class607(super.field3195, 2);
        ++field1749;
        this.field1745.method3481(19, 0);
        super.field3195.method1298(1, (byte) -124);
        super.field3195.method1259(-16777216, -18335);
        super.field3195.method1256(7681, -4, 260);
        super.field3195.method1264(34166, arg0 + 2, 0, 770);
        super.field3195.method1298(0, (byte) -124);
        OpenGL.glBindProgramARB(34336, this.field1752.field5840);
        OpenGL.glEnable(34336);
        this.field1745.method3479((byte) 122);
        this.field1745.method3481(arg0 + -126, 1);
        super.field3195.method1298(1, (byte) -124);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field3195.method1334(0, arg0);
        super.field3195.method1264(5890, 2, 0, 770);
        super.field3195.method1298(0, (byte) -124);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field1745.method3479((byte) 115);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIB)V")
    public final void method914(int arg0, int arg1, byte arg2) {
        ++field1751;
        if (this.field1745 != null) {
            super.field3195.method1298(1, (byte) -124);
            if (~(arg0 & 128) == -1) {
                if (~(1 & arg1) == -2) {
                    if (this.field1747.field5655) {
                        super.field3195.method1306(this.field1747.field5648, 81);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field1755, 0.0F, 0.0F, 1.0F);
                    } else {
                        int var4 = super.field3195.field2757 % 4000 * 16 / 4000;
                        super.field3195.method1306(this.field1747.field5657[var4], 76);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (this.field1747.field5655) {
                        super.field3195.method1306(this.field1747.field5648, arg2 ^ -53);
                    } else {
                        super.field3195.method1306(this.field1747.field5657[0], arg2 + 217);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field3195.method1306((class487) null, arg2 + 211);
            }
            super.field3195.method1298(0, (byte) -124);
            if (~(arg0 & 64) == -1) {
                class512.field7441[2] = super.field3195.field2835 * super.field3195.field2795;
                class512.field7441[0] = super.field3195.field2814 * super.field3195.field2795;
                class512.field7441[1] = super.field3195.field2803 * super.field3195.field2795;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class512.field7441, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = arg0 & 3;
            if (arg2 == -122) {
                if (var5 == 2) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                } else if (~var5 == -4) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZI)V")
    public final void method915(boolean arg0, int arg1) {
        ++field1750;
        if (this.field1745 != null) {
            this.field1745.method3477((byte) 116, '\u0000');
            super.field3195.method1298(1, (byte) -124);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3195.field2791.method1368(arg1 ^ 16383), 0);
            OpenGL.glMatrixMode(5888);
            super.field3195.method1298(arg1, (byte) -124);
            if (super.field3195.field2757 != this.field1756) {
                int var3 = super.field3195.field2757 % 5000 * 128 / 5000;
                for (int var4 = 0; ~var4 > -65; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field1754, var3);
                    var3 += 2;
                }
                if (this.field1747.field5655) {
                    this.field1755 = (float) (super.field3195.field2757 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field1756 = super.field3195.field2757;
            }
        }
    }
}
