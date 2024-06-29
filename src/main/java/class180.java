import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class180 {

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lek;")
    public class166 field2801 = new class166();

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field2800 = 0;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field2812 = 0;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Z")
    public static boolean field2798 = false;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field2815 = 0;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field2819 = 0;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "Lek;")
    private class166 field2811;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lod;")
    public static class93 field2808;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "[[[B")
    public static byte[][][] field2818;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLek;)V")
    public final void method1219(boolean arg0, class166 arg1) {
        field2809++;
        if (arg0) {
            return;
        }
        if (arg1.field2602 != null) {
            arg1.method1123(0);
        }
        arg1.field2608 = this.field2801;
        arg1.field2602 = this.field2801.field2602;
        arg1.field2602.field2608 = arg1;
        arg1.field2608.field2602 = arg1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
    public static final void method1220(byte arg0) {
        field2803++;
        int var1 = class228.field3517.method1674(class89.field1563);
        for (int var2 = 0; var2 < class128.field2018; var2++) {
            int var6 = class228.field3517.method1674(class179.method1214(var2, -1));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        int var3 = class128.field2018 * 15 + 21;
        var1 += 8;
        int var4 = class147.field2332;
        if (arg0 > -69) {
            field2812 = -70;
        }
        if (class79.field1310 < var3 + var4) {
            var4 = class79.field1310 - var3;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class179.field2796 - var1 / 2;
        if (class29.field409 < var5 + var1) {
            var5 = class29.field409 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class40.field571 != 1) {
            if (class291.field4584 != class179.field2796 || class147.field2332 != class112.field1838) {
                class40.field571 = 1;
                class213.field3321 = class291.field4584;
                class15.field236 = class112.field1838;
                return;
            }
            class190.field2951 = (field2798 ? 26 : 22) + class128.field2018 * 15;
            class47.field687 = true;
            class141.field2150 = var1;
            class157.field2446 = var4;
            class40.field571 = 0;
            class286.field4520 = var5;
        } else if (class213.field3321 == class179.field2796 && class15.field236 == class147.field2332) {
            class141.field2150 = var1;
            class157.field2446 = var4;
            class40.field571 = 0;
            class47.field687 = true;
            class190.field2951 = class128.field2018 * 15 + (field2798 ? 26 : 22);
            class286.field4520 = var5;
            return;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Lek;")
    public final class166 method1221(int arg0) {
        class166 var2 = this.field2801.field2608;
        field2810++;
        if (this.field2801 == var2) {
            this.field2811 = null;
            return null;
        }
        this.field2811 = var2.field2608;
        if (arg0 < 114) {
            field2798 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILek;)V")
    public final void method1222(int arg0, class166 arg1) {
        field2797++;
        if (arg1.field2602 != null) {
            arg1.method1123(0);
        }
        arg1.field2602 = this.field2801;
        if (arg0 <= 41) {
            method1229((byte) -68);
        }
        arg1.field2608 = this.field2801.field2608;
        arg1.field2602.field2608 = arg1;
        arg1.field2608.field2602 = arg1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    public static void method1223(boolean arg0) {
        if (arg0) {
            method1230((class228) null, 39);
        }
        field2818 = null;
        field2808 = null;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Lek;")
    public final class166 method1224(byte arg0) {
        field2813++;
        if (arg0 < 65) {
            this.method1227(57);
        }
        class166 var2 = this.field2801.field2602;
        if (this.field2801 == var2) {
            this.field2811 = null;
            return null;
        } else {
            this.field2811 = var2.field2602;
            return var2;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)Lek;")
    public final class166 method1225(int arg0) {
        field2817++;
        if (arg0 != 15) {
            return null;
        }
        class166 var2 = this.field2811;
        if (this.field2801 == var2) {
            this.field2811 = null;
            return null;
        } else {
            this.field2811 = var2.field2602;
            return var2;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public final void method1226(int arg0) {
        while (true) {
            class166 var2 = this.field2801.field2608;
            if (this.field2801 == var2) {
                this.field2811 = null;
                field2807++;
                if (arg0 != 1) {
                    field2815 = -64;
                    return;
                }
                return;
            }
            var2.method1123(0);
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)Lek;")
    public final class166 method1227(int arg0) {
        field2804++;
        class166 var2 = this.field2811;
        if (this.field2801 == var2) {
            this.field2811 = null;
            return null;
        } else if (arg0 == -10626) {
            this.field2811 = var2.field2608;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZI)I")
    public static final int method1228(int arg0, boolean arg1, int arg2) {
        int var3 = 0;
        if (arg1) {
            return -12;
        }
        field2814++;
        while (arg2 > 0) {
            arg2--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)Lok;")
    public static final class41 method1229(byte arg0) {
        field2806++;
        if (arg0 >= -78) {
            method1223(true);
        }
        class41 var1 = (class41) class221.field3397.method607((byte) 102);
        if (var1 != null) {
            var1.method1123(0);
            var1.method174(31388);
            return var1;
        }
        class41 var2;
        do {
            var2 = (class41) class2.field6.method607((byte) 58);
            if (var2 == null) {
                return null;
            }
            if (var2.method305(27) > class134.method924(false)) {
                return null;
            }
            var2.method1123(0);
            var2.method174(31388);
        } while ((Long.MIN_VALUE & var2.field273) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lre;I)Lre;")
    public static final class228 method1230(class228 arg0, int arg1) {
        field2816++;
        if (arg0.field3467 != -1) {
            return class84.method596((byte) 35, arg0.field3467);
        }
        if (arg1 <= 81) {
            method1228(106, false, 79);
        }
        int var2 = arg0.field3480 >>> 16;
        class109 var3 = new class109(class127.field2007);
        for (class251 var4 = (class251) var3.method777(0); var4 != null; var4 = (class251) var3.method779((byte) -100)) {
            if (var4.field4041 == var2) {
                return class84.method596((byte) 35, (int) var4.field2603);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class180() {
        this.field2801.field2608 = this.field2801;
        this.field2801.field2602 = this.field2801;
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(I)Lek;")
    public final class166 method1231(int arg0) {
        field2802++;
        class166 var2 = this.field2801.field2608;
        if (this.field2801 == var2) {
            return null;
        }
        var2.method1123(0);
        if (arg0 != 15) {
            this.method1221(33);
        }
        return var2;
    }
}
