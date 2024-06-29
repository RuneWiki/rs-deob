import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class114 {

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lha;")
    public static class46 field2156 = class271.method1828(":trade:", -46);

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field2158 = -1;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field2152 = 0;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lha;")
    public static class46 field2154 = class271.method1828("Angreifen", -46);

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field2157 = -1;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field2161 = 0;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lha;")
    public static class46 field2162 = class271.method1828("Fertigkeit: ", -46);

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[Lca;")
    public static class122[] field2159;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I")
    public static final int method923(int arg0, int arg1, int arg2) {
        field2155++;
        int var3 = 109 % ((-arg0 - 21) / 62);
        int var4 = arg2 * 57 + arg1;
        int var5 = var4 << 13 ^ var4;
        int var6 = (var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE;
        return (var6 & 0x7FECA00) >> 19;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public static final void method924(int arg0, int arg1) {
        if (arg0 != -25274) {
            field2161 = -80;
        }
        field2160++;
        class146 var2 = class6.method22((byte) 16, 5, arg1);
        var2.method1082((byte) -122);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)Z")
    public static final boolean method925(boolean arg0) {
        field2153++;
        class210 var1 = class48.field830;
        synchronized (class48.field830) {
            if (class76.field1426 == class259.field4521) {
                return false;
            }
            class274.field4784 = class184.field3288[class76.field1426];
            if (arg0) {
                return false;
            } else {
                class244.field4336 = class83.field1593[class76.field1426];
                class76.field1426 = class76.field1426 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)I")
    public static final int method926(int arg0) {
        field2163++;
        if (arg0 != 0) {
            method926(-15);
        }
        return class14.field210;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method927(byte arg0) {
        if (arg0 != -61) {
            field2162 = null;
        }
        field2159 = null;
        field2156 = null;
        field2154 = null;
        field2162 = null;
    }
}
