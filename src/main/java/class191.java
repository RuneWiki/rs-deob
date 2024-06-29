import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class191 extends class222 {

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "[B")
    public byte[] field3487;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "[B")
    public byte[] field3493;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "[B")
    public byte[] field3495;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "[Lcl;")
    public class194[] field3496;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "[S")
    public short[] field3489;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "[Ljk;")
    public class252[] field3488;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "[I")
    private int[] field3491;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field3494 = 0;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field3492 = 0;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "[I")
    public static int[] field3484 = new int[1000];

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([I[BILth;)Z")
    public final boolean method1372(int[] arg0, byte[] arg1, int arg2, class111 arg3) {
        field3485++;
        boolean var5 = true;
        int var6 = 0;
        class194 var7 = null;
        for (int var8 = arg2; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field3491[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method793(arg0, var9 >> 2, (byte) 47);
                        } else {
                            var7 = arg3.method792((byte) -123, var9 >> 2, arg0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3496[var8] = var7;
                        this.field3491[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lhg;ILhg;Leb;)V")
    public static final void method1373(class177 arg0, int arg1, class177 arg2, class239 arg3) {
        if (arg1 != -1) {
            return;
        }
        class257.field4630 = arg2;
        class105.field1821 = arg0;
        field3497++;
        class285.field5104 = arg3;
        if (class257.field4630 != null) {
            class37.field564 = class257.field4630.method1283(1, -5357);
        }
        if (class105.field1821 != null) {
            class248.field4465 = class105.field1821.method1283(1, -5357);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public static void method1374(int arg0) {
        field3484 = null;
        if (arg0 != 0) {
            field3494 = -52;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public final void method1375(int arg0) {
        this.field3491 = null;
        if (arg0 != 0) {
            this.method1375(-81);
        }
        field3486++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/Object;BLlh;)V")
    public static final void method1376(Object arg0, byte arg1, class286 arg2) {
        field3483++;
        if (arg2.field5125 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field5125.peekEvent() != null; var3++) {
            class53.method290(1L, true);
        }
        if (arg0 != null) {
            arg2.field5125.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
        if (arg1 != 29) {
            field3492 = 122;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class191() {
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V")
    public class191(byte[] arg0) {
        this.field3487 = new byte[128];
        this.field3493 = new byte[128];
        this.field3495 = new byte[128];
        this.field3496 = new class194[128];
        this.field3489 = new short[128];
        this.field3488 = new class252[128];
        this.field3491 = new int[128];
        class280 var2 = new class280(arg0);
        int var3;
        for (var3 = 0; var2.field5011[var2.field5027 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1925(true);
        }
        var3++;
        var2.field5027++;
        int var6 = var2.field5027;
        int var7 = 0;
        var2.field5027 += var3;
        while (var2.field5011[var2.field5027 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1925(true);
        }
        var2.field5027++;
        int var10 = var2.field5027;
        var7++;
        int var11 = 0;
        var2.field5027 += var7;
        while (var2.field5011[var2.field5027 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1925(true);
        }
        var2.field5027++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1907(16832);
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
        class252[] var18 = new class252[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class252 var102 = var18[var19] = new class252();
            int var103 = var2.method1907(16832);
            if (var103 > 0) {
                var102.field4540 = new byte[var103 * 2];
            }
            int var104 = var2.method1907(16832);
            if (var104 > 0) {
                var102.field4542 = new byte[var104 * 2 + 2];
                var102.field4542[1] = 64;
            }
        }
        int var20 = var2.method1907(16832);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1907(16832);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field5011[var2.field5027 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1925(true);
        }
        var24++;
        var2.field5027++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1907(16832);
            this.field3489[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1907(16832);
            this.field3489[var30] = (short) (this.field3489[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var33 == 0) {
                if (var25.length > var31) {
                    var33 = var25[var31++];
                } else {
                    var33 = -1;
                }
                var32 = var2.method1883((byte) -94);
            }
            this.field3489[var34] = (short) (this.field3489[var34] + class58.method333(32768, var32 - 1 << 14));
            this.field3491[var34] = var32;
            var33--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3491[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field5011[var6++] - 1;
                    if (var4.length <= var36) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                }
                this.field3493[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3491[var42] != 0) {
                if (var39 == 0) {
                    if (var8.length > var40) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var2.field5011[var10++] + 16 << 2;
                }
                this.field3495[var42] = (byte) var41;
                var39--;
            }
        }
        class252 var43 = null;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3491[var46] != 0) {
                if (var45 == 0) {
                    var43 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field3488[var46] = var43;
                var45--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length <= var49) {
                    var48 = -1;
                } else {
                    var48 = var25[var49++];
                }
                if (this.field3491[var50] > 0) {
                    var47 = var2.method1907(16832) + 1;
                }
            }
            this.field3487[var50] = (byte) var47;
            var48--;
        }
        this.field3490 = var2.method1907(16832) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class252 var99 = var18[var51];
            if (var99.field4540 != null) {
                for (int var100 = 1; var100 < var99.field4540.length; var100 += 2) {
                    var99.field4540[var100] = var2.method1925(true);
                }
            }
            if (var99.field4542 != null) {
                for (int var101 = 3; var101 < var99.field4542.length - 2; var101 += 2) {
                    var99.field4542[var101] = var2.method1925(true);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1925(true);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1925(true);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class252 var96 = var18[var54];
            if (var96.field4542 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field4542.length; var98 += 2) {
                    var97 += var2.method1907(16832) + 1;
                    var96.field4542[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class252 var93 = var18[var55];
            if (var93.field4540 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field4540.length; var95 += 2) {
                    var94 = var94 + var2.method1907(16832) + 1;
                    var93.field4540[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1907(16832);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method1907(16832) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field3487[var60] = (byte) (this.field3487[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var59) / 2 + (var64 - var59) * var58;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class178.method1296(var66, var64 - var59, (byte) -116);
                    this.field3487[var67] = (byte) (this.field3487[var67] * var68 + 32 >> 6);
                    var66 += var65 - var58;
                }
                var59 = var64;
                var58 = var65;
            }
            for (int var62 = var59; var62 < 128; var62++) {
                this.field3487[var62] = (byte) (this.field3487[var62] * var58 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method1907(16832);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method1907(16832) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3495[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3495[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class178.method1296(var80, var78 - var71, (byte) -116);
                    var80 += var79 - var72;
                    int var83 = (this.field3495[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3495[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field3495[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3495[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field4529 = var2.method1907(16832);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class252 var92 = var18[var86];
            if (var92.field4540 != null) {
                var92.field4548 = var2.method1907(16832);
            }
            if (var92.field4542 != null) {
                var92.field4536 = var2.method1907(16832);
            }
            if (var92.field4529 > 0) {
                var92.field4531 = var2.method1907(16832);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field4545 = var2.method1907(16832);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class252 var91 = var18[var88];
            if (var91.field4545 > 0) {
                var91.field4528 = var2.method1907(16832);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class252 var90 = var18[var89];
            if (var90.field4528 > 0) {
                var90.field4527 = var2.method1907(16832);
            }
        }
    }
}
