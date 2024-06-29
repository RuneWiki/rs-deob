import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class152 {

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "Lvfa;")
    private class436 field2144;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "Luca;")
    private class287 field2140;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
    private int field2146;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "[B")
    public byte[] field2141;

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "I")
    private int field2145;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "I")
    private int field2142;

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
    private int field2147;

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "Ldc;")
    public static class302 field2150 = new class302();

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "Liba;")
    public static class211 field2151 = new class211(79, 8);

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "[[Ltm;")
    private class550[][] field2139;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V", line = 8)
    public final void method1078(byte arg0) {
        field2136++;
        this.field2139 = new class550[this.field2142][this.field2147];
        if (arg0 >= -23) {
            this.field2140 = null;
        }
        for (int var2 = 0; var2 < this.field2147; var2++) {
            for (int var3 = 0; var3 < this.field2142; var3++) {
                this.field2139[var3][var2] = new class550(this.field2140, this, this.field2144, var3, var2, this.field2145, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZBII[[Z)V", line = 36)
    public final void method1079(int arg0, boolean arg1, byte arg2, int arg3, int arg4, boolean[][] arg5) {
        this.field2140.method1705(false, (byte) -80);
        field2137++;
        if (arg2 > -85) {
            this.method1079(127, false, (byte) 56, 110, 55, null);
        }
        this.field2140.method1694((byte) 117, false);
        this.field2140.method1761(-2, 260);
        this.field2140.method1751(1, 21575);
        this.field2140.method1721(79, 1);
        float var7 = 1.0F / (float) (this.field2140.field4022 * 128);
        if (arg1) {
            for (int var8 = 0; var8 < this.field2147; var8++) {
                int var9 = var8 << this.field2145;
                int var10 = var8 + 1 << this.field2145;
                label135: for (int var11 = 0; var11 < this.field2142; var11++) {
                    int var12 = var11 << this.field2145;
                    int var13 = var11 + 1 << this.field2145;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg4) >= (-arg0) && arg0 >= (var14 - arg4)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((-arg0) <= (var15 - arg3) && arg0 >= (var15 - arg3) && arg5[var14 + arg0 - arg4][var15 + arg0 - arg3]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field2139[var11][var8].method3214(-582);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field2147; var16++) {
                int var17 = var16 << this.field2145;
                int var18 = var16 + 1 << this.field2145;
                for (int var19 = 0; var19 < this.field2142; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field2145;
                    int var22 = var19 + 1 << this.field2145;
                    class449 var23 = this.field2140.field4073;
                    var23.field7956 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (var24 - arg3 >= -arg0 && arg0 >= (var24 - arg3)) {
                            int var25 = this.field2144.field9628 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((var26 - arg4) >= (-arg0) && (var26 - arg4) <= arg0 && arg5[var26 + arg0 - arg4][var24 + arg0 - arg3]) {
                                    short[] var27 = this.field2144.field6341[var25];
                                    if (var27 != null) {
                                        if (this.field2140.field4060) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method3162(-2003712696, var27[var29] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method3120(var27[var28] & 0xFFFF, -23026);
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var20 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var19) / var7, (float) (-var16) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field2139[var19][var16].method3211(var20, var23.field7952, 5123, (byte) 71);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILha;II)V", line = 221)
    public final void method1080(int arg0, class425 arg1, int arg2, int arg3) {
        field2148++;
        class495 var5 = (class495) arg1;
        int var6 = var5.field7013 + arg0 - arg2;
        int var7 = var5.field7009 + arg3 + 1;
        int var8 = this.field2135 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field7015;
        int var11 = var5.field7008;
        int var12 = this.field2135 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var8 += this.field2135 * var13;
            var9 += var11 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field2146) {
            int var15 = var7 + var10 + 1 - this.field2146;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var9 += var16;
            var6 = 1;
            var8 += var16;
            var11 -= var16;
            var12 += var16;
        }
        if (var6 + var11 >= this.field2135) {
            int var17 = var6 + 1 - (-var11 + this.field2135);
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class141.method991(var8, this.field2141, var12, var14, var5.field7012, var9, var10, var11, -31619);
            this.method1083(var10, arg2 ^ 0x260D, var6, var7, var11);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "()V", line = 294)
    public static final void method1081() {
        if (class39.field585 != null) {
            for (int var0 = 0; var0 < class39.field585.length; var0++) {
                for (int var1 = 0; var1 < class91.field1390; var1++) {
                    for (int var2 = 0; var2 < class575.field8372; var2++) {
                        if (class39.field585[var0][var1][var2] != null) {
                            class39.field585[var0][var1][var2].method255(1);
                        }
                        class39.field585[var0][var1][var2] = null;
                    }
                }
            }
        }
        class39.field585 = null;
        class262.field3404 = null;
        if (class591.field8590 != null) {
            for (int var3 = 0; var3 < class591.field8590.length; var3++) {
                for (int var4 = 0; var4 < class91.field1390; var4++) {
                    for (int var5 = 0; var5 < class575.field8372; var5++) {
                        if (class591.field8590[var3][var4][var5] != null) {
                            class591.field8590[var3][var4][var5].method255(1);
                        }
                        class591.field8590[var3][var4][var5] = null;
                    }
                }
            }
        }
        class591.field8590 = null;
        class383.field5753 = null;
        class603.field8695 = null;
        class178.field2480 = null;
        class406.field6066 = null;
        class501.field7093 = null;
        class60.field964 = null;
        class297.field4370 = null;
        class39.method223(127);
        if (class117.field1753 != null) {
            for (int var6 = 0; var6 < class296.field4366; var6++) {
                class117.field1753[var6] = null;
            }
            class296.field4366 = 0;
        }
        if (class313.field4591 != null) {
            for (int var7 = 0; var7 < class311.field4576[0]; var7++) {
                class313.field4591[0][var7] = null;
            }
            for (int var8 = 0; var8 < class311.field4576[1]; var8++) {
                class313.field4591[1][var8] = null;
            }
            class311.field4576 = new int[2];
        }
        if (class403.field6051 != null) {
            for (int var9 = 0; var9 < class48.field760[0]; var9++) {
                class403.field6051[0][var9] = null;
            }
            for (int var10 = 0; var10 < class48.field760[1]; var10++) {
                class403.field6051[1][var10] = null;
            }
            class48.field760 = new int[2];
        }
        if (class153.field2152 != null) {
            for (int var11 = 0; var11 < class464.field6700[0]; var11++) {
                class153.field2152[0][var11] = null;
            }
            for (int var12 = 0; var12 < class464.field6700[1]; var12++) {
                class153.field2152[1][var12] = null;
            }
            class464.field6700 = new int[2];
        }
        if (class258.field3351 != null) {
            for (int var13 = 0; var13 < class258.field3351.length; var13++) {
                class258.field3351[var13] = null;
            }
            class129.field1862 = 0;
        }
        if (class249.field3275 != null) {
            for (int var14 = 0; var14 < class249.field3275.length; var14++) {
                class249.field3275[var14] = null;
            }
            class141.field2035 = 0;
        }
        if (class324.field4707 != null) {
            for (int var15 = 0; var15 < class291.field4276; var15++) {
                class324.field4707[var15] = null;
            }
            for (int var16 = 0; var16 < class555.field8157; var16++) {
                for (int var17 = 0; var17 < class91.field1390; var17++) {
                    for (int var18 = 0; var18 < class575.field8372; var18++) {
                        class267.field3487[var16][var17][var18] = 0L;
                    }
                }
            }
            class291.field4276 = 0;
        }
        class417.method2536((byte) 122);
        class604.field8729.method2366(false);
        class319.field4644 = null;
        class697.field9813 = null;
        class267.field3482 = null;
        if (class466.field6718 != null) {
            class492.method2814();
            class503.field7110.method626(1);
            class503.field7110.method665(0);
        }
        if (class78.field1283 != null) {
            class78.field1283 = null;
        }
        class503.field7110 = null;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(ILha;II)Z", line = 517)
    public final boolean method1082(int arg0, class425 arg1, int arg2, int arg3) {
        field2149++;
        class495 var5 = (class495) arg1;
        int var6 = var5.field7009 + arg2 + 1;
        int var7 = 15 / ((arg3 + 31) / 41);
        int var8 = var5.field7013 + arg0 + 1;
        int var9 = this.field2135 * var6 + var8;
        int var10 = var5.field7015;
        int var11 = var5.field7008;
        int var12 = this.field2135 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var9 += this.field2135 * var13;
            var10 -= var13;
        }
        if (var6 + var10 >= this.field2146) {
            int var14 = var6 + 1 - (-var10 - -this.field2146);
            var10 -= var14;
        }
        if (var8 <= 0) {
            int var15 = 1 - var8;
            var9 += var15;
            var12 += var15;
            var8 = 1;
            var11 -= var15;
        }
        if (this.field2135 <= (var8 + var11)) {
            int var16 = var8 + var11 + 1 - this.field2135;
            var12 += var16;
            var11 -= var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field2135 + var12;
            return class308.method1921(var11, var17, this.field2141, var18, var9, var10, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIII)V", line = 589)
    private final void method1083(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2143++;
        if (this.field2139 == null) {
            return;
        }
        if (arg1 != -9742) {
            this.field2141 = null;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg4 + arg2 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg0 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class550[] var11 = this.field2139[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field8109 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V", line = 630)
    public static void method1084(int arg0) {
        field2150 = null;
        if (arg0 == 1) {
            field2151 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Luca;Lvfa;)V", line = 640)
    public class152(class287 arg0, class436 arg1) {
        this.field2144 = arg1;
        this.field2140 = arg0;
        this.field2135 = (this.field2144.field9629 * this.field2144.field9628 >> this.field2140.field4019) + 2;
        this.field2146 = (this.field2144.field9630 * this.field2144.field9629 >> this.field2140.field4019) + 2;
        this.field2141 = new byte[this.field2146 * this.field2135];
        this.field2145 = this.field2140.field4019 + 7 - this.field2144.field9623;
        this.field2142 = this.field2144.field9628 >> this.field2145;
        this.field2147 = this.field2144.field9630 >> this.field2145;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IILha;B)V", line = 656)
    public final void method1085(int arg0, int arg1, class425 arg2, byte arg3) {
        field2138++;
        class495 var5 = (class495) arg2;
        int var6 = var5.field7013 + arg0 + 1;
        int var7 = var5.field7009 + arg1 + 1;
        int var8 = var6 + (this.field2135 * var7);
        int var9 = 0;
        int var10 = var5.field7015;
        int var11 = var5.field7008;
        int var12 = this.field2135 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += this.field2135 * var14;
            var7 = 1;
            var9 += var11 * var14;
            var10 -= var14;
        }
        if ((var7 + var10) >= this.field2146) {
            int var15 = var7 + var10 + 1 - this.field2146;
            var10 -= var15;
        }
        if (arg3 != -38) {
            return;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var13 += var16;
            var8 += var16;
            var12 += var16;
            var11 -= var16;
            var9 += var16;
        }
        if (var6 + var11 >= this.field2135) {
            int var17 = var11 + var6 + 1 - this.field2135;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class158.method1135(var13, var5.field7012, this.field2141, var12, -1, var11, var9, var8, var10);
            this.method1083(var10, -9742, var6, var7, var11);
        }
    }
}
