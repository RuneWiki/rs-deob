import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class338 extends class6 implements class302 {

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    private int field5091;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBLsf;II)V", line = 3)
    public static final void method2122(int arg0, byte arg1, class366 arg2, int arg3, int arg4) {
        ++field5095;
        int var5 = arg2.field7866[0];
        int var6 = arg2.field7870[0];
        if (var5 >= 0 && var5 < class339.field5099 && var6 >= 0 && ~var6 > ~class484.field7129) {
            if (~arg4 <= -1 && ~arg4 > ~class339.field5099 && ~arg3 <= -1 && arg3 < class484.field7129) {
                int var7 = class3.method22(var6, 0, class67.field1367[arg2.field6084], -4, 0, (byte) 60, var5, 0, true, arg4, arg3, 0, class372.field5445, arg2.method2241(-49), class210.field3354);
                if (var7 >= 1) {
                    if (arg0 >= 95) {
                        if (var7 <= 3) {
                            for (int var8 = 0; var7 - 1 > var8; ++var8) {
                                arg2.method2240(-9900, class210.field3354[var8], class372.field5445[var8], arg1);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([BIII)V", line = 42)
    public final void method1902(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -24568) {
            method2124(-24, (class189) null, (class189) null);
        }
        ++field5089;
        this.method42(arg0, arg1);
        this.field5091 = arg3;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)J", line = 54)
    public final long method1904(int arg0) {
        if (arg0 != 8976) {
            field5086 = -23;
        }
        ++field5087;
        return super.field99.method2641();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)I", line = 67)
    public final int method1906(boolean arg0) {
        if (!arg0) {
            return -17;
        } else {
            ++field5090;
            return this.field5091;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I", line = 82)
    public final int method1905(int arg0) {
        if (arg0 >= -126) {
            this.field5091 = -97;
        }
        ++field5088;
        return 0;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lda;I[BI)V", line = 93)
    public class338(class44 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5091 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lwi;B)V", line = 101)
    public static final void method2123(class328 arg0, byte arg1) {
        ++field5094;
        if (!class76.field1543) {
            arg0.method1676(true);
            --class332.field5041;
            if (arg1 <= 97) {
                method2124(106, (class189) null, (class189) null);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILol;Lol;)V", line = 119)
    public static final void method2124(int arg0, class189 arg1, class189 arg2) {
        if (arg1.field3035 != null) {
            arg1.method1289((byte) -58);
        }
        ++field5093;
        arg1.field3035 = arg2;
        arg1.field3032 = arg2.field3032;
        if (arg0 <= 119) {
            field5086 = 98;
        }
        arg1.field3035.field3032 = arg1;
        arg1.field3032.field3035 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)I", line = 137)
    public static final int method2125(int arg0, int arg1, byte arg2, int arg3) {
        ++field5092;
        int var4 = arg0 & 3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return -arg1 + 1023;
        } else if (var4 == 2) {
            return -arg3 + 1023;
        } else {
            int var5 = 9 % ((-70 - arg2) / 43);
            return arg1;
        }
    }
}
