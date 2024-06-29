import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class438 extends class518 {

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "Lpba;")
    private class472 field6046;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "Lvl;")
    private class139 field6051;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "[F")
    private float[] field6049;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field6042 = "";

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "[I")
    public static int[] field6053 = new int[32];

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "Lcb;")
    public static class318 field6054;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "F")
    private float field6048;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "F")
    public static float field6055;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    private int field6037;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Lhea;")
    private class393 field6039;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "[Lhc;")
    public static class293[] field6043;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method2517(byte arg0) {
        if (arg0 <= 111) {
            field6042 = null;
        }
        field6053 = null;
        field6043 = null;
        field6054 = null;
        field6042 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLwq;I)V")
    public final void method1138(byte arg0, class254 arg1, int arg2) {
        ++field6036;
        super.field7145.method3553((byte) 122, arg1);
        if (arg0 == 75) {
            super.field7145.method3524(arg2, 14);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZI)V")
    public final void method1134(int arg0, boolean arg1, int arg2) {
        ++field6040;
        if (this.field6039 != null) {
            super.field7145.method3488(1, (byte) 23);
            if (~(128 & arg0) == -1) {
                if ((arg2 & 1) != 1) {
                    if (!this.field6046.field6386) {
                        super.field7145.method3553((byte) -110, this.field6046.field6387[0]);
                    } else {
                        super.field7145.method3553((byte) 20, this.field6046.field6385);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (!this.field6046.field6386) {
                    int var4 = super.field7145.field8943 % 4000 * 16 / 4000;
                    super.field7145.method3553((byte) -110, this.field6046.field6387[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field7145.method3553((byte) 25, this.field6046.field6385);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field6048, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field7145.method3553((byte) -92, (class254) null);
            }
            super.field7145.method3488(0, (byte) 23);
            if (~(arg0 & 64) == -1) {
                OpenGL.glGetFloatv(2899, class519.field7159, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class519.field7159, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            if (arg1) {
                this.method1137(-80);
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

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)Z")
    public final boolean method1131(boolean arg0) {
        ++field6050;
        return !arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Loa;I)V")
    public static final void method2518(class689 arg0, int arg1) {
        ++field6041;
        int var2 = class544.field7454;
        int var3 = class326.field4744;
        int var4 = class353.field5151;
        int var5 = class169.field2116;
        int var6 = -10660793;
        arg0.method3811(var3, var4, var5, var2, var6, 127);
        if (arg1 != 64) {
            field6055 = 1.0508871F;
        }
        arg0.method3811(var3 - -1, var4 + -2, 16, var2 + 1, -16777216, 96);
        arg0.method3819(var4 + -2, arg1 + -68, var3 - -18, -16777216, var2 + 1, var5 + -19);
        class622.field8452.method1815(class243.field3235.method1491(class350.field5121, (byte) 125), -93, var2 + 3, var6, var3 + 14, -1);
        int var7 = class592.field8107.method268((byte) -86);
        int var8 = class592.field8107.method269((byte) -25);
        int var9 = 0;
        for (class69 var10 = (class69) class37.field371.method374((byte) 107); var10 != null; var10 = (class69) class37.field371.method372(-20740)) {
            int var11 = var3 - (-31 - (-var9 + class179.field2242 + -1) * 16);
            short var12 = -1;
            if (var7 > var2 && ~(var2 + var4) < ~var7 && ~(var11 - 13) > ~var8 && var11 + 3 > var8 && var10.field906) {
                var12 = -256;
            }
            int[] var13 = null;
            if (!class431.method2482(var10.field902, 21284)) {
                if (var10.field905 != -1) {
                    var13 = class237.field3088.method1349(-1, var10.field905).field9316;
                } else if (!class668.method3705(var10.field902, false)) {
                    if (class488.method2718(var10.field902, -17)) {
                        Object var14 = null;
                        class252 var15;
                        if (~var10.field902 == -1007) {
                            var15 = class578.field7980.method1746((int) var10.field900, (byte) 92);
                        } else {
                            var15 = class578.field7980.method1746((int) (2147483647L & var10.field900 >>> 32), (byte) 65);
                        }
                        if (var15.field3391 != null) {
                            var15 = var15.method1568(arg1 ^ -65, class327.field4771);
                        }
                        if (var15 != null) {
                            var13 = var15.field3468;
                        }
                    }
                } else {
                    class637 var16 = (class637) class77.field955.method2506(arg1 + 35, (long) ((int) var10.field900));
                    if (var16 != null) {
                        class676 var17 = var16.field8702;
                        class195 var18 = var17.field9594;
                        if (var18.field2557 != null) {
                            var18 = var18.method1242(class327.field4771, (byte) -32);
                        }
                        if (var18 != null) {
                            var13 = var18.field2574;
                        }
                    }
                }
            } else {
                var13 = class237.field3088.method1349(-1, (int) var10.field900).field9316;
            }
            String var19 = class192.method1229(96, var10);
            if (var13 != null) {
                var19 = var19 + class436.method2511(0, var13);
            }
            class622.field8452.method1816(var2 + 3, var11, var19, class315.field4561, class367.field5293, var12, (byte) 116, 0);
            ++var9;
            if (var10.field903) {
                class261.field3605.method2450(var2 + 5 - -class446.field6129.method3312(-23728, var19), var11 + -12);
            }
        }
        class8.method53(class326.field4744, class169.field2116, (byte) 93, class353.field5151, class544.field7454);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
    public final void method1133(boolean arg0, int arg1) {
        if (arg1 < 79) {
            this.field6051 = null;
        }
        ++field6038;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLpq;)V")
    public static final void method2519(byte arg0, class159 arg1) {
        ++field6045;
        class23.field219 = arg1;
        if (arg0 != 14) {
            field6054 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
    private final void method2520(int arg0) {
        this.field6039 = new class393(super.field7145, 2);
        ++field6044;
        this.field6039.method2339(4864, 0);
        super.field7145.method3488(1, (byte) 23);
        super.field7145.method3519(-16777216, arg0 + -45484);
        super.field7145.method3499(7681, 34161, 260);
        super.field7145.method3557(arg0 + -25376, 770, 0, 34166);
        super.field7145.method3488(0, (byte) 23);
        OpenGL.glBindProgramARB(arg0, this.field6051.field1780);
        OpenGL.glEnable(34336);
        this.field6039.method2338(-20555);
        this.field6039.method2339(4864, 1);
        super.field7145.method3488(1, (byte) 23);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field7145.method3524(0, 14);
        super.field7145.method3557(arg0 ^ 42272, 770, 0, 5890);
        super.field7145.method3488(0, (byte) 23);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field6039.method2338(-20555);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lpea;Lpba;)V")
    public class438(class641 arg0, class472 arg1) {
        super(arg0);
        this.field6046 = arg1;
        if (super.field7145.field8987 && ~super.field7145.field8979 <= -3) {
            this.field6051 = class436.method2501(34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field7145, false);
            if (this.field6051 != null) {
                int[][] var3 = class167.method1112(0.4F, 256, 8, 3, 4, false, 5, 64, 0);
                int[][] var4 = class167.method1112(0.4F, 256, 8, 3, 4, false, 5, 64, 8);
                int var5 = 0;
                this.field6049 = new float[32768];
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field6049[var5++] = (float) var7[var9] / 4096.0F;
                        this.field6049[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2520(34336);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZB)V")
    public final void method1139(boolean arg0, byte arg1) {
        if (arg1 != 127) {
            method2517((byte) 12);
        }
        ++field6052;
        if (this.field6039 != null) {
            this.field6039.method2336((byte) 32, '\u0000');
            super.field7145.method3488(1, (byte) 23);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field7145.field8980.method2257((byte) -20), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field7145.method3488(0, (byte) 23);
            if (~super.field7145.field8943 != ~this.field6037) {
                int var3 = super.field7145.field8943 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field6049, var4);
                    var4 += 2;
                }
                if (this.field6046.field6386) {
                    this.field6048 = (float) (super.field7145.field8943 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field6037 = super.field7145.field8943;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public final void method1137(int arg0) {
        ++field6047;
        if (this.field6039 != null) {
            this.field6039.method2336((byte) 32, '\u0001');
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3553((byte) 77, (class254) null);
            super.field7145.method3488(0, (byte) 23);
            if (arg0 != 6) {
                this.field6048 = 0.22795136F;
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field6053[var1] = var0 + -1;
            var0 += var0;
        }
        field6054 = new class318(107, 5);
    }
}
