import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class183 extends class260 {

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "J")
    public static long field3312 = 0L;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public static int field3310 = 3;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "[Z")
    public static boolean[] field3317 = new boolean[100];

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "[I")
    public static int[] field3319 = new int[64];

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        int[] var3 = super.field4511.method304(arg0, false);
        if (arg1 != 255) {
            method1215(45, -50);
        }
        ++field3313;
        if (super.field4511.field1029) {
            int[] var4 = this.method1711(arg0, 0, false);
            for (int var5 = 0; ~var5 > ~class49.field1052; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        if (arg1 != 5) {
            field3319 = null;
        }
        ++field3315;
        int[][] var3 = super.field4509.method1667(arg0, arg1 + -5);
        if (super.field4509.field4346) {
            int[][] var4 = this.method1712((byte) 117, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class49.field1052 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var7[var11];
                var10[var11] = -var6[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILoh;)I")
    public static final int method1213(int arg0, class263 arg1) {
        if (arg0 != 29370) {
            return 68;
        } else {
            ++field3316;
            if (class34.field814 != null && ~arg1.method1740(arg0 + -29494) != -1) {
                for (int var2 = 0; ~class34.field814.field358 < ~var2; ++var2) {
                    if (class34.field814.field357[var2].method1738(class161.field2933, class260.field4496, (byte) -77).method1762(arg1, (byte) 68)) {
                        return var2;
                    }
                }
                return -1;
            } else {
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V")
    public static void method1214(int arg0) {
        int var1 = -121 % ((arg0 - 74) / 39);
        field3319 = null;
        field3317 = null;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg1 == 5701) {
            ++field3311;
            if (~arg0 == -1) {
                super.field4505 = ~arg2.method1301(-8317) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(II)V")
    public static final void method1215(int arg0, int arg1) {
        class181.field3294 = arg1;
        class84.field1667 = -1;
        ++field3318;
        class81.field1611 = false;
        class177.field3242 = 1;
        class71.field1431 = null;
        class139.field2561 = 0;
        class119.field2219 = -1;
        if (arg0 != -29235) {
            method1213(92, (class263) null);
        }
    }
}
