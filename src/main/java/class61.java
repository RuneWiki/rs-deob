import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class61 {

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field953 = 0;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "Lnj;")
    public static class317 field952 = new class317();

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class335.method2222(arg5, 0);
        field956++;
        if (arg2 != 1) {
            field952 = null;
        }
        int var7 = 0;
        int var8 = arg5 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (class462.field7105 <= arg3 && class222.field3750 >= arg3) {
            int[] var14 = class103.field1521[arg3];
            int var15 = class405.method2598(class460.field7096, class178.field2609, arg0 - arg5, (byte) 84);
            int var16 = class405.method2598(class460.field7096, class178.field2609, arg0 + arg5, (byte) 124);
            int var17 = class405.method2598(class460.field7096, class178.field2609, arg0 - var8, (byte) 115);
            int var18 = class405.method2598(class460.field7096, class178.field2609, arg0 + var8, (byte) 91);
            class280.method1888(var15, var17, (byte) 82, var14, arg6);
            class280.method1888(var17, var18, (byte) 82, var14, arg4);
            class280.method1888(var18, var16, (byte) 82, var14, arg6);
        }
        int var19 = -1;
        while (var7 < var9) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class290.field4590[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg3 - var9;
                int var21 = arg3 + var9;
                if (var21 >= class462.field7105 && var20 <= class222.field3750) {
                    if (var8 <= var9) {
                        int var22 = class405.method2598(class460.field7096, class178.field2609, arg0 + var7, (byte) 90);
                        int var23 = class405.method2598(class460.field7096, class178.field2609, arg0 - var7, (byte) 113);
                        if (class222.field3750 >= var21) {
                            class280.method1888(var23, var22, (byte) 82, class103.field1521[var21], arg6);
                        }
                        if (var20 >= class462.field7105) {
                            class280.method1888(var23, var22, (byte) 82, class103.field1521[var20], arg6);
                        }
                    } else {
                        int var24 = class290.field4590[var9];
                        int var25 = class405.method2598(class460.field7096, class178.field2609, arg0 + var7, (byte) 112);
                        int var26 = class405.method2598(class460.field7096, class178.field2609, arg0 - var7, (byte) 91);
                        int var27 = class405.method2598(class460.field7096, class178.field2609, arg0 + var24, (byte) 118);
                        int var28 = class405.method2598(class460.field7096, class178.field2609, arg0 - var24, (byte) 98);
                        if (class222.field3750 >= var21) {
                            int[] var29 = class103.field1521[var21];
                            class280.method1888(var26, var28, (byte) 82, var29, arg6);
                            class280.method1888(var28, var27, (byte) 82, var29, arg4);
                            class280.method1888(var27, var25, (byte) 82, var29, arg6);
                        }
                        if (class462.field7105 <= var20) {
                            int[] var30 = class103.field1521[var20];
                            class280.method1888(var26, var28, (byte) 82, var30, arg6);
                            class280.method1888(var28, var27, (byte) 82, var30, arg4);
                            class280.method1888(var27, var25, (byte) 82, var30, arg6);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (class462.field7105 <= var32 && class222.field3750 >= var31) {
                int var33 = arg0 + var9;
                int var34 = arg0 - var9;
                if (class178.field2609 <= var33 && var34 <= class460.field7096) {
                    int var35 = class405.method2598(class460.field7096, class178.field2609, var33, (byte) 99);
                    int var36 = class405.method2598(class460.field7096, class178.field2609, var34, (byte) 123);
                    if (var8 <= var7) {
                        if (class222.field3750 >= var32) {
                            class280.method1888(var36, var35, (byte) 82, class103.field1521[var32], arg6);
                        }
                        if (var31 >= class462.field7105) {
                            class280.method1888(var36, var35, (byte) 82, class103.field1521[var31], arg6);
                        }
                    } else {
                        int var37 = var11 >= var7 ? var11 : class290.field4590[var7];
                        int var38 = class405.method2598(class460.field7096, class178.field2609, arg0 + var37, (byte) 105);
                        int var39 = class405.method2598(class460.field7096, class178.field2609, arg0 - var37, (byte) 89);
                        if (class222.field3750 >= var32) {
                            int[] var40 = class103.field1521[var32];
                            class280.method1888(var36, var39, (byte) 82, var40, arg6);
                            class280.method1888(var39, var38, (byte) 82, var40, arg4);
                            class280.method1888(var38, var35, (byte) 82, var40, arg6);
                        }
                        if (var31 >= class462.field7105) {
                            int[] var41 = class103.field1521[var31];
                            class280.method1888(var36, var39, (byte) 82, var41, arg6);
                            class280.method1888(var39, var38, (byte) 82, var41, arg4);
                            class280.method1888(var38, var35, (byte) 82, var41, arg6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method453(int arg0) {
        field952 = null;
        int var1 = -61 / ((arg0 - 32) / 37);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)Z")
    public static final boolean method454(int arg0, int arg1) {
        field955++;
        if (arg1 != 1002) {
            method452(-44, -104, 29, -43, 94, -103, -110);
        }
        if (arg0 == 51 || arg0 == 50 || arg0 == 9 || arg0 == 12 || arg0 == 1002) {
            return true;
        } else {
            return arg0 == 2 || arg0 == 1007;
        }
    }
}
