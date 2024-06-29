import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class249 extends class195 {

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lgf;")
    public static class7 field4413 = new class7(64);

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "[Lli;")
    public static class185[] field4419 = new class185[100];

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lli;")
    public static class185 field4420 = class245.method1649("<col=ff3000>", -12);

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field4421 = -1;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "[I")
    public static int[] field4418;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIIZ)Lli;")
    public static final class185 method1669(boolean arg0, int arg1, int arg2, boolean arg3) {
        field4416++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 1;
        int var5 = arg2 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        int var8 = 0;
        if (arg0) {
            return null;
        }
        while (var8 < var4) {
            int var10 = arg2 % arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg2 /= arg1;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            var8++;
        }
        class185 var9 = new class185();
        var9.field3411 = var7;
        var9.field3437 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1670(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field4414++;
        class10.method94(64, arg1);
        int var7 = arg1 - arg3;
        int var8 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = -arg1;
        int var10 = arg1;
        if (!arg2) {
            return;
        }
        int var11 = var7;
        int var12 = -var7;
        int[] var13 = class145.field2757[arg6];
        int var14 = -1;
        int var15 = -1;
        int var16 = arg0 - var7;
        class157.method1116(arg4, arg0 - arg1, var16, var13, -98);
        int var17 = arg0 + var7;
        class157.method1116(arg5, var16, var17, var13, -41);
        class157.method1116(arg4, var17, arg0 + arg1, var13, -80);
        while (var10 > var8) {
            var14 += 2;
            var15 += 2;
            var12 += var15;
            var9 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class133.field2379[var11] = var8;
                var11--;
                var12 -= var11 << 1;
            }
            var8++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var10 >= var7) {
                    int[] var18 = class145.field2757[arg6 + var10];
                    int[] var19 = class145.field2757[arg6 - var10];
                    int var20 = arg0 + var8;
                    int var21 = arg0 - var8;
                    class157.method1116(arg4, var21, var20, var18, -42);
                    class157.method1116(arg4, var21, var20, var19, -84);
                } else {
                    int[] var22 = class145.field2757[arg6 + var10];
                    int var23 = arg0 + var8;
                    int var24 = class133.field2379[var10];
                    int var25 = arg0 - var8;
                    int[] var26 = class145.field2757[arg6 - var10];
                    int var27 = arg0 - var24;
                    class157.method1116(arg4, var25, var27, var22, -111);
                    int var28 = arg0 + var24;
                    class157.method1116(arg5, var27, var28, var22, -90);
                    class157.method1116(arg4, var28, var23, var22, -112);
                    class157.method1116(arg4, var25, var27, var26, -122);
                    class157.method1116(arg5, var27, var28, var26, -65);
                    class157.method1116(arg4, var28, var23, var26, -87);
                }
            }
            int[] var29 = class145.field2757[arg6 + var8];
            int[] var30 = class145.field2757[arg6 - var8];
            int var31 = arg0 - var10;
            int var32 = arg0 + var10;
            if (var7 <= var8) {
                class157.method1116(arg4, var31, var32, var29, -58);
                class157.method1116(arg4, var31, var32, var30, -127);
            } else {
                int var33 = var11 >= var8 ? var11 : class133.field2379[var8];
                int var34 = arg0 - var33;
                int var35 = arg0 + var33;
                class157.method1116(arg4, var31, var34, var29, -49);
                class157.method1116(arg5, var34, var35, var29, -27);
                class157.method1116(arg4, var35, var32, var29, -99);
                class157.method1116(arg4, var31, var34, var30, -71);
                class157.method1116(arg5, var34, var35, var30, -88);
                class157.method1116(arg4, var35, var32, var30, -122);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)Lo;")
    public static final class174 method1671(int arg0, int arg1, byte arg2) {
        int var3 = -78 % ((arg2 + 44) / 41);
        field4415++;
        class174 var4 = (class174) class241.field4299.method195(124, (long) arg1 | (long) arg0 << 32);
        if (var4 == null) {
            var4 = new class174(arg0, arg1);
            class241.field4299.method190(var4, (byte) -121, var4.field1278);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lli;BLhi;)Lpg;")
    public static final class169 method1672(class185 arg0, byte arg1, class250 arg2) {
        field4411++;
        int var3 = arg2.method1694(arg0, -2);
        if (var3 == -1) {
            return new class169(0);
        }
        int[] var4 = arg2.method1698(false, var3);
        class169 var5 = new class169(var4.length);
        for (int var6 = 0; var6 < var5.field3133; var6++) {
            class118 var7 = new class118(arg2.method1688(0, var4[var6], var3));
            var5.field3136[var6] = var7.method865(9199);
            var5.field3131[var6] = var7.method838(1275919136);
            var5.field3132[var6] = (short) var7.method827(255);
            var5.field3142[var6] = (short) var7.method827(255);
            var5.field3135[var6] = var7.method875((byte) 45);
        }
        return arg1 <= 52 ? null : var5;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method1673(int arg0) {
        field4418 = null;
        field4413 = null;
        field4419 = null;
        field4420 = null;
        if (arg0 > -23) {
            field4412 = -47;
        }
    }
}
