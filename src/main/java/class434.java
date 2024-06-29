import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class434 {

    @OriginalMember(owner = "client!te", name = "g", descriptor = "[Lvb;")
    public static class130[] field6500 = new class130[4];

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lic;")
    public static class491 field6497;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lic;")
    public static class491 field6498;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "[[B")
    public static byte[][] field6501;

    static {
        new class475("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field6502 = 0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 3)
    public static void method2610(int arg0) {
        field6501 = null;
        field6498 = null;
        field6497 = null;
        if (arg0 >= -102) {
            method2613((byte) -62, null);
        }
        field6500 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLic;Lic;Ls;Lic;)Z", line = 22)
    public static final boolean method2611(byte arg0, class491 arg1, class491 arg2, class183 arg3, class491 arg4) {
        if (arg0 < 22) {
            method2611((byte) -127, null, null, null, null);
        }
        class191.field2810 = arg4;
        class479.field7042 = arg2;
        class437.field6530 = arg1;
        field6499++;
        class411.field6178 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLdh;)V", line = 42)
    public static final void method2612(boolean arg0, class209 arg1) {
        field6494++;
        if ((arg1.field3036.length - arg1.field3037) < 1) {
            return;
        }
        if (arg0) {
            method2613((byte) 87, null);
        }
        int var2 = arg1.method1428(32122);
        if (var2 < 0 || var2 > 1 || (arg1.field3036.length - arg1.field3037) < 2) {
            return;
        }
        int var3 = arg1.method1450((byte) 59);
        if (var3 * 6 != arg1.field3036.length - arg1.field3037) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field3036.length <= arg1.field3037) {
                            return;
                        }
                        var4 = arg1.method1450((byte) 48);
                        var5 = arg1.method1452(65280);
                    } while (class146.field2173.length <= var4);
                } while (!class436.field6519[var4]);
            } while (class317.field4554.method2843((byte) 127, var4).field3815 == '1' && (var5 < -1 || var5 > 1));
            class146.field2173[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLdh;)Lqb;", line = 84)
    public static final class148 method2613(byte arg0, class209 arg1) {
        field6495++;
        arg1.method1428(32122);
        int var2 = arg1.method1428(32122);
        class148 var3 = class6.method38(32, var2);
        var3.field2196 = arg1.method1428(32122);
        int var4 = arg1.method1428(32122);
        int var5 = 0;
        int var6 = 86 / ((arg0 + 4) / 33);
        while (var4 > var5) {
            int var7 = arg1.method1428(32122);
            var3.method23(var7, arg1, -124);
            var5++;
        }
        var3.method175(-1285532468);
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)I", line = 122)
    public static final int method2614(int arg0) {
        field6496++;
        if (arg0 != 6) {
            field6500 = null;
        }
        return 6;
    }
}
