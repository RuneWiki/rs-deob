import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class221 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field3965 = 0;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "J")
    public static long field3971 = 0L;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lhj;")
    public static class69 field3976 = class181.method1318("slr2)3ws?order=LPWM", (byte) -111);

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lnc;")
    public static class83 field3977;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "[I")
    public static int[] field3975;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[Lhj;")
    public static class69[] field3964;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[[[Lrg;")
    public static class217[][][] field3970;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIILtk;)V")
    public static final void method1562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class50 arg7) {
        if (class99.field1873) {
            class10.field73 = 32;
        } else {
            class10.field73 = 0;
        }
        field3973++;
        class99.field1873 = false;
        if (arg0 != 16) {
            return;
        }
        if (class206.field3763 != 0) {
            if (arg1 >= arg5 && arg5 + 16 > arg1 && arg6 <= arg4 && arg4 < (arg6 + 16)) {
                arg7.field792 -= 4;
                class204.method1478(arg7, false);
            } else if (arg5 <= arg1 && arg1 < arg5 + 16 && (arg2 + arg6 - 16) <= arg4 && arg2 + arg6 > arg4) {
                arg7.field792 += 4;
                class204.method1478(arg7, false);
            } else if ((arg5 - class10.field73) <= arg1 && arg1 < (arg5 + class10.field73 + 16) && arg6 + 16 <= arg4 && arg2 + arg6 - 16 > arg4) {
                int var8 = (arg2 - 32) * arg2 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - (var8 / 2) - arg6 - 16;
                int var10 = arg2 - var8 - 32;
                arg7.field792 = (arg3 - arg2) * var9 / var10;
                class204.method1478(arg7, false);
                class99.field1873 = true;
            }
        }
        if (class179.field3260 == 0) {
            return;
        }
        int var11 = arg7.field798;
        if (arg5 - var11 <= arg1 && arg6 <= arg4 && (arg5 + 16) > arg1 && arg6 + arg2 >= arg4) {
            arg7.field792 += class179.field3260 * 45;
            class204.method1478(arg7, false);
            return;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static final void method1563(int arg0) {
        class168.field3092.method763(119);
        class39.field550.method1638(64);
        field3978++;
        if (arg0 <= -83) {
            class224.field4075.method1638(64);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILnc;)[Lej;")
    public static final class48[] method1564(int arg0, int arg1, int arg2, class83 arg3) {
        if (arg1 == 5) {
            field3980++;
            return class244.method1735(arg3, 0, arg0, arg2) ? class90.method638(arg1 ^ 0x5E) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLfh;)V")
    public final void method1565(byte arg0, class128 arg1) {
        field3972++;
        int var3 = 108 % ((-arg0 - 18) / 58);
        while (true) {
            int var4 = arg1.method937(false);
            if (var4 == 0) {
                return;
            }
            this.method1567(arg1, var4, (byte) 81);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ltk;B)Z")
    public static final boolean method1566(class50 arg0, byte arg1) {
        field3968++;
        if (arg0.field753 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 < 0) {
            field3976 = null;
        }
        while (arg0.field753.length > var2) {
            int var3 = class224.method1590(arg0, (byte) -87, var2);
            int var4 = arg0.field750[var2];
            if (arg0.field753[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field753[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field753[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lfh;IB)V")
    private final void method1567(class128 arg0, int arg1, byte arg2) {
        field3981++;
        if (arg1 == 5) {
            this.field3965 = arg0.method912(76);
        }
        if (arg2 != 81) {
            field3976 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static void method1568(int arg0) {
        if (arg0 != -28443) {
            field3970 = null;
        }
        field3977 = null;
        field3975 = null;
        field3976 = null;
        field3964 = null;
        field3970 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static final void method1569(byte arg0) {
        field3979++;
        if (arg0 == 125) {
            class98.field1826.method1713(arg0 ^ 0xFFFFFFF4);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V")
    public static final void method1570(int arg0, byte arg1) {
        class177.field3218--;
        field3967++;
        if (class177.field3218 == arg0) {
            return;
        }
        class1.method7(class26.field374, arg0 + 1, class26.field374, arg0, class177.field3218 - arg0);
        if (arg1 > -19) {
            return;
        }
        class1.method7(class216.field3917, arg0 + 1, class216.field3917, arg0, class177.field3218 - arg0);
        class1.method6(class208.field3782, arg0 + 1, class208.field3782, arg0, class177.field3218 - arg0);
        class1.method3(class113.field2177, arg0 + 1, class113.field2177, arg0, class177.field3218 - arg0);
        class1.method1(class38.field526, arg0 + 1, class38.field526, arg0, class177.field3218 - arg0);
        class1.method1(class66.field1277, arg0 + 1, class66.field1277, arg0, class177.field3218 - arg0);
    }
}
