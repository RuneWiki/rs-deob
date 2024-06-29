import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class46 {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field728 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
    public static final byte[] method231(byte arg0, boolean arg1, Object arg2) {
        if (arg0 != -71) {
            field728 = -28;
        }
        field735++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class221.method1516(var3, 13087) : var3;
        } else if (arg2 instanceof class26) {
            class26 var4 = (class26) arg2;
            return var4.method139(22990);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)Lfj;")
    public static final class231 method232(int arg0, int arg1) {
        field733++;
        class231 var2 = (class231) class192.field3220.method1357((byte) 68, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 > -84) {
            method234(59, (byte) -95);
        }
        byte[] var3 = class175.field2869.method828(class107.method769(-19455, arg1), (byte) 95, class108.method786(true, arg1));
        class231 var4 = new class231();
        if (var3 != null) {
            var4.method1594(new class121(var3), 233);
        }
        class192.field3220.method1351(var4, 2, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;I)Ldf;")
    public static final class51 method233(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        field726++;
        int var3 = 0;
        int var4 = var2.length;
        if (arg1 != 100) {
            field736 = 29;
        }
        class51 var5 = new class51();
        var5.field813 = new byte[var4];
        while (var3 < var4) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 <= var3) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field813[var5.field855++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field813[var5.field855++] = (byte) var6;
            }
        }
        var5.method285(43);
        return var5.method301(arg1 ^ 0xFFFF9EA2);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)Z")
    public static final boolean method234(int arg0, byte arg1) {
        if (arg1 != 43) {
            field736 = 107;
        }
        field732++;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZILdf;)V")
    public static final void method235(boolean arg0, int arg1, class51 arg2) {
        if (arg0) {
            field734++;
            class167 var3 = class208.method1430(arg1, 2, (byte) -117);
            var3.method1162(!arg0);
            var3.field2712 = arg2;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLfe;)V")
    public static final void method236(byte arg0, class234 arg1) {
        class205.method1415((byte) 78);
        field739++;
        if (class265.field4644 != null) {
            return;
        }
        if (!class234.field4111) {
            class208.method1434(10759);
        } else if (arg0 == -74 && class19.field269 == 1) {
            int var2 = class25.field378 / 5;
            int var3 = class42.field675 + var2 + 140;
            if (class265.field4642 >= var3 && var3 + 14 >= class265.field4642 && class129.field2153 + 4 <= class221.field3834 && class129.field2153 + 18 >= class221.field3834) {
                class247.method1681((byte) 92, 0, 0);
                return;
            }
            if (class265.field4642 >= var3 + 15 && var3 + 80 >= class265.field4642 && class129.field2153 + 4 <= class221.field3834 && (class129.field2153 + 18) >= class221.field3834) {
                class247.method1681((byte) 111, 1, 0);
                return;
            }
            int var4 = var2 + class42.field675 + 250;
            if (class265.field4642 >= var4 && (var4 + 14) >= class265.field4642 && class221.field3834 >= class129.field2153 + 4 && class129.field2153 + 18 >= class221.field3834) {
                class247.method1681((byte) 110, 0, 1);
                return;
            }
            if (class265.field4642 >= (var4 + 15) && var4 + 80 >= class265.field4642 && class221.field3834 >= (class129.field2153 + 4) && class129.field2153 + 18 >= class221.field3834) {
                class247.method1681((byte) 89, 1, 1);
                return;
            }
            int var5 = class42.field675 + var2 + 360;
            if (var5 <= class265.field4642 && var5 + 14 >= class265.field4642 && class221.field3834 >= (class129.field2153 + 4) && (class129.field2153 + 18) >= class221.field3834) {
                class247.method1681((byte) 122, 0, 2);
                return;
            }
            if (class265.field4642 >= (var5 + 15) && class265.field4642 <= var5 + 80 && class221.field3834 >= class129.field2153 + 4 && (class129.field2153 + 18) >= class221.field3834) {
                class247.method1681((byte) 99, 1, 2);
                return;
            }
            int var6 = class42.field675 + var2 + 470;
            if (var6 <= class265.field4642 && var6 + 14 >= class265.field4642 && class221.field3834 >= class129.field2153 + 4 && class129.field2153 + 18 >= class221.field3834) {
                class247.method1681((byte) 104, 0, 3);
                return;
            }
            if (class265.field4642 >= var6 + 15 && class265.field4642 <= var6 + 80 && (class129.field2153 + 4) <= class221.field3834 && class221.field3834 <= class129.field2153 + 18) {
                class247.method1681((byte) 99, 1, 3);
                return;
            }
            if (class164.field2691 != -1) {
                class149 var7 = class74.field1175[class164.field2691];
                if (class44.field703 == var7.field2496) {
                    byte[] var8 = class20.method104(111, new class51[] { var7.field2497, class216.field3751 }).method291((byte) 113);
                    class238.field4142 = new String(var8, 0, var8.length);
                    class259.field4521 = var7.field2495;
                    if (class239.field4155 != 0) {
                        class138.field2320 = class259.field4521 + 40000;
                        class133.field2221 = class138.field2320;
                        class76.field1232 = class259.field4521 + 50000;
                    }
                    if (class252.field4440 != null) {
                        class252.field4440.field3700 = true;
                        class25.method135(class252.field4440, arg0 - 27940);
                    }
                    return;
                }
                class51 var9 = class33.field486;
                if (class239.field4155 != 0) {
                    var9 = class20.method104(15, new class51[] { class262.field4576, class51.method311(var7.field2495 + 7000, arg0 + 84) });
                }
                class51 var10 = class20.method104(-110, new class51[] { class145.field2420, var7.field2497, class216.field3751, var9, class162.field2653, class51.method311(class196.field3290, 10), class233.field4066, class51.method311(class5.field40, 10), class143.field2397, class51.method311(0, 10), class13.field193, class51.method311(class100.field1661, 10), class263.field4603, class51.method311(class234.field4088, arg0 ^ -68) });
                try {
                    arg1.getAppletContext().showDocument(var10.method298(0), "_self");
                    return;
                } catch (Exception var11) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIB)V")
    public static final void method237(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class51.field817 == 1) {
            class108.field1820[class192.field3228 / 100].method1103(class22.field342 - 8, class1.field7 + -8);
        }
        field727++;
        if (class51.field817 == 2) {
            class108.field1820[class192.field3228 / 100 + 4].method1103(class22.field342 - 8, class1.field7 - 8);
        }
        class128.method948((byte) -114);
        if (arg4 != 27) {
            method237(-34, -72, -105, -123, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(DZ)V")
    public static final void method238(double arg0, boolean arg1) {
        if (arg1) {
            field730 = -116;
        }
        if (class114.field1921 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class265.field4633[var3] = var4 > 255 ? 255 : var4;
            }
            class114.field1921 = arg0;
        }
        field737++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)I")
    public static final int method239(int arg0, byte arg1, int arg2) {
        field729++;
        int var3 = -125 % ((arg1 - 70) / 55);
        int var4 = arg2 + (arg0 * 57);
        int var5 = var4 << 13 ^ var4;
        int var6 = Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589;
        return var6 >> 19 & 0xFF;
    }
}
