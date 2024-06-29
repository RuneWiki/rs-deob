import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class48 extends class264 {

    @OriginalMember(owner = "client!a", name = "K", descriptor = "Lcf;")
    private static class93 field771 = class147.method1066(" from your friend list first)3", -48);

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    public static int field772 = 0;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "Z")
    public static boolean field775 = false;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "Lcf;")
    public static class93 field781 = field771;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "Lhg;")
    public static class177 field773;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "Lhg;")
    public static class177 field778;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "Lcf;")
    public static class93 field777;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        ++field774;
        if (arg1) {
            method268(-31);
        }
        int[][] var3 = super.field4705.method1089(arg0, 87);
        if (super.field4705.field2670) {
            int[][] var4 = this.method1773(-122, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class176.field3060; ++var11) {
                var7[var11] = -var5[var11] + 4096;
                var10[var11] = -var6[var11] + 4096;
                var8[var11] = -var9[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 < 11) {
            this.method17(-23, true);
        }
        ++field776;
        if (~arg1 == -1) {
            super.field4698 = ~arg2.method1907(16832) == -2;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class48() {
        super(1, false);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(B)V")
    public static void method267(byte arg0) {
        field781 = null;
        field777 = null;
        field771 = null;
        if (arg0 != -26) {
            field781 = null;
        }
        field778 = null;
        field773 = null;
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
    public static final void method268(int arg0) {
        class129.field2272.method300(0);
        class5.field68.method300(0);
        if (arg0 != 4096) {
            method267((byte) -96);
        }
        ++field770;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        int[] var3 = super.field4716.method532((byte) 83, arg0);
        ++field779;
        if (arg1 >= -83) {
            return null;
        } else {
            if (super.field4716.field1424) {
                int[] var4 = this.method1767(0, arg0, 21654);
                for (int var5 = 0; class176.field3060 > var5; ++var5) {
                    var3[var5] = 4096 - var4[var5];
                }
            }
            return var3;
        }
    }
}
