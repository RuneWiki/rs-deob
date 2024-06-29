import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class206 extends class260 {

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "[S")
    public static short[] field2690 = new short[256];

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "[I")
    public static int[] field2698 = new int[4096];

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public static int field2699 = 4;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public static int field2700 = 0;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "[B")
    public static byte[] field2696 = new byte[520];

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "Lmga;")
    public static class739 field2691 = new class739(9, 3);

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "Lmga;")
    public static class739 field2701 = new class739(4, 3);

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "D")
    public static double field2702;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "Lvfa;")
    public static class701 field2703;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)I")
    public final int method1378(int arg0) {
        ++field2694;
        if (arg0 < 3) {
            field2703 = null;
        }
        return super.field3868;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        if (super.field3867.method740((byte) -121)) {
            super.field3868 = 0;
        }
        ++field2697;
        if (~super.field3868 != -2 && ~super.field3868 != -1) {
            super.field3868 = this.method8((byte) 4);
        }
        if (arg0) {
            field2696 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)Z")
    public final boolean method1379(int arg0) {
        ++field2693;
        int var2 = 17 % ((56 - arg0) / 53);
        return !super.field3867.method740((byte) -104);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB)I")
    public final int method4(int arg0, byte arg1) {
        ++field2695;
        int var3 = 1 % ((-53 - arg1) / 50);
        return super.field3867.method740((byte) -118) ? 3 : 1;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(IB)V")
    public final void method9(int arg0, byte arg1) {
        super.field3868 = arg0;
        ++field2689;
        if (arg1 != -107) {
            this.method8((byte) -125);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)I")
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            field2698 = null;
        }
        ++field2692;
        return 1;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(ILfca;)V")
    public class206(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
    public static void method1380(int arg0) {
        field2696 = null;
        field2703 = null;
        field2690 = null;
        field2701 = null;
        field2698 = null;
        int var1 = -44 / ((60 - arg0) / 41);
        field2691 = null;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lfca;)V")
    public class206(class92 arg0) {
        super(arg0);
    }
}
