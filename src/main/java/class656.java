import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class656 extends class60 {

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "Lut;")
    public static class136 field9034 = new class136();

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "Lgha;")
    public static class366 field9043 = new class366();

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "Lqda;")
    public static class113 field9046 = new class113(16);

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "Lfj;")
    public static class684 field9047 = new class684(13, 8);

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "Loh;")
    public static class425 field9048 = new class425("", 11);

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "F")
    public static float field9042;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILha;Lkq;II)V", line = 4)
    public static final void method3702(int arg0, class66 arg1, class620 arg2, int arg3, int arg4) {
        ++field9039;
        byte var5 = 63;
        byte var6 = 7;
        for (int var7 = 63; var7 >= 0; --var7) {
            class322.method1922(false, (byte) 100, true);
            int var8 = 127 & var5 | (var7 & 63) << 10 | var6 << 7 & 896;
            int var9 = class437.field5749[var8];
            class738.method4150(true, false, 0);
            arg1.method645(arg0, arg4 - -((63 - var7) * arg2.field8416 >> 6), arg2.field8506, (arg2.field8416 >> 6) + 1, var9, 0);
        }
        if (arg3 <= 101) {
            method3703((byte) -7);
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V", line = 33)
    public final void method409(byte arg0) {
        if (super.field798.method4292(-4152) == class359.field4463) {
            if (super.field798.method4287((byte) 97)) {
                super.field799 = 0;
            }
        } else {
            super.field799 = 1;
        }
        ++field9035;
        if (super.field799 != 0 && super.field799 != 1) {
            super.field799 = this.method405(false);
        }
        if (arg0 > -27) {
            this.method407((byte) 12, -85);
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)V", line = 54)
    public static void method3703(byte arg0) {
        field9034 = null;
        if (arg0 < 85) {
            method3705((byte) -80, false);
        }
        field9048 = null;
        field9043 = null;
        field9046 = null;
        field9047 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILbt;)V", line = 69)
    public static final void method3704(int arg0, class48 arg1) {
        class444.field5953 = arg1;
        ++field9033;
        if (arg0 != 8) {
            field9047 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZ)V", line = 80)
    public static final void method3705(byte arg0, boolean arg1) {
        if (arg1) {
            if (~class131.field1615 != 0) {
                class553.method3245(class131.field1615, 91);
            }
            for (class52 var2 = (class52) class728.field10205.method2119(-79); var2 != null; var2 = (class52) class728.field10205.method2111((byte) -120)) {
                if (!var2.method2221(8763)) {
                    var2 = (class52) class728.field10205.method2119(-116);
                    if (var2 == null) {
                        break;
                    }
                }
                class336.method1989(true, false, var2, (byte) 104);
            }
            class131.field1615 = -1;
            class728.field10205 = new class362(8);
            class99.method844(-18143);
            class131.field1615 = class72.field994;
            class413.method2462(false, 19674);
            class41.method341(-31);
            class142.method1043(class131.field1615);
        }
        ++field9040;
        class697.method3880(0);
        class727.field10182 = false;
        class341.method2027((byte) 114);
        class680.field9309 = -1;
        class612.method3467(class481.field6720, (byte) 24);
        class300.field3596 = new class521();
        class300.field3596.field3453[0] = class596.field8090 / 2;
        class300.field3596.field823 = class596.field8090 * 512 / 2;
        class300.field3596.field813 = class107.field1350 * 512 / 2;
        class350.field4366 = 0;
        class599.field8107 = 0;
        class300.field3596.field3455[0] = class107.field1350 / 2;
        if (class7.field100 != 2) {
            class33.method311((byte) 65);
        } else {
            class350.field4366 = class486.field6791 << 9;
            class599.field8107 = class308.field3822 << 9;
        }
        class185.method1233(-24497);
        if (arg0 >= -21) {
            field9043 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)Z", line = 143)
    public final boolean method3706(byte arg0) {
        ++field9036;
        if (super.field798.method4287((byte) 124)) {
            return false;
        } else {
            if (arg0 >= -61) {
                field9043 = null;
            }
            return super.field798.method4292(-4152) == class359.field4463;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)V", line = 162)
    public final void method407(byte arg0, int arg1) {
        int var3 = 122 % ((28 - arg0) / 50);
        ++field9038;
        super.field799 = arg1;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)I", line = 173)
    public final int method3707(int arg0) {
        ++field9041;
        if (arg0 != 0) {
            field9046 = null;
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(ILhd;)V", line = 188)
    public class656(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)I", line = 195)
    public final int method406(int arg0, int arg1) {
        ++field9037;
        if (super.field798.method4287((byte) 104)) {
            return 3;
        } else if (super.field798.method4292(-4152) == class359.field4463) {
            return 1;
        } else {
            if (arg0 != 0) {
                field9045 = 104;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lhd;)V", line = 214)
    public class656(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)I", line = 225)
    public final int method405(boolean arg0) {
        ++field9044;
        return arg0 ? 13 : 1;
    }
}
