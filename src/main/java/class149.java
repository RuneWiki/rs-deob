import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class149 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lha;")
    public static class46 field2669 = class271.method1828("Versteckt", -46);

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Z")
    public static boolean field2672 = false;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lha;")
    public static class46 field2673 = class271.method1828(")3runescape)3com)4l=", -46);

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field2674 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
    public static final void method1099(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        if (arg0 == -1 && !class29.field572) {
            class219.method1523(-71);
        } else if (arg0 != -1 && (class51.field890 != arg0 || !class26.method184(-59)) && class205.field3685 != 0 && !class29.field572) {
            class175.method1256(0, 17085, class130.field2390, 2, false, class205.field3685, arg0);
        }
        class51.field890 = arg0;
        field2668++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static final void method1100(byte arg0) {
        field2666++;
        if ((class45.field746 < class83.field1602)) {
            class45.field746 = (float) ((double) class45.field746 / 30.0D + (double) class45.field746);
            if (class45.field746 > class83.field1602) {
                class45.field746 = class83.field1602;
            }
            class212.method1498(-118);
        } else if (class45.field746 > class83.field1602) {
            class45.field746 = (float) ((double) class45.field746 - (double) class45.field746 / 30.0D);
            if (class45.field746 < class83.field1602) {
                class45.field746 = class83.field1602;
            }
            class212.method1498(-44);
        }
        if (class26.field521 != -1 && class146.field2644 != -1) {
            int var1 = class26.field521 - class57.field950;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class57.field950 += var1;
            int var2 = class146.field2644 - class194.field3490;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class26.field521 = -1;
                class146.field2644 = -1;
            }
            class194.field3490 += var2;
            class212.method1498(-91);
        }
        int var3 = 120 % ((arg0 + 49) / 61);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static final void method1101(boolean arg0) {
        if (arg0) {
            class111.field2080 = class212.field3772;
            class119.field2228 = class258.field4491;
        } else {
            class111.field2080 = class198.field3543;
            class119.field2228 = class2.field33;
        }
        class198.field3545 = class111.field2080.length;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static void method1102(byte arg0) {
        field2673 = null;
        int var1 = -40 % ((-arg0 - 58) / 55);
        field2669 = null;
    }
}
