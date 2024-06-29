import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class77 {

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "Luaa;")
    private class395 field1394 = new class395(64);

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "Lgp;")
    private class561 field1400;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BIIIIII)V")
    public static final void method724(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1404++;
        if (arg0 > -110) {
            field1403 = -24;
        }
        for (class634 var7 = (class634) class519.field7205.method944(-127); var7 != null; var7 = (class634) class519.field7205.method947((byte) 121)) {
            if (class310.field4553 >= var7.field9214) {
                var7.method2753(0);
            } else {
                class619.method3501(var7.field9220, (var7.field9216 << 7) + 64, var7.field9215 * 2, (var7.field9210 << 7) + 64, arg5 >> 1, (byte) -110, arg4 >> 1, arg1, arg2);
                class273.field3996.method1635(var7.field9217, class621.field8750[0] + arg3, 0, 16777215, class621.field8750[1] + arg6, var7.field9218 | 0xFF000000);
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IB)V")
    public final void method725(int arg0, byte arg1) {
        field1397++;
        class395 var3 = this.field1394;
        synchronized (this.field1394) {
            int var4 = -76 / ((-arg1 - 32) / 51);
            this.field1394.method2397(arg0, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIII)V")
    public static final void method726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1402++;
        if (arg2 != 0) {
            field1403 = -12;
        }
        if (class202.field2854.field7888 != 0 && arg4 != 0 && class621.field8746 < 50 && arg1 != -1) {
            class313.field4568[class621.field8746++] = new class509((byte) 1, arg1, arg4, arg5, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZZ)V")
    public static final void method727(boolean arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        for (class154 var2 = (class154) class134.field2163.method427(arg1); var2 != null; var2 = (class154) class134.field2163.method420(!arg1)) {
            if (var2.field2312 != null) {
                class35.field485.method44(var2.field2312);
                var2.field2312 = null;
            }
            if (var2.field2310 != null) {
                class35.field485.method44(var2.field2310);
                var2.field2310 = null;
            }
            var2.method911(-52);
        }
        field1398++;
        if (!arg0) {
            return;
        }
        for (class154 var3 = (class154) class90.field1611.method427(arg1); var3 != null; var3 = (class154) class90.field1611.method420(false)) {
            if (var3.field2312 != null) {
                class35.field485.method44(var3.field2312);
                var3.field2312 = null;
            }
            var3.method911(-52);
        }
        for (class154 var4 = (class154) class424.field6207.method734(0); var4 != null; var4 = (class154) class424.field6207.method736(-1)) {
            if (var4.field2312 != null) {
                class35.field485.method44(var4.field2312);
                var4.field2312 = null;
            }
            var4.method911(-52);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
    public final void method728(int arg0) {
        class395 var2 = this.field1394;
        synchronized (this.field1394) {
            this.field1394.method2406(36);
        }
        int var3 = 31 % ((arg0 - 1) / 50);
        field1401++;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)Llba;")
    public final class235 method729(int arg0, int arg1) {
        field1395++;
        class395 var3 = this.field1394;
        class235 var4;
        synchronized (this.field1394) {
            var4 = (class235) this.field1394.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 0) {
            method733(-60, -23, 126);
        }
        class561 var5 = this.field1400;
        byte[] var6;
        synchronized (this.field1400) {
            var6 = this.field1400.method3175(arg1, (byte) -53, 35);
        }
        class235 var7 = new class235();
        if (var6 != null) {
            var7.method1528(20150, new class268(var6));
        }
        var7.method1527(-31417);
        class395 var8 = this.field1394;
        synchronized (this.field1394) {
            this.field1394.method2408(var7, (long) arg1, -123);
            return var7;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V")
    public static final void method730(byte arg0) {
        field1405++;
        if (arg0 > -110) {
            return;
        }
        class275.field4027.method1284(98);
        class540.field7521.method936(8);
        class468.field6744.method2287(-123);
        class552.field7819.method2885((byte) 65);
        class204.field2882.method293((byte) -117);
        class611.field8684.method1624(-97);
        class49.field739.method2296(-15769);
        class522.field7247.method2488(21003);
        class17.field257.method2705((byte) -100);
        class173.field2515.method3062(-72);
        class469.field6760.method1194(-1);
        class484.field6855.method2558((byte) -50);
        class249.field3634.method71((byte) -64);
        class394.field5911.method731(-16777216);
        class190.field2724.method1829(200);
        class316.field4615.method1317(false);
        class92.field1638.method2952(true);
        class639.field9269.method2723(-29969);
        class576.field8224.method3363(-26478);
        class632.field9046.method3381(26);
        class534.method3017((byte) -99);
        class474.method2745(111);
        class255.method1603(2);
        class635.method3671(true);
        class111.field1831.method2404((byte) -120);
        class332.field4767.method2404((byte) -100);
        class394.field5904.method2404((byte) -73);
        class333.field4787.method2404((byte) -47);
        class30.field417.method2404((byte) -52);
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V")
    private final void method731(int arg0) {
        class395 var2 = this.field1394;
        synchronized (this.field1394) {
            this.field1394.method2404((byte) -117);
        }
        if (arg0 != -16777216) {
            method727(true, false);
        }
        field1399++;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1396++;
        int var7 = class34.method306(class222.field3350, arg1, class409.field6071, (byte) 87);
        int var8 = class34.method306(class222.field3350, arg3, class409.field6071, (byte) 107);
        if (arg0 != 50) {
            field1403 = -38;
        }
        int var9 = class34.method306(class183.field2638, arg2, class268.field3911, (byte) 98);
        int var10 = class34.method306(class183.field2638, arg6, class268.field3911, (byte) 111);
        int var11 = class34.method306(class222.field3350, arg1 + arg4, class409.field6071, (byte) 96);
        int var12 = class34.method306(class222.field3350, arg3 - arg4, class409.field6071, (byte) 118);
        for (int var13 = var7; var13 < var11; var13++) {
            class614.method3490(arg5, var9, -110, class495.field6944[var13], var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class614.method3490(arg5, var9, arg0 ^ 0xFFFFFF94, class495.field6944[var14], var10);
        }
        int var15 = class34.method306(class183.field2638, arg2 + arg4, class268.field3911, (byte) 118);
        int var16 = class34.method306(class183.field2638, arg6 - arg4, class268.field3911, (byte) 92);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class495.field6944[var17];
            class614.method3490(arg5, var9, -110, var18, var15);
            class614.method3490(arg5, var16, -128, var18, var10);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(III)Z")
    public static final boolean method733(int arg0, int arg1, int arg2) {
        field1406++;
        if (arg0 == 0) {
            return class563.method3211(arg2, arg0 ^ 0x34, arg1) | (arg2 & 0x70000) != 0 || class343.method2094(arg2, arg1, (byte) 53);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Ljc;ILgp;)V")
    public class77(class584 arg0, int arg1, class561 arg2) {
        this.field1400 = arg2;
        if (this.field1400 != null) {
            this.field1400.method3164(35, true);
        }
    }
}
