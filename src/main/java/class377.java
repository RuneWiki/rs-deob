import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class377 {

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "Ldv;")
    public static class566 field5068 = new class566(52, 2);

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "Lej;")
    public static class104 field5069 = new class104("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    public static void method2229(int arg0) {
        if (arg0 != 21283) {
            method2232(-36, -50);
        }
        field5069 = null;
        field5068 = null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILqa;Ln;)V")
    public static final void method2230(int arg0, class207 arg1, class17 arg2) {
        field5066++;
        if (class413.field5806 == null) {
            return;
        }
        if (class132.field2109 < 10) {
            if (!class413.field5805.method251(class413.field5806.field6723, 0)) {
                class132.field2109 = class587.field8402.method214(class413.field5806.field6723, true) / 10;
                return;
            }
            class201.method1223(true);
            class132.field2109 = 10;
        }
        if (class132.field2109 == 10) {
            class413.field5826 = class413.field5806.field6727 >> 6 << 6;
            class413.field5829 = class413.field5806.field6719 >> 6 << 6;
            class413.field5821 = (class413.field5806.field6717 >> 6 << 6) - (class413.field5829 - 64);
            class413.field5839 = (class413.field5806.field6720 >> 6 << 6) + 64 - class413.field5826;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class413.field5806.method2780(class645.field9372.field6035, (class645.field9372.field6037 >> 7) + class519.field7304, var3, class6.field80 + (class645.field9372.field6029 >> 7), arg0 + -151)) {
                var4 = var3[1] - class413.field5829;
                var5 = var3[2] - class413.field5826;
            }
            if (!class559.field7748 && var4 >= 0 && class413.field5821 > var4 && var5 >= 0 && var5 < class413.field5839) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class627.field9160 = var7;
                class285.field3931 = var6;
            } else if (class88.field1388 == -1 || class378.field5075 == -1) {
                class413.field5806.method2779(var3, 12800, class413.field5806.field6730 & 0x3FFF, (class413.field5806.field6730 & 0xFFFE17C) >> 14);
                class627.field9160 = var3[2] - class413.field5826;
                class285.field3931 = var3[1] - class413.field5829;
            } else {
                class413.field5806.method2779(var3, 12800, class378.field5075, class88.field1388);
                class378.field5075 = -1;
                class88.field1388 = -1;
                if (var3 != null) {
                    class285.field3931 = var3[1] - class413.field5829;
                    class627.field9160 = var3[2] - class413.field5826;
                }
                class559.field7748 = false;
            }
            if (class413.field5806.field6713 == 37) {
                class413.field5820 = 3.0F;
                class413.field5812 = 3.0F;
            } else if (class413.field5806.field6713 == 50) {
                class413.field5820 = 4.0F;
                class413.field5812 = 4.0F;
            } else if (class413.field5806.field6713 == 75) {
                class413.field5820 = 6.0F;
                class413.field5812 = 6.0F;
            } else if (class413.field5806.field6713 == 100) {
                class413.field5820 = 8.0F;
                class413.field5812 = 8.0F;
            } else if (class413.field5806.field6713 == 200) {
                class413.field5820 = 16.0F;
                class413.field5812 = 16.0F;
            } else {
                class413.field5820 = 8.0F;
                class413.field5812 = 8.0F;
            }
            class413.field5814 = (int) class413.field5820 >> 1;
            class413.field5816 = class5.method36((byte) 118, class413.field5814);
            class399.method2386((byte) -95);
            class413.method2461();
            class317.field4305 = new class46();
            class413.field5811 += (int) (Math.random() * 5.0D) - 2;
            if (class413.field5811 < -8) {
                class413.field5811 = -8;
            }
            if (class413.field5811 > 8) {
                class413.field5811 = 8;
            }
            class413.field5817 += (int) (Math.random() * 5.0D) - 2;
            if (class413.field5817 < -16) {
                class413.field5817 = -16;
            }
            if (class413.field5817 > 16) {
                class413.field5817 = 16;
            }
            class413.method2470(arg2, class413.field5811 >> 2 << 10, class413.field5817 >> 1);
            class413.field5809.method2132(1024, -20773, 256);
            class413.field5803.method3255(256, 256, -1);
            class413.field5808.method1205(4096, (byte) -128);
            class595.field8604.method2247(arg0 ^ 0xFFFFFEBE, 256);
            class132.field2109 = 20;
        } else if (class132.field2109 == 20) {
            class225.method1440((byte) -99, true);
            class413.method2465(arg1, class413.field5811, class413.field5817);
            class132.field2109 = 60;
            class225.method1440((byte) -99, true);
            class16.method183((byte) 119);
        } else if (class132.field2109 == 60) {
            if (class413.field5805.method222((byte) 88, class413.field5806.field6723 + "_staticelements")) {
                if (!class413.field5805.method251(class413.field5806.field6723 + "_staticelements", 0)) {
                    return;
                }
                class413.field5815 = class58.method529(class413.field5806.field6723 + "_staticelements", 125, class467.field6579, class413.field5805);
            } else {
                class413.field5815 = new class525(0);
            }
            class413.method2472();
            class132.field2109 = 70;
            class225.method1440((byte) -99, true);
            class16.method183((byte) 127);
        } else if (class132.field2109 == 70) {
            class132.field2105 = new class240(arg1, 11, true, class166.field2390);
            class132.field2109 = 73;
            class225.method1440((byte) -99, true);
            class16.method183((byte) 122);
        } else if (class132.field2109 == 73) {
            class183.field2588 = new class240(arg1, 12, true, class166.field2390);
            class132.field2109 = 76;
            class225.method1440((byte) -99, true);
            class16.method183((byte) 113);
        } else if (class132.field2109 == 76) {
            class205.field2886 = new class240(arg1, 14, true, class166.field2390);
            class132.field2109 = 79;
            class225.method1440((byte) -99, true);
            class16.method183((byte) 120);
        } else if (class132.field2109 == 79) {
            class20.field252 = new class240(arg1, 17, true, class166.field2390);
            class132.field2109 = 82;
            class225.method1440((byte) -99, true);
            class16.method183((byte) 119);
        } else if (class132.field2109 == 82) {
            class39.field793 = new class240(arg1, 19, true, class166.field2390);
            class132.field2109 = 85;
            class225.method1440((byte) -99, true);
            class16.method183((byte) 114);
        } else if (class132.field2109 == 85) {
            class473.field6655 = new class240(arg1, 22, true, class166.field2390);
            class132.field2109 = 88;
            class225.method1440((byte) -99, true);
            class16.method183((byte) 120);
        } else if (class132.field2109 == 88) {
            class139.field2178 = new class240(arg1, 26, true, class166.field2390);
            class132.field2109 = 91;
            class225.method1440((byte) -99, true);
            class16.method183((byte) 118);
        } else {
            class648.field9398 = new class240(arg1, 30, true, class166.field2390);
            if (arg0 != 256) {
                field5068 = null;
            }
            class132.field2109 = 100;
            class225.method1440((byte) -99, true);
            class16.method183((byte) 123);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ldaa;Z)Lpo;")
    public static final class479 method2231(class11 arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field5065++;
            return new class479(arg0.method111(-126), arg0.method111(-124), arg0.method111(-128), arg0.method111(-127), arg0.method89((byte) -121), arg0.method89((byte) -58), arg0.method110((byte) 55));
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Z")
    public static final boolean method2232(int arg0, int arg1) {
        field5067++;
        if (class197.field2797[arg1]) {
            return true;
        } else if (class313.field4217.method244(arg1, 0)) {
            int var2 = class313.field4217.method231(arg1, -121);
            if (var2 == 0) {
                class197.field2797[arg1] = true;
                return true;
            }
            if (class618.field8850[arg1] == null) {
                class618.field8850[arg1] = new class114[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class618.field8850[arg1][var3] == null) {
                    byte[] var4 = class313.field4217.method240(arg1, var3, (byte) -124);
                    if (var4 != null) {
                        class114 var5 = class618.field8850[arg1][var3] = new class114();
                        var5.field1810 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method802((byte) -115, new class11(var4));
                    }
                }
            }
            class197.field2797[arg1] = true;
            if (arg0 < 119) {
                method2231(null, false);
            }
            return true;
        } else {
            return false;
        }
    }
}
