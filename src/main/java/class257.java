import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class257 extends class28 {

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    private final int field4563;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    private final int field4575;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    private final int field4582;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    private final int field4574;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    private final int field4573;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    private final int field4565;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    private final int field4566;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    private final int field4585;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public static int field4564 = 0;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "Lli;")
    public static class185 field4571 = class245.method1649(" est d-Bj-9 dans votre liste d(Wamis)3", -45);

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "[I")
    public static int[] field4577 = new int[32];

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "Lli;")
    public static class185 field4579 = class245.method1649("gelb:", 123);

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "Lli;")
    public static class185 field4569 = class245.method1649("Hidden)2use", -33);

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "Lli;")
    private static class185 field4561 = class245.method1649(" more options", -120);

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "Lli;")
    public static class185 field4583 = field4561;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "Lkc;")
    public static class29 field4570;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)Lha;")
    public static final class260 method1746(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field4586;
            class260 var2 = (class260) class268.field4740.method1615(-28166, (long) arg0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class250.field4465.method1688(0, class79.method512(-99, arg0), class15.method118((byte) 69, arg0));
                class260 var4 = new class260();
                if (var3 != null) {
                    var4.method1762(0, new class118(var3));
                }
                class268.field4740.method1620(var4, (byte) 49, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4563 = arg6;
        this.field4575 = arg0;
        this.field4582 = arg2;
        this.field4574 = arg3;
        this.field4573 = arg4;
        this.field4565 = arg1;
        this.field4566 = arg5;
        this.field4585 = arg7;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(III)V")
    public final void method182(int arg0, int arg1, int arg2) {
        ++field4562;
        int var4 = 57 % ((50 - arg1) / 61);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static final void method1747(boolean arg0) {
        class203.field3717 = new class191();
        if (!arg0) {
            method1748(40);
        }
        ++field4567;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)V")
    public final void method176(int arg0, int arg1, int arg2) {
        ++field4584;
        int var4 = this.field4575 * arg1 >> 12;
        int var5 = this.field4582 * arg1 >> 12;
        if (arg0 >= 119) {
            int var6 = this.field4565 * arg2 >> 12;
            int var7 = this.field4574 * arg2 >> 12;
            int var8 = this.field4573 * arg1 >> 12;
            int var9 = this.field4566 * arg2 >> 12;
            int var10 = this.field4563 * arg1 >> 12;
            int var11 = this.field4585 * arg2 >> 12;
            class154.method1090(super.field466, var8, var6, var4, var5, var11, var10, var7, (byte) 95, var9);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static final void method1748(int arg0) {
        ++class71.field1239;
        class182.field3349.method577(110, arg0 + -17353);
        ++field4581;
        class182.field3349.method870(0L, (byte) 122);
        if (arg0 != 17353) {
            field4571 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V")
    public final void method175(int arg0, int arg1, int arg2) {
        if (arg0 == 30792) {
            ++field4572;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lli;IZ)V")
    public static final void method1749(class185 arg0, int arg1, boolean arg2) {
        ++field4578;
        if (arg1 == 1621) {
            if (arg2) {
                try {
                    class267.field4725.getAppletContext().showDocument(arg0.method1320(class267.field4725.getCodeBase(), (byte) 47), "_blank");
                } catch (Exception var3) {
                }
            } else {
                try {
                    class267.field4725.getAppletContext().showDocument(arg0.method1320(class267.field4725.getCodeBase(), (byte) 47), "_top");
                } catch (Exception var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static void method1750(int arg0) {
        field4577 = null;
        if (arg0 != -1) {
            method1750(65);
        }
        field4583 = null;
        field4569 = null;
        field4570 = null;
        field4561 = null;
        field4579 = null;
        field4571 = null;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(III)I")
    public static final int method1751(int arg0, int arg1, int arg2) {
        if (arg2 != -25551) {
            field4569 = null;
        }
        ++field4576;
        int var3 = class26.method171(arg1 - 1, arg0 + -1, 1) - (-class26.method171(arg1 + -1, arg0 + 1, 1) + -class26.method171(arg1 + 1, arg0 + -1, 1)) - -class26.method171(arg1 + 1, arg0 - -1, 1);
        int var4 = class26.method171(arg1, arg0 + -1, arg2 ^ -25552) + class26.method171(arg1, arg0 - -1, 1) + class26.method171(arg1 - 1, arg0, 1) - -class26.method171(arg1 - -1, arg0, arg2 + 25552);
        int var5 = class26.method171(arg1, arg0, 1);
        return var3 / 16 - -(var4 / 8) - -(var5 / 4);
    }
}
