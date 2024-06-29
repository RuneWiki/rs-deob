import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class111 extends class200 {

    @OriginalMember(owner = "client!g", name = "m", descriptor = "J")
    public static long field1771 = 0L;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lqe;")
    public static class168 field1770 = class66.method448("lila:", -109);

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Ll;")
    public static class101 field1768 = new class101(5000);

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field1774 = 0;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Lnh;")
    public static class112 field1777 = new class112(new byte[5000]);

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field1778 = 0;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Loe;")
    public static class256 field1775;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "[Lqg;")
    public static class217[] field1769;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lgg;B)V")
    public static final void method717(class222 arg0, byte arg1) {
        field1776++;
        if (arg1 != -16) {
            return;
        }
        for (class185 var2 = (class185) class185.field3252.method315(-31594); var2 != null; var2 = (class185) class185.field3252.method312(1012)) {
            if (var2.field3246 == arg0) {
                if (var2.field3266 != null) {
                    class86.field1341.method509(var2.field3266);
                    var2.field3266 = null;
                }
                var2.method1234(arg1 ^ 0xFFFFBCB0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static void method718(byte arg0) {
        field1769 = null;
        field1777 = null;
        field1768 = null;
        field1775 = null;
        field1770 = null;
        if (arg0 != 52) {
            field1768 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(JI)V")
    public static final void method719(long arg0, int arg1) {
        field1772++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 <= 15) {
            field1769 = null;
        }
        if (class173.field3024 >= 100) {
            class229.method1475(class222.field3816, class36.field453, -1, 0);
            return;
        }
        class168 var3 = class80.method532(arg0, (byte) 118).method1116(0);
        for (int var4 = 0; var4 < class173.field3024; var4++) {
            if (class150.field2626[var4] == arg0) {
                class229.method1475(class222.field3816, class50.method347(2, new class168[] { var3, class129.field2190 }), -1, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class103.field1662; var5++) {
            if (class56.field768[var5] == arg0) {
                class229.method1475(class222.field3816, class50.method347(2, new class168[] { class253.field4383, var3, class209.field3623 }), -1, 0);
                return;
            }
        }
        if (var3.method1111(92, class7.field85.field2000)) {
            class229.method1475(class222.field3816, class32.field383, -1, 0);
            return;
        }
        class174.field3057++;
        class150.field2626[class173.field3024] = arg0;
        class189.field3299[class173.field3024++] = class80.method532(arg0, (byte) 115);
        class103.field1667 = class205.field3566;
        class87.field1348.method672(253, 238);
        class87.field1348.method739(arg0, -23147);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILmj;II)V")
    public static final void method720(int arg0, int arg1, class129 arg2, int arg3, int arg4) {
        field1773++;
        class177.method1165(-8886);
        class216.method1403(arg1, arg0, arg2.field2175 + arg1, arg2.field2210 + arg0);
        if (class242.field4198 == 2 || class242.field4198 == 5 || class88.field1361 == null) {
            class216.method1413(arg1, arg0, 0, arg2.field2150, arg2.field2206);
        } else {
            int var5 = class103.field1665 + class159.field2742 & 0x7FF;
            int var6 = 464 - class7.field85.field166 / 32;
            int var7 = class7.field85.field190 / 32 + 48;
            ((class15) class88.field1361).method69(arg1, arg0, arg2.field2175, arg2.field2210, var7, var6, var5, class100.field1583 + 256, arg2.field2150, arg2.field2206);
            for (int var8 = 0; var8 < field1774; var8++) {
                int var41 = class230.field3921[var8] * 4 + 2 - class7.field85.field166 / 32;
                int var42 = class91.field1425[var8] * 4 + 2 - class7.field85.field190 / 32;
                class70 var43 = class190.method1232(class71.field1086[var8], arg3 + 13090);
                if (var43.field1069 != null) {
                    var43 = var43.method471(true);
                    if (var43 == null || var43.field1056 == -1) {
                        continue;
                    }
                }
                class66.method449(arg0, arg2, false, var42, var41, arg1, client.field546[var43.field1056]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    class47 var38 = class77.field1158[class196.field3401][var9][var37];
                    if (var38 != null) {
                        int var39 = var37 * 4 + 2 - class7.field85.field166 / 32;
                        int var40 = var9 * 4 + 2 - class7.field85.field190 / 32;
                        class66.method449(arg0, arg2, false, var40, var39, arg1, class73.field1104[0]);
                    }
                }
            }
            for (int var10 = 0; var10 < class82.field1244; var10++) {
                class222 var33 = class229.field3898[class51.field690[var10]];
                if (var33 != null && var33.method87(arg3 - 1570135920)) {
                    class180 var34 = var33.field3814;
                    if (var34 != null && var34.field3206 != null) {
                        var34 = var34.method1192(-1);
                    }
                    if (var34 != null && var34.field3192 && var34.field3173) {
                        int var35 = var33.field190 / 32 - class7.field85.field190 / 32;
                        int var36 = var33.field166 / 32 - class7.field85.field166 / 32;
                        class66.method449(arg0, arg2, false, var35, var36, arg1, class73.field1104[1]);
                    }
                }
            }
            for (int var11 = 0; var11 < class132.field2322; var11++) {
                class121 var25 = class104.field1677[class115.field1868[var11]];
                if (var25 != null && var25.method87(-1570135920)) {
                    int var26 = var25.field166 / 32 - class7.field85.field166 / 32;
                    int var27 = var25.field190 / 32 - class7.field85.field190 / 32;
                    boolean var28 = false;
                    long var29 = var25.field2000.method1084(arg3 + 32383);
                    for (int var31 = 0; var31 < class103.field1662; var31++) {
                        if (class56.field768[var31] == var29 && class138.field2439[var31] != 0) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class7.field85.field1978 != 0 && var25.field1978 != 0 && class7.field85.field1978 == var25.field1978) {
                        var32 = true;
                    }
                    if (var28) {
                        class66.method449(arg0, arg2, false, var27, var26, arg1, class73.field1104[3]);
                    } else if (var32) {
                        class66.method449(arg0, arg2, false, var27, var26, arg1, class73.field1104[4]);
                    } else {
                        class66.method449(arg0, arg2, false, var27, var26, arg1, class73.field1104[2]);
                    }
                }
            }
            class246[] var12 = class44.field579;
            for (int var13 = 0; var13 < var12.length; var13++) {
                class246 var16 = var12[var13];
                if (var16 != null && var16.field4269 != 0 && class133.field2326 % 20 < 10) {
                    if (var16.field4269 == 1 && var16.field4260 >= 0 && var16.field4260 < class229.field3898.length) {
                        class222 var17 = class229.field3898[var16.field4260];
                        if (var17 != null) {
                            int var18 = var17.field166 / 32 - class7.field85.field166 / 32;
                            int var19 = var17.field190 / 32 - class7.field85.field190 / 32;
                            class182.method1204(arg2, var19, (byte) -31, var18, arg0, var16.field4259, arg1);
                        }
                    }
                    if (var16.field4269 == 2) {
                        int var20 = (var16.field4262 - class125.field2060) * 4 + 2 - class7.field85.field166 / 32;
                        int var21 = (var16.field4264 - class246.field4261) * 4 + 2 - class7.field85.field190 / 32;
                        class182.method1204(arg2, var21, (byte) -108, var20, arg0, var16.field4259, arg1);
                    }
                    if (var16.field4269 == 10 && var16.field4260 >= 0 && class104.field1677.length > var16.field4260) {
                        class121 var22 = class104.field1677[var16.field4260];
                        if (var22 != null) {
                            int var23 = var22.field190 / 32 - class7.field85.field190 / 32;
                            int var24 = var22.field166 / 32 - class7.field85.field166 / 32;
                            class182.method1204(arg2, var23, (byte) -64, var24, arg0, var16.field4259, arg1);
                        }
                    }
                }
            }
            if (class163.field2803 != 0) {
                int var14 = class29.field351 * 4 + 2 - class7.field85.field166 / 32;
                int var15 = class163.field2803 * 4 + 2 - class7.field85.field190 / 32;
                class66.method449(arg0, arg2, false, var15, var14, arg1, class65.field919);
            }
            class216.method1405(arg2.field2175 / 2 + arg1 - 1, arg2.field2210 / 2 + (arg0 - 1), 3, 3, 16777215);
        }
        if (arg3 == 0) {
            class255.field4409[arg4] = true;
        }
    }
}
