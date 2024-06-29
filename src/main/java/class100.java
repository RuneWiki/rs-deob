import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class100 implements Runnable {

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "Lic;")
    private class109 field1664 = new class109();

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "Z")
    private boolean field1667 = false;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public int field1668 = 0;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field1666;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lwa;")
    public static class75 field1650 = class66.method560("Eingabeprozedur geladen)3", false);

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lwa;")
    public static class75 field1653 = class66.method560("::fps ", false);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[I")
    public static int[] field1651 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lcb;")
    public static class267 field1660;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 5)
    public static final void method761(byte arg0) {
        class97.field1590.method1201(-20111);
        field1652++;
        int var1 = 10 / ((arg0 + 86) / 40);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILci;I)Lqh;", line = 21)
    public final class283 method762(int arg0, class188 arg1, int arg2) {
        if (arg2 != -29561) {
            this.method769(24, (byte) 59, (class188) null);
        }
        field1663++;
        class283 var4 = new class283();
        var4.field4871 = 1;
        class109 var5 = this.field1664;
        synchronized (this.field1664) {
            class283 var6 = (class283) this.field1664.method857((byte) -35);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field4682 && var6.field4877 == arg1 && var6.field4871 == 2) {
                    var4.field4888 = var6.field4888;
                    var4.field4575 = false;
                    return var4;
                }
                var6 = (class283) this.field1664.method859(27260);
            }
        }
        var4.field4888 = arg1.method1424(arg0, 7599);
        var4.field4575 = false;
        var4.field4580 = true;
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 54)
    public static final void method763(int arg0) {
        if (arg0 < 52) {
            field1650 = (class75) null;
        }
        field1661++;
        for (int var1 = 0; var1 < class173.field2924; var1++) {
            int var2 = class72.field1214[var1];
            class295 var3 = class35.field521[var2];
            int var4 = class136.field2328.method501(0);
            if ((var4 & 0x80) != 0) {
                int var5 = class136.field2328.method491(8);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class136.field2328.method507(-121);
                class158.method1198(var5, var3, var6, 101);
            }
            if ((var4 & 0x4) != 0) {
                int var7 = class136.field2328.method507(-117);
                int var8 = class136.field2328.method501(0);
                var3.method1452(var7, var8, (byte) -44, class143.field2463);
            }
            if ((var4 & 0x2) != 0) {
                int var9 = class136.field2328.method501(0);
                int var10 = class136.field2328.method479(93);
                var3.method1452(var9, var10, (byte) -85, class143.field2463);
                var3.field3245 = class143.field2463 + 300;
                var3.field3226 = class136.field2328.method507(-121);
            }
            if ((var4 & 0x40) != 0) {
                var3.field3243 = class136.field2328.method532(-1);
                var3.field3275 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field3261 = class136.field2328.method481((byte) -13);
                int var11 = class136.field2328.method492(65629128);
                var3.field3247 = var11 >> 16;
                var3.field3210 = 0;
                var3.field3255 = 0;
                if (var3.field3261 == 65535) {
                    var3.field3261 = -1;
                }
                var3.field3224 = (var11 & 0xFFFF) + class143.field2463;
                if (class143.field2463 < var3.field3224) {
                    var3.field3255 = -1;
                }
                if (var3.field3261 != -1 && class143.field2463 == var3.field3224) {
                    int var12 = class65.method556(var3.field3261, -86).field4550;
                    if (var12 != -1) {
                        class28 var13 = class302.method2082(var12, 86);
                        if (var13 != null && var13.field368 != null) {
                            class292.method2034(0, false, var3.field3259, var13, 79, var3.field3218);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field5070.method1671((byte) -86)) {
                    class123.method929(var3, (byte) 124);
                }
                var3.field5070 = class182.method1343(class136.field2328.method474((byte) 104), (byte) 62);
                var3.method1454(var3.field5070.field3854, (byte) -125);
                var3.field3229 = var3.field5070.field3885;
                var3.field3219 = var3.field5070.field3840;
                var3.field3232 = var3.field5070.field3882;
                var3.field3209 = var3.field5070.field3850;
                var3.field3257 = var3.field5070.field3895;
                var3.field3227 = var3.field5070.field3884;
                var3.field3228 = var3.field5070.field3846;
                var3.field3269 = var3.field5070.field3849;
                if (var3.field5070.method1671((byte) -113)) {
                    class76.method664(class67.field1174, false, (class96) null, var3.field3236[0], 0, var3.field3205[0], (class108) null, var3);
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field3237 = class136.field2328.method485((byte) -2);
                if (var3.field3237 == 65535) {
                    var3.field3237 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field3213 = class136.field2328.method491(8);
                var3.field3256 = class136.field2328.method485((byte) -2);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V", line = 199)
    public static void method764(byte arg0) {
        field1650 = null;
        field1651 = null;
        if (arg0 > -25) {
            method761((byte) -92);
        }
        field1653 = null;
        field1660 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V", line = 223)
    public final void method765(int arg0) {
        this.field1667 = true;
        class109 var2 = this.field1664;
        synchronized (this.field1664) {
            this.field1664.notifyAll();
        }
        try {
            this.field1666.join();
            if (arg0 != -1) {
                field1660 = (class267) null;
            }
        } catch (InterruptedException var5) {
        }
        this.field1666 = null;
        field1658++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIIIIIZ)V", line = 244)
    public static final void method766(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var7 = 12 / ((83 - arg0) / 33);
        class81.field1365 = arg4;
        field1656++;
        class202.field3418 = arg1;
        class121.field2029 = arg3;
        class172.field2887 = arg2;
        class11.field148 = arg5;
        if (arg6 && class202.field3418 >= 100) {
            class9.field121 = class121.field2029 * 128 + 64;
            class245.field4120 = class172.field2887 * 128 + 64;
            class228.field3825 = class32.method217(class245.field4120, class9.field121, true, class67.field1174) - class11.field148;
        }
        class163.field2777 = 2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BILci;I)Lqh;", line = 268)
    public final class283 method767(byte[] arg0, int arg1, class188 arg2, int arg3) {
        class283 var5 = new class283();
        var5.field4871 = arg3;
        var5.field4877 = arg2;
        var5.field4888 = arg0;
        var5.field4682 = (long) arg1;
        field1662++;
        var5.field4580 = false;
        this.method768((byte) 61, var5);
        return var5;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLqh;)V", line = 283)
    private final void method768(byte arg0, class283 arg1) {
        if (arg0 != 61) {
            return;
        }
        class109 var3 = this.field1664;
        synchronized (this.field1664) {
            this.field1664.method854(true, arg1);
            this.field1668++;
            this.field1664.notifyAll();
        }
        field1655++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBLci;)Lqh;", line = 299)
    public final class283 method769(int arg0, byte arg1, class188 arg2) {
        class283 var4 = new class283();
        field1659++;
        if (arg1 != -3) {
            return (class283) null;
        }
        var4.field4871 = 3;
        var4.field4877 = arg2;
        var4.field4682 = (long) arg0;
        var4.field4580 = false;
        this.method768((byte) 61, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "run", descriptor = "()V", line = 319)
    public final void run() {
        field1654++;
        while (!this.field1667) {
            class109 var1 = this.field1664;
            class283 var2;
            synchronized (this.field1664) {
                var2 = (class283) this.field1664.method853((byte) 121);
                if (var2 == null) {
                    try {
                        this.field1664.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1668--;
            }
            try {
                if (var2.field4871 == 2) {
                    var2.field4877.method1421(var2.field4888.length, (int) var2.field4682, -2805, var2.field4888);
                } else if (var2.field4871 == 3) {
                    var2.field4888 = var2.field4877.method1424((int) var2.field4682, 7599);
                }
            } catch (Exception var6) {
                class17.method100(var6, -14020, (String) null);
            }
            var2.field4575 = false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)V", line = 364)
    public static final void method770(int arg0, int arg1, boolean arg2) {
        field1657++;
        class47.method346();
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class299.field5117 = class212.method1566(class210.field3585, arg1, 0, 0, 0, arg0);
        if (class299.field5117 == null) {
            class28.method183((byte) 99);
        } else {
            class177.field2985 = arg1;
            class285.field4901 = arg0;
            class64.method549(0, class210.field3585);
            class29.method198(0, 765);
            class278.method1972(65);
        }
        if (!arg2) {
            method766((byte) -73, 58, 65, 88, 26, 63, false);
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 400)
    public static final void method771(int arg0) {
        field1665++;
        class140.method1090(true);
        class163.method1222(-4018);
        class304.method2092((byte) 127);
        class104.method808(8);
        if (arg0 > -82) {
            return;
        }
        class94.method730(111);
        class162.method1213((byte) -80);
        class182.method1345((byte) 38);
        class301.method2073(127);
        class278.method1985(0);
        class150.method1154((byte) 107);
        class52.method382(111);
        class96.method743(false);
        class130.method1022(-4539);
        class138.method1052(24267);
        class134.field2307.method1200(false);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 435)
    public class100() {
        class77 var1 = class210.field3585.method947(0, this, 5);
        while (var1.field1330 == 0) {
            class235.method1708(96, 10L);
        }
        if (var1.field1330 == 2) {
            throw new RuntimeException();
        }
        this.field1666 = (Thread) var1.field1329;
    }
}
