import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class410 extends class446 {

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "Lka;")
    public class277 field5801;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
    public static int field5802 = 20;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "Lnq;")
    public static class268 field5803;

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "Lnq;")
    public static class268 field5810;

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "Ljava/lang/String;")
    public static String field5806;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(B)V", line = 3)
    public static final void method2564(byte arg0) {
        if (arg0 != -42) {
            field5802 = 88;
        }
        field5808++;
        if (class222.field3100 < 0) {
            class192.field2649 = -1;
            class277.field3854 = -1;
            class222.field3100 = 0;
        }
        if (class222.field3100 > class354.field4841) {
            class192.field2649 = -1;
            class222.field3100 = class354.field4841;
            class277.field3854 = -1;
        }
        if (class254.field3580 < 0) {
            class277.field3854 = -1;
            class192.field2649 = -1;
            class254.field3580 = 0;
        }
        if (class354.field4857 < class254.field3580) {
            class254.field3580 = class354.field4857;
            class192.field2649 = -1;
            class277.field3854 = -1;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lms;B)Lms;", line = 45)
    public static final class453 method2565(class453 arg0, byte arg1) {
        field5805++;
        class453 var2 = client.method1100(arg0);
        if (var2 == null) {
            var2 = arg0.field6454;
        }
        if (arg1 < 52) {
            field5803 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[B)I", line = 65)
    public static final int method2566(int arg0, int arg1, byte[] arg2) {
        if (arg1 >= -124) {
            return 116;
        } else {
            field5807++;
            return class175.method1148(arg0, -34, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)Laf;", line = 78)
    public static final class250 method2567(int arg0, int arg1) {
        field5800++;
        class131 var2 = class251.field3543;
        class250 var3;
        synchronized (class251.field3543) {
            var3 = (class250) class251.field3543.method904(false, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        int var4 = 46 % ((5 - arg1) / 49);
        byte[] var5 = class366.field5160.method1745(arg0, (byte) -97, 3);
        class250 var6 = new class250();
        if (var5 != null) {
            var6.method1680(new class11(var5), 61);
        }
        class131 var7 = class251.field3543;
        synchronized (class251.field3543) {
            class251.field3543.method902((long) arg0, (byte) 112, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(B)V", line = 104)
    public static final void method2568(byte arg0) {
        field5804++;
        class131 var1 = class406.field5774;
        synchronized (class406.field5774) {
            if (arg0 <= 50) {
                method2570(-15);
            }
            class406.field5774.method900(0);
        }
        class131 var2 = class158.field2222;
        synchronized (class158.field2222) {
            class158.field2222.method900(0);
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lka;)V", line = 121)
    public class410(class277 arg0) {
        this.field5801 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZIIIB)V", line = 129)
    public static final void method2569(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        field5799++;
        int var6 = 44 % ((20 - arg5) / 51);
        if (arg1) {
            class46.method411(false);
        }
        if (class217.field2997 != null && (arg0 != 3 || class53.field741 != arg3 || class306.field4224 != arg2)) {
            class92.method655(class217.field2997, (byte) 43, class241.field3426);
            class217.field2997 = null;
        }
        if (arg0 == 3 && class217.field2997 == null) {
            class217.field2997 = class393.method2485(0, 0, arg3, class241.field3426, arg2, 10);
            if (class217.field2997 != null) {
                class53.field741 = arg3;
                class306.field4224 = arg2;
                class271.method1775(class241.field3426, 59);
            }
        }
        if (arg0 == 3 && class217.field2997 == null) {
            method2569(class284.field4010, true, -1, -1, arg4, (byte) 122);
            return;
        }
        Container var7;
        if (class217.field2997 != null) {
            class197.field2713 = arg3;
            var7 = class217.field2997;
            class335.field4614 = arg2;
        } else if (class79.field1119 == null) {
            var7 = class241.field3426.field4121;
            class197.field2713 = var7.getSize().width;
            class335.field4614 = var7.getSize().height;
        } else {
            Insets var8 = class79.field1119.getInsets();
            class197.field2713 = class79.field1119.getSize().width - var8.right - var8.left;
            int var10001 = var8.top + var8.bottom;
            class335.field4614 = class79.field1119.getSize().height - var10001;
            var7 = class79.field1119;
        }
        if (arg0 == 1) {
            class237.field3366 = 0;
            class214.field2993 = 503;
            class180.field2469 = (class197.field2713 - 765) / 2;
            class47.field661 = 765;
        } else if (class445.field6242 < 96 && class326.field4462 == 0) {
            int var9 = class197.field2713 <= 1024 ? class197.field2713 : 1024;
            class47.field661 = var9;
            int var10 = class335.field4614 > 768 ? 768 : class335.field4614;
            class180.field2469 = (class197.field2713 - var9) / 2;
            class237.field3366 = 0;
            class214.field2993 = var10;
        } else {
            class47.field661 = class197.field2713;
            class180.field2469 = 0;
            class237.field3366 = 0;
            class214.field2993 = class335.field4614;
        }
        if (class203.field2787 != 0) {
            boolean var10000;
            if (class47.field661 < 1024 && class214.field2993 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg1) {
            class412.method2588(class326.field4462, 118);
        } else {
            class304.field4191.setSize(class47.field661, class214.field2993);
            if (class64.field949 != null) {
                class64.field949.method129();
            }
            if (class79.field1119 == var7) {
                Insets var11 = class79.field1119.getInsets();
                class304.field4191.setLocation(var11.left + class180.field2469, class237.field3366 + var11.top);
            } else {
                class304.field4191.setLocation(class180.field2469, class237.field3366);
            }
        }
        if (arg0 >= 2) {
            class92.field1287 = true;
        } else {
            class92.field1287 = false;
        }
        if (class59.field801 != -1) {
            class231.method1590(true, true);
        }
        if (class156.field2207 != null && (class446.field6250 == 30 || class446.field6250 == 25)) {
            class228.method1579(105);
        }
        for (int var12 = 0; var12 < 100; var12++) {
            class377.field5395[var12] = true;
        }
        class181.field2482 = true;
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)V", line = 285)
    public static final void method2570(int arg0) {
        field5809++;
        if (arg0 == 32299) {
            class304.field4195 = class393.method2479(true, 2048, true, 35, 0.4F, 4, 8, 8);
        }
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V", line = 302)
    public static void method2571(int arg0) {
        if (arg0 < 38) {
            method2565((class453) null, (byte) -83);
        }
        field5803 = null;
        field5810 = null;
        field5806 = null;
    }
}
