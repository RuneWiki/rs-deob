import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class336 {

    @OriginalMember(owner = "client!li", name = "g", descriptor = "B")
    private byte field4579;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public int field4582;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public int field4575;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public int field4577;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Laq;")
    public static class453 field4583 = null;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "[I")
    public static int[] field4584 = new int[2];

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I", line = 5)
    public final int method2152(int arg0) {
        if (arg0 >= -103) {
            this.field4575 = -107;
        }
        field4580++;
        return this.field4579 & 0x7;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V", line = 20)
    public static final void method2153(int arg0, int arg1, int arg2) {
        field4573++;
        class104.field1231[arg1] = arg2;
        if (arg0 != 2) {
            return;
        }
        class113 var3 = (class113) class23.field241.method2218(1, (long) arg1);
        if (var3 == null) {
            class113 var4 = new class113(4611686018427387905L);
            class23.field241.method2227(var4, arg0 - 8220, (long) arg1);
        } else if (var3.field1320 != 4611686018427387905L) {
            var3.field1320 = class164.method1038(8635) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 48)
    public static void method2154(byte arg0) {
        if (arg0 != -109) {
            method2153(-120, 105, 39);
        }
        field4584 = null;
        field4583 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIZ)V", line = 69)
    public static final void method2155(int arg0, int arg1, boolean arg2) {
        field4576++;
        if (arg0 == 0) {
            class267.field3454 = class118.method700((byte) 126, class450.field6292, arg0, class357.field4845, class401.field5525, class414.field5684 * 2);
        } else {
            if (arg2) {
                class267.field3454 = class118.method700((byte) 47, class450.field6292, 0, class357.field4845, class401.field5525, 0);
                class267.field3454.method728(0);
                class347 var3 = class181.method1132(class12.field153, 0, (byte) 45, class201.field2370);
                class31 var4 = class267.field3454.method747(var3, class132.method853(class15.field177, class12.field153, 0), true);
                class190.method1179(0, class72.field894.method434(class373.field5057, -8192), true, var4);
                class267.field3454.method757();
                class419.method2571(29);
                class267.field3454.method745(2);
            }
            try {
                class267.field3454 = class118.method700((byte) 54, class450.field6292, arg0, class357.field4845, class401.field5525, class414.field5684 * 2);
            } catch (Throwable var7) {
                class267.field3454 = class118.method700((byte) 89, class450.field6292, 0, class357.field4845, class401.field5525, 0);
                arg0 = 0;
            }
        }
        if (class267.field3454.method711()) {
            class197 var5 = class267.field3454.method758(134217728);
            class267.field3454.method724(var5);
        }
        class20.field220 = arg0;
        class374.method2341(0);
        if (!class267.field3454.method689()) {
            class279.field3618 = 1;
        }
        class267.field3454.method695(class279.field3618);
        class267.field3454.method759(0);
        class179.field2092 = class267.field3454.method769();
        class195.field2323 = class267.field3454.method769();
        int var6 = (int) ((double) class22.field232 * 34.46D);
        if (class267.field3454.method692()) {
            var6 += 128;
        }
        class267.field3454.method750(50, var6);
        class267.field3454.method787(!class341.field4646);
        if (class267.field3454.method785()) {
            class338.method2165(-1, class265.field3408);
        }
        class18.field208 = !class98.method602(65280);
        class244.method1601(class196.field2329 >> 3, class22.field232 >> 3, (byte) 126, class267.field3454);
        if (arg1 < -84) {
            class370.method2328((byte) 82);
            class75.field905 = false;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIII)V", line = 139)
    public static final void method2156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class295.field3937 <= (arg2 - arg4) && arg2 + arg4 <= class427.field5844 && (arg5 - arg4) >= class53.field624 && class118.field1356 >= arg4 + arg5) {
            class22.method136(arg3, arg4, arg5, arg2, false, arg6, arg0);
        } else {
            class33.method216(arg5, arg4, arg2, arg0, arg6, (byte) 52, arg3);
        }
        field4585++;
        int var7 = -92 % ((34 - arg1) / 38);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)I", line = 158)
    public final int method2157(boolean arg0) {
        field4574++;
        if (!arg0) {
            this.field4577 = 119;
        }
        return (this.field4579 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 174)
    public class336() {
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lbg;)V", line = 176)
    public class336(class242 arg0) {
        this.field4579 = arg0.method1589(false);
        this.field4582 = arg0.method1587((byte) -102);
        this.field4575 = arg0.method1576((byte) 127);
        this.field4578 = arg0.method1576((byte) 124);
        this.field4577 = arg0.method1576((byte) 123);
        this.field4581 = arg0.method1576((byte) 121);
    }
}
