import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class270 {

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Le;")
    public static class191 field4757 = class54.method368("Speicher wird zugewiesen)3", 2047);

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field4759 = 0;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
    public static int[] field4761 = new int[500];

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field4756 = 0;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[[I")
    public static int[][] field4762 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[[S")
    public static short[][] field4768 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[[[B")
    public static byte[][][] field4755 = new byte[4][104][104];

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field4767 = -1;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lbe;")
    public class16 field4760;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Ltg;")
    public static class78 field4764;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method1842(int arg0) {
        field4764 = null;
        field4761 = null;
        field4757 = null;
        if (arg0 != 16) {
            method1843(-91, 105, -110);
        }
        field4762 = null;
        field4768 = null;
        field4755 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
    public static final void method1843(int arg0, int arg1, int arg2) {
        field4758++;
        class35 var3 = class256.method1767(arg0, (byte) -109);
        int var4 = var3.field652;
        int var5 = var3.field644;
        int var6 = var3.field646;
        if (arg1 >= -6) {
            method1845((byte) -126);
        }
        int var7 = class161.field2718[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class14.method98(class164.field2778[var4] & ~var8 | arg2 << var5 & var8, false, var4);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)I")
    public static final int method1844(int arg0) {
        int var1 = 41 % ((-arg0 - 56) / 53);
        field4769++;
        return 16;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static final void method1845(byte arg0) {
        int var1 = 54 % ((70 - arg0) / 54);
        field4770++;
        int[] var2 = new int[class42.field745];
        int var3 = 0;
        for (int var4 = 0; var4 < class42.field745; var4++) {
            class148 var6 = class100.method623(-1, var4);
            if (var6.field2505 >= 0 || var6.field2549 >= 0) {
                var2[var3++] = var4;
            }
        }
        class10.field118 = new int[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            class10.field118[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
    public static final void method1846(int arg0, int arg1) {
        class62.field1110.method990(110, arg1);
        class18.field241.method990(arg0 - 10405, arg1);
        class163.field2756.method990(90, arg1);
        if (arg0 != 10438) {
            method1844(-87);
        }
        field4765++;
    }
}
