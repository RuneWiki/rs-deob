import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class14 extends class209 {

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Lln;")
    private class94 field149;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Lqj;")
    private class504 field151;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[F")
    private float[] field146;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Z")
    public static boolean field137 = false;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "[I")
    public static int[] field147 = new int[6];

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field139 = 0;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "F")
    private float field148;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lcn;")
    private class21 field138;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field153;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field143;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
    public final void method45(int arg0, int arg1, int arg2) {
        ++field136;
        if (this.field138 != null) {
            if (arg2 >= -75) {
                this.field148 = 0.07574946F;
            }
            super.field2710.method1966(3000, 1);
            if ((arg0 & 128) != 0) {
                super.field2710.method1884((class148) null, -2);
            } else if (~(arg1 & 1) != -2) {
                if (!this.field149.field1243) {
                    super.field2710.method1884(this.field149.field1250[0], -2);
                } else {
                    super.field2710.method1884(this.field149.field1247, -2);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else if (this.field149.field1243) {
                super.field2710.method1884(this.field149.field1247, -2);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field148, 0.0F, 0.0F, 1.0F);
            } else {
                int var4 = super.field2710.field4198 % 4000 * 16 / 4000;
                super.field2710.method1884(this.field149.field1250[var4], -2);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            super.field2710.method1966(3000, 0);
            if ((arg0 & 64) != 0) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class527.field7335, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class527.field7335, 0);
            }
            int var5 = 3 & arg0;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 != 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public final void method43(int arg0) {
        ++field144;
        if (this.field138 != null) {
            this.field138.method118('\u0001', 0);
            if (arg0 != -1) {
                this.field146 = null;
            }
            super.field2710.method1966(3000, 1);
            super.field2710.method1884((class148) null, -2);
            super.field2710.method1966(3000, 0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
    public static final void method67() {
        for (int var0 = 0; var0 < class444.field6143; ++var0) {
            if (!class209.field2709[var0]) {
                class597 var1 = class256.field3175[var0];
                class592 var2 = var1.field8621;
                int var3 = var1.field8612;
                int var4 = var2.method3420(true) - class337.field4699;
                int var5 = (var4 * 2 >> class400.field5480) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3414(232) - var4 >> class400.field5480;
                int var9 = var2.method3415((byte) 117) - var4 >> class400.field5480;
                int var10 = var2.method3415((byte) 117) + var4 >> class400.field5480;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class541.field7566) {
                    var10 = class541.field7566 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field8611[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class260.field3211) {
                        var16 = class260.field3211 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class450 var19 = class49.method273(var3, var17, var11, field153 != null ? field153 : (field153 = method70("fu")));
                        if (var19 != null && var19.field6356 != 0) {
                            if (var19.field6356 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field8611[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field8611[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field8611[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field8611[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    ++var6;
                }
                class209.field2709[var0] = true;
                class501.field6947[var3].method1032(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(ZB)V")
    public final void method48(boolean arg0, byte arg1) {
        if (arg1 >= 122) {
            ++field145;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Luq;Lln;)V")
    public class14(class313 arg0, class94 arg1) {
        super(arg0);
        this.field149 = arg1;
        if (super.field2710.field4281 && super.field2710.field4237 >= 2) {
            this.field151 = class32.method186((byte) -116, super.field2710, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field151 != null) {
                int[][] var3 = class30.method179(0, 0.4F, 3, 8, 64, 4, false, 256, true);
                int[][] var4 = class30.method179(8, 0.4F, 3, 8, 64, 4, false, 256, true);
                this.field146 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field146[var5++] = (float) var7[var9] / 4096.0F;
                        this.field146[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method69(5888);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        ++field140;
        return arg0;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public static void method68(int arg0) {
        if (arg0 == 32373) {
            field143 = null;
            field147 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZB)V")
    public final void method47(boolean arg0, byte arg1) {
        ++field141;
        if (arg1 <= 88) {
            method67();
        }
        if (this.field138 != null) {
            this.field138.method118('\u0000', 0);
            super.field2710.method1966(3000, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2710.field4307.method2415(0), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field2710.method1966(3000, 0);
            if (~super.field2710.field4198 != ~this.field150) {
                int var3 = super.field2710.field4198 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field146, var4);
                    var4 += 2;
                }
                if (this.field149.field1243) {
                    this.field148 = (float) (super.field2710.field4198 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field150 = super.field2710.field4198;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    private final void method69(int arg0) {
        ++field152;
        this.field138 = new class21(super.field2710, 2);
        this.field138.method120((byte) -123, 0);
        super.field2710.method1966(3000, 1);
        super.field2710.method1885(-16777216, 62);
        super.field2710.method1887(-108, 260, 7681);
        super.field2710.method1947(34162, 34166, 0, 770);
        super.field2710.method1966(3000, 0);
        OpenGL.glBindProgramARB(34336, this.field151.field7010);
        OpenGL.glEnable(34336);
        this.field138.method123(4864);
        this.field138.method120((byte) -124, 1);
        super.field2710.method1966(3000, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(arg0);
        super.field2710.method1909(-116, 0);
        super.field2710.method1947(34162, 5890, 0, 770);
        super.field2710.method1966(3000, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field138.method123(arg0 + -1024);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lea;IZ)V")
    public final void method44(class148 arg0, int arg1, boolean arg2) {
        ++field142;
        if (arg2) {
            super.field2710.method1884(arg0, -2);
            super.field2710.method1909(-118, arg1);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method70(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
