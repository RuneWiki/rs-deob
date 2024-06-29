import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class79 extends class24 {

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    private final int field1513;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    private final int field1509;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    private final int field1515;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    private final int field1508;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field1504 = 0;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field1506 = -1;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field1516 = 0;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "[[I")
    public static int[][] field1511 = new int[5][5000];

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "Lud;")
    private static class279 field1510 = class130.method1024("Please remove ", 255);

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Lud;")
    public static class279 field1519 = field1510;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Lud;")
    public static class279 field1507 = field1510;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZI)V", line = 4)
    public final void method214(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method217(-21, 57, -51);
        }
        field1514++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V", line = 15)
    public final void method216(int arg0, int arg1, int arg2) {
        int var4 = -79 % ((arg0 + 72) / 34);
        field1512++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V", line = 32)
    public static void method657(boolean arg0) {
        field1510 = null;
        field1511 = (int[][]) null;
        if (arg0) {
            field1516 = 91;
        }
        field1519 = null;
        field1507 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIII)V", line = 44)
    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1513 = arg3;
        this.field1509 = arg0;
        this.field1515 = arg1;
        this.field1508 = arg2;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(III)Lrm;", line = 60)
    public static final class243 method658(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class243 var4 = var3.field3440;
            var3.field3440 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([SI)[S", line = 85)
    public static final short[] method659(short[] arg0, int arg1) {
        field1518++;
        if (arg0 == null) {
            return null;
        }
        short[] var2 = new short[arg0.length];
        if (arg1 > -17) {
            method661((byte) -54, -3);
        }
        class25.method220(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 108)
    public static final void method660(byte arg0) {
        if (arg0 < 8) {
            method657(true);
        }
        field1505++;
        if (class85.field1609 == null) {
            return;
        }
        if (class302.field5374 < 10) {
            if (!class99.field1852.method1163(class85.field1609.field896, 86)) {
                class302.field5374 = class326.field5674.method1194((byte) -103, class85.field1609.field896) / 10;
                return;
            }
            class221.method1621((byte) 57);
            class302.field5374 = 10;
        }
        if (class302.field5374 == 10) {
            if (class85.field1609.field904 == 37) {
                class52.field1071 = 3.0F;
                class183.field3356 = 3.0F;
            } else if (class85.field1609.field904 == 50) {
                class52.field1071 = 4.0F;
                class183.field3356 = 4.0F;
            } else if (class85.field1609.field904 == 75) {
                class52.field1071 = 6.0F;
                class183.field3356 = 6.0F;
            } else if (class85.field1609.field904 == 100) {
                class52.field1071 = 8.0F;
                class183.field3356 = 8.0F;
            } else if (class85.field1609.field904 == 200) {
                class52.field1071 = 16.0F;
                class183.field3356 = 16.0F;
            } else {
                class52.field1071 = 8.0F;
                class183.field3356 = 8.0F;
            }
            class245.field4356 = class85.field1609.field899 >> 6 << 6;
            class121.field2180 = (class85.field1609.field903 >> 6 << 6) + 64 - class245.field4356;
            int var1 = class112.field2058 + (class72.field1420.field86 >> 7) - class245.field4356;
            class34.field777 = class85.field1609.field900 >> 6 << 6;
            class166.field3007 = (class85.field1609.field902 >> 6 << 6) + 64 - class34.field777;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class166.field3007 - class12.field396 - ((class72.field1420.field79 >> 7) + -class34.field777) - 1;
            int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
            if (var2 >= 0 && var2 < class121.field2180 && var4 >= 0 && var4 < class166.field3007) {
                class265.field4776 = var2;
                class298.field5282 = var4;
            } else {
                class265.field4776 = class85.field1609.field895 * 64 - class245.field4356;
                class298.field5282 = class34.field777 + class166.field3007 - class85.field1609.field910 * 64 - 1;
            }
            class239.method1717(-2984);
            int var5 = class119.field2146 >> 2 << 10;
            class102.field1923 = new int[class192.field3469 + 1];
            int var6 = class166.field3007 >> 6;
            int var7 = class121.field2180 >> 6;
            class204.field3630 = new int[var7][var6][];
            class247.field4397 = new byte[var7][var6][];
            class232.field4067 = new int[var7][var6][];
            class306.field5440 = new int[var7][var6][];
            int var8 = class69.field1366 >> 1;
            class7.field141 = new byte[var7][var6][];
            class231.field4048 = new byte[var7][var6][];
            class318.field5580 = new byte[var7][var6][];
            class62.field1280 = new byte[var7][var6][];
            class290.method2071(var8, (byte) -69, var5);
            class302.field5374 = 20;
        } else if (class302.field5374 == 20) {
            class101.method857(new class53(class99.field1852.method1193(127, class85.field1609.field896, class21.field591)), 127);
            class302.field5374 = 30;
            class51.method432((byte) -100, true);
            class142.method1092(89);
        } else if (class302.field5374 == 30) {
            class120.method954(new class53(class99.field1852.method1193(94, class85.field1609.field896, class177.field3180)), (byte) 52);
            class302.field5374 = 40;
            class142.method1092(93);
        } else if (class302.field5374 == 40) {
            class260.method1861(-126, new class53(class99.field1852.method1193(88, class85.field1609.field896, class236.field4120)));
            class302.field5374 = 50;
            class142.method1092(68);
        } else if (class302.field5374 == 50) {
            class124.method986((byte) -108, new class53(class99.field1852.method1193(113, class85.field1609.field896, class310.field5502)));
            class302.field5374 = 60;
            class51.method432((byte) -100, true);
            class142.method1092(116);
        } else if (class302.field5374 == 60) {
            if (class99.field1852.method1172((byte) 121, class115.method929(new class279[] { class85.field1609.field896, class99.field1848 }, (byte) 60))) {
                if (!class99.field1852.method1163(class115.method929(new class279[] { class85.field1609.field896, class99.field1848 }, (byte) 60), 102)) {
                    return;
                }
                class62.field1274 = class275.method1947(true, class115.method929(new class279[] { class85.field1609.field896, class99.field1848 }, (byte) 60), class99.field1852);
            } else {
                class62.field1274 = new class133(0);
            }
            class302.field5374 = 70;
            class142.method1092(-101);
        } else if (class302.field5374 == 70) {
            class284.field5072 = new class175(11, true, class132.field2419);
            class302.field5374 = 73;
            class51.method432((byte) -100, true);
            class142.method1092(39);
        } else if (class302.field5374 == 73) {
            class235.field4094 = new class175(12, true, class132.field2419);
            class302.field5374 = 76;
            class51.method432((byte) -100, true);
            class142.method1092(-110);
        } else if (class302.field5374 == 76) {
            class229.field3991 = new class175(14, true, class132.field2419);
            class302.field5374 = 79;
            class51.method432((byte) -100, true);
            class142.method1092(-105);
        } else if (class302.field5374 == 79) {
            class239.field4186 = new class175(17, true, class132.field2419);
            class302.field5374 = 82;
            class51.method432((byte) -100, true);
            class142.method1092(121);
        } else if (class302.field5374 == 82) {
            class119.field2143 = new class175(19, true, class132.field2419);
            class302.field5374 = 85;
            class51.method432((byte) -100, true);
            class142.method1092(-120);
        } else if (class302.field5374 == 85) {
            class64.field1308 = new class175(22, true, class132.field2419);
            class302.field5374 = 88;
            class51.method432((byte) -100, true);
            class142.method1092(-103);
        } else if (class302.field5374 == 88) {
            class57.field1215 = new class175(26, true, class132.field2419);
            class302.field5374 = 91;
            class51.method432((byte) -100, true);
            class142.method1092(-100);
        } else {
            class44.field936 = new class175(30, true, class132.field2419);
            class302.field5374 = 100;
            class51.method432((byte) -100, true);
            class142.method1092(51);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(BI)Li;", line = 328)
    public static final class212 method661(byte arg0, int arg1) {
        field1520++;
        class212 var2 = (class212) class143.field2592.method1336((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        int var3 = -71 / ((-arg0 - 69) / 33);
        byte[] var4 = class221.field3893.method1192(0, class117.method944(arg1, 105), class112.method912((byte) -113, arg1));
        class212 var5 = new class212();
        if (var4 != null) {
            var5.method1559(new class53(var4), 1);
        }
        class143.field2592.method1331(var5, 30237, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V", line = 359)
    public final void method217(int arg0, int arg1, int arg2) {
        field1517++;
        if (arg1 != 13217) {
            field1519 = (class279) null;
        }
        int var4 = this.field1508 * arg2 >> 12;
        int var5 = this.field1513 * arg0 >> 12;
        int var6 = this.field1515 * arg0 >> 12;
        int var7 = this.field1509 * arg2 >> 12;
        class312.method2215(var5, var4, this.field614, var7, 105, var6);
    }
}
