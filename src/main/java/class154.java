import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class154 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field3529 = 0;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[[[B")
    public static byte[][][] field3527;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1156(int arg0) {
        field3527 = null;
        if (arg0 >= -26) {
            method1158((byte) -94, 60);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Z")
    public static final boolean method1157(int arg0, int arg1, int arg2) {
        if (arg1 != -17744) {
            field3529 = 0;
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        field3528++;
        class69 var3 = class124.method928(-1, arg2);
        return var3.method488(90, arg0);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
    public static final void method1158(byte arg0, int arg1) {
        field3530++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class42.field947[arg1];
        int var3 = class31.field648[arg1];
        int var4 = class115.field2671[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class40.field912[arg1];
        if (var4 == 41) {
            class67 var6 = class125.field2902[var5];
            if (var6 != null) {
                class81.method617(0, 0, var6.field788[0], 1, 0, 1, false, var6.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class141.field3221 = 2;
                class13.field205 = class90.field2150;
                class72.field1688 = 0;
                class72.field1687 = class25.field401;
                class82.field1990.method265((byte) -85, 119);
                class101.field2452++;
                class82.field1990.method757((byte) 125, var5);
            }
        }
        if (var4 == 24) {
            class68.field1547++;
            boolean var7 = class81.method617(0, 0, var2, 1, 0, 0, false, var3, 0, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            if (!var7) {
                class81.method617(0, 0, var2, 1, 0, 1, false, var3, 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            }
            class72.field1687 = class25.field401;
            class72.field1688 = 0;
            class13.field205 = class90.field2150;
            class141.field3221 = 2;
            class82.field1990.method265((byte) -85, 234);
            class82.field1990.method756(var3 + class76.field1814, false);
            class82.field1990.method766(class63.field1429 + var2, (byte) 118);
            class82.field1990.method757((byte) 125, var5);
        }
        if (var4 == 20) {
            class82.field1990.method265((byte) -85, 232);
            class159.field3648++;
            class82.field1990.method788(var3, -730641264);
            class26 var9 = class64.method466(-1922515024, var3);
            if (var9.field531 != null && var9.field531[0][0] == 5) {
                int var10 = var9.field531[0][1];
                if (class148.field3454[var10] != var9.field448[0]) {
                    class148.field3454[var10] = var9.field448[0];
                    class118.method905(var10, -4);
                }
            }
        }
        if (var4 == 35) {
            class38 var11 = class34.field735[var5];
            if (var11 != null) {
                class33.field686++;
                class81.method617(0, 0, var11.field788[0], 1, 0, 1, false, var11.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class141.field3221 = 2;
                class13.field205 = class90.field2150;
                class72.field1688 = 0;
                class72.field1687 = class25.field401;
                class82.field1990.method265((byte) -85, 217);
                class82.field1990.method794(-1811428344, var5);
            }
        }
        if (var4 == 47) {
            class82.field1990.method265((byte) -85, 53);
            class82.field1990.method766(var2, (byte) 121);
            class82.field1990.method794(-1811428344, var5);
            class82.field1990.method781(var3, false);
            class8.field151++;
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 26) {
            class44.field998++;
            class82.field1990.method265((byte) -85, 252);
            class82.field1990.method773(0, var3);
            class82.field1990.method766(var2, (byte) 116);
            class82.field1990.method766(var5, (byte) 113);
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 5) {
            class38 var12 = class34.field735[var5];
            if (var12 != null) {
                class89.field2120++;
                class81.method617(0, 0, var12.field788[0], 1, 0, 1, false, var12.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class72.field1687 = class25.field401;
                class72.field1688 = 0;
                class141.field3221 = 2;
                class13.field205 = class90.field2150;
                class82.field1990.method265((byte) -85, 137);
                class82.field1990.method794(-1811428344, var5);
            }
        }
        if (var4 == 4) {
            class76.field1818++;
            class24.method150(var2, var5, -17368, var3);
            class82.field1990.method265((byte) -85, 41);
            class82.field1990.method756(class76.field1814 + var3, false);
            class82.field1990.method766(class63.field1429 + var2, (byte) 117);
            class82.field1990.method756(var5 >> 14 & 0x7FFF, false);
        }
        if (var4 == 44) {
            class159.field3648++;
            class82.field1990.method265((byte) -85, 232);
            class82.field1990.method788(var3, -730641264);
            class26 var13 = class64.method466(-1922515024, var3);
            if (var13.field531 != null && var13.field531[0][0] == 5) {
                int var14 = var13.field531[0][1];
                class148.field3454[var14] = 1 - class148.field3454[var14];
                class118.method905(var14, -4);
            }
        }
        if (var4 == 1003) {
            class72.field1687 = class25.field401;
            class13.field205 = class90.field2150;
            class72.field1688 = 0;
            class141.field3221 = 2;
            class38 var15 = class34.field735[var5];
            if (var15 != null) {
                class79 var16 = var15.field849;
                if (var16.field1935 != null) {
                    var16 = var16.method603(false);
                }
                if (var16 != null) {
                    class92.field2201++;
                    class82.field1990.method265((byte) -85, 247);
                    class82.field1990.method766(var16.field1927, (byte) 117);
                }
            }
        }
        if (var4 == 34) {
            class67 var17 = class125.field2902[var5];
            if (var17 != null) {
                class8.field162++;
                class81.method617(0, 0, var17.field788[0], 1, 0, 1, false, var17.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class72.field1688 = 0;
                class141.field3221 = 2;
                class72.field1687 = class25.field401;
                class13.field205 = class90.field2150;
                class82.field1990.method265((byte) -85, 245);
                class82.field1990.method794(-1811428344, class12.field189);
                class82.field1990.method794(-1811428344, var5);
                class82.field1990.method794(-1811428344, class68.field1553);
                class82.field1990.method777((byte) -47, class155.field3544);
            }
        }
        if (var4 == 14) {
            class67 var18 = class125.field2902[var5];
            if (var18 != null) {
                class81.method617(0, 0, var18.field788[0], 1, 0, 1, false, var18.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class72.field1687 = class25.field401;
                class12.field184++;
                class13.field205 = class90.field2150;
                class141.field3221 = 2;
                class72.field1688 = 0;
                class82.field1990.method265((byte) -85, 43);
                class82.field1990.method794(-1811428344, var5);
            }
        }
        if (var4 == 7) {
            class82.field1990.method265((byte) -85, 62);
            class110.field2600++;
            class82.field1990.method794(-1811428344, var2);
            class82.field1990.method773(0, var3);
            class82.field1990.method756(var5, false);
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 3) {
            class67 var19 = class125.field2902[var5];
            if (var19 != null) {
                class81.method617(0, 0, var19.field788[0], 1, 0, 1, false, var19.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class82.field1987++;
                class13.field205 = class90.field2150;
                class72.field1688 = 0;
                class141.field3221 = 2;
                class72.field1687 = class25.field401;
                class82.field1990.method265((byte) -85, 236);
                class82.field1990.method756(var5, false);
            }
        }
        if (var4 == 40) {
            class38 var20 = class34.field735[var5];
            if (var20 != null) {
                class31.field649++;
                class81.method617(0, 0, var20.field788[0], 1, 0, 1, false, var20.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class13.field205 = class90.field2150;
                class72.field1688 = 0;
                class141.field3221 = 2;
                class72.field1687 = class25.field401;
                class82.field1990.method265((byte) -85, 196);
                class82.field1990.method756(var5, false);
            }
        }
        if (var4 == 36) {
            class67 var21 = class125.field2902[var5];
            if (var21 != null) {
                class81.method617(0, 0, var21.field788[0], 1, 0, 1, false, var21.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class72.field1687 = class25.field401;
                class141.field3221 = 2;
                class134.field3043++;
                class13.field205 = class90.field2150;
                class72.field1688 = 0;
                class82.field1990.method265((byte) -85, 172);
                class82.field1990.method766(var5, (byte) 124);
            }
        }
        if (var4 == 38) {
            class101.field2442++;
            class24.method150(var2, var5, -17368, var3);
            class82.field1990.method265((byte) -85, 76);
            class82.field1990.method757((byte) 126, var5 >> 14 & 0x7FFF);
            class82.field1990.method766(class76.field1814 + var3, (byte) 115);
            class82.field1990.method757((byte) 127, class63.field1429 + var2);
        }
        if (var4 == 23) {
            class67 var22 = class125.field2902[var5];
            if (var22 != null) {
                class127.field2932++;
                class81.method617(0, 0, var22.field788[0], 1, 0, 1, false, var22.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class141.field3221 = 2;
                class72.field1687 = class25.field401;
                class13.field205 = class90.field2150;
                class72.field1688 = 0;
                class82.field1990.method265((byte) -85, 100);
                class82.field1990.method766(var5, (byte) 120);
                class82.field1990.method757((byte) 126, class110.field2611);
                class82.field1990.method781(class107.field2565, false);
            }
        }
        if (var4 == 18) {
            class76.field1817++;
            boolean var23 = class81.method617(0, 0, var2, 1, 0, 0, false, var3, 0, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            if (!var23) {
                class81.method617(0, 0, var2, 1, 0, 1, false, var3, 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            }
            class72.field1688 = 0;
            class72.field1687 = class25.field401;
            class13.field205 = class90.field2150;
            class141.field3221 = 2;
            class82.field1990.method265((byte) -85, 98);
            class82.field1990.method766(class63.field1429 + var2, (byte) 120);
            class82.field1990.method766(var5, (byte) 126);
            class82.field1990.method794(-1811428344, class76.field1814 + var3);
        }
        if (var4 == 51) {
            class9.field169++;
            class82.field1990.method265((byte) -85, 181);
            class82.field1990.method794(-1811428344, var5);
            class82.field1990.method757((byte) 125, var2);
            class82.field1990.method781(var3, false);
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 42 && class24.method150(var2, var5, -17368, var3)) {
            class15.field237++;
            class82.field1990.method265((byte) -85, 163);
            class82.field1990.method757((byte) 127, class63.field1429 + var2);
            class82.field1990.method794(-1811428344, class110.field2611);
            class82.field1990.method766(var5 >> 14 & 0x7FFF, (byte) 121);
            class82.field1990.method788(class107.field2565, -730641264);
            class82.field1990.method757((byte) 125, var3 + class76.field1814);
        }
        if (var4 == 9) {
            class66.field1496.method1188(class148.field3428, var2, var3);
        }
        if (var4 == 1001) {
            class24.method150(var2, var5, -17368, var3);
            class82.field1990.method265((byte) -85, 148);
            class146.field3383++;
            class82.field1990.method757((byte) 125, class63.field1429 + var2);
            class82.field1990.method756(var5 >> 14 & 0x7FFF, false);
            class82.field1990.method757((byte) 125, class76.field1814 + var3);
        }
        if (var4 == 29) {
            class67 var25 = class125.field2902[var5];
            if (var25 != null) {
                class92.field2210++;
                class81.method617(0, 0, var25.field788[0], 1, 0, 1, false, var25.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class72.field1688 = 0;
                class72.field1687 = class25.field401;
                class141.field3221 = 2;
                class13.field205 = class90.field2150;
                class82.field1990.method265((byte) -85, 51);
                class82.field1990.method756(var5, false);
            }
        }
        if (var4 == 39) {
            class77.field1849++;
            boolean var26 = class81.method617(0, 0, var2, 1, 0, 0, false, var3, 0, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            if (!var26) {
                class81.method617(0, 0, var2, 1, 0, 1, false, var3, 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            }
            class72.field1687 = class25.field401;
            class72.field1688 = 0;
            class13.field205 = class90.field2150;
            class141.field3221 = 2;
            class82.field1990.method265((byte) -85, 173);
            class82.field1990.method766(class68.field1553, (byte) 114);
            class82.field1990.method766(class76.field1814 + var3, (byte) 124);
            class82.field1990.method794(-1811428344, var5);
            class82.field1990.method756(var2 + class63.field1429, false);
            class82.field1990.method773(0, class155.field3544);
            class82.field1990.method756(class12.field189, false);
        }
        if (var4 == 1006) {
            class141.field3221 = 2;
            class142.field3242++;
            class72.field1688 = 0;
            class13.field205 = class90.field2150;
            class72.field1687 = class25.field401;
            class82.field1990.method265((byte) -85, 183);
            class82.field1990.method766(var5 >> 14 & 0x7FFF, (byte) 118);
        }
        if (var4 == 43) {
            class82.field1991++;
            class82.field1990.method265((byte) -85, 64);
            class82.field1990.method781(var3, false);
            class82.field1990.method757((byte) 124, var5);
            class82.field1990.method794(-1811428344, var2);
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 25) {
            class58.field1303++;
            class82.field1990.method265((byte) -85, 94);
            class82.field1990.method757((byte) 126, var5);
            class82.field1990.method781(var3, false);
            class82.field1990.method794(-1811428344, var2);
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 49) {
            class83.field2023++;
            boolean var28 = class81.method617(0, 0, var2, 1, 0, 0, false, var3, 0, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            if (!var28) {
                class81.method617(0, 0, var2, 1, 0, 1, false, var3, 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            }
            class72.field1688 = 0;
            class72.field1687 = class25.field401;
            class141.field3221 = 2;
            class13.field205 = class90.field2150;
            class82.field1990.method265((byte) -85, 165);
            class82.field1990.method794(-1811428344, class63.field1429 + var2);
            class82.field1990.method756(var5, false);
            class82.field1990.method757((byte) 126, var3 + class76.field1814);
        }
        if (var4 == 8) {
            class24.method150(var2, var5, -17368, var3);
            class118.field2756++;
            class82.field1990.method265((byte) -85, 95);
            class82.field1990.method766(class63.field1429 + var2, (byte) 117);
            class82.field1990.method766(var5 >> 14 & 0x7FFF, (byte) 117);
            class82.field1990.method756(class76.field1814 + var3, false);
        }
        if (var4 == 6) {
            class26 var30 = class64.method466(-1922515024, var3);
            boolean var31 = true;
            if (var30.field442 > 0) {
                var31 = class94.method737(var30, -19443);
            }
            if (var31) {
                class159.field3648++;
                class82.field1990.method265((byte) -85, 232);
                class82.field1990.method788(var3, -730641264);
            }
        }
        if (var4 == 1) {
            class38 var32 = class34.field735[var5];
            if (var32 != null) {
                class22.field360++;
                class81.method617(0, 0, var32.field788[0], 1, 0, 1, false, var32.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class141.field3221 = 2;
                class72.field1687 = class25.field401;
                class72.field1688 = 0;
                class13.field205 = class90.field2150;
                class82.field1990.method265((byte) -85, 13);
                class82.field1990.method766(var5, (byte) 125);
                class82.field1990.method788(class107.field2565, -730641264);
                class82.field1990.method757((byte) 125, class110.field2611);
            }
        }
        if (var4 == 45) {
            class127.field2937++;
            boolean var33 = class81.method617(0, 0, var2, 1, 0, 0, false, var3, 0, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            if (!var33) {
                class81.method617(0, 0, var2, 1, 0, 1, false, var3, 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            }
            class72.field1688 = 0;
            class72.field1687 = class25.field401;
            class141.field3221 = 2;
            class13.field205 = class90.field2150;
            class82.field1990.method265((byte) -85, 222);
            class82.field1990.method766(var5, (byte) 126);
            class82.field1990.method781(class107.field2565, false);
            class82.field1990.method757((byte) 124, var2 + class63.field1429);
            class82.field1990.method794(-1811428344, class76.field1814 + var3);
            class82.field1990.method757((byte) 124, class110.field2611);
        }
        if (var4 == 33) {
            class134.method1006(216);
            class26 var35 = class64.method466(-1922515024, var3);
            class12.field189 = var2;
            class155.field3544 = var3;
            class47.field1087 = 1;
            class68.field1553 = var5;
            class75.method567((byte) 126, var35);
            class59.field1359 = class71.method509(new class146[] { class66.field1486, class73.method524((byte) 65, var5).field1338, class97.field2355 }, (byte) 119);
            if (class59.field1359 == null) {
                class59.field1359 = class127.field2930;
            }
            return;
        }
        if (var4 == 28) {
            class82.field1990.method265((byte) -85, 186);
            class44.field997++;
            class82.field1990.method766(var5, (byte) 121);
            class82.field1990.method781(var3, false);
            class82.field1990.method757((byte) 127, var2);
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 13 || var4 == 1004) {
            class92.method736(var2, var3, var5, -2625, class74.field1720[arg1]);
        }
        if (var4 == 32) {
            class67 var36 = class125.field2902[var5];
            if (var36 != null) {
                class81.method617(0, 0, var36.field788[0], 1, 0, 1, false, var36.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class13.field205 = class90.field2150;
                class141.field3221 = 2;
                class72.field1687 = class25.field401;
                class92.field2202++;
                class72.field1688 = 0;
                class82.field1990.method265((byte) -85, 124);
                class82.field1990.method756(var5, false);
            }
        }
        if (var4 == 15 && class24.method150(var2, var5, -17368, var3)) {
            class82.field1990.method265((byte) -85, 185);
            class82.field1990.method766(class76.field1814 + var3, (byte) 113);
            class82.field1990.method773(0, class155.field3544);
            class82.field1990.method794(-1811428344, var5 >> 14 & 0x7FFF);
            class2.field35++;
            class82.field1990.method757((byte) 124, class68.field1553);
            class82.field1990.method794(-1811428344, class63.field1429 + var2);
            class82.field1990.method794(-1811428344, class12.field189);
        }
        if (var4 == 48 && class77.field1874 == null) {
            class13.method82((byte) 104, var3, var2);
            class77.field1874 = class74.method551(var2, var3, -32540);
            class75.method567((byte) 112, class77.field1874);
        }
        if (var4 == 1007) {
            class72.field1688 = 0;
            class124.field2882++;
            class72.field1687 = class25.field401;
            class13.field205 = class90.field2150;
            class141.field3221 = 2;
            class82.field1990.method265((byte) -85, 93);
            class82.field1990.method756(var5, false);
        }
        if (var4 == 22) {
            class58.field1304++;
            boolean var37 = class81.method617(0, 0, var2, 1, 0, 0, false, var3, 0, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            if (!var37) {
                class81.method617(0, 0, var2, 1, 0, 1, false, var3, 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            }
            class13.field205 = class90.field2150;
            class72.field1688 = 0;
            class141.field3221 = 2;
            class72.field1687 = class25.field401;
            class82.field1990.method265((byte) -85, 49);
            class82.field1990.method756(class76.field1814 + var3, false);
            class82.field1990.method757((byte) 127, class63.field1429 + var2);
            class82.field1990.method766(var5, (byte) 122);
        }
        if (var4 == 50) {
            class82.field1992++;
            class82.field1990.method265((byte) -85, 105);
            class82.field1990.method766(var5, (byte) 126);
            class82.field1990.method766(class110.field2611, (byte) 115);
            class82.field1990.method756(var2, false);
            class82.field1990.method777((byte) -20, var3);
            class82.field1990.method777((byte) 118, class107.field2565);
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 2) {
            class26 var39 = class74.method551(var2, var3, -32540);
            if (var39 != null) {
                class134.method1006(216);
                class66.method471(var3, var2, 121, class146.method1118(class42.method281(var39, 1299495520), (byte) -115));
                class47.field1087 = 0;
                class122.field2850 = class52.method351(false, var39);
                if (class122.field2850 == null) {
                    class122.field2850 = class141.field3228;
                }
                if (!var39.field510) {
                    class140.field3206 = class71.method509(new class146[] { class60.field1381, var39.field572, class97.field2355 }, (byte) -92);
                    return;
                }
                class140.field3206 = class71.method509(new class146[] { var39.field524, class97.field2355 }, (byte) -125);
            }
            return;
        }
        if (var4 == 12) {
            class18.field289++;
            boolean var40 = class81.method617(0, 0, var2, 1, 0, 0, false, var3, 0, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            if (!var40) {
                class81.method617(0, 0, var2, 1, 0, 1, false, var3, 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
            }
            class72.field1688 = 0;
            class72.field1687 = class25.field401;
            class141.field3221 = 2;
            class13.field205 = class90.field2150;
            class82.field1990.method265((byte) -85, 34);
            class82.field1990.method757((byte) 124, class63.field1429 + var2);
            class82.field1990.method757((byte) 125, var5);
            class82.field1990.method757((byte) 126, class76.field1814 + var3);
        }
        if (var4 == 1005) {
            class26 var42 = class64.method466(-1922515024, var3);
            if (var42 == null || var42.field440[var2] < 100000) {
                class124.field2882++;
                class82.field1990.method265((byte) -85, 93);
                class82.field1990.method756(var5, false);
            } else {
                class26.method174(0, class158.field3633, (byte) -76, class71.method509(new class146[] { class75.method564(false, var42.field440[var2]), class148.field3439, class73.method524((byte) 109, var5).field1338 }, (byte) -75));
            }
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 19) {
            class74.method550(true);
        }
        if (var4 == 10) {
            class120.field2800++;
            class82.field1990.method265((byte) -85, 79);
            class82.field1990.method757((byte) 127, class110.field2611);
            class82.field1990.method788(class107.field2565, -730641264);
            class82.field1990.method777((byte) 116, var3);
            class82.field1990.method766(var2, (byte) 126);
        }
        int var43 = -52 / ((-arg0 - 15) / 34);
        if (var4 == 31) {
            class47.field1075++;
            class82.field1990.method265((byte) -85, 201);
            class82.field1990.method773(0, var3);
            class82.field1990.method794(-1811428344, var5);
            class82.field1990.method766(var2, (byte) 115);
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 57) {
            class82.field1990.method265((byte) -85, 254);
            class82.field1990.method757((byte) 127, var5);
            class82.field1990.method756(var2, false);
            class20.field310++;
            class82.field1990.method788(var3, -730641264);
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 21) {
            class38 var44 = class34.field735[var5];
            if (var44 != null) {
                class32.field680++;
                class81.method617(0, 0, var44.field788[0], 1, 0, 1, false, var44.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class13.field205 = class90.field2150;
                class72.field1688 = 0;
                class72.field1687 = class25.field401;
                class141.field3221 = 2;
                class82.field1990.method265((byte) -85, 54);
                class82.field1990.method757((byte) 125, var5);
            }
        }
        if (var4 == 58) {
            class82.field1990.method265((byte) -85, 96);
            class151.field3492++;
            class82.field1990.method794(-1811428344, var5);
            class82.field1990.method766(var2, (byte) 125);
            class82.field1990.method788(var3, -730641264);
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 46) {
            class73.field1701++;
            class82.field1990.method265((byte) -85, 190);
            class82.field1990.method756(class12.field189, false);
            class82.field1990.method777((byte) -110, class155.field3544);
            class82.field1990.method757((byte) 125, var5);
            class82.field1990.method766(var2, (byte) 113);
            class82.field1990.method773(0, var3);
            class82.field1990.method757((byte) 124, class68.field1553);
            class3.field83 = 0;
            class147.field3405 = class64.method466(-1922515024, var3);
            class125.field2896 = var2;
        }
        if (var4 == 30) {
            class136.field3098++;
            class24.method150(var2, var5, -17368, var3);
            class82.field1990.method265((byte) -85, 66);
            class82.field1990.method757((byte) 127, var2 + class63.field1429);
            class82.field1990.method794(-1811428344, var5 >> 14 & 0x7FFF);
            class82.field1990.method756(var3 + class76.field1814, false);
        }
        if (var4 == 17) {
            class67 var45 = class125.field2902[var5];
            if (var45 != null) {
                class81.method617(0, 0, var45.field788[0], 1, 0, 1, false, var45.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class13.field205 = class90.field2150;
                class30.field620++;
                class72.field1687 = class25.field401;
                class141.field3221 = 2;
                class72.field1688 = 0;
                class82.field1990.method265((byte) -85, 184);
                class82.field1990.method757((byte) 124, var5);
            }
        }
        if (var4 == 11) {
            class67 var46 = class125.field2902[var5];
            if (var46 != null) {
                class38.field843++;
                class81.method617(0, 0, var46.field788[0], 1, 0, 1, false, var46.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class13.field205 = class90.field2150;
                class72.field1687 = class25.field401;
                class72.field1688 = 0;
                class141.field3221 = 2;
                class82.field1990.method265((byte) -85, 241);
                class82.field1990.method794(-1811428344, var5);
            }
        }
        if (var4 == 16) {
            class38 var47 = class34.field735[var5];
            if (var47 != null) {
                class24.field383++;
                class81.method617(0, 0, var47.field788[0], 1, 0, 1, false, var47.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class72.field1687 = class25.field401;
                class72.field1688 = 0;
                class13.field205 = class90.field2150;
                class141.field3221 = 2;
                class82.field1990.method265((byte) -85, 138);
                class82.field1990.method794(-1811428344, class12.field189);
                class82.field1990.method766(var5, (byte) 114);
                class82.field1990.method794(-1811428344, class68.field1553);
                class82.field1990.method788(class155.field3544, -730641264);
            }
        }
        if (var4 == 37) {
            class38 var48 = class34.field735[var5];
            if (var48 != null) {
                class71.field1638++;
                class81.method617(0, 0, var48.field788[0], 1, 0, 1, false, var48.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                class72.field1687 = class25.field401;
                class72.field1688 = 0;
                class141.field3221 = 2;
                class13.field205 = class90.field2150;
                class82.field1990.method265((byte) -85, 57);
                class82.field1990.method757((byte) 124, var5);
            }
        }
        if (class47.field1087 != 0) {
            class47.field1087 = 0;
            class75.method567((byte) 127, class64.method466(-1922515024, class155.field3544));
        }
        if (class22.field367) {
            class134.method1006(216);
        }
        if (class147.field3405 != null && class3.field83 == 0) {
            class75.method567((byte) 121, class147.field3405);
        }
    }
}
