import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class137 {

    @OriginalMember(owner = "client!qja", name = "g", descriptor = "[I")
    private int[] field1758 = new int[64];

    @OriginalMember(owner = "client!qja", name = "t", descriptor = "[I")
    private int[] field1761 = new int[8191];

    @OriginalMember(owner = "client!qja", name = "u", descriptor = "[[Lts;")
    private class123[][] field1759 = new class123[1600][64];

    @OriginalMember(owner = "client!qja", name = "v", descriptor = "[I")
    private int[] field1774 = new int[1600];

    @OriginalMember(owner = "client!qja", name = "m", descriptor = "I")
    private int field1769 = 0;

    @OriginalMember(owner = "client!qja", name = "s", descriptor = "[[Lts;")
    private class123[][] field1775 = new class123[64][768];

    @OriginalMember(owner = "client!qja", name = "o", descriptor = "Lot;")
    private class218 field1777;

    @OriginalMember(owner = "client!qja", name = "d", descriptor = "Lbl;")
    private class719 field1765;

    @OriginalMember(owner = "client!qja", name = "n", descriptor = "Lbl;")
    private class719 field1767;

    @OriginalMember(owner = "client!qja", name = "r", descriptor = "Luba;")
    private class517 field1762;

    @OriginalMember(owner = "client!qja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1778 = new String[] { method1205(method1204("Cc\u00125\u0013\u001a")), method1205(method1204("Cc\u00125\u001f\u001a")), method1205(method1204("\\|\u001fw")), method1205(method1204("I']5$")), method1205(method1204("Cc\u00125\u001a\u001a")), method1205(method1204("Cc\u00125\u001d\u001a")), method1205(method1204("Cc\u00125\u0010\u001a")), method1205(method1204("Cc\u00125e[g\u001aog\u001a")), method1205(method1204("Cc\u00125\u0018\u001a")), method1205(method1204("Cc\u00125\u001e\u001a")), method1205(method1204("Cc\u00125\u001c\u001a")), method1205(method1204("Cc\u00125\u001b\u001a")), method1205(method1204("Cc\u00125\u0011\u001a")) };

    @OriginalMember(owner = "client!qja", name = "j", descriptor = "S")
    public static short field1757 = 205;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!qja", name = "k", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!qja", name = "q", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!qja", name = "e", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!qja", name = "c", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!qja", name = "i", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!qja", name = "f", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!qja", name = "p", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!qja", name = "h", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!qja", name = "l", descriptor = "Ltb;")
    public static class392 field1766;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(I)V", line = 3)
    public static void method1194(int arg0) {
        try {
            field1766 = null;
            int var1 = -16 % (-arg0 / 32);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1778[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(Ljj;)V", line = 734)
    public class137(class334 arg0) {
        try {
            this.field1777 = arg0.method2080(102, new class121[] { new class121(new class212[] { class212.field3105, class212.field3111, class212.field3113 }), new class121(class212.field3110) });
            this.field1765 = arg0.method2117(true, 16);
            this.field1767 = arg0.method2117(false, 16);
            this.field1767.method2402(13179, 393168, 12);
            this.field1762 = arg0.method2071(false, -21663);
            this.field1762.method2344(49146, 25);
            Buffer var2 = this.field1762.method2343((byte) 54, true);
            if (var2 != null) {
                Stream var3 = arg0.method2651(var2, 16);
                if (Stream.method3200()) {
                    for (int var6 = 0; var6 < 8191; var6++) {
                        int var7 = var6 * 4;
                        var3.method3195(var7);
                        var3.method3195(var7 + 1);
                        var3.method3195(var7 + 2);
                        var3.method3195(var7 + 2);
                        var3.method3195(var7 + 3);
                        var3.method3195(var7);
                    }
                } else {
                    for (int var4 = 0; var4 < 8191; var4++) {
                        int var5 = var4 * 4;
                        var3.method3198(var5);
                        var3.method3198(var5 + 1);
                        var3.method3198(var5 + 2);
                        var3.method3198(var5 + 2);
                        var3.method3198(var5 + 3);
                        var3.method3198(var5);
                    }
                }
                var3.method3199();
                this.field1762.method2339(true);
            }
            Buffer var8 = this.field1767.method2401(true, true);
            if (var8 != null) {
                Stream var9 = arg0.method2651(var8, 16);
                if (Stream.method3200()) {
                    for (int var10 = 0; var10 < 8191; var10++) {
                        var9.method3202(0.0F);
                        var9.method3202(-1.0F);
                        var9.method3202(0.0F);
                        var9.method3202(0.0F);
                        var9.method3202(-1.0F);
                        var9.method3202(0.0F);
                        var9.method3202(0.0F);
                        var9.method3202(-1.0F);
                        var9.method3202(0.0F);
                        var9.method3202(0.0F);
                        var9.method3202(-1.0F);
                        var9.method3202(0.0F);
                    }
                } else {
                    for (int var11 = 0; var11 < 8191; var11++) {
                        var9.method3206(0.0F);
                        var9.method3206(-1.0F);
                        var9.method3206(0.0F);
                        var9.method3206(0.0F);
                        var9.method3206(-1.0F);
                        var9.method3206(0.0F);
                        var9.method3206(0.0F);
                        var9.method3206(-1.0F);
                        var9.method3206(0.0F);
                        var9.method3206(0.0F);
                        var9.method3206(-1.0F);
                        var9.method3206(0.0F);
                    }
                }
                var9.method3199();
                this.field1767.method2405(-9200);
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field1778[7] + (arg0 == null ? field1778[2] : field1778[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(IILbo;I)V", line = 24)
    public static final void method1195(int arg0, int arg1, class801 arg2, int arg3) {
        try {
            field1763++;
            if (class86.field1217) {
                int var4 = 0;
                for (class228 var5 = (class228) arg2.field11651.method3932((byte) -117); var5 != null; var5 = (class228) arg2.field11651.method3939((byte) -75)) {
                    int var6 = class725.method5253(var5, 16);
                    if (var6 > var4) {
                        var4 = var6;
                    }
                }
                var4 += 8;
                class707.field9883 = (class728.field10430 ? 26 : 22) + arg2.field11653 * 16;
                int var7 = arg2.field11653 * 16 + 21;
                int var8 = class637.field9012 + class525.field7646;
                if ((var8 + var4) > class391.field5700) {
                    var8 = class637.field9012 - var4;
                }
                if (var8 < arg3) {
                    var8 = 0;
                }
                int var9 = class728.field10430 ? 33 : 31;
                int var10 = arg1 + 13 - var9;
                if (var7 + var10 > class711.field9998) {
                    var10 = class711.field9998 - var7;
                }
                class647.field9199 = var8;
                if (var10 < 0) {
                    var10 = 0;
                }
                class582.field8406 = arg2;
                class435.field6411 = var4;
                class238.field3444 = var10;
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field1778[10] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1778[2] : field1778[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lkia;Ljj;II)V", line = 83)
    public final void method1196(class788 arg0, class334 arg1, int arg2, int arg3) {
        try {
            field1773++;
            if (arg1.field4713 != null) {
                if (arg2 < 0) {
                    this.method1200(118, arg1);
                } else {
                    this.method1203(arg2, -1, arg1);
                }
                float var5 = arg1.field4713.field9042;
                float var6 = arg1.field4713.field9082;
                float var7 = arg1.field4713.field9049;
                float var8 = arg1.field4713.field9061;
                try {
                    int var9 = 0;
                    int var10 = Integer.MAX_VALUE;
                    int var11 = 0;
                    class592 var12 = arg0.field11376.field5728;
                    for (class592 var13 = var12.field8523; var13 != var12; var13 = var13.field8523) {
                        class123 var14 = (class123) var13;
                        int var15 = (int) ((float) (var14.field1557 >> 12) * var7 + (float) (var14.field1551 >> 12) * var6 + (float) (var14.field1550 >> 12) * var5 + var8);
                        this.field1761[var9++] = var15;
                        if (var15 < var10) {
                            var10 = var15;
                        }
                        if (var11 < var15) {
                            var11 = var15;
                        }
                    }
                    int var16 = var11 - var10;
                    int var17;
                    if ((var16 + 2) > 1600) {
                        var17 = class626.method4593(3, var16) + 1 - class537.field7894;
                        var16 = (var16 >> var17) + 2;
                    } else {
                        var17 = 0;
                        var16 += 2;
                    }
                    class592 var18 = var12.field8523;
                    int var19 = 0;
                    int var20 = -2;
                    boolean var21 = true;
                    int var22 = 83 / ((77 - arg3) / 42);
                    boolean var23 = true;
                    while (var12 != var18) {
                        this.field1769 = 0;
                        for (int var24 = 0; var24 < var16; var24++) {
                            this.field1774[var24] = 0;
                        }
                        for (int var25 = 0; var25 < 64; var25++) {
                            this.field1758[var25] = 0;
                        }
                        while (var12 != var18) {
                            class123 var26 = (class123) var18;
                            if (var23) {
                                var21 = var26.field1552;
                                var20 = var26.field1549;
                                var23 = false;
                            }
                            if (var19 > 0 && (var26.field1549 != var20 || var26.field1552 != var21)) {
                                var23 = true;
                                break;
                            }
                            int var27 = this.field1761[var19++] - var10 >> var17;
                            if (var27 < 1600) {
                                if (this.field1774[var27] >= 64) {
                                    label137: {
                                        if (this.field1774[var27] == 64) {
                                            if (this.field1769 == 64) {
                                                break label137;
                                            }
                                            this.field1774[var27] += this.field1769++ + 1;
                                        }
                                        this.field1775[this.field1774[var27] - 64 - 1][this.field1758[this.field1774[var27] - 64 - 1]++] = var26;
                                    }
                                } else {
                                    this.field1759[var27][this.field1774[var27]++] = var26;
                                }
                            }
                            var18 = var18.field8523;
                        }
                        arg1.method2664(false, false, 16, var20 < 0 ? -1 : var20);
                        if (var21 && class106.field1391 != arg1.field4801) {
                            arg1.method127(class106.field1391);
                        } else if (arg1.field4801 != 1.0F) {
                            arg1.method127(1.0F);
                        }
                        this.method1199(arg1, 0, var16);
                    }
                } catch (Exception var29) {
                }
                this.method1198(87, arg1);
            }
        } catch (RuntimeException var30) {
            throw class665.method4799(var30, field1778[11] + (arg0 == null ? field1778[2] : field1778[3]) + ',' + (arg1 == null ? field1778[2] : field1778[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(Ljj;B)V", line = 244)
    public final void method1197(class334 arg0, byte arg1) {
        try {
            if (arg1 >= -85) {
                field1766 = null;
            }
            this.field1765.method2402(13179, 786336, 24);
            field1776++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1778[4] + (arg0 == null ? field1778[2] : field1778[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(ILjj;)V", line = 263)
    private final void method1198(int arg0, class334 arg1) {
        try {
            int var3 = 54 % ((arg0 + 56) / 56);
            field1770++;
            arg1.method2628(1, true);
            arg1.method2631(79, true);
            if (class106.field1391 != arg1.field4801) {
                arg1.method127(class106.field1391);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1778[5] + arg0 + ',' + (arg1 == null ? field1778[2] : field1778[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(Ljj;II)V", line = 278)
    private final void method1199(class334 arg0, int arg1, int arg2) {
        try {
            field1768++;
            int var4 = arg1;
            class639 var5 = arg0.method2686(-120);
            float var6 = var5.field9066;
            float var7 = var5.field9076;
            float var8 = var5.field9062;
            float var9 = var5.field9060;
            float var10 = var5.field9081;
            float var11 = var5.field9033;
            float var12 = var6 + var9;
            float var13 = var7 + var10;
            float var14 = var8 + var11;
            float var15 = var6 - var9;
            float var16 = var7 - var10;
            float var17 = var8 - var11;
            float var18 = var9 - var6;
            float var19 = var10 - var7;
            float var20 = var11 - var8;
            Buffer var21 = this.field1765.method2401(true, true);
            if (var21 != null) {
                Stream var22 = arg0.method2651(var21, 16);
                if (Stream.method3200()) {
                    for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                        int var49 = this.field1774[var48] > 64 ? 64 : this.field1774[var48];
                        if (var49 > 0) {
                            for (int var50 = var49 - 1; var50 >= 0; var50--) {
                                class123 var51 = this.field1759[var48][var50];
                                int var52 = var51.field1547;
                                byte var53 = (byte) (var52 >> 16);
                                byte var54 = (byte) (var52 >> 8);
                                byte var55 = (byte) var52;
                                byte var56 = (byte) (var52 >>> 24);
                                float var57 = (float) (var51.field1550 >> 12);
                                float var58 = (float) (var51.field1551 >> 12);
                                float var59 = (float) (var51.field1557 >> 12);
                                int var60 = var51.field1558 >> 12;
                                var22.method3202((float) (-var60) * var12 + var57);
                                var22.method3202((float) (-var60) * var13 + var58);
                                var22.method3202((float) (-var60) * var14 + var59);
                                if (arg0.field4775 == 0) {
                                    var22.method3204(var53, var54, var55, var56);
                                } else {
                                    var22.method3201(var53, var54, var55, var56);
                                }
                                var22.method3202(0.0F);
                                var22.method3202(0.0F);
                                var22.method3202((float) var60 * var15 + var57);
                                var22.method3202((float) var60 * var16 + var58);
                                var22.method3202((float) var60 * var17 + var59);
                                if (arg0.field4775 == 0) {
                                    var22.method3204(var53, var54, var55, var56);
                                } else {
                                    var22.method3201(var53, var54, var55, var56);
                                }
                                var22.method3202(1.0F);
                                var22.method3202(0.0F);
                                var22.method3202((float) var60 * var12 + var57);
                                var22.method3202((float) var60 * var13 + var58);
                                var22.method3202((float) var60 * var14 + var59);
                                if (arg0.field4775 == 0) {
                                    var22.method3204(var53, var54, var55, var56);
                                } else {
                                    var22.method3201(var53, var54, var55, var56);
                                }
                                var22.method3202(1.0F);
                                var22.method3202(1.0F);
                                var22.method3202((float) var60 * var18 + var57);
                                var22.method3202((float) var60 * var19 + var58);
                                var22.method3202((float) var60 * var20 + var59);
                                if (arg0.field4775 == 0) {
                                    var22.method3204(var53, var54, var55, var56);
                                } else {
                                    var22.method3201(var53, var54, var55, var56);
                                }
                                var22.method3202(0.0F);
                                var22.method3202(1.0F);
                                var4++;
                            }
                            if (this.field1774[var48] > 64) {
                                int var61 = this.field1774[var48] - 65;
                                for (int var62 = this.field1758[var61] - 1; var62 >= 0; var62--) {
                                    class123 var63 = this.field1775[var61][var62];
                                    int var64 = var63.field1547;
                                    byte var65 = (byte) (var64 >> 16);
                                    byte var66 = (byte) (var64 >> 8);
                                    byte var67 = (byte) var64;
                                    byte var68 = (byte) (var64 >>> 24);
                                    float var69 = (float) (var63.field1550 >> 12);
                                    float var70 = (float) (var63.field1551 >> 12);
                                    float var71 = (float) (var63.field1557 >> 12);
                                    int var72 = var63.field1558 >> 12;
                                    var22.method3202((float) (-var72) * var12 + var69);
                                    var22.method3202((float) (-var72) * var13 + var70);
                                    var22.method3202((float) (-var72) * var14 + var71);
                                    if (arg0.field4775 == 0) {
                                        var22.method3204(var65, var66, var67, var68);
                                    } else {
                                        var22.method3201(var65, var66, var67, var68);
                                    }
                                    var22.method3202(0.0F);
                                    var22.method3202(0.0F);
                                    var22.method3202((float) var72 * var15 + var69);
                                    var22.method3202((float) var72 * var16 + var70);
                                    var22.method3202((float) var72 * var17 + var71);
                                    if (arg0.field4775 == 0) {
                                        var22.method3204(var65, var66, var67, var68);
                                    } else {
                                        var22.method3201(var65, var66, var67, var68);
                                    }
                                    var22.method3202(1.0F);
                                    var22.method3202(0.0F);
                                    var22.method3202((float) var72 * var12 + var69);
                                    var22.method3202((float) var72 * var13 + var70);
                                    var22.method3202((float) var72 * var14 + var71);
                                    if (arg0.field4775 == 0) {
                                        var22.method3204(var65, var66, var67, var68);
                                    } else {
                                        var22.method3201(var65, var66, var67, var68);
                                    }
                                    var22.method3202(1.0F);
                                    var22.method3202(1.0F);
                                    var22.method3202((float) var72 * var18 + var69);
                                    var22.method3202((float) var72 * var19 + var70);
                                    var22.method3202((float) var72 * var20 + var71);
                                    if (arg0.field4775 == 0) {
                                        var22.method3204(var65, var66, var67, var68);
                                    } else {
                                        var22.method3201(var65, var66, var67, var68);
                                    }
                                    var22.method3202(0.0F);
                                    var22.method3202(1.0F);
                                    var4++;
                                }
                            }
                        }
                    }
                } else {
                    for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                        int var24 = this.field1774[var23] <= 64 ? this.field1774[var23] : 64;
                        if (var24 > 0) {
                            for (int var25 = var24 - 1; var25 >= 0; var25--) {
                                class123 var26 = this.field1759[var23][var25];
                                int var27 = var26.field1547;
                                byte var28 = (byte) (var27 >> 16);
                                byte var29 = (byte) (var27 >> 8);
                                byte var30 = (byte) var27;
                                byte var31 = (byte) (var27 >>> 24);
                                float var32 = (float) (var26.field1550 >> 12);
                                float var33 = (float) (var26.field1551 >> 12);
                                float var34 = (float) (var26.field1557 >> 12);
                                int var35 = var26.field1558 >> 12;
                                var22.method3206((float) (-var35) * var12 + var32);
                                var22.method3206((float) (-var35) * var13 + var33);
                                var22.method3206((float) (-var35) * var14 + var34);
                                if (arg0.field4775 == 0) {
                                    var22.method3204(var28, var29, var30, var31);
                                } else {
                                    var22.method3201(var28, var29, var30, var31);
                                }
                                var22.method3206(0.0F);
                                var22.method3206(0.0F);
                                var22.method3206((float) var35 * var15 + var32);
                                var22.method3206((float) var35 * var16 + var33);
                                var22.method3206((float) var35 * var17 + var34);
                                if (arg0.field4775 == 0) {
                                    var22.method3204(var28, var29, var30, var31);
                                } else {
                                    var22.method3201(var28, var29, var30, var31);
                                }
                                var22.method3206(1.0F);
                                var22.method3206(0.0F);
                                var22.method3206((float) var35 * var12 + var32);
                                var22.method3206((float) var35 * var13 + var33);
                                var22.method3206((float) var35 * var14 + var34);
                                if (arg0.field4775 == 0) {
                                    var22.method3204(var28, var29, var30, var31);
                                } else {
                                    var22.method3201(var28, var29, var30, var31);
                                }
                                var22.method3206(1.0F);
                                var22.method3206(1.0F);
                                var22.method3206((float) var35 * var18 + var32);
                                var22.method3206((float) var35 * var19 + var33);
                                var22.method3206((float) var35 * var20 + var34);
                                if (arg0.field4775 == 0) {
                                    var22.method3204(var28, var29, var30, var31);
                                } else {
                                    var22.method3201(var28, var29, var30, var31);
                                }
                                var22.method3206(0.0F);
                                var22.method3206(1.0F);
                                var4++;
                            }
                            if (this.field1774[var23] > 64) {
                                int var36 = this.field1774[var23] - 64 - 1;
                                for (int var37 = this.field1758[var36] - 1; var37 >= 0; var37--) {
                                    class123 var38 = this.field1775[var36][var37];
                                    int var39 = var38.field1547;
                                    byte var40 = (byte) (var39 >> 16);
                                    byte var41 = (byte) (var39 >> 8);
                                    byte var42 = (byte) var39;
                                    byte var43 = (byte) (var39 >>> 24);
                                    float var44 = (float) (var38.field1550 >> 12);
                                    float var45 = (float) (var38.field1551 >> 12);
                                    float var46 = (float) (var38.field1557 >> 12);
                                    int var47 = var38.field1558 >> 12;
                                    var22.method3206((float) (-var47) * var12 + var44);
                                    var22.method3206((float) (-var47) * var13 + var45);
                                    var22.method3206((float) (-var47) * var14 + var46);
                                    if (arg0.field4775 == 0) {
                                        var22.method3204(var40, var41, var42, var43);
                                    } else {
                                        var22.method3201(var40, var41, var42, var43);
                                    }
                                    var22.method3206(0.0F);
                                    var22.method3206(0.0F);
                                    var22.method3206((float) var47 * var15 + var44);
                                    var22.method3206((float) var47 * var16 + var45);
                                    var22.method3206((float) var47 * var17 + var46);
                                    if (arg0.field4775 == 0) {
                                        var22.method3204(var40, var41, var42, var43);
                                    } else {
                                        var22.method3201(var40, var41, var42, var43);
                                    }
                                    var22.method3206(1.0F);
                                    var22.method3206(0.0F);
                                    var22.method3206((float) var47 * var12 + var44);
                                    var22.method3206((float) var47 * var13 + var45);
                                    var22.method3206((float) var47 * var14 + var46);
                                    if (arg0.field4775 == 0) {
                                        var22.method3204(var40, var41, var42, var43);
                                    } else {
                                        var22.method3201(var40, var41, var42, var43);
                                    }
                                    var22.method3206(1.0F);
                                    var22.method3206(1.0F);
                                    var22.method3206((float) var47 * var18 + var44);
                                    var22.method3206((float) var47 * var19 + var45);
                                    var22.method3206((float) var47 * var20 + var46);
                                    if (arg0.field4775 == 0) {
                                        var22.method3204(var40, var41, var42, var43);
                                    } else {
                                        var22.method3201(var40, var41, var42, var43);
                                    }
                                    var22.method3206(0.0F);
                                    var4++;
                                    var22.method3206(1.0F);
                                }
                            }
                        }
                    }
                }
                var22.method3199();
                if (this.field1765.method2405(-9200)) {
                    arg0.method2088(this.field1765, 0, false);
                    arg0.method2088(this.field1767, 1, false);
                    arg0.method2120(this.field1777, -1);
                    arg0.method2074(class12.field163, 0, var4 * 4, this.field1762, 0, var4 * 2, 45);
                }
            }
        } catch (RuntimeException var74) {
            throw class665.method4799(var74, field1778[12] + (arg0 == null ? field1778[2] : field1778[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "(ILjj;)V", line = 677)
    private final void method1200(int arg0, class334 arg1) {
        try {
            class106.field1391 = arg1.field4801;
            field1764++;
            arg1.method2652(1);
            arg1.method2631(100, false);
            if (arg0 < 104) {
                this.field1777 = null;
            }
            arg1.method2628(1, false);
            arg1.method2644((byte) 64);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1778[1] + arg0 + ',' + (arg1 == null ? field1778[2] : field1778[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(III)Z", line = 692)
    public static final boolean method1201(int arg0, int arg1, int arg2) {
        try {
            if (arg1 == 8) {
                field1772++;
                return class349.method2787(arg2, -28272, arg0) || class478.method3704(arg2, -1557, arg0);
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1778[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(B)V", line = 703)
    public final void method1202(byte arg0) {
        try {
            if (arg0 < 62) {
                this.method1196(null, null, 9, -105);
            }
            this.field1765.method2342(true);
            field1756++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1778[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(IILjj;)V", line = 717)
    private final void method1203(int arg0, int arg1, class334 arg2) {
        try {
            field1760++;
            class106.field1391 = arg2.field4801;
            arg2.method2626(true, (float) arg0);
            arg2.method2634(0);
            arg2.method2631(arg1 + 74, false);
            if (arg1 != -1) {
                method1194(86);
            }
            arg2.method2628(1, false);
            arg2.method2644((byte) 64);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1778[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1778[2] : field1778[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1204(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1205(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
