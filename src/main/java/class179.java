import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class179 extends class198 {

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public static int field2777 = 0;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "Lcf;")
    public static class97 field2788 = null;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    private int field2782;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    private int field2783;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    private int field2789;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "Lfa;")
    public static class273 field2780;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "[I")
    public static int[] field2779;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "[I")
    public static int[] field2790;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
    private final void method1198(int arg0, int arg1) {
        this.field2783 = arg1 << 4 & 4080;
        this.field2782 = (arg1 & 65280) >> 4;
        ++field2784;
        if (arg0 > 121) {
            this.field2789 = arg1 >> 12 & 4080;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class179() {
        this(0);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)Ltf;")
    public static final class114 method1199(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field2431; ++var4) {
                class114 var5 = var3.field2418[var4];
                if ((var5.field1712 >> 29 & 3L) == 2L && var5.field1724 == arg1 && var5.field1719 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(I)V")
    private class179(int arg0) {
        super(0, false);
        this.method1198(123, arg0);
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)V")
    public static final void method1200(int arg0) {
        ++field2781;
        if (arg0 != 0) {
            field2780 = null;
        }
        class69.field1009.method145(-93);
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field2779 = null;
        field2780 = null;
        if (arg0 == 23708) {
            field2790 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        int var4 = 91 / ((60 - arg0) / 61);
        if (~arg2 == -1) {
            this.method1198(126, arg1.method1401((byte) -83));
        }
        ++field2787;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        ++field2778;
        if (arg1 != -2) {
            field2791 = 65;
        }
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (super.field3150.field1498) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class42.field590; ++var7) {
                var4[var7] = this.field2789;
                var6[var7] = this.field2782;
                var5[var7] = this.field2783;
            }
        }
        return var3;
    }
}
