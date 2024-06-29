import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class3 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field19 = 0;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lja;")
    public static class62 field22 = class30.method243(43, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lja;")
    private static class62 field34 = class30.method243(43, "purple:");

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lja;")
    public static class62 field23 = field34;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lja;")
    public static class62 field26 = field34;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lc;")
    public static class18 field25 = new class18(64);

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lja;")
    public static class62 field37 = class30.method243(43, "Texturen geladen)3");

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Luc;")
    public class140 field30;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "[Lic;")
    public static class58[] field36;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field25 = null;
        field37 = null;
        field34 = null;
        field26 = null;
        field22 = null;
        field23 = null;
        field36 = null;
        if (arg0 <= 86) {
            field25 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)I")
    public static final int method9(byte arg0, int arg1) {
        class151 var2 = class119.method952(arg1, 104);
        int var3 = -17 / ((-arg0 - 49) / 42);
        field29++;
        int var4 = var2.field3547;
        int var5 = var2.field3559;
        int var6 = var2.field3548;
        int var7 = class9.field236[var6 - var5];
        return class24.field598[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public static final void method10(byte arg0) {
        class81.field1962 = new int[33];
        class132.field3019 = new int[33];
        class17.field397 = new int[151];
        class68.field1697 = new int[151];
        field35++;
        for (int var1 = 0; var1 < 33; var1++) {
            int var6 = 0;
            int var7 = 999;
            for (int var8 = 0; var8 < 34; var8++) {
                if (class130.field2974.field2620[var8 + class130.field2974.field2625 * var1] == 0) {
                    if (var7 == 999) {
                        var7 = var8;
                    }
                } else if (var7 != 999) {
                    var6 = var8;
                    break;
                }
            }
            class132.field3019[var1] = var7;
            class81.field1962[var1] = var6 - var7;
        }
        if (arg0 > -93) {
            return;
        }
        for (int var2 = 5; var2 < 156; var2++) {
            int var3 = 999;
            int var4 = 0;
            for (int var5 = 25; var5 < 172; var5++) {
                if (class130.field2974.field2620[class130.field2974.field2625 * var2 + var5] == 0 && (var5 > 34 || var2 > 34)) {
                    if (var3 == 999) {
                        var3 = var5;
                    }
                } else if (var3 != 999) {
                    var4 = var5;
                    break;
                }
            }
            class17.field397[var2 - 5] = var3 - 25;
            class68.field1697[var2 - 5] = var4 - var3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lja;I)V")
    public static final void method11(class62 arg0, int arg1) {
        field24++;
        if (class97.field2262 >= 2) {
            if (arg0.method461(25064, class138.field3218)) {
                System.gc();
            }
            if (arg0.method461(25064, class63.field1540)) {
                class48.method343(arg1 + 999);
            }
            if (arg0.method461(25064, class22.field528)) {
                class126.field2843 = true;
            }
            if (arg0.method461(25064, class70.field1795)) {
                class126.field2843 = false;
            }
            if (arg0.method461(25064, class67.field1681)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class131.field2991[var2].field3591[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method461(arg1 ^ 0xFFFF9DF0, class27.field641) && class4.field39 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method450(class93.field2180, (byte) -97)) {
                class1.field11 = arg0.method471((byte) -110, 12).method464((byte) 124).method439((byte) 73);
                class43.method320(0, 0, class70.method594(new class62[] { class146.field3448, class31.method249(true, class1.field11) }, 1229), null);
            }
            if (arg0.method461(25064, class6.field203)) {
                class77.field1900 = true;
            }
        }
        class136.field3140.method810(-2, 186);
        class136.field3140.method1010(arg0.method460((byte) 38) - 1, 32768);
        class136.field3140.method1021(-89, arg0.method471((byte) -110, 2));
        class47.field1073++;
        if (arg1 != -1000) {
            field34 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILpd;)Lq;")
    public static final class114 method12(int arg0, int arg1, class108 arg2) {
        field27++;
        if (arg0 != -26495) {
            field19 = 78;
        }
        return class134.method1069(arg0 + 26495, arg2, arg1) ? class28.method222(0) : null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
    public static final void method13(byte arg0, int arg1, int arg2) {
        field33++;
        class151 var3 = class119.method952(arg2, arg0 + 183);
        int var4 = var3.field3559;
        int var5 = var3.field3547;
        int var6 = var3.field3548;
        int var7 = class9.field236[var6 - var4];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var4;
        if (arg0 != -79) {
            method10((byte) -1);
        }
        class24.field598[var5] = class85.method660(class24.method192(var8, arg1 << var4), class24.method192(~var8, class24.field598[var5]));
    }
}
