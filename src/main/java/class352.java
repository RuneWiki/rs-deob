import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class352 extends class85 {

    @OriginalMember(owner = "client!en", name = "D", descriptor = "Lnb;")
    public class224 field4503;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "Z")
    public static boolean field4498 = false;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "I")
    public static int field4499 = -1;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "Z")
    public static boolean field4502 = false;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "Las;")
    public static class17 field4506;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "Ldn;")
    public static class201 field4500;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "[S")
    public static short[] field4501;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method2068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class344.method2018(false, arg0);
        field4504++;
        int var7 = 0;
        int var8 = arg0 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class333.field4265[arg5];
        int var16 = arg3 - var8;
        class183.method1212(arg4, var15, true, arg3 - arg0, var16);
        int var17 = arg3 + var8;
        if (arg6 != -5633) {
            return;
        }
        class183.method1212(arg1, var15, true, var16, var17);
        class183.method1212(arg4, var15, true, var17, arg0 + arg3);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class210.field2711[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 <= var9) {
                    int[] var18 = class333.field4265[arg5 + var9];
                    int[] var19 = class333.field4265[arg5 - var9];
                    int var20 = arg3 + var7;
                    int var21 = arg3 - var7;
                    class183.method1212(arg4, var18, true, var21, var20);
                    class183.method1212(arg4, var19, true, var21, var20);
                } else {
                    int[] var22 = class333.field4265[arg5 + var9];
                    int[] var23 = class333.field4265[arg5 - var9];
                    int var24 = class210.field2711[var9];
                    int var25 = arg3 + var7;
                    int var26 = arg3 - var7;
                    int var27 = arg3 + var24;
                    int var28 = arg3 - var24;
                    class183.method1212(arg4, var22, true, var26, var28);
                    class183.method1212(arg1, var22, true, var28, var27);
                    class183.method1212(arg4, var22, true, var27, var25);
                    class183.method1212(arg4, var23, true, var26, var28);
                    class183.method1212(arg1, var23, true, var28, var27);
                    class183.method1212(arg4, var23, true, var27, var25);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class333.field4265[arg5 + var7];
            int[] var30 = class333.field4265[arg5 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var8 > var7) {
                int var33 = var7 > var11 ? class210.field2711[var7] : var11;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class183.method1212(arg4, var29, true, var32, var35);
                class183.method1212(arg1, var29, true, var35, var34);
                class183.method1212(arg4, var29, true, var34, var31);
                class183.method1212(arg4, var30, true, var32, var35);
                class183.method1212(arg1, var30, true, var35, var34);
                class183.method1212(arg4, var30, true, var34, var31);
            } else {
                class183.method1212(arg4, var29, true, var32, var31);
                class183.method1212(arg4, var30, true, var32, var31);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I", line = 135)
    public static final int method2069(int arg0, int arg1) {
        if (arg1 != -8045) {
            return 19;
        }
        field4505++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 192)
    public static void method2070(int arg0) {
        if (arg0 <= 49) {
            method2068(99, -42, 82, -57, -55, -113, 98);
        }
        field4500 = null;
        field4501 = null;
        field4506 = null;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lnb;)V", line = 212)
    public class352(class224 arg0) {
        this.field4503 = arg0;
    }
}
