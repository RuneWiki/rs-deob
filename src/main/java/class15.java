import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class15 extends class124 {

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "[I")
    public static int[] field164 = new int[100];

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field160 = 0;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field161 = 0;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "[[I")
    public static int[][] field165;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BIIIILeh;)V")
    public static final void method70(byte arg0, int arg1, int arg2, int arg3, int arg4, class107 arg5) {
        field166++;
        if (arg5.field1707 == -1 && arg5.field1714 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class32.field481 * arg5.field1694 >> 8;
        if (arg5.field1704 < arg3) {
            var6 += arg3 - arg5.field1704;
        } else if (arg3 < arg5.field1718) {
            var6 += arg5.field1718 - arg3;
        }
        if (arg5.field1713 < arg4) {
            var6 += arg4 - arg5.field1713;
        } else if (arg4 < arg5.field1708) {
            var6 += arg5.field1708 - arg4;
        }
        if (arg5.field1698 == 0 || arg5.field1698 < var6 - 64 || class32.field481 == 0 || arg5.field1700 != arg2) {
            if (arg5.field1699 != null) {
                class6.field68.method1594(arg5.field1699);
                arg5.field1699 = null;
            }
            if (arg5.field1715 != null) {
                class6.field68.method1594(arg5.field1715);
                arg5.field1715 = null;
            }
            return;
        }
        var6 -= 64;
        int var8 = -91 % ((-arg0 - 7) / 34);
        if (var6 < 0) {
            var6 = 0;
        }
        int var9 = (arg5.field1698 - var6) * var7 / arg5.field1698;
        if (arg5.field1699 != null) {
            arg5.field1699.method721(var9);
        } else if (arg5.field1707 >= 0) {
            class114 var10 = class114.method798(class229.field3690, arg5.field1707, 0);
            if (var10 != null) {
                class248 var11 = var10.method800().method1656(class151.field2342);
                class102 var12 = class102.method715(var11, 100, var9);
                var12.method702(-1);
                class6.field68.method1596(var12);
                arg5.field1699 = var12;
            }
        }
        if (arg5.field1715 != null) {
            arg5.field1715.method721(var9);
            if (arg5.field1715.method909(true)) {
                return;
            }
            arg5.field1715 = null;
        } else if (arg5.field1714 != null && (arg5.field1712 -= arg1) <= 0) {
            int var13 = (int) ((double) arg5.field1714.length * Math.random());
            class114 var14 = class114.method798(class229.field3690, arg5.field1714[var13], 0);
            if (var14 != null) {
                class248 var15 = var14.method800().method1656(class151.field2342);
                class102 var16 = class102.method715(var15, 100, var9);
                var16.method702(0);
                class6.field68.method1596(var16);
                arg5.field1712 = arg5.field1691 + (int) (Math.random() * (double) (arg5.field1717 - arg5.field1691));
                arg5.field1715 = var16;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static final void method71(int arg0) {
        field162++;
        if (class267.field4299) {
            return;
        }
        if (class144.field2281) {
            class90.field1456 = (float) ((int) class90.field1456 + 191 & 0xFFFFFF80);
        } else {
            class245.field3887 += (24.0F - class245.field3887) / 2.0F;
        }
        if (arg0 != 191) {
            method71(5);
        }
        class267.field4299 = true;
        class221.field3610 = true;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII)V")
    public static final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class234.field3774 >= arg5 && class85.field1409 <= arg4) {
            boolean var6;
            if (arg0 < class82.field1374) {
                arg0 = class82.field1374;
                var6 = false;
            } else if (class259.field4188 < arg0) {
                var6 = false;
                arg0 = class259.field4188;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg2 < class82.field1374) {
                arg2 = class82.field1374;
                var7 = false;
            } else if (class259.field4188 >= arg2) {
                var7 = true;
            } else {
                var7 = false;
                arg2 = class259.field4188;
            }
            if (arg5 >= class85.field1409) {
                class73.method494(arg1, class204.field3253[arg5++], 4028, arg2, arg0);
            } else {
                arg5 = class85.field1409;
            }
            if (class234.field3774 >= arg4) {
                class73.method494(arg1, class204.field3253[arg4--], 4028, arg2, arg0);
            } else {
                arg4 = class234.field3774;
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg4; var8++) {
                    int[] var9 = class204.field3253[var8];
                    var9[arg0] = var9[arg2] = arg1;
                }
            } else if (var6) {
                for (int var10 = arg5; var10 <= arg4; var10++) {
                    class204.field3253[var10][arg0] = arg1;
                }
            } else if (var7) {
                for (int var11 = arg5; var11 <= arg4; var11++) {
                    class204.field3253[var11][arg2] = arg1;
                }
            }
        }
        if (arg3 == 0) {
            field163++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method73(int arg0, int arg1, int arg2, long arg3) {
        class151 var5 = class218.field3584[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2352 != null && var5.field2352.field3313 == arg3) {
            return true;
        } else if (var5.field2355 != null && var5.field2355.field4185 == arg3) {
            return true;
        } else if (var5.field2364 != null && var5.field2364.field3050 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2357; var6++) {
                if (var5.field2347[var6].field2933 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static void method74(int arg0) {
        field165 = null;
        field164 = null;
        if (arg0 != 31658) {
            method71(-48);
        }
    }
}
