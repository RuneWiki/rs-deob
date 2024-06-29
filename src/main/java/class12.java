import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class12 {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
    public static int[] field384 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Leh;")
    public static class53 field391 = new class53(30);

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Lkh;")
    public static class117 field397 = class224.method1450((byte) -76, "Hidden)2");

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Lkh;")
    public static class117 field396 = class224.method1450((byte) 109, ":assist:");

    @OriginalMember(owner = "client!b", name = "q", descriptor = "[I")
    public static int[] field398 = new int[128];

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lkh;")
    private static class117 field395 = class224.method1450((byte) -66, "glow3:");

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Lkh;")
    public static class117 field401 = field395;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Lkh;")
    public static class117 field399 = field395;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "J")
    public long field389;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Lb;")
    public class12 field382;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lb;")
    public class12 field393;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Lqh;")
    public static class183 field385;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        if (arg0 != -24) {
            field391 = null;
        }
        field383++;
        return this.field393 != null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)[Lch;")
    public static final class31[] method119(int arg0) {
        if (arg0 != 23757) {
            field397 = null;
        }
        field386++;
        class31[] var1 = new class31[class203.field3668];
        for (int var2 = 0; var2 < class203.field3668; var2++) {
            int var3 = class204.field3690[var2] * class11.field376[var2];
            byte[] var4 = class105.field1921[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class122.field2287[class209.method1370(var4[var6], 255)];
            }
            var1[var2] = new class144(class106.field1934, class199.field3582, class100.field1827[var2], class106.field1927[var2], class204.field3690[var2], class11.field376[var2], var5);
        }
        class45.method376(arg0 ^ 0x4A16);
        return var1;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static void method120(byte arg0) {
        field384 = null;
        field396 = null;
        field391 = null;
        field398 = null;
        field397 = null;
        field385 = null;
        if (arg0 <= 2) {
            method121(62, true, (byte) 24, true, true);
        }
        field395 = null;
        field399 = null;
        field401 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZBZZ)Lvb;")
    public static final class232 method121(int arg0, boolean arg1, byte arg2, boolean arg3, boolean arg4) {
        field392++;
        if (arg2 < 115) {
            return null;
        }
        class203 var5 = null;
        if (class127.field2355 != null) {
            var5 = new class203(arg0, class127.field2355, class17.field500[arg0], 1000000);
        }
        return new class232(var5, class7.field107, arg0, arg4, arg3, arg1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBIIIIII[Lah;)V")
    public static final void method122(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class9[] arg8) {
        field394++;
        if (arg1 != 19) {
            method119(112);
        }
        for (int var9 = 0; var9 < arg8.length; var9++) {
            class9 var10 = arg8[var9];
            if (var10 != null && (!var10.field249 || var10.field225 == 0 || var10.field273 || class187.method1269(var10, (byte) 16) != 0 || class93.field1700 == var10 || var10.field244 == 1338) && var10.field175 == arg4 && (!var10.field249 || !class148.method1060(var10, (byte) 48))) {
                int var11 = var10.field283 + arg5;
                int var12 = var10.field227 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field225 == 2) {
                    var13 = arg3;
                    var14 = arg2;
                    var15 = arg6;
                    var16 = arg0;
                } else {
                    var15 = var12 > arg6 ? var12 : arg6;
                    var14 = arg2 >= var11 ? arg2 : var11;
                    int var17 = var12 + var10.field207;
                    int var18 = var11 + var10.field256;
                    if (var10.field225 == 9) {
                        var18++;
                        var17++;
                    }
                    var16 = var17 >= arg0 ? arg0 : var17;
                    var13 = arg3 <= var18 ? arg3 : var18;
                }
                if (class67.field1290 == var10) {
                    class133.field2404 = true;
                    class166.field3003 = var12;
                    class240.field4360 = var11;
                }
                if (!var10.field249 || var13 > var14 && var15 < var16) {
                    if (var10.field225 == 0) {
                        if (!var10.field249 && class148.method1060(var10, (byte) 18) && class196.field3500 != var10) {
                            continue;
                        }
                        if (var10.field281 && var14 <= class137.field2479 && class199.field3571 >= var15 && var13 > class137.field2479 && var16 > class199.field3571) {
                            for (class51 var19 = (class51) class232.field4181.method314((byte) -26); var19 != null; var19 = (class51) class232.field4181.method320(arg1 ^ 0x13)) {
                                if (var19.field1056) {
                                    var19.method123((byte) -126);
                                }
                            }
                            for (class51 var20 = (class51) class196.field3514.method314((byte) -26); var20 != null; var20 = (class51) class196.field3514.method320(0)) {
                                if (var20.field1056) {
                                    var20.method123((byte) -126);
                                }
                            }
                            class109.field2061 = false;
                            if (class61.field1227 == 0) {
                                class93.field1700 = null;
                                class67.field1290 = null;
                            }
                        }
                    }
                    if (var10.field249) {
                        boolean var21;
                        if (class137.field2479 >= var14 && var15 <= class199.field3571 && var13 > class137.field2479 && class199.field3571 < var16) {
                            var21 = true;
                        } else {
                            var21 = false;
                        }
                        boolean var22 = false;
                        boolean var23 = false;
                        if (class215.field3907 == 1 && class187.field3353 >= var14 && class41.field929 >= var15 && var13 > class187.field3353 && class41.field929 < var16) {
                            var23 = true;
                        }
                        if (class30.field719 == 1 && var21) {
                            var22 = true;
                        }
                        if (class119.field2243 > 0 && var10.field289 != null) {
                            for (int var24 = 0; var24 < var10.field289.length; var24++) {
                                for (int var25 = 0; var25 < class119.field2243; var25++) {
                                    int var26 = var10.field289[var24] & 0xFF;
                                    if (class66.field1269[var25] == var26) {
                                        class156.method1109(var10.field218, -1, arg1 + 64, class169.field3042, var24 + 1);
                                    }
                                }
                            }
                        }
                        if (var23) {
                            class198.method1314(var10, class41.field929 - var12, -var11 + class187.field3353, -123);
                        }
                        if (class67.field1290 != null && class67.field1290 != var10 && var21 && class204.method1355(class187.method1269(var10, (byte) 16), false)) {
                            class51.field1045 = var10;
                        }
                        if (class93.field1700 == var10) {
                            class92.field1695 = var12;
                            class143.field2599 = true;
                            class213.field3874 = var11;
                        }
                        if (var10.field273 || var10.field244 != 0) {
                            if (var21 && class195.field3485 != 0 && var10.field199 != null) {
                                class51 var27 = new class51();
                                var27.field1046 = var10;
                                var27.field1048 = var10.field199;
                                var27.field1055 = class195.field3485;
                                var27.field1056 = true;
                                class232.field4181.method325(122, var27);
                            }
                            if (class67.field1290 != null || class19.field537 != null || class182.field3289 || var10.field244 != 1400 && class109.field2061) {
                                var23 = false;
                                var21 = false;
                                var22 = false;
                            }
                            if (var10.field244 == 1337) {
                                class62.method457(var10, arg1 ^ 0x13);
                                continue;
                            }
                            if (var10.field244 == 1338) {
                                if (var23) {
                                    class147.method1058(class187.field3353 - var11, 256, class41.field929 - var12, var10);
                                }
                                continue;
                            }
                            if (var10.field244 == 1400) {
                                class166.field2994 = var10;
                                if (var23) {
                                    if (class53.field1090[82] && class172.field3106 > 0) {
                                        int var28 = (int) ((double) (class187.field3353 - var10.field256 / 2 - var11) * 2.0D / class90.field1672) + class156.field2838 + class80.field1501;
                                        int var29 = class173.field3116 + class33.field773 - class1.field12 - (int) ((double) (class41.field929 - (var12 - -(var10.field207 / 2))) * 2.0D / class90.field1672);
                                        class117 var30 = class36.method316((byte) -34, new class117[] { class181.field3274, class42.method358(var28 >> 6, (byte) 34), class227.field4086, class42.method358(var29 >> 6, (byte) 34), class227.field4086, class42.method358(var28 & 0x3F, (byte) 34), class227.field4086, class42.method358(var29 & 0x3F, (byte) 34) });
                                        var30.method826((byte) -99);
                                        class86.method600(var30, -3);
                                        class90.method631(-1);
                                        continue;
                                    }
                                    class32.field757 = class137.field2479;
                                    class109.field2061 = true;
                                    class217.field3956 = class156.field2838;
                                    class207.field3710 = class199.field3571;
                                    class240.field4353 = class1.field12;
                                    continue;
                                }
                                if (var22 && class109.field2061) {
                                    class149.method1065((byte) -122, (int) ((double) (class32.field757 - class137.field2479) * 2.0D / class9.field152) + class217.field3956);
                                    class9.method74((int) ((double) (class207.field3710 - class199.field3571) * 2.0D / class9.field152) + class240.field4353, false);
                                    continue;
                                }
                                class109.field2061 = false;
                                continue;
                            }
                            if (var10.field244 == 1401) {
                                if (var22) {
                                    class211.method1380((byte) 102, var10.field207, class137.field2479 - var11, class199.field3571 - var12, var10.field256);
                                }
                                continue;
                            }
                            if (!var10.field272 && var23) {
                                var10.field272 = true;
                                if (var10.field287 != null) {
                                    class51 var31 = new class51();
                                    var31.field1048 = var10.field287;
                                    var31.field1055 = class41.field929 - var12;
                                    var31.field1056 = true;
                                    var31.field1051 = class187.field3353 - var11;
                                    var31.field1046 = var10;
                                    class232.field4181.method325(125, var31);
                                }
                            }
                            if (var10.field272 && var22 && var10.field201 != null) {
                                class51 var32 = new class51();
                                var32.field1048 = var10.field201;
                                var32.field1046 = var10;
                                var32.field1051 = class137.field2479 - var11;
                                var32.field1055 = class199.field3571 - var12;
                                var32.field1056 = true;
                                class232.field4181.method325(118, var32);
                            }
                            if (var10.field272 && !var22) {
                                var10.field272 = false;
                                if (var10.field267 != null) {
                                    class51 var33 = new class51();
                                    var33.field1056 = true;
                                    var33.field1055 = class199.field3571 - var12;
                                    var33.field1046 = var10;
                                    var33.field1048 = var10.field267;
                                    var33.field1051 = class137.field2479 - var11;
                                    class196.field3514.method325(119, var33);
                                }
                            }
                            if (var22 && var10.field155 != null) {
                                class51 var34 = new class51();
                                var34.field1048 = var10.field155;
                                var34.field1051 = class137.field2479 - var11;
                                var34.field1056 = true;
                                var34.field1055 = class199.field3571 - var12;
                                var34.field1046 = var10;
                                class232.field4181.method325(arg1 + 92, var34);
                            }
                            if (!var10.field211 && var21) {
                                var10.field211 = true;
                                if (var10.field148 != null) {
                                    class51 var35 = new class51();
                                    var35.field1056 = true;
                                    var35.field1048 = var10.field148;
                                    var35.field1051 = class137.field2479 - var11;
                                    var35.field1046 = var10;
                                    var35.field1055 = class199.field3571 - var12;
                                    class232.field4181.method325(arg1 + 99, var35);
                                }
                            }
                            if (var10.field211 && var21 && var10.field263 != null) {
                                class51 var36 = new class51();
                                var36.field1046 = var10;
                                var36.field1051 = class137.field2479 - var11;
                                var36.field1056 = true;
                                var36.field1055 = class199.field3571 - var12;
                                var36.field1048 = var10.field263;
                                class232.field4181.method325(109, var36);
                            }
                            if (var10.field211 && !var21) {
                                var10.field211 = false;
                                if (var10.field246 != null) {
                                    class51 var37 = new class51();
                                    var37.field1056 = true;
                                    var37.field1048 = var10.field246;
                                    var37.field1051 = class137.field2479 - var11;
                                    var37.field1046 = var10;
                                    var37.field1055 = class199.field3571 - var12;
                                    class196.field3514.method325(arg1 ^ 0x7E, var37);
                                }
                            }
                            if (var10.field253 != null) {
                                class51 var38 = new class51();
                                var38.field1046 = var10;
                                var38.field1048 = var10.field253;
                                class39.field886.method325(126, var38);
                            }
                            if (var10.field184 != null && class185.field3323 > var10.field205) {
                                if (var10.field190 == null || class185.field3323 - var10.field205 > 32) {
                                    class51 var43 = new class51();
                                    var43.field1048 = var10.field184;
                                    var43.field1046 = var10;
                                    class232.field4181.method325(117, var43);
                                } else {
                                    label446: for (int var39 = var10.field205; var39 < class185.field3323; var39++) {
                                        int var40 = class54.field1112[var39 & 0x1F];
                                        for (int var41 = 0; var41 < var10.field190.length; var41++) {
                                            if (var10.field190[var41] == var40) {
                                                class51 var42 = new class51();
                                                var42.field1046 = var10;
                                                var42.field1048 = var10.field184;
                                                class232.field4181.method325(123, var42);
                                                break label446;
                                            }
                                        }
                                    }
                                }
                                var10.field205 = class185.field3323;
                            }
                            if (var10.field156 != null && class20.field555 > var10.field171) {
                                if (var10.field278 == null || class20.field555 - var10.field171 > 32) {
                                    class51 var48 = new class51();
                                    var48.field1048 = var10.field156;
                                    var48.field1046 = var10;
                                    class232.field4181.method325(113, var48);
                                } else {
                                    label422: for (int var44 = var10.field171; var44 < class20.field555; var44++) {
                                        int var45 = class172.field3113[var44 & 0x1F];
                                        for (int var46 = 0; var46 < var10.field278.length; var46++) {
                                            if (var10.field278[var46] == var45) {
                                                class51 var47 = new class51();
                                                var47.field1048 = var10.field156;
                                                var47.field1046 = var10;
                                                class232.field4181.method325(arg1 ^ 0x63, var47);
                                                break label422;
                                            }
                                        }
                                    }
                                }
                                var10.field171 = class20.field555;
                            }
                            if (var10.field250 != null && class40.field916 > var10.field187) {
                                if (var10.field221 == null || class40.field916 - var10.field187 > 32) {
                                    class51 var53 = new class51();
                                    var53.field1046 = var10;
                                    var53.field1048 = var10.field250;
                                    class232.field4181.method325(112, var53);
                                } else {
                                    label398: for (int var49 = var10.field187; var49 < class40.field916; var49++) {
                                        int var50 = class195.field3489[var49 & 0x1F];
                                        for (int var51 = 0; var51 < var10.field221.length; var51++) {
                                            if (var10.field221[var51] == var50) {
                                                class51 var52 = new class51();
                                                var52.field1046 = var10;
                                                var52.field1048 = var10.field250;
                                                class232.field4181.method325(121, var52);
                                                break label398;
                                            }
                                        }
                                    }
                                }
                                var10.field187 = class40.field916;
                            }
                            if (var10.field197 < class228.field4111 && var10.field182 != null) {
                                class51 var54 = new class51();
                                var54.field1046 = var10;
                                var54.field1048 = var10.field182;
                                class232.field4181.method325(arg1 + 95, var54);
                            }
                            if (class204.field3688 > var10.field197 && var10.field198 != null) {
                                class51 var55 = new class51();
                                var55.field1048 = var10.field198;
                                var55.field1046 = var10;
                                class232.field4181.method325(110, var55);
                            }
                            if (var10.field197 < class117.field2172 && var10.field232 != null) {
                                class51 var56 = new class51();
                                var56.field1046 = var10;
                                var56.field1048 = var10.field232;
                                class232.field4181.method325(arg1 + 108, var56);
                            }
                            if (var10.field197 < class128.field2375 && var10.field279 != null) {
                                class51 var57 = new class51();
                                var57.field1048 = var10.field279;
                                var57.field1046 = var10;
                                class232.field4181.method325(111, var57);
                            }
                            if (class50.field1038 > var10.field197 && var10.field296 != null) {
                                class51 var58 = new class51();
                                var58.field1046 = var10;
                                var58.field1048 = var10.field296;
                                class232.field4181.method325(122, var58);
                            }
                            var10.field197 = class194.field3470;
                            if (var10.field160 != null) {
                                for (int var59 = 0; var59 < class119.field2243; var59++) {
                                    class51 var60 = new class51();
                                    var60.field1046 = var10;
                                    var60.field1054 = class66.field1269[var59];
                                    var60.field1050 = class239.field4329[var59];
                                    var60.field1048 = var10.field160;
                                    class232.field4181.method325(109, var60);
                                }
                            }
                        }
                    }
                    if (!var10.field249 && class67.field1290 == null && class19.field537 == null && !class182.field3289) {
                        if ((var10.field236 >= 0 || var10.field254 != 0) && class137.field2479 >= var14 && var15 <= class199.field3571 && var13 > class137.field2479 && class199.field3571 < var16) {
                            if (var10.field236 < 0) {
                                class196.field3500 = var10;
                            } else {
                                class196.field3500 = arg8[var10.field236];
                            }
                        }
                        if (var10.field225 == 8 && var14 <= class137.field2479 && class199.field3571 >= var15 && class137.field2479 < var13 && var16 > class199.field3571) {
                            class28.field685 = var10;
                        }
                        if (var10.field294 > var10.field207) {
                            class124.method860(class199.field3571, var10.field294, var10, var12, class137.field2479, var10.field256 + var11, var10.field207, false);
                        }
                    }
                    if (var10.field225 == 0) {
                        method122(var16, (byte) 19, var14, var13, var10.field218, var11 - var10.field255, var15, var12 - var10.field247, arg8);
                        if (var10.field157 != null) {
                            method122(var16, (byte) 19, var14, var13, var10.field218, var11 - var10.field255, var15, var12 - var10.field247, var10.field157);
                        }
                        class73 var61 = (class73) class11.field371.method460((long) var10.field218, 1);
                        if (var61 != null) {
                            class86.method601(var14, var12, var15, var13, var61.field1397, var11, 41, var16);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
    public final void method123(byte arg0) {
        if (arg0 != -126) {
            field398 = null;
        }
        field388++;
        if (this.field393 != null) {
            this.field393.field382 = this.field382;
            this.field382.field393 = this.field393;
            this.field393 = null;
            this.field382 = null;
        }
    }
}
