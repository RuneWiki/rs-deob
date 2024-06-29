import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class287 extends class196 {

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "Lsg;")
    public class166 field4334;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field4332 = 0;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "Lom;")
    public static class156 field4335 = new class156();

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "[I")
    public static int[] field4337 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    public static int field4341 = 127;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "Lf;")
    public static class329 field4339 = null;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field4342 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "[Lea;")
    public static class235[] field4336;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 6)
    public static void method1994(int arg0) {
        field4337 = null;
        field4339 = null;
        if (arg0 <= 57) {
            method1994(65);
        }
        field4336 = null;
        field4335 = null;
        field4342 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIBIII)V", line = 24)
    public static final void method1995(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field4333++;
        if (arg3 <= 11) {
            field4335 = (class156) null;
        }
        class109.method759(arg1, false);
        int var7 = 0;
        int var8 = arg1;
        int var9 = arg1 - arg2;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg1;
        int var11 = -var9;
        int var12 = var9;
        int var13 = -1;
        if (class185.field2769 <= arg5 && class166.field2494 >= arg5) {
            int[] var14 = class40.field488[arg5];
            int var15 = class222.method1553(class184.field2761, (byte) -82, arg4 - arg1, class157.field2357);
            int var16 = class222.method1553(class184.field2761, (byte) -30, arg1 + arg4, class157.field2357);
            int var17 = class222.method1553(class184.field2761, (byte) -32, arg4 - var9, class157.field2357);
            int var18 = class222.method1553(class184.field2761, (byte) -93, arg4 + var9, class157.field2357);
            class315.method2160(var14, arg6, var17, var15, 7);
            class315.method2160(var14, arg0, var18, var17, 7);
            class315.method2160(var14, arg6, var16, var18, 7);
        }
        int var19 = -1;
        while (var7 < var8) {
            var13 += 2;
            var19 += 2;
            var11 += var19;
            if (var11 >= 0 && var12 >= 1) {
                var12--;
                class278.field4227[var12] = var7;
                var11 -= var12 << 1;
            }
            var7++;
            var10 += var13;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                int var20 = arg5 + var8;
                int var21 = arg5 - var8;
                if (class185.field2769 <= var20 && class166.field2494 >= var21) {
                    if (var9 > var8) {
                        int var22 = class278.field4227[var8];
                        int var23 = class222.method1553(class184.field2761, (byte) -122, arg4 + var7, class157.field2357);
                        int var24 = class222.method1553(class184.field2761, (byte) -50, arg4 - var7, class157.field2357);
                        int var25 = class222.method1553(class184.field2761, (byte) -38, arg4 + var22, class157.field2357);
                        int var26 = class222.method1553(class184.field2761, (byte) -90, arg4 - var22, class157.field2357);
                        if (var20 <= class166.field2494) {
                            int[] var27 = class40.field488[var20];
                            class315.method2160(var27, arg6, var26, var24, 7);
                            class315.method2160(var27, arg0, var25, var26, 7);
                            class315.method2160(var27, arg6, var23, var25, 7);
                        }
                        if (var21 >= class185.field2769) {
                            int[] var28 = class40.field488[var21];
                            class315.method2160(var28, arg6, var26, var24, 7);
                            class315.method2160(var28, arg0, var25, var26, 7);
                            class315.method2160(var28, arg6, var23, var25, 7);
                        }
                    } else {
                        int var29 = class222.method1553(class184.field2761, (byte) -16, arg4 + var7, class157.field2357);
                        int var30 = class222.method1553(class184.field2761, (byte) -24, arg4 - var7, class157.field2357);
                        if (class166.field2494 >= var20) {
                            class315.method2160(class40.field488[var20], arg6, var29, var30, 7);
                        }
                        if (class185.field2769 <= var21) {
                            class315.method2160(class40.field488[var21], arg6, var29, var30, 7);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (var32 >= class185.field2769 && class166.field2494 >= var31) {
                int var33 = arg4 + var8;
                int var34 = arg4 - var8;
                if (class157.field2357 <= var33 && var34 <= class184.field2761) {
                    int var35 = class222.method1553(class184.field2761, (byte) -35, var33, class157.field2357);
                    int var36 = class222.method1553(class184.field2761, (byte) -128, var34, class157.field2357);
                    if (var9 > var7) {
                        int var37 = var12 < var7 ? class278.field4227[var7] : var12;
                        int var38 = class222.method1553(class184.field2761, (byte) -51, arg4 + var37, class157.field2357);
                        int var39 = class222.method1553(class184.field2761, (byte) -17, arg4 - var37, class157.field2357);
                        if (class166.field2494 >= var32) {
                            int[] var40 = class40.field488[var32];
                            class315.method2160(var40, arg6, var39, var36, 7);
                            class315.method2160(var40, arg0, var38, var39, 7);
                            class315.method2160(var40, arg6, var35, var38, 7);
                        }
                        if (var31 >= class185.field2769) {
                            int[] var41 = class40.field488[var31];
                            class315.method2160(var41, arg6, var39, var36, 7);
                            class315.method2160(var41, arg0, var38, var39, 7);
                            class315.method2160(var41, arg6, var35, var38, 7);
                        }
                    } else {
                        if (var32 <= class166.field2494) {
                            class315.method2160(class40.field488[var32], arg6, var35, var36, 7);
                        }
                        if (var31 >= class185.field2769) {
                            class315.method2160(class40.field488[var31], arg6, var35, var36, 7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V", line = 207)
    public static final void method1996(int arg0) {
        field4331++;
        class183 var1 = new class183();
        if (arg0 < 59) {
            field4340 = 123;
        }
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class38.field462[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lsg;)V", line = 237)
    public class287(class166 arg0) {
        this.field4334 = arg0;
    }
}
