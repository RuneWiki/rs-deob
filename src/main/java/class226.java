import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class226 implements Runnable {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lma;")
    public static class5 field3709 = class12.method119(" loggt sich ein)3", (byte) 110);

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Lma;")
    public static class5 field3710 = class12.method119("(R", (byte) 55);

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Lma;")
    public static class5 field3717 = class12.method119("::", (byte) 102);

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "[Lgb;")
    public static class81[] field3714 = new class81[4];

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "[Lma;")
    public static class5[] field3718 = new class5[1000];

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lma;")
    public static class5 field3715 = class12.method119("zap", (byte) 105);

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 15)
    public static void method1597(int arg0) {
        field3714 = null;
        field3718 = null;
        field3710 = null;
        field3709 = null;
        if (arg0 != -1) {
            method1597(-73);
        }
        field3717 = null;
        field3715 = null;
    }

    @OriginalMember(owner = "client!kj", name = "run", descriptor = "()V", line = 50)
    public final void run() {
        field3713++;
        try {
            while (true) {
                class218 var1 = class29.field477;
                class119 var2;
                synchronized (class29.field477) {
                    var2 = (class119) class29.field477.method1475(14);
                }
                if (var2 == null) {
                    class116.method759(-1, 100L);
                    Object var10 = class274.field4672;
                    synchronized (class274.field4672) {
                        if (class288.field4864 <= 1) {
                            class288.field4864 = 0;
                            class274.field4672.notifyAll();
                            return;
                        }
                        class288.field4864--;
                    }
                } else {
                    if (var2.field1798 == 0) {
                        var2.field1799.method1401((int) var2.field5004, var2.field1795, var2.field1795.length, false);
                        class218 var4 = class29.field477;
                        synchronized (class29.field477) {
                            var2.method1997(-27381);
                        }
                    } else if (var2.field1798 == 1) {
                        var2.field1795 = var2.field1799.method1399(-19, (int) var2.field5004);
                        class218 var6 = class29.field477;
                        synchronized (class29.field477) {
                            class267.field4578.method1485(-8564, var2);
                        }
                    }
                    Object var8 = class274.field4672;
                    synchronized (class274.field4672) {
                        if (class288.field4864 <= 1) {
                            class288.field4864 = 0;
                            class274.field4672.notifyAll();
                            return;
                        }
                        class288.field4864 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class98.method630((String) null, -123, var18);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIZIII)V", line = 145)
    public static final void method1598(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3719++;
        if (class280.field4741 == arg0 && class137.field2031 == arg1 && class276.field4709 == arg6 || class152.method956((byte) -113)) {
            return;
        }
        class276.field4709 = arg6;
        class137.field2031 = arg1;
        if (arg5 != -32769) {
            field3712 = 116;
        }
        class280.field4741 = arg0;
        if (class152.method956((byte) -109)) {
            class276.field4709 = 0;
        }
        if (arg3) {
            class112.method741(28, 5);
        } else {
            class112.method741(25, 5);
        }
        class97.method620(class112.field1666, 15, true);
        int var7 = class74.field1158;
        int var8 = class193.field3017;
        class74.field1158 = arg1 * 8 - 48;
        class193.field3017 = arg0 * 8 - 48;
        class213.field3387 = class297.method1999(arg5 + 48085, class137.field2031 * 8, class280.field4741 * 8);
        int var9 = class193.field3017 - var8;
        int var10 = class193.field3017;
        int var11 = class74.field1158 - var7;
        int var12 = class74.field1158;
        if (arg3) {
            class129.field1940 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class177 var17 = class119.field1804[var16];
                if (var17 != null) {
                    var17.field178 -= var9 * 128;
                    var17.field211 -= var11 * 128;
                    if (var17.field178 >= 0 && var17.field178 <= 13184 && var17.field211 >= 0 && var17.field211 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field175[var18] -= var9;
                            var17.field186[var18] -= var11;
                        }
                        class73.field1153[class129.field1940++] = var16;
                    } else {
                        class119.field1804[var16].field2699 = null;
                        class119.field1804[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class177 var14 = class119.field1804[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field175[var15] -= var9;
                        var14.field186[var15] -= var11;
                    }
                    var14.field178 -= var9 * 128;
                    var14.field211 -= var11 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class91 var20 = class267.field4593[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field175[var21] -= var9;
                    var20.field186[var21] -= var11;
                }
                var20.field178 -= var9 * 128;
                var20.field211 -= var11 * 128;
            }
        }
        byte var22 = 0;
        class276.field4701 = arg6;
        byte var23 = 104;
        byte var24 = 1;
        class151.field2183.method121(arg2, false, -22763, arg4);
        if (var9 < 0) {
            var24 = -1;
            var23 = -1;
            var22 = 103;
        }
        byte var25 = 0;
        byte var26 = 104;
        byte var27 = 1;
        if (var11 < 0) {
            var25 = 103;
            var27 = -1;
            var26 = -1;
        }
        for (int var28 = var22; var28 != var23; var28 += var24) {
            for (int var29 = var25; var29 != var26; var29 += var27) {
                int var30 = var9 + var28;
                int var31 = var29 + var11;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class91.field1358[var32][var28][var29] = class91.field1358[var32][var30][var31];
                    } else {
                        class91.field1358[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class186 var33 = (class186) class127.field1905.method1475(14); var33 != null; var33 = (class186) class127.field1905.method1486(38)) {
            var33.field2918 -= var11;
            var33.field2923 -= var9;
            if (var33.field2923 < 0 || var33.field2918 < 0 || var33.field2923 >= 104 || var33.field2918 >= 104) {
                var33.method1997(-27381);
            }
        }
        if (arg3) {
            class73.field1141 -= var9;
            class240.field3984 -= var11;
            class170.field2618 -= var11;
            class23.field406 -= var9;
        } else {
            class270.field4631 = 1;
        }
        if (class213.field3383 != 0) {
            class213.field3383 -= var9;
            class10.field153 -= var11;
        }
        class186.field2934 = 0;
        if (arg3 && (Math.abs(var9) > 104 || Math.abs(var11) > 104)) {
            class209.method1377((byte) -66);
        }
        class169.field2580 = -1;
        class110.field1629.method1474((byte) 65);
        class77.field1203.method1474((byte) 15);
    }
}
