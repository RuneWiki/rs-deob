import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public abstract class class602 {

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field8104 = 0;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "[I")
    public static int[] field8103;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIIIB)V", line = 10)
    public static final void method3274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class356.method2050(-6, arg4);
        field8105++;
        if (arg6 != -33) {
            method3274(-96, -60, -71, 66, -79, -103, (byte) 34);
        }
        int var7 = 0;
        int var8 = arg4 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg2 >= class165.field2061 && class99.field1309 >= arg2) {
            int[] var14 = class213.field2746[arg2];
            int var15 = class650.method3574(class641.field8924, class265.field3552, arg1 - arg4, -74);
            int var16 = class650.method3574(class641.field8924, class265.field3552, arg1 + arg4, -2);
            int var17 = class650.method3574(class641.field8924, class265.field3552, arg1 - var8, 119);
            int var18 = class650.method3574(class641.field8924, class265.field3552, arg1 + var8, -25);
            class349.method2008(var17, (byte) 29, var14, var15, arg3);
            class349.method2008(var18, (byte) 26, var14, var17, arg5);
            class349.method2008(var16, (byte) 38, var14, var18, arg3);
        }
        int var19 = -1;
        while (var7 < var9) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class13.field148[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                if (var21 >= class165.field2061 && var20 <= class99.field1309) {
                    if (var8 > var9) {
                        int var22 = class13.field148[var9];
                        int var23 = class650.method3574(class641.field8924, class265.field3552, arg1 + var7, 122);
                        int var24 = class650.method3574(class641.field8924, class265.field3552, arg1 - var7, -4);
                        int var25 = class650.method3574(class641.field8924, class265.field3552, arg1 + var22, arg6 ^ 0x43);
                        int var26 = class650.method3574(class641.field8924, class265.field3552, arg1 - var22, -63);
                        if (var21 <= class99.field1309) {
                            int[] var27 = class213.field2746[var21];
                            class349.method2008(var26, (byte) 75, var27, var24, arg3);
                            class349.method2008(var25, (byte) 85, var27, var26, arg5);
                            class349.method2008(var23, (byte) 39, var27, var25, arg3);
                        }
                        if (var20 >= class165.field2061) {
                            int[] var28 = class213.field2746[var20];
                            class349.method2008(var26, (byte) 116, var28, var24, arg3);
                            class349.method2008(var25, (byte) 94, var28, var26, arg5);
                            class349.method2008(var23, (byte) 69, var28, var25, arg3);
                        }
                    } else {
                        int var29 = class650.method3574(class641.field8924, class265.field3552, arg1 + var7, -61);
                        int var30 = class650.method3574(class641.field8924, class265.field3552, arg1 - var7, 126);
                        if (class99.field1309 >= var21) {
                            class349.method2008(var29, (byte) 106, class213.field2746[var21], var30, arg3);
                        }
                        if (var20 >= class165.field2061) {
                            class349.method2008(var29, (byte) 54, class213.field2746[var20], var30, arg3);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (class165.field2061 <= var32 && class99.field1309 >= var31) {
                int var33 = arg1 + var9;
                int var34 = arg1 - var9;
                if (var33 >= class265.field3552 && class641.field8924 >= var34) {
                    int var35 = class650.method3574(class641.field8924, class265.field3552, var33, -68);
                    int var36 = class650.method3574(class641.field8924, class265.field3552, var34, -17);
                    if (var8 > var7) {
                        int var37 = var11 < var7 ? class13.field148[var7] : var11;
                        int var38 = class650.method3574(class641.field8924, class265.field3552, arg1 + var37, 118);
                        int var39 = class650.method3574(class641.field8924, class265.field3552, arg1 - var37, 19);
                        if (var32 <= class99.field1309) {
                            int[] var40 = class213.field2746[var32];
                            class349.method2008(var39, (byte) 54, var40, var36, arg3);
                            class349.method2008(var38, (byte) 29, var40, var39, arg5);
                            class349.method2008(var35, (byte) 52, var40, var38, arg3);
                        }
                        if (var31 >= class165.field2061) {
                            int[] var41 = class213.field2746[var31];
                            class349.method2008(var39, (byte) 23, var41, var36, arg3);
                            class349.method2008(var38, (byte) 21, var41, var39, arg5);
                            class349.method2008(var35, (byte) 113, var41, var38, arg3);
                        }
                    } else {
                        if (var32 <= class99.field1309) {
                            class349.method2008(var35, (byte) 88, class213.field2746[var32], var36, arg3);
                        }
                        if (class165.field2061 <= var31) {
                            class349.method2008(var35, (byte) 82, class213.field2746[var31], var36, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V", line = 197)
    public static void method3275(byte arg0) {
        field8103 = null;
        if (arg0 != -98) {
            field8104 = 61;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I[B)V")
    public abstract void method2680(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)[B")
    public abstract byte[] method2682(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(B)[B")
    public abstract byte[] method2681(byte arg0);
}
