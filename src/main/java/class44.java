import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class44 extends class138 {

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public int field653 = 0;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public static int field655 = -1;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public static int field656 = 1;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field664 = 0;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "Lck;")
    public static class119 field662 = class298.method1987((byte) 9, "::errortest");

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "Luc;")
    public static class253 field660;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 12)
    public static final int method342(int arg0, Random arg1, int arg2) {
        field659++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class206.method1301(arg2, arg0)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class204.method1292(var4, (byte) 58, arg0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V", line = 39)
    public static final void method343(int arg0) {
        if (arg0 != 1) {
            return;
        }
        if (class299.field5049 != null) {
            class153 var1 = class299.field5049;
            synchronized (class299.field5049) {
                class299.field5049 = null;
            }
        }
        field663++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lfj;I)V", line = 65)
    public final void method344(class3 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field658++;
        while (true) {
            int var3 = arg0.method64((byte) -91);
            if (var3 == 0) {
                return;
            }
            this.method346(arg0, var3, -115);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)V", line = 87)
    public static void method345(byte arg0) {
        field662 = null;
        int var1 = -121 / ((43 - arg0) / 52);
        field660 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lfj;II)V", line = 98)
    private final void method346(class3 arg0, int arg1, int arg2) {
        field661++;
        int var4 = 90 % ((arg2 + 21) / 44);
        if (arg1 == 2) {
            this.field653 = arg0.method63((byte) 1);
        }
    }
}
