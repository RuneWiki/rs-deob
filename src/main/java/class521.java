import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class521 extends class327 {

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "B")
    public byte field7244 = 5;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "Z")
    public static boolean field7236 = true;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "[I")
    public static int[] field7241 = new int[1000];

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public int field7235;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public int field7237;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public int field7240;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public int field7242;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public int field7243;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public int field7246;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "Z")
    public boolean field7245;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)V")
    public static void method2942(byte arg0) {
        int var1 = 7 % ((arg0 - 51) / 39);
        field7241 = null;
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)V")
    public static final void method2943(byte arg0) {
        if (arg0 >= -75) {
            return;
        }
        field7239++;
        if (class624.field8797 == null) {
            class401 var1 = new class401();
            byte[] var2 = var1.method2453(128, 16, (byte) 112, 128);
            class624.field8797 = class168.method1166(110, false, var2);
        }
        if (class139.field2193 == null) {
            class485 var3 = new class485();
            byte[] var4 = var3.method2785(16, -126, 128, 128);
            class139.field2193 = class168.method1166(120, false, var4);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2944(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class277.method1783((byte) -115, arg2);
        field7238++;
        int var7 = 0;
        int var8 = arg2 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        if (arg5 != -31262) {
            return;
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (class222.field3350 <= arg3 && class409.field6071 >= arg3) {
            int[] var14 = class495.field6944[arg3];
            int var15 = class34.method306(class183.field2638, arg6 - arg2, class268.field3911, (byte) 123);
            int var16 = class34.method306(class183.field2638, arg2 + arg6, class268.field3911, (byte) 124);
            int var17 = class34.method306(class183.field2638, arg6 - var8, class268.field3911, (byte) 112);
            int var18 = class34.method306(class183.field2638, arg6 + var8, class268.field3911, (byte) 103);
            class614.method3490(arg0, var15, -102, var14, var17);
            class614.method3490(arg1, var17, -101, var14, var18);
            class614.method3490(arg0, var18, -107, var14, var16);
        }
        int var19 = -1;
        while (var9 > var7) {
            var13 += 2;
            var19 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class594.field8452[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg3 - var9;
                int var21 = arg3 + var9;
                if (class222.field3350 <= var21 && var20 <= class409.field6071) {
                    if (var8 <= var9) {
                        int var22 = class34.method306(class183.field2638, arg6 + var7, class268.field3911, (byte) 112);
                        int var23 = class34.method306(class183.field2638, arg6 - var7, class268.field3911, (byte) 98);
                        if (class409.field6071 >= var21) {
                            class614.method3490(arg0, var23, arg5 + 31167, class495.field6944[var21], var22);
                        }
                        if (class222.field3350 <= var20) {
                            class614.method3490(arg0, var23, -104, class495.field6944[var20], var22);
                        }
                    } else {
                        int var24 = class594.field8452[var9];
                        int var25 = class34.method306(class183.field2638, arg6 + var7, class268.field3911, (byte) 117);
                        int var26 = class34.method306(class183.field2638, arg6 - var7, class268.field3911, (byte) 91);
                        int var27 = class34.method306(class183.field2638, arg6 + var24, class268.field3911, (byte) 112);
                        int var28 = class34.method306(class183.field2638, arg6 - var24, class268.field3911, (byte) 84);
                        if (class409.field6071 >= var21) {
                            int[] var29 = class495.field6944[var21];
                            class614.method3490(arg0, var26, arg5 ^ 0x7A7E, var29, var28);
                            class614.method3490(arg1, var28, -108, var29, var27);
                            class614.method3490(arg0, var27, arg5 + 31162, var29, var25);
                        }
                        if (class222.field3350 <= var20) {
                            int[] var30 = class495.field6944[var20];
                            class614.method3490(arg0, var26, -88, var30, var28);
                            class614.method3490(arg1, var28, -121, var30, var27);
                            class614.method3490(arg0, var27, -106, var30, var25);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (var32 >= class222.field3350 && var31 <= class409.field6071) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (class183.field2638 <= var33 && var34 <= class268.field3911) {
                    int var35 = class34.method306(class183.field2638, var33, class268.field3911, (byte) 88);
                    int var36 = class34.method306(class183.field2638, var34, class268.field3911, (byte) 85);
                    if (var8 <= var7) {
                        if (var32 <= class409.field6071) {
                            class614.method3490(arg0, var36, -99, class495.field6944[var32], var35);
                        }
                        if (var31 >= class222.field3350) {
                            class614.method3490(arg0, var36, arg5 + 31179, class495.field6944[var31], var35);
                        }
                    } else {
                        int var37 = var11 < var7 ? class594.field8452[var7] : var11;
                        int var38 = class34.method306(class183.field2638, arg6 + var37, class268.field3911, (byte) 125);
                        int var39 = class34.method306(class183.field2638, arg6 - var37, class268.field3911, (byte) 81);
                        if (var32 <= class409.field6071) {
                            int[] var40 = class495.field6944[var32];
                            class614.method3490(arg0, var36, -83, var40, var39);
                            class614.method3490(arg1, var39, -95, var40, var38);
                            class614.method3490(arg0, var38, arg5 + 31170, var40, var35);
                        }
                        if (var31 >= class222.field3350) {
                            int[] var41 = class495.field6944[var31];
                            class614.method3490(arg0, var36, -92, var41, var39);
                            class614.method3490(arg1, var39, -102, var41, var38);
                            class614.method3490(arg0, var38, -128, var41, var35);
                        }
                    }
                }
            }
        }
    }
}
