import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class173 {

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lid;")
    public static class149 field3184 = class60.method382("www)2wtqa", (byte) 61);

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "[I")
    public static int[] field3191 = new int[64];

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lid;")
    public static class149 field3192 = class60.method382("Weiter", (byte) 11);

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Lid;")
    private static class149 field3196 = class60.method382(" is already on your ignore list)3", (byte) 61);

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lid;")
    public static class149 field3195 = field3196;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lmb;")
    public static class160 field3180;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Lal;")
    public static class230 field3197;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lrh;")
    public static class46 field3185;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "[B")
    public byte[] field3186;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "[B")
    public byte[] field3199;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "[Ljg;")
    public static class168[] field3200;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lgd;I)V")
    public static final void method1232(class74 arg0, int arg1) {
        field3188++;
        int var2 = 0;
        int var3 = -51 % ((9 - arg1) / 62);
        while (var2 < class18.field262) {
            int var4 = arg0.method512(-122);
            int var5 = arg0.method485(-2386);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class61.field1101[var4] != null) {
                class61.field1101[var4].field4484 = var5;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)I")
    public static final int method1233(boolean arg0) {
        field3190++;
        if (arg0) {
            method1235((class230) null, -53);
        }
        return class35.field505.method1292((byte) -14);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1234(int arg0) {
        field3196 = null;
        field3185 = null;
        field3192 = null;
        field3197 = null;
        field3200 = null;
        field3184 = null;
        field3180 = null;
        field3191 = null;
        if (arg0 == 0) {
            field3195 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lal;I)V")
    public static final void method1235(class230 arg0, int arg1) {
        field3198++;
        class60.field1081 = class30.method183(true, class252.field4424, arg0, 0);
        class244.field4278 = class54.method347(class214.field3784, arg0, arg1 + 9106, 0);
        class192.field3448 = class54.method347(class155.field2841, arg0, 2048, 0);
        class99.field1751 = class54.method347(class176.field3229, arg0, 2048, 0);
        class78.field1464 = class54.method347(class115.field1968, arg0, 2048, 0);
        class257.field4487 = class54.method347(class195.field3505, arg0, 2048, 0);
        class93.field1641 = class54.method347(class161.field2996, arg0, 2048, 0);
        class253.field4439 = class287.method1965(arg0, -13886, class97.field1730, 0);
        class176.field3230 = class273.method1892(0, arg0, (byte) 75, class50.field904);
        class206.field3708 = class273.method1892(0, arg0, (byte) 70, class192.field3445);
        class222.field3915 = class26.method147(class126.field2217, 0, arg1 - 1006404866, arg0);
        class184.field3326 = class26.method147(class259.field4554, 0, arg1 - 1006404866, arg0);
        class188.field3364.method1151(class184.field3326, (int[]) null);
        class6.field73.method1151(class184.field3326, (int[]) null);
        field3180.method1151(class184.field3326, (int[]) null);
        class46 var2 = class249.method1729(-123, arg0, class258.field4518, 0);
        var2.method269();
        class18.field261 = var2;
        class46[] var3 = class30.method183(true, class272.field4899, arg0, 0);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method269();
        }
        class124.field2192 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 41.0D) - 20;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        for (int var9 = 0; var9 < class60.field1081.length; var9++) {
            class60.field1081[var9].method281(var6 + var7, var8 - -var7, var5 + var7);
        }
        if (arg1 != -7058) {
            method1234(65);
        }
        class24.field357 = class60.field1081;
    }
}
