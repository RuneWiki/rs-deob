import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class205 extends class115 {

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "[I")
    public static int[] field3638 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "Z")
    public static boolean field3641 = false;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "Lud;")
    public static class279 field3650 = class130.method1024("Spieler kann nicht gefunden werden: ", 255);

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "Lud;")
    public static class279 field3649 = class130.method1024("Impossible de trouver ", 255);

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "Lud;")
    public static class279 field3644 = class130.method1024("Hidden)2", 255);

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "Lud;")
    public static class279 field3654 = class130.method1024("Interfaces charg-Bes", 255);

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    private int field3647;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "Lud;")
    public class279 field3640;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Z", line = 10)
    public final boolean method1518(int arg0) {
        if (arg0 == 8) {
            field3645++;
            return this.field3647 == 115;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLvh;)V", line = 21)
    public final void method1519(boolean arg0, class53 arg1) {
        field3639++;
        while (true) {
            int var3 = arg1.method483(-116);
            if (var3 == 0) {
                if (arg0) {
                    this.method1524(false, (class53) null, 90);
                }
                return;
            }
            this.method1524(!arg0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BII)I", line = 52)
    public static final int method1520(byte arg0, int arg1, int arg2) {
        field3648++;
        int var3 = class285.method2040(true, arg1 + 91923, 4, arg2 + 45365) + (class285.method2040(true, arg1 + 37821, 2, arg2 + 10294) - 128 >> 1) + (class285.method2040(true, arg1, 1, arg2) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 != 91) {
            method1520((byte) -109, 24, 78);
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBI)Lud;", line = 73)
    public static final class279 method1521(int arg0, byte arg1, int arg2) {
        field3652++;
        int var3 = 56 % ((arg1 - 33) / 51);
        int var4 = arg0 - arg2;
        if (var4 < -9) {
            return class304.field5379;
        } else if (var4 < -6) {
            return class104.field1960;
        } else if (var4 < -3) {
            return class90.field1696;
        } else if (var4 < 0) {
            return class282.field5032;
        } else if (var4 > 9) {
            return class20.field569;
        } else if (var4 > 6) {
            return class184.field3368;
        } else if (var4 <= 3) {
            return var4 > 0 ? class220.field3890 : class117.field2131;
        } else {
            return class133.field2441;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IJ[IZ)Lud;", line = 115)
    public static final class279 method1522(int arg0, long arg1, int[] arg2, boolean arg3) {
        if (!arg3) {
            method1520((byte) 90, -13, 36);
        }
        field3642++;
        if (class45.field941 != null) {
            class279 var5 = class45.field941.method18((byte) 47, arg1, arg0, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        return class254.method1816(arg3, arg1);
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)V", line = 137)
    public static void method1523(byte arg0) {
        field3638 = null;
        field3654 = null;
        field3650 = null;
        field3644 = null;
        field3649 = null;
        if (arg0 != -45) {
            method1525(82, -41, 31, 22, -73, -81, (class8) null, -35);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLvh;I)V", line = 157)
    private final void method1524(boolean arg0, class53 arg1, int arg2) {
        field3643++;
        if (arg2 == 1) {
            this.field3647 = arg1.method483(-107);
        } else if (arg2 == 2) {
            this.field3651 = arg1.method453(1);
        } else if (arg2 == 5) {
            this.field3640 = arg1.method467((byte) -16);
        }
        if (!arg0) {
            this.field3651 = -7;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIILgf;I)V", line = 181)
    public static final void method1525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class8 arg6, int arg7) {
        field3646++;
        if (class59.field1249) {
            class37.field826 = 32;
        } else {
            class37.field826 = 0;
        }
        class59.field1249 = false;
        if (class34.field778 != 0) {
            if (arg7 >= arg1 && arg7 < arg1 + 16 && arg0 <= arg4 && (arg0 + 16) > arg4) {
                arg6.field243 -= 4;
                class50.method426(arg6, false);
            } else if (arg7 >= arg1 && arg7 < arg1 + 16 && arg0 + arg2 - 16 <= arg4 && arg0 + arg2 > arg4) {
                arg6.field243 += 4;
                class50.method426(arg6, false);
            } else if ((arg1 - class37.field826) <= arg7 && arg7 < (arg1 + class37.field826 + 16) && (arg0 + 16) <= arg4 && arg0 + arg2 - 16 > arg4) {
                int var8 = (arg2 - 32) * arg2 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - (var8 + 32);
                int var10 = arg4 - arg0 - (var8 / 2) - 16;
                arg6.field243 = (arg3 - arg2) * var10 / var9;
                class50.method426(arg6, false);
                class59.field1249 = true;
            }
        }
        if (class216.field3818 != 0) {
            int var11 = arg6.field220;
            if (arg1 - var11 <= arg7 && arg0 <= arg4 && arg7 < (arg1 + 16) && (arg0 + arg2) >= arg4) {
                arg6.field243 += class216.field3818 * 45;
                class50.method426(arg6, false);
            }
        }
        if (arg5 != 2245) {
            method1522(-122, -83L, (int[]) null, false);
        }
    }
}
