import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class336 extends class401 {

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "[I")
    private int[] field4516;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "[Lbu;")
    public class19[] field4523;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "[Lsfa;")
    public class647[] field4514;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "[S")
    public short[] field4517;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "[B")
    public byte[] field4518;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "[B")
    public byte[] field4521;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "[B")
    public byte[] field4522;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public int field4515;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Lem;")
    public static class206 field4513 = new class206(115, 4);

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([B[IILon;)Z")
    public final boolean method1972(byte[] arg0, int[] arg1, int arg2, class306 arg3) {
        field4519++;
        boolean var5 = true;
        int var6 = 0;
        class19 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var10 = this.field4516[var8];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg3.method1860(arg1, 0, var10 >> 2);
                        } else {
                            var7 = arg3.method1861(var10 >> 2, arg1, true);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4523[var8] = var7;
                        this.field4516[var8] = 0;
                    }
                }
            }
        }
        int var9 = -49 % ((arg2 + 48) / 47);
        return var5;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public final void method1973(int arg0) {
        field4520++;
        if (arg0 == -1) {
            this.field4516 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public static void method1974(int arg0) {
        field4513 = null;
        if (arg0 > -23) {
            field4513 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class336() {
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([B)V")
    public class336(byte[] arg0) {
        this.field4516 = new int[128];
        this.field4523 = new class19[128];
        this.field4514 = new class647[128];
        this.field4517 = new short[128];
        this.field4518 = new byte[128];
        this.field4521 = new byte[128];
        this.field4522 = new byte[128];
        class501 var2 = new class501(arg0);
        int var3;
        for (var3 = 0; var2.field6855[var2.field6892 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2863(102);
        }
        var2.field6892++;
        var3++;
        int var6 = var2.field6892;
        var2.field6892 += var3;
        int var7;
        for (var7 = 0; var2.field6855[var2.field6892 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2863(106);
        }
        var2.field6892++;
        var7++;
        int var10 = var2.field6892;
        var2.field6892 += var7;
        int var11;
        for (var11 = 0; var2.field6855[var2.field6892 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2863(92);
        }
        var11++;
        var2.field6892++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method2874((byte) -75);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class647[] var18 = new class647[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class647 var102 = var18[var19] = new class647();
            int var103 = var2.method2874((byte) -75);
            if (var103 > 0) {
                var102.field8944 = new byte[var103 * 2];
            }
            int var104 = var2.method2874((byte) -75);
            if (var104 > 0) {
                var102.field8939 = new byte[var104 * 2 + 2];
                var102.field8939[1] = 64;
            }
        }
        int var20 = var2.method2874((byte) -75);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method2874((byte) -75);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field6855[var2.field6892 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2863(106);
        }
        var24++;
        var2.field6892++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2874((byte) -75);
            this.field4517[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2874((byte) -75);
            this.field4517[var30] = (short) (this.field4517[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 < var25.length) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method2829(5112);
            }
            this.field4517[var34] = (short) (this.field4517[var34] + class136.method950(32768, var33 - 1 << 14));
            this.field4516[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field4516[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field6855[var6++] - 1;
                    if (var4.length > var35) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                }
                var36--;
                this.field4518[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4516[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field6855[var10++] + 16 << 2;
                    if (var40 < var8.length) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                this.field4521[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class647 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4516[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                this.field4514[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var47 < var25.length) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field4516[var50] > 0) {
                    var49 = var2.method2874((byte) -75) + 1;
                }
            }
            this.field4522[var50] = (byte) var49;
            var48--;
        }
        this.field4515 = var2.method2874((byte) -75) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class647 var99 = var18[var51];
            if (var99.field8944 != null) {
                for (int var100 = 1; var100 < var99.field8944.length; var100 += 2) {
                    var99.field8944[var100] = var2.method2863(89);
                }
            }
            if (var99.field8939 != null) {
                for (int var101 = 3; var101 < (var99.field8939.length - 2); var101 += 2) {
                    var99.field8939[var101] = var2.method2863(124);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2863(113);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2863(111);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class647 var96 = var18[var54];
            if (var96.field8939 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field8939.length; var98 += 2) {
                    var97 = var2.method2874((byte) -75) + var97 + 1;
                    var96.field8939[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class647 var93 = var18[var55];
            if (var93.field8944 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field8944.length; var95 += 2) {
                    var94 = var94 + var2.method2874((byte) -75) + 1;
                    var93.field8944[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2874((byte) -75);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method2874((byte) -75) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field4522[var60] = (byte) (this.field4522[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class518.method2953(0, var64 - var58, var66);
                    this.field4522[var67] = (byte) (this.field4522[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var61 += 2;
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field4522[var63] = (byte) (this.field4522[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method2874((byte) -75);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = (var69 + var2.method2874((byte) -75)) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field4521[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field4521[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class518.method2953(0, var78 - var71, var80);
                    int var83 = (this.field4521[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field4521[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var72 = var79;
                var74 += 2;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field4521[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field4521[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field8938 = var2.method2874((byte) -75);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class647 var92 = var18[var86];
            if (var92.field8944 != null) {
                var92.field8949 = var2.method2874((byte) -75);
            }
            if (var92.field8939 != null) {
                var92.field8947 = var2.method2874((byte) -75);
            }
            if (var92.field8938 > 0) {
                var92.field8946 = var2.method2874((byte) -75);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field8945 = var2.method2874((byte) -75);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class647 var91 = var18[var88];
            if (var91.field8945 > 0) {
                var91.field8943 = var2.method2874((byte) -75);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class647 var90 = var18[var89];
            if (var90.field8943 > 0) {
                var90.field8940 = var2.method2874((byte) -75);
            }
        }
    }
}
