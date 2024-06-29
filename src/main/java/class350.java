import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class350 extends class194 {

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "[I")
    public static int[] field4766 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2229(int arg0, String arg1) {
        ++field4767;
        if (arg0 != 2) {
            field4765 = -51;
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class350() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static void method2230(byte arg0) {
        if (arg0 != -44) {
            field4766 = null;
        }
        field4766 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field4768;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = 16 / ((57 - arg1) / 46);
        if (super.field2292.field3708) {
            int[] var5 = this.method1203(0, 96, arg0);
            for (int var6 = 0; ~var6 > ~class138.field1579; ++var6) {
                var3[var6] = -var5[var6] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIBI)I")
    public static final int method2231(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field4769;
        if (var4 == 0) {
            return arg3;
        } else if (~var4 == -2) {
            return -arg0 + 1023;
        } else if (~var4 == -3) {
            return -arg3 + 1023;
        } else {
            return arg2 >= -32 ? -91 : arg0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field4770;
        if (arg0 != -730) {
            field4765 = -104;
        }
        int[][] var3 = super.field2283.method1667(arg1, -106);
        if (super.field2283.field3451) {
            int[][] var4 = this.method1200(arg0 + 790, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class138.field1579; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = 66 % ((arg1 - 52) / 61);
        ++field4764;
        if (~arg0 == -1) {
            super.field2278 = ~arg2.method1563(-128) == -2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(III)I")
    public static final int method2232(int arg0, int arg1, int arg2) {
        ++field4771;
        return ~arg1 != arg2 && ~arg1 != -4 ? class31.field334[3 & arg0] : class195.field2304[3 & arg0];
    }
}
