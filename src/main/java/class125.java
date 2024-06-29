import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class125 extends class46 {

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "Z")
    public boolean field2825 = false;

    @OriginalMember(owner = "client!s", name = "qb", descriptor = "I")
    public int field2836 = -1;

    @OriginalMember(owner = "client!s", name = "wb", descriptor = "[I")
    private int[] field2842 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "Lsc;")
    private static class128 field2830 = class129.method1017(false, "Cancel");

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "Lsc;")
    public static class128 field2828 = class129.method1017(false, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!s", name = "nb", descriptor = "Lsc;")
    public static class128 field2833 = field2830;

    @OriginalMember(owner = "client!s", name = "sb", descriptor = "I")
    public static int field2838 = 0;

    @OriginalMember(owner = "client!s", name = "tb", descriptor = "Lsc;")
    private static class128 field2839 = class129.method1017(false, "scroll:");

    @OriginalMember(owner = "client!s", name = "X", descriptor = "Lsc;")
    public static class128 field2817 = field2839;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "Lsc;")
    public static class128 field2820 = field2839;

    @OriginalMember(owner = "client!s", name = "xb", descriptor = "[I")
    public static int[] field2843 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!s", name = "vb", descriptor = "I")
    public static int field2841 = 1;

    @OriginalMember(owner = "client!s", name = "yb", descriptor = "Lrb;")
    public static class120 field2844 = new class120(50);

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!s", name = "pb", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!s", name = "ub", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!s", name = "zb", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!s", name = "rb", descriptor = "J")
    public static long field2837;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "[I")
    private int[] field2819;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "[Lb;")
    public static class8[] field2821;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "[S")
    private short[] field2818;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "[S")
    private short[] field2823;

    @OriginalMember(owner = "client!s", name = "mb", descriptor = "[S")
    private short[] field2832;

    @OriginalMember(owner = "client!s", name = "ob", descriptor = "[S")
    private short[] field2834;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILmc;)V")
    private final void method948(int arg0, int arg1, class86 arg2) {
        if (arg0 != -67) {
            return;
        }
        field2816++;
        if (arg1 == 1) {
            this.field2836 = arg2.method646(-15447);
        } else if (arg1 == 2) {
            int var8 = arg2.method646(arg0 ^ 0x3C14);
            this.field2819 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2819[var9] = arg2.method632((byte) -80);
            }
        } else if (arg1 == 3) {
            this.field2825 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method646(-15447);
            this.field2832 = new short[var4];
            this.field2818 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2818[var5] = (short) arg2.method632((byte) -80);
                this.field2832[var5] = (short) arg2.method632((byte) -80);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method646(-15447);
            this.field2823 = new short[var6];
            this.field2834 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2823[var7] = (short) arg2.method632((byte) -80);
                this.field2834[var7] = (short) arg2.method632((byte) -80);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2842[arg1 - 60] = arg2.method632((byte) -80);
            return;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)Ltd;")
    public final class136 method949(boolean arg0) {
        field2840++;
        class136[] var2 = new class136[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2842[var4] != -1) {
                var2[var3++] = class136.method1108(class30.field587, this.field2842[var4], 0);
            }
        }
        class136 var5 = new class136(var2, var3);
        if (this.field2818 != null) {
            for (int var6 = 0; var6 < this.field2818.length; var6++) {
                var5.method1111(this.field2818[var6], this.field2832[var6]);
            }
        }
        if (this.field2823 != null) {
            for (int var7 = 0; var7 < this.field2823.length; var7++) {
                var5.method1112(this.field2823[var7], this.field2834[var7]);
            }
        }
        if (!arg0) {
            this.method952(null, 31);
        }
        return var5;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)Z")
    public final boolean method950(int arg0) {
        field2822++;
        boolean var2 = true;
        if (arg0 != 27762) {
            this.method952(null, -22);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2842[var3] != -1 && !class30.field587.method1034(this.field2842[var3], 0, -1)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)Ltd;")
    public final class136 method951(int arg0) {
        field2826++;
        if (this.field2819 == null) {
            return null;
        }
        class136[] var2 = new class136[this.field2819.length];
        for (int var3 = 0; var3 < this.field2819.length; var3++) {
            var2[var3] = class136.method1108(class30.field587, this.field2819[var3], 0);
        }
        class136 var4;
        if (~var2.length == arg0) {
            var4 = var2[0];
        } else {
            var4 = new class136(var2, var2.length);
        }
        if (this.field2818 != null) {
            for (int var5 = 0; var5 < this.field2818.length; var5++) {
                var4.method1111(this.field2818[var5], this.field2832[var5]);
            }
        }
        if (this.field2823 != null) {
            for (int var6 = 0; var6 < this.field2823.length; var6++) {
                var4.method1112(this.field2823[var6], this.field2834[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lmc;I)V")
    public final void method952(class86 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method646(-15447);
            if (var3 == 0) {
                field2824++;
                if (arg1 > -91) {
                    this.method952(null, -109);
                    return;
                }
                return;
            }
            this.method948(-67, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
    public static final void method953(int arg0) {
        class13.field215 = false;
        class110.field2487 = false;
        if (arg0 < 1) {
            field2820 = null;
        }
        field2827++;
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)Z")
    public static final boolean method954(int arg0) {
        field2845++;
        if (class63.field1358 == null) {
            return false;
        }
        try {
            int var1 = class63.field1358.method501((byte) 10);
            if (var1 == 0) {
                return false;
            }
            if (class73.field1631 == -1) {
                var1--;
                class63.field1358.method500(0, 1, class158.field3626.field1920, false);
                class158.field3626.field1924 = 0;
                class73.field1631 = class158.field3626.method505((byte) 35);
                class128.field2942 = class58.field1256[class73.field1631];
            }
            if (class128.field2942 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class63.field1358.method500(0, 1, class158.field3626.field1920, false);
                var1--;
                class128.field2942 = class158.field3626.field1920[0] & 0xFF;
            }
            if (class128.field2942 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class63.field1358.method500(0, 2, class158.field3626.field1920, false);
                class158.field3626.field1924 = 0;
                class128.field2942 = class158.field3626.method632((byte) -80);
                var1 -= 2;
            }
            if (var1 < class128.field2942) {
                return false;
            }
            class158.field3626.field1924 = 0;
            class63.field1358.method500(0, class128.field2942, class158.field3626.field1920, false);
            class50.field997 = 0;
            class1.field7 = class102.field2333;
            class102.field2333 = class1.field11;
            class1.field11 = class73.field1631;
            if (class73.field1631 == 253) {
                int var2 = class158.field3626.field1924 + class128.field2942;
                int var3 = class158.field3626.method632((byte) -80);
                int var4 = class158.field3626.method632((byte) -80);
                if (class29.field556 != var3) {
                    class29.field556 = var3;
                    class152.method1209(class29.field556, false);
                    class102.method772((byte) -60, class29.field556);
                    for (int var5 = 0; var5 < 100; var5++) {
                        class153.field3517[var5] = true;
                    }
                }
                while (var4-- > 0) {
                    int var6 = class158.field3626.method666(1183700424);
                    int var7 = class158.field3626.method632((byte) -80);
                    int var8 = class158.field3626.method646(-15447);
                    class143 var9 = (class143) class66.field1492.method969((long) var6, -80);
                    if (var9 != null && var9.field3349 != var7) {
                        class44.method314(var9, (byte) -57, true);
                        var9 = null;
                    }
                    if (var9 == null) {
                        var9 = class6.method23(var6, var7, var8, false);
                    }
                    var9.field3347 = true;
                }
                for (class143 var10 = (class143) class66.field1492.method970(true); var10 != null; var10 = (class143) class66.field1492.method968(-74)) {
                    if (var10.field3347) {
                        var10.field3347 = false;
                    } else {
                        class44.method314(var10, (byte) 107, true);
                    }
                }
                class152.field3495 = new class127(512);
                while (var2 > class158.field3626.field1924) {
                    int var11 = class158.field3626.method666(1183700424);
                    int var12 = class158.field3626.method632((byte) -80);
                    int var13 = class158.field3626.method632((byte) -80);
                    int var14 = class158.field3626.method666(1183700424);
                    for (int var15 = var12; var15 <= var13; var15++) {
                        long var16 = ((long) var11 << 32) + (long) var15;
                        class152.field3495.method964(false, new class110(var14), var16);
                    }
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 150) {
                int var18 = class158.field3626.method678(0);
                class29.field556 = var18;
                class152.method1209(var18, false);
                class102.method772((byte) -60, class29.field556);
                for (int var19 = 0; var19 < 100; var19++) {
                    class153.field3517[var19] = true;
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 173) {
                int var20 = class158.field3626.method666(1183700424);
                int var21 = class158.field3626.method677(-1);
                int var22 = class158.field3626.method632((byte) -80);
                if (var22 == 65535) {
                    var22 = -1;
                }
                class54 var23 = class46.method338(var21, -94);
                if (var23.field1146) {
                    var23.field1214 = var22;
                    var23.field1196 = var20;
                    class64 var24 = class27.method230((byte) -44, var22);
                    var23.field1185 = var24.field1423;
                    var23.field1156 = var24.field1410;
                    var23.field1128 = var24.field1379;
                    var23.field1217 = var24.field1391;
                    var23.field1173 = var24.field1417;
                    if (var23.field1154 > 0) {
                        var23.field1173 = var23.field1173 * 32 / var23.field1154;
                    }
                    var23.field1160 = var24.field1368;
                    class89.method696(var23, 1);
                } else if (var22 == -1) {
                    var23.field1179 = 0;
                    class73.field1631 = -1;
                    return true;
                } else {
                    class64 var25 = class27.method230((byte) -44, var22);
                    var23.field1173 = var25.field1417 * 100 / var20;
                    var23.field1217 = var25.field1391;
                    var23.field1128 = var25.field1379;
                    var23.field1093 = var22;
                    var23.field1179 = 4;
                    class89.method696(var23, 1);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 141) {
                int var26 = class158.field3626.method666(1183700424);
                int var27 = class158.field3626.method632((byte) -80);
                if (var26 < -70000) {
                    var27 += 32768;
                }
                class54 var28;
                if (var26 >= 0) {
                    var28 = class46.method338(var26, -96);
                } else {
                    var28 = null;
                }
                while (class128.field2942 > class158.field3626.field1924) {
                    int var29 = class158.field3626.method636((byte) 109);
                    int var30 = 0;
                    int var31 = class158.field3626.method632((byte) -80);
                    if (var31 != 0) {
                        var30 = class158.field3626.method646(-15447);
                        if (var30 == 255) {
                            var30 = class158.field3626.method666(1183700424);
                        }
                    }
                    if (var28 != null && var29 >= 0 && var29 < var28.field1144.length) {
                        var28.field1144[var29] = var31;
                        var28.field1203[var29] = var30;
                    }
                    class151.method1201(-3598, var30, var31 - 1, var29, var27);
                }
                if (var28 != null) {
                    class89.method696(var28, 1);
                }
                class5.method14(17688);
                class100.field2318[class25.method224(class140.field3265++, 31)] = class25.method224(32767, var27);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 158) {
                if (class29.field556 != -1) {
                    class122.method937((byte) -68, 0, class29.field556);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 114) {
                for (int var32 = 0; var32 < class126.field2849.length; var32++) {
                    if (class16.field307[var32] != class126.field2849[var32]) {
                        class126.field2849[var32] = class16.field307[var32];
                        class71.method542(-15128, var32);
                        class143.field3342[class25.method224(class66.field1466++, 31)] = var32;
                    }
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 187) {
                for (int var33 = 0; var33 < class42.field777; var33++) {
                    class72 var34 = class84.method616(-117, var33);
                    if (var34 != null && var34.field1609 == 0) {
                        class16.field307[var33] = 0;
                        class126.field2849[var33] = 0;
                    }
                }
                class5.method14(17688);
                class73.field1631 = -1;
                class66.field1466 += 32;
                return true;
            }
            if (class73.field1631 == 109) {
                int var35 = class158.field3626.method639(-121);
                int var36 = class158.field3626.method645((byte) 99);
                class54 var37 = class46.method338(var36, 70);
                if (var37.field1179 != 1 || var37.field1093 != var35) {
                    var37.field1093 = var35;
                    var37.field1179 = 1;
                    class89.method696(var37, 1);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 221) {
                int var38 = class158.field3626.method662(-26541);
                int var39 = class158.field3626.method665((byte) -124);
                int var40 = class158.field3626.method629(-57);
                class54 var41 = class46.method338(var39, 114);
                int var42 = var41.field1116 + var38;
                int var43 = var41.field1096 + var40;
                if (var41.field1110 != var43 || var41.field1194 != var42) {
                    var41.field1110 = var43;
                    var41.field1194 = var42;
                    class89.method696(var41, 1);
                }
                class73.field1631 = -1;
                return true;
            }
            if (arg0 >= -46) {
                field2830 = null;
            }
            if (class73.field1631 == 8) {
                class19.field349 = class158.field3626.method646(-15447);
                class126.field2850 = class158.field3626.method646(-15447);
                class123.field2788 = class158.field3626.method646(-15447);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 154) {
                class86.field1911 = class158.field3626.method658(255);
                class156.field3588 = class158.field3626.method658(255);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 178) {
                class132.field3053 = true;
                class64.field1367 = class158.field3626.method646(-15447);
                class131.field3032 = class158.field3626.method646(-15447);
                class141.field3297 = class158.field3626.method632((byte) -80);
                class156.field3591 = class158.field3626.method646(-15447);
                class126.field2860 = class158.field3626.method646(-15447);
                if (class126.field2860 >= 100) {
                    int var44 = class64.field1367 * 128 + 64;
                    int var45 = class131.field3032 * 128 + 64;
                    int var46 = class97.method755(var45, class29.field553, var44, 256) - class141.field3297;
                    int var47 = var44 - class147.field3410;
                    int var48 = var45 - class1.field2;
                    int var49 = var46 - class65.field1430;
                    int var50 = (int) Math.sqrt((double) (var47 * var47 + var48 * var48));
                    class156.field3589 = (int) (Math.atan2((double) var49, (double) var50) * 325.949D) & 0x7FF;
                    class1.field10 = (int) (-325.949D * Math.atan2((double) var47, (double) var48)) & 0x7FF;
                    if (class156.field3589 < 128) {
                        class156.field3589 = 128;
                    }
                    if (class156.field3589 > 383) {
                        class156.field3589 = 383;
                    }
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 216) {
                int var51 = class158.field3626.method645((byte) 113);
                class128 var52 = class158.field3626.method670(-1);
                class54 var53 = class46.method338(var51, 107);
                if (!var52.method991(-1, var53.field1165)) {
                    var53.field1165 = var52;
                    class89.method696(var53, 1);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 82) {
                field2838 = class135.field3186;
                long var54 = class158.field3626.method675((byte) -127);
                if (var54 == 0L) {
                    class5.field45 = null;
                    class116.field2612 = null;
                    class102.field2326 = 0;
                    class73.field1631 = -1;
                    class141.field3310 = null;
                    return true;
                }
                long var56 = class158.field3626.method675((byte) -119);
                class116.field2612 = class129.method1018(var56, 82);
                class141.field3310 = class129.method1018(var54, 82);
                class90.field2053 = class158.field3626.method667(-1);
                int var58 = class158.field3626.method646(-15447);
                if (var58 == 255) {
                    class73.field1631 = -1;
                    return true;
                }
                class102.field2326 = var58;
                class63[] var59 = new class63[100];
                for (int var60 = 0; var60 < class102.field2326; var60++) {
                    var59[var60] = new class63();
                    var59[var60].field365 = class158.field3626.method675((byte) -126);
                    var59[var60].field1355 = class129.method1018(var59[var60].field365, 82);
                    var59[var60].field1345 = class158.field3626.method632((byte) -80);
                    var59[var60].field1344 = class158.field3626.method667(-1);
                    if (field2837 == var59[var60].field365) {
                        class157.field3612 = var59[var60].field1344;
                    }
                }
                boolean var61 = false;
                int var62 = class102.field2326;
                while (var62 > 0) {
                    var62--;
                    boolean var63 = true;
                    for (int var64 = 0; var64 < var62; var64++) {
                        if (var59[var64].field1355.method989(var59[var64 + 1].field1355, 0) > 0) {
                            var63 = false;
                            class63 var65 = var59[var64];
                            var59[var64] = var59[var64 + 1];
                            var59[var64 + 1] = var65;
                        }
                    }
                    if (var63) {
                        break;
                    }
                }
                class5.field45 = var59;
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 60) {
                class5.method14(17688);
                class1.field13 = class158.field3626.method646(-15447);
                class73.field1631 = -1;
                class135.field3176 = class135.field3186;
                return true;
            }
            if (class73.field1631 == 182) {
                class150.field3449 = class158.field3626.method646(-15447);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 15) {
                int var66 = class158.field3626.method666(1183700424);
                class54 var67 = class46.method338(var66, 81);
                var67.field1179 = 3;
                var67.field1093 = class151.field3473.field1043.method531((byte) -82);
                class89.method696(var67, 1);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 110) {
                int var68 = class158.field3626.method639(-114);
                int var69 = class158.field3626.method677(-1);
                int var70 = var68 >> 10 & 0x1F;
                int var71 = var68 & 0x1F;
                int var72 = var68 >> 5 & 0x1F;
                int var73 = (var70 << 19) + (var71 << 3) + (var72 << 11);
                class54 var74 = class46.method338(var69, 45);
                if (var74.field1082 != var73) {
                    var74.field1082 = var73;
                    class89.method696(var74, 1);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 26) {
                int var75 = class158.field3626.method632((byte) -80);
                if (var75 == 65535) {
                    var75 = -1;
                }
                class102.method769(var75, true);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 192) {
                int var76 = class158.field3626.method630(-1723309496);
                int var77 = class158.field3626.method678(0);
                if (var77 == 65535) {
                    var77 = -1;
                }
                class153.method1212(var76, var77, -13393);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 202) {
                int var78 = class158.field3626.method666(1183700424);
                int var79 = class158.field3626.method678(0);
                int var80 = class158.field3626.method665((byte) -127);
                if (var79 == 65535) {
                    var79 = -1;
                }
                int var81 = class158.field3626.method650(65536);
                if (var81 == 65535) {
                    var81 = -1;
                }
                for (int var82 = var79; var82 <= var81; var82++) {
                    long var83 = ((long) var80 << 32) + ((long) var82);
                    class20 var85 = class152.field3495.method969(var83, -70);
                    if (var85 != null) {
                        var85.method172(-2658);
                    }
                    class152.field3495.method964(false, new class110(var78), var83);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 98) {
                class128 var86 = class158.field3626.method670(-1);
                if (var86.method1002(1, class67.field1519)) {
                    boolean var87 = false;
                    class128 var88 = var86.method974(0, (byte) -11, var86.method986(class94.field2213, (byte) -103));
                    long var89 = var88.method973(-91);
                    for (int var91 = 0; var91 < class151.field3476; var91++) {
                        if (class51.field1033[var91] == var89) {
                            var87 = true;
                            break;
                        }
                    }
                    if (!var87 && class79.field1770 == 0) {
                        class126.method958(4, 1, var88, class126.field2863);
                    }
                } else if (var86.method1002(1, class158.field3635)) {
                    class128 var106 = var86.method974(0, (byte) -11, var86.method986(class94.field2213, (byte) -93));
                    long var107 = var106.method973(-91);
                    boolean var109 = false;
                    for (int var110 = 0; var110 < class151.field3476; var110++) {
                        if (class51.field1033[var110] == var107) {
                            var109 = true;
                            break;
                        }
                    }
                    if (!var109 && class79.field1770 == 0) {
                        class126.method958(8, 1, var106, class68.field1534);
                    }
                } else if (var86.method1002(1, class151.field3481)) {
                    class128 var92 = var86.method974(0, (byte) -11, var86.method986(class94.field2213, (byte) -44));
                    boolean var93 = false;
                    long var94 = var92.method973(-91);
                    for (int var96 = 0; var96 < class151.field3476; var96++) {
                        if (class51.field1033[var96] == var94) {
                            var93 = true;
                            break;
                        }
                    }
                    if (!var93 && class79.field1770 == 0) {
                        class128 var97 = var86.method974(var86.method986(class94.field2213, (byte) 124) + 1, (byte) -11, var86.method1014(-9) - 9);
                        class126.method958(8, 1, var92, var97);
                    }
                } else if (var86.method1002(1, class29.field549)) {
                    boolean var101 = false;
                    class128 var102 = var86.method974(0, (byte) -11, var86.method986(class94.field2213, (byte) -35));
                    long var103 = var102.method973(-91);
                    for (int var105 = 0; var105 < class151.field3476; var105++) {
                        if (class51.field1033[var105] == var103) {
                            var101 = true;
                            break;
                        }
                    }
                    if (!var101 && class79.field1770 == 0) {
                        class126.method958(10, 1, var102, class18.field323);
                    }
                } else if (var86.method1002(1, client.field455)) {
                    class128 var98 = var86.method974(0, (byte) -11, var86.method986(client.field455, (byte) -37));
                    class126.method958(11, 1, class18.field323, var98);
                } else if (var86.method1002(1, class147.field3405)) {
                    class128 var100 = var86.method974(0, (byte) -11, var86.method986(class147.field3405, (byte) 61));
                    if (class79.field1770 == 0) {
                        class126.method958(12, 1, class18.field323, var100);
                    }
                } else if (var86.method1002(1, class158.field3636)) {
                    class128 var99 = var86.method974(0, (byte) -11, var86.method986(class158.field3636, (byte) 97));
                    if (class79.field1770 == 0) {
                        class126.method958(13, 1, class18.field323, var99);
                    }
                } else {
                    class126.method958(0, 1, class18.field323, var86);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 119) {
                int var111 = class158.field3626.method666(1183700424);
                class143 var112 = (class143) class66.field1492.method969((long) var111, -125);
                if (var112 != null) {
                    class44.method314(var112, (byte) -64, true);
                }
                if (class110.field2473 != null) {
                    class89.method696(class110.field2473, 1);
                    class110.field2473 = null;
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 68) {
                class151.field3476 = class128.field2942 / 8;
                for (int var113 = 0; var113 < class151.field3476; var113++) {
                    class51.field1033[var113] = class158.field3626.method675((byte) -125);
                    class148.field3415[var113] = class129.method1018(class51.field1033[var113], 82);
                }
                class73.field1631 = -1;
                class75.field1648 = class135.field3186;
                return true;
            }
            if (class73.field1631 == 189) {
                int var114 = class158.field3626.method666(1183700424);
                class2.field26 = class144.field3353.method77(var114, false);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 136) {
                int var115 = class158.field3626.method659(68);
                int var116 = class158.field3626.method658(255);
                class128 var117 = class158.field3626.method670(-1);
                if (var115 >= 1 && var115 <= 8) {
                    if (var117.method1010(1, class66.field1483)) {
                        var117 = null;
                    }
                    class157.field3614[var115 - 1] = var117;
                    class31.field608[var115 - 1] = var116 == 0;
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 14) {
                class86.field1911 = class158.field3626.method658(255);
                class156.field3588 = class158.field3626.method668(-24845);
                for (int var118 = class156.field3588; var118 < class156.field3588 + 8; var118++) {
                    for (int var119 = class86.field1911; var119 < class86.field1911 + 8; var119++) {
                        if (class124.field2796[class29.field553][var118][var119] != null) {
                            class124.field2796[class29.field553][var118][var119] = null;
                            class55.method424(var118, var119, (byte) 122);
                        }
                    }
                }
                for (class16 var120 = (class16) class90.field2048.method920((byte) -93); var120 != null; var120 = (class16) class90.field2048.method932(-6)) {
                    if (var120.field296 >= class156.field3588 && class156.field3588 + 8 > var120.field296 && class86.field1911 <= var120.field287 && class86.field1911 + 8 > var120.field287 && class29.field553 == var120.field306) {
                        var120.field295 = 0;
                    }
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 170) {
                int var121 = class158.field3626.method666(1183700424);
                int var122 = class158.field3626.method632((byte) -80);
                class54 var123;
                if (var121 >= 0) {
                    var123 = class46.method338(var121, -75);
                } else {
                    var123 = null;
                }
                if (var123 != null) {
                    for (int var124 = 0; var124 < var123.field1144.length; var124++) {
                        var123.field1144[var124] = 0;
                        var123.field1203[var124] = 0;
                    }
                }
                if (var121 < -70000) {
                    var122 += 32768;
                }
                class112.method860((byte) -123, var122);
                int var125 = class158.field3626.method632((byte) -80);
                for (int var126 = 0; var126 < var125; var126++) {
                    int var127 = class158.field3626.method659(109);
                    if (var127 == 255) {
                        var127 = class158.field3626.method665((byte) -125);
                    }
                    int var128 = class158.field3626.method639(-120);
                    if (var123 != null && var126 < var123.field1144.length) {
                        var123.field1144[var126] = var128;
                        var123.field1203[var126] = var127;
                    }
                    class151.method1201(-3598, var127, var128 - 1, var126, var122);
                }
                if (var123 != null) {
                    class89.method696(var123, 1);
                }
                class5.method14(17688);
                class100.field2318[class25.method224(class140.field3265++, 31)] = class25.method224(var122, 32767);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 238) {
                class5.method14(17688);
                class152.field3506 = class158.field3626.method637(false);
                class135.field3176 = class135.field3186;
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 235) {
                class86.method635(class158.field3626, 0);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 74) {
                class58.method441(0);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 94) {
                class132.field3053 = false;
                for (int var129 = 0; var129 < 5; var129++) {
                    class79.field1781[var129] = false;
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 226) {
                int var130 = class158.field3626.method677(-1);
                int var131 = class158.field3626.method637(false);
                class54 var132 = class46.method338(var130, -89);
                if (var132.field1140 != var131 || var131 == -1) {
                    var132.field1140 = var131;
                    var132.field1182 = 0;
                    var132.field1151 = 0;
                    class89.method696(var132, 1);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 0) {
                class132.field3053 = true;
                class27.field527 = class158.field3626.method646(-15447);
                class155.field3562 = class158.field3626.method646(-15447);
                class69.field1554 = class158.field3626.method632((byte) -80);
                class14.field266 = class158.field3626.method646(-15447);
                class140.field3264 = class158.field3626.method646(-15447);
                if (class140.field3264 >= 100) {
                    class147.field3410 = class27.field527 * 128 + 64;
                    class1.field2 = class155.field3562 * 128 + 64;
                    class65.field1430 = class97.method755(class1.field2, class29.field553, class147.field3410, 256) - class69.field1554;
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 181) {
                class5.method14(17688);
                int var133 = class158.field3626.method646(-15447);
                int var134 = class158.field3626.method665((byte) -124);
                int var135 = class158.field3626.method658(255);
                class152.field3509[var135] = var134;
                class6.field75[var135] = var133;
                class64.field1372[var135] = 1;
                for (int var136 = 0; var136 < 98; var136++) {
                    if (var134 >= class149.field3434[var136]) {
                        class64.field1372[var135] = var136 + 2;
                    }
                }
                class156.field3579[class25.method224(31, class131.field3040++)] = var135;
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 66) {
                long var137 = class158.field3626.method675((byte) -115);
                class128 var139 = class133.method1061(class87.method680((byte) 37, class158.field3626).method1006(90));
                class126.method958(6, 1, class129.method1018(var137, 82).method987(114), var139);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 29) {
                long var140 = class158.field3626.method675((byte) -120);
                class158.field3626.method667(-1);
                long var142 = class158.field3626.method675((byte) -115);
                long var144 = (long) class158.field3626.method632((byte) -80);
                long var146 = (long) class158.field3626.method671(73);
                boolean var148 = false;
                long var149 = (var144 << 32) + var146;
                int var151 = class158.field3626.method646(-15447);
                for (int var152 = 0; var152 < 100; var152++) {
                    if (class92.field2105[var152] == var149) {
                        var148 = true;
                        break;
                    }
                }
                if (var151 <= 1) {
                    for (int var153 = 0; var153 < class151.field3476; var153++) {
                        if (class51.field1033[var153] == var140) {
                            var148 = true;
                            break;
                        }
                    }
                }
                if (!var148 && class79.field1770 == 0) {
                    class92.field2105[class112.field2524] = var149;
                    class112.field2524 = (class112.field2524 + 1) % 100;
                    class128 var154 = class133.method1061(class87.method680((byte) 23, class158.field3626).method1006(90));
                    if (var151 == 2 || var151 == 3) {
                        class16.method153(class129.method1018(var142, 82).method987(122), 9, var154, 16799, class51.method395(new class128[] { class157.field3615, class129.method1018(var140, 82).method987(56) }, false));
                    } else if (var151 == 1) {
                        class16.method153(class129.method1018(var142, 82).method987(44), 9, var154, 16799, class51.method395(new class128[] { class146.field3382, class129.method1018(var140, 82).method987(115) }, false));
                    } else {
                        class16.method153(class129.method1018(var142, 82).method987(98), 9, var154, 16799, class129.method1018(var140, 82).method987(125));
                    }
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 19) {
                int var155 = class158.field3626.method632((byte) -80);
                int var156 = class158.field3626.method677(-1);
                class54 var157 = class46.method338(var156, -70);
                if (var157 != null && var157.field1137 == 0) {
                    if (var157.field1127 - var157.field1111 < var155) {
                        var155 = var157.field1127 - var157.field1111;
                    }
                    if (var155 < 0) {
                        var155 = 0;
                    }
                    if (var157.field1211 != var155) {
                        var157.field1211 = var155;
                        class89.method696(var157, 1);
                    }
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 7) {
                long var158 = class158.field3626.method675((byte) -110);
                int var160 = class158.field3626.method632((byte) -80);
                int var161 = class158.field3626.method646(-15447);
                class128 var162 = class129.method1018(var158, 82).method987(98);
                for (int var163 = 0; var163 < class35.field675; var163++) {
                    if (class54.field1106[var163] == var158) {
                        if (class12.field200[var163] != var160) {
                            class12.field200[var163] = var160;
                            if (var160 > 0) {
                                class126.method958(5, 1, class18.field323, class51.method395(new class128[] { var162, class33.field625 }, false));
                            }
                            if (var160 == 0) {
                                class126.method958(5, 1, class18.field323, class51.method395(new class128[] { var162, class144.field3357 }, false));
                            }
                        }
                        var162 = null;
                        class11.field188[var163] = var161;
                        break;
                    }
                }
                if (var162 != null && class35.field675 < 200) {
                    class54.field1106[class35.field675] = var158;
                    class111.field2502[class35.field675] = var162;
                    class12.field200[class35.field675] = var160;
                    class11.field188[class35.field675] = var161;
                    class35.field675++;
                }
                class75.field1648 = class135.field3186;
                int var164 = class35.field675;
                boolean var165 = false;
                while (var164 > 0) {
                    boolean var166 = true;
                    var164--;
                    for (int var167 = 0; var167 < var164; var167++) {
                        if (class12.field200[var167] != class142.field3335 && class12.field200[var167 + 1] == class142.field3335 || class12.field200[var167] == 0 && class12.field200[var167 + 1] != 0) {
                            int var168 = class12.field200[var167];
                            var166 = false;
                            class12.field200[var167] = class12.field200[var167 + 1];
                            class12.field200[var167 + 1] = var168;
                            class128 var169 = class111.field2502[var167];
                            class111.field2502[var167] = class111.field2502[var167 + 1];
                            class111.field2502[var167 + 1] = var169;
                            long var170 = class54.field1106[var167];
                            class54.field1106[var167] = class54.field1106[var167 + 1];
                            class54.field1106[var167 + 1] = var170;
                            int var172 = class11.field188[var167];
                            class11.field188[var167] = class11.field188[var167 + 1];
                            class11.field188[var167 + 1] = var172;
                        }
                    }
                    if (var166) {
                        break;
                    }
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 194) {
                int var173 = class158.field3626.method646(-15447);
                int var174 = class158.field3626.method646(-15447);
                int var175 = class158.field3626.method646(-15447);
                int var176 = class158.field3626.method646(-15447);
                class79.field1781[var173] = true;
                class93.field2118[var173] = var174;
                class29.field557[var173] = var175;
                class159.field3653[var173] = var176;
                class23.field459[var173] = 0;
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 208) {
                class111.method853(0);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 32) {
                class25.method222(true, false);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 203) {
                for (int var177 = 0; var177 < class106.field2421.length; var177++) {
                    if (class106.field2421[var177] != null) {
                        class106.field2421[var177].field981 = -1;
                    }
                }
                for (int var178 = 0; var178 < class92.field2104.length; var178++) {
                    if (class92.field2104[var178] != null) {
                        class92.field2104[var178].field981 = -1;
                    }
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 215) {
                int var179 = class158.field3626.method658(255);
                int var180 = class158.field3626.method639(-112);
                int var181 = class158.field3626.method677(-1);
                class143 var182 = (class143) class66.field1492.method969((long) var181, -118);
                if (var182 != null) {
                    class44.method314(var182, (byte) -118, var182.field3349 != var180);
                }
                class6.method23(var181, var180, var179, false);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 102) {
                class132.method1048(class144.field3353, class128.field2942, -5, class158.field3626);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 210) {
                long var183 = class158.field3626.method675((byte) -123);
                int var185 = class158.field3626.method632((byte) -80);
                boolean var186 = false;
                byte var187 = class158.field3626.method667(-1);
                if ((Long.MIN_VALUE & var183) != 0L) {
                    var186 = true;
                }
                if (var186) {
                    if (class102.field2326 == 0) {
                        class73.field1631 = -1;
                        return true;
                    }
                    long var192 = var183 & Long.MAX_VALUE;
                    boolean var194 = false;
                    int var195;
                    for (var195 = 0; class102.field2326 > var195 && (class5.field45[var195].field365 != var192 || class5.field45[var195].field1345 != var185); var195++) {
                    }
                    if (var195 < class102.field2326) {
                        while (var195 < class102.field2326 - 1) {
                            class5.field45[var195] = class5.field45[var195 + 1];
                            var195++;
                        }
                        class102.field2326--;
                        class5.field45[class102.field2326] = null;
                    }
                } else {
                    class63 var188 = new class63();
                    var188.field365 = var183;
                    var188.field1355 = class129.method1018(var188.field365, 82);
                    var188.field1344 = var187;
                    var188.field1345 = var185;
                    int var189;
                    for (var189 = class102.field2326 - 1; var189 >= 0; var189--) {
                        int var190 = class5.field45[var189].field1355.method989(var188.field1355, 0);
                        if (var190 == 0) {
                            class5.field45[var189].field1345 = var185;
                            class5.field45[var189].field1344 = var187;
                            field2838 = class135.field3186;
                            if (field2837 == var183) {
                                class157.field3612 = var187;
                            }
                            class73.field1631 = -1;
                            return true;
                        }
                        if (var190 < 0) {
                            break;
                        }
                    }
                    if (class5.field45.length <= class102.field2326) {
                        class73.field1631 = -1;
                        return true;
                    }
                    for (int var191 = class102.field2326 - 1; var191 > var189; var191--) {
                        class5.field45[var191 + 1] = class5.field45[var191];
                    }
                    if (class102.field2326 == 0) {
                        class5.field45 = new class63[100];
                    }
                    class5.field45[var189 + 1] = var188;
                    if (field2837 == var183) {
                        class157.field3612 = var187;
                    }
                    class102.field2326++;
                }
                class73.field1631 = -1;
                field2838 = class135.field3186;
                return true;
            }
            if (class73.field1631 == 24) {
                int var196 = class158.field3626.method650(65536);
                int var197 = class158.field3626.method677(-1);
                class54 var198 = class46.method338(var197, -115);
                if (var198.field1179 != 2 || var198.field1093 != var196) {
                    var198.field1093 = var196;
                    var198.field1179 = 2;
                    class89.method696(var198, 1);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 242) {
                int var199 = class158.field3626.method659(-107);
                int var200 = class158.field3626.method659(-28);
                int var201 = class158.field3626.method658(255);
                class29.field553 = var199 >> 1;
                class151.field3473.method389(var201, (var199 & 0x1) == 1, var200, (byte) 82);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 172) {
                int var202 = class158.field3626.method632((byte) -80);
                int var203 = class158.field3626.method665((byte) -123);
                int var204 = class158.field3626.method678(0);
                int var205 = class158.field3626.method678(0);
                class54 var206 = class46.method338(var203, 102);
                if (var206.field1217 != var204 || var206.field1128 != var205 || var206.field1173 != var202) {
                    var206.field1173 = var202;
                    var206.field1128 = var205;
                    var206.field1217 = var204;
                    class89.method696(var206, 1);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 45) {
                int var207 = class158.field3626.method677(-1);
                int var208 = class158.field3626.method632((byte) -80);
                class16.field307[var208] = var207;
                if (class126.field2849[var208] != var207) {
                    class126.field2849[var208] = var207;
                    class71.method542(-15128, var208);
                }
                class143.field3342[class25.method224(31, class66.field1466++)] = var208;
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 146) {
                class25.method222(true, true);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 100) {
                boolean var209 = class158.field3626.method659(108) == 1;
                int var210 = class158.field3626.method645((byte) 113);
                class54 var211 = class46.method338(var210, 114);
                if (var209 != var211.field1141) {
                    var211.field1141 = var209;
                    class89.method696(var211, 1);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 139) {
                int var212 = class158.field3626.method632((byte) -80);
                int var213 = class158.field3626.method646(-15447);
                int var214 = class158.field3626.method632((byte) -80);
                class144.method1168(var213, -1, var214, var212);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 126) {
                int var215 = class158.field3626.method650(65536);
                class25.method220(var215, 94);
                class100.field2318[class25.method224(class140.field3265++, 31)] = class25.method224(var215, 32767);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 47) {
                int var216 = class158.field3626.method665((byte) -125);
                class54 var217 = class46.method338(var216, -92);
                for (int var218 = 0; var218 < var217.field1144.length; var218++) {
                    var217.field1144[var218] = -1;
                    var217.field1144[var218] = 0;
                }
                class89.method696(var217, 1);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 206) {
                class73.field1631 = -1;
                class66.field1490 = 0;
                return true;
            }
            if (class73.field1631 == 243) {
                class63.field1359 = class158.field3626.method650(65536) * 30;
                class135.field3176 = class135.field3186;
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 87) {
                class36.field685 = class158.field3626.method646(-15447);
                if (class36.field685 == 1) {
                    class159.field3657 = class158.field3626.method632((byte) -80);
                }
                if (class36.field685 >= 2 && class36.field685 <= 6) {
                    if (class36.field685 == 2) {
                        class106.field2420 = 64;
                        class124.field2805 = 64;
                    }
                    if (class36.field685 == 3) {
                        class106.field2420 = 0;
                        class124.field2805 = 64;
                    }
                    if (class36.field685 == 4) {
                        class124.field2805 = 64;
                        class106.field2420 = 128;
                    }
                    if (class36.field685 == 5) {
                        class106.field2420 = 64;
                        class124.field2805 = 0;
                    }
                    if (class36.field685 == 6) {
                        class124.field2805 = 128;
                        class106.field2420 = 64;
                    }
                    class36.field685 = 2;
                    class6.field80 = class158.field3626.method632((byte) -80);
                    class113.field2545 = class158.field3626.method632((byte) -80);
                    class35.field672 = class158.field3626.method646(-15447);
                }
                if (class36.field685 == 10) {
                    class97.field2254 = class158.field3626.method632((byte) -80);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 156) {
                int var219 = class158.field3626.method645((byte) 126);
                int var220 = class158.field3626.method678(0);
                int var221 = class158.field3626.method650(65536);
                class54 var222 = class46.method338(var219, 45);
                var222.field1089 = (var221 << 16) + var220;
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 219) {
                int var223 = class158.field3626.method639(-107);
                byte var224 = class158.field3626.method667(-1);
                class16.field307[var223] = var224;
                if (class126.field2849[var223] != var224) {
                    class126.field2849[var223] = var224;
                    class71.method542(-15128, var223);
                }
                class143.field3342[class25.method224(31, class66.field1466++)] = var223;
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 213) {
                class36.field703 = class158.field3626.method646(-15447);
                class73.field1631 = -1;
                class75.field1648 = class135.field3186;
                return true;
            }
            if (class73.field1631 == 129) {
                class128 var225 = class158.field3626.method670(-1);
                Object[] var226 = new Object[var225.method1014(-9) + 1];
                for (int var227 = var225.method1014(-9) - 1; var227 >= 0; var227--) {
                    if (var225.method981(false, var227) == 115) {
                        var226[var227 + 1] = class158.field3626.method670(-1);
                    } else {
                        var226[var227 + 1] = Integer.valueOf(class158.field3626.method666(1183700424));
                    }
                }
                var226[0] = Integer.valueOf(class158.field3626.method666(1183700424));
                class18 var228 = new class18();
                var228.field321 = var226;
                class46.method341(var228, -2601);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 241) {
                long var229 = class158.field3626.method675((byte) -127);
                long var231 = (long) class158.field3626.method632((byte) -80);
                long var233 = (long) class158.field3626.method671(117);
                long var235 = (var231 << 32) + var233;
                int var237 = class158.field3626.method646(-15447);
                boolean var238 = false;
                for (int var239 = 0; var239 < 100; var239++) {
                    if (class92.field2105[var239] == var235) {
                        var238 = true;
                        break;
                    }
                }
                if (var237 <= 1) {
                    for (int var240 = 0; var240 < class151.field3476; var240++) {
                        if (class51.field1033[var240] == var229) {
                            var238 = true;
                            break;
                        }
                    }
                }
                if (!var238 && class79.field1770 == 0) {
                    class92.field2105[class112.field2524] = var235;
                    class112.field2524 = (class112.field2524 + 1) % 100;
                    class128 var241 = class133.method1061(class87.method680((byte) 116, class158.field3626).method1006(90));
                    if (var237 == 2 || var237 == 3) {
                        class126.method958(7, 1, class51.method395(new class128[] { class157.field3615, class129.method1018(var229, 82).method987(63) }, false), var241);
                    } else if (var237 == 1) {
                        class126.method958(7, 1, class51.method395(new class128[] { class146.field3382, class129.method1018(var229, 82).method987(104) }, false), var241);
                    } else {
                        class126.method958(3, 1, class129.method1018(var229, 82).method987(63), var241);
                    }
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 232) {
                class156.field3588 = class158.field3626.method646(-15447);
                class86.field1911 = class158.field3626.method658(255);
                while (class158.field3626.field1924 < class128.field2942) {
                    class73.field1631 = class158.field3626.method646(-15447);
                    class25.method219(-82);
                }
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 248 || class73.field1631 == 144 || class73.field1631 == 164 || class73.field1631 == 237 || class73.field1631 == 83 || class73.field1631 == 50 || class73.field1631 == 149 || class73.field1631 == 106 || class73.field1631 == 118 || class73.field1631 == 140 || class73.field1631 == 72) {
                class25.method219(-128);
                class73.field1631 = -1;
                return true;
            }
            if (class73.field1631 == 85) {
                class90.method704(-20389);
                class73.field1631 = -1;
                return false;
            }
            class116.method895(-1, null, "T1 - " + class73.field1631 + "," + class102.field2333 + "," + class1.field7 + " - " + class128.field2942);
            class90.method704(-20389);
        } catch (IOException var245) {
            class44.method316(4550);
        } catch (Exception var246) {
            String var243 = "T2 - " + class73.field1631 + "," + class102.field2333 + "," + class1.field7 + " - " + class128.field2942 + "," + (class151.field3473.field962[0] + class62.field1325) + "," + (class151.field3473.field989[0] + class66.field1482) + " - ";
            for (int var244 = 0; var244 < class128.field2942 && var244 < 50; var244++) {
                var243 = var243 + class158.field3626.field1920[var244] + ",";
            }
            class116.method895(-1, var246, var243);
            class90.method704(-20389);
        }
        return true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([BIZI)Z")
    public static final boolean method955(byte[] arg0, int arg1, boolean arg2, int arg3) {
        field2835++;
        class86 var4 = new class86(arg0);
        boolean var5 = arg2;
        int var6 = -1;
        label68: while (true) {
            int var7 = var4.method636((byte) 109);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var14;
                class94 var16;
                do {
                    int var12;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var4.method636((byte) 109);
                                        if (var17 == 0) {
                                            continue label68;
                                        }
                                        var4.method646(-15447);
                                    }
                                    int var10 = var4.method636((byte) 109);
                                    if (var10 == 0) {
                                        continue label68;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    var12 = arg1 + var11;
                                    int var13 = var8 & 0x3F;
                                    var14 = var4.method646(-15447) >> 2;
                                    var15 = arg3 + var13;
                                } while (var12 <= 0);
                            } while (var15 <= 0);
                        } while (var12 >= 103);
                    } while (var15 >= 103);
                    var16 = class147.method1185(-2, var6);
                } while (var14 == 22 && class110.field2487 && var16.field2203 == 0 && var16.field2196 != 1 && !var16.field2180);
                var9 = true;
                if (!var16.method736(-8118)) {
                    class49.field876++;
                    var5 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
    public static void method956(int arg0) {
        field2839 = null;
        field2830 = null;
        if (arg0 != -1) {
            field2844 = null;
        }
        field2833 = null;
        field2821 = null;
        field2820 = null;
        field2817 = null;
        field2828 = null;
        field2844 = null;
        field2843 = null;
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(I)Z")
    public final boolean method957(int arg0) {
        field2829++;
        if (this.field2819 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2819.length; var3++) {
            if (!class30.field587.method1034(this.field2819[var3], 0, arg0 - 193)) {
                var2 = false;
            }
        }
        if (arg0 != 192) {
            method954(27);
        }
        return var2;
    }
}
