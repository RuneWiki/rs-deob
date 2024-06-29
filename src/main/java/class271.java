import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class271 extends class86 {

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
    public static int field3567 = 0;

    @OriginalMember(owner = "client!tga", name = "n", descriptor = "Lrn;")
    public static class633 field3569 = new class633(80, 8);

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!tga", name = "i", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!tga", name = "o", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(ILsf;)V", line = 6)
    public class271(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)I", line = 9)
    public final int method1689(boolean arg0) {
        ++field3563;
        if (arg0) {
            this.method73(41);
        }
        return super.field1200;
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(II)I", line = 26)
    public final int method72(int arg0, int arg1) {
        ++field3562;
        if (arg1 != -2) {
            this.method71((byte) -46);
        }
        return 1;
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Lsf;)V", line = 38)
    public class271(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IZ)V", line = 41)
    public final void method76(int arg0, boolean arg1) {
        super.field1200 = arg0;
        ++field3565;
        if (arg1) {
            method1691(-52);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V", line = 52)
    public final void method71(byte arg0) {
        if (arg0 != -65) {
            field3569 = null;
        }
        ++field3564;
        if (super.field1200 < 0 || super.field1200 > 4) {
            super.field1200 = this.method73(0);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIIIIII)V", line = 67)
    public static final void method1690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3568;
        int var8 = arg2 + arg6;
        int var9 = arg5 - arg2;
        for (int var10 = arg6; ~var8 < ~var10; ++var10) {
            class54.method333(arg4, class207.field2840[var10], 7, arg0, arg7);
        }
        int var11 = arg4 - arg2;
        int var12 = arg0 + arg2;
        int var13 = arg5;
        if (arg1 < 19) {
            field3570 = -41;
        }
        while (var13 > var9) {
            class54.method333(arg4, class207.field2840[var13], 7, arg0, arg7);
            --var13;
        }
        for (int var14 = var8; var9 >= var14; ++var14) {
            int[] var15 = class207.field2840[var14];
            class54.method333(var12, var15, 7, arg0, arg7);
            class54.method333(var11, var15, 7, var12, arg3);
            class54.method333(arg4, var15, 7, var11, arg7);
        }
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)V", line = 113)
    public static void method1691(int arg0) {
        if (arg0 != 4) {
            method1691(5);
        }
        field3569 = null;
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)I", line = 123)
    public final int method73(int arg0) {
        if (arg0 != 0) {
            field3569 = null;
        }
        ++field3566;
        return 0;
    }
}
