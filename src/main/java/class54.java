import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class54 extends class331 {

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field786 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)I", line = 5)
    public final int method436(byte arg0) {
        if (arg0 > -119) {
            return 90;
        } else {
            ++field781;
            return super.field4202;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "([[S[[FI)[[S", line = 16)
    public static final short[][] method437(short[][] arg0, float[][] arg1, int arg2) {
        int var3 = 0;
        int var4 = 51 / ((-76 - arg2) / 35);
        while (arg1.length > var3) {
            for (int var5 = 0; ~var5 > ~arg0[var3].length; ++var5) {
                arg0[var3][var5] = (short) ((int) (arg1[var3][var5] * 16383.0F));
            }
            ++var3;
        }
        ++field790;
        return arg0;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 50)
    public final void method224(int arg0) {
        ++field788;
        if (super.field4203.field633.method4193((byte) 95) && !class441.method2601(arg0 + 1963, super.field4203.field633.method4191((byte) -123))) {
            super.field4202 = 0;
        }
        if (arg0 != -1959) {
            field784 = -7;
        }
        if (~super.field4202 > -1 || ~super.field4202 < -2) {
            super.field4202 = this.method226((byte) 13);
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(II)V", line = 67)
    public final void method227(int arg0, int arg1) {
        if (arg0 <= 113) {
            this.method222(74, -10);
        }
        ++field780;
        super.field4202 = arg1;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V", line = 78)
    public static void method438(int arg0) {
        if (arg0 == -2) {
            field786 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)Z", line = 90)
    public final boolean method439(byte arg0) {
        if (arg0 < 103) {
            this.method222(-120, -40);
        }
        ++field789;
        return class441.method2601(4, super.field4203.field633.method4191((byte) -128));
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)I", line = 105)
    public final int method222(int arg0, int arg1) {
        ++field782;
        if (!class441.method2601(4, super.field4203.field633.method4191((byte) -125))) {
            return 3;
        } else {
            if (arg1 != 1) {
                this.method227(-36, -108);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)V", line = 121)
    public static final void method440(boolean arg0) {
        class114 var1 = class124.field1474;
        synchronized (class124.field1474) {
            class124.field1474.method781((byte) 47);
            if (arg0) {
                field784 = 32;
            }
        }
        ++field785;
        class114 var2 = class626.field8729;
        synchronized (class626.field8729) {
            class626.field8729.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "(B)V", line = 137)
    public static final void method441(byte arg0) {
        class279.method1671((byte) -43);
        ++field787;
        class677.field9199 = 0;
        if (arg0 != 31) {
            field786 = null;
        }
        class455.field6380 = null;
        class730.field10219 = null;
        class24.field414.field2354 = 0;
        class508.field7186 = null;
        class199.field2550 = 0;
        class471.field6763 = 0;
        class68.field938 = null;
        class304.method1786((byte) -42);
        class348.method2040((byte) -125);
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class447.field6287[var1] = null;
        }
        class339.field4374 = null;
        for (int var2 = 0; var2 < class676.field9195; ++var2) {
            class124 var4 = class38.field559[var2].field3158;
            if (var4 != null) {
                var4.field407 = -1;
            }
        }
        class171.method1068(arg0 ^ -25120);
        class276.field3497 = 1;
        class335.field4311 = -1;
        class147.field1783 = -1;
        class614.method3369(10, (byte) -121);
        for (int var3 = 0; var3 < 100; ++var3) {
            class709.field9971[var3] = true;
        }
        class438.method2587((byte) 80);
        class761.field10597 = 0L;
        class130.field1565 = null;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)I", line = 195)
    public final int method226(byte arg0) {
        ++field783;
        if (arg0 != 13) {
            field784 = -47;
        }
        return 0;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lts;)V", line = 208)
    public class54(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(ILts;)V", line = 211)
    public class54(int arg0, class41 arg1) {
        super(arg0, arg1);
    }
}
