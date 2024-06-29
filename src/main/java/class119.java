import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class119 extends class208 {

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    private int field1496 = 0;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Lpt;")
    private class460 field1488 = new class460();

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field1491 = 2;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "[C")
    public static char[] field1498 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field1493 = 0;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "Lig;")
    public static class206 field1490 = new class206(22, -2);

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "[Z")
    public static boolean[] field1484;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 4)
    private final void method733(byte arg0) {
        if (arg0 < -125) {
            ++field1495;
            int var2 = super.field2790++;
            if (~super.field2790 <= -5001) {
                super.field2790 = 0;
            }
            this.field1496 = super.field2788[var2];
            Object var3 = super.field2787[var2];
            super.field2787[var2] = null;
            if (this.field1496 == 21) {
                class435.method2716(this.field1488, (class99) var3);
            } else if (this.field1496 != 20) {
                if (~this.field1496 <= -31 && ~this.field1496 >= -34) {
                    ((class132) var3).method262(class550.field7844, class650.field9385, class224.field3164, class437.field6505, ~(this.field1496 + -30) == -1);
                } else if (~this.field1496 <= -41 && ~this.field1496 >= -44) {
                    ((class132) var3).method262(class550.field7844, class650.field9385, class224.field3164, class270.field3789, this.field1496 + -40 == 0);
                } else if (this.field1496 == 22) {
                    class103.field1228.method365(-1, 1583160, 40, 127);
                } else {
                    if (this.field1496 != 23) {
                        if (~this.field1496 == -25) {
                            class103.field1228.method340(0, (class321[]) null);
                            return;
                        }
                    } else {
                        class103.field1228.method373();
                    }
                }
            } else {
                class99 var4 = (class99) var3;
                if (var4.field1168 != null) {
                    var4.field1168.method90(class103.field1228, -5);
                }
                if (var4.field1176 != null) {
                    var4.field1176.method90(class103.field1228, -5);
                }
                if (var4.field1175 != null) {
                    var4.field1175.method90(class103.field1228, -5);
                }
                if (var4.field1161 != null) {
                    var4.field1161.method90(class103.field1228, -5);
                }
                if (var4.field1174 != null) {
                    var4.field1174.method90(class103.field1228, -5);
                }
                for (class104 var5 = var4.field1167; var5 != null; var5 = var5.field1251) {
                    var5.field1253.method90(class103.field1228, -5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V", line = 104)
    public final void method734(boolean arg0) {
        ++field1483;
        if (!arg0) {
            while (super.field2790 != super.field2786) {
                this.method733((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ld;IBZ)V", line = 118)
    public final void method735(class132 arg0, int arg1, byte arg2, boolean arg3) {
        ++field1485;
        super.field2788[super.field2786] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
        if (arg2 != -10) {
            method737(-115);
        }
        super.field2787[super.field2786] = arg0;
        ++super.field2786;
        if (~super.field2786 <= -5001) {
            super.field2786 = 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZLuaa;)V", line = 138)
    public final void method736(boolean arg0, class99 arg1) {
        super.field2788[super.field2786] = 21;
        ++field1492;
        super.field2787[super.field2786] = arg1;
        if (arg0) {
            this.field1488 = null;
        }
        ++super.field2786;
        if (~super.field2786 <= -5001) {
            super.field2786 = 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 155)
    public static final void method737(int arg0) {
        class402.field6088.method2163(5, -21515);
        ++field1482;
        class108.field1317.method513(5, (byte) 25);
        class130.field1626.method3541((byte) -90, 5);
        class575.field8301.method1505(5, (byte) 2);
        class224.field3151.method1823(5, -110);
        class622.field8999.method24(-1, 5);
        class259.field3686.method2967(false, 5);
        class141.field1735.method3662(5, 64);
        class300.field4421.method1257((byte) 47, 5);
        class574.field8290.method941(5, true);
        class393.field6020.method29(5, 19819);
        class59.field680.method1015(5, (byte) -103);
        class601.field8769.method112(5, (byte) 110);
        class565.field8053.method3492((byte) -38, 5);
        class122.field1533.method3138(5, -29831);
        class61.field702.method2033(5, -128);
        int var1 = 65 / ((arg0 - -45) / 61);
        class173.field2125.method1022(5, 30);
        class3.field23.method423(5, (byte) 18);
        class281.field3925.method48(5, true);
        class509.field7410.method727(26, 5);
        class565.method3274((byte) -114, 5);
        class163.method947(true, 50);
        class493.method2955((byte) 66, 5);
        class435.method2718(false, 5);
        class289.field3992.method1811((byte) -73, 5);
        class613.field8910.method1811((byte) 109, 5);
        class126.field1555.method1811((byte) -123, 5);
        class428.field6354.method1811((byte) 105, 5);
        class604.field8844.method1811((byte) 115, 5);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)V", line = 193)
    public final void method738(int arg0, boolean arg1) {
        if (!arg1) {
            field1493 = -52;
        }
        ++field1494;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V", line = 207)
    public final void method739(boolean arg0) {
        if (arg0) {
            this.field1488 = null;
        }
        ++field1499;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Luaa;B)V", line = 217)
    public final void method740(class99 arg0, byte arg1) {
        if (arg1 != 13) {
            field1484 = null;
        }
        super.field2788[super.field2786] = 20;
        ++field1500;
        super.field2787[super.field2786] = arg0;
        ++super.field2786;
        if (~super.field2786 <= -5001) {
            super.field2786 = 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 237)
    public final void method741(int arg0, int arg1) {
        if (arg0 != 5000) {
            field1491 = 75;
        }
        ++field1487;
        super.field2788[super.field2786] = (byte) arg1;
        ++super.field2786;
        if (~super.field2786 <= -5001) {
            super.field2786 = 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Luaa;Z)V", line = 253)
    public final void method742(class99 arg0, boolean arg1) {
        ++field1489;
        if (arg1) {
            method743((class545) null, (Object) null, -113);
        }
        --super.field2790;
        if (super.field2790 < 0) {
            super.field2790 = 4999;
        }
        super.field2788[super.field2790] = 21;
        super.field2787[super.field2790] = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ltq;Ljava/lang/Object;I)V", line = 271)
    public static final void method743(class545 arg0, Object arg1, int arg2) {
        ++field1486;
        if (arg0.field7807 != null) {
            for (int var3 = 0; ~var3 > -51 && arg0.field7807.peekEvent() != null; ++var3) {
                class646.method3696(arg2 + 52, 1L);
            }
            if (arg1 != null) {
                arg0.field7807.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
            if (arg2 != -51) {
                method737(27);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V", line = 309)
    public static void method744(byte arg0) {
        if (arg0 != -70) {
            field1498 = null;
        }
        field1484 = null;
        field1498 = null;
        field1490 = null;
    }
}
