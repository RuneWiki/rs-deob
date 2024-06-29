import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class437 extends class62 {

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public static int field5832 = -1;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "Lada;")
    public static class144 field5841 = new class144(6, 10);

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    private int field5833;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    private int field5836;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    private int field5838;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "Lvp;")
    public static class162 field5843;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "Lcaa;")
    public static class253 field5844;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V", line = 3)
    public static void method2546(int arg0) {
        field5843 = null;
        if (arg0 > -37) {
            method2548(-67);
        }
        field5841 = null;
        field5844 = null;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 15)
    public class437() {
        this(0);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[[I", line = 23)
    public final int[][] method409(int arg0, byte arg1) {
        ++field5840;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class438.field5847; ++var7) {
                var4[var7] = this.field5836;
                var5[var7] = this.field5838;
                var6[var7] = this.field5833;
            }
        }
        if (arg1 >= -20) {
            this.method2547(79, -123);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(II)V", line = 62)
    private final void method2547(int arg0, int arg1) {
        this.field5836 = arg0 & arg1 >> 12;
        this.field5838 = 4080 & arg1 >> 4;
        ++field5839;
        this.field5833 = (255 & arg1) << 4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lgw;II)V", line = 73)
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field5837;
        if (arg2 == 0) {
            this.method2547(4080, arg0.method1028((byte) 123));
        }
        if (arg1 != -1) {
            this.method2547(-20, -2);
        }
    }

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "(I)J", line = 103)
    public static final long method2548(int arg0) {
        ++field5842;
        if (arg0 != 14119) {
            method2550(false, false, -78);
        }
        return class114.field1605.method1715(true);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIBII)V", line = 115)
    public static final void method2549(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 > -66) {
            method2548(55);
        }
        class190[] var7 = class385.field5293;
        for (int var8 = 0; var8 < var7.length; ++var8) {
            class190 var9 = var7[var8];
            if (var9 != null && var9.field2821 == 2) {
                class270.method1703(-1, arg2 >> 1, var9.field2817 * 2, var9.field2819, arg1, arg6 >> 1, arg3, var9.field2822, var9.field2828);
                if (~class524.field7487[0] < 0 && ~(class617.field9123 % 20) > -11) {
                    class604.field8997[var9.field2823].method316(class524.field7487[0] + arg5 + -12, arg0 + -28 + class524.field7487[1]);
                }
            }
        }
        ++field5835;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZI)V", line = 146)
    public static final void method2550(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            --class35.field419;
            if (~class35.field419 == -1) {
                class111.field1583 = null;
            }
        }
        ++field5834;
        if (arg2 == 19357) {
            if (arg0) {
                --class142.field1996;
                if (class142.field1996 == 0) {
                    class60.field758 = null;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I)V", line = 177)
    private class437(int arg0) {
        super(0, false);
        this.method2547(4080, arg0);
    }
}
