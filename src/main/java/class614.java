import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class614 {

    @OriginalMember(owner = "client!tfa", name = "s", descriptor = "Lji;")
    private class622 field8301;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "Lwo;")
    private class295 field8291;

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
    public int field8295;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    private int field8286;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "[B")
    public byte[] field8287;

    @OriginalMember(owner = "client!tfa", name = "r", descriptor = "I")
    private int field8300;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    private int field8288;

    @OriginalMember(owner = "client!tfa", name = "l", descriptor = "I")
    private int field8294;

    @OriginalMember(owner = "client!tfa", name = "n", descriptor = "Lfl;")
    public static class103 field8296 = new class103(0, 1);

    @OriginalMember(owner = "client!tfa", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field8298 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!tfa", name = "k", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!tfa", name = "o", descriptor = "I")
    public static int field8297;

    @OriginalMember(owner = "client!tfa", name = "q", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "[[Lwea;")
    private class90[][] field8283;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIBII)V", line = 3)
    private final void method3328(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field8293++;
        if (this.field8283 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 - (1 - arg0) - 1 >> 7;
        if (arg2 > -63) {
            return;
        }
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class90[] var11 = this.field8283[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field1188 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lwk;B)V", line = 43)
    public static final void method3329(class227 arg0, byte arg1) {
        if (arg1 != -46) {
            method3329(null, (byte) -30);
        }
        if (arg0 instanceof class532) {
            class532 var2 = (class532) arg0;
            if (var2.field6914 != null) {
                class239.method1503(class233.field3130.field508 != var2.field508, 3314, var2);
            }
        } else if (arg0 instanceof class193) {
            class193 var3 = (class193) arg0;
            class171.method1165(class233.field3130.field508 != var3.field508, var3, 6);
        }
        field8289++;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "([[ZIIIIZ)V", line = 74)
    public final void method3330(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field8301.method3425(false, 119);
        field8284++;
        this.field8301.method3424(false, -32);
        this.field8301.method3459((byte) -112, -2);
        this.field8301.method3443(1, true);
        this.field8301.method3403(1, -3);
        float var7 = 1.0F / (float) (this.field8301.field8570 * 128);
        if (arg5) {
            for (int var8 = 0; var8 < this.field8294; var8++) {
                int var9 = var8 << this.field8300;
                int var10 = var8 + 1 << this.field8300;
                label136: for (int var11 = 0; var11 < this.field8288; var11++) {
                    int var12 = var11 << this.field8300;
                    int var13 = var11 + 1 << this.field8300;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (var14 - arg3 >= -arg2 && (var14 - arg3) <= arg2) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (-arg2 <= var15 - arg4 && (var15 - arg4) <= arg2 && arg0[var14 + arg2 - arg3][arg2 + var15 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field8283[var11][var8].method681(0);
                                    continue label136;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field8294; var16++) {
                int var17 = var16 << this.field8300;
                int var18 = var16 + 1 << this.field8300;
                for (int var19 = 0; var19 < this.field8288; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field8300;
                    int var22 = var19 + 1 << this.field8300;
                    class703 var23 = this.field8301.field8654;
                    var23.field5367 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (-arg2 <= var24 - arg4 && arg2 >= var24 - arg4) {
                            int var25 = this.field8291.field1166 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg3 >= -arg2 && arg2 >= (var26 - arg3) && arg0[arg2 + var26 - arg3][var24 + arg2 - arg4]) {
                                    short[] var27 = this.field8291.field3853[var25];
                                    if (var27 != null) {
                                        if (this.field8301.field8631) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method2386(var27[var29] & 0xFFFF, 1103587288);
                                                var20++;
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method2356(var27[var28] & 0xFFFF, -18174);
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
                        this.field8283[var19][var16].method679(5123, 108, var23.field5393, var20);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        if (arg1 < 124) {
            this.field8295 = 30;
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIZIIIILwca;III)Z", line = 260)
    public static final boolean method3331(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class36 arg7, int arg8, int arg9, int arg10) {
        field8299++;
        int var11 = arg1;
        int var12 = arg9;
        byte var13 = 64;
        if (arg2) {
            field8296 = null;
        }
        byte var14 = 64;
        int var15 = arg1 - var13;
        int var16 = arg9 - var14;
        class366.field4724[var13][var14] = 99;
        class649.field9041[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class191.field2440[var17] = arg1;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class181.field2231[var10001] = arg9;
        int[][] var19 = arg7.field530;
        while (var26 != var18) {
            var11 = class191.field2440[var18];
            var12 = class181.field2231[var18];
            int var20 = var12 - arg7.field519;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg7.field523;
            int var23 = var12 - var16;
            if (arg6 == -4) {
                if (arg3 == var11 && arg0 == var12) {
                    class354.field4560 = var11;
                    class289.field3734 = var12;
                    return true;
                }
            } else if (arg6 == -3) {
                if (class663.method3632(var12, (byte) 117, 1, 1, var11, arg10, arg3, arg4, arg0)) {
                    class289.field3734 = var12;
                    class354.field4560 = var11;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg7.method298(127, arg3, arg4, 1, var11, var12, arg0, arg5, arg10, 1)) {
                    class354.field4560 = var11;
                    class289.field3734 = var12;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg7.method291(0, arg3, arg10, var12, arg4, arg0, var11, arg5, 1)) {
                    class354.field4560 = var11;
                    class289.field3734 = var12;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg7.method295(arg3, (byte) 106, 1, arg6, arg8, arg0, var11, var12)) {
                    class289.field3734 = var12;
                    class354.field4560 = var11;
                    return true;
                }
            } else if (arg7.method293(var12, 1, arg0, arg3, arg8, arg6, var11, (byte) 97)) {
                class354.field4560 = var11;
                class289.field3734 = var12;
                return true;
            }
            int var25 = class649.field9041[var21][var23] + 1;
            if (var21 > 0 && class366.field4724[var21 - 1][var23] == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0) {
                class191.field2440[var26] = var11 - 1;
                class181.field2231[var26] = var12;
                class366.field4724[var21 - 1][var23] = 2;
                var26 = var26 + 1 & 0xFFF;
                class649.field9041[var21 - 1][var23] = var25;
            }
            if (var21 < 127 && class366.field4724[var21 + 1][var23] == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0) {
                class191.field2440[var26] = var11 + 1;
                class181.field2231[var26] = var12;
                class366.field4724[var21 + 1][var23] = 8;
                var26 = var26 + 1 & 0xFFF;
                class649.field9041[var21 + 1][var23] = var25;
            }
            if (var23 > 0 && class366.field4724[var21][var23 - 1] == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class191.field2440[var26] = var11;
                class181.field2231[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class366.field4724[var21][var23 - 1] = 1;
                class649.field9041[var21][var23 - 1] = var25;
            }
            if (var23 < 127 && class366.field4724[var21][var23 + 1] == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class191.field2440[var26] = var11;
                class181.field2231[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class366.field4724[var21][var23 + 1] = 4;
                class649.field9041[var21][var23 + 1] = var25;
            }
            if (var21 > 0 && var23 > 0 && class366.field4724[var21 - 1][var23 - 1] == 0 && (var19[var22 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class191.field2440[var26] = var11 - 1;
                class181.field2231[var26] = var12 - 1;
                class366.field4724[var21 - 1][var23 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class649.field9041[var21 - 1][var23 - 1] = var25;
            }
            if (var21 < 127 && var23 > 0 && class366.field4724[var21 + 1][var23 - 1] == 0 && (var19[var22 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class191.field2440[var26] = var11 + 1;
                class181.field2231[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class366.field4724[var21 + 1][var23 - 1] = 9;
                class649.field9041[var21 + 1][var23 - 1] = var25;
            }
            if (var21 > 0 && var23 < 127 && class366.field4724[var21 - 1][var23 + 1] == 0 && (var19[var22 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class191.field2440[var26] = var11 - 1;
                class181.field2231[var26] = var12 + 1;
                class366.field4724[var21 - 1][var23 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class649.field9041[var21 - 1][var23 + 1] = var25;
            }
            if (var21 < 127 && var23 < 127 && class366.field4724[var21 + 1][var23 + 1] == 0 && (var19[var22 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class191.field2440[var26] = var11 + 1;
                class181.field2231[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class366.field4724[var21 + 1][var23 + 1] = 12;
                class649.field9041[var21 + 1][var23 + 1] = var25;
            }
        }
        class289.field3734 = var12;
        class354.field4560 = var11;
        return false;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V", line = 519)
    public final void method3332(int arg0) {
        field8285++;
        this.field8283 = new class90[this.field8288][this.field8294];
        for (int var2 = 0; var2 < this.field8294; var2++) {
            for (int var3 = 0; var3 < this.field8288; var3++) {
                this.field8283[var3][var2] = new class90(this.field8301, this, this.field8291, var3, var2, this.field8300, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
        if (arg0 != 1) {
            this.field8294 = 2;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILw;II)Z", line = 548)
    public final boolean method3333(int arg0, class605 arg1, int arg2, int arg3) {
        field8292++;
        class680 var5 = (class680) arg1;
        int var6 = var5.field9370 + arg2 + 1;
        int var7 = var5.field9374 + arg0 + 1;
        int var8 = this.field8295 * var6 + var7;
        int var9 = var5.field9373;
        int var10 = var5.field9378;
        int var11 = this.field8295 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var6 = 1;
            var8 += this.field8295 * var12;
            var9 -= var12;
        }
        if (arg3 != 29733) {
            method3331(18, -109, false, 85, 102, -115, -70, null, 61, -4, 89);
        }
        if (var6 + var9 >= this.field8286) {
            int var13 = var6 + var9 + 1 - this.field8286;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var7 = 1;
            var10 -= var14;
            var11 += var14;
        }
        if (this.field8295 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field8295;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field8295 + var11;
            return class531.method2824(var8, var10, var17, var9, var16, this.field8287, (byte) 125);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)V", line = 624)
    public static void method3334(boolean arg0) {
        field8296 = null;
        field8298 = null;
        if (arg0) {
            field8298 = null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IBLw;I)V", line = 635)
    public final void method3335(int arg0, byte arg1, class605 arg2, int arg3) {
        field8297++;
        class680 var5 = (class680) arg2;
        int var6 = var5.field9370 + arg0 + 1;
        int var7 = var5.field9374 + arg3 + 1;
        int var8 = this.field8295 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field9373;
        int var11 = var5.field9378;
        int var12 = this.field8295 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var8 += this.field8295 * var13;
            var6 = 1;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (arg1 <= 56) {
            return;
        }
        if (this.field8286 <= var6 + var10) {
            int var15 = var6 - (-var10 - 1) - this.field8286;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var14 += var16;
            var11 -= var16;
            var9 += var16;
            var7 = 1;
            var12 += var16;
        }
        if ((var7 + var11) >= this.field8295) {
            int var17 = var7 + var11 + 1 - this.field8295;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class244.method1527(this.field8287, var10, var14, var11, -1, var12, var8, var9, var5.field9372);
            this.method3328(var11, var7, (byte) -91, var6, var10);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BILw;I)V", line = 711)
    public final void method3336(byte arg0, int arg1, class605 arg2, int arg3) {
        field8290++;
        class680 var5 = (class680) arg2;
        int var6 = var5.field9370 + arg1 + 1;
        int var7 = var5.field9374 + arg3 + 1;
        int var8 = this.field8295 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field9373;
        if (arg0 < 73) {
            return;
        }
        int var11 = var5.field9378;
        int var12 = this.field8295 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field8295 * var13;
            var9 += var11 * var13;
            var10 -= var13;
            var6 = 1;
        }
        int var14 = 0;
        if ((var6 + var10) >= this.field8286) {
            int var15 = var6 - (this.field8286 - var10 - 1);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var11 -= var16;
            var9 += var16;
            var14 += var16;
            var7 = 1;
            var12 += var16;
        }
        if ((var7 + var11) >= this.field8295) {
            int var17 = var7 + var11 + 1 - this.field8295;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class14.method83(var9, var11, var8, var5.field9372, var12, this.field8287, (byte) 38, var10, var14);
            this.method3328(var11, var7, (byte) -118, var6, var10);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lji;Lwo;)V", line = 781)
    public class614(class622 arg0, class295 arg1) {
        this.field8301 = arg0;
        this.field8291 = arg1;
        this.field8295 = (this.field8291.field1166 * this.field8291.field1163 >> this.field8301.field8571) + 2;
        this.field8286 = (this.field8291.field1164 * this.field8291.field1163 >> this.field8301.field8571) + 2;
        this.field8287 = new byte[this.field8295 * this.field8286];
        this.field8300 = this.field8301.field8571 + 7 - this.field8291.field1168;
        this.field8288 = this.field8291.field1166 >> this.field8300;
        this.field8294 = this.field8291.field1164 >> this.field8300;
    }
}
