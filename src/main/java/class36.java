import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 extends class202 {

    @OriginalMember(owner = "client!f", name = "J", descriptor = "Loh;")
    private class263 field838 = class96.field1877;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "Loh;")
    private static class263 field834 = class253.method1681(-119, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!f", name = "z", descriptor = "Loh;")
    public static class263 field828 = field834;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "[[I")
    public static int[][] field833 = new int[104][104];

    @OriginalMember(owner = "client!f", name = "I", descriptor = "Lli;")
    public static class277 field837 = new class277();

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static volatile int field849 = 0;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    private int field830;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "Lti;")
    private class5 field831;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Lti;")
    public class5 field841;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "Lue;")
    public static class86 field848;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Loh;I)Z")
    public final boolean method224(class263 arg0, int arg1) {
        field842++;
        if (this.field841 == null) {
            return false;
        }
        if (this.field831 == null) {
            this.method229(arg1);
        }
        if (arg1 != 0) {
            return false;
        }
        for (class265 var3 = (class265) this.field831.method31(-32665, arg0.method1774(97)); var3 != null; var3 = (class265) this.field831.method37((byte) 114)) {
            if (var3.field4630.method1788(arg1 - 26006, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z")
    public final boolean method225(byte arg0, int arg1) {
        if (arg0 != 103) {
            field844 = 67;
        }
        field840++;
        if (this.field841 == null) {
            return false;
        }
        if (this.field831 == null) {
            this.method230((byte) 40);
        }
        class182 var3 = (class182) this.field831.method31(-32665, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)I")
    public final int method226(int arg0, int arg1) {
        field835++;
        int var3 = 12 / ((arg0 - 35) / 38);
        if (this.field841 == null) {
            return this.field830;
        } else {
            class182 var4 = (class182) this.field841.method31(-32665, (long) arg1);
            return var4 == null ? this.field830 : var4.field3305;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(II)Loh;")
    public final class263 method227(int arg0, int arg1) {
        field827++;
        if (this.field841 == null) {
            return this.field838;
        }
        if (arg0 > -85) {
            field848 = null;
        }
        class186 var3 = (class186) this.field841.method31(-32665, (long) arg1);
        return var3 == null ? this.field838 : var3.field3363;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(ILsi;)V")
    public final void method228(int arg0, class194 arg1) {
        if (arg0 != 0) {
            return;
        }
        field836++;
        while (true) {
            int var3 = arg1.method1301(-8317);
            if (var3 == 0) {
                return;
            }
            this.method231(arg1, 3, var3);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    private final void method229(int arg0) {
        this.field831 = new class5(this.field841.method35(arg0 ^ arg0));
        for (class186 var2 = (class186) this.field841.method38(24172); var2 != null; var2 = (class186) this.field841.method36(109)) {
            class265 var3 = new class265(var2.field3363, (int) var2.field4226);
            this.field831.method33(var3, var2.field3363.method1774(97), -111);
        }
        field846++;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
    private final void method230(byte arg0) {
        field829++;
        this.field831 = new class5(this.field841.method35(0));
        int var2 = -37 / ((arg0 + 5) / 43);
        for (class182 var3 = (class182) this.field841.method38(24172); var3 != null; var3 = (class182) this.field841.method36(92)) {
            class182 var4 = new class182((int) var3.field4226);
            this.field831.method33(var4, (long) var3.field3305, -112);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lsi;II)V")
    private final void method231(class194 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field839 = arg0.method1301(-8317);
        } else if (arg2 == 2) {
            this.field847 = arg0.method1301(-8317);
        } else if (arg2 == 3) {
            this.field838 = arg0.method1320(false);
        } else if (arg2 == 4) {
            this.field830 = arg0.method1266(arg1 ^ 0x7);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1294((byte) 3);
            this.field841 = new class5(class143.method943(1487780168, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1266(4);
                class241 var7;
                if (arg2 == 5) {
                    var7 = new class186(arg0.method1320(false));
                } else {
                    var7 = new class182(arg0.method1266(4));
                }
                this.field841.method33(var7, (long) var6, arg1 - 127);
            }
        }
        field825++;
        if (arg1 != 3) {
            this.method229(71);
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public static void method232(int arg0) {
        if (arg0 != 104) {
            method232(117);
        }
        field837 = null;
        field833 = null;
        field828 = null;
        field848 = null;
        field834 = null;
    }
}
