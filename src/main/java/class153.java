import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class153 {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Ltd;")
    public static class136 field3493 = class145.method1172("gelb:", 45);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Ltd;")
    public static class136 field3488 = class145.method1172("Bitte benutzen Sie eine andere Welt)3", 45);

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3494 = 0;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3492 = 0;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Ltd;")
    public static class136 field3495 = class145.method1172("<col=80ff00>", 45);

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Ltd;")
    public static class136 field3501 = class145.method1172("(U3", 45);

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[Lqf;")
    public static class117[] field3498 = new class117[50];

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3497 = 0;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Ltd;")
    private static class136 field3496 = class145.method1172("Please contact customer support)3", 45);

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Ltd;")
    public static class136 field3500 = class145.method1172("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 45);

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field3503 = 0;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Ltd;")
    public static class136 field3487 = field3496;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3499 = 0;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Ltd;")
    private static class136 field3505 = class145.method1172("Please enter your password)3", 45);

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[I")
    public static int[] field3502 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Ltd;")
    public static class136 field3506 = field3505;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Ltd;")
    public static class136 field3509 = class145.method1172("Schlie-8en", 45);

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Ltd;")
    public static class136 field3504 = class145.method1172("Art", 45);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public int field3489;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public int field3508;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[B)V")
    public static final void method1200(int arg0, byte[] arg1) {
        field3490++;
        class127 var2 = new class127(arg1);
        var2.field2995 = arg1.length - 2;
        class76.field1717 = var2.method1020(false);
        class3.field59 = new int[class76.field1717];
        class81.field1905 = new int[class76.field1717];
        class124.field2887 = new byte[class76.field1717][];
        class71.field1511 = new int[class76.field1717];
        class65.field1408 = new int[class76.field1717];
        var2.field2995 = arg1.length - class76.field1717 * 8 - 7;
        class64.field1381 = var2.method1020(false);
        class96.field2252 = var2.method1020(false);
        int var3 = (var2.method1011(31) & 0xFF) + 1;
        for (int var4 = 0; var4 < class76.field1717; var4++) {
            class71.field1511[var4] = var2.method1020(false);
        }
        for (int var5 = 0; var5 < class76.field1717; var5++) {
            class81.field1905[var5] = var2.method1020(false);
        }
        for (int var6 = 0; var6 < class76.field1717; var6++) {
            class3.field59[var6] = var2.method1020(false);
        }
        for (int var7 = 0; var7 < class76.field1717; var7++) {
            class65.field1408[var7] = var2.method1020(false);
        }
        var2.field2995 = arg1.length - class76.field1717 * 8 - (var3 + -1) * 3 - 7;
        class127.field2953 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class127.field2953[var8] = var2.method1022(-93);
            if (class127.field2953[var8] == 0) {
                class127.field2953[var8] = 1;
            }
        }
        var2.field2995 = arg0;
        for (int var9 = 0; var9 < class76.field1717; var9++) {
            int var10 = class3.field59[var9];
            int var11 = class65.field1408[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class124.field2887[var9] = var13;
            int var14 = var2.method1011(61);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method996(4);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method996(4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field3495 = null;
        field3502 = null;
        field3488 = null;
        field3501 = null;
        field3493 = null;
        field3506 = null;
        field3496 = null;
        field3505 = null;
        field3509 = null;
        if (arg0 == 1) {
            field3504 = null;
            field3500 = null;
            field3487 = null;
            field3498 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static final void method1202(byte arg0) {
        int var1 = 57 % ((arg0 - 63) / 43);
        field3507++;
        class87.field2059.method1165((byte) -73);
    }
}
