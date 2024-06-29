import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class178 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Z")
    public boolean field2804 = false;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2807 = "Loaded update list";

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2802 = " has logged out.";

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field2810 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lrn;")
    public static class18 field2815;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "Lrn;")
    public static class18 field2816;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1388(int arg0) {
        class104.field1570.method656(0);
        if (arg0 > 74) {
            field2813++;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZBI)Lkk;", line = 26)
    public final class77 method1389(boolean arg0, byte arg1, int arg2) {
        field2800++;
        if (arg1 != 74) {
            field2807 = (String) null;
        }
        class77 var4 = (class77) class87.field1247.method654(120, (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field2809));
        if (var4 != null) {
            return var4;
        }
        class217.field3398.method199(2209, this.field2809);
        class77 var5 = class163.method1305(this.field2809, class217.field3398, 0, 1);
        if (var5 != null) {
            var5.method713(class246.field3833, class112.field1722, class76.field1114);
            var5.field3832 = var5.field3827;
            var5.field3825 = var5.field3826;
            if (arg0) {
                var5.method704();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method703();
            }
            class87.field1247.method652(-61, var5, (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field2809));
        }
        return var5;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLug;I)V", line = 66)
    public final void method1390(byte arg0, class25 arg1, int arg2) {
        field2811++;
        int var4 = -115 / ((arg0 + 36) / 57);
        while (true) {
            int var5 = arg1.method281(94);
            if (var5 == 0) {
                return;
            }
            this.method1394(-84, arg1, var5, arg2);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V", line = 90)
    public static final void method1391(boolean arg0) {
        field2803++;
        Container var1;
        if (class212.field3321 != null) {
            var1 = class212.field3321;
        } else if (class67.field1028 == null) {
            var1 = class340.field5234.field4975;
        } else {
            var1 = class67.field1028;
        }
        class101.field1528 = var1.getSize().width;
        class277.field4283 = var1.getSize().height;
        if (class67.field1028 == var1) {
            Insets var2 = class67.field1028.getInsets();
            class277.field4283 -= var2.top + var2.bottom;
            class101.field1528 -= var2.right + var2.left;
        }
        if (class113.method969(1) >= 2) {
            class126.field2113 = class101.field1528;
            class166.field2645 = 0;
            class362.field5740 = class277.field4283;
            class138.field2290 = 0;
        } else {
            class126.field2113 = 765;
            class362.field5740 = 503;
            class138.field2290 = (class101.field1528 - 765) / 2;
            class166.field2645 = 0;
        }
        if (arg0) {
            method1392(-51);
        }
        if (class240.field3737) {
            class240.method1790(class126.field2113, class362.field5740);
        }
        class64.field974.setSize(class126.field2113, class362.field5740);
        if (class67.field1028 == var1) {
            Insets var3 = class67.field1028.getInsets();
            class64.field974.setLocation(class138.field2290 + var3.left, class166.field2645 + var3.top);
        } else {
            class64.field974.setLocation(class138.field2290, class166.field2645);
        }
        if (class164.field2604 != -1) {
            class108.method942(true, true);
        }
        class293.method2120(5447);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 153)
    public static void method1392(int arg0) {
        field2815 = null;
        field2816 = null;
        field2807 = null;
        if (arg0 != 2) {
            method1393((byte) 121, (String) null);
        }
        field2802 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 166)
    public static final boolean method1393(byte arg0, String arg1) {
        field2805++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 < 64) {
            field2812 = 78;
        }
        while (var2 < class143.field2347) {
            if (arg1.equalsIgnoreCase(class238.field3692[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class231.field3608[var2])) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILug;II)V", line = 204)
    private final void method1394(int arg0, class25 arg1, int arg2, int arg3) {
        if (arg0 > -29) {
            field2802 = (String) null;
        }
        field2817++;
        if (arg2 == 1) {
            this.field2809 = arg1.method314((byte) 123);
        } else if (arg2 == 2) {
            this.field2806 = arg1.method265(true);
        } else if (arg2 == 3) {
            this.field2804 = true;
        } else if (arg2 == 4) {
            this.field2809 = -1;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I", line = 232)
    public static final int method1395(int arg0, int arg1) {
        field2814++;
        if (arg0 < 101) {
            return 50;
        } else if (arg1 == 16711935) {
            return -1;
        } else {
            return class290.method2099((byte) -123, arg1);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Lhg;", line = 251)
    public static final class162 method1396(int arg0, int arg1) {
        class162 var2 = (class162) class327.field5023.method654(-42, (long) arg0);
        field2801++;
        if (var2 != null) {
            return var2;
        }
        class162 var3 = class139.method1159(false, arg0, class222.field3446, class163.field2587, arg1);
        if (var3 != null) {
            class327.field5023.method652(-122, var3, (long) arg0);
        }
        return var3;
    }
}
