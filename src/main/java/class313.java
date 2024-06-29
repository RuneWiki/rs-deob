import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class313 extends class610 {

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Lh;")
    private class609 field4639;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "Lafa;")
    private class314 field4651;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "[F")
    private float[] field4641;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field4654 = 0;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "Luc;")
    public static class27 field4652 = new class27(60, 8);

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "F")
    private float field4650;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    private int field4643;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Lml;")
    private class353 field4648;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "Z")
    public static boolean field4645;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "[[B")
    public static byte[][] field4658;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Lti;", line = 5)
    public static final class404 method1921(int arg0, int arg1, int arg2) {
        class486 var3 = class658.field9266[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6728;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 12)
    public final void method252(int arg0) {
        if (arg0 != 31130) {
            this.method254(true, false);
        }
        ++field4644;
        if (this.field4648 != null) {
            this.field4648.method2094((byte) 118, '\u0001');
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1804(false, (class591) null);
            super.field8473.method1747(0, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 29)
    public static void method1922(byte arg0) {
        field4652 = null;
        field4658 = null;
        int var1 = -95 / ((14 - arg0) / 35);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)V", line = 42)
    public final void method257(boolean arg0, int arg1) {
        if (arg1 <= -19) {
            ++field4642;
            if (this.field4648 != null) {
                this.field4648.method2094((byte) 123, '\u0000');
                super.field8473.method1747(1, (byte) 108);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field8473.field4257.method2908(9), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field8473.method1747(0, (byte) 108);
                if (super.field8473.field4221 != this.field4643) {
                    int var3 = super.field8473.field4221 % 5120 * 128 / 5120;
                    int var4 = var3 * 128;
                    for (int var5 = 0; var5 < 64; ++var5) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field4641, var4);
                        var4 += 2;
                    }
                    if (this.field4639.field8462) {
                        this.field4650 = (float) (super.field8473.field4221 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field4643 = super.field8473.field4221;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V", line = 92)
    public static final void method1923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4647;
        int var6 = -arg4 + arg1;
        int var7 = arg2 - arg3;
        if (var7 != 0) {
            if (var6 == 0) {
                class140.method998(arg3, arg5, arg4, arg0, arg2);
            } else {
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var6 < arg0) {
                    var6 = -var6;
                }
                boolean var8 = ~var6 < ~var7;
                if (var8) {
                    int var9 = arg3;
                    arg3 = arg4;
                    int var10 = arg2;
                    arg2 = arg1;
                    arg4 = var9;
                    arg1 = var10;
                }
                if (arg2 < arg3) {
                    int var11 = arg3;
                    int var12 = arg4;
                    arg3 = arg2;
                    arg4 = arg1;
                    arg2 = var11;
                    arg1 = var12;
                }
                int var13 = arg4;
                int var14 = -arg3 + arg2;
                int var15 = arg1 - arg4;
                int var16 = -(var14 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = ~arg1 < ~arg4 ? 1 : -1;
                if (!var8) {
                    for (int var18 = arg3; ~arg2 <= ~var18; ++var18) {
                        var16 += var15;
                        class476.field6655[var13][var18] = arg5;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg3; ~arg2 <= ~var19; ++var19) {
                        var16 += var15;
                        class476.field6655[var19][var13] = arg5;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        } else {
            if (var6 != 0) {
                class225.method1440(arg5, arg1, arg4, arg0 ^ 62, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)V", line = 207)
    public final void method258(int arg0, int arg1, byte arg2) {
        ++field4657;
        if (this.field4648 != null) {
            super.field8473.method1747(1, (byte) 108);
            if ((arg1 & 128) != 0) {
                super.field8473.method1804(false, (class591) null);
            } else if ((arg0 & 1) == 1) {
                if (!this.field4639.field8462) {
                    int var4 = super.field8473.field4221 % 4000 * 16 / 4000;
                    super.field8473.method1804(false, this.field4639.field8465[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field8473.method1804(false, this.field4639.field8468);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field4650, 0.0F, 0.0F, 1.0F);
                }
            } else {
                if (this.field4639.field8462) {
                    super.field8473.method1804(false, this.field4639.field8468);
                } else {
                    super.field8473.method1804(false, this.field4639.field8465[0]);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field8473.method1747(0, (byte) 108);
            if ((arg1 & 64) == 0) {
                OpenGL.glGetFloatv(2899, class477.field6662, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class477.field6662, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = 3 & arg1;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 != 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
            if (arg2 != 70) {
                this.field4641 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZ)V", line = 280)
    public final void method254(boolean arg0, boolean arg1) {
        ++field4646;
        if (!arg0) {
            method1925(35, -128);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V", line = 292)
    private final void method1924(byte arg0) {
        ++field4653;
        this.field4648 = new class353(super.field8473, 2);
        this.field4648.method2097(0, -14434);
        super.field8473.method1747(1, (byte) 108);
        super.field8473.method1761(-16777216, 69);
        super.field8473.method1798(false, 7681, 260);
        super.field8473.method1811(770, 0, false, 34166);
        super.field8473.method1747(0, (byte) 108);
        OpenGL.glBindProgramARB(34336, this.field4651.field4662);
        OpenGL.glEnable(34336);
        this.field4648.method2099(6493);
        this.field4648.method2097(1, -14434);
        super.field8473.method1747(1, (byte) 108);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        if (arg0 < -74) {
            OpenGL.glMatrixMode(5888);
            super.field8473.method1801(0, 34166);
            super.field8473.method1811(770, 0, false, 5890);
            super.field8473.method1747(0, (byte) 108);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field4648.method2099(6493);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Z", line = 324)
    public final boolean method262(int arg0) {
        if (arg0 != -1) {
            return true;
        } else {
            ++field4649;
            return true;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V", line = 336)
    public static final void method1925(int arg0, int arg1) {
        ++field4655;
        class474.method2691((byte) -124);
        int var2 = class540.field7344.method3651(arg1, -74).field4400;
        if (arg0 < 119) {
            method1923(-104, 102, -104, 98, 19, -54);
        }
        if (var2 != 0) {
            int var3 = class195.field2888.field1703[arg1];
            if (~var2 == -7) {
                class475.field6642 = var3;
            }
            if (var2 == 5) {
                class662.field9339 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILit;)V", line = 364)
    public final void method255(int arg0, int arg1, class591 arg2) {
        super.field8473.method1804(false, arg2);
        ++field4656;
        super.field8473.method1801(arg1, 34166);
        if (arg0 != 256) {
            method1925(24, 80);
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Len;Lh;)V", line = 379)
    public class313(class289 arg0, class609 arg1) {
        super(arg0);
        this.field4639 = arg1;
        if (super.field8473.field4247 && ~super.field8473.field4326 <= -3) {
            this.field4651 = class98.method763(34336, super.field8473, 0, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field4651 != null) {
                int[][] var3 = class177.method1209(256, 8, false, 0, 0.4F, 4, 64, 3, 4096);
                int[][] var4 = class177.method1209(256, 8, false, 8, 0.4F, 4, 64, 3, 4096);
                int var5 = 0;
                this.field4641 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field4641[var5++] = (float) var7[var9] / 4096.0F;
                        this.field4641[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1924((byte) -120);
            }
        }
    }
}
