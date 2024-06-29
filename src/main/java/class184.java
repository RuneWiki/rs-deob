import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class184 {

    @OriginalMember(owner = "client!br", name = "z", descriptor = "B")
    public byte field2671 = 0;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "B")
    public byte field2656;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "B")
    public byte field2668;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "S")
    public short field2655;

    @OriginalMember(owner = "client!br", name = "E", descriptor = "S")
    public short field2676;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "Lio;")
    public static class151 field2663 = new class151(4, 1, 1, 1);

    @OriginalMember(owner = "client!br", name = "o", descriptor = "B")
    public byte field2660;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "B")
    public byte field2664;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "B")
    public byte field2665;

    @OriginalMember(owner = "client!br", name = "C", descriptor = "B")
    public byte field2674;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "Lbr;")
    public class184 field2667;

    @OriginalMember(owner = "client!br", name = "D", descriptor = "Lgaa;")
    public class277 field2675;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "Lnba;")
    public class363 field2653;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "Lnba;")
    public class363 field2669;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "Lao;")
    public class367 field2666;

    @OriginalMember(owner = "client!br", name = "A", descriptor = "Lao;")
    public class367 field2672;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "Lvj;")
    public class382 field2657;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "Lkd;")
    public class493 field2662;

    @OriginalMember(owner = "client!br", name = "B", descriptor = "Lsh;")
    public class616 field2673;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "S")
    public short field2658;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "Z")
    public boolean field2654;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "Z")
    public boolean field2661;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "Z")
    public boolean field2670;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 4)
    public static void method1231(int arg0) {
        if (arg0 <= 117) {
            field2663 = null;
        }
        field2663 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(CI)C", line = 16)
    public static final char method1232(char arg0, int arg1) {
        field2646++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else if (arg0 == 'œ') {
            return 'e';
        } else {
            return (char) (arg1 == -5492 ? '\u0000' : 65474);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V", line = 44)
    public final void method1233(int arg0) {
        while (this.field2675 != null) {
            class277 var2 = this.field2675.field4045;
            this.field2675.method1782((byte) 59);
            this.field2675 = var2;
        }
        field2652++;
        this.field2671 = 0;
        if (arg0 <= 3) {
            this.field2666 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ldg;I)I", line = 68)
    public static final int method1234(class20 arg0, int arg1) {
        field2649++;
        if (arg1 != 0) {
            return -122;
        } else if (class477.field6813 == arg0) {
            return 5890;
        } else if (class371.field5369 == arg0) {
            return 34167;
        } else if (class554.field7834 == arg0) {
            return 34168;
        } else if (class104.field1753 == arg0) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lgp;Lgp;ILgp;Ltda;)Z", line = 95)
    public static final boolean method1235(class561 arg0, class561 arg1, int arg2, class561 arg3, class16 arg4) {
        class580.field8277 = arg3;
        if (arg2 != 29819) {
            field2663 = null;
        }
        class304.field4388 = arg1;
        class8.field77 = arg0;
        field2648++;
        class193.field2780 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(III)V", line = 111)
    public class184(int arg0, int arg1, int arg2) {
        this.field2668 = this.field2656 = (byte) arg0;
        this.field2655 = (short) arg2;
        this.field2676 = (short) arg1;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)Lbea;", line = 133)
    public static final class644 method1236(boolean arg0) {
        field2650++;
        if (!arg0) {
            field2663 = null;
        }
        return class212.field3093;
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)[Lml;", line = 151)
    public static final class36[] method1237(int arg0) {
        field2651++;
        if (arg0 != -224) {
            method1237(-6);
        }
        return new class36[] { class563.field8065, class446.field6509, class276.field4033, class261.field3800, class97.field1693, class461.field6673 };
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(Z)V", line = 167)
    public static final void method1238(boolean arg0) {
        field2647++;
        if (class609.field8659 == -1) {
            return;
        }
        int var1 = class619.field8735.method1614((byte) -46);
        int var2 = class619.field8735.method1607((byte) -78);
        class7 var3 = (class7) class360.field5112.method427(arg0);
        if (var3 != null) {
            var1 = var3.method27(!arg0);
            var2 = var3.method26(true);
        }
        class422.method2538(0, class442.field6464, 5121, var2, 0, 0, class609.field8659, class68.field1285, var1, 0);
        if (class276.field4034 != null) {
            class602.method3416(var2, var1, (byte) 12);
        }
    }
}
