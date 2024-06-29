import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class317 extends class404 {

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "[[Z")
    public static boolean[][] field4776 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "Loe;")
    public static class127 field4768 = new class127(11, 6);

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "I")
    public static int field4777 = 1406;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    private int field4770;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    private int field4771;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    private int field4774;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIZ)Lht;", line = 3)
    public static final class394 method1885(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4773;
        class394 var5 = new class394();
        var5.field5753 = arg3;
        var5.field5750 = arg1;
        class245.field3741.method2413((long) arg0, -1, var5);
        if (arg2 != -2406) {
            field4777 = -59;
        }
        class19.method101((byte) -21, arg1);
        class427 var6 = class413.method2435(160291920, arg0);
        if (var6 != null) {
            class288.method1754(var6, arg2 + 2406);
        }
        if (class198.field3118 != null) {
            class288.method1754(class198.field3118, 0);
            class198.field3118 = null;
        }
        class498.method2991((byte) -22);
        if (var6 != null) {
            class82.method590(var6, !arg4, true);
        }
        if (!arg4) {
            class94.method703(arg1);
        }
        if (!arg4 && ~class375.field5475 != 0) {
            class141.method933(255, 1, class375.field5475);
        }
        return var5;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)V", line = 45)
    private final void method1886(int arg0, int arg1) {
        this.field4771 = (16711680 & arg0) >> 12;
        this.field4770 = arg0 >> 4 & 4080;
        if (arg1 > 102) {
            this.field4774 = arg0 << 4 & 4080;
            ++field4769;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILha;I)V", line = 60)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (~arg2 == -1) {
            this.method1886(arg1.method224(-2), 115);
        }
        ++field4772;
        if (arg0 != 0) {
            this.method87(-52, (class40) null, -128);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)[[I", line = 87)
    public final int[][] method89(int arg0, int arg1) {
        ++field4775;
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (super.field5869.field7156) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class431.field6348 < ~var7; ++var7) {
                var4[var7] = this.field4771;
                var5[var7] = this.field4770;
                var6[var7] = this.field4774;
            }
        }
        if (arg0 != -1) {
            field4768 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 129)
    public class317() {
        this(0);
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(I)V", line = 134)
    private class317(int arg0) {
        super(0, false);
        this.method1886(arg0, 109);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V", line = 146)
    public static void method1887(boolean arg0) {
        field4776 = null;
        if (arg0) {
            field4777 = -33;
        }
        field4768 = null;
    }
}
