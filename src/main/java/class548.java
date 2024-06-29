import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class548 extends class631 {

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lrc;")
    private class538 field7646;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Lpo;")
    private class558 field7648;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[F")
    private float[] field7641;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "F")
    private float field7651;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    private int field7645;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Lup;")
    private class274 field7655;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 7)
    public final void method1513(int arg0) {
        ++field7654;
        if (this.field7655 != null) {
            if (arg0 >= 74) {
                this.field7655.method1783(-52, '\u0001');
                super.field8722.method884(1, true);
                super.field8722.method926((class210) null, 99);
                super.field8722.method884(0, true);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V", line = 26)
    private final void method3173(int arg0) {
        ++field7650;
        this.field7655 = new class274(super.field8722, 2);
        this.field7655.method1785(0, 107);
        super.field8722.method884(1, true);
        super.field8722.method933(-16777216, (byte) 28);
        super.field8722.method946(false, 260, arg0);
        super.field8722.method948(34166, 0, 770, (byte) -95);
        super.field8722.method884(0, true);
        OpenGL.glBindProgramARB(34336, this.field7648.field7837);
        OpenGL.glEnable(34336);
        this.field7655.method1784(-50135600);
        this.field7655.method1785(1, 64);
        super.field8722.method884(1, true);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field8722.method891(0, (byte) 17);
        super.field8722.method948(5890, 0, 770, (byte) 98);
        super.field8722.method884(0, true);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field7655.method1784(-50135600);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIII)V", line = 59)
    public static final void method3174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 > 98) {
            ++field7656;
            int var8 = arg3 + 1;
            class643.method3557(arg5, class445.field6320[arg3], (byte) 87, arg1, arg0);
            int var9 = arg4 - 1;
            class643.method3557(arg5, class445.field6320[arg4], (byte) 88, arg1, arg0);
            for (int var6 = var8; ~var6 >= ~var9; ++var6) {
                int[] var7 = class445.field6320[var6];
                var7[arg5] = var7[arg0] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Leea;Lrc;)V", line = 86)
    public class548(class131 arg0, class538 arg1) {
        super(arg0);
        this.field7646 = arg1;
        if (super.field8722.field1921 && ~super.field8722.field1861 <= -3) {
            this.field7648 = class210.method1294(true, 34336, super.field8722, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field7648 != null) {
                int[][] var3 = class366.method2333(4, 0, 3, (byte) -108, false, 64, 256, 0.4F, 4);
                int[][] var4 = class366.method2333(4, 8, 3, (byte) -121, false, 64, 256, 0.4F, 4);
                int var5 = 0;
                this.field7641 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field7641[var5++] = (float) var7[var9] / 4096.0F;
                        this.field7641[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method3173(7681);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V", line = 136)
    public final void method1506(int arg0, boolean arg1) {
        if (arg0 != 17660) {
            this.method1512(106, -127, 106);
        }
        ++field7644;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZZ)V", line = 146)
    public final void method1509(boolean arg0, boolean arg1) {
        ++field7647;
        if (this.field7655 != null) {
            this.field7655.method1783(-114, '\u0000');
            super.field8722.method884(1, arg0);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field8722.field1823.method354(111), 0);
            OpenGL.glMatrixMode(5888);
            if (!arg0) {
                this.field7645 = -71;
            }
            super.field8722.method884(0, arg0);
            if (super.field8722.field1790 != this.field7645) {
                int var3 = super.field8722.field1790 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field7641, var3);
                    var3 += 2;
                }
                if (this.field7646.field7545) {
                    this.field7651 = (float) (super.field8722.field1790 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field7645 = super.field8722.field1790;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILta;)V", line = 192)
    public final void method1508(int arg0, int arg1, class210 arg2) {
        ++field7649;
        super.field8722.method926(arg2, 127);
        int var4 = 69 % ((arg1 - 52) / 62);
        super.field8722.method891(arg0, (byte) 17);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V", line = 203)
    public final void method1512(int arg0, int arg1, int arg2) {
        ++field7653;
        if (this.field7655 != null) {
            super.field8722.method884(1, true);
            if (~(arg0 & 128) != -1) {
                super.field8722.method926((class210) null, 94);
            } else if ((1 & arg2) == 1) {
                if (!this.field7646.field7545) {
                    int var4 = super.field8722.field1790 % 4000 * 16 / 4000;
                    super.field8722.method926(this.field7646.field7550[var4], 102);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field8722.method926(this.field7646.field7551, 56);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field7651, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (!this.field7646.field7545) {
                    super.field8722.method926(this.field7646.field7550[0], 108);
                } else {
                    super.field8722.method926(this.field7646.field7551, 36);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field8722.method884(0, true);
            if (arg1 < 72) {
                this.method1508(107, -128, (class210) null);
            }
            if ((64 & arg0) != 0) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                class131.field1768[2] = super.field8722.field1866 * super.field8722.field1851;
                class131.field1768[0] = super.field8722.field1919 * super.field8722.field1866;
                class131.field1768[1] = super.field8722.field1895 * super.field8722.field1866;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class131.field1768, 0);
            }
            int var5 = arg0 & 3;
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

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)Z", line = 274)
    public static final boolean method3175(int arg0) {
        ++field7642;
        try {
            if (class469.field6659 == 2) {
                if (class326.field4519 == null) {
                    class326.field4519 = class301.method1972(class226.field3049, class213.field2801, class318.field4412);
                    if (class326.field4519 == null) {
                        return false;
                    }
                }
                if (class515.field7345 == null) {
                    class515.field7345 = new class457(class360.field5103, class636.field8762);
                }
                class223 var1 = class165.field2262;
                if (class561.field7881 != null) {
                    var1 = class561.field7881;
                }
                if (var1.method1389(19196, 22050, class390.field5519, class515.field7345, class326.field4519)) {
                    class165.field2262 = var1;
                    class165.field2262.method1398((byte) 125);
                    if (class98.field1182 > 0) {
                        class469.field6659 = 3;
                        class165.field2262.method1391(class444.field6316 < class98.field1182 ? class444.field6316 : class98.field1182, 100);
                        for (int var2 = 0; ~class601.field8432.length < ~var2; ++var2) {
                            class165.field2262.method1365(var2, (byte) 113, class601.field8432[var2]);
                            class601.field8432[var2] = 255;
                        }
                    } else {
                        class469.field6659 = 0;
                        class165.field2262.method1391(class444.field6316, 93);
                        for (int var3 = 0; ~var3 > ~class601.field8432.length; ++var3) {
                            class165.field2262.method1365(var3, (byte) 113, class601.field8432[var3]);
                            class601.field8432[var3] = 255;
                        }
                    }
                    if (class561.field7881 == null) {
                        if (class289.field4078 <= 0L) {
                            class165.field2262.method1392(true, class326.field4519, class750.field10412);
                        } else {
                            class165.field2262.method1367(true, class326.field4519, false, class289.field4078, class750.field10412);
                        }
                    }
                    if (class136.field1975 != null) {
                        class136.field1975.method2491(true, class165.field2262);
                    }
                    class561.field7881 = null;
                    class326.field4519 = null;
                    class226.field3049 = null;
                    class515.field7345 = null;
                    class289.field4078 = 0L;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class165.field2262.method1364(arg0 ^ -22579);
            class561.field7881 = null;
            class326.field4519 = null;
            class469.field6659 = 0;
            class515.field7345 = null;
            class226.field3049 = null;
        }
        return arg0 != -22595;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)Z", line = 375)
    public final boolean method1507(byte arg0) {
        ++field7652;
        int var2 = 100 / ((arg0 - -9) / 53);
        return true;
    }
}
