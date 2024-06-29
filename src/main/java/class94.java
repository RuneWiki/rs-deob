import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class94 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lwm;")
    public static class152 field1333 = class157.method1048("headicons_pk", 106);

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1338 = 0;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lwm;")
    public static class152 field1335 = class157.method1048("Stufe: ", 100);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lek;")
    public static class183 field1334 = new class183();

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1349 = 0;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[[I")
    public static int[][] field1348 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lah;")
    public static class205 field1343;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lah;")
    public static class205 field1347;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ldd;I)V", line = 12)
    public static final void method619(class249 arg0, int arg1) {
        field1340++;
        if (class142.field2187 == arg0.field4212 || arg0.field4240 == -1 || arg0.field4216 != 0 || arg0.field4257 + 1 > class133.method851(arg0.field4240, 122).field2150[arg0.field4258]) {
            int var2 = class142.field2187 - arg0.field4267;
            int var3 = arg0.field4212 - arg0.field4267;
            int var4 = arg0.field4184 * 128 + arg0.method67(-4391) * 64;
            int var5 = arg0.field4235 * 128 + (arg0.method67(-4391) * 64);
            int var6 = arg0.field4243 * 128 + (arg0.method67(-4391) * 64);
            int var7 = arg0.field4219 * 128 + (arg0.method67(-4391) * 64);
            arg0.field4231 = ((var3 - var2) * var5 + (var2 * var7)) / var3;
            arg0.field4162 = ((var3 - var2) * var4 + var2 * var6) / var3;
        }
        arg0.field4210 = 0;
        if (arg0.field4176 == 0) {
            arg0.field4209 = 1024;
        }
        if (arg1 >= -51) {
            field1349 = -38;
        }
        if (arg0.field4176 == 1) {
            arg0.field4209 = 1536;
        }
        if (arg0.field4176 == 2) {
            arg0.field4209 = 0;
        }
        if (arg0.field4176 == 3) {
            arg0.field4209 = 512;
        }
        arg0.field4161 = arg0.field4209;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLwm;)V", line = 58)
    public static final void method620(byte arg0, class152 arg1) {
        if (arg0 > -118) {
            return;
        }
        field1342++;
        if (class148.field2263 >= 2) {
            if (arg1.method995(-108, class89.field1248)) {
                class127.method816((byte) 108);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class245.method1687((class152) null, 0, class195.method1307(new class152[] { class72.field1046, class38.method280(115, var4), class212.field3443 }, (byte) 29), -1);
            }
            if (arg1.method995(-86, class284.field4827)) {
                class127.method816((byte) 108);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class245.method1687((class152) null, 0, class195.method1307(new class152[] { class213.field3481, class38.method280(90, var7), class212.field3443 }, (byte) 29), -1);
                class116.method764(true);
                class127.method816((byte) 108);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class245.method1687((class152) null, 0, class195.method1307(new class152[] { class199.field3214, class38.method280(105, var9), class212.field3443 }, (byte) 29), -1);
            }
            if (arg1.method995(-117, class266.field4481)) {
                class245.method1687((class152) null, 0, class195.method1307(new class152[] { class230.field3753, class38.method280(84, class87.method576(true)) }, (byte) 29), -1);
            }
            if (class217.field3516 && arg1.method995(-113, class93.field1320)) {
                System.out.println("oncard_geometry:" + class207.field3381);
                System.out.println("oncard_2d:" + class207.field3382);
                System.out.println("oncard_texture:" + class207.field3385);
            }
            if (arg1.method995(-93, class231.field3772)) {
                class234.method1606(22243);
            }
            if (arg1.method995(-126, class127.field1819)) {
                class130.field1979.method1279(1);
            }
            if (arg1.method995(-126, class203.field3273)) {
                class130.field1979.method1282((byte) -106);
            }
            if (arg1.method995(-81, class269.field4534)) {
                class34.field572.method963((byte) 96);
                class265.field4477.method1241(84);
                class130.field1979.method1283((byte) 55);
            }
            if (arg1.method995(-77, class245.field4080)) {
                class137.field2102 = true;
            }
            if (arg1.method995(-70, class267.field4502)) {
                class232.method1597((byte) 127, 25);
            }
            if (arg1.method995(-93, class125.field1760)) {
                class50.field776 = true;
            }
            if (arg1.method995(-85, class179.field2859)) {
                class50.field776 = false;
            }
            if (arg1.method995(-84, class193.field3073)) {
                class179.method1178(true, -1, false, 0, -1);
            }
            if (arg1.method995(-121, class52.field811)) {
                class179.method1178(true, -1, false, 1, -1);
            }
            if (arg1.method995(-73, class8.field100)) {
                class179.method1178(true, -1, false, 2, -1);
            }
            if (arg1.method995(-117, class125.field1763)) {
                class179.method1178(true, 768, false, 3, 1024);
            }
            if (arg1.method995(-93, class242.field3967)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class135.field2076[var10].field384[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg1.method977(22394, class41.field666)) {
                class47.method324(arg1.method983((byte) 88, 15).method998(75));
                class134.method854((byte) 48, class34.field572);
                class254.field4391 = false;
            }
            if (arg1.method977(22394, class42.field671) && class39.field638 != 0) {
                class55.method367(true, arg1.method983((byte) 88, 6).method998(-121));
            }
            if (arg1.method995(-78, class224.field3638)) {
                throw new RuntimeException();
            }
            if (arg1.method977(22394, class298.field5148)) {
                class288.field4868 = arg1.method983((byte) 88, 12).method1025(45).method998(104);
                class245.method1687((class152) null, 0, class195.method1307(new class152[] { class85.field1191, class38.method280(85, class288.field4868) }, (byte) 29), -1);
            }
            if (arg1.method995(-86, class212.field3456)) {
                class317.field5495 = true;
            }
            if (arg1.method995(-110, class149.field2322)) {
                if (class58.field890) {
                    class58.field890 = false;
                    class245.method1687((class152) null, 0, class70.field1022, -1);
                } else {
                    class58.field890 = true;
                    class245.method1687((class152) null, 0, class279.field4780, -1);
                }
            }
            if (arg1.method995(-105, class4.field65)) {
                if (class306.field5255) {
                    class194.field3105.method975((byte) 17);
                    class306.field5255 = false;
                } else {
                    class148.field2266.method975((byte) 17);
                    class306.field5255 = true;
                }
            }
        }
        class281.field4794++;
        class245.field4102.method1065(112, -65);
        class245.field4102.method1980(false, arg1.method1000(0) - 1);
        class245.field4102.method2015(-21389, arg1.method983((byte) 88, 2));
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZZIIII)V", line = 284)
    public static final void method621(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field1345++;
        if (arg2) {
            class217.method1468();
        }
        if (class23.field397 != null && (arg4 != 3 || class15.field211 != arg0 || class179.field2848 != arg6)) {
            class117.method773(false, class34.field572, class23.field397);
            class23.field397 = null;
        }
        if (arg4 == 3 && class23.field397 == null) {
            class23.field397 = class256.method1789(0, arg6, 0, class34.field572, arg0, 104);
            if (class23.field397 != null) {
                class15.field211 = arg0;
                class179.field2848 = arg6;
                class134.method854((byte) 76, class34.field572);
            }
        }
        if (arg4 == 3 && class23.field397 == null) {
            method621(-1, true, true, arg3, class167.field2632, 7488, -1);
            return;
        }
        Container var7;
        if (class23.field397 != null) {
            var7 = class23.field397;
        } else if (class85.field1201 == null) {
            var7 = class34.field572.field2359;
        } else {
            var7 = class85.field1201;
        }
        class205.field3350 = var7.getSize().width;
        class81.field1137 = var7.getSize().height;
        if (class85.field1201 == var7) {
            Insets var8 = class85.field1201.getInsets();
            class81.field1137 -= var8.top + var8.bottom;
            class205.field3350 -= var8.left + var8.right;
        }
        if (arg4 < 2) {
            class227.field3709 = 503;
            class172.field2739 = 0;
            class172.field2757 = 765;
            class137.field2100 = (class205.field3350 - 765) / 2;
        } else {
            class227.field3709 = class81.field1137;
            class137.field2100 = 0;
            class172.field2739 = 0;
            class172.field2757 = class205.field3350;
        }
        if (arg1) {
            class243.method1666(class224.field3648, -4294);
            class308.method2144(class224.field3648, arg5 ^ 0x2FFC);
            if (class206.field3359 != null) {
                class206.field3359.method561(class224.field3648, false);
            }
            class44.field707.method847(-1);
            class157.method1051(class224.field3648, 1);
            class245.method1689(class224.field3648, 0);
            if (class206.field3359 != null) {
                class206.field3359.method565(class224.field3648, false);
            }
        } else {
            if (class217.field3516) {
                class217.method1470(class172.field2757, class227.field3709);
            }
            class224.field3648.setSize(class172.field2757, class227.field3709);
            if (class85.field1201 == var7) {
                Insets var9 = class85.field1201.getInsets();
                class224.field3648.setLocation(class137.field2100 + var9.left, class172.field2739 + var9.top);
            } else {
                class224.field3648.setLocation(class137.field2100, class172.field2739);
            }
        }
        if (arg4 == 0 && arg3 > 0) {
            class217.method1459(class224.field3648);
        }
        if (arg2 && arg4 > 0) {
            class224.field3648.setIgnoreRepaint(true);
            if (!class244.field4046) {
                class58.method384();
                class311.field5322 = null;
                class311.field5322 = class195.method1303(23229, class172.field2757, class227.field3709, class224.field3648);
                class96.method628();
                if (class232.field3814 == 5) {
                    class222.method1535(-82, true, class316.field5485);
                } else {
                    class6.method32(class154.field2457, false, 66);
                }
                try {
                    Graphics var10 = class224.field3648.getGraphics();
                    class311.field5322.method121(-129, var10, 0, 0);
                } catch (Exception var14) {
                }
                class304.method2124(false);
                if (arg3 == 0) {
                    class311.field5322 = class195.method1303(23229, 765, 503, class224.field3648);
                } else {
                    class311.field5322 = null;
                }
                class188 var12 = class34.field572.method966((byte) -127, class44.field707.getClass());
                while (var12.field2980 == 0) {
                    class4.method19(0, 100L);
                }
                if (var12.field2980 == 1) {
                    class244.field4046 = true;
                }
            }
            if (class244.field4046) {
                class217.method1476(class224.field3648, class225.field3657 * 2);
            }
        }
        if (!class217.field3516 && arg4 > 0) {
            method621(-1, true, true, arg3, 0, 7488, -1);
            return;
        }
        if (arg4 > 0 && arg3 == 0) {
            class312.field5368.setPriority(5);
            class311.field5322 = null;
            class21.method152();
            ((class272) class181.field2878).method1871(arg5 - 7488, 200);
            if (class81.field1131) {
                class181.method1206(0.7F);
            }
            class299.method2098((byte) -127);
        } else if (arg4 == 0 && arg3 > 0) {
            class312.field5368.setPriority(1);
            class311.field5322 = class195.method1303(23229, 765, 503, class224.field3648);
            class21.method130();
            class47.method327();
            ((class272) class181.field2878).method1871(0, 20);
            if (class81.field1131) {
                if (class87.field1228 == 1) {
                    class181.method1206(0.9F);
                }
                if (class87.field1228 == 2) {
                    class181.method1206(0.8F);
                }
                if (class87.field1228 == 3) {
                    class181.method1206(0.7F);
                }
                if (class87.field1228 == 4) {
                    class181.method1206(0.6F);
                }
            }
            class1.method6();
            class299.method2098((byte) -127);
        }
        class176.field2836 = !class296.method2044(104);
        if (arg2) {
            class180.method1183(arg5 ^ 0x1D28);
        }
        if (arg4 >= 2) {
            class63.field947 = true;
        } else {
            class63.field947 = false;
        }
        if (class253.field4387 != -1) {
            class198.method1321(false, true);
        }
        if (class265.field4477 != null && (class232.field3814 == 30 || class232.field3814 == 25)) {
            class321.method2261(arg5 ^ 0xFFFFF051);
        }
        if (arg5 != 7488) {
            method619((class249) null, 126);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class249.field4170[var13] = true;
        }
        class49.field770 = true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V", line = 521)
    public static final void method623(int arg0, int arg1) {
        class167.field2618.method1617(arg0, 50);
        field1337++;
        if (arg1 != 4) {
            method624(41, 94);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)I", line = 532)
    public static final int method624(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 544)
    public static void method625(int arg0) {
        field1333 = null;
        field1348 = (int[][]) null;
        field1335 = null;
        field1347 = null;
        field1334 = null;
        if (arg0 != 2) {
            method623(89, -61);
        }
        field1343 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLnh;)V", line = 559)
    public static final void method626(byte arg0, class115 arg1) {
        arg1.field1626 = false;
        if (arg1.field1625 != null) {
            arg1.field1625.field4130 = 0;
        }
        for (class115 var2 = arg1.method482(); var2 != null; var2 = arg1.method461()) {
            method626((byte) 106, var2);
        }
        if (arg0 != 106) {
            field1346 = 97;
        }
        field1344++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lml;I)Lml;")
    public abstract class133 method622(class133 arg0, int arg1);
}
