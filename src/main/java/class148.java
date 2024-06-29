import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class148 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lte;")
    public class176 field3112 = new class176();

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lgg;")
    private static class63 field3113 = class116.method911(43, "No response from server)3");

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "[I")
    public static int[] field3123 = new int[500];

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
    public static int[] field3119 = new int[128];

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lgg;")
    public static class63 field3124 = field3113;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "J")
    public static long field3120;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lte;")
    private class176 field3122;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[[[Lkf;")
    public static class96[][][] field3117;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Lte;")
    public final class176 method1030(int arg0) {
        field3118++;
        class176 var2 = this.field3122;
        if (this.field3112 == var2) {
            this.field3122 = null;
            return null;
        } else {
            this.field3122 = var2.field3619;
            int var3 = -84 / ((-arg0 - 29) / 55);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public final void method1031(int arg0) {
        field3130++;
        if (arg0 != 0) {
            this.method1038(78, null);
        }
        while (true) {
            class176 var2 = this.field3112.field3611;
            if (this.field3112 == var2) {
                return;
            }
            var2.method1172(-92);
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static void method1032(int arg0) {
        field3119 = null;
        field3117 = null;
        field3113 = null;
        if (arg0 != 0) {
            method1032(-30);
        }
        field3123 = null;
        field3124 = null;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Lte;")
    public final class176 method1033(int arg0) {
        field3127++;
        if (arg0 != 0) {
            this.method1035(-10);
        }
        class176 var2 = this.field3112.field3611;
        if (this.field3112 == var2) {
            this.field3122 = null;
            return null;
        } else {
            this.field3122 = var2.field3611;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILte;)V")
    public final void method1034(int arg0, class176 arg1) {
        field3128++;
        if (arg1.field3619 != null) {
            arg1.method1172(-70);
        }
        arg1.field3611 = this.field3112;
        arg1.field3619 = this.field3112.field3619;
        if (arg0 != 0) {
            this.field3122 = null;
        }
        arg1.field3619.field3611 = arg1;
        arg1.field3611.field3619 = arg1;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)Lte;")
    public final class176 method1035(int arg0) {
        if (arg0 != 0) {
            this.method1030(-104);
        }
        field3115++;
        class176 var2 = this.field3122;
        if (this.field3112 == var2) {
            this.field3122 = null;
            return null;
        } else {
            this.field3122 = var2.field3611;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)Lte;")
    public final class176 method1036(int arg0) {
        class176 var2 = this.field3112.field3611;
        field3125++;
        if (this.field3112 == var2) {
            return null;
        }
        if (arg0 != -31644) {
            field3121 = -52;
        }
        var2.method1172(-60);
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(JI)V")
    public static final void method1037(long arg0, int arg1) {
        field3116++;
        if (arg0 == 0L) {
            return;
        }
        if (class37.field868 >= 100 && class13.field299 != 1 || class37.field868 >= 200) {
            class100.method843((byte) -120, 0, class151.field3175, class65.field1652);
            return;
        }
        class63 var3 = class89.method770(arg0, false).method576((byte) 32);
        for (int var4 = 0; var4 < class37.field868; var4++) {
            if (class80.field1938[var4] == arg0) {
                class100.method843((byte) -85, 0, class151.field3175, class89.method772((byte) 74, new class63[] { var3, class106.field2422 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class99.field2338; var5++) {
            if (class11.field264[var5] == arg0) {
                class100.method843((byte) -119, 0, class151.field3175, class89.method772((byte) 37, new class63[] { class132.field2874, var3, class143.field3071 }));
                return;
            }
        }
        if (var3.method568(class3.field72.field1552, (byte) -127)) {
            class100.method843((byte) -98, 0, class151.field3175, class143.field3060);
            return;
        }
        class140.field3022[class37.field868] = var3;
        class80.field1938[class37.field868] = arg0;
        class108.field2431++;
        class123.field2713[class37.field868] = 0;
        class198.field3959[class37.field868] = 0;
        class37.field868++;
        client.field705 = class72.field1807;
        if (arg1 == 1) {
            class141.field3031.method854(114, true);
            class141.field3031.method32((byte) 72, arg0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(ILte;)V")
    public final void method1038(int arg0, class176 arg1) {
        if (arg1.field3619 != null) {
            arg1.method1172(arg0 ^ 0xFFFFFF95);
        }
        arg1.field3619 = this.field3112;
        arg1.field3611 = this.field3112.field3611;
        field3129++;
        if (arg0 == 0) {
            arg1.field3619.field3611 = arg1;
            arg1.field3611.field3619 = arg1;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lte;ILte;)V")
    public final void method1039(class176 arg0, int arg1, class176 arg2) {
        if (arg2.field3619 != null) {
            arg2.method1172(-17);
        }
        arg2.field3619 = arg0.field3619;
        int var4 = -85 % ((-arg1 - 82) / 37);
        field3114++;
        arg2.field3611 = arg0;
        arg2.field3619.field3611 = arg2;
        arg2.field3611.field3619 = arg2;
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)Lte;")
    public final class176 method1040(int arg0) {
        field3126++;
        class176 var2 = this.field3112.field3619;
        if (this.field3112 == var2) {
            this.field3122 = null;
            return null;
        }
        if (arg0 >= -110) {
            this.method1035(102);
        }
        this.field3122 = var2.field3619;
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class148() {
        this.field3112.field3619 = this.field3112;
        this.field3112.field3611 = this.field3112;
    }
}
