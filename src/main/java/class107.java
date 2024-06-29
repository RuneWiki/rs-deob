import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class107 extends class67 {

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "[I")
    public static int[] field2604 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!re", name = "lb", descriptor = "I")
    public static int field2610 = 0;

    @OriginalMember(owner = "client!re", name = "qb", descriptor = "Lgd;")
    private static class40 field2615 = class14.method90(false, " has logged in)3");

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    public static int field2601 = 0;

    @OriginalMember(owner = "client!re", name = "jb", descriptor = "Lgd;")
    public static class40 field2608 = field2615;

    @OriginalMember(owner = "client!re", name = "nb", descriptor = "[I")
    public static int[] field2612 = new int[500];

    @OriginalMember(owner = "client!re", name = "sb", descriptor = "[Z")
    public static boolean[] field2617 = new boolean[112];

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "I")
    public int field2602;

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!re", name = "ib", descriptor = "I")
    public int field2607;

    @OriginalMember(owner = "client!re", name = "mb", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!re", name = "ob", descriptor = "I")
    public int field2613;

    @OriginalMember(owner = "client!re", name = "pb", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!re", name = "rb", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!re", name = "tb", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!re", name = "ub", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "Lw;")
    public static class135 field2603;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "[I")
    public int[] field2597;

    @OriginalMember(owner = "client!re", name = "kb", descriptor = "[I")
    public int[] field2609;

    @OriginalMember(owner = "client!re", name = "vb", descriptor = "[Lgd;")
    public class40[] field2620;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "[Lhd;")
    public static class46[] field2600;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V", line = 3)
    public static void method824(int arg0) {
        field2608 = null;
        field2603 = null;
        field2615 = null;
        field2612 = null;
        field2600 = null;
        field2604 = null;
        if (arg0 != 0) {
            field2606 = -12;
        }
        field2617 = null;
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V", line = 35)
    public static final void method825(int arg0) {
        class96.field2229 = null;
        class30.field754 = null;
        if (arg0 != -13254) {
            method827(-118);
        }
        field2598++;
        class129.field3086 = null;
        class134.field3271 = null;
        class120.field2842 = null;
        class122.field2860 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILrc;)[Ljava/lang/Object;", line = 68)
    public static final Object[] method826(int arg0, class104 arg1) {
        field2599++;
        int var2 = arg1.method798((byte) -62);
        if (var2 == 0) {
            return null;
        }
        Object[] var3 = new Object[var2];
        int var4 = 52 % ((-arg0 - 14) / 41);
        for (int var5 = 0; var5 < var2; var5++) {
            int var6 = arg1.method798((byte) -63);
            if (var6 == 0) {
                var3[var5] = Integer.valueOf(arg1.method774(-29404));
            } else if (var6 == 1) {
                var3[var5] = arg1.method765(13101);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)I", line = 124)
    public static final int method827(int arg0) {
        int var1 = -58 % ((arg0 - 52) / 58);
        field2619++;
        return 19;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(ZI)V", line = 139)
    public static final void method828(boolean arg0, int arg1) {
        field2605++;
        class11.method58(false, (byte) -115, arg1, 0, null);
        if (!arg0) {
            method824(89);
        }
    }
}
