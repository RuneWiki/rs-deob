import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class504 extends class134 {

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lea;")
    public static class547 field6845 = new class547(16, -2);

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILji;)Ltu;", line = 4)
    public static final class352 method2809(int arg0, class611 arg1) {
        ++field6843;
        class203 var2 = class125.method804(-1, arg1);
        if (arg0 > -14) {
            return null;
        } else {
            int var3 = arg1.method3418(-2);
            int var4 = arg1.method3418(-2);
            int var5 = arg1.method3402((byte) 127);
            return new class352(var2.field2408, var2.field2412, var2.field2403, var2.field2406, var2.field2415, var2.field2402, var2.field2407, var2.field2405, var2.field2414, var3, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 24)
    public final void method60(byte arg0) {
        ++field6846;
        if (super.field1708 < 1 || ~super.field1708 < -4) {
            super.field1708 = this.method58(0);
        }
        if (arg0 < 118) {
            field6851 = -41;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I", line = 37)
    public final int method58(int arg0) {
        ++field6844;
        if (arg0 != 0) {
            field6845 = null;
        }
        return !super.field1712.method2280(-120).method3187(true) ? 2 : 3;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)I", line = 48)
    public final int method57(int arg0, int arg1) {
        ++field6849;
        if (arg1 != 29053) {
            field6851 = -17;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIII)I", line = 60)
    public static final int method2810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6847;
        if (class25.field188 == null) {
            return 0;
        } else {
            if (arg2 < 59) {
                field6845 = null;
            }
            if (arg3 < 3) {
                int var6 = arg4 >> 9;
                int var7 = arg0 >> 9;
                if (~arg5 > -1 || ~arg1 > -1 || arg5 > class272.field3589 + -1 || ~(class3.field26 + -1) > ~arg1) {
                    return 0;
                }
                if (~var6 > -2 || var7 < 1 || var6 > class272.field3589 - 1 || ~(class3.field26 + -1) > ~var7) {
                    return 0;
                }
                boolean var8 = (2 & class114.field1506[1][arg4 >> 9][arg0 >> 9]) != 0;
                if (~(arg4 & 511) == -1) {
                    boolean var9 = (class114.field1506[1][var6 + -1][arg0 >> 9] & 2) != 0;
                    boolean var10 = ~(class114.field1506[1][var6][arg0 >> 9] & 2) != -1;
                    if (!var10 == var9) {
                        var8 = ~(2 & class114.field1506[1][arg5][arg1]) != -1;
                    }
                }
                if (~(511 & arg0) == -1) {
                    boolean var11 = (class114.field1506[1][arg4 >> 9][var7 - 1] & 2) != 0;
                    boolean var12 = (2 & class114.field1506[1][arg4 >> 9][var7]) != 0;
                    if (!var11 != !var12) {
                        var8 = (2 & class114.field1506[1][arg5][arg1]) != 0;
                    }
                }
                if (var8) {
                    ++arg3;
                }
            }
            return class25.field188[arg3].method1683(arg4, arg0, true);
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V", line = 117)
    public static void method2811(int arg0) {
        if (arg0 != 2) {
            field6851 = 3;
        }
        field6845 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V", line = 128)
    public final void method55(int arg0, int arg1) {
        int var3 = 13 / ((arg0 - -26) / 41);
        super.field1708 = arg1;
        ++field6850;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(ILkda;)V", line = 141)
    public class504(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lkda;)V", line = 146)
    public class504(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)I", line = 158)
    public final int method2812(byte arg0) {
        if (arg0 <= 119) {
            return -75;
        } else {
            ++field6842;
            return super.field1708;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lru;", line = 169)
    public static final class194 method2813(Throwable arg0, String arg1) {
        ++field6848;
        class194 var2;
        if (!(arg0 instanceof class194)) {
            var2 = new class194(arg0, arg1);
        } else {
            var2 = (class194) arg0;
            var2.field2322 = var2.field2322 + ' ' + arg1;
        }
        return var2;
    }
}
