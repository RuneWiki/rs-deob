import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class683 extends class66 {

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "[I")
    private int[] field9573;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "[B")
    public byte[] field9577;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "[B")
    public byte[] field9579;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "[Lqr;")
    public class59[] field9582;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "[B")
    public byte[] field9575;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "[S")
    public short[] field9574;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "[Lse;")
    public class235[] field9581;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public int field9576;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "Leu;")
    public static class444 field9584 = new class444(9, 2);

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "[I")
    public static int[] field9585 = new int[5];

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "Lgq;")
    public static class476 field9586;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "Lf;")
    public static class702 field9587;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 4)
    public static void method3885(int arg0) {
        field9585 = null;
        field9586 = null;
        field9584 = null;
        field9587 = null;
        if (arg0 != -3226) {
            field9587 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lao;[IB[B)Z", line = 20)
    public final boolean method3886(class262 arg0, int[] arg1, byte arg2, byte[] arg3) {
        field9580++;
        boolean var5 = true;
        int var6 = 0;
        class59 var7 = null;
        int var8 = 0;
        if (arg2 != -52) {
            this.field9579 = null;
        }
        while (var8 < 128) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field9573[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method1866(var9 >> 2, arg1, (byte) 69);
                        } else {
                            var7 = arg0.method1865(21, var9 >> 2, arg1);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field9582[var8] = var7;
                        this.field9573[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 76)
    public static final String method3887(long arg0, int arg1) {
        field9578++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (arg1 < 65) {
                field9587 = null;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class267.field4351[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 131)
    public final void method3888(int arg0) {
        this.field9573 = null;
        if (arg0 > 14) {
            field9583++;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 148)
    public class683() {
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "([B)V", line = 150)
    public class683(byte[] arg0) {
        this.field9573 = new int[128];
        this.field9577 = new byte[128];
        this.field9579 = new byte[128];
        this.field9582 = new class59[128];
        this.field9575 = new byte[128];
        this.field9574 = new short[128];
        this.field9581 = new class235[128];
        class6 var2 = new class6(arg0);
        int var3;
        for (var3 = 0; var2.field96[var2.field57 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method81(true);
        }
        var2.field57++;
        var3++;
        int var6 = var2.field57;
        var2.field57 += var3;
        int var7;
        for (var7 = 0; var2.field96[var2.field57 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method81(true);
        }
        var7++;
        var2.field57++;
        int var10 = var2.field57;
        var2.field57 += var7;
        int var11;
        for (var11 = 0; var2.field96[var2.field57 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method81(true);
        }
        var2.field57++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method70(-9059);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class235[] var19 = new class235[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class235 var103 = var19[var20] = new class235();
            int var104 = var2.method70(-9059);
            if (var104 > 0) {
                var103.field3739 = new byte[var104 * 2];
            }
            int var105 = var2.method70(-9059);
            if (var105 > 0) {
                var103.field3740 = new byte[var105 * 2 + 2];
                var103.field3740[1] = 64;
            }
        }
        int var21 = var2.method70(-9059);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method70(-9059);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field96[var2.field57 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method81(true);
        }
        var2.field57++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method70(-9059);
            this.field9574[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method70(-9059);
            this.field9574[var31] = (short) (this.field9574[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 < var26.length) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method62((byte) -93);
            }
            this.field9574[var35] = (short) (this.field9574[var35] + class453.method2846(32768, var34 - 1 << 14));
            this.field9573[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field9573[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field96[var6++] - 1;
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                var36--;
                this.field9579[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field9573[var43] != 0) {
                if (var41 == 0) {
                    if (var8.length <= var40) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                    var42 = var2.field96[var10++] + 16 << 2;
                }
                var41--;
                this.field9577[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class235 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field9573[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                var45--;
                this.field9581[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var26.length <= var49) {
                    var48 = -1;
                } else {
                    var48 = var26[var49++];
                }
                if (this.field9573[var51] > 0) {
                    var50 = var2.method70(-9059) + 1;
                }
            }
            var48--;
            this.field9575[var51] = (byte) var50;
        }
        this.field9576 = var2.method70(-9059) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class235 var100 = var19[var52];
            if (var100.field3739 != null) {
                for (int var101 = 1; var101 < var100.field3739.length; var101 += 2) {
                    var100.field3739[var101] = var2.method81(true);
                }
            }
            if (var100.field3740 != null) {
                for (int var102 = 3; var102 < var100.field3740.length - 2; var102 += 2) {
                    var100.field3740[var102] = var2.method81(true);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method81(true);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method81(true);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class235 var97 = var19[var55];
            if (var97.field3740 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3740.length; var99 += 2) {
                    var98 = var2.method70(-9059) + var98 + 1;
                    var97.field3740[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class235 var94 = var19[var56];
            if (var94.field3739 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3739.length; var96 += 2) {
                    var95 = var2.method70(-9059) + var95 + 1;
                    var94.field3739[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method70(-9059);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 -= -var2.method70(-9059) - 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field9575[var61] = (byte) (this.field9575[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class92.method863(var67, var65 - var59, 1583618783);
                    var67 += var66 - var60;
                    this.field9575[var68] = (byte) (this.field9575[var68] * var69 + 32 >> 6);
                }
                var62 += 2;
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field9575[var64] = (byte) (this.field9575[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method70(-9059);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method70(-9059) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field9577[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field9577[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class92.method863(var81, var79 - var72, 1583618783);
                    int var84 = (this.field9577[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field9577[var82] = (byte) var84;
                }
                var75 += 2;
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field9577[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field9577[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field3737 = var2.method70(-9059);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class235 var93 = var19[var87];
            if (var93.field3739 != null) {
                var93.field3736 = var2.method70(-9059);
            }
            if (var93.field3740 != null) {
                var93.field3734 = var2.method70(-9059);
            }
            if (var93.field3737 > 0) {
                var93.field3729 = var2.method70(-9059);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field3733 = var2.method70(-9059);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class235 var92 = var19[var89];
            if (var92.field3733 > 0) {
                var92.field3735 = var2.method70(-9059);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class235 var91 = var19[var90];
            if (var91.field3735 > 0) {
                var91.field3732 = var2.method70(-9059);
            }
        }
    }
}
