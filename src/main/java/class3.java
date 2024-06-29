import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lcd;")
    public static class23 field32 = class54.method414("Konfig geladen)3", -1);

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lcd;")
    public static class23 field31 = class54.method414(" )2> ", -1);

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field36 = 0;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lcd;")
    public static class23 field35 = class54.method414("Cabbage", -1);

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lcd;")
    public static class23 field38 = class54.method414("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -1);

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lcd;")
    private static class23 field39 = class54.method414("Your ignore list is full)3 Max of 100 users)3", -1);

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lcd;")
    public static class23 field33 = field39;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "[Loe;")
    public static class130[] field37;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lfa;Z)V")
    public static final void method12(class47 arg0, boolean arg1) {
        field29++;
        if (arg1) {
            method15(null, (byte) 23, null);
        }
        if (class160.field3208 == arg0.field1109) {
            class172.field3412[arg0.field1141] = true;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method13(int arg0) {
        field37 = null;
        field33 = null;
        field35 = null;
        field32 = null;
        field31 = null;
        if (arg0 == 382) {
            field38 = null;
            field39 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z[Lcd;)Lcd;")
    public static final class23 method14(boolean arg0, class23[] arg1) {
        field30++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        if (!arg0) {
            method15(null, (byte) 90, null);
        }
        return class138.method878((byte) -120, 0, arg1, arg1.length);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lcg;BLcg;)V")
    public static final void method15(class26 arg0, byte arg1, class26 arg2) {
        field34++;
        if (class151.field3026) {
            class75.method533(88, arg0, arg2);
            return;
        }
        if (class52.field1239 == 0 || class52.field1239 == 5) {
            byte var3 = 20;
            arg2.method270(class34.field697, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class196.method1273(230, var4, 304, 34, 9179409);
            class196.method1273(231, var4 + 1, 302, 32, 0);
            class196.method1281(232, var4 + 2, class31.field664 * 3, 30, 9179409);
            class196.method1281(class31.field664 * 3 + 232, var4 + 2, 300 - class31.field664 * 3, 30, 0);
            arg2.method270(class105.field2271, 382, 276 - var3, 16777215, -1);
        }
        if (class52.field1239 == 20) {
            class116.field2419.method836(382 - class116.field2419.field2706 / 2, -(class116.field2419.field2701 / 2) + 271);
            short var5 = 211;
            arg2.method270(class105.field2278, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg2.method270(class105.field2268, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg2.method270(class105.field2276, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg2.method291(method14(true, new class23[] { class202.field3991, class37.method284(class105.field2284) }), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg2.method291(method14(true, new class23[] { class66.field1568, class105.field2274.method138((byte) -108) }), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (class52.field1239 == 10) {
            class116.field2419.method836(202, 171);
            if (class21.field441 == 0) {
                short var6 = 251;
                arg2.method270(class20.field423, 382, var6, 16776960, 0);
                int var27 = var6 + 30;
                short var7 = 302;
                short var8 = 291;
                class56.field1314.method836(var7 - 73, var8 - 20);
                arg2.method281(class27.field566, var7 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class56.field1314.method836(var9 - 73, var8 + -20);
                arg2.method281(class44.field928, var9 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class21.field441 == 2) {
                short var10 = 211;
                arg2.method270(class105.field2278, 382, var10, 16776960, 0);
                int var30 = var10 + 15;
                arg2.method270(class105.field2268, 382, var30, 16776960, 0);
                int var31 = var30 + 15;
                arg2.method270(class105.field2276, 382, var31, 16776960, 0);
                boolean var11;
                if (class74.field1694 == 0 && class15.field339 % 40 < 20 && class65.field1540) {
                    var11 = true;
                } else {
                    var11 = false;
                }
                var30 = var31 + 15;
                var30 += 10;
                arg2.method291(method14(true, new class23[] { class202.field3991, class37.method284(class105.field2284), var11 ? class1.field10 : class105.field2280 }), 272, var30, 16777215, 0);
                var30 += 15;
                boolean var12;
                if (class74.field1694 == 1 && class15.field339 % 40 < 20 && class65.field1540) {
                    var12 = true;
                } else {
                    var12 = false;
                }
                arg2.method291(method14(true, new class23[] { class66.field1568, class105.field2274.method138((byte) -84), var12 ? class1.field10 : class105.field2280 }), 274, var30, 16777215, 0);
                var30 += 15;
                short var13 = 321;
                short var14 = 302;
                class56.field1314.method836(var14 - 73, var13 + -20);
                arg2.method270(class176.field3501, var14, var13 + 5, 16777215, 0);
                short var15 = 462;
                class56.field1314.method836(var15 - 73, var13 + -20);
                arg2.method270(class153.field3061, var15, var13 + 5, 16777215, 0);
            } else if (class21.field441 == 3) {
                arg2.method270(class6.field114, 382, 211, 16776960, 0);
                short var16 = 236;
                arg2.method270(class84.field1788, 382, var16, 16777215, 0);
                int var32 = var16 + 15;
                short var17 = 382;
                short var18 = 321;
                arg2.method270(class115.field2403, 382, var32, 16777215, 0);
                int var33 = var32 + 15;
                arg2.method270(class15.field330, 382, var33, 16777215, 0);
                int var34 = var33 + 15;
                arg2.method270(class70.field1626, 382, var34, 16777215, 0);
                int var35 = var34 + 15;
                class56.field1314.method836(var17 - 73, var18 + -20);
                arg2.method270(class153.field3061, var17, var18 + 5, 16777215, 0);
            }
        }
        if (class95.field2004 != 1) {
            if (class49.field1190 > 0) {
                class189.method1212(class49.field1190, (byte) -84);
                class49.field1190 = 0;
            }
            class89.method585(arg1 ^ 0xFFFF00A9);
        }
        class31.field676[class175.field3489 ? 1 : 0].method836(725, 463);
        if (class52.field1239 > 5 && class124.field2552 != 2 && class145.field2956 == 0) {
            if (class29.field617 == null) {
                class29.field617 = class2.method11(client.field585, 122, class29.field632, class105.field2280);
            } else {
                byte var19 = 5;
                short var20 = 463;
                byte var21 = 100;
                class29.field617.method836(var19, var20);
                byte var22 = 35;
                arg2.method270(method14(true, new class23[] { class145.field2962, class184.field3613, class184.method1132(-1, class13.field295) }), var21 / 2 + var19, var22 / 2 + -2 + var20, 16777215, 0);
                if (class144.field2947 == null) {
                    arg0.method270(class25.field554, var21 / 2 + var19, var22 / 2 + var20 - -12, 16777215, 0);
                } else {
                    arg0.method270(class7.field123, var21 / 2 + var19, var22 / 2 + 12 + var20, 16777215, 0);
                }
            }
        }
        if (arg1 != -87) {
            method15(null, (byte) -56, null);
        }
    }
}
