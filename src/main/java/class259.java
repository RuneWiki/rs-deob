import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class259 extends class312 {

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "Lvb;")
    private class180 field3803;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "Lkk;")
    private class175 field3807;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "[F")
    private float[] field3809;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "F")
    private float field3798;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "F")
    public static float field3805;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    private int field3806;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Lqda;")
    private class89 field3801;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)Z")
    public final boolean method242(byte arg0) {
        int var2 = 14 / ((arg0 - 25) / 57);
        ++field3796;
        return true;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)Z")
    public static final boolean method1703(boolean arg0) {
        if (arg0) {
            field3805 = 0.75748074F;
        }
        ++field3808;
        try {
            if (class577.field8380 == 2) {
                if (class577.field8396 == null) {
                    class577.field8396 = class120.method1045(class47.field1136, class585.field8450, class71.field1489);
                    if (class577.field8396 == null) {
                        return false;
                    }
                }
                if (class479.field6874 == null) {
                    class479.field6874 = new class321(class336.field5030, class234.field3501);
                }
                if (class114.field2046.method201(22050, class577.field8396, class479.field6874, (byte) -31, class301.field4477)) {
                    class114.field2046.method200(64512);
                    if (~class399.field5805 >= -1) {
                        class577.field8380 = 0;
                        class114.field2046.method196(class486.field6961, -87);
                    } else {
                        class577.field8380 = 3;
                        class114.field2046.method196(0, -107);
                    }
                    if (~class673.field9587 >= -1L) {
                        class114.field2046.method222(class577.field8396, -96, class339.field5051);
                    } else {
                        class114.field2046.method206(true, class339.field5051, class577.field8396, class673.field9587, (byte) -123);
                    }
                    class479.field6874 = null;
                    class673.field9587 = 0L;
                    class577.field8396 = null;
                    class47.field1136 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class114.field2046.method210((byte) -18);
            class47.field1136 = null;
            class577.field8396 = null;
            class479.field6874 = null;
            class577.field8380 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)V")
    public final void method240(boolean arg0, int arg1) {
        ++field3810;
        if (arg1 < 102) {
            this.field3806 = -49;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZZ)V")
    public final void method243(boolean arg0, boolean arg1) {
        ++field3802;
        if (this.field3801 != null) {
            this.field3801.method871(false, '\u0000');
            super.field4632.method125(1, -32);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field4632.field249.method2575(arg1), 0);
            OpenGL.glMatrixMode(5888);
            super.field4632.method125(0, -98);
            if (~super.field4632.field215 != ~this.field3806) {
                int var3 = super.field4632.field215 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field3809, var3);
                    var3 += 2;
                }
                if (!this.field3803.field2912) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field3798 = (float) (super.field4632.field215 % 4000) / 4000.0F;
                }
                this.field3806 = super.field4632.field215;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        if (arg0 == -123) {
            ++field3799;
            if (this.field3801 != null) {
                this.field3801.method871(false, '\u0001');
                super.field4632.method125(1, -26);
                super.field4632.method5(3845, (class487) null);
                super.field4632.method125(0, arg0 + 249);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
    private final void method1704(int arg0) {
        ++field3797;
        this.field3801 = new class89(super.field4632, 2);
        this.field3801.method874(0, -112);
        super.field4632.method125(1, 106);
        super.field4632.method22(-16777216, false);
        super.field4632.method148(7681, 260, (byte) -118);
        super.field4632.method135((byte) 41, 34166, 0, 770);
        super.field4632.method125(0, -94);
        OpenGL.glBindProgramARB(34336, this.field3807.field2881);
        OpenGL.glEnable(34336);
        if (arg0 != 18396) {
            this.field3807 = null;
        }
        this.field3801.method869((byte) -120);
        this.field3801.method874(1, -115);
        super.field4632.method125(1, -53);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field4632.method133(0, (byte) -120);
        super.field4632.method135((byte) 88, 5890, 0, 770);
        super.field4632.method125(0, -101);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field3801.method869((byte) -128);
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lus;Lvb;)V")
    public class259(class1 arg0, class180 arg1) {
        super(arg0);
        this.field3803 = arg1;
        if (super.field4632.field263 && super.field4632.field303 >= 2) {
            this.field3807 = class520.method3063("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field4632, 34379, 34336);
            if (this.field3807 != null) {
                int[][] var3 = class260.method1706(4, 0, 64, false, 256, 0.4F, (byte) -118, 4, 3);
                int[][] var4 = class260.method1706(4, 8, 64, false, 256, 0.4F, (byte) -118, 4, 3);
                this.field3809 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field3809[var5++] = (float) var7[var9] / 4096.0F;
                        this.field3809[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1704(18396);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIB)V")
    public final void method238(int arg0, int arg1, byte arg2) {
        ++field3800;
        if (this.field3801 != null) {
            super.field4632.method125(1, -41);
            if ((128 & arg1) == 0) {
                if ((arg0 & 1) != 1) {
                    if (this.field3803.field2912) {
                        super.field4632.method5(3845, this.field3803.field2917);
                    } else {
                        super.field4632.method5(3845, this.field3803.field2916[0]);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (this.field3803.field2912) {
                    super.field4632.method5(3845, this.field3803.field2917);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field3798, 0.0F, 0.0F, 1.0F);
                } else {
                    int var4 = super.field4632.field215 % 4000 * 16 / 4000;
                    super.field4632.method5(3845, this.field3803.field2916[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field4632.method5(3845, (class487) null);
            }
            super.field4632.method125(0, -80);
            if (~(64 & arg1) == -1) {
                OpenGL.glGetFloatv(2899, class381.field5637, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class381.field5637, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = 3 & arg1;
            int var6 = -90 / ((arg2 - 74) / 45);
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 == 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBLum;)V")
    public final void method244(int arg0, byte arg1, class487 arg2) {
        ++field3804;
        if (arg1 > -78) {
            this.method238(-2, -114, (byte) -49);
        }
        super.field4632.method5(3845, arg2);
        super.field4632.method133(arg0, (byte) -127);
    }
}
