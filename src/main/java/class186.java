import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class186 {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field2675 = 0;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field2690 = 1;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "[I")
    public static int[] field2701;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public int field2677;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public int field2678;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public int field2679;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public int field2682;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public int field2683;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public int field2685;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public int field2688;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public int field2689;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "Lvg;")
    public static class108 field2686;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Lcr;")
    public static class191 field2680;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "Lwn;")
    public static class77 field2700;

    static {
        new class368("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        new class368("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field2701 = new int[64];
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)Lpq;", line = 3)
    public static final class344 method1296(int arg0, boolean arg1) {
        if (arg1) {
            field2690 = -65;
        }
        field2692++;
        class408 var2 = class55.field711;
        class344 var3;
        synchronized (class55.field711) {
            var3 = (class344) class55.field711.method2529(0, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class171.field2427.method1926(0, class150.method1115(arg0, -16465), class344.method2090((byte) -116, arg0));
        class344 var5 = new class344();
        var5.field4640 = arg0;
        if (var4 != null) {
            var5.method2089(new class366(var4), -122);
        }
        class408 var6 = class55.field711;
        synchronized (class55.field711) {
            class55.field711.method2527(76, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLij;)V", line = 37)
    public static final void method1297(byte arg0, class316 arg1) {
        class29.field408 = arg1;
        field2697++;
        if (arg0 > -35) {
            field2675 = -35;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 56)
    public static void method1298(int arg0) {
        field2680 = null;
        field2701 = null;
        field2686 = null;
        if (arg0 != 7923) {
            method1298(83);
        }
        field2700 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLeq;I)V", line = 72)
    public static final void method1299(byte arg0, class141 arg1, int arg2) {
        field2694++;
        if (class326.field4434) {
            class326.field4434 = false;
            arg2 = 0;
        }
        if (class389.field5404 == null || !class389.field5404.method1033(-94, arg1)) {
            class389.field5404 = arg1;
            class406.field5622 = class199.method1372(arg0 ^ 0x78A3);
            class251.field3504 = arg2;
            class100.field1388 = arg2;
            if (class100.field1388 == 0) {
                class104.method790(16711680);
            } else {
                class214.field2999 = class429.field5978;
                class230.field3238 = class337.field4559;
                class317.field4319 = class67.field941;
                class185.field2618 = class277.field3774;
                class22.field285 = class18.field244;
                class115.field1755 = class102.field1411;
                class213.field2978 = class53.field682;
                class34.field460 = class128.field1941;
                class65.field897 = class116.field1762;
                class177.field2503 = class90.field1265;
            }
        }
        if (arg0 != 121) {
            method1299((byte) 66, (class141) null, -10);
        }
    }
}
