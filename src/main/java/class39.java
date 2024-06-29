import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 extends class105 {

    @OriginalMember(owner = "client!fc", name = "rb", descriptor = "Lob;")
    public static class99 field699 = new class99(50);

    @OriginalMember(owner = "client!fc", name = "xb", descriptor = "Lje;")
    public static class67 field705 = class85.method592(255, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!fc", name = "wb", descriptor = "Lje;")
    private static class67 field704 = class85.method592(255, "Loading title screen )2 ");

    @OriginalMember(owner = "client!fc", name = "zb", descriptor = "Lje;")
    private static class67 field707 = class85.method592(255, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!fc", name = "yb", descriptor = "Lje;")
    public static class67 field706 = field704;

    @OriginalMember(owner = "client!fc", name = "vb", descriptor = "Lje;")
    public static class67 field703 = field707;

    @OriginalMember(owner = "client!fc", name = "Ab", descriptor = "I")
    public static int field708 = -1;

    @OriginalMember(owner = "client!fc", name = "ub", descriptor = "Lob;")
    public static class99 field702 = new class99(64);

    @OriginalMember(owner = "client!fc", name = "Eb", descriptor = "Lje;")
    private static class67 field712 = class85.method592(255, "flash2:");

    @OriginalMember(owner = "client!fc", name = "Cb", descriptor = "Lje;")
    public static class67 field710 = field712;

    @OriginalMember(owner = "client!fc", name = "Db", descriptor = "Lje;")
    public static class67 field711 = field712;

    @OriginalMember(owner = "client!fc", name = "kb", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!fc", name = "lb", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!fc", name = "mb", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!fc", name = "nb", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!fc", name = "ob", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!fc", name = "pb", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!fc", name = "qb", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!fc", name = "sb", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!fc", name = "tb", descriptor = "Lt;")
    public static class132 field701;

    @OriginalMember(owner = "client!fc", name = "Bb", descriptor = "Lua;")
    public static class140 field709;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)Z")
    public static final boolean method240(byte arg0) {
        field700++;
        try {
            int var1 = 91 % ((10 - arg0) / 51);
            if (class95.field2126 == 2) {
                if (class35.field651 == null) {
                    class35.field651 = class109.method860(class147.field3360, class68.field1369, class144.field3309);
                    if (class35.field651 == null) {
                        return false;
                    }
                }
                if (class114.field2588 == null) {
                    class114.field2588 = new class2(class46.field857, class69.field1403);
                }
                if (class154.field3499.method1067(class145.field3347, class35.field651, 22050, (byte) -104, class114.field2588)) {
                    class154.field3499.method1084(-1);
                    class154.field3499.method1078(class32.field578, 14281);
                    class154.field3499.method1086(0, class35.field651, class127.field2797);
                    class147.field3360 = null;
                    class35.field651 = null;
                    class95.field2126 = 0;
                    class114.field2588 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class154.field3499.method1071(true);
            class147.field3360 = null;
            class114.field2588 = null;
            class95.field2126 = 0;
            class35.field651 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)I")
    public static final int method241(int arg0) {
        if (arg0 < 126) {
            return -46;
        }
        int var1 = 3;
        if (class46.field853 < 310) {
            int var2 = class101.field2274 >> 7;
            int var3 = class152.field3486 >> 7;
            if ((class82.field1809[class128.field2817][var2][var3] & 0x4) != 0) {
                var1 = class128.field2817;
            }
            int var4 = class37.field667.field2957 >> 7;
            int var5;
            if (var2 >= var4) {
                var5 = var2 - var4;
            } else {
                var5 = var4 - var2;
            }
            int var6 = class37.field667.field2963 >> 7;
            int var7;
            if (var3 < var6) {
                var7 = var6 - var3;
            } else {
                var7 = var3 - var6;
            }
            if (var7 >= var5) {
                int var8 = var5 * 65536 / var7;
                int var9 = 32768;
                while (var3 != var6) {
                    var9 += var8;
                    if (var3 < var6) {
                        var3++;
                    } else if (var6 < var3) {
                        var3--;
                    }
                    if ((class82.field1809[class128.field2817][var2][var3] & 0x4) != 0) {
                        var1 = class128.field2817;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var4 < var2) {
                            var2--;
                        }
                        if ((class82.field1809[class128.field2817][var2][var3] & 0x4) != 0) {
                            var1 = class128.field2817;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var5;
                int var11 = 32768;
                while (var2 != var4) {
                    var11 += var10;
                    if (var4 > var2) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class82.field1809[class128.field2817][var2][var3] & 0x4) != 0) {
                        var1 = class128.field2817;
                    }
                    if (var11 >= 65536) {
                        if (var6 > var3) {
                            var3++;
                        } else if (var3 > var6) {
                            var3--;
                        }
                        if ((class82.field1809[class128.field2817][var2][var3] & 0x4) != 0) {
                            var1 = class128.field2817;
                        }
                        var11 -= 65536;
                    }
                }
            }
        }
        field693++;
        if ((class82.field1809[class128.field2817][class37.field667.field2957 >> 7][class37.field667.field2963 >> 7] & 0x4) != 0) {
            var1 = class128.field2817;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
    public static final void method242(int arg0, int arg1) {
        if (arg0 != 4689) {
            method244(true, 40, 49, null, 71, 52, -54);
        }
        field692++;
        if (arg1 == -3) {
            class68.method501(class129.field2831, class9.field193, class127.field2786, (byte) -47);
        } else if (arg1 == -2) {
            class68.method501(class158.field3630, class9.field191, class9.field194, (byte) -73);
        } else if (arg1 == -1) {
            class68.method501(class129.field2826, class9.field164, class4.field67, (byte) -10);
        } else if (arg1 == 3) {
            class68.method501(class127.field2780, class9.field178, class9.field157, (byte) -122);
        } else if (arg1 == 4) {
            class68.method501(class77.field1689, class9.field173, class23.field425, (byte) -32);
        } else if (arg1 == 5) {
            class68.method501(class115.field2605, class9.field190, class106.field2431, (byte) -34);
        } else if (arg1 == 6) {
            class68.method501(class61.field1212, class9.field197, class147.field3362, (byte) -98);
        } else if (arg1 == 7) {
            class68.method501(class128.field2808, class9.field175, class14.field243, (byte) -89);
        } else if (arg1 == 8) {
            class68.method501(class79.field1713, class9.field169, class27.field490, (byte) -89);
        } else if (arg1 == 9) {
            class68.method501(class142.field3249, class9.field165, class137.field3093, (byte) -12);
        } else if (arg1 == 10) {
            class68.method501(class91.field2010, class9.field180, class27.field483, (byte) -26);
        } else if (arg1 == 11) {
            class68.method501(class15.field265, class9.field198, class55.field1075, (byte) -107);
        } else if (arg1 == 12) {
            class68.method501(class150.field3448, class9.field204, class4.field66, (byte) -110);
        } else if (arg1 == 13) {
            class68.method501(class129.field2833, class9.field159, class59.field1188, (byte) -98);
        } else if (arg1 == 14) {
            class68.method501(class121.field2719, class9.field192, class29.field511, (byte) -60);
        } else if (arg1 == 16) {
            class68.method501(class64.field1250, class9.field182, class52.field1031, (byte) -57);
        } else if (arg1 == 17) {
            class68.method501(class148.field3384, class9.field163, class112.field2554, (byte) -78);
        } else if (arg1 == 18) {
            class68.method501(class92.field2067, class9.field183, class45.field842, (byte) -79);
        } else if (arg1 == 19) {
            class68.method501(class66.field1280, class128.field2815, class144.field3310, (byte) -68);
        } else if (arg1 == 20) {
            class68.method501(class129.field2827, class9.field186, class17.field308, (byte) -114);
        } else if (arg1 == 22) {
            class68.method501(class16.field280, class9.field166, class80.field1763, (byte) -40);
        } else if (arg1 == 23) {
            class68.method501(class121.field2714, class9.field203, class29.field523, (byte) -35);
        } else if (arg1 == 24) {
            class68.method501(class101.field2266, class9.field195, class117.field2649, (byte) -94);
        } else if (arg1 == 25) {
            class68.method501(class129.field2836, class9.field200, class66.field1283, (byte) -63);
        } else if (arg1 == 26) {
            class68.method501(class67.field1309, class9.field161, class135.field3069, (byte) -60);
        } else if (arg1 == 27) {
            class68.method501(class99.field2202, class9.field185, class9.field176, (byte) -33);
        } else {
            class68.method501(class129.field2824, class9.field167, class112.field2566, (byte) -125);
        }
        class27.method181(10, -58);
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
    public static void method243(int arg0) {
        field703 = null;
        field712 = null;
        field705 = null;
        if (arg0 != 32768) {
            field703 = null;
        }
        field704 = null;
        field701 = null;
        field710 = null;
        field699 = null;
        field711 = null;
        field702 = null;
        field707 = null;
        field709 = null;
        field706 = null;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)Lad;")
    public final class5 method16(int arg0) {
        if (arg0 != 0) {
            field708 = -51;
        }
        field696++;
        return class123.method961(this.field698, arg0 ^ 0x67A).method818(this.field694, 23288);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZIILfd;III)V")
    public static final void method244(boolean arg0, int arg1, int arg2, class40 arg3, int arg4, int arg5, int arg6) {
        class32.field578 = arg4;
        field697++;
        class68.field1369 = arg6;
        class95.field2126 = 1;
        class147.field3360 = arg3;
        class144.field3309 = arg1;
        class86.field1916 = arg5;
        class127.field2797 = arg0;
        if (arg2 != 4) {
            method243(2);
        }
    }
}
