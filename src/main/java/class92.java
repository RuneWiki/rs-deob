import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class92 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "B")
    private byte field1509;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lea;")
    public static class204 field1514 = new class204();

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field1522 = 99;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field1523 = 0;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Lrb;")
    public static class221 field1520;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lha;")
    public static class304 field1518;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1521;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 10)
    public static final void method660(int arg0) {
        field1507++;
        if (class195.method1427(-77) != 2) {
            return;
        }
        if (arg0 != 65536) {
            method660(74);
        }
        int var1 = class160.field2521 % 104;
        byte var2 = (byte) (class160.field2521 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class212.field3381[var3][var1][var4] = var2;
            }
        }
        if (class41.field734 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class185.field2939[var5] = -1000000;
            class259.field4019[var5] = 1000000;
            class10.field169[var5] = 0;
            class74.field1140[var5] = 1000000;
            class151.field2430[var5] = 0;
        }
        if (class62.field960 != 1) {
            int var6 = class48.method374(class312.field4904, class140.field2223, 94, class41.field734);
            if ((var6 - class48.field801) < 800 && (class250.field3857[class41.field734][class140.field2223 >> 7][class312.field4904 >> 7] & 0x4) != 0) {
                class102.method788(false, class140.field2223 >> 7, class60.field946, class312.field4904 >> 7, 1, false);
            }
            return;
        }
        if ((class250.field3857[class41.field734][class19.field356.field1442 >> 7][class19.field356.field1369 >> 7] & 0x4) != 0) {
            class102.method788(false, class19.field356.field1442 >> 7, class60.field946, class19.field356.field1369 >> 7, 0, false);
        }
        if (class181.field2891 >= 310) {
            return;
        }
        int var7 = class140.field2223 >> 7;
        int var8 = class312.field4904 >> 7;
        int var9 = class19.field356.field1369 >> 7;
        int var10 = class19.field356.field1442 >> 7;
        int var11;
        if (var7 >= var10) {
            var11 = var7 - var10;
        } else {
            var11 = var10 - var7;
        }
        int var12;
        if (var8 >= var9) {
            var12 = var8 - var9;
        } else {
            var12 = var9 - var8;
        }
        if (var11 > var12) {
            int var15 = 32768;
            int var16 = var12 * 65536 / var11;
            while (var7 != var10) {
                if (var10 > var7) {
                    var7++;
                } else if (var7 > var10) {
                    var7--;
                }
                if ((class250.field3857[class41.field734][var7][var8] & 0x4) != 0) {
                    class102.method788(false, var7, class60.field946, var8, 1, false);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    if (var8 < var9) {
                        var8++;
                    } else if (var9 < var8) {
                        var8--;
                    }
                    var15 -= 65536;
                    if ((class250.field3857[class41.field734][var7][var8] & 0x4) != 0) {
                        class102.method788(false, var7, class60.field946, var8, 1, false);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var11 * 65536 / var12;
        int var14 = 32768;
        while (var8 != var9) {
            if (var9 > var8) {
                var8++;
            } else if (var9 < var8) {
                var8--;
            }
            if ((class250.field3857[class41.field734][var7][var8] & 0x4) != 0) {
                class102.method788(false, var7, class60.field946, var8, 1, false);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var7 < var10) {
                    var7++;
                } else if (var7 > var10) {
                    var7--;
                }
                var14 -= 65536;
                if ((class250.field3857[class41.field734][var7][var8] & 0x4) != 0) {
                    class102.method788(false, var7, class60.field946, var8, 1, false);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I", line = 194)
    public final int method661(byte arg0) {
        field1519++;
        return arg0 > -1 ? 14 : this.field1509 & 0x7;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILoj;)V", line = 208)
    public static final void method662(int arg0, class325 arg1) {
        class322 var2 = null;
        class329.field5093 = 3;
        field1513++;
        class306.method2116(true, -19689);
        class14.field263 = 127;
        class191.field3064 = 127;
        class151.field2424 = true;
        class217.field3474 = true;
        class245.field3780 = 2;
        if (arg0 != -4) {
            method663(-78);
        }
        class11.field219 = true;
        class247.field3825 = 0;
        class141.field2240 = 0;
        class29.field474 = true;
        class65.field1055 = true;
        class128.field2040 = true;
        class302.field4753 = true;
        class288.field4397 = 255;
        class12.field239 = 0;
        class298.field4704 = true;
        class6.field61 = true;
        class307.field4846 = true;
        class289.field4406 = true;
        class107.field1786 = 0;
        if (class95.field1567 < 96) {
            class47.method370(0);
        } else {
            class47.method370(2);
        }
        class54.field860 = 0;
        class39.field707 = false;
        class247.field3820 = false;
        class34.field566 = 0;
        class22.field393 = false;
        class212.field3387 = true;
        class60.field945 = 0;
        try {
            class21 var3 = arg1.method2230(arg0 ^ 0xFFFFFFF4, "runescape");
            while (var3.field387 == 0) {
                class279.method1991(arg0 ^ 0xFFFFFF9E, 1L);
            }
            if (var3.field387 == 1) {
                var2 = (class322) var3.field391;
                byte[] var4 = new byte[(int) var2.method2201((byte) -70)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2199(var4, var4.length - var5, true, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class89.method644((byte) 87, new class101(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method2200(1);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 293)
    public static void method663(int arg0) {
        field1518 = null;
        field1514 = null;
        field1520 = null;
        if (arg0 != -1) {
            method660(12);
        }
        field1521 = null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)I", line = 310)
    public final int method664(byte arg0) {
        field1516++;
        int var2 = 112 % ((-arg0 - 58) / 40);
        return (this.field1509 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 321)
    public class92() {
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lpe;)V", line = 324)
    public class92(class101 arg0) {
        this.field1509 = arg0.method727((byte) 117);
        this.field1508 = arg0.method731(false);
        this.field1515 = arg0.method775(60);
        this.field1511 = arg0.method775(-123);
        this.field1510 = arg0.method775(126);
        this.field1517 = arg0.method775(58);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;", line = 338)
    public static final Class method665(boolean arg0, String arg1) throws ClassNotFoundException {
        field1512++;
        if (!arg0) {
            method663(-106);
        }
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }
}
