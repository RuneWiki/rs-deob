import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class218 {

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lde;")
    private class534 field2943 = new class534(64);

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lnd;")
    public class547 field2940;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lnd;")
    private class547 field2942;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lhm;")
    public static class223 field2939 = new class223(3, 2);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[[Lria;")
    public static class288[][] field2938;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZIIII)V")
    public static final void method1418(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2945++;
        if (class353.field4533 != null && (arg4 != 3 || class329.field4203 != arg2 || class506.field7128 != arg3)) {
            class621.method3495((byte) 8, class353.field4533, class162.field2227);
            class353.field4533 = null;
        }
        if (arg4 == 3 && class353.field4533 == null) {
            class353.field4533 = class237.method1487(arg3, class162.field2227, arg2, 0, 0, (byte) -72);
            if (class353.field4533 != null) {
                class329.field4203 = arg2;
                class506.field7128 = arg3;
                class472.method2688(101);
            }
        }
        if (arg4 == 3 && class353.field4533 == null) {
            method1418(69, true, -1, -1, class748.field10451.field10407.method3441((byte) -56), arg5);
            return;
        }
        Container var6;
        if (class353.field4533 != null) {
            class317.field4108 = arg3;
            var6 = class353.field4533;
            class754.field10526 = arg2;
        } else if (class731.field10179 == null) {
            if (class64.field900 == null) {
                var6 = class319.field4123;
            } else {
                var6 = class64.field900;
            }
            class754.field10526 = var6.getSize().width;
            class317.field4108 = var6.getSize().height;
        } else {
            Insets var7 = class731.field10179.getInsets();
            class754.field10526 = class731.field10179.getSize().width - var7.left - var7.right;
            class317.field4108 = class731.field10179.getSize().height - var7.top - var7.bottom;
            var6 = class731.field10179;
        }
        if (arg4 == 1) {
            class489.field6951 = (class754.field10526 - class482.field6548) / 2;
            class288.field3772 = 0;
            class356.field4586 = class482.field6548;
            class466.field6263 = class478.field6509;
        } else {
            class179.method1227(-1);
        }
        if (class7.field75 != class225.field2991) {
            boolean var10000;
            if (class356.field4586 < 1024 && class466.field6263 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg1) {
            class146.method1048((byte) 76);
        } else {
            class262.field3311.setSize(class356.field4586, class466.field6263);
            if (class676.field9448) {
                class649.method3642(class262.field3311, (byte) -31);
            } else {
                class386.field4930.method495(class262.field3311, class356.field4586, class466.field6263);
            }
            if (class731.field10179 == var6) {
                Insets var8 = class731.field10179.getInsets();
                class262.field3311.setLocation(class489.field6951 + var8.left, var8.top - -class288.field3772);
            } else {
                class262.field3311.setLocation(class489.field6951, class288.field3772);
            }
        }
        if (arg4 >= 2) {
            class64.field895 = true;
        } else {
            class64.field895 = false;
        }
        if (class540.field7482 != -1) {
            class203.method1317(false, true);
        }
        if (arg0 <= 63) {
            return;
        }
        if (class12.field143 != null && class102.method816(class27.field484, (byte) 127)) {
            class294.method1765(26954);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class559.field7782[var9] = true;
        }
        class10.field134 = true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public final void method1419(byte arg0) {
        field2941++;
        class534 var2 = this.field2943;
        synchronized (this.field2943) {
            if (arg0 <= -127) {
                this.field2943.method3064(false);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Ltca;")
    public final class175 method1420(int arg0, int arg1) {
        field2936++;
        class534 var3 = this.field2943;
        class175 var4;
        synchronized (this.field2943) {
            var4 = (class175) this.field2943.method3079((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 == -5216) {
            class547 var5 = this.field2942;
            byte[] var6;
            synchronized (this.field2942) {
                var6 = this.field2942.method3153(arg0, 0, 3);
            }
            class175 var7 = new class175();
            var7.field2441 = this;
            if (var6 != null) {
                var7.method1198(new class461(var6), -1);
            }
            class534 var8 = this.field2943;
            synchronized (this.field2943) {
                this.field2943.method3077((byte) 90, (long) arg0, var7);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static void method1421(byte arg0) {
        field2938 = null;
        field2939 = null;
        int var1 = -52 % ((-arg0 - 24) / 59);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public final void method1422(int arg0) {
        class534 var2 = this.field2943;
        synchronized (this.field2943) {
            if (arg0 >= -57) {
                field2938 = null;
            }
            this.field2943.method3065(true);
        }
        field2937++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
    public final void method1423(boolean arg0, int arg1) {
        class534 var3 = this.field2943;
        synchronized (this.field2943) {
            if (!arg0) {
                return;
            }
            this.field2943.method3070(arg1, 125);
        }
        field2944++;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lal;ILnd;Lnd;)V")
    public class218(class102 arg0, int arg1, class547 arg2, class547 arg3) {
        this.field2940 = arg3;
        this.field2942 = arg2;
        this.field2942.method3178((byte) 42, 3);
    }
}
