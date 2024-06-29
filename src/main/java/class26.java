import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class26 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lde;")
    private class4 field406 = new class4();

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "J")
    public static long field416 = 0L;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "Z")
    public static boolean field420 = false;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "[Z")
    public static boolean[] field418 = new boolean[100];

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Z")
    public static boolean field414 = true;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Lc;")
    public static class301 field411;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Lde;")
    private class4 field415;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Ljava/lang/String;")
    public static String field409;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method166(int arg0) {
        field411 = null;
        field409 = null;
        if (arg0 == 1162620070) {
            field418 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)Lde;")
    public final class4 method167(int arg0) {
        field405++;
        class4 var2 = this.field406.field38;
        if (this.field406 == var2) {
            this.field415 = null;
            return null;
        } else {
            this.field415 = var2.field38;
            return arg0 == -16992 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
    public static final String[] method168(String arg0, char arg1, int arg2) {
        field404++;
        int var3 = class138.method881(20978, arg0, arg1);
        if (arg2 < 86) {
            return null;
        }
        int var4 = 0;
        String[] var5 = new String[var3 + 1];
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg1; var8++) {
            }
            var5[var4++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var5[var3] = arg0.substring(var6);
        return var5;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lde;I)V")
    public final void method169(class4 arg0, int arg1) {
        if (arg1 != 64) {
            return;
        }
        if (arg0.field35 != null) {
            arg0.method20(false);
        }
        field407++;
        arg0.field38 = this.field406;
        arg0.field35 = this.field406.field35;
        arg0.field35.field38 = arg0;
        arg0.field38.field35 = arg0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Lde;")
    public final class4 method170(byte arg0) {
        field412++;
        if (arg0 != 28) {
            return null;
        }
        class4 var2 = this.field415;
        if (this.field406 == var2) {
            this.field415 = null;
            return null;
        } else {
            this.field415 = var2.field38;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class26() {
        this.field406.field35 = this.field406;
        this.field406.field38 = this.field406;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)I")
    public final int method171(int arg0) {
        field421++;
        int var2 = 0;
        for (class4 var3 = this.field406.field38; var3 != this.field406; var3 = var3.field38) {
            var2++;
        }
        if (arg0 != -24626) {
            method172(-38, -83);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)Ldm;")
    public static final class181 method172(int arg0, int arg1) {
        if (arg1 <= 32) {
            method174((byte) -125);
        }
        field410++;
        class181 var2 = (class181) class65.field860.method1486((long) arg0, -19212);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class245.field3835.method2050(88, 26, arg0);
        class181 var4 = new class181();
        if (var3 != null) {
            var4.method1153(-1, new class215(var3));
        }
        class65.field860.method1489((long) arg0, 116, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
    public static final void method173(boolean arg0) {
        if (!arg0) {
            field408++;
            if (class110.field1584 == 5) {
                class110.field1584 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
    public static final void method174(byte arg0) {
        field413++;
        if (class97.field1404 == null) {
            return;
        }
        if (class302.field4800 < 10) {
            if (!class97.field1396.method2057(0, class97.field1404.field4776)) {
                class302.field4800 = class185.field2805.method2069(25634, class97.field1404.field4776) / 10;
                return;
            }
            class102.method652((byte) 18);
            class302.field4800 = 10;
        }
        if (class302.field4800 == 10) {
            class97.field1400 = class97.field1404.field4775 >> 6 << 6;
            class97.field1397 = class97.field1404.field4798 >> 6 << 6;
            class97.field1406 = (class97.field1404.field4782 >> 6 << 6) + 64 - class97.field1397;
            class97.field1405 = (class97.field1404.field4783 >> 6 << 6) + 64 - class97.field1400;
            int[] var1 = new int[3];
            int var2 = -1;
            int var3 = -1;
            if (class97.field1404.method2016((class250.field3905.field4140 >> 7) + class170.field2421, class166.field2364, var1, class228.field3570 + (class250.field3905.field4081 >> 7), (byte) -105)) {
                var2 = var1[1] - class97.field1400;
                var3 = class97.field1406 + class97.field1397 - var1[2] - 1;
            }
            if (!class72.field1035 && var2 >= 0 && class97.field1405 > var2 && var3 >= 0 && var3 < class97.field1406) {
                int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
                int var5 = var2 + (int) (Math.random() * 10.0D) - 5;
                class223.field3477 = var5;
                class311.field5005 = var4;
            } else if (class200.field3043 == -1 || class131.field1835 == -1) {
                class97.field1404.method2013(var1, class97.field1404.field4780 >> 14 & 0x3FFF, 0, class97.field1404.field4780 & 0x3FFF);
                class223.field3477 = var1[1] - class97.field1400;
                class311.field5005 = class97.field1397 - (var1[2] - (class97.field1406 - 1));
            } else {
                class97.field1404.method2013(var1, class200.field3043, 0, class131.field1835);
                if (var1 != null) {
                    class311.field5005 = class97.field1406 + class97.field1397 - var1[2] - 1;
                    class223.field3477 = var1[1] - class97.field1400;
                }
                class131.field1835 = -1;
                class200.field3043 = -1;
                class72.field1035 = false;
            }
            if (class97.field1404.field4785 == 37) {
                class97.field1401 = 3.0F;
                class97.field1407 = 3.0F;
            } else if (class97.field1404.field4785 == 50) {
                class97.field1401 = 4.0F;
                class97.field1407 = 4.0F;
            } else if (class97.field1404.field4785 == 75) {
                class97.field1401 = 6.0F;
                class97.field1407 = 6.0F;
            } else if (class97.field1404.field4785 == 100) {
                class97.field1401 = 8.0F;
                class97.field1407 = 8.0F;
            } else if (class97.field1404.field4785 == 200) {
                class97.field1401 = 16.0F;
                class97.field1407 = 16.0F;
            } else {
                class97.field1401 = 8.0F;
                class97.field1407 = 8.0F;
            }
            class163.method1040(0);
            int var6 = class97.field1406 >> 6;
            class97.field1417 = new int[class306.field4923 + 1];
            int var7 = class97.field1405 >> 6;
            class97.field1408 = new byte[var7][var6][];
            class97.field1418 = new byte[var7][var6][];
            class97.field1409 = new int[var7][var6][];
            class97.field1415 = new int[var7][var6][];
            class97.field1413 = new byte[var7][var6][];
            class97.field1411 = new byte[var7][var6][];
            class97.field1416 = new byte[var7][var6][];
            class116.field1675 = new class58();
            class246.field3865 = new class51();
            int var8 = class277.field4403 >> 2 << 10;
            int var9 = class153.field2127 >> 1;
            class97.method623(var8, var9);
            class69.method464(256, (byte) 35, 1024);
            class270.method1765(111, 256, 256);
            class294.method1972(256, 21364);
            class302.field4800 = 20;
        } else if (class302.field4800 == 20) {
            class90.method589((byte) -87, new class215(class97.field1396.method2077(false, class97.field1404.field4776, "underlay")));
            class302.field4800 = 30;
            class255.method1658(-26, true);
            class251.method1632((byte) 124);
        } else if (class302.field4800 == 30) {
            class97.method635(new class215(class97.field1396.method2077(false, class97.field1404.field4776, "overlay")));
            class302.field4800 = 40;
            class251.method1632((byte) 79);
        } else if (class302.field4800 == 40) {
            class97.method626(new class215(class97.field1396.method2077(false, class97.field1404.field4776, "overlay2")));
            class302.field4800 = 50;
            class251.method1632((byte) 90);
        } else if (class302.field4800 == 50) {
            class97.method625(new class215(class97.field1396.method2077(false, class97.field1404.field4776, "loc")), class252.field3939);
            class302.field4800 = 60;
            class255.method1658(-26, true);
            class251.method1632((byte) 114);
        } else if (class302.field4800 == 60) {
            if (class97.field1396.method2055(116, class97.field1404.field4776 + "_labels")) {
                if (!class97.field1396.method2057(0, class97.field1404.field4776 + "_labels")) {
                    return;
                }
                class97.field1403 = class138.method866(-106, class252.field3939, class97.field1396, class97.field1404.field4776 + "_labels");
            } else {
                class97.field1403 = new class208(0);
            }
            class97.method620();
            class302.field4800 = 70;
            class251.method1632((byte) 86);
        } else if (class302.field4800 == 70) {
            class75.field1059 = new class67(11, true, class291.field4645);
            class302.field4800 = 73;
            class255.method1658(-26, true);
            class251.method1632((byte) -125);
        } else if (class302.field4800 == 73) {
            class292.field4667 = new class67(12, true, class291.field4645);
            class302.field4800 = 76;
            class255.method1658(-26, true);
            class251.method1632((byte) 76);
        } else if (class302.field4800 == 76) {
            class284.field4558 = new class67(14, true, class291.field4645);
            class302.field4800 = 79;
            class255.method1658(-26, true);
            class251.method1632((byte) 79);
        } else if (class302.field4800 == 79) {
            class103.field1482 = new class67(17, true, class291.field4645);
            class302.field4800 = 82;
            class255.method1658(-26, true);
            class251.method1632((byte) -36);
        } else if (class302.field4800 == 82) {
            class267.field4290 = new class67(19, true, class291.field4645);
            class302.field4800 = 85;
            class255.method1658(-26, true);
            class251.method1632((byte) -47);
        } else if (class302.field4800 == 85) {
            class108.field1533 = new class67(22, true, class291.field4645);
            class302.field4800 = 88;
            class255.method1658(-26, true);
            class251.method1632((byte) 73);
        } else if (class302.field4800 == 88) {
            class175.field2472 = new class67(26, true, class291.field4645);
            class302.field4800 = 91;
            class255.method1658(-26, true);
            class251.method1632((byte) -18);
        } else {
            class7.field83 = new class67(30, true, class291.field4645);
            class302.field4800 = 100;
            class255.method1658(-26, true);
            class251.method1632((byte) 127);
            if (arg0 > -64) {
                method166(-47);
            }
            System.gc();
        }
    }
}
