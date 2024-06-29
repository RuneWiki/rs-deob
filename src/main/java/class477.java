import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class477 extends class227 {

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    private int field7063 = 4096;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field7058 = 0;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/util/Random;I)I", line = 6)
    public static final int method2908(byte arg0, Random arg1, int arg2) {
        ++field7059;
        int var3 = -37 / ((arg0 - -71) / 47);
        if (~arg2 >= -1) {
            throw new IllegalArgumentException();
        } else if (class119.method713(arg2, 39)) {
            return (int) ((long) arg2 * (4294967295L & (long) arg1.nextInt()) >> 32);
        } else {
            int var4 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var5;
            do {
                var5 = arg1.nextInt();
            } while (var4 <= var5);
            return class250.method1549(124, var5, arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 36)
    public class477() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;Lfq;IILl;I)Lza;", line = 50)
    public static final class287 method2909(Canvas arg0, class137 arg1, int arg2, int arg3, class16 arg4, int arg5) {
        ++field7064;
        if (arg2 >= -28) {
            field7058 = -102;
        }
        return new class377(arg5, arg0, arg4, arg3, arg1);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IZ)V", line = 62)
    public static final void method2910(int arg0, boolean arg1) {
        if (arg1 && class416.field5983 != null) {
            class412.field5879 = class416.field5983.field5698;
        } else {
            class412.field5879 = -1;
        }
        ++field7057;
        class342.field4590 = null;
        class416.field5983 = null;
        class530.field7772 = null;
        if (arg0 == 3) {
            class181.field2356 = 0;
            class416.method2553();
            class416.field5994.method984(false);
            class476.field7047 = null;
            class146.field1936 = null;
            class472.field7007 = null;
            class68.field777 = null;
            class169.field2192 = null;
            class416.field5995 = null;
            class508.field7367 = -1;
            class357.field4870 = null;
            class219.field2968 = null;
            class285.field3758 = null;
            class510.field7417 = null;
            class178.field2308 = -1;
            class416.field5987.method991(106);
            class416.field5989.method496(64, 64, 64);
            class416.field5987.method997(64, (byte) 119, 128);
            class416.field5982.method2918((byte) 88, 64);
            class373.field5063.method675(arg0 + -3, 64);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lug;II)V", line = 105)
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field7063 = arg0.method2386(-23648);
        }
        ++field7060;
        if (arg1 != 487215116) {
            field7058 = 37;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V", line = 119)
    public static final void method2911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7061;
        class388.method2355(arg0, false);
        int var7 = 0;
        int var8 = -arg1 + arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg2 != 2) {
            method2911(-76, 85, 89, -40, 122, 2, 14);
        }
        int[] var15 = class5.field54[arg5];
        int var16 = -var8 + arg6;
        int var17 = arg6 + var8;
        class476.method2907(var16, arg2 + 70, arg3, var15, -arg0 + arg6);
        class476.method2907(var17, 54, arg4, var15, var16);
        class476.method2907(arg6 - -arg0, 32, arg3, var15, var17);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (~var12 <= -1 && ~var11 <= -2) {
                class532.field7840[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                if (~var9 > ~var8) {
                    int[] var18 = class5.field54[arg5 - -var9];
                    int[] var19 = class5.field54[-var9 + arg5];
                    int var20 = class532.field7840[var9];
                    int var21 = arg6 + var7;
                    int var22 = -var7 + arg6;
                    int var23 = arg6 + var20;
                    int var24 = -var20 + arg6;
                    class476.method2907(var24, arg2 ^ 127, arg3, var18, var22);
                    class476.method2907(var23, 38, arg4, var18, var24);
                    class476.method2907(var21, arg2 + 121, arg3, var18, var23);
                    class476.method2907(var24, 112, arg3, var19, var22);
                    class476.method2907(var23, 99, arg4, var19, var24);
                    class476.method2907(var21, 106, arg3, var19, var23);
                } else {
                    int[] var25 = class5.field54[arg5 + var9];
                    int[] var26 = class5.field54[-var9 + arg5];
                    int var27 = arg6 + var7;
                    int var28 = -var7 + arg6;
                    class476.method2907(var27, arg2 ^ 48, arg3, var25, var28);
                    class476.method2907(var27, arg2 + 42, arg3, var26, var28);
                }
            }
            int[] var29 = class5.field54[arg5 + var7];
            int[] var30 = class5.field54[-var7 + arg5];
            int var31 = arg6 + var9;
            int var32 = -var9 + arg6;
            if (var7 < var8) {
                int var33 = var7 <= var11 ? var11 : class532.field7840[var7];
                int var34 = arg6 + var33;
                int var35 = -var33 + arg6;
                class476.method2907(var35, arg2 + 65, arg3, var29, var32);
                class476.method2907(var34, 108, arg4, var29, var35);
                class476.method2907(var31, arg2 ^ 111, arg3, var29, var34);
                class476.method2907(var35, 104, arg3, var30, var32);
                class476.method2907(var34, arg2 ^ 116, arg4, var30, var35);
                class476.method2907(var31, arg2 + 114, arg3, var30, var34);
            } else {
                class476.method2907(var31, 89, arg3, var29, var32);
                class476.method2907(var31, arg2 + 73, arg3, var30, var32);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I", line = 247)
    public final int[] method62(int arg0, int arg1) {
        ++field7062;
        if (arg0 != 15811) {
            method2911(-22, 34, -39, -126, 103, -36, 65);
        }
        int[] var3 = super.field3068.method1970(arg1, (byte) 75);
        if (super.field3068.field4480) {
            int[] var4 = this.method1459(arg1 + -1 & class115.field1508, 124, 0);
            int[] var5 = this.method1459(arg1, -14, 0);
            int[] var6 = this.method1459(arg1 + 1 & class115.field1508, arg0 + -15834, 0);
            for (int var7 = 0; ~class446.field6486 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field7063;
                int var9 = (var5[class102.field1388 & var7 + 1] - var5[var7 + -1 & class102.field1388]) * this.field7063;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
