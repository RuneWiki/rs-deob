import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class124 {

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Z")
    public boolean field2881 = true;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public int field2880;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field2887 = 0;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
    public static int[] field2884 = new int[1000];

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "Lv;")
    private static class146 field2891 = class159.method1226((byte) -37, "Attack");

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Z")
    public static volatile boolean field2869 = true;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lv;")
    public static class146 field2873 = field2891;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lgf;")
    public static class48 field2868 = new class48(32);

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lie;")
    public static class61 field2879;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2870;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[Lie;")
    public static class61[] field2874;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BILje;I)V")
    public static final void method927(byte arg0, int arg1, class67 arg2, int arg3) {
        field2875++;
        if ((arg3 & 0x200) != 0) {
            arg2.field814 = class29.field597.method790((byte) 73);
            arg2.field779 = class29.field597.method790((byte) 73);
            arg2.field785 = class29.field597.method790((byte) 73);
            arg2.field767 = class29.field597.method787((byte) -111);
            arg2.field766 = class29.field597.method795(1) + class94.field2229;
            arg2.field803 = class29.field597.method784(false) + class94.field2229;
            arg2.field778 = class29.field597.method789(-32769);
            arg2.field773 = 0;
            arg2.field811 = 1;
        }
        if ((arg3 & 0x4) != 0) {
            int var4 = class29.field597.method784(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class29.field597.method790((byte) 73);
            class29.method200(var5, (byte) 103, arg2, var4);
        }
        int var6 = 47 % ((arg0 - 67) / 59);
        if ((arg3 & 0x80) != 0) {
            arg2.field762 = class29.field597.method772(-125);
            if (arg2.field762.method1089(113, 0) == 126) {
                arg2.field762 = arg2.field762.method1103(true, 1);
                class26.method174(2, arg2.field1506, (byte) -76, arg2.field762);
            } else if (class116.field2696 == arg2) {
                class26.method174(2, arg2.field1506, (byte) -76, arg2.field762);
            }
            arg2.field771 = 0;
            arg2.field741 = 150;
            arg2.field794 = 0;
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field774 = class29.field597.method754((byte) -49);
            if (arg2.field774 == 65535) {
                arg2.field774 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field786 = class29.field597.method795(1);
            arg2.field792 = class29.field597.method784(false);
        }
        if ((arg3 & 0x40) != 0) {
            int var7 = class29.field597.method789(-32769);
            int var8 = class29.field597.method790((byte) 73);
            arg2.method237(2365, class94.field2229, var8, var7);
            arg2.field740 = class94.field2229 + 300;
            arg2.field744 = class29.field597.method790((byte) 73);
            arg2.field783 = class29.field597.method789(-32769);
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field817 = class29.field597.method780(7335);
            int var9 = class29.field597.method745(-14545);
            if (arg2.field817 == 65535) {
                arg2.field817 = -1;
            }
            arg2.field770 = var9 >> 16;
            arg2.field759 = 0;
            arg2.field764 = (var9 & 0xFFFF) + class94.field2229;
            arg2.field804 = 0;
            if (arg2.field764 > class94.field2229) {
                arg2.field804 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            int var10 = class29.field597.method790((byte) 73);
            int var11 = class29.field597.method789(-32769);
            arg2.method237(2365, class94.field2229, var11, var10);
            arg2.field740 = class94.field2229 + 300;
            arg2.field744 = class29.field597.method790((byte) 73);
            arg2.field783 = class29.field597.method789(-32769);
        }
        if ((arg3 & 0x10) != 0) {
            int var12 = class29.field597.method789(-32769);
            byte[] var13 = new byte[var12];
            class95 var14 = new class95(var13);
            class29.field597.method778(var12, 0, (byte) 15, var13);
            class88.field2088[arg1] = var14;
            arg2.method477(var14, -87);
        }
        if ((arg3 & 0x20) == 0) {
            return;
        }
        int var15 = class29.field597.method795(1);
        int var16 = class29.field597.method790((byte) 73);
        int var17 = class29.field597.method787((byte) -11);
        int var18 = class29.field597.field2304;
        if (arg2.field1506 != null && arg2.field1537 != null) {
            boolean var19 = false;
            long var20 = arg2.field1506.method1101(-88);
            if (var16 <= 1) {
                for (int var22 = 0; var22 < class54.field1233; var22++) {
                    if (class37.field838[var22] == var20) {
                        var19 = true;
                        break;
                    }
                }
            }
            if (!var19 && class38.field860 == 0) {
                class132.field3021.field2304 = 0;
                class29.field597.method778(var17, 0, (byte) 15, class132.field3021.field2320);
                class132.field3021.field2304 = 0;
                class146 var23 = class99.method821(method929(class132.field3021, 32767).method1100(-46));
                arg2.field762 = var23.method1112((byte) -114);
                arg2.field794 = var15 & 0xFF;
                arg2.field741 = 150;
                arg2.field771 = var15 >> 8;
                if (var16 == 2 || var16 == 3) {
                    class26.method174(1, class71.method509(new class146[] { class134.field3059, arg2.field1506 }, (byte) 63), (byte) -76, var23);
                } else if (var16 == 1) {
                    class26.method174(1, class71.method509(new class146[] { class77.field1840, arg2.field1506 }, (byte) 95), (byte) -76, var23);
                } else {
                    class26.method174(2, arg2.field1506, (byte) -76, var23);
                }
            }
        }
        class29.field597.field2304 = var18 + var17;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lk;")
    public static final class69 method928(int arg0, int arg1) {
        field2888++;
        class69 var2 = (class69) class142.field3239.method1045((long) arg1, arg0 - 122);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class153.field3518.method585(6, 92, arg1);
        class69 var4 = new class69();
        var4.field1624 = arg1;
        if (var3 != null) {
            var4.method487(false, new class95(var3));
        }
        var4.method491(-22856);
        if (var4.field1587) {
            var4.field1580 = false;
            var4.field1589 = 0;
        }
        class142.field3239.method1047(arg0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lne;I)Lv;")
    public static final class146 method929(class95 arg0, int arg1) {
        if (arg1 != 32767) {
            field2879 = null;
        }
        field2876++;
        return class69.method496(32767, arg0, 25);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)Z")
    public static final boolean method930(int arg0, int arg1, byte arg2) {
        field2886++;
        if (arg2 != 126) {
            method928(17, -29);
        }
        return (arg1 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2881 = arg6;
        this.field2872 = arg2;
        this.field2880 = arg4;
        this.field2877 = arg0;
        this.field2890 = arg5;
        this.field2883 = arg3;
        this.field2889 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILla;I)Lue;")
    public static final class144 method931(int arg0, class77 arg1, int arg2) {
        if (arg0 == -963) {
            field2871++;
            return class81.method618(-26658, arg2, arg1) ? class26.method169(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lv;B)V")
    public static final void method932(class146 arg0, byte arg1) {
        field2878++;
        if (class154.field3529 >= 2) {
            if (arg0.method1111(class44.field1011, -41)) {
                System.gc();
            }
            if (arg0.method1111(class101.field2457, -41)) {
                class111.method873((byte) 54);
            }
            if (arg0.method1111(class135.field3073, -41)) {
                class151.field3484 = true;
            }
            if (arg0.method1111(class107.field2557, -41)) {
                class151.field3484 = false;
            }
            if (arg0.method1111(class51.field1154, -41)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class64.field1437[var2].field2185[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method1111(class18.field290, -41) && class26.field532 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1098(class66.field1485, true)) {
                class17.field264 = arg0.method1103(true, 12).method1112((byte) -106).method1113(10);
                class26.method174(0, null, (byte) -76, class71.method509(new class146[] { class159.field3660, class75.method564(false, class17.field264) }, (byte) 113));
            }
            if (arg0.method1111(class101.field2460, -41)) {
                class119.field2767 = true;
            }
        }
        class147.field3391++;
        class82.field1990.method265((byte) -85, 159);
        class82.field1990.method791(false, arg0.method1080(-1) - 1);
        if (arg1 >= 5) {
            class82.field1990.method762(arg0.method1103(true, 2), (byte) 112);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method933(int arg0) {
        field2873 = null;
        field2879 = null;
        field2884 = null;
        field2868 = null;
        field2891 = null;
        field2870 = null;
        if (arg0 == 0) {
            field2874 = null;
        }
    }
}
