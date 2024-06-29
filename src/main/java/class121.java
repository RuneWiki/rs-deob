import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class121 {

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "[Lna;")
    private class29[] field1846;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "[I")
    public static int[] field1844 = new int[14];

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public static int field1848 = 0;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "F")
    public static float field1837;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Lkb;")
    public static class39 field1841;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
    public static int[] field1845;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIII)V", line = 9)
    public static final void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -1) {
            method839(-100, 55, -114, 116, 104, -67);
        }
        int var9 = arg2 + 1;
        class245.method1738(48, class310.field4841[arg2], arg5, arg3, arg4);
        field1847++;
        int var8 = arg0 - 1;
        class245.method1738(48, class310.field4841[arg0], arg5, arg3, arg4);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class310.field4841[var6];
            var7[arg3] = var7[arg5] = arg4;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V", line = 38)
    public static final void method840(int arg0, int arg1, int arg2) {
        class282.field4455++;
        class21.field313.method1541(-64, 99);
        int var3 = 59 % ((74 - arg1) / 50);
        class21.field313.method1401(arg2, -16384);
        class21.field313.method1395((byte) 0, arg0);
        field1842++;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 53)
    public static final void method841(byte arg0) {
        if (field1848 == 2) {
            if (class18.field256 == class16.field211 && class323.field5055 == class157.field2426) {
                field1848 = 0;
                if (class12.field146 && class333.field5177[81] && class126.field1887 > 2) {
                    class119.method831(0, class126.field1887 - 2);
                } else {
                    class119.method831(0, class126.field1887 - 1);
                }
            }
        } else if (class221.field3521 == class18.field256 && class323.field5055 == class144.field2158) {
            field1848 = 0;
            if (class12.field146 && class333.field5177[81] && class126.field1887 > 2) {
                class119.method831(0, class126.field1887 - 2);
            } else {
                class119.method831(0, class126.field1887 - 1);
            }
        } else {
            field1848 = 2;
            class157.field2426 = class144.field2158;
            class16.field211 = class221.field3521;
        }
        if (arg0 < 52) {
            method845(79, 25, true);
        }
        field1836++;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 112)
    public static void method842(int arg0) {
        field1845 = null;
        if (arg0 == 18775) {
            field1844 = null;
            field1841 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 142)
    public static final boolean method843(int arg0, String arg1) {
        field1839++;
        if (arg0 != 10) {
            field1848 = 94;
        }
        return class214.method1563(true, -10659, arg1, 10);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V", line = 165)
    public static final void method844(int arg0) {
        if (arg0 < 32) {
            return;
        }
        field1838++;
        for (int var1 = -1; var1 < class24.field350; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class103.field1575[var1];
            }
            class320 var3 = class100.field1523[var2];
            if (var3 != null) {
                class200.method1466(-128, var3.method910(-1), var3);
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZ)V", line = 200)
    public static final void method845(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1845 = (int[]) null;
        }
        field1843++;
        class250.field3981 = class274.field4345[arg1][arg0].field310;
        class327.field5095 = class274.field4345[arg1][arg0].field308;
        class245.field3887 = class274.field4345[arg1][arg0].field306;
        class109.method748((float) class250.field3981, (float) class327.field5095, (float) class245.field3887);
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V", line = 212)
    public class121(int arg0) {
        this.field1846 = new class29[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class29 var3 = this.field1846[var2] = new class29();
            var3.field419 = var3;
            var3.field417 = var3;
        }
    }
}
