import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class162 extends class102 {

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    private final int field2866;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    private final int field2859;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    private final int field2860;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    private final int field2863;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Lqk;")
    public static class207 field2858 = class24.method212(255, "::");

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Lqk;")
    private static class207 field2862 = class24.method212(255, "Loaded world list data");

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field2865 = 0;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Lqk;")
    public static class207 field2864 = field2862;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "[I")
    public static int[] field2868 = new int[50];

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lqk;ILpk;)Lma;")
    public static final class187 method1176(class207 arg0, int arg1, class99 arg2) {
        ++field2872;
        int var3 = arg2.method711(119, arg0);
        if (var3 == -1) {
            return new class187(0);
        } else {
            int[] var4 = arg2.method699(var3, (byte) -2);
            class187 var5 = new class187(var4.length);
            if (arg1 != -24669) {
                return null;
            } else {
                for (int var6 = 0; ~var6 > ~var5.field3301; ++var6) {
                    class149 var7 = new class149(arg2.method705(var3, var4[var6], -1));
                    var5.field3312[var6] = var7.method1034(-27220);
                    var5.field3313[var6] = var7.method1084((byte) 49);
                    var5.field3294[var6] = (short) var7.method1050(arg1 + 1272031237);
                    var5.field3297[var6] = (short) var7.method1050(1272006568);
                    var5.field3299[var6] = var7.method1076(65280);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIIII)V")
    public class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2866 = arg0;
        this.field2859 = arg2;
        this.field2860 = arg1;
        this.field2863 = arg3;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method1177(int arg0) {
        field2864 = null;
        field2858 = null;
        field2862 = null;
        field2868 = null;
        int var1 = 124 / ((arg0 - 31) / 45);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZI)V")
    public final void method23(int arg0, boolean arg1, int arg2) {
        ++field2867;
        int var4 = this.field2866 * arg2 >> 12;
        int var5 = this.field2860 * arg0 >> 12;
        if (!arg1) {
            method1176((class207) null, -4, (class99) null);
        }
        int var6 = this.field2859 * arg2 >> 12;
        int var7 = this.field2863 * arg0 >> 12;
        class132.method926(super.field1834, var4, super.field1844, var7, -13794, var5, super.field1838, var6);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
    public final void method25(int arg0, int arg1, int arg2) {
        int var4 = this.field2866 * arg0 >> 12;
        ++field2856;
        int var5 = this.field2860 * arg2 >> 12;
        int var6 = this.field2863 * arg2 >> 12;
        int var7 = this.field2859 * arg0 >> 12;
        class288.method1964(super.field1838, var7, var4, var6, super.field1834, var5, (byte) 63);
        if (arg1 != 1) {
            this.method25(-43, 25, -96);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)V")
    public final void method22(int arg0, int arg1, int arg2) {
        int var4 = this.field2866 * arg2 >> 12;
        ++field2861;
        if (arg0 != 29635) {
            field2864 = null;
        }
        int var5 = this.field2863 * arg1 >> 12;
        int var6 = this.field2860 * arg1 >> 12;
        int var7 = this.field2859 * arg2 >> 12;
        class86.method633(super.field1844, (byte) -114, var6, var7, var5, var4);
    }
}
