import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class51 {

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public int field768 = 1;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field767 = new String[200];

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "[S")
    public static short[] field771 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Lhi;")
    public static class131 field776 = new class131(11, 0, 1, 2);

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "Z")
    public static boolean field778 = false;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "C")
    public char field777;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Lql;")
    public static class496 field775;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method356(int arg0) {
        field771 = null;
        field776 = null;
        field775 = null;
        if (arg0 == 1) {
            field767 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Z")
    public static final boolean method357(int arg0) {
        field765++;
        class2 var1 = (class2) class329.field4932.field45.field2795;
        if (var1 == null || class329.field4932.field45 == var1) {
            return false;
        }
        if (var1.field17 >= 2000) {
            var1.field17 -= 2000;
        }
        if (arg0 != 23951) {
            method356(-65);
        }
        return var1.field17 == 1007;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)[Lnd;")
    public static final class366[] method358(byte arg0) {
        field769++;
        if (arg0 != -20) {
            field767 = null;
        }
        return new class366[] { class341.field5091, class314.field4741, class291.field4437, class473.field7233, class93.field1661, class484.field7389, class33.field453, class370.field5437, class502.field7594, class15.field219, class152.field2436, class448.field6904, class221.field3405, class230.field3502, class270.field4085 };
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lha;II)V")
    private final void method359(class40 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field777 = class349.method2126(127, arg0.method262(-2));
        } else if (arg2 == 2) {
            this.field768 = 0;
        }
        field770++;
        if (arg1 < 61) {
            this.method360(null, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lha;B)V")
    public final void method360(class40 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method257((byte) 89);
            if (var3 == 0) {
                int var4 = -8 / ((arg1 - 8) / 53);
                field772++;
                return;
            }
            this.method359(arg0, 98, var3);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZI)I")
    public static final int method361(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return -42;
        }
        field773++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }
}
