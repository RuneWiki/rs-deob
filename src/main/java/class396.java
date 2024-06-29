import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class396 extends class187 {

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "J")
    public static long field5473 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!mv", name = "v", descriptor = "Lcja;")
    public static class46 field5475 = new class46(512);

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!mv", name = "u", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V", line = 3)
    public static void method2392(int arg0) {
        field5475 = null;
        if (arg0 != 16) {
            field5475 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIB)Z", line = 13)
    public static final boolean method2393(int arg0, int arg1, byte arg2) {
        ++field5470;
        if (arg2 > -91) {
            return true;
        } else {
            return (arg1 & 384) != 0;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)Z", line = 25)
    public static final boolean method2394(int arg0, int arg1, int arg2) {
        int var3 = 62 % ((43 - arg2) / 54);
        ++field5467;
        return (arg0 & 50560) != 0;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IBLqk;)V", line = 35)
    public final void method167(int arg0, byte arg1, class18 arg2) {
        super.field2885.method939(arg2, arg1 ^ -8574);
        if (arg1 != -126) {
            method2393(122, 99, (byte) 77);
        }
        ++field5466;
        super.field2885.method999(true, arg0);
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lhk;)V", line = 49)
    public class396(class111 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lcn;Z[[[BIB)Z", line = 54)
    public static final boolean method2395(class543 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class637.field8792) {
            return false;
        } else {
            int var5 = arg0.field7396 >> class654.field9055;
            int var6 = var5;
            int var7 = arg0.field7398 >> class654.field9055;
            int var8 = var7;
            if (arg0 instanceof class597) {
                var6 = ((class597) arg0).field8372;
                var8 = ((class597) arg0).field8365;
                var5 = ((class597) arg0).field8368;
                var7 = ((class597) arg0).field8369;
            }
            for (int var9 = var5; var9 <= var6; ++var9) {
                for (int var10 = var7; var10 <= var8; ++var10) {
                    if (arg0.field7404 < class62.field856 && var9 >= class116.field2126 && var9 < class427.field5830 && var10 >= class779.field10731 && var10 < class374.field5072) {
                        if ((arg2 == null || arg0.field7391 < arg3 || arg2[arg0.field7391][var9][var10] != arg4) && arg0.method2263(-2) && !arg0.method2261(79, class112.field2107)) {
                            return false;
                        }
                        if (!arg1 && var9 >= class434.field5912 - 16 && var9 <= class434.field5912 + 16 && var10 >= class111.field1920 - 16 && var10 <= class111.field1920 + 16) {
                            if (class120.field2186) {
                                class102.field1651[class116.field2119++].method3661(11, arg0);
                                class116.field2119 %= class360.field4913;
                            } else {
                                arg0.method901((byte) 123, class112.field2107);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZI)V", line = 118)
    public final void method170(int arg0, boolean arg1, int arg2) {
        ++field5469;
        if (!arg1) {
            this.method168(true, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZ)V", line = 130)
    public final void method172(int arg0, boolean arg1) {
        if (arg0 >= 56) {
            ++field5465;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Z", line = 140)
    public final boolean method171(int arg0) {
        if (arg0 != 20220) {
            method2392(-65);
        }
        ++field5474;
        return true;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZB)V", line = 152)
    public final void method168(boolean arg0, byte arg1) {
        int var3 = 48 % ((arg1 - 36) / 48);
        ++field5472;
        super.field2885.method930((byte) -128, true);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V", line = 162)
    public final void method169(boolean arg0) {
        ++field5468;
        if (!arg0) {
            field5473 = 94L;
        }
        super.field2885.method930((byte) -108, false);
    }
}
