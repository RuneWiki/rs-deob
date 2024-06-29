import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class176 {

    @OriginalMember(owner = "client!il", name = "w", descriptor = "[Ltaa;")
    public class345[] field91;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[Lke;")
    public class514[] field90;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "[B")
    public byte[] field83;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "[B")
    public byte[] field86;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "[I")
    private int[] field92;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "[S")
    public short[] field85;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "[B")
    public byte[] field84;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "Lan;")
    public static class21 field89;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "[I")
    public static int[] field87;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([IBLhj;[B)Z")
    public final boolean method41(int[] arg0, byte arg1, class489 arg2, byte[] arg3) {
        field82++;
        boolean var5 = true;
        if (arg1 != -91) {
            method44(-65);
        }
        int var6 = 0;
        class514 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field92[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method2838(var9 >> 2, arg0, 125);
                        } else {
                            var7 = arg2.method2836(arg0, -943, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field90[var8] = var7;
                        this.field92[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lbea;IIBI)V")
    public static final void method42(class188 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field88++;
        int var5 = arg0.field616[0];
        int var6 = arg0.field618[0];
        if (var5 < 0 || class32.field513 <= var5 || var6 < 0 || var6 >= class611.field8786 || arg2 < 0 || class32.field513 <= arg2 || arg1 < 0 || class611.field8786 <= arg1) {
            return;
        }
        int var7 = class573.method3265(class314.field4234, (byte) -52, class428.field6075[arg0.field6035], 0, arg1, var5, 0, var6, arg0.method337(0), -4, 0, class236.field3314, arg2, true, 0);
        if (var7 >= 1 && var7 <= 3 && arg4 >= 94) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method1175(class314.field4234[var8], -1, arg3, class236.field3314[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public final void method43(boolean arg0) {
        if (arg0) {
            this.field86 = null;
        }
        this.field92 = null;
        field94++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method44(int arg0) {
        field87 = null;
        field89 = null;
        if (arg0 != 468465217) {
            field89 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field81++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg2 - arg7;
        int var12 = arg0 - arg7;
        if (arg4 > -2) {
            method44(15);
        }
        int var13 = arg2 * arg2;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg0 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class182.field2580[arg5];
        class266.method1742(26844, var39, arg6 - var11, arg3, arg6 - arg2);
        class266.method1742(26844, var39, arg6 + var11, arg1, arg6 - var11);
        class266.method1742(26844, var39, arg6 + arg2, arg3, arg6 + var11);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var41 = arg5 - var9;
            int var42 = arg5 + var9;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg6 + var10;
                int var46 = arg6 - var10;
                class266.method1742(26844, class182.field2580[var41], var46, arg3, var44);
                class266.method1742(26844, class182.field2580[var41], var45, arg1, var46);
                class266.method1742(26844, class182.field2580[var41], var43, arg3, var45);
                class266.method1742(26844, class182.field2580[var42], var46, arg3, var44);
                class266.method1742(26844, class182.field2580[var42], var45, arg1, var46);
                class266.method1742(26844, class182.field2580[var42], var43, arg3, var45);
            } else {
                class266.method1742(26844, class182.field2580[var41], var43, arg3, var44);
                class266.method1742(26844, class182.field2580[var42], var43, arg3, var44);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class7() {
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "([B)V")
    public class7(byte[] arg0) {
        this.field91 = new class345[128];
        this.field90 = new class514[128];
        this.field83 = new byte[128];
        this.field86 = new byte[128];
        this.field92 = new int[128];
        this.field85 = new short[128];
        this.field84 = new byte[128];
        class11 var2 = new class11(arg0);
        int var3;
        for (var3 = 0; var2.field138[var2.field165 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method67(65280);
        }
        var3++;
        var2.field165++;
        int var6 = var2.field165;
        var2.field165 += var3;
        int var7;
        for (var7 = 0; var2.field138[var2.field165 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method67(65280);
        }
        var7++;
        var2.field165++;
        int var10 = var2.field165;
        var2.field165 += var7;
        int var11;
        for (var11 = 0; var2.field138[var2.field165 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method67(65280);
        }
        var11++;
        var2.field165++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method110((byte) 84);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class345[] var19 = new class345[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class345 var103 = var19[var20] = new class345();
            int var104 = var2.method110((byte) 44);
            if (var104 > 0) {
                var103.field4643 = new byte[var104 * 2];
            }
            int var105 = var2.method110((byte) 112);
            if (var105 > 0) {
                var103.field4639 = new byte[var105 * 2 + 2];
                var103.field4639[1] = 64;
            }
        }
        int var21 = var2.method110((byte) 23);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method110((byte) 42);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field138[var2.field165 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method67(65280);
        }
        var2.field165++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method110((byte) 89);
            this.field85[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method110((byte) 109);
            this.field85[var31] = (short) (this.field85[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method123(-87);
            }
            this.field85[var35] = (short) (this.field85[var35] + class589.method3454(var34 - 1 << 14, 32768));
            var32--;
            this.field92[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field92[var39] != 0) {
                if (var37 == 0) {
                    if (var4.length > var36) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                    var38 = var2.field138[var6++] - 1;
                }
                this.field86[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field92[var43] != 0) {
                if (var41 == 0) {
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                    var42 = var2.field138[var10++] + 16 << 2;
                }
                this.field84[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class345 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field92[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                var45--;
                this.field91[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 < var26.length) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field92[var51] > 0) {
                    var50 = var2.method110((byte) 117) + 1;
                }
            }
            var49--;
            this.field83[var51] = (byte) var50;
        }
        this.field93 = var2.method110((byte) 115) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class345 var100 = var19[var52];
            if (var100.field4643 != null) {
                for (int var101 = 1; var101 < var100.field4643.length; var101 += 2) {
                    var100.field4643[var101] = var2.method67(65280);
                }
            }
            if (var100.field4639 != null) {
                for (int var102 = 3; var102 < (var100.field4639.length - 2); var102 += 2) {
                    var100.field4639[var102] = var2.method67(65280);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method67(65280);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method67(65280);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class345 var97 = var19[var55];
            if (var97.field4639 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field4639.length; var99 += 2) {
                    var98 = var2.method110((byte) 106) + var98 + 1;
                    var97.field4639[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class345 var94 = var19[var56];
            if (var94.field4643 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field4643.length; var96 += 2) {
                    var95 = var95 + var2.method110((byte) 94) + 1;
                    var94.field4643[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method110((byte) 24);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method110((byte) 43) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field83[var61] = (byte) (this.field83[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class85.method643(var67, 121, var65 - var59);
                    var67 += var66 - var60;
                    this.field83[var68] = (byte) (this.field83[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field83[var63] = (byte) (this.field83[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method110((byte) 42);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method110((byte) 112) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field84[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field84[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class85.method643(var81, 106, var79 - var72);
                    int var84 = (this.field84[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field84[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field84[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field84[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field4641 = var2.method110((byte) 109);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class345 var93 = var19[var87];
            if (var93.field4643 != null) {
                var93.field4638 = var2.method110((byte) 113);
            }
            if (var93.field4639 != null) {
                var93.field4642 = var2.method110((byte) 29);
            }
            if (var93.field4641 > 0) {
                var93.field4634 = var2.method110((byte) 102);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field4644 = var2.method110((byte) 55);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class345 var92 = var19[var89];
            if (var92.field4644 > 0) {
                var92.field4637 = var2.method110((byte) 127);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class345 var91 = var19[var90];
            if (var91.field4637 > 0) {
                var91.field4635 = var2.method110((byte) 55);
            }
        }
    }
}
