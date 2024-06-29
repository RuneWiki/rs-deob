import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class55 {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Z")
    public static boolean field1070 = false;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field1069 = 0;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lhi;")
    public static class282 field1066 = new class282();

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Z")
    public static boolean field1074;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 4)
    public static void method468(byte arg0) {
        if (arg0 != 13) {
            method473(11, (byte) -106);
        }
        field1066 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 16)
    public static final void method469(byte arg0) {
        field1065++;
        if (arg0 == 36) {
            class158.field2642.method1349(true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 27)
    public static final void method470(Component arg0, int arg1) {
        field1067++;
        int var2 = -60 % ((arg1 + 65) / 50);
        Method var3 = class107.field1888;
        if (var3 != null) {
            try {
                var3.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        arg0.addKeyListener(class306.field5135);
        arg0.addFocusListener(class306.field5135);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lce;III)Lmb;", line = 58)
    public static final class99 method471(class239 arg0, int arg1, int arg2, int arg3) {
        field1068++;
        if (arg1 != 12267) {
            field1066 = (class282) null;
        }
        return class272.method1881(arg0, arg3, arg2, 929) ? class297.method2027(arg1 ^ 0x2FEB) : null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 77)
    public static final void method472(int arg0) {
        field1072++;
        if (class149.method1121(1) != 2) {
            return;
        }
        if (arg0 != 1621) {
            field1074 = false;
        }
        int var1 = field1069 % 104;
        byte var2 = (byte) (field1069 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class255.field4241[var3][var1][var4] = var2;
            }
        }
        if (class160.field2671 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class130.field2226[var5] = -1000000;
            class54.field1053[var5] = 1000000;
            class102.field1791[var5] = 0;
            class298.field4984[var5] = 1000000;
            class19.field321[var5] = 0;
        }
        if (class103.field1814 != 1) {
            int var6 = class293.method2012(class160.field2671, class289.field4841, 0, class238.field3922);
            if (var6 - class116.field1988 < 800 && (class274.field4564[class160.field2671][class238.field3922 >> 7][class289.field4841 >> 7] & 0x4) != 0) {
                class110.method828(class289.field4841 >> 7, class93.field1690, 4, 1, class238.field3922 >> 7, false);
            }
            return;
        }
        if ((class274.field4564[class160.field2671][class255.field4233.field1531 >> 7][class255.field4233.field1497 >> 7] & 0x4) != 0) {
            class110.method828(class255.field4233.field1497 >> 7, class93.field1690, arg0 - 1617, 0, class255.field4233.field1531 >> 7, false);
        }
        if (class58.field1107 >= 310) {
            return;
        }
        int var7 = class238.field3922 >> 7;
        int var8 = class255.field4233.field1531 >> 7;
        int var9 = class289.field4841 >> 7;
        int var10;
        if (var7 >= var8) {
            var10 = var7 - var8;
        } else {
            var10 = var8 - var7;
        }
        int var11 = class255.field4233.field1497 >> 7;
        int var12;
        if (var11 > var9) {
            var12 = var11 - var9;
        } else {
            var12 = var9 - var11;
        }
        if (var12 >= var10) {
            int var15 = var10 * 65536 / var12;
            int var16 = 32768;
            while (var9 != var11) {
                if (var9 < var11) {
                    var9++;
                } else if (var11 < var9) {
                    var9--;
                }
                if ((class274.field4564[class160.field2671][var7][var9] & 0x4) != 0) {
                    class110.method828(var9, class93.field1690, arg0 ^ 0x651, 1, var7, false);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var7 < var8) {
                        var7++;
                    } else if (var7 > var8) {
                        var7--;
                    }
                    var16 -= 65536;
                    if ((class274.field4564[class160.field2671][var7][var9] & 0x4) != 0) {
                        class110.method828(var9, class93.field1690, 4, 1, var7, false);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var10;
        int var14 = 32768;
        while (var7 != var8) {
            if (var8 > var7) {
                var7++;
            } else if (var8 < var7) {
                var7--;
            }
            if ((class274.field4564[class160.field2671][var7][var9] & 0x4) != 0) {
                class110.method828(var9, class93.field1690, 4, 1, var7, false);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var9 < var11) {
                    var9++;
                } else if (var9 > var11) {
                    var9--;
                }
                var14 -= 65536;
                if ((class274.field4564[class160.field2671][var7][var9] & 0x4) != 0) {
                    class110.method828(var9, class93.field1690, 4, 1, var7, false);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V", line = 275)
    public static final void method473(int arg0, byte arg1) {
        field1071++;
        class300.field5026 = arg0;
        class34.method292(17530, 3);
        if (arg1 != -95) {
            method473(20, (byte) 110);
        }
        class34.method292(17530, 4);
    }
}
