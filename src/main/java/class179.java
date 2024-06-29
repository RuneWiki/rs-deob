import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class179 extends class264 {

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "I")
    private int field2711 = 3072;

    @OriginalMember(owner = "client!td", name = "nb", descriptor = "I")
    private int field2714 = 1024;

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "I")
    private int field2715 = 2048;

    @OriginalMember(owner = "client!td", name = "qb", descriptor = "I")
    public static int field2717 = 0;

    @OriginalMember(owner = "client!td", name = "sb", descriptor = "I")
    public static int field2719 = 0;

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "Ltj;")
    public static class73 field2712 = new class73(50);

    @OriginalMember(owner = "client!td", name = "tb", descriptor = "Z")
    public static boolean field2720 = false;

    @OriginalMember(owner = "client!td", name = "ub", descriptor = "I")
    public static int field2721 = 0;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!td", name = "pb", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!td", name = "rb", descriptor = "[I")
    public static int[] field2718;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II)V", line = 7)
    public static final void method1167(int arg0, int arg1) {
        class151.method950(0);
        field2716++;
        class127.method849(-90);
        int var2 = class107.method675(arg0, arg1 + 24523844).field3192;
        if (var2 == 0) {
            return;
        }
        int var3 = class149.field2149[arg0];
        if (var2 == 5) {
            class18.field317 = var3;
        }
        if (var2 == 6) {
            class303.field5101 = var3;
        }
        if (arg1 != -24523764) {
            field2719 = -97;
        }
        if (var2 == 9) {
            class115.field1719 = var3;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILii;)V", line = 49)
    public final void method4(int arg0, int arg1, class221 arg2) {
        field2709++;
        if (arg1 > -27) {
            return;
        }
        if (arg0 == 0) {
            this.field2714 = arg2.method1524((byte) 96);
        } else if (arg0 == 1) {
            this.field2711 = arg2.method1524((byte) 89);
        } else if (arg0 == 2) {
            this.field4496 = arg2.method1509(true) == 1;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(BI)[[I", line = 99)
    public final int[][] method138(byte arg0, int arg1) {
        field2710++;
        int[][] var3 = this.field4524.method1462(-15077, arg1);
        int var4 = -99 % ((-arg0 - 43) / 55);
        if (this.field4524.field3506) {
            int[][] var5 = this.method1817(-112, 0, arg1);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            int[] var11 = var3[1];
            for (int var12 = 0; var12 < class226.field3716; var12++) {
                var9[var12] = (var7[var12] * this.field2715 >> 12) + this.field2714;
                var11[var12] = (var6[var12] * this.field2715 >> 12) + this.field2714;
                var10[var12] = (var8[var12] * this.field2715 >> 12) + this.field2714;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 142)
    public class179() {
        super(1, false);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[I", line = 154)
    public final int[] method5(int arg0, int arg1) {
        field2707++;
        int[] var3 = this.field4501.method1176(arg1, 126);
        if (arg0 >= -58) {
            field2719 = -114;
        }
        if (this.field4501.field2741) {
            int[] var4 = this.method1815(0, arg1, 74);
            for (int var5 = 0; var5 < class226.field3716; var5++) {
                var3[var5] = this.field2714 + (var4[var5] * this.field2715 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V", line = 193)
    public static void method1168(int arg0) {
        if (arg0 >= -40) {
            field2717 = 40;
        }
        field2718 = null;
        field2712 = null;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V", line = 216)
    public final void method111(int arg0) {
        this.field2715 = this.field2711 - this.field2714;
        int var2 = -19 / ((66 - arg0) / 44);
        field2713++;
    }
}
