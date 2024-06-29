import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class52 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[I")
    public static int[] field806 = new int[2500];

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Leg;")
    public static class37 field810 = class174.method1167(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -35);

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "[Z")
    public static boolean[] field813 = new boolean[100];

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZI)V")
    public static final void method336(int arg0, boolean arg1, int arg2) {
        class273.field4778.method1697(120, 122);
        field811++;
        class273.field4778.method1299(arg0, 121);
        class273.field4778.method1291(arg1, arg2);
        class156.field2605++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method337(int arg0) {
        field806 = null;
        field810 = null;
        field813 = null;
        if (arg0 != -26143) {
            field810 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)Z")
    public static final boolean method338(int arg0, boolean arg1) {
        field812++;
        if (!arg1) {
            field813 = null;
        }
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBIIIII)V")
    public static final void method339(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class239.method1638((byte) 82, arg6);
        int var7 = arg6 - arg2;
        field809++;
        if (arg1 > -37) {
            method338(-90, true);
        }
        int var8 = -arg6;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = arg6;
        int var10 = 0;
        int var11 = var7;
        int var12 = -var7;
        int var13 = -1;
        int var14 = -1;
        if (arg5 >= class286.field5050 && arg5 <= class96.field1507) {
            int[] var15 = class210.field3617[arg5];
            int var16 = class139.method975(class178.field2972, true, arg4 - arg6, class217.field3741);
            int var17 = class139.method975(class178.field2972, true, arg4 + arg6, class217.field3741);
            int var18 = class139.method975(class178.field2972, true, arg4 - var7, class217.field3741);
            int var19 = class139.method975(class178.field2972, true, arg4 + var7, class217.field3741);
            class145.method1010(var18, var16, -25086, arg3, var15);
            class145.method1010(var19, var18, -25086, arg0, var15);
            class145.method1010(var17, var19, -25086, arg3, var15);
        }
        while (var10 < var9) {
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class270.field4716[var11] = var10;
                var12 -= var11 << 1;
            }
            var13 += 2;
            var8 += var13;
            var10++;
            if (var8 >= 0) {
                var9--;
                int var20 = arg5 + var9;
                var8 -= var9 << 1;
                int var21 = arg5 - var9;
                if (class286.field5050 <= var20 && class96.field1507 >= var21) {
                    if (var9 < var7) {
                        int var22 = class270.field4716[var9];
                        int var23 = class139.method975(class178.field2972, true, arg4 + var10, class217.field3741);
                        int var24 = class139.method975(class178.field2972, true, arg4 - var10, class217.field3741);
                        int var25 = class139.method975(class178.field2972, true, arg4 + var22, class217.field3741);
                        int var26 = class139.method975(class178.field2972, true, arg4 - var22, class217.field3741);
                        if (class96.field1507 >= var20) {
                            int[] var27 = class210.field3617[var20];
                            class145.method1010(var26, var24, -25086, arg3, var27);
                            class145.method1010(var25, var26, -25086, arg0, var27);
                            class145.method1010(var23, var25, -25086, arg3, var27);
                        }
                        if (var21 >= class286.field5050) {
                            int[] var28 = class210.field3617[var21];
                            class145.method1010(var26, var24, -25086, arg3, var28);
                            class145.method1010(var25, var26, -25086, arg0, var28);
                            class145.method1010(var23, var25, -25086, arg3, var28);
                        }
                    } else {
                        int var29 = class139.method975(class178.field2972, true, arg4 + var10, class217.field3741);
                        int var30 = class139.method975(class178.field2972, true, arg4 - var10, class217.field3741);
                        if (var20 <= class96.field1507) {
                            class145.method1010(var29, var30, -25086, arg3, class210.field3617[var20]);
                        }
                        if (var21 >= class286.field5050) {
                            class145.method1010(var29, var30, -25086, arg3, class210.field3617[var21]);
                        }
                    }
                }
            }
            int var31 = arg5 - var10;
            int var32 = arg5 + var10;
            if (class286.field5050 <= var32 && class96.field1507 >= var31) {
                int var33 = arg4 - var9;
                int var34 = arg4 + var9;
                if (class178.field2972 <= var34 && var33 <= class217.field3741) {
                    int var35 = class139.method975(class178.field2972, true, var34, class217.field3741);
                    int var36 = class139.method975(class178.field2972, true, var33, class217.field3741);
                    if (var10 >= var7) {
                        if (class96.field1507 >= var32) {
                            class145.method1010(var35, var36, -25086, arg3, class210.field3617[var32]);
                        }
                        if (class286.field5050 <= var31) {
                            class145.method1010(var35, var36, -25086, arg3, class210.field3617[var31]);
                        }
                    } else {
                        int var37 = var11 >= var10 ? var11 : class270.field4716[var10];
                        int var38 = class139.method975(class178.field2972, true, arg4 + var37, class217.field3741);
                        int var39 = class139.method975(class178.field2972, true, arg4 - var37, class217.field3741);
                        if (class96.field1507 >= var32) {
                            int[] var40 = class210.field3617[var32];
                            class145.method1010(var39, var36, -25086, arg3, var40);
                            class145.method1010(var38, var39, -25086, arg0, var40);
                            class145.method1010(var35, var38, -25086, arg3, var40);
                        }
                        if (var31 >= class286.field5050) {
                            int[] var41 = class210.field3617[var31];
                            class145.method1010(var39, var36, -25086, arg3, var41);
                            class145.method1010(var38, var39, -25086, arg0, var41);
                            class145.method1010(var35, var38, -25086, arg3, var41);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[B)Laa;")
    public static final class183 method340(int arg0, byte[] arg1) {
        field808++;
        if (arg0 != -10061) {
            method340(28, (byte[]) null);
        }
        if (arg1 == null) {
            return null;
        } else {
            class136 var2 = new class136(arg1, class249.field4476, class158.field2636, class224.field3852, class125.field2101, class170.field2848);
            class5.method33(24094);
            return var2;
        }
    }
}
