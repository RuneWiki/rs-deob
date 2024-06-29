import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class171 extends class747 {

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "Lkr;")
    public static class602 field2374 = new class602(37, 16);

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field2378 = -1;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "Lkr;")
    public static class602 field2376 = new class602(123, 7);

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "Lsga;")
    public static class651 field2379 = new class651();

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "Luu;")
    public static class237 field2375;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "Luu;")
    public static class237 field2377;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)[[I")
    public final int[][] method688(int arg0, int arg1) {
        ++field2371;
        int[][] var3 = super.field10289.method2200(0, arg1);
        int var4 = 41 % ((35 - arg0) / 58);
        if (super.field10289.field4906) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class73.field1095 > var8; ++var8) {
                this.method1095(-107, var8, arg1);
                int[][] var9 = this.method4158(0, class297.field4230, 2);
                var5[var8] = var9[0][class9.field85];
                var6[var8] = var9[1][class9.field85];
                var7[var8] = var9[2][class9.field85];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)Luv;")
    public static final class755 method1093(byte arg0, int arg1, int arg2) {
        ++field2370;
        class755 var3 = class189.method1182(arg1, (byte) -101);
        if (~arg2 == 0) {
            return var3;
        } else if (arg0 < 92) {
            return null;
        } else {
            return var3 != null && var3.field10503 != null && ~arg2 > ~var3.field10503.length ? var3.field10503[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public static void method1094(int arg0) {
        field2379 = null;
        field2374 = null;
        if (arg0 < -83) {
            field2375 = null;
            field2376 = null;
            field2377 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
    private final void method1095(int arg0, int arg1, int arg2) {
        ++field2372;
        int var4 = class639.field8571[arg1];
        int var5 = class515.field7103[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class9.field85 = arg1;
            class297.field4230 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class9.field85 = arg2;
            class297.field4230 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class9.field85 = class73.field1095 - arg2;
            class297.field4230 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class9.field85 = arg1;
            class297.field4230 = class414.field5865 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class9.field85 = -arg1 + class73.field1095;
            class297.field4230 = -arg2 + class414.field5865;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class297.field4230 = class414.field5865 - arg1;
            class9.field85 = -arg2 + class73.field1095;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class297.field4230 = -arg1 + class414.field5865;
            class9.field85 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class9.field85 = -arg1 + class73.field1095;
            class297.field4230 = arg2;
        }
        class297.field4230 &= class415.field5878;
        if (arg0 <= -93) {
            class9.field85 &= class73.field1097;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        if (arg1 >= -89) {
            field2375 = null;
        }
        ++field2367;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            for (int var4 = 0; class73.field1095 > var4; ++var4) {
                this.method1095(-107, var4, arg0);
                int[] var5 = this.method4156(-117, class297.field4230, 0);
                var3[var4] = var5[class9.field85];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class171() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)Z")
    public static final boolean method1096(byte arg0) {
        ++field2373;
        int var1 = -30 % ((arg0 - -64) / 45);
        return !class715.method4015("jaclib", -1) ? false : class715.method4015("hw3d", -1);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIB)V")
    public static final void method1097(int arg0, int arg1, byte arg2) {
        ++field2369;
        if (arg2 < -4) {
            class333.method2131((byte) -116, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 == 11608) {
            if (~arg2 == -1) {
                super.field10281 = arg0.method505((byte) -119) == 1;
            }
            ++field2368;
        }
    }
}
