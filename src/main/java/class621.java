import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class621 {

    @OriginalMember(owner = "client!et", name = "d", descriptor = "Ljw;")
    public static class581 field8369 = new class581(93, 6);

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "[I")
    public static int[] field8370;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
    public static void method3408(byte arg0) {
        field8369 = null;
        field8370 = null;
        if (arg0 > 0) {
            field8369 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IZLor;I)V")
    public static final void method3409(int arg0, boolean arg1, class668 arg2, int arg3) {
        field8368++;
        if (arg1) {
            field8369 = null;
        }
        class514 var4 = arg2.method3697(0, class379.field5542);
        if (var4 == null) {
            return;
        }
        class379.field5542.method456(arg0, arg3, arg0 + arg2.field9282, arg2.field9297 + arg3);
        if (class227.field3104 >= 3) {
            class379.field5542.method518(-16777216, var4, arg0, arg3);
        } else {
            class558.field7521.method1099((float) arg2.field9282 / 2.0F + (float) arg0, (float) arg2.field9297 / 2.0F + (float) arg3, 4096, ((int) (-class135.field1974) & 0x3FFF) << 2, var4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)I")
    public static final int method3410(int arg0) {
        field8366++;
        return ~class669.field9399 == arg0 ? class107.field1479 : 0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ld;Lha;B)V")
    public static final void method3411(class161 arg0, class65 arg1, byte arg2) {
        field8367++;
        if (class375.field5414 == null) {
            return;
        }
        if (class37.field579 < 10) {
            if (!class375.field5411.method2110(true, class375.field5414.field6699)) {
                class37.field579 = class466.field6466.method2116(102, class375.field5414.field6699) / 10;
                return;
            }
            class391.method2477(59);
            class37.field579 = 10;
        }
        if (class37.field579 == 10) {
            class375.field5434 = class375.field5414.field6720 >> 6 << 6;
            class375.field5447 = class375.field5414.field6697 >> 6 << 6;
            class375.field5436 = (class375.field5414.field6717 >> 6 << 6) + 64 - class375.field5434;
            class375.field5448 = (class375.field5414.field6714 >> 6 << 6) + 64 - class375.field5447;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class375.field5414.method2814(-67, class230.field3147 + (class551.field7456.field2259 >> 9), (class551.field7456.field2257 >> 9) + class121.field1765, var3, class551.field7456.field2250)) {
                var5 = var3[2] - class375.field5434;
                var4 = var3[1] - class375.field5447;
            }
            if (!class104.field1437 && var4 >= 0 && class375.field5448 > var4 && var5 >= 0 && class375.field5436 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class276.field4092 = var6;
                class66.field947 = var7;
            } else if (class777.field10680 == -1 || class180.field2388 == -1) {
                class375.field5414.method2813(class375.field5414.field6711 & 0x3FFF, 1, (class375.field5414.field6711 & 0xFFFE82A) >> 14, var3);
                class276.field4092 = var3[1] - class375.field5447;
                class66.field947 = var3[2] - class375.field5434;
            } else {
                class375.field5414.method2813(class180.field2388, 1, class777.field10680, var3);
                if (var3 != null) {
                    class66.field947 = var3[2] - class375.field5434;
                    class276.field4092 = var3[1] - class375.field5447;
                }
                class104.field1437 = false;
                class180.field2388 = -1;
                class777.field10680 = -1;
            }
            if (class375.field5414.field6721 == 37) {
                class375.field5429 = 3.0F;
                class375.field5422 = 3.0F;
            } else if (class375.field5414.field6721 == 50) {
                class375.field5429 = 4.0F;
                class375.field5422 = 4.0F;
            } else if (class375.field5414.field6721 == 75) {
                class375.field5429 = 6.0F;
                class375.field5422 = 6.0F;
            } else if (class375.field5414.field6721 == 100) {
                class375.field5429 = 8.0F;
                class375.field5422 = 8.0F;
            } else if (class375.field5414.field6721 == 200) {
                class375.field5429 = 16.0F;
                class375.field5422 = 16.0F;
            } else {
                class375.field5429 = 8.0F;
                class375.field5422 = 8.0F;
            }
            class375.field5426 = (int) class375.field5429 >> 1;
            class375.field5420 = class207.method1382(class375.field5426, 8);
            class155.method1131((byte) 73);
            class375.method2330();
            class101.field1413 = new class412();
            class375.field5424 += (int) (Math.random() * 5.0D) - 2;
            if (class375.field5424 < -8) {
                class375.field5424 = -8;
            }
            if (class375.field5424 > 8) {
                class375.field5424 = 8;
            }
            class375.field5421 += (int) (Math.random() * 5.0D) - 2;
            if (class375.field5421 < -16) {
                class375.field5421 = -16;
            }
            if (class375.field5421 > 16) {
                class375.field5421 = 16;
            }
            class375.method2346(arg0, class375.field5424 >> 2 << 10, class375.field5421 >> 1);
            class375.field5418.method2234(1024, 1, 256);
            class375.field5416.method392(true, 256, 256);
            class375.field5412.method3735(11, 4096);
            class642.field8904.method3239(256, true);
            class37.field579 = 20;
        } else if (class37.field579 == 20) {
            class253.method1689((byte) -52, true);
            class375.method2344(arg1, class375.field5424, class375.field5421);
            class37.field579 = 60;
            class253.method1689((byte) -69, true);
            class596.method3321(-33);
        } else if (class37.field579 == 60) {
            if (class375.field5411.method2098((byte) 100, class375.field5414.field6699 + "_staticelements")) {
                if (!class375.field5411.method2110(true, class375.field5414.field6699 + "_staticelements")) {
                    return;
                }
                class375.field5427 = class244.method1572(class375.field5414.field6699 + "_staticelements", class375.field5411, -69, class196.field2619);
            } else {
                class375.field5427 = new class517(0);
            }
            class375.method2332();
            class37.field579 = 70;
            class253.method1689((byte) -60, true);
            class596.method3321(-33);
        } else if (class37.field579 == 70) {
            class28.field412 = new class480(arg1, 11, true, class706.field9894);
            class37.field579 = 73;
            class253.method1689((byte) -98, true);
            class596.method3321(-33);
        } else if (class37.field579 == 73) {
            class742.field10244 = new class480(arg1, 12, true, class706.field9894);
            class37.field579 = 76;
            class253.method1689((byte) -67, true);
            class596.method3321(-33);
        } else if (class37.field579 == 76) {
            class425.field6066 = new class480(arg1, 14, true, class706.field9894);
            class37.field579 = 79;
            class253.method1689((byte) -75, true);
            class596.method3321(-33);
        } else if (class37.field579 == 79) {
            class12.field192 = new class480(arg1, 17, true, class706.field9894);
            class37.field579 = 82;
            class253.method1689((byte) -30, true);
            class596.method3321(-33);
        } else if (class37.field579 == 82) {
            class45.field685 = new class480(arg1, 19, true, class706.field9894);
            class37.field579 = 85;
            class253.method1689((byte) -52, true);
            class596.method3321(-33);
        } else if (class37.field579 == 85) {
            class419.field6021 = new class480(arg1, 22, true, class706.field9894);
            class37.field579 = 88;
            class253.method1689((byte) -120, true);
            class596.method3321(-33);
        } else if (class37.field579 == 88) {
            class603.field8204 = new class480(arg1, 26, true, class706.field9894);
            class37.field579 = 91;
            class253.method1689((byte) -97, true);
            class596.method3321(-33);
        } else if (arg2 <= -23) {
            class760.field10520 = new class480(arg1, 30, true, class706.field9894);
            class37.field579 = 100;
            class253.method1689((byte) -86, true);
            class596.method3321(-33);
            System.gc();
        }
    }
}
