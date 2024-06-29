import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class150 extends class148 {

    @OriginalMember(owner = "client!wd", name = "Pc", descriptor = "Loa;")
    private static class98 field3707 = class38.method349(255, "This computers address has been blocked");

    @OriginalMember(owner = "client!wd", name = "Nc", descriptor = "Loa;")
    public static class98 field3705 = class38.method349(255, "sl_arrows");

    @OriginalMember(owner = "client!wd", name = "Tc", descriptor = "Loa;")
    private static class98 field3711 = class38.method349(255, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!wd", name = "Zc", descriptor = "I")
    public static int field3717 = 0;

    @OriginalMember(owner = "client!wd", name = "Kc", descriptor = "Loa;")
    public static class98 field3702 = class38.method349(255, "AUS");

    @OriginalMember(owner = "client!wd", name = "Yc", descriptor = "Loa;")
    public static class98 field3716 = field3711;

    @OriginalMember(owner = "client!wd", name = "fd", descriptor = "Loa;")
    public static class98 field3723 = class38.method349(255, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!wd", name = "ad", descriptor = "Loa;")
    public static class98 field3718 = field3707;

    @OriginalMember(owner = "client!wd", name = "gd", descriptor = "Loa;")
    public static class98 field3724 = class38.method349(255, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!wd", name = "Ic", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!wd", name = "Jc", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!wd", name = "Lc", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!wd", name = "Mc", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!wd", name = "Oc", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!wd", name = "Qc", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!wd", name = "Sc", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!wd", name = "Vc", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!wd", name = "Wc", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!wd", name = "Xc", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!wd", name = "bd", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!wd", name = "cd", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!wd", name = "dd", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!wd", name = "ed", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!wd", name = "hd", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!wd", name = "id", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!wd", name = "Rc", descriptor = "Luc;")
    public class137 field3709;

    @OriginalMember(owner = "client!wd", name = "Uc", descriptor = "Lmd;")
    public static class87 field3712;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Loa;ILoa;Ltb;)[Lid;")
    public static final class60[] method1200(class98 arg0, int arg1, class98 arg2, class130 arg3) {
        int var4 = arg3.method1060((byte) 18, arg2);
        int var5 = arg3.method1048(arg0, var4, (byte) 115);
        if (arg1 != 2) {
            field3718 = null;
        }
        ++field3708;
        return class17.method162(arg3, var4, var5, (byte) 70);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Lna;")
    public static final class91 method1201(int arg0, int arg1) {
        class91 var2 = (class91) class148.field3619.method730((byte) 35, (long) arg1);
        ++field3719;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class131.field3081.method1058(3, 115, arg1);
            class91 var4 = new class91();
            if (var3 != null) {
                var4.method739(new class8(var3), 29270);
            }
            class148.field3619.method732(arg0, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
    public static final void method1202(int arg0) {
        int var1 = 0;
        if (arg0 != -7482) {
            method1205(true);
        }
        while (var1 < class74.field1603) {
            int var2 = class96.field2205[var1];
            class55 var3 = class33.field832[var2];
            int var4 = class36.field890.method62((byte) 88);
            if ((var4 & 64) != 0) {
                var4 += class36.field890.method62((byte) 100) << 8;
            }
            class141.method1135(-10993, var2, var3, var4);
            ++var1;
        }
        ++field3725;
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V")
    public static final void method1203(int arg0) {
        class138.field3382 = null;
        if (arg0 != -1454146233) {
            method1212(3);
        }
        class55.field1207 = null;
        class62.field1318 = null;
        ++field3713;
        class83.field1928 = null;
        class91.field2103 = null;
        class83.field1934 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII[B)Loa;")
    public static final class98 method1204(byte arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = 10 % ((47 - arg0) / 50);
        ++field3704;
        class98 var5 = new class98();
        var5.field2255 = new byte[arg1];
        var5.field2277 = 0;
        for (int var6 = arg2; arg2 - -arg1 > var6; ++var6) {
            if (~arg3[var6] != -1) {
                var5.field2255[var5.field2277++] = arg3[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)Lt;")
    public final class128 method273(byte arg0) {
        ++field3726;
        if (this.field3709 == null) {
            return null;
        } else {
            class33 var2 = super.field3612 != -1 && super.field3605 == 0 ? class48.method413(-94, super.field3612) : null;
            class33 var3 = super.field3655 == -1 || super.field3655 == super.field3626 && var2 != null ? null : class48.method413(-77, super.field3655);
            class128 var4 = this.field3709.method1109(super.field3641, (byte) 38, var3, super.field3631, var2);
            if (arg0 <= 104) {
                field3705 = null;
            }
            if (var4 == null) {
                return null;
            } else {
                var4.method1021();
                super.field3650 = var4.field2153;
                if (super.field3669 != -1 && super.field3627 != -1) {
                    class128 var5 = class51.method425(super.field3669, 4).method182((byte) 110, super.field3627);
                    if (var5 != null) {
                        var5.method1006(0, -super.field3645, 0);
                        class128[] var6 = new class128[] { var4, var5 };
                        var4 = new class128(var6, 2);
                    }
                }
                if (~this.field3709.field3333 == -2) {
                    var4.field2880 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
    public static final void method1205(boolean arg0) {
        ++field3714;
        if (!arg0) {
            if (class105.field2402 == 2) {
                class130.method1056(class129.field2944 * 2, (-class71.field1479 + class82.field1868 << 7) + class96.field2187, (-class21.field470 + class90.field2061 << 7) + class76.field1661, (byte) 90);
                if (class114.field2579 > -1 && ~(class119.field2680 % 20) > -11) {
                    class123.field2733[0].method495(class114.field2579 - 12, class57.field1264 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(B)V")
    public static final void method1206(byte arg0) {
        ++field3721;
        if (arg0 != 21) {
            field3707 = null;
        }
        class53.field1182.method734(-224779128);
    }

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "(B)V")
    public static void method1207(byte arg0) {
        field3712 = null;
        field3711 = null;
        field3716 = null;
        field3707 = null;
        if (arg0 <= 109) {
            field3702 = null;
        }
        field3723 = null;
        field3702 = null;
        field3718 = null;
        field3705 = null;
        field3724 = null;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)V")
    public static final void method1208(boolean arg0) {
        ++field3710;
        if (!arg0) {
            method1203(94);
        }
        class84.field1943 = new class63();
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(Z)V")
    public static final void method1209(boolean arg0) {
        try {
            if (class35.field864 == null) {
                class35.field864 = new class76(class10.field203, class102.method840(new class98[] { class132.field3228, class145.field3521, class119.field2671 }, 10).method808((byte) 116));
            } else {
                byte[] var1 = class35.field864.method622(-121);
                if (var1 != null) {
                    class8 var2 = new class8(var1);
                    class147.field3588 = var2.method68(-2);
                    class19.field427 = new class140[class147.field3588];
                    for (int var3 = 0; ~var3 > ~class147.field3588; ++var3) {
                        class140 var4 = class19.field427[var3] = new class140();
                        int var5 = var2.method68(-2);
                        var4.field3417 = 32767 & var5;
                        var4.field3414 = ~(var5 & 32768) != -1;
                        var4.field3411 = var2.method93(15);
                        var4.field3421 = var2.method107(true);
                        var4.field3410 = var3;
                        var4.field3412 = class16.method156(-115, var4.field3411);
                    }
                    class37.method345(-88, class102.field2350, class101.field2336, 0, class19.field427.length + -1, class19.field427);
                    class33.field815 = true;
                    class35.field864 = null;
                }
            }
        } catch (Exception var6) {
            class35.field864 = null;
        }
        if (!arg0) {
            field3702 = null;
        }
        ++field3720;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ltb;Ltb;I)V")
    public static final void method1210(class130 arg0, class130 arg1, int arg2) {
        if (arg2 < 3) {
            method1207((byte) 22);
        }
        class139.field3398 = arg1;
        class26.field639 = arg0;
        ++field3715;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)Z")
    public final boolean method450(int arg0) {
        ++field3703;
        if (arg0 != -2289) {
            return true;
        } else {
            return this.field3709 != null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)I")
    public static int method1211(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)V")
    public static final void method1212(int arg0) {
        ++field3700;
        if (class94.field2151 && class17.field346 != class114.field2572) {
            class126.method993(class96.field2199, class114.field2572, 122, class138.field3379, class73.field1536.field3603[0], class73.field1536.field3648[0]);
        } else {
            if (~class114.field2572 != ~class113.field2560) {
                class113.field2560 = class114.field2572;
                class117.method931(class114.field2572, (byte) 107);
            }
            if (arg0 != -31732) {
                method1204((byte) 26, -29, 111, (byte[]) null);
            }
        }
    }
}
