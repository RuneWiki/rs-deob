import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class272 {

    @OriginalMember(owner = "client!to", name = "c", descriptor = "[I")
    public static int[] field3674 = new int[14];

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field3678 = -1;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Lph;")
    public static class114 field3672 = new class114(5);

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field3680 = -1;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "Lam;")
    public static class286 field3683;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "Ljava/lang/String;")
    public String field3673;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "[Llg;")
    public static class20[] field3677;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "[Lbl;")
    public static class54[] field3682;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public static void method1505(int arg0) {
        field3674 = null;
        field3682 = null;
        if (arg0 != 1) {
            field3672 = null;
        }
        field3683 = null;
        field3672 = null;
        field3677 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3679++;
        class125.method677((byte) 125, arg0);
        int var7 = 0;
        int var8 = arg0 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        if (arg1 != 1) {
            method1506(42, -67, -74, -121, -24, -91, -101);
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class335.field4462 <= arg4 && arg4 <= class6.field42) {
            int[] var15 = class153.field1932[arg4];
            int var16 = class104.method556(class322.field4306, 2048, arg2 - arg0, class310.field4183);
            int var17 = class104.method556(class322.field4306, 2048, arg0 + arg2, class310.field4183);
            int var18 = class104.method556(class322.field4306, 2048, arg2 - var8, class310.field4183);
            int var19 = class104.method556(class322.field4306, 2048, arg2 + var8, class310.field4183);
            class296.method1740(var16, var15, (byte) 81, arg6, var18);
            class296.method1740(var18, var15, (byte) 81, arg5, var19);
            class296.method1740(var19, var15, (byte) 81, arg6, var17);
        }
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class427.field6263[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg4 - var9;
                int var21 = arg4 + var9;
                if (class335.field4462 <= var21 && class6.field42 >= var20) {
                    if (var8 > var9) {
                        int var22 = class427.field6263[var9];
                        int var23 = class104.method556(class322.field4306, 2048, arg2 + var7, class310.field4183);
                        int var24 = class104.method556(class322.field4306, arg1 + 2047, -var7 + arg2, class310.field4183);
                        int var25 = class104.method556(class322.field4306, 2048, arg2 + var22, class310.field4183);
                        int var26 = class104.method556(class322.field4306, arg1 + 2047, -var22 + arg2, class310.field4183);
                        if (class6.field42 >= var21) {
                            int[] var27 = class153.field1932[var21];
                            class296.method1740(var24, var27, (byte) 81, arg6, var26);
                            class296.method1740(var26, var27, (byte) 81, arg5, var25);
                            class296.method1740(var25, var27, (byte) 81, arg6, var23);
                        }
                        if (var20 >= class335.field4462) {
                            int[] var28 = class153.field1932[var20];
                            class296.method1740(var24, var28, (byte) 81, arg6, var26);
                            class296.method1740(var26, var28, (byte) 81, arg5, var25);
                            class296.method1740(var25, var28, (byte) 81, arg6, var23);
                        }
                    } else {
                        int var29 = class104.method556(class322.field4306, 2048, arg2 + var7, class310.field4183);
                        int var30 = class104.method556(class322.field4306, 2048, arg2 - var7, class310.field4183);
                        if (class6.field42 >= var21) {
                            class296.method1740(var30, class153.field1932[var21], (byte) 81, arg6, var29);
                        }
                        if (var20 >= class335.field4462) {
                            class296.method1740(var30, class153.field1932[var20], (byte) 81, arg6, var29);
                        }
                    }
                }
            }
            int var31 = arg4 - var7;
            int var32 = arg4 + var7;
            if (class335.field4462 <= var32 && class6.field42 >= var31) {
                int var33 = arg2 + var9;
                int var34 = arg2 - var9;
                if (var33 >= class322.field4306 && class310.field4183 >= var34) {
                    int var35 = class104.method556(class322.field4306, 2048, var33, class310.field4183);
                    int var36 = class104.method556(class322.field4306, 2048, var34, class310.field4183);
                    if (var8 <= var7) {
                        if (class6.field42 >= var32) {
                            class296.method1740(var36, class153.field1932[var32], (byte) 81, arg6, var35);
                        }
                        if (var31 >= class335.field4462) {
                            class296.method1740(var36, class153.field1932[var31], (byte) 81, arg6, var35);
                        }
                    } else {
                        int var37 = var11 >= var7 ? var11 : class427.field6263[var7];
                        int var38 = class104.method556(class322.field4306, 2048, arg2 + var37, class310.field4183);
                        int var39 = class104.method556(class322.field4306, 2048, arg2 - var37, class310.field4183);
                        if (var32 <= class6.field42) {
                            int[] var40 = class153.field1932[var32];
                            class296.method1740(var36, var40, (byte) 81, arg6, var39);
                            class296.method1740(var39, var40, (byte) 81, arg5, var38);
                            class296.method1740(var38, var40, (byte) 81, arg6, var35);
                        }
                        if (class335.field4462 <= var31) {
                            int[] var41 = class153.field1932[var31];
                            class296.method1740(var36, var41, (byte) 81, arg6, var39);
                            class296.method1740(var39, var41, (byte) 81, arg5, var38);
                            class296.method1740(var38, var41, (byte) 81, arg6, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Ljj;")
    public static final class156 method1507(byte arg0) {
        if (arg0 > -79) {
            field3677 = null;
        }
        field3676++;
        class36.field359 = 0;
        return class435.method2688(true);
    }
}
