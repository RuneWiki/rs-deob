import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class219 {

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Z")
    public static boolean field3743 = true;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lmb;")
    public static class96 field3750 = class243.method1708("Angreifen", (byte) 108);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lmb;")
    public static class96 field3742 = class243.method1708("Nehmen", (byte) 99);

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lmb;")
    private static class96 field3748 = class243.method1708("Use", (byte) 120);

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lmb;")
    public static class96 field3754 = field3748;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lmb;")
    private static class96 field3752 = class243.method1708(" has logged out)3", (byte) 125);

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lmb;")
    public static class96 field3746 = field3752;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Ljj;")
    public static class37 field3745;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static final void method1505(boolean arg0) {
        class10.method80((byte) -5);
        System.gc();
        class146.method1076(6938, 25);
        if (!arg0) {
            field3750 = null;
        }
        field3753++;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V")
    public static void method1506(boolean arg0) {
        field3750 = null;
        if (!arg0) {
            field3752 = null;
        }
        field3754 = null;
        field3746 = null;
        field3745 = null;
        field3742 = null;
        field3752 = null;
        field3748 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static final void method1507(int arg0) {
        field3749++;
        if (arg0 < 5) {
            method1510((class96[]) null, (short[]) null, 55, -61, -10);
        }
        for (int var1 = 0; var1 < class157.field2745; var1++) {
            int var2 = class78.field1335[var1];
            class197 var3 = class86.field1450[var2];
            int var4 = class1.field4.method1651(4139);
            if ((var4 & 0x80) != 0) {
                var3.field4543 = class1.field4.method1618(-111);
                int var5 = class1.field4.method1637((byte) 106);
                if (var3.field4543 == 65535) {
                    var3.field4543 = -1;
                }
                var3.field4518 = (var5 & 0xFFFF) + class236.field4053;
                var3.field4548 = 0;
                var3.field4553 = 0;
                if (class236.field4053 < var3.field4518) {
                    var3.field4548 = -1;
                }
                var3.field4579 = var5 >> 16;
                if (var3.field4543 != -1 && class236.field4053 == var3.field4518) {
                    int var6 = class146.method1082(var3.field4543, (byte) 75).field3175;
                    if (var6 != -1) {
                        class67 var7 = class189.method1332(var6, 2);
                        if (var7 != null && var7.field1140 != null) {
                            class71.method481(var3.field4533, true, var7, var3.field4511, 0, false);
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                int var8 = class1.field4.method1635(2);
                int var9 = class1.field4.method1645(-112);
                var3.method1800(var8, true, class236.field4053, var9);
                var3.field4560 = class236.field4053 + 300;
                var3.field4565 = class1.field4.method1645(-43);
            }
            if ((var4 & 0x8) != 0) {
                var3.field4520 = class1.field4.method1672((byte) 107);
                var3.field4554 = class1.field4.method1618(-125);
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field3436.method1570(113)) {
                    class274.method1859((byte) 15, var3);
                }
                var3.field3436 = class260.method1799(class1.field4.method1618(-123), (byte) 39);
                var3.method1791(var3.field3436.field3914, 128);
                var3.field4505 = var3.field3436.field3895;
                var3.field4539 = var3.field3436.field3919;
                var3.field4569 = var3.field3436.field3890;
                var3.field4521 = var3.field3436.field3898;
                var3.field4540 = var3.field3436.field3937;
                var3.field4517 = var3.field3436.field3880;
                var3.field4515 = var3.field3436.field3889;
                var3.field4508 = var3.field3436.field3929;
                if (var3.field3436.method1570(121)) {
                    class236.method1609((class47) null, var3, var3.field4566[0], class216.field3712, (byte) -122, var3.field4528[0], (class196) null, 0);
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field4509 = class1.field4.method1634(-117);
                var3.field4556 = 100;
            }
            if ((var4 & 0x40) != 0) {
                int var10 = class1.field4.method1669(255);
                int var11 = class1.field4.method1645(-85);
                var3.method1800(var10, true, class236.field4053, var11);
            }
            if ((var4 & 0x4) != 0) {
                int var12 = class1.field4.method1623(true);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = class1.field4.method1635(2);
                class108.method828(var3, var12, var13, false);
            }
            if ((var4 & 0x10) != 0) {
                var3.field4537 = class1.field4.method1663((byte) -70);
                if (var3.field4537 == 65535) {
                    var3.field4537 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lrg;B)V")
    public static final void method1508(class239 arg0, byte arg1) {
        if (arg1 != -59) {
            method1510((class96[]) null, (short[]) null, -71, 115, -98);
        }
        field3741++;
        byte[] var2 = new byte[24];
        if (class213.field3668 != null) {
            try {
                int var3 = 0;
                class213.field3668.method784(-1658, 0L);
                class213.field3668.method794(var2, -23122);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1621(0, var2, 24, -83);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Lqi;")
    public static final class211 method1509(byte arg0, int arg1) {
        field3747++;
        class211 var2 = (class211) class220.field3763.method84(53, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class132.field2364.method23(arg1, 103, 1);
        class211 var4 = new class211();
        int var5 = -128 % ((69 - arg0) / 34);
        if (var3 != null) {
            var4.method1464(new class239(var3), -24736, arg1);
        }
        class220.field3763.method88(var4, 16518, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([Lmb;[SIII)V")
    public static final void method1510(class96[] arg0, short[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 1) {
            field3742 = null;
        }
        field3751++;
        if (arg4 >= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg4;
        class96 var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        short var8 = arg1[var5];
        arg1[var5] = arg1[arg3];
        arg1[arg3] = var8;
        for (int var9 = arg4; var9 < arg3; var9++) {
            if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].method689(var7, 97)) {
                class96 var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                short var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg1[arg3] = arg1[var6];
        arg1[var6] = var8;
        method1510(arg0, arg1, 1, var6 - 1, arg4);
        method1510(arg0, arg1, 1, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;Z)Lmb;")
    public static final class96 method1511(String arg0, boolean arg1) {
        field3744++;
        if (arg1) {
            return null;
        }
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class96 var3 = new class96();
        var3.field1580 = var2;
        var3.field1600 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field1600++] = var2[var4];
            }
        }
        return var3;
    }
}
