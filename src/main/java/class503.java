import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class503 extends class140 {

    @OriginalMember(owner = "client!nw", name = "r", descriptor = "Lwq;")
    private class146 field7131;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "Lkh;")
    private class15 field7122;

    @OriginalMember(owner = "client!nw", name = "s", descriptor = "[F")
    private float[] field7132;

    @OriginalMember(owner = "client!nw", name = "p", descriptor = "Lh;")
    public static class572 field7129 = new class572("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!nw", name = "u", descriptor = "Lh;")
    public static class572 field7134 = new class572("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!nw", name = "m", descriptor = "F")
    private float field7126;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
    private int field7123;

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!nw", name = "n", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!nw", name = "q", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!nw", name = "t", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!nw", name = "v", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!nw", name = "o", descriptor = "Lwl;")
    private class348 field7128;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method149(int arg0) {
        if (arg0 >= -36) {
            this.method148(false, (byte) 68);
        }
        ++field7130;
        return true;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZB)V", line = 15)
    public final void method148(boolean arg0, byte arg1) {
        ++field7133;
        if (this.field7128 != null) {
            this.field7128.method2110('\u0000', (byte) -128);
            if (arg1 == -86) {
                super.field1984.method3111(33984, 1);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field1984.field7801.method334(14), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field1984.method3111(33984, 0);
                if (~super.field1984.field7747 != ~this.field7123) {
                    int var3 = super.field1984.field7747 % 5120 * 128 / 5120;
                    int var4 = var3 * 128;
                    for (int var5 = 0; ~var5 > -65; ++var5) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field7132, var4);
                        var4 += 2;
                    }
                    if (this.field7131.field2123) {
                        this.field7126 = (float) (super.field1984.field7747 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field7123 = super.field1984.field7747;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZ)V", line = 64)
    public final void method145(int arg0, boolean arg1) {
        ++field7125;
        if (arg0 != -7) {
            this.method144(103, -103, -108);
        }
    }

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "(I)V", line = 74)
    public static void method2993(int arg0) {
        field7129 = null;
        field7134 = null;
        if (arg0 <= 62) {
            field7129 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V", line = 88)
    public static final void method2994(byte arg0) {
        if (arg0 == -84) {
            ++field7135;
            int var1 = class618.field9132.length;
            for (int var2 = 0; var1 > var2; ++var2) {
                if (class618.field9132[var2] != null) {
                    int var3 = -1;
                    for (int var4 = 0; ~class379.field5222 < ~var4; ++var4) {
                        if (~class340.field4706[var2] == ~class205.field3048[var4]) {
                            var3 = var4;
                            break;
                        }
                    }
                    if (var3 == -1) {
                        class205.field3048[class379.field5222] = class340.field4706[var2];
                        var3 = class379.field5222++;
                    }
                    class148 var5 = new class148(class618.field9132[var2]);
                    int var6 = 0;
                    while (~var5.field2177 > ~class618.field9132[var2].length && ~var6 > -512 && ~class527.field7717 > -1024) {
                        int var7 = var3 | var6++ << 6;
                        int var8 = var5.method1045(true);
                        int var9 = var8 >> 14;
                        int var10 = 63 & var8 >> 7;
                        int var11 = 63 & var8;
                        int var12 = (class340.field4706[var2] >> 8) * 64 + -class473.field6687 + var10;
                        int var13 = (255 & class340.field4706[var2]) * 64 + -class38.field463 + var11;
                        class87 var14 = class64.field797.method1177(var5.method1045(true), false);
                        class505 var15 = (class505) class510.field7260.method2799((long) var7, true);
                        if (var15 == null && (var14.field1254 & 1) > 0 && ~class447.field6263 == ~var9 && var12 >= 0 && class146.field2125 > var14.field1237 + var12 && ~var13 <= -1 && ~class410.field5609 < ~(var14.field1237 + var13)) {
                            class571 var16 = new class571();
                            var16.field1904 = var7;
                            class505 var17 = new class505(var16);
                            class510.field7260.method2797(-4234, var17, (long) var7);
                            class57.field718[class599.field8840++] = var17;
                            class634.field9290[class527.field7717++] = var7;
                            var16.field1897 = class617.field9123;
                            var16.method3405(var14, 44);
                            var16.method958(4, var16.field8405.field1237);
                            var16.field1851 = var16.field8405.field1247 << 3;
                            var16.method941(true, 15415 & var16.field8405.field1266 + 4 << 11, (byte) 66);
                            var16.method3404(104, var13, var16.method940(arg0 + 83), true, var9, var12);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IILjl;)V", line = 189)
    public final void method146(int arg0, int arg1, class228 arg2) {
        super.field1984.method3152(-2, arg2);
        ++field7120;
        super.field1984.method3121(-27745, arg1);
        if (arg0 != -7) {
            this.field7122 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)V", line = 202)
    public final void method144(int arg0, int arg1, int arg2) {
        ++field7124;
        if (this.field7128 != null) {
            super.field1984.method3111(arg1 ^ -38469, 1);
            if (~(arg2 & 128) == -1) {
                if ((arg0 & 1) != 1) {
                    if (!this.field7131.field2123) {
                        super.field1984.method3152(-2, this.field7131.field2115[0]);
                    } else {
                        super.field1984.method3152(arg1 + 4739, this.field7131.field2122);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (!this.field7131.field2123) {
                    int var4 = super.field1984.field7747 % 4000 * 16 / 4000;
                    super.field1984.method3152(-2, this.field7131.field2115[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field1984.method3152(arg1 ^ 4741, this.field7131.field2122);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field7126, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field1984.method3152(-2, (class228) null);
            }
            super.field1984.method3111(33984, 0);
            if ((arg2 & 64) != 0) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class228.field3341, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class228.field3341, 0);
            }
            if (arg1 != -4741) {
                this.method143(-46);
            }
            int var5 = arg2 & 3;
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var5 == -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "(I)V", line = 279)
    public final void method143(int arg0) {
        ++field7127;
        if (this.field7128 != null) {
            this.field7128.method2110('\u0001', (byte) -127);
            if (arg0 != -7) {
                method2994((byte) -118);
            }
            super.field1984.method3111(33984, 1);
            super.field1984.method3152(-2, (class228) null);
            super.field1984.method3111(arg0 + 33991, 0);
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)V", line = 301)
    private final void method2995(byte arg0) {
        this.field7128 = new class348(super.field1984, 2);
        ++field7121;
        if (arg0 > -92) {
            method2994((byte) -80);
        }
        this.field7128.method2113(0, 25033);
        super.field1984.method3111(33984, 1);
        super.field1984.method3115(true, -16777216);
        super.field1984.method3183(260, -126, 7681);
        super.field1984.method3107(34166, (byte) -38, 770, 0);
        super.field1984.method3111(33984, 0);
        OpenGL.glBindProgramARB(34336, this.field7122.field152);
        OpenGL.glEnable(34336);
        this.field7128.method2114(0);
        this.field7128.method2113(1, 25033);
        super.field1984.method3111(33984, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field1984.method3121(-27745, 0);
        super.field1984.method3107(5890, (byte) -12, 770, 0);
        super.field1984.method3111(33984, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field7128.method2114(0);
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lte;Lwq;)V", line = 337)
    public class503(class527 arg0, class146 arg1) {
        super(arg0);
        this.field7131 = arg1;
        if (super.field1984.field7862 && ~super.field1984.field7807 <= -3) {
            this.field7122 = class602.method3557(34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", (byte) -110, super.field1984);
            if (this.field7122 != null) {
                int[][] var3 = class192.method1308(64, 8, -7, 4, 3, 0.4F, false, 0, 256);
                int[][] var4 = class192.method1308(64, 8, -7, 4, 3, 0.4F, false, 8, 256);
                int var5 = 0;
                this.field7132 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field7132[var5++] = (float) var7[var9] / 4096.0F;
                        this.field7132[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method2995((byte) -116);
            }
        }
    }
}
