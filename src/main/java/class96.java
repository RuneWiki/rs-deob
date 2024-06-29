import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class96 extends class189 {

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "Lpq;")
    private class132 field1255;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "Lug;")
    private class401 field1259;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[F")
    private float[] field1249;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "F")
    private float field1247;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lgk;")
    private class336 field1252;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1244;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public final void method48(boolean arg0) {
        ++field1251;
        if (this.field1252 != null) {
            this.field1252.method2006('\u0001', -14591);
            super.field2702.method2940(1, (byte) 91);
            super.field2702.method2968((class478) null, -87);
            super.field2702.method2940(0, (byte) 106);
            if (!arg0) {
                this.method678(107);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(ZI)V")
    public final void method55(boolean arg0, int arg1) {
        ++field1254;
        if (this.field1252 != null) {
            this.field1252.method2006('\u0000', -14591);
            int var3 = -53 % ((36 - arg1) / 46);
            super.field2702.method2940(1, (byte) 116);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2702.field7390.method1725(-124), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field2702.method2940(0, (byte) 117);
            if (super.field2702.field7313 != this.field1258) {
                int var4 = super.field2702.field7313 % 5120 * 128 / 5120;
                int var5 = var4 * 128;
                for (int var6 = 0; ~var6 > -65; ++var6) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var6, this.field1249, var5);
                    var5 += 2;
                }
                if (!this.field1255.field1736) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field1247 = (float) (super.field2702.field7313 % 4000) / 4000.0F;
                }
                this.field1258 = super.field2702.field7313;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)V")
    public final void method52(byte arg0, int arg1, int arg2) {
        ++field1248;
        if (this.field1252 != null) {
            super.field2702.method2940(1, (byte) 108);
            if (~(arg2 & 128) != -1) {
                super.field2702.method2968((class478) null, -58);
            } else if ((1 & arg1) != 1) {
                if (this.field1255.field1736) {
                    super.field2702.method2968(this.field1255.field1741, arg0 + -210);
                } else {
                    super.field2702.method2968(this.field1255.field1731[0], -117);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else if (this.field1255.field1736) {
                super.field2702.method2968(this.field1255.field1741, -57);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field1247, 0.0F, 0.0F, 1.0F);
            } else {
                int var4 = super.field2702.field7313 % 4000 * 16 / 4000;
                super.field2702.method2968(this.field1255.field1731[var4], -99);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field2702.method2940(0, (byte) 111);
            if (arg0 != 117) {
                this.field1247 = 0.3342063F;
            }
            if (~(arg2 & 64) == -1) {
                OpenGL.glGetFloatv(2899, class190.field2717, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class190.field2717, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = 3 & arg2;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 != 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    private final void method678(int arg0) {
        this.field1252 = new class336(super.field2702, 2);
        ++field1256;
        this.field1252.method2012(4864, 0);
        super.field2702.method2940(1, (byte) 95);
        super.field2702.method2997(-16777216, (byte) -84);
        super.field2702.method2935((byte) 87, 7681, 260);
        super.field2702.method2956(770, 34166, 0, (byte) 55);
        super.field2702.method2940(0, (byte) 97);
        OpenGL.glBindProgramARB(34336, this.field1259.field5639);
        OpenGL.glEnable(34336);
        this.field1252.method2013(4864);
        this.field1252.method2012(4864, 1);
        super.field2702.method2940(1, (byte) 117);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field2702.method2999(0, 80);
        super.field2702.method2956(770, 5890, 0, (byte) 55);
        int var2 = -26 / ((-48 - arg0) / 39);
        super.field2702.method2940(0, (byte) 105);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field1252.method2013(4864);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)Ljg;")
    public static final class228 method679(int arg0, int arg1, int arg2, int arg3) {
        ++field1257;
        class239 var4 = class268.field3910[arg1][arg2][arg3];
        if (arg0 > -8) {
            return null;
        } else if (var4 == null) {
            return null;
        } else {
            class228 var5 = null;
            int var6 = -1;
            for (class134 var7 = var4.field3482; var7 != null; var7 = var7.field1755) {
                class144 var8 = var7.field1761;
                if (var8 instanceof class228) {
                    class228 var9 = (class228) var8;
                    int var10 = 64 * (-1 + var9.method125((byte) -124)) + 60;
                    int var11 = var9.field1896 - var10 >> 7;
                    int var12 = -var10 + var9.field1899 >> 7;
                    int var13 = var9.field1896 + var10 >> 7;
                    int var14 = var9.field1899 + var10 >> 7;
                    if (var11 <= arg2 && ~arg3 <= ~var12 && ~arg2 >= ~var13 && var14 >= arg3) {
                        int var15 = (var14 + 1 - arg3) * (-arg2 + 1 + var13);
                        if (var15 > var6) {
                            var6 = var15;
                            var5 = var9;
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method680(int arg0) {
        if (arg0 != 34166) {
            method681((class290) null, (class105) null, 66);
        }
        field1244 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lih;Lpq;)V")
    public class96(class503 arg0, class132 arg1) {
        super(arg0);
        this.field1255 = arg1;
        if (super.field2702.field7351 && super.field2702.field7354 >= 2) {
            this.field1259 = class454.method2647("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field2702, 34336, (byte) 94);
            if (this.field1259 != null) {
                int[][] var3 = class341.method2031(256, 0.4F, 0, 8, false, 4, 64, 3, true);
                int[][] var4 = class341.method2031(256, 0.4F, 8, 8, false, 4, 64, 3, true);
                int var5 = 0;
                this.field1249 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field1249[var5++] = (float) var7[var9] / 4096.0F;
                        this.field1249[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method678(-124);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lza;Ld;I)I")
    public static final int method681(class290 arg0, class105 arg1, int arg2) {
        ++field1246;
        if (arg2 != 256) {
            return -8;
        } else if (arg1.field1381 == -1) {
            if (arg1.field1385 != -1) {
                class222 var3 = arg0.field4246.method83(arg0.method317() ? arg1.field1385 : arg1.field1374, 64);
                if (!var3.field3199) {
                    return var3.field3204;
                }
            }
            return arg1.field1377;
        } else {
            return arg1.field1381;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
    public final boolean method53(byte arg0) {
        ++field1245;
        int var2 = -7 / ((arg0 - -58) / 43);
        return true;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
    public static final void method682(int arg0, int arg1, int arg2) {
        ++field1253;
        if (arg1 != 128) {
            method682(-67, -42, -113);
        }
        class251 var3 = class140.field1843[arg2][arg0];
        if (var3 != null) {
            class69.field874 = var3.field3738;
            class79.field1027 = var3.field3735;
            class240.field3496 = var3.field3737;
        }
        class453.method2644(0);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lsv;IB)V")
    public final void method51(class478 arg0, int arg1, byte arg2) {
        super.field2702.method2968(arg0, -82);
        if (arg2 == -58) {
            ++field1250;
            super.field2702.method2999(arg1, arg2 + 140);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)V")
    public final void method47(boolean arg0, int arg1) {
        if (arg1 != 2) {
            this.field1255 = null;
        }
        ++field1260;
    }
}
