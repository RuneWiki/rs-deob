import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class57 {

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Ljava/lang/String;")
    public static String field945 = " ";

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Loh;")
    public static class281 field944 = new class281(500);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method432(int arg0) {
        field936++;
        class109.method781(arg0 - 103);
        class230.method1535(613239950);
        class49.method362(true);
        class274.method1845(arg0 ^ 0xFFFFFFF6);
        class44.method323(1);
        if (arg0 != -2) {
            return;
        }
        class174.method1180(0);
        class58.method442((byte) 122);
        class66.method486(-128);
        class43.method318((byte) -91);
        class239.method1640(22859);
        class241.method1650(7957);
        class132.method917(arg0 - 85);
        class198.method1346((byte) 126);
        class29.method224(true);
        class20.method186((byte) 21);
        class50.method377(17627);
        class40.method295(104);
        class243.method1682(-65);
        class60.method460(3);
        class174.method1181((byte) -52);
        class181.field2824.method1888(127);
        class217.field3355.method1888(126);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public static void method433(boolean arg0) {
        field944 = null;
        if (arg0) {
            field948 = -48;
        }
        field945 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Ljb;")
    public final class276 method434(byte arg0) {
        field942++;
        if (arg0 <= 94) {
            method432(-17);
        }
        class276 var2 = (class276) class62.field1072.method1887(0, (long) this.field946);
        if (var2 != null) {
            return var2;
        }
        class276 var3 = class112.method795(this.field946, class170.field2649, 0, 0);
        if (var3 != null) {
            class62.field1072.method1886(-74, (long) this.field946, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static final void method435(int arg0) {
        if (arg0 != 10) {
            return;
        }
        field938++;
        if (class80.field1340) {
            return;
        }
        if (class109.field1782) {
            class142.field2160 = (float) ((int) class142.field2160 + 47 & 0xFFFFFFF0);
        } else {
            class43.field613 += (12.0F - class43.field613) / 2.0F;
        }
        class115.field1877 = true;
        class80.field1340 = true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lhc;I)V")
    public static final void method436(class235 arg0, int arg1) {
        field947++;
        if (arg1 > 102) {
            class37.field519 = arg0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lai;III)V")
    private final void method437(class88 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field946 = arg0.method645(11596);
        } else if (arg2 == 2) {
            this.field940 = arg0.method633(107);
            this.field939 = arg0.method633(78);
        }
        field941++;
        if (arg3 != 3919) {
            method433(true);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method438(String arg0, int arg1) {
        if (arg1 == 47) {
            field943++;
            return class18.method173(10, (byte) -118, arg0, true);
        } else {
            return -83;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lai;II)V")
    public final void method439(class88 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method633(84);
            if (var4 == 0) {
                if (arg2 != 500) {
                    return;
                }
                field935++;
                return;
            }
            this.method437(arg0, arg1, var4, 3919);
        }
    }
}
