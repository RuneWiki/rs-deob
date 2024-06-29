import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class413 extends class263 {

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "Lmt;")
    private class261 field5980;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "Lan;")
    private class20 field5992;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "[F")
    private float[] field5987;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "Loe;")
    public static class127 field5982 = new class127(34, 0);

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
    public static int field5993 = 0;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    private int field5988;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "Lkq;")
    private class403 field5985;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5986;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)V")
    public final void method673(int arg0, int arg1, int arg2) {
        ++field5984;
        if (arg2 != 6908) {
            this.method673(87, 4, 114);
        }
        if (this.field5985 != null) {
            super.field3984.method2582((byte) -30, 1);
            if (~(arg0 & 128) != -1) {
                super.field3984.method2586((class194) null, false);
            } else if (!this.field5980.field3952) {
                int var4 = super.field3984.field6691 % 4000 * 16 / 4000;
                super.field3984.method2586(this.field5980.field3957[var4], false);
            } else {
                super.field3984.method2586(this.field5980.field3962, false);
            }
            super.field3984.method2582((byte) -88, 0);
            if (~(64 & arg0) == -1) {
                OpenGL.glGetFloatv(2899, class405.field5885, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class405.field5885, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = arg0 & 3;
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

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZB)V")
    public final void method669(boolean arg0, byte arg1) {
        int var3 = 93 / ((24 - arg1) / 34);
        ++field5983;
        if (this.field5985 != null) {
            this.field5985.method2392((byte) 0, '\u0000');
            super.field3984.method2582((byte) 113, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3984.field6820.method193(0), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field3984.method2582((byte) 126, 0);
            if (super.field3984.field6691 != this.field5988) {
                int var4 = super.field3984.field6691 % 5120 * 128 / 5120;
                int var5 = var4 * 128;
                for (int var6 = 0; ~var6 > -65; ++var6) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var6, this.field5987, var5);
                    var5 += 2;
                }
                if (this.field5980.field3952) {
                    float var7 = (float) (super.field3984.field6691 % 4000) / 4000.0F;
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, var7, 0.0F, 0.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field5988 = super.field3984.field6691;
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V")
    public final void method666(int arg0, boolean arg1) {
        ++field5978;
        if (arg0 != -2560) {
            this.field5988 = 24;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lce;IZ)V")
    public final void method671(class194 arg0, int arg1, boolean arg2) {
        super.field3984.method2586(arg0, false);
        ++field5994;
        super.field3984.method2610(0, arg1);
        if (!arg2) {
            method2434(-29);
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lbl;Lmt;)V")
    public class413(class442 arg0, class261 arg1) {
        super(arg0);
        this.field5980 = arg1;
        if (super.field3984.field6717 && ~super.field3984.field6762 <= -3) {
            this.field5992 = class488.method2936(super.field3984, -107, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336);
            if (this.field5992 != null) {
                int[][] var3 = class24.method130(8, 64, false, 0.4F, 29642, 3, 4, 256, 0);
                int[][] var4 = class24.method130(8, 64, false, 0.4F, 29642, 3, 4, 256, 8);
                this.field5987 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field5987[var5++] = (float) var7[var9] / 4096.0F;
                        this.field5987[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2432(34336);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    private final void method2432(int arg0) {
        this.field5985 = new class403(super.field3984, 2);
        ++field5990;
        this.field5985.method2390(0, -32245);
        super.field3984.method2582((byte) 117, 1);
        super.field3984.method2605(127, -16777216);
        super.field3984.method2624((byte) 107, 7681, 260);
        super.field3984.method2575((byte) -80, 34166, 770, 0);
        super.field3984.method2582((byte) 113, 0);
        OpenGL.glBindProgramARB(arg0, this.field5992.field259);
        OpenGL.glEnable(34336);
        this.field5985.method2391(-121);
        this.field5985.method2390(1, -32245);
        super.field3984.method2582((byte) 6, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field3984.method2610(0, 0);
        super.field3984.method2575((byte) -69, 5890, 770, 0);
        super.field3984.method2582((byte) 121, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field5985.method2391(-92);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)Z")
    public final boolean method675(int arg0) {
        ++field5979;
        if (arg0 >= -112) {
            this.method671((class194) null, 45, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)Z")
    public static final boolean method2433(boolean arg0) {
        for (int var1 = class273.field4149; var1 < class483.field7381; ++var1) {
            class268[][] var2 = class321.field4830[var1];
            for (int var3 = -class320.field4826; var3 <= 0; ++var3) {
                int var4 = class7.field82 + var3;
                int var5 = class7.field82 - var3;
                if (var4 >= class56.field916 || var5 < class255.field3886) {
                    for (int var6 = -class320.field4826; var6 <= 0; ++var6) {
                        int var7 = class248.field3812 + var6;
                        int var8 = class248.field3812 - var6;
                        if (var4 >= class56.field916) {
                            if (var7 >= class72.field1287) {
                                class268 var9 = var2[var4][var7];
                                if (var9 != null && var9.field4044) {
                                    class114.field1933 = arg0;
                                    class100.field1810.method864(var9, 127);
                                    class100.field1810.method858((byte) -67);
                                }
                            }
                            if (var8 < class14.field197) {
                                class268 var10 = var2[var4][var8];
                                if (var10 != null && var10.field4044) {
                                    class114.field1933 = arg0;
                                    class100.field1810.method864(var10, 126);
                                    class100.field1810.method858((byte) -70);
                                }
                            }
                        }
                        if (var5 < class255.field3886) {
                            if (var7 >= class72.field1287) {
                                class268 var11 = var2[var5][var7];
                                if (var11 != null && var11.field4044) {
                                    class114.field1933 = arg0;
                                    class100.field1810.method864(var11, 105);
                                    class100.field1810.method858((byte) -112);
                                }
                            }
                            if (var8 < class14.field197) {
                                class268 var12 = var2[var5][var8];
                                if (var12 != null && var12.field4044) {
                                    class114.field1933 = arg0;
                                    class100.field1810.method864(var12, 123);
                                    class100.field1810.method858((byte) -87);
                                }
                            }
                        }
                        if (class65.field1074 == 0) {
                            if (class311.field4687) {
                                class100.field1810.method859(24, 768);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)[Lvh;")
    public static final class232[] method2434(int arg0) {
        if (arg0 != -7512) {
            return null;
        } else {
            ++field5991;
            return new class232[] { class107.field1866, class410.field5950, class475.field7251 };
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Ltq;")
    public static final class427 method2435(int arg0, int arg1) {
        if (arg0 != 160291920) {
            method2433(false);
        }
        ++field5989;
        int var2 = arg1 >> 16;
        int var3 = 65535 & arg1;
        if (class409.field5933[var2] == null || class409.field5933[var2][var3] == null) {
            boolean var4 = class376.method2264((byte) -114, var2);
            if (!var4) {
                return null;
            }
        }
        return class409.field5933[var2][var3];
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
    public final void method670(byte arg0) {
        ++field5981;
        if (this.field5985 != null) {
            if (arg0 != -94) {
                this.method671((class194) null, 16, false);
            }
            this.field5985.method2392((byte) 0, '\u0001');
            super.field3984.method2582((byte) 127, 1);
            super.field3984.method2586((class194) null, false);
            super.field3984.method2582((byte) -105, 0);
        }
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V")
    public static void method2436(int arg0) {
        field5986 = null;
        field5982 = null;
        if (arg0 > -117) {
            method2433(true);
        }
    }
}
