import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class250 extends class320 {

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "Z")
    public static boolean field3577 = false;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "[I")
    public static int[] field3586 = new int[1000];

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)Z")
    public final boolean method1606(boolean arg0) {
        if (arg0) {
            this.field3578 = 24;
        }
        field3581++;
        return (this.field3585 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)I")
    public final int method1607(int arg0) {
        field3574++;
        return arg0 == -1 ? class366.method2286((byte) 87, this.field3585) : -10;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3584++;
        if (arg0 == arg4) {
            class116.method858(arg5, arg4, arg3, arg6, arg1, 120, arg2);
            return;
        }
        if (class315.field4754 <= (arg3 - arg4) && arg3 + arg4 <= class156.field2455 && class70.field1213 <= arg1 - arg0 && class389.field5859 >= arg0 + arg1) {
            class517.method3093(arg4, arg5, arg3, arg6, arg0, arg2, arg7 + 243968799, arg1);
        } else {
            class122.method942(arg4, arg6, arg0, arg7 ^ 0xE8AB1CC, arg2, arg5, arg1, arg3);
        }
        if (arg7 != -243968799) {
            method1608(26, 0, -108, 109, -69, -41, 26, -27);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)Z")
    public final boolean method1609(int arg0, byte arg1) {
        field3575++;
        if (arg1 != -31) {
            this.method1614((byte) -6);
        }
        return (this.field3585 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lqf;III)V")
    public static final void method1610(class478 arg0, int arg1, int arg2, int arg3) {
        long var4 = class217.field3128[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field7132 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field7128[arg0.field7132++] = class448.field6723[var8 - 1].field6877;
            var6 += 16L;
        }
        for (int var9 = arg0.field7132; var9 < 4; var9++) {
            arg0.field7128[var9] = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(Z)I")
    public final int method1611(boolean arg0) {
        field3580++;
        return arg0 ? (this.field3585 & 0x1DF351) >> 18 : -56;
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(Z)Z")
    public final boolean method1612(boolean arg0) {
        field3576++;
        if (arg0) {
            return false;
        } else {
            return ((this.field3585 & 0x7F5EE5) >> 22) != 0;
        }
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V")
    public static void method1613(int arg0) {
        if (arg0 != -8202) {
            field3577 = false;
        }
        field3586 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Z")
    public final boolean method1614(byte arg0) {
        if (arg0 != -54) {
            this.method1614((byte) -55);
        }
        field3579++;
        return (this.field3585 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)V")
    public static final void method1615(int arg0) {
        field3583++;
        class271.method1747(class443.field6623.field621, 22050, 2, arg0 ^ 0x52F6);
        class436.field6494 = new class470();
        if (arg0 != 21141) {
            return;
        }
        class436.field6494.method2791((byte) 108, 9, 128);
        class427.field6349 = class158.method1180(22050, 2, class368.field5553, 0, class370.field5611);
        class427.field6349.method669(class436.field6494, arg0 - 21141);
        class417.method2524(class436.field6494, class209.field3017, class50.field901, class260.field3788, 56);
        class199.field2921 = class158.method1180(2048, 2, class368.field5553, 1, class370.field5611);
        class45.field837 = new class311();
        class199.field2921.method669(class45.field837, 0);
        class21.field426 = new class348(22050, class256.field3725);
        class360.field5458 = class84.field1455.method136("scape main", 113);
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(II)V")
    public class250(int arg0, int arg1) {
        this.field3578 = arg1;
        this.field3585 = arg0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
    public static final void method1616(int arg0, int arg1) {
        field3582++;
        class54 var2 = class442.method2651(arg0, 12, -13208);
        var2.method476((byte) -44);
        if (arg1 != 22050) {
            method1616(52, 24);
        }
    }
}
