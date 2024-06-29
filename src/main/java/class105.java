import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class105 extends class208 {

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    private int field1725;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    private int field1717;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    private int field1721;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    private int field1720;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "[I")
    public static int[] field1723 = new int[13];

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Lcb;")
    public static class58 field1727 = new class58();

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Z")
    public static final boolean method813(boolean arg0) {
        for (int var1 = class269.field3628; var1 < class265.field3571; ++var1) {
            class532[][] var2 = class103.field1632[var1];
            for (int var3 = -class282.field3832; var3 <= 0; ++var3) {
                int var4 = class39.field578 + var3;
                int var5 = class39.field578 - var3;
                if (var4 >= class164.field2525 || var5 < class245.field3356) {
                    for (int var6 = -class282.field3832; var6 <= 0; ++var6) {
                        int var7 = class119.field1859 + var6;
                        int var8 = class119.field1859 - var6;
                        if (var4 >= class164.field2525) {
                            if (var7 >= class125.field1932) {
                                class532 var9 = var2[var4][var7];
                                if (var9 != null && var9.field7827) {
                                    class157.field2396 = arg0;
                                    class295.field3992.method40(-26704, var9);
                                    class295.field3992.method42(0);
                                }
                            }
                            if (var8 < class215.field3054) {
                                class532 var10 = var2[var4][var8];
                                if (var10 != null && var10.field7827) {
                                    class157.field2396 = arg0;
                                    class295.field3992.method40(-26704, var10);
                                    class295.field3992.method42(0);
                                }
                            }
                        }
                        if (var5 < class245.field3356) {
                            if (var7 >= class125.field1932) {
                                class532 var11 = var2[var5][var7];
                                if (var11 != null && var11.field7827) {
                                    class157.field2396 = arg0;
                                    class295.field3992.method40(-26704, var11);
                                    class295.field3992.method42(0);
                                }
                            }
                            if (var8 < class215.field3054) {
                                class532 var12 = var2[var5][var8];
                                if (var12 != null && var12.field7827) {
                                    class157.field2396 = arg0;
                                    class295.field3992.method40(-26704, var12);
                                    class295.field3992.method42(0);
                                }
                            }
                        }
                        if (class222.field3136 == 0) {
                            if (class79.field1118) {
                                class295.field3992.method39((byte) 123, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZII)V")
    public final void method814(boolean arg0, int arg1, int arg2) {
        ++field1728;
        if (arg0) {
            method816(75);
        }
        int var4 = this.field1721 * arg2 >> 12;
        int var5 = this.field1720 * arg2 >> 12;
        int var6 = this.field1717 * arg1 >> 12;
        int var7 = this.field1725 * arg1 >> 12;
        class40.method282(var7, var6, var4, super.field2970, var5, super.field2972, super.field2971, (byte) -105);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
    public static final void method815(int arg0, byte arg1) {
        if (arg1 > 14) {
            class135.field2054 = 1000 / arg0;
            ++field1724;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static final void method816(int arg0) {
        class26.field365 = null;
        class35.field542 = null;
        if (arg0 == 25418) {
            class523.field7655 = false;
            class417.field6047 = null;
            class527.field7696 = null;
            class161.field2437 = null;
            ++field1716;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V")
    public static final void method817(byte arg0, int arg1) {
        class413.method2427((byte) -46);
        ++field1719;
        int var2 = class110.field1782.method1414(arg1, arg0 ^ 31921).field7087;
        if (arg0 == 123) {
            if (var2 != 0) {
                int var3 = class309.field4200.field7581[arg1];
                if (~var2 == -6) {
                    class419.field6074 = var3;
                }
                if (~var2 == -7) {
                    class26.field347 = var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
    public final void method818(int arg0, int arg1, int arg2) {
        ++field1722;
        if (arg2 == 32627) {
            int var4 = this.field1721 * arg0 >> 12;
            int var5 = this.field1720 * arg0 >> 12;
            int var6 = this.field1717 * arg1 >> 12;
            int var7 = this.field1725 * arg1 >> 12;
            class389.method2308(var7, var6, super.field2971, (byte) 123, var5, var4);
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIII)V")
    public class105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1725 = arg3;
        this.field1717 = arg1;
        this.field1721 = arg0;
        this.field1720 = arg2;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public static void method819(int arg0) {
        field1727 = null;
        if (arg0 == -2042259924) {
            field1723 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)V")
    public final void method820(int arg0, int arg1, int arg2) {
        ++field1726;
        if (arg2 != 31431) {
            method815(-119, (byte) -10);
        }
    }
}
