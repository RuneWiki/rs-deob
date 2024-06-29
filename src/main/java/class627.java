import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class627 implements class160 {

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Lwea;")
    private class257 field8685;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Lga;")
    private class332 field8680;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field8682 = 0;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "S")
    public static short field8684 = 256;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Lf;")
    private class532 field8678;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZ)B", line = 6)
    public static final byte method3475(int arg0, int arg1, boolean arg2) {
        field8677++;
        if (!arg2) {
            return 117;
        } else if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 25)
    public static final void method3476(byte arg0) {
        field8676++;
        for (int var1 = 0; var1 < class174.field2469; var1++) {
            class688.field9712[var1] = null;
        }
        class174.field2469 = 0;
        for (int var2 = 0; var2 < class171.field2428; var2++) {
            for (int var46 = 0; var46 < class329.field4421; var46++) {
                for (int var47 = 0; var47 < class641.field8846; var47++) {
                    class207 var48 = class153.field2168[var2][var47][var46];
                    if (var48 != null) {
                        if (var48.field2772 > 0) {
                            var48.field2772 = (short) (var48.field2772 * -1);
                        }
                        if (var48.field2770 > 0) {
                            var48.field2770 = (short) (var48.field2770 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class171.field2428; var3++) {
            for (int var4 = 0; var4 < class329.field4421; var4++) {
                for (int var5 = 0; var5 < class641.field8846; var5++) {
                    class207 var6 = class153.field2168[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class153.field2168[0][var5][var4] != null && class153.field2168[0][var5][var4].field2771 != null;
                        if (var6.field2772 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var10 = var3;
                            int var11 = var3;
                            class207 var12 = class153.field2168[var3][var5][var4 - 1];
                            int var13 = class454.field5981[var3].method1611(var5, true, var4);
                            while (var8 > 0 && var12 != null && var12.field2772 < 0 && var6.field2772 == var12.field2772 && var6.field2773 == var12.field2773 && class454.field5981[var3].method1611(var5, true, var8 - 1) == var13 && ((var8 - 1) <= 0 || var13 == class454.field5981[var3].method1611(var5, true, var8 - 2))) {
                                var8--;
                                var12 = class153.field2168[var3][var5][var8 - 1];
                            }
                            for (class207 var14 = class153.field2168[var3][var5][var4 + 1]; class641.field8846 > var9 && var14 != null && var14.field2772 < 0 && var6.field2772 == var14.field2772 && var6.field2773 == var14.field2773 && class454.field5981[var3].method1611(var5, true, var9 + 1) == var13 && (var9 + 1 >= class641.field8846 || class454.field5981[var3].method1611(var5, true, var9 + 2) == var13); var14 = class153.field2168[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            label304: while (var10 > 0) {
                                for (int var15 = var8; var15 <= var9; var15++) {
                                    if (class153.field2168[var10 - 1][var5][var15] == null || class153.field2168[var10 - 1][var5][var15].field2772 != var6.field2772 || class153.field2168[var10 - 1][var5][var15].field2773 != var6.field2773) {
                                        break label304;
                                    }
                                }
                                var10--;
                            }
                            label321: while (var11 < (class171.field2428 - 1)) {
                                for (int var16 = var8; var16 <= var9; var16++) {
                                    if (class153.field2168[var11 + 1][var5][var16] == null || class153.field2168[var11 + 1][var5][var16].field2772 != var6.field2772 || class153.field2168[var11 + 1][var5][var16].field2773 != var6.field2773) {
                                        break label321;
                                    }
                                }
                                var11++;
                            }
                            int var17 = var11 + 1 - var10;
                            int var18 = class454.field5981[var7 ? var10 + 1 : var10].method1611(var5, true, var8);
                            int var19 = var6.field2772 * var17 + var18;
                            int var20 = class454.field5981[var7 ? var10 + 1 : var10].method1611(var5, true, var9 + 1);
                            int var21 = var6.field2772 * var17 + var20;
                            int var22 = var5 << class62.field762;
                            int var23 = var8 << class62.field762;
                            int var24 = (var9 << class62.field762) + class458.field6012;
                            class688.field9712[class174.field2469++] = new class152(1, var11, var6.field2773 + var22, var6.field2773 + var22, var6.field2773 + var22, var6.field2773 + var22, var18, var20, var21, var19, var23, var24, var24, var23);
                            for (int var25 = var10; var25 <= var11; var25++) {
                                for (int var26 = var8; var26 <= var9; var26++) {
                                    class153.field2168[var25][var5][var26].field2772 = (short) (class153.field2168[var25][var5][var26].field2772 * -1);
                                }
                            }
                        }
                        if (var6.field2770 < 0) {
                            int var27 = var5;
                            int var28 = var5;
                            int var29 = var3;
                            int var30 = var3;
                            class207 var31 = class153.field2168[var3][var5 - 1][var4];
                            int var32 = class454.field5981[var3].method1611(var5, true, var4);
                            while (var27 > 0 && var31 != null && var31.field2770 < 0 && var6.field2770 == var31.field2770 && var6.field2775 == var31.field2775 && var32 == class454.field5981[var3].method1611(var27 - 1, true, var4) && (var27 - 1 <= 0 || class454.field5981[var3].method1611(var27 - 2, true, var4) == var32)) {
                                var27--;
                                var31 = class153.field2168[var3][var27 - 1][var4];
                            }
                            for (class207 var33 = class153.field2168[var3][var5 + 1][var4]; var28 < class329.field4421 && var33 != null && var33.field2770 < 0 && var6.field2770 == var33.field2770 && var6.field2775 == var33.field2775 && var32 == class454.field5981[var3].method1611(var28 + 1, true, var4) && (class329.field4421 <= (var28 + 1) || class454.field5981[var3].method1611(var28 + 2, true, var4) == var32); var33 = class153.field2168[var3][var28 + 1][var4]) {
                                var28++;
                            }
                            label220: while (var29 > 0) {
                                for (int var34 = var27; var34 <= var28; var34++) {
                                    if (class153.field2168[var29 - 1][var34][var4] == null || class153.field2168[var29 - 1][var34][var4].field2770 != var6.field2770 || class153.field2168[var29 - 1][var34][var4].field2775 != var6.field2775) {
                                        break label220;
                                    }
                                }
                                var29--;
                            }
                            label205: while (var30 < class171.field2428 - 1) {
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    if (class153.field2168[var30 + 1][var35][var4] == null || class153.field2168[var30 + 1][var35][var4].field2770 != var6.field2770 || class153.field2168[var30 + 1][var35][var4].field2775 != var6.field2775) {
                                        break label205;
                                    }
                                }
                                var30++;
                            }
                            int var36 = var30 + 1 - var29;
                            int var37 = class454.field5981[var7 ? var29 + 1 : var29].method1611(var27, true, var4);
                            int var38 = var6.field2770 * var36 + var37;
                            int var39 = class454.field5981[var7 ? var29 + 1 : var29].method1611(var28 + 1, true, var4);
                            int var40 = var6.field2770 * var36 + var39;
                            int var41 = var27 << class62.field762;
                            int var42 = (var28 << class62.field762) + class458.field6012;
                            int var43 = var4 << class62.field762;
                            class688.field9712[class174.field2469++] = new class152(2, var30, var41, var42, var42, var41, var37, var39, var40, var38, var6.field2775 + var43, var43 - -var6.field2775, var6.field2775 + var43, var6.field2775 + var43);
                            for (int var44 = var29; var44 <= var30; var44++) {
                                for (int var45 = var27; var45 <= var28; var45++) {
                                    class153.field2168[var44][var45][var4].field2770 = (short) (class153.field2168[var44][var45][var4].field2770 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -43) {
            field8681 = 103;
        }
        class82.field945 = true;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 309)
    public final void method402(int arg0) {
        this.field8678 = class567.method3141(14, this.field8680, this.field8685.field3365);
        if (arg0 <= 119) {
            this.method374(false, (byte) 72);
        }
        field8683++;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)Z", line = 320)
    public final boolean method404(boolean arg0) {
        if (arg0) {
            field8684 = 116;
        }
        field8679++;
        return this.field8680.method1931(1, this.field8685.field3365);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZB)V", line = 333)
    public final void method374(boolean arg0, byte arg1) {
        if (arg1 >= -85) {
            method3475(-59, 12, false);
        }
        if (arg0) {
            int var3 = class666.field9479 >= class399.field5301 ? class666.field9479 : class399.field5301;
            int var4 = class60.field750 <= class399.field5293 ? class399.field5293 : class60.field750;
            int var5 = this.field8678.method523();
            int var6 = this.field8678.method532();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var4 < var9) {
                var10 = 0;
                var9 = var4;
                var8 = var4 * var5 / var6;
                var7 = (var3 - var8) / 2;
            }
            this.field8678.method2993(var7, var10, var8, var9);
        }
        field8675++;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lvi;", line = 378)
    public static final class632 method3477(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        }
        field8674++;
        class632 var2 = (class632) class440.field5830.method2176(-124, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class455.field5988.method1938(arg0, 1, arg1 - 17);
        class632 var4 = new class632();
        var4.field8758 = arg0;
        if (var3 != null) {
            var4.method3504(new class157(var3), false);
        }
        var4.method3506((byte) -125);
        if (var4.field8740 == 2 && class207.field2761.method3057(arg1 ^ 0x1, (long) arg0) == null) {
            class207.field2761.method3061(127, (long) arg0, new class37(class466.field6125));
            class407.field5359[class466.field6125++] = var4;
        }
        class440.field5830.method2174(var4, (long) arg0, (byte) 124);
        return var4;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lga;Lwea;)V", line = 426)
    public class627(class332 arg0, class257 arg1) {
        this.field8685 = arg1;
        this.field8680 = arg0;
    }
}
