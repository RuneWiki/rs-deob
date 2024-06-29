import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class106 extends class74 {

    @OriginalMember(owner = "client!rd", name = "Hb", descriptor = "Z")
    private volatile boolean field2623 = false;

    @OriginalMember(owner = "client!rd", name = "Ab", descriptor = "Z")
    private boolean field2616 = false;

    @OriginalMember(owner = "client!rd", name = "Ib", descriptor = "I")
    private int field2624 = -1;

    @OriginalMember(owner = "client!rd", name = "wb", descriptor = "I")
    private int field2612;

    @OriginalMember(owner = "client!rd", name = "Pb", descriptor = "Lne;")
    private class83 field2631;

    @OriginalMember(owner = "client!rd", name = "ub", descriptor = "Lne;")
    private class83 field2610;

    @OriginalMember(owner = "client!rd", name = "Db", descriptor = "I")
    public static int field2619 = 2;

    @OriginalMember(owner = "client!rd", name = "Fb", descriptor = "Lv;")
    public static class122 field2621 = class55.method425(-68, "Abbrechen");

    @OriginalMember(owner = "client!rd", name = "Bb", descriptor = "Lv;")
    private static class122 field2617 = class55.method425(-65, " is already on your friend list");

    @OriginalMember(owner = "client!rd", name = "Kb", descriptor = "Lv;")
    public static class122 field2626 = field2617;

    @OriginalMember(owner = "client!rd", name = "Sb", descriptor = "Lv;")
    public static class122 field2634 = class55.method425(-126, "backright1");

    @OriginalMember(owner = "client!rd", name = "Tb", descriptor = "I")
    public static int field2635 = 0;

    @OriginalMember(owner = "client!rd", name = "vb", descriptor = "Ljb;")
    public static class56 field2611 = new class56(64);

    @OriginalMember(owner = "client!rd", name = "Vb", descriptor = "I")
    public static int field2637 = 1;

    @OriginalMember(owner = "client!rd", name = "rb", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!rd", name = "sb", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!rd", name = "tb", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!rd", name = "xb", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!rd", name = "yb", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!rd", name = "zb", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!rd", name = "Cb", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!rd", name = "Eb", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!rd", name = "Gb", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!rd", name = "Jb", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!rd", name = "Lb", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!rd", name = "Nb", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!rd", name = "Qb", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!rd", name = "Rb", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!rd", name = "Ob", descriptor = "Lab;")
    public static class3 field2630;

    @OriginalMember(owner = "client!rd", name = "Ub", descriptor = "Lje;")
    public static class59 field2636;

    @OriginalMember(owner = "client!rd", name = "Mb", descriptor = "[Z")
    private volatile boolean[] field2628;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(II)I", line = 11)
    private final int method818(int arg0, int arg1) {
        ++field2622;
        if (super.field1975[arg0] != null) {
            return 100;
        } else if (arg1 > -70) {
            return -60;
        } else {
            return this.field2628[arg0] ? 100 : class16.method161(this.field2612, 116, arg0);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)I", line = 30)
    public final int method819(byte arg0) {
        ++field2608;
        if (this.field2623) {
            return 100;
        } else if (super.field1975 != null) {
            return 99;
        } else {
            int var2 = class16.method161(255, 27, this.field2612);
            if (arg0 != 50) {
                this.method819((byte) -26);
            }
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[BZLne;)V", line = 53)
    public final void method820(int arg0, int arg1, byte[] arg2, boolean arg3, class83 arg4) {
        ++field2607;
        if (this.field2631 == arg4) {
            if (this.field2623) {
                throw new RuntimeException();
            }
            if (arg2 == null) {
                class34.method303(true, 255, 0, this.field2618, (byte) 0, this.field2612, this);
                return;
            }
            class84.field2183.reset();
            class84.field2183.update(arg2, 0, arg2.length);
            int var6 = (int) class84.field2183.getValue();
            if (this.field2618 != var6) {
                class34.method303(true, 255, 0, this.field2618, (byte) 0, this.field2612, this);
                return;
            }
            this.method602(arg2, true);
            this.method822((byte) 112);
        } else {
            if (!arg3 && ~this.field2624 == ~arg0) {
                this.field2623 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2628[arg0] = false;
                if (this.field2616 || arg3) {
                    class34.method303(arg3, this.field2612, arg1 + -16711680, super.field1970[arg0], (byte) 2, arg0, this);
                }
                return;
            }
            class84.field2183.reset();
            class84.field2183.update(arg2, 0, arg2.length - 2);
            int var7 = (int) class84.field2183.getValue();
            int var8 = (arg2[arg2.length + -2] << 8 & 65280) - -(arg2[arg2.length + -1] & 255);
            if (~super.field1970[arg0] != ~var7 || super.field1973[arg0] != var8) {
                this.field2628[arg0] = false;
                if (this.field2616 || arg3) {
                    class34.method303(arg3, this.field2612, 0, super.field1970[arg0], (byte) 2, arg0, this);
                }
                return;
            }
            this.field2628[arg0] = true;
            if (arg3) {
                super.field1975[arg0] = arg2;
            }
        }
        if (arg1 != 16711680) {
            this.method608(-80, -43);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V", line = 151)
    public static void method821(byte arg0) {
        field2617 = null;
        field2626 = null;
        field2634 = null;
        field2630 = null;
        field2621 = null;
        field2636 = null;
        field2611 = null;
        int var1 = -124 % ((63 - arg0) / 53);
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V", line = 191)
    private final void method822(byte arg0) {
        this.field2628 = new boolean[super.field1975.length];
        for (int var2 = 0; ~var2 > ~this.field2628.length; ++var2) {
            this.field2628[var2] = false;
        }
        ++field2614;
        if (this.field2610 == null) {
            this.field2623 = true;
        } else {
            this.field2624 = -1;
            for (int var3 = 0; ~var3 > ~this.field2628.length; ++var3) {
                if (~super.field1967[var3] < -1) {
                    class58.method452(4000, this, var3, this.field2610);
                    this.field2624 = var3;
                }
            }
            if (~this.field2624 == 0) {
                this.field2623 = true;
            }
            if (arg0 != 112) {
                this.field2628 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lne;Lne;IZZZ)V", line = 444)
    public class106(class83 arg0, class83 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2612 = arg2;
        this.field2616 = arg5;
        this.field2631 = arg1;
        this.field2610 = arg0;
        client.method178(this, this.field2612, 1);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V", line = 254)
    public static final void method823(boolean arg0) {
        if (arg0) {
            method827(false);
        }
        try {
            Graphics var1 = class54.field1411.getGraphics();
            class58.field1515.method122(127, var1, 553, 205);
        } catch (Exception var2) {
            class54.field1411.repaint();
        }
        ++field2609;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V", line = 281)
    public final void method612(byte arg0, int arg1) {
        ++field2627;
        if (arg0 == 73) {
            if (this.field2610 != null && this.field2628 != null && this.field2628[arg1]) {
                class55.method422(this, this.field2610, true, arg1);
            } else {
                class34.method303(true, this.field2612, 0, super.field1970[arg1], (byte) 2, arg1, this);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIZ[BZ)V", line = 299)
    public final void method824(int arg0, int arg1, boolean arg2, byte[] arg3, boolean arg4) {
        ++field2633;
        if (!arg4) {
            arg3[arg3.length + -2] = (byte) (super.field1973[arg0] >> 8);
            arg3[arg3.length + -1] = (byte) super.field1973[arg0];
            if (this.field2610 != null) {
                class10.method104(arg3, 33, arg0, this.field2610);
                this.field2628[arg0] = true;
            }
            if (arg2) {
                super.field1975[arg0] = arg3;
            }
        } else {
            if (this.field2623) {
                throw new RuntimeException();
            }
            if (this.field2631 != null) {
                class10.method104(arg3, -66, this.field2612, this.field2631);
            }
            this.method602(arg3, true);
            this.method822((byte) 112);
        }
        if (arg1 > -51) {
            this.method828((byte) 122, -70);
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)I", line = 345)
    public final int method825(int arg0) {
        if (arg0 <= 35) {
            return -9;
        } else {
            int var2 = 0;
            int var3 = 0;
            ++field2613;
            for (int var4 = 0; super.field1975.length > var4; ++var4) {
                if (~super.field1967[var4] < -1) {
                    var2 += 100;
                    var3 += this.method818(var4, -107);
                }
            }
            if (~var2 == -1) {
                return 100;
            } else {
                return var3 * 100 / var2;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(JI)V", line = 381)
    public static final void method826(long arg0, int arg1) {
        ++field2632;
        if (arg0 != 0L) {
            if ((class30.field764 < 100 || ~class63.field1610 == -2) && ~class30.field764 > -201) {
                class122 var3 = class24.method252(-6, arg0).method939(15365);
                for (int var4 = 0; ~var4 > ~class30.field764; ++var4) {
                    if (~class59.field1537[var4] == ~arg0) {
                        class55.method429(class51.field1287, 0, (byte) 48, class59.method454(new class122[] { var3, field2626 }, arg1 + 31786));
                        return;
                    }
                }
                if (arg1 == -26610) {
                    for (int var5 = 0; ~var5 > ~class25.field683; ++var5) {
                        if (~class129.field3133[var5] == ~arg0) {
                            class55.method429(class51.field1287, 0, (byte) 48, class59.method454(new class122[] { class92.field2345, var3, class29.field738 }, 5176));
                            return;
                        }
                    }
                    if (!var3.method933(class70.field1828.field1448, arg1 + 26610)) {
                        class75.field2020[class30.field764] = var3;
                        ++class67.field1728;
                        class59.field1537[class30.field764] = arg0;
                        class69.field1824[class30.field764] = 0;
                        class62.field1588 = true;
                        ++class30.field764;
                        class74.field1935.method996((byte) 125, 65);
                        class74.field1935.method480(arg0, 299629920);
                    }
                }
            } else {
                class55.method429(class51.field1287, 0, (byte) 48, class113.field2763);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)V", line = 460)
    public final void method608(int arg0, int arg1) {
        if (arg0 != -101) {
            this.field2631 = null;
        }
        class46.method382(-1999515952, arg1, this.field2612);
        ++field2629;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(Z)V", line = 477)
    public static final void method827(boolean arg0) {
        ++field2615;
        class119.method908((byte) 124);
        if (~client.field459 == -2) {
            class45.field1176[class47.field1215 / 100].method985(class42.field1061 + -8 + -4, class56.field1480 + -4 + -8);
        }
        if (client.field459 == 2) {
            class45.field1176[class47.field1215 / 100 + 4].method985(class42.field1061 + -8 + -4, class56.field1480 - 12);
        }
        if (!arg0) {
            method827(true);
        }
        if (~class82.field2133 != 0) {
            class75.method630(class82.field2133, 117);
            class47.method387(0, 0, 0, class82.field2133, 512, -1, -1, 4, 334);
        }
        if (~class47.field1210 != 0) {
            class75.method630(class47.field1210, 120);
            class47.method387(0, 0, 0, class47.field1210, 512, -1, -1, 0, 334);
        }
        class72.method584((byte) 94);
        if (!class50.field1261) {
            class42.method368(94);
            class28.method270(-18694);
        } else if (~class7.field176 == -1) {
            class59.method456(-123);
        }
        if (~class19.field508 == -2) {
            class69.field1810.method985(472, 296);
        }
        if (class108.field2672) {
            short var1 = 507;
            byte var2 = 20;
            int var3 = 16776960;
            if (~class120.field2903 > -31 && class109.field2703) {
                var3 = 16711680;
            }
            if (~class120.field2903 > -21 && !class109.field2703) {
                var3 = 16711680;
            }
            class60.field1553.method798(class59.method454(new class122[] { class88.field2231, class119.method914(class120.field2903, 10) }, 5176), var1, var2, var3);
            int var4 = 16776960;
            int var10 = var2 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            if (~var6 < -32769 && class109.field2703) {
                var4 = 16711680;
            }
            if (var6 > 65536 && !class109.field2703) {
                var4 = 16711680;
            }
            class60.field1553.method798(class59.method454(new class122[] { class10.field220, class119.method914(var6, 10), class56.field1468 }, 5176), var1, var10, var4);
            var10 += 15;
            if (class50.field1258) {
                class60.field1553.method798(class18.field439, var1, var10, 16711680);
                class50.field1258 = false;
                var10 += 15;
            }
            if (class10.field242) {
                class60.field1553.method798(client.field457, var1, var10, 16711680);
                var10 += 15;
                class10.field242 = false;
            }
            if (class70.field1840) {
                class60.field1553.method798(class127.field3087, var1, var10, 16711680);
                var10 += 15;
                class70.field1840 = false;
            }
        }
        if (class18.field417 != 0) {
            int var7 = class18.field417 / 50;
            int var8 = var7 / 60;
            int var9 = var7 % 60;
            if (var9 < 10) {
                class60.field1553.method800(class59.method454(new class122[] { class63.field1608, class119.method914(var8, 10), class118.field2846, class119.method914(var9, 10) }, 5176), 4, 329, 16776960);
            } else {
                class60.field1553.method800(class59.method454(new class122[] { class63.field1608, class119.method914(var8, 10), class51.field1292, class119.method914(var9, 10) }, 5176), 4, 329, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)V", line = 604)
    public final void method828(byte arg0, int arg1) {
        if (arg0 == 0) {
            this.field2618 = arg1;
            if (this.field2631 == null) {
                class34.method303(true, 255, 0, this.field2618, (byte) 0, this.field2612, this);
            } else {
                class55.method422(this, this.field2631, true, this.field2612);
            }
            ++field2620;
        }
    }
}
