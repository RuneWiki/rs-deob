import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class100 extends class123 {

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field1441;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field1442 = -2;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZS)Z")
    public static final boolean method643(boolean arg0, short arg1) {
        field1443++;
        if (arg1 == 11 || arg1 == 44 || arg1 == 37 || arg1 == 13 || arg1 == 40 || arg1 == 34 || arg1 == 57 || arg1 == 28) {
            return true;
        } else if (arg1 == 45 || arg1 == 3 || arg1 == 1002 || arg1 == 1009) {
            return true;
        } else if (arg1 == 24 || arg1 == 59 || arg1 == 15 || arg1 == 10 || arg1 == 30) {
            return true;
        } else if (arg1 == 50 || arg1 == 6 || arg1 == 60 || arg1 == 23 || arg1 == 9 || arg1 == 42) {
            return true;
        } else {
            if (!arg0) {
                field1442 = 23;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)Z")
    public final boolean method644(byte arg0) {
        field1440++;
        return arg0 != -19;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class100(Object arg0) {
        this.field1441 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method645(int arg0) {
        field1444++;
        if (arg0 != 0) {
            method643(true, (short) 99);
        }
        return this.field1441;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BIILim;)V")
    public static final void method646(byte arg0, int arg1, int arg2, class178 arg3) {
        if (arg3.field2636 == 0) {
            arg3.field2554 = arg3.field2598;
        } else if (arg3.field2636 == 1) {
            arg3.field2554 = (arg1 - arg3.field2571) / 2 + arg3.field2598;
        } else if (arg3.field2636 == 2) {
            arg3.field2554 = arg1 - arg3.field2571 - arg3.field2598;
        } else if (arg3.field2636 == 3) {
            arg3.field2554 = arg3.field2598 * arg1 >> 14;
        } else if (arg3.field2636 == 4) {
            arg3.field2554 = (arg3.field2598 * arg1 >> 14) + (arg1 - arg3.field2571) / 2;
        } else {
            arg3.field2554 = arg1 - arg3.field2571 - (arg3.field2598 * arg1 >> 14);
        }
        field1445++;
        int var4 = 104 % ((arg0 - 7) / 52);
        if (arg3.field2657 == 0) {
            arg3.field2667 = arg3.field2677;
        } else if (arg3.field2657 == 1) {
            arg3.field2667 = (arg2 - arg3.field2529) / 2 + arg3.field2677;
        } else if (arg3.field2657 == 2) {
            arg3.field2667 = arg2 - arg3.field2677 - arg3.field2529;
        } else if (arg3.field2657 == 3) {
            arg3.field2667 = arg3.field2677 * arg2 >> 14;
        } else if (arg3.field2657 == 4) {
            arg3.field2667 = (arg3.field2677 * arg2 >> 14) + (arg2 - arg3.field2529) / 2;
        } else {
            arg3.field2667 = arg2 - arg3.field2529 - (arg3.field2677 * arg2 >> 14);
        }
        if (!class16.field288) {
            return;
        }
        if (client.method2028(arg3).field4739 == 0 && arg3.field2608 != 0) {
            return;
        }
        if (arg3.field2554 < 0) {
            arg3.field2554 = 0;
        } else if (arg3.field2571 + arg3.field2554 > arg1) {
            arg3.field2554 = arg1 - arg3.field2571;
        }
        if (arg3.field2667 < 0) {
            arg3.field2667 = 0;
            return;
        }
        if (arg3.field2667 + arg3.field2529 > arg2) {
            arg3.field2667 = arg2 - arg3.field2529;
            return;
        }
    }
}
