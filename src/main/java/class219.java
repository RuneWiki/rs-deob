import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class219 {

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[Lkl;")
    public static class262[] field3561 = new class262[6];

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field3553 = 255;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIZZI)V")
    public static final void method1478(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field3558++;
        if (arg3 != 0) {
            field3563 = 95;
        }
        if (arg1 <= arg2) {
            return;
        }
        int var7 = (arg1 + arg2) / 2;
        int var8 = arg2;
        class157 var9 = class216.field3526[var7];
        class216.field3526[var7] = class216.field3526[arg1];
        class216.field3526[arg1] = var9;
        for (int var10 = arg2; var10 < arg1; var10++) {
            if (class223.method1519(arg6, arg5, (byte) -122, arg0, var9, class216.field3526[var10], arg4) <= 0) {
                class157 var11 = class216.field3526[var10];
                class216.field3526[var10] = class216.field3526[var8];
                class216.field3526[var8++] = var11;
            }
        }
        class216.field3526[arg1] = class216.field3526[var8];
        class216.field3526[var8] = var9;
        method1478(arg0, var8 - 1, arg2, 0, arg4, arg5, arg6);
        method1478(arg0, arg1, var8 + 1, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Lhi;")
    public class219 method1100(int arg0, int arg1, int arg2) {
        field3557++;
        return this;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()Z")
    public boolean method1089() {
        field3562++;
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()I")
    public abstract int method363();

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
    public abstract void method370(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lhi;IIIZ)V")
    public void method1080(class219 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3556++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIIJILql;)V")
    public abstract void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class217 arg10);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3554++;
        int var7 = 0;
        int var8 = arg1;
        class187.method1299(0, arg1);
        int var9 = arg1 - arg2;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = var9;
        int var11 = -arg1;
        int var12 = -var9;
        int var13 = -1;
        int var14 = -1;
        if (arg0 >= class110.field1669 && arg0 <= class189.field2984) {
            int[] var15 = class106.field1637[arg0];
            int var16 = class34.method273(class96.field1484, arg5 - arg1, false, class51.field710);
            int var17 = class34.method273(class96.field1484, arg1 + arg5, false, class51.field710);
            int var18 = class34.method273(class96.field1484, arg5 - var9, false, class51.field710);
            int var19 = class34.method273(class96.field1484, arg5 + var9, false, class51.field710);
            class8.method52(var16, var15, var18, arg6, true);
            class8.method52(var18, var15, var19, arg4, true);
            class8.method52(var19, var15, var17, arg6, true);
        }
        if (arg3 > -53) {
            field3560 = -68;
        }
        while (var8 > var7) {
            var13 += 2;
            var14 += 2;
            var11 += var14;
            var12 += var13;
            if (var12 >= 0 && var10 >= 1) {
                var10--;
                var12 -= var10 << 1;
                class6.field86[var10] = var7;
            }
            var7++;
            if (var11 >= 0) {
                var8--;
                var11 -= var8 << 1;
                int var20 = arg0 + var8;
                int var21 = arg0 - var8;
                if (class110.field1669 <= var20 && class189.field2984 >= var21) {
                    if (var9 > var8) {
                        int var22 = class6.field86[var8];
                        int var23 = class34.method273(class96.field1484, arg5 + var7, false, class51.field710);
                        int var24 = class34.method273(class96.field1484, arg5 - var7, false, class51.field710);
                        int var25 = class34.method273(class96.field1484, arg5 + var22, false, class51.field710);
                        int var26 = class34.method273(class96.field1484, arg5 - var22, false, class51.field710);
                        if (class189.field2984 >= var20) {
                            int[] var27 = class106.field1637[var20];
                            class8.method52(var24, var27, var26, arg6, true);
                            class8.method52(var26, var27, var25, arg4, true);
                            class8.method52(var25, var27, var23, arg6, true);
                        }
                        if (var21 >= class110.field1669) {
                            int[] var28 = class106.field1637[var21];
                            class8.method52(var24, var28, var26, arg6, true);
                            class8.method52(var26, var28, var25, arg4, true);
                            class8.method52(var25, var28, var23, arg6, true);
                        }
                    } else {
                        int var29 = class34.method273(class96.field1484, arg5 + var7, false, class51.field710);
                        int var30 = class34.method273(class96.field1484, arg5 - var7, false, class51.field710);
                        if (var20 <= class189.field2984) {
                            class8.method52(var30, class106.field1637[var20], var29, arg6, true);
                        }
                        if (class110.field1669 <= var21) {
                            class8.method52(var30, class106.field1637[var21], var29, arg6, true);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (var32 >= class110.field1669 && var31 <= class189.field2984) {
                int var33 = arg5 + var8;
                int var34 = arg5 - var8;
                if (class51.field710 <= var33 && class96.field1484 >= var34) {
                    int var35 = class34.method273(class96.field1484, var33, false, class51.field710);
                    int var36 = class34.method273(class96.field1484, var34, false, class51.field710);
                    if (var7 >= var9) {
                        if (var32 <= class189.field2984) {
                            class8.method52(var36, class106.field1637[var32], var35, arg6, true);
                        }
                        if (class110.field1669 <= var31) {
                            class8.method52(var36, class106.field1637[var31], var35, arg6, true);
                        }
                    } else {
                        int var37 = var10 >= var7 ? var10 : class6.field86[var7];
                        int var38 = class34.method273(class96.field1484, arg5 + var37, false, class51.field710);
                        int var39 = class34.method273(class96.field1484, arg5 - var37, false, class51.field710);
                        if (class189.field2984 >= var32) {
                            int[] var40 = class106.field1637[var32];
                            class8.method52(var36, var40, var39, arg6, true);
                            class8.method52(var39, var40, var38, arg4, true);
                            class8.method52(var38, var40, var35, arg6, true);
                        }
                        if (class110.field1669 <= var31) {
                            int[] var41 = class106.field1637[var31];
                            class8.method52(var36, var41, var39, arg6, true);
                            class8.method52(var39, var41, var38, arg4, true);
                            class8.method52(var38, var41, var35, arg6, true);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1480(byte arg0) {
        if (arg0 > 6) {
            field3561 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static final void method1481(int arg0) {
        field3555++;
        class23.field287.method1430(arg0);
    }
}
