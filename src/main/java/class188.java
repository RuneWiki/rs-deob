import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class188 {

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "B")
    private byte field3326;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public int field3318;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public int field3334;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "[Lsi;")
    public static class192[] field3331 = new class192[4];

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Z")
    public static boolean field3329 = false;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "[Ljd;")
    public static class86[] field3332 = new class86[500];

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "[I")
    public static int[] field3328 = new int[5];

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Ljd;")
    public static class86 field3336 = class122.method868(" GMT", true);

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Ljd;")
    private static class86 field3330 = class122.method868("Checking for updates )2 ", true);

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Ljd;")
    public static class86 field3320 = field3330;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Ljd;")
    public static class86 field3322 = class122.method868("Loaded world list data", true);

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Lbj;")
    public static class151 field3338;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)I")
    public final int method1290(byte arg0) {
        field3324++;
        return arg0 == 88 ? this.field3326 & 0x7 : -48;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
    public static final boolean method1291(int arg0, int arg1) {
        field3337++;
        class239 var2 = class50.method383((byte) -4, arg1);
        if (var2 == null) {
            return false;
        } else if (class254.field4522 == 1 || class254.field4522 == 2 || class220.field3961 == 2) {
            byte[] var3 = var2.field4302.method619((byte) 65);
            class91.field1852 = new String(var3, 0, var3.length);
            class147.field2766 = var2.field4307;
            if (class220.field3961 != 0) {
                class59.field1188 = class147.field2766 + 40000;
                class113.field2162 = class147.field2766 + 50000;
                class191.field3390 = class59.field1188;
            }
            return true;
        } else if (arg0 == 29331) {
            class86 var4 = class157.field2957;
            if (class220.field3961 != 0) {
                var4 = class109.method783(2, new class86[] { class164.field3077, class4.method26(false, var2.field4307 + 7000) });
            }
            class86 var5 = class157.field2957;
            if (class130.field2487 != null) {
                var5 = class109.method783(2, new class86[] { class98.field1940, class130.field2487 });
            }
            class86 var6 = class109.method783(2, new class86[] { class20.field536, var2.field4302, var4, client.field2859, class4.method26(false, class257.field4558), class217.field3915, class4.method26(false, class179.field3235), var5, class240.field4318, class64.field1258 ? class151.field2846 : class35.field798, class79.field1552, class20.field538 ? class151.field2846 : class35.field798, class38.field903, class33.field723 ? class151.field2846 : class35.field798 });
            try {
                class98.field1942.getAppletContext().showDocument(var6.method584((byte) 45), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1292(int arg0) {
        field3338 = null;
        if (arg0 > -6) {
            return;
        }
        field3322 = null;
        field3331 = null;
        field3336 = null;
        field3332 = null;
        field3320 = null;
        field3330 = null;
        field3328 = null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public static final void method1293(int arg0) {
        if (class274.field4814 < 0) {
            class51.field1074 = -1;
            class152.field2875 = -1;
            class274.field4814 = 0;
        }
        if (class274.field4814 > class263.field4668) {
            class274.field4814 = class263.field4668;
            class51.field1074 = -1;
            class152.field2875 = -1;
        }
        field3327++;
        if (class156.field2952 < 0) {
            class51.field1074 = -1;
            class152.field2875 = -1;
            class156.field2952 = 0;
        }
        if (class156.field2952 > class38.field894) {
            class156.field2952 = class38.field894;
            class51.field1074 = -1;
            class152.field2875 = -1;
        }
        int var1 = 87 / ((arg0 + 15) / 47);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)I")
    public final int method1294(byte arg0) {
        if (arg0 == -32) {
            field3321++;
            return (this.field3326 & 0x8) == 8 ? 1 : 0;
        } else {
            return 28;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lqk;I)Ljd;")
    public static final class86 method1295(class200 arg0, int arg1) {
        field3333++;
        if (arg1 != 1000) {
            field3328 = null;
        }
        return class88.method649(arg0, (byte) 111, 32767);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class188() {
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lqk;)V")
    public class188(class200 arg0) {
        this.field3326 = arg0.method1412((byte) 106);
        this.field3318 = arg0.method1410(-105);
        this.field3325 = arg0.method1386(-4603);
        this.field3339 = arg0.method1386(-4603);
        this.field3323 = arg0.method1386(-4603);
        this.field3334 = arg0.method1386(-4603);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public static final void method1296(int arg0) {
        field3319++;
        int var1 = class144.field2725 * 128 - arg0;
        int var2 = class88.field1741 * 128 + 64;
        int var3 = class30.method198(31482, var1, var2, class180.field3244) - class164.field3074;
        if (class165.field3093 < 100) {
            if (var1 > class70.field1430) {
                class70.field1430 += (var1 - class70.field1430) * class165.field3093 / 1000 + class1.field13;
                if (var1 < class70.field1430) {
                    class70.field1430 = var1;
                }
            }
            if (var1 < class70.field1430) {
                class70.field1430 -= (class70.field1430 - var1) * class165.field3093 / 1000 + class1.field13;
                if (var1 > class70.field1430) {
                    class70.field1430 = var1;
                }
            }
            if (class4.field61 < var2) {
                class4.field61 += class1.field13 + ((var2 - class4.field61) * class165.field3093 / 1000);
                if (var2 < class4.field61) {
                    class4.field61 = var2;
                }
            }
            if (class88.field1748 < var3) {
                class88.field1748 += (var3 - class88.field1748) * class165.field3093 / 1000 + class1.field13;
                if (class88.field1748 > var3) {
                    class88.field1748 = var3;
                }
            }
            if (var2 < class4.field61) {
                class4.field61 -= (class4.field61 - var2) * class165.field3093 / 1000 + class1.field13;
                if (class4.field61 < var2) {
                    class4.field61 = var2;
                }
            }
            if (class88.field1748 > var3) {
                class88.field1748 -= (class88.field1748 - var3) * class165.field3093 / 1000 + class1.field13;
                if (var3 > class88.field1748) {
                    class88.field1748 = var3;
                }
            }
        } else {
            class70.field1430 = class144.field2725 * 128 + 64;
            class4.field61 = class88.field1741 * 128 + 64;
            class88.field1748 = class30.method198(arg0 ^ 0xFFFF853A, class70.field1430, class4.field61, class180.field3244) - class164.field3074;
        }
        int var4 = class242.field4334 * 128 + 64;
        int var5 = class8.field261 * 128 + 64;
        int var6 = class30.method198(31482, var5, var4, class180.field3244) - class64.field1276;
        int var7 = var4 - class4.field61;
        int var8 = var5 - class70.field1430;
        int var9 = var6 - class88.field1748;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var8, (double) var7) * -325.949D) & 0x7FF;
        int var13 = var12 - class176.field3202;
        if (class255.field4541 < var11) {
            class255.field4541 += (var11 - class255.field4541) * class48.field1036 / 1000 + class2.field21;
            if (class255.field4541 > var11) {
                class255.field4541 = var11;
            }
        }
        if (var11 < class255.field4541) {
            class255.field4541 -= (class255.field4541 - var11) * class48.field1036 / 1000 + class2.field21;
            if (var11 > class255.field4541) {
                class255.field4541 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class176.field3202 += class48.field1036 * var13 / 1000 + class2.field21;
            class176.field3202 &= 0x7FF;
        }
        if (var13 < 0) {
            class176.field3202 -= -var13 * class48.field1036 / 1000 + class2.field21;
            class176.field3202 &= 0x7FF;
        }
        int var14 = var12 - class176.field3202;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class176.field3202 = var12;
        }
    }
}
