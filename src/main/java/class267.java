import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class267 extends class154 {

    @OriginalMember(owner = "client!gi", name = "gb", descriptor = "I")
    private int field4676 = 204;

    @OriginalMember(owner = "client!gi", name = "eb", descriptor = "I")
    private int field4674 = 1;

    @OriginalMember(owner = "client!gi", name = "fb", descriptor = "I")
    private int field4675 = 1;

    @OriginalMember(owner = "client!gi", name = "nb", descriptor = "Leg;")
    private static class37 field4683 = class174.method1167("M", 124);

    @OriginalMember(owner = "client!gi", name = "mb", descriptor = "Leg;")
    public static class37 field4682 = field4683;

    @OriginalMember(owner = "client!gi", name = "ob", descriptor = "Leg;")
    public static class37 field4684 = field4683;

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "Lid;")
    public static class226 field4672 = new class226();

    @OriginalMember(owner = "client!gi", name = "qb", descriptor = "Leg;")
    public static class37 field4686 = class174.method1167("showVideoAd", 120);

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!gi", name = "hb", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!gi", name = "ib", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!gi", name = "jb", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!gi", name = "kb", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!gi", name = "lb", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!gi", name = "pb", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "Lhd;")
    public static class288 field4671;

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "[B")
    public static byte[] field4673;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field4668;
        if (arg1 != 1075962732) {
            field4686 = null;
        }
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            for (int var4 = 0; ~var4 > ~class227.field3898; ++var4) {
                int var5 = class239.field4263[var4];
                int var6 = class62.field1029[arg0];
                int var7 = this.field4674 * var5 >> 12;
                int var8 = this.field4675 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4674) * this.field4674;
                int var10 = var6 % (4096 / this.field4675) * this.field4675;
                if (~var10 > ~this.field4676) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field4676 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field4676 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 != -14015) {
            method1793(-16, 93);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field4676 = arg0.method1244(false);
                }
            } else {
                this.field4675 = arg0.method1268(255);
            }
        } else {
            this.field4674 = arg0.method1268(255);
        }
        ++field4667;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Leg;ILeg;I)V")
    public static final void method1789(class37 arg0, int arg1, class37 arg2, int arg3) {
        class179.field2991 = arg0;
        ++field4685;
        class7.field121 = arg3;
        class179.field2990 = arg2;
        if (!class179.field2990.method223(class179.field2989, (byte) 63) && !class179.field2991.method223(class179.field2989, (byte) 63)) {
            if (class74.field1164 != -1) {
                class24.method147(false);
            } else {
                class217.field3736 = 0;
                class113.field1918 = 1;
                class168.field2808 = -3;
                class99.field1543 = 0;
                class187 var4 = new class187(128);
                var4.method1292(10, (byte) -64);
                var4.method1294((int) (Math.random() * 99999.0D), -26655);
                var4.method1294(arg1, -26655);
                var4.method1256(class179.field2990.method217((byte) -102), (byte) 84);
                var4.method1272(arg1 ^ 28379, (int) (9.9999999E7D * Math.random()));
                var4.method1289(class179.field2991, arg1 + -604);
                var4.method1272(27862, (int) (Math.random() * 9.9999999E7D));
                var4.method1247(class238.field4230, class173.field2906, 917525152);
                class273.field4778.field3169 = 0;
                class273.field4778.method1292(69, (byte) -64);
                class273.field4778.method1292(var4.field3169, (byte) -64);
                class273.field4778.method1259(var4.field3175, -117, 0, var4.field3169);
            }
        } else {
            class168.field2808 = 3;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjl;)V")
    public static final void method1790(int arg0, class101 arg1) {
        ++field4669;
        class169.field2824 = arg1.method652(class274.field4817, arg0 + 127);
        class226.field3876 = arg1.method652(class196.field3336, 109);
        class1.field1 = arg1.method652(class264.field4645, 122);
        class132.field2217 = arg1.method652(class115.field1956, 121);
        class275.field4859 = arg1.method652(class35.field507, 123);
        class67.field1062 = arg1.method652(class46.field725, 120);
        class124.field2084 = arg1.method652(class108.field1696, arg0 ^ -122);
        class282.field4985 = arg1.method652(class203.field3469, 122);
        class291.field5127 = arg1.method652(class139.field2376, 112);
        class126.field2122 = arg1.method652(class158.field2629, 125);
        class260.field4606 = arg1.method652(class288.field5073, 112);
        if (arg0 != -1) {
            field4684 = null;
        }
        class84.field1323 = arg1.method652(class130.field2160, 122);
        class129.field2146 = arg1.method652(class60.field989, 113);
        class284.field5016 = arg1.method652(class9.field145, 109);
        class232.field4002 = arg1.method652(class231.field3954, 117);
        field4670 = arg1.method652(class7.field127, arg0 ^ -113);
        class22.field288 = arg1.method652(class189.field3253, 118);
        class29.field428 = arg1.method652(class89.field1426, 122);
        class94.field1480 = arg1.method652(class84.field1317, 105);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([IIIJ)Leg;")
    public static final class37 method1791(int[] arg0, int arg1, int arg2, long arg3) {
        ++field4680;
        if (class281.field4958 != null) {
            class37 var5 = class281.field4958.method813(arg3, -12, arg2, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg1 != -19247) {
            field4671 = null;
        }
        return arg2 == 5 ? class35.method201(arg3, 2).method227(-98) : client.method799(arg3, true);
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V")
    public static void method1792(byte arg0) {
        field4682 = null;
        if (arg0 != -71) {
            field4682 = null;
        }
        field4672 = null;
        field4671 = null;
        field4684 = null;
        field4673 = null;
        field4686 = null;
        field4683 = null;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(II)V")
    public static final void method1793(int arg0, int arg1) {
        int var2 = 14 % ((arg0 - 64) / 37);
        ++field4678;
        if (~arg1 <= -1 && class201.field3422.length > arg1) {
            class201.field3422[arg1] = !class201.field3422[arg1];
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V")
    public static final void method1794(byte arg0) {
        class109.field1772 = 0;
        class85.field1345 = -1;
        class152.field2556 = false;
        class182.field3044 = 0;
        class215.field3718 = -1;
        int var1 = 15 / ((14 - arg0) / 44);
        class96.field1501 = 0;
        class288.field5090 = -1;
        class273.field4778.field3169 = 0;
        class73.field1159 = 0;
        class151.field2536 = -1;
        ++field4681;
        class159.field2661 = 0;
        class288.field5082 = 0;
        class213.field3680.field3169 = 0;
        for (int var2 = 0; class98.field1526.length > var2; ++var2) {
            if (class98.field1526[var2] != null) {
                class98.field1526[var2].field1824 = -1;
            }
        }
        for (int var3 = 0; ~class55.field833.length < ~var3; ++var3) {
            if (class55.field833[var3] != null) {
                class55.field833[var3].field1824 = -1;
            }
        }
        class147.method1017(true);
        class273.field4794 = 1;
        class102.method683(30, false);
        for (int var4 = 0; var4 < 100; ++var4) {
            class154.field2597[var4] = true;
        }
        class231.method1594(119);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class267() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZ)I")
    public static final int method1795(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return 1;
        } else {
            if (~arg1 > ~arg0) {
                int var3 = arg1;
                arg1 = arg0;
                arg0 = var3;
            }
            ++field4679;
            while (~arg0 != -1) {
                int var4 = arg1 % arg0;
                arg1 = arg0;
                arg0 = var4;
            }
            return arg1;
        }
    }
}
