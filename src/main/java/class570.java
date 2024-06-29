import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class570 extends class607 {

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Z")
    private boolean field8215 = false;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Llba;")
    public static class477 field8217;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Lfj;")
    public static class572 field8223;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "[Z")
    public static boolean[] field8224;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field8222;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)V")
    public final void method808(int arg0, boolean arg1) {
        if (arg0 != 993) {
            field8217 = null;
        }
        super.field8870.method1912(class274.field3839, class457.field6837, arg0 + -878);
        ++field8221;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    public static final void method3310(byte arg0) {
        class133.field1672.method1810(false);
        int var1 = -123 / ((28 - arg0) / 37);
        ++field8211;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
    public static void method3311(int arg0) {
        field8223 = null;
        field8224 = null;
        field8217 = null;
        if (arg0 != 0) {
            method3313(112, -76, (String) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field8214;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = -arg4 + arg1;
        int var12 = -arg4 + arg7;
        int var13 = arg1 * arg1;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 - -var17;
        int var24 = -((var21 - 1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = var16 - (var22 + -1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        if (arg0 != 13104) {
            field8217 = null;
        }
        int var35 = var28;
        int var36 = (arg7 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class402.field6087[arg5];
        class645.method3675(arg0 ^ 13134, var39, arg2, arg3 - arg1, -var11 + arg3);
        class645.method3675(arg0 + -12986, var39, arg6, -var11 + arg3, arg3 + var11);
        class645.method3675(arg0 ^ 13149, var39, arg2, arg3 - -var11, arg1 + arg3);
        while (~var9 < -1) {
            boolean var40 = ~var12 <= ~var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    ++var8;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        var25 += var33;
                        var26 += var37;
                        ++var10;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (~var26 > -1) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    ++var10;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (~var24 > -1) {
                var23 += var31;
                var24 += var35;
                ++var8;
                var35 += var28;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            --var9;
            int var41 = -var9 + arg5;
            int var42 = arg5 + var9;
            int var43 = arg3 - -var8;
            int var44 = -var8 + arg3;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = -var10 + arg3;
                class645.method3675(97, class402.field6087[var41], arg2, var44, var46);
                class645.method3675(108, class402.field6087[var41], arg6, var46, var45);
                class645.method3675(124, class402.field6087[var41], arg2, var45, var43);
                class645.method3675(123, class402.field6087[var42], arg2, var44, var46);
                class645.method3675(114, class402.field6087[var42], arg6, var46, var45);
                class645.method3675(96, class402.field6087[var42], arg2, var45, var43);
            } else {
                class645.method3675(106, class402.field6087[var41], arg2, var44, var43);
                class645.method3675(arg0 + -13012, class402.field6087[var42], arg2, var44, var43);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)Z")
    public final boolean method814(byte arg0) {
        if (arg0 != -97) {
            field8223 = null;
        }
        ++field8219;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method3313(int arg0, int arg1, String arg2, String arg3) {
        if (arg1 != -202020063) {
            method3314(-72, (class203) null, 68, -47);
        }
        ++field8212;
        class414.field6279 = arg0;
        class253.field3576 = 2;
        class237.method1589(false, 8, arg2, arg3);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZB)V")
    public final void method811(boolean arg0, byte arg1) {
        ++field8218;
        class627 var3 = super.field8870.method1919((byte) 106);
        if (arg1 != 91) {
            this.field8215 = true;
        }
        if (var3 != null && arg0) {
            super.field8870.method1957(-2, 1);
            super.field8870.method1971((byte) -95, var3);
            super.field8870.method1546(class641.field9242, 21144);
            super.field8870.method1957(arg1 ^ -91, 1);
            super.field8870.method1912(class274.field3839, class310.field4559, arg1 + -111);
            super.field8870.method1521(true, 2, false, class577.field8332, false);
            super.field8870.method1907(class242.field3434, true, 0);
            class646 var4 = super.field8870.method1930(1);
            var4.method3703(super.field8870.method1936(1), (byte) -120);
            super.field8870.method1935(class199.field2683, true);
            super.field8870.method1957(arg1 + -93, 0);
            this.field8215 = true;
        } else {
            super.field8870.method1907(class242.field3434, true, 0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLiu;)V")
    public final void method810(int arg0, byte arg1, class502 arg2) {
        ++field8222;
        super.field8870.method1971((byte) -56, arg2);
        if (arg1 <= -73) {
            super.field8870.method1904(arg0, -120);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
    public final void method805(byte arg0) {
        if (this.field8215) {
            super.field8870.method1957(-2, 1);
            super.field8870.method1546(class479.field7049, 21144);
            super.field8870.method1912(class457.field6837, class457.field6837, -59);
            super.field8870.method1970(123, class173.field2123, 2);
            super.field8870.method1907(class83.field935, true, 0);
            super.field8870.method1950(7869);
            super.field8870.method1971((byte) -124, (class502) null);
            super.field8870.method1957(arg0 ^ 56, 0);
            this.field8215 = false;
        } else {
            super.field8870.method1907(class83.field935, true, 0);
        }
        if (arg0 == -58) {
            ++field8216;
            super.field8870.method1912(class457.field6837, class457.field6837, -16);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public final void method815(int arg0, int arg1, int arg2) {
        if (arg0 != 12868) {
            field8224 = null;
        }
        ++field8220;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ltu;)V")
    public class570(class294 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILkea;II)Ldj;")
    public static final class291 method3314(int arg0, class203 arg1, int arg2, int arg3) {
        ++field8213;
        if (arg0 < 17) {
            return null;
        } else {
            class194 var4 = new class194(arg1.method1286(arg2, arg3, (byte) -49));
            class291 var5 = new class291(arg2, var4.method1218(false), var4.method1218(false), var4.method1178(-230315992), var4.method1178(-230315992), var4.method1177(255) == 1, var4.method1177(255), var4.method1177(255));
            int var6 = var4.method1177(255);
            for (int var7 = 0; ~var7 > ~var6; ++var7) {
                var5.field4031.method706(new class72(var4.method1177(255), var4.method1220(-32), var4.method1220(-20), var4.method1220(111), var4.method1220(-80), var4.method1220(-87), var4.method1220(-91), var4.method1220(-5), var4.method1220(-76)), true);
            }
            var5.method1882((byte) 16);
            return var5;
        }
    }

    static {
        new class474("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field8217 = new class477();
        field8223 = new class572("", 12);
        field8224 = new boolean[100];
    }
}
