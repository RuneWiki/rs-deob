import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class119 extends class184 {

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public int field2048;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "Lsf;")
    public static class108 field2047 = class140.method973(255, "Module texte charg-B");

    @OriginalMember(owner = "client!el", name = "y", descriptor = "Z")
    public static boolean field2046 = false;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lca;BLsf;)Lsf;", line = 5)
    public static final class108 method836(class98 arg0, byte arg1, class108 arg2) {
        if (arg2.method762(class96.field1548, arg1 ^ 0x2F) != -1) {
            label65: while (true) {
                int var3 = arg2.method762(class120.field2058, arg1 ^ 0xFFFFFFA7);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method762(class88.field1397, 64);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method762(class136.field2403, arg1 - 157);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method762(class324.field5530, 125);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method762(class57.field836, 72);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method762(class20.field298, -47);
                                                        if (var8 == -1) {
                                                            break label65;
                                                        }
                                                        class108 var9 = class63.field1016;
                                                        if (class36.field509 != null) {
                                                            var9 = class277.method2006(class36.field509.field3688, 105);
                                                            try {
                                                                if (class36.field509.field3685 != null) {
                                                                    byte[] var10 = ((String) class36.field509.field3685).getBytes("ISO-8859-1");
                                                                    var9 = class304.method2137((byte) 107, 0, var10, var10.length);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg2 = class117.method833(new class108[] { arg2.method750(false, 0, var8), var9, arg2.method788(var8 + 4, 32299) }, false);
                                                    }
                                                }
                                                arg2 = class117.method833(new class108[] { arg2.method750(false, 0, var7), class78.method509((byte) -50, class99.method691(0, 4, arg0)), arg2.method788(var7 + 2, 32299) }, false);
                                            }
                                        }
                                        arg2 = class117.method833(new class108[] { arg2.method750(false, 0, var6), class78.method509((byte) -103, class99.method691(0, 3, arg0)), arg2.method788(var6 + 2, 32299) }, false);
                                    }
                                }
                                arg2 = class117.method833(new class108[] { arg2.method750(false, 0, var5), class78.method509((byte) -36, class99.method691(0, 2, arg0)), arg2.method788(var5 + 2, 32299) }, false);
                            }
                        }
                        arg2 = class117.method833(new class108[] { arg2.method750(false, 0, var4), class78.method509((byte) 99, class99.method691(0, 1, arg0)), arg2.method788(var4 + 2, 32299) }, false);
                    }
                }
                arg2 = class117.method833(new class108[] { arg2.method750(false, 0, var3), class78.method509((byte) 120, class99.method691(0, 0, arg0)), arg2.method788(var3 + 2, 32299) }, false);
            }
        }
        field2044++;
        if (arg1 != 77) {
            field2046 = true;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V", line = 101)
    public static final void method837() {
        if (class303.field5269 != null) {
            for (int var0 = 0; var0 < class303.field5269.length; var0++) {
                for (int var1 = 0; var1 < class320.field5489; var1++) {
                    for (int var2 = 0; var2 < class325.field5535; var2++) {
                        class303.field5269[var0][var1][var2] = null;
                    }
                }
            }
        }
        class295.field5149 = (class133[][]) null;
        if (class206.field3701 != null) {
            for (int var3 = 0; var3 < class206.field3701.length; var3++) {
                for (int var4 = 0; var4 < class320.field5489; var4++) {
                    for (int var5 = 0; var5 < class325.field5535; var5++) {
                        class206.field3701[var3][var4][var5] = null;
                    }
                }
            }
        }
        class200.field3623 = (class133[][]) null;
        class145.field2621 = 0;
        if (class285.field4985 != null) {
            for (int var6 = 0; var6 < class145.field2621; var6++) {
                class285.field4985[var6] = null;
            }
        }
        if (class182.field3349 != null) {
            for (int var7 = 0; var7 < class74.field1146; var7++) {
                class182.field3349[var7] = null;
            }
            class74.field1146 = 0;
        }
        if (class72.field1098 != null) {
            for (int var8 = 0; var8 < class72.field1098.length; var8++) {
                class72.field1098[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)V", line = 231)
    public static void method838(byte arg0) {
        field2047 = null;
        if (arg0 != -24) {
            method839((byte) -122);
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(B)V", line = 241)
    public static final void method839(byte arg0) {
        field2045++;
        if (class294.method2096(57) != 2) {
            return;
        }
        byte var1 = (byte) (class278.field4886 - 4 & 0xFF);
        int var2 = class278.field4886 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class327.field5582[var3][var2][var4] = var1;
            }
        }
        if (class295.field5159 == 3) {
            return;
        }
        if (arg0 != 117) {
            field2046 = true;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class9.field117[var5] = -1000000;
            class137.field2418[var5] = 1000000;
            class203.field3673[var5] = 0;
            class185.field3402[var5] = 1000000;
            class282.field4937[var5] = 0;
        }
        if (class63.field1021 != 1) {
            int var6 = class45.method321(arg0 - 222, class255.field4443, class15.field193, class295.field5159);
            if ((var6 - class42.field560) < 800 && (class166.field2980[class295.field5159][class15.field193 >> 7][class255.field4443 >> 7] & 0x4) != 0) {
                class169.method1174(-54, 1, class15.field193 >> 7, class99.field1759, false, class255.field4443 >> 7);
            }
            return;
        }
        if ((class166.field2980[class295.field5159][class95.field1513.field4452 >> 7][class95.field1513.field4457 >> 7] & 0x4) != 0) {
            class169.method1174(arg0 ^ 0xFFFFFF97, 0, class95.field1513.field4452 >> 7, class99.field1759, false, class95.field1513.field4457 >> 7);
        }
        if (class135.field2346 >= 310) {
            return;
        }
        int var7 = class15.field193 >> 7;
        int var8 = class95.field1513.field4452 >> 7;
        int var9 = class255.field4443 >> 7;
        int var10 = class95.field1513.field4457 >> 7;
        int var11;
        if (var8 <= var7) {
            var11 = var7 - var8;
        } else {
            var11 = var8 - var7;
        }
        int var12;
        if (var10 > var9) {
            var12 = var10 - var9;
        } else {
            var12 = var9 - var10;
        }
        if (var12 < var11) {
            int var15 = 32768;
            int var16 = var12 * 65536 / var11;
            while (var7 != var8) {
                if (var8 > var7) {
                    var7++;
                } else if (var7 > var8) {
                    var7--;
                }
                if ((class166.field2980[class295.field5159][var7][var9] & 0x4) != 0) {
                    class169.method1174(-13, 1, var7, class99.field1759, false, var9);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    if (var10 > var9) {
                        var9++;
                    } else if (var10 < var9) {
                        var9--;
                    }
                    var15 -= 65536;
                    if ((class166.field2980[class295.field5159][var7][var9] & 0x4) != 0) {
                        class169.method1174(-60, 1, var7, class99.field1759, false, var9);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var11 * 65536 / var12;
        int var14 = 32768;
        while (var9 != var10) {
            if (var9 < var10) {
                var9++;
            } else if (var9 > var10) {
                var9--;
            }
            if ((class166.field2980[class295.field5159][var7][var9] & 0x4) != 0) {
                class169.method1174(-75, 1, var7, class99.field1759, false, var9);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var7 < var8) {
                    var7++;
                } else if (var7 > var8) {
                    var7--;
                }
                if ((class166.field2980[class295.field5159][var7][var9] & 0x4) != 0) {
                    class169.method1174(arg0 ^ 0xFFFFFFFE, 1, var7, class99.field1759, false, var9);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(II)V", line = 437)
    public class119(int arg0, int arg1) {
        this.field2048 = arg1;
        this.field2043 = arg0;
    }
}
