import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class457 implements class515 {

    @OriginalMember(owner = "client!nja", name = "f", descriptor = "Lgj;")
    private class662 field6222;

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "Lne;")
    public class338 field6217;

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!nja", name = "c", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!nja", name = "d", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!nja", name = "e", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!nja", name = "g", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!nja", name = "i", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!nja", name = "j", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!nja", name = "k", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!nja", name = "l", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!nja", name = "h", descriptor = "Lnf;")
    public class604 field6224;

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V")
    public final void method1790(int arg0) {
        field6228++;
        if (arg0 != 6187) {
            this.method1102(true, -84);
        }
        this.field6224 = class265.method1731(this.field6217.field4575, 65485, this.field6222);
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)Z")
    public final boolean method1789(byte arg0) {
        if (arg0 != 29) {
            method2634(75);
        }
        field6227++;
        return this.field6222.method3737(this.field6217.field4575, false);
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(IZ)V")
    public static final void method2632(int arg0, boolean arg1) {
        class328.field4463 = 2;
        field6226++;
        if (arg1) {
            return;
        }
        class459.field6232 = arg0;
        long var2 = 0L;
        if (class245.field3476 == null) {
            class95.method807((byte) -115, 35);
        } else {
            class93 var4 = new class93(class265.method1735(2, class609.method3457(127, class245.field3476)));
            long var5 = var4.method770((byte) 126);
            class186.field2882 = var4.method770((byte) 116);
            class678.method3823("", (byte) -95, true, class313.method1985(var5, 13426));
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(IZILgj;III)V")
    public static final void method2633(int arg0, boolean arg1, int arg2, class662 arg3, int arg4, int arg5, int arg6) {
        if (arg2 <= 63) {
            return;
        }
        field6218++;
        if (arg0 <= 0) {
            class374.method2270(arg6, arg5, arg3, 0, arg4, arg1);
            return;
        }
        class234.field3371 = arg1;
        class469.field6348 = 1;
        field6220 = arg5;
        class11.field180 = arg3;
        class676.field9431 = null;
        class752.field10377 = arg4;
        class126.field2224 = arg6;
        class171.field2733 = class500.field6844.method3237((byte) -68) / arg0;
        if (class171.field2733 < 1) {
            class171.field2733 = 1;
            return;
        }
    }

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "(I)V")
    public static final void method2634(int arg0) {
        class732.method4064(2, 32457, class111.field1911.field6751.method2574((byte) 99) == 1, arg0);
        field6221++;
        class89.field1277 = class779.method4271(22050, (byte) -108, class558.field7896, class630.field8751, 0);
        class303.method1939(class658.method3697(true, null), true, (byte) -21);
        class100.field1622 = class779.method4271(2048, (byte) -108, class558.field7896, class630.field8751, 1);
        class456.field6213 = new class48();
        class100.field1622.method2704(0, class456.field6213);
        class508.field6983 = new class480(22050, class55.field782);
        class279.method1787(true);
    }

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "(B)I")
    public static final int method2635(byte arg0) {
        if (arg0 >= -98) {
            field6220 = -16;
        }
        field6219++;
        return 16;
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(ZI)V")
    public void method1102(boolean arg0, int arg1) {
        if (arg1 != 1164) {
            return;
        }
        field6223++;
        if (arg0) {
            int var3 = this.field6217.field4570.method3006(arg1 - 1164, class374.field5075, this.field6224.method224()) + this.field6217.field4573;
            int var4 = this.field6217.field4572.method2837(2113, class412.field5635, this.field6224.method218()) + this.field6217.field4571;
            this.field6224.method3430(var3, var4);
        }
    }

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "(IZ)Z")
    public static final boolean method2636(int arg0, boolean arg1) {
        field6225++;
        class534 var2 = (class534) class208.field3119.method3589((byte) -127);
        if (arg1) {
            field6220 = -32;
        }
        while (var2 != null) {
            if (class93.method741(-34, var2.field7229) && (long) arg0 == var2.field7231) {
                return true;
            }
            var2 = (class534) class208.field3119.method3591(0);
        }
        return false;
    }

    @OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lgj;Lne;)V")
    public class457(class662 arg0, class338 arg1) {
        this.field6222 = arg0;
        this.field6217 = arg1;
    }
}
