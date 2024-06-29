import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class161 extends class202 {

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Loh;")
    public static class263 field2931 = class253.method1681(-119, "www");

    @OriginalMember(owner = "client!j", name = "y", descriptor = "Loh;")
    public static class263 field2933 = class253.method1681(-125, " ");

    @OriginalMember(owner = "client!j", name = "D", descriptor = "Loh;")
    public static class263 field2938 = class253.method1681(-119, "showingVideoAd");

    @OriginalMember(owner = "client!j", name = "K", descriptor = "[I")
    public static int[] field2944 = new int[5];

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "Lti;")
    private class5 field2941;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILsi;I)V")
    private final void method1054(int arg0, class194 arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg1.method1301(-8317);
            if (this.field2941 == null) {
                int var5 = class143.method943(1487780168, var4);
                this.field2941 = new class5(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1301(-8317) == 1;
                int var8 = arg1.method1277((byte) -108);
                class241 var9;
                if (var7) {
                    var9 = new class186(arg1.method1320(false));
                } else {
                    var9 = new class182(arg1.method1266(4));
                }
                this.field2941.method33(var9, (long) var8, -128);
            }
        }
        if (arg0 > -62) {
            this.method1058(-124, -70, 102);
        }
        field2935++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILoh;I)Loh;")
    public final class263 method1055(int arg0, class263 arg1, int arg2) {
        if (arg2 != -250) {
            field2944 = null;
        }
        field2932++;
        if (this.field2941 == null) {
            return arg1;
        } else {
            class186 var4 = (class186) this.field2941.method31(-32665, (long) arg0);
            return var4 == null ? arg1 : var4.field3363;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lsi;I)V")
    public final void method1056(class194 arg0, int arg1) {
        if (arg1 != -1) {
            method1057(80, 60);
        }
        while (true) {
            int var3 = arg0.method1301(-8317);
            if (var3 == 0) {
                field2943++;
                return;
            }
            this.method1054(-98, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
    public static final void method1057(int arg0, int arg1) {
        class49.field1056.method829(arg0, (byte) -88);
        field2934++;
        if (arg1 >= -84) {
            field2938 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
    public final int method1058(int arg0, int arg1, int arg2) {
        field2942++;
        if (arg0 >= -123) {
            return 71;
        } else if (this.field2941 == null) {
            return arg2;
        } else {
            class182 var4 = (class182) this.field2941.method31(-32665, (long) arg1);
            return var4 == null ? arg2 : var4.field3305;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
    public static void method1059(byte arg0) {
        if (arg0 >= -64) {
            field2938 = null;
        }
        field2938 = null;
        field2933 = null;
        field2944 = null;
        field2931 = null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V")
    public static final void method1060(int arg0, int arg1, int arg2) {
        class154.field2787[arg2] = arg0;
        field2937++;
        class180 var3 = (class180) client.field2765.method31(-32665, (long) arg2);
        if (arg1 != -101) {
            field2938 = null;
        }
        if (var3 == null) {
            class180 var4 = new class180(4611686018427387905L);
            client.field2765.method33(var4, (long) arg2, arg1 - 23);
        } else if (var3.field3283 != 4611686018427387905L) {
            var3.field3283 = class25.method182(true) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILv;)V")
    public static final void method1061(int arg0, class147 arg1) {
        field2939++;
        if (arg1.field2683 != null) {
            arg1.field2683.field2275 = 0;
        }
        arg1.field2685 = false;
        for (class147 var2 = arg1.method747(); var2 != null; var2 = arg1.method742()) {
            method1061(124, var2);
        }
        if (arg0 < 109) {
            method1059((byte) -14);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public static final void method1062(int arg0) {
        class159.field2900 = 0;
        class154.field2788 = 0;
        class154.field2792.field3497 = arg0;
        class254.field4424 = 0;
        class131.field2403 = -1;
        class252.field4386 = -1;
        class189.field3394.field3497 = 0;
        class252.field4384 = 0;
        class2.field53 = false;
        field2936++;
        class36.field826 = 0;
        class105.field1988 = 0;
        class272.field4790 = -1;
        class196.field3566 = -1;
        for (int var1 = 0; var1 < class151.field2725.length; var1++) {
            if (class151.field2725[var1] != null) {
                class151.field2725[var1].field4693 = -1;
            }
        }
        for (int var2 = 0; var2 < class31.field774.length; var2++) {
            if (class31.field774[var2] != null) {
                class31.field774[var2].field4693 = -1;
            }
        }
        class136.method886(97);
        class89.field1772 = 1;
        class244.method1659(30, 26473);
        for (int var3 = 0; var3 < 100; var3++) {
            class21.field629[var3] = true;
        }
        class148.method973(-57);
    }
}
