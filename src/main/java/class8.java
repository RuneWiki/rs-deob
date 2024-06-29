import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class8 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public int field94 = 0;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field93 = "level: ";

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lph;")
    public static class203 field91;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method39(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg0 > 30) {
            field98++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static void method40(boolean arg0) {
        if (!arg0) {
            field93 = null;
            field91 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[B)Z")
    public static final boolean method41(int arg0, byte[] arg1) {
        field96++;
        class136 var2 = new class136(arg1);
        if (arg0 >= -28) {
            field91 = null;
        }
        int var3 = var2.method1012(4);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1012(4) == 1;
        if (var4) {
            class45.method386(0, var2);
        }
        class27.method241(255, var2);
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLig;)V")
    public final void method42(byte arg0, class136 arg1) {
        while (true) {
            int var3 = arg1.method1012(arg0 ^ 0xFFFFFFAA);
            if (var3 == 0) {
                if (arg0 != -82) {
                    this.method42((byte) 96, (class136) null);
                }
                field95++;
                return;
            }
            this.method46(var3, 7975, arg1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Lkj;")
    public static final class114 method43(int arg0, byte arg1) {
        int var2 = 29 % ((arg1 + 22) / 38);
        field101++;
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class128.field2119[var3] == null || class128.field2119[var3][var4] == null) {
            boolean var5 = class279.method1878(0, var3);
            if (!var5) {
                return null;
            }
        }
        return class128.field2119[var3][var4];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILsb;BI)Lwf;")
    public static final class17 method44(int arg0, class124 arg1, byte arg2, int arg3) {
        if (arg2 > -61) {
            field91 = null;
        }
        field102++;
        return class113.method833(arg3, arg1, arg0, 52) ? class233.method1544(127) : null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lsb;Lsb;Lsb;BLsb;)V")
    public static final void method45(class124 arg0, class124 arg1, class124 arg2, byte arg3, class124 arg4) {
        class71.field1183 = arg0;
        class253.field4031 = arg1;
        class108.field1648 = arg4;
        class240.field3792 = arg2;
        field97++;
        class128.field2119 = new class114[class71.field1183.method905(-1)][];
        if (arg3 >= -44) {
            method41(-48, (byte[]) null);
        }
        class285.field4548 = new boolean[class71.field1183.method905(-1)];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILig;)V")
    private final void method46(int arg0, int arg1, class136 arg2) {
        if (arg0 == 5) {
            this.field94 = arg2.method996(65280);
        }
        field92++;
        if (arg1 != 7975) {
            method43(72, (byte) -76);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)I")
    public static final int method47(boolean arg0) {
        field100++;
        if (class143.field2358 == null) {
            return -1;
        } else if (arg0) {
            return 50;
        } else {
            while (class143.field2358.field4048 > class9.field126) {
                if (class143.field2358.method1700(true, class9.field126)) {
                    return class9.field126++;
                }
                class9.field126++;
            }
            return -1;
        }
    }
}
