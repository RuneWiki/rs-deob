import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class110 extends class449 {

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Lor;")
    public static class275 field1535;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "Ldi;")
    public static class300 field1541;

    static {
        new class30("", 73);
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)Z", line = 8)
    public final boolean method869(int arg0) {
        field1530++;
        if (arg0 < 79) {
            return false;
        } else {
            return (this.field1544 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V", line = 20)
    public static final void method870(boolean arg0) {
        field1533++;
        int var1 = class143.field1996;
        if (!arg0) {
            field1541 = null;
        }
        int[] var2 = class464.field6536;
        for (int var3 = 0; var3 < var1; var3++) {
            class39 var4 = class112.field1570[var2[var3]];
            if (var4 != null) {
                class53.method503(-113, var4.method245(4452), var4);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)Z", line = 53)
    public final boolean method871(byte arg0, int arg1) {
        field1531++;
        if (arg0 != -113) {
            this.field1542 = 125;
        }
        return (this.field1544 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILae;)Lae;", line = 66)
    public static final class172 method872(int arg0, class172 arg1) {
        field1532++;
        if (arg0 != 25704) {
            field1541 = null;
        }
        class172 var2 = client.method532(arg1);
        if (var2 == null) {
            var2 = arg1.field2524;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILoj;ILrn;IILae;)V", line = 84)
    public static final void method873(byte arg0, int arg1, class405 arg2, int arg3, class417 arg4, int arg5, int arg6, class172 arg7) {
        field1539++;
        if (arg4 == null) {
            return;
        }
        int var8;
        if (class390.field5393 == 4) {
            var8 = (int) class91.field1281 & 0x3FFF;
        } else {
            var8 = (int) class91.field1281 + class462.field6529 & 0x3FFF;
        }
        int var9 = Math.max(arg7.field2554 / 2, arg7.field2579 / 2) + 10;
        int var10 = arg1 * arg1 + arg5 * arg5;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class319.field4501[var8];
        int var12 = class319.field4504[var8];
        int var13 = -7 / ((-arg0 - 58) / 43);
        if (class390.field5393 != 4) {
            var12 = var12 * 256 / (class20.field216 + 256);
            var11 = var11 * 256 / (class20.field216 + 256);
        }
        int var14 = arg1 * var12 + arg5 * var11 >> 15;
        int var15 = arg5 * var12 - arg1 * var11 >> 15;
        arg4.method728(arg6 + (arg7.field2554 / 2) + var14 - arg4.method1294() / 2, arg7.field2579 / 2 + (-var15 + arg3 - arg4.method1295() / 2), arg2, arg6, arg3);
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)I", line = 126)
    public final int method874(int arg0) {
        if (arg0 != -16368) {
            method870(true);
        }
        field1540++;
        return (this.field1544 & 0x1D8B25) >> 18;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)Z", line = 138)
    public final boolean method875(int arg0) {
        if (arg0 != -1200) {
            this.field1542 = -43;
        }
        field1538++;
        return ((this.field1544 & 0x2719A7) >> 21) != 0;
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V", line = 149)
    public static void method876(int arg0) {
        field1541 = null;
        field1535 = null;
        if (arg0 < 6) {
            method870(true);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lae;ZI)V", line = 160)
    public static final void method877(class172 arg0, boolean arg1, int arg2) {
        field1536++;
        int var3 = arg0.field2499 == 0 ? arg0.field2554 : arg0.field2499;
        int var4 = ~arg0.field2506 == arg2 ? arg0.field2579 : arg0.field2506;
        class24.method169(var4, var3, arg0.field2543, arg1, (byte) -123, class263.field3787[arg0.field2543 >> 16]);
        if (arg0.field2541 != null) {
            class24.method169(var4, var3, arg0.field2543, arg1, (byte) -74, arg0.field2541);
        }
        class249 var5 = (class249) class310.field4399.method1104(-126, (long) arg0.field2543);
        if (var5 != null) {
            class87.method736(var4, var3, var5.field3593, arg2 - 113, arg1);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V", line = 189)
    public static final void method878(int arg0, boolean arg1) {
        field1543++;
        if (!class369.method2261(0, arg0)) {
            return;
        }
        class172[] var2 = class263.field3787[arg0];
        int var3 = 0;
        if (!arg1) {
            field1541 = null;
        }
        while (var2.length > var3) {
            class172 var4 = var2[var3];
            if (var4 != null) {
                var4.field2559 = 1;
                var4.field2528 = 0;
                var4.field2585 = 0;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)I", line = 223)
    public final int method879(int arg0) {
        if (arg0 == 24468) {
            field1537++;
            return class37.method229(arg0 ^ 0xFFFFA05A, this.field1544);
        } else {
            return 115;
        }
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)Z", line = 235)
    public final boolean method880(int arg0) {
        field1534++;
        int var2 = -30 / ((arg0 + 4) / 37);
        return ((this.field1544 & 0x7500E3) >> 22) != 0;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V", line = 244)
    public class110(int arg0, int arg1) {
        this.field1544 = arg0;
        this.field1542 = arg1;
    }
}
