import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class240 {

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public int field3657 = -1;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public int field3653 = -1;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public int field3655 = -1;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public int field3656 = -1;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public int field3669 = 99;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public int field3671 = 5;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public int field3674 = 2;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "Z")
    public boolean field3681 = false;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "Z")
    public boolean field3675 = false;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public int field3682 = -1;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Z")
    public boolean field3667 = false;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Z")
    public boolean field3658 = false;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "[I")
    public static int[] field3668 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Z")
    public static boolean field3660 = false;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field3666 = 0;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3661 = "Loaded fonts";

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Llc;")
    public static class86 field3663 = new class86(50);

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[I")
    public int[] field3665;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "[I")
    public int[] field3673;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "[I")
    private int[] field3677;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "[Z")
    public boolean[] field3662;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "[[I")
    public int[][] field3672;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method1602(int arg0) {
        if (arg0 == 16025) {
            field3668 = null;
            field3661 = null;
            field3663 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public final void method1603(int arg0) {
        if (~this.field3653 == arg0) {
            if (this.field3662 == null) {
                this.field3653 = 0;
            } else {
                this.field3653 = 2;
            }
        }
        if (this.field3657 == -1) {
            if (this.field3662 == null) {
                this.field3657 = 0;
            } else {
                this.field3657 = 2;
            }
        }
        field3678++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLql;)V")
    public final void method1604(byte arg0, class224 arg1) {
        field3684++;
        if (arg0 != 22) {
            method1607(97, false, 69, -36, -62);
        }
        while (true) {
            int var3 = arg1.method1453((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method1605(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLql;)V")
    private final void method1605(int arg0, boolean arg1, class224 arg2) {
        field3659++;
        if (!arg1) {
            this.method1603(0);
        }
        if (arg0 == 1) {
            int var4 = arg2.method1445(!arg1);
            this.field3673 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3673[var5] = arg2.method1445(false);
            }
            this.field3665 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3665[var6] = arg2.method1445(false);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3665[var7] = (arg2.method1445(false) << 16) + this.field3665[var7];
            }
        } else if (arg0 == 2) {
            this.field3682 = arg2.method1445(!arg1);
        } else if (arg0 == 3) {
            this.field3662 = new boolean[256];
            int var15 = arg2.method1453((byte) -128);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field3662[arg2.method1453((byte) -128)] = true;
            }
        } else if (arg0 == 4) {
            this.field3658 = true;
        } else if (arg0 == 5) {
            this.field3671 = arg2.method1453((byte) -127);
        } else if (arg0 == 6) {
            this.field3656 = arg2.method1445(false);
        } else if (arg0 == 7) {
            this.field3655 = arg2.method1445(false);
        } else if (arg0 == 8) {
            this.field3669 = arg2.method1453((byte) -128);
        } else if (arg0 == 9) {
            this.field3657 = arg2.method1453((byte) -127);
        } else if (arg0 == 10) {
            this.field3653 = arg2.method1453((byte) -128);
        } else if (arg0 == 11) {
            this.field3674 = arg2.method1453((byte) -128);
        } else if (arg0 == 12) {
            int var8 = arg2.method1453((byte) -128);
            this.field3677 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3677[var9] = arg2.method1445(false);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3677[var10] += arg2.method1445(!arg1) << 16;
            }
        } else if (arg0 == 13) {
            int var11 = arg2.method1445(false);
            this.field3672 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg2.method1453((byte) -128);
                if (var13 > 0) {
                    this.field3672[var12] = new int[var13];
                    this.field3672[var12][0] = arg2.method1454(124);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field3672[var12][var14] = arg2.method1445(false);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field3681 = true;
        } else if (arg0 == 15) {
            this.field3667 = true;
        } else if (arg0 == 16) {
            this.field3675 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BILgh;II)Lgh;")
    public final class25 method1606(byte arg0, int arg1, class25 arg2, int arg3, int arg4) {
        field3664++;
        int var6 = this.field3673[arg4];
        int var7 = this.field3665[arg4];
        class159 var8 = class245.method1648(95, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (arg0 != -10) {
            this.field3675 = false;
        }
        if (var8 == null) {
            return arg2.method136(true, true, true);
        }
        class159 var10 = null;
        if ((this.field3667 || class169.field2350) && arg3 != -1 && this.field3665.length > arg3) {
            int var11 = this.field3665[arg3];
            var10 = class245.method1648(70, var11 >> 16);
            arg3 = var11 & 0xFFFF;
        }
        class25 var12;
        if (var10 == null) {
            var12 = arg2.method136(!var8.method1058(82, var9), !var8.method1061(var9, arg0 ^ 0x9), !this.field3681);
        } else {
            var12 = arg2.method136(!var8.method1058(79, var9) & !var10.method1058(89, arg3), !var8.method1061(var9, -1) & !var10.method1061(arg3, -1), !this.field3681);
        }
        var12.method172(var8, var9, var10, arg3, arg1 - 1, var6, this.field3681);
        return var12;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZIII)V")
    public static final void method1607(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -27) {
            method1602(51);
        }
        field3680++;
        if (class52.method328(19031, arg0)) {
            class42.method282(arg2, -1, (byte) 90, class158.field2208[arg0], arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILgh;IIIZ)Lgh;")
    public final class25 method1608(int arg0, class25 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3683++;
        int var7 = this.field3673[arg0];
        int var8 = this.field3665[arg0];
        class159 var9 = class245.method1648(80, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method115(true, true, true);
        }
        int var11 = arg4 & 0x3;
        class159 var12 = null;
        if ((this.field3667 || class169.field2350) && arg2 != -1 && this.field3665.length > arg2) {
            int var13 = this.field3665[arg2];
            var12 = class245.method1648(125, var13 >> 16);
            arg2 = var13 & 0xFFFF;
        }
        class25 var14;
        if (var12 == null) {
            var14 = arg1.method115(!var9.method1058(84, var10), !var9.method1061(var10, -1), !this.field3681);
        } else {
            var14 = arg1.method115(!var9.method1058(61, var10) & !var12.method1058(97, arg2), !var9.method1061(var10, -1) & !var12.method1061(arg2, -1), !this.field3681);
        }
        if (var11 == 1) {
            var14.method128();
        } else if (var11 == 2) {
            var14.method123();
        } else if (var11 == 3) {
            var14.method112();
        }
        if (!arg5) {
            this.field3675 = true;
        }
        var14.method172(var9, var10, var12, arg2, arg3 - 1, var7, this.field3681);
        if (var11 == 1) {
            var14.method112();
        } else if (var11 == 2) {
            var14.method123();
        } else if (var11 == 3) {
            var14.method128();
        }
        return var14;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBIILgh;)Lgh;")
    public final class25 method1609(int arg0, byte arg1, int arg2, int arg3, class25 arg4) {
        int var6 = this.field3673[arg3];
        field3670++;
        int var7 = this.field3665[arg3];
        class159 var8 = class245.method1648(127, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method109(true, true, true);
        }
        int var10 = 56 % ((52 - arg1) / 54);
        class159 var11 = null;
        if ((this.field3667 || class169.field2350) && arg2 != -1 && arg2 < this.field3665.length) {
            int var12 = this.field3665[arg2];
            var11 = class245.method1648(80, var12 >> 16);
            arg2 = var12 & 0xFFFF;
        }
        class159 var13 = null;
        int var14 = 0;
        class159 var15 = null;
        int var16 = 0;
        if (this.field3677 != null) {
            if (arg3 < this.field3677.length) {
                var14 = this.field3677[arg3];
                if (var14 != 65535) {
                    var15 = class245.method1648(95, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field3667 || class169.field2350) && arg2 != -1 && arg2 < this.field3677.length) {
                var16 = this.field3677[arg2];
                if (var16 != 65535) {
                    var13 = class245.method1648(97, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        boolean var17 = !var8.method1058(78, var9);
        boolean var18 = !var8.method1061(var9, -1);
        if (var15 != null) {
            var17 &= !var15.method1058(104, var14);
            var18 &= !var15.method1061(var14, -1);
        }
        if (var11 != null) {
            var17 &= !var11.method1058(106, arg2);
            var18 &= !var11.method1061(arg2, -1);
        }
        if (var13 != null) {
            var17 &= !var13.method1058(61, var16);
            var18 &= !var13.method1061(var16, -1);
        }
        class25 var19 = arg4.method109(var17, var18, !this.field3681);
        var19.method172(var8, var9, var11, arg2, arg0 - 1, var6, this.field3681);
        if (var15 != null) {
            var19.method172(var15, var14, var13, var16, arg0 - 1, var6, this.field3681);
        }
        return var19;
    }
}
