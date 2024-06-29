import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class88 {

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "J")
    public long field1502 = 0L;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Z")
    public static boolean field1483 = true;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field1492 = 0;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "Z")
    public static boolean field1499 = false;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Lph;")
    public static class229 field1498 = class266.method1858("Lade Schrifts-=tze )2 ", 0);

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
    public static int[] field1491 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Ldg;")
    public static class6 field1497 = new class6(5000);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public int field1484;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field1487;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lrk;")
    public class216 field1489;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lrk;")
    public class216 field1494;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Lsi;")
    public static class66 field1500;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIZI)Lph;", line = 4)
    public static final class229 method654(int arg0, int arg1, boolean arg2, int arg3) {
        field1486++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 1;
        for (int var5 = arg3 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg3 < arg0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg3 % arg1;
            arg3 /= arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class229 var10 = new class229();
        var10.field3772 = var7;
        var10.field3785 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lwg;", line = 84)
    public static final class25 method655(int arg0, int arg1) {
        field1493++;
        class25 var2 = (class25) class254.field4240.method1027(-36, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class256.field4289.method523(arg1 ^ 0x801F, arg0, 0);
        } else {
            var3 = class314.field5351.method523(-109, arg0 & 0x7FFF, 0);
        }
        class25 var4 = new class25();
        if (var3 != null) {
            var4.method161(new class164(var3), 17);
        }
        if (~arg0 <= arg1) {
            var4.method156((byte) -112);
        }
        class254.field4240.method1026(var4, arg1 + 32889, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 116)
    public static final void method656(byte arg0) {
        if (arg0 >= -22) {
            field1504 = -98;
        }
        field1506++;
        class36.field591.method1415(-18218);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILgi;I)V", line = 127)
    public static final void method657(int arg0, class306 arg1, int arg2) {
        if (class319.field5393 < arg1.field5109) {
            class89.method664(arg1, -9643);
        } else if (arg1.field5144 >= class319.field5393) {
            class273.method1892(arg1, 0);
        } else {
            class176.method1269(2047, arg1);
        }
        field1505++;
        if (arg1.field5147 < 128 || arg1.field5168 < 128 || arg1.field5147 >= 13184 || arg1.field5168 >= 13184) {
            arg1.field5109 = 0;
            arg1.field5112 = -1;
            arg1.field5144 = 0;
            arg1.field5136 = -1;
            arg1.field5147 = arg1.field5104[0] * 128 + (arg1.method1457(0) * 64);
            arg1.field5168 = arg1.field5159[0] * 128 + arg1.method1457(0) * 64;
            arg1.method2062((byte) -127);
        }
        if (class230.field3820 == arg1 && (arg1.field5147 < 1536 || arg1.field5168 < 1536 || arg1.field5147 >= 11776 || arg1.field5168 >= 11776)) {
            arg1.field5136 = -1;
            arg1.field5112 = -1;
            arg1.field5144 = 0;
            arg1.field5109 = 0;
            arg1.field5147 = arg1.field5104[0] * 128 + arg1.method1457(0) * 64;
            arg1.field5168 = arg1.field5159[0] * 128 + (arg1.method1457(0) * 64);
            arg1.method2062((byte) -128);
        }
        class101.method779(true, arg1);
        class108.method819(19660, arg1);
        if (arg0 > -55) {
            field1500 = (class66) null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 181)
    public static void method658(int arg0) {
        if (arg0 != 17825) {
            method654(-39, -49, false, 47);
        }
        field1498 = null;
        field1500 = null;
        field1497 = null;
        field1491 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)Lsd;", line = 195)
    public static final class174 method659(int arg0, boolean arg1) {
        class174 var2 = (class174) class266.field4478.method1413((long) arg0, !arg1);
        field1495++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = field1500.method523(-107, arg0, 1);
        class174 var4 = new class174();
        var4.field2851 = arg0;
        if (var3 != null) {
            var4.method1253(true, new class164(var3));
        }
        var4.method1255(-29956);
        if (arg1) {
            method657(-118, (class306) null, 118);
        }
        class266.field4478.method1419((long) arg0, 5216, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lri;I)V", line = 222)
    public static final void method660(class301 arg0, int arg1) {
        field1490++;
        int var2 = arg0.field4996;
        if (var2 == 324) {
            if (class311.field5220 == -1) {
                class165.field2702 = arg0.field5019;
                class311.field5220 = arg0.field4895;
            }
            if (class147.field2377.field2203) {
                arg0.field4895 = class311.field5220;
            } else {
                arg0.field4895 = class165.field2702;
            }
        } else if (var2 == 325) {
            if (class311.field5220 == -1) {
                class311.field5220 = arg0.field4895;
                class165.field2702 = arg0.field5019;
            }
            if (class147.field2377.field2203) {
                arg0.field4895 = class165.field2702;
            } else {
                arg0.field4895 = class311.field5220;
            }
        } else if (var2 == 327) {
            arg0.field5034 = 150;
            arg0.field4916 = (int) (Math.sin((double) class319.field5393 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field5016 = 5;
            arg0.field4932 = -1;
        } else if (var2 == 328) {
            if (class230.field3820.field3463 == null) {
                arg0.field4932 = 0;
            } else {
                arg0.field5034 = 150;
                arg0.field4916 = (int) (Math.sin((double) class319.field5393 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field5016 = 5;
                arg0.field4932 = ((int) class230.field3820.field3463.method1634(false) << 11) + 2047;
                arg0.field4973 = class230.field3820.field5115;
                arg0.field5000 = class230.field3820.field5175;
            }
        } else if (arg1 != 0) {
            method654(-44, -44, false, 90);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)I", line = 301)
    public static final int method661(boolean arg0, int arg1) {
        if (!arg0) {
            field1499 = false;
        }
        field1485++;
        return arg1 >>> 10;
    }
}
