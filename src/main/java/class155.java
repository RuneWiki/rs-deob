import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class class155 {

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Lsf;")
    public class551 field2533;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "[I")
    public static int[] field2538 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "D")
    public static double field2540 = -1.0D;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "[I")
    public static int[] field2535;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIB)V")
    public abstract void method254(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public void method256(int arg0) {
        if (arg0 >= -19) {
            this.method260(-12);
        }
        field2543++;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ)V")
    public abstract void method258(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public void method251(byte arg0) {
        if (arg0 > 87) {
            field2539++;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lbr;II)V")
    public abstract void method259(class416 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lsf;)V")
    public class155(class551 arg0) {
        this.field2533 = arg0;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Z")
    public abstract boolean method250(int arg0);

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V")
    public void method260(int arg0) {
        if (arg0 == 110) {
            field2537++;
        }
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
    public void method253(int arg0) {
        field2536++;
        if (arg0 != 155) {
            field2535 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
    public void method1210(byte arg0) {
        if (arg0 != 2) {
            field2540 = -0.011764861997762454D;
        }
        field2541++;
    }

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)V")
    public abstract void method255(int arg0);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
    public static void method1211(boolean arg0) {
        if (arg0) {
            method1211(true);
        }
        field2538 = null;
        field2535 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZZ)V")
    public abstract void method257(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "(I)V")
    public void method252(int arg0) {
        if (arg0 == 155) {
            field2542++;
        }
    }
}
