import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class225 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Z")
    public static boolean field3994 = true;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3995 = 0;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Z")
    public static boolean field3998 = false;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field4000 = 0;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lfl;")
    public static class192 field4003;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "[I")
    public static int[] field4004;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1521(int arg0) {
        field4004 = null;
        if (arg0 != 60) {
            field4000 = 73;
        }
        field4003 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
    public static final void method1522(boolean arg0) {
        class216.method1487(105);
        class61.method454(-77);
        class72.method506(-955);
        field3999++;
        class237.method1580((byte) -3);
        class201.method1383(0);
        class200.method1380(-1);
        class177.method1149(!arg0);
        class146.method1008((byte) -92);
        class258.method1704(0);
        class279.method1904((byte) 49);
        class263.method1758(0);
        class210.method1442((byte) 127);
        class12.method99(193);
        if (client.field3854 != 0) {
            for (int var1 = 0; var1 < class49.field1035.length; var1++) {
                class49.field1035[var1] = null;
            }
            class223.field3982 = 0;
        }
        class155.method1054((byte) -109);
        class82.method566(90);
        class82.field1538.method1893(-30);
        ((class9) class247.field4292).method60((byte) -123);
        class242.field4204.method1416(-2136869688);
        class81.field1522.method1322(0);
        class118.field2080.method1322(0);
        class228.field4046.method1322(0);
        class213.field3822.method1322(0);
        class30.field757.method1322(0);
        class14.field427.method1322(0);
        class276.field4868.method1322(0);
        class243.field4236.method1322(0);
        if (!arg0) {
            method1524(36);
        }
        class58.field1180.method1322(0);
        class147.field2748.method1322(0);
        class116.field2061.method1322(0);
        class100.field1753.method1893(-39);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)[B")
    public abstract byte[] method576(int arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILdh;)V")
    public static final void method1523(int arg0, class142 arg1) {
        field3997++;
        long var2 = 0L;
        if (arg1.field2642 == 0) {
            var2 = class72.method510(arg1.field2641, arg1.field2638, arg1.field2637);
        }
        int var4 = -1;
        if (arg1.field2642 == 1) {
            var2 = class71.method503(arg1.field2641, arg1.field2638, arg1.field2637);
        }
        if (arg0 != -5366) {
            field3995 = 55;
        }
        if (arg1.field2642 == 2) {
            var2 = class179.method1166(arg1.field2641, arg1.field2638, arg1.field2637);
        }
        int var5 = 0;
        if (arg1.field2642 == 3) {
            var2 = class23.method221(arg1.field2641, arg1.field2638, arg1.field2637);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var5 = (int) var2 >> 14 & 0x1F;
            var6 = ((int) var2 & 0x3FDE24) >> 20;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg1.field2643 = var6;
        arg1.field2636 = var4;
        arg1.field2633 = var5;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([BI)V")
    public abstract void method577(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static final void method1524(int arg0) {
        field3996++;
        if (class181.field3211 == null) {
            return;
        }
        if (class103.field1830 < 10) {
            if (!class221.field3960.method1312(class181.field3211.field410, arg0 - 9)) {
                class103.field1830 = class252.field4340.method1334(class181.field3211.field410, 0) / 10;
                return;
            }
            class1.method9(105);
            class103.field1830 = 10;
        }
        if (class103.field1830 == arg0) {
            if (class181.field3211.field405 == 37) {
                class101.field1793 = 3.0F;
                class144.field2687 = 3.0F;
            } else if (class181.field3211.field405 == 50) {
                class101.field1793 = 4.0F;
                class144.field2687 = 4.0F;
            } else if (class181.field3211.field405 == 75) {
                class101.field1793 = 6.0F;
                class144.field2687 = 6.0F;
            } else if (class181.field3211.field405 == 100) {
                class101.field1793 = 8.0F;
                class144.field2687 = 8.0F;
            } else if (class181.field3211.field405 == 200) {
                class101.field1793 = 16.0F;
                class144.field2687 = 16.0F;
            } else {
                class101.field1793 = 8.0F;
                class144.field2687 = 8.0F;
            }
            class176.field3141 = class181.field3211.field402 >> 6 << 6;
            class269.field4796 = class181.field3211.field416 >> 6 << 6;
            int var1 = class64.field1248 + (class214.field3827.field2600 >> 7) - class269.field4796;
            class213.field3824 = (class181.field3211.field404 >> 6 << 6) + 64 - class269.field4796;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            class155.field2871 = (class181.field3211.field413 >> 6 << 6) + 64 - class176.field3141;
            int var3 = class176.field3141 - ((class214.field3827.field2564 >> 7) + (class231.field4073 + 1) - class155.field2871);
            int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
            if (var2 >= 0 && class213.field3824 > var2 && var4 >= 0 && class155.field2871 > var4) {
                class263.field4590 = var4;
                class278.field4911 = var2;
            } else {
                class278.field4911 = class181.field3211.field415 * 64 - class269.field4796;
                class263.field4590 = class176.field3141 + class155.field2871 - (class181.field3211.field408 * 64) - 1;
            }
            class30.method246(44);
            int var5 = class213.field3824 >> 6;
            class61.field1216 = new int[class275.field4857 + 1];
            int var6 = class32.field811 >> 2 << 10;
            int var7 = class187.field3375 >> 1;
            int var8 = class155.field2871 >> 6;
            class254.field4373 = new short[var5][var8][];
            class72.field1369 = new byte[var5][var8][];
            class166.field3007 = new byte[var5][var8][];
            class172.field3112 = new int[var5][var8][];
            class120.field2130 = new byte[var5][var8][];
            class18.field493 = new byte[var5][var8][];
            class182.field3245 = new byte[var5][var8][];
            class177.field3162 = new int[var5][var8][];
            class280.method1908((byte) 87, var7, var6);
            class103.field1830 = 20;
        } else if (class103.field1830 == 20) {
            class68.method490((byte) -48, new class135(class221.field3960.method1320(arg0 ^ 0x76, class227.field4034, class181.field3211.field410)));
            class103.field1830 = 30;
            class116.method777((byte) 34, true);
            class263.method1757((byte) -109);
        } else if (class103.field1830 == 30) {
            class260.method1728(127, new class135(class221.field3960.method1320(-68, class55.field1134, class181.field3211.field410)));
            class103.field1830 = 40;
            class263.method1757((byte) 77);
        } else if (class103.field1830 == 40) {
            class238.method1590(arg0 ^ 0x21E4, new class135(class221.field3960.method1320(-55, class42.field943, class181.field3211.field410)));
            class103.field1830 = 50;
            class263.method1757((byte) -88);
        } else if (class103.field1830 == 50) {
            class81.method561(false, new class135(class221.field3960.method1320(-9, class57.field1154, class181.field3211.field410)));
            class103.field1830 = 60;
            class116.method777((byte) 34, true);
            class263.method1757((byte) 94);
        } else if (class103.field1830 == 60) {
            if (class221.field3960.method1323((byte) -45, class148.method1022(10, new class265[] { class181.field3211.field410, class9.field287 }))) {
                if (!class221.field3960.method1312(class148.method1022(10, new class265[] { class181.field3211.field410, class9.field287 }), 1)) {
                    return;
                }
                class126.field2260 = class256.method1681((byte) 36, class221.field3960, class148.method1022(10, new class265[] { class181.field3211.field410, class9.field287 }));
            } else {
                class126.field2260 = new class145(0);
            }
            class103.field1830 = 70;
            class263.method1757((byte) 58);
        } else if (class103.field1830 == 70) {
            class246.field4277 = new class92(11, true, class125.field2241);
            class103.field1830 = 73;
            class116.method777((byte) 34, true);
            class263.method1757((byte) -117);
        } else if (class103.field1830 == 73) {
            class208.field3755 = new class92(12, true, class125.field2241);
            class103.field1830 = 76;
            class116.method777((byte) 34, true);
            class263.method1757((byte) 62);
        } else if (class103.field1830 == 76) {
            class214.field3837 = new class92(14, true, class125.field2241);
            class103.field1830 = 79;
            class116.method777((byte) 34, true);
            class263.method1757((byte) -125);
        } else if (class103.field1830 == 79) {
            class100.field1781 = new class92(17, true, class125.field2241);
            class103.field1830 = 82;
            class116.method777((byte) 34, true);
            class263.method1757((byte) 104);
        } else if (class103.field1830 == 82) {
            class121.field2135 = new class92(19, true, class125.field2241);
            class103.field1830 = 85;
            class116.method777((byte) 34, true);
            class263.method1757((byte) 119);
        } else if (class103.field1830 == 85) {
            class257.field4396 = new class92(22, true, class125.field2241);
            class103.field1830 = 88;
            class116.method777((byte) 34, true);
            class263.method1757((byte) 116);
        } else if (class103.field1830 == 88) {
            class95.field1680 = new class92(26, true, class125.field2241);
            class103.field1830 = 91;
            class116.method777((byte) 34, true);
            class263.method1757((byte) -96);
        } else {
            class201.field3603 = new class92(30, true, class125.field2241);
            class103.field1830 = 100;
            class116.method777((byte) 34, true);
            class263.method1757((byte) -120);
            System.gc();
        }
    }
}
