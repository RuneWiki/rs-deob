import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class303 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field5042 = -1;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field5038 = 0;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lce;")
    public static class126 field5043 = class206.method1445(-7923, "null");

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lcc;")
    public static class313 field5045;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "[Lie;")
    public static class2[] field5047;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[[B")
    public static byte[][] field5044;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V", line = 13)
    public static final void method2031(int arg0, int arg1) {
        class245 var2 = class139.method1022(arg1, (byte) -102, arg0);
        field5046++;
        var2.method1682(83);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 22)
    public static void method2032(int arg0) {
        field5044 = (byte[][]) null;
        field5045 = null;
        field5043 = null;
        field5047 = null;
        if (arg0 != 103) {
            field5044 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lce;B)V", line = 36)
    public static final void method2033(class126 arg0, byte arg1) {
        field5039++;
        if (class73.field1172 >= 2) {
            if (arg0.method881(class20.field272, (byte) 92)) {
                class195.method1377((byte) -85);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class73.method530((class126) null, (byte) 95, 0, class12.method69(new class126[] { class117.field1970, class195.method1386((byte) 20, var4), class52.field796 }, (byte) 127));
            }
            if (arg0.method881(class63.field1052, (byte) 92)) {
                class195.method1377((byte) -101);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class73.method530((class126) null, (byte) 84, 0, class12.method69(new class126[] { class318.field5459, class195.method1386((byte) 20, var7), class52.field796 }, (byte) 123));
                class244.method1679((byte) -13);
                class195.method1377((byte) -112);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class73.method530((class126) null, (byte) 118, 0, class12.method69(new class126[] { class317.field5444, class195.method1386((byte) 20, var9), class52.field796 }, (byte) 122));
            }
            if (arg0.method881(class176.field3115, (byte) 92)) {
                class73.method530((class126) null, (byte) 102, 0, class12.method69(new class126[] { class213.field3627, class195.method1386((byte) 20, class228.method1554((byte) 33)) }, (byte) 124));
            }
            if (class56.field846 && arg0.method881(class90.field1406, (byte) 92)) {
                System.out.println("oncard_geometry:" + class121.field2026);
                System.out.println("oncard_2d:" + class121.field2022);
                System.out.println("oncard_texture:" + class121.field2025);
            }
            if (arg0.method881(class174.field3081, (byte) 92)) {
                class33.method187(-24696);
            }
            if (arg0.method881(class53.field805, (byte) 92)) {
                class200.field3405.method461(0);
            }
            if (arg0.method881(class175.field3092, (byte) 92)) {
                class200.field3405.method457(0);
            }
            if (arg0.method881(class55.field832, (byte) 92)) {
                class161.field2907.method1093((byte) -26);
                class59.field953.method1937((byte) 7);
                class200.field3405.method455(true);
            }
            if (arg0.method881(class183.field3195, (byte) 92)) {
                class139.field2538 = true;
            }
            if (arg0.method881(class125.field2108, (byte) 92)) {
                class280.method1872(-80, 25);
            }
            if (arg0.method881(class94.field1472, (byte) 92)) {
                class37.field550 = true;
            }
            if (arg0.method881(class14.field191, (byte) 92)) {
                class37.field550 = false;
            }
            if (arg0.method881(class129.field2211, (byte) 92)) {
                class152.method1134(-1, 0, -1, false, -1);
            }
            if (arg0.method881(class195.field3352, (byte) 92)) {
                class152.method1134(-1, 1, -1, false, -1);
            }
            if (arg0.method881(class221.field3728, (byte) 92)) {
                class152.method1134(-1, 2, -1, false, -1);
            }
            if (arg0.method881(class272.field4585, (byte) 92)) {
                class152.method1134(1024, 3, 768, false, -1);
            }
            if (arg0.method881(class9.field123, (byte) 92)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class94.field1475[var10].field460[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg0.method883(0, class257.field4326)) {
                class211.method1475(arg0.method879(-14178, 15).method836(31252));
                class123.method823(-21165, class161.field2907);
                class253.field4255 = false;
            }
            if (arg0.method883(0, class241.field4094) && class194.field3305 != 0) {
                class229.method1561(1000, arg0.method879(-14178, 6).method836(31252));
            }
            if (arg0.method881(class187.field3237, (byte) 92) && class194.field3305 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method883(0, class10.field130)) {
                class226.field3804 = arg0.method879(-14178, 12).method877(-111).method836(31252);
                class73.method530((class126) null, (byte) 89, 0, class12.method69(new class126[] { class296.field4935, class195.method1386((byte) 20, class226.field3804) }, (byte) 115));
            }
            if (arg0.method881(class124.field2098, (byte) 92)) {
                class241.field4091 = true;
            }
            if (arg0.method881(class125.field2105, (byte) 92)) {
                if (class39.field626) {
                    class250.field4183.method837(2);
                    class39.field626 = false;
                } else {
                    class186.field3219.method837(2);
                    class39.field626 = true;
                }
            }
        }
        class103.field1645.method1238(94, 119);
        class103.field1645.method933(-3, arg0.method878((byte) -128) - 1);
        int var13 = -2 / ((arg1 - 11) / 58);
        class103.field1645.method980(arg0.method879(-14178, 2), true);
        class315.field5421++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 250)
    public static final void method2034(byte arg0) {
        field5049++;
        if (!class22.method109(4096) && class297.field4944 != class131.field2250) {
            class47.method296(class286.field4744.field2460[0], class23.field329, class107.field1691, class286.field4744.field2471[0], false, class131.field2250, -82);
            return;
        }
        if (class73.field1180 != class131.field2250) {
            class73.field1180 = class131.field2250;
            class255.method1723(34, class131.field2250);
            class136.method990(255);
        }
        if (arg0 < 13) {
            field5045 = (class313) null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V", line = 282)
    public static final void method2035(byte arg0) {
        field5041++;
        class37.field546.method1178(-115);
        if (arg0 < 19) {
            method2036((byte) -58);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V", line = 293)
    public static final void method2036(byte arg0) {
        field5048++;
        if (arg0 != 49) {
            field5044 = (byte[][]) ((byte[][]) null);
        }
        if (class281.field4680 == 5) {
            class281.field4680 = 6;
        }
    }
}
