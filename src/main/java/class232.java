import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class232 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Lna;")
    public static class26 field3668 = class69.method505("M-Bmoire en cours d(Wattribution", (byte) -126);

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field3674 = -1;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field3677 = 0;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Lna;")
    public static class26 field3680 = class69.method505("Clientscript error )2 check log for details", (byte) -117);

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)V", line = 5)
    public static final void method1559(int arg0, int arg1, byte arg2) {
        class120 var3 = class293.method2059(4, 6, arg1);
        field3681++;
        var3.method833((byte) 33);
        if (arg2 >= -103) {
            field3668 = (class26) null;
        }
        var3.field1877 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I", line = 18)
    public static final int method1560(boolean arg0, KeyEvent arg1) {
        field3671++;
        int var2 = arg1.getKeyChar();
        if (!arg0) {
            return -90;
        } else if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lwa;I)V", line = 41)
    public final void method1561(class82 arg0, int arg1) {
        field3672++;
        while (true) {
            int var3 = arg0.method642((byte) -41);
            if (var3 == 0) {
                int var4 = -26 % ((-arg1 - 36) / 58);
                return;
            }
            this.method1563(arg0, 1, var3);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 64)
    public static void method1562(boolean arg0) {
        field3668 = null;
        field3680 = null;
        if (!arg0) {
            field3676 = 8;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lwa;II)V", line = 76)
    private final void method1563(class82 arg0, int arg1, int arg2) {
        field3669++;
        if (arg1 == arg2) {
            this.field3679 = arg0.method576(arg1);
            this.field3670 = arg0.method642((byte) -30);
            this.field3675 = arg0.method642((byte) -89);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Lwa;I)V", line = 103)
    public static final void method1564(class82 arg0, int arg1) {
        field3678++;
        if ((arg0.field1280.length - arg0.field1301) < 1) {
            return;
        }
        int var2 = arg0.method642((byte) -23);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field1280.length - arg0.field1301) < var3) {
            return;
        }
        class57.field923 = arg0.method642((byte) -113);
        if (class57.field923 < 1) {
            class57.field923 = 1;
        } else if (class57.field923 > 4) {
            class57.field923 = 4;
        }
        class39.method320(arg1 + 97, arg0.method642((byte) -40) == 1);
        class8.field95 = arg0.method642((byte) -44) == 1;
        class22.field307 = arg0.method642((byte) -39) == 1;
        class39.field643 = arg0.method642((byte) -85) == 1;
        class297.field5041 = arg0.method642((byte) -126) == 1;
        class166.field2574 = arg0.method642((byte) -107) == 1;
        class268.field4435 = arg0.method642((byte) -86) == 1;
        class319.field5471 = arg0.method642((byte) -48) == 1;
        class295.field4918 = arg0.method642((byte) -107);
        if (class295.field4918 > 2) {
            class295.field4918 = 2;
        }
        if (var2 < 2) {
            class25.field360 = arg0.method642((byte) -81) == 1;
            arg0.method642((byte) -67);
        } else {
            class25.field360 = arg0.method642((byte) -35) == 1;
        }
        class244.field4012 = arg0.method642((byte) -56) == 1;
        class45.field707 = arg0.method642((byte) -98) == 1;
        class33.field560 = arg0.method642((byte) -62);
        if (class33.field560 > 2) {
            class33.field560 = 2;
        }
        class2.field17 = class33.field560;
        class303.field5227 = arg0.method642((byte) -59) == 1;
        class263.field4311 = arg0.method642((byte) -25);
        if (class263.field4311 > 127) {
            class263.field4311 = 127;
        }
        class92.field1499 = arg0.method642((byte) -82);
        class42.field696 = arg0.method642((byte) -58);
        if (class42.field696 > 127) {
            class42.field696 = 127;
        }
        if (var2 >= 1) {
            class283.field4721 = arg0.method576(1);
            class310.field5331 = arg0.method576(1);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method642((byte) -87);
        }
        if (var2 >= 4) {
            int var4 = arg0.method642((byte) -88);
            if (class293.field4880 < 96) {
                var4 = 0;
            }
            class19.method127(var4);
        }
        if (var2 >= 5) {
            class26.field387 = arg0.method587(-502942936);
        }
        if (arg1 != -1) {
            field3680 = (class26) null;
        }
        if (var2 >= 6) {
            class96.field1574 = arg0.method642((byte) -100);
        }
        if (var2 >= 7) {
            class26.field380 = arg0.method642((byte) -24) == 1;
        }
        if (var2 >= 8) {
            class316.field5411 = arg0.method642((byte) -96) == 1;
        }
        if (var2 >= 9) {
            class210.field3269 = arg0.method642((byte) -73);
        }
        if (var2 >= 10) {
            class233.field3684 = arg0.method642((byte) -94) != 0;
        }
        if (var2 >= 11) {
            class59.field960 = arg0.method642((byte) -44) != 0;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Z", line = 265)
    public static final boolean method1565(int arg0) {
        field3673++;
        return ~class306.field5280 == arg0 ? class225.field3568.method966(-128) : true;
    }
}
