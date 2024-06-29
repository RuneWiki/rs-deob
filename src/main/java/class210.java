import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class210 extends class60 {

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Lub;")
    public static class227 field3561 = class257.method1749("Texturen geladen)3", 17263);

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "[I")
    public static int[] field3562 = new int[500];

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Lnf;")
    public static class213 field3560;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static void method1340(int arg0) {
        field3561 = null;
        field3562 = null;
        field3560 = null;
        if (arg0 > -34) {
            method1341(83);
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public static final void method1341(int arg0) {
        if (arg0 != -1) {
            method1341(87);
        }
        class5.field115.method1728(true);
        field3559++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method1342(int arg0, Random arg1, int arg2) {
        field3557++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class12.method55(arg2, 2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = 99 / ((-arg0 - 54) / 51);
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var5;
            do {
                var5 = arg1.nextInt();
            } while (var4 <= var5);
            return class109.method674((byte) 124, var5, arg2);
        }
    }
}
