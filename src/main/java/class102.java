import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class102 {

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "Z")
    private boolean field1657 = false;

    @OriginalMember(owner = "client!rba", name = "s", descriptor = "I")
    public int field1672 = 0;

    @OriginalMember(owner = "client!rba", name = "r", descriptor = "I")
    public int field1671 = 0;

    @OriginalMember(owner = "client!rba", name = "n", descriptor = "Leda;")
    public static class116 field1667 = new class116(90, 8);

    @OriginalMember(owner = "client!rba", name = "q", descriptor = "Z")
    public static boolean field1670 = false;

    @OriginalMember(owner = "client!rba", name = "t", descriptor = "Ljava/lang/Object;")
    public static volatile Object field1673 = null;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "F")
    public static float field1658;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public int field1655;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
    private int field1665;

    @OriginalMember(owner = "client!rba", name = "o", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!rba", name = "u", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!rba", name = "v", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "client!rba", name = "w", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "J")
    public long field1666;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILek;Z)V")
    private final void method852(int arg0, class465 arg1, boolean arg2) {
        if (!arg2) {
            this.method857(10);
        }
        if (arg0 == 1) {
            this.field1665 = arg1.method2755((byte) -80);
        } else if (arg0 == 2) {
            arg1.method2705(-19);
        } else if (arg0 == 3) {
            this.field1664 = arg1.method2691((byte) -67);
            this.field1660 = arg1.method2691((byte) -67);
            this.field1669 = arg1.method2691((byte) -67);
        } else if (arg0 == 4) {
            this.field1655 = arg1.method2705(-28);
            this.field1661 = arg1.method2691((byte) -67);
        } else if (arg0 == 6) {
            this.field1675 = arg1.method2705(-128);
        } else if (arg0 == 8) {
            this.field1672 = 1;
        } else if (arg0 == 9) {
            this.field1671 = 1;
        } else if (arg0 == 10) {
            this.field1657 = true;
        }
        field1674++;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "([BB)V")
    public static final void method853(byte[] arg0, byte arg1) {
        field1662++;
        class465 var2 = new class465(arg0);
        int var3 = -23 % ((-arg1 - 76) / 36);
        while (true) {
            int var4 = var2.method2705(-76);
            if (var4 == 0) {
                return;
            }
            if (var4 == 2) {
                class577.field8455 = var2.method2755((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIII)V")
    public static final void method854(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class544.field7990 != null) {
            class544.field7990[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class453.field6524 != null) {
            class453.field6524[arg0][arg1] = (short) arg3;
        }
        if (class352.field4941 != null) {
            class352.field4941[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public static void method855(int arg0) {
        field1673 = null;
        field1667 = null;
        if (arg0 != 0) {
            method858((byte) -120);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lek;I)V")
    public final void method856(class465 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2705(-74);
            if (var3 == 0) {
                field1654++;
                if (arg1 != -17470) {
                    this.field1664 = 111;
                    return;
                }
                return;
            }
            this.method852(var3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)V")
    public final void method857(int arg0) {
        field1668++;
        this.field1676 = class302.field4242[this.field1665 << 3];
        long var2 = (long) this.field1664;
        long var4 = (long) this.field1660;
        long var6 = (long) this.field1669;
        this.field1656 = (int) Math.sqrt((double) (var6 * var6 + var2 * var2 + var4 * var4));
        if (~this.field1661 == arg0) {
            this.field1661 = 1;
        }
        if (this.field1655 == 0) {
            this.field1666 = 2147483647L;
        } else if (this.field1655 == 1) {
            this.field1666 = (this.field1656 * 8 / this.field1661);
            this.field1666 *= this.field1666;
        } else if (this.field1655 == 2) {
            this.field1666 = (this.field1656 * 8 / this.field1661);
        }
        if (this.field1657) {
            this.field1656 *= -1;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
    public static final void method858(byte arg0) {
        field1659++;
        if (arg0 != 57) {
            method853(null, (byte) 118);
        }
        for (class131 var1 = (class131) class221.field3303.method3905(arg0 ^ 0xFFFFFFBF); var1 != null; var1 = (class131) class221.field3303.method3899(0)) {
            if (var1.field2136 == -1) {
                var1.field2131 = 0;
                if (var1.field2128 >= 0 && var1.field2140 >= 0 && class430.field6136 > var1.field2128 && var1.field2140 < class580.field8504) {
                    class539.method3172(var1, (byte) -79);
                }
            } else {
                var1.method2549((byte) -89);
            }
        }
    }
}
